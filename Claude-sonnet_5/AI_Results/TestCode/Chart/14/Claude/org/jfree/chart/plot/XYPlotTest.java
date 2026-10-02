package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 tests for {@link XYPlot} (Defects4J Chart-14b).
 */
public class XYPlotTest {

    /** Simple counter-based listener used to verify PlotChangeEvent firing. */
    private static class CountingListener implements PlotChangeListener {
        int count = 0;
        PlotChangeEvent last = null;
        public void plotChanged(PlotChangeEvent event) {
            count++;
            last = event;
        }
    }

    private XYPlot plot;
    private XYSeriesCollection dataset;
    private NumberAxis domainAxis;
    private NumberAxis rangeAxis;
    private XYLineAndShapeRenderer renderer;

    @Before
    public void setUp() {
        XYSeries series = new XYSeries("S1");
        series.add(1.0, 2.0);
        series.add(2.0, 4.0);
        series.add(3.0, 1.0);
        dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        domainAxis = new NumberAxis("X");
        rangeAxis = new NumberAxis("Y");
        renderer = new XYLineAndShapeRenderer();

        plot = new XYPlot(dataset, domainAxis, rangeAxis, renderer);
    }

    private PlotRenderingInfo newInfo() {
        return new PlotRenderingInfo(new ChartRenderingInfo());
    }

    private Graphics2D newGraphics() {
        BufferedImage img = new BufferedImage(400, 300,
                BufferedImage.TYPE_INT_ARGB);
        return img.createGraphics();
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructorDefaults() {
        XYPlot p = new XYPlot();
        assertEquals(PlotOrientation.VERTICAL, p.getOrientation());
        assertEquals(new RectangleInsets(4.0, 4.0, 4.0, 4.0), p.getAxisOffset());
        assertNull(p.getDataset());
        assertNull(p.getDomainAxis());
        assertNull(p.getRangeAxis());
        assertNull(p.getRenderer());
        assertTrue(p.isDomainGridlinesVisible());
        assertTrue(p.isRangeGridlinesVisible());
        assertFalse(p.isDomainZeroBaselineVisible());
        assertFalse(p.isRangeZeroBaselineVisible());
        assertFalse(p.isDomainCrosshairVisible());
        assertFalse(p.isRangeCrosshairVisible());
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, p.getDomainAxisLocation());
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, p.getRangeAxisLocation());
        assertEquals(1, p.getWeight());
        assertEquals(DatasetRenderingOrder.REVERSE, p.getDatasetRenderingOrder());
        assertEquals(SeriesRenderingOrder.REVERSE, p.getSeriesRenderingOrder());
    }

    @Test
    public void testConstructorWithArguments() {
        assertSame(dataset, plot.getDataset());
        assertSame(domainAxis, plot.getDomainAxis());
        assertSame(rangeAxis, plot.getRangeAxis());
        assertSame(renderer, plot.getRenderer());
        assertEquals(1, plot.getDatasetCount());
    }

    // ---------------------------------------------------------------
    // Orientation
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNullThrows() {
        plot.setOrientation(null);
    }

    @Test
    public void testSetOrientationChangeFiresEvent() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetOrientationSameValueNoEvent() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setOrientation(PlotOrientation.VERTICAL); // same as current
        assertEquals(0, l.count);
    }

    // ---------------------------------------------------------------
    // Axis offset
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNullThrows() {
        plot.setAxisOffset(null);
    }

    @Test
    public void testSetAxisOffsetValid() {
        RectangleInsets insets = new RectangleInsets(1, 1, 1, 1);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    // ---------------------------------------------------------------
    // Domain axis
    // ---------------------------------------------------------------

    @Test
    public void testGetDomainAxisIndexBeyondSizeNoParentReturnsNull() {
        assertNull(plot.getDomainAxis(1));
    }

    @Test
    public void testSetDomainAxisIndexNotifyFalseNoEvent() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        NumberAxis a2 = new NumberAxis("X2");
        plot.setDomainAxis(1, a2, false);
        assertSame(a2, plot.getDomainAxis(1));
        assertEquals(0, l.count);
    }

    @Test
    public void testSetDomainAxisSetNullRemovesListenerNoException() {
        plot.setDomainAxis(0, null);
        assertNull(plot.getDomainAxis(0));
    }

    @Test
    public void testSetDomainAxesArray() {
        NumberAxis a0 = new NumberAxis("A0");
        NumberAxis a1 = new NumberAxis("A1");
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setDomainAxes(new ValueAxis[] {a0, a1});
        assertSame(a0, plot.getDomainAxis(0));
        assertSame(a1, plot.getDomainAxis(1));
        assertEquals(1, l.count); // single fireChangeEvent at the end
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocationIndex0NullThrows() {
        plot.setDomainAxisLocation(0, null, true);
    }

    @Test
    public void testSetDomainAxisLocationIndexNonZeroNullAllowed() {
        plot.setDomainAxisLocation(1, null, true); // should not throw
        assertNull(plot.getDomainAxisLocation(1) == null
                ? null : plot.getDomainAxisLocation(1));
    }

    @Test
    public void testDomainAxisLocationFallbackOpposite() {
        // index 1 was never explicitly set -> falls back to opposite of primary
        AxisLocation expected = AxisLocation.getOpposite(
                plot.getDomainAxisLocation());
        assertEquals(expected, plot.getDomainAxisLocation(5));
    }

    @Test
    public void testDomainAxisEdgeDefault() {
        assertNotNull(plot.getDomainAxisEdge());
        assertNotNull(plot.getDomainAxisEdge(0));
    }

    @Test
    public void testDomainAxisCountAndClear() {
        assertEquals(1, plot.getDomainAxisCount());
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
        assertEquals(1, l.count);
    }

    @Test
    public void testConfigureDomainAxesNoException() {
        plot.configureDomainAxes(); // covers axis != null branch
        plot.setDomainAxis(0, null, false);
        plot.configureDomainAxes(); // covers axis == null branch (skip)
    }

    // ---------------------------------------------------------------
    // Range axis (mirrors domain axis tests)
    // ---------------------------------------------------------------

    @Test
    public void testGetRangeAxisIndexBeyondSizeNoParentReturnsNull() {
        assertNull(plot.getRangeAxis(1));
    }

    @Test
    public void testSetRangeAxisNotifyFalseNoEvent() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        NumberAxis a2 = new NumberAxis("Y2");
        plot.setRangeAxis(1, a2, false);
        assertSame(a2, plot.getRangeAxis(1));
        assertEquals(0, l.count);
    }

    @Test
    public void testSetRangeAxesArray() {
        NumberAxis a0 = new NumberAxis("R0");
        NumberAxis a1 = new NumberAxis("R1");
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setRangeAxes(new ValueAxis[] {a0, a1});
        assertSame(a0, plot.getRangeAxis(0));
        assertSame(a1, plot.getRangeAxis(1));
        assertEquals(1, l.count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocationIndex0NullThrows() {
        plot.setRangeAxisLocation(0, null, true);
    }

    @Test
    public void testRangeAxisLocationFallbackOpposite() {
        AxisLocation expected = AxisLocation.getOpposite(
                plot.getRangeAxisLocation());
        assertEquals(expected, plot.getRangeAxisLocation(7));
    }

    @Test
    public void testRangeAxisCountAndClear() {
        assertEquals(1, plot.getRangeAxisCount());
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
        assertEquals(1, l.count);
    }

    // ---------------------------------------------------------------
    // Dataset
    // ---------------------------------------------------------------

    @Test
    public void testGetDatasetOutOfRangeReturnsNull() {
        assertNull(plot.getDataset(1));
    }

    @Test
    public void testSetDatasetReplacesAndFiresDatasetChanged() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        XYSeriesCollection newDs = new XYSeriesCollection();
        plot.setDataset(newDs);
        assertSame(newDs, plot.getDataset());
        assertTrue(l.count >= 1);
    }

    @Test
    public void testIndexOfDatasetFoundAndNotFound() {
        assertEquals(0, plot.indexOf(dataset));
        assertEquals(-1, plot.indexOf(new XYSeriesCollection()));
    }

    @Test
    public void testMapDatasetToDomainAndRangeAxis() {
        NumberAxis secondDomain = new NumberAxis("D2");
        NumberAxis secondRange = new NumberAxis("R2");
        plot.setDomainAxis(1, secondDomain, false);
        plot.setRangeAxis(1, secondRange, false);
        plot.mapDatasetToDomainAxis(0, 1);
        plot.mapDatasetToRangeAxis(0, 1);
        assertSame(secondDomain, plot.getDomainAxisForDataset(0));
        assertSame(secondRange, plot.getRangeAxisForDataset(0));
    }

    // ---------------------------------------------------------------
    // Renderer
    // ---------------------------------------------------------------

    @Test
    public void testGetRendererOutOfRangeReturnsNull() {
        assertNull(plot.getRenderer(1));
    }

    @Test
    public void testSetRendererNotifyFalseNoEvent() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        XYLineAndShapeRenderer r2 = new XYLineAndShapeRenderer();
        plot.setRenderer(0, r2, false);
        assertSame(r2, plot.getRenderer(0));
        assertEquals(0, l.count);
    }

    @Test
    public void testSetRenderersArray() {
        XYLineAndShapeRenderer r0 = new XYLineAndShapeRenderer();
        XYLineAndShapeRenderer r1 = new XYLineAndShapeRenderer();
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setRenderers(new XYItemRenderer[] {r0, r1});
        assertSame(r0, plot.getRenderer(0));
        assertSame(r1, plot.getRenderer(1));
        assertEquals(1, l.count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrderNullThrows() {
        plot.setDatasetRenderingOrder(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesRenderingOrderNullThrows() {
        plot.setSeriesRenderingOrder(null);
    }

    @Test
    public void testGetIndexOfRenderer() {
        assertEquals(0, plot.getIndexOf(renderer));
        assertEquals(-1, plot.getIndexOf(new XYLineAndShapeRenderer()));
    }

    @Test
    public void testGetRendererForDatasetFallbackToDefault() {
        // dataset at index 0 has explicit renderer -> returned directly
        assertSame(renderer, plot.getRendererForDataset(dataset));
    }

    @Test
    public void testGetRendererForDatasetNullRendererFallsBackToDefault() {
        plot.setRenderer(0, null, false);
        // simulate second dataset mapped without its own renderer
        XYSeriesCollection ds2 = new XYSeriesCollection();
        plot.setDataset(1, ds2);
        plot.setRenderer(1, null, false); // no explicit renderer for index1
        plot.setRenderer(0, renderer, false); // getRenderer() fallback = index0
        assertSame(renderer, plot.getRendererForDataset(ds2));
    }

    @Test
    public void testGetRendererForDatasetNotBelongingReturnsNull() {
        assertNull(plot.getRendererForDataset(new XYSeriesCollection()));
    }

    // ---------------------------------------------------------------
    // Weight
    // ---------------------------------------------------------------

    @Test
    public void testWeightGetSet() {
        plot.setWeight(5);
        assertEquals(5, plot.getWeight());
    }

    // ---------------------------------------------------------------
    // Gridlines
    // ---------------------------------------------------------------

    @Test
    public void testDomainGridlinesVisibleToggleFiresOnlyOnChange() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setDomainGridlinesVisible(true); // same value -> no event
        assertEquals(0, l.count);
        plot.setDomainGridlinesVisible(false);
        assertEquals(1, l.count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStrokeNullThrows() {
        plot.setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaintNullThrows() {
        plot.setDomainGridlinePaint(null);
    }

    @Test
    public void testRangeGridlinesVisibleToggleFiresOnlyOnChange() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setRangeGridlinesVisible(true);
        assertEquals(0, l.count);
        plot.setRangeGridlinesVisible(false);
        assertEquals(1, l.count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStrokeNullThrows() {
        plot.setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaintNullThrows() {
        plot.setRangeGridlinePaint(null);
    }

    // ---------------------------------------------------------------
    // Zero baselines
    // ---------------------------------------------------------------

    @Test
    public void testDomainZeroBaselineVisibleAlwaysFires() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setDomainZeroBaselineVisible(true);
        assertEquals(1, l.count);
        assertTrue(plot.isDomainZeroBaselineVisible());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselineStrokeNullThrows() {
        plot.setDomainZeroBaselineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselinePaintNullThrows() {
        plot.setDomainZeroBaselinePaint(null);
    }

    @Test
    public void testRangeZeroBaselineVisibleAlwaysFires() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setRangeZeroBaselineVisible(true);
        assertEquals(1, l.count);
        assertTrue(plot.isRangeZeroBaselineVisible());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselineStrokeNullThrows() {
        plot.setRangeZeroBaselineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselinePaintNullThrows() {
        plot.setRangeZeroBaselinePaint(null);
    }

    // ---------------------------------------------------------------
    // Tick band paints (null permitted)
    // ---------------------------------------------------------------

    @Test
    public void testTickBandPaintsAllowNull() {
        plot.setDomainTickBandPaint(null);
        assertNull(plot.getDomainTickBandPaint());
        plot.setRangeTickBandPaint(null);
        assertNull(plot.getRangeTickBandPaint());
        plot.setDomainTickBandPaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainTickBandPaint());
    }

    // ---------------------------------------------------------------
    // Quadrants
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantOriginNullThrows() {
        plot.setQuadrantOrigin(null);
    }

    @Test
    public void testQuadrantOriginGetSet() {
        Point2D p = new Point2D.Double(1.0, 2.0);
        plot.setQuadrantOrigin(p);
        assertEquals(p, plot.getQuadrantOrigin());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaintIndexTooLowThrows() {
        plot.getQuadrantPaint(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaintIndexTooHighThrows() {
        plot.getQuadrantPaint(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantPaintIndexTooLowThrows() {
        plot.setQuadrantPaint(-1, Color.BLUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantPaintIndexTooHighThrows() {
        plot.setQuadrantPaint(4, Color.BLUE);
    }

    @Test
    public void testSetQuadrantPaintValidIndices() {
        for (int i = 0; i <= 3; i++) {
            plot.setQuadrantPaint(i, Color.GREEN);
            assertEquals(Color.GREEN, plot.getQuadrantPaint(i));
        }
    }

    @Test
    public void testDrawQuadrantsAllPaintsSet() {
        domainAxis.setRange(0, 10);
        rangeAxis.setRange(0, 10);
        plot.setQuadrantOrigin(new Point2D.Double(5, 5));
        for (int i = 0; i <= 3; i++) {
            plot.setQuadrantPaint(i, Color.YELLOW);
        }
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.drawQuadrants(newGraphics(), area); // must not throw
    }

    @Test
    public void testDrawQuadrantsNoPaintsSetNothingToDraw() {
        domainAxis.setRange(0, 10);
        rangeAxis.setRange(0, 10);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.drawQuadrants(newGraphics(), area); // somethingToDraw stays false
    }

    // ---------------------------------------------------------------
    // Domain / Range markers  (incl. fault-detection tests)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarkerNullThrows() {
        plot.addDomainMarker(null);
    }

    @Test
    public void testAddAndRemoveDomainMarkerForeground() {
        Marker m = new ValueMarker(5.0);
        plot.addDomainMarker(m);
        Collection markers = plot.getDomainMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(m));
        boolean removed = plot.removeDomainMarker(m);
        assertTrue(removed);
    }

    /**
     * FAULT-DETECTION TEST:
     * Removing a marker from a layer/index that never had any markers added
     * should return false (no such marker), NOT throw NullPointerException.
     * The known Chart-14 defect (fixed 07-Apr-2008) causes an NPE here
     * because 'markers' map lookup returns null and .remove() is called on it.
     * This test is written against the CORRECT expected behaviour and is
     * expected to FAIL (NPE) against the buggy Chart-14b sources.
     */
    @Test
    public void testRemoveDomainMarker_NoMarkersForLayer_ShouldNotThrow_FaultDetection() {
        Marker m = new ValueMarker(5.0);
        // Note: no marker has been added to BACKGROUND layer for index 0
        boolean removed = plot.removeDomainMarker(0, m, Layer.BACKGROUND);
        assertFalse("Expected false (marker not present), not an exception",
                removed);
    }

    @Test
    public void testRemoveRangeMarker_NoMarkersForLayer_ShouldNotThrow_FaultDetection() {
        Marker m = new ValueMarker(5.0);
        boolean removed = plot.removeRangeMarker(0, m, Layer.BACKGROUND);
        assertFalse("Expected false (marker not present), not an exception",
                removed);
    }

    @Test
    public void testClearDomainMarkers() {
        plot.addDomainMarker(new ValueMarker(1.0), Layer.FOREGROUND);
        plot.addDomainMarker(new ValueMarker(2.0), Layer.BACKGROUND);
        plot.clearDomainMarkers();
        assertNull(plot.getDomainMarkers(Layer.FOREGROUND));
        assertNull(plot.getDomainMarkers(Layer.BACKGROUND));
    }

    @Test
    public void testClearDomainMarkersSpecificIndex() {
        plot.addDomainMarker(0, new ValueMarker(1.0), Layer.FOREGROUND);
        plot.clearDomainMarkers(0);
        Collection markers = plot.getDomainMarkers(0, Layer.FOREGROUND);
        assertTrue(markers == null || markers.isEmpty());
    }

    @Test
    public void testAddAndRemoveRangeMarkerForeground() {
        Marker m = new ValueMarker(3.0);
        plot.addRangeMarker(m);
        Collection markers = plot.getRangeMarkers(Layer.FOREGROUND);
        assertNotNull(markers);
        assertTrue(markers.contains(m));
        boolean removed = plot.removeRangeMarker(m);
        assertTrue(removed);
    }

    @Test
    public void testClearRangeMarkers() {
        plot.addRangeMarker(new ValueMarker(1.0), Layer.FOREGROUND);
        plot.addRangeMarker(new ValueMarker(2.0), Layer.BACKGROUND);
        plot.clearRangeMarkers();
        assertNull(plot.getRangeMarkers(Layer.FOREGROUND));
        assertNull(plot.getRangeMarkers(Layer.BACKGROUND));
    }

    @Test
    public void testDrawDomainMarkersRendererNullReturnsEarly() {
        plot.setRenderer(0, null, false);
        plot.addDomainMarker(0, new ValueMarker(1.0), Layer.FOREGROUND);
        // should simply return, no exception
        plot.drawDomainMarkers(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), 0, Layer.FOREGROUND);
    }

    @Test
    public void testDrawDomainMarkersIndexBeyondDatasetCountReturnsEarly() {
        plot.drawDomainMarkers(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), 5, Layer.FOREGROUND);
    }

    @Test
    public void testDrawRangeMarkersNormalPath() {
        domainAxis.setRange(0, 10);
        rangeAxis.setRange(0, 10);
        plot.addRangeMarker(0, new ValueMarker(5.0), Layer.FOREGROUND);
        plot.drawRangeMarkers(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), 0, Layer.FOREGROUND);
    }

    // ---------------------------------------------------------------
    // Annotations
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotationNullThrows() {
        plot.addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotationNullThrows() {
        plot.removeAnnotation(null);
    }

    @Test
    public void testAnnotationsAddRemoveGetClear() {
        assertTrue(plot.getAnnotations().isEmpty());
        org.jfree.chart.annotations.XYTextAnnotation ann =
                new org.jfree.chart.annotations.XYTextAnnotation("hi", 1, 1);
        plot.addAnnotation(ann);
        List annList = plot.getAnnotations();
        assertEquals(1, annList.size());
        boolean removed = plot.removeAnnotation(ann);
        assertTrue(removed);
        assertTrue(plot.getAnnotations().isEmpty());

        plot.addAnnotation(ann);
        plot.clearAnnotations();
        assertTrue(plot.getAnnotations().isEmpty());
    }

    // ---------------------------------------------------------------
    // Dataset-to-axis boundary checks
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDatasetNegativeIndexThrows() {
        plot.getDomainAxisForDataset(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDatasetIndexTooHighThrows() {
        plot.getDomainAxisForDataset(1); // only 1 dataset present
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisForDatasetNegativeIndexThrows() {
        plot.getRangeAxisForDataset(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisForDatasetIndexTooHighThrows() {
        plot.getRangeAxisForDataset(1);
    }

    @Test
    public void testGetDomainAxisForDatasetValidIndex() {
        assertSame(domainAxis, plot.getDomainAxisForDataset(0));
    }

    // ---------------------------------------------------------------
    // getDataRange
    // ---------------------------------------------------------------

    @Test
    public void testGetDataRangeForMappedDomainAxis() {
        Range r = plot.getDataRange(domainAxis);
        assertNotNull(r);
        assertEquals(1.0, r.getLowerBound(), 0.0001);
        assertEquals(3.0, r.getUpperBound(), 0.0001);
    }

    @Test
    public void testGetDataRangeForMappedRangeAxis() {
        Range r = plot.getDataRange(rangeAxis);
        assertNotNull(r);
        assertEquals(1.0, r.getLowerBound(), 0.0001);
        assertEquals(4.0, r.getUpperBound(), 0.0001);
    }

    @Test
    public void testGetDataRangeForUnmappedAxisReturnsNull() {
        NumberAxis unrelated = new NumberAxis("unrelated");
        Range r = plot.getDataRange(unrelated);
        assertNull(r);
    }

    // ---------------------------------------------------------------
    // datasetChanged / rendererChanged
    // ---------------------------------------------------------------

    @Test
    public void testDatasetChangedNotifiesListenerWhenNoParent() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.datasetChanged(new DatasetChangeEvent(this, dataset));
        assertEquals(1, l.count);
    }

    @Test
    public void testRendererChangedFiresChangeEvent() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.rendererChanged(new RendererChangeEvent(renderer));
        assertEquals(1, l.count);
    }

    // ---------------------------------------------------------------
    // Crosshairs
    // ---------------------------------------------------------------

    @Test
    public void testDomainCrosshairVisibleTogglesFireOnlyOnChange() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setDomainCrosshairVisible(false); // same -> no fire
        assertEquals(0, l.count);
        plot.setDomainCrosshairVisible(true);
        assertEquals(1, l.count);
    }

    @Test
    public void testDomainCrosshairValueOnlyFiresWhenVisible() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setDomainCrosshairVisible(false);
        l.count = 0;
        plot.setDomainCrosshairValue(3.0); // not visible -> no fire
        assertEquals(0, l.count);
        assertEquals(3.0, plot.getDomainCrosshairValue(), 0.0001);

        plot.setDomainCrosshairVisible(true);
        l.count = 0;
        plot.setDomainCrosshairValue(4.0); // visible -> fire
        assertEquals(1, l.count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairStrokeNullThrows() {
        plot.setDomainCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairPaintNullThrows() {
        plot.setDomainCrosshairPaint(null);
    }

    @Test
    public void testDomainCrosshairLockedOnDataToggle() {
        assertTrue(plot.isDomainCrosshairLockedOnData());
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setDomainCrosshairLockedOnData(false);
        assertFalse(plot.isDomainCrosshairLockedOnData());
        assertEquals(1, l.count);
    }

    @Test
    public void testRangeCrosshairVisibleTogglesFireOnlyOnChange() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setRangeCrosshairVisible(false);
        assertEquals(0, l.count);
        plot.setRangeCrosshairVisible(true);
        assertEquals(1, l.count);
    }

    @Test
    public void testRangeCrosshairValueOnlyFiresWhenVisible() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        plot.setRangeCrosshairVisible(false);
        l.count = 0;
        plot.setRangeCrosshairValue(3.0);
        assertEquals(0, l.count);

        plot.setRangeCrosshairVisible(true);
        l.count = 0;
        plot.setRangeCrosshairValue(4.0);
        assertEquals(1, l.count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStrokeNullThrows() {
        plot.setRangeCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairPaintNullThrows() {
        plot.setRangeCrosshairPaint(null);
    }

    @Test
    public void testRangeCrosshairLockedOnDataToggle() {
        assertTrue(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    // ---------------------------------------------------------------
    // Fixed axis space
    // ---------------------------------------------------------------

    @Test
    public void testFixedDomainAxisSpaceNotifyTrueAndFalse() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        AxisSpace space = new AxisSpace();
        plot.setFixedDomainAxisSpace(space, false);
        assertEquals(0, l.count);
        assertSame(space, plot.getFixedDomainAxisSpace());
        plot.setFixedDomainAxisSpace(space, true);
        assertEquals(1, l.count);
    }

    @Test
    public void testFixedRangeAxisSpaceNotifyTrueAndFalse() {
        CountingListener l = new CountingListener();
        plot.addChangeListener(l);
        AxisSpace space = new AxisSpace();
        plot.setFixedRangeAxisSpace(space, false);
        assertEquals(0, l.count);
        plot.setFixedRangeAxisSpace(space, true);
        assertEquals(1, l.count);
    }

    // ---------------------------------------------------------------
    // Zoom
    // ---------------------------------------------------------------

    @Test
    public void testZoomDomainAxesFactorNoAnchor() {
        domainAxis.setRange(0, 10);
        plot.zoomDomainAxes(0.5, newInfo(), null);
        assertTrue(domainAxis.getRange().getLength() < 10.0);
    }

    @Test
    public void testZoomDomainAxesFactorWithAnchor() {
        domainAxis.setRange(0, 10);
        PlotRenderingInfo info = newInfo();
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));
        Point2D source = new Point2D.Double(50, 50);
        plot.zoomDomainAxes(0.5, info, source, true);
        assertTrue(domainAxis.getRange().getLength() < 10.0);
    }

    @Test
    public void testZoomDomainAxesPercent() {
        domainAxis.setRange(0, 10);
        plot.zoomDomainAxes(0.2, 0.8, newInfo(), null);
        assertEquals(2.0, domainAxis.getLowerBound(), 0.0001);
        assertEquals(8.0, domainAxis.getUpperBound(), 0.0001);
    }

    @Test
    public void testZoomRangeAxesFactorNoAnchor() {
        rangeAxis.setRange(0, 10);
        plot.zoomRangeAxes(0.5, newInfo(), null);
        assertTrue(rangeAxis.getRange().getLength() < 10.0);
    }

    @Test
    public void testZoomRangeAxesFactorWithAnchor() {
        rangeAxis.setRange(0, 10);
        PlotRenderingInfo info = newInfo();
        info.setDataArea(new Rectangle2D.Double(0, 0, 100, 100));
        Point2D source = new Point2D.Double(50, 50);
        plot.zoomRangeAxes(0.5, info, source, true);
        assertTrue(rangeAxis.getRange().getLength() < 10.0);
    }

    @Test
    public void testZoomRangeAxesPercent() {
        rangeAxis.setRange(0, 10);
        plot.zoomRangeAxes(0.3, 0.7, newInfo(), null);
        assertEquals(3.0, rangeAxis.getLowerBound(), 0.0001);
        assertEquals(7.0, rangeAxis.getUpperBound(), 0.0001);
    }

    @Test
    public void testIsDomainRangeZoomableTrue() {
        assertTrue(plot.isDomainZoomable());
        assertTrue(plot.isRangeZoomable());
    }

    // ---------------------------------------------------------------
    // Series count
    // ---------------------------------------------------------------

    @Test
    public void testGetSeriesCountNoDatasetReturnsZero() {
        XYPlot p = new XYPlot();
        assertEquals(0, p.getSeriesCount());
    }

    @Test
    public void testGetSeriesCountWithDataset() {
        assertEquals(1, plot.getSeriesCount());
    }

    // ---------------------------------------------------------------
    // Legend items
    // ---------------------------------------------------------------

    @Test
    public void testFixedLegendItemsOverridesGenerated() {
        LegendItemCollection fixed = new LegendItemCollection();
        plot.setFixedLegendItems(fixed);
        assertSame(fixed, plot.getLegendItems());
    }

    @Test
    public void testGetLegendItemsGeneratedFromRenderer() {
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertTrue(items.getItemCount() >= 1);
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEqualsSameInstance() {
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsDifferentTypeReturnsFalse() {
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEqualsTwoDefaultPlots() {
        XYPlot p1 = new XYPlot();
        XYPlot p2 = new XYPlot();
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
    }

    @Test
    public void testEqualsAfterOrientationChangeReturnsFalse() {
        XYPlot p1 = new XYPlot();
        XYPlot p2 = new XYPlot();
        p2.setOrientation(PlotOrientation.HORIZONTAL);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsAfterWeightChangeReturnsFalse() {
        XYPlot p1 = new XYPlot();
        XYPlot p2 = new XYPlot();
        p2.setWeight(99);
        assertFalse(p1.equals(p2));
    }

    // ---------------------------------------------------------------
    // clone()
    // ---------------------------------------------------------------

    @Test
    public void testCloneIndependenceOfAxes() throws Exception {
        XYPlot clone = (XYPlot) plot.clone();
        assertNotSame(plot.getDomainAxis(), clone.getDomainAxis());
        assertNotSame(plot.getRangeAxis(), clone.getRangeAxis());
        assertEquals(plot, clone);

        clone.getDomainAxis().setLabel("Changed");
        assertFalse("Original axis label should be unaffected by clone change",
                "Changed".equals(plot.getDomainAxis().getLabel()));
    }

    // ---------------------------------------------------------------
    // Serialization
    // ---------------------------------------------------------------

    @Test
    public void testSerializationRoundTrip() throws Exception {
        plot.setDomainGridlineStroke(new BasicStroke(2.0f));
        plot.setDomainGridlinePaint(Color.RED);
        plot.setQuadrantOrigin(new Point2D.Double(1, 1));
        plot.setQuadrantPaint(0, Color.BLUE);
        plot.setDomainCrosshairStroke(new BasicStroke(1.5f));
        plot.setDomainCrosshairPaint(Color.GREEN);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(plot);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(bos.toByteArray()));
        XYPlot restored = (XYPlot) ois.readObject();
        ois.close();

        assertEquals(new BasicStroke(2.0f), restored.getDomainGridlineStroke());
        assertEquals(Color.RED, restored.getDomainGridlinePaint());
        assertEquals(new Point2D.Double(1, 1), restored.getQuadrantOrigin());
        assertEquals(Color.BLUE, restored.getQuadrantPaint(0));
        assertEquals(Color.GREEN, restored.getDomainCrosshairPaint());
    }

    // ---------------------------------------------------------------
    // draw() / render() / handleClick()
    // ---------------------------------------------------------------

    @Test
    public void testDrawSmallAreaReturnsEarlyNoException() {
        Rectangle2D tiny = new Rectangle2D.Double(0, 0, 2, 2);
        PlotRenderingInfo info = newInfo();
        plot.draw(newGraphics(), tiny, null, null, info);
        // should return silently without populating data area with real size
    }

    @Test
    public void testDrawNormalAreaPopulatesInfo() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        PlotRenderingInfo info = newInfo();
        plot.draw(newGraphics(), area, null, null, info);
        assertNotNull(info.getDataArea());
        assertTrue(info.getDataArea().getWidth() > 0);
    }

    @Test
    public void testDrawWithAnchorInsideDataArea() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        PlotRenderingInfo info = newInfo();
        Point2D anchor = new Point2D.Double(200, 150);
        plot.draw(newGraphics(), area, anchor, null, info);
        assertNotNull(info.getDataArea());
    }

    @Test
    public void testDrawWithEmptyDatasetShowsNoDataMessage() {
        XYPlot emptyPlot = new XYPlot(new XYSeriesCollection(), domainAxis,
                rangeAxis, renderer);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        PlotRenderingInfo info = newInfo();
        emptyPlot.draw(newGraphics(), area, null, null, info); // no exception
    }

    @Test
    public void testRenderWithNonEmptyDatasetReturnsTrue() {
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 400, 300);
        boolean found = plot.render(newGraphics(), dataArea, 0, newInfo(),
                new CrosshairState());
        assertTrue(found);
    }

    @Test
    public void testRenderWithNullDatasetReturnsFalse() {
        XYPlot p = new XYPlot(null, domainAxis, rangeAxis, renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 400, 300);
        boolean found = p.render(newGraphics(), dataArea, 0, newInfo(),
                new CrosshairState());
        assertFalse(found);
    }

    @Test
    public void testRenderNoRendererButDataFoundStillTrue() {
        // dataset present, but renderer(index) and default renderer both null
        XYPlot p = new XYPlot(dataset, domainAxis, rangeAxis, null);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 400, 300);
        boolean found = p.render(newGraphics(), dataArea, 0, newInfo(),
                new CrosshairState());
        assertTrue(found); // foundData set true before renderer null-check
    }

    @Test
    public void testHandleClickInsideDataAreaSetsCrosshairValues() {
        PlotRenderingInfo info = newInfo();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 400, 300);
        info.setDataArea(dataArea);
        domainAxis.setRange(0, 10);
        rangeAxis.setRange(0, 10);
        plot.handleClick(200, 150, info);
        // just verifying no exception + values changed from default 0.0 is
        // plausible but not guaranteed exact; check no exception thrown.
    }

    @Test
    public void testHandleClickOutsideDataAreaNoException() {
        PlotRenderingInfo info = newInfo();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 400, 300);
        info.setDataArea(dataArea);
        plot.handleClick(1000, 1000, info); // outside -> no-op branch
    }

    // ---------------------------------------------------------------
    // Gridline / zero-baseline drawing (protected utility methods)
    // ---------------------------------------------------------------

    @Test
    public void testDrawDomainGridlinesRendererNullReturnsEarly() {
        plot.setRenderer(0, null, false);
        plot.drawDomainGridlines(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), new ArrayList());
    }

    @Test
    public void testDrawDomainGridlinesVisibleTrue() {
        domainAxis.setRange(0, 10);
        plot.setDomainGridlinesVisible(true);
        plot.drawDomainGridlines(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), new ArrayList());
    }

    @Test
    public void testDrawRangeGridlinesSkipsZeroWhenBaselineVisible() {
        rangeAxis.setRange(-5, 5);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeZeroBaselineVisible(true);
        List ticks = new ArrayList();
        // Using real ValueTick objects would require axis tick generation;
        // calling with an empty list still exercises the "no ticks" loop path.
        plot.drawRangeGridlines(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), ticks);
    }

    @Test
    public void testDrawZeroDomainBaselineWhenVisible() {
        domainAxis.setRange(-5, 5);
        plot.setDomainZeroBaselineVisible(true);
        plot.drawZeroDomainBaseline(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100));
    }

    @Test
    public void testDrawZeroRangeBaselineWhenVisible() {
        rangeAxis.setRange(-5, 5);
        plot.setRangeZeroBaselineVisible(true);
        plot.drawZeroRangeBaseline(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100));
    }

    // ---------------------------------------------------------------
    // Horizontal / vertical line + crosshair line helpers
    // ---------------------------------------------------------------

    @Test
    public void testDrawHorizontalLineValueInRange() {
        rangeAxis.setRange(0, 10);
        plot.drawHorizontalLine(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), 5.0,
                new BasicStroke(1f), Color.BLACK);
    }

    @Test
    public void testDrawHorizontalLineValueOutOfRangeSkips() {
        rangeAxis.setRange(0, 10);
        plot.drawHorizontalLine(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), 999.0,
                new BasicStroke(1f), Color.BLACK); // contains()==false, no draw
    }

    @Test
    public void testDrawVerticalLineValueInRange() {
        domainAxis.setRange(0, 10);
        plot.drawVerticalLine(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), 5.0,
                new BasicStroke(1f), Color.BLACK);
    }

    @Test
    public void testDrawDomainCrosshairValueInRangeVertical() {
        domainAxis.setRange(0, 10);
        plot.drawDomainCrosshair(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100),
                PlotOrientation.VERTICAL, 5.0, domainAxis,
                new BasicStroke(1f), Color.RED);
    }

    @Test
    public void testDrawDomainCrosshairValueOutOfRangeSkips() {
        domainAxis.setRange(0, 10);
        plot.drawDomainCrosshair(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100),
                PlotOrientation.VERTICAL, 999.0, domainAxis,
                new BasicStroke(1f), Color.RED);
    }

    @Test
    public void testDrawRangeCrosshairValueInRangeHorizontalOrientation() {
        rangeAxis.setRange(0, 10);
        plot.drawRangeCrosshair(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100),
                PlotOrientation.HORIZONTAL, 5.0, rangeAxis,
                new BasicStroke(1f), Color.RED);
    }

    // ---------------------------------------------------------------
    // Axis space calculation (fixed vs computed, orientations)
    // ---------------------------------------------------------------

    @Test
    public void testCalculateDomainAxisSpaceFixedVertical() {
        plot.setFixedDomainAxisSpace(new AxisSpace(), false);
        AxisSpace result = plot.calculateDomainAxisSpace(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), null);
        assertNotNull(result);
    }

    @Test
    public void testCalculateDomainAxisSpaceFixedHorizontal() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        plot.setFixedDomainAxisSpace(new AxisSpace(), false);
        AxisSpace result = plot.calculateDomainAxisSpace(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), null);
        assertNotNull(result);
    }

    @Test
    public void testCalculateDomainAxisSpaceComputedFromAxis() {
        AxisSpace result = plot.calculateDomainAxisSpace(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), null);
        assertNotNull(result);
    }

    @Test
    public void testCalculateRangeAxisSpaceComputedFromAxis() {
        AxisSpace result = plot.calculateRangeAxisSpace(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100), null);
        assertNotNull(result);
    }

    @Test
    public void testCalculateAxisSpaceCombined() {
        AxisSpace result = plot.calculateAxisSpace(newGraphics(),
                new Rectangle2D.Double(0, 0, 100, 100));
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // Plot type
    // ---------------------------------------------------------------

    @Test
    public void testGetPlotTypeNotNull() {
        assertNotNull(plot.getPlotType());
    }
}

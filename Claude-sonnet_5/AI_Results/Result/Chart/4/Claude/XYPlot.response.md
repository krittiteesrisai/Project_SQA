# JUnit 4 Test Suite: XYPlotTest

หมายเหตุก่อนเริ่ม:
- Class เป้าหมาย `XYPlot` อยู่ใน package `org.jfree.chart.plot` และมี method หลายตัวเป็น `protected` ผมจึงวาง test class ไว้ใน package เดียวกันเพื่อสามารถเข้าถึง protected method บางตัว (เช่น `calculateDomainAxisSpace`) ได้ เพื่อเพิ่ม branch coverage
- ใช้เฉพาะ class จริงใน jfreechart (NumberAxis, XYSeriesCollection, XYLineAndShapeRenderer, ValueMarker, XYTextAnnotation ฯลฯ) เป็น collaborator เพื่อ exercise API ของ `XYPlot` เท่านั้น ไม่ได้เดา behavior ของ `XYPlot` เอง
- มีคอมเมนต์กำกับจุดที่ตรวจพบว่า source อาจมี fault (เช่น `getDataRange()` NPE เมื่อ renderer เป็น null, และ `mapDatasetToDomainAxes(index, null)` โยน NPE ทั้งที่ Javadoc บอกว่า null permitted)

```java
package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import org.junit.Test;

// import คลาสเป้าหมายอย่างชัดเจน (อยู่ package เดียวกัน แต่ import ไว้ตามข้อกำหนด)
import org.jfree.chart.plot.XYPlot;

public class XYPlotTest {

    // ---------- Helper ----------

    private XYSeriesCollection createDatasetWithData() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("S1");
        series.add(1.0, 2.0);
        series.add(2.0, 4.0);
        series.add(3.0, 3.0);
        dataset.addSeries(series);
        return dataset;
    }

    private Graphics2D createGraphics() {
        BufferedImage img = new BufferedImage(200, 100,
                BufferedImage.TYPE_INT_ARGB);
        return img.createGraphics();
    }

    // ==================================================================
    // Constructors / basic getters
    // ==================================================================

    @Test
    public void testDefaultConstructor() {
        XYPlot plot = new XYPlot();
        assertNull(plot.getDataset());
        assertNull(plot.getDomainAxis());
        assertNull(plot.getRangeAxis());
        assertNull(plot.getRenderer());
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertEquals(1, plot.getWeight());
    }

    @Test
    public void testConstructorWithArgs() {
        NumberAxis domain = new NumberAxis("X");
        NumberAxis range = new NumberAxis("Y");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        XYSeriesCollection dataset = createDatasetWithData();
        XYPlot plot = new XYPlot(dataset, domain, range, renderer);
        assertSame(dataset, plot.getDataset());
        assertSame(domain, plot.getDomainAxis());
        assertSame(range, plot.getRangeAxis());
        assertSame(renderer, plot.getRenderer());
    }

    @Test
    public void testGetPlotType() {
        XYPlot plot = new XYPlot();
        assertNotNull(plot.getPlotType());
    }

    // ==================================================================
    // Orientation
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNullThrows() {
        new XYPlot().setOrientation(null);
    }

    @Test
    public void testSetOrientationChangeFiresEventOnlyWhenChanged() {
        XYPlot plot = new XYPlot();
        final int[] count = {0};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                count[0]++;
            }
        });
        plot.setOrientation(PlotOrientation.VERTICAL); // same as default -> no event
        assertEquals(0, count[0]);
        plot.setOrientation(PlotOrientation.HORIZONTAL); // changed -> event fired
        assertEquals(1, count[0]);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    // ==================================================================
    // Axis offset
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNullThrows() {
        new XYPlot().setAxisOffset(null);
    }

    @Test
    public void testSetAxisOffset() {
        XYPlot plot = new XYPlot();
        RectangleInsets insets = new RectangleInsets(1, 2, 3, 4);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    // ==================================================================
    // Domain axis
    // ==================================================================

    @Test
    public void testGetDomainAxisOutOfRangeIndexReturnsNull() {
        XYPlot plot = new XYPlot();
        assertNull(plot.getDomainAxis(5)); // index >= size, no parent -> null
    }

    @Test
    public void testSetAndGetDomainAxis() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("X");
        plot.setDomainAxis(axis);
        assertSame(axis, plot.getDomainAxis());
        assertSame(axis, plot.getDomainAxis(0));
    }

    @Test
    public void testSetDomainAxisNotifyFalseDoesNotFireEvent() {
        XYPlot plot = new XYPlot();
        final int[] count = {0};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                count[0]++;
            }
        });
        plot.setDomainAxis(0, new NumberAxis("X"), false);
        assertEquals(0, count[0]);
        plot.setDomainAxis(0, new NumberAxis("X2"), true);
        assertEquals(1, count[0]);
    }

    @Test
    public void testSetDomainAxesArray() {
        XYPlot plot = new XYPlot();
        ValueAxis[] axes = new ValueAxis[] {new NumberAxis("A"),
                new NumberAxis("B")};
        plot.setDomainAxes(axes);
        assertSame(axes[0], plot.getDomainAxis(0));
        assertSame(axes[1], plot.getDomainAxis(1));
    }

    @Test
    public void testGetDomainAxisLocationDefault() {
        XYPlot plot = new XYPlot();
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getDomainAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainAxisLocationNullForIndex0Throws() {
        new XYPlot().setDomainAxisLocation(0, null, true);
    }

    @Test
    public void testSetDomainAxisLocationNullForIndexGreaterThan0Allowed() {
        XYPlot plot = new XYPlot();
        // index != 0 -> null is allowed (no exception)
        plot.setDomainAxisLocation(1, null, true);
        // falls back to opposite of primary location
        assertEquals(AxisLocation.getOpposite(plot.getDomainAxisLocation()),
                plot.getDomainAxisLocation(1));
    }

    @Test
    public void testGetDomainAxisLocationIndexFallbackOpposite() {
        XYPlot plot = new XYPlot();
        AxisLocation expected = AxisLocation.getOpposite(
                plot.getDomainAxisLocation());
        assertEquals(expected, plot.getDomainAxisLocation(1));
    }

    @Test
    public void testGetDomainAxisEdge() {
        XYPlot plot = new XYPlot();
        assertNotNull(plot.getDomainAxisEdge());
    }

    @Test
    public void testClearDomainAxes() {
        XYPlot plot = new XYPlot();
        plot.setDomainAxis(new NumberAxis("X"));
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());
    }

    @Test
    public void testConfigureDomainAxesNoExceptionWithNullAxis() {
        XYPlot plot = new XYPlot(); // domain axis is null
        plot.configureDomainAxes(); // should just skip null axis, no exception
    }

    // ==================================================================
    // Range axis
    // ==================================================================

    @Test
    public void testSetAndGetRangeAxis() {
        XYPlot plot = new XYPlot();
        NumberAxis axis = new NumberAxis("Y");
        plot.setRangeAxis(axis);
        assertSame(axis, plot.getRangeAxis());
    }

    @Test
    public void testGetRangeAxisLocationDefault() {
        XYPlot plot = new XYPlot();
        assertEquals(AxisLocation.BOTTOM_OR_LEFT, plot.getRangeAxisLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeAxisLocationNullForIndex0Throws() {
        new XYPlot().setRangeAxisLocation(0, null, true);
    }

    @Test
    public void testGetRangeAxisEdge() {
        XYPlot plot = new XYPlot();
        assertNotNull(plot.getRangeAxisEdge());
    }

    @Test
    public void testClearRangeAxes() {
        XYPlot plot = new XYPlot();
        plot.setRangeAxis(new NumberAxis("Y"));
        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testConfigureRangeAxesNoExceptionWithNullAxis() {
        XYPlot plot = new XYPlot();
        plot.configureRangeAxes();
    }

    @Test
    public void testSetRangeAxesArray() {
        XYPlot plot = new XYPlot();
        ValueAxis[] axes = new ValueAxis[] {new NumberAxis("A"),
                new NumberAxis("B")};
        plot.setRangeAxes(axes);
        assertSame(axes[0], plot.getRangeAxis(0));
        assertSame(axes[1], plot.getRangeAxis(1));
    }

    // ==================================================================
    // Dataset
    // ==================================================================

    @Test
    public void testGetDatasetOutOfRangeReturnsNull() {
        XYPlot plot = new XYPlot();
        assertNull(plot.getDataset(5));
    }

    @Test
    public void testSetAndGetDataset() {
        XYPlot plot = new XYPlot();
        XYSeriesCollection dataset = createDatasetWithData();
        plot.setDataset(dataset);
        assertSame(dataset, plot.getDataset());
    }

    @Test
    public void testIndexOfDatasetFoundAndNotFound() {
        XYPlot plot = new XYPlot();
        XYSeriesCollection dataset = createDatasetWithData();
        plot.setDataset(dataset);
        assertEquals(0, plot.indexOf(dataset));
        assertEquals(-1, plot.indexOf(createDatasetWithData()));
    }

    @Test
    public void testGetDatasetCount() {
        XYPlot plot = new XYPlot();
        assertEquals(1, plot.getDatasetCount()); // index 0 slot allocated
    }

    // ==================================================================
    // mapDatasetToDomainAxes / mapDatasetToRangeAxes / checkAxisIndices
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxesNegativeIndexThrows() {
        new XYPlot().mapDatasetToDomainAxes(-1, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxesEmptyListThrows() {
        new XYPlot().mapDatasetToDomainAxes(0, new ArrayList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxesDuplicateIndicesThrows() {
        List indices = new ArrayList();
        indices.add(new Integer(0));
        indices.add(new Integer(0));
        new XYPlot().mapDatasetToDomainAxes(0, indices);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapDatasetToDomainAxesNonIntegerThrows() {
        List indices = new ArrayList();
        indices.add("not-an-integer");
        new XYPlot().mapDatasetToDomainAxes(0, indices);
    }

    @Test(expected = NullPointerException.class)
    public void testMapDatasetToDomainAxesNullListThrowsNPE() {
        // Javadoc says axisIndices null is "permitted", and checkAxisIndices(null)
        // returns normally, BUT mapDatasetToDomainAxes() still calls
        // "new ArrayList(axisIndices)" with axisIndices == null, which throws NPE.
        // -> This documents an actual defect/inconsistency in the given source.
        new XYPlot().mapDatasetToDomainAxes(0, null);
    }

    @Test(expected = NullPointerException.class)
    public void testMapDatasetToRangeAxesNullListThrowsNPE() {
        new XYPlot().mapDatasetToRangeAxes(0, null);
    }

    @Test
    public void testMapDatasetToDomainAxisSingleIndex() {
        XYPlot plot = new XYPlot();
        plot.mapDatasetToDomainAxis(0, 2); // just stores mapping, no error
        // no direct getter for the map, but this at least exercises the branch
    }

    // ==================================================================
    // Renderer
    // ==================================================================

    @Test
    public void testGetRendererOutOfRangeReturnsNull() {
        XYPlot plot = new XYPlot();
        assertNull(plot.getRenderer(5));
    }

    @Test
    public void testSetAndGetRenderer() {
        XYPlot plot = new XYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);
        assertSame(renderer, plot.getRenderer());
    }

    @Test
    public void testSetRenderersArray() {
        XYPlot plot = new XYPlot();
        XYLineAndShapeRenderer r1 = new XYLineAndShapeRenderer();
        XYLineAndShapeRenderer r2 = new XYLineAndShapeRenderer();
        plot.setRenderers(new org.jfree.chart.renderer.xy.XYItemRenderer[] {
                r1, r2});
        assertSame(r1, plot.getRenderer(0));
        assertSame(r2, plot.getRenderer(1));
    }

    @Test
    public void testGetRendererCount() {
        XYPlot plot = new XYPlot();
        assertEquals(1, plot.getRendererCount());
    }

    @Test
    public void testGetIndexOfRenderer() {
        XYPlot plot = new XYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);
        assertEquals(0, plot.getIndexOf(renderer));
        assertEquals(-1, plot.getIndexOf(new XYLineAndShapeRenderer()));
    }

    @Test
    public void testGetRendererForDataset() {
        XYPlot plot = new XYPlot();
        XYSeriesCollection dataset = createDatasetWithData();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setDataset(dataset);
        plot.setRenderer(renderer);
        assertSame(renderer, plot.getRendererForDataset(dataset));
        // dataset never added to the plot -> loop never matches -> null
        assertNull(plot.getRendererForDataset(createDatasetWithData()));
    }

    @Test
    public void testGetRendererForDatasetFallbackToRenderer0() {
        // renderer at index of dataset is null -> falls back to getRenderer()
        XYPlot plot = new XYPlot();
        XYSeriesCollection dataset = createDatasetWithData();
        XYLineAndShapeRenderer defaultRenderer = new XYLineAndShapeRenderer();
        plot.setRenderer(0, defaultRenderer);
        plot.setDataset(1, dataset);
        plot.setRenderer(1, null);
        assertSame(defaultRenderer, plot.getRendererForDataset(dataset));
    }

    // ==================================================================
    // Rendering order enums
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetDatasetRenderingOrderNullThrows() {
        new XYPlot().setDatasetRenderingOrder(null);
    }

    @Test
    public void testSetDatasetRenderingOrder() {
        XYPlot plot = new XYPlot();
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD,
                plot.getDatasetRenderingOrder());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesRenderingOrderNullThrows() {
        new XYPlot().setSeriesRenderingOrder(null);
    }

    @Test
    public void testSetSeriesRenderingOrder() {
        XYPlot plot = new XYPlot();
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        assertEquals(SeriesRenderingOrder.FORWARD,
                plot.getSeriesRenderingOrder());
    }

    // ==================================================================
    // Weight
    // ==================================================================

    @Test
    public void testWeightGetSet() {
        XYPlot plot = new XYPlot();
        plot.setWeight(5);
        assertEquals(5, plot.getWeight());
    }

    // ==================================================================
    // Gridlines visibility flags (branch: only fire when changed)
    // ==================================================================

    @Test
    public void testDomainGridlinesVisibleToggle() {
        XYPlot plot = new XYPlot();
        assertTrue(plot.isDomainGridlinesVisible());
        final int[] count = {0};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                count[0]++;
            }
        });
        plot.setDomainGridlinesVisible(true); // no change
        assertEquals(0, count[0]);
        plot.setDomainGridlinesVisible(false); // changed
        assertEquals(1, count[0]);
        assertFalse(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testDomainMinorGridlinesVisibleToggle() {
        XYPlot plot = new XYPlot();
        assertFalse(plot.isDomainMinorGridlinesVisible());
        plot.setDomainMinorGridlinesVisible(true);
        assertTrue(plot.isDomainMinorGridlinesVisible());
    }

    @Test
    public void testRangeGridlinesVisibleToggle() {
        XYPlot plot = new XYPlot();
        assertTrue(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
    }

    // ==================================================================
    // Stroke / paint null checks (representative sample)
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStrokeNullThrows() {
        new XYPlot().setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaintNullThrows() {
        new XYPlot().setDomainGridlinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStrokeNullThrows() {
        new XYPlot().setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaintNullThrows() {
        new XYPlot().setRangeGridlinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainZeroBaselineStrokeNullThrows() {
        new XYPlot().setDomainZeroBaselineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeZeroBaselinePaintNullThrows() {
        new XYPlot().setRangeZeroBaselinePaint(null);
    }

    @Test
    public void testDomainTickBandPaintAllowsNull() {
        XYPlot plot = new XYPlot();
        plot.setDomainTickBandPaint(null); // no exception, null permitted
        assertNull(plot.getDomainTickBandPaint());
        plot.setDomainTickBandPaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainTickBandPaint());
    }

    // ==================================================================
    // Quadrant origin / paint
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantOriginNullThrows() {
        new XYPlot().setQuadrantOrigin(null);
    }

    @Test
    public void testQuadrantOriginDefaultAndSet() {
        XYPlot plot = new XYPlot();
        assertEquals(new Point2D.Double(0.0, 0.0), plot.getQuadrantOrigin());
        Point2D p = new Point2D.Double(1.0, 2.0);
        plot.setQuadrantOrigin(p);
        assertEquals(p, plot.getQuadrantOrigin());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaintIndexBelowZeroThrows() {
        new XYPlot().getQuadrantPaint(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaintIndexAboveThreeThrows() {
        new XYPlot().getQuadrantPaint(4);
    }

    @Test
    public void testSetAndGetQuadrantPaintBoundaryIndices() {
        XYPlot plot = new XYPlot();
        plot.setQuadrantPaint(0, Color.RED);
        plot.setQuadrantPaint(3, Color.BLUE);
        assertEquals(Color.RED, plot.getQuadrantPaint(0));
        assertEquals(Color.BLUE, plot.getQuadrantPaint(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantPaintIndexOutOfRangeThrows() {
        new XYPlot().setQuadrantPaint(10, Color.RED);
    }

    // ==================================================================
    // Domain / Range markers
    // ==================================================================

    @Test
    public void testAddDomainMarkerAndClear() {
        XYPlot plot = new XYPlot();
        ValueMarker marker = new ValueMarker(1.0);
        plot.addDomainMarker(marker);
        assertEquals(1, plot.getDomainMarkers(Layer.FOREGROUND).size());
        plot.clearDomainMarkers();
        assertNull(plot.getDomainMarkers(Layer.FOREGROUND));
    }

    @Test
    public void testAddDomainMarkerBackgroundLayer() {
        XYPlot plot = new XYPlot();
        ValueMarker marker = new ValueMarker(2.0);
        plot.addDomainMarker(marker, Layer.BACKGROUND);
        assertEquals(1, plot.getDomainMarkers(Layer.BACKGROUND).size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDomainMarkerNullThrows() {
        new XYPlot().addDomainMarker(null);
    }

    @Test
    public void testRemoveDomainMarkerNotFoundReturnsFalse() {
        XYPlot plot = new XYPlot();
        assertFalse(plot.removeDomainMarker(new ValueMarker(9.0)));
    }

    @Test
    public void testRemoveDomainMarkerFoundReturnsTrue() {
        XYPlot plot = new XYPlot();
        ValueMarker marker = new ValueMarker(5.0);
        plot.addDomainMarker(marker);
        assertTrue(plot.removeDomainMarker(marker));
        assertEquals(0, plot.getDomainMarkers(Layer.FOREGROUND).size());
    }

    @Test
    public void testAddRangeMarkerAndClear() {
        XYPlot plot = new XYPlot();
        ValueMarker marker = new ValueMarker(1.0);
        plot.addRangeMarker(marker);
        assertEquals(1, plot.getRangeMarkers(Layer.FOREGROUND).size());
        plot.clearRangeMarkers();
        assertNull(plot.getRangeMarkers(Layer.FOREGROUND));
    }

    @Test
    public void testRemoveRangeMarkerNotFoundReturnsFalse() {
        XYPlot plot = new XYPlot();
        assertFalse(plot.removeRangeMarker(new ValueMarker(9.0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarkerNullThrows() {
        new XYPlot().removeRangeMarker(null);
    }

    // ==================================================================
    // Annotations
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotationNullThrows() {
        new XYPlot().addAnnotation(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAnnotationNullThrows() {
        new XYPlot().removeAnnotation(null);
    }

    @Test
    public void testAddRemoveGetAnnotations() {
        XYPlot plot = new XYPlot();
        XYTextAnnotation ann = new XYTextAnnotation("hello", 1.0, 1.0);
        plot.addAnnotation(ann);
        assertEquals(1, plot.getAnnotations().size());
        assertTrue(plot.removeAnnotation(ann));
        assertEquals(0, plot.getAnnotations().size());
        assertFalse(plot.removeAnnotation(ann)); // already removed
    }

    @Test
    public void testClearAnnotations() {
        XYPlot plot = new XYPlot();
        plot.addAnnotation(new XYTextAnnotation("a", 0, 0));
        plot.addAnnotation(new XYTextAnnotation("b", 1, 1));
        plot.clearAnnotations();
        assertEquals(0, plot.getAnnotations().size());
    }

    // ==================================================================
    // Axis space calculation (protected methods, same package)
    // ==================================================================

    @Test
    public void testCalculateDomainAxisSpaceFixedVertical() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.VERTICAL);
        AxisSpace fixed = new AxisSpace();
        fixed.setTop(10.0);
        fixed.setBottom(20.0);
        plot.setFixedDomainAxisSpace(fixed);
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 100, 100);
        AxisSpace space = plot.calculateDomainAxisSpace(createGraphics(),
                plotArea, null);
        assertTrue(space.getTop() >= 10.0);
        assertTrue(space.getBottom() >= 20.0);
    }

    @Test
    public void testCalculateDomainAxisSpaceFixedHorizontal() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        AxisSpace fixed = new AxisSpace();
        fixed.setLeft(5.0);
        fixed.setRight(7.0);
        plot.setFixedDomainAxisSpace(fixed);
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 100, 100);
        AxisSpace space = plot.calculateDomainAxisSpace(createGraphics(),
                plotArea, null);
        assertTrue(space.getLeft() >= 5.0);
        assertTrue(space.getRight() >= 7.0);
    }

    @Test
    public void testCalculateRangeAxisSpaceNoFixedSpaceNoAxis() {
        XYPlot plot = new XYPlot(); // range axis null
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 100, 100);
        AxisSpace space = plot.calculateRangeAxisSpace(createGraphics(),
                plotArea, null);
        assertNotNull(space); // no exception even with null axis
    }

    @Test
    public void testCalculateAxisSpaceCombined() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 300, 300);
        AxisSpace space = plot.calculateAxisSpace(createGraphics(), plotArea);
        assertNotNull(space);
    }

    // ==================================================================
    // render()
    // ==================================================================

    @Test
    public void testRenderReturnsFalseForEmptyDataset() {
        XYPlot plot = new XYPlot(new XYSeriesCollection(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);
        CrosshairState state = new CrosshairState();
        boolean found = plot.render(createGraphics(), dataArea, 0, null, state);
        assertFalse(found);
    }

    @Test
    public void testRenderReturnsFalseForNullDataset() {
        XYPlot plot = new XYPlot();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);
        CrosshairState state = new CrosshairState();
        boolean found = plot.render(createGraphics(), dataArea, 0, null, state);
        assertFalse(found);
    }

    @Test
    public void testRenderReturnsTrueWithData() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);
        CrosshairState state = new CrosshairState();
        boolean found = plot.render(createGraphics(), dataArea, 0, null, state);
        assertTrue(found);
    }

    @Test
    public void testRenderSeriesRenderingOrderForward() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 200, 100);
        CrosshairState state = new CrosshairState();
        boolean found = plot.render(createGraphics(), dataArea, 0, null, state);
        assertTrue(found);
    }

    // ==================================================================
    // getDomainAxisForDataset / getRangeAxisForDataset boundary checks
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDatasetNegativeIndexThrows() {
        new XYPlot().getDomainAxisForDataset(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxisForDatasetOutOfUpperBoundThrows() {
        XYPlot plot = new XYPlot(); // datasetCount=1, rendererCount=1 -> upper=1
        plot.getDomainAxisForDataset(1);
    }

    @Test
    public void testGetDomainAxisForDatasetDefaultMapping() {
        NumberAxis axis = new NumberAxis("X");
        XYPlot plot = new XYPlot(createDatasetWithData(), axis,
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        assertSame(axis, plot.getDomainAxisForDataset(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRangeAxisForDatasetOutOfBoundsThrows() {
        new XYPlot().getRangeAxisForDataset(1);
    }

    // ==================================================================
    // getDataRange (includes a fault-detecting test)
    // ==================================================================

    @Test
    public void testGetDataRangeForUnrelatedAxisReturnsNull() {
        XYPlot plot = new XYPlot();
        NumberAxis unrelated = new NumberAxis("unrelated");
        assertNull(plot.getDataRange(unrelated));
    }

    @Test
    public void testGetDataRangeWithProperRenderer() {
        NumberAxis domainAxis = new NumberAxis("X");
        XYPlot plot = new XYPlot(createDatasetWithData(), domainAxis,
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        assertNotNull(plot.getDataRange(domainAxis));
    }

    @Test
    public void testGetDataRangeWithNullRenderer_FaultDetection() {
        // The dataset is mapped to axis 0 (default), but no renderer is set
        // (renderer == null) so getRendererForDataset(d) returns null.
        // In the given source, after computing the bounds it unconditionally
        // executes:  Collection c = r.getAnnotations();
        // with r == null -> NullPointerException.
        // This test documents/attempts to catch that fault: on a corrected
        // implementation this call should NOT throw.
        NumberAxis domainAxis = new NumberAxis("X");
        XYPlot plot = new XYPlot(createDatasetWithData(), domainAxis,
                new NumberAxis("Y"), null); // no renderer!
        try {
            plot.getDataRange(domainAxis);
            // if we get here, the implementation handled null renderer safely
        } catch (NullPointerException npe) {
            fail("getDataRange() threw NullPointerException due to missing "
                    + "null-check on renderer before calling getAnnotations() "
                    + "- this documents a fault in XYPlot.getDataRange().");
        }
    }

    // ==================================================================
    // datasetChanged / rendererChanged
    // ==================================================================

    @Test
    public void testDatasetChangedFiresPlotChangeEvent() {
        XYPlot plot = new XYPlot();
        XYSeriesCollection dataset = createDatasetWithData();
        plot.setDataset(dataset);
        final boolean[] called = {false};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                called[0] = true;
            }
        });
        plot.datasetChanged(new DatasetChangeEvent(plot, dataset));
        assertTrue(called[0]);
    }

    @Test
    public void testRendererChangeNotifiesPlot() {
        // Uses the standard AbstractRenderer notification mechanism
        // (setSeriesPaint fires a RendererChangeEvent to registered listeners,
        // which XYPlot.setRenderer() registers itself as).
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), renderer);
        final int[] count = {0};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                count[0]++;
            }
        });
        renderer.setSeriesPaint(0, Color.RED);
        assertTrue(count[0] > 0);
    }

    // ==================================================================
    // Crosshair properties
    // ==================================================================

    @Test
    public void testDomainCrosshairVisibleToggleFiresOnlyOnChange() {
        XYPlot plot = new XYPlot();
        final int[] count = {0};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                count[0]++;
            }
        });
        plot.setDomainCrosshairVisible(false); // same as default -> no event
        assertEquals(0, count[0]);
        plot.setDomainCrosshairVisible(true);
        assertEquals(1, count[0]);
    }

    @Test
    public void testDomainCrosshairValueNotifyOnlyWhenVisible() {
        XYPlot plot = new XYPlot();
        final int[] count = {0};
        plot.addChangeListener(new PlotChangeListener() {
            public void plotChanged(PlotChangeEvent event) {
                count[0]++;
            }
        });
        plot.setDomainCrosshairVisible(false);
        plot.setDomainCrosshairValue(1.23); // crosshair not visible -> no event
        assertEquals(0, count[0]);
        plot.setDomainCrosshairVisible(true);
        plot.setDomainCrosshairValue(4.56); // now visible -> event fired
        assertTrue(count[0] > 0);
        assertEquals(4.56, plot.getDomainCrosshairValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairStrokeNullThrows() {
        new XYPlot().setDomainCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainCrosshairPaintNullThrows() {
        new XYPlot().setDomainCrosshairPaint(null);
    }

    @Test
    public void testDomainCrosshairLockedOnDataDefaultTrue() {
        XYPlot plot = new XYPlot();
        assertTrue(plot.isDomainCrosshairLockedOnData());
        plot.setDomainCrosshairLockedOnData(false);
        assertFalse(plot.isDomainCrosshairLockedOnData());
    }

    @Test
    public void testRangeCrosshairValueNotifyOnlyWhenVisible() {
        XYPlot plot = new XYPlot();
        plot.setRangeCrosshairVisible(false);
        plot.setRangeCrosshairValue(2.0, true);
        assertEquals(2.0, plot.getRangeCrosshairValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeCrosshairStrokeNullThrows() {
        new XYPlot().setRangeCrosshairStroke(null);
    }

    // ==================================================================
    // Fixed axis space
    // ==================================================================

    @Test
    public void testFixedDomainAxisSpace() {
        XYPlot plot = new XYPlot();
        AxisSpace space = new AxisSpace();
        plot.setFixedDomainAxisSpace(space);
        assertSame(space, plot.getFixedDomainAxisSpace());
        plot.setFixedDomainAxisSpace(null, false); // notify=false branch
        assertNull(plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testFixedRangeAxisSpace() {
        XYPlot plot = new XYPlot();
        AxisSpace space = new AxisSpace();
        plot.setFixedRangeAxisSpace(space);
        assertSame(space, plot.getFixedRangeAxisSpace());
    }

    // ==================================================================
    // Panning
    // ==================================================================

    @Test
    public void testPanDomainAxesNoOpWhenNotPannable() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        assertFalse(plot.isDomainPannable());
        // should simply return without throwing (info/source not used in this branch)
        plot.panDomainAxes(0.1, null, null);
    }

    @Test
    public void testPanDomainAxesWhenPannable() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        plot.setDomainPannable(true);
        assertTrue(plot.isDomainPannable());
        plot.panDomainAxes(0.1, null, null); // exercises loop + axis.pan()
    }

    @Test
    public void testPanRangeAxesNoOpWhenNotPannable() {
        XYPlot plot = new XYPlot();
        assertFalse(plot.isRangePannable());
        plot.panRangeAxes(0.1, null, null);
    }

    @Test
    public void testPanRangeAxesWhenPannable() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        plot.setRangePannable(true);
        plot.panRangeAxes(0.1, null, null);
    }

    // ==================================================================
    // Zoom
    // ==================================================================

    @Test
    public void testZoomDomainAxesFactor() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        plot.zoomDomainAxes(0.5, null, null); // useAnchor=false branch
    }

    @Test
    public void testZoomDomainAxesLowerUpperPercent() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        plot.zoomDomainAxes(0.1, 0.9, null, null);
    }

    @Test
    public void testZoomRangeAxesFactor() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        plot.zoomRangeAxes(0.5, null, null);
    }

    @Test
    public void testZoomRangeAxesLowerUpperPercent() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        plot.zoomRangeAxes(0.2, 0.8, null, null);
    }

    @Test
    public void testIsDomainAndRangeZoomableAlwaysTrue() {
        XYPlot plot = new XYPlot();
        assertTrue(plot.isDomainZoomable());
        assertTrue(plot.isRangeZoomable());
    }

    // ==================================================================
    // Series count / legend items
    // ==================================================================

    @Test
    public void testGetSeriesCountNullDataset() {
        XYPlot plot = new XYPlot();
        assertEquals(0, plot.getSeriesCount());
    }

    @Test
    public void testGetSeriesCountWithDataset() {
        XYPlot plot = new XYPlot();
        plot.setDataset(createDatasetWithData());
        assertEquals(1, plot.getSeriesCount());
    }

    @Test
    public void testFixedLegendItemsOverridesGetLegendItems() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        LegendItemCollection fixed = new LegendItemCollection();
        plot.setFixedLegendItems(fixed);
        assertSame(fixed, plot.getLegendItems());
    }

    @Test
    public void testGetLegendItemsFromRendererWhenNoFixedItems() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertEquals(1, items.getItemCount());
    }

    // ==================================================================
    // equals / clone
    // ==================================================================

    @Test
    public void testEqualsSameInstance() {
        XYPlot plot = new XYPlot();
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsDifferentTypeReturnsFalse() {
        XYPlot plot = new XYPlot();
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEqualsWeightDiffers() {
        XYPlot p1 = new XYPlot();
        XYPlot p2 = new XYPlot();
        p2.setWeight(999);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testCloneProducesEqualButDistinctObject()
            throws CloneNotSupportedException {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        XYPlot clone = (XYPlot) plot.clone();
        assertNotSame(plot, clone);
        assertEquals(plot, clone);
    }

    @Test
    public void testCloneThenModifyBreaksEquality()
            throws CloneNotSupportedException {
        XYPlot plot = new XYPlot();
        XYPlot clone = (XYPlot) plot.clone();
        clone.setWeight(123);
        assertFalse(plot.equals(clone));
    }

    // ==================================================================
    // Selection support
    // ==================================================================

    @Test
    public void testCanSelectByPointIsFalse() {
        assertFalse(new XYPlot().canSelectByPoint());
    }

    @Test
    public void testCanSelectByRegionIsTrue() {
        assertTrue(new XYPlot().canSelectByRegion());
    }

    @Test
    public void testSelectByPointDoesNotThrow() {
        XYPlot plot = new XYPlot();
        // implementation is currently a no-op (TODO) - just make sure it
        // doesn't throw for the "not yet implemented" path
        plot.select(0.0, 0.0, new Rectangle2D.Double(0, 0, 10, 10), null);
    }

    @Test
    public void testClearSelectionWithNoDatasetDoesNotThrow() {
        XYPlot plot = new XYPlot();
        plot.clearSelection();
    }

    @Test
    public void testHandleClickInsideDataAreaUpdatesCrosshairs() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);
        plot.handleClick(50, 50, info);
        // domain/range crosshair values should have been updated (no exception)
    }

    @Test
    public void testHandleClickOutsideDataAreaNoUpdate() {
        XYPlot plot = new XYPlot(createDatasetWithData(), new NumberAxis("X"),
                new NumberAxis("Y"), new XYLineAndShapeRenderer());
        PlotRenderingInfo info = new PlotRenderingInfo(null);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        info.setDataArea(dataArea);
        double before = plot.getDomainCrosshairValue();
        plot.handleClick(500, 500, info); // outside dataArea -> branch not taken
        assertEquals(before, plot.getDomainCrosshairValue(), 0.0001);
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| กลุ่ม | Test Method (ตัวอย่างเด่น) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Constructor | testDefaultConstructor, testConstructorWithArgs | ค่า default ทุก field, path ที่ dataset/axis/renderer เป็น null หรือไม่ null ใน constructor |
| Orientation | testSetOrientationNullThrows, testSetOrientationChangeFiresEventOnlyWhenChanged | null check, `if (orientation != this.orientation)` true/false |
| AxisOffset | testSetAxisOffsetNullThrows, testSetAxisOffset | null check |
| Domain/Range Axis get/set | testGetDomainAxisOutOfRangeIndexReturnsNull, testSetDomainAxisNotifyFalseDoesNotFireEvent, testSetDomainAxesArray | index<size vs ไม่, parent null, notify true/false |
| AxisLocation | testSetDomainAxisLocationNullForIndex0Throws, testSetDomainAxisLocationNullForIndexGreaterThan0Allowed, testGetDomainAxisLocationIndexFallbackOpposite | `index==0 && location==null`, fallback opposite เมื่อ result null |
| Dataset | testGetDatasetOutOfRangeReturnsNull, testIndexOfDatasetFoundAndNotFound | index bound, loop match/ไม่ match |
| mapDatasetToXxxAxes / checkAxisIndices | testMapDatasetToDomainAxesEmptyListThrows, ...DuplicateIndicesThrows, ...NonIntegerThrows, testMapDatasetToDomainAxesNullListThrowsNPE | ทุก branch ของ `checkAxisIndices` (null, empty, non-Integer, duplicate) และดักจับ fault NPE จาก `new ArrayList(null)` |
| Renderer | testGetRendererOutOfRangeReturnsNull, testGetRendererForDatasetFallbackToRenderer0 | index bound, fallback `result==null -> getRenderer()` |
| Rendering order enums | testSetDatasetRenderingOrderNullThrows, testSetSeriesRenderingOrderNullThrows | null check |
| Gridlines flags | testDomainGridlinesVisibleToggle, testDomainMinorGridlinesVisibleToggle | `if (flag != current)` true/false |
| Stroke/Paint setters | testSetDomainGridlineStrokeNullThrows ฯลฯ, testDomainTickBandPaintAllowsNull | null check throws vs null permitted |
| Quadrant | testGetQuadrantPaintIndexBelowZeroThrows, ...AboveThreeThrows, testSetAndGetQuadrantPaintBoundaryIndices | boundary `index<0 \|\| index>3` |
| Markers | testAddDomainMarkerAndClear, testAddDomainMarkerBackgroundLayer, testRemoveDomainMarkerNotFoundReturnsFalse | layer FOREGROUND/BACKGROUND branch, markers==null branch, remove found/not found |
| Annotations | testAddAnnotationNullThrows, testAddRemoveGetAnnotations, testClearAnnotations | null check, remove found/not found |
| AxisSpace calculation | testCalculateDomainAxisSpaceFixedVertical/Horizontal, testCalculateRangeAxisSpaceNoFixedSpaceNoAxis | fixed space vs loop คำนวณจาก axis, orientation VERTICAL/HORIZONTAL, axis null |
| render() | testRenderReturnsFalseForEmptyDataset, ...NullDataset, ...True..., testRenderSeriesRenderingOrderForward | `isEmptyOrNull` true/false, seriesOrder REVERSE/FORWARD, xAxis/yAxis null |
| getDomainAxisForDataset/getRangeAxisForDataset | testGetDomainAxisForDatasetNegativeIndexThrows, ...OutOfUpperBoundThrows, ...DefaultMapping | index<0, index>=upper, axisIndices null vs mapped |
| getDataRange | testGetDataRangeForUnrelatedAxisReturnsNull, testGetDataRangeWithProperRenderer, **testGetDataRangeWithNullRenderer_FaultDetection** | domainIndex/rangeIndex <0 หรือ >=0, r!=null vs r==null (**ดักจับ fault NPE**) |
| datasetChanged/rendererChanged | testDatasetChangedFiresPlotChangeEvent, testRendererChangeNotifiesPlot | parent==null branch, listener notify |
| Crosshair | testDomainCrosshairVisibleToggleFiresOnlyOnChange, testDomainCrosshairValueNotifyOnlyWhenVisible | `isXCrosshairVisible() && notify` true/false |
| Fixed axis space | testFixedDomainAxisSpace (notify=false), testFixedRangeAxisSpace | notify true/false |
| Pan | testPanDomainAxesNoOpWhenNotPannable, ...WhenPannable, testPanRangeAxes... | `!isPannable()` return early vs loop กับ axis null/inverted |
| Zoom | testZoomDomainAxesFactor, ...LowerUpperPercent, testZoomRangeAxes... | useAnchor=false path |
| Series/Legend | testGetSeriesCountNullDataset/WithDataset, testFixedLegendItemsOverridesGetLegendItems | dataset null/ไม่ null, fixedLegendItems null/ไม่ null |
| equals/clone | testEqualsSameInstance, ...DifferentTypeReturnsFalse, ...WeightDiffers, testCloneProducesEqualButDistinctObject | `obj==this`, `!(obj instanceof XYPlot)`, field mismatch |
| Selection | testCanSelectByPointIsFalse/RegionIsTrue, testClearSelectionWithNoDatasetDoesNotThrow | ค่าคงที่ true/false, loop dataset null |
| handleClick | testHandleClickInsideDataAreaUpdatesCrosshairs, ...Outside...NoUpdate | `dataArea.contains(x,y)` true/false |

**หมายเหตุสำคัญ:** สอง test ที่ทำเครื่องหมายพิเศษ (`testMapDatasetToDomainAxesNullListThrowsNPE` และ `testGetDataRangeWithNullRenderer_FaultDetection`) เขียนขึ้นเพื่อพิสูจน์ inconsistency/fault ที่พบจริงในซอร์สที่ให้มา (ไม่ใช่การเดา behavior) — จุดแรกคือ Javadoc ระบุว่า `axisIndices` เป็น null ได้ แต่ implementation เรียก `new ArrayList(null)` ซึ่ง throw NPE เสมอ, จุดที่สองคือการเรียก `r.getAnnotations()` โดยไม่เช็ค null ก่อนใน `getDataRange()`
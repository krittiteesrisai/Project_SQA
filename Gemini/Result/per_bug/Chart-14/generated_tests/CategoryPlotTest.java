package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Collection;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Before;
import org.junit.Test;

/**
 * Comprehensive test class for CategoryPlot targeting high branch coverage
 * and edge cases (Defects4J Chart-14b).
 */
public class CategoryPlotTest {

    private CategoryPlot plot;
    private DefaultCategoryDataset dataset;
    private CategoryAxis domainAxis;
    private ValueAxis rangeAxis;
    private BarRenderer renderer;

    @Before
    public void setUp() {
        dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "R1", "C1");
        domainAxis = new CategoryAxis("Category");
        rangeAxis = new NumberAxis("Value");
        renderer = new BarRenderer();
        plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
    }

    @Test
    public void testConstructorsAndDefaults() {
        CategoryPlot defaultPlot = new CategoryPlot();
        assertNotNull(defaultPlot.getOrientation());
        assertEquals(0, defaultPlot.getDatasetCount());
        assertNull(defaultPlot.getDataset());
        assertNotNull(defaultPlot.getAxisOffset());
    }

    @Test
    public void testSetOrientationNotNull() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() {
        plot.setOrientation(null);
    }

    @Test
    public void testAxisOffset() {
        RectangleInsets insets = new RectangleInsets(2.0, 2.0, 2.0, 2.0);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAxisOffsetNull() {
        plot.setAxisOffset(null);
    }

    @Test
    public void testGetDomainAxisWithParent() {
        CategoryPlot parentPlot = new CategoryPlot();
        CategoryAxis parentAxis = new CategoryAxis("Parent Axis");
        parentPlot.setDomainAxis(0, parentAxis);
        
        CategoryPlot subPlot = new CategoryPlot();
        subPlot.setParent(parentPlot);
        // Index 0 in subplot is null, should delegate to parent
        subPlot.setDomainAxis(0, null);
        
        assertEquals(parentAxis, subPlot.getDomainAxis(0));
    }

    @Test
    public void testGetRangeAxisWithParent() {
        CategoryPlot parentPlot = new CategoryPlot();
        ValueAxis parentAxis = new NumberAxis("Parent Range");
        parentPlot.setRangeAxis(0, parentAxis);
        
        CategoryPlot subPlot = new CategoryPlot();
        subPlot.setParent(parentPlot);
        subPlot.setRangeAxis(0, null);
        
        assertEquals(parentAxis, subPlot.getRangeAxis(0));
    }

    @Test
    public void testDatasetMappingAndGetters() {
        DefaultCategoryDataset ds2 = new DefaultCategoryDataset();
        plot.setDataset(1, ds2);
        assertEquals(ds2, plot.getDataset(1));
        assertNull(plot.getDataset(5));

        plot.mapDatasetToDomainAxis(1, 0);
        plot.mapDatasetToRangeAxis(1, 0);
        assertNotNull(plot.getDomainAxisForDataset(1));
        assertNotNull(plot.getRangeAxisForDataset(1));
    }

    @Test
    public void testRendererManagement() {
        BarRenderer r2 = new BarRenderer();
        plot.setRenderer(1, r2);
        assertEquals(r2, plot.getRenderer(1));
        assertNull(plot.getRenderer(10));
        assertEquals(1, plot.getIndexOf(r2));
        assertEquals(r2, plot.getRendererForDataset(plot.getDataset(1)));
        assertNull(plot.getRendererForDataset(new DefaultCategoryDataset()));
    }

    @Test
    public void testGridlinesAndVisibility() {
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(true); // coverage for identical branch

        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(false);

        plot.setDomainGridlineStroke(new BasicStroke(1.0f));
        assertNotNull(plot.getDomainGridlineStroke());

        plot.setDomainGridlinePaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainGridlinePaint());

        plot.setRangeGridlineStroke(new BasicStroke(1.0f));
        assertNotNull(plot.getRangeGridlineStroke());

        plot.setRangeGridlinePaint(Color.BLUE);
        assertEquals(Color.BLUE, plot.getRangeGridlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDomainGridlineStrokeNull() {
        plot.setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDomainGridlinePaintNull() {
        plot.setDomainGridlinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRangeGridlineStrokeNull() {
        plot.setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRangeGridlinePaintNull() {
        plot.setRangeGridlinePaint(null);
    }

    @Test
    public void testMarkersHandling() {
        CategoryMarker marker = new CategoryMarker("C1");
        plot.addDomainMarker(marker, Layer.FOREGROUND);
        plot.addDomainMarker(marker, Layer.BACKGROUND);
        
        assertNotNull(plot.getDomainMarkers(Layer.FOREGROUND));
        assertNotNull(plot.getDomainMarkers(Layer.BACKGROUND));

        assertTrue(plot.removeDomainMarker(marker, Layer.FOREGROUND));
        assertTrue(plot.removeDomainMarker(marker, Layer.BACKGROUND));
        assertFalse(plot.removeDomainMarker(marker, Layer.FOREGROUND));

        ValueMarker vMarker = new ValueMarker(10.0);
        plot.addRangeMarker(vMarker, Layer.FOREGROUND);
        plot.addRangeMarker(vMarker, Layer.BACKGROUND);

        assertNotNull(plot.getRangeMarkers(Layer.FOREGROUND));
        assertNotNull(plot.getRangeMarkers(Layer.BACKGROUND));

        assertTrue(plot.removeRangeMarker(vMarker, Layer.FOREGROUND));
        assertTrue(plot.removeRangeMarker(vMarker, Layer.BACKGROUND));
        
        plot.clearDomainMarkers();
        plot.clearRangeMarkers();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveRangeMarkerNullMarker() {
        plot.removeRangeMarker(null, Layer.FOREGROUND);
    }

    @Test
    public void testCrosshairSettings() {
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(true);

        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairLockedOnData(false);

        plot.setRangeCrosshairValue(5.0, true);
        assertEquals(5.0, plot.getRangeCrosshairValue(), 0.001);

        plot.setRangeCrosshairStroke(new BasicStroke(2.0f));
        assertNotNull(plot.getRangeCrosshairStroke());

        plot.setRangeCrosshairPaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getRangeCrosshairPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCrosshairStrokeNull() {
        plot.setRangeCrosshairStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCrosshairPaintNull() {
        plot.setRangeCrosshairPaint(null);
    }

    @Test
    public void testEqualsAndClone() throws CloneNotSupportedException {
        CategoryPlot plot2 = (CategoryPlot) plot.clone();
        assertTrue(plot.equals(plot2));
        assertTrue(plot.equals(plot));
        assertFalse(plot.equals(null));
        assertFalse(plot.equals("NotAPlot"));

        // Modify a property to test inequality
        plot2.setWeight(10);
        assertFalse(plot.equals(plot2));
    }

    @Test
    public void testDatasetChangedEvent() {
        DatasetChangeEvent event = new DatasetChangeEvent(dataset, dataset);
        plot.datasetChanged(event);
        // Verify it handles event notification smoothly without parent
        assertNotNull(plot.getDataRange(rangeAxis));
    }

    @Test
    public void testDrawRenderingEdgeCases() {
        BufferedImage img = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        
        // Test drawing with an extremely small area (triggers early return branch)
        Rectangle2D tinyArea = new Rectangle2D.Double(0, 0, 1, 1);
        plot.draw(g2, tinyArea, null, null, null);

        // Test normal drawing area
        Rectangle2D normalArea = new Rectangle2D.Double(0, 0, 400, 300);
        plot.draw(g2, normalArea, null, null, null);
    }
}
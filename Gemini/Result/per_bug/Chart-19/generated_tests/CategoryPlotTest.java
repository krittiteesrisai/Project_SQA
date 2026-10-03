package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Collection;
import java.util.List;

import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryAnnotation;
import org.jfree.chart.annotations.TextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Before;
import org.junit.Test;

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
        assertEquals(1, defaultPlot.getDatasetCount());
        assertNull(defaultPlot.getDataset());
        assertNull(defaultPlot.getDomainAxis());
        assertNull(defaultPlot.getRangeAxis());
        assertNull(defaultPlot.getRenderer());
    }

    @Test
    public void testGettersAndSettersEdgeCases() {
        // Orientation
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());

        try {
            plot.setOrientation(null);
            fail("Expected IllegalArgumentException for null orientation");
        } catch (IllegalArgumentException e) {
            // expected
        }

        // Axis Offset
        RectangleInsets insets = new RectangleInsets(2.0, 2.0, 2.0, 2.0);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());

        try {
            plot.setAxisOffset(null);
            fail("Expected IllegalArgumentException for null axis offset");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDomainAndRangeAxesManagement() {
        CategoryAxis newDomain = new CategoryAxis("New Domain");
        plot.setDomainAxis(1, newDomain);
        assertEquals(newDomain, plot.getDomainAxis(1));
        assertEquals(2, plot.getDomainAxisCount());
        assertEquals(0, plot.getDomainAxisIndex(newDomain));
        assertEquals(-1, plot.getDomainAxisIndex(new CategoryAxis("Unk")));

        ValueAxis newRange = new NumberAxis("New Range");
        plot.setRangeAxis(1, newRange);
        assertEquals(newRange, plot.getRangeAxis(1));
        assertEquals(2, plot.getRangeAxisCount());
        assertEquals(1, plot.getRangeAxisIndex(newRange));
        assertEquals(-1, plot.getRangeAxisIndex(new NumberAxis("Unk")));

        // Clear axes
        plot.clearDomainAxes();
        assertEquals(0, plot.getDomainAxisCount());

        plot.clearRangeAxes();
        assertEquals(0, plot.getRangeAxisCount());
    }

    @Test
    public void testParentPlotAxisDelegation() {
        CategoryPlot parent = new CategoryPlot();
        CategoryAxis parentDomain = new CategoryAxis("Parent Domain");
        ValueAxis parentRange = new NumberAxis("Parent Range");
        parent.setDomainAxis(0, parentDomain);
        parent.setRangeAxis(0, parentRange);

        plot.setParent(parent);
        plot.setDomainAxis(0, null);
        plot.setRangeAxis(0, null);

        // Should delegate to parent if local axis is null
        assertEquals(parentDomain, plot.getDomainAxis(0));
        assertEquals(parentRange, plot.getRangeAxis(0));
        assertEquals(0, parent.getRangeAxisIndex(parentRange));
    }

    @Test
    public void testDatasetAndRendererMapping() {
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.addValue(5.0, "R2", "C2");
        plot.setDataset(1, dataset2);
        plot.mapDatasetToDomainAxis(1, 0);
        plot.mapDatasetToRangeAxis(1, 0);

        assertEquals(dataset2, plot.getDataset(1));
        assertEquals(2, plot.getDatasetCount());
        assertEquals(domainAxis, plot.getDomainAxisForDataset(1));
        assertEquals(rangeAxis, plot.getRangeAxisForDataset(1));

        BarRenderer renderer2 = new BarRenderer();
        plot.setRenderer(1, renderer2);
        assertEquals(renderer2, plot.getRenderer(1));
        assertEquals(renderer2, plot.getRendererForDataset(dataset2));
        assertEquals(1, plot.getIndexOf(renderer2));
        assertEquals(-1, plot.getIndexOf(null));

        plot.setRenderer(null, false);
        assertNull(plot.getRenderer());
    }

    @Test
    public void testRenderingOrdersAndGridlines() {
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        assertEquals(DatasetRenderingOrder.FORWARD, plot.getDatasetRenderingOrder());

        plot.setColumnRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getColumnRenderingOrder());

        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        assertEquals(SortOrder.DESCENDING, plot.getRowRenderingOrder());

        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());

        plot.setDomainGridlinePosition(CategoryAnchor.END);
        assertEquals(CategoryAnchor.END, plot.getDomainGridlinePosition());

        BasicStroke stroke = new BasicStroke(1.0f);
        plot.setDomainGridlineStroke(stroke);
        assertEquals(stroke, plot.getDomainGridlineStroke());

        plot.setDomainGridlinePaint(Color.RED);
        assertEquals(Color.RED, plot.getDomainGridlinePaint());

        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());

        plot.setRangeGridlineStroke(stroke);
        assertEquals(stroke, plot.getRangeGridlineStroke());

        plot.setRangeGridlinePaint(Color.BLUE);
        assertEquals(Color.BLUE, plot.getRangeGridlinePaint());
    }

    @Test
    public void testMarkersAndAnnotations() {
        CategoryMarker dMarker = new CategoryMarker("C1");
        plot.addDomainMarker(dMarker);
        plot.addDomainMarker(1, dMarker, Layer.BACKGROUND);
        assertNotNull(plot.getDomainMarkers(Layer.FOREGROUND));
        assertNotNull(plot.getDomainMarkers(1, Layer.BACKGROUND));
        plot.clearDomainMarkers();
        plot.clearDomainMarkers(1);

        ValueMarker rMarker = new ValueMarker(2.0);
        plot.addRangeMarker(rMarker);
        plot.addRangeMarker(1, rMarker, Layer.BACKGROUND);
        assertNotNull(plot.getRangeMarkers(Layer.FOREGROUND));
        assertNotNull(plot.getRangeMarkers(1, Layer.BACKGROUND));
        plot.clearRangeMarkers();
        plot.clearRangeMarkers(1);

        CategoryAnnotation annotation = new TextAnnotation("Test", "C1", 1.0);
        plot.addAnnotation(annotation);
        assertEquals(1, plot.getAnnotations().size());
        assertTrue(plot.removeAnnotation(annotation));
        plot.clearAnnotations();
        assertEquals(0, plot.getAnnotations().size());
    }

    @Test
    public void testZoomAndCrosshair() {
        plot.setAnchorValue(10.0);
        assertEquals(10.0, plot.getAnchorValue(), 0.001);

        plot.zoom(0.5); // percent > 0.0 branch
        plot.zoom(0.0); // percent <= 0.0 (auto range) branch

        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());

        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());

        plot.setRangeCrosshairValue(5.0);
        assertEquals(5.0, plot.getRangeCrosshairValue(), 0.001);

        BasicStroke stroke = new BasicStroke(2.0f);
        plot.setRangeCrosshairStroke(stroke);
        assertEquals(stroke, plot.getRangeCrosshairStroke());

        plot.setRangeCrosshairPaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getRangeCrosshairPaint());
    }

    @Test
    public void testGetDataRangeAndCategories() {
        Range range = plot.getDataRange(rangeAxis);
        assertNotNull(range);

        List categories = plot.getCategories();
        assertEquals(1, categories.size());

        List axisCategories = plot.getCategoriesForAxis(domainAxis);
        assertEquals(1, axisCategories.size());
    }

    @Test
    public void testEqualsAndClone() throws CloneNotSupportedException {
        CategoryPlot plot2 = (CategoryPlot) plot.clone();
        assertTrue(plot.equals(plot2));
        assertTrue(plot.equals(plot));
        assertFalse(plot.equals(null));
        assertFalse(plot.equals("NotAPlot"));

        plot2.setWeight(99);
        assertFalse(plot.equals(plot2));
    }
}
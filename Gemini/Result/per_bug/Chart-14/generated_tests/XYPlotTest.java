package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.List;

import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultXYDataset;
import org.junit.Test;

public class XYPlotTest {

    @Test
    public void testConstructorAndDefaults() {
        XYPlot plot = new XYPlot();
        assertNotNull(plot.getOrientation());
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertEquals(1, plot.getWeight());
        assertNotNull(plot.getAxisOffset());
        assertTrue(plot.isDomainGridlinesVisible());
        assertTrue(plot.isRangeGridlinesVisible());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(null);
    }

    @Test
    public void testSetOrientationSameAndDifferent() {
        XYPlot plot = new XYPlot();
        plot.setOrientation(PlotOrientation.VERTICAL); // same
        plot.setOrientation(PlotOrientation.HORIZONTAL); // different
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisOffsetNull() {
        XYPlot plot = new XYPlot();
        plot.setAxisOffset(null);
    }

    @Test
    public void testSetAxisOffsetValid() {
        XYPlot plot = new XYPlot();
        RectangleInsets insets = new RectangleInsets(1.0, 2.0, 3.0, 4.0);
        plot.setAxisOffset(insets);
        assertEquals(insets, plot.getAxisOffset());
    }

    @Test
    public void testGetDomainAxisWithParent() {
        XYPlot parent = new XYPlot();
        NumberAxis axis = new NumberAxis("Domain");
        parent.setDomainAxis(0, axis);

        XYPlot child = new XYPlot();
        child.setParent(parent);

        // Child doesn't have axis at index 1, but parent does not either
        assertNull(child.getDomainAxis(1));
        
        // Child queries parent for index 0 since its own is null
        assertNotNull(child.getDomainAxis(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaintInvalidIndexLow() {
        XYPlot plot = new XYPlot();
        plot.getQuadrantPaint(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetQuadrantPaintInvalidIndexHigh() {
        XYPlot plot = new XYPlot();
        plot.getQuadrantPaint(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetQuadrantPaintInvalidIndex() {
        XYPlot plot = new XYPlot();
        plot.setQuadrantPaint(5, Color.RED);
    }

    @Test
    public void testQuadrantPaintValidBoundaries() {
        XYPlot plot = new XYPlot();
        plot.setQuadrantPaint(0, Color.RED);
        plot.setQuadrantPaint(3, Color.BLUE);
        assertEquals(Color.RED, plot.getQuadrantPaint(0));
        assertEquals(Color.BLUE, plot.getQuadrantPaint(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlineStrokeNull() {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDomainGridlinePaintNull() {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlinePaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlineStrokeNull() {
        XYPlot plot = new XYPlot();
        plot.setRangeGridlineStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRangeGridlinePaintNull() {
        XYPlot plot = new XYPlot();
        plot.setRangeGridlinePaint(null);
    }

    @Test
    public void testGetDataRange() {
        NumberAxis domainAxis = new NumberAxis("X");
        NumberAxis rangeAxis = new NumberAxis("Y");
        DefaultXYDataset dataset = new DefaultXYDataset();
        
        XYPlot plot = new XYPlot(dataset, domainAxis, rangeAxis, new StandardXYItemRenderer());
        Range r = plot.getDataRange(domainAxis);
        assertNull(r); // empty dataset should yield null range
    }

    @Test
    public void testClonePlot() throws CloneNotSupportedException {
        XYPlot plot = new XYPlot();
        plot.setDomainGridlinesVisible(false);
        XYPlot clone = (XYPlot) plot.clone();
        assertNotNull(clone);
        assertEquals(plot.isDomainGridlinesVisible(), clone.isDomainGridlinesVisible());
    }

    @Test
    public void testAnnotations() {
        XYPlot plot = new XYPlot();
        assertTrue(plot.getAnnotations().isEmpty());
    }
}
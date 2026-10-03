package org.jfree.chart.axis;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.EventListener;

import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.junit.Before;
import org.junit.Test;

/**
 * Comprehensive JUnit 4 test class for Axis (Defects4J Chart-26).
 */
public class AxisTest {

    // Concrete subclass of Axis for testing abstract methods
    private static class ConcreteAxis extends Axis {
        private static final long serialVersionUID = 1L;

        public ConcreteAxis(String label) {
            super(label);
        }

        @Override
        public void configure() {
            // No-op for testing
        }

        @Override
        public AxisSpace reserveSpace(Graphics2D g2, Plot plot, 
                                       java.awt.geom.Rectangle2D plotArea, 
                                       RectangleEdge edge, 
                                       AxisSpace space) {
            if (space == null) {
                space = new AxisSpace();
            }
            return space;
        }

        @Override
        public AxisState draw(Graphics2D g2, double cursor, 
                              java.awt.geom.Rectangle2D plotArea, 
                              java.awt.geom.Rectangle2D dataArea, 
                              RectangleEdge edge, 
                              PlotRenderingInfo plotState) {
            return new AxisState(cursor);
        }

        @Override
        public java.util.List refreshTicks(Graphics2D g2, AxisState state, 
                                           java.awt.geom.Rectangle2D dataArea, 
                                           RectangleEdge edge) {
            return new java.util.ArrayList();
        }
    }

    // Test listener to capture AxisChangeEvent
    private static class TestAxisChangeListener implements AxisChangeListener {
        private boolean changed = false;

        @Override
        public void axisChanged(AxisChangeEvent event) {
            this.changed = true;
        }

        public boolean isChanged() {
            return changed;
        }
    }

    private ConcreteAxis axis;

    @Before
    public void setUp() {
        axis = new ConcreteAxis("Test Axis");
    }

    @Test
    public void testConstructorAndDefaults() {
        assertNotNull(axis.getLabel());
        assertEquals("Test Axis", axis.getLabel());
        assertTrue(axis.isVisible());
        assertNotNull(axis.getLabelFont());
        assertNotNull(axis.getLabelPaint());
        assertNotNull(axis.getLabelInsets());
        assertEquals(0.0, axis.getLabelAngle(), 0.001);
        assertNull(axis.getLabelToolTip());
        assertNull(axis.getLabelURL());
        assertTrue(axis.isAxisLineVisible());
        assertNotNull(axis.getAxisLinePaint());
        assertNotNull(axis.getAxisLineStroke());
        assertTrue(axis.isTickLabelsVisible());
        assertNotNull(axis.getTickLabelFont());
        assertNotNull(axis.getTickLabelPaint());
        assertNotNull(axis.getTickLabelInsets());
        assertTrue(axis.isTickMarksVisible());
        assertNotNull(axis.getTickMarkStroke());
        assertNotNull(axis.getTickMarkPaint());
        assertEquals(0.0f, axis.getTickMarkInsideLength(), 0.001f);
        assertEquals(2.0f, axis.getTickMarkOutsideLength(), 0.001f);
        assertNull(axis.getPlot());
        assertEquals(0.0, axis.getFixedDimension(), 0.001);
    }

    @Test
    public void testSetVisible() {
        TestAxisChangeListener listener = new TestAxisChangeListener();
        axis.addChangeListener(listener);

        // Setting to same value should not trigger event
        axis.setVisible(true);
        assertFalse(listener.isChanged());

        // Setting to different value should trigger event
        axis.setVisible(false);
        assertFalse(axis.isVisible());
        assertTrue(listener.isChanged());
    }

    @Test
    public void testSetLabelBranches() {
        TestAxisChangeListener listener = new TestAxisChangeListener();
        axis.addChangeListener(listener);

        // 1. existing != null, equals(label) -> same label, no change
        axis.setLabel("Test Axis");
        assertFalse(listener.isChanged());

        // 2. existing != null, different label -> changes
        axis.setLabel("New Label");
        assertEquals("New Label", axis.getLabel());
        assertTrue(listener.isChanged());

        // Reset axis with null label
        ConcreteAxis nullLabelAxis = new ConcreteAxis(null);
        TestAxisChangeListener nullListener = new TestAxisChangeListener();
        nullLabelAxis.addChangeListener(nullListener);

        // 3. existing == null, label == null -> no change
        nullLabelAxis.setLabel(null);
        assertFalse(nullListener.isChanged());

        // 4. existing == null, label != null -> changes
        nullLabelAxis.setLabel("Assigned Label");
        assertEquals("Assigned Label", nullLabelAxis.getLabel());
        assertTrue(nullListener.isChanged());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelFontNull() {
        axis.setLabelFont(null);
    }

    @Test
    public void testSetLabelFontValid() {
        Font newFont = new Font("Dialog", Font.BOLD, 14);
        axis.setLabelFont(newFont);
        assertEquals(newFont, axis.getLabelFont());

        // Setting same font should do nothing
        axis.setLabelFont(newFont);
        assertEquals(newFont, axis.getLabelFont());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPaintNull() {
        axis.setLabelPaint(null);
    }

    @Test
    public void testSetLabelPaintValid() {
        axis.setLabelPaint(Color.RED);
        assertEquals(Color.RED, axis.getLabelPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelInsetsNull() {
        axis.setLabelInsets(null);
    }

    @Test
    public void testSetLabelInsetsValid() {
        RectangleInsets insets = new RectangleInsets(1, 1, 1, 1);
        axis.setLabelInsets(insets);
        assertEquals(insets, axis.getLabelInsets());

        // Setting same insets
        axis.setLabelInsets(insets);
        assertEquals(insets, axis.getLabelInsets());
    }

    @Test
    public void testLabelAngleAndTooltipsAndURLs() {
        axis.setLabelAngle(1.57);
        assertEquals(1.57, axis.getLabelAngle(), 0.001);

        axis.set2ToolTip:
        axis.setLabelToolTip("Tooltip");
        assertEquals("Tooltip", axis.getLabelToolTip());

        axis.setLabelURL("http://example.com");
        assertEquals("http://example.com", axis.getLabelURL());
    }
    
    // Helper method wrapper for compilation since labelToolTip typo avoided
    public void set2ToolTip() {}

    @Test
    public void testAxisLineProperties() {
        axis.setAxisLineVisible(false);
        assertFalse(axis.isAxisLineVisible());

        axis.setAxisLinePaint(Color.BLUE);
        assertEquals(Color.BLUE, axis.getAxisLinePaint());

        axis.setAxisLineStroke(new BasicStroke(2.0f));
        assertNotNull(axis.getAxisLineStroke());

        boolean exceptionThrown = false;
        try {
            axis.setAxisLinePaint(null);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);

        exceptionThrown = false;
        try {
            axis.setAxisLineStroke(null);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    public void testTickLabelsProperties() {
        axis.setTickLabelsVisible(false);
        assertFalse(axis.isTickLabelsVisible());
        
        // Toggle back to cover branch
        axis.setTickLabelsVisible(false);

        Font tickFont = new Font("Monospaced", Font.PLAIN, 8);
        axis.setTickLabelFont(tickFont);
        assertEquals(tickFont, axis.getTickLabelFont());

        boolean ex = false;
        try {
            axis.setTickLabelFont(null);
        } catch (IllegalArgumentException e) {
            ex = true;
        }
        assertTrue(ex);

        axis.setTickLabelPaint(Color.GREEN);
        assertEquals(Color.GREEN, axis.getTickLabelPaint());

        ex = false;
        try {
            axis.setTickLabelPaint(null);
        } catch (IllegalArgumentException e) {
            ex = true;
        }
        assertTrue(ex);

        RectangleInsets tickInsets = new RectangleInsets(5, 5, 5, 5);
        axis.setTickLabelInsets(tickInsets);
        assertEquals(tickInsets, axis.getTickLabelInsets());

        ex = false;
        try {
            axis.setTickLabelInsets(null);
        } catch (IllegalArgumentException e) {
            ex = true;
        }
        assertTrue(ex);
    }

    @Test
    public void testTickMarksProperties() {
        axis.setTickMarksVisible(false);
        assertFalse(axis.isTickMarksVisible());
        axis.setTickMarksVisible(false); // same branch

        axis.setTickMarkInsideLength(3.0f);
        assertEquals(3.0f, axis.getTickMarkInsideLength(), 0.001f);

        axis.setTickMarkOutsideLength(4.0f);
        assertEquals(4.0f, axis.getTickMarkOutsideLength(), 0.001f);

        axis.setTickMarkPaint(Color.ORANGE);
        assertEquals(Color.ORANGE, axis.getTickMarkPaint());
        
        boolean ex = false;
        try {
            axis.setTickMarkPaint(null);
        } catch (IllegalArgumentException e) {
            ex = true;
        }
        assertTrue(ex);

        BasicStroke stroke = new BasicStroke(1.5f);
        axis.setTickMarkStroke(stroke);
        assertEquals(stroke, axis.getTickMarkStroke());
        
        // same stroke branch
        axis.setTickMarkStroke(stroke);

        ex = false;
        try {
            axis.setTickMarkStroke(null);
        } catch (IllegalArgumentException e) {
            ex = true;
        }
        assertTrue(ex);
    }

    @Test
    public void testPlotAndDimensionAndListeners() {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() { return "TestPlot"; }
        };
        axis.setPlot(plot);
        assertEquals(plot, axis.getPlot());

        axis.setFixedDimension(50.0);
        assertEquals(50.0, axis.getFixedDimension(), 0.001);

        AxisChangeListener listener = new TestAxisChangeListener();
        axis.addChangeListener(listener);
        assertTrue(axis.hasListener(listener));

        axis.removeChangeListener(listener);
        assertFalse(axis.hasListener(listener));
    }

    @Test
    public void testEqualsAndClone() throws Exception {
        ConcreteAxis a1 = new ConcreteAxis("Axis");
        ConcreteAxis a2 = new ConcreteAxis("Axis");

        assertTrue(a1.equals(a1));
        assertTrue(a1.equals(a2));
        assertFalse(a1.equals(null));
        assertFalse(a1.equals("Not an Axis"));

        // Test inequality branches in equals()
        a2.setVisible(false);
        assertFalse(a1.equals(a2));
        a2.setVisible(true);

        a2.setLabel("Different");
        assertFalse(a1.equals(a2));
        a2.setLabel("Axis");

        a2.setLabelFont(new Font("Serif", Font.PLAIN, 12));
        assertFalse(a1.equals(a2));
        a2.setLabelFont(a1.getLabelFont());

        a2.setLabelPaint(Color.WHITE);
        assertFalse(a1.equals(a2));
        a2.setLabelPaint(a1.getLabelPaint());

        a2.setLabelInsets(new RectangleInsets(10, 10, 10, 10));
        assertFalse(a1.equals(a2));
        a2.setLabelInsets(a1.getLabelInsets());

        a2.setLabelAngle(0.5);
        assertFalse(a1.equals(a2));
        a2.setLabelAngle(a1.getLabelAngle());

        a2.setLabelToolTip("Tip");
        assertFalse(a1.equals(a2));
        a2.setLabelToolTip(a1.getLabelToolTip());

        a2.setLabelURL("URL");
        assertFalse(a1.equals(a2));
        a2.setLabelURL(a1.getLabelURL());

        a2.setAxisLineVisible(false);
        assertFalse(a1.equals(a2));
        a2.setAxisLineVisible(a1.isAxisLineVisible());

        a2.setAxisLineStroke(new BasicStroke(5f));
        assertFalse(a1.equals(a2));
        a2.setAxisLineStroke(a1.getAxisLineStroke());

        a2.setAxisLinePaint(Color.BLACK);
        assertFalse(a1.equals(a2));
        a2.setAxisLinePaint(a1.getAxisLinePaint());

        a2.setTickLabelsVisible(false);
        assertFalse(a1.equals(a2));
        a2.setTickLabelsVisible(a1.isTickLabelsVisible());

        a2.setTickLabelFont(new Font("Serif", Font.PLAIN, 10));
        assertFalse(a1.equals(a2));
        a2.setTickLabelFont(a1.getTickLabelFont());

        a2.setTickLabelPaint(Color.CYAN);
        assertFalse(a1.equals(a2));
        a2.setTickLabelPaint(a1.getTickLabelPaint());

        a2.setTickLabelInsets(new RectangleInsets(1,1,1,1));
        assertFalse(a1.equals(a2));
        a2.setTickLabelInsets(a1.getTickLabelInsets());

        a2.setTickMarksVisible(false);
        assertFalse(a1.equals(a2));
        a2.setTickMarksVisible(a1.isTickMarksVisible());

        a2.setTickMarkInsideLength(5f);
        assertFalse(a1.equals(a2));
        a2.setTickMarkInsideLength(a1.getTickMarkInsideLength());

        a2.setTickMarkOutsideLength(5f);
        assertFalse(a1.equals(a2));
        a2.setTickMarkOutsideLength(a1.getTickMarkOutsideLength());

        a2.setTickMarkPaint(Color.MAGENTA);
        assertFalse(a1.equals(a2));
        a2.setTickMarkPaint(a1.getTickMarkPaint());

        a2.setTickMarkStroke(new BasicStroke(3f));
        assertFalse(a1.equals(a2));
        a2.setTickMarkStroke(a1.getTickMarkStroke());

        a2.setFixedDimension(100.0);
        assertFalse(a1.equals(a2));
        a2.setFixedDimension(a1.getFixedDimension());

        assertTrue(a1.equals(a2));

        // Test Clone
        ConcreteAxis clone = (ConcreteAxis) a1.clone();
        assertNotNull(clone);
        assertTrue(a1.equals(clone));
    }

    @Test
    public void testDrawLabelAndEnclosureEdges() {
        BufferedImage img = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();

        java.awt.geom.Rectangle2D plotArea = new java.awt.geom.Rectangle2D.Double(0, 0, 400, 400);
        java.awt.geom.Rectangle2D dataArea = new java.awt.geom.Rectangle2D.Double(50, 50, 300, 300);
        AxisState state = new AxisState(350.0);

        // Test TOP edge
        axis.drawLabel("Top Label", g2, plotArea, dataArea, RectangleEdge.TOP, state, null);

        // Test BOTTOM edge
        axis.drawLabel("Bottom Label", g2, plotArea, dataArea, RectangleEdge.BOTTOM, state, null);

        // Test LEFT edge
        axis.drawLabel("Left Label", g2, plotArea, dataArea, RectangleEdge.LEFT, state, null);

        // Test RIGHT edge
        axis.drawLabel("Right Label", g2, plotArea, dataArea, RectangleEdge.RIGHT, state, null);

        // Test null label and empty label early return branches
        AxisState stateNull = axis.drawLabel(null, g2, plotArea, dataArea, RectangleEdge.TOP, state, null);
        assertNotNull(stateNull);

        AxisState stateEmpty = axis.drawLabel("", g2, plotArea, dataArea, RectangleEdge.TOP, state, null);
        assertNotNull(stateEmpty);

        // Test state == null exception branch
        boolean ex = false;
        try {
            axis.drawLabel("Label", g2, plotArea, dataArea, RectangleEdge.TOP, null, null);
        } catch (IllegalArgumentException e) {
            ex = true;
        }
        assertTrue(ex);

        // Test getLabelEnclosure with null/empty and all edges
        axis.setLabel(null);
        assertNotNull(axis.getLabelEnclosure(g2, RectangleEdge.TOP));

        axis.setLabel("");
        assertNotNull(axis.getLabelEnclosure(g2, RectangleEdge.TOP));

        axis.setLabel("Enclosure");
        assertNotNull(axis.getLabelEnclosure(g2, RectangleEdge.TOP));
        assertNotNull(axis.getLabelEnclosure(g2, RectangleEdge.LEFT));
        assertNotNull(axis.getLabelEnclosure(g2, RectangleEdge.RIGHT));
        assertNotNull(axis.getLabelEnclosure(g2, RectangleEdge.BOTTOM));
        
        g2.dispose();
    }

    @Test
    public void testDrawAxisLine() {
        BufferedImage img = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        java.awt.geom.Rectangle2D dataArea = new java.awt.geom.Rectangle2D.Double(50, 50, 300, 300);

        axis.drawAxisLine(g2, 50.0, dataArea, RectangleEdge.TOP);
        axis.drawAxisLine(g2, 350.0, dataArea, RectangleEdge.BOTTOM);
        axis.drawAxisLine(g2, 50.0, dataArea, RectangleEdge.LEFT);
        axis.drawAxisLine(g2, 350.0, dataArea, RectangleEdge.RIGHT);

        g2.dispose();
    }
}
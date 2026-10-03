package org.jfree.chart.renderer.category;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Before;
import org.junit.Test;

public class MinMaxCategoryRendererTest {

    private MinMaxCategoryRenderer renderer;
    private DefaultCategoryDataset dataset;
    private CategoryPlot plot;
    private CategoryItemRendererState state;
    private Graphics2D g2;
    private Rectangle2D dataArea;
    private CategoryAxis domainAxis;
    private NumberAxis rangeAxis;

    @Before
    public void setUp() {
        renderer = new MinMaxCategoryRenderer();
        dataset = new DefaultCategoryDataset();
        plot = new CategoryPlot();
        state = new CategoryItemRendererState(new StandardEntityCollection());
        
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        g2 = image.createGraphics();
        dataArea = new Rectangle2D.Double(0, 0, 400, 300);
        
        domainAxis = new CategoryAxis("Category");
        rangeAxis = new NumberAxis("Value");
    }

    @Test
    public void testDefaultConstructorAndGetters() {
        assertFalse(renderer.isDrawLines());
        assertNotNull(renderer.getGroupPaint());
        assertNotNull(renderer.getGroupStroke());
        assertNotNull(renderer.getObjectIcon());
        assertNotNull(renderer.getMaxIcon());
        assertNotNull(renderer.getMinIcon());
    }

    @Test
    public void testSetDrawLines() {
        renderer.setDrawLines(true);
        assertTrue(renderer.isDrawLines());
        renderer.setDrawLines(false);
        assertFalse(renderer.isDrawLines());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupPaintNull() {
        renderer.setGroupPaint(null);
    }

    @Test
    public void testSetGroupPaintValid() {
        renderer.setGroupPaint(Color.red);
        assertEquals(Color.red, renderer.getGroupPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupStrokeNull() {
        renderer.setGroupStroke(null);
    }

    @Test
    public void testSetGroupStrokeValid() {
        BasicStroke stroke = new BasicStroke(2.0f);
        renderer.setGroupStroke(stroke);
        assertEquals(stroke, renderer.getGroupStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObjectIconNull() {
        renderer.setObjectIcon(null);
    }

    @Test
    public void testSetObjectIconValid() {
        ImageIcon icon = new ImageIcon();
        renderer.setObjectIcon(icon);
        assertEquals(icon, renderer.getObjectIcon());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxIconNull() {
        renderer.setMaxIcon(null);
    }

    @Test
    public void testSetMaxIconValid() {
        ImageIcon icon = new ImageIcon();
        renderer.setMaxIcon(icon);
        assertEquals(icon, renderer.getMaxIcon());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMinIconNull() {
        renderer.setMinIcon(null);
    }

    @Test
    public void testSetMinIconValid() {
        ImageIcon icon = new ImageIcon();
        renderer.setMinIcon(icon);
        assertEquals(icon, renderer.getMinIcon());
    }

    @Test
    public void testDrawItemNullValue() {
        dataset.addValue(null, "Row 1", "Col 1");
        // Should return cleanly without exception
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
    }

    @Test
    public void testDrawItemVerticalOrientationMultipleRows() {
        plot.setOrientation(PlotOrientation.VERTICAL);
        
        dataset.addValue(10.0, "Row 1", "Cat 1");
        dataset.addValue(20.0, "Row 2", "Cat 1");
        
        // Draw row 0, col 0 (First item in category, resets min/max)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        
        // Draw row 1, col 0 (Second item, updates max, triggers row == rowCount - 1 block)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 1, 0, 0);
    }

    @Test
    public void testDrawItemHorizontalOrientationWithPlotLines() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.setDrawLines(true);
        
        dataset.addValue(10.0, "Row 1", "Cat 1");
        dataset.addValue(15.0, "Row 1", "Cat 2");
        
        // Cat 1, Col 0
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        
        // Cat 2, Col 1 (Triggers plotLines branch since column != 0)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0);
    }

    @Test
    public void testDrawItemWithNullPreviousValueForLines() {
        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.setDrawLines(true);
        
        dataset.addValue(10.0, "Row 1", "Cat 1");
        dataset.addValue(null, "Row 1", "Cat 2");
        
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 0, 0);
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, 0, 1, 0); // previousValue is null branch
    }
}
package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.util.Rotation;
import org.jfree.data.general.DefaultPieDataset;
import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for PiePlot (Defects4J Chart-15b).
 * Written by Senior Java Test Automation Engineer.
 */
public class PiePlotTest {

    @Test
    public void testConstructorAndDefaultValues() {
        PiePlot plot = new PiePlot();
        assertNull(plot.getDataset());
        assertTrue(plot.isCircular());
        assertEquals(Rotation.CLOCKWISE, plot.getDirection());
        assertEquals(PiePlot.DEFAULT_INTERIOR_GAP, plot.getInteriorGap(), 0.0001);
        assertEquals(PiePlot.DEFAULT_START_ANGLE, plot.getStartAngle(), 0.0001);
        assertFalse(plot.getIgnoreNullValues());
        assertFalse(plot.getIgnoreZeroValues());
        assertEquals("Pie_Plot", plot.getPlotType());
    }

    @Test
    public void testSetDatasetWithNullAndNonNull() {
        PiePlot plot = new PiePlot();
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Section A", 10.0);

        // Set non-null dataset (Triggers dataset != null branch)
        plot.setDataset(dataset);
        assertEquals(dataset, plot.getDataset());

        // Replace with another non-null dataset (Triggers existing != null cleanup branch)
        DefaultPieDataset dataset2 = new DefaultPieDataset();
        dataset2.setValue("Section B", 20.0);
        plot.setDataset(dataset2);
        assertEquals(dataset2, plot.getDataset());

        // Set null dataset (Triggers dataset == null branch)
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDirectionNullThrowsException() {
        PiePlot plot = new PiePlot();
        plot.setDirection(null);
    }

    @Test
    public void testSetDirectionValid() {
        PiePlot plot = new PiePlot();
        plot.setDirection(Rotation.ANTICLOCKWISE);
        assertEquals(Rotation.ANTICLOCKWISE, plot.getDirection());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGapNegativeBoundary() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(-0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGapExceedsMaxBoundary() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(0.41);
    }

    @Test
    public void testSetInteriorGapValid() {
        PiePlot plot = new PiePlot();
        plot.setInteriorGap(0.15);
        assertEquals(0.15, plot.getInteriorGap(), 0.0001);
    }

    @Test
    public void testIgnoreNullAndZeroValuesHandling() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", 0.0);
        dataset.setValue("C", null);

        PiePlot plot = new PiePlot(dataset);
        plot.setIgnoreNullValues(true);
        plot.setIgnoreZeroValues(true);

        assertTrue(plot.getIgnoreNullValues());
        assertTrue(plot.getIgnoreZeroValues());

        LegendItemCollection items = plot.getLegendItems();
        // Should only include section A when ignoring null and zero values
        assertEquals(1, items.getItemCount());
        assertEquals("A", items.get(0.0 != 0.0 ? 0 : 0).getLabel());
    }

    @Test
    public void testDrawWithNullDataset() {
        PiePlot plot = new PiePlot(null);
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);

        // Should successfully execute draw branch for empty/null dataset (drawNoDataMessage)
        plot.draw(g2, area, null, null, null);
        assertNotNull(g2);
    }

    @Test
    public void testDrawWithValidDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Apple", 50.0);
        dataset.setValue("Banana", 30.0);

        PiePlot plot = new PiePlot(dataset);
        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);

        // Triggers drawPie and standard label generation branches
        plot.draw(g2, area, null, null, null);
        assertNotNull(dataset);
    }

    @Test
    public void testEqualsAndClone() throws CloneNotSupportedException {
        PiePlot plot1 = new PiePlot();
        PiePlot plot2 = new PiePlot();

        assertEquals(plot1, plot2);
        assertEquals(plot1.hashCode(), plot2.hashCode());

        plot1.setInteriorGap(0.12);
        assertFalse(plot1.equals(plot2));

        // Test cloning
        PiePlot clonePlot = (PiePlot) plot1.clone();
        assertEquals(plot1, clonePlot);
    }
}
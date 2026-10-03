package org.jfree.chart.renderer.category;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.Before;
import org.junit.Test;

public class StatisticalBarRendererTest {

    private StatisticalBarRenderer renderer;
    private DefaultStatisticalCategoryDataset dataset;
    private CategoryPlot plot;
    private CategoryItemRendererState state;
    private Rectangle2D dataArea;
    private Graphics2D g2;

    @Before
    public void setUp() {
        renderer = new StatisticalBarRenderer();
        dataset = new DefaultStatisticalCategoryDataset();
        dataset.add(10.0, 2.0, "Row 1", "Column 1");
        dataset.add(5.0, 1.0, "Row 2", "Column 1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        g2 = image.createGraphics();
        dataArea = new Rectangle2D.Double(0, 0, 400, 300);
        state = renderer.initialise(g2, dataArea, plot, null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawItemInvalidDatasetType() {
        DefaultCategoryDataset invalidDataset = new DefaultCategoryDataset();
        invalidDataset.addValue(1.0, "R1", "C1");
        plot.setDataset(invalidDataset);
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), invalidDataset, 0, 0, 0);
    }

    @Test
    public void testHorizontalOrientationSingleSeries() {
        DefaultStatisticalCategoryDataset singleDataset = new DefaultStatisticalCategoryDataset();
        singleDataset.add(8.0, 1.5, "Row 1", "Column 1");
        plot.setDataset(singleDataset);
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        
        // ทดสอบ seriesCount <= 1 branch
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), singleDataset, 0, 0, 0);
        assertNotNull(renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testVerticalOrientationMultipleSeriesWithLabelsAndEntities() {
        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.setDrawBarOutline(true);
        renderer.setItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setItemLabelsVisible(true);
        state.setEntityCollection(new org.jfree.chart.entity.StandardEntityCollection());

        // seriesCount > 1 branch
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), dataset, 0, 0, 0);
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), dataset, 1, 0, 0);
        
        assertNotNull(state.getEntityCollection());
        assertEquals(2, state.getEntityCollection().getEntityCount());
    }

    @Test
    public void testClipCasesHorizontalUclipNegative() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.setUpperClip(-5.0); // uclip <= 0.0
        
        // Case: value >= uclip (bar not visible)
        dataset.setValue(0.0, 2.0, "Row 1", "Column 1");
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), dataset, 0, 0, 0);

        // Case: value <= lclip
        renderer.setLowerClip(-2.0);
        dataset.setValue(-10.0, 1.0, "Row 1", "Column 1");
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), dataset, 0, 0, 0);
    }

    @Test
    public void testClipCasesVerticalLclipNegativeOrZero() {
        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.setLowerClip(0.0); // lclip <= 0.0
        renderer.setUpperClip(20.0);

        // Case: value >= uclip
        dataset.setValue(25.0, 2.0, "Row 1", "Column 1");
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), dataset, 0, 0, 0);

        // Case: value <= lclip
        dataset.setValue(-5.0, 1.0, "Row 1", "Column 1");
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), dataset, 0, 0, 0);
    }

    @Test
    public void testClipCasesBothPositive() {
        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.setLowerClip(2.0);
        renderer.setUpperClip(15.0);

        // Case: value <= lclip (bar not visible)
        dataset.setValue(1.0, 0.5, "Row 1", "Column 1");
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), dataset, 0, 0, 0);

        // Case: value >= uclip
        dataset.setValue(20.0, 1.0, "Row 1", "Column 1");
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), dataset, 0, 0, 0);
    }

    @Test
    public void testNullErrorIndicatorStyles() {
        renderer.setErrorIndicatorPaint(null);
        renderer.setErrorIndicatorStroke(null);
        
        assertNull(renderer.getErrorIndicatorPaint());
        assertNull(renderer.getErrorIndicatorStroke());

        // Triggers fallback to outline paint/stroke in drawVerticalItem/drawHorizontalItem
        renderer.drawItem(g2, state, dataArea, plot, plot.getDomainAxis(), 
                plot.getRangeAxis(), dataset, 0, 0, 0);
    }

    @Test
    public void testGettersAndSetters() {
        renderer.setErrorIndicatorPaint(Color.RED);
        assertEquals(Color.RED, renderer.getErrorIndicatorPaint());

        BasicStroke stroke = new BasicStroke(2.0f);
        renderer.setErrorIndicatorStroke(stroke);
        assertEquals(stroke, renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testEqualsAndClone() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();

        assertTrue(r1.equals(r2));
        assertFalse(r1.equals(null));
        assertFalse(r1.equals("Some String"));

        r1.setErrorIndicatorPaint(Color.BLUE);
        assertFalse(r1.equals(r2));

        r2.setErrorIndicatorPaint(Color.BLUE);
        assertTrue(r1.equals(r2));
    }

    @Test
    public void testSerialization() throws Exception {
        renderer.setErrorIndicatorPaint(Color.GREEN);
        renderer.setErrorIndicatorStroke(new BasicStroke(1.5f));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(renderer);
        oos.flush();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        StatisticalBarRenderer deserialized = (StatisticalBarRenderer) ois.readObject();

        assertEquals(renderer.getErrorIndicatorStroke(), deserialized.getErrorIndicatorStroke());
        assertEquals(renderer, deserialized);
    }
}
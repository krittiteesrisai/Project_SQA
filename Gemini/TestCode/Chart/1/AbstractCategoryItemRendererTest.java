import static org.junit.Assert.*;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.category.AbstractCategoryItemRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Before;
import org.junit.Test;

/**
 * Concrete subclass of AbstractCategoryItemRenderer for testing abstract methods and base functionality.
 */
class ConcreteCategoryItemRenderer extends AbstractCategoryItemRenderer {
    private static final long serialVersionUID = 1L;
    // ใช้คลาสลูกแบบ Concretized เพื่อทดสอบ Abstract Class
}

public class AbstractCategoryItemRendererTest {

    private ConcreteCategoryItemRenderer renderer;
    private DefaultCategoryDataset dataset;
    private CategoryPlot plot;

    @Before
    public void setUp() {
        renderer = new ConcreteCategoryItemRenderer();
        dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        dataset.addValue(2.0, "Row2", "Col2");
        plot = new CategoryPlot();
    }

    @Test
    public void testGetPassCount() {
        assertEquals(1, renderer.getPassCount());
    }

    @Test
    public void testPlotAssignment() {
        assertNull(renderer.getPlot());
        renderer.setPlot(plot);
        assertEquals(plot, renderer.getPlot());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPlotNullThrowsException() {
        renderer.setPlot(null);
    }

    @Test
    public void testItemLabelAndToolTipAndURLGenerators() {
        // Test Item Label Generator
        assertNull(renderer.getItemLabelGenerator(0, 0, false));
        assertNull(renderer.getSeriesItemLabelGenerator(0));

        // Test ToolTip Generator
        assertNull(renderer.getToolTipGenerator(0, 0, false));
        assertNull(renderer.getBaseToolTipGenerator());

        // Test URL Generator
        assertNull(renderer.getURLGenerator(0, 0, false));
        assertNull(renderer.getBaseURLGenerator());
    }

    @Test
    public void testInitialiseWithNullDataset() {
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, null, null);
        assertNotNull(state);
        assertEquals(0, renderer.getRowCount());
        assertEquals(0, renderer.getColumnCount());
    }

    @Test
    public void testInitialiseWithValidDataset() {
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);

        CategoryItemRendererState state = renderer.initialise(g2, dataArea, plot, dataset, null);
        assertNotNull(state);
        assertEquals(2, renderer.getRowCount());
        assertEquals(2, renderer.getColumnCount());
    }

    @Test
    public void testFindRangeBounds() {
        assertNull(renderer.findRangeBounds(null));
        Range range = renderer.findRangeBounds(dataset);
        assertNotNull(range);
        assertEquals(1.0, range.getLowerBound(), 0.001);
        assertEquals(2.0, range.getUpperBound(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawDomainLineNullPaint() {
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        renderer.drawDomainLine(g2, plot, new Rectangle2D.Double(0, 0, 100, 100), 10.0, null, null);
    }

    @Test
    public void testDrawDomainLineOrientations() {
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        Paint paint = java.awt.Color.BLACK;
        Stroke stroke = new java.awt.BasicStroke(1.0f);

        // Horizontal orientation
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        renderer.drawDomainLine(g2, plot, area, 50.0, paint, stroke);

        // Vertical orientation
        plot.setOrientation(PlotOrientation.VERTICAL);
        renderer.drawDomainLine(g2, plot, area, 50.0, paint, stroke);
    }

    @Test
    public void testDrawRangeLineOutsideRange() {
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        ValueAxis axis = new org.jfree.chart.axis.NumberAxis();
        axis.setRange(0.0, 10.0);
        
        // Value 15.0 is outside range [0, 10], should return immediately without drawing
        renderer.drawRangeLine(g2, plot, axis, new Rectangle2D.Double(0, 0, 100, 100), 15.0, java.awt.Color.BLACK, new java.awt.BasicStroke(1.0f));
    }

    @Test
    public void testGetLegendItemsNullPlot() {
        // When plot is null, should return empty collection
        LegendItemCollection items = renderer.getLegendItems();
        assertNotNull(items);
        assertEquals(0, items.getItemCount());
    }

    @Test
    public void testGetLegendItemsAscendingAndDescending() {
        plot.setDataset(dataset);
        renderer.setPlot(plot);

        plot.setRowRenderingOrder(SortOrder.ASCENDING);
        LegendItemCollection itemsAsc = renderer.getLegendItems();
        assertNotNull(itemsAsc);

        plot.setRowRenderingOrder(SortOrder.DESCENDING);
        LegendItemCollection itemsDesc = renderer.getLegendItems();
        assertNotNull(itemsDesc);
    }

    @Test
    public void testAddAndRemoveAnnotations() {
        org.jfree.chart.annotations.CategoryTextAnnotation annotation = 
            new org.jfree.chart.annotations.CategoryTextAnnotation("Test", "Col1", 1.0);

        renderer.addAnnotation(annotation, Layer.FOREGROUND);
        renderer.addAnnotation(annotation, Layer.BACKGROUND);

        boolean removed = renderer.removeAnnotation(annotation);
        assertTrue(removed);

        renderer.addAnnotation(annotation, Layer.FOREGROUND);
        renderer.removeAnnotations();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullAnnotationThrowsException() {
        renderer.addAnnotation(null);
    }

    @Test
    public void testDrawDomainMarkerLineAndRect() {
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        plot.setDataset(dataset);
        renderer.setPlot(plot);

        CategoryMarker markerLine = new CategoryMarker("Col1");
        markerLine.setDrawAsLine(true);
        markerLine.setLabel("Marker Label");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        renderer.drawDomainMarker(g2, plot, domainAxis, markerLine, new Rectangle2D.Double(0, 0, 100, 100));

        CategoryMarker markerRect = new CategoryMarker("Col1");
        markerRect.setDrawAsLine(false);
        renderer.drawDomainMarker(g2, plot, domainAxis, markerRect, new Rectangle2D.Double(0, 0, 100, 100));
    }

    @Test
    public void testDrawRangeMarkerValueAndInterval() {
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
        ValueAxis rangeAxis = new org.jfree.chart.axis.NumberAxis();
        rangeAxis.setRange(0.0, 10.0);
        plot.setRangeAxis(rangeAxis);
        renderer.setPlot(plot);

        // ValueMarker inside range
        ValueMarker vMarker = new ValueMarker(5.0);
        vMarker.setLabel("Value Marker");
        renderer.drawRangeMarker(g2, plot, rangeAxis, vMarker, new Rectangle2D.Double(0, 0, 100, 100));

        // IntervalMarker inside range
        IntervalMarker iMarker = new IntervalMarker(2.0, 8.0);
        iMarker.setOutlinePaint(java.awt.Color.RED);
        iMarker.setOutlineStroke(new java.awt.BasicStroke(1.0f));
        renderer.drawRangeMarker(g2, plot, rangeAxis, iMarker, new Rectangle2D.Double(0, 0, 100, 100));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        ConcreteCategoryItemRenderer cloned = (ConcreteCategoryItemRenderer) renderer.clone();
        assertNotNull(cloned);
        assertNotSame(renderer, cloned);
    }
}
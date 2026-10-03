package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Test;

/**
 * ชุดทดสอบเชิงลึกสำหรับคลาส MultiplePiePlot (Defects4J Chart-12b)
 * เน้น Branch/Condition Coverage สูงสุด และดักจับ Edge Cases
 */
public class MultiplePiePlotTest {

    @Test
    public void testConstructorsAndDefaults() {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        assertNull(plot1.getDataset());
        assertNotNull(plot1.getPieChart());
        assertEquals(TableOrder.BY_COLUMN, plot1.getDataExtractOrder());
        assertEquals(0.0, plot1.getLimit(), 0.0001);
        assertEquals("Other", plot1.getAggregatedItemsKey());
        assertEquals(Color.lightGray, plot1.getAggregatedItemsPaint());
        assertEquals("Multiple Pie Plot", plot1.getPlotType());

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        MultiplePiePlot plot2 = new MultiplePiePlot(dataset);
        assertEquals(dataset, plot2.getDataset());
    }

    @Test
    public void testSetDataset() {
        MultiplePiePlot plot = new MultiplePiePlot();
        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
        dataset1.addValue(1.0, "Row1", "Col1");
        
        // เซ็ต dataset แรก (dataset != null)
        plot.setDataset(dataset1);
        assertEquals(dataset1, plot.getDataset());

        // เซ็ต dataset ตัวใหม่ ทับตัวเดิม (ทดสอบการ removeChangeListener ของอันเก่า)
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.addValue(2.0, "Row2", "Col2");
        plot.setDataset(dataset2);
        assertEquals(dataset2, plot.getDataset());

        // เซ็ตเป็น null (dataset == null)
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartNull() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setPieChart(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPieChartInvalidPlot() {
        MultiplePiePlot plot = new MultiplePiePlot();
        // สร้าง JFreeChart ที่ใช้ CategoryPlot แทนที่จะเป็น PiePlot
        JFreeChart invalidChart = new JFreeChart(new CategoryPlot());
        plot.setPieChart(invalidChart);
    }

    @Test
    public void testSetPieChartValid() {
        MultiplePiePlot plot = new MultiplePiePlot();
        PiePlot piePlot = new PiePlot();
        JFreeChart validChart = new JFreeChart(piePlot);
        plot.setPieChart(validChart);
        assertEquals(validChart, plot.getPieChart());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDataExtractOrderNull() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(null);
    }

    @Test
    public void testSetDataExtractOrderValid() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        assertEquals(TableOrder.BY_ROW, plot.getDataExtractOrder());
    }

    @Test
    public void testSetLimit() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setLimit(0.05);
        assertEquals(0.05, plot.getLimit(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsKeyNull() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey(null);
    }

    @Test
    public void testSetAggregatedItemsKeyValid() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsKey("Rest");
        assertEquals("Rest", plot.getAggregatedItemsKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAggregatedItemsPaintNull() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsPaint(null);
    }

    @Test
    public void testSetAggregatedItemsPaintValid() {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsPaint(Color.RED);
        assertEquals(Color.RED, plot.getAggregatedItemsPaint());
    }

    @Test
    public void testDrawEmptyOrNullDataset() {
        MultiplePiePlot plot = new MultiplePiePlot();
        BufferedImage image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        
        // Dataset เป็น null จะต้องเรียก drawNoDataMessage โดยไม่เกิด Exception
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDrawWithDataByColumnAndRow() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");
        dataset.addValue(30.0, "Row2", "Col1");
        dataset.addValue(40.0, "Row2", "Col2");

        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        plot.setLimit(0.1); // ทดสอบกิ่ง limit > 0.0

        BufferedImage image = new BufferedImage(200, 400, BufferedImage.TYPE_INT_ARGB); // ความสูงมากกว่าความกว้าง (สลับแถว/คอลัมน์)
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 400);
        ChartRenderingInfo info = new ChartRenderingInfo();

        // ทดสอบวาดแบบ BY_COLUMN พร้อม ChartRenderingInfo ไม่เป็น null
        plot.draw(g2, area, null, null, info);

        // ทดสอบเปลี่ยนเป็น BY_ROW และพื้นที่ความกว้างมากกว่าความสูง
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        Rectangle2D areaWide = new Rectangle2D.Double(0, 0, 500, 200);
        plot.draw(g2, areaWide, null, null, null);
    }

    @Test
    public void testGetLegendItems() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "Row1", "Col1");
        dataset.addValue(20.0, "Row1", "Col2");

        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        
        // ทดสอบ BY_COLUMN และ limit <= 0.0
        plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        plot.setLimit(0.0);
        LegendItemCollection items1 = plot.getLegendItems();
        assertNotNull(items1);

        // ทดสอบ BY_ROW และ limit > 0.0 (เพื่อให้เพิ่ม aggregated items ลงใน Legend)
        plot.setDataExtractOrder(TableOrder.BY_ROW);
        plot.setLimit(0.15);
        LegendItemCollection items2 = plot.getLegendItems();
        assertNotNull(items2);
        assertTrue(items2.getItemCount() > 0);
    }

    @Test
    public void testEqualsAndHashCodeEdgeCases() {
        MultiplePiePlot plot1 = new MultiplePiePlot();
        MultiplePiePlot plot2 = new MultiplePiePlot();

        // 1. obj == this
        assertTrue(plot1.equals(plot1));

        // 2. obj instanceof MultiplePiePlot (false)
        assertFalse(plot1.equals("Some String"));

        // 3. ปกติเท่ากัน
        assertTrue(plot1.equals(plot2));

        // 4. dataExtractOrder ต่างกัน
        plot2.setDataExtractOrder(TableOrder.BY_ROW);
        assertFalse(plot1.equals(plot2));
        plot2.setDataExtractOrder(TableOrder.BY_COLUMN);

        // 5. limit ต่างกัน
        plot2.setLimit(0.5);
        assertFalse(plot1.equals(plot2));
        plot2.setLimit(0.0);

        // 6. aggregatedItemsKey ต่างกัน
        plot2.setAggregatedItemsKey("DiffKey");
        assertFalse(plot1.equals(plot2));
        plot2.setAggregatedItemsKey("Other");

        // 7. aggregatedItemsPaint ต่างกัน
        plot2.setAggregatedItemsPaint(Color.BLUE);
        assertFalse(plot1.equals(plot2));
        plot2.setAggregatedItemsPaint(Color.lightGray);

        // 8. pieChart ต่างกัน
        PiePlot newPiePlot = new PiePlot();
        newPiePlot.setNoDataMessage("Custom");
        plot2.setPieChart(new JFreeChart(newPiePlot));
        assertFalse(plot1.equals(plot2));
    }

    @Test
    public void testSerialization() throws Exception {
        MultiplePiePlot plot = new MultiplePiePlot();
        plot.setAggregatedItemsPaint(Color.DARK_GRAY);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(plot);
        oos.flush();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MultiplePiePlot deserialized = (MultiplePiePlot) ois.readObject();

        assertNotNull(deserialized);
        assertEquals(plot.getAggregatedItemsKey(), deserialized.getAggregatedItemsKey());
        assertEquals(plot.getDataExtractOrder(), deserialized.getDataExtractOrder());
    }
}
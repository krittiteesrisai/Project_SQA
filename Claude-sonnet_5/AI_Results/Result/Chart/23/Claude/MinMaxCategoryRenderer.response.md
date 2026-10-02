# MinMaxCategoryRendererTest

ผมวิเคราะห์ซอร์สโค้ดแล้วพบว่าคลาสนี้มี 2 กลุ่มเมธอดหลักที่ต้องทดสอบ:
1. **Getter/Setter** ที่มีการเช็ค `null` และยิง `RendererChangeEvent`
2. **`drawItem()`** ที่มี branch ซับซ้อนเกี่ยวกับ `value == null`, `lastCategory == column`, `min/max` update, `rowCount-1 == row`, `orientation`, `plotLines`, `previousValue == null`, และ `entities != null`

⚠️ **หมายเหตุสำคัญ**: เนื่องจากไม่มี Mockito ในคลาสพาธ การทดสอบ `drawItem()` จึงต้องสร้าง object จริงจาก JFreeChart (เช่น `CategoryPlot`, `NumberAxis`, `CategoryItemRendererState`, `PlotRenderingInfo`) ซึ่ง API/constructor เหล่านี้**ไม่ได้ปรากฏในซอร์สที่ให้มา** แต่เป็น dependency ที่คลาสเป้าหมาย import ใช้งานอยู่แล้ว (จึงต้องมีอยู่ใน classpath จริงเพื่อให้คลาสเป้าหมาย compile ได้) ผมอ้างอิงจาก public API มาตรฐานของ JFreeChart 1.0.x ที่ใช้คู่กับ Chart-23 — จุดใดที่ไม่แน่ใจ 100% จะมีคอมเมนต์กำกับไว้

```java
import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.Field;

import javax.swing.Icon;

import org.junit.Before;
import org.junit.Test;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * JUnit4 test suite สำหรับ org.jfree.chart.renderer.category.MinMaxCategoryRenderer
 * (Defects4J: Chart-23)
 *
 * ข้อสมมติฐาน (ASSUMPTION) ที่ใช้ในไฟล์นี้ (ไม่มีอยู่ในซอร์สโค้ดที่ให้มาโดยตรง
 * แต่เป็น public API มาตรฐานของ JFreeChart ที่ MinMaxCategoryRenderer ต้องพึ่งพา
 * เพื่อให้ compile และรันได้จริง):
 *  - CategoryItemRendererState(PlotRenderingInfo) เป็น public constructor
 *  - CategoryItemRendererState/RendererState มี getEntityCollection()/setEntityCollection()
 *  - AbstractCategoryItemRenderer (parent class) มี addChangeListener(RendererChangeListener)
 *    ที่สืบทอดมาจาก AbstractRenderer/Renderer interface
 */
public class MinMaxCategoryRendererTest {

    private MinMaxCategoryRenderer renderer;
    private Graphics2D g2;
    private Rectangle2D dataArea;
    private CategoryAxis domainAxis;
    private NumberAxis rangeAxis;
    private CategoryItemRendererState state;

    /** Listener ทดสอบสำหรับดักจับ RendererChangeEvent */
    private static class TestListener implements RendererChangeListener {
        int callCount = 0;
        RendererChangeEvent lastEvent = null;

        public void rendererChanged(RendererChangeEvent event) {
            callCount++;
            lastEvent = event;
        }
    }

    @Before
    public void setUp() {
        renderer = new MinMaxCategoryRenderer();

        BufferedImage img = new BufferedImage(500, 300, BufferedImage.TYPE_INT_ARGB);
        g2 = img.createGraphics();
        dataArea = new Rectangle2D.Double(0, 0, 500, 300);

        domainAxis = new CategoryAxis("Category");
        rangeAxis = new NumberAxis("Value");
        rangeAxis.setAutoRange(false);
        rangeAxis.setRange(0.0, 100.0);

        ChartRenderingInfo cri = new ChartRenderingInfo();
        PlotRenderingInfo pri = new PlotRenderingInfo(cri);
        state = new CategoryItemRendererState(pri);
    }

    // ---------- Reflection helpers เพื่อตรวจ private field: min, max, lastCategory ----------

    private double getPrivateDouble(String fieldName) throws Exception {
        Field f = MinMaxCategoryRenderer.class.getDeclaredField(fieldName);
        f.setAccessible(true);
        return f.getDouble(renderer);
    }

    private int getPrivateInt(String fieldName) throws Exception {
        Field f = MinMaxCategoryRenderer.class.getDeclaredField(fieldName);
        f.setAccessible(true);
        return f.getInt(renderer);
    }

    private CategoryPlot buildPlot(DefaultCategoryDataset dataset,
                                    PlotOrientation orientation) {
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        plot.setOrientation(orientation);
        return plot;
    }

    // =====================================================================
    // 1) Default state ของ constructor
    // =====================================================================

    @Test
    public void testDefaultState() {
        assertFalse("ค่าเริ่มต้นของ plotLines ต้องเป็น false", renderer.isDrawLines());
        assertEquals("groupPaint เริ่มต้นต้องเป็นสีดำ", Color.black, renderer.getGroupPaint());
        assertTrue("groupStroke เริ่มต้นต้องเป็น BasicStroke",
                renderer.getGroupStroke() instanceof BasicStroke);
        assertEquals(1.0f, ((BasicStroke) renderer.getGroupStroke()).getLineWidth(), 0.0001f);
        assertNotNull(renderer.getMinIcon());
        assertNotNull(renderer.getMaxIcon());
        assertNotNull(renderer.getObjectIcon());
    }

    // =====================================================================
    // 2) setDrawLines() - if (this.plotLines != draw) branch
    // =====================================================================

    @Test
    public void testSetDrawLines_changesValue_firesEventOnce() {
        TestListener listener = new TestListener();
        renderer.addChangeListener(listener);

        renderer.setDrawLines(true);
        assertTrue(renderer.isDrawLines());
        assertEquals("ค่าเปลี่ยนต้องยิง event", 1, listener.callCount);

        // เรียกซ้ำด้วยค่าเดิม -> branch false -> ไม่ยิง event ซ้ำ
        renderer.setDrawLines(true);
        assertEquals("ค่าเหมือนเดิมต้องไม่ยิง event เพิ่ม", 1, listener.callCount);
    }

    @Test
    public void testSetDrawLines_toFalseAgain_noEventWhenSame() {
        // ค่าเริ่มต้นคือ false อยู่แล้ว -> เซ็ต false อีกครั้งต้องไม่ยิง event (branch false)
        TestListener listener = new TestListener();
        renderer.addChangeListener(listener);
        renderer.setDrawLines(false);
        assertEquals(0, listener.callCount);
        assertFalse(renderer.isDrawLines());
    }

    // =====================================================================
    // 3) setGroupPaint() - null check + setter + event
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupPaint_null_throwsException() {
        renderer.setGroupPaint(null);
    }

    @Test
    public void testSetGroupPaint_valid_updatesValueAndFiresEvent() {
        TestListener listener = new TestListener();
        renderer.addChangeListener(listener);

        Paint newPaint = Color.RED;
        renderer.setGroupPaint(newPaint);

        assertEquals(newPaint, renderer.getGroupPaint());
        assertEquals(1, listener.callCount);
    }

    // =====================================================================
    // 4) setGroupStroke() - null check + setter + event
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupStroke_null_throwsException() {
        renderer.setGroupStroke(null);
    }

    @Test
    public void testSetGroupStroke_valid_updatesValueAndFiresEvent() {
        TestListener listener = new TestListener();
        renderer.addChangeListener(listener);

        Stroke newStroke = new BasicStroke(3.0f);
        renderer.setGroupStroke(newStroke);

        assertEquals(newStroke, renderer.getGroupStroke());
        assertEquals(1, listener.callCount);
    }

    // =====================================================================
    // 5) setObjectIcon() - null check + setter + event
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetObjectIcon_null_throwsException() {
        renderer.setObjectIcon(null);
    }

    @Test
    public void testSetObjectIcon_valid_updatesValueAndFiresEvent() {
        TestListener listener = new TestListener();
        renderer.addChangeListener(listener);

        Icon icon = new javax.swing.plaf.metal.MetalIconFactory.FileIcon16();
        renderer.setObjectIcon(icon);

        assertSame(icon, renderer.getObjectIcon());
        assertEquals(1, listener.callCount);
    }

    // =====================================================================
    // 6) setMaxIcon() - null check + setter + event
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxIcon_null_throwsException() {
        renderer.setMaxIcon(null);
    }

    @Test
    public void testSetMaxIcon_valid_updatesValueAndFiresEvent() {
        TestListener listener = new TestListener();
        renderer.addChangeListener(listener);

        Icon icon = new javax.swing.plaf.metal.MetalIconFactory.FileIcon16();
        renderer.setMaxIcon(icon);

        assertSame(icon, renderer.getMaxIcon());
        assertEquals(1, listener.callCount);
    }

    // =====================================================================
    // 7) setMinIcon() - null check + setter + event
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSetMinIcon_null_throwsException() {
        renderer.setMinIcon(null);
    }

    @Test
    public void testSetMinIcon_valid_updatesValueAndFiresEvent() {
        TestListener listener = new TestListener();
        renderer.addChangeListener(listener);

        Icon icon = new javax.swing.plaf.metal.MetalIconFactory.FileIcon16();
        renderer.setMinIcon(icon);

        assertSame(icon, renderer.getMinIcon());
        assertEquals(1, listener.callCount);
    }

    // =====================================================================
    // 8) drawItem(): value == null -> return โดยไม่แก้ field ใด ๆ
    // =====================================================================

    @Test
    public void testDrawItem_nullValue_doesNothing() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue((Number) null, "R0", "C0");

        CategoryPlot plot = buildPlot(dataset, PlotOrientation.VERTICAL);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);

        // lastCategory เริ่มต้นคือ -1 และไม่ควรถูกแก้เพราะ value เป็น null
        assertEquals(-1, getPrivateInt("lastCategory"));
    }

    // =====================================================================
    // 9) drawItem(): first call -> else branch (reset lastCategory/min/max)
    // =====================================================================

    @Test
    public void testDrawItem_firstCallForCategory_resetsMinMax() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R0", "C0");

        CategoryPlot plot = buildPlot(dataset, PlotOrientation.VERTICAL);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);

        assertEquals(0, getPrivateInt("lastCategory"));
        assertEquals(5.0, getPrivateDouble("min"), 0.0001);
        assertEquals(5.0, getPrivateDouble("max"), 0.0001);
    }

    // =====================================================================
    // 10) drawItem(): multi-row same column ->
    //     lastCategory==column, min update true/false, max update true/false,
    //     และ branch rowCount-1==row (true/false ในคนละรอบ)
    // =====================================================================

    @Test
    public void testDrawItem_multipleRows_minMaxUpdateAndGroupLineBranches()
            throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // 3 rows เดียวกัน column C0: 5.0 -> 3.0 (min ลดลง) -> 8.0 (max เพิ่มขึ้น)
        dataset.addValue(5.0, "R0", "C0");
        dataset.addValue(3.0, "R1", "C0");
        dataset.addValue(8.0, "R2", "C0");

        CategoryPlot plot = buildPlot(dataset, PlotOrientation.VERTICAL);

        // row=0 : else branch (reset)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        assertEquals(5.0, getPrivateDouble("min"), 0.0001);
        assertEquals(5.0, getPrivateDouble("max"), 0.0001);

        // row=1 : lastCategory==column, min>value(3<5 true)->min=3, max<value(3<5 false)
        // rowCount-1(=2) != row(1) -> ไม่วาด group line (branch false)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 1, 0, 0);
        assertEquals(3.0, getPrivateDouble("min"), 0.0001);
        assertEquals(5.0, getPrivateDouble("max"), 0.0001);

        // row=2 : lastCategory==column, min>8 false, max<8 true -> max=8
        // rowCount-1(=2) == row(2) -> วาด group line (branch true, orientation VERTICAL)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 2, 0, 0);
        assertEquals(3.0, getPrivateDouble("min"), 0.0001);
        assertEquals(8.0, getPrivateDouble("max"), 0.0001);
        assertEquals(0, getPrivateInt("lastCategory"));
    }

    // =====================================================================
    // 11) drawItem(): orientation HORIZONTAL (ทั้ง objectIcon และ group line branch)
    // =====================================================================

    @Test
    public void testDrawItem_horizontalOrientation_noException() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R0", "C0");
        dataset.addValue(9.0, "R1", "C0");

        CategoryPlot plot = buildPlot(dataset, PlotOrientation.HORIZONTAL);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 1, 0, 0); // row สุดท้าย -> เข้า branch HORIZONTAL ของ group line

        assertEquals(5.0, getPrivateDouble("min"), 0.0001);
        assertEquals(9.0, getPrivateDouble("max"), 0.0001);
    }

    // =====================================================================
    // 12) drawItem(): plotLines = true, column == 0 -> skip inner block (branch false)
    // =====================================================================

    @Test
    public void testDrawItem_plotLinesTrue_columnZero_skipsPreviousValueCheck()
            throws Exception {
        renderer.setDrawLines(true);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R0", "C0");

        CategoryPlot plot = buildPlot(dataset, PlotOrientation.VERTICAL);

        // column=0 -> (column != 0) เป็น false -> ข้าม block เชื่อมเส้น ไม่ error
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);

        assertEquals(0, getPrivateInt("lastCategory"));
    }

    // =====================================================================
    // 13) drawItem(): plotLines = true, column != 0, previousValue != null
    // =====================================================================

    @Test
    public void testDrawItem_plotLinesTrue_previousValueNotNull() throws Exception {
        renderer.setDrawLines(true);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(3.0, "R0", "C0");
        dataset.addValue(5.0, "R0", "C1");

        CategoryPlot plot = buildPlot(dataset, PlotOrientation.VERTICAL);

        // เรียก column=0 ก่อนเพื่อให้ dataset มีสถานะ (ไม่บังคับ แต่ทำให้เสถียร)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);

        // column=1, previousValue (column0)=3.0 != null -> วาดเส้นเชื่อม
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 1, 0);

        assertEquals(1, getPrivateInt("lastCategory"));
    }

    // =====================================================================
    // 14) drawItem(): plotLines = true, column != 0, previousValue == null
    // =====================================================================

    @Test
    public void testDrawItem_plotLinesTrue_previousValueNull() throws Exception {
        renderer.setDrawLines(true);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue((Number) null, "R0", "C0");
        dataset.addValue(5.0, "R0", "C1");

        CategoryPlot plot = buildPlot(dataset, PlotOrientation.VERTICAL);

        // column=0 value เป็น null -> ผ่านไปโดยไม่ทำอะไร (ตาม branch ข้อ 8)
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);

        // column=1 value=5.0 (ไม่ null) previousValue (column0)=null -> ข้าม การวาดเส้น
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 1, 0);

        assertEquals(1, getPrivateInt("lastCategory"));
        assertEquals(5.0, getPrivateDouble("min"), 0.0001);
        assertEquals(5.0, getPrivateDouble("max"), 0.0001);
    }

    // =====================================================================
    // 15) drawItem(): entities == null -> ข้าม addItemEntity (branch false)
    // =====================================================================

    @Test
    public void testDrawItem_entityCollectionNull_noException() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R0", "C0");

        CategoryPlot plot = buildPlot(dataset, PlotOrientation.VERTICAL);

        // state.getEntityCollection() เป็น null ตามค่าเริ่มต้น -> ข้าม addItemEntity
        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);
        // ไม่ throw exception ก็ถือว่าผ่าน (สังเกตพฤติกรรมทางอ้อม)
    }

    // =====================================================================
    // 16) drawItem(): entities != null && shape != null -> เรียก addItemEntity (branch true)
    // =====================================================================

    @Test
    public void testDrawItem_entityCollectionNotNull_addsEntity() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "R0", "C0");

        CategoryPlot plot = buildPlot(dataset, PlotOrientation.VERTICAL);

        EntityCollection entities = new StandardEntityCollection();
        state.setEntityCollection(entities);

        renderer.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis,
                dataset, 0, 0, 0);

        // ตรวจแบบหลวม ๆ ว่ามีการเพิ่ม entity เข้าไปจริง (สมมติฐาน API ตาม JFreeChart)
        assertTrue("คาดว่าต้องมี entity อย่างน้อย 1 รายการถูกเพิ่ม",
                entities.getEntityCount() > 0);
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultState` | ค่าเริ่มต้นของทุก field (ไม่ใช่ branch แต่เป็น baseline) |
| `testSetDrawLines_changesValue_firesEventOnce` | `setDrawLines`: `plotLines != draw` = true (2 ครั้ง: true→true) |
| `testSetDrawLines_toFalseAgain_noEventWhenSame` | `setDrawLines`: `plotLines != draw` = false |
| `testSetGroupPaint_null_throwsException` | `setGroupPaint`: `paint == null` = true |
| `testSetGroupPaint_valid_updatesValueAndFiresEvent` | `setGroupPaint`: `paint == null` = false |
| `testSetGroupStroke_null_throwsException` | `setGroupStroke`: null check = true |
| `testSetGroupStroke_valid_updatesValueAndFiresEvent` | `setGroupStroke`: null check = false |
| `testSetObjectIcon_null_throwsException` | `setObjectIcon`: null check = true |
| `testSetObjectIcon_valid_updatesValueAndFiresEvent` | `setObjectIcon`: null check = false |
| `testSetMaxIcon_null_throwsException` / `..._valid...` | `setMaxIcon`: null check true/false |
| `testSetMinIcon_null_throwsException` / `..._valid...` | `setMinIcon`: null check true/false |
| `testDrawItem_nullValue_doesNothing` | `drawItem`: `value != null` = false |
| `testDrawItem_firstCallForCategory_resetsMinMax` | `drawItem`: `lastCategory == column` = false (else branch) |
| `testDrawItem_multipleRows_minMaxUpdateAndGroupLineBranches` | `lastCategory==column`=true; `min>value` true/false; `max<value` true/false; `rowCount-1==row` true/false; orientation VERTICAL |
| `testDrawItem_horizontalOrientation_noException` | orientation `== VERTICAL` = false (ทั้ง objectIcon placement และ group-line draw) |
| `testDrawItem_plotLinesTrue_columnZero_skipsPreviousValueCheck` | `plotLines`=true, `column != 0` = false |
| `testDrawItem_plotLinesTrue_previousValueNotNull` | `plotLines`=true, `column != 0`=true, `previousValue != null`=true |
| `testDrawItem_plotLinesTrue_previousValueNull` | `plotLines`=true, `column != 0`=true, `previousValue != null`=false |
| `testDrawItem_entityCollectionNull_noException` | `entities != null && shape != null` = false |
| `testDrawItem_entityCollectionNotNull_addsEntity` | `entities != null && shape != null` = true |

**หมายเหตุข้อจำกัด**: branch ของ `PlotOrientation.HORIZONTAL` ในส่วน `plotLines` (การสร้าง `Line2D` แบบสลับแกน) ไม่ได้ถูกแยกทดสอบเฉพาะเจาะจง (รวมอยู่ทางอ้อมได้ถ้าเพิ่ม test ผสาน horizontal+plotLines แต่ในไฟล์นี้เน้นแยก concern ทีละ branch เพื่อความชัดเจนของ fault localization) หากต้องการ coverage 100% ควรเพิ่ม test ผสมกรณีดังกล่าวเพิ่มเติม
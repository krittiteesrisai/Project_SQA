package org.jfree.chart.axis;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.junit.Test;

public class AxisTest {

    // ---------- Helper subclass to instantiate abstract Axis ----------
    private static class TestAxis extends Axis {
        boolean configureCalled = false;

        TestAxis(String label) {
            super(label);
        }

        public void configure() {
            this.configureCalled = true;
        }

        public AxisSpace reserveSpace(Graphics2D g2, Plot plot,
                Rectangle2D plotArea, RectangleEdge edge, AxisSpace space) {
            return space;
        }

        public AxisState draw(Graphics2D g2, double cursor,
                Rectangle2D plotArea, Rectangle2D dataArea,
                RectangleEdge edge, PlotRenderingInfo plotState) {
            return new AxisState();
        }

        public List refreshTicks(Graphics2D g2, AxisState state,
                Rectangle2D dataArea, RectangleEdge edge) {
            return new ArrayList();
        }
    }

    // ---------- Helper listener ----------
    private static class TestListener implements AxisChangeListener {
        int count = 0;
        public void axisChanged(AxisChangeEvent event) {
            count++;
        }
    }

    private Graphics2D createGraphics() {
        BufferedImage img = new BufferedImage(300, 300,
                BufferedImage.TYPE_INT_ARGB);
        return img.createGraphics();
    }

    // ============================================================
    // Constructor defaults
    // ============================================================
    @Test
    public void testConstructorDefaults() {
        TestAxis a = new TestAxis("MyLabel");
        assertEquals("MyLabel", a.getLabel());
        assertTrue(a.isVisible());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_FONT, a.getLabelFont());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_PAINT, a.getLabelPaint());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_INSETS, a.getLabelInsets());
        assertEquals(0.0, a.getLabelAngle(), 0.0001);
        assertNull(a.getLabelToolTip());
        assertNull(a.getLabelURL());
        assertTrue(a.isAxisLineVisible());
        assertEquals(Axis.DEFAULT_AXIS_LINE_PAINT, a.getAxisLinePaint());
        assertEquals(Axis.DEFAULT_AXIS_LINE_STROKE, a.getAxisLineStroke());
        assertTrue(a.isTickLabelsVisible());
        assertEquals(Axis.DEFAULT_TICK_LABEL_FONT, a.getTickLabelFont());
        assertEquals(Axis.DEFAULT_TICK_LABEL_PAINT, a.getTickLabelPaint());
        assertEquals(Axis.DEFAULT_TICK_LABEL_INSETS, a.getTickLabelInsets());
        assertTrue(a.isTickMarksVisible());
        assertEquals(Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH,
                a.getTickMarkInsideLength(), 0.0001);
        assertEquals(Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH,
                a.getTickMarkOutsideLength(), 0.0001);
        assertEquals(Axis.DEFAULT_TICK_MARK_STROKE, a.getTickMarkStroke());
        assertEquals(Axis.DEFAULT_TICK_MARK_PAINT, a.getTickMarkPaint());
        assertNull(a.getPlot());
        assertEquals(0.0, a.getFixedDimension(), 0.0001);
    }

    // ============================================================
    // visible
    // ============================================================
    @Test
    public void testSetVisible_NoChangeWhenSameValue() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setVisible(true); // same as default -> no notify branch
        assertEquals(0, l.count);
        assertTrue(a.isVisible());
    }

    @Test
    public void testSetVisible_ChangeNotifiesListener() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setVisible(false);
        assertEquals(1, l.count);
        assertFalse(a.isVisible());
        a.setVisible(false); // no change now
        assertEquals(1, l.count);
    }

    // ============================================================
    // label
    // ============================================================
    @Test
    public void testSetLabel_NullToNonNull() {
        TestAxis a = new TestAxis(null);
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setLabel("New");
        assertEquals("New", a.getLabel());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetLabel_NullToNull_NoNotify() {
        TestAxis a = new TestAxis(null);
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setLabel(null);
        assertNull(a.getLabel());
        assertEquals(0, l.count);
    }

    @Test
    public void testSetLabel_NonNullToSameValue_NoNotify() {
        TestAxis a = new TestAxis("Same");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setLabel("Same");
        assertEquals(0, l.count);
    }

    @Test
    public void testSetLabel_NonNullToDifferentValue_Notify() {
        TestAxis a = new TestAxis("Old");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setLabel("New");
        assertEquals("New", a.getLabel());
        assertEquals(1, l.count);
    }

    @Test
    public void testSetLabel_NonNullToNull_Notify() {
        TestAxis a = new TestAxis("Old");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setLabel(null);
        assertNull(a.getLabel());
        assertEquals(1, l.count);
    }

    // ============================================================
    // labelFont
    // ============================================================
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelFont_NullThrows() {
        new TestAxis("L").setLabelFont(null);
    }

    @Test
    public void testSetLabelFont_SameValue_NoNotify() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        Font same = Axis.DEFAULT_AXIS_LABEL_FONT;
        a.setLabelFont(new Font(same.getName(), same.getStyle(), same.getSize()));
        assertEquals(0, l.count);
    }

    @Test
    public void testSetLabelFont_DifferentValue_Notify() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        Font f = new Font("Serif", Font.BOLD, 24);
        a.setLabelFont(f);
        assertEquals(f, a.getLabelFont());
        assertEquals(1, l.count);
    }

    // ============================================================
    // labelPaint (no equality check in source -> always notifies)
    // ============================================================
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPaint_NullThrows() {
        new TestAxis("L").setLabelPaint(null);
    }

    @Test
    public void testSetLabelPaint_SetsAndNotifies() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setLabelPaint(Color.RED);
        assertEquals(Color.RED, a.getLabelPaint());
        assertEquals(1, l.count);
        a.setLabelPaint(Color.RED); // still notifies (no equals check)
        assertEquals(2, l.count);
    }

    // ============================================================
    // labelInsets
    // ============================================================
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelInsets_NullThrows() {
        new TestAxis("L").setLabelInsets(null);
    }

    @Test
    public void testSetLabelInsets_SameValue_NoNotify() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setLabelInsets(Axis.DEFAULT_AXIS_LABEL_INSETS);
        assertEquals(0, l.count);
    }

    @Test
    public void testSetLabelInsets_DifferentValue_Notify() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        RectangleInsets insets = new RectangleInsets(5, 5, 5, 5);
        a.setLabelInsets(insets);
        assertEquals(insets, a.getLabelInsets());
        assertEquals(1, l.count);
    }

    // ============================================================
    // labelAngle
    // ============================================================
    @Test
    public void testSetLabelAngle_SetsAndNotifies() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setLabelAngle(1.57);
        assertEquals(1.57, a.getLabelAngle(), 0.0001);
        assertEquals(1, l.count);
    }

    // ============================================================
    // labelToolTip / labelURL
    // ============================================================
    @Test
    public void testLabelToolTip_DefaultNullAndSetter() {
        TestAxis a = new TestAxis("L");
        assertNull(a.getLabelToolTip());
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setLabelToolTip("tip");
        assertEquals("tip", a.getLabelToolTip());
        assertEquals(1, l.count);
        a.setLabelToolTip(null);
        assertNull(a.getLabelToolTip());
        assertEquals(2, l.count);
    }

    @Test
    public void testLabelURL_DefaultNullAndSetter() {
        TestAxis a = new TestAxis("L");
        assertNull(a.getLabelURL());
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setLabelURL("http://example.com");
        assertEquals("http://example.com", a.getLabelURL());
        assertEquals(1, l.count);
    }

    // ============================================================
    // axisLineVisible (no equality check -> always notifies)
    // ============================================================
    @Test
    public void testAxisLineVisible_DefaultTrueAndSetter() {
        TestAxis a = new TestAxis("L");
        assertTrue(a.isAxisLineVisible());
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setAxisLineVisible(false);
        assertFalse(a.isAxisLineVisible());
        assertEquals(1, l.count);
        a.setAxisLineVisible(false);
        assertEquals(2, l.count);
    }

    // ============================================================
    // axisLinePaint / axisLineStroke
    // ============================================================
    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisLinePaint_NullThrows() {
        new TestAxis("L").setAxisLinePaint(null);
    }

    @Test
    public void testSetAxisLinePaint_SetsAndNotifies() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setAxisLinePaint(Color.BLUE);
        assertEquals(Color.BLUE, a.getAxisLinePaint());
        assertEquals(1, l.count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisLineStroke_NullThrows() {
        new TestAxis("L").setAxisLineStroke(null);
    }

    @Test
    public void testSetAxisLineStroke_SetsAndNotifies() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        Stroke s = new BasicStroke(3.0f);
        a.setAxisLineStroke(s);
        assertEquals(s, a.getAxisLineStroke());
        assertEquals(1, l.count);
    }

    // ============================================================
    // tickLabelsVisible
    // ============================================================
    @Test
    public void testTickLabelsVisible_NoChangeSameValue() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setTickLabelsVisible(true);
        assertEquals(0, l.count);
    }

    @Test
    public void testTickLabelsVisible_ChangeNotifies() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setTickLabelsVisible(false);
        assertFalse(a.isTickLabelsVisible());
        assertEquals(1, l.count);
    }

    // ============================================================
    // tickLabelFont
    // ============================================================
    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelFont_NullThrows() {
        new TestAxis("L").setTickLabelFont(null);
    }

    @Test
    public void testSetTickLabelFont_SameValue_NoNotify() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        Font same = Axis.DEFAULT_TICK_LABEL_FONT;
        a.setTickLabelFont(new Font(same.getName(), same.getStyle(), same.getSize()));
        assertEquals(0, l.count);
    }

    @Test
    public void testSetTickLabelFont_DifferentValue_Notify() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        Font f = new Font("Monospaced", Font.ITALIC, 14);
        a.setTickLabelFont(f);
        assertEquals(f, a.getTickLabelFont());
        assertEquals(1, l.count);
    }

    // ============================================================
    // tickLabelPaint
    // ============================================================
    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelPaint_NullThrows() {
        new TestAxis("L").setTickLabelPaint(null);
    }

    @Test
    public void testSetTickLabelPaint_SetsAndNotifies() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setTickLabelPaint(Color.GREEN);
        assertEquals(Color.GREEN, a.getTickLabelPaint());
        assertEquals(1, l.count);
    }

    // ============================================================
    // tickLabelInsets
    // ============================================================
    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelInsets_NullThrows() {
        new TestAxis("L").setTickLabelInsets(null);
    }

    @Test
    public void testSetTickLabelInsets_SameValue_NoNotify() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setTickLabelInsets(Axis.DEFAULT_TICK_LABEL_INSETS);
        assertEquals(0, l.count);
    }

    @Test
    public void testSetTickLabelInsets_DifferentValue_Notify() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        RectangleInsets insets = new RectangleInsets(9, 9, 9, 9);
        a.setTickLabelInsets(insets);
        assertEquals(insets, a.getTickLabelInsets());
        assertEquals(1, l.count);
    }

    // ============================================================
    // tickMarksVisible
    // ============================================================
    @Test
    public void testTickMarksVisible_NoChangeSameValue() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setTickMarksVisible(true);
        assertEquals(0, l.count);
    }

    @Test
    public void testTickMarksVisible_ChangeNotifies() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setTickMarksVisible(false);
        assertFalse(a.isTickMarksVisible());
        assertEquals(1, l.count);
    }

    // ============================================================
    // tickMark inside/outside length (no branch, always notifies)
    // ============================================================
    @Test
    public void testTickMarkInsideLength_SetsAndNotifies() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setTickMarkInsideLength(7.5f);
        assertEquals(7.5f, a.getTickMarkInsideLength(), 0.0001f);
        assertEquals(1, l.count);
    }

    @Test
    public void testTickMarkOutsideLength_SetsAndNotifies() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setTickMarkOutsideLength(11.5f);
        assertEquals(11.5f, a.getTickMarkOutsideLength(), 0.0001f);
        assertEquals(1, l.count);
    }

    // ============================================================
    // tickMarkStroke
    // ============================================================
    @Test(expected = IllegalArgumentException.class)
    public void testSetTickMarkStroke_NullThrows() {
        new TestAxis("L").setTickMarkStroke(null);
    }

    @Test
    public void testSetTickMarkStroke_SameValue_NoNotify() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setTickMarkStroke(Axis.DEFAULT_TICK_MARK_STROKE);
        assertEquals(0, l.count);
    }

    @Test
    public void testSetTickMarkStroke_DifferentValue_Notify() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        Stroke s = new BasicStroke(4.0f);
        a.setTickMarkStroke(s);
        assertEquals(s, a.getTickMarkStroke());
        assertEquals(1, l.count);
    }

    // ============================================================
    // tickMarkPaint
    // ============================================================
    @Test(expected = IllegalArgumentException.class)
    public void testSetTickMarkPaint_NullThrows() {
        new TestAxis("L").setTickMarkPaint(null);
    }

    @Test
    public void testSetTickMarkPaint_SetsAndNotifies() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        a.addChangeListener(l);
        a.setTickMarkPaint(Color.PINK);
        assertEquals(Color.PINK, a.getTickMarkPaint());
        assertEquals(1, l.count);
    }

    // ============================================================
    // plot / fixedDimension
    // ============================================================
    @Test
    public void testPlot_SetAndGet_CallsConfigure() {
        TestAxis a = new TestAxis("L");
        assertNull(a.getPlot());
        assertFalse(a.configureCalled);
        a.setPlot(null); // no null-check in source -> configure() still called
        assertTrue(a.configureCalled);
        assertNull(a.getPlot());
    }

    @Test
    public void testFixedDimension_SetAndGet() {
        TestAxis a = new TestAxis("L");
        assertEquals(0.0, a.getFixedDimension(), 0.0001);
        a.setFixedDimension(42.5);
        assertEquals(42.5, a.getFixedDimension(), 0.0001);
    }

    // ============================================================
    // listener management / notifyListeners loop
    // ============================================================
    @Test
    public void testAddRemoveHasListener() {
        TestAxis a = new TestAxis("L");
        TestListener l = new TestListener();
        assertFalse(a.hasListener(l));
        a.addChangeListener(l);
        assertTrue(a.hasListener(l));
        a.removeChangeListener(l);
        assertFalse(a.hasListener(l));
    }

    @Test
    public void testNotifyListeners_NoListeners_NoException() {
        TestAxis a = new TestAxis("L"); // loop zero-iteration branch
        a.setLabelAngle(2.0);
        assertEquals(2.0, a.getLabelAngle(), 0.0001);
    }

    @Test
    public void testNotifyListeners_MultipleListeners() {
        TestAxis a = new TestAxis("L");
        TestListener l1 = new TestListener();
        TestListener l2 = new TestListener();
        a.addChangeListener(l1);
        a.addChangeListener(l2);
        a.setLabelAngle(3.0);
        assertEquals(1, l1.count);
        assertEquals(1, l2.count);
    }

    // ============================================================
    // getLabelEnclosure
    // ============================================================
    @Test
    public void testGetLabelEnclosure_NullLabel() {
        TestAxis a = new TestAxis(null);
        Rectangle2D r = a.getLabelEnclosure(createGraphics(), RectangleEdge.BOTTOM);
        assertEquals(0.0, r.getWidth(), 0.0001);
        assertEquals(0.0, r.getHeight(), 0.0001);
    }

    @Test
    public void testGetLabelEnclosure_EmptyLabel() {
        TestAxis a = new TestAxis("");
        Rectangle2D r = a.getLabelEnclosure(createGraphics(), RectangleEdge.BOTTOM);
        assertEquals(0.0, r.getWidth(), 0.0001);
        assertEquals(0.0, r.getHeight(), 0.0001);
    }

    @Test
    public void testGetLabelEnclosure_NonEmptyLabel_Bottom() {
        TestAxis a = new TestAxis("Hello");
        Rectangle2D r = a.getLabelEnclosure(createGraphics(), RectangleEdge.BOTTOM);
        assertTrue(r.getWidth() > 0);
        assertTrue(r.getHeight() > 0);
    }

    @Test
    public void testGetLabelEnclosure_NonEmptyLabel_Left() {
        TestAxis a = new TestAxis("Hello");
        // edge LEFT triggers angle - PI/2 branch
        Rectangle2D r = a.getLabelEnclosure(createGraphics(), RectangleEdge.LEFT);
        assertTrue(r.getWidth() > 0);
        assertTrue(r.getHeight() > 0);
    }

    // ============================================================
    // drawLabel
    // ============================================================
    @Test(expected = IllegalArgumentException.class)
    public void testDrawLabel_NullStateThrows() {
        TestAxis a = new TestAxis("L");
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 150, 150);
        a.drawLabel("text", createGraphics(), plotArea, dataArea,
                RectangleEdge.BOTTOM, null, null);
    }

    @Test
    public void testDrawLabel_NullLabel_ReturnsSameState() {
        TestAxis a = new TestAxis("L");
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 150, 150);
        AxisState state = new AxisState();
        AxisState result = a.drawLabel(null, createGraphics(), plotArea,
                dataArea, RectangleEdge.BOTTOM, state, null);
        assertSame(state, result);
    }

    @Test
    public void testDrawLabel_EmptyLabel_ReturnsSameState() {
        TestAxis a = new TestAxis("L");
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 150, 150);
        AxisState state = new AxisState();
        AxisState result = a.drawLabel("", createGraphics(), plotArea,
                dataArea, RectangleEdge.BOTTOM, state, null);
        assertSame(state, result);
    }

    @Test
    public void testDrawLabel_EdgeTop_CursorChanges() {
        TestAxis a = new TestAxis("L");
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 150, 150);
        AxisState state = new AxisState();
        double before = state.getCursor();
        AxisState result = a.drawLabel("MyLabel", createGraphics(), plotArea,
                dataArea, RectangleEdge.TOP, state, null);
        assertNotEquals(before, result.getCursor(), 0.0001);
    }

    @Test
    public void testDrawLabel_EdgeBottom_CursorChanges() {
        TestAxis a = new TestAxis("L");
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 150, 150);
        AxisState state = new AxisState();
        double before = state.getCursor();
        AxisState result = a.drawLabel("MyLabel", createGraphics(), plotArea,
                dataArea, RectangleEdge.BOTTOM, state, null);
        assertNotEquals(before, result.getCursor(), 0.0001);
    }

    @Test
    public void testDrawLabel_EdgeLeft_CursorChanges() {
        TestAxis a = new TestAxis("L");
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 150, 150);
        AxisState state = new AxisState();
        double before = state.getCursor();
        AxisState result = a.drawLabel("MyLabel", createGraphics(), plotArea,
                dataArea, RectangleEdge.LEFT, state, null);
        assertNotEquals(before, result.getCursor(), 0.0001);
    }

    @Test
    public void testDrawLabel_EdgeRight_CursorChanges() {
        TestAxis a = new TestAxis("L");
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 150, 150);
        AxisState state = new AxisState();
        double before = state.getCursor();
        AxisState result = a.drawLabel("MyLabel", createGraphics(), plotArea,
                dataArea, RectangleEdge.RIGHT, state, null);
        assertNotEquals(before, result.getCursor(), 0.0001);
    }

    @Test
    public void testDrawLabel_WithPlotStateAndEntities_AddsEntity() {
        TestAxis a = new TestAxis("L");
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 150, 150);
        AxisState state = new AxisState();

        ChartRenderingInfo info = new ChartRenderingInfo();
        StandardEntityCollection entities = new StandardEntityCollection();
        info.setEntityCollection(entities);
        PlotRenderingInfo plotState = new PlotRenderingInfo(info);

        a.drawLabel("EntityLabel", createGraphics(), plotArea, dataArea,
                RectangleEdge.TOP, state, plotState);

        // ตรวจว่ามี entity ถูกเพิ่มเข้าไปจริง (branch: entities != null)
        assertTrue(entities.getEntityCount() > 0);
    }

    @Test
    public void testDrawLabel_WithPlotStateNoEntities_NoException() {
        TestAxis a = new TestAxis("L");
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 150, 150);
        AxisState state = new AxisState();

        ChartRenderingInfo info = new ChartRenderingInfo();
        info.setEntityCollection(null); // branch: entities == null
        PlotRenderingInfo plotState = new PlotRenderingInfo(info);

        AxisState result = a.drawLabel("NoEntityLabel", createGraphics(),
                plotArea, dataArea, RectangleEdge.TOP, state, plotState);
        assertNotNull(result);
    }

    // ============================================================
    // drawAxisLine
    // ============================================================
    @Test
    public void testDrawAxisLine_AllEdges_NoException() {
        TestAxis a = new TestAxis("L");
        Graphics2D g2 = createGraphics();
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        a.drawAxisLine(g2, 10.0, dataArea, RectangleEdge.TOP);
        a.drawAxisLine(g2, 10.0, dataArea, RectangleEdge.BOTTOM);
        a.drawAxisLine(g2, 10.0, dataArea, RectangleEdge.LEFT);
        a.drawAxisLine(g2, 10.0, dataArea, RectangleEdge.RIGHT);
    }

    // ============================================================
    // clone()
    // ============================================================
    @Test
    public void testClone_ResetsPlotAndListeners() throws Exception {
        TestAxis a = new TestAxis("Label");
        TestListener l = new TestListener();
        a.addChangeListener(l);

        Axis clone = (Axis) a.clone();

        assertNotSame(a, clone);
        assertTrue(a.equals(clone));
        assertFalse(clone.hasListener(l));
        assertNull(clone.getPlot());
    }

    // ============================================================
    // equals()
    // ============================================================
    @Test
    public void testEquals_SameReference() {
        TestAxis a = new TestAxis("L");
        assertTrue(a.equals(a));
    }

    @Test
    public void testEquals_NullOrDifferentType() {
        TestAxis a = new TestAxis("L");
        assertFalse(a.equals(null));
        assertFalse(a.equals("not an axis"));
    }

    @Test
    public void testEquals_EachFieldDifference_False() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");
        assertTrue(a1.equals(a2));

        a1.setVisible(false);
        assertFalse(a1.equals(a2));
        a2.setVisible(false);
        assertTrue(a1.equals(a2));

        a1.setLabel("Other");
        assertFalse(a1.equals(a2));
        a2.setLabel("Other");
        assertTrue(a1.equals(a2));

        Font f = new Font("Serif", Font.BOLD, 20);
        a1.setLabelFont(f);
        assertFalse(a1.equals(a2));
        a2.setLabelFont(f);
        assertTrue(a1.equals(a2));

        a1.setLabelPaint(Color.RED);
        assertFalse(a1.equals(a2));
        a2.setLabelPaint(Color.RED);
        assertTrue(a1.equals(a2));

        RectangleInsets insets = new RectangleInsets(1, 1, 1, 1);
        a1.setLabelInsets(insets);
        assertFalse(a1.equals(a2));
        a2.setLabelInsets(insets);
        assertTrue(a1.equals(a2));

        a1.setLabelAngle(1.0);
        assertFalse(a1.equals(a2));
        a2.setLabelAngle(1.0);
        assertTrue(a1.equals(a2));

        a1.setLabelToolTip("tip");
        assertFalse(a1.equals(a2));
        a2.setLabelToolTip("tip");
        assertTrue(a1.equals(a2));

        a1.setLabelURL("url");
        assertFalse(a1.equals(a2));
        a2.setLabelURL("url");
        assertTrue(a1.equals(a2));

        a1.setAxisLineVisible(false);
        assertFalse(a1.equals(a2));
        a2.setAxisLineVisible(false);
        assertTrue(a1.equals(a2));

        Stroke s = new BasicStroke(3.0f);
        a1.setAxisLineStroke(s);
        assertFalse(a1.equals(a2));
        a2.setAxisLineStroke(s);
        assertTrue(a1.equals(a2));

        a1.setAxisLinePaint(Color.BLUE);
        assertFalse(a1.equals(a2));
        a2.setAxisLinePaint(Color.BLUE);
        assertTrue(a1.equals(a2));

        a1.setTickLabelsVisible(false);
        assertFalse(a1.equals(a2));
        a2.setTickLabelsVisible(false);
        assertTrue(a1.equals(a2));

        Font f2 = new Font("Monospaced", Font.ITALIC, 8);
        a1.setTickLabelFont(f2);
        assertFalse(a1.equals(a2));
        a2.setTickLabelFont(f2);
        assertTrue(a1.equals(a2));

        a1.setTickLabelPaint(Color.GREEN);
        assertFalse(a1.equals(a2));
        a2.setTickLabelPaint(Color.GREEN);
        assertTrue(a1.equals(a2));

        RectangleInsets insets2 = new RectangleInsets(2, 2, 2, 2);
        a1.setTickLabelInsets(insets2);
        assertFalse(a1.equals(a2));
        a2.setTickLabelInsets(insets2);
        assertTrue(a1.equals(a2));

        a1.setTickMarksVisible(false);
        assertFalse(a1.equals(a2));
        a2.setTickMarksVisible(false);
        assertTrue(a1.equals(a2));

        a1.setTickMarkInsideLength(5.0f);
        assertFalse(a1.equals(a2));
        a2.setTickMarkInsideLength(5.0f);
        assertTrue(a1.equals(a2));

        a1.setTickMarkOutsideLength(9.0f);
        assertFalse(a1.equals(a2));
        a2.setTickMarkOutsideLength(9.0f);
        assertTrue(a1.equals(a2));

        a1.setTickMarkPaint(Color.YELLOW);
        assertFalse(a1.equals(a2));
        a2.setTickMarkPaint(Color.YELLOW);
        assertTrue(a1.equals(a2));

        Stroke s2 = new BasicStroke(5.0f);
        a1.setTickMarkStroke(s2);
        assertFalse(a1.equals(a2));
        a2.setTickMarkStroke(s2);
        assertTrue(a1.equals(a2));

        a1.setFixedDimension(15.0);
        assertFalse(a1.equals(a2));
        a2.setFixedDimension(15.0);
        assertTrue(a1.equals(a2));
    }

    // ============================================================
    // serialization (writeObject/readObject transient fields)
    // ============================================================
    @Test
    public void testSerialization_RoundTrip() throws Exception {
        TestAxis a = new TestAxis("SerializeMe");
        a.setLabelPaint(Color.CYAN);
        a.setTickLabelPaint(Color.MAGENTA);
        a.setAxisLinePaint(Color.ORANGE);
        a.setAxisLineStroke(new BasicStroke(2.5f));
        a.setTickMarkPaint(Color.PINK);
        a.setTickMarkStroke(new BasicStroke(1.5f));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(a);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        TestAxis restored = (TestAxis) ois.readObject();
        ois.close();

        assertEquals(a.getLabel(), restored.getLabel());
        assertEquals(a.getLabelPaint(), restored.getLabelPaint());
        assertEquals(a.getTickLabelPaint(), restored.getTickLabelPaint());
        assertEquals(a.getAxisLinePaint(), restored.getAxisLinePaint());
        assertEquals(a.getAxisLineStroke(), restored.getAxisLineStroke());
        assertEquals(a.getTickMarkPaint(), restored.getTickMarkPaint());
        assertEquals(a.getTickMarkStroke(), restored.getTickMarkStroke());
    }
}

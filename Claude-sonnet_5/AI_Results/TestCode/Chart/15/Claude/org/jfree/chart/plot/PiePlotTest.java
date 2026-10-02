package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.util.UnitType;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 tests for {@link PiePlot} (Defects4J Chart-15b).
 * Placed in the same package as the target class to access protected
 * methods and package-private helper classes (PiePlotState, DefaultDrawingSupplier, etc.)
 */
public class PiePlotTest {

    /** Simple listener used to count PlotChangeEvent notifications. */
    private static class CountingListener implements PlotChangeListener {
        int count = 0;
        public void plotChanged(PlotChangeEvent event) {
            count++;
        }
    }

    private PiePlot plot;

    @Before
    public void setUp() {
        plot = new PiePlot();
    }

    // ---------------------------------------------------------------
    // Constructor defaults
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructorValues() {
        assertNull(plot.getDataset());
        assertEquals(0, plot.getPieIndex());
        assertEquals(PiePlot.DEFAULT_INTERIOR_GAP, plot.getInteriorGap(), 0.0001);
        assertTrue(plot.isCircular());
        assertEquals(PiePlot.DEFAULT_START_ANGLE, plot.getStartAngle(), 0.0001);
        assertEquals(Rotation.CLOCKWISE, plot.getDirection());
        assertFalse(plot.getIgnoreNullValues());
        assertFalse(plot.getIgnoreZeroValues());
        assertTrue(plot.getSectionOutlinesVisible());
        assertTrue(plot.getLabelLinksVisible());
        // constructor overrides field default (true) to false
        assertFalse(plot.getSimpleLabels());
        assertEquals(PiePlot.DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW,
                plot.getMinimumArcAngleToDraw(), 0.0000001);
        assertNotNull(plot.getBaseSectionPaint());
        assertNotNull(plot.getBaseSectionOutlinePaint());
        assertNotNull(plot.getBaseSectionOutlineStroke());
        assertNotNull(plot.getLabelPadding());
        assertNotNull(plot.getSimpleLabelOffset());
        assertNotNull(plot.getLabelDistributor());
        assertNotNull(plot.getLegendItemShape());
        assertNotNull(plot.getLegendLabelGenerator());
    }

    @Test
    public void testConstructorWithDataset() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(10));
        PiePlot p = new PiePlot(ds);
        assertSame(ds, p.getDataset());
    }

    // ---------------------------------------------------------------
    // Dataset get/set
    // ---------------------------------------------------------------

    @Test
    public void testSetDataset_ReplacesOldAndNotifies() {
        CountingListener listener = new CountingListener();
        plot.addChangeListener(listener); // assumed Plot API
        DefaultPieDataset ds1 = new DefaultPieDataset();
        ds1.setValue("A", new Double(1));
        plot.setDataset(ds1);
        assertSame(ds1, plot.getDataset());
        assertTrue(listener.count > 0);

        DefaultPieDataset ds2 = new DefaultPieDataset();
        ds2.setValue("B", new Double(2));
        plot.setDataset(ds2);
        assertSame(ds2, plot.getDataset());
    }

    @Test
    public void testSetDataset_Null() {
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    @Test
    public void testPieIndex() {
        plot.setPieIndex(5);
        assertEquals(5, plot.getPieIndex());
    }

    // ---------------------------------------------------------------
    // startAngle / direction
    // ---------------------------------------------------------------

    @Test
    public void testStartAngle() {
        plot.setStartAngle(45.0);
        assertEquals(45.0, plot.getStartAngle(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDirectionNullThrows() {
        plot.setDirection(null);
    }

    @Test
    public void testSetDirectionValid() {
        plot.setDirection(Rotation.ANTICLOCKWISE);
        assertEquals(Rotation.ANTICLOCKWISE, plot.getDirection());
    }

    // ---------------------------------------------------------------
    // interiorGap boundaries
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGap_BelowZeroThrows() {
        plot.setInteriorGap(-0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGap_AboveMaxThrows() {
        plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP + 0.01);
    }

    @Test
    public void testSetInteriorGap_BoundaryZeroAllowed() {
        plot.setInteriorGap(0.0);
        assertEquals(0.0, plot.getInteriorGap(), 0.0001);
    }

    @Test
    public void testSetInteriorGap_BoundaryMaxAllowed() {
        plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP);
        assertEquals(PiePlot.MAX_INTERIOR_GAP, plot.getInteriorGap(), 0.0001);
    }

    @Test
    public void testSetInteriorGap_SameValue_NoNotify() {
        CountingListener listener = new CountingListener();
        double current = plot.getInteriorGap();
        plot.addChangeListener(listener);
        plot.setInteriorGap(current); // same value -> if-branch false, no notify
        assertEquals(0, listener.count);
    }

    @Test
    public void testSetInteriorGap_DifferentValue_Notifies() {
        CountingListener listener = new CountingListener();
        plot.addChangeListener(listener);
        plot.setInteriorGap(0.20);
        assertTrue(listener.count > 0);
    }

    // ---------------------------------------------------------------
    // circular
    // ---------------------------------------------------------------

    @Test
    public void testSetCircular_SingleArgNotifies() {
        CountingListener listener = new CountingListener();
        plot.addChangeListener(listener);
        plot.setCircular(false);
        assertFalse(plot.isCircular());
        assertTrue(listener.count > 0);
    }

    @Test
    public void testSetCircular_NoNotifyFlag() {
        CountingListener listener = new CountingListener();
        plot.addChangeListener(listener);
        plot.setCircular(false, false);
        assertFalse(plot.isCircular());
        assertEquals(0, listener.count);
    }

    // ---------------------------------------------------------------
    // ignoreNullValues / ignoreZeroValues
    // ---------------------------------------------------------------

    @Test
    public void testIgnoreNullValues() {
        plot.setIgnoreNullValues(true);
        assertTrue(plot.getIgnoreNullValues());
    }

    @Test
    public void testIgnoreZeroValues() {
        plot.setIgnoreZeroValues(true);
        assertTrue(plot.getIgnoreZeroValues());
    }

    // ---------------------------------------------------------------
    // lookupSectionPaint
    // ---------------------------------------------------------------

    @Test
    public void testLookupSectionPaint_NoMap_NoAutoPopulate_ReturnsBase() {
        Paint result = plot.lookupSectionPaint("X");
        assertSame(plot.getBaseSectionPaint(), result);
    }

    @Test
    public void testLookupSectionPaint_MapValue_TakesPrecedence() {
        plot.setSectionPaint("X", Color.RED);
        Paint result = plot.lookupSectionPaint("X", true);
        assertEquals(Color.RED, result);
    }

    @Test
    public void testLookupSectionPaint_AutoPopulate_WithDrawingSupplier() {
        // Assumption: Plot has setDrawingSupplier()/getDrawingSupplier() as
        // standard JFreeChart API (getDrawingSupplier() is invoked inside
        // PiePlot source provided).
        DefaultDrawingSupplier supplier = new DefaultDrawingSupplier();
        plot.setDrawingSupplier(supplier);
        Paint result = plot.lookupSectionPaint("Y", true);
        assertNotNull(result);
        // second lookup for same key should now return the cached map value
        assertEquals(result, plot.getSectionPaint("Y"));
    }

    @Test
    public void testLookupSectionPaint_AutoPopulate_NoDrawingSupplier_ReturnsBase() {
        plot.setDrawingSupplier(null);
        Paint result = plot.lookupSectionPaint("Z", true);
        assertSame(plot.getBaseSectionPaint(), result);
    }

    // ---------------------------------------------------------------
    // getSectionKey
    // ---------------------------------------------------------------

    @Test
    public void testGetSectionKey_NoDataset_ReturnsIntegerKey() {
        Comparable key = plot.getSectionKey(3);
        assertEquals(new Integer(3), key);
    }

    @Test
    public void testGetSectionKey_WithDataset_InRange() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(1));
        ds.setValue("B", new Double(2));
        plot.setDataset(ds);
        assertEquals("A", plot.getSectionKey(0));
        assertEquals("B", plot.getSectionKey(1));
    }

    @Test
    public void testGetSectionKey_WithDataset_OutOfRange_ReturnsIntegerKey() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(1));
        plot.setDataset(ds);
        assertEquals(new Integer(5), plot.getSectionKey(5));
        assertEquals(new Integer(-1), plot.getSectionKey(-1));
    }

    // ---------------------------------------------------------------
    // section paint map
    // ---------------------------------------------------------------

    @Test
    public void testSectionPaintGetSet() {
        plot.setSectionPaint("K", Color.BLUE);
        assertEquals(Color.BLUE, plot.getSectionPaint("K"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseSectionPaint_NullThrows() {
        plot.setBaseSectionPaint(null);
    }

    @Test
    public void testBaseSectionPaint_ValidSet() {
        plot.setBaseSectionPaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getBaseSectionPaint());
    }

    // ---------------------------------------------------------------
    // section outlines visible / outline paint / outline stroke
    // ---------------------------------------------------------------

    @Test
    public void testSectionOutlinesVisible() {
        plot.setSectionOutlinesVisible(false);
        assertFalse(plot.getSectionOutlinesVisible());
    }

    @Test
    public void testLookupSectionOutlinePaint_NoMap_ReturnsBase() {
        assertSame(plot.getBaseSectionOutlinePaint(),
                plot.lookupSectionOutlinePaint("X"));
    }

    @Test
    public void testLookupSectionOutlinePaint_MapOverride() {
        plot.setSectionOutlinePaint("X", Color.MAGENTA);
        assertEquals(Color.MAGENTA, plot.lookupSectionOutlinePaint("X", true));
    }

    @Test
    public void testLookupSectionOutlinePaint_AutoPopulate_NoDrawingSupplier() {
        plot.setDrawingSupplier(null);
        assertSame(plot.getBaseSectionOutlinePaint(),
                plot.lookupSectionOutlinePaint("Z", true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseSectionOutlinePaint_NullThrows() {
        plot.setBaseSectionOutlinePaint(null);
    }

    @Test
    public void testSectionOutlinePaintGetSet() {
        plot.setSectionOutlinePaint("K", Color.ORANGE);
        assertEquals(Color.ORANGE, plot.getSectionOutlinePaint("K"));
    }

    @Test
    public void testLookupSectionOutlineStroke_NoMap_ReturnsBase() {
        assertSame(plot.getBaseSectionOutlineStroke(),
                plot.lookupSectionOutlineStroke("X"));
    }

    @Test
    public void testLookupSectionOutlineStroke_MapOverride() {
        BasicStroke s = new BasicStroke(2.0f);
        plot.setSectionOutlineStroke("X", s);
        assertEquals(s, plot.lookupSectionOutlineStroke("X", true));
    }

    @Test
    public void testLookupSectionOutlineStroke_AutoPopulate_NoDrawingSupplier() {
        plot.setDrawingSupplier(null);
        assertSame(plot.getBaseSectionOutlineStroke(),
                plot.lookupSectionOutlineStroke("Z", true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseSectionOutlineStroke_NullThrows() {
        plot.setBaseSectionOutlineStroke(null);
    }

    // ---------------------------------------------------------------
    // shadow paint / offsets
    // ---------------------------------------------------------------

    @Test
    public void testShadowPaint_NullAllowed() {
        plot.setShadowPaint(null);
        assertNull(plot.getShadowPaint());
    }

    @Test
    public void testShadowOffsets() {
        plot.setShadowXOffset(1.5);
        plot.setShadowYOffset(2.5);
        assertEquals(1.5, plot.getShadowXOffset(), 0.0001);
        assertEquals(2.5, plot.getShadowYOffset(), 0.0001);
    }

    // ---------------------------------------------------------------
    // explode percent
    // ---------------------------------------------------------------

    @Test
    public void testExplodePercent_DefaultZero() {
        assertEquals(0.0, plot.getExplodePercent("NoSuchKey"), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetExplodePercent_NullKeyThrows() {
        plot.setExplodePercent(null, 0.2);
    }

    @Test
    public void testSetGetExplodePercent() {
        plot.setExplodePercent("A", 0.3);
        assertEquals(0.3, plot.getExplodePercent("A"), 0.0001);
    }

    /**
     * explodePercentages is backed by a TreeMap; calling get(null) with the
     * natural-ordering comparator throws NullPointerException. This is
     * derived directly from the source (no explicit null check exists in
     * getExplodePercent), not an assumption of new behaviour.
     */
    @Test(expected = NullPointerException.class)
    public void testGetExplodePercent_NullKey_NPE() {
        plot.getExplodePercent(null);
    }

    @Test(expected = NullPointerException.class)
    public void testGetMaximumExplodePercent_NoDataset_NPE() {
        // this.dataset is null by default; getMaximumExplodePercent() calls
        // this.dataset.getKeys() directly without a null check.
        plot.getMaximumExplodePercent();
    }

    @Test
    public void testGetMaximumExplodePercent_WithDataset() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(1));
        ds.setValue("B", new Double(2));
        plot.setDataset(ds);
        plot.setExplodePercent("A", 0.1);
        plot.setExplodePercent("B", 0.4);
        assertEquals(0.4, plot.getMaximumExplodePercent(), 0.0001);
    }

    // ---------------------------------------------------------------
    // label-related getters/setters
    // ---------------------------------------------------------------

    @Test
    public void testLabelGenerator() {
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator();
        plot.setLabelGenerator(gen);
        assertSame(gen, plot.getLabelGenerator());
        plot.setLabelGenerator(null);
        assertNull(plot.getLabelGenerator());
    }

    @Test
    public void testLabelGap() {
        plot.setLabelGap(0.1);
        assertEquals(0.1, plot.getLabelGap(), 0.0001);
    }

    @Test
    public void testMaximumLabelWidth() {
        plot.setMaximumLabelWidth(0.25);
        assertEquals(0.25, plot.getMaximumLabelWidth(), 0.0001);
    }

    @Test
    public void testLabelLinksVisible() {
        plot.setLabelLinksVisible(false);
        assertFalse(plot.getLabelLinksVisible());
    }

    @Test
    public void testLabelLinkMargin() {
        plot.setLabelLinkMargin(0.05);
        assertEquals(0.05, plot.getLabelLinkMargin(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLabelLinkPaint_NullThrows() {
        plot.setLabelLinkPaint(null);
    }

    @Test
    public void testLabelLinkPaint_ValidSet() {
        plot.setLabelLinkPaint(Color.CYAN);
        assertEquals(Color.CYAN, plot.getLabelLinkPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLabelLinkStroke_NullThrows() {
        plot.setLabelLinkStroke(null);
    }

    @Test
    public void testLabelLinkStroke_ValidSet() {
        BasicStroke s = new BasicStroke(1.0f);
        plot.setLabelLinkStroke(s);
        assertEquals(s, plot.getLabelLinkStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLabelFont_NullThrows() {
        plot.setLabelFont(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLabelPaint_NullThrows() {
        plot.setLabelPaint(null);
    }

    @Test
    public void testLabelBackgroundPaint_NullAllowed() {
        plot.setLabelBackgroundPaint(null);
        assertNull(plot.getLabelBackgroundPaint());
    }

    @Test
    public void testLabelOutlinePaint_NullAllowed() {
        plot.setLabelOutlinePaint(null);
        assertNull(plot.getLabelOutlinePaint());
    }

    @Test
    public void testLabelOutlineStroke_NullAllowed() {
        plot.setLabelOutlineStroke(null);
        assertNull(plot.getLabelOutlineStroke());
    }

    @Test
    public void testLabelShadowPaint_NullAllowed() {
        plot.setLabelShadowPaint(null);
        assertNull(plot.getLabelShadowPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLabelPadding_NullThrows() {
        plot.setLabelPadding(null);
    }

    @Test
    public void testLabelPadding_ValidSet() {
        RectangleInsets ri = new RectangleInsets(1, 1, 1, 1);
        plot.setLabelPadding(ri);
        assertEquals(ri, plot.getLabelPadding());
    }

    @Test
    public void testSimpleLabels() {
        plot.setSimpleLabels(true);
        assertTrue(plot.getSimpleLabels());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleLabelOffset_NullThrows() {
        plot.setSimpleLabelOffset(null);
    }

    @Test
    public void testSimpleLabelOffset_ValidSet() {
        RectangleInsets ri = new RectangleInsets(UnitType.RELATIVE, 0.1, 0.1, 0.1, 0.1);
        plot.setSimpleLabelOffset(ri);
        assertEquals(ri, plot.getSimpleLabelOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLabelDistributor_NullThrows() {
        plot.setLabelDistributor(null);
    }

    @Test
    public void testLabelDistributor_ValidSet() {
        PieLabelDistributor d = new PieLabelDistributor(0);
        plot.setLabelDistributor(d);
        assertSame(d, plot.getLabelDistributor());
    }

    @Test
    public void testToolTipGenerator() {
        assertNull(plot.getToolTipGenerator());
    }

    @Test
    public void testURLGenerator() {
        assertNull(plot.getURLGenerator());
    }

    @Test
    public void testMinimumArcAngleToDraw() {
        plot.setMinimumArcAngleToDraw(0.5);
        assertEquals(0.5, plot.getMinimumArcAngleToDraw(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLegendItemShape_NullThrows() {
        plot.setLegendItemShape(null);
    }

    @Test
    public void testLegendItemShape_ValidSet() {
        Shape s = new Ellipse2D.Double(0, 0, 5, 5);
        plot.setLegendItemShape(s);
        assertSame(s, plot.getLegendItemShape());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLegendLabelGenerator_NullThrows() {
        plot.setLegendLabelGenerator(null);
    }

    @Test
    public void testLegendLabelToolTipGenerator() {
        assertNull(plot.getLegendLabelToolTipGenerator());
    }

    @Test
    public void testLegendLabelURLGenerator() {
        assertNull(plot.getLegendLabelURLGenerator());
    }

    @Test
    public void testGetPlotType() {
        String type = plot.getPlotType();
        assertNotNull(type);
        assertTrue(type.length() > 0);
    }

    // ---------------------------------------------------------------
    // getArcBounds
    // ---------------------------------------------------------------

    @Test
    public void testGetArcBounds_ZeroExplode_ReturnsUnexploded() {
        Rectangle2D unexploded = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D exploded = new Rectangle2D.Double(-10, -10, 120, 120);
        Rectangle2D result = plot.getArcBounds(unexploded, exploded, 0.0, 90.0, 0.0);
        assertSame(unexploded, result);
    }

    @Test
    public void testGetArcBounds_NonZeroExplode_SameSize() {
        Rectangle2D unexploded = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D exploded = new Rectangle2D.Double(-10, -10, 120, 120);
        Rectangle2D result = plot.getArcBounds(unexploded, exploded, 0.0, 90.0, 0.5);
        assertNotSame(unexploded, result);
        assertEquals(unexploded.getWidth(), result.getWidth(), 0.0001);
        assertEquals(unexploded.getHeight(), result.getHeight(), 0.0001);
    }

    // ---------------------------------------------------------------
    // getLegendItems
    // ---------------------------------------------------------------

    @Test
    public void testGetLegendItems_NullDataset_EmptyCollection() {
        LegendItemCollection items = plot.getLegendItems();
        assertNotNull(items);
        assertEquals(0, items.getItemCount());
    }

    @Test
    public void testGetLegendItems_DefaultFlags_IncludesZeroAndNull() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(10));   // positive - included
        ds.setValue("B", new Double(0));    // zero - included (ignoreZero=false)
        ds.setValue("C", (Number) null);    // null - included (ignoreNull=false)
        ds.setValue("D", new Double(-5));   // negative - always excluded
        plot.setDataset(ds);

        LegendItemCollection items = plot.getLegendItems();
        assertEquals(3, items.getItemCount());
    }

    @Test
    public void testGetLegendItems_IgnoreZeroValues_ExcludesZero() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(10));
        ds.setValue("B", new Double(0));
        ds.setValue("C", (Number) null);
        plot.setDataset(ds);
        plot.setIgnoreZeroValues(true);

        LegendItemCollection items = plot.getLegendItems();
        assertEquals(2, items.getItemCount()); // A, C
    }

    @Test
    public void testGetLegendItems_IgnoreNullAndZero_OnlyPositive() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(10));
        ds.setValue("B", new Double(0));
        ds.setValue("C", (Number) null);
        plot.setDataset(ds);
        plot.setIgnoreZeroValues(true);
        plot.setIgnoreNullValues(true);

        LegendItemCollection items = plot.getLegendItems();
        assertEquals(1, items.getItemCount()); // only A
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    public void testEquals_ReflexiveNullAndDifferentType() throws Exception {
        assertTrue(plot.equals(plot));
        assertFalse(plot.equals(null));
        assertFalse(plot.equals("not a plot"));
    }

    @Test
    public void testEquals_CloneIsEqual() throws Exception {
        PiePlot clone = (PiePlot) plot.clone();
        assertTrue(plot.equals(clone));
        assertTrue(clone.equals(plot));
    }

    @Test
    public void testEquals_DifferentStartAngle_NotEqual() throws Exception {
        PiePlot clone = (PiePlot) plot.clone();
        clone.setStartAngle(123.0);
        assertFalse(plot.equals(clone));
    }

    @Test
    public void testEquals_DifferentDirection_NotEqual() throws Exception {
        PiePlot clone = (PiePlot) plot.clone();
        clone.setDirection(Rotation.ANTICLOCKWISE);
        assertFalse(plot.equals(clone));
    }

    @Test
    public void testEquals_DifferentIgnoreZeroValues_NotEqual() throws Exception {
        PiePlot clone = (PiePlot) plot.clone();
        clone.setIgnoreZeroValues(true);
        assertFalse(plot.equals(clone));
    }

    @Test
    public void testEquals_DifferentBaseSectionPaint_NotEqual() throws Exception {
        PiePlot clone = (PiePlot) plot.clone();
        clone.setBaseSectionPaint(Color.PINK);
        assertFalse(plot.equals(clone));
    }

    @Test
    public void testEquals_DifferentSectionOutlinesVisible_NotEqual() throws Exception {
        PiePlot clone = (PiePlot) plot.clone();
        clone.setSectionOutlinesVisible(false);
        assertFalse(plot.equals(clone));
    }

    @Test
    public void testEquals_DifferentSimpleLabels_NotEqual() throws Exception {
        PiePlot clone = (PiePlot) plot.clone();
        clone.setSimpleLabels(true);
        assertFalse(plot.equals(clone));
    }

    @Test
    public void testEquals_DifferentMinimumArcAngle_NotEqual() throws Exception {
        PiePlot clone = (PiePlot) plot.clone();
        clone.setMinimumArcAngleToDraw(9.99);
        assertFalse(plot.equals(clone));
    }

    // ---------------------------------------------------------------
    // clone()
    // ---------------------------------------------------------------

    @Test
    public void testClone_DatasetSharedReference() throws Exception {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(5));
        plot.setDataset(ds);
        PiePlot clone = (PiePlot) plot.clone();
        // Source only re-registers listener; the dataset object itself
        // is NOT deep-cloned.
        assertSame(plot.getDataset(), clone.getDataset());
    }

    @Test
    public void testClone_IndependentAfterFieldChange() throws Exception {
        PiePlot clone = (PiePlot) plot.clone();
        clone.setStartAngle(200.0);
        assertEquals(PiePlot.DEFAULT_START_ANGLE, plot.getStartAngle(), 0.0001);
        assertEquals(200.0, clone.getStartAngle(), 0.0001);
    }

    // ---------------------------------------------------------------
    // initialise()
    // ---------------------------------------------------------------

    @Test
    public void testInitialise_WithDataset() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(30));
        ds.setValue("B", new Double(70));
        plot.setDataset(ds);

        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);

        PiePlotState state = plot.initialise(g2, area, plot, null, null);
        assertEquals(100.0, state.getTotal(), 0.0001);
        assertEquals(plot.getStartAngle(), state.getLatestAngle(), 0.0001);
        assertEquals(2, state.getPassesRequired());
    }

    // ---------------------------------------------------------------
    // draw() / drawPie() smoke tests (branch coverage on main flow)
    // ---------------------------------------------------------------

    @Test
    public void testDraw_NullDataset_NoException() {
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.draw(g2, area, null, null, null); // dataset null -> drawNoDataMessage branch
    }

    @Test
    public void testDraw_EmptyDataset_NoException() {
        plot.setDataset(new DefaultPieDataset()); // empty but not null
        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDraw_WithDataset_DefaultSettings_NoException() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(10));
        ds.setValue("B", new Double(20));
        ds.setValue("Zero", new Double(0));   // excluded from drawItem (value>0.0 check)
        ds.setValue("Null", (Number) null);   // skipped in drawItem (n==null -> return)
        plot.setDataset(ds);

        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDraw_SimpleLabelsTrue_NoException() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(10));
        ds.setValue("B", new Double(20));
        plot.setDataset(ds);
        plot.setSimpleLabels(true);

        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDraw_LabelGeneratorNull_NoException() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(10));
        plot.setDataset(ds);
        plot.setLabelGenerator(null); // labelReserve stays 0, drawLabels skips inner block

        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDraw_CircularFalse_NoException() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(10));
        ds.setValue("B", new Double(20));
        plot.setDataset(ds);
        plot.setCircular(false);

        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 150); // non-square
        plot.draw(g2, area, null, null, null);
    }

    @Test
    public void testDraw_DirectionAnticlockwise_NoException() {
        DefaultPieDataset ds = new DefaultPieDataset();
        ds.setValue("A", new Double(10));
        ds.setValue("B", new Double(20));
        plot.setDataset(ds);
        plot.setDirection(Rotation.ANTICLOCKWISE);

        Graphics2D g2 = createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        plot.draw(g2, area, null, null, null);
    }

    /*
     * NOTE: The "else { throw new IllegalStateException(...) }" branch inside
     * drawItem() (for an unrecognised Rotation) cannot be exercised through
     * the public API because Rotation only exposes CLOCKWISE and
     * ANTICLOCKWISE constants. Testing it would require unsafe reflection to
     * fabricate a third Rotation instance, which is out of scope here.
     */

    // ---------------------------------------------------------------
    // helpers
    // ---------------------------------------------------------------

    private Graphics2D createGraphics() {
        BufferedImage img = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        return img.createGraphics();
    }
}

package org.jfree.chart.plot;

import org.junit.Test;
import java.awt.Font;
import javax.swing.plaf.FontUIResource;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DatasetGroup;
import java.util.Locale;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.awt.image.BufferedImage;
import java.awt.TexturePaint;
import java.awt.BasicStroke;
import org.jfree.data.DefaultKeyedValues;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.event.EventListenerList;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.PaintMap;
import java.awt.Color;
import org.jfree.chart.StrokeMap;
import java.util.TreeMap;
import org.jfree.chart.util.ObjectList;
import java.text.DecimalFormat;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.UnitType;
import java.awt.geom.Ellipse2D;
import java.lang.reflect.Method;
import java.util.PropertyResourceBundle;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Polygon;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.io.ObjectOutputStream;
import org.jfree.chart.event.ChartChangeEventType;
import org.jfree.data.time.SimpleTimePeriod;
import java.util.LinkedHashMap;
import java.time.format.ResolverStyle;
import java.awt.SystemColor;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartColor;
import java.time.chrono.IsoEra;
import java.awt.RadialGradientPaint;
import javax.swing.plaf.ColorUIResource;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import java.text.NumberFormat;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.urls.StandardPieURLGenerator;
import org.jfree.chart.urls.PieURLGenerator;
import org.jfree.chart.urls.CustomPieURLGenerator;
import org.jfree.chart.labels.PieToolTipGenerator;
import java.util.List;
import java.net.Authenticator.RequestorType;
import java.net.Authenticator;
import org.jfree.data.general.PieDataset;
import java.awt.LinearGradientPaint;
import java.util.Map;
import java.awt.Rectangle;
import org.jfree.chart.ChartRenderingInfo;
import java.awt.Point;
import java.awt.Dimension;
import org.jfree.data.category.DefaultCategoryDataset;
import sun.java2d.SunGraphics2D;
import sun.java2d.loops.XORComposite;
import sun.print.ProxyGraphics2D;
import java.awt.AlphaComposite;
import org.jfree.chart.LegendItemCollection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public final class org_jfree_chart_plot_PiePlotTest {
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        boolean actual = piePlot.equals(piePlot);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof PiePlot)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfPiePlot() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        boolean actual = piePlot.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof PiePlot)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfPiePlot() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        RingPlot ringPlot = ((RingPlot) createInstance("org.jfree.chart.plot.RingPlot"));
        String noDataMessage = "";
        ringPlot.setNoDataMessage(noDataMessage);
        
        boolean actual = piePlot.equals(ringPlot);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof PiePlot)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfPiePlot_1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        String noDataMessage = " ";
        piePlot.setNoDataMessage(noDataMessage);
        PiePlot3D piePlot3D = ((PiePlot3D) createInstance("org.jfree.chart.plot.PiePlot3D"));
        
        boolean actual = piePlot.equals(piePlot3D);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof PiePlot)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfPiePlot_2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        Font noDataMessageFont = ((Font) createInstance("java.awt.Font"));
        setField(noDataMessageFont, "java.awt.Font", "size", -1);
        piePlot.setNoDataMessageFont(noDataMessageFont);
        RingPlot ringPlot = ((RingPlot) createInstance("org.jfree.chart.plot.RingPlot"));
        FontUIResource noDataMessageFont1 = ((FontUIResource) createInstance("javax.swing.plaf.FontUIResource"));
        ringPlot.setNoDataMessageFont(noDataMessageFont1);
        
        boolean actual = piePlot.equals(ringPlot);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        String noDataMessage = "";
        piePlot.setNoDataMessage(noDataMessage);
        RingPlot ringPlot = ((RingPlot) createInstance("org.jfree.chart.plot.RingPlot"));
        String noDataMessage1 = "";
        ringPlot.setNoDataMessage(noDataMessage1);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.equals] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.equals(Plot.java:1228)
            org.jfree.chart.plot.PiePlot.equals(PiePlot.java:2804) */
        piePlot.equals(ringPlot);
    }
    
    @Test
    public void testEquals2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        RingPlot ringPlot = ((RingPlot) createInstance("org.jfree.chart.plot.RingPlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.equals] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.equals(Plot.java:1228)
            org.jfree.chart.plot.PiePlot.equals(PiePlot.java:2804) */
        piePlot.equals(ringPlot);
    }
    ///endregion
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.clone
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#clone()}
 * @utbot.invokes {@link org.jfree.chart.plot.Plot#clone()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: PiePlot clone = (PiePlot) super.clone();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClone_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.clone();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#clone()}
     */
    @Test
    public void testClone() throws Exception  {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 3.85186E-34f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        PiePlot actual = ((PiePlot) piePlot.clone());
        
        PiePlot expected = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        DefaultKeyedValuesDataset dataset = ((DefaultKeyedValuesDataset) createInstance("org.jfree.data.general.DefaultKeyedValuesDataset"));
        DefaultKeyedValues data = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        ArrayList keys = new ArrayList();
        setField(data, "org.jfree.data.DefaultKeyedValues", "keys", keys);
        ArrayList values = new ArrayList();
        setField(data, "org.jfree.data.DefaultKeyedValues", "values", values);
        HashMap indexMap = new HashMap();
        setField(data, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        setField(dataset, "org.jfree.data.general.DefaultPieDataset", "data", data);
        DatasetGroup group = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        String id = "10";
        setField(group, "org.jfree.data.general.DatasetGroup", "id", id);
        dataset.setGroup(group);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(dataset, "org.jfree.data.general.AbstractDataset", "listenerList", listenerList);
        expected.setDataset(dataset);
        expected.setPieIndex(-1);
        expected.setInteriorGap(0.08);
        expected.setCircular(true);
        expected.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Rotation direction = ((Rotation) createInstance("org.jfree.chart.util.Rotation"));
        String name = "Rotation.CLOCKWISE";
        setField(direction, "org.jfree.chart.util.Rotation", "name", name);
        setField(direction, "org.jfree.chart.util.Rotation", "factor", -1.0);
        expected.setDirection(direction);
        PaintMap sectionPaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        HashMap store = new HashMap();
        setField(sectionPaintMap, "org.jfree.chart.PaintMap", "store", store);
        setField(expected, "org.jfree.chart.plot.PiePlot", "sectionPaintMap", sectionPaintMap);
        Color baseSectionPaint = ((Color) createInstance("java.awt.Color"));
        expected.setBaseSectionPaint(baseSectionPaint);
        expected.setSectionOutlinesVisible(true);
        PaintMap sectionOutlinePaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        HashMap store1 = new HashMap();
        setField(sectionOutlinePaintMap, "org.jfree.chart.PaintMap", "store", store1);
        setField(expected, "org.jfree.chart.plot.PiePlot", "sectionOutlinePaintMap", sectionOutlinePaintMap);
        Color baseSectionOutlinePaint = ((Color) createInstance("java.awt.Color"));
        expected.setBaseSectionOutlinePaint(baseSectionOutlinePaint);
        StrokeMap sectionOutlineStrokeMap = ((StrokeMap) createInstance("org.jfree.chart.StrokeMap"));
        TreeMap store2 = new TreeMap();
        setField(sectionOutlineStrokeMap, "org.jfree.chart.StrokeMap", "store", store2);
        setField(expected, "org.jfree.chart.plot.PiePlot", "sectionOutlineStrokeMap", sectionOutlineStrokeMap);
        BasicStroke baseSectionOutlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        expected.setBaseSectionOutlineStroke(baseSectionOutlineStroke);
        Color shadowPaint = ((Color) createInstance("java.awt.Color"));
        expected.setShadowPaint(shadowPaint);
        expected.setShadowXOffset(4.0);
        expected.setShadowYOffset(0.0);
        TreeMap explodePercentages = new TreeMap();
        setField(expected, "org.jfree.chart.plot.PiePlot", "explodePercentages", explodePercentages);
        StandardPieSectionLabelGenerator labelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
        ObjectList attributedLabels = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null};
        setField(attributedLabels, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(attributedLabels, "org.jfree.chart.util.AbstractObjectList", "increment", 8);
        setField(labelGenerator, "org.jfree.chart.labels.StandardPieSectionLabelGenerator", "attributedLabels", attributedLabels);
        String labelFormat = "{0}";
        setField(labelGenerator, "org.jfree.chart.labels.AbstractPieItemLabelGenerator", "labelFormat", labelFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(labelGenerator, "org.jfree.chart.labels.AbstractPieItemLabelGenerator", "numberFormat", numberFormat);
        DecimalFormat percentFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(labelGenerator, "org.jfree.chart.labels.AbstractPieItemLabelGenerator", "percentFormat", percentFormat);
        expected.setLabelGenerator(labelGenerator);
        Font labelFont = ((Font) createInstance("java.awt.Font"));
        expected.setLabelFont(labelFont);
        Color labelPaint = ((Color) createInstance("java.awt.Color"));
        expected.setLabelPaint(labelPaint);
        Color labelBackgroundPaint = ((Color) createInstance("java.awt.Color"));
        expected.setLabelBackgroundPaint(labelBackgroundPaint);
        Color labelOutlinePaint = ((Color) createInstance("java.awt.Color"));
        expected.setLabelOutlinePaint(labelOutlinePaint);
        BasicStroke labelOutlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        expected.setLabelOutlineStroke(labelOutlineStroke);
        Color labelShadowPaint = ((Color) createInstance("java.awt.Color"));
        expected.setLabelShadowPaint(labelShadowPaint);
        RectangleInsets labelPadding = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        UnitType unitType = ((UnitType) createInstance("org.jfree.chart.util.UnitType"));
        String name1 = "UnitType.ABSOLUTE";
        setField(unitType, "org.jfree.chart.util.UnitType", "name", name1);
        setField(labelPadding, "org.jfree.chart.util.RectangleInsets", "unitType", unitType);
        setField(labelPadding, "org.jfree.chart.util.RectangleInsets", "top", 2.0);
        setField(labelPadding, "org.jfree.chart.util.RectangleInsets", "left", 2.0);
        setField(labelPadding, "org.jfree.chart.util.RectangleInsets", "bottom", 2.0);
        setField(labelPadding, "org.jfree.chart.util.RectangleInsets", "right", 2.0);
        expected.setLabelPadding(labelPadding);
        RectangleInsets simpleLabelOffset = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        UnitType unitType1 = ((UnitType) createInstance("org.jfree.chart.util.UnitType"));
        String name2 = "UnitType.RELATIVE";
        setField(unitType1, "org.jfree.chart.util.UnitType", "name", name2);
        setField(simpleLabelOffset, "org.jfree.chart.util.RectangleInsets", "unitType", unitType1);
        setField(simpleLabelOffset, "org.jfree.chart.util.RectangleInsets", "top", 0.18);
        setField(simpleLabelOffset, "org.jfree.chart.util.RectangleInsets", "left", 0.18);
        setField(simpleLabelOffset, "org.jfree.chart.util.RectangleInsets", "bottom", 0.18);
        setField(simpleLabelOffset, "org.jfree.chart.util.RectangleInsets", "right", 0.18);
        expected.setSimpleLabelOffset(simpleLabelOffset);
        expected.setMaximumLabelWidth(0.14);
        expected.setLabelGap(0.025);
        expected.setLabelLinkMargin(0.025);
        Color labelLinkPaint = ((Color) createInstance("java.awt.Color"));
        expected.setLabelLinkPaint(labelLinkPaint);
        BasicStroke labelLinkStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        expected.setLabelLinkStroke(labelLinkStroke);
        PieLabelDistributor labelDistributor = ((PieLabelDistributor) createInstance("org.jfree.chart.plot.PieLabelDistributor"));
        setField(labelDistributor, "org.jfree.chart.plot.PieLabelDistributor", "minGap", 4.0);
        ArrayList labels = new ArrayList();
        setField(labelDistributor, "org.jfree.chart.plot.AbstractPieLabelDistributor", "labels", labels);
        expected.setLabelDistributor(labelDistributor);
        StandardPieSectionLabelGenerator legendLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
        ObjectList attributedLabels1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = {null, null, null, null, null, null, null, null};
        setField(attributedLabels1, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(attributedLabels1, "org.jfree.chart.util.AbstractObjectList", "increment", 8);
        setField(legendLabelGenerator, "org.jfree.chart.labels.StandardPieSectionLabelGenerator", "attributedLabels", attributedLabels1);
        String labelFormat1 = "";
        setField(legendLabelGenerator, "org.jfree.chart.labels.AbstractPieItemLabelGenerator", "labelFormat", labelFormat1);
        DecimalFormat numberFormat1 = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(legendLabelGenerator, "org.jfree.chart.labels.AbstractPieItemLabelGenerator", "numberFormat", numberFormat1);
        DecimalFormat percentFormat1 = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(legendLabelGenerator, "org.jfree.chart.labels.AbstractPieItemLabelGenerator", "percentFormat", percentFormat1);
        expected.setLegendLabelGenerator(legendLabelGenerator);
        StandardPieSectionLabelGenerator legendLabelToolTipGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
        ObjectList attributedLabels2 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects2 = {null, null, null, null, null, null, null, null};
        setField(attributedLabels2, "org.jfree.chart.util.AbstractObjectList", "objects", objects2);
        setField(attributedLabels2, "org.jfree.chart.util.AbstractObjectList", "increment", 8);
        setField(legendLabelToolTipGenerator, "org.jfree.chart.labels.StandardPieSectionLabelGenerator", "attributedLabels", attributedLabels2);
        setField(legendLabelToolTipGenerator, "org.jfree.chart.labels.AbstractPieItemLabelGenerator", "labelFormat", labelFormat);
        DecimalFormat numberFormat2 = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(legendLabelToolTipGenerator, "org.jfree.chart.labels.AbstractPieItemLabelGenerator", "numberFormat", numberFormat2);
        DecimalFormat percentFormat2 = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(legendLabelToolTipGenerator, "org.jfree.chart.labels.AbstractPieItemLabelGenerator", "percentFormat", percentFormat2);
        expected.setLegendLabelToolTipGenerator(legendLabelToolTipGenerator);
        java.awt.geom.Ellipse2D.Double legendItemShape = ((java.awt.geom.Ellipse2D.Double) createInstance("java.awt.geom.Ellipse2D$Double"));
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class legendItemShapeType = Class.forName("java.awt.Shape");
        Method setLegendItemShapeMethod = piePlotClazz.getDeclaredMethod("setLegendItemShape", legendItemShapeType);
        setLegendItemShapeMethod.setAccessible(true);
        java.lang.Object[] setLegendItemShapeMethodArguments = new java.lang.Object[1];
        setLegendItemShapeMethodArguments[0] = legendItemShape;
        setLegendItemShapeMethod.invoke(expected, setLegendItemShapeMethodArguments);
        expected.setMinimumArcAngleToDraw(1.0E-5);
        PropertyResourceBundle localizationResources = ((PropertyResourceBundle) createInstance("java.util.PropertyResourceBundle"));
        setField(expected, "org.jfree.chart.plot.PiePlot", "localizationResources", localizationResources);
        DatasetGroup datasetGroup2 = ((DatasetGroup) createInstance("org.jfree.data.general.DatasetGroup"));
        setField(datasetGroup2, "org.jfree.data.general.DatasetGroup", "id", id);
        expected.setDatasetGroup(datasetGroup2);
        Font noDataMessageFont = ((Font) createInstance("java.awt.Font"));
        expected.setNoDataMessageFont(noDataMessageFont);
        Color noDataMessagePaint = ((Color) createInstance("java.awt.Color"));
        expected.setNoDataMessagePaint(noDataMessagePaint);
        RectangleInsets insets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
        setField(insets, "org.jfree.chart.util.RectangleInsets", "unitType", unitType);
        setField(insets, "org.jfree.chart.util.RectangleInsets", "top", 4.0);
        setField(insets, "org.jfree.chart.util.RectangleInsets", "left", 8.0);
        setField(insets, "org.jfree.chart.util.RectangleInsets", "bottom", 4.0);
        setField(insets, "org.jfree.chart.util.RectangleInsets", "right", 8.0);
        expected.setInsets(insets);
        expected.setOutlineVisible(true);
        BasicStroke outlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        expected.setOutlineStroke(outlineStroke);
        Color outlinePaint = ((Color) createInstance("java.awt.Color"));
        expected.setOutlinePaint(outlinePaint);
        Color backgroundPaint = ((Color) createInstance("java.awt.Color"));
        expected.setBackgroundPaint(backgroundPaint);
        expected.setBackgroundImageAlignment(15);
        expected.setBackgroundImageAlpha(0.5f);
        expected.setForegroundAlpha(1.0f);
        expected.setBackgroundAlpha(1.0f);
        DefaultDrawingSupplier drawingSupplier = ((DefaultDrawingSupplier) createInstance("org.jfree.chart.plot.DefaultDrawingSupplier"));
        java.awt.Paint[] paintSequence = new java.awt.Paint[34];
        Color color = ((Color) createInstance("java.awt.Color"));
        paintSequence[0] = ((Paint) color);
        Color color1 = ((Color) createInstance("java.awt.Color"));
        paintSequence[1] = ((Paint) color1);
        Color color2 = ((Color) createInstance("java.awt.Color"));
        paintSequence[2] = ((Paint) color2);
        Color color3 = ((Color) createInstance("java.awt.Color"));
        paintSequence[3] = ((Paint) color3);
        Color color4 = ((Color) createInstance("java.awt.Color"));
        paintSequence[4] = ((Paint) color4);
        Color color5 = ((Color) createInstance("java.awt.Color"));
        paintSequence[5] = ((Paint) color5);
        Color color6 = ((Color) createInstance("java.awt.Color"));
        paintSequence[6] = ((Paint) color6);
        Color color7 = ((Color) createInstance("java.awt.Color"));
        paintSequence[7] = ((Paint) color7);
        Color color8 = ((Color) createInstance("java.awt.Color"));
        paintSequence[8] = ((Paint) color8);
        Color color9 = ((Color) createInstance("java.awt.Color"));
        paintSequence[9] = ((Paint) color9);
        Color color10 = ((Color) createInstance("java.awt.Color"));
        paintSequence[10] = ((Paint) color10);
        Color color11 = ((Color) createInstance("java.awt.Color"));
        paintSequence[11] = ((Paint) color11);
        Color color12 = ((Color) createInstance("java.awt.Color"));
        paintSequence[12] = ((Paint) color12);
        Color color13 = ((Color) createInstance("java.awt.Color"));
        paintSequence[13] = ((Paint) color13);
        Color color14 = ((Color) createInstance("java.awt.Color"));
        paintSequence[14] = ((Paint) color14);
        Color color15 = ((Color) createInstance("java.awt.Color"));
        paintSequence[15] = ((Paint) color15);
        Color color16 = ((Color) createInstance("java.awt.Color"));
        paintSequence[16] = ((Paint) color16);
        Color color17 = ((Color) createInstance("java.awt.Color"));
        paintSequence[17] = ((Paint) color17);
        Color color18 = ((Color) createInstance("java.awt.Color"));
        paintSequence[18] = ((Paint) color18);
        Color color19 = ((Color) createInstance("java.awt.Color"));
        paintSequence[19] = ((Paint) color19);
        Color color20 = ((Color) createInstance("java.awt.Color"));
        paintSequence[20] = ((Paint) color20);
        Color color21 = ((Color) createInstance("java.awt.Color"));
        paintSequence[21] = ((Paint) color21);
        Color color22 = ((Color) createInstance("java.awt.Color"));
        paintSequence[22] = ((Paint) color22);
        Color color23 = ((Color) createInstance("java.awt.Color"));
        paintSequence[23] = ((Paint) color23);
        Color color24 = ((Color) createInstance("java.awt.Color"));
        paintSequence[24] = ((Paint) color24);
        Color color25 = ((Color) createInstance("java.awt.Color"));
        paintSequence[25] = ((Paint) color25);
        Color color26 = ((Color) createInstance("java.awt.Color"));
        paintSequence[26] = ((Paint) color26);
        Color color27 = ((Color) createInstance("java.awt.Color"));
        paintSequence[27] = ((Paint) color27);
        Color color28 = ((Color) createInstance("java.awt.Color"));
        paintSequence[28] = ((Paint) color28);
        Color color29 = ((Color) createInstance("java.awt.Color"));
        paintSequence[29] = ((Paint) color29);
        Color color30 = ((Color) createInstance("java.awt.Color"));
        paintSequence[30] = ((Paint) color30);
        Color color31 = ((Color) createInstance("java.awt.Color"));
        paintSequence[31] = ((Paint) color31);
        Color color32 = ((Color) createInstance("java.awt.Color"));
        paintSequence[32] = ((Paint) color32);
        Color color33 = ((Color) createInstance("java.awt.Color"));
        paintSequence[33] = ((Paint) color33);
        setField(drawingSupplier, "org.jfree.chart.plot.DefaultDrawingSupplier", "paintSequence", paintSequence);
        java.awt.Paint[] outlinePaintSequence = new java.awt.Paint[1];
        Color color34 = ((Color) createInstance("java.awt.Color"));
        outlinePaintSequence[0] = ((Paint) color34);
        setField(drawingSupplier, "org.jfree.chart.plot.DefaultDrawingSupplier", "outlinePaintSequence", outlinePaintSequence);
        java.awt.Paint[] fillPaintSequence = new java.awt.Paint[1];
        Color color35 = ((Color) createInstance("java.awt.Color"));
        fillPaintSequence[0] = ((Paint) color35);
        setField(drawingSupplier, "org.jfree.chart.plot.DefaultDrawingSupplier", "fillPaintSequence", fillPaintSequence);
        java.awt.Stroke[] strokeSequence = new java.awt.Stroke[1];
        BasicStroke basicStroke1 = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        strokeSequence[0] = ((Stroke) basicStroke1);
        setField(drawingSupplier, "org.jfree.chart.plot.DefaultDrawingSupplier", "strokeSequence", strokeSequence);
        java.awt.Stroke[] outlineStrokeSequence = new java.awt.Stroke[1];
        BasicStroke basicStroke2 = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        outlineStrokeSequence[0] = ((Stroke) basicStroke2);
        setField(drawingSupplier, "org.jfree.chart.plot.DefaultDrawingSupplier", "outlineStrokeSequence", outlineStrokeSequence);
        java.awt.Shape[] shapeSequence = new java.awt.Shape[10];
        java.awt.geom.Rectangle2D.Double double1 = ((java.awt.geom.Rectangle2D.Double) createInstance("java.awt.geom.Rectangle2D$Double"));
        shapeSequence[0] = ((Shape) double1);
        java.awt.geom.Ellipse2D.Double double2 = ((java.awt.geom.Ellipse2D.Double) createInstance("java.awt.geom.Ellipse2D$Double"));
        shapeSequence[1] = ((Shape) double2);
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        shapeSequence[2] = ((Shape) polygon);
        Polygon polygon1 = ((Polygon) createInstance("java.awt.Polygon"));
        shapeSequence[3] = ((Shape) polygon1);
        java.awt.geom.Rectangle2D.Double double3 = ((java.awt.geom.Rectangle2D.Double) createInstance("java.awt.geom.Rectangle2D$Double"));
        shapeSequence[4] = ((Shape) double3);
        Polygon polygon2 = ((Polygon) createInstance("java.awt.Polygon"));
        shapeSequence[5] = ((Shape) polygon2);
        java.awt.geom.Ellipse2D.Double double4 = ((java.awt.geom.Ellipse2D.Double) createInstance("java.awt.geom.Ellipse2D$Double"));
        shapeSequence[6] = ((Shape) double4);
        Polygon polygon3 = ((Polygon) createInstance("java.awt.Polygon"));
        shapeSequence[7] = ((Shape) polygon3);
        java.awt.geom.Rectangle2D.Double double5 = ((java.awt.geom.Rectangle2D.Double) createInstance("java.awt.geom.Rectangle2D$Double"));
        shapeSequence[8] = ((Shape) double5);
        Polygon polygon4 = ((Polygon) createInstance("java.awt.Polygon"));
        shapeSequence[9] = ((Shape) polygon4);
        setField(drawingSupplier, "org.jfree.chart.plot.DefaultDrawingSupplier", "shapeSequence", shapeSequence);
        expected.setDrawingSupplier(drawingSupplier);
        EventListenerList listenerList1 = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.chart.plot.Plot", "listenerList", listenerList1);
        
        // org.jfree.chart.plot.PiePlot has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.readObject] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.readObject(PiePlot.java:3020) */
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = piePlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(piePlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 255);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 256);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = piePlotClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(piePlot, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readObject
    
    public void testReadObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.writeObject] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.writeObject(PiePlot.java:2995) */
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = piePlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(piePlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = piePlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(piePlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    @Test(expected = NotActiveException.class)
    public void testWriteObject1() throws Throwable  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = piePlotClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(piePlot, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setIgnoreZeroValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setIgnoreZeroValues(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setIgnoreZeroValues(boolean)}
 *  */
    @Test
    public void testSetIgnoreZeroValues() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setIgnoreZeroValues(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setIgnoreZeroValues(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetIgnoreZeroValues_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setIgnoreZeroValues(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setIgnoreZeroValues(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setIgnoreZeroValues(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetIgnoreZeroValues_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setIgnoreZeroValues] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setIgnoreZeroValues(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setIgnoreZeroValues(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setIgnoreZeroValues(boolean)}
     */
    @Test
    public void testSetIgnoreZeroValues1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setIgnoreZeroValues(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setSectionOutlinePaint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSectionOutlinePaint(java.lang.Comparable, java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSectionOutlinePaint(java.lang.Comparable,java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.PaintMap#put(java.lang.Comparable,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.sectionOutlinePaintMap.put(key, paint);
 *  */
    @Test
    public void testSetSectionOutlinePaint_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.setSectionOutlinePaint] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.setSectionOutlinePaint(PiePlot.java:1085) */
        piePlot.setSectionOutlinePaint(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSectionOutlinePaint(java.lang.Comparable, java.awt.Paint)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSectionOutlinePaint(java.lang.Comparable,java.awt.Paint)}
     */
    @Test
    public void testSetSectionOutlinePaint() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.NEGATIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(-1L, -1L);
        Color color = new Color(Integer.MAX_VALUE, true);
        
        piePlot.setSectionOutlinePaint(simpleTimePeriod, color);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSectionOutlinePaint(java.lang.Comparable, java.awt.Paint)
    
    @Test
    public void testSetSectionOutlinePaint1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PaintMap sectionOutlinePaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        LinkedHashMap store = new LinkedHashMap();
        setField(sectionOutlinePaintMap, "org.jfree.chart.PaintMap", "store", store);
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionOutlinePaintMap", sectionOutlinePaintMap);
        Character character = '\u0000';
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.setSectionOutlinePaint] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:890)
            org.jfree.chart.plot.PiePlot.setSectionOutlinePaint(PiePlot.java:1086) */
        piePlot.setSectionOutlinePaint(character, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getSectionOutlineStroke
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSectionOutlineStroke(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getSectionOutlineStroke(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.chart.StrokeMap#getStroke(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.sectionOutlineStrokeMap.getStroke(key);
 *  */
    @Test
    public void testGetSectionOutlineStroke_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.getSectionOutlineStroke] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.getSectionOutlineStroke(PiePlot.java:1201) */
        piePlot.getSectionOutlineStroke(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSectionOutlineStroke(java.lang.Comparable)
    
    @Test
    public void testGetSectionOutlineStroke1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        StrokeMap sectionOutlineStrokeMap = ((StrokeMap) createInstance("org.jfree.chart.StrokeMap"));
        LinkedHashMap store = new LinkedHashMap();
        setField(sectionOutlineStrokeMap, "org.jfree.chart.StrokeMap", "store", store);
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionOutlineStrokeMap", sectionOutlineStrokeMap);
        Class basicTypeClazz = Class.forName("java.lang.invoke.LambdaForm$BasicType");
        Object basicType = getEnumConstantByName(basicTypeClazz, "L_TYPE");
        
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class basicTypeType = Class.forName("java.lang.Comparable");
        Method getSectionOutlineStrokeMethod = piePlotClazz.getDeclaredMethod("getSectionOutlineStroke", basicTypeType);
        getSectionOutlineStrokeMethod.setAccessible(true);
        java.lang.Object[] getSectionOutlineStrokeMethodArguments = new java.lang.Object[1];
        getSectionOutlineStrokeMethodArguments[0] = basicType;
        Stroke actual = ((Stroke) getSectionOutlineStrokeMethod.invoke(piePlot, getSectionOutlineStrokeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getSectionOutlineStroke
    
    public void testGetSectionOutlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getSectionOutlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSectionOutlinesVisible()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getSectionOutlinesVisible()}
 * @utbot.returnsFrom {@code return this.sectionOutlinesVisible;}
 *  */
    @Test
    public void testGetSectionOutlinesVisible_ReturnThisSectionOutlinesVisible() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        boolean actual = piePlot.getSectionOutlinesVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lookupSectionOutlinePaint(java.lang.Comparable)
    
    @Test
    public void testLookupSectionOutlinePaint1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PaintMap sectionOutlinePaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        LinkedHashMap store = new LinkedHashMap();
        setField(sectionOutlinePaintMap, "org.jfree.chart.PaintMap", "store", store);
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionOutlinePaintMap", sectionOutlinePaintMap);
        PieLabelRecord pieLabelRecord = new PieLabelRecord(null, 0.0, 0.0, null, 0.0, 0.0, 0.0);
        
        Paint actual = piePlot.lookupSectionOutlinePaint(pieLabelRecord);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lookupSectionOutlinePaint(java.lang.Comparable, boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#lookupSectionOutlinePaint(java.lang.Comparable,boolean)}
 * @utbot.invokes {@link org.jfree.chart.PaintMap#getPaint(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = this.sectionOutlinePaintMap.getPaint(key);
 *  */
    @Test
    public void testLookupSectionOutlinePaint_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.lookupSectionOutlinePaint(PiePlot.java:1026) */
        piePlot.lookupSectionOutlinePaint(null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lookupSectionOutlinePaint(java.lang.Comparable, boolean)
    
    @Test
    public void testLookupSectionOutlinePaint2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PaintMap sectionOutlinePaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        LinkedHashMap store = new LinkedHashMap();
        setField(sectionOutlinePaintMap, "org.jfree.chart.PaintMap", "store", store);
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionOutlinePaintMap", sectionOutlinePaintMap);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class resolverStyleType = Class.forName("java.lang.Comparable");
        Class booleanType = boolean.class;
        Method lookupSectionOutlinePaintMethod = piePlotClazz.getDeclaredMethod("lookupSectionOutlinePaint", resolverStyleType, booleanType);
        lookupSectionOutlinePaintMethod.setAccessible(true);
        java.lang.Object[] lookupSectionOutlinePaintMethodArguments = new java.lang.Object[2];
        lookupSectionOutlinePaintMethodArguments[0] = resolverStyle;
        lookupSectionOutlinePaintMethodArguments[1] = false;
        Paint actual = ((Paint) lookupSectionOutlinePaintMethod.invoke(piePlot, lookupSectionOutlinePaintMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setMaximumLabelWidth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaximumLabelWidth(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setMaximumLabelWidth(double)}
 *  */
    @Test
    public void testSetMaximumLabelWidth() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setMaximumLabelWidth(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setMaximumLabelWidth(java.lang.Double.NaN);
            
            double finalPiePlotMaximumLabelWidth = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "maximumLabelWidth"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotMaximumLabelWidth, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setMaximumLabelWidth(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetMaximumLabelWidth_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setMaximumLabelWidth(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setMaximumLabelWidth(java.lang.Double.NaN);
            
            double finalPiePlotMaximumLabelWidth = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "maximumLabelWidth"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotMaximumLabelWidth, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setMaximumLabelWidth(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setMaximumLabelWidth(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetMaximumLabelWidth_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setMaximumLabelWidth(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setMaximumLabelWidth] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setMaximumLabelWidth(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setMaximumLabelWidth(double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setMaximumLabelWidth(double)}
     */
    @Test
    public void testSetMaximumLabelWidthWithCornerCase() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setMaximumLabelWidth(java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelLinksVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelLinksVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinksVisible(boolean)}
 *  */
    @Test
    public void testSetLabelLinksVisible() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelLinksVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinksVisible(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelLinksVisible_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelLinksVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelLinksVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinksVisible(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelLinksVisible_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelLinksVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelLinksVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setLabelLinksVisible(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinksVisible(boolean)}
     */
    @Test
    public void testSetLabelLinksVisible1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setLabelLinksVisible(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelOutlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelOutlinePaint()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelOutlinePaint()}
 * @utbot.returnsFrom {@code return this.labelOutlinePaint;}
 *  */
    @Test
    public void testGetLabelOutlinePaint_ReturnThisLabelOutlinePaint() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Paint actual = piePlot.getLabelOutlinePaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelShadowPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelShadowPaint()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelShadowPaint()}
 * @utbot.returnsFrom {@code return this.labelShadowPaint;}
 *  */
    @Test
    public void testGetLabelShadowPaint_ReturnThisLabelShadowPaint() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Paint actual = piePlot.getLabelShadowPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setSectionOutlineStroke
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSectionOutlineStroke(java.lang.Comparable, java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSectionOutlineStroke(java.lang.Comparable,java.awt.Stroke)}
 * @utbot.invokes {@link org.jfree.chart.StrokeMap#put(java.lang.Comparable,java.awt.Stroke)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.sectionOutlineStrokeMap.put(key, stroke);
 *  */
    @Test
    public void testSetSectionOutlineStroke_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.setSectionOutlineStroke] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.setSectionOutlineStroke(PiePlot.java:1220) */
        piePlot.setSectionOutlineStroke(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSectionOutlineStroke(java.lang.Comparable, java.awt.Stroke)
    
    @Test
    public void testSetSectionOutlineStroke1() throws Throwable  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        StrokeMap sectionOutlineStrokeMap = ((StrokeMap) createInstance("org.jfree.chart.StrokeMap"));
        LinkedHashMap store = new LinkedHashMap();
        setField(sectionOutlineStrokeMap, "org.jfree.chart.StrokeMap", "store", store);
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionOutlineStrokeMap", sectionOutlineStrokeMap);
        Class operatorClazz = Class.forName("sun.security.util.DisabledAlgorithmConstraints$Constraint$Operator");
        Object operator = getEnumConstantByName(operatorClazz, "EQ");
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.setSectionOutlineStroke] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:890)
            org.jfree.chart.plot.PiePlot.setSectionOutlineStroke(PiePlot.java:1221) */
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class operatorType = Class.forName("java.lang.Comparable");
        Class strokeType = Class.forName("java.awt.Stroke");
        Method setSectionOutlineStrokeMethod = piePlotClazz.getDeclaredMethod("setSectionOutlineStroke", operatorType, strokeType);
        setSectionOutlineStrokeMethod.setAccessible(true);
        java.lang.Object[] setSectionOutlineStrokeMethodArguments = new java.lang.Object[2];
        setSectionOutlineStrokeMethodArguments[0] = operator;
        setSectionOutlineStrokeMethodArguments[1] = ((Object) null);
        try {
            setSectionOutlineStrokeMethod.invoke(piePlot, setSectionOutlineStrokeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelLinksVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelLinksVisible()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelLinksVisible()}
 * @utbot.returnsFrom {@code return this.labelLinksVisible;}
 *  */
    @Test
    public void testGetLabelLinksVisible_ReturnThisLabelLinksVisible() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        boolean actual = piePlot.getLabelLinksVisible();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setIgnoreNullValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setIgnoreNullValues(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setIgnoreNullValues(boolean)}
 *  */
    @Test
    public void testSetIgnoreNullValues() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setIgnoreNullValues(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setIgnoreNullValues(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetIgnoreNullValues_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setIgnoreNullValues(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setIgnoreNullValues(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setIgnoreNullValues(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetIgnoreNullValues_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setIgnoreNullValues] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setIgnoreNullValues(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setIgnoreNullValues(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setIgnoreNullValues(boolean)}
     */
    @Test
    public void testSetIgnoreNullValues1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setIgnoreNullValues(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setBaseSectionOutlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBaseSectionOutlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionOutlinePaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetBaseSectionOutlinePaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Color baseSectionOutlinePaint = ((Color) createInstance("java.awt.Color"));
            piePlot.setBaseSectionOutlinePaint(baseSectionOutlinePaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialPiePlotBaseSectionOutlinePaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlinePaint"));
            
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setBaseSectionOutlinePaintMethod = piePlotClazz.getDeclaredMethod("setBaseSectionOutlinePaint", systemColorType);
            setBaseSectionOutlinePaintMethod.setAccessible(true);
            java.lang.Object[] setBaseSectionOutlinePaintMethodArguments = new java.lang.Object[1];
            setBaseSectionOutlinePaintMethodArguments[0] = systemColor;
            setBaseSectionOutlinePaintMethod.invoke(piePlot, setBaseSectionOutlinePaintMethodArguments);
            
            Paint finalPiePlotBaseSectionOutlinePaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlinePaint"));
            
            assertFalse(initialPiePlotBaseSectionOutlinePaint == finalPiePlotBaseSectionOutlinePaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionOutlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetBaseSectionOutlinePaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Color baseSectionOutlinePaint = ((Color) createInstance("java.awt.Color"));
            piePlot.setBaseSectionOutlinePaint(baseSectionOutlinePaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialPiePlotBaseSectionOutlinePaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlinePaint"));
            
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setBaseSectionOutlinePaintMethod = piePlotClazz.getDeclaredMethod("setBaseSectionOutlinePaint", systemColorType);
            setBaseSectionOutlinePaintMethod.setAccessible(true);
            java.lang.Object[] setBaseSectionOutlinePaintMethodArguments = new java.lang.Object[1];
            setBaseSectionOutlinePaintMethodArguments[0] = systemColor;
            setBaseSectionOutlinePaintMethod.invoke(piePlot, setBaseSectionOutlinePaintMethodArguments);
            
            Paint finalPiePlotBaseSectionOutlinePaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlinePaint"));
            
            assertFalse(initialPiePlotBaseSectionOutlinePaint == finalPiePlotBaseSectionOutlinePaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionOutlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetBaseSectionOutlinePaint_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Color baseSectionOutlinePaint = ((Color) createInstance("java.awt.Color"));
            piePlot.setBaseSectionOutlinePaint(baseSectionOutlinePaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialPiePlotBaseSectionOutlinePaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlinePaint"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setBaseSectionOutlinePaintMethod = piePlotClazz.getDeclaredMethod("setBaseSectionOutlinePaint", systemColorType);
            setBaseSectionOutlinePaintMethod.setAccessible(true);
            java.lang.Object[] setBaseSectionOutlinePaintMethodArguments = new java.lang.Object[1];
            setBaseSectionOutlinePaintMethodArguments[0] = systemColor;
            setBaseSectionOutlinePaintMethod.invoke(piePlot, setBaseSectionOutlinePaintMethodArguments);
            
            Paint finalPiePlotBaseSectionOutlinePaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlinePaint"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotBaseSectionOutlinePaint == finalPiePlotBaseSectionOutlinePaint);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setBaseSectionOutlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionOutlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionOutlinePaint_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setBaseSectionOutlinePaint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setBaseSectionOutlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionOutlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetBaseSectionOutlinePaint_ThrowClassCastException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            ChartColor baseSectionOutlinePaint = ((ChartColor) createInstance("org.jfree.chart.ChartColor"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class baseSectionOutlinePaintType = Class.forName("java.awt.Paint");
            Method setBaseSectionOutlinePaintMethod = piePlotClazz.getDeclaredMethod("setBaseSectionOutlinePaint", baseSectionOutlinePaintType);
            setBaseSectionOutlinePaintMethod.setAccessible(true);
            java.lang.Object[] setBaseSectionOutlinePaintMethodArguments = new java.lang.Object[1];
            setBaseSectionOutlinePaintMethodArguments[0] = baseSectionOutlinePaint;
            setBaseSectionOutlinePaintMethod.invoke(piePlot, setBaseSectionOutlinePaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setBaseSectionOutlinePaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            java.lang.Object[] setBaseSectionOutlinePaintMethodArguments1 = new java.lang.Object[1];
            setBaseSectionOutlinePaintMethodArguments1[0] = systemColor;
            try {
                setBaseSectionOutlinePaintMethod.invoke(piePlot, setBaseSectionOutlinePaintMethodArguments1);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getIgnoreNullValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIgnoreNullValues()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getIgnoreNullValues()}
 * @utbot.returnsFrom {@code return this.ignoreNullValues;}
 *  */
    @Test
    public void testGetIgnoreNullValues_ReturnThisIgnoreNullValues() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        boolean actual = piePlot.getIgnoreNullValues();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getIgnoreZeroValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIgnoreZeroValues()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getIgnoreZeroValues()}
 * @utbot.returnsFrom {@code return this.ignoreZeroValues;}
 *  */
    @Test
    public void testGetIgnoreZeroValues_ReturnThisIgnoreZeroValues() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        boolean actual = piePlot.getIgnoreZeroValues();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setSectionOutlinesVisible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSectionOutlinesVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSectionOutlinesVisible(boolean)}
 *  */
    @Test
    public void testSetSectionOutlinesVisible() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setSectionOutlinesVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSectionOutlinesVisible(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetSectionOutlinesVisible_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setSectionOutlinesVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSectionOutlinesVisible(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSectionOutlinesVisible(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetSectionOutlinesVisible_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setSectionOutlinesVisible] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setSectionOutlinesVisible(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSectionOutlinesVisible(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSectionOutlinesVisible(boolean)}
     */
    @Test
    public void testSetSectionOutlinesVisible1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setSectionOutlinesVisible(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getSectionOutlinePaint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSectionOutlinePaint(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getSectionOutlinePaint(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.chart.PaintMap#getPaint(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.sectionOutlinePaintMap.getPaint(key);
 *  */
    @Test
    public void testGetSectionOutlinePaint_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.getSectionOutlinePaint] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.getSectionOutlinePaint(PiePlot.java:1066) */
        piePlot.getSectionOutlinePaint(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSectionOutlinePaint(java.lang.Comparable)
    
    @Test
    public void testGetSectionOutlinePaint1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PaintMap sectionOutlinePaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        LinkedHashMap store = new LinkedHashMap();
        setField(sectionOutlinePaintMap, "org.jfree.chart.PaintMap", "store", store);
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionOutlinePaintMap", sectionOutlinePaintMap);
        IsoEra isoEra = IsoEra.BCE;
        
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class isoEraType = Class.forName("java.lang.Comparable");
        Method getSectionOutlinePaintMethod = piePlotClazz.getDeclaredMethod("getSectionOutlinePaint", isoEraType);
        getSectionOutlinePaintMethod.setAccessible(true);
        java.lang.Object[] getSectionOutlinePaintMethodArguments = new java.lang.Object[1];
        getSectionOutlinePaintMethodArguments[0] = isoEra;
        Paint actual = ((Paint) getSectionOutlinePaintMethod.invoke(piePlot, getSectionOutlinePaintMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getBaseSectionOutlineStroke
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getBaseSectionOutlineStroke()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getBaseSectionOutlineStroke()}
     */
    @Test
    public void testGetBaseSectionOutlineStroke() throws Exception  {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 3.85186E-34f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        BasicStroke actual = ((BasicStroke) piePlot.getBaseSectionOutlineStroke());
        
        BasicStroke expected = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        
        // java.awt.BasicStroke has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getBaseSectionOutlineStroke
    
    public void testGetBaseSectionOutlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelBackgroundPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelBackgroundPaint()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelBackgroundPaint()}
 * @utbot.returnsFrom {@code return this.labelBackgroundPaint;}
 *  */
    @Test
    public void testGetLabelBackgroundPaint_ReturnThisLabelBackgroundPaint() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Paint actual = piePlot.getLabelBackgroundPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelBackgroundPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelBackgroundPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelBackgroundPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetLabelBackgroundPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RadialGradientPaint labelBackgroundPaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelBackgroundPaintType = Class.forName("java.awt.Paint");
            Method setLabelBackgroundPaintMethod = piePlotClazz.getDeclaredMethod("setLabelBackgroundPaint", labelBackgroundPaintType);
            setLabelBackgroundPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelBackgroundPaintMethodArguments = new java.lang.Object[1];
            setLabelBackgroundPaintMethodArguments[0] = labelBackgroundPaint;
            setLabelBackgroundPaintMethod.invoke(piePlot, setLabelBackgroundPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelBackgroundPaint(null);
            
            Paint finalPiePlotLabelBackgroundPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelBackgroundPaint"));
            
            assertNull(finalPiePlotLabelBackgroundPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelBackgroundPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelBackgroundPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RadialGradientPaint labelBackgroundPaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelBackgroundPaintType = Class.forName("java.awt.Paint");
            Method setLabelBackgroundPaintMethod = piePlotClazz.getDeclaredMethod("setLabelBackgroundPaint", labelBackgroundPaintType);
            setLabelBackgroundPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelBackgroundPaintMethodArguments = new java.lang.Object[1];
            setLabelBackgroundPaintMethodArguments[0] = labelBackgroundPaint;
            setLabelBackgroundPaintMethod.invoke(piePlot, setLabelBackgroundPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelBackgroundPaint(null);
            
            Paint finalPiePlotLabelBackgroundPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelBackgroundPaint"));
            
            assertNull(finalPiePlotLabelBackgroundPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelBackgroundPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelBackgroundPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelBackgroundPaint_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            ChartColor labelBackgroundPaint = ((ChartColor) createInstance("org.jfree.chart.ChartColor"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelBackgroundPaintType = Class.forName("java.awt.Paint");
            Method setLabelBackgroundPaintMethod = piePlotClazz.getDeclaredMethod("setLabelBackgroundPaint", labelBackgroundPaintType);
            setLabelBackgroundPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelBackgroundPaintMethodArguments = new java.lang.Object[1];
            setLabelBackgroundPaintMethodArguments[0] = labelBackgroundPaint;
            setLabelBackgroundPaintMethod.invoke(piePlot, setLabelBackgroundPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelBackgroundPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelBackgroundPaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelOutlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelOutlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelOutlinePaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetLabelOutlinePaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RadialGradientPaint labelOutlinePaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelOutlinePaintType = Class.forName("java.awt.Paint");
            Method setLabelOutlinePaintMethod = piePlotClazz.getDeclaredMethod("setLabelOutlinePaint", labelOutlinePaintType);
            setLabelOutlinePaintMethod.setAccessible(true);
            java.lang.Object[] setLabelOutlinePaintMethodArguments = new java.lang.Object[1];
            setLabelOutlinePaintMethodArguments[0] = labelOutlinePaint;
            setLabelOutlinePaintMethod.invoke(piePlot, setLabelOutlinePaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelOutlinePaint(null);
            
            Paint finalPiePlotLabelOutlinePaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelOutlinePaint"));
            
            assertNull(finalPiePlotLabelOutlinePaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelOutlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelOutlinePaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RadialGradientPaint labelOutlinePaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelOutlinePaintType = Class.forName("java.awt.Paint");
            Method setLabelOutlinePaintMethod = piePlotClazz.getDeclaredMethod("setLabelOutlinePaint", labelOutlinePaintType);
            setLabelOutlinePaintMethod.setAccessible(true);
            java.lang.Object[] setLabelOutlinePaintMethodArguments = new java.lang.Object[1];
            setLabelOutlinePaintMethodArguments[0] = labelOutlinePaint;
            setLabelOutlinePaintMethod.invoke(piePlot, setLabelOutlinePaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelOutlinePaint(null);
            
            Paint finalPiePlotLabelOutlinePaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelOutlinePaint"));
            
            assertNull(finalPiePlotLabelOutlinePaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelOutlinePaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelOutlinePaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelOutlinePaint_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            ChartColor labelOutlinePaint = ((ChartColor) createInstance("org.jfree.chart.ChartColor"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelOutlinePaintType = Class.forName("java.awt.Paint");
            Method setLabelOutlinePaintMethod = piePlotClazz.getDeclaredMethod("setLabelOutlinePaint", labelOutlinePaintType);
            setLabelOutlinePaintMethod.setAccessible(true);
            java.lang.Object[] setLabelOutlinePaintMethodArguments = new java.lang.Object[1];
            setLabelOutlinePaintMethodArguments[0] = labelOutlinePaint;
            setLabelOutlinePaintMethod.invoke(piePlot, setLabelOutlinePaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelOutlinePaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelOutlinePaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelOutlineStroke
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getLabelOutlineStroke()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelOutlineStroke()}
     */
    @Test
    public void testGetLabelOutlineStroke() throws Exception  {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 3.85186E-34f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        BasicStroke actual = ((BasicStroke) piePlot.getLabelOutlineStroke());
        
        BasicStroke expected = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        
        // java.awt.BasicStroke has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getLabelOutlineStroke
    
    public void testGetLabelOutlineStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setBaseSectionPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBaseSectionPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetBaseSectionPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RadialGradientPaint baseSectionPaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class baseSectionPaintType = Class.forName("java.awt.Paint");
            Method setBaseSectionPaintMethod = piePlotClazz.getDeclaredMethod("setBaseSectionPaint", baseSectionPaintType);
            setBaseSectionPaintMethod.setAccessible(true);
            java.lang.Object[] setBaseSectionPaintMethodArguments = new java.lang.Object[1];
            setBaseSectionPaintMethodArguments[0] = baseSectionPaint;
            setBaseSectionPaintMethod.invoke(piePlot, setBaseSectionPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialPiePlotBaseSectionPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionPaint"));
            
            java.lang.Object[] setBaseSectionPaintMethodArguments1 = new java.lang.Object[1];
            setBaseSectionPaintMethodArguments1[0] = systemColor;
            setBaseSectionPaintMethod.invoke(piePlot, setBaseSectionPaintMethodArguments1);
            
            Paint finalPiePlotBaseSectionPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionPaint"));
            
            assertFalse(initialPiePlotBaseSectionPaint == finalPiePlotBaseSectionPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetBaseSectionPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RadialGradientPaint baseSectionPaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class baseSectionPaintType = Class.forName("java.awt.Paint");
            Method setBaseSectionPaintMethod = piePlotClazz.getDeclaredMethod("setBaseSectionPaint", baseSectionPaintType);
            setBaseSectionPaintMethod.setAccessible(true);
            java.lang.Object[] setBaseSectionPaintMethodArguments = new java.lang.Object[1];
            setBaseSectionPaintMethodArguments[0] = baseSectionPaint;
            setBaseSectionPaintMethod.invoke(piePlot, setBaseSectionPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            Paint initialPiePlotBaseSectionPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionPaint"));
            
            java.lang.Object[] setBaseSectionPaintMethodArguments1 = new java.lang.Object[1];
            setBaseSectionPaintMethodArguments1[0] = systemColor;
            setBaseSectionPaintMethod.invoke(piePlot, setBaseSectionPaintMethodArguments1);
            
            Paint finalPiePlotBaseSectionPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionPaint"));
            
            assertFalse(initialPiePlotBaseSectionPaint == finalPiePlotBaseSectionPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetBaseSectionPaint_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RadialGradientPaint baseSectionPaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class baseSectionPaintType = Class.forName("java.awt.Paint");
            Method setBaseSectionPaintMethod = piePlotClazz.getDeclaredMethod("setBaseSectionPaint", baseSectionPaintType);
            setBaseSectionPaintMethod.setAccessible(true);
            java.lang.Object[] setBaseSectionPaintMethodArguments = new java.lang.Object[1];
            setBaseSectionPaintMethodArguments[0] = baseSectionPaint;
            setBaseSectionPaintMethod.invoke(piePlot, setBaseSectionPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            ColorUIResource colorUIResource = new ColorUIResource(0);
            
            Paint initialPiePlotBaseSectionPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionPaint"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            java.lang.Object[] setBaseSectionPaintMethodArguments1 = new java.lang.Object[1];
            setBaseSectionPaintMethodArguments1[0] = colorUIResource;
            setBaseSectionPaintMethod.invoke(piePlot, setBaseSectionPaintMethodArguments1);
            
            Paint finalPiePlotBaseSectionPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionPaint"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotBaseSectionPaint == finalPiePlotBaseSectionPaint);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setBaseSectionPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionPaint_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setBaseSectionPaint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setBaseSectionPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetBaseSectionPaint_ThrowClassCastException() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            ChartColor baseSectionPaint = ((ChartColor) createInstance("org.jfree.chart.ChartColor"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class baseSectionPaintType = Class.forName("java.awt.Paint");
            Method setBaseSectionPaintMethod = piePlotClazz.getDeclaredMethod("setBaseSectionPaint", baseSectionPaintType);
            setBaseSectionPaintMethod.setAccessible(true);
            java.lang.Object[] setBaseSectionPaintMethodArguments = new java.lang.Object[1];
            setBaseSectionPaintMethodArguments[0] = baseSectionPaint;
            setBaseSectionPaintMethod.invoke(piePlot, setBaseSectionPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setBaseSectionPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            java.lang.Object[] setBaseSectionPaintMethodArguments1 = new java.lang.Object[1];
            setBaseSectionPaintMethodArguments1[0] = systemColor;
            try {
                setBaseSectionPaintMethod.invoke(piePlot, setBaseSectionPaintMethodArguments1);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lookupSectionOutlineStroke(java.lang.Comparable, boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#lookupSectionOutlineStroke(java.lang.Comparable,boolean)}
 * @utbot.invokes {@link org.jfree.chart.StrokeMap#getStroke(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = this.sectionOutlineStrokeMap.getStroke(key);
 *  */
    @Test
    public void testLookupSectionOutlineStroke_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke(PiePlot.java:1161) */
        piePlot.lookupSectionOutlineStroke(null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method lookupSectionOutlineStroke(java.lang.Comparable, boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#lookupSectionOutlineStroke(java.lang.Comparable,boolean)}
 * @utbot.invokes {@link org.jfree.chart.StrokeMap#getStroke(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: result = this.sectionOutlineStrokeMap.getStroke(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testLookupSectionOutlineStroke_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        StrokeMap sectionOutlineStrokeMap = ((StrokeMap) createInstance("org.jfree.chart.StrokeMap"));
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionOutlineStrokeMap", sectionOutlineStrokeMap);
        
        piePlot.lookupSectionOutlineStroke(null, false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lookupSectionOutlineStroke(java.lang.Comparable, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#lookupSectionOutlineStroke(java.lang.Comparable,boolean)}
     */
    @Test
    public void testLookupSectionOutlineStroke() throws Exception  {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(-1L, -1L);
        
        BasicStroke actual = ((BasicStroke) piePlot.lookupSectionOutlineStroke(simpleTimePeriod, false));
        
        BasicStroke expected = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        
        // java.awt.BasicStroke has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.lookupSectionOutlineStroke
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lookupSectionOutlineStroke(java.lang.Comparable)
    
    @Test
    public void testLookupSectionOutlineStroke1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        StrokeMap sectionOutlineStrokeMap = ((StrokeMap) createInstance("org.jfree.chart.StrokeMap"));
        LinkedHashMap store = new LinkedHashMap();
        setField(sectionOutlineStrokeMap, "org.jfree.chart.StrokeMap", "store", store);
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionOutlineStrokeMap", sectionOutlineStrokeMap);
        Object heapCharBuffer = createInstance("java.nio.HeapCharBuffer");
        
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class heapCharBufferType = Class.forName("java.lang.Comparable");
        Method lookupSectionOutlineStrokeMethod = piePlotClazz.getDeclaredMethod("lookupSectionOutlineStroke", heapCharBufferType);
        lookupSectionOutlineStrokeMethod.setAccessible(true);
        java.lang.Object[] lookupSectionOutlineStrokeMethodArguments = new java.lang.Object[1];
        lookupSectionOutlineStrokeMethodArguments[0] = heapCharBuffer;
        Stroke actual = ((Stroke) lookupSectionOutlineStrokeMethod.invoke(piePlot, lookupSectionOutlineStrokeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelOutlineStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelOutlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelOutlineStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetLabelOutlineStroke() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke labelOutlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setLabelOutlineStroke(labelOutlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelOutlineStroke(null);
            
            Stroke finalPiePlotLabelOutlineStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelOutlineStroke"));
            
            assertNull(finalPiePlotLabelOutlineStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelOutlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelOutlineStroke_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke labelOutlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setLabelOutlineStroke(labelOutlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelOutlineStroke(null);
            
            Stroke finalPiePlotLabelOutlineStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelOutlineStroke"));
            
            assertNull(finalPiePlotLabelOutlineStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelOutlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelOutlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelOutlineStroke_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke labelOutlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setLabelOutlineStroke(labelOutlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelOutlineStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelOutlineStroke(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setLabelOutlineStroke(java.awt.Stroke)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelOutlineStroke(java.awt.Stroke)}
     */
    @Test
    public void testSetLabelOutlineStroke1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(true);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setLabelOutlineStroke(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelShadowPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelShadowPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelShadowPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetLabelShadowPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RadialGradientPaint labelShadowPaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelShadowPaintType = Class.forName("java.awt.Paint");
            Method setLabelShadowPaintMethod = piePlotClazz.getDeclaredMethod("setLabelShadowPaint", labelShadowPaintType);
            setLabelShadowPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelShadowPaintMethodArguments = new java.lang.Object[1];
            setLabelShadowPaintMethodArguments[0] = labelShadowPaint;
            setLabelShadowPaintMethod.invoke(piePlot, setLabelShadowPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelShadowPaint(null);
            
            Paint finalPiePlotLabelShadowPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelShadowPaint"));
            
            assertNull(finalPiePlotLabelShadowPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelShadowPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelShadowPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RadialGradientPaint labelShadowPaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelShadowPaintType = Class.forName("java.awt.Paint");
            Method setLabelShadowPaintMethod = piePlotClazz.getDeclaredMethod("setLabelShadowPaint", labelShadowPaintType);
            setLabelShadowPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelShadowPaintMethodArguments = new java.lang.Object[1];
            setLabelShadowPaintMethodArguments[0] = labelShadowPaint;
            setLabelShadowPaintMethod.invoke(piePlot, setLabelShadowPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelShadowPaint(null);
            
            Paint finalPiePlotLabelShadowPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelShadowPaint"));
            
            assertNull(finalPiePlotLabelShadowPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelShadowPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelShadowPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelShadowPaint_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            ChartColor labelShadowPaint = ((ChartColor) createInstance("org.jfree.chart.ChartColor"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelShadowPaintType = Class.forName("java.awt.Paint");
            Method setLabelShadowPaintMethod = piePlotClazz.getDeclaredMethod("setLabelShadowPaint", labelShadowPaintType);
            setLabelShadowPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelShadowPaintMethodArguments = new java.lang.Object[1];
            setLabelShadowPaintMethodArguments[0] = labelShadowPaint;
            setLabelShadowPaintMethod.invoke(piePlot, setLabelShadowPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelShadowPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelShadowPaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getBaseSectionOutlinePaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBaseSectionOutlinePaint()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getBaseSectionOutlinePaint()}
 * @utbot.returnsFrom {@code return this.baseSectionOutlinePaint;}
 *  */
    @Test
    public void testGetBaseSectionOutlinePaint_ReturnThisBaseSectionOutlinePaint() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Paint actual = piePlot.getBaseSectionOutlinePaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setBaseSectionOutlineStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBaseSectionOutlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionOutlineStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetBaseSectionOutlineStroke() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke baseSectionOutlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setBaseSectionOutlineStroke(baseSectionOutlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialPiePlotBaseSectionOutlineStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlineStroke"));
            
            piePlot.setBaseSectionOutlineStroke(basicStroke);
            
            Stroke finalPiePlotBaseSectionOutlineStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlineStroke"));
            
            assertFalse(initialPiePlotBaseSectionOutlineStroke == finalPiePlotBaseSectionOutlineStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionOutlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetBaseSectionOutlineStroke_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke baseSectionOutlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setBaseSectionOutlineStroke(baseSectionOutlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialPiePlotBaseSectionOutlineStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlineStroke"));
            
            piePlot.setBaseSectionOutlineStroke(basicStroke);
            
            Stroke finalPiePlotBaseSectionOutlineStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlineStroke"));
            
            assertFalse(initialPiePlotBaseSectionOutlineStroke == finalPiePlotBaseSectionOutlineStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionOutlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetBaseSectionOutlineStroke_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke baseSectionOutlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setBaseSectionOutlineStroke(baseSectionOutlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialPiePlotBaseSectionOutlineStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlineStroke"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setBaseSectionOutlineStroke(basicStroke);
            
            Stroke finalPiePlotBaseSectionOutlineStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "baseSectionOutlineStroke"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotBaseSectionOutlineStroke == finalPiePlotBaseSectionOutlineStroke);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setBaseSectionOutlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionOutlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionOutlineStroke_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setBaseSectionOutlineStroke(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setBaseSectionOutlineStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setBaseSectionOutlineStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetBaseSectionOutlineStroke_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke baseSectionOutlineStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setBaseSectionOutlineStroke(baseSectionOutlineStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setBaseSectionOutlineStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setBaseSectionOutlineStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getBaseSectionPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBaseSectionPaint()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getBaseSectionPaint()}
 * @utbot.returnsFrom {@code return this.baseSectionPaint;}
 *  */
    @Test
    public void testGetBaseSectionPaint_ReturnThisBaseSectionPaint() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Paint actual = piePlot.getBaseSectionPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getMaximumExplodePercent
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMaximumExplodePercent()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getMaximumExplodePercent()}
 * @utbot.invokes {@link org.jfree.data.general.PieDataset#getKeys()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iterator = this.dataset.getKeys().iterator();
 *  */
    @Test
    public void testGetMaximumExplodePercent_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.getMaximumExplodePercent] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.getMaximumExplodePercent(PiePlot.java:1379) */
        piePlot.getMaximumExplodePercent();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getMaximumExplodePercent()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getMaximumExplodePercent()}
     */
    @Test
    public void testGetMaximumExplodePercentReturnsZero() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(java.lang.Double.POSITIVE_INFINITY);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.NaN);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(java.lang.Float.NEGATIVE_INFINITY, 1, 0, 5.192297E33f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        double actual = piePlot.getMaximumExplodePercent();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMaximumExplodePercent()
    
    @Test
    public void testGetMaximumExplodePercent1() throws Exception  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            JDBCCategoryDataset source = ((JDBCCategoryDataset) createInstance("org.jfree.data.jdbc.JDBCCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList columnKeys = new ArrayList();
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
            setField(source, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "extract", byRow);
            piePlot.setDataset(dataset);
            
            double actual = piePlot.getMaximumExplodePercent();
            
            org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    @Test
    public void testGetMaximumExplodePercent2() throws Exception  {
        TableOrder prevBY_COLUMN = TableOrder.BY_COLUMN;
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byColumn = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_COLUMN", byColumn);
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name);
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            JDBCCategoryDataset source = ((JDBCCategoryDataset) createInstance("org.jfree.data.jdbc.JDBCCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList rowKeys = new ArrayList();
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
            setField(source, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "extract", byColumn);
            piePlot.setDataset(dataset);
            
            double actual = piePlot.getMaximumExplodePercent();
            
            org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        } finally {
            setStaticField(TableOrder.class, "BY_COLUMN", prevBY_COLUMN);
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMaximumExplodePercent()
    
    @Test
    public void testGetMaximumExplodePercent3() throws Exception  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            DefaultMultiValueCategoryDataset source = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "extract", byRow);
            piePlot.setDataset(dataset);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.getMaximumExplodePercent] produces [java.lang.NullPointerException]
                org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getColumnKeys(DefaultMultiValueCategoryDataset.java:277)
                org.jfree.data.category.CategoryToPieDataset.getKeys(CategoryToPieDataset.java:243)
                org.jfree.chart.plot.PiePlot.getMaximumExplodePercent(PiePlot.java:1379) */
            piePlot.getMaximumExplodePercent();
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    @Test
    public void testGetMaximumExplodePercent4() throws Exception  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            TaskSeriesCollection source = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "extract", byRow);
            piePlot.setDataset(dataset);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.getMaximumExplodePercent] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.PiePlot.getMaximumExplodePercent(PiePlot.java:1379) */
            piePlot.getMaximumExplodePercent();
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    @Test
    public void testGetMaximumExplodePercent5() throws Exception  {
        TableOrder prevBY_COLUMN = TableOrder.BY_COLUMN;
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byColumn = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_COLUMN", byColumn);
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name);
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            DefaultMultiValueCategoryDataset source = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "extract", byColumn);
            piePlot.setDataset(dataset);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.getMaximumExplodePercent] produces [java.lang.NullPointerException]
                org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRowKeys(DefaultMultiValueCategoryDataset.java:308)
                org.jfree.data.category.CategoryToPieDataset.getKeys(CategoryToPieDataset.java:246)
                org.jfree.chart.plot.PiePlot.getMaximumExplodePercent(PiePlot.java:1379) */
            piePlot.getMaximumExplodePercent();
        } finally {
            setStaticField(TableOrder.class, "BY_COLUMN", prevBY_COLUMN);
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///region Errors report for getMaximumExplodePercent
    
    public void testGetMaximumExplodePercent_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // No method source set for method <java.lang.Object: java.lang.Object clone()>
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getMaximumLabelWidth
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaximumLabelWidth()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getMaximumLabelWidth()}
 * @utbot.returnsFrom {@code return this.maximumLabelWidth;}
 *  */
    @Test
    public void testGetMaximumLabelWidth_ReturnThisMaximumLabelWidth() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setMaximumLabelWidth(0.0);
        
        double actual = piePlot.getMaximumLabelWidth();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getSimpleLabelOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSimpleLabelOffset()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getSimpleLabelOffset()}
 * @utbot.returnsFrom {@code return this.simpleLabelOffset;}
 *  */
    @Test
    public void testGetSimpleLabelOffset_ReturnThisSimpleLabelOffset() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        RectangleInsets actual = piePlot.getSimpleLabelOffset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setSimpleLabelOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)}
 *  */
    @Test
    public void testSetSimpleLabelOffset() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets simpleLabelOffset = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            piePlot.setSimpleLabelOffset(simpleLabelOffset);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialPiePlotSimpleLabelOffset = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "simpleLabelOffset"));
            
            piePlot.setSimpleLabelOffset(rectangleInsets);
            
            RectangleInsets finalPiePlotSimpleLabelOffset = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "simpleLabelOffset"));
            
            assertFalse(initialPiePlotSimpleLabelOffset == finalPiePlotSimpleLabelOffset);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetSimpleLabelOffset_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets simpleLabelOffset = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            piePlot.setSimpleLabelOffset(simpleLabelOffset);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialPiePlotSimpleLabelOffset = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "simpleLabelOffset"));
            
            piePlot.setSimpleLabelOffset(rectangleInsets);
            
            RectangleInsets finalPiePlotSimpleLabelOffset = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "simpleLabelOffset"));
            
            assertFalse(initialPiePlotSimpleLabelOffset == finalPiePlotSimpleLabelOffset);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetSimpleLabelOffset_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets simpleLabelOffset = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            piePlot.setSimpleLabelOffset(simpleLabelOffset);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialPiePlotSimpleLabelOffset = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "simpleLabelOffset"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setSimpleLabelOffset(rectangleInsets);
            
            RectangleInsets finalPiePlotSimpleLabelOffset = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "simpleLabelOffset"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotSimpleLabelOffset == finalPiePlotSimpleLabelOffset);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (offset == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: offset == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSimpleLabelOffset_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setSimpleLabelOffset(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSimpleLabelOffset(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (offset == null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetSimpleLabelOffset_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets simpleLabelOffset = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            piePlot.setSimpleLabelOffset(simpleLabelOffset);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setSimpleLabelOffset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setSimpleLabelOffset(rectangleInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getToolTipGenerator()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getToolTipGenerator()}
 * @utbot.returnsFrom {@code return this.toolTipGenerator;}
 *  */
    @Test
    public void testGetToolTipGenerator_ReturnThisToolTipGenerator() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        StandardPieToolTipGenerator toolTipGenerator = ((StandardPieToolTipGenerator) createInstance("org.jfree.chart.labels.StandardPieToolTipGenerator"));
        piePlot.setToolTipGenerator(toolTipGenerator);
        
        StandardPieToolTipGenerator actual = ((StandardPieToolTipGenerator) piePlot.getToolTipGenerator());
        
        String actualLabelFormat = actual.getLabelFormat();
        assertNull(actualLabelFormat);
        
        NumberFormat actualNumberFormat = actual.getNumberFormat();
        assertNull(actualNumberFormat);
        
        NumberFormat actualPercentFormat = actual.getPercentFormat();
        assertNull(actualPercentFormat);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLegendLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 *  */
    @Test
    public void testSetLegendLabelGenerator() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator legendLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLegendLabelGenerator(legendLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            
            PieSectionLabelGenerator initialPiePlotLegendLabelGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelGenerator"));
            
            piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
            
            PieSectionLabelGenerator finalPiePlotLegendLabelGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelGenerator"));
            
            assertFalse(initialPiePlotLegendLabelGenerator == finalPiePlotLegendLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLegendLabelGenerator_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator legendLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLegendLabelGenerator(legendLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            
            PieSectionLabelGenerator initialPiePlotLegendLabelGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelGenerator"));
            
            piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
            
            PieSectionLabelGenerator finalPiePlotLegendLabelGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelGenerator"));
            
            assertFalse(initialPiePlotLegendLabelGenerator == finalPiePlotLegendLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetLegendLabelGenerator_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator legendLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLegendLabelGenerator(legendLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            
            PieSectionLabelGenerator initialPiePlotLegendLabelGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelGenerator"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
            
            PieSectionLabelGenerator finalPiePlotLegendLabelGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelGenerator"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotLegendLabelGenerator == finalPiePlotLegendLabelGenerator);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.executesCondition {@code (generator == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: generator == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendLabelGenerator_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setLegendLabelGenerator(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLegendLabelGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator legendLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLegendLabelGenerator(legendLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLegendLabelGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLegendLabelGenerator_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLegendLabelGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getMinimumArcAngleToDraw
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinimumArcAngleToDraw()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getMinimumArcAngleToDraw()}
 * @utbot.returnsFrom {@code return this.minimumArcAngleToDraw;}
 *  */
    @Test
    public void testGetMinimumArcAngleToDraw_ReturnThisMinimumArcAngleToDraw() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setMinimumArcAngleToDraw(0.0);
        
        double actual = piePlot.getMinimumArcAngleToDraw();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLegendLabelURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)}
 *  */
    @Test
    public void testSetLegendLabelURLGenerator() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieURLGenerator legendLabelURLGenerator = ((StandardPieURLGenerator) createInstance("org.jfree.chart.urls.StandardPieURLGenerator"));
            piePlot.setLegendLabelURLGenerator(legendLabelURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLegendLabelURLGenerator(null);
            
            PieURLGenerator finalPiePlotLegendLabelURLGenerator = ((PieURLGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelURLGenerator"));
            
            assertNull(finalPiePlotLegendLabelURLGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLegendLabelURLGenerator_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieURLGenerator legendLabelURLGenerator = ((StandardPieURLGenerator) createInstance("org.jfree.chart.urls.StandardPieURLGenerator"));
            piePlot.setLegendLabelURLGenerator(legendLabelURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLegendLabelURLGenerator(null);
            
            PieURLGenerator finalPiePlotLegendLabelURLGenerator = ((PieURLGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelURLGenerator"));
            
            assertNull(finalPiePlotLegendLabelURLGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetLegendLabelURLGenerator_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CustomPieURLGenerator legendLabelURLGenerator = ((CustomPieURLGenerator) createInstance("org.jfree.chart.urls.CustomPieURLGenerator"));
            piePlot.setLegendLabelURLGenerator(legendLabelURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLegendLabelURLGenerator(null);
            
            PieURLGenerator finalPiePlotLegendLabelURLGenerator = ((PieURLGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelURLGenerator"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            assertNull(finalPiePlotLegendLabelURLGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLegendLabelURLGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CustomPieURLGenerator legendLabelURLGenerator = ((CustomPieURLGenerator) createInstance("org.jfree.chart.urls.CustomPieURLGenerator"));
            piePlot.setLegendLabelURLGenerator(legendLabelURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLegendLabelURLGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLegendLabelURLGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator)}
     */
    @Test
    public void testSetLegendLabelURLGenerator1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(Integer.MAX_VALUE);
        StandardPieURLGenerator standardPieURLGenerator = new StandardPieURLGenerator("#$\\\"'");
        
        piePlot.setLegendLabelURLGenerator(standardPieURLGenerator);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)}
 *  */
    @Test
    public void testSetToolTipGenerator() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieToolTipGenerator toolTipGenerator = ((StandardPieToolTipGenerator) createInstance("org.jfree.chart.labels.StandardPieToolTipGenerator"));
            piePlot.setToolTipGenerator(toolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setToolTipGenerator(null);
            
            PieToolTipGenerator finalPiePlotToolTipGenerator = ((PieToolTipGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "toolTipGenerator"));
            
            assertNull(finalPiePlotToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetToolTipGenerator_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieToolTipGenerator toolTipGenerator = ((StandardPieToolTipGenerator) createInstance("org.jfree.chart.labels.StandardPieToolTipGenerator"));
            piePlot.setToolTipGenerator(toolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setToolTipGenerator(null);
            
            PieToolTipGenerator finalPiePlotToolTipGenerator = ((PieToolTipGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "toolTipGenerator"));
            
            assertNull(finalPiePlotToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetToolTipGenerator_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieToolTipGenerator toolTipGenerator = ((StandardPieToolTipGenerator) createInstance("org.jfree.chart.labels.StandardPieToolTipGenerator"));
            piePlot.setToolTipGenerator(toolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setToolTipGenerator(null);
            
            PieToolTipGenerator finalPiePlotToolTipGenerator = ((PieToolTipGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "toolTipGenerator"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            assertNull(finalPiePlotToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetToolTipGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieToolTipGenerator toolTipGenerator = ((StandardPieToolTipGenerator) createInstance("org.jfree.chart.labels.StandardPieToolTipGenerator"));
            piePlot.setToolTipGenerator(toolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setToolTipGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setToolTipGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator)}
     */
    @Test
    public void testSetToolTipGenerator1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(true);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setToolTipGenerator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelDistributor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelDistributor()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelDistributor()}
 * @utbot.returnsFrom {@code return this.labelDistributor;}
 *  */
    @Test
    public void testGetLabelDistributor_ReturnThisLabelDistributor() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PieLabelDistributor labelDistributor = ((PieLabelDistributor) createInstance("org.jfree.chart.plot.PieLabelDistributor"));
        piePlot.setLabelDistributor(labelDistributor);
        
        PieLabelDistributor actual = ((PieLabelDistributor) piePlot.getLabelDistributor());
        
        double labelDistributorMinGap = ((Double) getFieldValue(labelDistributor, "org.jfree.chart.plot.PieLabelDistributor", "minGap"));
        double actualMinGap = ((Double) getFieldValue(actual, "org.jfree.chart.plot.PieLabelDistributor", "minGap"));
        org.junit.Assert.assertEquals(labelDistributorMinGap, actualMinGap, 1.0E-6);
        
        List actualLabels = actual.labels;
        assertNull(actualLabels);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setMinimumArcAngleToDraw
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMinimumArcAngleToDraw(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setMinimumArcAngleToDraw(double)}
 *  */
    @Test
    public void testSetMinimumArcAngleToDraw() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setMinimumArcAngleToDraw(0.0);
        
        piePlot.setMinimumArcAngleToDraw(java.lang.Double.NaN);
        
        double finalPiePlotMinimumArcAngleToDraw = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "minimumArcAngleToDraw"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotMinimumArcAngleToDraw, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelDistributor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)}
 *  */
    @Test
    public void testSetLabelDistributor() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            PieLabelDistributor labelDistributor = ((PieLabelDistributor) createInstance("org.jfree.chart.plot.PieLabelDistributor"));
            piePlot.setLabelDistributor(labelDistributor);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(0);
            
            AbstractPieLabelDistributor initialPiePlotLabelDistributor = ((AbstractPieLabelDistributor) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelDistributor"));
            
            piePlot.setLabelDistributor(pieLabelDistributor);
            
            AbstractPieLabelDistributor finalPiePlotLabelDistributor = ((AbstractPieLabelDistributor) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelDistributor"));
            
            assertFalse(initialPiePlotLabelDistributor == finalPiePlotLabelDistributor);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelDistributor_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            PieLabelDistributor labelDistributor = ((PieLabelDistributor) createInstance("org.jfree.chart.plot.PieLabelDistributor"));
            piePlot.setLabelDistributor(labelDistributor);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(0);
            
            AbstractPieLabelDistributor initialPiePlotLabelDistributor = ((AbstractPieLabelDistributor) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelDistributor"));
            
            piePlot.setLabelDistributor(pieLabelDistributor);
            
            AbstractPieLabelDistributor finalPiePlotLabelDistributor = ((AbstractPieLabelDistributor) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelDistributor"));
            
            assertFalse(initialPiePlotLabelDistributor == finalPiePlotLabelDistributor);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetLabelDistributor_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            PieLabelDistributor labelDistributor = ((PieLabelDistributor) createInstance("org.jfree.chart.plot.PieLabelDistributor"));
            piePlot.setLabelDistributor(labelDistributor);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(0);
            
            AbstractPieLabelDistributor initialPiePlotLabelDistributor = ((AbstractPieLabelDistributor) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelDistributor"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLabelDistributor(pieLabelDistributor);
            
            AbstractPieLabelDistributor finalPiePlotLabelDistributor = ((AbstractPieLabelDistributor) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelDistributor"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotLabelDistributor == finalPiePlotLabelDistributor);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)}
 * @utbot.executesCondition {@code (distributor == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: distributor == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelDistributor_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setLabelDistributor(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelDistributor_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            PieLabelDistributor labelDistributor = ((PieLabelDistributor) createInstance("org.jfree.chart.plot.PieLabelDistributor"));
            piePlot.setLabelDistributor(labelDistributor);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(0);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelDistributor] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelDistributor(pieLabelDistributor);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor)}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelDistributor_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(0);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelDistributor] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            piePlot.setLabelDistributor(pieLabelDistributor);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLegendLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendLabelGenerator()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLegendLabelGenerator()}
 * @utbot.returnsFrom {@code return this.legendLabelGenerator;}
 *  */
    @Test
    public void testGetLegendLabelGenerator_ReturnThisLegendLabelGenerator() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        StandardPieSectionLabelGenerator legendLabelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
        piePlot.setLegendLabelGenerator(legendLabelGenerator);
        
        StandardPieSectionLabelGenerator actual = ((StandardPieSectionLabelGenerator) piePlot.getLegendLabelGenerator());
        
        // org.jfree.chart.labels.StandardPieSectionLabelGenerator has overridden equals method
        assertEquals(legendLabelGenerator, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLegendLabelToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 *  */
    @Test
    public void testSetLegendLabelToolTipGenerator() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator legendLabelToolTipGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLegendLabelToolTipGenerator(legendLabelToolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLegendLabelToolTipGenerator(null);
            
            PieSectionLabelGenerator finalPiePlotLegendLabelToolTipGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelToolTipGenerator"));
            
            assertNull(finalPiePlotLegendLabelToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLegendLabelToolTipGenerator_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator legendLabelToolTipGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLegendLabelToolTipGenerator(legendLabelToolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLegendLabelToolTipGenerator(null);
            
            PieSectionLabelGenerator finalPiePlotLegendLabelToolTipGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelToolTipGenerator"));
            
            assertNull(finalPiePlotLegendLabelToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetLegendLabelToolTipGenerator_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator legendLabelToolTipGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLegendLabelToolTipGenerator(legendLabelToolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLegendLabelToolTipGenerator(null);
            
            PieSectionLabelGenerator finalPiePlotLegendLabelToolTipGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "legendLabelToolTipGenerator"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            assertNull(finalPiePlotLegendLabelToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLegendLabelToolTipGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator legendLabelToolTipGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLegendLabelToolTipGenerator(legendLabelToolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLegendLabelToolTipGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLegendLabelToolTipGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
     */
    @Test
    public void testSetLegendLabelToolTipGenerator1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(true);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setLegendLabelToolTipGenerator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLegendLabelToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendLabelToolTipGenerator()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLegendLabelToolTipGenerator()}
 * @utbot.returnsFrom {@code return this.legendLabelToolTipGenerator;}
 *  */
    @Test
    public void testGetLegendLabelToolTipGenerator_ReturnThisLegendLabelToolTipGenerator() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        StandardPieSectionLabelGenerator legendLabelToolTipGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
        piePlot.setLegendLabelToolTipGenerator(legendLabelToolTipGenerator);
        
        StandardPieSectionLabelGenerator actual = ((StandardPieSectionLabelGenerator) piePlot.getLegendLabelToolTipGenerator());
        
        // org.jfree.chart.labels.StandardPieSectionLabelGenerator has overridden equals method
        assertEquals(legendLabelToolTipGenerator, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLegendLabelURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendLabelURLGenerator()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLegendLabelURLGenerator()}
 * @utbot.returnsFrom {@code return this.legendLabelURLGenerator;}
 *  */
    @Test
    public void testGetLegendLabelURLGenerator_ReturnThisLegendLabelURLGenerator() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        PieURLGenerator actual = piePlot.getLegendLabelURLGenerator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.drawRightLabel
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawRightLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawRightLabel(java.awt.Graphics2D,org.jfree.chart.plot.PiePlotState,org.jfree.chart.plot.PieLabelRecord)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlotState#getLinkArea()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double anchorX = state.getLinkArea().getMaxX();
 *  */
    @Test
    public void testDrawRightLabel_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawRightLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawRightLabel(PiePlot.java:2762) */
        piePlot.drawRightLabel(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawRightLabel(java.awt.Graphics2D,org.jfree.chart.plot.PiePlotState,org.jfree.chart.plot.PieLabelRecord)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double anchorX = state.getLinkArea().getMaxX();
 *  */
    @Test
    public void testDrawRightLabel_ThrowNullPointerException_1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PiePlotState piePlotState = new PiePlotState(null);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawRightLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawRightLabel(PiePlot.java:2762) */
        piePlot.drawRightLabel(null, piePlotState, null);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawRightLabel(java.awt.Graphics2D,org.jfree.chart.plot.PiePlotState,org.jfree.chart.plot.PieLabelRecord)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getMaxX()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double targetX = anchorX + record.getGap();
 *  */
    @Test
    public void testDrawRightLabel_ThrowNullPointerException_2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PiePlotState piePlotState = new PiePlotState(null);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
        piePlotState.setLinkArea(float1);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawRightLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawRightLabel(PiePlot.java:2763) */
        piePlot.drawRightLabel(null, piePlotState, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawRightLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)
    
    @Test
    public void testDrawRightLabel1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setLabelLinksVisible(true);
        PiePlotState piePlotState = new PiePlotState(null);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
        piePlotState.setLinkArea(float1);
        PieLabelRecord pieLabelRecord = new PieLabelRecord(null, 0.0, 0.0, null, 0.0, 0.0, 0.0);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawRightLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawRightLabel(PiePlot.java:2777) */
        piePlot.drawRightLabel(null, piePlotState, pieLabelRecord);
    }
    ///endregion
    
    ///region Errors report for drawRightLabel
    
    public void testDrawRightLabel_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOverNoEa accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Clear accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setInteriorGap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setInteriorGap(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setInteriorGap(double)}
 * @utbot.executesCondition {@code (this.interiorGap != percent): False}
 *  */
    @Test
    public void testSetInteriorGap_ThisInteriorGapEqualsPercent() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setInteriorGap(2.355715286844277E-154);
        
        piePlot.setInteriorGap(2.355715286844277E-154);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setInteriorGap(double)}
 * @utbot.executesCondition {@code (this.interiorGap != percent): True}
 *  */
    @Test
    public void testSetInteriorGap_ThisInteriorGapNotEqualsPercent() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setInteriorGap(1.438154475744676E308);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setInteriorGap(java.lang.Double.NaN);
            
            double finalPiePlotInteriorGap = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "interiorGap"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotInteriorGap, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setInteriorGap(double)}
 * @utbot.executesCondition {@code (this.interiorGap != percent): True}
 *  */
    @Test
    public void testSetInteriorGap_ThisInteriorGapNotEqualsPercent_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setInteriorGap(9.60642212101867E307);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setInteriorGap(java.lang.Double.NaN);
            
            double finalPiePlotInteriorGap = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "interiorGap"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotInteriorGap, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setInteriorGap(double)}
 * @utbot.executesCondition {@code (this.interiorGap != percent): True}
 *  */
    @Test
    public void testSetInteriorGap_ThisInteriorGapNotEqualsPercent_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setInteriorGap(4.914206521570366E-237);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setInteriorGap(java.lang.Double.NaN);
            
            double finalPiePlotInteriorGap = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "interiorGap"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotInteriorGap, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setInteriorGap(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setInteriorGap(double)}
 * @utbot.executesCondition {@code (percent < 0.0): False}
 * @utbot.executesCondition {@code (percent > MAX_INTERIOR_GAP): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (percent < 0.0) || (percent > MAX_INTERIOR_GAP)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGap_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setInteriorGap(3.0);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setInteriorGap(double)}
 * @utbot.executesCondition {@code (percent < 0.0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: (percent < 0.0) || (percent > MAX_INTERIOR_GAP)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGap_ThrowIllegalArgumentException_1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setInteriorGap(-2.2250738585072646E-308);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setInteriorGap(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setInteriorGap(double)}
 * @utbot.executesCondition {@code (percent < 0.0): False}
 * @utbot.executesCondition {@code (percent > MAX_INTERIOR_GAP): False}
 * @utbot.executesCondition {@code (this.interiorGap != percent): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetInteriorGap_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setInteriorGap(1.6000000089406974);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setInteriorGap] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setInteriorGap(0.19999707937240574);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setCircular
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCircular(boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setCircular(boolean,boolean)}
 * @utbot.executesCondition {@code (notify): False}
 *  */
    @Test
    public void testSetCircular_NotNotify() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setCircular(false, false);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setCircular(boolean,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetCircular_Notify() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setCircular(false, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setCircular(boolean,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetCircular_Notify_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setCircular(false, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setCircular(boolean,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetCircular_Notify_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setCircular(false, true);
            
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setCircular(boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setCircular(boolean,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetCircular_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setCircular] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setCircular(false, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setCircular(boolean,boolean)}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetCircular_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setCircular] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            piePlot.setCircular(false, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setCircular(boolean, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setCircular(boolean,boolean)}
     */
    @Test
    public void testSetCircular() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setCircular(false, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setCircular
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCircular(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setCircular(boolean)}
 *  */
    @Test
    public void testSetCircular1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setCircular(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setCircular(boolean)}
 *  */
    @Test
    public void testSetCircular_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setCircular(false);
            
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setCircular(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setCircular(boolean)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#setCircular(boolean,boolean)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#setCircular(boolean,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setCircular(flag, true);
 *  */
    @Test
    public void testSetCircular_ThrowClassCastException1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setCircular] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setCircular(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setCircular
    
    public void testSetCircular_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setStartAngle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setStartAngle(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setStartAngle(double)}
 *  */
    @Test
    public void testSetStartAngle() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setStartAngle(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setStartAngle(java.lang.Double.NaN);
            
            double finalPiePlotStartAngle = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "startAngle"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotStartAngle, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setStartAngle(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetStartAngle_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setStartAngle(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setStartAngle(java.lang.Double.NaN);
            
            double finalPiePlotStartAngle = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "startAngle"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotStartAngle, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setStartAngle(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetStartAngle_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setStartAngle(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setStartAngle(java.lang.Double.NaN);
            
            double finalPiePlotStartAngle = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "startAngle"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotStartAngle, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setStartAngle(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setStartAngle(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetStartAngle_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setStartAngle(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setStartAngle] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setStartAngle(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setStartAngle(double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setStartAngle(double)}
     */
    @Test
    public void testSetStartAngleWithCornerCase() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.isCircular
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCircular()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#isCircular()}
 * @utbot.returnsFrom {@code return this.circular;}
 *  */
    @Test
    public void testIsCircular_ReturnThisCircular() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        boolean actual = piePlot.isCircular();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getPieIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPieIndex()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getPieIndex()}
 * @utbot.returnsFrom {@code return this.pieIndex;}
 *  */
    @Test
    public void testGetPieIndex_ReturnThisPieIndex() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setPieIndex(-255);
        
        int actual = piePlot.getPieIndex();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setDataset
    
    ///region OTHER: ERROR SUITE for method setDataset(org.jfree.data.general.PieDataset)
    
    @Test
    public void testSetDataset1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:890)
            org.jfree.chart.plot.Plot.datasetChanged(Plot.java:1107)
            org.jfree.chart.plot.PiePlot.setDataset(PiePlot.java:578) */
        piePlot.setDataset(null);
    }
    
    @Test
    public void testSetDataset2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        CategoryToPieDataset categoryToPieDataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.setDataset] produces [java.lang.NullPointerException]
            org.jfree.data.general.AbstractDataset.addChangeListener(AbstractDataset.java:132)
            org.jfree.chart.plot.PiePlot.setDataset(PiePlot.java:573) */
        piePlot.setDataset(categoryToPieDataset);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getStartAngle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStartAngle()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getStartAngle()}
 * @utbot.returnsFrom {@code return this.startAngle;}
 *  */
    @Test
    public void testGetStartAngle_ReturnThisStartAngle() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setStartAngle(0.0);
        
        double actual = piePlot.getStartAngle();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getDirection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDirection()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getDirection()}
 * @utbot.returnsFrom {@code return this.direction;}
 *  */
    @Test
    public void testGetDirection_ReturnThisDirection() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Rotation actual = piePlot.getDirection();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setDirection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDirection(org.jfree.chart.util.Rotation)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setDirection(org.jfree.chart.util.Rotation)}
 *  */
    @Test
    public void testSetDirection() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Rotation direction = ((Rotation) createInstance("org.jfree.chart.util.Rotation"));
            piePlot.setDirection(direction);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Rotation rotation = ((Rotation) createInstance("org.jfree.chart.util.Rotation"));
            
            Rotation initialPiePlotDirection = ((Rotation) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "direction"));
            
            piePlot.setDirection(rotation);
            
            Rotation finalPiePlotDirection = ((Rotation) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "direction"));
            
            assertFalse(initialPiePlotDirection == finalPiePlotDirection);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setDirection(org.jfree.chart.util.Rotation)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetDirection_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Rotation direction = ((Rotation) createInstance("org.jfree.chart.util.Rotation"));
            piePlot.setDirection(direction);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Rotation rotation = ((Rotation) createInstance("org.jfree.chart.util.Rotation"));
            
            Rotation initialPiePlotDirection = ((Rotation) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "direction"));
            
            piePlot.setDirection(rotation);
            
            Rotation finalPiePlotDirection = ((Rotation) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "direction"));
            
            assertFalse(initialPiePlotDirection == finalPiePlotDirection);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setDirection(org.jfree.chart.util.Rotation)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetDirection_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Rotation direction = ((Rotation) createInstance("org.jfree.chart.util.Rotation"));
            piePlot.setDirection(direction);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Rotation rotation = ((Rotation) createInstance("org.jfree.chart.util.Rotation"));
            
            Rotation initialPiePlotDirection = ((Rotation) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "direction"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setDirection(rotation);
            
            Rotation finalPiePlotDirection = ((Rotation) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "direction"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotDirection == finalPiePlotDirection);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setDirection(org.jfree.chart.util.Rotation)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setDirection(org.jfree.chart.util.Rotation)}
 * @utbot.executesCondition {@code (direction == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: direction == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDirection_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setDirection(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDirection(org.jfree.chart.util.Rotation)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setDirection(org.jfree.chart.util.Rotation)}
 * @utbot.executesCondition {@code (direction == null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetDirection_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Rotation direction = ((Rotation) createInstance("org.jfree.chart.util.Rotation"));
            piePlot.setDirection(direction);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Rotation rotation = ((Rotation) createInstance("org.jfree.chart.util.Rotation"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setDirection] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setDirection(rotation);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.lookupSectionPaint
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lookupSectionPaint(java.lang.Comparable)
    
    @Test
    public void testLookupSectionPaint1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PaintMap sectionPaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        LinkedHashMap store = new LinkedHashMap();
        setField(sectionPaintMap, "org.jfree.chart.PaintMap", "store", store);
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionPaintMap", sectionPaintMap);
        Authenticator.RequestorType requestorType = Authenticator.RequestorType.PROXY;
        
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class requestorTypeType = Class.forName("java.lang.Comparable");
        Method lookupSectionPaintMethod = piePlotClazz.getDeclaredMethod("lookupSectionPaint", requestorTypeType);
        lookupSectionPaintMethod.setAccessible(true);
        java.lang.Object[] lookupSectionPaintMethodArguments = new java.lang.Object[1];
        lookupSectionPaintMethodArguments[0] = requestorType;
        Paint actual = ((Paint) lookupSectionPaintMethod.invoke(piePlot, lookupSectionPaintMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.lookupSectionPaint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lookupSectionPaint(java.lang.Comparable, boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#lookupSectionPaint(java.lang.Comparable,boolean)}
 * @utbot.invokes {@link org.jfree.chart.PaintMap#getPaint(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = this.sectionPaintMap.getPaint(key);
 *  */
    @Test
    public void testLookupSectionPaint_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.lookupSectionPaint] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.lookupSectionPaint(PiePlot.java:836) */
        piePlot.lookupSectionPaint(null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method lookupSectionPaint(java.lang.Comparable, boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#lookupSectionPaint(java.lang.Comparable,boolean)}
 * @utbot.invokes {@link org.jfree.chart.PaintMap#getPaint(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: result = this.sectionPaintMap.getPaint(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testLookupSectionPaint_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PaintMap sectionPaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionPaintMap", sectionPaintMap);
        
        piePlot.lookupSectionPaint(null, false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method lookupSectionPaint(java.lang.Comparable, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#lookupSectionPaint(java.lang.Comparable,boolean)}
     */
    @Test
    public void testLookupSectionPaint() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(-1L, -1L);
        
        Color actual = ((Color) piePlot.lookupSectionPaint(simpleTimePeriod, false));
        
        Color expected = new Color(0);
        
        // java.awt.Color has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for lookupSectionPaint
    
    public void testLookupSectionPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setPieIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPieIndex(int)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setPieIndex(int)}
 *  */
    @Test
    public void testSetPieIndex() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setPieIndex(-255);
        
        piePlot.setPieIndex(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getDataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataset()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getDataset()}
 * @utbot.returnsFrom {@code return this.dataset;}
 *  */
    @Test
    public void testGetDataset_ReturnThisDataset() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        PieDataset actual = piePlot.getDataset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getInteriorGap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInteriorGap()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getInteriorGap()}
 * @utbot.returnsFrom {@code return this.interiorGap;}
 *  */
    @Test
    public void testGetInteriorGap_ReturnThisInteriorGap() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setInteriorGap(0.0);
        
        double actual = piePlot.getInteriorGap();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getShadowPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShadowPaint()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getShadowPaint()}
 * @utbot.returnsFrom {@code return this.shadowPaint;}
 *  */
    @Test
    public void testGetShadowPaint_ReturnThisShadowPaint() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Paint actual = piePlot.getShadowPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setShadowXOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setShadowXOffset(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowXOffset(double)}
 *  */
    @Test
    public void testSetShadowXOffset() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setShadowXOffset(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setShadowXOffset(java.lang.Double.NaN);
            
            double finalPiePlotShadowXOffset = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "shadowXOffset"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotShadowXOffset, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowXOffset(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetShadowXOffset_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setShadowXOffset(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setShadowXOffset(java.lang.Double.NaN);
            
            double finalPiePlotShadowXOffset = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "shadowXOffset"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotShadowXOffset, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowXOffset(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetShadowXOffset_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setShadowXOffset(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setShadowXOffset(java.lang.Double.NaN);
            
            double finalPiePlotShadowXOffset = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "shadowXOffset"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotShadowXOffset, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setShadowXOffset(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowXOffset(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetShadowXOffset_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setShadowXOffset(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setShadowXOffset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setShadowXOffset(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setShadowXOffset(double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowXOffset(double)}
     */
    @Test
    public void testSetShadowXOffsetWithCornerCase() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setShadowXOffset(java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setExplodePercent
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setExplodePercent(java.lang.Comparable, double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setExplodePercent(java.lang.Comparable,double)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: key == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetExplodePercent_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setExplodePercent(null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setExplodePercent(java.lang.Comparable, double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setExplodePercent(java.lang.Comparable,double)}
     */
    @Test
    public void testSetExplodePercentWithCornerCase() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("-3");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("-3", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("Null 'key' argument.");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(-1L, -1L);
        
        piePlot.setExplodePercent(simpleTimePeriod, java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setExplodePercent(java.lang.Comparable, double)
    
    @Test
    public void testSetExplodePercent1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        Integer integer = 0;
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.setExplodePercent] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:890)
            org.jfree.chart.plot.PiePlot.setExplodePercent(PiePlot.java:1369) */
        piePlot.setExplodePercent(integer, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 *  */
    @Test
    public void testSetLabelGenerator() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator labelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLabelGenerator(labelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelGenerator(null);
            
            PieSectionLabelGenerator finalPiePlotLabelGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelGenerator"));
            
            assertNull(finalPiePlotLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelGenerator_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator labelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLabelGenerator(labelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelGenerator(null);
            
            PieSectionLabelGenerator finalPiePlotLabelGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelGenerator"));
            
            assertNull(finalPiePlotLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetLabelGenerator_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator labelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLabelGenerator(labelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLabelGenerator(null);
            
            PieSectionLabelGenerator finalPiePlotLabelGenerator = ((PieSectionLabelGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelGenerator"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            assertNull(finalPiePlotLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieSectionLabelGenerator labelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
            piePlot.setLabelGenerator(labelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator)}
     */
    @Test
    public void testSetLabelGenerator1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(true);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setLabelGenerator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getSectionKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSectionKey(int)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getSectionKey(int)}
 * @utbot.executesCondition {@code (this.dataset != null): True}
 * @utbot.executesCondition {@code (section >= 0): False}
 * @utbot.returnsFrom {@code return key;}
 *  */
    @Test
    public void testGetSectionKey_SectionLessThanZero() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
        piePlot.setDataset(dataset);
        
        Integer actual = ((Integer) piePlot.getSectionKey(-1));
        
        Integer expected = -1;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getSectionKey(int)}
 * @utbot.executesCondition {@code (this.dataset != null): False}
 * @utbot.returnsFrom {@code return key;}
 *  */
    @Test
    public void testGetSectionKey_ThisDatasetEqualsNull() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Integer actual = ((Integer) piePlot.getSectionKey(-255));
        
        Integer expected = -255;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSectionKey(int)
    
    @Test
    public void testGetSectionKey1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
        piePlot.setDataset(dataset);
        
        Integer actual = ((Integer) piePlot.getSectionKey(0));
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSectionKey(int)
    
    @Test
    public void testGetSectionKey2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        DefaultKeyedValuesDataset dataset = ((DefaultKeyedValuesDataset) createInstance("org.jfree.data.general.DefaultKeyedValuesDataset"));
        DefaultKeyedValues data = ((DefaultKeyedValues) createInstance("org.jfree.data.DefaultKeyedValues"));
        HashMap indexMap = new HashMap();
        Object object = createInstance("java.lang.Object");
        indexMap.put(null, object);
        setField(data, "org.jfree.data.DefaultKeyedValues", "indexMap", indexMap);
        setField(dataset, "org.jfree.data.general.DefaultPieDataset", "data", data);
        piePlot.setDataset(dataset);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.getSectionKey] produces [java.lang.NullPointerException]
            org.jfree.data.DefaultKeyedValues.getKey(DefaultKeyedValues.java:136)
            org.jfree.data.general.DefaultPieDataset.getKey(DefaultPieDataset.java:138)
            org.jfree.chart.plot.PiePlot.getSectionKey(PiePlot.java:876) */
        piePlot.getSectionKey(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelGap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelGap()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelGap()}
 * @utbot.returnsFrom {@code return this.labelGap;}
 *  */
    @Test
    public void testGetLabelGap_ReturnThisLabelGap() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setLabelGap(0.0);
        
        double actual = piePlot.getLabelGap();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getShadowYOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShadowYOffset()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getShadowYOffset()}
 * @utbot.returnsFrom {@code return this.shadowYOffset;}
 *  */
    @Test
    public void testGetShadowYOffset_ReturnThisShadowYOffset() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setShadowYOffset(0.0);
        
        double actual = piePlot.getShadowYOffset();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setShadowYOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setShadowYOffset(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowYOffset(double)}
 *  */
    @Test
    public void testSetShadowYOffset() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setShadowYOffset(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setShadowYOffset(java.lang.Double.NaN);
            
            double finalPiePlotShadowYOffset = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "shadowYOffset"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotShadowYOffset, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowYOffset(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetShadowYOffset_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setShadowYOffset(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setShadowYOffset(java.lang.Double.NaN);
            
            double finalPiePlotShadowYOffset = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "shadowYOffset"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotShadowYOffset, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowYOffset(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetShadowYOffset_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setShadowYOffset(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setShadowYOffset(java.lang.Double.NaN);
            
            double finalPiePlotShadowYOffset = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "shadowYOffset"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotShadowYOffset, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setShadowYOffset(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowYOffset(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetShadowYOffset_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setShadowYOffset(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setShadowYOffset] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setShadowYOffset(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setShadowYOffset(double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowYOffset(double)}
     */
    @Test
    public void testSetShadowYOffsetWithCornerCase() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setShadowYOffset(java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelGenerator()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelGenerator()}
 * @utbot.returnsFrom {@code return this.labelGenerator;}
 *  */
    @Test
    public void testGetLabelGenerator_ReturnThisLabelGenerator() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        StandardPieSectionLabelGenerator labelGenerator = ((StandardPieSectionLabelGenerator) createInstance("org.jfree.chart.labels.StandardPieSectionLabelGenerator"));
        piePlot.setLabelGenerator(labelGenerator);
        
        StandardPieSectionLabelGenerator actual = ((StandardPieSectionLabelGenerator) piePlot.getLabelGenerator());
        
        // org.jfree.chart.labels.StandardPieSectionLabelGenerator has overridden equals method
        assertEquals(labelGenerator, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelGap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelGap(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelGap(double)}
 *  */
    @Test
    public void testSetLabelGap() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setLabelGap(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelGap(java.lang.Double.NaN);
            
            double finalPiePlotLabelGap = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelGap"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotLabelGap, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelGap(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelGap_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setLabelGap(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelGap(java.lang.Double.NaN);
            
            double finalPiePlotLabelGap = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelGap"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotLabelGap, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelGap(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetLabelGap_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setLabelGap(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLabelGap(java.lang.Double.NaN);
            
            double finalPiePlotLabelGap = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelGap"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotLabelGap, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelGap(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelGap(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelGap_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setLabelGap(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelGap] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelGap(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setLabelGap(double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelGap(double)}
     */
    @Test
    public void testSetLabelGapWithCornerCase() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setLabelGap(java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setSectionPaint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSectionPaint(java.lang.Comparable, java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSectionPaint(java.lang.Comparable,java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.PaintMap#put(java.lang.Comparable,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.sectionPaintMap.put(key, paint);
 *  */
    @Test
    public void testSetSectionPaint_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.setSectionPaint] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.setSectionPaint(PiePlot.java:922) */
        piePlot.setSectionPaint(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSectionPaint(java.lang.Comparable, java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSectionPaint(java.lang.Comparable,java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.PaintMap#put(java.lang.Comparable,java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.sectionPaintMap.put(key, paint);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSectionPaint_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PaintMap sectionPaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionPaintMap", sectionPaintMap);
        
        piePlot.setSectionPaint(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSectionPaint(java.lang.Comparable, java.awt.Paint)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSectionPaint(java.lang.Comparable,java.awt.Paint)}
     */
    @Test
    public void testSetSectionPaint() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.NEGATIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(-1L, -1L);
        Color color = new Color(Integer.MAX_VALUE, true);
        
        piePlot.setSectionPaint(simpleTimePeriod, color);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSectionPaint(java.lang.Comparable, java.awt.Paint)
    
    @Test
    public void testSetSectionPaint1() throws Throwable  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PaintMap sectionPaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        LinkedHashMap store = new LinkedHashMap();
        setField(sectionPaintMap, "org.jfree.chart.PaintMap", "store", store);
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionPaintMap", sectionPaintMap);
        Class naturalOrderComparatorClazz = Class.forName("java.util.Comparators$NaturalOrderComparator");
        Object naturalOrderComparator = getEnumConstantByName(naturalOrderComparatorClazz, "INSTANCE");
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.setSectionPaint] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.notifyListeners(Plot.java:890)
            org.jfree.chart.plot.PiePlot.setSectionPaint(PiePlot.java:923) */
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class naturalOrderComparatorType = Class.forName("java.lang.Comparable");
        Class paintType = Class.forName("java.awt.Paint");
        Method setSectionPaintMethod = piePlotClazz.getDeclaredMethod("setSectionPaint", naturalOrderComparatorType, paintType);
        setSectionPaintMethod.setAccessible(true);
        java.lang.Object[] setSectionPaintMethodArguments = new java.lang.Object[2];
        setSectionPaintMethodArguments[0] = naturalOrderComparator;
        setSectionPaintMethodArguments[1] = ((Object) null);
        try {
            setSectionPaintMethod.invoke(piePlot, setSectionPaintMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getShadowXOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShadowXOffset()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getShadowXOffset()}
 * @utbot.returnsFrom {@code return this.shadowXOffset;}
 *  */
    @Test
    public void testGetShadowXOffset_ReturnThisShadowXOffset() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setShadowXOffset(0.0);
        
        double actual = piePlot.getShadowXOffset();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setShadowPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setShadowPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetShadowPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            LinearGradientPaint shadowPaint = ((LinearGradientPaint) createInstance("java.awt.LinearGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class shadowPaintType = Class.forName("java.awt.Paint");
            Method setShadowPaintMethod = piePlotClazz.getDeclaredMethod("setShadowPaint", shadowPaintType);
            setShadowPaintMethod.setAccessible(true);
            java.lang.Object[] setShadowPaintMethodArguments = new java.lang.Object[1];
            setShadowPaintMethodArguments[0] = shadowPaint;
            setShadowPaintMethod.invoke(piePlot, setShadowPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setShadowPaint(null);
            
            Paint finalPiePlotShadowPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "shadowPaint"));
            
            assertNull(finalPiePlotShadowPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetShadowPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            LinearGradientPaint shadowPaint = ((LinearGradientPaint) createInstance("java.awt.LinearGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class shadowPaintType = Class.forName("java.awt.Paint");
            Method setShadowPaintMethod = piePlotClazz.getDeclaredMethod("setShadowPaint", shadowPaintType);
            setShadowPaintMethod.setAccessible(true);
            java.lang.Object[] setShadowPaintMethodArguments = new java.lang.Object[1];
            setShadowPaintMethodArguments[0] = shadowPaint;
            setShadowPaintMethod.invoke(piePlot, setShadowPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setShadowPaint(null);
            
            Paint finalPiePlotShadowPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "shadowPaint"));
            
            assertNull(finalPiePlotShadowPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetShadowPaint_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            LinearGradientPaint shadowPaint = ((LinearGradientPaint) createInstance("java.awt.LinearGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class shadowPaintType = Class.forName("java.awt.Paint");
            Method setShadowPaintMethod = piePlotClazz.getDeclaredMethod("setShadowPaint", shadowPaintType);
            setShadowPaintMethod.setAccessible(true);
            java.lang.Object[] setShadowPaintMethodArguments = new java.lang.Object[1];
            setShadowPaintMethodArguments[0] = shadowPaint;
            setShadowPaintMethod.invoke(piePlot, setShadowPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setShadowPaint(null);
            
            Paint finalPiePlotShadowPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "shadowPaint"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            assertNull(finalPiePlotShadowPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setShadowPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setShadowPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetShadowPaint_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RadialGradientPaint shadowPaint = ((RadialGradientPaint) createInstance("java.awt.RadialGradientPaint"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class shadowPaintType = Class.forName("java.awt.Paint");
            Method setShadowPaintMethod = piePlotClazz.getDeclaredMethod("setShadowPaint", shadowPaintType);
            setShadowPaintMethod.setAccessible(true);
            java.lang.Object[] setShadowPaintMethodArguments = new java.lang.Object[1];
            setShadowPaintMethodArguments[0] = shadowPaint;
            setShadowPaintMethod.invoke(piePlot, setShadowPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setShadowPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setShadowPaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getExplodePercent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getExplodePercent(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getExplodePercent(java.lang.Comparable)}
 * @utbot.executesCondition {@code (this.explodePercentages != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetExplodePercent_ThisExplodePercentagesEqualsNull() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        double actual = piePlot.getExplodePercent(null);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        
        Map finalPiePlotExplodePercentages = ((Map) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "explodePercentages"));
        
        assertNull(finalPiePlotExplodePercentages);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getExplodePercent(java.lang.Comparable)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getExplodePercent(java.lang.Comparable)}
     */
    @Test
    public void testGetExplodePercentReturnsZero() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(java.lang.Double.POSITIVE_INFINITY);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.NaN);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(java.lang.Float.NEGATIVE_INFINITY, 1, 0, java.lang.Float.POSITIVE_INFINITY);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        SimpleTimePeriod simpleTimePeriod = new SimpleTimePeriod(-1L, -1L);
        
        double actual = piePlot.getExplodePercent(simpleTimePeriod);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getSectionPaint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSectionPaint(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getSectionPaint(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.chart.PaintMap#getPaint(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.sectionPaintMap.getPaint(key);
 *  */
    @Test
    public void testGetSectionPaint_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.getSectionPaint] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.getSectionPaint(PiePlot.java:903) */
        piePlot.getSectionPaint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSectionPaint(java.lang.Comparable)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getSectionPaint(java.lang.Comparable)}
 * @utbot.invokes {@link org.jfree.chart.PaintMap#getPaint(java.lang.Comparable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return this.sectionPaintMap.getPaint(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSectionPaint_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PaintMap sectionPaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionPaintMap", sectionPaintMap);
        
        piePlot.getSectionPaint(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSectionPaint(java.lang.Comparable)
    
    @Test
    public void testGetSectionPaint1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PaintMap sectionPaintMap = ((PaintMap) createInstance("org.jfree.chart.PaintMap"));
        LinkedHashMap store = new LinkedHashMap();
        setField(sectionPaintMap, "org.jfree.chart.PaintMap", "store", store);
        setField(piePlot, "org.jfree.chart.plot.PiePlot", "sectionPaintMap", sectionPaintMap);
        Object anonymousCADistrustPolicy = createInstance("sun.security.validator.CADistrustPolicy$1");
        
        Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
        Class anonymousCADistrustPolicyType = Class.forName("java.lang.Comparable");
        Method getSectionPaintMethod = piePlotClazz.getDeclaredMethod("getSectionPaint", anonymousCADistrustPolicyType);
        getSectionPaintMethod.setAccessible(true);
        java.lang.Object[] getSectionPaintMethodArguments = new java.lang.Object[1];
        getSectionPaintMethodArguments[0] = anonymousCADistrustPolicy;
        Paint actual = ((Paint) getSectionPaintMethod.invoke(piePlot, getSectionPaintMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelLinkMargin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelLinkMargin()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelLinkMargin()}
 * @utbot.returnsFrom {@code return this.labelLinkMargin;}
 *  */
    @Test
    public void testGetLabelLinkMargin_ReturnThisLabelLinkMargin() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setLabelLinkMargin(0.0);
        
        double actual = piePlot.getLabelLinkMargin();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetLabelPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Color labelPaint = ((Color) createInstance("java.awt.Color"));
            piePlot.setLabelPaint(labelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialPiePlotLabelPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPaint"));
            
            piePlot.setLabelPaint(color);
            
            Paint finalPiePlotLabelPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPaint"));
            
            assertFalse(initialPiePlotLabelPaint == finalPiePlotLabelPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Color labelPaint = ((Color) createInstance("java.awt.Color"));
            piePlot.setLabelPaint(labelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialPiePlotLabelPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPaint"));
            
            piePlot.setLabelPaint(color);
            
            Paint finalPiePlotLabelPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPaint"));
            
            assertFalse(initialPiePlotLabelPaint == finalPiePlotLabelPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetLabelPaint_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Color labelPaint = ((Color) createInstance("java.awt.Color"));
            piePlot.setLabelPaint(labelPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            ColorUIResource colorUIResource = new ColorUIResource(0);
            
            Paint initialPiePlotLabelPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPaint"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class colorUIResourceType = Class.forName("java.awt.Paint");
            Method setLabelPaintMethod = piePlotClazz.getDeclaredMethod("setLabelPaint", colorUIResourceType);
            setLabelPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelPaintMethodArguments = new java.lang.Object[1];
            setLabelPaintMethodArguments[0] = colorUIResource;
            setLabelPaintMethod.invoke(piePlot, setLabelPaintMethodArguments);
            
            Paint finalPiePlotLabelPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPaint"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotLabelPaint == finalPiePlotLabelPaint);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLabelPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPaint_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setLabelPaint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelPaint_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            ColorUIResource labelPaint = ((ColorUIResource) createInstance("javax.swing.plaf.ColorUIResource"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelPaintType = Class.forName("java.awt.Paint");
            Method setLabelPaintMethod = piePlotClazz.getDeclaredMethod("setLabelPaint", labelPaintType);
            setLabelPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelPaintMethodArguments = new java.lang.Object[1];
            setLabelPaintMethodArguments[0] = labelPaint;
            setLabelPaintMethod.invoke(piePlot, setLabelPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelPaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPaint(java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelPaint_ThrowClassCastException_1() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            ColorUIResource labelPaint = ((ColorUIResource) createInstance("javax.swing.plaf.ColorUIResource"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelPaintType = Class.forName("java.awt.Paint");
            Method setLabelPaintMethod = piePlotClazz.getDeclaredMethod("setLabelPaint", labelPaintType);
            setLabelPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelPaintMethodArguments = new java.lang.Object[1];
            setLabelPaintMethodArguments[0] = labelPaint;
            setLabelPaintMethod.invoke(piePlot, setLabelPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            ColorUIResource colorUIResource = new ColorUIResource(0);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            java.lang.Object[] setLabelPaintMethodArguments1 = new java.lang.Object[1];
            setLabelPaintMethodArguments1[0] = colorUIResource;
            try {
                setLabelPaintMethod.invoke(piePlot, setLabelPaintMethodArguments1);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelLinkMargin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelLinkMargin(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkMargin(double)}
 *  */
    @Test
    public void testSetLabelLinkMargin() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setLabelLinkMargin(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelLinkMargin(java.lang.Double.NaN);
            
            double finalPiePlotLabelLinkMargin = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkMargin"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotLabelLinkMargin, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkMargin(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelLinkMargin_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setLabelLinkMargin(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setLabelLinkMargin(java.lang.Double.NaN);
            
            double finalPiePlotLabelLinkMargin = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkMargin"));
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotLabelLinkMargin, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkMargin(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetLabelLinkMargin_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setLabelLinkMargin(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLabelLinkMargin(java.lang.Double.NaN);
            
            double finalPiePlotLabelLinkMargin = ((Double) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkMargin"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            org.junit.Assert.assertEquals(java.lang.Double.NaN, finalPiePlotLabelLinkMargin, 1.0E-6);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelLinkMargin(double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkMargin(double)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelLinkMargin_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            piePlot.setLabelLinkMargin(0.0);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelLinkMargin] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelLinkMargin(java.lang.Double.NaN);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setLabelLinkMargin(double)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkMargin(double)}
     */
    @Test
    public void testSetLabelLinkMarginWithCornerCase() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setLabelLinkMargin(java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setSimpleLabels
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSimpleLabels(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSimpleLabels(boolean)}
 *  */
    @Test
    public void testSetSimpleLabels() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setSimpleLabels(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSimpleLabels(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetSimpleLabels_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setSimpleLabels(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSimpleLabels(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetSimpleLabels_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setSimpleLabels(false);
            
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSimpleLabels(boolean)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSimpleLabels(boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetSimpleLabels_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setSimpleLabels] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setSimpleLabels(false);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSimpleLabels(boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setSimpleLabels(boolean)}
     */
    @Test
    public void testSetSimpleLabels1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        piePlot.setSimpleLabels(true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelFont
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelFont(java.awt.Font)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelFont(java.awt.Font)}
 *  */
    @Test
    public void testSetLabelFont() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            FontUIResource labelFont = ((FontUIResource) createInstance("javax.swing.plaf.FontUIResource"));
            piePlot.setLabelFont(labelFont);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Font font = ((Font) createInstance("java.awt.Font"));
            
            Font initialPiePlotLabelFont = ((Font) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelFont"));
            
            piePlot.setLabelFont(font);
            
            Font finalPiePlotLabelFont = ((Font) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelFont"));
            
            assertFalse(initialPiePlotLabelFont == finalPiePlotLabelFont);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelFont(java.awt.Font)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelFont_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            FontUIResource labelFont = ((FontUIResource) createInstance("javax.swing.plaf.FontUIResource"));
            piePlot.setLabelFont(labelFont);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Font font = ((Font) createInstance("java.awt.Font"));
            
            Font initialPiePlotLabelFont = ((Font) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelFont"));
            
            piePlot.setLabelFont(font);
            
            Font finalPiePlotLabelFont = ((Font) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelFont"));
            
            assertFalse(initialPiePlotLabelFont == finalPiePlotLabelFont);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelFont(java.awt.Font)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetLabelFont_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Font labelFont = ((Font) createInstance("java.awt.Font"));
            piePlot.setLabelFont(labelFont);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Font font = ((Font) createInstance("java.awt.Font"));
            
            Font initialPiePlotLabelFont = ((Font) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelFont"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLabelFont(font);
            
            Font finalPiePlotLabelFont = ((Font) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelFont"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotLabelFont == finalPiePlotLabelFont);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelFont(java.awt.Font)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetLabelFont_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Font labelFont = ((Font) createInstance("java.awt.Font"));
            piePlot.setLabelFont(labelFont);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = {null};
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Font font = ((Font) createInstance("java.awt.Font"));
            
            Font initialPiePlotLabelFont = ((Font) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelFont"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLabelFont(font);
            
            Font finalPiePlotLabelFont = ((Font) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelFont"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotLabelFont == finalPiePlotLabelFont);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLabelFont(java.awt.Font)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelFont(java.awt.Font)}
 * @utbot.executesCondition {@code (font == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: font == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelFont_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setLabelFont(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelFont(java.awt.Font)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelFont(java.awt.Font)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelFont_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            FontUIResource labelFont = ((FontUIResource) createInstance("javax.swing.plaf.FontUIResource"));
            piePlot.setLabelFont(labelFont);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            FontUIResource fontUIResource = ((FontUIResource) createInstance("javax.swing.plaf.FontUIResource"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelFont] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelFont(fontUIResource);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelFont(java.awt.Font)}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelFont_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Font labelFont = ((Font) createInstance("java.awt.Font"));
            piePlot.setLabelFont(labelFont);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Font font = ((Font) createInstance("java.awt.Font"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelFont] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            piePlot.setLabelFont(font);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLabelFont
    
    public void testSetLabelFont_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelLinkPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelLinkPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetLabelLinkPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Color labelLinkPaint = ((Color) createInstance("java.awt.Color"));
            piePlot.setLabelLinkPaint(labelLinkPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialPiePlotLabelLinkPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkPaint"));
            
            piePlot.setLabelLinkPaint(color);
            
            Paint finalPiePlotLabelLinkPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkPaint"));
            
            assertFalse(initialPiePlotLabelLinkPaint == finalPiePlotLabelLinkPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelLinkPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Color labelLinkPaint = ((Color) createInstance("java.awt.Color"));
            piePlot.setLabelLinkPaint(labelLinkPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            Paint initialPiePlotLabelLinkPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkPaint"));
            
            piePlot.setLabelLinkPaint(color);
            
            Paint finalPiePlotLabelLinkPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkPaint"));
            
            assertFalse(initialPiePlotLabelLinkPaint == finalPiePlotLabelLinkPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetLabelLinkPaint_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            Color labelLinkPaint = ((Color) createInstance("java.awt.Color"));
            piePlot.setLabelLinkPaint(labelLinkPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            ColorUIResource colorUIResource = new ColorUIResource(0);
            
            Paint initialPiePlotLabelLinkPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkPaint"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class colorUIResourceType = Class.forName("java.awt.Paint");
            Method setLabelLinkPaintMethod = piePlotClazz.getDeclaredMethod("setLabelLinkPaint", colorUIResourceType);
            setLabelLinkPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelLinkPaintMethodArguments = new java.lang.Object[1];
            setLabelLinkPaintMethodArguments[0] = colorUIResource;
            setLabelLinkPaintMethod.invoke(piePlot, setLabelLinkPaintMethodArguments);
            
            Paint finalPiePlotLabelLinkPaint = ((Paint) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkPaint"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotLabelLinkPaint == finalPiePlotLabelLinkPaint);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLabelLinkPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelLinkPaint_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setLabelLinkPaint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelLinkPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelLinkPaint_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            ColorUIResource labelLinkPaint = ((ColorUIResource) createInstance("javax.swing.plaf.ColorUIResource"));
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class labelLinkPaintType = Class.forName("java.awt.Paint");
            Method setLabelLinkPaintMethod = piePlotClazz.getDeclaredMethod("setLabelLinkPaint", labelLinkPaintType);
            setLabelLinkPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelLinkPaintMethodArguments = new java.lang.Object[1];
            setLabelLinkPaintMethodArguments[0] = labelLinkPaint;
            setLabelLinkPaintMethod.invoke(piePlot, setLabelLinkPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            Color color = new Color(0);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelLinkPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelLinkPaint(color);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkPaint(java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelLinkPaint_ThrowClassCastException_1() throws Throwable  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            SystemColor systemColor = ((SystemColor) createInstance("java.awt.SystemColor"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelLinkPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            Class piePlotClazz = Class.forName("org.jfree.chart.plot.PiePlot");
            Class systemColorType = Class.forName("java.awt.Paint");
            Method setLabelLinkPaintMethod = piePlotClazz.getDeclaredMethod("setLabelLinkPaint", systemColorType);
            setLabelLinkPaintMethod.setAccessible(true);
            java.lang.Object[] setLabelLinkPaintMethodArguments = new java.lang.Object[1];
            setLabelLinkPaintMethodArguments[0] = systemColor;
            try {
                setLabelLinkPaintMethod.invoke(piePlot, setLabelLinkPaintMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelLinkStroke
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getLabelLinkStroke()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelLinkStroke()}
     */
    @Test
    public void testGetLabelLinkStroke() throws Exception  {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 3.85186E-34f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(-1);
        
        BasicStroke actual = ((BasicStroke) piePlot.getLabelLinkStroke());
        
        BasicStroke expected = ((BasicStroke) createInstance("java.awt.BasicStroke"));
        
        // java.awt.BasicStroke has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getLabelLinkStroke
    
    public void testGetLabelLinkStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelPadding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelPadding()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelPadding()}
 * @utbot.returnsFrom {@code return this.labelPadding;}
 *  */
    @Test
    public void testGetLabelPadding_ReturnThisLabelPadding() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        RectangleInsets actual = piePlot.getLabelPadding();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getSimpleLabels
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSimpleLabels()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getSimpleLabels()}
 * @utbot.returnsFrom {@code return this.simpleLabels;}
 *  */
    @Test
    public void testGetSimpleLabels_ReturnThisSimpleLabels() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        boolean actual = piePlot.getSimpleLabels();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelLinkPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelLinkPaint()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelLinkPaint()}
 * @utbot.returnsFrom {@code return this.labelLinkPaint;}
 *  */
    @Test
    public void testGetLabelLinkPaint_ReturnThisLabelLinkPaint() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Paint actual = piePlot.getLabelLinkPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelFont
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelFont()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelFont()}
 * @utbot.returnsFrom {@code return this.labelFont;}
 *  */
    @Test
    public void testGetLabelFont_ReturnThisLabelFont() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Font actual = piePlot.getLabelFont();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelPadding
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelPadding(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPadding(org.jfree.chart.util.RectangleInsets)}
 *  */
    @Test
    public void testSetLabelPadding() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets labelPadding = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            piePlot.setLabelPadding(labelPadding);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialPiePlotLabelPadding = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPadding"));
            
            piePlot.setLabelPadding(rectangleInsets);
            
            RectangleInsets finalPiePlotLabelPadding = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPadding"));
            
            assertFalse(initialPiePlotLabelPadding == finalPiePlotLabelPadding);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPadding(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelPadding_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets labelPadding = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            piePlot.setLabelPadding(labelPadding);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialPiePlotLabelPadding = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPadding"));
            
            piePlot.setLabelPadding(rectangleInsets);
            
            RectangleInsets finalPiePlotLabelPadding = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPadding"));
            
            assertFalse(initialPiePlotLabelPadding == finalPiePlotLabelPadding);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPadding(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetLabelPadding_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets labelPadding = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            piePlot.setLabelPadding(labelPadding);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialPiePlotLabelPadding = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPadding"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLabelPadding(rectangleInsets);
            
            RectangleInsets finalPiePlotLabelPadding = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPadding"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotLabelPadding == finalPiePlotLabelPadding);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPadding(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 *  */
    @Test
    public void testSetLabelPadding_3() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets labelPadding = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            piePlot.setLabelPadding(labelPadding);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = {null};
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            RectangleInsets initialPiePlotLabelPadding = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPadding"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLabelPadding(rectangleInsets);
            
            RectangleInsets finalPiePlotLabelPadding = ((RectangleInsets) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelPadding"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotLabelPadding == finalPiePlotLabelPadding);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLabelPadding(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPadding(org.jfree.chart.util.RectangleInsets)}
 * @utbot.executesCondition {@code (padding == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: padding == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPadding_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setLabelPadding(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelPadding(org.jfree.chart.util.RectangleInsets)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPadding(org.jfree.chart.util.RectangleInsets)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelPadding_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets labelPadding = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            piePlot.setLabelPadding(labelPadding);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelPadding] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelPadding(rectangleInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelPadding(org.jfree.chart.util.RectangleInsets)}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelPadding_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets labelPadding = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            piePlot.setLabelPadding(labelPadding);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelPadding] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            piePlot.setLabelPadding(rectangleInsets);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLabelPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLabelPaint()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLabelPaint()}
 * @utbot.returnsFrom {@code return this.labelPaint;}
 *  */
    @Test
    public void testGetLabelPaint_ReturnThisLabelPaint() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Paint actual = piePlot.getLabelPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLabelLinkStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLabelLinkStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetLabelLinkStroke() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke labelLinkStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setLabelLinkStroke(labelLinkStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialPiePlotLabelLinkStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkStroke"));
            
            piePlot.setLabelLinkStroke(basicStroke);
            
            Stroke finalPiePlotLabelLinkStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkStroke"));
            
            assertFalse(initialPiePlotLabelLinkStroke == finalPiePlotLabelLinkStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetLabelLinkStroke_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke labelLinkStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setLabelLinkStroke(labelLinkStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialPiePlotLabelLinkStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkStroke"));
            
            piePlot.setLabelLinkStroke(basicStroke);
            
            Stroke finalPiePlotLabelLinkStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkStroke"));
            
            assertFalse(initialPiePlotLabelLinkStroke == finalPiePlotLabelLinkStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetLabelLinkStroke_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke labelLinkStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setLabelLinkStroke(labelLinkStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            Stroke initialPiePlotLabelLinkStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkStroke"));
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setLabelLinkStroke(basicStroke);
            
            Stroke finalPiePlotLabelLinkStroke = ((Stroke) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "labelLinkStroke"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotLabelLinkStroke == finalPiePlotLabelLinkStroke);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLabelLinkStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (stroke == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: stroke == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelLinkStroke_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setLabelLinkStroke(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLabelLinkStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkStroke(java.awt.Stroke)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelLinkStroke_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke labelLinkStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setLabelLinkStroke(labelLinkStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelLinkStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setLabelLinkStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLabelLinkStroke(java.awt.Stroke)}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetLabelLinkStroke_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            BasicStroke labelLinkStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            piePlot.setLabelLinkStroke(labelLinkStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            EventListenerList changeListeners = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList2 = new java.lang.Object[2];
            listenerList2[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList2[1] = object;
            setField(changeListeners, "javax.swing.event.EventListenerList", "listenerList", listenerList2);
            setField(jFreeChart, "org.jfree.chart.JFreeChart", "changeListeners", changeListeners);
            jFreeChart.setNotify(true);
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            BasicStroke basicStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setLabelLinkStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.ChartChangeListener] */
            piePlot.setLabelLinkStroke(basicStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.draw
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#draw(java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#getInsets()}
 * @utbot.invokes {@link org.jfree.chart.util.RectangleInsets#trim(java.awt.geom.Rectangle2D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insets.trim(area);
 *  */
    @Test
    public void testDraw_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.draw] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.draw(PiePlot.java:2074) */
        piePlot.draw(null, null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test
    public void testDraw1() throws Exception  {
        UnitType prevRELATIVE = UnitType.RELATIVE;
        try {
            UnitType relative = ((UnitType) createInstance("org.jfree.chart.util.UnitType"));
            String name = "UnitType.RELATIVE";
            setField(relative, "org.jfree.chart.util.UnitType", "name", name);
            Class unitTypeClazz = Class.forName("org.jfree.chart.util.UnitType");
            setStaticField(unitTypeClazz, "RELATIVE", relative);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets insets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(insets, "org.jfree.chart.util.RectangleInsets", "top", java.lang.Double.NaN);
            setField(insets, "org.jfree.chart.util.RectangleInsets", "left", 0.0);
            setField(insets, "org.jfree.chart.util.RectangleInsets", "bottom", java.lang.Double.NaN);
            setField(insets, "org.jfree.chart.util.RectangleInsets", "right", java.lang.Double.NaN);
            piePlot.setInsets(insets);
            java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.draw] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.PiePlot.draw(PiePlot.java:2084) */
            piePlot.draw(null, float1, null, null, null);
        } finally {
            setStaticField(UnitType.class, "RELATIVE", prevRELATIVE);
        }
    }
    
    @Test
    public void testDraw2() throws Exception  {
        UnitType prevRELATIVE = UnitType.RELATIVE;
        try {
            UnitType relative = ((UnitType) createInstance("org.jfree.chart.util.UnitType"));
            Class unitTypeClazz = Class.forName("org.jfree.chart.util.UnitType");
            setStaticField(unitTypeClazz, "RELATIVE", relative);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RectangleInsets insets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(insets, "org.jfree.chart.util.RectangleInsets", "unitType", relative);
            setField(insets, "org.jfree.chart.util.RectangleInsets", "top", java.lang.Double.NaN);
            setField(insets, "org.jfree.chart.util.RectangleInsets", "left", 0.0);
            setField(insets, "org.jfree.chart.util.RectangleInsets", "right", java.lang.Double.NaN);
            piePlot.setInsets(insets);
            java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.draw] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.PiePlot.draw(PiePlot.java:2084) */
            piePlot.draw(null, float1, null, null, null);
        } finally {
            setStaticField(UnitType.class, "RELATIVE", prevRELATIVE);
        }
    }
    ///endregion
    
    ///region Errors report for draw
    
    public void testDraw_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setLegendItemShape
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLegendItemShape(java.awt.Shape)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setLegendItemShape(java.awt.Shape)}
 * @utbot.executesCondition {@code (shape == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: shape == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendItemShape_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.setLegendItemShape(null);
    }
    ///endregion
    
    ///region Errors report for setLegendItemShape
    
    public void testSetLegendItemShape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.drawPie
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawPie(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawPie(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#initialise(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlot,java.lang.Integer,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: PiePlotState state = initialise(g2, plotArea, this, null, info);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawPie_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.drawPie(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method drawPie(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawPie(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo)}
     */
    @Test
    public void testDrawPieThrowsNPE() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(0);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(0, 0, 1);
        bufferedImage.setAccelerationPriority(java.lang.Float.NaN);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(-1.0f, 0, Integer.MAX_VALUE, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(0);
        Rectangle rectangle = new Rectangle();
        rectangle.y = 0;
        rectangle.width = 1;
        rectangle.height = 1;
        rectangle.x = -1;
        ChartRenderingInfo chartRenderingInfo = new ChartRenderingInfo();
        Rectangle rectangle1 = new Rectangle(((Point) null));
        rectangle1.y = Integer.MIN_VALUE;
        rectangle1.height = 1;
        rectangle1.x = 0;
        rectangle1.width = -1;
        chartRenderingInfo.setChartArea(rectangle1);
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(chartRenderingInfo);
        Dimension dimension = new Dimension(1, 0);
        dimension.width = 1;
        dimension.height = 1;
        Rectangle rectangle2 = new Rectangle(dimension);
        rectangle2.x = 1;
        rectangle2.width = 0;
        rectangle2.y = 1;
        rectangle2.height = 0;
        plotRenderingInfo.setPlotArea(rectangle2);
        java.awt.geom.Rectangle2D.Double double1 = new java.awt.geom.Rectangle2D.Double();
        double1.y = 2.0;
        double1.x = -1.0;
        double1.width = java.lang.Double.NEGATIVE_INFINITY;
        double1.height = 1.000000000001819;
        plotRenderingInfo.setDataArea(double1);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawPie] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.Plot.drawNoDataMessage(Plot.java:1047)
            org.jfree.chart.plot.PiePlot.drawPie(PiePlot.java:2235) */
        piePlot.drawPie(null, rectangle, plotRenderingInfo);
    }
    ///endregion
    
    ///region Errors report for drawPie
    
    public void testDrawPie_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // No method source set for method <java.lang.Object: java.lang.Object clone()>
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLegendItemShape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendItemShape()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLegendItemShape()}
 * @utbot.returnsFrom {@code return this.legendItemShape;}
 *  */
    @Test
    public void testGetLegendItemShape_ReturnThisLegendItemShape() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Shape actual = piePlot.getLegendItemShape();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.initialise
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlot, java.lang.Integer, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#initialise(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlot,java.lang.Integer,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlotState#setPassesRequired(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: plot.getDataset()
 *  */
    @Test
    public void testInitialise_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.initialise] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.initialise(PiePlot.java:2052) */
        piePlot.initialise(null, null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlot, java.lang.Integer, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#initialise(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlot,java.lang.Integer,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlotState#setPassesRequired(int)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#getDataset()}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#calculatePieDatasetTotal(org.jfree.data.general.PieDataset)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: state.setTotal(DatasetUtilities.calculatePieDatasetTotal(plot.getDataset()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialise_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PiePlot piePlot1 = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        piePlot.initialise(null, null, piePlot1, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlot, java.lang.Integer, org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test
    public void testInitialise1() throws Exception  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            PiePlot3D piePlot3D = ((PiePlot3D) createInstance("org.jfree.chart.plot.PiePlot3D"));
            CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            DefaultCategoryDataset source = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList columnKeys = new ArrayList();
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
            setField(source, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "extract", byRow);
            piePlot3D.setDataset(dataset);
            
            PiePlotState actual = piePlot.initialise(null, null, piePlot3D, null, null);
            
            PiePlotState expected = new PiePlotState(null);
            expected.setPassesRequired(2);
            expected.setTotal(0.0);
            
            int expectedPassesRequired = expected.getPassesRequired();
            int actualPassesRequired = actual.getPassesRequired();
            assertEquals(expectedPassesRequired, actualPassesRequired);
            
            double expectedTotal = expected.getTotal();
            double actualTotal = actual.getTotal();
            org.junit.Assert.assertEquals(expectedTotal, actualTotal, 1.0E-6);
            
            double expectedLatestAngle = expected.getLatestAngle();
            double actualLatestAngle = actual.getLatestAngle();
            org.junit.Assert.assertEquals(expectedLatestAngle, actualLatestAngle, 1.0E-6);
            
            Rectangle2D actualExplodedPieArea = actual.getExplodedPieArea();
            assertNull(actualExplodedPieArea);
            
            Rectangle2D actualPieArea = actual.getPieArea();
            assertNull(actualPieArea);
            
            double expectedPieCenterX = expected.getPieCenterX();
            double actualPieCenterX = actual.getPieCenterX();
            org.junit.Assert.assertEquals(expectedPieCenterX, actualPieCenterX, 1.0E-6);
            
            double expectedPieCenterY = expected.getPieCenterY();
            double actualPieCenterY = actual.getPieCenterY();
            org.junit.Assert.assertEquals(expectedPieCenterY, actualPieCenterY, 1.0E-6);
            
            double expectedPieHRadius = expected.getPieHRadius();
            double actualPieHRadius = actual.getPieHRadius();
            org.junit.Assert.assertEquals(expectedPieHRadius, actualPieHRadius, 1.0E-6);
            
            double expectedPieWRadius = expected.getPieWRadius();
            double actualPieWRadius = actual.getPieWRadius();
            org.junit.Assert.assertEquals(expectedPieWRadius, actualPieWRadius, 1.0E-6);
            
            Rectangle2D actualLinkArea = actual.getLinkArea();
            assertNull(actualLinkArea);
            
            PlotRenderingInfo actualInfo = actual.getInfo();
            assertNull(actualInfo);
            
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    @Test
    public void testInitialise2() throws Exception  {
        TableOrder prevBY_COLUMN = TableOrder.BY_COLUMN;
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byColumn = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_COLUMN", byColumn);
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name);
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            RingPlot ringPlot = ((RingPlot) createInstance("org.jfree.chart.plot.RingPlot"));
            CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            DefaultCategoryDataset source = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList rowKeys = new ArrayList();
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "rowKeys", rowKeys);
            setField(source, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "extract", byColumn);
            ringPlot.setDataset(dataset);
            
            PiePlotState actual = piePlot.initialise(null, null, ringPlot, null, null);
            
            PiePlotState expected = new PiePlotState(null);
            expected.setPassesRequired(2);
            expected.setTotal(0.0);
            
            int expectedPassesRequired = expected.getPassesRequired();
            int actualPassesRequired = actual.getPassesRequired();
            assertEquals(expectedPassesRequired, actualPassesRequired);
            
            double expectedTotal = expected.getTotal();
            double actualTotal = actual.getTotal();
            org.junit.Assert.assertEquals(expectedTotal, actualTotal, 1.0E-6);
            
            double expectedLatestAngle = expected.getLatestAngle();
            double actualLatestAngle = actual.getLatestAngle();
            org.junit.Assert.assertEquals(expectedLatestAngle, actualLatestAngle, 1.0E-6);
            
            Rectangle2D actualExplodedPieArea = actual.getExplodedPieArea();
            assertNull(actualExplodedPieArea);
            
            Rectangle2D actualPieArea = actual.getPieArea();
            assertNull(actualPieArea);
            
            double expectedPieCenterX = expected.getPieCenterX();
            double actualPieCenterX = actual.getPieCenterX();
            org.junit.Assert.assertEquals(expectedPieCenterX, actualPieCenterX, 1.0E-6);
            
            double expectedPieCenterY = expected.getPieCenterY();
            double actualPieCenterY = actual.getPieCenterY();
            org.junit.Assert.assertEquals(expectedPieCenterY, actualPieCenterY, 1.0E-6);
            
            double expectedPieHRadius = expected.getPieHRadius();
            double actualPieHRadius = actual.getPieHRadius();
            org.junit.Assert.assertEquals(expectedPieHRadius, actualPieHRadius, 1.0E-6);
            
            double expectedPieWRadius = expected.getPieWRadius();
            double actualPieWRadius = actual.getPieWRadius();
            org.junit.Assert.assertEquals(expectedPieWRadius, actualPieWRadius, 1.0E-6);
            
            Rectangle2D actualLinkArea = actual.getLinkArea();
            assertNull(actualLinkArea);
            
            PlotRenderingInfo actualInfo = actual.getInfo();
            assertNull(actualInfo);
            
        } finally {
            setStaticField(TableOrder.class, "BY_COLUMN", prevBY_COLUMN);
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///region Errors report for initialise
    
    public void testInitialise_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // No method source set for method <java.lang.Object: java.lang.Object clone()>
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.setURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setURLGenerator(org.jfree.chart.urls.PieURLGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setURLGenerator(org.jfree.chart.urls.PieURLGenerator)}
 *  */
    @Test
    public void testSetURLGenerator() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieURLGenerator urlGenerator = ((StandardPieURLGenerator) createInstance("org.jfree.chart.urls.StandardPieURLGenerator"));
            setField(piePlot, "org.jfree.chart.plot.PiePlot", "urlGenerator", urlGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setURLGenerator(null);
            
            PieURLGenerator finalPiePlotUrlGenerator = ((PieURLGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "urlGenerator"));
            
            assertNull(finalPiePlotUrlGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setURLGenerator(org.jfree.chart.urls.PieURLGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetURLGenerator_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieURLGenerator urlGenerator = ((StandardPieURLGenerator) createInstance("org.jfree.chart.urls.StandardPieURLGenerator"));
            setField(piePlot, "org.jfree.chart.plot.PiePlot", "urlGenerator", urlGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            piePlot.setURLGenerator(null);
            
            PieURLGenerator finalPiePlotUrlGenerator = ((PieURLGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "urlGenerator"));
            
            assertNull(finalPiePlotUrlGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setURLGenerator(org.jfree.chart.urls.PieURLGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.event.PlotChangeListener#plotChanged(org.jfree.chart.event.PlotChangeEvent)}
 *  */
    @Test
    public void testSetURLGenerator_2() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CustomPieURLGenerator urlGenerator = ((CustomPieURLGenerator) createInstance("org.jfree.chart.urls.CustomPieURLGenerator"));
            setField(piePlot, "org.jfree.chart.plot.PiePlot", "urlGenerator", urlGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            JFreeChart jFreeChart = ((JFreeChart) createInstance("org.jfree.chart.JFreeChart"));
            listenerList1[1] = ((Object) jFreeChart);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            EventListenerList piePlotListenerList = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerListListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList, "javax.swing.event.EventListenerList", "listenerList"));
            Object initialPiePlotListenerListListenerList0 = get(piePlotListenerListListenerListListenerList, 0);
            
            piePlot.setURLGenerator(null);
            
            PieURLGenerator finalPiePlotUrlGenerator = ((PieURLGenerator) getFieldValue(piePlot, "org.jfree.chart.plot.PiePlot", "urlGenerator"));
            EventListenerList piePlotListenerList1 = ((EventListenerList) getFieldValue(piePlot, "org.jfree.chart.plot.Plot", "listenerList"));
            java.lang.Object[] piePlotListenerList1ListenerListListenerList = ((java.lang.Object[]) getFieldValue(piePlotListenerList1, "javax.swing.event.EventListenerList", "listenerList"));
            Object finalPiePlotListenerListListenerList0 = get(piePlotListenerList1ListenerListListenerList, 0);
            
            assertFalse(initialPiePlotListenerListListenerList0 == finalPiePlotListenerListListenerList0);
            
            assertNull(finalPiePlotUrlGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setURLGenerator(org.jfree.chart.urls.PieURLGenerator)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setURLGenerator(org.jfree.chart.urls.PieURLGenerator)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlot#notifyListeners(org.jfree.chart.event.PlotChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new PlotChangeEvent(this));
 *  */
    @Test
    public void testSetURLGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            StandardPieURLGenerator urlGenerator = ((StandardPieURLGenerator) createInstance("org.jfree.chart.urls.StandardPieURLGenerator"));
            setField(piePlot, "org.jfree.chart.plot.PiePlot", "urlGenerator", urlGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(piePlot, "org.jfree.chart.plot.Plot", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.setURLGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.PlotChangeListener] */
            piePlot.setURLGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setURLGenerator(org.jfree.chart.urls.PieURLGenerator)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#setURLGenerator(org.jfree.chart.urls.PieURLGenerator)}
     */
    @Test
    public void testSetURLGenerator1() {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(-1);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(0.0);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE);
        bufferedImage.setAccelerationPriority(java.lang.Float.POSITIVE_INFINITY);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(0.0f, 1, 0, 0.0f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(Integer.MAX_VALUE);
        StandardPieURLGenerator standardPieURLGenerator = new StandardPieURLGenerator("#$\\\"'");
        
        piePlot.setURLGenerator(standardPieURLGenerator);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getURLGenerator()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getURLGenerator()}
 * @utbot.returnsFrom {@code return this.urlGenerator;}
 *  */
    @Test
    public void testGetURLGenerator_ReturnThisUrlGenerator() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        PieURLGenerator actual = piePlot.getURLGenerator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.drawLabels
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawLabels(java.awt.Graphics2D,java.util.List,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState)}
 * @utbot.invokes {@link java.awt.Graphics2D#getComposite()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Composite originalComposite = g2.getComposite();
 *  */
    @Test
    public void testDrawLabels_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawLabels] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawLabels(PiePlot.java:2442) */
        piePlot.drawLabels(null, null, java.lang.Double.NaN, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawLabels(java.awt.Graphics2D,java.util.List,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState)}
 * @utbot.invokes {@link java.awt.Graphics2D#getComposite()}
 * @utbot.invokes {@link java.awt.AlphaComposite#getInstance(int,float)}
 * @utbot.invokes {@link java.awt.Graphics2D#setComposite(java.awt.Composite)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawLabels_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        SunGraphics2D sunGraphics2D = ((SunGraphics2D) createInstance("sun.java2d.SunGraphics2D"));
        XORComposite composite = ((XORComposite) createInstance("sun.java2d.loops.XORComposite"));
        sunGraphics2D.setComposite(composite);
        ProxyGraphics2D proxyGraphics2D = new ProxyGraphics2D(sunGraphics2D, null);
        
        piePlot.drawLabels(proxyGraphics2D, null, java.lang.Double.NaN, null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawLabels
    
    public void testDrawLabels_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.DstOver accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Dst accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.AlphaXor accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcAtop accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.DstOut accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.DstAtop accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcIn accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.DstIn accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOut accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Clear accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOverNoEa accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOver accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcNoEa accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Src accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.drawSimpleLabels
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawSimpleLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawSimpleLabels(java.awt.Graphics2D,java.util.List,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState)}
 * @utbot.invokes {@link java.awt.Graphics2D#getComposite()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Composite originalComposite = g2.getComposite();
 *  */
    @Test
    public void testDrawSimpleLabels_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawSimpleLabels] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawSimpleLabels(PiePlot.java:2348) */
        piePlot.drawSimpleLabels(null, null, java.lang.Double.NaN, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawSimpleLabels(java.awt.Graphics2D, java.util.List, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawSimpleLabels(java.awt.Graphics2D,java.util.List,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawSimpleLabels_ThrowIllegalArgumentException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        SunGraphics2D sunGraphics2D = ((SunGraphics2D) createInstance("sun.java2d.SunGraphics2D"));
        XORComposite composite = ((XORComposite) createInstance("sun.java2d.loops.XORComposite"));
        sunGraphics2D.setComposite(composite);
        ProxyGraphics2D proxyGraphics2D = new ProxyGraphics2D(sunGraphics2D, null);
        
        piePlot.drawSimpleLabels(proxyGraphics2D, null, java.lang.Double.NaN, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawSimpleLabels(java.awt.Graphics2D,java.util.List,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState)}
 * @utbot.throwsException {@link java.lang.InternalError} in: g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
 *  */
    @Test(expected = InternalError.class)
    public void testDrawSimpleLabels_ThrowInternalError() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        SunGraphics2D sunGraphics2D = ((SunGraphics2D) createInstance("sun.java2d.SunGraphics2D"));
        AlphaComposite composite = ((AlphaComposite) createInstance("java.awt.AlphaComposite"));
        sunGraphics2D.setComposite(composite);
        ProxyGraphics2D proxyGraphics2D = new ProxyGraphics2D(sunGraphics2D, null);
        
        piePlot.drawSimpleLabels(proxyGraphics2D, null, java.lang.Double.NaN, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawSimpleLabels(java.awt.Graphics2D,java.util.List,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawSimpleLabels_ThrowIllegalArgumentException_1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        SunGraphics2D sunGraphics2D = ((SunGraphics2D) createInstance("sun.java2d.SunGraphics2D"));
        XORComposite composite = ((XORComposite) createInstance("sun.java2d.loops.XORComposite"));
        sunGraphics2D.setComposite(composite);
        ProxyGraphics2D proxyGraphics2D = new ProxyGraphics2D(sunGraphics2D, null);
        ProxyGraphics2D proxyGraphics2D1 = new ProxyGraphics2D(proxyGraphics2D, null);
        
        piePlot.drawSimpleLabels(proxyGraphics2D1, null, java.lang.Double.NaN, null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawSimpleLabels
    
    public void testDrawSimpleLabels_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.DstOver accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Dst accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.AlphaXor accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcAtop accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.DstOut accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.DstAtop accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcIn accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.DstIn accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOut accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Clear accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOverNoEa accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOver accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcNoEa accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Src accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.drawItem
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawItem(java.awt.Graphics2D, int, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState, int)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawItem(java.awt.Graphics2D,int,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState,int)}
 * @utbot.invokes {@link org.jfree.data.general.PieDataset#getValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number n = this.dataset.getValue(section);
 *  */
    @Test
    public void testDrawItem_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawItem] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawItem(PiePlot.java:2251) */
        piePlot.drawItem(null, -255, null, null, -255);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawItem(java.awt.Graphics2D, int, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState, int)
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDrawItem1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
        piePlot.setDataset(dataset);
        
        piePlot.drawItem(null, 0, null, null, 0);
    }
    ///endregion
    
    ///region Errors report for drawItem
    
    public void testDrawItem_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.drawLeftLabel
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawLeftLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawLeftLabel(java.awt.Graphics2D,org.jfree.chart.plot.PiePlotState,org.jfree.chart.plot.PieLabelRecord)}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlotState#getLinkArea()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double anchorX = state.getLinkArea().getMinX();
 *  */
    @Test
    public void testDrawLeftLabel_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawLeftLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawLeftLabel(PiePlot.java:2726) */
        piePlot.drawLeftLabel(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawLeftLabel(java.awt.Graphics2D,org.jfree.chart.plot.PiePlotState,org.jfree.chart.plot.PieLabelRecord)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double anchorX = state.getLinkArea().getMinX();
 *  */
    @Test
    public void testDrawLeftLabel_ThrowNullPointerException_1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PiePlotState piePlotState = new PiePlotState(null);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawLeftLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawLeftLabel(PiePlot.java:2726) */
        piePlot.drawLeftLabel(null, piePlotState, null);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawLeftLabel(java.awt.Graphics2D,org.jfree.chart.plot.PiePlotState,org.jfree.chart.plot.PieLabelRecord)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getMinX()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double targetX = anchorX - record.getGap();
 *  */
    @Test
    public void testDrawLeftLabel_ThrowNullPointerException_2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PiePlotState piePlotState = new PiePlotState(null);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
        piePlotState.setLinkArea(float1);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawLeftLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawLeftLabel(PiePlot.java:2727) */
        piePlot.drawLeftLabel(null, piePlotState, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawLeftLabel(java.awt.Graphics2D, org.jfree.chart.plot.PiePlotState, org.jfree.chart.plot.PieLabelRecord)
    
    @Test
    public void testDrawLeftLabel1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PiePlotState piePlotState = new PiePlotState(null);
        Rectangle rectangle = new Rectangle(0, 0, 0, 0);
        piePlotState.setLinkArea(rectangle);
        PieLabelRecord pieLabelRecord = new PieLabelRecord(null, 0.0, 0.0, null, 0.0, 0.0, 0.0);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawLeftLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawLeftLabel(PiePlot.java:2748) */
        piePlot.drawLeftLabel(null, piePlotState, pieLabelRecord);
    }
    
    @Test
    public void testDrawLeftLabel2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PiePlotState piePlotState = new PiePlotState(null);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
        piePlotState.setLinkArea(float1);
        PieLabelRecord pieLabelRecord = new PieLabelRecord(null, 0.0, 0.0, null, 0.0, 0.0, 0.0);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawLeftLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawLeftLabel(PiePlot.java:2748) */
        piePlot.drawLeftLabel(null, piePlotState, pieLabelRecord);
    }
    
    @Test
    public void testDrawLeftLabel3() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setLabelLinksVisible(true);
        PiePlotState piePlotState = new PiePlotState(null);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
        piePlotState.setLinkArea(float1);
        PieLabelRecord pieLabelRecord = new PieLabelRecord(null, 0.0, 0.0, null, 0.0, 0.0, 0.0);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawLeftLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawLeftLabel(PiePlot.java:2741) */
        piePlot.drawLeftLabel(null, piePlotState, pieLabelRecord);
    }
    ///endregion
    
    ///region Errors report for drawLeftLabel
    
    public void testDrawLeftLabel_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOverNoEa accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Clear accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field protected static final java.awt.Stroke sun.java2d.SunGraphics2D.defaultStroke accessible:
        module java.desktop does not "opens sun.java2d" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field public static final double sun.java2d.SunGraphics2D.MinPenSizeAA accessible:
        module java.desktop does not "exports sun.java2d" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getArcBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArcBounds(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, double, double, double)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getArcBounds(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,double,double,double)}
 * @utbot.executesCondition {@code (explodePercent == 0.0): True}
 * @utbot.returnsFrom {@code return unexploded;}
 *  */
    @Test
    public void testGetArcBounds_ExplodePercentEqualsZero() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        Rectangle2D actual = piePlot.getArcBounds(null, null, java.lang.Double.NaN, java.lang.Double.NaN, 0.0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getArcBounds(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, double, double, double)
    
    @Test
    public void testGetArcBounds1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        Rectangle rectangle = new Rectangle(0, 0, 0, 0);
        
        java.awt.geom.Rectangle2D.Double actual = ((java.awt.geom.Rectangle2D.Double) piePlot.getArcBounds(rectangle, rectangle, java.lang.Double.NaN, java.lang.Double.NaN, 2.225073858507202E-308));
        
        java.awt.geom.Rectangle2D.Double expected = new java.awt.geom.Rectangle2D.Double();
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getArcBounds(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, double, double, double)
    
    @Test
    public void testGetArcBounds2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        java.awt.geom.Rectangle2D.Double double1 = new java.awt.geom.Rectangle2D.Double();
        double1.x = java.lang.Double.NaN;
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.getArcBounds] produces [java.lang.NullPointerException]
            java.desktop/java.awt.geom.Arc2D$Double.<init>(Arc2D.java:505)
            org.jfree.chart.plot.PiePlot.getArcBounds(PiePlot.java:2705) */
        piePlot.getArcBounds(double1, null, java.lang.Double.NaN, java.lang.Double.NaN, 2.225073858507202E-308);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getLegendItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendItems()
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLegendItems()}
 * @utbot.executesCondition {@code (this.dataset == null): True}
 *  */
    @Test
    public void testGetLegendItems_ThisDatasetEqualsNull() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        LegendItemCollection actual = piePlot.getLegendItems();
        
        LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
        ArrayList items = new ArrayList();
        setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getLegendItems()
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.plot.PiePlot}
     * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#getLegendItems()}
     */
    @Test
    public void testGetLegendItems() throws Exception  {
        DefaultKeyedValuesDataset defaultKeyedValuesDataset = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup = new DatasetGroup();
        defaultKeyedValuesDataset.setGroup(datasetGroup);
        PiePlot piePlot = new PiePlot(defaultKeyedValuesDataset);
        piePlot.setLabelLinksVisible(false);
        piePlot.setStartAngle(java.lang.Double.POSITIVE_INFINITY);
        Locale locale = new Locale("");
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator = new StandardPieSectionLabelGenerator("", locale);
        piePlot.setLegendLabelGenerator(standardPieSectionLabelGenerator);
        StandardPieSectionLabelGenerator standardPieSectionLabelGenerator1 = new StandardPieSectionLabelGenerator();
        piePlot.setLegendLabelToolTipGenerator(standardPieSectionLabelGenerator1);
        PieLabelDistributor pieLabelDistributor = new PieLabelDistributor(0);
        piePlot.setLabelDistributor(pieLabelDistributor);
        piePlot.setShadowYOffset(java.lang.Double.POSITIVE_INFINITY);
        DefaultKeyedValuesDataset defaultKeyedValuesDataset1 = new DefaultKeyedValuesDataset();
        DatasetGroup datasetGroup1 = new DatasetGroup("10");
        defaultKeyedValuesDataset1.setGroup(datasetGroup1);
        piePlot.setDataset(defaultKeyedValuesDataset1);
        BufferedImage bufferedImage = new BufferedImage(1, 0, 1);
        bufferedImage.setAccelerationPriority(java.lang.Float.NaN);
        TexturePaint texturePaint = new TexturePaint(bufferedImage, null);
        piePlot.setBaseSectionOutlinePaint(texturePaint);
        BasicStroke basicStroke = new BasicStroke(java.lang.Float.NEGATIVE_INFINITY, 0, Integer.MAX_VALUE, 5.192297E33f);
        piePlot.setBaseSectionOutlineStroke(basicStroke);
        piePlot.setPieIndex(1);
        
        LegendItemCollection actual = piePlot.getLegendItems();
        
        LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
        ArrayList items = new ArrayList();
        setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLegendItems()
    
    @Test
    public void testGetLegendItems1() throws Exception  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            DefaultCategoryDataset source = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
            DefaultKeyedValues2D data = ((DefaultKeyedValues2D) createInstance("org.jfree.data.DefaultKeyedValues2D"));
            ArrayList columnKeys = new ArrayList();
            setField(data, "org.jfree.data.DefaultKeyedValues2D", "columnKeys", columnKeys);
            setField(source, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "extract", byRow);
            piePlot.setDataset(dataset);
            
            LegendItemCollection actual = piePlot.getLegendItems();
            
            LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
            ArrayList items = new ArrayList();
            setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
            
            // org.jfree.chart.LegendItemCollection has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    
    @Test
    public void testGetLegendItems2() throws Exception  {
        TableOrder prevBY_COLUMN = TableOrder.BY_COLUMN;
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byColumn = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name = "TableOrder.BY_COLUMN";
            setField(byColumn, "org.jfree.chart.util.TableOrder", "name", name);
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_COLUMN", byColumn);
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            String name1 = "TableOrder.BY_ROW";
            setField(byRow, "org.jfree.chart.util.TableOrder", "name", name1);
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            DefaultCategoryDataset source = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            piePlot.setDataset(dataset);
            
            LegendItemCollection actual = piePlot.getLegendItems();
            
            LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
            ArrayList items = new ArrayList();
            setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
            
            // org.jfree.chart.LegendItemCollection has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(TableOrder.class, "BY_COLUMN", prevBY_COLUMN);
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLegendItems()
    
    @Test
    public void testGetLegendItems3() throws Exception  {
        TableOrder prevBY_ROW = TableOrder.BY_ROW;
        try {
            TableOrder byRow = ((TableOrder) createInstance("org.jfree.chart.util.TableOrder"));
            Class tableOrderClazz = Class.forName("org.jfree.chart.util.TableOrder");
            setStaticField(tableOrderClazz, "BY_ROW", byRow);
            PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            CategoryToPieDataset dataset = ((CategoryToPieDataset) createInstance("org.jfree.data.category.CategoryToPieDataset"));
            TaskSeriesCollection source = ((TaskSeriesCollection) createInstance("org.jfree.data.gantt.TaskSeriesCollection"));
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "source", source);
            setField(dataset, "org.jfree.data.category.CategoryToPieDataset", "extract", byRow);
            piePlot.setDataset(dataset);
            
            /* This test fails because method [org.jfree.chart.plot.PiePlot.getLegendItems] produces [java.lang.NullPointerException]
                org.jfree.chart.plot.PiePlot.getLegendItems(PiePlot.java:2618) */
            piePlot.getLegendItems();
        } finally {
            setStaticField(TableOrder.class, "BY_ROW", prevBY_ROW);
        }
    }
    ///endregion
    
    ///region Errors report for getLegendItems
    
    public void testGetLegendItems_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // No method source set for method <java.lang.Object: java.lang.Object clone()>
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.drawLeftLabels
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawLeftLabels(org.jfree.data.KeyedValues, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, float, org.jfree.chart.plot.PiePlotState)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawLeftLabels(org.jfree.data.KeyedValues,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,float,org.jfree.chart.plot.PiePlotState)}
 * @utbot.invokes {@link org.jfree.chart.plot.AbstractPieLabelDistributor#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.labelDistributor.clear();
 *  */
    @Test
    public void testDrawLeftLabels_ThrowNullPointerException_1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawLeftLabels] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawLeftLabels(PiePlot.java:2516) */
        piePlot.drawLeftLabels(null, null, null, null, java.lang.Float.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawLeftLabels(org.jfree.data.KeyedValues,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,float,org.jfree.chart.plot.PiePlotState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double lGap = plotArea.getWidth() * this.labelGap;
 *  */
    @Test
    public void testDrawLeftLabels_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PieLabelDistributor labelDistributor = ((PieLabelDistributor) createInstance("org.jfree.chart.plot.PieLabelDistributor"));
        ArrayList labels = new ArrayList();
        labels.add(null);
        labels.add(null);
        labels.add(null);
        setField(labelDistributor, "org.jfree.chart.plot.AbstractPieLabelDistributor", "labels", labels);
        piePlot.setLabelDistributor(labelDistributor);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawLeftLabels] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawLeftLabels(PiePlot.java:2517) */
        piePlot.drawLeftLabels(null, null, null, null, java.lang.Float.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawLeftLabels(org.jfree.data.KeyedValues,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,float,org.jfree.chart.plot.PiePlotState)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getWidth()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlotState#getLinkArea()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double verticalLinkRadius = state.getLinkArea().getHeight() / 2.0;
 *  */
    @Test
    public void testDrawLeftLabels_ThrowNullPointerException_2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setLabelGap(0.0);
        PieLabelDistributor labelDistributor = ((PieLabelDistributor) createInstance("org.jfree.chart.plot.PieLabelDistributor"));
        ArrayList labels = new ArrayList();
        labels.add(null);
        labels.add(null);
        labels.add(null);
        setField(labelDistributor, "org.jfree.chart.plot.AbstractPieLabelDistributor", "labels", labels);
        piePlot.setLabelDistributor(labelDistributor);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawLeftLabels] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawLeftLabels(PiePlot.java:2518) */
        piePlot.drawLeftLabels(null, null, float1, null, java.lang.Float.NaN, null);
    }
    ///endregion
    
    ///region Errors report for drawLeftLabels
    
    public void testDrawLeftLabels_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.getPlotType
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPlotType()
    
    @Test
    public void testGetPlotType1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        String actual = piePlot.getPlotType();
        
        String expected = "Pie Plot";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.plot.PiePlot.drawRightLabels
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawRightLabels(org.jfree.data.KeyedValues, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, float, org.jfree.chart.plot.PiePlotState)
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawRightLabels(org.jfree.data.KeyedValues,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,float,org.jfree.chart.plot.PiePlotState)}
 * @utbot.invokes {@link org.jfree.chart.plot.AbstractPieLabelDistributor#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.labelDistributor.clear();
 *  */
    @Test
    public void testDrawRightLabels_ThrowNullPointerException_1() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawRightLabels] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawRightLabels(PiePlot.java:2567) */
        piePlot.drawRightLabels(null, null, null, null, java.lang.Float.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawRightLabels(org.jfree.data.KeyedValues,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,float,org.jfree.chart.plot.PiePlotState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double lGap = plotArea.getWidth() * this.labelGap;
 *  */
    @Test
    public void testDrawRightLabels_ThrowNullPointerException() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        PieLabelDistributor labelDistributor = ((PieLabelDistributor) createInstance("org.jfree.chart.plot.PieLabelDistributor"));
        ArrayList labels = new ArrayList();
        labels.add(null);
        labels.add(null);
        labels.add(null);
        setField(labelDistributor, "org.jfree.chart.plot.AbstractPieLabelDistributor", "labels", labels);
        piePlot.setLabelDistributor(labelDistributor);
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawRightLabels] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawRightLabels(PiePlot.java:2568) */
        piePlot.drawRightLabels(null, null, null, null, java.lang.Float.NaN, null);
    }
    
    /**
    @utbot.classUnderTest {@link PiePlot}
 * @utbot.methodUnderTest {@link org.jfree.chart.plot.PiePlot#drawRightLabels(org.jfree.data.KeyedValues,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,float,org.jfree.chart.plot.PiePlotState)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getWidth()}
 * @utbot.invokes {@link org.jfree.chart.plot.PiePlotState#getLinkArea()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double verticalLinkRadius = state.getLinkArea().getHeight() / 2.0;
 *  */
    @Test
    public void testDrawRightLabels_ThrowNullPointerException_2() throws Exception  {
        PiePlot piePlot = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
        piePlot.setLabelGap(0.0);
        PieLabelDistributor labelDistributor = ((PieLabelDistributor) createInstance("org.jfree.chart.plot.PieLabelDistributor"));
        ArrayList labels = new ArrayList();
        labels.add(null);
        labels.add(null);
        labels.add(null);
        setField(labelDistributor, "org.jfree.chart.plot.AbstractPieLabelDistributor", "labels", labels);
        piePlot.setLabelDistributor(labelDistributor);
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
        
        /* This test fails because method [org.jfree.chart.plot.PiePlot.drawRightLabels] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.PiePlot.drawRightLabels(PiePlot.java:2569) */
        piePlot.drawRightLabels(null, null, float1, null, java.lang.Float.NaN, null);
    }
    ///endregion
    
    ///region Errors report for drawRightLabels
    
    public void testDrawRightLabels_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields798371716078500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields798371716078500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass798371716083400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798371716078500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798371716083400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields798371716300100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields798371716300100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass798371716300800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798371716300100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798371716300800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields798371716781800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields798371716781800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass798371716783300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields798371716781800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass798371716783300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


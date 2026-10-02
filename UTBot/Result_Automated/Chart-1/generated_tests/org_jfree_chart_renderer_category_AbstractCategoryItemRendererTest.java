package org.jfree.chart.renderer.category;

import org.junit.Test;
import org.jfree.chart.util.ObjectList;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.util.BooleanList;
import javax.swing.event.EventListenerList;
import org.jfree.chart.LegendItemCollection;
import java.util.ArrayList;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.data.gantt.SlidingGanttCategoryDataset;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CategoryPlot;
import java.util.TreeMap;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.data.RangeType;
import org.jfree.chart.axis.NumberTickUnit;
import java.text.NumberFormat;
import org.jfree.chart.axis.MarkerAxisBand;
import java.awt.Shape;
import org.jfree.data.Range;
import org.jfree.chart.axis.TickUnitSource;
import java.awt.Font;
import java.awt.Paint;
import org.jfree.chart.util.RectangleInsets;
import java.awt.Stroke;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.event.ChartChangeEventType;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.labels.IntervalCategoryToolTipGenerator;
import java.lang.reflect.Method;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.CategoryCrosshairState;
import java.awt.Point;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.CategorySeriesLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import java.awt.geom.Rectangle2D;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import java.awt.Rectangle;
import org.jfree.chart.util.LengthAdjustmentType;
import java.awt.geom.Point2D;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.KeyedObjects2D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Year;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.util.Layer;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.util.PaintList;
import org.jfree.chart.LegendItem;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.renderer.category.CategoryStepRenderer.State;
import java.awt.geom.Line2D;
import org.jfree.data.category.CategoryDatasetSelectionState;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.time.DateRange;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class org_jfree_chart_renderer_category_AbstractCategoryItemRendererTest {
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        DefaultCategoryItemRenderer defaultCategoryItemRenderer = ((DefaultCategoryItemRenderer) createInstance("org.jfree.chart.renderer.category.DefaultCategoryItemRenderer"));
        
        boolean actual = defaultCategoryItemRenderer.equals(defaultCategoryItemRenderer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof AbstractCategoryItemRenderer)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfAbstractCategoryItemRenderer() throws Exception  {
        DefaultCategoryItemRenderer defaultCategoryItemRenderer = ((DefaultCategoryItemRenderer) createInstance("org.jfree.chart.renderer.category.DefaultCategoryItemRenderer"));
        
        boolean actual = defaultCategoryItemRenderer.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof AbstractCategoryItemRenderer)): False}
 * @utbot.executesCondition {@code (!ObjectUtilities.equal(this.itemLabelGeneratorList, that.itemLabelGeneratorList)): True}
 *  */
    @Test
    public void testEquals_NotObjectUtilitiesEqual() throws Exception  {
        DefaultCategoryItemRenderer defaultCategoryItemRenderer = ((DefaultCategoryItemRenderer) createInstance("org.jfree.chart.renderer.category.DefaultCategoryItemRenderer"));
        LineRenderer3D lineRenderer3D = ((LineRenderer3D) createInstance("org.jfree.chart.renderer.category.LineRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(lineRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        boolean actual = defaultCategoryItemRenderer.equals(lineRenderer3D);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof AbstractCategoryItemRenderer)): False}
 * @utbot.executesCondition {@code (!ObjectUtilities.equal(this.itemLabelGeneratorList, that.itemLabelGeneratorList)): False}
 * @utbot.executesCondition {@code (!ObjectUtilities.equal(this.baseItemLabelGenerator, that.baseItemLabelGenerator)): False}
 * @utbot.executesCondition {@code (!ObjectUtilities.equal(this.toolTipGeneratorList, that.toolTipGeneratorList)): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectUtilities#equal(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectUtilities#equal(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testEquals_NotObjectUtilitiesEqual_1() throws Exception  {
        LayeredBarRenderer layeredBarRenderer = ((LayeredBarRenderer) createInstance("org.jfree.chart.renderer.category.LayeredBarRenderer"));
        CategoryStepRenderer categoryStepRenderer = ((CategoryStepRenderer) createInstance("org.jfree.chart.renderer.category.CategoryStepRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        boolean actual = layeredBarRenderer.equals(categoryStepRenderer);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof AbstractCategoryItemRenderer)): False}
 * @utbot.executesCondition {@code (!ObjectUtilities.equal(this.itemLabelGeneratorList, that.itemLabelGeneratorList)): False}
 * @utbot.executesCondition {@code (!ObjectUtilities.equal(this.baseItemLabelGenerator, that.baseItemLabelGenerator)): True}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectUtilities#equal(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectUtilities#equal(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return false;
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        LayeredBarRenderer layeredBarRenderer = ((LayeredBarRenderer) createInstance("org.jfree.chart.renderer.category.LayeredBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(layeredBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList1);
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        stackedBarRenderer3D.setBaseItemLabelGenerator(baseItemLabelGenerator);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.equals] produces [java.lang.NullPointerException] */
        layeredBarRenderer.equals(stackedBarRenderer3D);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#hashCode()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int result = super.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {null};
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        setField(groupedStackedBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jfree.chart.util.AbstractObjectList.hashCode(AbstractObjectList.java:214)
            org.jfree.chart.util.BooleanList.hashCode(BooleanList.java:105)
            org.jfree.chart.util.HashUtilities.hashCode(HashUtilities.java:227)
            org.jfree.chart.renderer.AbstractRenderer.hashCode(AbstractRenderer.java:3121)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode(AbstractCategoryItemRenderer.java:1532) */
        groupedStackedBarRenderer.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#hashCode()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int result = super.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
        BooleanList seriesVisibleInLegendList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {};
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(groupedStackedBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleInLegendList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.hashCode(AbstractObjectList.java:212)
            org.jfree.chart.util.BooleanList.hashCode(BooleanList.java:105)
            org.jfree.chart.util.HashUtilities.hashCode(HashUtilities.java:227)
            org.jfree.chart.renderer.AbstractRenderer.hashCode(AbstractRenderer.java:3123)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode(AbstractCategoryItemRenderer.java:1532) */
        groupedStackedBarRenderer.hashCode();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        objects[1] = object;
        Integer integer = 0;
        objects[2] = ((Object) integer);
        objects[3] = object;
        objects[4] = object;
        objects[5] = object;
        objects[6] = object;
        objects[7] = object;
        objects[8] = object;
        objects[9] = object;
        objects[10] = object;
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 3);
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        int actual = barRenderer3D.hashCode();
        
        assertEquals(1390094707, actual);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) seriesVisibleList);
        objects[2] = ((Object) seriesVisibleList);
        objects[3] = ((Object) seriesVisibleList);
        objects[4] = ((Object) seriesVisibleList);
        objects[5] = ((Object) seriesVisibleList);
        objects[6] = ((Object) seriesVisibleList);
        objects[7] = ((Object) seriesVisibleList);
        objects[8] = ((Object) seriesVisibleList);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        int actual = barRenderer3D.hashCode();
        
        assertEquals(-1792450984, actual);
    }
    
    @Test
    public void testHashCode3() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        BooleanList seriesVisibleInLegendList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleInLegendList);
        
        int actual = barRenderer3D.hashCode();
        
        assertEquals(-2063242029, actual);
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        barRenderer3D.setBaseSeriesVisible(true);
        BooleanList seriesVisibleInLegendList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleInLegendList);
        
        int actual = barRenderer3D.hashCode();
        
        assertEquals(-535446998, actual);
    }
    
    @Test
    public void testHashCode5() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        barRenderer3D.setBaseSeriesVisible(true);
        
        int actual = barRenderer3D.hashCode();
        
        assertEquals(1194549631, actual);
    }
    
    @Test
    public void testHashCode6() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        BooleanList seriesVisibleInLegendList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Integer integer = 0;
        objects[0] = ((Object) integer);
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleInLegendList);
        
        int actual = barRenderer3D.hashCode();
        
        assertEquals(-758128200, actual);
    }
    
    @Test
    public void testHashCode7() throws Exception  {
        BoxAndWhiskerRenderer boxAndWhiskerRenderer = ((BoxAndWhiskerRenderer) createInstance("org.jfree.chart.renderer.category.BoxAndWhiskerRenderer"));
        boxAndWhiskerRenderer.setBaseSeriesVisible(true);
        BooleanList seriesVisibleInLegendList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Integer integer = 0;
        objects[0] = ((Object) integer);
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(boxAndWhiskerRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleInLegendList);
        
        int actual = boxAndWhiskerRenderer.hashCode();
        
        assertEquals(769666831, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test
    public void testHashCode8() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {};
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.hashCode(AbstractObjectList.java:212)
            org.jfree.chart.util.BooleanList.hashCode(BooleanList.java:105)
            org.jfree.chart.util.HashUtilities.hashCode(HashUtilities.java:227)
            org.jfree.chart.renderer.AbstractRenderer.hashCode(AbstractRenderer.java:3121)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode(AbstractCategoryItemRenderer.java:1532) */
        barRenderer3D.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#clone()}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#clone()}
 *  */
    @Test
    public void testClone_AbstractRendererClone() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        
        WaterfallBarRenderer actual = ((WaterfallBarRenderer) waterfallBarRenderer.clone());
        
        WaterfallBarRenderer expected = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        GradientBarPainter defaultBarPainter = ((GradientBarPainter) createInstance("org.jfree.chart.renderer.category.GradientBarPainter"));
        setField(defaultBarPainter, "org.jfree.chart.renderer.category.GradientBarPainter", "g1", 0.1);
        setField(defaultBarPainter, "org.jfree.chart.renderer.category.GradientBarPainter", "g2", 0.2);
        setField(defaultBarPainter, "org.jfree.chart.renderer.category.GradientBarPainter", "g3", 0.8);
        setField(expected, "org.jfree.chart.renderer.category.BarRenderer", "defaultBarPainter", defaultBarPainter);
        setField(expected, "org.jfree.chart.renderer.category.BarRenderer", "defaultShadowsVisible", true);
        expected.setItemMargin(0.0);
        expected.setMaximumBarWidth(0.0);
        expected.setMinimumBarLength(0.0);
        expected.setBase(0.0);
        expected.setShadowXOffset(0.0);
        expected.setShadowYOffset(0.0);
        expected.setItemLabelAnchorOffset(0.0);
        EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
        setField(expected, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
        
        // org.jfree.chart.renderer.category.WaterfallBarRenderer has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendItems()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItems()}
 * @utbot.executesCondition {@code (this.plot == null): True}
 *  */
    @Test
    public void testGetLegendItems_ThisPlotEqualsNull() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        LegendItemCollection actual = stackedBarRenderer3D.getLegendItems();
        
        LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
        ArrayList items = new ArrayList();
        setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItems()}
 * @utbot.executesCondition {@code (this.plot == null): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getDataset(int)}
 *  */
    @Test
    public void testGetLegendItems_ThisPlotNotEqualsNull() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[2];
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = ((SlidingGanttCategoryDataset) createInstance("org.jfree.data.gantt.SlidingGanttCategoryDataset"));
        objects[0] = ((Object) slidingGanttCategoryDataset);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = new java.lang.Object[1];
        objects1[0] = ((Object) stackedBarRenderer3D);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        stackedBarRenderer3D.setPlot(plot);
        
        LegendItemCollection actual = stackedBarRenderer3D.getLegendItems();
        
        LegendItemCollection expected = ((LegendItemCollection) createInstance("org.jfree.chart.LegendItemCollection"));
        ArrayList items = new ArrayList();
        setField(expected, "org.jfree.chart.LegendItemCollection", "items", items);
        
        // org.jfree.chart.LegendItemCollection has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLegendItems()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItems()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int index = this.plot.getIndexOf(this);
 *  */
    @Test
    public void testGetLegendItems_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        waterfallBarRenderer.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:107)
            org.jfree.chart.plot.CategoryPlot.getIndexOf(CategoryPlot.java:1727)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1795) */
        waterfallBarRenderer.getLegendItems();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItems()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int index = this.plot.getIndexOf(this);
 *  */
    @Test
    public void testGetLegendItems_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        stackedBarRenderer3D.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:107)
            org.jfree.chart.plot.CategoryPlot.getIndexOf(CategoryPlot.java:1727)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1795) */
        stackedBarRenderer3D.getLegendItems();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItems()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryDataset dataset = this.plot.getDataset(index);
 *  */
    @Test
    public void testGetLegendItems_ThrowClassCastException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = new java.lang.Object[1];
        objects1[0] = ((Object) stackedBarRenderer3D);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        stackedBarRenderer3D.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.category.CategoryDataset (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.category.CategoryDataset is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1322)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1796) */
        stackedBarRenderer3D.getLegendItems();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItems()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: CategoryDataset dataset = this.plot.getDataset(index);
 *  */
    @Test
    public void testGetLegendItems_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = new java.lang.Object[1];
        objects1[0] = ((Object) waterfallBarRenderer);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        waterfallBarRenderer.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1322)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1796) */
        waterfallBarRenderer.getLegendItems();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItems()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int seriesCount = dataset.getRowCount();
 *  */
    @Test
    public void testGetLegendItems_ThrowNullPointerException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", datasets);
        waterfallBarRenderer.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1800) */
        waterfallBarRenderer.getLegendItems();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItems()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int seriesCount = dataset.getRowCount();
 *  */
    @Test
    public void testGetLegendItems_ThrowNullPointerException_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", -1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        waterfallBarRenderer.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1800) */
        waterfallBarRenderer.getLegendItems();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItems()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int seriesCount = dataset.getRowCount();
 *  */
    @Test
    public void testGetLegendItems_ThrowNullPointerException_2() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        objects[0] = ((Object) waterfallBarRenderer);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        waterfallBarRenderer.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1800) */
        waterfallBarRenderer.getLegendItems();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLegendItems()
    
    @Test
    public void testGetLegendItems1() throws Exception  {
        LevelRenderer levelRenderer = ((LevelRenderer) createInstance("org.jfree.chart.renderer.category.LevelRenderer"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[10];
        objects[1] = ((Object) levelRenderer);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        levelRenderer.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.NullPointerException]
            org.jfree.chart.plot.CategoryPlot.getDataset(CategoryPlot.java:1321)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1796) */
        levelRenderer.getLegendItems();
    }
    
    @Test
    public void testGetLegendItems2() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[1] = object;
        objects[2] = object;
        objects[3] = object;
        objects[4] = object;
        objects[5] = object;
        objects[6] = object;
        objects[7] = object;
        objects[8] = object;
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", datasets);
        stackedBarRenderer3D.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1800) */
        stackedBarRenderer3D.getLegendItems();
    }
    
    @Test
    public void testGetLegendItems3() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", Integer.MIN_VALUE);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        barRenderer3D.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1800) */
        barRenderer3D.getLegendItems();
    }
    
    @Test
    public void testGetLegendItems4() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = new java.lang.Object[9];
        objects1[0] = ((Object) stackedBarRenderer3D);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(plot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        stackedBarRenderer3D.setPlot(plot);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems(AbstractCategoryItemRenderer.java:1800) */
        stackedBarRenderer3D.getLegendItems();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDomainAxis(org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getDomainAxis(org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int datasetIndex = plot.indexOf(dataset);
 *  */
    @Test
    public void testGetDomainAxis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.CategoryPlot.indexOf(CategoryPlot.java:1393)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis(AbstractCategoryItemRenderer.java:1762) */
        stackedBarRenderer3D.getDomainAxis(categoryPlot, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getDomainAxis(org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getDomainAxisForDataset(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return plot.getDomainAxisForDataset(datasetIndex);
 *  */
    @Test
    public void testGetDomainAxis_ThrowClassCastException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        TreeMap datasetToDomainAxesMap = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("javax.swing.LayoutComparator");
        setField(datasetToDomainAxesMap, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(datasetToDomainAxesMap, "java.util.TreeMap", "root", root);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxesMap", datasetToDomainAxesMap);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.awt.Component (java.lang.Integer is in module java.base of loader 'bootstrap'; java.awt.Component is in module java.desktop of loader 'bootstrap')]
            java.desktop/javax.swing.LayoutComparator.compare(LayoutComparator.java:42)
            java.base/java.util.TreeMap.getEntryUsingComparator(TreeMap.java:374)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:344)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset(CategoryPlot.java:1485)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis(AbstractCategoryItemRenderer.java:1763) */
        stackedBarRenderer3D.getDomainAxis(categoryPlot, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getDomainAxis(org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#indexOf(org.jfree.data.category.CategoryDataset)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int datasetIndex = plot.indexOf(dataset);
 *  */
    @Test
    public void testGetDomainAxis_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis(AbstractCategoryItemRenderer.java:1762) */
        stackedBarRenderer3D.getDomainAxis(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDomainAxis(org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getDomainAxis(org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return plot.getDomainAxisForDataset(datasetIndex);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxis_ThrowIllegalArgumentException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        
        waterfallBarRenderer.getDomainAxis(categoryPlot, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getDomainAxis(org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return plot.getDomainAxisForDataset(datasetIndex);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDomainAxis_ThrowIllegalArgumentException_1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset = ((DefaultIntervalCategoryDataset) createInstance("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        
        stackedBarRenderer3D.getDomainAxis(categoryPlot, defaultIntervalCategoryDataset);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getDomainAxis(org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset)
    
    @Test(timeout = 1000L)
    public void testGetDomainAxis1() throws Exception  {
        IntervalBarRenderer intervalBarRenderer = ((IntervalBarRenderer) createInstance("org.jfree.chart.renderer.category.IntervalBarRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList datasets = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(datasets, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasets", datasets);
        TreeMap datasetToDomainAxesMap = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -2147483647;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "right", root);
        setField(datasetToDomainAxesMap, "java.util.TreeMap", "root", root);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "datasetToDomainAxesMap", datasetToDomainAxesMap);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        intervalBarRenderer.getDomainAxis(categoryPlot, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeAxis(org.jfree.chart.plot.CategoryPlot, int)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getRangeAxis(org.jfree.chart.plot.CategoryPlot,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxis_ReturnResult_1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        LogAxis logAxis = ((LogAxis) createInstance("org.jfree.chart.axis.LogAxis"));
        objects[0] = ((Object) logAxis);
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes1);
        categoryPlot.setParent(parent);
        
        LogAxis actual = ((LogAxis) stackedBarRenderer3D.getRangeAxis(categoryPlot, 0));
        
        // org.jfree.chart.axis.LogAxis has overridden equals method
        assertEquals(logAxis, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getRangeAxis(org.jfree.chart.plot.CategoryPlot,int)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetRangeAxis_ReturnResult() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[2];
        NumberAxis3D numberAxis3D = ((NumberAxis3D) createInstance("org.jfree.chart.axis.NumberAxis3D"));
        objects[0] = ((Object) numberAxis3D);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        NumberAxis3D actual = ((NumberAxis3D) stackedBarRenderer3D.getRangeAxis(categoryPlot, 0));
        
        RangeType actualRangeType = actual.getRangeType();
        assertNull(actualRangeType);
        
        boolean actualAutoRangeIncludesZero = actual.getAutoRangeIncludesZero();
        assertFalse(actualAutoRangeIncludesZero);
        
        boolean actualAutoRangeStickyZero = actual.getAutoRangeStickyZero();
        assertFalse(actualAutoRangeStickyZero);
        
        NumberTickUnit actualTickUnit = actual.getTickUnit();
        assertNull(actualTickUnit);
        
        NumberFormat actualNumberFormatOverride = actual.getNumberFormatOverride();
        assertNull(actualNumberFormatOverride);
        
        MarkerAxisBand actualMarkerBand = actual.getMarkerBand();
        assertNull(actualMarkerBand);
        
        boolean actualPositiveArrowVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "positiveArrowVisible"));
        assertFalse(actualPositiveArrowVisible);
        
        boolean actualNegativeArrowVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "negativeArrowVisible"));
        assertFalse(actualNegativeArrowVisible);
        
        Shape actualUpArrow = actual.getUpArrow();
        assertNull(actualUpArrow);
        
        Shape actualDownArrow = actual.getDownArrow();
        assertNull(actualDownArrow);
        
        Shape actualLeftArrow = actual.getLeftArrow();
        assertNull(actualLeftArrow);
        
        Shape actualRightArrow = actual.getRightArrow();
        assertNull(actualRightArrow);
        
        boolean actualInverted = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "inverted"));
        assertFalse(actualInverted);
        
        Range actualRange = actual.getRange();
        assertNull(actualRange);
        
        boolean actualAutoRange = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "autoRange"));
        assertFalse(actualAutoRange);
        
        double numberAxis3DAutoRangeMinimumSize = numberAxis3D.getAutoRangeMinimumSize();
        double actualAutoRangeMinimumSize = actual.getAutoRangeMinimumSize();
        org.junit.Assert.assertEquals(numberAxis3DAutoRangeMinimumSize, actualAutoRangeMinimumSize, 1.0E-6);
        
        Range actualDefaultAutoRange = actual.getDefaultAutoRange();
        assertNull(actualDefaultAutoRange);
        
        double numberAxis3DUpperMargin = numberAxis3D.getUpperMargin();
        double actualUpperMargin = actual.getUpperMargin();
        org.junit.Assert.assertEquals(numberAxis3DUpperMargin, actualUpperMargin, 1.0E-6);
        
        double numberAxis3DLowerMargin = numberAxis3D.getLowerMargin();
        double actualLowerMargin = actual.getLowerMargin();
        org.junit.Assert.assertEquals(numberAxis3DLowerMargin, actualLowerMargin, 1.0E-6);
        
        double numberAxis3DFixedAutoRange = numberAxis3D.getFixedAutoRange();
        double actualFixedAutoRange = actual.getFixedAutoRange();
        org.junit.Assert.assertEquals(numberAxis3DFixedAutoRange, actualFixedAutoRange, 1.0E-6);
        
        boolean actualAutoTickUnitSelection = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "autoTickUnitSelection"));
        assertFalse(actualAutoTickUnitSelection);
        
        TickUnitSource actualStandardTickUnits = actual.getStandardTickUnits();
        assertNull(actualStandardTickUnits);
        
        int numberAxis3DAutoTickIndex = ((Integer) getFieldValue(numberAxis3D, "org.jfree.chart.axis.ValueAxis", "autoTickIndex"));
        int actualAutoTickIndex = ((Integer) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "autoTickIndex"));
        assertEquals(numberAxis3DAutoTickIndex, actualAutoTickIndex);
        
        int numberAxis3DMinorTickCount = numberAxis3D.getMinorTickCount();
        int actualMinorTickCount = actual.getMinorTickCount();
        assertEquals(numberAxis3DMinorTickCount, actualMinorTickCount);
        
        boolean actualVerticalTickLabels = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.ValueAxis", "verticalTickLabels"));
        assertFalse(actualVerticalTickLabels);
        
        boolean actualVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.Axis", "visible"));
        assertFalse(actualVisible);
        
        String actualLabel = actual.getLabel();
        assertNull(actualLabel);
        
        Font actualLabelFont = actual.getLabelFont();
        assertNull(actualLabelFont);
        
        Paint actualLabelPaint = actual.getLabelPaint();
        assertNull(actualLabelPaint);
        
        RectangleInsets actualLabelInsets = actual.getLabelInsets();
        assertNull(actualLabelInsets);
        
        double numberAxis3DLabelAngle = numberAxis3D.getLabelAngle();
        double actualLabelAngle = actual.getLabelAngle();
        org.junit.Assert.assertEquals(numberAxis3DLabelAngle, actualLabelAngle, 1.0E-6);
        
        String actualLabelToolTip = actual.getLabelToolTip();
        assertNull(actualLabelToolTip);
        
        String actualLabelURL = actual.getLabelURL();
        assertNull(actualLabelURL);
        
        boolean actualAxisLineVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.Axis", "axisLineVisible"));
        assertFalse(actualAxisLineVisible);
        
        Stroke actualAxisLineStroke = actual.getAxisLineStroke();
        assertNull(actualAxisLineStroke);
        
        Paint actualAxisLinePaint = actual.getAxisLinePaint();
        assertNull(actualAxisLinePaint);
        
        boolean actualTickLabelsVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.Axis", "tickLabelsVisible"));
        assertFalse(actualTickLabelsVisible);
        
        Font actualTickLabelFont = actual.getTickLabelFont();
        assertNull(actualTickLabelFont);
        
        Paint actualTickLabelPaint = actual.getTickLabelPaint();
        assertNull(actualTickLabelPaint);
        
        RectangleInsets actualTickLabelInsets = actual.getTickLabelInsets();
        assertNull(actualTickLabelInsets);
        
        boolean actualTickMarksVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.Axis", "tickMarksVisible"));
        assertFalse(actualTickMarksVisible);
        
        float numberAxis3DTickMarkInsideLength = numberAxis3D.getTickMarkInsideLength();
        float actualTickMarkInsideLength = actual.getTickMarkInsideLength();
        org.junit.Assert.assertEquals(numberAxis3DTickMarkInsideLength, actualTickMarkInsideLength, 1.0E-6f);
        
        float numberAxis3DTickMarkOutsideLength = numberAxis3D.getTickMarkOutsideLength();
        float actualTickMarkOutsideLength = actual.getTickMarkOutsideLength();
        org.junit.Assert.assertEquals(numberAxis3DTickMarkOutsideLength, actualTickMarkOutsideLength, 1.0E-6f);
        
        boolean actualMinorTickMarksVisible = ((Boolean) getFieldValue(actual, "org.jfree.chart.axis.Axis", "minorTickMarksVisible"));
        assertFalse(actualMinorTickMarksVisible);
        
        float numberAxis3DMinorTickMarkInsideLength = numberAxis3D.getMinorTickMarkInsideLength();
        float actualMinorTickMarkInsideLength = actual.getMinorTickMarkInsideLength();
        org.junit.Assert.assertEquals(numberAxis3DMinorTickMarkInsideLength, actualMinorTickMarkInsideLength, 1.0E-6f);
        
        float numberAxis3DMinorTickMarkOutsideLength = numberAxis3D.getMinorTickMarkOutsideLength();
        float actualMinorTickMarkOutsideLength = actual.getMinorTickMarkOutsideLength();
        org.junit.Assert.assertEquals(numberAxis3DMinorTickMarkOutsideLength, actualMinorTickMarkOutsideLength, 1.0E-6f);
        
        Stroke actualTickMarkStroke = actual.getTickMarkStroke();
        assertNull(actualTickMarkStroke);
        
        Paint actualTickMarkPaint = actual.getTickMarkPaint();
        assertNull(actualTickMarkPaint);
        
        double numberAxis3DFixedDimension = numberAxis3D.getFixedDimension();
        double actualFixedDimension = actual.getFixedDimension();
        org.junit.Assert.assertEquals(numberAxis3DFixedDimension, actualFixedDimension, 1.0E-6);
        
        Plot actualPlot = actual.getPlot();
        assertNull(actualPlot);
        
        EventListenerList actualListenerList = ((EventListenerList) getFieldValue(actual, "org.jfree.chart.axis.Axis", "listenerList"));
        assertNull(actualListenerList);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeAxis(org.jfree.chart.plot.CategoryPlot, int)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getRangeAxis(org.jfree.chart.plot.CategoryPlot,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis result = plot.getRangeAxis(index);
 *  */
    @Test
    public void testGetRangeAxis_ThrowClassCastException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:1042)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(AbstractCategoryItemRenderer.java:1775) */
        stackedBarRenderer3D.getRangeAxis(categoryPlot, 0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getRangeAxis(org.jfree.chart.plot.CategoryPlot,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRangeAxis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:1042)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(AbstractCategoryItemRenderer.java:1775) */
        barRenderer3D.getRangeAxis(categoryPlot, 0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getRangeAxis(org.jfree.chart.plot.CategoryPlot,int)}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getRangeAxis()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = plot.getRangeAxis();
 *  */
    @Test
    public void testGetRangeAxis_ThrowClassCastException_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:1042)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:1029)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(AbstractCategoryItemRenderer.java:1777) */
        waterfallBarRenderer.getRangeAxis(categoryPlot, 1);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getRangeAxis(org.jfree.chart.plot.CategoryPlot,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ValueAxis result = plot.getRangeAxis(index);
 *  */
    @Test
    public void testGetRangeAxis_ThrowClassCastException_2() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CombinedRangeCategoryPlot parent = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList rangeAxes1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes1);
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.ValueAxis (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.ValueAxis is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:1042)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:1048)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(AbstractCategoryItemRenderer.java:1775) */
        waterfallBarRenderer.getRangeAxis(categoryPlot, 0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getRangeAxis(org.jfree.chart.plot.CategoryPlot,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ValueAxis result = plot.getRangeAxis(index);
 *  */
    @Test
    public void testGetRangeAxis_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(AbstractCategoryItemRenderer.java:1775) */
        stackedBarRenderer3D.getRangeAxis(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRangeAxis(org.jfree.chart.plot.CategoryPlot, int)
    
    @Test
    public void testGetRangeAxis1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        
        ValueAxis actual = stackedBarRenderer3D.getRangeAxis(categoryPlot, 0);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetRangeAxis2() throws Exception  {
        BoxAndWhiskerRenderer boxAndWhiskerRenderer = ((BoxAndWhiskerRenderer) createInstance("org.jfree.chart.renderer.category.BoxAndWhiskerRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes1);
        categoryPlot.setParent(parent);
        
        ValueAxis actual = boxAndWhiskerRenderer.getRangeAxis(categoryPlot, 0);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetRangeAxis3() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes1);
        categoryPlot.setParent(parent);
        
        ValueAxis actual = stackedBarRenderer3D.getRangeAxis(categoryPlot, 0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRangeAxis(org.jfree.chart.plot.CategoryPlot, int)
    
    @Test(expected = StackOverflowError.class)
    public void testGetRangeAxis4() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        parent.setParent(parent);
        categoryPlot.setParent(parent);
        
        barRenderer3D.getRangeAxis(categoryPlot, 0);
    }
    
    @Test
    public void testGetRangeAxis5() throws Exception  {
        IntervalBarRenderer intervalBarRenderer = ((IntervalBarRenderer) createInstance("org.jfree.chart.renderer.category.IntervalBarRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", -1073741823);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(rangeAxes1, "org.jfree.chart.util.AbstractObjectList", "size", 1073741825);
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes1);
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:1042)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:1048)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(AbstractCategoryItemRenderer.java:1775) */
        intervalBarRenderer.getRangeAxis(categoryPlot, 1073741824);
    }
    
    @Test
    public void testGetRangeAxis6() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ObjectList rangeAxes1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(parent, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes1);
        categoryPlot.setParent(parent);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis] produces [java.lang.NullPointerException]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:1042)
            org.jfree.chart.plot.CategoryPlot.getRangeAxis(CategoryPlot.java:1029)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(AbstractCategoryItemRenderer.java:1777) */
        barRenderer3D.getRangeAxis(categoryPlot, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region Errors report for getRangeAxis
    
    public void testGetRangeAxis_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getItemLabelGenerator(int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getItemLabelGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (generator == null): True}
 * @utbot.returnsFrom {@code return generator;}
 *  */
    @Test
    public void testGetItemLabelGenerator_GeneratorEqualsNull_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        CategoryItemLabelGenerator actual = waterfallBarRenderer.getItemLabelGenerator(-1, -255, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getItemLabelGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (generator == null): True}
 * @utbot.returnsFrom {@code return generator;}
 *  */
    @Test
    public void testGetItemLabelGenerator_GeneratorEqualsNull_2() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        CategoryItemLabelGenerator actual = waterfallBarRenderer.getItemLabelGenerator(0, -255, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getItemLabelGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (generator == null): False}
 * @utbot.returnsFrom {@code return generator;}
 *  */
    @Test
    public void testGetItemLabelGenerator_GeneratorNotEqualsNull() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        StandardCategoryItemLabelGenerator standardCategoryItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        objects[0] = ((Object) standardCategoryItemLabelGenerator);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        StandardCategoryItemLabelGenerator actual = ((StandardCategoryItemLabelGenerator) stackedBarRenderer3D.getItemLabelGenerator(0, -255, false));
        
        // org.jfree.chart.labels.StandardCategoryItemLabelGenerator has overridden equals method
        assertEquals(standardCategoryItemLabelGenerator, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getItemLabelGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (generator == null): True}
 * @utbot.returnsFrom {@code return generator;}
 *  */
    @Test
    public void testGetItemLabelGenerator_GeneratorEqualsNull() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        stackedBarRenderer3D.setBaseItemLabelGenerator(baseItemLabelGenerator);
        
        StandardCategoryItemLabelGenerator actual = ((StandardCategoryItemLabelGenerator) stackedBarRenderer3D.getItemLabelGenerator(0, -255, false));
        
        // org.jfree.chart.labels.StandardCategoryItemLabelGenerator has overridden equals method
        assertEquals(baseItemLabelGenerator, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getItemLabelGenerator(int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getItemLabelGenerator(int,int,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: this.itemLabelGeneratorList.get(row)
 *  */
    @Test
    public void testGetItemLabelGenerator_ThrowClassCastException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.labels.CategoryItemLabelGenerator (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.labels.CategoryItemLabelGenerator is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator(AbstractCategoryItemRenderer.java:318) */
        stackedBarRenderer3D.getItemLabelGenerator(0, -255, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getItemLabelGenerator(int,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.itemLabelGeneratorList.get(row)
 *  */
    @Test
    public void testGetItemLabelGenerator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator(AbstractCategoryItemRenderer.java:318) */
        waterfallBarRenderer.getItemLabelGenerator(0, -255, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getItemLabelGenerator(int,int,boolean)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.itemLabelGeneratorList.get(row)
 *  */
    @Test
    public void testGetItemLabelGenerator_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator(AbstractCategoryItemRenderer.java:318) */
        stackedBarRenderer3D.getItemLabelGenerator(-255, -255, false);
    }
    ///endregion
    
    ///region Errors report for getItemLabelGenerator
    
    public void testGetItemLabelGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: setSeriesItemLabelGenerator(series, generator, true);
 *  */
    @Test
    public void testSetSeriesItemLabelGenerator_ThrowNegativeArraySizeException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", -255);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator] produces [java.lang.NegativeArraySizeException: -255]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:127)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:367)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:350) */
        waterfallBarRenderer.setSeriesItemLabelGenerator(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setSeriesItemLabelGenerator(series, generator, true);
 *  */
    @Test
    public void testSetSeriesItemLabelGenerator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:367)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:350) */
        waterfallBarRenderer.setSeriesItemLabelGenerator(0, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setSeriesItemLabelGenerator(series, generator, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesItemLabelGenerator_ThrowIllegalArgumentException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        waterfallBarRenderer.setSeriesItemLabelGenerator(-1, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: setSeriesItemLabelGenerator(series, generator, true);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetSeriesItemLabelGenerator_ThrowArrayStoreException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        int[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        waterfallBarRenderer.setSeriesItemLabelGenerator(0, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator)
    
    @Test
    public void testSetSeriesItemLabelGenerator1() throws Exception  {
        AreaRenderer areaRenderer = ((AreaRenderer) createInstance("org.jfree.chart.renderer.category.AreaRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[33];
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(areaRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:369)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:350) */
        areaRenderer.setSeriesItemLabelGenerator(32, intervalCategoryItemLabelGenerator);
    }
    
    @Test
    public void testSetSeriesItemLabelGenerator2() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1073741824);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:369)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:350) */
        stackedBarRenderer3D.setSeriesItemLabelGenerator(32, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 *  */
    @Test
    public void testSetSeriesItemLabelGenerator() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        waterfallBarRenderer.setSeriesItemLabelGenerator(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 *  */
    @Test
    public void testSetSeriesItemLabelGenerator_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        ObjectList waterfallBarRendererItemLabelGeneratorList = ((ObjectList) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList"));
        java.lang.Object[] initialWaterfallBarRendererItemLabelGeneratorListObjects = ((java.lang.Object[]) getFieldValue(waterfallBarRendererItemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        waterfallBarRenderer.setSeriesItemLabelGenerator(0, null, false);
        
        ObjectList waterfallBarRendererItemLabelGeneratorList1 = ((ObjectList) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList"));
        java.lang.Object[] finalWaterfallBarRendererItemLabelGeneratorListObjects = ((java.lang.Object[]) getFieldValue(waterfallBarRendererItemLabelGeneratorList1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        ObjectList waterfallBarRendererItemLabelGeneratorList2 = ((ObjectList) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList"));
        int finalWaterfallBarRendererItemLabelGeneratorListSize = ((Integer) getFieldValue(waterfallBarRendererItemLabelGeneratorList2, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertFalse(initialWaterfallBarRendererItemLabelGeneratorListObjects == finalWaterfallBarRendererItemLabelGeneratorListObjects);
        
        assertEquals(1, finalWaterfallBarRendererItemLabelGeneratorListSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: this.itemLabelGeneratorList.set(series, generator);
 *  */
    @Test
    public void testSetSeriesItemLabelGenerator_ThrowNegativeArraySizeException1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", -255);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator] produces [java.lang.NegativeArraySizeException: -255]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:127)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:367) */
        waterfallBarRenderer.setSeriesItemLabelGenerator(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.itemLabelGeneratorList.set(series, generator);
 *  */
    @Test
    public void testSetSeriesItemLabelGenerator_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:367) */
        waterfallBarRenderer.setSeriesItemLabelGenerator(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.itemLabelGeneratorList.set(series, generator);
 *  */
    @Test
    public void testSetSeriesItemLabelGenerator_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:367) */
        stackedBarRenderer3D.setSeriesItemLabelGenerator(-255, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.itemLabelGeneratorList.set(series, generator);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesItemLabelGenerator_ThrowIllegalArgumentException1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        waterfallBarRenderer.setSeriesItemLabelGenerator(-1, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesItemLabelGenerator(int,org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: this.itemLabelGeneratorList.set(series, generator);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetSeriesItemLabelGenerator_ThrowArrayStoreException1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        char[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        waterfallBarRenderer.setSeriesItemLabelGenerator(0, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)
    
    @Test
    public void testSetSeriesItemLabelGenerator3() throws Exception  {
        LineRenderer3D lineRenderer3D = ((LineRenderer3D) createInstance("org.jfree.chart.renderer.category.LineRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[33];
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(lineRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:369) */
        lineRenderer3D.setSeriesItemLabelGenerator(32, intervalCategoryItemLabelGenerator, true);
    }
    
    @Test
    public void testSetSeriesItemLabelGenerator4() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:369) */
        stackedBarRenderer3D.setSeriesItemLabelGenerator(32, null, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)}
 *  */
    @Test
    public void testSetBaseItemLabelGenerator() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            IntervalCategoryItemLabelGenerator baseItemLabelGenerator = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
            barRenderer3D.setBaseItemLabelGenerator(baseItemLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            barRenderer3D.setBaseItemLabelGenerator(null);
            
            CategoryItemLabelGenerator finalBarRenderer3DBaseItemLabelGenerator = ((CategoryItemLabelGenerator) getFieldValue(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseItemLabelGenerator"));
            
            assertNull(finalBarRenderer3DBaseItemLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)}
 *  */
    @Test
    public void testSetBaseItemLabelGenerator_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            IntervalCategoryItemLabelGenerator baseItemLabelGenerator = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
            barRenderer3D.setBaseItemLabelGenerator(baseItemLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            barRenderer3D.setBaseItemLabelGenerator(null);
            
            CategoryItemLabelGenerator finalBarRenderer3DBaseItemLabelGenerator = ((CategoryItemLabelGenerator) getFieldValue(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseItemLabelGenerator"));
            
            assertNull(finalBarRenderer3DBaseItemLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setBaseItemLabelGenerator(generator, true);
 *  */
    @Test
    public void testSetBaseItemLabelGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            IntervalCategoryItemLabelGenerator baseItemLabelGenerator = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
            barRenderer3D.setBaseItemLabelGenerator(baseItemLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            barRenderer3D.setBaseItemLabelGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setBaseItemLabelGenerator
    
    public void testSetBaseItemLabelGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): False}
 *  */
    @Test
    public void testSetBaseItemLabelGenerator_NotNotify() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        stackedBarRenderer3D.setBaseItemLabelGenerator(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetBaseItemLabelGenerator_Notify() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            IntervalCategoryItemLabelGenerator baseItemLabelGenerator = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
            stackedBarRenderer3D.setBaseItemLabelGenerator(baseItemLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            stackedBarRenderer3D.setBaseItemLabelGenerator(null, true);
            
            CategoryItemLabelGenerator finalStackedBarRenderer3DBaseItemLabelGenerator = ((CategoryItemLabelGenerator) getFieldValue(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseItemLabelGenerator"));
            
            assertNull(finalStackedBarRenderer3DBaseItemLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetBaseItemLabelGenerator_Notify_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            IntervalCategoryItemLabelGenerator baseItemLabelGenerator = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
            barRenderer3D.setBaseItemLabelGenerator(baseItemLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            barRenderer3D.setBaseItemLabelGenerator(null, true);
            
            CategoryItemLabelGenerator finalBarRenderer3DBaseItemLabelGenerator = ((CategoryItemLabelGenerator) getFieldValue(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseItemLabelGenerator"));
            
            assertNull(finalBarRenderer3DBaseItemLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetBaseItemLabelGenerator_ThrowClassCastException1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            IntervalCategoryItemLabelGenerator baseItemLabelGenerator = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
            barRenderer3D.setBaseItemLabelGenerator(baseItemLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            barRenderer3D.setBaseItemLabelGenerator(null, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetBaseItemLabelGenerator_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            PiePlot3D parent = ((PiePlot3D) createInstance("org.jfree.chart.plot.PiePlot3D"));
            categoryPlot.setParent(parent);
            listenerList1[1] = ((Object) categoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            stackedBarRenderer3D.setBaseItemLabelGenerator(null, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setBaseItemLabelGenerator
    
    public void testSetBaseItemLabelGenerator_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getToolTipGenerator(int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getToolTipGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetToolTipGenerator_ResultEqualsNull() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        CategoryToolTipGenerator actual = waterfallBarRenderer.getToolTipGenerator(0, -255, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getToolTipGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetToolTipGenerator_ResultEqualsNull_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        CategoryToolTipGenerator actual = waterfallBarRenderer.getToolTipGenerator(-1, -255, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getToolTipGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (result == null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetToolTipGenerator_ResultNotEqualsNull() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        StandardCategoryToolTipGenerator standardCategoryToolTipGenerator = ((StandardCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.StandardCategoryToolTipGenerator"));
        objects[0] = ((Object) standardCategoryToolTipGenerator);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        StandardCategoryToolTipGenerator actual = ((StandardCategoryToolTipGenerator) stackedBarRenderer3D.getToolTipGenerator(0, -255, false));
        
        // org.jfree.chart.labels.StandardCategoryToolTipGenerator has overridden equals method
        assertEquals(standardCategoryToolTipGenerator, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getToolTipGenerator(int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getToolTipGenerator(int,int,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: result = getSeriesToolTipGenerator(row);
 *  */
    @Test
    public void testGetToolTipGenerator_ThrowClassCastException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getToolTipGenerator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.labels.CategoryToolTipGenerator (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.labels.CategoryToolTipGenerator is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:453)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getToolTipGenerator(AbstractCategoryItemRenderer.java:435) */
        waterfallBarRenderer.getToolTipGenerator(0, -255, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getToolTipGenerator(int,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetToolTipGenerator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getToolTipGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:453)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getToolTipGenerator(AbstractCategoryItemRenderer.java:435) */
        waterfallBarRenderer.getToolTipGenerator(0, -255, false);
    }
    ///endregion
    
    ///region Errors report for getToolTipGenerator
    
    public void testGetToolTipGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSeriesToolTipGenerator(int)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesToolTipGenerator(int)}
 * @utbot.returnsFrom {@code return (CategoryToolTipGenerator) this.toolTipGeneratorList.get(series);}
 *  */
    @Test
    public void testGetSeriesToolTipGenerator_ReturnThisToolTipGeneratorListGetSeries() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        CategoryToolTipGenerator actual = waterfallBarRenderer.getSeriesToolTipGenerator(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesToolTipGenerator(int)}
 * @utbot.returnsFrom {@code return (CategoryToolTipGenerator) this.toolTipGeneratorList.get(series);}
 *  */
    @Test
    public void testGetSeriesToolTipGenerator_ReturnThisToolTipGeneratorListGetSeries_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        CategoryToolTipGenerator actual = waterfallBarRenderer.getSeriesToolTipGenerator(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSeriesToolTipGenerator(int)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesToolTipGenerator(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (CategoryToolTipGenerator) this.toolTipGeneratorList.get(series);
 *  */
    @Test
    public void testGetSeriesToolTipGenerator_ThrowClassCastException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.labels.CategoryToolTipGenerator (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.labels.CategoryToolTipGenerator is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:453) */
        stackedBarRenderer3D.getSeriesToolTipGenerator(0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesToolTipGenerator(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (CategoryToolTipGenerator) this.toolTipGeneratorList.get(series);
 *  */
    @Test
    public void testGetSeriesToolTipGenerator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:453) */
        waterfallBarRenderer.getSeriesToolTipGenerator(0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesToolTipGenerator(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (CategoryToolTipGenerator) this.toolTipGeneratorList.get(series);
 *  */
    @Test
    public void testGetSeriesToolTipGenerator_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:453) */
        stackedBarRenderer3D.getSeriesToolTipGenerator(-255);
    }
    ///endregion
    
    ///region Errors report for getSeriesToolTipGenerator
    
    public void testGetSeriesToolTipGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSeriesItemLabelGenerator(int)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesItemLabelGenerator(int)}
 * @utbot.returnsFrom {@code return (CategoryItemLabelGenerator) this.itemLabelGeneratorList.get(series);}
 *  */
    @Test
    public void testGetSeriesItemLabelGenerator_ReturnThisItemLabelGeneratorListGetSeries() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        CategoryItemLabelGenerator actual = waterfallBarRenderer.getSeriesItemLabelGenerator(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesItemLabelGenerator(int)}
 * @utbot.returnsFrom {@code return (CategoryItemLabelGenerator) this.itemLabelGeneratorList.get(series);}
 *  */
    @Test
    public void testGetSeriesItemLabelGenerator_ReturnThisItemLabelGeneratorListGetSeries_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        CategoryItemLabelGenerator actual = waterfallBarRenderer.getSeriesItemLabelGenerator(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSeriesItemLabelGenerator(int)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesItemLabelGenerator(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (CategoryItemLabelGenerator) this.itemLabelGeneratorList.get(series);
 *  */
    @Test
    public void testGetSeriesItemLabelGenerator_ThrowClassCastException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.labels.CategoryItemLabelGenerator (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.labels.CategoryItemLabelGenerator is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:335) */
        stackedBarRenderer3D.getSeriesItemLabelGenerator(0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesItemLabelGenerator(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (CategoryItemLabelGenerator) this.itemLabelGeneratorList.get(series);
 *  */
    @Test
    public void testGetSeriesItemLabelGenerator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:335) */
        waterfallBarRenderer.getSeriesItemLabelGenerator(0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesItemLabelGenerator(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (CategoryItemLabelGenerator) this.itemLabelGeneratorList.get(series);
 *  */
    @Test
    public void testGetSeriesItemLabelGenerator_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator(AbstractCategoryItemRenderer.java:335) */
        stackedBarRenderer3D.getSeriesItemLabelGenerator(-255);
    }
    ///endregion
    
    ///region Errors report for getSeriesItemLabelGenerator
    
    public void testGetSeriesItemLabelGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesToolTipGenerator(int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 *  */
    @Test
    public void testSetSeriesToolTipGenerator() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        waterfallBarRenderer.setSeriesToolTipGenerator(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesToolTipGenerator(int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 *  */
    @Test
    public void testSetSeriesToolTipGenerator_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        ObjectList waterfallBarRendererToolTipGeneratorList = ((ObjectList) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList"));
        java.lang.Object[] initialWaterfallBarRendererToolTipGeneratorListObjects = ((java.lang.Object[]) getFieldValue(waterfallBarRendererToolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        waterfallBarRenderer.setSeriesToolTipGenerator(0, null, false);
        
        ObjectList waterfallBarRendererToolTipGeneratorList1 = ((ObjectList) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList"));
        java.lang.Object[] finalWaterfallBarRendererToolTipGeneratorListObjects = ((java.lang.Object[]) getFieldValue(waterfallBarRendererToolTipGeneratorList1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        ObjectList waterfallBarRendererToolTipGeneratorList2 = ((ObjectList) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList"));
        int finalWaterfallBarRendererToolTipGeneratorListSize = ((Integer) getFieldValue(waterfallBarRendererToolTipGeneratorList2, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertFalse(initialWaterfallBarRendererToolTipGeneratorListObjects == finalWaterfallBarRendererToolTipGeneratorListObjects);
        
        assertEquals(1, finalWaterfallBarRendererToolTipGeneratorListSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesToolTipGenerator(int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: this.toolTipGeneratorList.set(series, generator);
 *  */
    @Test
    public void testSetSeriesToolTipGenerator_ThrowNegativeArraySizeException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", -255);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator] produces [java.lang.NegativeArraySizeException: -255]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:127)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:485) */
        waterfallBarRenderer.setSeriesToolTipGenerator(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesToolTipGenerator(int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.toolTipGeneratorList.set(series, generator);
 *  */
    @Test
    public void testSetSeriesToolTipGenerator_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:485) */
        stackedBarRenderer3D.setSeriesToolTipGenerator(-255, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesToolTipGenerator(int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.toolTipGeneratorList.set(series, generator);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesToolTipGenerator_ThrowIllegalArgumentException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        waterfallBarRenderer.setSeriesToolTipGenerator(-1, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesToolTipGenerator(int,org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: this.toolTipGeneratorList.set(series, generator);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetSeriesToolTipGenerator_ThrowArrayStoreException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        char[] objects = {};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        waterfallBarRenderer.setSeriesToolTipGenerator(0, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)
    
    @Test
    public void testSetSeriesToolTipGenerator1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:485) */
        stackedBarRenderer3D.setSeriesToolTipGenerator(9, null, false);
    }
    
    @Test
    public void testSetSeriesToolTipGenerator2() throws Exception  {
        AreaRenderer areaRenderer = ((AreaRenderer) createInstance("org.jfree.chart.renderer.category.AreaRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[33];
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1073741824);
        setField(areaRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StandardCategoryToolTipGenerator standardCategoryToolTipGenerator = ((StandardCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.StandardCategoryToolTipGenerator"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:487) */
        areaRenderer.setSeriesToolTipGenerator(32, standardCategoryToolTipGenerator, true);
    }
    
    @Test
    public void testSetSeriesToolTipGenerator3() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:487) */
        stackedBarRenderer3D.setSeriesToolTipGenerator(32, null, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesToolTipGenerator(int,org.jfree.chart.labels.CategoryToolTipGenerator)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: setSeriesToolTipGenerator(series, generator, true);
 *  */
    @Test
    public void testSetSeriesToolTipGenerator_ThrowNegativeArraySizeException1() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", -255);
        setField(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator] produces [java.lang.NegativeArraySizeException: -255]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:127)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:485)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:467) */
        barRenderer3D.setSeriesToolTipGenerator(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesToolTipGenerator(int,org.jfree.chart.labels.CategoryToolTipGenerator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setSeriesToolTipGenerator(series, generator, true);
 *  */
    @Test
    public void testSetSeriesToolTipGenerator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:485)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:467) */
        barRenderer3D.setSeriesToolTipGenerator(0, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesToolTipGenerator(int,org.jfree.chart.labels.CategoryToolTipGenerator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setSeriesToolTipGenerator(series, generator, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesToolTipGenerator_ThrowIllegalArgumentException1() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        barRenderer3D.setSeriesToolTipGenerator(-1, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesToolTipGenerator(int,org.jfree.chart.labels.CategoryToolTipGenerator)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: setSeriesToolTipGenerator(series, generator, true);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetSeriesToolTipGenerator_ThrowArrayStoreException1() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        int[] objects = {};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        barRenderer3D.setSeriesToolTipGenerator(0, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator)
    
    @Test
    public void testSetSeriesToolTipGenerator4() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[33];
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1073741824);
        setField(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        BoxAndWhiskerToolTipGenerator boxAndWhiskerToolTipGenerator = ((BoxAndWhiskerToolTipGenerator) createInstance("org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:487)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:467) */
        barRenderer3D.setSeriesToolTipGenerator(32, boxAndWhiskerToolTipGenerator);
    }
    
    @Test
    public void testSetSeriesToolTipGenerator5() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:487)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:467) */
        stackedBarRenderer3D.setSeriesToolTipGenerator(32, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBaseToolTipGenerator()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getBaseToolTipGenerator()}
 * @utbot.returnsFrom {@code return this.baseToolTipGenerator;}
 *  */
    @Test
    public void testGetBaseToolTipGenerator_ReturnThisBaseToolTipGenerator() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        CategoryToolTipGenerator actual = stackedBarRenderer3D.getBaseToolTipGenerator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getBaseToolTipGenerator
    
    public void testGetBaseToolTipGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)}
 *  */
    @Test
    public void testSetBaseToolTipGenerator() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            StandardCategoryToolTipGenerator baseToolTipGenerator = ((StandardCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.StandardCategoryToolTipGenerator"));
            waterfallBarRenderer.setBaseToolTipGenerator(baseToolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            waterfallBarRenderer.setBaseToolTipGenerator(null);
            
            CategoryToolTipGenerator finalWaterfallBarRendererBaseToolTipGenerator = ((CategoryToolTipGenerator) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseToolTipGenerator"));
            
            assertNull(finalWaterfallBarRendererBaseToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)}
 *  */
    @Test
    public void testSetBaseToolTipGenerator_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            StandardCategoryToolTipGenerator baseToolTipGenerator = ((StandardCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.StandardCategoryToolTipGenerator"));
            waterfallBarRenderer.setBaseToolTipGenerator(baseToolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            waterfallBarRenderer.setBaseToolTipGenerator(null);
            
            CategoryToolTipGenerator finalWaterfallBarRendererBaseToolTipGenerator = ((CategoryToolTipGenerator) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseToolTipGenerator"));
            
            assertNull(finalWaterfallBarRendererBaseToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setBaseToolTipGenerator(generator, true);
 *  */
    @Test
    public void testSetBaseToolTipGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            StandardCategoryToolTipGenerator baseToolTipGenerator = ((StandardCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.StandardCategoryToolTipGenerator"));
            waterfallBarRenderer.setBaseToolTipGenerator(baseToolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            waterfallBarRenderer.setBaseToolTipGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setBaseToolTipGenerator
    
    public void testSetBaseToolTipGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): False}
 *  */
    @Test
    public void testSetBaseToolTipGenerator_NotNotify() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        StandardCategoryToolTipGenerator baseToolTipGenerator = ((StandardCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.StandardCategoryToolTipGenerator"));
        stackedBarRenderer3D.setBaseToolTipGenerator(baseToolTipGenerator);
        
        stackedBarRenderer3D.setBaseToolTipGenerator(null, false);
        
        CategoryToolTipGenerator finalStackedBarRenderer3DBaseToolTipGenerator = ((CategoryToolTipGenerator) getFieldValue(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseToolTipGenerator"));
        
        assertNull(finalStackedBarRenderer3DBaseToolTipGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetBaseToolTipGenerator_Notify() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            IntervalCategoryToolTipGenerator baseToolTipGenerator = ((IntervalCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryToolTipGenerator"));
            Class abstractCategoryItemRendererClazz = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
            Class baseToolTipGeneratorType = Class.forName("org.jfree.chart.labels.CategoryToolTipGenerator");
            Method setBaseToolTipGeneratorMethod = abstractCategoryItemRendererClazz.getDeclaredMethod("setBaseToolTipGenerator", baseToolTipGeneratorType);
            setBaseToolTipGeneratorMethod.setAccessible(true);
            java.lang.Object[] setBaseToolTipGeneratorMethodArguments = new java.lang.Object[1];
            setBaseToolTipGeneratorMethodArguments[0] = baseToolTipGenerator;
            setBaseToolTipGeneratorMethod.invoke(stackedBarRenderer3D, setBaseToolTipGeneratorMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            stackedBarRenderer3D.setBaseToolTipGenerator(null, true);
            
            CategoryToolTipGenerator finalStackedBarRenderer3DBaseToolTipGenerator = ((CategoryToolTipGenerator) getFieldValue(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseToolTipGenerator"));
            
            assertNull(finalStackedBarRenderer3DBaseToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetBaseToolTipGenerator_Notify_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            IntervalCategoryToolTipGenerator baseToolTipGenerator = ((IntervalCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryToolTipGenerator"));
            Class abstractCategoryItemRendererClazz = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
            Class baseToolTipGeneratorType = Class.forName("org.jfree.chart.labels.CategoryToolTipGenerator");
            Method setBaseToolTipGeneratorMethod = abstractCategoryItemRendererClazz.getDeclaredMethod("setBaseToolTipGenerator", baseToolTipGeneratorType);
            setBaseToolTipGeneratorMethod.setAccessible(true);
            java.lang.Object[] setBaseToolTipGeneratorMethodArguments = new java.lang.Object[1];
            setBaseToolTipGeneratorMethodArguments[0] = baseToolTipGenerator;
            setBaseToolTipGeneratorMethod.invoke(stackedBarRenderer3D, setBaseToolTipGeneratorMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            stackedBarRenderer3D.setBaseToolTipGenerator(null, true);
            
            CategoryToolTipGenerator finalStackedBarRenderer3DBaseToolTipGenerator = ((CategoryToolTipGenerator) getFieldValue(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseToolTipGenerator"));
            
            assertNull(finalStackedBarRenderer3DBaseToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetBaseToolTipGenerator_ThrowClassCastException1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            IntervalCategoryToolTipGenerator baseToolTipGenerator = ((IntervalCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryToolTipGenerator"));
            Class abstractCategoryItemRendererClazz = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
            Class baseToolTipGeneratorType = Class.forName("org.jfree.chart.labels.CategoryToolTipGenerator");
            Method setBaseToolTipGeneratorMethod = abstractCategoryItemRendererClazz.getDeclaredMethod("setBaseToolTipGenerator", baseToolTipGeneratorType);
            setBaseToolTipGeneratorMethod.setAccessible(true);
            java.lang.Object[] setBaseToolTipGeneratorMethodArguments = new java.lang.Object[1];
            setBaseToolTipGeneratorMethodArguments[0] = baseToolTipGenerator;
            setBaseToolTipGeneratorMethod.invoke(stackedBarRenderer3D, setBaseToolTipGeneratorMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            stackedBarRenderer3D.setBaseToolTipGenerator(null, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetBaseToolTipGenerator_ThrowIndexOutOfBoundsException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            IntervalCategoryToolTipGenerator baseToolTipGenerator = ((IntervalCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryToolTipGenerator"));
            Class abstractCategoryItemRendererClazz = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
            Class baseToolTipGeneratorType = Class.forName("org.jfree.chart.labels.CategoryToolTipGenerator");
            Method setBaseToolTipGeneratorMethod = abstractCategoryItemRendererClazz.getDeclaredMethod("setBaseToolTipGenerator", baseToolTipGeneratorType);
            setBaseToolTipGeneratorMethod.setAccessible(true);
            java.lang.Object[] setBaseToolTipGeneratorMethodArguments = new java.lang.Object[1];
            setBaseToolTipGeneratorMethodArguments[0] = baseToolTipGenerator;
            setBaseToolTipGeneratorMethod.invoke(waterfallBarRenderer, setBaseToolTipGeneratorMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[1] = ((Object) combinedRangeCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            waterfallBarRenderer.setBaseToolTipGenerator(null, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetBaseToolTipGenerator_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            Object object = createInstance("java.lang.Object");
            objects[0] = object;
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[1] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
            barRenderer3D.setBaseToolTipGenerator(null, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetBaseToolTipGenerator_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            FastScatterPlot parent = ((FastScatterPlot) createInstance("org.jfree.chart.plot.FastScatterPlot"));
            combinedDomainCategoryPlot.setParent(parent);
            listenerList1[1] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            waterfallBarRenderer.setBaseToolTipGenerator(null, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setBaseToolTipGenerator
    
    public void testSetBaseToolTipGenerator_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSeriesURLGenerator(int)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesURLGenerator(int)}
 * @utbot.returnsFrom {@code return (CategoryURLGenerator) this.urlGeneratorList.get(series);}
 *  */
    @Test
    public void testGetSeriesURLGenerator_ReturnThisUrlGeneratorListGetSeries() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        CategoryURLGenerator actual = waterfallBarRenderer.getSeriesURLGenerator(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesURLGenerator(int)}
 * @utbot.returnsFrom {@code return (CategoryURLGenerator) this.urlGeneratorList.get(series);}
 *  */
    @Test
    public void testGetSeriesURLGenerator_ReturnThisUrlGeneratorListGetSeries_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        CategoryURLGenerator actual = waterfallBarRenderer.getSeriesURLGenerator(-1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSeriesURLGenerator(int)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesURLGenerator(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (CategoryURLGenerator) this.urlGeneratorList.get(series);
 *  */
    @Test
    public void testGetSeriesURLGenerator_ThrowClassCastException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.urls.CategoryURLGenerator (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.urls.CategoryURLGenerator is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator(AbstractCategoryItemRenderer.java:566) */
        stackedBarRenderer3D.getSeriesURLGenerator(0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesURLGenerator(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (CategoryURLGenerator) this.urlGeneratorList.get(series);
 *  */
    @Test
    public void testGetSeriesURLGenerator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator(AbstractCategoryItemRenderer.java:566) */
        waterfallBarRenderer.getSeriesURLGenerator(0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getSeriesURLGenerator(int)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (CategoryURLGenerator) this.urlGeneratorList.get(series);
 *  */
    @Test
    public void testGetSeriesURLGenerator_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator(AbstractCategoryItemRenderer.java:566) */
        stackedBarRenderer3D.getSeriesURLGenerator(-255);
    }
    ///endregion
    
    ///region Errors report for getSeriesURLGenerator
    
    public void testGetSeriesURLGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseItemLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBaseItemLabelGenerator()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getBaseItemLabelGenerator()}
 * @utbot.returnsFrom {@code return this.baseItemLabelGenerator;}
 *  */
    @Test
    public void testGetBaseItemLabelGenerator_ReturnThisBaseItemLabelGenerator() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        CategoryItemLabelGenerator actual = stackedBarRenderer3D.getBaseItemLabelGenerator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getBaseItemLabelGenerator
    
    public void testGetBaseItemLabelGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: setSeriesURLGenerator(series, generator, true);
 *  */
    @Test
    public void testSetSeriesURLGenerator_ThrowNegativeArraySizeException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", -255);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator] produces [java.lang.NegativeArraySizeException: -255]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:127)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:597)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:580) */
        waterfallBarRenderer.setSeriesURLGenerator(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setSeriesURLGenerator(series, generator, true);
 *  */
    @Test
    public void testSetSeriesURLGenerator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:597)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:580) */
        waterfallBarRenderer.setSeriesURLGenerator(0, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setSeriesURLGenerator(series, generator, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesURLGenerator_ThrowIllegalArgumentException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        waterfallBarRenderer.setSeriesURLGenerator(-1, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: setSeriesURLGenerator(series, generator, true);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetSeriesURLGenerator_ThrowArrayStoreException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        int[] objects = {};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        waterfallBarRenderer.setSeriesURLGenerator(0, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator)
    
    @Test
    public void testSetSeriesURLGenerator1() throws Exception  {
        GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[33];
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1073741824);
        setField(groupedStackedBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        CustomCategoryURLGenerator customCategoryURLGenerator = new CustomCategoryURLGenerator();
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:599)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:580) */
        groupedStackedBarRenderer.setSeriesURLGenerator(32, customCategoryURLGenerator);
    }
    
    @Test
    public void testSetSeriesURLGenerator2() throws Exception  {
        StackedBarRenderer stackedBarRenderer = ((StackedBarRenderer) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(stackedBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:599)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:580) */
        stackedBarRenderer.setSeriesURLGenerator(32, null);
    }
    ///endregion
    
    ///region Errors report for setSeriesURLGenerator
    
    public void testSetSeriesURLGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 *  */
    @Test
    public void testSetSeriesURLGenerator() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        waterfallBarRenderer.setSeriesURLGenerator(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 *  */
    @Test
    public void testSetSeriesURLGenerator_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        ObjectList waterfallBarRendererUrlGeneratorList = ((ObjectList) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList"));
        java.lang.Object[] initialWaterfallBarRendererUrlGeneratorListObjects = ((java.lang.Object[]) getFieldValue(waterfallBarRendererUrlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        waterfallBarRenderer.setSeriesURLGenerator(0, null, false);
        
        ObjectList waterfallBarRendererUrlGeneratorList1 = ((ObjectList) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList"));
        java.lang.Object[] finalWaterfallBarRendererUrlGeneratorListObjects = ((java.lang.Object[]) getFieldValue(waterfallBarRendererUrlGeneratorList1, "org.jfree.chart.util.AbstractObjectList", "objects"));
        ObjectList waterfallBarRendererUrlGeneratorList2 = ((ObjectList) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList"));
        int finalWaterfallBarRendererUrlGeneratorListSize = ((Integer) getFieldValue(waterfallBarRendererUrlGeneratorList2, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertFalse(initialWaterfallBarRendererUrlGeneratorListObjects == finalWaterfallBarRendererUrlGeneratorListObjects);
        
        assertEquals(1, finalWaterfallBarRendererUrlGeneratorListSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: this.urlGeneratorList.set(series, generator);
 *  */
    @Test
    public void testSetSeriesURLGenerator_ThrowNegativeArraySizeException1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", -255);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator] produces [java.lang.NegativeArraySizeException: -255]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:127)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:597) */
        waterfallBarRenderer.setSeriesURLGenerator(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: this.urlGeneratorList.set(series, generator);
 *  */
    @Test
    public void testSetSeriesURLGenerator_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ObjectList.set(ObjectList.java:95)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:597) */
        waterfallBarRenderer.setSeriesURLGenerator(0, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.urlGeneratorList.set(series, generator);
 *  */
    @Test
    public void testSetSeriesURLGenerator_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:597) */
        stackedBarRenderer3D.setSeriesURLGenerator(-255, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: this.urlGeneratorList.set(series, generator);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesURLGenerator_ThrowIllegalArgumentException1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        waterfallBarRenderer.setSeriesURLGenerator(-1, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setSeriesURLGenerator(int,org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: this.urlGeneratorList.set(series, generator);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetSeriesURLGenerator_ThrowArrayStoreException1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        char[] objects = {};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        waterfallBarRenderer.setSeriesURLGenerator(0, null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)
    
    @Test
    public void testSetSeriesURLGenerator3() throws Exception  {
        StackedBarRenderer stackedBarRenderer = ((StackedBarRenderer) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1073741824);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        setField(stackedBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:599) */
        stackedBarRenderer.setSeriesURLGenerator(32, null, true);
    }
    
    @Test
    public void testSetSeriesURLGenerator4() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[33];
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        CustomCategoryURLGenerator customCategoryURLGenerator = new CustomCategoryURLGenerator();
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(AbstractCategoryItemRenderer.java:599) */
        barRenderer3D.setSeriesURLGenerator(32, customCategoryURLGenerator, true);
    }
    ///endregion
    
    ///region Errors report for setSeriesURLGenerator
    
    public void testSetSeriesURLGenerator_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.updateCrosshairValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateCrosshairValues(org.jfree.chart.plot.CategoryCrosshairState, java.lang.Comparable, java.lang.Comparable, double, int, double, double, org.jfree.chart.plot.PlotOrientation)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#updateCrosshairValues(org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation)}
 * @utbot.executesCondition {@code (orientation == null): False}
 * @utbot.executesCondition {@code (crosshairState != null): False}
 *  */
    @Test
    public void testUpdateCrosshairValues_CrosshairStateEqualsNull() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        
        stackedBarRenderer3D.updateCrosshairValues(null, null, null, java.lang.Double.NaN, -240, java.lang.Double.NaN, java.lang.Double.NaN, plotOrientation);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateCrosshairValues(org.jfree.chart.plot.CategoryCrosshairState, java.lang.Comparable, java.lang.Comparable, double, int, double, double, org.jfree.chart.plot.PlotOrientation)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#updateCrosshairValues(org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation)}
 * @utbot.executesCondition {@code (orientation == null): False}
 * @utbot.executesCondition {@code (crosshairState != null): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#isRangeCrosshairLockedOnData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.plot.isRangeCrosshairLockedOnData()
 *  */
    @Test
    public void testUpdateCrosshairValues_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CategoryCrosshairState categoryCrosshairState = new CategoryCrosshairState();
        PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.updateCrosshairValues] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.updateCrosshairValues(AbstractCategoryItemRenderer.java:1578) */
        stackedBarRenderer3D.updateCrosshairValues(categoryCrosshairState, null, null, java.lang.Double.NaN, -255, java.lang.Double.NaN, java.lang.Double.NaN, plotOrientation);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateCrosshairValues(org.jfree.chart.plot.CategoryCrosshairState, java.lang.Comparable, java.lang.Comparable, double, int, double, double, org.jfree.chart.plot.PlotOrientation)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#updateCrosshairValues(org.jfree.chart.plot.CategoryCrosshairState,java.lang.Comparable,java.lang.Comparable,double,int,double,double,org.jfree.chart.plot.PlotOrientation)}
 * @utbot.executesCondition {@code (orientation == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: orientation == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateCrosshairValues_ThrowIllegalArgumentException() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        
        barRenderer3D.updateCrosshairValues(null, null, null, java.lang.Double.NaN, -255, java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method updateCrosshairValues(org.jfree.chart.plot.CategoryCrosshairState, java.lang.Comparable, java.lang.Comparable, double, int, double, double, org.jfree.chart.plot.PlotOrientation)
    
    @Test
    public void testUpdateCrosshairValues1() throws Exception  {
        StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer = ((StatisticalLineAndShapeRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        statisticalLineAndShapeRenderer.setPlot(plot);
        CategoryCrosshairState categoryCrosshairState = new CategoryCrosshairState();
        PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        
        statisticalLineAndShapeRenderer.updateCrosshairValues(categoryCrosshairState, null, null, java.lang.Double.NaN, 0, java.lang.Double.NaN, java.lang.Double.NaN, plotOrientation);
    }
    
    @Test
    public void testUpdateCrosshairValues2() throws Exception  {
        StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer = ((StatisticalLineAndShapeRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        plot.setRangeCrosshairLockedOnData(true);
        statisticalLineAndShapeRenderer.setPlot(plot);
        CategoryCrosshairState categoryCrosshairState = new CategoryCrosshairState();
        PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        
        statisticalLineAndShapeRenderer.updateCrosshairValues(categoryCrosshairState, null, null, java.lang.Double.NaN, 0, java.lang.Double.NaN, java.lang.Double.NaN, plotOrientation);
    }
    
    @Test
    public void testUpdateCrosshairValues3() throws Exception  {
        StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer = ((StatisticalLineAndShapeRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        plot.setRangeCrosshairLockedOnData(true);
        statisticalLineAndShapeRenderer.setPlot(plot);
        CategoryCrosshairState categoryCrosshairState = new CategoryCrosshairState();
        Point point = new Point(0, 0);
        categoryCrosshairState.setAnchor(point);
        PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        
        statisticalLineAndShapeRenderer.updateCrosshairValues(categoryCrosshairState, null, null, java.lang.Double.NaN, 0, java.lang.Double.NaN, java.lang.Double.NaN, plotOrientation);
    }
    
    @Test
    public void testUpdateCrosshairValues4() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        barRenderer3D.setPlot(plot);
        CategoryCrosshairState categoryCrosshairState = new CategoryCrosshairState();
        Point point = new Point(0, 0);
        categoryCrosshairState.setAnchor(point);
        PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        
        barRenderer3D.updateCrosshairValues(categoryCrosshairState, null, null, java.lang.Double.NaN, 0, java.lang.Double.NaN, java.lang.Double.NaN, plotOrientation);
    }
    ///endregion
    
    ///region Errors report for updateCrosshairValues
    
    public void testUpdateCrosshairValues_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)}
 *  */
    @Test
    public void testSetLegendItemLabelGenerator() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            waterfallBarRenderer.setLegendItemLabelGenerator(legendItemLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            
            CategorySeriesLabelGenerator initialWaterfallBarRendererLegendItemLabelGenerator = ((CategorySeriesLabelGenerator) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "legendItemLabelGenerator"));
            
            waterfallBarRenderer.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator);
            
            CategorySeriesLabelGenerator finalWaterfallBarRendererLegendItemLabelGenerator = ((CategorySeriesLabelGenerator) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "legendItemLabelGenerator"));
            
            assertFalse(initialWaterfallBarRendererLegendItemLabelGenerator == finalWaterfallBarRendererLegendItemLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)}
 *  */
    @Test
    public void testSetLegendItemLabelGenerator_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            stackedBarRenderer3D.setLegendItemLabelGenerator(legendItemLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            
            CategorySeriesLabelGenerator initialStackedBarRenderer3DLegendItemLabelGenerator = ((CategorySeriesLabelGenerator) getFieldValue(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "legendItemLabelGenerator"));
            
            stackedBarRenderer3D.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator);
            
            CategorySeriesLabelGenerator finalStackedBarRenderer3DLegendItemLabelGenerator = ((CategorySeriesLabelGenerator) getFieldValue(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "legendItemLabelGenerator"));
            
            assertFalse(initialStackedBarRenderer3DLegendItemLabelGenerator == finalStackedBarRenderer3DLegendItemLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)}
 * @utbot.executesCondition {@code (generator == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: generator == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendItemLabelGenerator_ThrowIllegalArgumentException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        stackedBarRenderer3D.setLegendItemLabelGenerator(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)}
 * @utbot.executesCondition {@code (generator == null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetLegendItemLabelGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            stackedBarRenderer3D.setLegendItemLabelGenerator(legendItemLabelGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemLabelGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            stackedBarRenderer3D.setLegendItemLabelGenerator(standardCategorySeriesLabelGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLegendItemLabelGenerator
    
    public void testSetLegendItemLabelGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 *  */
    @Test
    public void testSetLegendItemToolTipGenerator_AbstractCategoryItemRendererFireChangeEvent() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            StandardCategorySeriesLabelGenerator legendItemToolTipGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            barRenderer3D.setLegendItemToolTipGenerator(legendItemToolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            barRenderer3D.setLegendItemToolTipGenerator(null);
            
            CategorySeriesLabelGenerator finalBarRenderer3DLegendItemToolTipGenerator = ((CategorySeriesLabelGenerator) getFieldValue(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "legendItemToolTipGenerator"));
            
            assertNull(finalBarRenderer3DLegendItemToolTipGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetLegendItemToolTipGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            StandardCategorySeriesLabelGenerator legendItemToolTipGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            stackedBarRenderer3D.setLegendItemToolTipGenerator(legendItemToolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemToolTipGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            stackedBarRenderer3D.setLegendItemToolTipGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: fireChangeEvent();
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetLegendItemToolTipGenerator_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            StandardCategorySeriesLabelGenerator legendItemToolTipGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            stackedBarRenderer3D.setLegendItemToolTipGenerator(legendItemToolTipGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            PiePlot3D parent = ((PiePlot3D) createInstance("org.jfree.chart.plot.PiePlot3D"));
            combinedDomainCategoryPlot.setParent(parent);
            listenerList1[1] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            stackedBarRenderer3D.setLegendItemToolTipGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLegendItemToolTipGenerator
    
    public void testSetLegendItemToolTipGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBaseURLGenerator()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getBaseURLGenerator()}
 * @utbot.returnsFrom {@code return this.baseURLGenerator;}
 *  */
    @Test
    public void testGetBaseURLGenerator_ReturnThisBaseURLGenerator() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        CategoryURLGenerator actual = stackedBarRenderer3D.getBaseURLGenerator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getBaseURLGenerator
    
    public void testGetBaseURLGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemLabelGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendItemLabelGenerator()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItemLabelGenerator()}
 * @utbot.returnsFrom {@code return this.legendItemLabelGenerator;}
 *  */
    @Test
    public void testGetLegendItemLabelGenerator_ReturnThisLegendItemLabelGenerator() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        stackedBarRenderer3D.setLegendItemLabelGenerator(legendItemLabelGenerator);
        
        StandardCategorySeriesLabelGenerator actual = ((StandardCategorySeriesLabelGenerator) stackedBarRenderer3D.getLegendItemLabelGenerator());
        
        // org.jfree.chart.labels.StandardCategorySeriesLabelGenerator has overridden equals method
        assertEquals(legendItemLabelGenerator, actual);
    }
    ///endregion
    
    ///region Errors report for getLegendItemLabelGenerator
    
    public void testGetLegendItemLabelGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemToolTipGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendItemToolTipGenerator()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItemToolTipGenerator()}
 * @utbot.returnsFrom {@code return this.legendItemToolTipGenerator;}
 *  */
    @Test
    public void testGetLegendItemToolTipGenerator_ReturnThisLegendItemToolTipGenerator() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        StandardCategorySeriesLabelGenerator legendItemToolTipGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        stackedBarRenderer3D.setLegendItemToolTipGenerator(legendItemToolTipGenerator);
        
        StandardCategorySeriesLabelGenerator actual = ((StandardCategorySeriesLabelGenerator) stackedBarRenderer3D.getLegendItemToolTipGenerator());
        
        // org.jfree.chart.labels.StandardCategorySeriesLabelGenerator has overridden equals method
        assertEquals(legendItemToolTipGenerator, actual);
    }
    ///endregion
    
    ///region Errors report for getLegendItemToolTipGenerator
    
    public void testGetLegendItemToolTipGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 *  */
    @Test
    public void testSetLegendItemURLGenerator_AbstractCategoryItemRendererFireChangeEvent() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            StandardCategorySeriesLabelGenerator legendItemURLGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            barRenderer3D.setLegendItemURLGenerator(legendItemURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            barRenderer3D.setLegendItemURLGenerator(null);
            
            CategorySeriesLabelGenerator finalBarRenderer3DLegendItemURLGenerator = ((CategorySeriesLabelGenerator) getFieldValue(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "legendItemURLGenerator"));
            
            assertNull(finalBarRenderer3DLegendItemURLGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fireChangeEvent();
 *  */
    @Test
    public void testSetLegendItemURLGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            StandardCategorySeriesLabelGenerator legendItemURLGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            waterfallBarRenderer.setLegendItemURLGenerator(legendItemURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemURLGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            waterfallBarRenderer.setLegendItemURLGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.AbstractRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#fireChangeEvent()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: fireChangeEvent();
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetLegendItemURLGenerator_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            StandardCategorySeriesLabelGenerator legendItemURLGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
            waterfallBarRenderer.setLegendItemURLGenerator(legendItemURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            PiePlot parent = ((PiePlot) createInstance("org.jfree.chart.plot.PiePlot"));
            categoryPlot.setParent(parent);
            listenerList1[1] = ((Object) categoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            waterfallBarRenderer.setLegendItemURLGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setLegendItemURLGenerator
    
    public void testSetLegendItemURLGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createHotSpotBounds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createHotSpotBounds(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#createHotSpotBounds(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D)}
 * @utbot.executesCondition {@code (result == null): False}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getColumnKey(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comparable key = dataset.getColumnKey(column);
 *  */
    @Test
    public void testCreateHotSpotBounds_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        java.awt.geom.Rectangle2D.Double double1 = new java.awt.geom.Rectangle2D.Double();
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createHotSpotBounds] produces [java.lang.NullPointerException] */
        stackedBarRenderer3D.createHotSpotBounds(null, null, null, null, null, null, -252, -255, false, null, double1);
    }
    ///endregion
    
    ///region Errors report for createHotSpotBounds
    
    public void testCreateHotSpotBounds_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): False}
 *  */
    @Test
    public void testSetBaseURLGenerator_NotNotify() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CustomCategoryURLGenerator baseURLGenerator = ((CustomCategoryURLGenerator) createInstance("org.jfree.chart.urls.CustomCategoryURLGenerator"));
        stackedBarRenderer3D.setBaseURLGenerator(baseURLGenerator);
        
        stackedBarRenderer3D.setBaseURLGenerator(null, false);
        
        CategoryURLGenerator finalStackedBarRenderer3DBaseURLGenerator = ((CategoryURLGenerator) getFieldValue(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseURLGenerator"));
        
        assertNull(finalStackedBarRenderer3DBaseURLGenerator);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetBaseURLGenerator_Notify() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            CustomCategoryURLGenerator baseURLGenerator = ((CustomCategoryURLGenerator) createInstance("org.jfree.chart.urls.CustomCategoryURLGenerator"));
            waterfallBarRenderer.setBaseURLGenerator(baseURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            waterfallBarRenderer.setBaseURLGenerator(null, true);
            
            CategoryURLGenerator finalWaterfallBarRendererBaseURLGenerator = ((CategoryURLGenerator) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseURLGenerator"));
            
            assertNull(finalWaterfallBarRendererBaseURLGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetBaseURLGenerator_Notify_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            CustomCategoryURLGenerator baseURLGenerator = ((CustomCategoryURLGenerator) createInstance("org.jfree.chart.urls.CustomCategoryURLGenerator"));
            stackedBarRenderer3D.setBaseURLGenerator(baseURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            stackedBarRenderer3D.setBaseURLGenerator(null, true);
            
            CategoryURLGenerator finalStackedBarRenderer3DBaseURLGenerator = ((CategoryURLGenerator) getFieldValue(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseURLGenerator"));
            
            assertNull(finalStackedBarRenderer3DBaseURLGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetBaseURLGenerator_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
            waterfallBarRenderer.setBaseURLGenerator(baseURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            waterfallBarRenderer.setBaseURLGenerator(null, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.executesCondition {@code (notify): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link javax.swing.event.EventListenerList#getListenerList()}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetBaseURLGenerator_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
            stackedBarRenderer3D.setBaseURLGenerator(baseURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            FastScatterPlot parent = ((FastScatterPlot) createInstance("org.jfree.chart.plot.FastScatterPlot"));
            combinedDomainCategoryPlot.setParent(parent);
            listenerList1[1] = ((Object) combinedDomainCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            stackedBarRenderer3D.setBaseURLGenerator(null, true);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setBaseURLGenerator
    
    public void testSetBaseURLGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)}
 *  */
    @Test
    public void testSetBaseURLGenerator() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            CustomCategoryURLGenerator baseURLGenerator = ((CustomCategoryURLGenerator) createInstance("org.jfree.chart.urls.CustomCategoryURLGenerator"));
            stackedBarRenderer3D.setBaseURLGenerator(baseURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            stackedBarRenderer3D.setBaseURLGenerator(null);
            
            CategoryURLGenerator finalStackedBarRenderer3DBaseURLGenerator = ((CategoryURLGenerator) getFieldValue(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseURLGenerator"));
            
            assertNull(finalStackedBarRenderer3DBaseURLGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)}
 *  */
    @Test
    public void testSetBaseURLGenerator_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            CustomCategoryURLGenerator baseURLGenerator = ((CustomCategoryURLGenerator) createInstance("org.jfree.chart.urls.CustomCategoryURLGenerator"));
            stackedBarRenderer3D.setBaseURLGenerator(baseURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            stackedBarRenderer3D.setBaseURLGenerator(null);
            
            CategoryURLGenerator finalStackedBarRenderer3DBaseURLGenerator = ((CategoryURLGenerator) getFieldValue(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "baseURLGenerator"));
            
            assertNull(finalStackedBarRenderer3DBaseURLGenerator);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setBaseURLGenerator(generator, true);
 *  */
    @Test
    public void testSetBaseURLGenerator_ThrowClassCastException1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
            CustomCategoryURLGenerator baseURLGenerator = ((CustomCategoryURLGenerator) createInstance("org.jfree.chart.urls.CustomCategoryURLGenerator"));
            stackedBarRenderer3D.setBaseURLGenerator(baseURLGenerator);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            stackedBarRenderer3D.setBaseURLGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#notifyListeners(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator,boolean)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: setBaseURLGenerator(generator, true);
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetBaseURLGenerator_ThrowRuntimeException1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            FastScatterPlot parent = ((FastScatterPlot) createInstance("org.jfree.chart.plot.FastScatterPlot"));
            combinedRangeCategoryPlot.setParent(parent);
            listenerList1[1] = ((Object) combinedRangeCategoryPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            waterfallBarRenderer.setBaseURLGenerator(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setBaseURLGenerator
    
    public void testSetBaseURLGenerator_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendItemURLGenerator()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItemURLGenerator()}
 * @utbot.returnsFrom {@code return this.legendItemURLGenerator;}
 *  */
    @Test
    public void testGetLegendItemURLGenerator_ReturnThisLegendItemURLGenerator() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        StandardCategorySeriesLabelGenerator legendItemURLGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        stackedBarRenderer3D.setLegendItemURLGenerator(legendItemURLGenerator);
        
        StandardCategorySeriesLabelGenerator actual = ((StandardCategorySeriesLabelGenerator) stackedBarRenderer3D.getLegendItemURLGenerator());
        
        // org.jfree.chart.labels.StandardCategorySeriesLabelGenerator has overridden equals method
        assertEquals(legendItemURLGenerator, actual);
    }
    ///endregion
    
    ///region Errors report for getLegendItemURLGenerator
    
    public void testGetLegendItemURLGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hitTest
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hitTest(double, double, java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#hitTest(double,double,java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHitTest_ReturnFalse_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CategoryItemRendererState categoryItemRendererState = new CategoryItemRendererState(null);
        
        boolean actual = waterfallBarRenderer.hitTest(java.lang.Double.NaN, java.lang.Double.NaN, null, null, null, null, null, null, -1, -255, false, categoryItemRendererState);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#hitTest(double,double,java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHitTest_ReturnFalse() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CategoryItemRendererState categoryItemRendererState = new CategoryItemRendererState(null);
        int[] intArray = {};
        categoryItemRendererState.setVisibleSeriesArray(intArray);
        
        boolean actual = waterfallBarRenderer.hitTest(java.lang.Double.NaN, java.lang.Double.NaN, null, null, null, null, null, null, -255, -255, false, categoryItemRendererState);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#hitTest(double,double,java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHitTest_ReturnFalse_5() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CategoryItemRendererState categoryItemRendererState = new CategoryItemRendererState(null);
        int[] intArray = {-2};
        categoryItemRendererState.setVisibleSeriesArray(intArray);
        
        boolean actual = waterfallBarRenderer.hitTest(java.lang.Double.NaN, java.lang.Double.NaN, null, null, null, null, null, null, -255, -255, false, categoryItemRendererState);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#hitTest(double,double,java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHitTest_ReturnFalse_3() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        CategoryItemRendererState categoryItemRendererState = new CategoryItemRendererState(null);
        int[] intArray = {0};
        categoryItemRendererState.setVisibleSeriesArray(intArray);
        
        boolean actual = stackedBarRenderer3D.hitTest(java.lang.Double.NaN, java.lang.Double.NaN, null, null, null, null, null, null, 0, -255, false, categoryItemRendererState);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#hitTest(double,double,java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHitTest_ReturnFalse_4() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        CategoryItemRendererState categoryItemRendererState = new CategoryItemRendererState(null);
        int[] intArray = {-1};
        categoryItemRendererState.setVisibleSeriesArray(intArray);
        
        boolean actual = stackedBarRenderer3D.hitTest(java.lang.Double.NaN, java.lang.Double.NaN, null, null, null, null, null, null, -1, -255, false, categoryItemRendererState);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#hitTest(double,double,java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHitTest_ReturnFalse_2() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Boolean boolean1 = false;
        objects[0] = ((Object) boolean1);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        CategoryItemRendererState categoryItemRendererState = new CategoryItemRendererState(null);
        int[] intArray = {0};
        categoryItemRendererState.setVisibleSeriesArray(intArray);
        
        boolean actual = waterfallBarRenderer.hitTest(java.lang.Double.NaN, java.lang.Double.NaN, null, null, null, null, null, null, 0, -255, false, categoryItemRendererState);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hitTest(double, double, java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#hitTest(double,double,java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#createHotSpotBounds(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testHitTest_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {};
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        CategoryItemRendererState categoryItemRendererState = new CategoryItemRendererState(null);
        int[] intArray = {0};
        categoryItemRendererState.setVisibleSeriesArray(intArray);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hitTest] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.BooleanList.getBoolean(BooleanList.java:71)
            org.jfree.chart.renderer.AbstractRenderer.isSeriesVisible(AbstractRenderer.java:511)
            org.jfree.chart.renderer.AbstractRenderer.getItemVisible(AbstractRenderer.java:498)
            org.jfree.chart.renderer.category.BarRenderer.createHotSpotBounds(BarRenderer.java:1384)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hitTest(AbstractCategoryItemRenderer.java:1983) */
        waterfallBarRenderer.hitTest(java.lang.Double.NaN, java.lang.Double.NaN, null, null, null, null, null, null, 0, -255, false, categoryItemRendererState);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddEntity_Return() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        
        stackedBarRenderer3D.addEntity(null, null, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddEntity_Return_1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        
        stackedBarRenderer3D.addEntity(null, null, null, -1, -255, false, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddEntity_Return_2() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Boolean boolean1 = false;
        objects[0] = ((Object) boolean1);
        setField(createEntitiesList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(createEntitiesList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        
        barRenderer3D.addEntity(null, null, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAddEntity_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {};
        setField(createEntitiesList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(createEntitiesList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.BooleanList.getBoolean(BooleanList.java:71)
            org.jfree.chart.renderer.AbstractRenderer.getSeriesCreateEntities(AbstractRenderer.java:2389)
            org.jfree.chart.renderer.AbstractRenderer.getItemCreateEntity(AbstractRenderer.java:2369)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(AbstractCategoryItemRenderer.java:1865) */
        stackedBarRenderer3D.addEntity(null, null, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testAddEntity_ThrowClassCastException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(createEntitiesList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(createEntitiesList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Boolean (java.lang.Object and java.lang.Boolean are in module java.base of loader 'bootstrap')]
            org.jfree.chart.util.BooleanList.getBoolean(BooleanList.java:71)
            org.jfree.chart.renderer.AbstractRenderer.getSeriesCreateEntities(AbstractRenderer.java:2389)
            org.jfree.chart.renderer.AbstractRenderer.getItemCreateEntity(AbstractRenderer.java:2369)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(AbstractCategoryItemRenderer.java:1865) */
        waterfallBarRenderer.addEntity(null, null, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double)}
 * @utbot.executesCondition {@code (hotspot == null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getToolTipGenerator(int,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAddEntity_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        stackedBarRenderer3D.setBaseCreateEntities(true);
        Rectangle rectangle = new Rectangle();
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator(AbstractCategoryItemRenderer.java:453)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getToolTipGenerator(AbstractCategoryItemRenderer.java:435)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(AbstractCategoryItemRenderer.java:1880) */
        stackedBarRenderer3D.addEntity(null, rectangle, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double)}
 * @utbot.executesCondition {@code (hotspot == null): True}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getDefaultEntityRadius()}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getPlot()}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getOrientation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: getPlot().getOrientation() == PlotOrientation.VERTICAL
 *  */
    @Test
    public void testAddEntity_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        stackedBarRenderer3D.setBaseCreateEntities(true);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(AbstractCategoryItemRenderer.java:1872) */
        stackedBarRenderer3D.addEntity(null, null, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double)}
 * @utbot.executesCondition {@code (hotspot == null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getItemCreateEntity(int,int,boolean)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getToolTipGenerator(int,int,boolean)}
 * @utbot.invokes {@link org.jfree.chart.labels.CategoryToolTipGenerator#generateToolTip(org.jfree.data.category.CategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: tip = generator.generateToolTip(dataset, row, column);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddEntity_ThrowIllegalArgumentException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        IntervalCategoryToolTipGenerator intervalCategoryToolTipGenerator = ((IntervalCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryToolTipGenerator"));
        objects[0] = ((Object) intervalCategoryToolTipGenerator);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(toolTipGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        waterfallBarRenderer.setBaseCreateEntities(true);
        Rectangle rectangle = new Rectangle();
        
        waterfallBarRenderer.addEntity(null, rectangle, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region Errors report for addEntity
    
    public void testAddEntity_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean)}
 *  */
    @Test
    public void testAddEntity() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        Rectangle rectangle = new Rectangle();
        
        stackedBarRenderer3D.addEntity(null, rectangle, null, -1, -255, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean)}
 *  */
    @Test
    public void testAddEntity_1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        Rectangle rectangle = new Rectangle();
        
        stackedBarRenderer3D.addEntity(null, rectangle, null, 0, -255, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean)}
 * @utbot.executesCondition {@code (hotspot == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: hotspot == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddEntity_ThrowIllegalArgumentException1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        stackedBarRenderer3D.addEntity(null, null, null, -255, -255, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean)}
 * @utbot.executesCondition {@code (hotspot == null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addEntity(org.jfree.chart.entity.EntityCollection,java.awt.Shape,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addEntity(entities, hotspot, dataset, row, column, selected, 0.0, 0.0);
 *  */
    @Test
    public void testAddEntity_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        BooleanList createEntitiesList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {};
        setField(createEntitiesList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(createEntitiesList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "createEntitiesList", createEntitiesList);
        Rectangle rectangle = new Rectangle();
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.BooleanList.getBoolean(BooleanList.java:71)
            org.jfree.chart.renderer.AbstractRenderer.getSeriesCreateEntities(AbstractRenderer.java:2389)
            org.jfree.chart.renderer.AbstractRenderer.getItemCreateEntity(AbstractRenderer.java:2369)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(AbstractCategoryItemRenderer.java:1865)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(AbstractCategoryItemRenderer.java:1842) */
        stackedBarRenderer3D.addEntity(null, rectangle, null, 0, -255, false);
    }
    ///endregion
    
    ///region Errors report for addEntity
    
    public void testAddEntity_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createHotSpotShape
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createHotSpotShape(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#createHotSpotShape(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,boolean,org.jfree.chart.renderer.category.CategoryItemRendererState)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: throw new RuntimeException("Not implemented.");
 *  */
    @Test(expected = RuntimeException.class)
    public void testCreateHotSpotShape_ThrowRuntimeException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        stackedBarRenderer3D.createHotSpotShape(null, null, null, null, null, null, -255, -255, false, null);
    }
    ///endregion
    
    ///region Errors report for createHotSpotShape
    
    public void testCreateHotSpotShape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateRangeMarkerTextAnchorPoint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor)}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): True}
 * @utbot.invokes {@link org.jfree.chart.util.RectangleInsets#createAdjustedRectangle(java.awt.geom.Rectangle2D,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.LengthAdjustmentType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: anchorRect = markerOffset.createAdjustedRectangle(markerArea, labelOffsetType, LengthAdjustmentType.CONTRACT);
 *  */
    @Test
    public void testCalculateRangeMarkerTextAnchorPoint_ThrowNullPointerException() throws Exception  {
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        LengthAdjustmentType prevCONTRACT = LengthAdjustmentType.CONTRACT;
        try {
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            LengthAdjustmentType contract = ((LengthAdjustmentType) createInstance("org.jfree.chart.util.LengthAdjustmentType"));
            String name = "CONTRACT";
            setField(contract, "org.jfree.chart.util.LengthAdjustmentType", "name", name);
            Class lengthAdjustmentTypeClazz = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
            setStaticField(lengthAdjustmentTypeClazz, "CONTRACT", contract);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateRangeMarkerTextAnchorPoint] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateRangeMarkerTextAnchorPoint(AbstractCategoryItemRenderer.java:1394) */
            barRenderer3D.calculateRangeMarkerTextAnchorPoint(null, horizontal, null, null, null, null, null);
        } finally {
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(LengthAdjustmentType.class, "CONTRACT", prevCONTRACT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor)}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): False}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.VERTICAL): True}
 * @utbot.invokes {@link org.jfree.chart.util.RectangleInsets#createAdjustedRectangle(java.awt.geom.Rectangle2D,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.LengthAdjustmentType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: anchorRect = markerOffset.createAdjustedRectangle(markerArea, LengthAdjustmentType.CONTRACT, labelOffsetType);
 *  */
    @Test
    public void testCalculateRangeMarkerTextAnchorPoint_ThrowNullPointerException_1() throws Exception  {
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        LengthAdjustmentType prevCONTRACT = LengthAdjustmentType.CONTRACT;
        try {
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            LengthAdjustmentType contract = ((LengthAdjustmentType) createInstance("org.jfree.chart.util.LengthAdjustmentType"));
            String name1 = "CONTRACT";
            setField(contract, "org.jfree.chart.util.LengthAdjustmentType", "name", name1);
            Class lengthAdjustmentTypeClazz = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
            setStaticField(lengthAdjustmentTypeClazz, "CONTRACT", contract);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateRangeMarkerTextAnchorPoint] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateRangeMarkerTextAnchorPoint(AbstractCategoryItemRenderer.java:1398) */
            barRenderer3D.calculateRangeMarkerTextAnchorPoint(null, vertical, null, null, null, null, null);
        } finally {
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(LengthAdjustmentType.class, "CONTRACT", prevCONTRACT);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor)}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): True}
 * @utbot.invokes {@link org.jfree.chart.util.RectangleInsets#createAdjustedRectangle(java.awt.geom.Rectangle2D,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.LengthAdjustmentType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: anchorRect = markerOffset.createAdjustedRectangle(markerArea, labelOffsetType, LengthAdjustmentType.CONTRACT);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateRangeMarkerTextAnchorPoint_ThrowIllegalArgumentException() throws Exception  {
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        LengthAdjustmentType prevCONTRACT = LengthAdjustmentType.CONTRACT;
        try {
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            LengthAdjustmentType contract = ((LengthAdjustmentType) createInstance("org.jfree.chart.util.LengthAdjustmentType"));
            String name = "CONTRACT";
            setField(contract, "org.jfree.chart.util.LengthAdjustmentType", "name", name);
            Class lengthAdjustmentTypeClazz = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
            setStaticField(lengthAdjustmentTypeClazz, "CONTRACT", contract);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            barRenderer3D.calculateRangeMarkerTextAnchorPoint(null, horizontal, null, null, rectangleInsets, null, null);
        } finally {
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(LengthAdjustmentType.class, "CONTRACT", prevCONTRACT);
        }
    }
    ///endregion
    
    ///region Errors report for calculateRangeMarkerTextAnchorPoint
    
    public void testCalculateRangeMarkerTextAnchorPoint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateDomainMarkerTextAnchorPoint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor)}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): True}
 * @utbot.invokes {@link org.jfree.chart.util.RectangleInsets#createAdjustedRectangle(java.awt.geom.Rectangle2D,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.LengthAdjustmentType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: anchorRect = markerOffset.createAdjustedRectangle(markerArea, LengthAdjustmentType.CONTRACT, labelOffsetType);
 *  */
    @Test
    public void testCalculateDomainMarkerTextAnchorPoint_ThrowNullPointerException() throws Exception  {
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        LengthAdjustmentType prevCONTRACT = LengthAdjustmentType.CONTRACT;
        try {
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            LengthAdjustmentType contract = ((LengthAdjustmentType) createInstance("org.jfree.chart.util.LengthAdjustmentType"));
            String name = "CONTRACT";
            setField(contract, "org.jfree.chart.util.LengthAdjustmentType", "name", name);
            Class lengthAdjustmentTypeClazz = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
            setStaticField(lengthAdjustmentTypeClazz, "CONTRACT", contract);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateDomainMarkerTextAnchorPoint] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateDomainMarkerTextAnchorPoint(AbstractCategoryItemRenderer.java:1360) */
            barRenderer3D.calculateDomainMarkerTextAnchorPoint(null, horizontal, null, null, null, null, null);
        } finally {
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(LengthAdjustmentType.class, "CONTRACT", prevCONTRACT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor)}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): False}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.VERTICAL): True}
 * @utbot.invokes {@link org.jfree.chart.util.RectangleInsets#createAdjustedRectangle(java.awt.geom.Rectangle2D,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.LengthAdjustmentType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: anchorRect = markerOffset.createAdjustedRectangle(markerArea, labelOffsetType, LengthAdjustmentType.CONTRACT);
 *  */
    @Test
    public void testCalculateDomainMarkerTextAnchorPoint_ThrowNullPointerException_1() throws Exception  {
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        LengthAdjustmentType prevCONTRACT = LengthAdjustmentType.CONTRACT;
        try {
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            LengthAdjustmentType contract = ((LengthAdjustmentType) createInstance("org.jfree.chart.util.LengthAdjustmentType"));
            String name1 = "CONTRACT";
            setField(contract, "org.jfree.chart.util.LengthAdjustmentType", "name", name1);
            Class lengthAdjustmentTypeClazz = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
            setStaticField(lengthAdjustmentTypeClazz, "CONTRACT", contract);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateDomainMarkerTextAnchorPoint] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateDomainMarkerTextAnchorPoint(AbstractCategoryItemRenderer.java:1364) */
            barRenderer3D.calculateDomainMarkerTextAnchorPoint(null, vertical, null, null, null, null, null);
        } finally {
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(LengthAdjustmentType.class, "CONTRACT", prevCONTRACT);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor)}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): True}
 * @utbot.invokes {@link org.jfree.chart.util.RectangleInsets#createAdjustedRectangle(java.awt.geom.Rectangle2D,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.LengthAdjustmentType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: anchorRect = markerOffset.createAdjustedRectangle(markerArea, LengthAdjustmentType.CONTRACT, labelOffsetType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDomainMarkerTextAnchorPoint_ThrowIllegalArgumentException() throws Exception  {
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        LengthAdjustmentType prevCONTRACT = LengthAdjustmentType.CONTRACT;
        try {
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            LengthAdjustmentType contract = ((LengthAdjustmentType) createInstance("org.jfree.chart.util.LengthAdjustmentType"));
            String name = "CONTRACT";
            setField(contract, "org.jfree.chart.util.LengthAdjustmentType", "name", name);
            Class lengthAdjustmentTypeClazz = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
            setStaticField(lengthAdjustmentTypeClazz, "CONTRACT", contract);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            barRenderer3D.calculateDomainMarkerTextAnchorPoint(null, horizontal, null, null, rectangleInsets, null, null);
        } finally {
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(LengthAdjustmentType.class, "CONTRACT", prevCONTRACT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleInsets,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.RectangleAnchor)}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): False}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.VERTICAL): True}
 * @utbot.invokes {@link org.jfree.chart.util.RectangleInsets#createAdjustedRectangle(java.awt.geom.Rectangle2D,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.LengthAdjustmentType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: anchorRect = markerOffset.createAdjustedRectangle(markerArea, labelOffsetType, LengthAdjustmentType.CONTRACT);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDomainMarkerTextAnchorPoint_ThrowIllegalArgumentException_1() throws Exception  {
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        LengthAdjustmentType prevCONTRACT = LengthAdjustmentType.CONTRACT;
        try {
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            LengthAdjustmentType contract = ((LengthAdjustmentType) createInstance("org.jfree.chart.util.LengthAdjustmentType"));
            String name1 = "CONTRACT";
            setField(contract, "org.jfree.chart.util.LengthAdjustmentType", "name", name1);
            Class lengthAdjustmentTypeClazz = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
            setStaticField(lengthAdjustmentTypeClazz, "CONTRACT", contract);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            barRenderer3D.calculateDomainMarkerTextAnchorPoint(null, vertical, null, null, rectangleInsets, null, null);
        } finally {
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(LengthAdjustmentType.class, "CONTRACT", prevCONTRACT);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)
    
    @Test
    public void testCalculateDomainMarkerTextAnchorPoint1() throws Exception  {
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name = "PlotOrientation.VERTICAL";
            setField(vertical, "org.jfree.chart.plot.PlotOrientation", "name", name);
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name1 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name1);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            
            java.awt.geom.Point2D.Double actual = ((java.awt.geom.Point2D.Double) minMaxCategoryRenderer.calculateDomainMarkerTextAnchorPoint(null, null, null, null, null, null, null));
            
            java.awt.geom.Point2D.Double expected = new java.awt.geom.Point2D.Double();
            
        } finally {
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    
    @Test
    public void testCalculateDomainMarkerTextAnchorPoint2() throws Exception  {
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        LengthAdjustmentType prevCONTRACT = LengthAdjustmentType.CONTRACT;
        try {
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            LengthAdjustmentType contract = ((LengthAdjustmentType) createInstance("org.jfree.chart.util.LengthAdjustmentType"));
            String name1 = "CONTRACT";
            setField(contract, "org.jfree.chart.util.LengthAdjustmentType", "name", name1);
            Class lengthAdjustmentTypeClazz = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
            setStaticField(lengthAdjustmentTypeClazz, "CONTRACT", contract);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            java.awt.geom.Rectangle2D.Double double1 = new java.awt.geom.Rectangle2D.Double();
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            
            java.awt.geom.Point2D.Double actual = ((java.awt.geom.Point2D.Double) minMaxCategoryRenderer.calculateDomainMarkerTextAnchorPoint(null, vertical, null, double1, rectangleInsets, null, null));
            
            java.awt.geom.Point2D.Double expected = new java.awt.geom.Point2D.Double();
            
        } finally {
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(LengthAdjustmentType.class, "CONTRACT", prevCONTRACT);
        }
    }
    
    @Test
    public void testCalculateDomainMarkerTextAnchorPoint3() throws Exception  {
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        LengthAdjustmentType prevCONTRACT = LengthAdjustmentType.CONTRACT;
        LengthAdjustmentType prevEXPAND = LengthAdjustmentType.EXPAND;
        try {
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            LengthAdjustmentType contract = ((LengthAdjustmentType) createInstance("org.jfree.chart.util.LengthAdjustmentType"));
            String name = "CONTRACT";
            setField(contract, "org.jfree.chart.util.LengthAdjustmentType", "name", name);
            Class lengthAdjustmentTypeClazz = Class.forName("org.jfree.chart.util.LengthAdjustmentType");
            setStaticField(lengthAdjustmentTypeClazz, "CONTRACT", contract);
            LengthAdjustmentType expand = ((LengthAdjustmentType) createInstance("org.jfree.chart.util.LengthAdjustmentType"));
            String name1 = "EXPAND";
            setField(expand, "org.jfree.chart.util.LengthAdjustmentType", "name", name1);
            setStaticField(lengthAdjustmentTypeClazz, "EXPAND", expand);
            MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
            java.awt.geom.Rectangle2D.Double double1 = new java.awt.geom.Rectangle2D.Double();
            RectangleInsets rectangleInsets = ((RectangleInsets) createInstance("org.jfree.chart.util.RectangleInsets"));
            setField(rectangleInsets, "org.jfree.chart.util.RectangleInsets", "left", java.lang.Double.NaN);
            
            java.awt.geom.Point2D.Double actual = ((java.awt.geom.Point2D.Double) minMaxCategoryRenderer.calculateDomainMarkerTextAnchorPoint(null, horizontal, null, double1, rectangleInsets, null, null));
            
            java.awt.geom.Point2D.Double expected = new java.awt.geom.Point2D.Double();
            
        } finally {
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(LengthAdjustmentType.class, "CONTRACT", prevCONTRACT);
            setStaticField(LengthAdjustmentType.class, "EXPAND", prevEXPAND);
        }
    }
    ///endregion
    
    ///region Errors report for calculateDomainMarkerTextAnchorPoint
    
    public void testCalculateDomainMarkerTextAnchorPoint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.plot.CategoryMarker, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawDomainMarker(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: CategoryDataset dataset = plot.getDataset(plot.getIndexOf(this));
 *  */
    @Test
    public void testDrawDomainMarker_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList renderers = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(renderers, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "renderers", renderers);
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.indexOf(AbstractObjectList.java:162)
            org.jfree.chart.util.ObjectList.indexOf(ObjectList.java:107)
            org.jfree.chart.plot.CategoryPlot.getIndexOf(CategoryPlot.java:1727)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker(AbstractCategoryItemRenderer.java:1101) */
        barRenderer3D.drawDomainMarker(null, combinedRangeCategoryPlot, null, categoryMarker, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawDomainMarker(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryMarker#getKey()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comparable category = marker.getKey();
 *  */
    @Test
    public void testDrawDomainMarker_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker(AbstractCategoryItemRenderer.java:1100) */
        stackedBarRenderer3D.drawDomainMarker(null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawDomainMarker(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.plot.CategoryMarker,java.awt.geom.Rectangle2D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CategoryDataset dataset = plot.getDataset(plot.getIndexOf(this));
 *  */
    @Test
    public void testDrawDomainMarker_ThrowNullPointerException_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CategoryMarker categoryMarker = ((CategoryMarker) createInstance("org.jfree.chart.plot.CategoryMarker"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker(AbstractCategoryItemRenderer.java:1101) */
        waterfallBarRenderer.drawDomainMarker(null, null, null, categoryMarker, null);
    }
    ///endregion
    
    ///region Errors report for drawDomainMarker
    
    public void testDrawDomainMarker_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemMiddle
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getItemMiddle(java.lang.Comparable, java.lang.Comparable, org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getItemMiddle(java.lang.Comparable,java.lang.Comparable,org.jfree.data.category.CategoryDataset,org.jfree.chart.axis.CategoryAxis,java.awt.geom.Rectangle2D,org.jfree.chart.util.RectangleEdge)}
 * @utbot.invokes {@link org.jfree.data.category.CategoryDataset#getColumnKeys()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return axis.getCategoryMiddle(columnKey, dataset.getColumnKeys(), area, edge);
 *  */
    @Test
    public void testGetItemMiddle_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemMiddle] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemMiddle(AbstractCategoryItemRenderer.java:955) */
        stackedBarRenderer3D.getItemMiddle(null, null, null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getItemMiddle(java.lang.Comparable, java.lang.Comparable, org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)
    
    @Test
    public void testGetItemMiddle1() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList columnKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "columnKeys", columnKeys);
        setField(defaultCategoryDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemMiddle] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemMiddle(AbstractCategoryItemRenderer.java:955) */
        minMaxCategoryRenderer.getItemMiddle(null, null, defaultCategoryDataset, null, null, null);
    }
    ///endregion
    
    ///region Errors report for getItemMiddle
    
    public void testGetItemMiddle_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawBackground
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawBackground(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#drawBackground(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 *  */
    @Test
    public void testDrawBackground_CategoryPlotDrawBackground() throws Exception  {
        GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        categoryPlot.setOrientation(orientation);
        
        groupedStackedBarRenderer.drawBackground(null, categoryPlot, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawBackground(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#drawBackground(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: plot.drawBackground(g2, dataArea);
 *  */
    @Test
    public void testDrawBackground_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawBackground] produces [java.lang.NullPointerException] */
        stackedBarRenderer3D.drawBackground(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawBackground(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#drawBackground(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: plot.drawBackground(g2, dataArea);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawBackground_ThrowIllegalArgumentException() throws Exception  {
        GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        groupedStackedBarRenderer.drawBackground(null, categoryPlot, null);
    }
    ///endregion
    
    ///region Errors report for drawBackground
    
    public void testDrawBackground_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainLine
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawDomainLine(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke)}
 * @utbot.executesCondition {@code (paint == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: paint == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawDomainLine_ThrowIllegalArgumentException() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        
        barRenderer3D.drawDomainLine(null, null, null, java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///region Errors report for drawDomainLine
    
    public void testDrawDomainLine_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.Clear accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field public static final sun.java2d.loops.CompositeType sun.java2d.loops.CompositeType.SrcOverNoEa accessible:
        module java.desktop does not "exports sun.java2d.loops" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeLine
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawRangeLine(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,java.awt.geom.Rectangle2D,double,java.awt.Paint,java.awt.Stroke)}
 * @utbot.invokes {@link org.jfree.chart.axis.ValueAxis#getRange()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Range range = axis.getRange();
 *  */
    @Test
    public void testDrawRangeLine_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeLine] produces [java.lang.NullPointerException] */
        stackedBarRenderer3D.drawRangeLine(null, null, null, null, java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)
    
    @Test
    public void testDrawRangeLine1() throws Exception  {
        CategoryStepRenderer categoryStepRenderer = ((CategoryStepRenderer) createInstance("org.jfree.chart.renderer.category.CategoryStepRenderer"));
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        Year first = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(first, "org.jfree.data.time.Year", "year", (short) 0);
        periodAxis.setFirst(first);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(periodAxis, "org.jfree.chart.axis.PeriodAxis", "calendar", calendar);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeLine] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalSet(Calendar.java:1880)
            java.base/java.util.Calendar.set(Calendar.java:1904)
            java.base/java.util.Calendar.set(Calendar.java:1982)
            org.jfree.data.time.Year.getFirstMillisecond(Year.java:268)
            org.jfree.chart.axis.PeriodAxis.getRange(PeriodAxis.java:543)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeLine(AbstractCategoryItemRenderer.java:1059) */
        categoryStepRenderer.drawRangeLine(null, null, periodAxis, null, java.lang.Double.NaN, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawOutline
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawOutline(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D)}
 *  */
    @Test
    public void testDrawOutline_1() throws Exception  {
        GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        groupedStackedBarRenderer.drawOutline(null, categoryPlot, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawOutline(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D)}
 *  */
    @Test
    public void testDrawOutline() throws Exception  {
        GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        categoryPlot.setOutlineVisible(true);
        
        groupedStackedBarRenderer.drawOutline(null, categoryPlot, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawOutline(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#drawOutline(java.awt.Graphics2D,java.awt.geom.Rectangle2D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: plot.drawOutline(g2, dataArea);
 *  */
    @Test
    public void testDrawOutline_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawOutline] produces [java.lang.NullPointerException] */
        stackedBarRenderer3D.drawOutline(null, null, null);
    }
    ///endregion
    
    ///region Errors report for drawOutline
    
    public void testDrawOutline_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field protected static final java.awt.Stroke sun.java2d.SunGraphics2D.defaultStroke accessible:
        module java.desktop does not "opens sun.java2d" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field public static final double sun.java2d.SunGraphics2D.MinPenSizeAA accessible:
        module java.desktop does not "exports sun.java2d" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawRangeMarker(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D)}
 * @utbot.executesCondition {@code (marker instanceof ValueMarker): True}
 * @utbot.invokes {@link org.jfree.chart.plot.ValueMarker#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Range range = axis.getRange();
 *  */
    @Test
    public void testDrawRangeMarker_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        valueMarker.setValue(0.0);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker] produces [java.lang.NullPointerException] */
        stackedBarRenderer3D.drawRangeMarker(null, null, null, valueMarker, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawRangeMarker(java.awt.Graphics2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.ValueAxis,org.jfree.chart.plot.Marker,java.awt.geom.Rectangle2D)}
 * @utbot.executesCondition {@code (marker instanceof ValueMarker): False}
 * @utbot.executesCondition {@code (marker instanceof IntervalMarker): True}
 * @utbot.invokes {@link org.jfree.chart.plot.IntervalMarker#getStartValue()}
 * @utbot.invokes {@link org.jfree.chart.plot.IntervalMarker#getEndValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Range range = axis.getRange();
 *  */
    @Test
    public void testDrawRangeMarker_ThrowNullPointerException_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        intervalMarker.setStartValue(0.0);
        intervalMarker.setEndValue(0.0);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker(AbstractCategoryItemRenderer.java:1236) */
        waterfallBarRenderer.drawRangeMarker(null, null, null, intervalMarker, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)
    
    @Test
    public void testDrawRangeMarker1() throws Exception  {
        StackedAreaRenderer stackedAreaRenderer = ((StackedAreaRenderer) createInstance("org.jfree.chart.renderer.category.StackedAreaRenderer"));
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        Year first = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(first, "org.jfree.data.time.Year", "year", (short) 0);
        periodAxis.setFirst(first);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(periodAxis, "org.jfree.chart.axis.PeriodAxis", "calendar", calendar);
        ValueMarker valueMarker = ((ValueMarker) createInstance("org.jfree.chart.plot.ValueMarker"));
        valueMarker.setValue(0.0);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalSet(Calendar.java:1880)
            java.base/java.util.Calendar.set(Calendar.java:1904)
            java.base/java.util.Calendar.set(Calendar.java:1982)
            org.jfree.data.time.Year.getFirstMillisecond(Year.java:268)
            org.jfree.chart.axis.PeriodAxis.getRange(PeriodAxis.java:543)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker(AbstractCategoryItemRenderer.java:1189) */
        stackedAreaRenderer.drawRangeMarker(null, null, periodAxis, valueMarker, null);
    }
    
    @Test
    public void testDrawRangeMarker2() throws Exception  {
        StackedAreaRenderer stackedAreaRenderer = ((StackedAreaRenderer) createInstance("org.jfree.chart.renderer.category.StackedAreaRenderer"));
        PeriodAxis periodAxis = ((PeriodAxis) createInstance("org.jfree.chart.axis.PeriodAxis"));
        Year first = ((Year) createInstance("org.jfree.data.time.Year"));
        setField(first, "org.jfree.data.time.Year", "year", (short) 0);
        periodAxis.setFirst(first);
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        setField(periodAxis, "org.jfree.chart.axis.PeriodAxis", "calendar", calendar);
        IntervalMarker intervalMarker = ((IntervalMarker) createInstance("org.jfree.chart.plot.IntervalMarker"));
        intervalMarker.setStartValue(0.0);
        intervalMarker.setEndValue(0.0);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker] produces [java.lang.NullPointerException]
            java.base/java.util.Calendar.internalSet(Calendar.java:1880)
            java.base/java.util.Calendar.set(Calendar.java:1904)
            java.base/java.util.Calendar.set(Calendar.java:1982)
            org.jfree.data.time.Year.getFirstMillisecond(Year.java:268)
            org.jfree.chart.axis.PeriodAxis.getRange(PeriodAxis.java:543)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker(AbstractCategoryItemRenderer.java:1236) */
        stackedAreaRenderer.drawRangeMarker(null, null, periodAxis, intervalMarker, null);
    }
    ///endregion
    
    ///region Errors report for drawRangeMarker
    
    public void testDrawRangeMarker_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawAnnotations(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.chart.util.Layer,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.util.Layer#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: layer.equals(Layer.FOREGROUND)
 *  */
    @Test
    public void testDrawAnnotations_ThrowNullPointerException() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations(AbstractCategoryItemRenderer.java:1652) */
            barRenderer3D.drawAnnotations(null, null, null, null, null, null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawAnnotations(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.chart.util.Layer,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iterator = this.foregroundAnnotations.iterator();
 *  */
    @Test
    public void testDrawAnnotations_ThrowNullPointerException_1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations(AbstractCategoryItemRenderer.java:1653) */
            barRenderer3D.drawAnnotations(null, null, null, null, foreground, null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawAnnotations(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.chart.util.Layer,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iterator = this.foregroundAnnotations.iterator();
 *  */
    @Test
    public void testDrawAnnotations_ThrowNullPointerException_2() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
            Layer layer = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            setField(layer, "org.jfree.chart.util.Layer", "name", name);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations(AbstractCategoryItemRenderer.java:1653) */
            barRenderer3D.drawAnnotations(null, null, null, null, layer, null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test
    public void testDrawAnnotations1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            ArrayList foregroundAnnotations = new ArrayList();
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
            ExtendedCategoryAxis extendedCategoryAxis = ((ExtendedCategoryAxis) createInstance("org.jfree.chart.axis.ExtendedCategoryAxis"));
            Layer layer = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            setField(layer, "org.jfree.chart.util.Layer", "name", name);
            
            statisticalBarRenderer.drawAnnotations(null, null, extendedCategoryAxis, null, layer, null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region Errors report for drawAnnotations
    
    public void testDrawAnnotations_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDrawingSupplier
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDrawingSupplier()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getDrawingSupplier()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDrawingSupplier_ReturnResult() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        
        DrawingSupplier actual = waterfallBarRenderer.getDrawingSupplier();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getDrawingSupplier()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDrawingSupplier_ReturnResult_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CategoryPlot plot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        DefaultDrawingSupplier drawingSupplier = ((DefaultDrawingSupplier) createInstance("org.jfree.chart.plot.DefaultDrawingSupplier"));
        plot.setDrawingSupplier(drawingSupplier);
        waterfallBarRenderer.setPlot(plot);
        
        DefaultDrawingSupplier actual = ((DefaultDrawingSupplier) waterfallBarRenderer.getDrawingSupplier());
        
        DefaultDrawingSupplier expected = new DefaultDrawingSupplier(null, null, null, null, null, null);
        
        // org.jfree.chart.plot.DefaultDrawingSupplier has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getDrawingSupplier()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testGetDrawingSupplier_ReturnResult_2() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        DefaultDrawingSupplier drawingSupplier = ((DefaultDrawingSupplier) createInstance("org.jfree.chart.plot.DefaultDrawingSupplier"));
        parent.setDrawingSupplier(drawingSupplier);
        plot.setParent(parent);
        waterfallBarRenderer.setPlot(plot);
        
        DefaultDrawingSupplier actual = ((DefaultDrawingSupplier) waterfallBarRenderer.getDrawingSupplier());
        
        DefaultDrawingSupplier expected = new DefaultDrawingSupplier(null, null, null, null, null, null);
        
        // org.jfree.chart.plot.DefaultDrawingSupplier has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for getDrawingSupplier
    
    public void testGetDrawingSupplier_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawItemLabel(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double,boolean)}
 *  */
    @Test
    public void testDrawItemLabel() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        stackedBarRenderer3D.drawItemLabel(null, null, null, -1, -255, false, java.lang.Double.NaN, java.lang.Double.NaN, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawItemLabel(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double,boolean)}
 *  */
    @Test
    public void testDrawItemLabel_1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        stackedBarRenderer3D.drawItemLabel(null, null, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawItemLabel(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
 *  */
    @Test
    public void testDrawItemLabel_ThrowClassCastException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.labels.CategoryItemLabelGenerator (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.labels.CategoryItemLabelGenerator is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator(AbstractCategoryItemRenderer.java:318)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(AbstractCategoryItemRenderer.java:1610) */
        stackedBarRenderer3D.drawItemLabel(null, null, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawItemLabel(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column, selected);
 *  */
    @Test
    public void testDrawItemLabel_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator(AbstractCategoryItemRenderer.java:318)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(AbstractCategoryItemRenderer.java:1610) */
        stackedBarRenderer3D.drawItemLabel(null, null, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#drawItemLabel(java.awt.Graphics2D,org.jfree.chart.plot.PlotOrientation,org.jfree.data.category.CategoryDataset,int,int,boolean,double,double,boolean)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getItemLabelFont(int,int,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Font labelFont = getItemLabelFont(row, column, selected);
 *  */
    @Test
    public void testDrawItemLabel_ThrowClassCastException_1() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
        objects[0] = ((Object) intervalCategoryItemLabelGenerator);
        objects[1] = ((Object) intervalCategoryItemLabelGenerator);
        objects[3] = ((Object) intervalCategoryItemLabelGenerator);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(barRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        ObjectList itemLabelFontList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects1[0] = object;
        setField(itemLabelFontList, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(itemLabelFontList, "org.jfree.chart.util.AbstractObjectList", "size", 1073741824);
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "itemLabelFontList", itemLabelFontList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.awt.Font (java.lang.Object is in module java.base of loader 'bootstrap'; java.awt.Font is in module java.desktop of loader 'bootstrap')]
            org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelFont(AbstractRenderer.java:1907)
            org.jfree.chart.renderer.AbstractRenderer.getItemLabelFont(AbstractRenderer.java:1890)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(AbstractCategoryItemRenderer.java:1613) */
        barRenderer3D.drawItemLabel(null, null, null, 0, -255, false, java.lang.Double.NaN, java.lang.Double.NaN, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double, boolean)
    
    @Test
    public void testDrawItemLabel1() throws Exception  {
        BarRenderer barRenderer = ((BarRenderer) createInstance("org.jfree.chart.renderer.category.BarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(barRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        barRenderer.setBaseItemLabelGenerator(baseItemLabelGenerator);
        ObjectList itemLabelFontList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        objects[1] = ((Object) barRenderer);
        objects[2] = ((Object) barRenderer);
        objects[3] = ((Object) barRenderer);
        objects[4] = ((Object) barRenderer);
        objects[5] = ((Object) barRenderer);
        objects[6] = ((Object) barRenderer);
        objects[7] = ((Object) barRenderer);
        objects[8] = ((Object) barRenderer);
        setField(itemLabelFontList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelFontList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(barRenderer, "org.jfree.chart.renderer.AbstractRenderer", "itemLabelFontList", itemLabelFontList);
        PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.awt.Font (java.lang.Object is in module java.base of loader 'bootstrap'; java.awt.Font is in module java.desktop of loader 'bootstrap')]
            org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelFont(AbstractRenderer.java:1907)
            org.jfree.chart.renderer.AbstractRenderer.getItemLabelFont(AbstractRenderer.java:1890)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(AbstractCategoryItemRenderer.java:1613) */
        barRenderer.drawItemLabel(null, plotOrientation, null, 0, 0, false, java.lang.Double.NaN, java.lang.Double.NaN, false);
    }
    
    @Test
    public void testDrawItemLabel2() throws Exception  {
        LevelRenderer levelRenderer = ((LevelRenderer) createInstance("org.jfree.chart.renderer.category.LevelRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[25];
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 17);
        setField(levelRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        levelRenderer.setBaseItemLabelGenerator(baseItemLabelGenerator);
        ObjectList itemLabelFontList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = {null, null, null, null, null, null, null, null, null};
        setField(itemLabelFontList, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(itemLabelFontList, "org.jfree.chart.util.AbstractObjectList", "size", 25);
        setField(levelRenderer, "org.jfree.chart.renderer.AbstractRenderer", "itemLabelFontList", itemLabelFontList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 9]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelFont(AbstractRenderer.java:1907)
            org.jfree.chart.renderer.AbstractRenderer.getItemLabelFont(AbstractRenderer.java:1890)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(AbstractCategoryItemRenderer.java:1613) */
        levelRenderer.drawItemLabel(null, null, null, 16, 0, false, java.lang.Double.NaN, java.lang.Double.NaN, false);
    }
    
    @Test
    public void testDrawItemLabel3() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        stackedBarRenderer3D.setBaseItemLabelGenerator(baseItemLabelGenerator);
        ObjectList itemLabelFontList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "itemLabelFontList", itemLabelFontList);
        PlotOrientation plotOrientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelPaint(AbstractRenderer.java:2016)
            org.jfree.chart.renderer.AbstractRenderer.getItemLabelPaint(AbstractRenderer.java:1999)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(AbstractCategoryItemRenderer.java:1614) */
        stackedBarRenderer3D.drawItemLabel(null, plotOrientation, null, 0, 0, false, java.lang.Double.NaN, java.lang.Double.NaN, false);
    }
    
    @Test
    public void testDrawItemLabel4() throws Exception  {
        CategoryStepRenderer categoryStepRenderer = ((CategoryStepRenderer) createInstance("org.jfree.chart.renderer.category.CategoryStepRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        categoryStepRenderer.setBaseItemLabelGenerator(baseItemLabelGenerator);
        setField(categoryStepRenderer, "org.jfree.chart.renderer.AbstractRenderer", "itemLabelFontList", itemLabelGeneratorList);
        PaintList itemLabelPaintList = ((PaintList) createInstance("org.jfree.chart.util.PaintList"));
        setField(categoryStepRenderer, "org.jfree.chart.renderer.AbstractRenderer", "itemLabelPaintList", itemLabelPaintList);
        DefaultCategoryDataset defaultCategoryDataset = ((DefaultCategoryDataset) createInstance("org.jfree.data.category.DefaultCategoryDataset"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(AbstractCategoryItemRenderer.java:1615) */
        categoryStepRenderer.drawItemLabel(null, null, defaultCategoryDataset, Integer.MIN_VALUE, 0, false, java.lang.Double.NaN, java.lang.Double.NaN, false);
    }
    
    @Test
    public void testDrawItemLabel5() throws Exception  {
        LevelRenderer levelRenderer = ((LevelRenderer) createInstance("org.jfree.chart.renderer.category.LevelRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        IntervalCategoryItemLabelGenerator intervalCategoryItemLabelGenerator = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
        objects[0] = ((Object) intervalCategoryItemLabelGenerator);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(levelRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        ObjectList itemLabelFontList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(itemLabelFontList, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(levelRenderer, "org.jfree.chart.renderer.AbstractRenderer", "itemLabelFontList", itemLabelFontList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelPaint(AbstractRenderer.java:2016)
            org.jfree.chart.renderer.AbstractRenderer.getItemLabelPaint(AbstractRenderer.java:1999)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(AbstractCategoryItemRenderer.java:1614) */
        levelRenderer.drawItemLabel(null, null, null, 0, 0, false, java.lang.Double.NaN, java.lang.Double.NaN, false);
    }
    ///endregion
    
    ///region Errors report for drawItemLabel
    
    public void testDrawItemLabel_errors()
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
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLegendItem(int, int)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItem(int,int)}
 *  */
    @Test
    public void testGetLegendItem_ReturnNull() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        
        LegendItem actual = waterfallBarRenderer.getLegendItem(-255, -255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItem(int,int)}
 *  */
    @Test
    public void testGetLegendItem_ReturnNull_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        waterfallBarRenderer.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        LegendItem actual = waterfallBarRenderer.getLegendItem(-255, 0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItem(int,int)}
 *  */
    @Test
    public void testGetLegendItem_ReturnNull_3() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        waterfallBarRenderer.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        LegendItem actual = waterfallBarRenderer.getLegendItem(-255, -1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItem(int,int)}
 *  */
    @Test
    public void testGetLegendItem_ReturnNull_2() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        waterfallBarRenderer.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {null};
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        LegendItem actual = waterfallBarRenderer.getLegendItem(-255, 0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLegendItem(int, int)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItem(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isSeriesVisible(series) || !isSeriesVisibleInLegend(series)
 *  */
    @Test
    public void testGetLegendItem_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        waterfallBarRenderer.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {};
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItem] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0] */
        waterfallBarRenderer.getLegendItem(-255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItem(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: !isSeriesVisible(series) || !isSeriesVisibleInLegend(series)
 *  */
    @Test
    public void testGetLegendItem_ThrowClassCastException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        waterfallBarRenderer.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Boolean (java.lang.Object and java.lang.Boolean are in module java.base of loader 'bootstrap')] */
        waterfallBarRenderer.getLegendItem(-255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getLegendItem(int,int)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#isSeriesVisibleInLegend(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isSeriesVisible(series) || !isSeriesVisibleInLegend(series)
 *  */
    @Test
    public void testGetLegendItem_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CombinedRangeCategoryPlot plot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        stackedBarRenderer3D.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Boolean boolean1 = true;
        objects[0] = ((Object) boolean1);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        BooleanList seriesVisibleInLegendList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects1 = {};
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleInLegendList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItem] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0] */
        stackedBarRenderer3D.getLegendItem(-255, 0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLegendItem(int, int)
    
    @Test
    public void testGetLegendItem1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        stackedBarRenderer3D.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        stackedBarRenderer3D.setBaseSeriesVisible(true);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleList);
        
        LegendItem actual = stackedBarRenderer3D.getLegendItem(0, 0);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetLegendItem2() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        stackedBarRenderer3D.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        stackedBarRenderer3D.setBaseSeriesVisible(true);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleList);
        
        LegendItem actual = stackedBarRenderer3D.getLegendItem(0, Integer.MIN_VALUE);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetLegendItem3() throws Exception  {
        StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer = ((StatisticalLineAndShapeRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        statisticalLineAndShapeRenderer.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalLineAndShapeRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        statisticalLineAndShapeRenderer.setBaseSeriesVisible(true);
        setField(statisticalLineAndShapeRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleList);
        
        LegendItem actual = statisticalLineAndShapeRenderer.getLegendItem(0, 0);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetLegendItem4() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        barRenderer3D.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Boolean boolean1 = true;
        objects[0] = ((Object) boolean1);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        BooleanList seriesVisibleInLegendList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(barRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleInLegendList);
        
        LegendItem actual = barRenderer3D.getLegendItem(0, 0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLegendItem(int, int)
    
    @Test
    public void testGetLegendItem5() throws Exception  {
        StackedBarRenderer stackedBarRenderer = ((StackedBarRenderer) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        stackedBarRenderer.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Boolean boolean1 = true;
        objects[0] = ((Object) boolean1);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        BooleanList seriesVisibleInLegendList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects1 = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects1[0] = object;
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(seriesVisibleInLegendList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleInLegendList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Boolean (java.lang.Object and java.lang.Boolean are in module java.base of loader 'bootstrap')] */
        stackedBarRenderer.getLegendItem(0, 0);
    }
    
    @Test
    public void testGetLegendItem6() throws Exception  {
        StatisticalLineAndShapeRenderer statisticalLineAndShapeRenderer = ((StatisticalLineAndShapeRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer"));
        CombinedDomainCategoryPlot plot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
        statisticalLineAndShapeRenderer.setPlot(plot);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Boolean boolean1 = true;
        objects[0] = ((Object) boolean1);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalLineAndShapeRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        setField(statisticalLineAndShapeRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItem] produces [java.lang.NullPointerException] */
        statisticalLineAndShapeRenderer.getLegendItem(0, 0);
    }
    ///endregion
    
    ///region Errors report for getLegendItem
    
    public void testGetLegendItem_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean removed = this.foregroundAnnotations.remove(annotation);
 *  */
    @Test
    public void testRemoveAnnotation_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(AbstractCategoryItemRenderer.java:697) */
        stackedBarRenderer3D.removeAnnotation(null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: removed = removed & this.backgroundAnnotations.remove(annotation);
 *  */
    @Test
    public void testRemoveAnnotation_ThrowNullPointerException_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ArrayList foregroundAnnotations = new ArrayList();
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(AbstractCategoryItemRenderer.java:698) */
        waterfallBarRenderer.removeAnnotation(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)
    
    @Test
    public void testRemoveAnnotation1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ArrayList backgroundAnnotations = new ArrayList();
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        ArrayList foregroundAnnotations = new ArrayList();
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
        CategoryTextAnnotation categoryTextAnnotation = ((CategoryTextAnnotation) createInstance("org.jfree.chart.annotations.CategoryTextAnnotation"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(AbstractCategoryItemRenderer.java:699) */
        stackedBarRenderer3D.removeAnnotation(categoryTextAnnotation);
    }
    
    @Test
    public void testRemoveAnnotation2() throws Exception  {
        ScatterRenderer scatterRenderer = ((ScatterRenderer) createInstance("org.jfree.chart.renderer.category.ScatterRenderer"));
        ArrayList foregroundAnnotations = new ArrayList();
        CategoryLineAnnotation categoryLineAnnotation = ((CategoryLineAnnotation) createInstance("org.jfree.chart.annotations.CategoryLineAnnotation"));
        foregroundAnnotations.add(categoryLineAnnotation);
        foregroundAnnotations.add(null);
        foregroundAnnotations.add(null);
        setField(scatterRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(AbstractCategoryItemRenderer.java:698) */
        scatterRenderer.removeAnnotation(categoryLineAnnotation);
    }
    
    @Test
    public void testRemoveAnnotation3() throws Exception  {
        ScatterRenderer scatterRenderer = ((ScatterRenderer) createInstance("org.jfree.chart.renderer.category.ScatterRenderer"));
        ArrayList foregroundAnnotations = new ArrayList();
        Object object = createInstance("java.lang.Object");
        foregroundAnnotations.add(object);
        foregroundAnnotations.add(null);
        foregroundAnnotations.add(null);
        setField(scatterRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
        CategoryLineAnnotation categoryLineAnnotation = ((CategoryLineAnnotation) createInstance("org.jfree.chart.annotations.CategoryLineAnnotation"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(AbstractCategoryItemRenderer.java:698) */
        scatterRenderer.removeAnnotation(categoryLineAnnotation);
    }
    
    @Test
    public void testRemoveAnnotation4() throws Exception  {
        ScatterRenderer scatterRenderer = ((ScatterRenderer) createInstance("org.jfree.chart.renderer.category.ScatterRenderer"));
        ArrayList foregroundAnnotations = new ArrayList();
        foregroundAnnotations.add(null);
        foregroundAnnotations.add(null);
        foregroundAnnotations.add(null);
        setField(scatterRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
        CategoryTextAnnotation categoryTextAnnotation = ((CategoryTextAnnotation) createInstance("org.jfree.chart.annotations.CategoryTextAnnotation"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(AbstractCategoryItemRenderer.java:698) */
        scatterRenderer.removeAnnotation(categoryTextAnnotation);
    }
    
    @Test
    public void testRemoveAnnotation5() throws Exception  {
        BarRenderer barRenderer = ((BarRenderer) createInstance("org.jfree.chart.renderer.category.BarRenderer"));
        ArrayList foregroundAnnotations = new ArrayList();
        CategoryLineAnnotation categoryLineAnnotation = ((CategoryLineAnnotation) createInstance("org.jfree.chart.annotations.CategoryLineAnnotation"));
        Integer category1 = 0;
        categoryLineAnnotation.setCategory1(category1);
        foregroundAnnotations.add(categoryLineAnnotation);
        CategoryLineAnnotation categoryLineAnnotation1 = ((CategoryLineAnnotation) createInstance("org.jfree.chart.annotations.CategoryLineAnnotation"));
        Integer category11 = 0;
        categoryLineAnnotation1.setCategory1(category11);
        foregroundAnnotations.add(categoryLineAnnotation1);
        foregroundAnnotations.add(categoryLineAnnotation1);
        setField(barRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.annotations.CategoryLineAnnotation.equals(CategoryLineAnnotation.java:370)
            java.base/java.util.ArrayList.remove(ArrayList.java:624)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(AbstractCategoryItemRenderer.java:697) */
        barRenderer.removeAnnotation(categoryLineAnnotation1);
    }
    
    @Test
    public void testRemoveAnnotation6() throws Exception  {
        BarRenderer barRenderer = ((BarRenderer) createInstance("org.jfree.chart.renderer.category.BarRenderer"));
        ArrayList foregroundAnnotations = new ArrayList();
        CategoryLineAnnotation categoryLineAnnotation = ((CategoryLineAnnotation) createInstance("org.jfree.chart.annotations.CategoryLineAnnotation"));
        foregroundAnnotations.add(categoryLineAnnotation);
        CategoryLineAnnotation categoryLineAnnotation1 = ((CategoryLineAnnotation) createInstance("org.jfree.chart.annotations.CategoryLineAnnotation"));
        Integer category1 = 0;
        categoryLineAnnotation1.setCategory1(category1);
        foregroundAnnotations.add(categoryLineAnnotation1);
        foregroundAnnotations.add(categoryLineAnnotation1);
        setField(barRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(AbstractCategoryItemRenderer.java:698) */
        barRenderer.removeAnnotation(categoryLineAnnotation1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addAnnotation(org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (annotation == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: annotation == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotation_ThrowIllegalArgumentException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        stackedBarRenderer3D.addAnnotation(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addAnnotation(org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: layer.equals(Layer.FOREGROUND)
 *  */
    @Test
    public void testAddAnnotation_ThrowNullPointerException() throws Throwable  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            CategoryPointerAnnotation categoryPointerAnnotation = ((CategoryPointerAnnotation) createInstance("org.jfree.chart.annotations.CategoryPointerAnnotation"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(AbstractCategoryItemRenderer.java:671) */
            Class abstractCategoryItemRendererClazz = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
            Class categoryPointerAnnotationType = Class.forName("org.jfree.chart.annotations.CategoryAnnotation");
            Method addAnnotationMethod = abstractCategoryItemRendererClazz.getDeclaredMethod("addAnnotation", categoryPointerAnnotationType, layerClazz);
            addAnnotationMethod.setAccessible(true);
            java.lang.Object[] addAnnotationMethodArguments = new java.lang.Object[2];
            addAnnotationMethodArguments[0] = categoryPointerAnnotation;
            addAnnotationMethodArguments[1] = ((Object) null);
            try {
                addAnnotationMethod.invoke(waterfallBarRenderer, addAnnotationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addAnnotation(org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.foregroundAnnotations.add(annotation);
 *  */
    @Test
    public void testAddAnnotation_ThrowNullPointerException_1() throws Throwable  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            CategoryPointerAnnotation categoryPointerAnnotation = ((CategoryPointerAnnotation) createInstance("org.jfree.chart.annotations.CategoryPointerAnnotation"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(AbstractCategoryItemRenderer.java:672) */
            Class abstractCategoryItemRendererClazz = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
            Class categoryPointerAnnotationType = Class.forName("org.jfree.chart.annotations.CategoryAnnotation");
            Method addAnnotationMethod = abstractCategoryItemRendererClazz.getDeclaredMethod("addAnnotation", categoryPointerAnnotationType, layerClazz);
            addAnnotationMethod.setAccessible(true);
            java.lang.Object[] addAnnotationMethodArguments = new java.lang.Object[2];
            addAnnotationMethodArguments[0] = categoryPointerAnnotation;
            addAnnotationMethodArguments[1] = foreground;
            try {
                addAnnotationMethod.invoke(waterfallBarRenderer, addAnnotationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addAnnotation(org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.foregroundAnnotations.add(annotation);
 *  */
    @Test
    public void testAddAnnotation_ThrowNullPointerException_2() throws Throwable  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            CategoryPointerAnnotation categoryPointerAnnotation = ((CategoryPointerAnnotation) createInstance("org.jfree.chart.annotations.CategoryPointerAnnotation"));
            Layer layer = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            setField(layer, "org.jfree.chart.util.Layer", "name", name);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(AbstractCategoryItemRenderer.java:672) */
            Class abstractCategoryItemRendererClazz = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
            Class categoryPointerAnnotationType = Class.forName("org.jfree.chart.annotations.CategoryAnnotation");
            Method addAnnotationMethod = abstractCategoryItemRendererClazz.getDeclaredMethod("addAnnotation", categoryPointerAnnotationType, layerClazz);
            addAnnotationMethod.setAccessible(true);
            java.lang.Object[] addAnnotationMethodArguments = new java.lang.Object[2];
            addAnnotationMethodArguments[0] = categoryPointerAnnotation;
            addAnnotationMethodArguments[1] = layer;
            try {
                addAnnotationMethod.invoke(waterfallBarRenderer, addAnnotationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)
    
    @Test(expected = RuntimeException.class)
    public void testAddAnnotation1() throws Throwable  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
            CategoryPointerAnnotation categoryPointerAnnotation = ((CategoryPointerAnnotation) createInstance("org.jfree.chart.annotations.CategoryPointerAnnotation"));
            Layer layer = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name1 = "";
            setField(layer, "org.jfree.chart.util.Layer", "name", name1);
            
            Class abstractCategoryItemRendererClazz = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
            Class categoryPointerAnnotationType = Class.forName("org.jfree.chart.annotations.CategoryAnnotation");
            Method addAnnotationMethod = abstractCategoryItemRendererClazz.getDeclaredMethod("addAnnotation", categoryPointerAnnotationType, layerClazz);
            addAnnotationMethod.setAccessible(true);
            java.lang.Object[] addAnnotationMethodArguments = new java.lang.Object[2];
            addAnnotationMethodArguments[0] = categoryPointerAnnotation;
            addAnnotationMethodArguments[1] = layer;
            try {
                addAnnotationMethod.invoke(groupedStackedBarRenderer, addAnnotationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)
    
    @Test
    public void testAddAnnotation2() throws Throwable  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            ScatterRenderer scatterRenderer = ((ScatterRenderer) createInstance("org.jfree.chart.renderer.category.ScatterRenderer"));
            ArrayList foregroundAnnotations = new ArrayList();
            setField(scatterRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
            CategoryPointerAnnotation categoryPointerAnnotation = ((CategoryPointerAnnotation) createInstance("org.jfree.chart.annotations.CategoryPointerAnnotation"));
            Layer layer = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            setField(layer, "org.jfree.chart.util.Layer", "name", name);
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(AbstractCategoryItemRenderer.java:673) */
            Class abstractCategoryItemRendererClazz = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
            Class categoryPointerAnnotationType = Class.forName("org.jfree.chart.annotations.CategoryAnnotation");
            Method addAnnotationMethod = abstractCategoryItemRendererClazz.getDeclaredMethod("addAnnotation", categoryPointerAnnotationType, layerClazz);
            addAnnotationMethod.setAccessible(true);
            java.lang.Object[] addAnnotationMethodArguments = new java.lang.Object[2];
            addAnnotationMethodArguments[0] = categoryPointerAnnotation;
            addAnnotationMethodArguments[1] = layer;
            try {
                addAnnotationMethod.invoke(scatterRenderer, addAnnotationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    
    @Test
    public void testAddAnnotation3() throws Throwable  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            LevelRenderer levelRenderer = ((LevelRenderer) createInstance("org.jfree.chart.renderer.category.LevelRenderer"));
            ArrayList foregroundAnnotations = new ArrayList();
            foregroundAnnotations.add(null);
            foregroundAnnotations.add(null);
            foregroundAnnotations.add(null);
            setField(levelRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
            CategoryPointerAnnotation categoryPointerAnnotation = ((CategoryPointerAnnotation) createInstance("org.jfree.chart.annotations.CategoryPointerAnnotation"));
            
            /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
                org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(AbstractCategoryItemRenderer.java:673) */
            Class abstractCategoryItemRendererClazz = Class.forName("org.jfree.chart.renderer.category.AbstractCategoryItemRenderer");
            Class categoryPointerAnnotationType = Class.forName("org.jfree.chart.annotations.CategoryAnnotation");
            Method addAnnotationMethod = abstractCategoryItemRendererClazz.getDeclaredMethod("addAnnotation", categoryPointerAnnotationType, layerClazz);
            addAnnotationMethod.setAccessible(true);
            java.lang.Object[] addAnnotationMethodArguments = new java.lang.Object[2];
            addAnnotationMethodArguments[0] = categoryPointerAnnotation;
            addAnnotationMethodArguments[1] = foreground;
            try {
                addAnnotationMethod.invoke(levelRenderer, addAnnotationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#addAnnotation(org.jfree.chart.annotations.CategoryAnnotation,org.jfree.chart.util.Layer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addAnnotation(annotation, Layer.FOREGROUND);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAnnotation_ThrowIllegalArgumentException1() throws Exception  {
        Layer prevFOREGROUND = Layer.FOREGROUND;
        try {
            Layer foreground = ((Layer) createInstance("org.jfree.chart.util.Layer"));
            String name = "Layer.FOREGROUND";
            setField(foreground, "org.jfree.chart.util.Layer", "name", name);
            Class layerClazz = Class.forName("org.jfree.chart.util.Layer");
            setStaticField(layerClazz, "FOREGROUND", foreground);
            WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
            
            waterfallBarRenderer.addAnnotation(null);
        } finally {
            setStaticField(Layer.class, "FOREGROUND", prevFOREGROUND);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAnnotations()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#removeAnnotations()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.foregroundAnnotations.clear();
 *  */
    @Test
    public void testRemoveAnnotations_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations(AbstractCategoryItemRenderer.java:710) */
        stackedBarRenderer3D.removeAnnotations();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#removeAnnotations()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.backgroundAnnotations.clear();
 *  */
    @Test
    public void testRemoveAnnotations_ThrowNullPointerException_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ArrayList foregroundAnnotations = new ArrayList();
        foregroundAnnotations.add(null);
        foregroundAnnotations.add(null);
        foregroundAnnotations.add(null);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations(AbstractCategoryItemRenderer.java:711) */
        waterfallBarRenderer.removeAnnotations();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeAnnotations()
    
    @Test
    public void testRemoveAnnotations1() throws Exception  {
        StackedAreaRenderer stackedAreaRenderer = ((StackedAreaRenderer) createInstance("org.jfree.chart.renderer.category.StackedAreaRenderer"));
        ArrayList backgroundAnnotations = new ArrayList();
        backgroundAnnotations.add(null);
        backgroundAnnotations.add(null);
        backgroundAnnotations.add(null);
        setField(stackedAreaRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        ArrayList foregroundAnnotations = new ArrayList();
        foregroundAnnotations.add(null);
        foregroundAnnotations.add(null);
        foregroundAnnotations.add(null);
        setField(stackedAreaRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", foregroundAnnotations);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.AbstractRenderer.notifyListeners(AbstractRenderer.java:2952)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations(AbstractCategoryItemRenderer.java:712) */
        stackedAreaRenderer.removeAnnotations();
    }
    ///endregion
    
    ///region Errors report for removeAnnotations
    
    public void testRemoveAnnotations_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getPlot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPlot()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getPlot()}
 * @utbot.returnsFrom {@code return this.plot;}
 *  */
    @Test
    public void testGetPlot_ReturnThisPlot() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        CategoryPlot actual = stackedBarRenderer3D.getPlot();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getPlot
    
    public void testGetPlot_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getPassCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPassCount()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getPassCount()}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGetPassCount_Return1() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        int actual = stackedBarRenderer3D.getPassCount();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region Errors report for getPassCount
    
    public void testGetPassCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getURLGenerator(int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getURLGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (generator == null): True}
 * @utbot.returnsFrom {@code return generator;}
 *  */
    @Test
    public void testGetURLGenerator_GeneratorEqualsNull_1() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        CategoryURLGenerator actual = waterfallBarRenderer.getURLGenerator(-1, -255, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getURLGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (generator == null): True}
 * @utbot.returnsFrom {@code return generator;}
 *  */
    @Test
    public void testGetURLGenerator_GeneratorEqualsNull_2() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        CategoryURLGenerator actual = waterfallBarRenderer.getURLGenerator(0, -255, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getURLGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (generator == null): False}
 * @utbot.returnsFrom {@code return generator;}
 *  */
    @Test
    public void testGetURLGenerator_GeneratorNotEqualsNull() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        StandardCategoryURLGenerator standardCategoryURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        objects[0] = ((Object) standardCategoryURLGenerator);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        StandardCategoryURLGenerator actual = ((StandardCategoryURLGenerator) stackedBarRenderer3D.getURLGenerator(0, -255, false));
        
        // org.jfree.chart.urls.StandardCategoryURLGenerator has overridden equals method
        assertEquals(standardCategoryURLGenerator, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getURLGenerator(int,int,boolean)}
 * @utbot.executesCondition {@code (generator == null): True}
 * @utbot.returnsFrom {@code return generator;}
 *  */
    @Test
    public void testGetURLGenerator_GeneratorEqualsNull() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        waterfallBarRenderer.setBaseURLGenerator(baseURLGenerator);
        
        StandardCategoryURLGenerator actual = ((StandardCategoryURLGenerator) waterfallBarRenderer.getURLGenerator(0, -255, false));
        
        // org.jfree.chart.urls.StandardCategoryURLGenerator has overridden equals method
        assertEquals(baseURLGenerator, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getURLGenerator(int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getURLGenerator(int,int,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (CategoryURLGenerator) this.urlGeneratorList.get(row)
 *  */
    @Test
    public void testGetURLGenerator_ThrowClassCastException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.urls.CategoryURLGenerator (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.urls.CategoryURLGenerator is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator(AbstractCategoryItemRenderer.java:549) */
        stackedBarRenderer3D.getURLGenerator(0, -255, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getURLGenerator(int,int,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: (CategoryURLGenerator) this.urlGeneratorList.get(row)
 *  */
    @Test
    public void testGetURLGenerator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(urlGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:85)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator(AbstractCategoryItemRenderer.java:549) */
        waterfallBarRenderer.getURLGenerator(0, -255, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getURLGenerator(int,int,boolean)}
 * @utbot.invokes {@link org.jfree.chart.util.ObjectList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (CategoryURLGenerator) this.urlGeneratorList.get(row)
 *  */
    @Test
    public void testGetURLGenerator_ThrowNullPointerException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator(AbstractCategoryItemRenderer.java:549) */
        stackedBarRenderer3D.getURLGenerator(-255, -255, false);
    }
    ///endregion
    
    ///region Errors report for getURLGenerator
    
    public void testGetURLGenerator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setPlot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPlot(org.jfree.chart.plot.CategoryPlot)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setPlot(org.jfree.chart.plot.CategoryPlot)}
 * @utbot.executesCondition {@code (plot == null): False}
 *  */
    @Test
    public void testSetPlot_PlotNotEqualsNull() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        CategoryPlot initialWaterfallBarRendererPlot = ((CategoryPlot) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "plot"));
        
        waterfallBarRenderer.setPlot(categoryPlot);
        
        CategoryPlot finalWaterfallBarRendererPlot = ((CategoryPlot) getFieldValue(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "plot"));
        
        assertFalse(initialWaterfallBarRendererPlot == finalWaterfallBarRendererPlot);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPlot(org.jfree.chart.plot.CategoryPlot)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setPlot(org.jfree.chart.plot.CategoryPlot)}
 * @utbot.executesCondition {@code (plot == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: plot == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetPlot_ThrowIllegalArgumentException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        stackedBarRenderer3D.setPlot(null);
    }
    ///endregion
    
    ///region Errors report for setPlot
    
    public void testSetPlot_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.initialise
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#initialise(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.executesCondition {@code (dataset != null): False}
 * @utbot.executesCondition {@code (dataset instanceof SelectableCategoryDataset): False}
 * @utbot.executesCondition {@code (selectionState == null): True}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setPlot(org.jfree.chart.plot.CategoryPlot)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#createState(org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.CategoryItemRendererState#setSelectionState(org.jfree.data.category.CategoryDatasetSelectionState)}
 * @utbot.returnsFrom {@code return state;}
 *  */
    @Test
    public void testInitialise_InfoEqualsNull() throws Exception  {
        CategoryStepRenderer categoryStepRenderer = ((CategoryStepRenderer) createInstance("org.jfree.chart.renderer.category.CategoryStepRenderer"));
        setField(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", -255);
        setField(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", -255);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        
        CategoryPlot initialCategoryStepRendererPlot = ((CategoryPlot) getFieldValue(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "plot"));
        
        CategoryStepRenderer.State actual = ((CategoryStepRenderer.State) categoryStepRenderer.initialise(null, null, categoryPlot, null, null));
        
        CategoryStepRenderer.State expected = new CategoryStepRenderer.State(null);
        java.awt.geom.Line2D.Double line = new java.awt.geom.Line2D.Double();
        expected.line = line;
        expected.setBarWidth(0.0);
        expected.setSeriesRunningTotal(0.0);
        
        Line2D expectedLine = expected.line;
        Line2D actualLine = actual.line;
        
        double expectedBarWidth = expected.getBarWidth();
        double actualBarWidth = actual.getBarWidth();
        org.junit.Assert.assertEquals(expectedBarWidth, actualBarWidth, 1.0E-6);
        
        double expectedSeriesRunningTotal = expected.getSeriesRunningTotal();
        double actualSeriesRunningTotal = actual.getSeriesRunningTotal();
        org.junit.Assert.assertEquals(expectedSeriesRunningTotal, actualSeriesRunningTotal, 1.0E-6);
        
        int[] actualVisibleSeries = ((int[]) getFieldValue(actual, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        assertNull(actualVisibleSeries);
        
        CategoryCrosshairState actualCrosshairState = actual.getCrosshairState();
        assertNull(actualCrosshairState);
        
        CategoryDatasetSelectionState actualSelectionState = actual.getSelectionState();
        assertNull(actualSelectionState);
        
        PlotRenderingInfo actualInfo = actual.getInfo();
        assertNull(actualInfo);
        
        CategoryPlot finalCategoryStepRendererPlot = ((CategoryPlot) getFieldValue(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "plot"));
        int finalCategoryStepRendererRowCount = ((Integer) getFieldValue(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount"));
        int finalCategoryStepRendererColumnCount = ((Integer) getFieldValue(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount"));
        
        assertFalse(initialCategoryStepRendererPlot == finalCategoryStepRendererPlot);
        
        assertEquals(0, finalCategoryStepRendererRowCount);
        
        assertEquals(0, finalCategoryStepRendererColumnCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#initialise(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setPlot(org.jfree.chart.plot.CategoryPlot)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setPlot(plot);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialise_ThrowIllegalArgumentException() throws Exception  {
        GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
        
        groupedStackedBarRenderer.initialise(null, null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#initialise(java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.data.category.CategoryDataset,org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.executesCondition {@code (dataset != null): False}
 * @utbot.executesCondition {@code (dataset instanceof SelectableCategoryDataset): False}
 * @utbot.executesCondition {@code (selectionState == null): True}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (cri != null): True}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#setPlot(org.jfree.chart.plot.CategoryPlot)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#createState(org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link org.jfree.chart.plot.PlotRenderingInfo#getOwner()}
 * @utbot.invokes {@link org.jfree.chart.ChartRenderingInfo#getRenderingSource()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rs.getSelectionState(dataset)
 *  */
    @Test
    public void testInitialise_ThrowNullPointerException() throws Exception  {
        CategoryStepRenderer categoryStepRenderer = ((CategoryStepRenderer) createInstance("org.jfree.chart.renderer.category.CategoryStepRenderer"));
        setField(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", -255);
        setField(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", -255);
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        ChartRenderingInfo chartRenderingInfo = new ChartRenderingInfo(null);
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(chartRenderingInfo);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.initialise] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.initialise(AbstractCategoryItemRenderer.java:884) */
        categoryStepRenderer.initialise(null, null, categoryPlot, null, plotRenderingInfo);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test
    public void testInitialise1() throws Exception  {
        CategoryStepRenderer categoryStepRenderer = ((CategoryStepRenderer) createInstance("org.jfree.chart.renderer.category.CategoryStepRenderer"));
        CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        
        CategoryPlot initialCategoryStepRendererPlot = ((CategoryPlot) getFieldValue(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "plot"));
        
        CategoryStepRenderer.State actual = ((CategoryStepRenderer.State) categoryStepRenderer.initialise(null, null, categoryPlot, null, plotRenderingInfo));
        
        PlotRenderingInfo plotRenderingInfo1 = ((PlotRenderingInfo) createInstance("org.jfree.chart.plot.PlotRenderingInfo"));
        java.awt.geom.Rectangle2D.Double dataArea = ((java.awt.geom.Rectangle2D.Double) createInstance("java.awt.geom.Rectangle2D$Double"));
        plotRenderingInfo1.setDataArea(dataArea);
        ArrayList subplotInfo = new ArrayList();
        setField(plotRenderingInfo1, "org.jfree.chart.plot.PlotRenderingInfo", "subplotInfo", subplotInfo);
        CategoryStepRenderer.State expected = new CategoryStepRenderer.State(plotRenderingInfo1);
        java.awt.geom.Line2D.Double line = new java.awt.geom.Line2D.Double();
        expected.line = line;
        expected.setBarWidth(0.0);
        expected.setSeriesRunningTotal(0.0);
        
        Line2D expectedLine = expected.line;
        Line2D actualLine = actual.line;
        
        double expectedBarWidth = expected.getBarWidth();
        double actualBarWidth = actual.getBarWidth();
        org.junit.Assert.assertEquals(expectedBarWidth, actualBarWidth, 1.0E-6);
        
        double expectedSeriesRunningTotal = expected.getSeriesRunningTotal();
        double actualSeriesRunningTotal = actual.getSeriesRunningTotal();
        org.junit.Assert.assertEquals(expectedSeriesRunningTotal, actualSeriesRunningTotal, 1.0E-6);
        
        int[] actualVisibleSeries = ((int[]) getFieldValue(actual, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        assertNull(actualVisibleSeries);
        
        CategoryCrosshairState actualCrosshairState = actual.getCrosshairState();
        assertNull(actualCrosshairState);
        
        CategoryDatasetSelectionState actualSelectionState = actual.getSelectionState();
        assertNull(actualSelectionState);
        
        PlotRenderingInfo expectedInfo = expected.getInfo();
        PlotRenderingInfo actualInfo = actual.getInfo();
        // org.jfree.chart.plot.PlotRenderingInfo has overridden equals method
        assertEquals(expectedInfo, actualInfo);
        
        CategoryPlot finalCategoryStepRendererPlot = ((CategoryPlot) getFieldValue(categoryStepRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "plot"));
        
        assertFalse(initialCategoryStepRendererPlot == finalCategoryStepRendererPlot);
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
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getColumnCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnCount()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getColumnCount()}
 * @utbot.returnsFrom {@code return this.columnCount;}
 *  */
    @Test
    public void testGetColumnCount_ReturnThisColumnCount() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", 1);
        
        int actual = stackedBarRenderer3D.getColumnCount();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region Errors report for getColumnCount
    
    public void testGetColumnCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRowCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowCount()
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getRowCount()}
 * @utbot.returnsFrom {@code return this.rowCount;}
 *  */
    @Test
    public void testGetRowCount_ReturnThisRowCount() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 1);
        
        int actual = stackedBarRenderer3D.getRowCount();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region Errors report for getRowCount
    
    public void testGetRowCount_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createState(org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#createState(org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.CategoryItemRendererState#setVisibleSeriesArray(int[])}
 * @utbot.returnsFrom {@code return state;}
 *  */
    @Test
    public void testCreateState_CategoryItemRendererStateSetVisibleSeriesArray() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        
        CategoryItemRendererState actual = waterfallBarRenderer.createState(null);
        
        CategoryItemRendererState expected = new CategoryItemRendererState(null);
        expected.setBarWidth(0.0);
        expected.setSeriesRunningTotal(0.0);
        int[] intArray = {};
        expected.setVisibleSeriesArray(intArray);
        
        double expectedBarWidth = expected.getBarWidth();
        double actualBarWidth = actual.getBarWidth();
        org.junit.Assert.assertEquals(expectedBarWidth, actualBarWidth, 1.0E-6);
        
        double expectedSeriesRunningTotal = expected.getSeriesRunningTotal();
        double actualSeriesRunningTotal = actual.getSeriesRunningTotal();
        org.junit.Assert.assertEquals(expectedSeriesRunningTotal, actualSeriesRunningTotal, 1.0E-6);
        
        int[] expectedVisibleSeries = ((int[]) getFieldValue(expected, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int[] actualVisibleSeries = ((int[]) getFieldValue(actual, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int expectedVisibleSeriesSize = expectedVisibleSeries.length;
        assertEquals(expectedVisibleSeriesSize, actualVisibleSeries.length);
        assertArrayEquals(expectedVisibleSeries, actualVisibleSeries);
        
        CategoryCrosshairState actualCrosshairState = actual.getCrosshairState();
        assertNull(actualCrosshairState);
        
        CategoryDatasetSelectionState actualSelectionState = actual.getSelectionState();
        assertNull(actualSelectionState);
        
        PlotRenderingInfo actualInfo = actual.getInfo();
        assertNull(actualInfo);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createState(org.jfree.chart.plot.PlotRenderingInfo)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#createState(org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: int[] visibleSeriesTemp = new int[this.rowCount];
 *  */
    @Test
    public void testCreateState_ThrowNegativeArraySizeException() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        setField(waterfallBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", -256);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState] produces [java.lang.NegativeArraySizeException: -256]
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState(AbstractCategoryItemRenderer.java:827) */
        waterfallBarRenderer.createState(null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#createState(org.jfree.chart.plot.PlotRenderingInfo)}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < this.rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: isSeriesVisible(row)
 *  */
    @Test
    public void testCreateState_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 1);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {};
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.BooleanList.getBoolean(BooleanList.java:71)
            org.jfree.chart.renderer.AbstractRenderer.isSeriesVisible(AbstractRenderer.java:511)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState(AbstractCategoryItemRenderer.java:830) */
        stackedBarRenderer3D.createState(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createState(org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test
    public void testCreateState1() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 1);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        CategoryItemRendererState actual = minMaxCategoryRenderer.createState(null);
        
        CategoryItemRendererState expected = new CategoryItemRendererState(null);
        expected.setBarWidth(0.0);
        expected.setSeriesRunningTotal(0.0);
        int[] intArray = {};
        expected.setVisibleSeriesArray(intArray);
        
        double expectedBarWidth = expected.getBarWidth();
        double actualBarWidth = actual.getBarWidth();
        org.junit.Assert.assertEquals(expectedBarWidth, actualBarWidth, 1.0E-6);
        
        double expectedSeriesRunningTotal = expected.getSeriesRunningTotal();
        double actualSeriesRunningTotal = actual.getSeriesRunningTotal();
        org.junit.Assert.assertEquals(expectedSeriesRunningTotal, actualSeriesRunningTotal, 1.0E-6);
        
        int[] expectedVisibleSeries = ((int[]) getFieldValue(expected, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int[] actualVisibleSeries = ((int[]) getFieldValue(actual, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int expectedVisibleSeriesSize = expectedVisibleSeries.length;
        assertEquals(expectedVisibleSeriesSize, actualVisibleSeries.length);
        assertArrayEquals(expectedVisibleSeries, actualVisibleSeries);
        
        CategoryCrosshairState actualCrosshairState = actual.getCrosshairState();
        assertNull(actualCrosshairState);
        
        CategoryDatasetSelectionState actualSelectionState = actual.getSelectionState();
        assertNull(actualSelectionState);
        
        PlotRenderingInfo actualInfo = actual.getInfo();
        assertNull(actualInfo);
        
    }
    
    @Test
    public void testCreateState2() throws Exception  {
        MinMaxCategoryRenderer minMaxCategoryRenderer = ((MinMaxCategoryRenderer) createInstance("org.jfree.chart.renderer.category.MinMaxCategoryRenderer"));
        setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 9);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", -2147483647);
        setField(minMaxCategoryRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        minMaxCategoryRenderer.setBaseSeriesVisible(true);
        
        CategoryItemRendererState actual = minMaxCategoryRenderer.createState(null);
        
        CategoryItemRendererState expected = new CategoryItemRendererState(null);
        expected.setBarWidth(0.0);
        expected.setSeriesRunningTotal(0.0);
        int[] intArray = {
            0, 1, 2, 3, 4, 5, 6, 7,
            8
        };
        expected.setVisibleSeriesArray(intArray);
        
        double expectedBarWidth = expected.getBarWidth();
        double actualBarWidth = actual.getBarWidth();
        org.junit.Assert.assertEquals(expectedBarWidth, actualBarWidth, 1.0E-6);
        
        double expectedSeriesRunningTotal = expected.getSeriesRunningTotal();
        double actualSeriesRunningTotal = actual.getSeriesRunningTotal();
        org.junit.Assert.assertEquals(expectedSeriesRunningTotal, actualSeriesRunningTotal, 1.0E-6);
        
        int[] expectedVisibleSeries = ((int[]) getFieldValue(expected, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int[] actualVisibleSeries = ((int[]) getFieldValue(actual, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int expectedVisibleSeriesSize = expectedVisibleSeries.length;
        assertEquals(expectedVisibleSeriesSize, actualVisibleSeries.length);
        assertArrayEquals(expectedVisibleSeries, actualVisibleSeries);
        
        CategoryCrosshairState actualCrosshairState = actual.getCrosshairState();
        assertNull(actualCrosshairState);
        
        CategoryDatasetSelectionState actualSelectionState = actual.getSelectionState();
        assertNull(actualSelectionState);
        
        PlotRenderingInfo actualInfo = actual.getInfo();
        assertNull(actualInfo);
        
    }
    
    @Test
    public void testCreateState3() throws Exception  {
        BoxAndWhiskerRenderer boxAndWhiskerRenderer = ((BoxAndWhiskerRenderer) createInstance("org.jfree.chart.renderer.category.BoxAndWhiskerRenderer"));
        setField(boxAndWhiskerRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 9);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Boolean boolean1 = true;
        objects[0] = ((Object) boolean1);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(boxAndWhiskerRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        CategoryItemRendererState actual = boxAndWhiskerRenderer.createState(null);
        
        CategoryItemRendererState expected = new CategoryItemRendererState(null);
        expected.setBarWidth(0.0);
        expected.setSeriesRunningTotal(0.0);
        int[] intArray = {0};
        expected.setVisibleSeriesArray(intArray);
        
        double expectedBarWidth = expected.getBarWidth();
        double actualBarWidth = actual.getBarWidth();
        org.junit.Assert.assertEquals(expectedBarWidth, actualBarWidth, 1.0E-6);
        
        double expectedSeriesRunningTotal = expected.getSeriesRunningTotal();
        double actualSeriesRunningTotal = actual.getSeriesRunningTotal();
        org.junit.Assert.assertEquals(expectedSeriesRunningTotal, actualSeriesRunningTotal, 1.0E-6);
        
        int[] expectedVisibleSeries = ((int[]) getFieldValue(expected, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int[] actualVisibleSeries = ((int[]) getFieldValue(actual, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int expectedVisibleSeriesSize = expectedVisibleSeries.length;
        assertEquals(expectedVisibleSeriesSize, actualVisibleSeries.length);
        assertArrayEquals(expectedVisibleSeries, actualVisibleSeries);
        
        CategoryCrosshairState actualCrosshairState = actual.getCrosshairState();
        assertNull(actualCrosshairState);
        
        CategoryDatasetSelectionState actualSelectionState = actual.getSelectionState();
        assertNull(actualSelectionState);
        
        PlotRenderingInfo actualInfo = actual.getInfo();
        assertNull(actualInfo);
        
    }
    
    @Test
    public void testCreateState4() throws Exception  {
        AreaRenderer areaRenderer = ((AreaRenderer) createInstance("org.jfree.chart.renderer.category.AreaRenderer"));
        setField(areaRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 9);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Boolean boolean1 = false;
        objects[0] = ((Object) boolean1);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(areaRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        
        CategoryItemRendererState actual = areaRenderer.createState(plotRenderingInfo);
        
        PlotRenderingInfo plotRenderingInfo1 = ((PlotRenderingInfo) createInstance("org.jfree.chart.plot.PlotRenderingInfo"));
        java.awt.geom.Rectangle2D.Double dataArea = ((java.awt.geom.Rectangle2D.Double) createInstance("java.awt.geom.Rectangle2D$Double"));
        plotRenderingInfo1.setDataArea(dataArea);
        ArrayList subplotInfo = new ArrayList();
        setField(plotRenderingInfo1, "org.jfree.chart.plot.PlotRenderingInfo", "subplotInfo", subplotInfo);
        CategoryItemRendererState expected = new CategoryItemRendererState(plotRenderingInfo1);
        expected.setBarWidth(0.0);
        expected.setSeriesRunningTotal(0.0);
        int[] intArray = {};
        expected.setVisibleSeriesArray(intArray);
        
        double expectedBarWidth = expected.getBarWidth();
        double actualBarWidth = actual.getBarWidth();
        org.junit.Assert.assertEquals(expectedBarWidth, actualBarWidth, 1.0E-6);
        
        double expectedSeriesRunningTotal = expected.getSeriesRunningTotal();
        double actualSeriesRunningTotal = actual.getSeriesRunningTotal();
        org.junit.Assert.assertEquals(expectedSeriesRunningTotal, actualSeriesRunningTotal, 1.0E-6);
        
        int[] expectedVisibleSeries = ((int[]) getFieldValue(expected, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int[] actualVisibleSeries = ((int[]) getFieldValue(actual, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int expectedVisibleSeriesSize = expectedVisibleSeries.length;
        assertEquals(expectedVisibleSeriesSize, actualVisibleSeries.length);
        assertArrayEquals(expectedVisibleSeries, actualVisibleSeries);
        
        CategoryCrosshairState actualCrosshairState = actual.getCrosshairState();
        assertNull(actualCrosshairState);
        
        CategoryDatasetSelectionState actualSelectionState = actual.getSelectionState();
        assertNull(actualSelectionState);
        
        PlotRenderingInfo expectedInfo = expected.getInfo();
        PlotRenderingInfo actualInfo = actual.getInfo();
        // org.jfree.chart.plot.PlotRenderingInfo has overridden equals method
        assertEquals(expectedInfo, actualInfo);
        
    }
    
    @Test
    public void testCreateState5() throws Exception  {
        AreaRenderer areaRenderer = ((AreaRenderer) createInstance("org.jfree.chart.renderer.category.AreaRenderer"));
        setField(areaRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 9);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null, null};
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(areaRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        
        CategoryItemRendererState actual = areaRenderer.createState(plotRenderingInfo);
        
        PlotRenderingInfo plotRenderingInfo1 = ((PlotRenderingInfo) createInstance("org.jfree.chart.plot.PlotRenderingInfo"));
        java.awt.geom.Rectangle2D.Double dataArea = ((java.awt.geom.Rectangle2D.Double) createInstance("java.awt.geom.Rectangle2D$Double"));
        plotRenderingInfo1.setDataArea(dataArea);
        ArrayList subplotInfo = new ArrayList();
        setField(plotRenderingInfo1, "org.jfree.chart.plot.PlotRenderingInfo", "subplotInfo", subplotInfo);
        CategoryItemRendererState expected = new CategoryItemRendererState(plotRenderingInfo1);
        expected.setBarWidth(0.0);
        expected.setSeriesRunningTotal(0.0);
        int[] intArray = {};
        expected.setVisibleSeriesArray(intArray);
        
        double expectedBarWidth = expected.getBarWidth();
        double actualBarWidth = actual.getBarWidth();
        org.junit.Assert.assertEquals(expectedBarWidth, actualBarWidth, 1.0E-6);
        
        double expectedSeriesRunningTotal = expected.getSeriesRunningTotal();
        double actualSeriesRunningTotal = actual.getSeriesRunningTotal();
        org.junit.Assert.assertEquals(expectedSeriesRunningTotal, actualSeriesRunningTotal, 1.0E-6);
        
        int[] expectedVisibleSeries = ((int[]) getFieldValue(expected, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int[] actualVisibleSeries = ((int[]) getFieldValue(actual, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int expectedVisibleSeriesSize = expectedVisibleSeries.length;
        assertEquals(expectedVisibleSeriesSize, actualVisibleSeries.length);
        assertArrayEquals(expectedVisibleSeries, actualVisibleSeries);
        
        CategoryCrosshairState actualCrosshairState = actual.getCrosshairState();
        assertNull(actualCrosshairState);
        
        CategoryDatasetSelectionState actualSelectionState = actual.getSelectionState();
        assertNull(actualSelectionState);
        
        PlotRenderingInfo expectedInfo = expected.getInfo();
        PlotRenderingInfo actualInfo = actual.getInfo();
        // org.jfree.chart.plot.PlotRenderingInfo has overridden equals method
        assertEquals(expectedInfo, actualInfo);
        
    }
    
    @Test
    public void testCreateState6() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 9);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        objects[1] = ((Object) stackedBarRenderer3D);
        objects[2] = ((Object) stackedBarRenderer3D);
        objects[3] = ((Object) stackedBarRenderer3D);
        objects[4] = ((Object) stackedBarRenderer3D);
        objects[5] = ((Object) stackedBarRenderer3D);
        objects[6] = ((Object) stackedBarRenderer3D);
        objects[7] = ((Object) stackedBarRenderer3D);
        objects[8] = ((Object) stackedBarRenderer3D);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(stackedBarRenderer3D, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        stackedBarRenderer3D.setBaseSeriesVisible(true);
        PlotRenderingInfo plotRenderingInfo = new PlotRenderingInfo(null);
        
        CategoryItemRendererState actual = stackedBarRenderer3D.createState(plotRenderingInfo);
        
        PlotRenderingInfo plotRenderingInfo1 = ((PlotRenderingInfo) createInstance("org.jfree.chart.plot.PlotRenderingInfo"));
        java.awt.geom.Rectangle2D.Double dataArea = ((java.awt.geom.Rectangle2D.Double) createInstance("java.awt.geom.Rectangle2D$Double"));
        plotRenderingInfo1.setDataArea(dataArea);
        ArrayList subplotInfo = new ArrayList();
        setField(plotRenderingInfo1, "org.jfree.chart.plot.PlotRenderingInfo", "subplotInfo", subplotInfo);
        CategoryItemRendererState expected = new CategoryItemRendererState(plotRenderingInfo1);
        expected.setBarWidth(0.0);
        expected.setSeriesRunningTotal(0.0);
        int[] intArray = {
            0, 1, 2, 3, 4, 5, 6, 7,
            8
        };
        expected.setVisibleSeriesArray(intArray);
        
        double expectedBarWidth = expected.getBarWidth();
        double actualBarWidth = actual.getBarWidth();
        org.junit.Assert.assertEquals(expectedBarWidth, actualBarWidth, 1.0E-6);
        
        double expectedSeriesRunningTotal = expected.getSeriesRunningTotal();
        double actualSeriesRunningTotal = actual.getSeriesRunningTotal();
        org.junit.Assert.assertEquals(expectedSeriesRunningTotal, actualSeriesRunningTotal, 1.0E-6);
        
        int[] expectedVisibleSeries = ((int[]) getFieldValue(expected, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int[] actualVisibleSeries = ((int[]) getFieldValue(actual, "org.jfree.chart.renderer.category.CategoryItemRendererState", "visibleSeries"));
        int expectedVisibleSeriesSize = expectedVisibleSeries.length;
        assertEquals(expectedVisibleSeriesSize, actualVisibleSeries.length);
        assertArrayEquals(expectedVisibleSeries, actualVisibleSeries);
        
        CategoryCrosshairState actualCrosshairState = actual.getCrosshairState();
        assertNull(actualCrosshairState);
        
        CategoryDatasetSelectionState actualSelectionState = actual.getSelectionState();
        assertNull(actualSelectionState);
        
        PlotRenderingInfo expectedInfo = expected.getInfo();
        PlotRenderingInfo actualInfo = actual.getInfo();
        // org.jfree.chart.plot.PlotRenderingInfo has overridden equals method
        assertEquals(expectedInfo, actualInfo);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createState(org.jfree.chart.plot.PlotRenderingInfo)
    
    @Test
    public void testCreateState7() throws Exception  {
        BarRenderer barRenderer = ((BarRenderer) createInstance("org.jfree.chart.renderer.category.BarRenderer"));
        setField(barRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 9);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(barRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Boolean (java.lang.Object and java.lang.Boolean are in module java.base of loader 'bootstrap')]
            org.jfree.chart.util.BooleanList.getBoolean(BooleanList.java:71)
            org.jfree.chart.renderer.AbstractRenderer.isSeriesVisible(AbstractRenderer.java:511)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState(AbstractCategoryItemRenderer.java:830) */
        barRenderer.createState(null);
    }
    ///endregion
    
    ///region Errors report for createState
    
    public void testCreateState_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#findRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.executesCondition {@code (dataset == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindRangeBounds_DatasetEqualsNull() throws Exception  {
        StackedBarRenderer3D stackedBarRenderer3D = ((StackedBarRenderer3D) createInstance("org.jfree.chart.renderer.category.StackedBarRenderer3D"));
        
        Range actual = stackedBarRenderer3D.findRangeBounds(null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#findRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.executesCondition {@code (dataset == null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#getDataBoundsIncludesVisibleSeriesOnly()}
 * @utbot.invokes {@link org.jfree.data.general.DatasetUtilities#findRangeBounds(org.jfree.data.category.CategoryDataset,boolean)}
 * @utbot.returnsFrom {@code return DatasetUtilities.findRangeBounds(dataset, includeInterval);}
 *  */
    @Test
    public void testFindRangeBounds_DatasetNotEqualsNull() throws Exception  {
        WaterfallBarRenderer waterfallBarRenderer = ((WaterfallBarRenderer) createInstance("org.jfree.chart.renderer.category.WaterfallBarRenderer"));
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        
        Range actual = waterfallBarRenderer.findRangeBounds(defaultMultiValueCategoryDataset, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)
    
    @Test
    public void testFindRangeBounds1() throws Exception  {
        GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
        groupedStackedBarRenderer.setDataBoundsIncludesVisibleSeriesOnly(true);
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getColumnCount(KeyedObjects2D.java:98)
            org.jfree.data.category.DefaultCategoryDataset.getColumnCount(DefaultCategoryDataset.java:105)
            org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(DatasetUtilities.java:1062)
            org.jfree.data.general.DatasetUtilities.findRangeBounds(DatasetUtilities.java:855)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(AbstractCategoryItemRenderer.java:930) */
        groupedStackedBarRenderer.findRangeBounds(defaultKeyedValues2DDataset, false);
    }
    
    @Test
    public void testFindRangeBounds2() throws Exception  {
        GroupedStackedBarRenderer groupedStackedBarRenderer = ((GroupedStackedBarRenderer) createInstance("org.jfree.chart.renderer.category.GroupedStackedBarRenderer"));
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.data.general.DatasetUtilities.iterateRangeBounds(DatasetUtilities.java:982)
            org.jfree.data.general.DatasetUtilities.findRangeBounds(DatasetUtilities.java:825)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(AbstractCategoryItemRenderer.java:934) */
        groupedStackedBarRenderer.findRangeBounds(slidingGanttCategoryDataset, false);
    }
    
    @Test
    public void testFindRangeBounds3() throws Exception  {
        LevelRenderer levelRenderer = ((LevelRenderer) createInstance("org.jfree.chart.renderer.category.LevelRenderer"));
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset = ((DefaultKeyedValues2DDataset) createInstance("org.jfree.data.general.DefaultKeyedValues2DDataset"));
        KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
        ArrayList rowKeys = new ArrayList();
        rowKeys.add(null);
        rowKeys.add(null);
        rowKeys.add(null);
        setField(data, "org.jfree.data.KeyedObjects2D", "rowKeys", rowKeys);
        setField(defaultKeyedValues2DDataset, "org.jfree.data.category.DefaultCategoryDataset", "data", data);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.KeyedObjects2D.getColumnCount(KeyedObjects2D.java:98)
            org.jfree.data.category.DefaultCategoryDataset.getColumnCount(DefaultCategoryDataset.java:105)
            org.jfree.data.general.DatasetUtilities.iterateRangeBounds(DatasetUtilities.java:983)
            org.jfree.data.general.DatasetUtilities.findRangeBounds(DatasetUtilities.java:825)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(AbstractCategoryItemRenderer.java:934) */
        levelRenderer.findRangeBounds(defaultKeyedValues2DDataset, false);
    }
    ///endregion
    
    ///region Errors report for findRangeBounds
    
    public void testFindRangeBounds_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findRangeBounds(org.jfree.data.category.CategoryDataset)
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#findRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return findRangeBounds(dataset, false);}
 *  */
    @Test
    public void testFindRangeBounds_ReturnFindRangeBounds_2() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        Range rangeBounds = ((Range) createInstance("org.jfree.data.Range"));
        setField(defaultMultiValueCategoryDataset, "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "rangeBounds", rangeBounds);
        
        Range actual = barRenderer3D.findRangeBounds(defaultMultiValueCategoryDataset);
        
        // org.jfree.data.Range has overridden equals method
        assertEquals(rangeBounds, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#findRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return findRangeBounds(dataset, false);}
 *  */
    @Test
    public void testFindRangeBounds_ReturnFindRangeBounds_3() throws Exception  {
        LayeredBarRenderer layeredBarRenderer = ((LayeredBarRenderer) createInstance("org.jfree.chart.renderer.category.LayeredBarRenderer"));
        layeredBarRenderer.setBase(4.9E-324);
        layeredBarRenderer.setIncludeBaseInRange(true);
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        DateRange rangeBounds = ((DateRange) createInstance("org.jfree.data.time.DateRange"));
        setField(rangeBounds, "org.jfree.data.Range", "lower", 4.9E-324);
        setField(rangeBounds, "org.jfree.data.Range", "upper", 4.9E-324);
        setField(defaultMultiValueCategoryDataset, "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "rangeBounds", rangeBounds);
        
        DateRange actual = ((DateRange) layeredBarRenderer.findRangeBounds(defaultMultiValueCategoryDataset));
        
        long rangeBoundsLowerDate = ((Long) getFieldValue(rangeBounds, "org.jfree.data.time.DateRange", "lowerDate"));
        long actualLowerDate = ((Long) getFieldValue(actual, "org.jfree.data.time.DateRange", "lowerDate"));
        assertEquals(rangeBoundsLowerDate, actualLowerDate);
        
        long rangeBoundsUpperDate = ((Long) getFieldValue(rangeBounds, "org.jfree.data.time.DateRange", "upperDate"));
        long actualUpperDate = ((Long) getFieldValue(actual, "org.jfree.data.time.DateRange", "upperDate"));
        assertEquals(rangeBoundsUpperDate, actualUpperDate);
        
        double rangeBoundsLower = ((Double) getFieldValue(rangeBounds, "org.jfree.data.Range", "lower"));
        double actualLower = ((Double) getFieldValue(actual, "org.jfree.data.Range", "lower"));
        org.junit.Assert.assertEquals(rangeBoundsLower, actualLower, 1.0E-6);
        
        double rangeBoundsUpper = ((Double) getFieldValue(rangeBounds, "org.jfree.data.Range", "upper"));
        double actualUpper = ((Double) getFieldValue(actual, "org.jfree.data.Range", "upper"));
        org.junit.Assert.assertEquals(rangeBoundsUpper, actualUpper, 1.0E-6);
        
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#findRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return findRangeBounds(dataset, false);}
 *  */
    @Test
    public void testFindRangeBounds_ReturnFindRangeBounds() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        
        Range actual = barRenderer3D.findRangeBounds(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#findRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return findRangeBounds(dataset, false);}
 *  */
    @Test
    public void testFindRangeBounds_ReturnFindRangeBounds_4() throws Exception  {
        LevelRenderer levelRenderer = ((LevelRenderer) createInstance("org.jfree.chart.renderer.category.LevelRenderer"));
        
        Range actual = levelRenderer.findRangeBounds(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCategoryItemRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.AbstractCategoryItemRenderer#findRangeBounds(org.jfree.data.category.CategoryDataset)}
 * @utbot.returnsFrom {@code return findRangeBounds(dataset, false);}
 *  */
    @Test
    public void testFindRangeBounds_ReturnFindRangeBounds_1() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        
        Range actual = barRenderer3D.findRangeBounds(defaultMultiValueCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findRangeBounds(org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testFindRangeBounds4() throws Exception  {
        LayeredBarRenderer layeredBarRenderer = ((LayeredBarRenderer) createInstance("org.jfree.chart.renderer.category.LayeredBarRenderer"));
        layeredBarRenderer.setBase(2.024503231048588);
        layeredBarRenderer.setIncludeBaseInRange(true);
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        DateRange rangeBounds = ((DateRange) createInstance("org.jfree.data.time.DateRange"));
        setField(rangeBounds, "org.jfree.data.Range", "lower", 2.024503231048588);
        setField(rangeBounds, "org.jfree.data.Range", "upper", -2.2350498912194868E-308);
        setField(defaultMultiValueCategoryDataset, "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "rangeBounds", rangeBounds);
        
        Range actual = layeredBarRenderer.findRangeBounds(defaultMultiValueCategoryDataset);
        
        Range expected = ((Range) createInstance("org.jfree.data.Range"));
        setField(expected, "org.jfree.data.Range", "lower", 2.024503231048588);
        setField(expected, "org.jfree.data.Range", "upper", 2.024503231048588);
        
        // org.jfree.data.Range has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFindRangeBounds5() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset = new DefaultStatisticalCategoryDataset();
        
        Range actual = barRenderer3D.findRangeBounds(defaultStatisticalCategoryDataset);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findRangeBounds(org.jfree.data.category.CategoryDataset)
    
    @Test
    public void testFindRangeBounds6() throws Exception  {
        LineRenderer3D lineRenderer3D = ((LineRenderer3D) createInstance("org.jfree.chart.renderer.category.LineRenderer3D"));
        lineRenderer3D.setDataBoundsIncludesVisibleSeriesOnly(true);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(AbstractCategoryItemRenderer.java:924)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(AbstractCategoryItemRenderer.java:902) */
        lineRenderer3D.findRangeBounds(slidingGanttCategoryDataset);
    }
    
    @Test
    public void testFindRangeBounds7() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.data.general.DatasetUtilities.iterateRangeBounds(DatasetUtilities.java:982)
            org.jfree.data.general.DatasetUtilities.findRangeBounds(DatasetUtilities.java:825)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(AbstractCategoryItemRenderer.java:934)
            org.jfree.chart.renderer.category.BarRenderer.findRangeBounds(BarRenderer.java:869)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(AbstractCategoryItemRenderer.java:902) */
        barRenderer3D.findRangeBounds(slidingGanttCategoryDataset);
    }
    
    @Test
    public void testFindRangeBounds8() throws Exception  {
        BarRenderer3D barRenderer3D = ((BarRenderer3D) createInstance("org.jfree.chart.renderer.category.BarRenderer3D"));
        barRenderer3D.setDataBoundsIncludesVisibleSeriesOnly(true);
        SlidingGanttCategoryDataset slidingGanttCategoryDataset = new SlidingGanttCategoryDataset(null, 0, 0);
        
        /* This test fails because method [org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds] produces [java.lang.NullPointerException]
            org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount(SlidingGanttCategoryDataset.java:286)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(AbstractCategoryItemRenderer.java:924)
            org.jfree.chart.renderer.category.BarRenderer.findRangeBounds(BarRenderer.java:869)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(AbstractCategoryItemRenderer.java:902) */
        barRenderer3D.findRangeBounds(slidingGanttCategoryDataset);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findRangeBounds(org.jfree.data.category.CategoryDataset)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBounds9() throws Exception  {
        BarRenderer barRenderer = ((BarRenderer) createInstance("org.jfree.chart.renderer.category.BarRenderer"));
        barRenderer.setBase(4.001983642578125);
        barRenderer.setIncludeBaseInRange(true);
        DefaultMultiValueCategoryDataset defaultMultiValueCategoryDataset = ((DefaultMultiValueCategoryDataset) createInstance("org.jfree.data.statistics.DefaultMultiValueCategoryDataset"));
        DateRange rangeBounds = ((DateRange) createInstance("org.jfree.data.time.DateRange"));
        setField(rangeBounds, "org.jfree.data.Range", "lower", 32.00195312500001);
        setField(rangeBounds, "org.jfree.data.Range", "upper", 0.0);
        setField(defaultMultiValueCategoryDataset, "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "rangeBounds", rangeBounds);
        
        barRenderer.findRangeBounds(defaultMultiValueCategoryDataset);
    }
    ///endregion
    
    ///region Errors report for findRangeBounds
    
    public void testFindRangeBounds_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields794579098747500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields794579098747500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass794579098758400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields794579098747500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass794579098758400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields794579099140300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields794579099140300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass794579099142000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields794579099140300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass794579099142000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields794579099475600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields794579099475600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass794579099477200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields794579099475600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass794579099477200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


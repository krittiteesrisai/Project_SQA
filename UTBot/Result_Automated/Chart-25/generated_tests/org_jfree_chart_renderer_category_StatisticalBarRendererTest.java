package org.jfree.chart.renderer.category;

import org.junit.Test;
import org.jfree.chart.util.ObjectList;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.axis.QuarterDateFormat;
import java.text.DecimalFormat;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.util.BooleanList;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import java.lang.reflect.Method;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.util.zip.InflaterInputStream;
import java.io.ObjectStreamClass;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.jfree.chart.event.ChartChangeEventType;
import java.awt.TexturePaint;
import javax.swing.event.EventListenerList;
import java.awt.Paint;
import java.awt.SystemColor;
import sun.swing.PrintColorUIResource;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.FastScatterPlot;
import java.awt.BasicStroke;
import java.awt.Stroke;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.util.RectangleEdge;
import java.awt.Rectangle;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.data.KeyedObjects2D;
import java.awt.geom.Rectangle2D;
import org.jfree.chart.renderer.category.CategoryStepRenderer.State;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_jfree_chart_renderer_category_StatisticalBarRendererTest {
    ///region Test suites for executable org.jfree.chart.renderer.category.StatisticalBarRenderer.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfStatisticalBarRenderer() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        
        boolean actual = statisticalBarRenderer.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_3() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Character character = '\u0000';
        objects[0] = ((Object) character);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList1);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_4() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_1() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects1[0] = object;
        setField(itemLabelGeneratorList1, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(itemLabelGeneratorList1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList1);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_2() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = {null};
        setField(itemLabelGeneratorList1, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(itemLabelGeneratorList1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList1);
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        statisticalBarRenderer1.setBaseItemLabelGenerator(baseItemLabelGenerator);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_5() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        statisticalBarRenderer1.setBaseItemLabelGenerator(baseItemLabelGenerator);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_6() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        statisticalBarRenderer.setBaseItemLabelGenerator(baseItemLabelGenerator);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_7() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        String labelFormat = "";
        setField(baseItemLabelGenerator, "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", "labelFormat", labelFormat);
        statisticalBarRenderer.setBaseItemLabelGenerator(baseItemLabelGenerator);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        IntervalCategoryItemLabelGenerator baseItemLabelGenerator1 = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
        statisticalBarRenderer1.setBaseItemLabelGenerator(baseItemLabelGenerator1);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_8() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        StandardCategoryToolTipGenerator baseToolTipGenerator = ((StandardCategoryToolTipGenerator) createInstance("org.jfree.chart.labels.StandardCategoryToolTipGenerator"));
        statisticalBarRenderer1.setBaseToolTipGenerator(baseToolTipGenerator);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_9() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        String labelFormat = "";
        setField(baseItemLabelGenerator, "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", "labelFormat", labelFormat);
        statisticalBarRenderer.setBaseItemLabelGenerator(baseItemLabelGenerator);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        IntervalCategoryItemLabelGenerator baseItemLabelGenerator1 = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
        setField(baseItemLabelGenerator1, "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", "labelFormat", labelFormat);
        QuarterDateFormat dateFormat = ((QuarterDateFormat) createInstance("org.jfree.chart.axis.QuarterDateFormat"));
        setField(baseItemLabelGenerator1, "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", "dateFormat", dateFormat);
        statisticalBarRenderer1.setBaseItemLabelGenerator(baseItemLabelGenerator1);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_11() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", toolTipGeneratorList1);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_10() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        String labelFormat = "";
        setField(baseItemLabelGenerator, "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", "labelFormat", labelFormat);
        statisticalBarRenderer.setBaseItemLabelGenerator(baseItemLabelGenerator);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        IntervalCategoryItemLabelGenerator baseItemLabelGenerator1 = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
        setField(baseItemLabelGenerator1, "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", "labelFormat", labelFormat);
        DecimalFormat numberFormat = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(baseItemLabelGenerator1, "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", "numberFormat", numberFormat);
        statisticalBarRenderer1.setBaseItemLabelGenerator(baseItemLabelGenerator1);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_12() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        String labelFormat = "";
        setField(baseItemLabelGenerator, "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", "labelFormat", labelFormat);
        statisticalBarRenderer.setBaseItemLabelGenerator(baseItemLabelGenerator);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        IntervalCategoryItemLabelGenerator baseItemLabelGenerator1 = ((IntervalCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.IntervalCategoryItemLabelGenerator"));
        setField(baseItemLabelGenerator1, "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator", "labelFormat", labelFormat);
        statisticalBarRenderer1.setBaseItemLabelGenerator(baseItemLabelGenerator1);
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_13() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_14() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer.setBaseURLGenerator(baseURLGenerator);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        statisticalBarRenderer1.setLegendItemLabelGenerator(legendItemLabelGenerator);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_15() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer.setBaseURLGenerator(baseURLGenerator);
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        statisticalBarRenderer.setLegendItemLabelGenerator(legendItemLabelGenerator);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        statisticalBarRenderer1.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_16() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer.setBaseURLGenerator(baseURLGenerator);
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        statisticalBarRenderer.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        statisticalBarRenderer1.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemURLGenerator(legendItemLabelGenerator);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_17() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer.setBaseURLGenerator(baseURLGenerator);
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        statisticalBarRenderer.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemURLGenerator(legendItemLabelGenerator);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        statisticalBarRenderer1.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemURLGenerator(legendItemLabelGenerator);
        ArrayList backgroundAnnotations = new ArrayList();
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
        
        List finalStatisticalBarRendererBackgroundAnnotations = ((List) getFieldValue(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations"));
        
        assertNull(finalStatisticalBarRendererBackgroundAnnotations);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_18() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer.setBaseURLGenerator(baseURLGenerator);
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        statisticalBarRenderer.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemURLGenerator(legendItemLabelGenerator);
        ArrayList backgroundAnnotations = new ArrayList();
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        statisticalBarRenderer1.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemURLGenerator(legendItemLabelGenerator);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", backgroundAnnotations);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
        
        List finalStatisticalBarRendererForegroundAnnotations = ((List) getFieldValue(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations"));
        
        assertNull(finalStatisticalBarRendererForegroundAnnotations);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_19() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer.setBaseURLGenerator(baseURLGenerator);
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        statisticalBarRenderer.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemURLGenerator(legendItemLabelGenerator);
        ArrayList backgroundAnnotations = new ArrayList();
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", backgroundAnnotations);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        statisticalBarRenderer1.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemURLGenerator(legendItemLabelGenerator);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", backgroundAnnotations);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_22() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer.setBaseURLGenerator(baseURLGenerator);
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        statisticalBarRenderer.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemURLGenerator(legendItemLabelGenerator);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleList);
        statisticalBarRenderer.setBaseSeriesVisibleInLegend(true);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", itemLabelGeneratorList);
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        statisticalBarRenderer1.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemURLGenerator(legendItemLabelGenerator);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleList);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
        
        List finalStatisticalBarRendererBackgroundAnnotations = ((List) getFieldValue(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations"));
        List finalStatisticalBarRendererForegroundAnnotations = ((List) getFieldValue(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations"));
        
        List finalStatisticalBarRenderer1BackgroundAnnotations = ((List) getFieldValue(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations"));
        List finalStatisticalBarRenderer1ForegroundAnnotations = ((List) getFieldValue(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations"));
        
        assertNull(finalStatisticalBarRendererBackgroundAnnotations);
        
        assertNull(finalStatisticalBarRendererForegroundAnnotations);
        
        assertNull(finalStatisticalBarRenderer1BackgroundAnnotations);
        
        assertNull(finalStatisticalBarRenderer1ForegroundAnnotations);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_21() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer.setBaseURLGenerator(baseURLGenerator);
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        statisticalBarRenderer.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemURLGenerator(legendItemLabelGenerator);
        ArrayList backgroundAnnotations = new ArrayList();
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", backgroundAnnotations);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleInLegendList", seriesVisibleList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        statisticalBarRenderer1.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemURLGenerator(legendItemLabelGenerator);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", backgroundAnnotations);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof StatisticalBarRenderer)): False}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfStatisticalBarRenderer_20() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer.setBaseURLGenerator(baseURLGenerator);
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        statisticalBarRenderer.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemURLGenerator(legendItemLabelGenerator);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        statisticalBarRenderer.setBaseSeriesVisible(true);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        statisticalBarRenderer1.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemURLGenerator(legendItemLabelGenerator);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        
        boolean actual = statisticalBarRenderer.equals(statisticalBarRenderer1);
        
        assertFalse(actual);
        
        List finalStatisticalBarRendererBackgroundAnnotations = ((List) getFieldValue(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations"));
        List finalStatisticalBarRendererForegroundAnnotations = ((List) getFieldValue(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations"));
        
        List finalStatisticalBarRenderer1BackgroundAnnotations = ((List) getFieldValue(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations"));
        List finalStatisticalBarRenderer1ForegroundAnnotations = ((List) getFieldValue(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations"));
        
        assertNull(finalStatisticalBarRendererBackgroundAnnotations);
        
        assertNull(finalStatisticalBarRendererForegroundAnnotations);
        
        assertNull(finalStatisticalBarRenderer1BackgroundAnnotations);
        
        assertNull(finalStatisticalBarRenderer1ForegroundAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList1);
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:87)
            org.jfree.chart.util.AbstractObjectList.equals(AbstractObjectList.java:193)
            org.jfree.chart.util.ObjectUtilities.equal(ObjectUtilities.java:131)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.equals(AbstractCategoryItemRenderer.java:1299)
            org.jfree.chart.renderer.category.BarRenderer.equals(BarRenderer.java:1041)
            org.jfree.chart.renderer.category.StatisticalBarRenderer.equals(StatisticalBarRenderer.java:516) */
        statisticalBarRenderer.equals(statisticalBarRenderer1);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {null};
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(itemLabelGeneratorList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectList itemLabelGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects1 = {};
        setField(itemLabelGeneratorList1, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(itemLabelGeneratorList1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "itemLabelGeneratorList", itemLabelGeneratorList1);
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:87)
            org.jfree.chart.util.AbstractObjectList.equals(AbstractObjectList.java:193)
            org.jfree.chart.util.ObjectUtilities.equal(ObjectUtilities.java:131)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.equals(AbstractCategoryItemRenderer.java:1299)
            org.jfree.chart.renderer.category.BarRenderer.equals(BarRenderer.java:1041)
            org.jfree.chart.renderer.category.StatisticalBarRenderer.equals(StatisticalBarRenderer.java:516) */
        statisticalBarRenderer.equals(statisticalBarRenderer1);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        StandardCategoryItemLabelGenerator baseItemLabelGenerator = ((StandardCategoryItemLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategoryItemLabelGenerator"));
        statisticalBarRenderer.setBaseItemLabelGenerator(baseItemLabelGenerator);
        ObjectList toolTipGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList);
        BoxAndWhiskerToolTipGenerator baseToolTipGenerator = ((BoxAndWhiskerToolTipGenerator) createInstance("org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator"));
        statisticalBarRenderer.setBaseToolTipGenerator(baseToolTipGenerator);
        ObjectList urlGeneratorList = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        StandardCategoryURLGenerator baseURLGenerator = ((StandardCategoryURLGenerator) createInstance("org.jfree.chart.urls.StandardCategoryURLGenerator"));
        statisticalBarRenderer.setBaseURLGenerator(baseURLGenerator);
        StandardCategorySeriesLabelGenerator legendItemLabelGenerator = ((StandardCategorySeriesLabelGenerator) createInstance("org.jfree.chart.labels.StandardCategorySeriesLabelGenerator"));
        statisticalBarRenderer.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer.setLegendItemURLGenerator(legendItemLabelGenerator);
        ArrayList backgroundAnnotations = new ArrayList();
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", backgroundAnnotations);
        BooleanList seriesVisibleList = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects = {null};
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(seriesVisibleList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList);
        StatisticalBarRenderer statisticalBarRenderer1 = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        statisticalBarRenderer1.setBaseItemLabelGenerator(baseItemLabelGenerator);
        ObjectList toolTipGeneratorList1 = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "toolTipGeneratorList", toolTipGeneratorList1);
        statisticalBarRenderer1.setBaseToolTipGenerator(baseToolTipGenerator);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "urlGeneratorList", urlGeneratorList);
        statisticalBarRenderer1.setBaseURLGenerator(baseURLGenerator);
        statisticalBarRenderer1.setLegendItemLabelGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemToolTipGenerator(legendItemLabelGenerator);
        statisticalBarRenderer1.setLegendItemURLGenerator(legendItemLabelGenerator);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "backgroundAnnotations", backgroundAnnotations);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "foregroundAnnotations", backgroundAnnotations);
        BooleanList seriesVisibleList1 = ((BooleanList) createInstance("org.jfree.chart.util.BooleanList"));
        java.lang.Object[] objects1 = {};
        setField(seriesVisibleList1, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(seriesVisibleList1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(statisticalBarRenderer1, "org.jfree.chart.renderer.AbstractRenderer", "seriesVisibleList", seriesVisibleList1);
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.AbstractObjectList.equals(AbstractObjectList.java:193)
            org.jfree.chart.util.BooleanList.equals(BooleanList.java:96)
            org.jfree.chart.renderer.AbstractRenderer.equals(AbstractRenderer.java:2362)
            org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.equals(AbstractCategoryItemRenderer.java:1343)
            org.jfree.chart.renderer.category.BarRenderer.equals(BarRenderer.java:1041)
            org.jfree.chart.renderer.category.StatisticalBarRenderer.equals(StatisticalBarRenderer.java:516) */
        statisticalBarRenderer.equals(statisticalBarRenderer1);
    }
    ///endregion
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.StatisticalBarRenderer.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.readObject] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.StatisticalBarRenderer.readObject(StatisticalBarRenderer.java:550) */
        Class statisticalBarRendererClazz = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = statisticalBarRendererClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(statisticalBarRenderer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
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
        
        Class statisticalBarRendererClazz = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = statisticalBarRendererClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(statisticalBarRenderer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        Object classLoaderObjectInputStream = createInstance("sun.awt.datatransfer.ClassLoaderObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class statisticalBarRendererClazz = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class classLoaderObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = statisticalBarRendererClazz.getDeclaredMethod("readObject", classLoaderObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderObjectInputStream;
        try {
            readObjectMethod.invoke(statisticalBarRenderer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_1() throws Throwable  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        Object classLoaderObjectInputStream = createInstance("sun.awt.datatransfer.ClassLoaderObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class statisticalBarRendererClazz = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class classLoaderObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = statisticalBarRendererClazz.getDeclaredMethod("readObject", classLoaderObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderObjectInputStream;
        try {
            readObjectMethod.invoke(statisticalBarRenderer, readObjectMethodArguments);
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
        // 10 occurrences of:
        // Default concrete execution failed
        
        // 10 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.StatisticalBarRenderer.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.writeObject] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.StatisticalBarRenderer.writeObject(StatisticalBarRenderer.java:535) */
        Class statisticalBarRendererClazz = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = statisticalBarRendererClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(statisticalBarRenderer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class statisticalBarRendererClazz = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = statisticalBarRendererClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(statisticalBarRenderer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException_1() throws Throwable  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class statisticalBarRendererClazz = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = statisticalBarRendererClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(statisticalBarRenderer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteObject_ThrowZipException() throws Throwable  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) -127, (byte) -127};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 255);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -8L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -1L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class statisticalBarRendererClazz = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = statisticalBarRendererClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(statisticalBarRenderer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeObject
    
    public void testWriteObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setErrorIndicatorPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorPaint(java.awt.Paint)}
 *  */
    @Test
    public void testSetErrorIndicatorPaint() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            TexturePaint errorIndicatorPaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            statisticalBarRenderer.setErrorIndicatorPaint(errorIndicatorPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            statisticalBarRenderer.setErrorIndicatorPaint(null);
            
            Paint finalStatisticalBarRendererErrorIndicatorPaint = ((Paint) getFieldValue(statisticalBarRenderer, "org.jfree.chart.renderer.category.StatisticalBarRenderer", "errorIndicatorPaint"));
            
            assertNull(finalStatisticalBarRendererErrorIndicatorPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetErrorIndicatorPaint_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            TexturePaint errorIndicatorPaint = ((TexturePaint) createInstance("java.awt.TexturePaint"));
            statisticalBarRenderer.setErrorIndicatorPaint(errorIndicatorPaint);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            statisticalBarRenderer.setErrorIndicatorPaint(null);
            
            Paint finalStatisticalBarRendererErrorIndicatorPaint = ((Paint) getFieldValue(statisticalBarRenderer, "org.jfree.chart.renderer.category.StatisticalBarRenderer", "errorIndicatorPaint"));
            
            assertNull(finalStatisticalBarRendererErrorIndicatorPaint);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setErrorIndicatorPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorPaint(java.awt.Paint)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetErrorIndicatorPaint_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            SystemColor errorIndicatorPaint = ((SystemColor) createInstance("java.awt.SystemColor"));
            Class statisticalBarRendererClazz = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
            Class errorIndicatorPaintType = Class.forName("java.awt.Paint");
            Method setErrorIndicatorPaintMethod = statisticalBarRendererClazz.getDeclaredMethod("setErrorIndicatorPaint", errorIndicatorPaintType);
            setErrorIndicatorPaintMethod.setAccessible(true);
            java.lang.Object[] setErrorIndicatorPaintMethodArguments = new java.lang.Object[1];
            setErrorIndicatorPaintMethodArguments[0] = errorIndicatorPaint;
            setErrorIndicatorPaintMethod.invoke(statisticalBarRenderer, setErrorIndicatorPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            statisticalBarRenderer.setErrorIndicatorPaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetErrorIndicatorPaint_ThrowIndexOutOfBoundsException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            PrintColorUIResource errorIndicatorPaint = ((PrintColorUIResource) createInstance("sun.swing.PrintColorUIResource"));
            Class statisticalBarRendererClazz = Class.forName("org.jfree.chart.renderer.category.StatisticalBarRenderer");
            Class errorIndicatorPaintType = Class.forName("java.awt.Paint");
            Method setErrorIndicatorPaintMethod = statisticalBarRendererClazz.getDeclaredMethod("setErrorIndicatorPaint", errorIndicatorPaintType);
            setErrorIndicatorPaintMethod.setAccessible(true);
            java.lang.Object[] setErrorIndicatorPaintMethodArguments = new java.lang.Object[1];
            setErrorIndicatorPaintMethodArguments[0] = errorIndicatorPaint;
            setErrorIndicatorPaintMethod.invoke(statisticalBarRenderer, setErrorIndicatorPaintMethodArguments);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            RendererChangeEvent rendererChangeEvent = ((RendererChangeEvent) createInstance("org.jfree.chart.event.RendererChangeEvent"));
            listenerList1[2] = ((Object) rendererChangeEvent);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) categoryPlot);
            listenerList1[6] = ((Object) rendererChangeEvent);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorPaint] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            statisticalBarRenderer.setErrorIndicatorPaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorPaint(java.awt.Paint)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetErrorIndicatorPaint_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = object;
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            listenerList1[6] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorPaint] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
            statisticalBarRenderer.setErrorIndicatorPaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setErrorIndicatorPaint(java.awt.Paint)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorPaint(java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetErrorIndicatorPaint_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            CompassPlot compassPlot = ((CompassPlot) createInstance("org.jfree.chart.plot.CompassPlot"));
            listenerList1[2] = ((Object) compassPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            combinedDomainCategoryPlot.setParent(compassPlot);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            listenerList1[6] = ((Object) compassPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            statisticalBarRenderer.setErrorIndicatorPaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorPaint(java.awt.Paint)}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetErrorIndicatorPaint_ThrowRuntimeException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            FastScatterPlot fastScatterPlot = ((FastScatterPlot) createInstance("org.jfree.chart.plot.FastScatterPlot"));
            listenerList1[2] = ((Object) fastScatterPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            CombinedDomainCategoryPlot parent = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            parent.setParent(fastScatterPlot);
            categoryPlot.setParent(parent);
            listenerList1[5] = ((Object) categoryPlot);
            listenerList1[6] = ((Object) fastScatterPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            statisticalBarRenderer.setErrorIndicatorPaint(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.StatisticalBarRenderer.getErrorIndicatorStroke
    
    ///region Errors report for getErrorIndicatorStroke
    
    public void testGetErrorIndicatorStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorStroke
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setErrorIndicatorStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorStroke(java.awt.Stroke)}
 *  */
    @Test
    public void testSetErrorIndicatorStroke() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            BasicStroke errorIndicatorStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            statisticalBarRenderer.setErrorIndicatorStroke(errorIndicatorStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            statisticalBarRenderer.setErrorIndicatorStroke(null);
            
            Stroke finalStatisticalBarRendererErrorIndicatorStroke = ((Stroke) getFieldValue(statisticalBarRenderer, "org.jfree.chart.renderer.category.StatisticalBarRenderer", "errorIndicatorStroke"));
            
            assertNull(finalStatisticalBarRendererErrorIndicatorStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testSetErrorIndicatorStroke_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            BasicStroke errorIndicatorStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            statisticalBarRenderer.setErrorIndicatorStroke(errorIndicatorStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = {null, null};
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            statisticalBarRenderer.setErrorIndicatorStroke(null);
            
            Stroke finalStatisticalBarRendererErrorIndicatorStroke = ((Stroke) getFieldValue(statisticalBarRenderer, "org.jfree.chart.renderer.category.StatisticalBarRenderer", "errorIndicatorStroke"));
            
            assertNull(finalStatisticalBarRendererErrorIndicatorStroke);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setErrorIndicatorStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorStroke(java.awt.Stroke)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetErrorIndicatorStroke_ThrowClassCastException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            BasicStroke errorIndicatorStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            statisticalBarRenderer.setErrorIndicatorStroke(errorIndicatorStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[2];
            Class class1 = Object.class;
            listenerList1[0] = ((Object) class1);
            Object object = createInstance("java.lang.Object");
            listenerList1[1] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.event.RendererChangeListener] */
            statisticalBarRenderer.setErrorIndicatorStroke(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetErrorIndicatorStroke_ThrowIndexOutOfBoundsException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            BasicStroke errorIndicatorStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            statisticalBarRenderer.setErrorIndicatorStroke(errorIndicatorStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            RendererChangeEvent rendererChangeEvent = ((RendererChangeEvent) createInstance("org.jfree.chart.event.RendererChangeEvent"));
            listenerList1[2] = ((Object) rendererChangeEvent);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) categoryPlot);
            listenerList1[6] = ((Object) rendererChangeEvent);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorStroke] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            statisticalBarRenderer.setErrorIndicatorStroke(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorStroke(java.awt.Stroke)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test
    public void testSetErrorIndicatorStroke_ThrowClassCastException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            Object object = createInstance("java.lang.Object");
            listenerList1[2] = object;
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            ObjectList rangeAxes = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = object;
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(rangeAxes, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "rangeAxes", rangeAxes);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            listenerList1[6] = object;
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.setErrorIndicatorStroke] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.jfree.chart.axis.ValueAxis] */
            statisticalBarRenderer.setErrorIndicatorStroke(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setErrorIndicatorStroke(java.awt.Stroke)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorStroke(java.awt.Stroke)}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetErrorIndicatorStroke_ThrowRuntimeException() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            BasicStroke errorIndicatorStroke = ((BasicStroke) createInstance("java.awt.BasicStroke"));
            statisticalBarRenderer.setErrorIndicatorStroke(errorIndicatorStroke);
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            CompassPlot compassPlot = ((CompassPlot) createInstance("org.jfree.chart.plot.CompassPlot"));
            listenerList1[2] = ((Object) compassPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            combinedDomainCategoryPlot.setParent(compassPlot);
            listenerList1[5] = ((Object) combinedDomainCategoryPlot);
            listenerList1[6] = ((Object) compassPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            statisticalBarRenderer.setErrorIndicatorStroke(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#setErrorIndicatorStroke(java.awt.Stroke)}
 * @utbot.invokes {@link org.jfree.chart.event.RendererChangeListener#rendererChanged(org.jfree.chart.event.RendererChangeEvent)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: notifyListeners(new RendererChangeEvent(this));
 *  */
    @Test(expected = RuntimeException.class)
    public void testSetErrorIndicatorStroke_ThrowRuntimeException_1() throws Exception  {
        ChartChangeEventType prevGENERAL = ChartChangeEventType.GENERAL;
        try {
            ChartChangeEventType general = ((ChartChangeEventType) createInstance("org.jfree.chart.event.ChartChangeEventType"));
            String name = "ChartChangeEventType.GENERAL";
            setField(general, "org.jfree.chart.event.ChartChangeEventType", "name", name);
            Class chartChangeEventTypeClazz = Class.forName("org.jfree.chart.event.ChartChangeEventType");
            setStaticField(chartChangeEventTypeClazz, "GENERAL", general);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            EventListenerList listenerList = ((EventListenerList) createInstance("javax.swing.event.EventListenerList"));
            java.lang.Object[] listenerList1 = new java.lang.Object[8];
            FastScatterPlot fastScatterPlot = ((FastScatterPlot) createInstance("org.jfree.chart.plot.FastScatterPlot"));
            listenerList1[2] = ((Object) fastScatterPlot);
            Class class1 = Object.class;
            listenerList1[4] = ((Object) class1);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            CategoryPlot parent = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            parent.setParent(fastScatterPlot);
            categoryPlot.setParent(parent);
            listenerList1[5] = ((Object) categoryPlot);
            listenerList1[6] = ((Object) fastScatterPlot);
            setField(listenerList, "javax.swing.event.EventListenerList", "listenerList", listenerList1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.AbstractRenderer", "listenerList", listenerList);
            
            statisticalBarRenderer.setErrorIndicatorStroke(null);
        } finally {
            setStaticField(ChartChangeEventType.class, "GENERAL", prevGENERAL);
        }
    }
    ///endregion
    
    ///region Errors report for setErrorIndicatorStroke
    
    public void testSetErrorIndicatorStroke_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.StatisticalBarRenderer.getErrorIndicatorPaint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErrorIndicatorPaint()
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#getErrorIndicatorPaint()}
 * @utbot.returnsFrom {@code return this.errorIndicatorPaint;}
 *  */
    @Test
    public void testGetErrorIndicatorPaint_ReturnThisErrorIndicatorPaint() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        
        Paint actual = statisticalBarRenderer.getErrorIndicatorPaint();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getErrorIndicatorPaint
    
    public void testGetErrorIndicatorPaint_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.StatisticalBarRenderer.drawItem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.executesCondition {@code (!(data instanceof StatisticalCategoryDataset)): False}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): False}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.VERTICAL): False}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getOrientation()}
 *  */
    @Test
    public void testDrawItem_DataNotInstanceOfStatisticalCategoryDataset() throws Exception  {
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
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset = new DefaultStatisticalCategoryDataset();
            
            statisticalBarRenderer.drawItem(null, null, null, categoryPlot, null, null, defaultStatisticalCategoryDataset, -255, -255, -255);
        } finally {
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.executesCondition {@code (!(data instanceof StatisticalCategoryDataset)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !(data instanceof StatisticalCategoryDataset)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawItem_ThrowIllegalArgumentException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        
        statisticalBarRenderer.drawItem(null, null, null, null, null, null, null, -255, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.executesCondition {@code (!(data instanceof StatisticalCategoryDataset)): False}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): True}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getOrientation()}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: drawHorizontalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, statData, row, column);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawItem_ThrowIllegalStateException() throws Exception  {
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        try {
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name3 = "AxisLocation.BOTTOM_OR_LEFT";
            setField(bottomOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name3);
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedDomainCategoryPlot combinedDomainCategoryPlot = ((CombinedDomainCategoryPlot) createInstance("org.jfree.chart.plot.CombinedDomainCategoryPlot"));
            combinedDomainCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            objects[0] = ((Object) axisLocation);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedDomainCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset = new DefaultStatisticalCategoryDataset();
            
            statisticalBarRenderer.drawItem(null, null, null, combinedDomainCategoryPlot, null, null, defaultStatisticalCategoryDataset, -255, -255, -255);
        } finally {
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): True}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: drawHorizontalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, statData, row, column);
 *  */
    @Test
    public void testDrawItem_ThrowClassCastException() throws Exception  {
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            Object object = createInstance("java.lang.Object");
            objects[0] = object;
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset = new DefaultStatisticalCategoryDataset();
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
                org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(CategoryPlot.java:721)
                org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:814)
                org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:802)
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:240)
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawItem(StatisticalBarRenderer.java:208) */
            statisticalBarRenderer.drawItem(null, null, null, categoryPlot, null, null, defaultStatisticalCategoryDataset, -255, -255, -255);
        } finally {
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.HORIZONTAL): False}
 * @utbot.executesCondition {@code (orientation == PlotOrientation.VERTICAL): True}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: drawVerticalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, statData, row, column);
 *  */
    @Test
    public void testDrawItem_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setOrientation(vertical);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = {};
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset = new DefaultStatisticalCategoryDataset();
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawItem] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
                org.jfree.chart.util.ObjectList.get(ObjectList.java:87)
                org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(CategoryPlot.java:721)
                org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:814)
                org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:802)
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:383)
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawItem(StatisticalBarRenderer.java:212) */
            statisticalBarRenderer.drawItem(null, null, null, categoryPlot, null, null, defaultStatisticalCategoryDataset, -255, -255, -255);
        } finally {
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.category.CategoryDataset,int,int,int)}
 * @utbot.invokes {@link org.jfree.chart.plot.CategoryPlot#getOrientation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PlotOrientation orientation = plot.getOrientation();
 *  */
    @Test
    public void testDrawItem_ThrowNullPointerException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset = new DefaultStatisticalCategoryDataset();
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawItem] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.StatisticalBarRenderer.drawItem(StatisticalBarRenderer.java:206) */
        statisticalBarRenderer.drawItem(null, null, null, null, null, null, defaultStatisticalCategoryDataset, -255, -255, -255);
    }
    ///endregion
    
    ///region Errors report for drawItem
    
    public void testDrawItem_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawHorizontalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.statistics.StatisticalCategoryDataset, int, int)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:87)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(CategoryPlot.java:721)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:814)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:802)
            org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:240) */
        statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowClassCastException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(CategoryPlot.java:721)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:814)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:802)
            org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:240) */
        statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.CategoryItemRendererState#getBarWidth()}
 * @utbot.invokes {@link org.jfree.data.statistics.StatisticalCategoryDataset#getMeanValue(int,int)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link org.utbot.engine.overrides.collections.UtArrayList#preconditionCheck()}
 * @utbot.invokes org.utbot.engine.overrides.collections.UtArrayList#rangeCheck(int)
 * @utbot.invokes {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.invokes {@link org.jfree.data.statistics.StatisticalCategoryDataset#getMeanValue(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Number meanValue = dataset.getMeanValue(row, column);
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowClassCastException_1() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name3);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name4 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name4);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name5 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name5);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", 1);
            CategoryItemRendererState categoryItemRendererState = new CategoryItemRendererState(null);
            categoryItemRendererState.setBarWidth(0.0);
            Rectangle rectangle = new Rectangle(0, 0, 0, 0);
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
            subCategoryAxis.setLowerMargin(0.0);
            subCategoryAxis.setUpperMargin(0.0);
            DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset = ((DefaultStatisticalCategoryDataset) createInstance("org.jfree.data.statistics.DefaultStatisticalCategoryDataset"));
            KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
            ArrayList rows = new ArrayList();
            Object object = createInstance("java.lang.Object");
            rows.add(object);
            setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
            setField(defaultStatisticalCategoryDataset, "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "data", data);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
                org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:109)
                org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getMeanValue(DefaultStatisticalCategoryDataset.java:109)
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:258) */
            statisticalBarRenderer.drawHorizontalItem(null, categoryItemRendererState, rectangle, combinedRangeCategoryPlot, subCategoryAxis, null, defaultStatisticalCategoryDataset, 0, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowNullPointerException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:240) */
        statisticalBarRenderer.drawHorizontalItem(null, null, null, null, null, null, null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rectY = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowNullPointerException_6() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevRIGHT = RectangleEdge.RIGHT;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge right = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.RIGHT";
            setField(right, "org.jfree.chart.util.RectangleEdge", "name", name);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "RIGHT", right);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:243) */
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "RIGHT", prevRIGHT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rectY = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowNullPointerException_1() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name1);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:243) */
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rectY = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowNullPointerException_7() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name1);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "TOP", top);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(vertical);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:243) */
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rectY = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowNullPointerException_2() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name1 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name1);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name2 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name2);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "TOP", top);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(vertical);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:243) */
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rectY = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowNullPointerException_4() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name2 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name2);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name3);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(vertical);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:243) */
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rectY = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowNullPointerException_3() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name3 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name3);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name4 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name4);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(vertical);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:243) */
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rectY = rectY + row * state.getBarWidth();
 *  */
    @Test
    public void testDrawHorizontalItem_ThrowNullPointerException_5() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevRIGHT = RectangleEdge.RIGHT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge right = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name2 = "RectangleEdge.RIGHT";
            setField(right, "org.jfree.chart.util.RectangleEdge", "name", name2);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "RIGHT", right);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name3);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name4 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name4);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name5 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name5);
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", 1);
            java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
            subCategoryAxis.setLowerMargin(0.0);
            subCategoryAxis.setUpperMargin(0.0);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawHorizontalItem(StatisticalBarRenderer.java:254) */
            statisticalBarRenderer.drawHorizontalItem(null, null, float1, combinedRangeCategoryPlot, subCategoryAxis, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "RIGHT", prevRIGHT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawHorizontalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.statistics.StatisticalCategoryDataset, int, int)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawHorizontalItem_ThrowIllegalArgumentException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawHorizontalItem_ThrowIllegalStateException_4() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name = "PlotOrientation.VERTICAL";
            setField(vertical, "org.jfree.chart.plot.PlotOrientation", "name", name);
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name1 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name1);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            combinedRangeCategoryPlot.setOrientation(orientation);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawHorizontalItem_ThrowIllegalStateException() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name3 = "AxisLocation.BOTTOM_OR_LEFT";
            setField(bottomOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name3);
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            combinedRangeCategoryPlot.setOrientation(orientation);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            objects[0] = ((Object) axisLocation);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawHorizontalItem_ThrowIllegalStateException_3() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name1 = "PlotOrientation.VERTICAL";
            setField(vertical, "org.jfree.chart.plot.PlotOrientation", "name", name1);
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name2 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name2);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            combinedRangeCategoryPlot.setOrientation(orientation);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawHorizontalItem_ThrowIllegalStateException_2() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name2 = "PlotOrientation.VERTICAL";
            setField(vertical, "org.jfree.chart.plot.PlotOrientation", "name", name2);
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name3 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name3);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            combinedRangeCategoryPlot.setOrientation(orientation);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawHorizontalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawHorizontalItem_ThrowIllegalStateException_1() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name3 = "PlotOrientation.VERTICAL";
            setField(vertical, "org.jfree.chart.plot.PlotOrientation", "name", name3);
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name4 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name4);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            combinedRangeCategoryPlot.setOrientation(orientation);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            statisticalBarRenderer.drawHorizontalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    ///endregion
    
    ///region Errors report for drawHorizontalItem
    
    public void testDrawHorizontalItem_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawVerticalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.statistics.StatisticalCategoryDataset, int, int)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDrawVerticalItem_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = {};
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ObjectList.get(ObjectList.java:87)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(CategoryPlot.java:721)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:814)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:802)
            org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:383) */
        statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDrawVerticalItem_ThrowClassCastException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.chart.axis.AxisLocation (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.chart.axis.AxisLocation is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(CategoryPlot.java:721)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:814)
            org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(CategoryPlot.java:802)
            org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:383) */
        statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Number meanValue = dataset.getMeanValue(row, column);
 *  */
    @Test
    public void testDrawVerticalItem_ThrowClassCastException_1() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name3);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name4 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name4);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name5 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name5);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", 1);
            CategoryStepRenderer.State state = new CategoryStepRenderer.State(null);
            state.setBarWidth(0.0);
            Rectangle rectangle = new Rectangle(0, 0, 0, 0);
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
            subCategoryAxis.setLowerMargin(0.0);
            subCategoryAxis.setUpperMargin(0.0);
            DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset = ((DefaultStatisticalCategoryDataset) createInstance("org.jfree.data.statistics.DefaultStatisticalCategoryDataset"));
            KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
            ArrayList rows = new ArrayList();
            Object object = createInstance("java.lang.Object");
            rows.add(object);
            setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
            setField(defaultStatisticalCategoryDataset, "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "data", data);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jfree.data.KeyedObjects (java.lang.Object is in module java.base of loader 'bootstrap'; org.jfree.data.KeyedObjects is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
                org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:109)
                org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getMeanValue(DefaultStatisticalCategoryDataset.java:109)
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:402) */
            statisticalBarRenderer.drawVerticalItem(null, state, rectangle, combinedRangeCategoryPlot, subCategoryAxis, null, defaultStatisticalCategoryDataset, 0, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes org.utbot.engine.overrides.collections.UtArrayList#rangeCheck(int)
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.invokes {@link org.jfree.data.KeyedObjects2D#getObject(int,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Number meanValue = dataset.getMeanValue(row, column);
 *  */
    @Test
    public void testDrawVerticalItem_ThrowIndexOutOfBoundsException() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name3);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name4 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name4);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name5 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name5);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", 1);
            CategoryItemRendererState categoryItemRendererState = new CategoryItemRendererState(null);
            categoryItemRendererState.setBarWidth(0.0);
            Rectangle rectangle = new Rectangle(0, 0, 0, 0);
            CategoryPlot categoryPlot = ((CategoryPlot) createInstance("org.jfree.chart.plot.CategoryPlot"));
            categoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(categoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
            subCategoryAxis.setLowerMargin(0.0);
            subCategoryAxis.setUpperMargin(0.0);
            DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset = ((DefaultStatisticalCategoryDataset) createInstance("org.jfree.data.statistics.DefaultStatisticalCategoryDataset"));
            KeyedObjects2D data = ((KeyedObjects2D) createInstance("org.jfree.data.KeyedObjects2D"));
            ArrayList rows = new ArrayList();
            rows.add(null);
            rows.add(null);
            rows.add(null);
            setField(data, "org.jfree.data.KeyedObjects2D", "rows", rows);
            setField(defaultStatisticalCategoryDataset, "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "data", data);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.get(ArrayList.java:427)
                org.jfree.data.KeyedObjects2D.getObject(KeyedObjects2D.java:109)
                org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getMeanValue(DefaultStatisticalCategoryDataset.java:109)
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:402) */
            statisticalBarRenderer.drawVerticalItem(null, categoryItemRendererState, rectangle, categoryPlot, subCategoryAxis, null, defaultStatisticalCategoryDataset, -1, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test
    public void testDrawVerticalItem_ThrowNullPointerException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        
        /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.NullPointerException]
            org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:383) */
        statisticalBarRenderer.drawVerticalItem(null, null, null, null, null, null, null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rectX = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
 *  */
    @Test
    public void testDrawVerticalItem_ThrowNullPointerException_8() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevRIGHT = RectangleEdge.RIGHT;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge right = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name = "RectangleEdge.RIGHT";
            setField(right, "org.jfree.chart.util.RectangleEdge", "name", name);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "RIGHT", right);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:386) */
            statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "RIGHT", prevRIGHT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rectX = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
 *  */
    @Test
    public void testDrawVerticalItem_ThrowNullPointerException_1() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name1);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:386) */
            statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rectX = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
 *  */
    @Test
    public void testDrawVerticalItem_ThrowNullPointerException_9() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name1 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name1);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "TOP", top);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(vertical);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:386) */
            statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rectX = rectX + row * state.getBarWidth();
 *  */
    @Test
    public void testDrawVerticalItem_ThrowNullPointerException_6() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name1 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name1);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name2 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name2);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "TOP", top);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", 2);
            Rectangle rectangle = new Rectangle(0, 0, 0, 0);
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(vertical);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
            subCategoryAxis.setLowerMargin(0.0);
            subCategoryAxis.setUpperMargin(0.0);
            subCategoryAxis.setCategoryMargin(0.0);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:398) */
            statisticalBarRenderer.drawVerticalItem(null, null, rectangle, combinedRangeCategoryPlot, subCategoryAxis, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rectX = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, xAxisLocation);
 *  */
    @Test
    public void testDrawVerticalItem_ThrowNullPointerException_4() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name2 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name2);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name3);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(vertical);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:386) */
            statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rectX = rectX + row * (state.getBarWidth() + seriesGap);
 *  */
    @Test
    public void testDrawVerticalItem_ThrowNullPointerException_2() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name3);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name4 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name4);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name5 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name5);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            statisticalBarRenderer.setItemMargin(0.0);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 2);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", 1);
            Rectangle rectangle = new Rectangle(0, 0, 0, 0);
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
            subCategoryAxis.setLowerMargin(0.0);
            subCategoryAxis.setUpperMargin(0.0);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:395) */
            statisticalBarRenderer.drawVerticalItem(null, null, rectangle, combinedRangeCategoryPlot, subCategoryAxis, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rectX = rectX + row * state.getBarWidth();
 *  */
    @Test
    public void testDrawVerticalItem_ThrowNullPointerException_5() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevRIGHT = RectangleEdge.RIGHT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge right = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name2 = "RectangleEdge.RIGHT";
            setField(right, "org.jfree.chart.util.RectangleEdge", "name", name2);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "RIGHT", right);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name3);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name4 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name4);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name5 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name5);
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", 2);
            Rectangle rectangle = new Rectangle(0, 0, 0, 0);
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
            subCategoryAxis.setLowerMargin(0.0);
            subCategoryAxis.setUpperMargin(0.0);
            subCategoryAxis.setCategoryMargin(0.0);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:398) */
            statisticalBarRenderer.drawVerticalItem(null, null, rectangle, combinedRangeCategoryPlot, subCategoryAxis, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "RIGHT", prevRIGHT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rectX = rectX + row * state.getBarWidth();
 *  */
    @Test
    public void testDrawVerticalItem_ThrowNullPointerException_7() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name3 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name3);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name4 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name4);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name5 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name5);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 1);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", 2);
            Rectangle rectangle = new Rectangle(0, 0, 0, 0);
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(vertical);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
            subCategoryAxis.setLowerMargin(0.0);
            subCategoryAxis.setUpperMargin(0.0);
            subCategoryAxis.setCategoryMargin(0.0);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:398) */
            statisticalBarRenderer.drawVerticalItem(null, null, rectangle, combinedRangeCategoryPlot, subCategoryAxis, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.jfree.chart.renderer.category.CategoryItemRendererState#getBarWidth()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number meanValue = dataset.getMeanValue(row, column);
 *  */
    @Test
    public void testDrawVerticalItem_ThrowNullPointerException_3() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        RectangleEdge prevLEFT = RectangleEdge.LEFT;
        RectangleEdge prevTOP = RectangleEdge.TOP;
        RectangleEdge prevBOTTOM = RectangleEdge.BOTTOM;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            RectangleEdge left = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name3 = "RectangleEdge.LEFT";
            setField(left, "org.jfree.chart.util.RectangleEdge", "name", name3);
            Class rectangleEdgeClazz = Class.forName("org.jfree.chart.util.RectangleEdge");
            setStaticField(rectangleEdgeClazz, "LEFT", left);
            RectangleEdge top = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name4 = "RectangleEdge.TOP";
            setField(top, "org.jfree.chart.util.RectangleEdge", "name", name4);
            setStaticField(rectangleEdgeClazz, "TOP", top);
            RectangleEdge bottom = ((RectangleEdge) createInstance("org.jfree.chart.util.RectangleEdge"));
            String name5 = "RectangleEdge.BOTTOM";
            setField(bottom, "org.jfree.chart.util.RectangleEdge", "name", name5);
            setStaticField(rectangleEdgeClazz, "BOTTOM", bottom);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            statisticalBarRenderer.setItemMargin(0.0);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "rowCount", 2);
            setField(statisticalBarRenderer, "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer", "columnCount", 1);
            CategoryItemRendererState categoryItemRendererState = new CategoryItemRendererState(null);
            categoryItemRendererState.setBarWidth(0.0);
            Rectangle rectangle = new Rectangle(0, 0, 0, 0);
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            combinedRangeCategoryPlot.setOrientation(horizontal);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            SubCategoryAxis subCategoryAxis = ((SubCategoryAxis) createInstance("org.jfree.chart.axis.SubCategoryAxis"));
            subCategoryAxis.setLowerMargin(0.0);
            subCategoryAxis.setUpperMargin(0.0);
            
            /* This test fails because method [org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem] produces [java.lang.NullPointerException]
                org.jfree.chart.renderer.category.StatisticalBarRenderer.drawVerticalItem(StatisticalBarRenderer.java:402) */
            statisticalBarRenderer.drawVerticalItem(null, categoryItemRendererState, rectangle, combinedRangeCategoryPlot, subCategoryAxis, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
            setStaticField(RectangleEdge.class, "LEFT", prevLEFT);
            setStaticField(RectangleEdge.class, "TOP", prevTOP);
            setStaticField(RectangleEdge.class, "BOTTOM", prevBOTTOM);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method drawVerticalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.statistics.StatisticalCategoryDataset, int, int)
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDrawVerticalItem_ThrowIllegalArgumentException() throws Exception  {
        StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
        CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
        ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
        objects[0] = ((Object) axisLocation);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
        
        statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawVerticalItem_ThrowIllegalStateException_4() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name = "PlotOrientation.VERTICAL";
            setField(vertical, "org.jfree.chart.plot.PlotOrientation", "name", name);
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name1 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name1);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            combinedRangeCategoryPlot.setOrientation(orientation);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawVerticalItem_ThrowIllegalStateException() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name3 = "AxisLocation.BOTTOM_OR_LEFT";
            setField(bottomOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name3);
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            combinedRangeCategoryPlot.setOrientation(orientation);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            AxisLocation axisLocation = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            objects[0] = ((Object) axisLocation);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawVerticalItem_ThrowIllegalStateException_3() throws Exception  {
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name1 = "PlotOrientation.VERTICAL";
            setField(vertical, "org.jfree.chart.plot.PlotOrientation", "name", name1);
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name2 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name2);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            combinedRangeCategoryPlot.setOrientation(orientation);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) topOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawVerticalItem_ThrowIllegalStateException_2() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name2 = "PlotOrientation.VERTICAL";
            setField(vertical, "org.jfree.chart.plot.PlotOrientation", "name", name2);
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name3 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name3);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            combinedRangeCategoryPlot.setOrientation(orientation);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrRight);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StatisticalBarRenderer}
 * @utbot.methodUnderTest {@link org.jfree.chart.renderer.category.StatisticalBarRenderer#drawVerticalItem(java.awt.Graphics2D,org.jfree.chart.renderer.category.CategoryItemRendererState,java.awt.geom.Rectangle2D,org.jfree.chart.plot.CategoryPlot,org.jfree.chart.axis.CategoryAxis,org.jfree.chart.axis.ValueAxis,org.jfree.data.statistics.StatisticalCategoryDataset,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDrawVerticalItem_ThrowIllegalStateException_1() throws Exception  {
        AxisLocation prevBOTTOM_OR_RIGHT = AxisLocation.BOTTOM_OR_RIGHT;
        AxisLocation prevTOP_OR_RIGHT = AxisLocation.TOP_OR_RIGHT;
        AxisLocation prevTOP_OR_LEFT = AxisLocation.TOP_OR_LEFT;
        AxisLocation prevBOTTOM_OR_LEFT = AxisLocation.BOTTOM_OR_LEFT;
        PlotOrientation prevVERTICAL = PlotOrientation.VERTICAL;
        PlotOrientation prevHORIZONTAL = PlotOrientation.HORIZONTAL;
        try {
            AxisLocation bottomOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name = "AxisLocation.BOTTOM_OR_RIGHT";
            setField(bottomOrRight, "org.jfree.chart.axis.AxisLocation", "name", name);
            Class axisLocationClazz = Class.forName("org.jfree.chart.axis.AxisLocation");
            setStaticField(axisLocationClazz, "BOTTOM_OR_RIGHT", bottomOrRight);
            AxisLocation topOrRight = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name1 = "AxisLocation.TOP_OR_RIGHT";
            setField(topOrRight, "org.jfree.chart.axis.AxisLocation", "name", name1);
            setStaticField(axisLocationClazz, "TOP_OR_RIGHT", topOrRight);
            AxisLocation topOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            String name2 = "AxisLocation.TOP_OR_LEFT";
            setField(topOrLeft, "org.jfree.chart.axis.AxisLocation", "name", name2);
            setStaticField(axisLocationClazz, "TOP_OR_LEFT", topOrLeft);
            AxisLocation bottomOrLeft = ((AxisLocation) createInstance("org.jfree.chart.axis.AxisLocation"));
            setStaticField(axisLocationClazz, "BOTTOM_OR_LEFT", bottomOrLeft);
            PlotOrientation vertical = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name3 = "PlotOrientation.VERTICAL";
            setField(vertical, "org.jfree.chart.plot.PlotOrientation", "name", name3);
            Class plotOrientationClazz = Class.forName("org.jfree.chart.plot.PlotOrientation");
            setStaticField(plotOrientationClazz, "VERTICAL", vertical);
            PlotOrientation horizontal = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            String name4 = "PlotOrientation.HORIZONTAL";
            setField(horizontal, "org.jfree.chart.plot.PlotOrientation", "name", name4);
            setStaticField(plotOrientationClazz, "HORIZONTAL", horizontal);
            StatisticalBarRenderer statisticalBarRenderer = ((StatisticalBarRenderer) createInstance("org.jfree.chart.renderer.category.StatisticalBarRenderer"));
            CombinedRangeCategoryPlot combinedRangeCategoryPlot = ((CombinedRangeCategoryPlot) createInstance("org.jfree.chart.plot.CombinedRangeCategoryPlot"));
            PlotOrientation orientation = ((PlotOrientation) createInstance("org.jfree.chart.plot.PlotOrientation"));
            combinedRangeCategoryPlot.setOrientation(orientation);
            ObjectList domainAxisLocations = ((ObjectList) createInstance("org.jfree.chart.util.ObjectList"));
            java.lang.Object[] objects = new java.lang.Object[1];
            objects[0] = ((Object) bottomOrLeft);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
            setField(domainAxisLocations, "org.jfree.chart.util.AbstractObjectList", "size", 1);
            setField(combinedRangeCategoryPlot, "org.jfree.chart.plot.CategoryPlot", "domainAxisLocations", domainAxisLocations);
            
            statisticalBarRenderer.drawVerticalItem(null, null, null, combinedRangeCategoryPlot, null, null, null, -255, -255);
        } finally {
            setStaticField(AxisLocation.class, "BOTTOM_OR_RIGHT", prevBOTTOM_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_RIGHT", prevTOP_OR_RIGHT);
            setStaticField(AxisLocation.class, "TOP_OR_LEFT", prevTOP_OR_LEFT);
            setStaticField(AxisLocation.class, "BOTTOM_OR_LEFT", prevBOTTOM_OR_LEFT);
            setStaticField(PlotOrientation.class, "VERTICAL", prevVERTICAL);
            setStaticField(PlotOrientation.class, "HORIZONTAL", prevHORIZONTAL);
        }
    }
    ///endregion
    
    ///region Errors report for drawVerticalItem
    
    public void testDrawVerticalItem_errors()
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
        
                java.lang.reflect.Method methodForGetDeclaredFields800362050402200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields800362050402200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass800362050411200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields800362050402200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass800362050411200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields800362050795700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields800362050795700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass800362050799400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields800362050795700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass800362050799400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields800362051143800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields800362051143800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass800362051147200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields800362051143800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass800362051147200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


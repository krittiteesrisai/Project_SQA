package org.jfree.chart.util;

import org.junit.Test;
import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.lang.reflect.Method;
import java.awt.geom.Line2D;
import java.lang.reflect.InvocationTargetException;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_jfree_chart_util_ShapeUtilitiesTest {
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone(java.awt.Shape)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#clone(java.awt.Shape)}
 * @utbot.executesCondition {@code (shape instanceof Cloneable): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testClone_NotShapeNotInstanceOfCloneable() {
        Shape actual = ShapeUtilities.clone(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for clone
    
    public void testClone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#contains(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getX()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getY()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getX()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getY()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getWidth()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getHeight()}
 * @utbot.returnsFrom {@code return ((x >= x0) && (y >= y0) && ((x + w) <= (x0 + rect1.getWidth())) && ((y + h) <= (y0 + rect1.getHeight())));}
 *  */
    @Test
    public void testContains_XLessThanX0AndYLessThanY0AndXPlusWGreaterThanX0PlusRect1GetWidthAndYPlusHGreaterThanY0PlusRect1GetHeight() {
        Rectangle rectangle = new Rectangle(588308529, 0, 0, 0);
        Rectangle rectangle1 = new Rectangle(-186689553, 0, 0, 0);
        
        boolean actual = ShapeUtilities.contains(rectangle, rectangle1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#contains(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getX()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x0 = rect1.getX();
 *  */
    @Test
    public void testContains_ThrowNullPointerException() {
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.contains] produces [java.lang.NullPointerException]
            org.jfree.chart.util.ShapeUtilities.contains(ShapeUtilities.java:562) */
        ShapeUtilities.contains(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#contains(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getX()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getY()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x = rect2.getX();
 *  */
    @Test
    public void testContains_ThrowNullPointerException_1() {
        Rectangle rectangle = new Rectangle(0, 0, 0, 0);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.contains] produces [java.lang.NullPointerException]
            org.jfree.chart.util.ShapeUtilities.contains(ShapeUtilities.java:564) */
        ShapeUtilities.contains(rectangle, null);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method contains(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.util.ShapeUtilities}
     * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#contains(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D)}
     */
    @Test(timeout = 1000L)
    public void testContains() {
        Rectangle rectangle = new Rectangle(0, 0, 0, -1);
        rectangle.height = 255;
        rectangle.y = -2143289344;
        rectangle.width = -262145;
        rectangle.x = Integer.MIN_VALUE;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        ShapeUtilities.contains(rectangle, null);
    }
    ///endregion
    
    ///region Errors report for contains
    
    public void testContains_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.equal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equal(java.awt.Shape, java.awt.Shape)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.Shape,java.awt.Shape)}
 * @utbot.executesCondition {@code (s1 instanceof Line2D && s2 instanceof Line2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Ellipse2D && s2 instanceof Ellipse2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Arc2D && s2 instanceof Arc2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Polygon && s2 instanceof Polygon): False}
 * @utbot.executesCondition {@code (s1 instanceof GeneralPath && s2 instanceof GeneralPath): True}
 * @utbot.returnsFrom {@code return equal((GeneralPath) s1, (GeneralPath) s2);}
 *  */
    @Test
    public void testEqual_S1InstanceOfGeneralPathAndS2InstanceOfGeneralPath() throws Exception  {
        GeneralPath generalPath = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        generalPath.setWindingRule(-1);
        GeneralPath generalPath1 = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class generalPathType = Class.forName("java.awt.Shape");
        Method equalMethod = shapeUtilitiesClazz.getDeclaredMethod("equal", generalPathType, generalPathType);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = generalPath;
        equalMethodArguments[1] = generalPath1;
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.Shape,java.awt.Shape)}
 * @utbot.executesCondition {@code (s1 instanceof Line2D && s2 instanceof Line2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Ellipse2D && s2 instanceof Ellipse2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Arc2D && s2 instanceof Arc2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Polygon && s2 instanceof Polygon): False}
 * @utbot.executesCondition {@code (s1 instanceof GeneralPath && s2 instanceof GeneralPath): False}
 * @utbot.returnsFrom {@code return ObjectUtilities.equal(s1, s2);}
 *  */
    @Test
    public void testEqual_S1NotInstanceOfGeneralPathAndS2NotInstanceOfGeneralPath() {
        boolean actual = ShapeUtilities.equal(((Shape) null), ((Shape) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.Shape,java.awt.Shape)}
 * @utbot.executesCondition {@code (s1 instanceof Line2D && s2 instanceof Line2D): True}
 * @utbot.executesCondition {@code (s1 instanceof Ellipse2D && s2 instanceof Ellipse2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Ellipse2D && s2 instanceof Ellipse2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Arc2D && s2 instanceof Arc2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Polygon && s2 instanceof Polygon): False}
 * @utbot.executesCondition {@code (s1 instanceof GeneralPath && s2 instanceof GeneralPath): False}
 * @utbot.returnsFrom {@code return ObjectUtilities.equal(s1, s2);}
 *  */
    @Test
    public void testEqual_S1NotInstanceOfEllipse2DAndS2NotInstanceOfEllipse2D() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float();
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Method equalMethod = shapeUtilitiesClazz.getDeclaredMethod("equal", float1Type, float1Type);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = float1;
        equalMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.Shape,java.awt.Shape)}
 * @utbot.executesCondition {@code (s1 instanceof Line2D && s2 instanceof Line2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Ellipse2D && s2 instanceof Ellipse2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Arc2D && s2 instanceof Arc2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Polygon && s2 instanceof Polygon): False}
 * @utbot.executesCondition {@code (s1 instanceof GeneralPath && s2 instanceof GeneralPath): True}
 * @utbot.returnsFrom {@code return equal((GeneralPath) s1, (GeneralPath) s2);}
 *  */
    @Test
    public void testEqual_S1InstanceOfGeneralPathAndS2InstanceOfGeneralPath_1() throws Exception  {
        GeneralPath generalPath = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class generalPathType = Class.forName("java.awt.Shape");
        Method equalMethod = shapeUtilitiesClazz.getDeclaredMethod("equal", generalPathType, generalPathType);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = generalPath;
        equalMethodArguments[1] = generalPath;
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.Shape,java.awt.Shape)}
 * @utbot.executesCondition {@code (s1 instanceof Line2D && s2 instanceof Line2D): True}
 * @utbot.executesCondition {@code (s1 instanceof Ellipse2D && s2 instanceof Ellipse2D): True}
 * @utbot.invokes {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Line2D,java.awt.geom.Line2D)}
 * @utbot.returnsFrom {@code return equal((Line2D) s1, (Line2D) s2);}
 *  */
    @Test
    public void testEqual_S1InstanceOfEllipse2DAndS2InstanceOfEllipse2D() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.awt.geom.Line2D.Double double1 = new java.awt.geom.Line2D.Double();
        double1.x1 = -8.008332380732404E-145;
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float();
        float1.x1 = -2.939118E-39f;
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class double1Type = Class.forName("java.awt.Shape");
        Method equalMethod = shapeUtilitiesClazz.getDeclaredMethod("equal", double1Type, double1Type);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = double1;
        equalMethodArguments[1] = float1;
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.Shape,java.awt.Shape)}
 * @utbot.executesCondition {@code (s1 instanceof Line2D && s2 instanceof Line2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Ellipse2D && s2 instanceof Ellipse2D): True}
 * @utbot.executesCondition {@code (s1 instanceof Arc2D && s2 instanceof Arc2D): True}
 * @utbot.invokes {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Ellipse2D,java.awt.geom.Ellipse2D)}
 * @utbot.returnsFrom {@code return equal((Ellipse2D) s1, (Ellipse2D) s2);}
 *  */
    @Test
    public void testEqual_S1InstanceOfArc2DAndS2InstanceOfArc2D() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.awt.geom.Ellipse2D.Double double1 = new java.awt.geom.Ellipse2D.Double();
        double1.x = 4.9E-324;
        java.awt.geom.Ellipse2D.Double double2 = new java.awt.geom.Ellipse2D.Double();
        double2.x = java.lang.Double.NaN;
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class double1Type = Class.forName("java.awt.Shape");
        Method equalMethod = shapeUtilitiesClazz.getDeclaredMethod("equal", double1Type, double1Type);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = double1;
        equalMethodArguments[1] = double2;
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equal(java.awt.Shape, java.awt.Shape)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.Shape,java.awt.Shape)}
 * @utbot.executesCondition {@code (s1 instanceof Line2D && s2 instanceof Line2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Ellipse2D && s2 instanceof Ellipse2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Arc2D && s2 instanceof Arc2D): False}
 * @utbot.executesCondition {@code (s1 instanceof Polygon && s2 instanceof Polygon): False}
 * @utbot.executesCondition {@code (s1 instanceof GeneralPath && s2 instanceof GeneralPath): True}
 * @utbot.invokes {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.GeneralPath,java.awt.geom.GeneralPath)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return equal((GeneralPath) s1, (GeneralPath) s2);
 *  */
    @Test
    public void testEqual_ThrowIndexOutOfBoundsException() throws Throwable  {
        GeneralPath generalPath = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        byte[] pointTypes = {};
        setField(generalPath, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(generalPath, "java.awt.geom.Path2D", "numTypes", 1);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.equal] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class generalPathType = Class.forName("java.awt.Shape");
        Method equalMethod = shapeUtilitiesClazz.getDeclaredMethod("equal", generalPathType, generalPathType);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = generalPath;
        equalMethodArguments[1] = generalPath;
        try {
            equalMethod.invoke(null, equalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method equal(java.awt.Shape, java.awt.Shape)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.util.ShapeUtilities}
     * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.Shape,java.awt.Shape)}
     */
    @Test
    public void testEqualReturnsFalse() {
        Dimension dimension = new Dimension(-1, Integer.MIN_VALUE);
        dimension.height = 0;
        dimension.width = Integer.MIN_VALUE;
        Dimension dimension1 = new Dimension(dimension);
        dimension1.width = Integer.MIN_VALUE;
        dimension1.height = -1;
        Rectangle rectangle = new Rectangle(dimension1);
        rectangle.y = 5;
        rectangle.x = 1;
        rectangle.width = Integer.MAX_VALUE;
        rectangle.height = 0;
        
        boolean actual = ShapeUtilities.equal(rectangle, ((Shape) null));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equal(java.awt.Shape, java.awt.Shape)
    
    @Test
    public void testEqual1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.awt.geom.Ellipse2D.Float float1 = new java.awt.geom.Ellipse2D.Float();
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Method equalMethod = shapeUtilitiesClazz.getDeclaredMethod("equal", float1Type, float1Type);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = float1;
        equalMethodArguments[1] = float1;
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testEqual2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float();
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Method equalMethod = shapeUtilitiesClazz.getDeclaredMethod("equal", float1Type, float1Type);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = float1;
        equalMethodArguments[1] = float1;
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testEqual3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.awt.geom.Ellipse2D.Float float1 = new java.awt.geom.Ellipse2D.Float();
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Method equalMethod = shapeUtilitiesClazz.getDeclaredMethod("equal", float1Type, float1Type);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = float1;
        equalMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testEqual4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.awt.geom.Line2D.Double double1 = new java.awt.geom.Line2D.Double();
        double1.x1 = 9.293754453266254E-38;
        double1.y1 = 1.2914815062726098E-39;
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float();
        float1.x1 = 9.2937545E-38f;
        float1.y1 = 1.291482E-39f;
        float1.x2 = java.lang.Float.NaN;
        float1.y2 = java.lang.Float.NaN;
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class double1Type = Class.forName("java.awt.Shape");
        Method equalMethod = shapeUtilitiesClazz.getDeclaredMethod("equal", double1Type, double1Type);
        equalMethod.setAccessible(true);
        java.lang.Object[] equalMethodArguments = new java.lang.Object[2];
        equalMethodArguments[0] = double1;
        equalMethodArguments[1] = float1;
        boolean actual = ((Boolean) equalMethod.invoke(null, equalMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for equal
    
    public void testEqual_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
        // 8 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final int[] java.awt.geom.Path2D$Iterator.curvecoords accessible: module
        java.desktop does not "opens java.awt.geom" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.equal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equal(java.awt.geom.GeneralPath, java.awt.geom.GeneralPath)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.GeneralPath,java.awt.geom.GeneralPath)}
 * @utbot.executesCondition {@code (p1 == null): False}
 * @utbot.executesCondition {@code (p2 == null): False}
 * @utbot.executesCondition {@code (p1.getWindingRule() != p2.getWindingRule()): True}
 *  */
    @Test
    public void testEqual_P1GetWindingRuleNotEqualsP2GetWindingRule() throws Exception  {
        GeneralPath generalPath = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        generalPath.setWindingRule(1);
        GeneralPath generalPath1 = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
        boolean actual = ShapeUtilities.equal(generalPath, generalPath1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.GeneralPath,java.awt.geom.GeneralPath)}
 * @utbot.executesCondition {@code (p1 == null): True}
 * @utbot.returnsFrom {@code return (p2 == null);}
 *  */
    @Test
    public void testEqual_P2EqualsNull() {
        boolean actual = ShapeUtilities.equal(((GeneralPath) null), ((GeneralPath) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.GeneralPath,java.awt.geom.GeneralPath)}
 * @utbot.executesCondition {@code (p1 == null): False}
 * @utbot.executesCondition {@code (p2 == null): False}
 * @utbot.executesCondition {@code (p1.getWindingRule() != p2.getWindingRule()): False}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#getPathIterator(java.awt.geom.AffineTransform)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#getPathIterator(java.awt.geom.AffineTransform)}
 * @utbot.invokes {@link java.awt.geom.PathIterator#isDone()}
 * @utbot.invokes {@link java.awt.geom.PathIterator#isDone()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqual_BooleanDoneInitializedByIterator1IsDoneAndIterator2IsDone() throws Exception  {
        GeneralPath generalPath = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        GeneralPath generalPath1 = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
        boolean actual = ShapeUtilities.equal(generalPath, generalPath1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equal(java.awt.geom.GeneralPath, java.awt.geom.GeneralPath)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.GeneralPath,java.awt.geom.GeneralPath)}
 * @utbot.executesCondition {@code (p1 == null): False}
 * @utbot.executesCondition {@code (p2 == null): False}
 * @utbot.executesCondition {@code (p1.getWindingRule() != p2.getWindingRule()): False}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#getWindingRule()}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#getWindingRule()}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#getPathIterator(java.awt.geom.AffineTransform)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#getPathIterator(java.awt.geom.AffineTransform)}
 * @utbot.invokes {@link java.awt.geom.PathIterator#isDone()}
 * @utbot.iterates iterate the loop {@code while(!done)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: int seg1 = iterator1.currentSegment(d1);
 *  */
    @Test
    public void testEqual_ThrowIndexOutOfBoundsException1() throws Exception  {
        GeneralPath generalPath = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        byte[] pointTypes = {};
        setField(generalPath, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(generalPath, "java.awt.geom.Path2D", "numTypes", 1);
        GeneralPath generalPath1 = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.equal] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        ShapeUtilities.equal(generalPath, generalPath1);
    }
    ///endregion
    
    ///region Errors report for equal
    
    public void testEqual_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final int[] java.awt.geom.Path2D$Iterator.curvecoords accessible: module
        java.desktop does not "opens java.awt.geom" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.equal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equal(java.awt.Polygon, java.awt.Polygon)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.Polygon,java.awt.Polygon)}
 * @utbot.executesCondition {@code (p1 == null): True}
 * @utbot.returnsFrom {@code return (p2 == null);}
 *  */
    @Test
    public void testEqual_P2EqualsNull1() {
        boolean actual = ShapeUtilities.equal(((Polygon) null), ((Polygon) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region Errors report for equal
    
    public void testEqual_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 169 occurrences of:
        // Concrete execution failed
        
        // 14 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.equal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equal(java.awt.geom.Line2D, java.awt.geom.Line2D)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Line2D,java.awt.geom.Line2D)}
 * @utbot.executesCondition {@code (l1 == null): False}
 * @utbot.executesCondition {@code (l2 == null): True}
 *  */
    @Test
    public void testEqual_L2EqualsNull() {
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float();
        
        boolean actual = ShapeUtilities.equal(float1, ((Line2D) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Line2D,java.awt.geom.Line2D)}
 * @utbot.executesCondition {@code (l1 == null): True}
 * @utbot.returnsFrom {@code return (l2 == null);}
 *  */
    @Test
    public void testEqual_L2NotEqualsNull() {
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float();
        
        boolean actual = ShapeUtilities.equal(((Line2D) null), float1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Line2D,java.awt.geom.Line2D)}
 * @utbot.executesCondition {@code (l1 == null): True}
 * @utbot.returnsFrom {@code return (l2 == null);}
 *  */
    @Test
    public void testEqual_L2EqualsNull_1() {
        boolean actual = ShapeUtilities.equal(((Line2D) null), ((Line2D) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Line2D,java.awt.geom.Line2D)}
 * @utbot.executesCondition {@code (l1 == null): False}
 * @utbot.executesCondition {@code (l2 == null): False}
 * @utbot.executesCondition {@code (!l1.getP1().equals(l2.getP1())): True}
 *  */
    @Test
    public void testEqual_NotL1GetP1Equals() {
        java.awt.geom.Line2D.Double double1 = new java.awt.geom.Line2D.Double();
        double1.x1 = 1.44132780261900288E17;
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float();
        float1.x1 = java.lang.Float.NaN;
        
        boolean actual = ShapeUtilities.equal(double1, float1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Line2D,java.awt.geom.Line2D)}
 * @utbot.executesCondition {@code (l1 == null): False}
 * @utbot.executesCondition {@code (l2 == null): False}
 * @utbot.executesCondition {@code (!l1.getP1().equals(l2.getP1())): False}
 * @utbot.executesCondition {@code (!l1.getP2().equals(l2.getP2())): True}
 *  */
    @Test
    public void testEqual_NotL1GetP2Equals() {
        java.awt.geom.Line2D.Double double1 = new java.awt.geom.Line2D.Double();
        double1.x1 = 1.000015377998352;
        double1.y1 = -1.125030755996704;
        double1.x2 = java.lang.Double.NaN;
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float();
        float1.x1 = 1.0000154f;
        float1.y1 = -1.1250308f;
        float1.x2 = 1.0f;
        
        boolean actual = ShapeUtilities.equal(double1, float1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Line2D,java.awt.geom.Line2D)}
 * @utbot.executesCondition {@code (l1 == null): False}
 * @utbot.executesCondition {@code (l2 == null): False}
 * @utbot.executesCondition {@code (!l1.getP1().equals(l2.getP1())): False}
 * @utbot.executesCondition {@code (!l1.getP2().equals(l2.getP2())): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqual_L1GetP2Equals() {
        java.awt.geom.Line2D.Double double1 = new java.awt.geom.Line2D.Double();
        double1.x1 = 6.1136720154628415E-30;
        double1.y1 = 8.886009110272104E-39;
        double1.x2 = 1.3125097751617432;
        double1.y2 = 7.693128569143246E-43;
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float();
        float1.x1 = 6.113672E-30f;
        float1.y1 = 8.886009E-39f;
        float1.x2 = 1.3125098f;
        float1.y2 = 7.7E-43f;
        
        boolean actual = ShapeUtilities.equal(double1, float1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.equal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equal(java.awt.geom.Ellipse2D, java.awt.geom.Ellipse2D)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Ellipse2D,java.awt.geom.Ellipse2D)}
 * @utbot.executesCondition {@code (e1 == null): False}
 * @utbot.executesCondition {@code (e2 == null): True}
 *  */
    @Test
    public void testEqual_E2EqualsNull() {
        java.awt.geom.Ellipse2D.Float float1 = new java.awt.geom.Ellipse2D.Float();
        
        boolean actual = ShapeUtilities.equal(float1, ((Ellipse2D) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Ellipse2D,java.awt.geom.Ellipse2D)}
 * @utbot.executesCondition {@code (e1 == null): True}
 * @utbot.returnsFrom {@code return (e2 == null);}
 *  */
    @Test
    public void testEqual_E2NotEqualsNull() {
        java.awt.geom.Ellipse2D.Float float1 = new java.awt.geom.Ellipse2D.Float();
        
        boolean actual = ShapeUtilities.equal(((Ellipse2D) null), float1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Ellipse2D,java.awt.geom.Ellipse2D)}
 * @utbot.executesCondition {@code (e1 == null): True}
 * @utbot.returnsFrom {@code return (e2 == null);}
 *  */
    @Test
    public void testEqual_E2EqualsNull_1() {
        boolean actual = ShapeUtilities.equal(((Ellipse2D) null), ((Ellipse2D) null));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Ellipse2D,java.awt.geom.Ellipse2D)}
 * @utbot.executesCondition {@code (e1 == null): False}
 * @utbot.executesCondition {@code (e2 == null): False}
 * @utbot.executesCondition {@code (!e1.getFrame().equals(e2.getFrame())): True}
 *  */
    @Test
    public void testEqual_NotE1GetFrameEquals() {
        java.awt.geom.Ellipse2D.Double double1 = new java.awt.geom.Ellipse2D.Double();
        double1.x = 2.0000000000000004;
        java.awt.geom.Ellipse2D.Double double2 = new java.awt.geom.Ellipse2D.Double();
        double2.x = 2.225073858507202E-308;
        
        boolean actual = ShapeUtilities.equal(double1, double2);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Ellipse2D,java.awt.geom.Ellipse2D)}
 * @utbot.executesCondition {@code (e1 == null): False}
 * @utbot.executesCondition {@code (e2 == null): False}
 * @utbot.executesCondition {@code (!e1.getFrame().equals(e2.getFrame())): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqual_E1GetFrameEquals() {
        java.awt.geom.Ellipse2D.Double double1 = new java.awt.geom.Ellipse2D.Double();
        double1.x = -2.4135050855659485E-212;
        double1.y = 4.9E-324;
        double1.height = 4.9E-324;
        java.awt.geom.Ellipse2D.Double double2 = new java.awt.geom.Ellipse2D.Double();
        double2.x = -2.4135050855659485E-212;
        double2.y = 4.9E-324;
        double2.height = 4.9E-324;
        
        boolean actual = ShapeUtilities.equal(double1, double2);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.equal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equal(java.awt.geom.Arc2D, java.awt.geom.Arc2D)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Arc2D,java.awt.geom.Arc2D)}
 * @utbot.executesCondition {@code (a1 == null): False}
 * @utbot.executesCondition {@code (a2 == null): False}
 * @utbot.executesCondition {@code (!a1.getFrame().equals(a2.getFrame())): False}
 * @utbot.executesCondition {@code (a1.getAngleStart() != a2.getAngleStart()): False}
 * @utbot.executesCondition {@code (a1.getAngleExtent() != a2.getAngleExtent()): False}
 * @utbot.executesCondition {@code (a1.getArcType() != a2.getArcType()): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqual_A1GetArcTypeEqualsA2GetArcType() throws Exception  {
        java.awt.geom.Arc2D.Double double1 = ((java.awt.geom.Arc2D.Double) createInstance("java.awt.geom.Arc2D$Double"));
        double1.x = -32.000001136693754;
        double1.y = 3.3283435860271336E-294;
        double1.width = 0.0;
        double1.height = 1.1125369292536007E-308;
        double1.start = 1.1125369292536007E-308;
        double1.extent = 4.9E-324;
        setField(double1, "java.awt.geom.Arc2D", "type", -255);
        java.awt.geom.Arc2D.Double double2 = ((java.awt.geom.Arc2D.Double) createInstance("java.awt.geom.Arc2D$Double"));
        double2.x = -32.000001136693754;
        double2.y = 3.3283435860271336E-294;
        double2.width = -0.0;
        double2.height = 1.1125369292536007E-308;
        double2.start = 1.1125369292536007E-308;
        double2.extent = 4.9E-324;
        setField(double2, "java.awt.geom.Arc2D", "type", -255);
        
        boolean actual = ShapeUtilities.equal(double1, double2);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Arc2D,java.awt.geom.Arc2D)}
 * @utbot.executesCondition {@code (a1 == null): False}
 * @utbot.executesCondition {@code (a2 == null): False}
 * @utbot.executesCondition {@code (!a1.getFrame().equals(a2.getFrame())): False}
 * @utbot.executesCondition {@code (a1.getAngleStart() != a2.getAngleStart()): False}
 * @utbot.executesCondition {@code (a1.getAngleExtent() != a2.getAngleExtent()): False}
 * @utbot.executesCondition {@code (a1.getArcType() != a2.getArcType()): True}
 *  */
    @Test
    public void testEqual_A1GetArcTypeNotEqualsA2GetArcType() throws Exception  {
        java.awt.geom.Arc2D.Double double1 = ((java.awt.geom.Arc2D.Double) createInstance("java.awt.geom.Arc2D$Double"));
        double1.x = 2.681638267546925E154;
        double1.y = 6.208351184935518E-151;
        double1.width = 2.775826407647986E-135;
        double1.height = -5.747425599870625E-309;
        double1.start = -2.2250823485767926E-308;
        double1.extent = -2.225074212168787E-308;
        setField(double1, "java.awt.geom.Arc2D", "type", 1);
        java.awt.geom.Arc2D.Double double2 = ((java.awt.geom.Arc2D.Double) createInstance("java.awt.geom.Arc2D$Double"));
        double2.x = 2.681638267546925E154;
        double2.y = 6.208351184935518E-151;
        double2.width = 2.775826407647986E-135;
        double2.height = -5.747425599870625E-309;
        double2.start = -2.2250823485767926E-308;
        double2.extent = -2.225074212168787E-308;
        
        boolean actual = ShapeUtilities.equal(double1, double2);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#equal(java.awt.geom.Arc2D,java.awt.geom.Arc2D)}
 * @utbot.executesCondition {@code (a1 == null): True}
 * @utbot.returnsFrom {@code return (a2 == null);}
 *  */
    @Test
    public void testEqual_A2EqualsNull() {
        boolean actual = ShapeUtilities.equal(((Arc2D) null), ((Arc2D) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region Errors report for equal
    
    public void testEqual_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.createDiagonalCross
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDiagonalCross(float, float)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createDiagonalCross(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#moveTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#closePath()}
 * @utbot.returnsFrom {@code return p0;}
 *  */
    @Test
    public void testCreateDiagonalCross_GeneralPathLineTo() throws Exception  {
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        float prevSQRT2 = ((Float) getStaticFieldValue(shapeUtilitiesClazz, "SQRT2"));
        try {
            setStaticField(shapeUtilitiesClazz, "SQRT2", 5.252E-42f);
            
            GeneralPath actual = ((GeneralPath) ShapeUtilities.createDiagonalCross(java.lang.Float.NaN, java.lang.Float.NaN));
            
            GeneralPath expected = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
            
        } finally {
            setStaticField(ShapeUtilities.class, "SQRT2", prevSQRT2);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.createTranslatedShape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createTranslatedShape(java.awt.Shape, double, double)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.returnsFrom {@code return transform.createTransformedShape(shape);}
 *  */
    @Test
    public void testCreateTranslatedShape_ReturnTransformCreateTransformedShape() throws Exception  {
        Rectangle rectangle = new Rectangle(0, 0, -1073750018, 0);
        
        java.awt.geom.Path2D.Double actual = ((java.awt.geom.Path2D.Double) ShapeUtilities.createTranslatedShape(rectangle, 2.225073858507202E-308, java.lang.Double.NaN));
        
        java.awt.geom.Path2D.Double expected = ((java.awt.geom.Path2D.Double) createInstance("java.awt.geom.Path2D$Double"));
        
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.returnsFrom {@code return transform.createTransformedShape(shape);}
 *  */
    @Test
    public void testCreateTranslatedShape_ReturnTransformCreateTransformedShape_1() throws Exception  {
        java.awt.geom.Path2D.Double double1 = ((java.awt.geom.Path2D.Double) createInstance("java.awt.geom.Path2D$Double"));
        double[] doubleCoords = {};
        setField(double1, "java.awt.geom.Path2D$Double", "doubleCoords", doubleCoords);
        byte[] pointTypes = {(byte) 0};
        setField(double1, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(double1, "java.awt.geom.Path2D", "numTypes", 1);
        double1.setWindingRule(1);
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class double1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", double1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = double1;
        createTranslatedShapeMethodArguments[1] = 2.225073858507202E-308;
        createTranslatedShapeMethodArguments[2] = java.lang.Double.NaN;
        java.awt.geom.Path2D.Double actual = ((java.awt.geom.Path2D.Double) createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments));
        
        java.awt.geom.Path2D.Double expected = ((java.awt.geom.Path2D.Double) createInstance("java.awt.geom.Path2D$Double"));
        setField(expected, "java.awt.geom.Path2D$Double", "doubleCoords", doubleCoords);
        byte[] pointTypes1 = {(byte) 0};
        setField(expected, "java.awt.geom.Path2D", "pointTypes", pointTypes1);
        setField(expected, "java.awt.geom.Path2D", "numTypes", 1);
        expected.setWindingRule(1);
        
        double[] expectedDoubleCoords = ((double[]) getFieldValue(expected, "java.awt.geom.Path2D$Double", "doubleCoords"));
        double[] actualDoubleCoords = ((double[]) getFieldValue(actual, "java.awt.geom.Path2D$Double", "doubleCoords"));
        int expectedDoubleCoordsSize = expectedDoubleCoords.length;
        assertEquals(expectedDoubleCoordsSize, actualDoubleCoords.length);
        assertArrayEquals(expectedDoubleCoords, actualDoubleCoords, 1.0E-6);
        
        byte[] expectedPointTypes = ((byte[]) getFieldValue(expected, "java.awt.geom.Path2D", "pointTypes"));
        byte[] actualPointTypes = ((byte[]) getFieldValue(actual, "java.awt.geom.Path2D", "pointTypes"));
        int expectedPointTypesSize = expectedPointTypes.length;
        assertEquals(expectedPointTypesSize, actualPointTypes.length);
        org.junit.Assert.assertArrayEquals(expectedPointTypes, actualPointTypes);
        
        int expectedNumTypes = ((Integer) getFieldValue(expected, "java.awt.geom.Path2D", "numTypes"));
        int actualNumTypes = ((Integer) getFieldValue(actual, "java.awt.geom.Path2D", "numTypes"));
        assertEquals(expectedNumTypes, actualNumTypes);
        
        int expectedNumCoords = ((Integer) getFieldValue(expected, "java.awt.geom.Path2D", "numCoords"));
        int actualNumCoords = ((Integer) getFieldValue(actual, "java.awt.geom.Path2D", "numCoords"));
        assertEquals(expectedNumCoords, actualNumCoords);
        
        int expectedWindingRule = expected.getWindingRule();
        int actualWindingRule = actual.getWindingRule();
        assertEquals(expectedWindingRule, actualWindingRule);
        
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.returnsFrom {@code return transform.createTransformedShape(shape);}
 *  */
    @Test
    public void testCreateTranslatedShape_ReturnTransformCreateTransformedShape_2() throws Exception  {
        java.awt.geom.Path2D.Float float1 = ((java.awt.geom.Path2D.Float) createInstance("java.awt.geom.Path2D$Float"));
        byte[] pointTypes = {(byte) 0};
        setField(float1, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(float1, "java.awt.geom.Path2D", "numTypes", 1);
        float1.setWindingRule(1);
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", float1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = float1;
        createTranslatedShapeMethodArguments[1] = 0.0;
        createTranslatedShapeMethodArguments[2] = -0.0;
        java.awt.geom.Path2D.Double actual = ((java.awt.geom.Path2D.Double) createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments));
        
        java.awt.geom.Path2D.Double expected = ((java.awt.geom.Path2D.Double) createInstance("java.awt.geom.Path2D$Double"));
        double[] doubleCoords = {};
        setField(expected, "java.awt.geom.Path2D$Double", "doubleCoords", doubleCoords);
        byte[] pointTypes1 = {(byte) 0};
        setField(expected, "java.awt.geom.Path2D", "pointTypes", pointTypes1);
        setField(expected, "java.awt.geom.Path2D", "numTypes", 1);
        expected.setWindingRule(1);
        
        double[] expectedDoubleCoords = ((double[]) getFieldValue(expected, "java.awt.geom.Path2D$Double", "doubleCoords"));
        double[] actualDoubleCoords = ((double[]) getFieldValue(actual, "java.awt.geom.Path2D$Double", "doubleCoords"));
        int expectedDoubleCoordsSize = expectedDoubleCoords.length;
        assertEquals(expectedDoubleCoordsSize, actualDoubleCoords.length);
        assertArrayEquals(expectedDoubleCoords, actualDoubleCoords, 1.0E-6);
        
        byte[] expectedPointTypes = ((byte[]) getFieldValue(expected, "java.awt.geom.Path2D", "pointTypes"));
        byte[] actualPointTypes = ((byte[]) getFieldValue(actual, "java.awt.geom.Path2D", "pointTypes"));
        int expectedPointTypesSize = expectedPointTypes.length;
        assertEquals(expectedPointTypesSize, actualPointTypes.length);
        org.junit.Assert.assertArrayEquals(expectedPointTypes, actualPointTypes);
        
        int expectedNumTypes = ((Integer) getFieldValue(expected, "java.awt.geom.Path2D", "numTypes"));
        int actualNumTypes = ((Integer) getFieldValue(actual, "java.awt.geom.Path2D", "numTypes"));
        assertEquals(expectedNumTypes, actualNumTypes);
        
        int expectedNumCoords = ((Integer) getFieldValue(expected, "java.awt.geom.Path2D", "numCoords"));
        int actualNumCoords = ((Integer) getFieldValue(actual, "java.awt.geom.Path2D", "numCoords"));
        assertEquals(expectedNumCoords, actualNumCoords);
        
        int expectedWindingRule = expected.getWindingRule();
        int actualWindingRule = actual.getWindingRule();
        assertEquals(expectedWindingRule, actualWindingRule);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createTranslatedShape(java.awt.Shape, double, double)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.executesCondition {@code (shape == null): False}
 * @utbot.invokes {@link java.awt.geom.AffineTransform#getTranslateInstance(double,double)}
 * @utbot.invokes {@link java.awt.geom.AffineTransform#createTransformedShape(java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return transform.createTransformedShape(shape);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShape_ThrowIllegalArgumentException_1() throws Throwable  {
        java.awt.geom.Path2D.Double double1 = ((java.awt.geom.Path2D.Double) createInstance("java.awt.geom.Path2D$Double"));
        double1.setWindingRule(2);
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class double1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", double1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = double1;
        createTranslatedShapeMethodArguments[1] = -0.0;
        createTranslatedShapeMethodArguments[2] = -0.0;
        try {
            createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.executesCondition {@code (shape == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: shape == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShape_ThrowIllegalArgumentException() {
        ShapeUtilities.createTranslatedShape(null, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createTranslatedShape(java.awt.Shape, double, double)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return transform.createTransformedShape(shape);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowNegativeArraySizeException() throws Throwable  {
        java.awt.geom.Path2D.Float float1 = ((java.awt.geom.Path2D.Float) createInstance("java.awt.geom.Path2D$Float"));
        byte[] pointTypes = {(byte) 0};
        setField(float1, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(float1, "java.awt.geom.Path2D", "numTypes", Integer.MIN_VALUE);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.NegativeArraySizeException: Length is less than zero] */
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", float1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = float1;
        createTranslatedShapeMethodArguments[1] = -0.0;
        createTranslatedShapeMethodArguments[2] = -0.0;
        try {
            createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return transform.createTransformedShape(shape);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowNegativeArraySizeException_1() throws Throwable  {
        java.awt.geom.Path2D.Float float1 = ((java.awt.geom.Path2D.Float) createInstance("java.awt.geom.Path2D$Float"));
        byte[] pointTypes = {(byte) 0};
        setField(float1, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(float1, "java.awt.geom.Path2D", "numTypes", 1);
        setField(float1, "java.awt.geom.Path2D", "numCoords", Integer.MIN_VALUE);
        float1.setWindingRule(1);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.NegativeArraySizeException: Less than zero] */
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", float1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = float1;
        createTranslatedShapeMethodArguments[1] = -0.0;
        createTranslatedShapeMethodArguments[2] = -0.0;
        try {
            createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return transform.createTransformedShape(shape);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowNegativeArraySizeException_2() throws Throwable  {
        java.awt.geom.Path2D.Double double1 = ((java.awt.geom.Path2D.Double) createInstance("java.awt.geom.Path2D$Double"));
        byte[] pointTypes = {(byte) 0};
        setField(double1, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(double1, "java.awt.geom.Path2D", "numTypes", 1);
        setField(double1, "java.awt.geom.Path2D", "numCoords", Integer.MIN_VALUE);
        double1.setWindingRule(1);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.NegativeArraySizeException: Less than zero] */
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class double1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", double1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = double1;
        createTranslatedShapeMethodArguments[1] = 2.225073858507202E-308;
        createTranslatedShapeMethodArguments[2] = java.lang.Double.NaN;
        try {
            createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return transform.createTransformedShape(shape);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowIndexOutOfBoundsException() throws Throwable  {
        java.awt.geom.Path2D.Double double1 = ((java.awt.geom.Path2D.Double) createInstance("java.awt.geom.Path2D$Double"));
        double[] doubleCoords = {};
        setField(double1, "java.awt.geom.Path2D$Double", "doubleCoords", doubleCoords);
        byte[] pointTypes = {(byte) 0};
        setField(double1, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(double1, "java.awt.geom.Path2D", "numTypes", 1);
        setField(double1, "java.awt.geom.Path2D", "numCoords", 2);
        double1.setWindingRule(1);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class double1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", double1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = double1;
        createTranslatedShapeMethodArguments[1] = 2.225073858507202E-308;
        createTranslatedShapeMethodArguments[2] = java.lang.Double.NaN;
        try {
            createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return transform.createTransformedShape(shape);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        GeneralPath generalPath = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        float[] floatCoords = {};
        setField(generalPath, "java.awt.geom.Path2D$Float", "floatCoords", floatCoords);
        byte[] pointTypes = {(byte) 0};
        setField(generalPath, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(generalPath, "java.awt.geom.Path2D", "numTypes", 1);
        setField(generalPath, "java.awt.geom.Path2D", "numCoords", 2);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class generalPathType = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", generalPathType, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = generalPath;
        createTranslatedShapeMethodArguments[1] = 0.0;
        createTranslatedShapeMethodArguments[2] = -0.0;
        try {
            createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return transform.createTransformedShape(shape);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        java.awt.geom.Path2D.Float float1 = ((java.awt.geom.Path2D.Float) createInstance("java.awt.geom.Path2D$Float"));
        float[] floatCoords = {0.0f};
        setField(float1, "java.awt.geom.Path2D$Float", "floatCoords", floatCoords);
        byte[] pointTypes = {(byte) 0};
        setField(float1, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(float1, "java.awt.geom.Path2D", "numTypes", 1);
        setField(float1, "java.awt.geom.Path2D", "numCoords", 2);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", float1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = float1;
        createTranslatedShapeMethodArguments[1] = 2.225073858507202E-308;
        createTranslatedShapeMethodArguments[2] = java.lang.Double.NaN;
        try {
            createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return transform.createTransformedShape(shape);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        java.awt.geom.Path2D.Float float1 = ((java.awt.geom.Path2D.Float) createInstance("java.awt.geom.Path2D$Float"));
        float[] floatCoords = {};
        setField(float1, "java.awt.geom.Path2D$Float", "floatCoords", floatCoords);
        byte[] pointTypes = {(byte) 0};
        setField(float1, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(float1, "java.awt.geom.Path2D", "numTypes", 1);
        setField(float1, "java.awt.geom.Path2D", "numCoords", 2);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", float1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = float1;
        createTranslatedShapeMethodArguments[1] = 2.225073858507202E-308;
        createTranslatedShapeMethodArguments[2] = java.lang.Double.NaN;
        try {
            createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return transform.createTransformedShape(shape);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowIndexOutOfBoundsException_4() throws Throwable  {
        java.awt.geom.Path2D.Float float1 = ((java.awt.geom.Path2D.Float) createInstance("java.awt.geom.Path2D$Float"));
        float[] floatCoords = {0.0f};
        setField(float1, "java.awt.geom.Path2D$Float", "floatCoords", floatCoords);
        byte[] pointTypes = {(byte) 0};
        setField(float1, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(float1, "java.awt.geom.Path2D", "numTypes", 1);
        setField(float1, "java.awt.geom.Path2D", "numCoords", 2);
        float1.setWindingRule(1);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", float1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = float1;
        createTranslatedShapeMethodArguments[1] = -0.0;
        createTranslatedShapeMethodArguments[2] = -0.0;
        try {
            createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,double,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return transform.createTransformedShape(shape);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowIndexOutOfBoundsException_5() throws Throwable  {
        java.awt.geom.Path2D.Double double1 = ((java.awt.geom.Path2D.Double) createInstance("java.awt.geom.Path2D$Double"));
        double[] doubleCoords = {0.0};
        setField(double1, "java.awt.geom.Path2D$Double", "doubleCoords", doubleCoords);
        byte[] pointTypes = {(byte) 0};
        setField(double1, "java.awt.geom.Path2D", "pointTypes", pointTypes);
        setField(double1, "java.awt.geom.Path2D", "numTypes", 1);
        setField(double1, "java.awt.geom.Path2D", "numCoords", 2);
        double1.setWindingRule(1);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class double1Type = Class.forName("java.awt.Shape");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", double1Type, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[3];
        createTranslatedShapeMethodArguments[0] = double1;
        createTranslatedShapeMethodArguments[1] = 2.225073858507202E-308;
        createTranslatedShapeMethodArguments[2] = java.lang.Double.NaN;
        try {
            createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for createTranslatedShape
    
    public void testCreateTranslatedShape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field private static double[][] java.awt.geom.EllipseIterator.ctrlpts accessible: module
        java.desktop does not "opens java.awt.geom" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.createTranslatedShape
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createTranslatedShape(java.awt.Shape, org.jfree.chart.util.RectangleAnchor, double, double)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,org.jfree.chart.util.RectangleAnchor,double,double)}
 * @utbot.executesCondition {@code (shape == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: shape == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShape_ThrowIllegalArgumentException1() {
        ShapeUtilities.createTranslatedShape(null, null, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createTranslatedShape(java.awt.Shape, org.jfree.chart.util.RectangleAnchor, double, double)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,org.jfree.chart.util.RectangleAnchor,double,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Point2D anchorPoint = RectangleAnchor.coordinates(shape.getBounds2D(), anchor);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowIndexOutOfBoundsException1() throws Exception  {
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 1;
        int[] xpoints = {0};
        polygon.xpoints = xpoints;
        int[] ypoints = {};
        polygon.ypoints = ypoints;
        RectangleAnchor rectangleAnchor = ((RectangleAnchor) createInstance("org.jfree.chart.util.RectangleAnchor"));
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        ShapeUtilities.createTranslatedShape(polygon, rectangleAnchor, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,org.jfree.chart.util.RectangleAnchor,double,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Point2D anchorPoint = RectangleAnchor.coordinates(shape.getBounds2D(), anchor);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowIndexOutOfBoundsException_11() throws Exception  {
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 2;
        int[] xpoints = {Integer.MAX_VALUE};
        polygon.xpoints = xpoints;
        int[] ypoints = {Integer.MIN_VALUE};
        polygon.ypoints = ypoints;
        RectangleAnchor rectangleAnchor = ((RectangleAnchor) createInstance("org.jfree.chart.util.RectangleAnchor"));
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        ShapeUtilities.createTranslatedShape(polygon, rectangleAnchor, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createTranslatedShape(java.awt.Shape,org.jfree.chart.util.RectangleAnchor,double,double)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Point2D anchorPoint = RectangleAnchor.coordinates(shape.getBounds2D(), anchor);
 *  */
    @Test
    public void testCreateTranslatedShape_ThrowIndexOutOfBoundsException_21() throws Exception  {
        Polygon polygon = ((Polygon) createInstance("java.awt.Polygon"));
        polygon.npoints = 1;
        int[] xpoints = {};
        polygon.xpoints = xpoints;
        RectangleAnchor rectangleAnchor = ((RectangleAnchor) createInstance("org.jfree.chart.util.RectangleAnchor"));
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.createTranslatedShape] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        ShapeUtilities.createTranslatedShape(polygon, rectangleAnchor, java.lang.Double.NaN, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createTranslatedShape(java.awt.Shape, org.jfree.chart.util.RectangleAnchor, double, double)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateTranslatedShapeByFuzzer() {
        Dimension dimension = new Dimension(Integer.MAX_VALUE, 0);
        dimension.width = -1;
        dimension.height = Integer.MAX_VALUE;
        Rectangle rectangle = new Rectangle(dimension);
        rectangle.width = -1;
        rectangle.y = Integer.MIN_VALUE;
        rectangle.height = Integer.MAX_VALUE;
        rectangle.x = -1;
        Rectangle rectangle1 = new Rectangle(rectangle);
        rectangle1.x = -1;
        rectangle1.height = Integer.MAX_VALUE;
        rectangle1.width = 1;
        rectangle1.y = Integer.MIN_VALUE;
        
        ShapeUtilities.createTranslatedShape(rectangle1, null, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createTranslatedShape(java.awt.Shape, org.jfree.chart.util.RectangleAnchor, double, double)
    
    @Test
    public void testCreateTranslatedShape1() throws Exception  {
        java.awt.geom.Rectangle2D.Float float1 = new java.awt.geom.Rectangle2D.Float();
        RectangleAnchor rectangleAnchor = ((RectangleAnchor) createInstance("org.jfree.chart.util.RectangleAnchor"));
        
        Class shapeUtilitiesClazz = Class.forName("org.jfree.chart.util.ShapeUtilities");
        Class float1Type = Class.forName("java.awt.Shape");
        Class rectangleAnchorType = Class.forName("org.jfree.chart.util.RectangleAnchor");
        Class doubleType = double.class;
        Method createTranslatedShapeMethod = shapeUtilitiesClazz.getDeclaredMethod("createTranslatedShape", float1Type, rectangleAnchorType, doubleType, doubleType);
        createTranslatedShapeMethod.setAccessible(true);
        java.lang.Object[] createTranslatedShapeMethodArguments = new java.lang.Object[4];
        createTranslatedShapeMethodArguments[0] = float1;
        createTranslatedShapeMethodArguments[1] = rectangleAnchor;
        createTranslatedShapeMethodArguments[2] = java.lang.Double.NaN;
        createTranslatedShapeMethodArguments[3] = java.lang.Double.NaN;
        java.awt.geom.Path2D.Double actual = ((java.awt.geom.Path2D.Double) createTranslatedShapeMethod.invoke(null, createTranslatedShapeMethodArguments));
        
        java.awt.geom.Path2D.Double expected = ((java.awt.geom.Path2D.Double) createInstance("java.awt.geom.Path2D$Double"));
        
    }
    ///endregion
    
    ///region Errors report for createTranslatedShape
    
    public void testCreateTranslatedShape_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.getPointInRectangle
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPointInRectangle(double, double, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#getPointInRectangle(double,double,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getMinX()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: x = Math.max(area.getMinX(), Math.min(x, area.getMaxX()));
 *  */
    @Test
    public void testGetPointInRectangle_ThrowNullPointerException() {
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.getPointInRectangle] produces [java.lang.NullPointerException]
            org.jfree.chart.util.ShapeUtilities.getPointInRectangle(ShapeUtilities.java:545) */
        ShapeUtilities.getPointInRectangle(java.lang.Double.NaN, java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPointInRectangle(double, double, java.awt.geom.Rectangle2D)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.util.ShapeUtilities}
     * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#getPointInRectangle(double,double,java.awt.geom.Rectangle2D)}
     */
    @Test
    public void testGetPointInRectangle() {
        java.awt.geom.Rectangle2D.Double double1 = new java.awt.geom.Rectangle2D.Double();
        double1.x = -1.0;
        double1.width = java.lang.Double.NEGATIVE_INFINITY;
        double1.y = java.lang.Double.NEGATIVE_INFINITY;
        double1.height = java.lang.Double.POSITIVE_INFINITY;
        
        java.awt.geom.Point2D.Double actual = ((java.awt.geom.Point2D.Double) ShapeUtilities.getPointInRectangle(-0.25, 1.0, double1));
        
        java.awt.geom.Point2D.Double expected = new java.awt.geom.Point2D.Double();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.rotateShape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rotateShape(java.awt.Shape, double, float, float)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#rotateShape(java.awt.Shape,double,float,float)}
 * @utbot.executesCondition {@code (base == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testRotateShape_BaseEqualsNull() {
        Shape actual = ShapeUtilities.rotateShape(null, java.lang.Double.NaN, java.lang.Float.NaN, java.lang.Float.NaN);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method rotateShape(java.awt.Shape, double, float, float)
    
    @Test
    public void testRotateShapeByFuzzer() throws Exception  {
        Dimension dimension = new Dimension(Integer.MAX_VALUE, 0);
        dimension.width = -1;
        dimension.height = Integer.MAX_VALUE;
        Rectangle rectangle = new Rectangle(dimension);
        rectangle.width = -1;
        rectangle.y = Integer.MIN_VALUE;
        rectangle.height = Integer.MAX_VALUE;
        rectangle.x = -1;
        Rectangle rectangle1 = new Rectangle(rectangle);
        rectangle1.x = -1;
        rectangle1.height = Integer.MAX_VALUE;
        rectangle1.width = 1;
        rectangle1.y = Integer.MIN_VALUE;
        
        java.awt.geom.Path2D.Double actual = ((java.awt.geom.Path2D.Double) ShapeUtilities.rotateShape(rectangle1, java.lang.Double.POSITIVE_INFINITY, java.lang.Float.NEGATIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY));
        
        java.awt.geom.Path2D.Double expected = ((java.awt.geom.Path2D.Double) createInstance("java.awt.geom.Path2D$Double"));
        
    }
    ///endregion
    
    ///region Errors report for rotateShape
    
    public void testRotateShape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.drawRotatedShape
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method drawRotatedShape(java.awt.Graphics2D, java.awt.Shape, double, float, float)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#drawRotatedShape(java.awt.Graphics2D,java.awt.Shape,double,float,float)}
 * @utbot.invokes {@link java.awt.Graphics2D#getTransform()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AffineTransform saved = g2.getTransform();
 *  */
    @Test
    public void testDrawRotatedShape_ThrowNullPointerException() {
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.drawRotatedShape] produces [java.lang.NullPointerException]
            org.jfree.chart.util.ShapeUtilities.drawRotatedShape(ShapeUtilities.java:380) */
        ShapeUtilities.drawRotatedShape(null, null, java.lang.Double.NaN, java.lang.Float.NaN, java.lang.Float.NaN);
    }
    ///endregion
    
    ///region Errors report for drawRotatedShape
    
    public void testDrawRotatedShape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.createDiamond
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDiamond(float)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createDiamond(float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#moveTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#closePath()}
 * @utbot.returnsFrom {@code return p0;}
 *  */
    @Test
    public void testCreateDiamond_GeneralPathClosePath() throws Exception  {
        GeneralPath actual = ((GeneralPath) ShapeUtilities.createDiamond(java.lang.Float.NaN));
        
        GeneralPath expected = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.createUpTriangle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createUpTriangle(float)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createUpTriangle(float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#moveTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#closePath()}
 * @utbot.returnsFrom {@code return p0;}
 *  */
    @Test
    public void testCreateUpTriangle_GeneralPathClosePath() throws Exception  {
        GeneralPath actual = ((GeneralPath) ShapeUtilities.createUpTriangle(java.lang.Float.NaN));
        
        GeneralPath expected = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.createRegularCross
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createRegularCross(float, float)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createRegularCross(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#moveTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#closePath()}
 * @utbot.returnsFrom {@code return p0;}
 *  */
    @Test
    public void testCreateRegularCross_GeneralPathClosePath() throws Exception  {
        GeneralPath actual = ((GeneralPath) ShapeUtilities.createRegularCross(java.lang.Float.NaN, java.lang.Float.NaN));
        
        GeneralPath expected = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.createLineRegion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createLineRegion(java.awt.geom.Line2D, float)
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.util.ShapeUtilities}
     * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createLineRegion(java.awt.geom.Line2D,float)}
     */
    @Test
    public void testCreateLineRegion() throws Exception  {
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float();
        float1.y1 = -1.0f;
        float1.y2 = java.lang.Float.POSITIVE_INFINITY;
        float1.x1 = 2.0f;
        float1.x2 = 0.0f;
        
        GeneralPath actual = ((GeneralPath) ShapeUtilities.createLineRegion(float1, 2.5243549E-29f));
        
        GeneralPath expected = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.jfree.chart.util.ShapeUtilities}
     * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createLineRegion(java.awt.geom.Line2D,float)}
     */
    @Test
    public void testCreateLineRegion1() throws Exception  {
        java.awt.geom.Line2D.Float float1 = new java.awt.geom.Line2D.Float(0.0f, 1.0f, 2.0f, 2.0f);
        float1.y1 = 0.0f;
        float1.y2 = 1.0f;
        float1.x2 = 0.0f;
        float1.x1 = 0.0f;
        
        GeneralPath actual = ((GeneralPath) ShapeUtilities.createLineRegion(float1, -1.329228E36f));
        
        GeneralPath expected = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.intersects
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method intersects(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#intersects(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getX()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x0 = rect1.getX();
 *  */
    @Test
    public void testIntersects_ThrowNullPointerException() {
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.intersects] produces [java.lang.NullPointerException]
            org.jfree.chart.util.ShapeUtilities.intersects(ShapeUtilities.java:587) */
        ShapeUtilities.intersects(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#intersects(java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D)}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getX()}
 * @utbot.invokes {@link java.awt.geom.Rectangle2D#getY()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x = rect2.getX();
 *  */
    @Test
    public void testIntersects_ThrowNullPointerException_1() {
        Rectangle rectangle = new Rectangle(0, 0, 0, 0);
        
        /* This test fails because method [org.jfree.chart.util.ShapeUtilities.intersects] produces [java.lang.NullPointerException]
            org.jfree.chart.util.ShapeUtilities.intersects(ShapeUtilities.java:590) */
        ShapeUtilities.intersects(rectangle, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeUtilities.createDownTriangle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDownTriangle(float)
    
    /**
    @utbot.classUnderTest {@link ShapeUtilities}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeUtilities#createDownTriangle(float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#moveTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#lineTo(float,float)}
 * @utbot.invokes {@link java.awt.geom.GeneralPath#closePath()}
 * @utbot.returnsFrom {@code return p0;}
 *  */
    @Test
    public void testCreateDownTriangle_GeneralPathClosePath() throws Exception  {
        GeneralPath actual = ((GeneralPath) ShapeUtilities.createDownTriangle(java.lang.Float.NaN));
        
        GeneralPath expected = ((GeneralPath) createInstance("java.awt.geom.GeneralPath"));
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields797398219735400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields797398219735400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass797398219745000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields797398219735400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass797398219745000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields797398220754300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields797398220754300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass797398220757200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields797398220754300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass797398220757200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields797398221180600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields797398221180600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass797398221182300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields797398221180600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass797398221182300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields797398221884000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields797398221884000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass797398221886500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields797398221884000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass797398221886500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


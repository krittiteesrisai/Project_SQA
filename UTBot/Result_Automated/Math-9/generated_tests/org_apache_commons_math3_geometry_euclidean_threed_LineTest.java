package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;

public final class org_apache_commons_math3_geometry_euclidean_threed_LineTest {
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.getOrigin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOrigin()
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#getOrigin()}
 * @utbot.returnsFrom {@code return zero;}
 *  */
    @Test
    public void testGetOrigin_ReturnZero() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        
        Vector3D actual = line.getOrigin();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.reset
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reset(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#reset(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.threed.Vector3D#subtract(org.apache.commons.math3.geometry.Vector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector3D delta = p2.subtract(p1);
 *  */
    @Test
    public void testReset_ThrowNullPointerException() {
        Line line = new Line(null);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.reset] produces [java.lang.NullPointerException] */
        line.reset(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.distance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.threed.Vector3D#subtract(org.apache.commons.math3.geometry.Vector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector3D d = p.subtract(zero);
 *  */
    @Test
    public void testDistance_ThrowNullPointerException() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.Line.distance(Line.java:163) */
        line.distance(((Vector3D) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.distance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distance(org.apache.commons.math3.geometry.euclidean.threed.Line)
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#distance(org.apache.commons.math3.geometry.euclidean.threed.Line)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector3D normal = Vector3D.crossProduct(direction, line.direction);
 *  */
    @Test
    public void testDistance_ThrowNullPointerException1() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.Line.distance(Line.java:174) */
        line.distance(((Line) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.toSpace
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toSpace(org.apache.commons.math3.geometry.Vector)
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#toSpace(org.apache.commons.math3.geometry.Vector)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return pointAt(((Vector1D) point).getX());
 *  */
    @Test
    public void testToSpace_ThrowClassCastException() {
        Line line = new Line(null);
        Vector2D vector2D = new Vector2D(0.0, 0.0);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.toSpace] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.Vector can not be casted to org.apache.commons.math3.geometry.euclidean.oned.Vector1D] */
        line.toSpace(((Vector) vector2D));
    }
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#toSpace(org.apache.commons.math3.geometry.Vector)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.oned.Vector1D#getX()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return pointAt(((Vector1D) point).getX());
 *  */
    @Test
    public void testToSpace_ThrowNullPointerException() {
        Line line = new Line(null);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.toSpace] produces [java.lang.NullPointerException] */
        line.toSpace(((Vector) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.closestPoint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closestPoint(org.apache.commons.math3.geometry.euclidean.threed.Line)
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#closestPoint(org.apache.commons.math3.geometry.euclidean.threed.Line)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double cos = direction.dotProduct(line.direction);
 *  */
    @Test
    public void testClosestPoint_ThrowNullPointerException() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.closestPoint] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.Line.closestPoint(Line.java:194) */
        line.closestPoint(null);
    }
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#closestPoint(org.apache.commons.math3.geometry.euclidean.threed.Line)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.threed.Vector3D#dotProduct(org.apache.commons.math3.geometry.Vector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double cos = direction.dotProduct(line.direction);
 *  */
    @Test
    public void testClosestPoint_ThrowNullPointerException_1() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.closestPoint] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.Line.closestPoint(Line.java:194) */
        line.closestPoint(line);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.getDirection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDirection()
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#getDirection()}
 * @utbot.returnsFrom {@code return direction;}
 *  */
    @Test
    public void testGetDirection_ReturnDirection() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        
        Vector3D actual = line.getDirection();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.toSubSpace
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toSubSpace(org.apache.commons.math3.geometry.Vector)
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#toSubSpace(org.apache.commons.math3.geometry.Vector)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new Vector1D(getAbscissa((Vector3D) point));
 *  */
    @Test
    public void testToSubSpace_ThrowClassCastException() {
        Line line = new Line(null);
        Vector2D vector2D = new Vector2D(0.0, 0.0);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.toSubSpace] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.Vector can not be casted to org.apache.commons.math3.geometry.euclidean.threed.Vector3D] */
        line.toSubSpace(((Vector) vector2D));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method toSubSpace(org.apache.commons.math3.geometry.Vector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#toSubSpace(org.apache.commons.math3.geometry.Vector)}
     */
    @Test
    public void testToSubSpaceThrowsNPE() {
        Vector3D vector3D = new Vector3D(0.0, java.lang.Double.NaN, 1.0);
        Vector3D vector3D1 = new Vector3D(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        Line line = new Line(vector3D, vector3D1);
        Line line1 = new Line(line);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.toSubSpace] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.Line.getAbscissa(Line.java:113)
            org.apache.commons.math3.geometry.euclidean.threed.Line.toSubSpace(Line.java:128) */
        line1.toSubSpace(((Vector) null));
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#toSubSpace(org.apache.commons.math3.geometry.Vector)}
     */
    @Test
    public void testToSubSpaceThrowsNPE1() {
        Vector3D vector3D = new Vector3D(0.0, java.lang.Double.NaN, 1.0);
        Vector3D vector3D1 = new Vector3D(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);
        Line line = new Line(vector3D, vector3D1);
        Line line1 = new Line(line);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.toSubSpace] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.Line.getAbscissa(Line.java:113)
            org.apache.commons.math3.geometry.euclidean.threed.Line.toSubSpace(Line.java:128) */
        line1.toSubSpace(((Vector) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.isSimilarTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSimilarTo(org.apache.commons.math3.geometry.euclidean.threed.Line)
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#isSimilarTo(org.apache.commons.math3.geometry.euclidean.threed.Line)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double angle = Vector3D.angle(direction, line.direction);
 *  */
    @Test
    public void testIsSimilarTo_ThrowNullPointerException() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.isSimilarTo] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.Line.isSimilarTo(Line.java:146) */
        line.isSimilarTo(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSimilarTo(org.apache.commons.math3.geometry.euclidean.threed.Line)
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#isSimilarTo(org.apache.commons.math3.geometry.euclidean.threed.Line)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.threed.Vector3D#angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D,org.apache.commons.math3.geometry.euclidean.threed.Vector3D)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: final double angle = Vector3D.angle(direction, line.direction);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testIsSimilarTo_ThrowMathArithmeticException() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Vector3D direction = ((Vector3D) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setField(direction, "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "x", 0.0);
        setField(direction, "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "y", 0.0);
        setField(direction, "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "z", 0.0);
        setField(line, "org.apache.commons.math3.geometry.euclidean.threed.Line", "direction", direction);
        Line line1 = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Vector3D direction1 = ((Vector3D) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setField(direction1, "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "x", 0.0);
        setField(direction1, "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "y", 0.0);
        setField(direction1, "org.apache.commons.math3.geometry.euclidean.threed.Vector3D", "z", 0.0);
        setField(line1, "org.apache.commons.math3.geometry.euclidean.threed.Line", "direction", direction1);
        
        line.isSimilarTo(line1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.revert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method revert()
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#revert()}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.threed.Vector3D#subtract(org.apache.commons.math3.geometry.Vector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Line reverted = new Line(zero, zero.subtract(direction));
 *  */
    @Test
    public void testRevert_ThrowNullPointerException() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.revert] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.Line.revert(Line.java:87) */
        line.revert();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.getAbscissa
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAbscissa(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#getAbscissa(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.threed.Vector3D#subtract(org.apache.commons.math3.geometry.Vector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return point.subtract(zero).dotProduct(direction);
 *  */
    @Test
    public void testGetAbscissa_ThrowNullPointerException() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.Line.getAbscissa] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.Line.getAbscissa(Line.java:113) */
        line.getAbscissa(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.Line.wholeLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wholeLine()
    
    /**
    @utbot.classUnderTest {@link Line}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.Line#wholeLine()}
 * @utbot.returnsFrom {@code return new SubLine(this, new IntervalsSet());}
 *  */
    @Test
    public void testWholeLine_Return() throws Exception  {
        Line line = new Line(null);
        
        SubLine actual = line.wholeLine();
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        SubLine expected = new SubLine(line, intervalsSet);
        
        Line expectedLine = ((Line) getFieldValue(expected, "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "line"));
        Line actualLine = ((Line) getFieldValue(actual, "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "line"));
        
        IntervalsSet expectedRemainingRegion = ((IntervalsSet) getFieldValue(expected, "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "remainingRegion"));
        IntervalsSet actualRemainingRegion = ((IntervalsSet) getFieldValue(actual, "org.apache.commons.math3.geometry.euclidean.threed.SubLine", "remainingRegion"));
        BSPTree expectedRemainingRegionTree = ((BSPTree) getFieldValue(expectedRemainingRegion, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualRemainingRegionTree = ((BSPTree) getFieldValue(actualRemainingRegion, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane actualRemainingRegionTreeCut = actualRemainingRegionTree.getCut();
        assertNull(actualRemainingRegionTreeCut);
        
        BSPTree actualRemainingRegionTreePlus = actualRemainingRegionTree.getPlus();
        assertNull(actualRemainingRegionTreePlus);
        
        BSPTree actualRemainingRegionTreeMinus = actualRemainingRegionTree.getMinus();
        assertNull(actualRemainingRegionTreeMinus);
        
        BSPTree actualRemainingRegionTreeParent = actualRemainingRegionTree.getParent();
        assertNull(actualRemainingRegionTreeParent);
        
        Object actualRemainingRegionTreeAttribute = actualRemainingRegionTree.getAttribute();
        assertNull(actualRemainingRegionTreeAttribute);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields716753532506900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields716753532506900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass716753532513000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716753532506900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716753532513000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields716753532890400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields716753532890400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass716753532893400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716753532890400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716753532893400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


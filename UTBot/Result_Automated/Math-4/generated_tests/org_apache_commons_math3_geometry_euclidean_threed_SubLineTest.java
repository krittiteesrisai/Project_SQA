package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import java.util.ArrayList;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import java.lang.reflect.Constructor;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

public final class org_apache_commons_math3_geometry_euclidean_threed_SubLineTest {
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSegments()
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.returnsFrom {@code return segments;}
 *  */
    @Test
    public void testGetSegments_ReturnSegments() {
        Boolean boolean1 = false;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        ArrayList actual = ((ArrayList) subLine.getSegments());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.returnsFrom {@code return segments;}
 *  */
    @Test
    public void testGetSegments_ReturnSegments_1() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.0);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Boolean boolean1 = false;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean1);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = bSPTree1;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree2);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        ArrayList actual = ((ArrayList) subLine1.getSegments());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSegments()
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException() {
        int[] intArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, intArray);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_1() throws Exception  {
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Line"));
        SubLine subLine = new SubLine(line, ((Region) null));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_2() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 2.225073858507202E-308);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        int[] intArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, intArray);
        Boolean boolean1 = true;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean1);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = bSPTree1;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree2);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_3() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 2.0);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Plane plane = ((Plane) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Plane"));
        Vector3D w = ((Vector3D) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setField(plane, "org.apache.commons.math3.geometry.euclidean.threed.Plane", "w", w);
        SubPlane subPlane = new SubPlane(plane, null);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subPlaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subPlaneType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        Boolean boolean1 = true;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean1);
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = bSPTree1;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree2);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.euclidean.threed.Vector3D can not be casted to org.apache.commons.math3.geometry.euclidean.oned.Vector1D] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_4() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 2.0);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubPlane subPlane = new SubPlane(orientedPoint, null);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D, false);
        SubPlane subPlane1 = new SubPlane(orientedPoint1, null);
        byte[] byteArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, byteArray);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subPlane1Type = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subPlane1Type, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane1;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        Boolean boolean1 = true;
        BSPTree bSPTree2 = new BSPTree(null, null, null, boolean1);
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subPlane;
        bSPTreeConstructorArguments1[1] = bSPTree1;
        bSPTreeConstructorArguments1[2] = bSPTree2;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_5() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.0);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 1.73E-322);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubPlane subPlane = new SubPlane(orientedPoint1, null);
        int[] intArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, intArray);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subPlaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subPlaneType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        Boolean boolean1 = true;
        BSPTree bSPTree2 = new BSPTree(null, null, null, boolean1);
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree1;
        bSPTreeConstructorArguments1[2] = bSPTree2;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_6() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 4.628153187942746E-306);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubPlane subPlane = new SubPlane(orientedPoint, null);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 4.628153625694979E-306);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, true);
        SubPlane subPlane1 = new SubPlane(orientedPoint1, null);
        Object object = new Object();
        BSPTree bSPTree = new BSPTree(null, null, null, object);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subPlane1Type = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subPlane1Type, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane1;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        Boolean boolean1 = true;
        BSPTree bSPTree2 = new BSPTree(null, null, null, boolean1);
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subPlane;
        bSPTreeConstructorArguments1[1] = bSPTree1;
        bSPTreeConstructorArguments1[2] = bSPTree2;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_7() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 9.363352890365042E-97);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 8.770713648304642E-97);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubPlane subPlane = new SubPlane(orientedPoint1, null);
        Line line = ((Line) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Line"));
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(line, null);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subPlane;
        bSPTreeConstructorArguments1[1] = ((Object) null);
        bSPTreeConstructorArguments1[2] = bSPTree1;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        java.lang.Object[] bSPTreeConstructorArguments2 = new java.lang.Object[4];
        bSPTreeConstructorArguments2[0] = subLine;
        bSPTreeConstructorArguments2[1] = bSPTree;
        bSPTreeConstructorArguments2[2] = bSPTree2;
        bSPTreeConstructorArguments2[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments2));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.euclidean.oned.Vector1D can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Vector2D] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_8() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 1.358077306218E-311);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", java.lang.Double.NEGATIVE_INFINITY);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, true);
        SubPlane subPlane = new SubPlane(orientedPoint1, null);
        Plane plane = ((Plane) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Plane"));
        Vector3D w = ((Vector3D) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setField(plane, "org.apache.commons.math3.geometry.euclidean.threed.Plane", "w", w);
        SubPlane subPlane1 = new SubPlane(plane, null);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subPlane1Type = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subPlane1Type, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane1;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subPlane;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        Boolean boolean1 = true;
        BSPTree bSPTree2 = new BSPTree(null, null, null, boolean1);
        java.lang.Object[] bSPTreeConstructorArguments2 = new java.lang.Object[4];
        bSPTreeConstructorArguments2[0] = subLine;
        bSPTreeConstructorArguments2[1] = bSPTree1;
        bSPTreeConstructorArguments2[2] = bSPTree2;
        bSPTreeConstructorArguments2[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments2));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.euclidean.threed.Vector3D can not be casted to org.apache.commons.math3.geometry.euclidean.oned.Vector1D] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_9() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.0);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(orientedPoint, null);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -0.0);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubPlane subPlane = new SubPlane(orientedPoint1, null);
        Plane plane = ((Plane) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Plane"));
        Vector3D w = ((Vector3D) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setField(plane, "org.apache.commons.math3.geometry.euclidean.threed.Plane", "w", w);
        SubPlane subPlane1 = new SubPlane(plane, null);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subPlane1Type = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subPlane1Type, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane1;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subPlane;
        bSPTreeConstructorArguments1[1] = ((Object) null);
        bSPTreeConstructorArguments1[2] = bSPTree;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        Boolean boolean1 = true;
        BSPTree bSPTree2 = new BSPTree(null, null, null, boolean1);
        java.lang.Object[] bSPTreeConstructorArguments2 = new java.lang.Object[4];
        bSPTreeConstructorArguments2[0] = subOrientedPoint;
        bSPTreeConstructorArguments2[1] = bSPTree1;
        bSPTreeConstructorArguments2[2] = bSPTree2;
        bSPTreeConstructorArguments2[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments2));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.euclidean.threed.Vector3D can not be casted to org.apache.commons.math3.geometry.euclidean.oned.Vector1D] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException() {
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), ((IntervalsSet) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments(SubLine.java:83) */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_1() {
        IntervalsSet intervalsSet = new IntervalsSet(((BSPTree) null));
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.recurseList(IntervalsSet.java:224)
            org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.asList(IntervalsSet.java:209)
            org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments(SubLine.java:83) */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_2() {
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector3D start = line.toSpace(new Vector1D(interval.getInf()));
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_3() {
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_4() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_5() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.0);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_6() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.0);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_7() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        OrientedPoint orientedPoint = new OrientedPoint(null, false);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_8() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.0);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Boolean boolean1 = false;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree1);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector3D start = line.toSpace(new Vector1D(interval.getInf()));
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_9() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 2.225073858507217E-308);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Boolean boolean1 = false;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Boolean boolean2 = true;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean2);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = bSPTree1;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree2);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = remainingRegion.asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_10() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 332.97070148657076);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, true);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 332.97070148657076);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(orientedPoint1, null);
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        Boolean boolean2 = true;
        BSPTree bSPTree2 = new BSPTree(null, null, null, boolean2);
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree1;
        bSPTreeConstructorArguments1[2] = bSPTree2;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine1 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), intervalsSet);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.threed.SubLine.intersection
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method intersection(org.apache.commons.math3.geometry.euclidean.threed.SubLine, boolean)
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#intersection(org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Vector3D v1D = line.intersection(subLine.line);
 *  */
    @Test
    public void testIntersection_ThrowNullPointerException() {
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), ((IntervalsSet) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.intersection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.SubLine.intersection(SubLine.java:113) */
        subLine.intersection(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.threed.SubLine#intersection(org.apache.commons.math3.geometry.euclidean.threed.SubLine,boolean)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.threed.Line#intersection(org.apache.commons.math3.geometry.euclidean.threed.Line)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Vector3D v1D = line.intersection(subLine.line);
 *  */
    @Test
    public void testIntersection_ThrowNullPointerException_1() {
        org.apache.commons.math3.geometry.euclidean.threed.SubLine subLine = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line) null), ((IntervalsSet) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.threed.SubLine.intersection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.threed.SubLine.intersection(SubLine.java:113) */
        subLine.intersection(subLine, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields714556257755400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields714556257755400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass714556257766400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields714556257755400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass714556257766400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import java.lang.reflect.Method;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.Vector;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.threed.SubPlane;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math3_geometry_euclidean_twod_SubLineTest {
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.SubLine.split
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method split(org.apache.commons.math3.geometry.partitioning.Hyperplane)
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#split(org.apache.commons.math3.geometry.partitioning.Hyperplane)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Line thisLine = (Line) getHyperplane();
 *  */
    @Test
    public void testSplit_ThrowClassCastException() {
        Plane plane = new Plane(((Plane) null));
        SubLine subLine = new SubLine(plane, ((Region) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.split] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        subLine.split(null);
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#split(org.apache.commons.math3.geometry.partitioning.Hyperplane)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Line otherLine = (Line) hyperplane;
 *  */
    @Test
    public void testSplit_ThrowClassCastException_1() {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        Plane plane = new Plane(((Plane) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.split] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        subLine.split(plane);
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#split(org.apache.commons.math3.geometry.partitioning.Hyperplane)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.Line#intersection(org.apache.commons.math3.geometry.euclidean.twod.Line)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D crossing = thisLine.intersection(otherLine);
 *  */
    @Test
    public void testSplit_ThrowNullPointerException() {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.split] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.SubLine.split(SubLine.java:178) */
        subLine.split(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.SubLine.side
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method side(org.apache.commons.math3.geometry.partitioning.Hyperplane)
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#side(org.apache.commons.math3.geometry.partitioning.Hyperplane)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Line thisLine = (Line) getHyperplane();
 *  */
    @Test
    public void testSide_ThrowClassCastException() {
        Plane plane = new Plane(((Plane) null));
        SubLine subLine = new SubLine(plane, ((Region) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.side] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        subLine.side(null);
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#side(org.apache.commons.math3.geometry.partitioning.Hyperplane)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Line otherLine = (Line) hyperplane;
 *  */
    @Test
    public void testSide_ThrowClassCastException_1() {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        Plane plane = new Plane(((Plane) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.side] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        subLine.side(plane);
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#side(org.apache.commons.math3.geometry.partitioning.Hyperplane)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.Line#intersection(org.apache.commons.math3.geometry.euclidean.twod.Line)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D crossing = thisLine.intersection(otherLine);
 *  */
    @Test
    public void testSide_ThrowNullPointerException() {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.side] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.SubLine.side(SubLine.java:157) */
        subLine.side(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.SubLine.intersection
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method intersection(org.apache.commons.math3.geometry.euclidean.twod.SubLine, boolean)
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#intersection(org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Line line1 = (Line) getHyperplane();
 *  */
    @Test
    public void testIntersection_ThrowClassCastException() {
        Plane plane = new Plane(((Plane) null));
        SubLine subLine = new SubLine(plane, ((Region) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.intersection] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        subLine.intersection(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#intersection(org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Line line2 = (Line) subLine.getHyperplane();
 *  */
    @Test
    public void testIntersection_ThrowClassCastException_1() {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        Plane plane = new Plane(((Plane) null));
        SubLine subLine1 = new SubLine(plane, ((Region) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.intersection] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        subLine.intersection(subLine1, false);
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#intersection(org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getHyperplane()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Line line2 = (Line) subLine.getHyperplane();
 *  */
    @Test
    public void testIntersection_ThrowNullPointerException() {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.intersection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.SubLine.intersection(SubLine.java:114) */
        subLine.intersection(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#intersection(org.apache.commons.math3.geometry.euclidean.twod.SubLine,boolean)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.Line#intersection(org.apache.commons.math3.geometry.euclidean.twod.Line)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Vector2D v2D = line1.intersection(line2);
 *  */
    @Test
    public void testIntersection_ThrowNullPointerException_1() {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.intersection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.SubLine.intersection(SubLine.java:117) */
        subLine.intersection(subLine, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.SubLine.buildNew
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildNew(org.apache.commons.math3.geometry.partitioning.Hyperplane, org.apache.commons.math3.geometry.partitioning.Region)
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#buildNew(org.apache.commons.math3.geometry.partitioning.Hyperplane,org.apache.commons.math3.geometry.partitioning.Region)}
 * @utbot.returnsFrom {@code return new SubLine(hyperplane, remainingRegion);}
 *  */
    @Test
    public void testBuildNew_Return() {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        
        SubLine actual = ((SubLine) subLine.buildNew(null, null));
        
        SubLine expected = new SubLine(((Hyperplane) null), ((Region) null));
        
        Hyperplane actualHyperplane = actual.getHyperplane();
        assertNull(actualHyperplane);
        
        Region actualRemainingRegion = actual.getRemainingRegion();
        assertNull(actualRemainingRegion);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.SubLine.buildIntervalSet
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method buildIntervalSet(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)
    
    @Test
    public void testBuildIntervalSet1() throws Exception  {
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 4.6397856814215674E154);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", java.lang.Double.POSITIVE_INFINITY);
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 3.435751191255956E156);
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", 2.8480945388892183E-305);
        
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class vector2DType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Method buildIntervalSetMethod = subLineClazz.getDeclaredMethod("buildIntervalSet", vector2DType, vector2DType);
        buildIntervalSetMethod.setAccessible(true);
        java.lang.Object[] buildIntervalSetMethodArguments = new java.lang.Object[2];
        buildIntervalSetMethodArguments[0] = vector2D;
        buildIntervalSetMethodArguments[1] = vector2D1;
        IntervalsSet actual = ((IntervalsSet) buildIntervalSetMethod.invoke(null, buildIntervalSetMethodArguments));
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -6.311372548557467E140);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct", true);
        setField(cut, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut);
        BSPTree plus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute = false;
        plus.setAttribute(attribute);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus);
        BSPTree minus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute1 = true;
        minus.setAttribute(attribute1);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus);
        IntervalsSet expected = new IntervalsSet(bSPTree);
        
        BSPTree expectedTree = ((BSPTree) getFieldValue(expected, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane expectedTreeCut = expectedTree.getCut();
        SubHyperplane actualTreeCut = actualTree.getCut();
        Hyperplane expectedTreeCutHyperplane = (((AbstractSubHyperplane) expectedTreeCut)).getHyperplane();
        Hyperplane actualTreeCutHyperplane = (((AbstractSubHyperplane) actualTreeCut)).getHyperplane();
        Vector1D expectedTreeCutHyperplaneLocation = (((OrientedPoint) expectedTreeCutHyperplane)).getLocation();
        Vector1D actualTreeCutHyperplaneLocation = (((OrientedPoint) actualTreeCutHyperplane)).getLocation();
        // org.apache.commons.math3.geometry.euclidean.oned.Vector1D has overridden equals method
        assertEquals(expectedTreeCutHyperplaneLocation, actualTreeCutHyperplaneLocation);
        
        boolean actualTreeCutHyperplaneDirect = ((Boolean) getFieldValue(actualTreeCutHyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct"));
        assertTrue(actualTreeCutHyperplaneDirect);
        
        Region actualTreeCutRemainingRegion = (((AbstractSubHyperplane) actualTreeCut)).getRemainingRegion();
        assertNull(actualTreeCutRemainingRegion);
        
        BSPTree expectedTreePlus = expectedTree.getPlus();
        BSPTree actualTreePlus = actualTree.getPlus();
        SubHyperplane actualTreePlusCut = actualTreePlus.getCut();
        assertNull(actualTreePlusCut);
        
        BSPTree actualTreePlusPlus = actualTreePlus.getPlus();
        assertNull(actualTreePlusPlus);
        
        BSPTree actualTreePlusMinus = actualTreePlus.getMinus();
        assertNull(actualTreePlusMinus);
        
        BSPTree expectedTreePlusParent = expectedTreePlus.getParent();
        BSPTree actualTreePlusParent = actualTreePlus.getParent();
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        BSPTree expectedTreePlusParentMinus = expectedTreePlusParent.getMinus();
        BSPTree actualTreePlusParentMinus = actualTreePlusParent.getMinus();
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        Object expectedTreePlusParentMinusAttribute = expectedTreePlusParentMinus.getAttribute();
        Object actualTreePlusParentMinusAttribute = actualTreePlusParentMinus.getAttribute();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusAttribute, actualTreePlusParentMinusAttribute));
        
        BSPTree actualTreePlusParentParent = actualTreePlusParent.getParent();
        assertNull(actualTreePlusParentParent);
        
        Object actualTreePlusParentAttribute = actualTreePlusParent.getAttribute();
        assertNull(actualTreePlusParentAttribute);
        
        Object expectedTreePlusAttribute = expectedTreePlus.getAttribute();
        Object actualTreePlusAttribute = actualTreePlus.getAttribute();
        assertEquals(expectedTreePlusAttribute, actualTreePlusAttribute);
        
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    
    @Test
    public void testBuildIntervalSet2() throws Exception  {
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", -0.0);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -1.3240812614640563E-308);
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", java.lang.Double.NEGATIVE_INFINITY);
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -9.079256601684117E-308);
        
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class vector2DType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Method buildIntervalSetMethod = subLineClazz.getDeclaredMethod("buildIntervalSet", vector2DType, vector2DType);
        buildIntervalSetMethod.setAccessible(true);
        java.lang.Object[] buildIntervalSetMethodArguments = new java.lang.Object[2];
        buildIntervalSetMethodArguments[0] = vector2D;
        buildIntervalSetMethodArguments[1] = vector2D1;
        IntervalsSet actual = ((IntervalsSet) buildIntervalSetMethod.invoke(null, buildIntervalSetMethodArguments));
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.0);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location);
        setField(cut, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut);
        BSPTree plus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute = false;
        plus.setAttribute(attribute);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus);
        BSPTree minus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute1 = true;
        minus.setAttribute(attribute1);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus);
        IntervalsSet expected = new IntervalsSet(bSPTree);
        
        BSPTree expectedTree = ((BSPTree) getFieldValue(expected, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane expectedTreeCut = expectedTree.getCut();
        SubHyperplane actualTreeCut = actualTree.getCut();
        Hyperplane expectedTreeCutHyperplane = (((AbstractSubHyperplane) expectedTreeCut)).getHyperplane();
        Hyperplane actualTreeCutHyperplane = (((AbstractSubHyperplane) actualTreeCut)).getHyperplane();
        Vector1D expectedTreeCutHyperplaneLocation = (((OrientedPoint) expectedTreeCutHyperplane)).getLocation();
        Vector1D actualTreeCutHyperplaneLocation = (((OrientedPoint) actualTreeCutHyperplane)).getLocation();
        // org.apache.commons.math3.geometry.euclidean.oned.Vector1D has overridden equals method
        assertEquals(expectedTreeCutHyperplaneLocation, actualTreeCutHyperplaneLocation);
        
        boolean actualTreeCutHyperplaneDirect = ((Boolean) getFieldValue(actualTreeCutHyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct"));
        assertFalse(actualTreeCutHyperplaneDirect);
        
        Region actualTreeCutRemainingRegion = (((AbstractSubHyperplane) actualTreeCut)).getRemainingRegion();
        assertNull(actualTreeCutRemainingRegion);
        
        BSPTree expectedTreePlus = expectedTree.getPlus();
        BSPTree actualTreePlus = actualTree.getPlus();
        SubHyperplane actualTreePlusCut = actualTreePlus.getCut();
        assertNull(actualTreePlusCut);
        
        BSPTree actualTreePlusPlus = actualTreePlus.getPlus();
        assertNull(actualTreePlusPlus);
        
        BSPTree actualTreePlusMinus = actualTreePlus.getMinus();
        assertNull(actualTreePlusMinus);
        
        BSPTree expectedTreePlusParent = expectedTreePlus.getParent();
        BSPTree actualTreePlusParent = actualTreePlus.getParent();
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        BSPTree expectedTreePlusParentMinus = expectedTreePlusParent.getMinus();
        BSPTree actualTreePlusParentMinus = actualTreePlusParent.getMinus();
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        Object expectedTreePlusParentMinusAttribute = expectedTreePlusParentMinus.getAttribute();
        Object actualTreePlusParentMinusAttribute = actualTreePlusParentMinus.getAttribute();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusAttribute, actualTreePlusParentMinusAttribute));
        
        BSPTree actualTreePlusParentParent = actualTreePlusParent.getParent();
        assertNull(actualTreePlusParentParent);
        
        Object actualTreePlusParentAttribute = actualTreePlusParent.getAttribute();
        assertNull(actualTreePlusParentAttribute);
        
        Object expectedTreePlusAttribute = expectedTreePlus.getAttribute();
        Object actualTreePlusAttribute = actualTreePlus.getAttribute();
        assertEquals(expectedTreePlusAttribute, actualTreePlusAttribute);
        
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    
    @Test
    public void testBuildIntervalSet3() throws Exception  {
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", java.lang.Double.NEGATIVE_INFINITY);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", 1.5312505860929382);
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 2.2250738585072014E-308);
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -4.595504260680173);
        
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class vector2DType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Method buildIntervalSetMethod = subLineClazz.getDeclaredMethod("buildIntervalSet", vector2DType, vector2DType);
        buildIntervalSetMethod.setAccessible(true);
        java.lang.Object[] buildIntervalSetMethodArguments = new java.lang.Object[2];
        buildIntervalSetMethodArguments[0] = vector2D;
        buildIntervalSetMethodArguments[1] = vector2D1;
        IntervalsSet actual = ((IntervalsSet) buildIntervalSetMethod.invoke(null, buildIntervalSetMethodArguments));
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 1.1255739166619995E-15);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct", true);
        setField(cut, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut);
        BSPTree plus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute = false;
        plus.setAttribute(attribute);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus);
        BSPTree minus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute1 = true;
        minus.setAttribute(attribute1);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus);
        IntervalsSet expected = new IntervalsSet(bSPTree);
        
        BSPTree expectedTree = ((BSPTree) getFieldValue(expected, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane expectedTreeCut = expectedTree.getCut();
        SubHyperplane actualTreeCut = actualTree.getCut();
        Hyperplane expectedTreeCutHyperplane = (((AbstractSubHyperplane) expectedTreeCut)).getHyperplane();
        Hyperplane actualTreeCutHyperplane = (((AbstractSubHyperplane) actualTreeCut)).getHyperplane();
        Vector1D expectedTreeCutHyperplaneLocation = (((OrientedPoint) expectedTreeCutHyperplane)).getLocation();
        Vector1D actualTreeCutHyperplaneLocation = (((OrientedPoint) actualTreeCutHyperplane)).getLocation();
        // org.apache.commons.math3.geometry.euclidean.oned.Vector1D has overridden equals method
        assertEquals(expectedTreeCutHyperplaneLocation, actualTreeCutHyperplaneLocation);
        
        boolean actualTreeCutHyperplaneDirect = ((Boolean) getFieldValue(actualTreeCutHyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct"));
        assertTrue(actualTreeCutHyperplaneDirect);
        
        Region actualTreeCutRemainingRegion = (((AbstractSubHyperplane) actualTreeCut)).getRemainingRegion();
        assertNull(actualTreeCutRemainingRegion);
        
        BSPTree expectedTreePlus = expectedTree.getPlus();
        BSPTree actualTreePlus = actualTree.getPlus();
        SubHyperplane actualTreePlusCut = actualTreePlus.getCut();
        assertNull(actualTreePlusCut);
        
        BSPTree actualTreePlusPlus = actualTreePlus.getPlus();
        assertNull(actualTreePlusPlus);
        
        BSPTree actualTreePlusMinus = actualTreePlus.getMinus();
        assertNull(actualTreePlusMinus);
        
        BSPTree expectedTreePlusParent = expectedTreePlus.getParent();
        BSPTree actualTreePlusParent = actualTreePlus.getParent();
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        BSPTree expectedTreePlusParentMinus = expectedTreePlusParent.getMinus();
        BSPTree actualTreePlusParentMinus = actualTreePlusParent.getMinus();
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        Object expectedTreePlusParentMinusAttribute = expectedTreePlusParentMinus.getAttribute();
        Object actualTreePlusParentMinusAttribute = actualTreePlusParentMinus.getAttribute();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusAttribute, actualTreePlusParentMinusAttribute));
        
        BSPTree actualTreePlusParentParent = actualTreePlusParent.getParent();
        assertNull(actualTreePlusParentParent);
        
        Object actualTreePlusParentAttribute = actualTreePlusParent.getAttribute();
        assertNull(actualTreePlusParentAttribute);
        
        Object expectedTreePlusAttribute = expectedTreePlus.getAttribute();
        Object actualTreePlusAttribute = actualTreePlus.getAttribute();
        assertEquals(expectedTreePlusAttribute, actualTreePlusAttribute);
        
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    
    @Test
    public void testBuildIntervalSet4() throws Exception  {
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", -1.503239494537112E10);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -2.0620117187500284);
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", -8.2891864E-317);
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -67584.0);
        
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class vector2DType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Method buildIntervalSetMethod = subLineClazz.getDeclaredMethod("buildIntervalSet", vector2DType, vector2DType);
        buildIntervalSetMethod.setAccessible(true);
        java.lang.Object[] buildIntervalSetMethodArguments = new java.lang.Object[2];
        buildIntervalSetMethodArguments[0] = vector2D;
        buildIntervalSetMethodArguments[1] = vector2D1;
        IntervalsSet actual = ((IntervalsSet) buildIntervalSetMethod.invoke(null, buildIntervalSetMethodArguments));
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -1.5032394945219194E10);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location);
        setField(cut, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut);
        BSPTree plus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute = false;
        plus.setAttribute(attribute);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus);
        BSPTree minus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut1 = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane1 = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.30384098566089524);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location1);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct", true);
        setField(cut1, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut1);
        BSPTree plus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        plus1.setAttribute(attribute);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus1);
        BSPTree minus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(minus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        Boolean attribute1 = true;
        minus1.setAttribute(attribute1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus);
        IntervalsSet expected = new IntervalsSet(bSPTree);
        
        BSPTree expectedTree = ((BSPTree) getFieldValue(expected, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane expectedTreeCut = expectedTree.getCut();
        SubHyperplane actualTreeCut = actualTree.getCut();
        Hyperplane expectedTreeCutHyperplane = (((AbstractSubHyperplane) expectedTreeCut)).getHyperplane();
        Hyperplane actualTreeCutHyperplane = (((AbstractSubHyperplane) actualTreeCut)).getHyperplane();
        Vector1D expectedTreeCutHyperplaneLocation = (((OrientedPoint) expectedTreeCutHyperplane)).getLocation();
        Vector1D actualTreeCutHyperplaneLocation = (((OrientedPoint) actualTreeCutHyperplane)).getLocation();
        // org.apache.commons.math3.geometry.euclidean.oned.Vector1D has overridden equals method
        assertEquals(expectedTreeCutHyperplaneLocation, actualTreeCutHyperplaneLocation);
        
        boolean actualTreeCutHyperplaneDirect = ((Boolean) getFieldValue(actualTreeCutHyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct"));
        assertFalse(actualTreeCutHyperplaneDirect);
        
        Region actualTreeCutRemainingRegion = (((AbstractSubHyperplane) actualTreeCut)).getRemainingRegion();
        assertNull(actualTreeCutRemainingRegion);
        
        BSPTree expectedTreePlus = expectedTree.getPlus();
        BSPTree actualTreePlus = actualTree.getPlus();
        SubHyperplane actualTreePlusCut = actualTreePlus.getCut();
        assertNull(actualTreePlusCut);
        
        BSPTree actualTreePlusPlus = actualTreePlus.getPlus();
        assertNull(actualTreePlusPlus);
        
        BSPTree actualTreePlusMinus = actualTreePlus.getMinus();
        assertNull(actualTreePlusMinus);
        
        BSPTree expectedTreePlusParent = expectedTreePlus.getParent();
        BSPTree actualTreePlusParent = actualTreePlus.getParent();
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        BSPTree expectedTreePlusParentMinus = expectedTreePlusParent.getMinus();
        BSPTree actualTreePlusParentMinus = actualTreePlusParent.getMinus();
        SubHyperplane expectedTreePlusParentMinusCut = expectedTreePlusParentMinus.getCut();
        SubHyperplane actualTreePlusParentMinusCut = actualTreePlusParentMinus.getCut();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusCut, actualTreePlusParentMinusCut));
        
        BSPTree expectedTreePlusParentMinusPlus = expectedTreePlusParentMinus.getPlus();
        BSPTree actualTreePlusParentMinusPlus = actualTreePlusParentMinus.getPlus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusPlus, actualTreePlusParentMinusPlus));
        
        BSPTree expectedTreePlusParentMinusMinus = expectedTreePlusParentMinus.getMinus();
        BSPTree actualTreePlusParentMinusMinus = actualTreePlusParentMinus.getMinus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusMinus, actualTreePlusParentMinusMinus));
        
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        Object actualTreePlusParentMinusAttribute = actualTreePlusParentMinus.getAttribute();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualTreePlusParentMinusAttribute, actualTreePlusParentMinusAttribute));
        
        BSPTree actualTreePlusParentParent = actualTreePlusParent.getParent();
        assertNull(actualTreePlusParentParent);
        
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        
        Object expectedTreePlusAttribute = expectedTreePlus.getAttribute();
        Object actualTreePlusAttribute = actualTreePlus.getAttribute();
        assertEquals(expectedTreePlusAttribute, actualTreePlusAttribute);
        
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    
    @Test
    public void testBuildIntervalSet5() throws Exception  {
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 4.231117013642765E-307);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", java.lang.Double.NaN);
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", java.lang.Double.NaN);
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", 2.2251422258538286E-308);
        
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class vector2DType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Method buildIntervalSetMethod = subLineClazz.getDeclaredMethod("buildIntervalSet", vector2DType, vector2DType);
        buildIntervalSetMethod.setAccessible(true);
        java.lang.Object[] buildIntervalSetMethodArguments = new java.lang.Object[2];
        buildIntervalSetMethodArguments[0] = vector2D;
        buildIntervalSetMethodArguments[1] = vector2D1;
        IntervalsSet actual = ((IntervalsSet) buildIntervalSetMethod.invoke(null, buildIntervalSetMethodArguments));
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", java.lang.Double.NaN);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location);
        setField(cut, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut);
        BSPTree plus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute = false;
        plus.setAttribute(attribute);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus);
        BSPTree minus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut1 = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane1 = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", java.lang.Double.NaN);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location1);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct", true);
        setField(cut1, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut1);
        BSPTree plus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        plus1.setAttribute(attribute);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus1);
        BSPTree minus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(minus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        Boolean attribute1 = true;
        minus1.setAttribute(attribute1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus);
        IntervalsSet expected = new IntervalsSet(bSPTree);
        
        BSPTree expectedTree = ((BSPTree) getFieldValue(expected, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane expectedTreeCut = expectedTree.getCut();
        SubHyperplane actualTreeCut = actualTree.getCut();
        Hyperplane expectedTreeCutHyperplane = (((AbstractSubHyperplane) expectedTreeCut)).getHyperplane();
        Hyperplane actualTreeCutHyperplane = (((AbstractSubHyperplane) actualTreeCut)).getHyperplane();
        Vector1D expectedTreeCutHyperplaneLocation = (((OrientedPoint) expectedTreeCutHyperplane)).getLocation();
        Vector1D actualTreeCutHyperplaneLocation = (((OrientedPoint) actualTreeCutHyperplane)).getLocation();
        // org.apache.commons.math3.geometry.euclidean.oned.Vector1D has overridden equals method
        assertEquals(expectedTreeCutHyperplaneLocation, actualTreeCutHyperplaneLocation);
        
        boolean actualTreeCutHyperplaneDirect = ((Boolean) getFieldValue(actualTreeCutHyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct"));
        assertFalse(actualTreeCutHyperplaneDirect);
        
        Region actualTreeCutRemainingRegion = (((AbstractSubHyperplane) actualTreeCut)).getRemainingRegion();
        assertNull(actualTreeCutRemainingRegion);
        
        BSPTree expectedTreePlus = expectedTree.getPlus();
        BSPTree actualTreePlus = actualTree.getPlus();
        SubHyperplane actualTreePlusCut = actualTreePlus.getCut();
        assertNull(actualTreePlusCut);
        
        BSPTree actualTreePlusPlus = actualTreePlus.getPlus();
        assertNull(actualTreePlusPlus);
        
        BSPTree actualTreePlusMinus = actualTreePlus.getMinus();
        assertNull(actualTreePlusMinus);
        
        BSPTree expectedTreePlusParent = expectedTreePlus.getParent();
        BSPTree actualTreePlusParent = actualTreePlus.getParent();
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        BSPTree expectedTreePlusParentMinus = expectedTreePlusParent.getMinus();
        BSPTree actualTreePlusParentMinus = actualTreePlusParent.getMinus();
        SubHyperplane expectedTreePlusParentMinusCut = expectedTreePlusParentMinus.getCut();
        SubHyperplane actualTreePlusParentMinusCut = actualTreePlusParentMinus.getCut();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusCut, actualTreePlusParentMinusCut));
        
        BSPTree expectedTreePlusParentMinusPlus = expectedTreePlusParentMinus.getPlus();
        BSPTree actualTreePlusParentMinusPlus = actualTreePlusParentMinus.getPlus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusPlus, actualTreePlusParentMinusPlus));
        
        BSPTree expectedTreePlusParentMinusMinus = expectedTreePlusParentMinus.getMinus();
        BSPTree actualTreePlusParentMinusMinus = actualTreePlusParentMinus.getMinus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusMinus, actualTreePlusParentMinusMinus));
        
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        Object actualTreePlusParentMinusAttribute = actualTreePlusParentMinus.getAttribute();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualTreePlusParentMinusAttribute, actualTreePlusParentMinusAttribute));
        
        BSPTree actualTreePlusParentParent = actualTreePlusParent.getParent();
        assertNull(actualTreePlusParentParent);
        
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        
        Object expectedTreePlusAttribute = expectedTreePlus.getAttribute();
        Object actualTreePlusAttribute = actualTreePlus.getAttribute();
        assertEquals(expectedTreePlusAttribute, actualTreePlusAttribute);
        
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    
    @Test
    public void testBuildIntervalSet6() throws Exception  {
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 1.37597668475064);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", 3.718415664424266E-309);
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 0.8681641227885848);
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", java.lang.Double.NaN);
        
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class vector2DType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Method buildIntervalSetMethod = subLineClazz.getDeclaredMethod("buildIntervalSet", vector2DType, vector2DType);
        buildIntervalSetMethod.setAccessible(true);
        java.lang.Object[] buildIntervalSetMethodArguments = new java.lang.Object[2];
        buildIntervalSetMethodArguments[0] = vector2D;
        buildIntervalSetMethodArguments[1] = vector2D1;
        IntervalsSet actual = ((IntervalsSet) buildIntervalSetMethod.invoke(null, buildIntervalSetMethodArguments));
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", java.lang.Double.NaN);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location);
        setField(cut, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut);
        BSPTree plus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute = false;
        plus.setAttribute(attribute);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus);
        BSPTree minus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut1 = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane1 = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", java.lang.Double.NaN);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location1);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct", true);
        setField(cut1, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut1);
        BSPTree plus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        plus1.setAttribute(attribute);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus1);
        BSPTree minus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(minus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        Boolean attribute1 = true;
        minus1.setAttribute(attribute1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus);
        IntervalsSet expected = new IntervalsSet(bSPTree);
        
        BSPTree expectedTree = ((BSPTree) getFieldValue(expected, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane expectedTreeCut = expectedTree.getCut();
        SubHyperplane actualTreeCut = actualTree.getCut();
        Hyperplane expectedTreeCutHyperplane = (((AbstractSubHyperplane) expectedTreeCut)).getHyperplane();
        Hyperplane actualTreeCutHyperplane = (((AbstractSubHyperplane) actualTreeCut)).getHyperplane();
        Vector1D expectedTreeCutHyperplaneLocation = (((OrientedPoint) expectedTreeCutHyperplane)).getLocation();
        Vector1D actualTreeCutHyperplaneLocation = (((OrientedPoint) actualTreeCutHyperplane)).getLocation();
        // org.apache.commons.math3.geometry.euclidean.oned.Vector1D has overridden equals method
        assertEquals(expectedTreeCutHyperplaneLocation, actualTreeCutHyperplaneLocation);
        
        boolean actualTreeCutHyperplaneDirect = ((Boolean) getFieldValue(actualTreeCutHyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct"));
        assertFalse(actualTreeCutHyperplaneDirect);
        
        Region actualTreeCutRemainingRegion = (((AbstractSubHyperplane) actualTreeCut)).getRemainingRegion();
        assertNull(actualTreeCutRemainingRegion);
        
        BSPTree expectedTreePlus = expectedTree.getPlus();
        BSPTree actualTreePlus = actualTree.getPlus();
        SubHyperplane actualTreePlusCut = actualTreePlus.getCut();
        assertNull(actualTreePlusCut);
        
        BSPTree actualTreePlusPlus = actualTreePlus.getPlus();
        assertNull(actualTreePlusPlus);
        
        BSPTree actualTreePlusMinus = actualTreePlus.getMinus();
        assertNull(actualTreePlusMinus);
        
        BSPTree expectedTreePlusParent = expectedTreePlus.getParent();
        BSPTree actualTreePlusParent = actualTreePlus.getParent();
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        BSPTree expectedTreePlusParentMinus = expectedTreePlusParent.getMinus();
        BSPTree actualTreePlusParentMinus = actualTreePlusParent.getMinus();
        SubHyperplane expectedTreePlusParentMinusCut = expectedTreePlusParentMinus.getCut();
        SubHyperplane actualTreePlusParentMinusCut = actualTreePlusParentMinus.getCut();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusCut, actualTreePlusParentMinusCut));
        
        BSPTree expectedTreePlusParentMinusPlus = expectedTreePlusParentMinus.getPlus();
        BSPTree actualTreePlusParentMinusPlus = actualTreePlusParentMinus.getPlus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusPlus, actualTreePlusParentMinusPlus));
        
        BSPTree expectedTreePlusParentMinusMinus = expectedTreePlusParentMinus.getMinus();
        BSPTree actualTreePlusParentMinusMinus = actualTreePlusParentMinus.getMinus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusMinus, actualTreePlusParentMinusMinus));
        
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        Object actualTreePlusParentMinusAttribute = actualTreePlusParentMinus.getAttribute();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualTreePlusParentMinusAttribute, actualTreePlusParentMinusAttribute));
        
        BSPTree actualTreePlusParentParent = actualTreePlusParent.getParent();
        assertNull(actualTreePlusParentParent);
        
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        
        Object expectedTreePlusAttribute = expectedTreePlus.getAttribute();
        Object actualTreePlusAttribute = actualTreePlus.getAttribute();
        assertEquals(expectedTreePlusAttribute, actualTreePlusAttribute);
        
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    
    @Test
    public void testBuildIntervalSet7() throws Exception  {
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", -1.7234153865889289E-307);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -2.7917287424000024E11);
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", -3.840935888564582E-307);
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -64.00001525878906);
        
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class vector2DType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Method buildIntervalSetMethod = subLineClazz.getDeclaredMethod("buildIntervalSet", vector2DType, vector2DType);
        buildIntervalSetMethod.setAccessible(true);
        java.lang.Object[] buildIntervalSetMethodArguments = new java.lang.Object[2];
        buildIntervalSetMethodArguments[0] = vector2D;
        buildIntervalSetMethodArguments[1] = vector2D1;
        IntervalsSet actual = ((IntervalsSet) buildIntervalSetMethod.invoke(null, buildIntervalSetMethodArguments));
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -2.7917287424000024E11);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location);
        setField(cut, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut);
        BSPTree plus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute = false;
        plus.setAttribute(attribute);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus);
        BSPTree minus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut1 = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane1 = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -64.00001525878906);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location1);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct", true);
        setField(cut1, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut1);
        BSPTree plus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        plus1.setAttribute(attribute);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus1);
        BSPTree minus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(minus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        Boolean attribute1 = true;
        minus1.setAttribute(attribute1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus);
        IntervalsSet expected = new IntervalsSet(bSPTree);
        
        BSPTree expectedTree = ((BSPTree) getFieldValue(expected, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane expectedTreeCut = expectedTree.getCut();
        SubHyperplane actualTreeCut = actualTree.getCut();
        Hyperplane expectedTreeCutHyperplane = (((AbstractSubHyperplane) expectedTreeCut)).getHyperplane();
        Hyperplane actualTreeCutHyperplane = (((AbstractSubHyperplane) actualTreeCut)).getHyperplane();
        Vector1D expectedTreeCutHyperplaneLocation = (((OrientedPoint) expectedTreeCutHyperplane)).getLocation();
        Vector1D actualTreeCutHyperplaneLocation = (((OrientedPoint) actualTreeCutHyperplane)).getLocation();
        // org.apache.commons.math3.geometry.euclidean.oned.Vector1D has overridden equals method
        assertEquals(expectedTreeCutHyperplaneLocation, actualTreeCutHyperplaneLocation);
        
        boolean actualTreeCutHyperplaneDirect = ((Boolean) getFieldValue(actualTreeCutHyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct"));
        assertFalse(actualTreeCutHyperplaneDirect);
        
        Region actualTreeCutRemainingRegion = (((AbstractSubHyperplane) actualTreeCut)).getRemainingRegion();
        assertNull(actualTreeCutRemainingRegion);
        
        BSPTree expectedTreePlus = expectedTree.getPlus();
        BSPTree actualTreePlus = actualTree.getPlus();
        SubHyperplane actualTreePlusCut = actualTreePlus.getCut();
        assertNull(actualTreePlusCut);
        
        BSPTree actualTreePlusPlus = actualTreePlus.getPlus();
        assertNull(actualTreePlusPlus);
        
        BSPTree actualTreePlusMinus = actualTreePlus.getMinus();
        assertNull(actualTreePlusMinus);
        
        BSPTree expectedTreePlusParent = expectedTreePlus.getParent();
        BSPTree actualTreePlusParent = actualTreePlus.getParent();
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        BSPTree expectedTreePlusParentMinus = expectedTreePlusParent.getMinus();
        BSPTree actualTreePlusParentMinus = actualTreePlusParent.getMinus();
        SubHyperplane expectedTreePlusParentMinusCut = expectedTreePlusParentMinus.getCut();
        SubHyperplane actualTreePlusParentMinusCut = actualTreePlusParentMinus.getCut();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusCut, actualTreePlusParentMinusCut));
        
        BSPTree expectedTreePlusParentMinusPlus = expectedTreePlusParentMinus.getPlus();
        BSPTree actualTreePlusParentMinusPlus = actualTreePlusParentMinus.getPlus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusPlus, actualTreePlusParentMinusPlus));
        
        BSPTree expectedTreePlusParentMinusMinus = expectedTreePlusParentMinus.getMinus();
        BSPTree actualTreePlusParentMinusMinus = actualTreePlusParentMinus.getMinus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusMinus, actualTreePlusParentMinusMinus));
        
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        Object actualTreePlusParentMinusAttribute = actualTreePlusParentMinus.getAttribute();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualTreePlusParentMinusAttribute, actualTreePlusParentMinusAttribute));
        
        BSPTree actualTreePlusParentParent = actualTreePlusParent.getParent();
        assertNull(actualTreePlusParentParent);
        
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        
        Object expectedTreePlusAttribute = expectedTreePlus.getAttribute();
        Object actualTreePlusAttribute = actualTreePlus.getAttribute();
        assertEquals(expectedTreePlusAttribute, actualTreePlusAttribute);
        
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    
    @Test
    public void testBuildIntervalSet8() throws Exception  {
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 1.567857934537607E-308);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", 0.0);
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 1.059809444696893E-308);
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -2.0E-323);
        
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class vector2DType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Method buildIntervalSetMethod = subLineClazz.getDeclaredMethod("buildIntervalSet", vector2DType, vector2DType);
        buildIntervalSetMethod.setAccessible(true);
        java.lang.Object[] buildIntervalSetMethodArguments = new java.lang.Object[2];
        buildIntervalSetMethodArguments[0] = vector2D;
        buildIntervalSetMethodArguments[1] = vector2D1;
        IntervalsSet actual = ((IntervalsSet) buildIntervalSetMethod.invoke(null, buildIntervalSetMethodArguments));
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -1.567857934537607E-308);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location);
        setField(cut, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut);
        BSPTree plus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute = false;
        plus.setAttribute(attribute);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus);
        BSPTree minus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut1 = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane1 = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -1.059809444696893E-308);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location1);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct", true);
        setField(cut1, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut1);
        BSPTree plus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        plus1.setAttribute(attribute);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus1);
        BSPTree minus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(minus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        Boolean attribute1 = true;
        minus1.setAttribute(attribute1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus);
        IntervalsSet expected = new IntervalsSet(bSPTree);
        
        BSPTree expectedTree = ((BSPTree) getFieldValue(expected, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane expectedTreeCut = expectedTree.getCut();
        SubHyperplane actualTreeCut = actualTree.getCut();
        Hyperplane expectedTreeCutHyperplane = (((AbstractSubHyperplane) expectedTreeCut)).getHyperplane();
        Hyperplane actualTreeCutHyperplane = (((AbstractSubHyperplane) actualTreeCut)).getHyperplane();
        Vector1D expectedTreeCutHyperplaneLocation = (((OrientedPoint) expectedTreeCutHyperplane)).getLocation();
        Vector1D actualTreeCutHyperplaneLocation = (((OrientedPoint) actualTreeCutHyperplane)).getLocation();
        // org.apache.commons.math3.geometry.euclidean.oned.Vector1D has overridden equals method
        assertEquals(expectedTreeCutHyperplaneLocation, actualTreeCutHyperplaneLocation);
        
        boolean actualTreeCutHyperplaneDirect = ((Boolean) getFieldValue(actualTreeCutHyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct"));
        assertFalse(actualTreeCutHyperplaneDirect);
        
        Region actualTreeCutRemainingRegion = (((AbstractSubHyperplane) actualTreeCut)).getRemainingRegion();
        assertNull(actualTreeCutRemainingRegion);
        
        BSPTree expectedTreePlus = expectedTree.getPlus();
        BSPTree actualTreePlus = actualTree.getPlus();
        SubHyperplane actualTreePlusCut = actualTreePlus.getCut();
        assertNull(actualTreePlusCut);
        
        BSPTree actualTreePlusPlus = actualTreePlus.getPlus();
        assertNull(actualTreePlusPlus);
        
        BSPTree actualTreePlusMinus = actualTreePlus.getMinus();
        assertNull(actualTreePlusMinus);
        
        BSPTree expectedTreePlusParent = expectedTreePlus.getParent();
        BSPTree actualTreePlusParent = actualTreePlus.getParent();
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        BSPTree expectedTreePlusParentMinus = expectedTreePlusParent.getMinus();
        BSPTree actualTreePlusParentMinus = actualTreePlusParent.getMinus();
        SubHyperplane expectedTreePlusParentMinusCut = expectedTreePlusParentMinus.getCut();
        SubHyperplane actualTreePlusParentMinusCut = actualTreePlusParentMinus.getCut();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusCut, actualTreePlusParentMinusCut));
        
        BSPTree expectedTreePlusParentMinusPlus = expectedTreePlusParentMinus.getPlus();
        BSPTree actualTreePlusParentMinusPlus = actualTreePlusParentMinus.getPlus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusPlus, actualTreePlusParentMinusPlus));
        
        BSPTree expectedTreePlusParentMinusMinus = expectedTreePlusParentMinus.getMinus();
        BSPTree actualTreePlusParentMinusMinus = actualTreePlusParentMinus.getMinus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusMinus, actualTreePlusParentMinusMinus));
        
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        Object actualTreePlusParentMinusAttribute = actualTreePlusParentMinus.getAttribute();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualTreePlusParentMinusAttribute, actualTreePlusParentMinusAttribute));
        
        BSPTree actualTreePlusParentParent = actualTreePlusParent.getParent();
        assertNull(actualTreePlusParentParent);
        
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        
        Object expectedTreePlusAttribute = expectedTreePlus.getAttribute();
        Object actualTreePlusAttribute = actualTreePlus.getAttribute();
        assertEquals(expectedTreePlusAttribute, actualTreePlusAttribute);
        
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    
    @Test
    public void testBuildIntervalSet9() throws Exception  {
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 55.38760273075016);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -1.58619804751E-312);
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 64.2656570677957);
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", 3.8918196973615985E-308);
        
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class vector2DType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Method buildIntervalSetMethod = subLineClazz.getDeclaredMethod("buildIntervalSet", vector2DType, vector2DType);
        buildIntervalSetMethod.setAccessible(true);
        java.lang.Object[] buildIntervalSetMethodArguments = new java.lang.Object[2];
        buildIntervalSetMethodArguments[0] = vector2D;
        buildIntervalSetMethodArguments[1] = vector2D1;
        IntervalsSet actual = ((IntervalsSet) buildIntervalSetMethod.invoke(null, buildIntervalSetMethodArguments));
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 55.38760273075016);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location);
        setField(cut, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut);
        BSPTree plus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute = false;
        plus.setAttribute(attribute);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus);
        BSPTree minus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut1 = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane1 = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 64.2656570677957);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location1);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct", true);
        setField(cut1, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut1);
        BSPTree plus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        plus1.setAttribute(attribute);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus1);
        BSPTree minus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(minus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        Boolean attribute1 = true;
        minus1.setAttribute(attribute1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus);
        IntervalsSet expected = new IntervalsSet(bSPTree);
        
        BSPTree expectedTree = ((BSPTree) getFieldValue(expected, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane expectedTreeCut = expectedTree.getCut();
        SubHyperplane actualTreeCut = actualTree.getCut();
        Hyperplane expectedTreeCutHyperplane = (((AbstractSubHyperplane) expectedTreeCut)).getHyperplane();
        Hyperplane actualTreeCutHyperplane = (((AbstractSubHyperplane) actualTreeCut)).getHyperplane();
        Vector1D expectedTreeCutHyperplaneLocation = (((OrientedPoint) expectedTreeCutHyperplane)).getLocation();
        Vector1D actualTreeCutHyperplaneLocation = (((OrientedPoint) actualTreeCutHyperplane)).getLocation();
        // org.apache.commons.math3.geometry.euclidean.oned.Vector1D has overridden equals method
        assertEquals(expectedTreeCutHyperplaneLocation, actualTreeCutHyperplaneLocation);
        
        boolean actualTreeCutHyperplaneDirect = ((Boolean) getFieldValue(actualTreeCutHyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct"));
        assertFalse(actualTreeCutHyperplaneDirect);
        
        Region actualTreeCutRemainingRegion = (((AbstractSubHyperplane) actualTreeCut)).getRemainingRegion();
        assertNull(actualTreeCutRemainingRegion);
        
        BSPTree expectedTreePlus = expectedTree.getPlus();
        BSPTree actualTreePlus = actualTree.getPlus();
        SubHyperplane actualTreePlusCut = actualTreePlus.getCut();
        assertNull(actualTreePlusCut);
        
        BSPTree actualTreePlusPlus = actualTreePlus.getPlus();
        assertNull(actualTreePlusPlus);
        
        BSPTree actualTreePlusMinus = actualTreePlus.getMinus();
        assertNull(actualTreePlusMinus);
        
        BSPTree expectedTreePlusParent = expectedTreePlus.getParent();
        BSPTree actualTreePlusParent = actualTreePlus.getParent();
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        BSPTree expectedTreePlusParentMinus = expectedTreePlusParent.getMinus();
        BSPTree actualTreePlusParentMinus = actualTreePlusParent.getMinus();
        SubHyperplane expectedTreePlusParentMinusCut = expectedTreePlusParentMinus.getCut();
        SubHyperplane actualTreePlusParentMinusCut = actualTreePlusParentMinus.getCut();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusCut, actualTreePlusParentMinusCut));
        
        BSPTree expectedTreePlusParentMinusPlus = expectedTreePlusParentMinus.getPlus();
        BSPTree actualTreePlusParentMinusPlus = actualTreePlusParentMinus.getPlus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusPlus, actualTreePlusParentMinusPlus));
        
        BSPTree expectedTreePlusParentMinusMinus = expectedTreePlusParentMinus.getMinus();
        BSPTree actualTreePlusParentMinusMinus = actualTreePlusParentMinus.getMinus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusMinus, actualTreePlusParentMinusMinus));
        
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        Object actualTreePlusParentMinusAttribute = actualTreePlusParentMinus.getAttribute();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualTreePlusParentMinusAttribute, actualTreePlusParentMinusAttribute));
        
        BSPTree actualTreePlusParentParent = actualTreePlusParent.getParent();
        assertNull(actualTreePlusParentParent);
        
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        
        Object expectedTreePlusAttribute = expectedTreePlus.getAttribute();
        Object actualTreePlusAttribute = actualTreePlus.getAttribute();
        assertEquals(expectedTreePlusAttribute, actualTreePlusAttribute);
        
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    
    @Test
    public void testBuildIntervalSet10() throws Exception  {
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", -1.2500000004947651);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -1.805186076962925E72);
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", -8.000000001658918);
        setField(vector2D1, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", -5.787360018741594E77);
        
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class vector2DType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
        Method buildIntervalSetMethod = subLineClazz.getDeclaredMethod("buildIntervalSet", vector2DType, vector2DType);
        buildIntervalSetMethod.setAccessible(true);
        java.lang.Object[] buildIntervalSetMethodArguments = new java.lang.Object[2];
        buildIntervalSetMethodArguments[0] = vector2D;
        buildIntervalSetMethodArguments[1] = vector2D1;
        IntervalsSet actual = ((IntervalsSet) buildIntervalSetMethod.invoke(null, buildIntervalSetMethodArguments));
        
        BSPTree bSPTree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 1.805186076962925E72);
        setField(hyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location);
        setField(cut, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut);
        BSPTree plus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        Boolean attribute = false;
        plus.setAttribute(attribute);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus);
        BSPTree minus = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        SubOrientedPoint cut1 = ((SubOrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint"));
        OrientedPoint hyperplane1 = ((OrientedPoint) createInstance("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
        Vector1D location1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(location1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 5.787360018741594E77);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "location", location1);
        setField(hyperplane1, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct", true);
        setField(cut1, "org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane", "hyperplane", hyperplane1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "cut", cut1);
        BSPTree plus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(plus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        plus1.setAttribute(attribute);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "plus", plus1);
        BSPTree minus1 = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(minus1, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", minus);
        Boolean attribute1 = true;
        minus1.setAttribute(attribute1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus1);
        setField(minus, "org.apache.commons.math3.geometry.partitioning.BSPTree", "parent", bSPTree);
        setField(bSPTree, "org.apache.commons.math3.geometry.partitioning.BSPTree", "minus", minus);
        IntervalsSet expected = new IntervalsSet(bSPTree);
        
        BSPTree expectedTree = ((BSPTree) getFieldValue(expected, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        SubHyperplane expectedTreeCut = expectedTree.getCut();
        SubHyperplane actualTreeCut = actualTree.getCut();
        Hyperplane expectedTreeCutHyperplane = (((AbstractSubHyperplane) expectedTreeCut)).getHyperplane();
        Hyperplane actualTreeCutHyperplane = (((AbstractSubHyperplane) actualTreeCut)).getHyperplane();
        Vector1D expectedTreeCutHyperplaneLocation = (((OrientedPoint) expectedTreeCutHyperplane)).getLocation();
        Vector1D actualTreeCutHyperplaneLocation = (((OrientedPoint) actualTreeCutHyperplane)).getLocation();
        // org.apache.commons.math3.geometry.euclidean.oned.Vector1D has overridden equals method
        assertEquals(expectedTreeCutHyperplaneLocation, actualTreeCutHyperplaneLocation);
        
        boolean actualTreeCutHyperplaneDirect = ((Boolean) getFieldValue(actualTreeCutHyperplane, "org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint", "direct"));
        assertFalse(actualTreeCutHyperplaneDirect);
        
        Region actualTreeCutRemainingRegion = (((AbstractSubHyperplane) actualTreeCut)).getRemainingRegion();
        assertNull(actualTreeCutRemainingRegion);
        
        BSPTree expectedTreePlus = expectedTree.getPlus();
        BSPTree actualTreePlus = actualTree.getPlus();
        SubHyperplane actualTreePlusCut = actualTreePlus.getCut();
        assertNull(actualTreePlusCut);
        
        BSPTree actualTreePlusPlus = actualTreePlus.getPlus();
        assertNull(actualTreePlusPlus);
        
        BSPTree actualTreePlusMinus = actualTreePlus.getMinus();
        assertNull(actualTreePlusMinus);
        
        BSPTree expectedTreePlusParent = expectedTreePlus.getParent();
        BSPTree actualTreePlusParent = actualTreePlus.getParent();
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        BSPTree expectedTreePlusParentMinus = expectedTreePlusParent.getMinus();
        BSPTree actualTreePlusParentMinus = actualTreePlusParent.getMinus();
        SubHyperplane expectedTreePlusParentMinusCut = expectedTreePlusParentMinus.getCut();
        SubHyperplane actualTreePlusParentMinusCut = actualTreePlusParentMinus.getCut();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusCut, actualTreePlusParentMinusCut));
        
        BSPTree expectedTreePlusParentMinusPlus = expectedTreePlusParentMinus.getPlus();
        BSPTree actualTreePlusParentMinusPlus = actualTreePlusParentMinus.getPlus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusPlus, actualTreePlusParentMinusPlus));
        
        BSPTree expectedTreePlusParentMinusMinus = expectedTreePlusParentMinus.getMinus();
        BSPTree actualTreePlusParentMinusMinus = actualTreePlusParentMinus.getMinus();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedTreePlusParentMinusMinus, actualTreePlusParentMinusMinus));
        
        assertTrue(deepEquals(expectedTreePlusParentMinus, actualTreePlusParentMinus));
        Object actualTreePlusParentMinusAttribute = actualTreePlusParentMinus.getAttribute();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualTreePlusParentMinusAttribute, actualTreePlusParentMinusAttribute));
        
        BSPTree actualTreePlusParentParent = actualTreePlusParent.getParent();
        assertNull(actualTreePlusParentParent);
        
        assertTrue(deepEquals(expectedTreePlusParent, actualTreePlusParent));
        
        Object expectedTreePlusAttribute = expectedTreePlus.getAttribute();
        Object actualTreePlusAttribute = actualTreePlus.getAttribute();
        assertEquals(expectedTreePlusAttribute, actualTreePlusAttribute);
        
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        assertTrue(deepEquals(expectedTree, actualTree));
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSegments()
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.returnsFrom {@code return segments;}
 *  */
    @Test
    public void testGetSegments_ReturnSegments() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
        Boolean boolean1 = false;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class lineType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(lineType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = line;
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        ArrayList actual = ((ArrayList) subLine.getSegments());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
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
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree1);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        ArrayList actual = ((ArrayList) subLine1.getSegments());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSegments()
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_10() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        PolyhedronsSet polyhedronsSet = new PolyhedronsSet();
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polyhedronsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, polyhedronsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = polyhedronsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: class org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet cannot be cast to class org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet (org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet and org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments(SubLine.java:83) */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Line line = (Line) getHyperplane();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException() {
        Plane plane = new Plane(((Plane) null));
        SubLine subLine = new SubLine(plane, ((Region) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
        byte[] byteArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, byteArray);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class lineType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(lineType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = line;
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
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
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_3() throws Exception  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 4.9E-324);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        byte[] byteArray = {};
        BSPTree bSPTree1 = new BSPTree(null, null, null, byteArray);
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
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class lineType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(lineType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = line;
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_4() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", java.lang.Double.NaN);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Plane plane = ((Plane) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Plane"));
        Vector3D w = ((Vector3D) createInstance("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setField(plane, "org.apache.commons.math3.geometry.euclidean.threed.Plane", "w", w);
        SubLine subLine1 = new SubLine(plane, ((Region) null));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLine1Type = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLine1Type, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine1;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = bSPTree1;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree2);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine2 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.euclidean.threed.Vector3D can not be casted to org.apache.commons.math3.geometry.euclidean.oned.Vector1D] */
        subLine2.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_5() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", java.lang.Double.NaN);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.0);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubLine subLine1 = new SubLine(orientedPoint1, ((Region) null));
        byte[] byteArray = {};
        BSPTree bSPTree1 = new BSPTree(null, null, null, byteArray);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLine1Type = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLine1Type, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine1;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree1;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = bSPTree2;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine2 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine2.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_6() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 1.8665272491799173E-301);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(orientedPoint, null);
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 1.8665272266832523E-301);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubLine subLine = new SubLine(orientedPoint1, ((Region) null));
        Object object = new Object();
        BSPTree bSPTree1 = new BSPTree(null, null, null, object);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree1;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subOrientedPoint;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = bSPTree2;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_7() throws Exception  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -16.03515735641122);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -1.9999966956674948);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubLine subLine1 = new SubLine(orientedPoint1, ((Region) null));
        byte[] byteArray = {};
        BSPTree bSPTree1 = new BSPTree(null, null, null, byteArray);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLine1Type = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLine1Type, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine1;
        bSPTreeConstructorArguments[1] = bSPTree1;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = bSPTree2;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class lineType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(lineType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = line;
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine2 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine2.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_8() throws Exception  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -2.2218738806230836E-308);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(orientedPoint, null);
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -2.23166068283949E-308);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, true);
        SubLine subLine = new SubLine(orientedPoint1, ((Region) null));
        int[] intArray = {};
        BSPTree bSPTree1 = new BSPTree(null, null, null, intArray);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = bSPTree1;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subOrientedPoint;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = bSPTree2;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class lineType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(lineType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = line;
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetSegments_ThrowClassCastException_9() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -1.1421641376801404);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", java.lang.Double.NaN);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubLine subLine1 = new SubLine(orientedPoint1, ((Region) null));
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
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine1;
        bSPTreeConstructorArguments1[1] = bSPTree1;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        java.lang.Object[] bSPTreeConstructorArguments2 = new java.lang.Object[4];
        bSPTreeConstructorArguments2[0] = subLine;
        bSPTreeConstructorArguments2[1] = bSPTree;
        bSPTreeConstructorArguments2[2] = bSPTree2;
        bSPTreeConstructorArguments2[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments2));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine2 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.euclidean.threed.Vector3D can not be casted to org.apache.commons.math3.geometry.euclidean.oned.Vector1D] */
        subLine2.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_9() {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments(SubLine.java:83) */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_10() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(((BSPTree) null));
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class lineType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(lineType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = line;
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.recurseList(IntervalsSet.java:224)
            org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet.asList(IntervalsSet.java:209)
            org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments(SubLine.java:83) */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D start = line.toSpace(new Vector1D(interval.getInf()));
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
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
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_3() throws Exception  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
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
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class lineType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(lineType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = line;
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_4() throws Exception  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
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
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class lineType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(lineType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = line;
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_5() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
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
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class lineType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(lineType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = line;
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_6() throws Exception  {
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.0;
        lineConstructorArguments[1] = 0.0;
        lineConstructorArguments[2] = 0.0;
        lineConstructorArguments[3] = 0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.0);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
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
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree1);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class lineType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(lineType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = line;
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D start = line.toSpace(new Vector1D(interval.getInf()));
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_7() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", java.lang.Double.NaN);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubPlane subPlane = new SubPlane(orientedPoint, null);
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Boolean boolean2 = false;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean2);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subPlaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subPlaneType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = bSPTree1;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree2);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine.getSegments();
    }
    
    /**
    @utbot.classUnderTest {@link SubLine}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final List<Interval> list = ((IntervalsSet) getRemainingRegion()).asList();
 *  */
    @Test
    public void testGetSegments_ThrowNullPointerException_8() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 1.0011475309811433);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubLine subLine = new SubLine(orientedPoint, ((Region) null));
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 0.9990704508464107);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(orientedPoint1, null);
        Boolean boolean2 = true;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean2);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree1;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = bSPTree2;
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree3);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = intervalsSet;
        SubLine subLine1 = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.SubLine.getSegments] produces [java.lang.NullPointerException] */
        subLine1.getSegments();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getSegments()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.SubLine#getSegments()}
     */
    @Test
    public void testGetSegments() throws Exception  {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        Vector2D vector2D = new Vector2D(doubleArray);
        Vector2D vector2D1 = new Vector2D(-1.0, vector2D);
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        Vector2D vector2D2 = new Vector2D(doubleArray1);
        Vector2D vector2D3 = new Vector2D(1.0, vector2D2);
        SubLine subLine = new SubLine(vector2D1, vector2D3);
        
        ArrayList actual = ((ArrayList) subLine.getSegments());
        
        ArrayList expected = new ArrayList();
        Vector2D vector2D4 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D4, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", java.lang.Double.NaN);
        setField(vector2D4, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", java.lang.Double.NaN);
        Vector2D vector2D5 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D5, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", java.lang.Double.NaN);
        setField(vector2D5, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", java.lang.Double.NaN);
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class doubleType = double.class;
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 0.7853981633974483;
        lineConstructorArguments[1] = 0.7071067811865476;
        lineConstructorArguments[2] = 0.7071067811865475;
        lineConstructorArguments[3] = java.lang.Double.NaN;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
        Segment segment = new Segment(vector2D4, vector2D5, line);
        expected.add(segment);
        
        assertTrue(deepEquals(expected, actual));
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
        
                java.lang.reflect.Method methodForGetDeclaredFields714686546111400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields714686546111400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass714686546118700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields714686546111400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass714686546118700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields714686546892500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields714686546892500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass714686546895800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields714686546892500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass714686546895800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


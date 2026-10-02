package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node;
import org.apache.commons.math3.geometry.partitioning.utilities.AVLTree;
import java.util.ArrayList;
import com.sun.org.apache.xerces.internal.utils.XMLSecurityManager.Limit;
import com.sun.org.apache.xerces.internal.utils.XMLSecurityManager;
import jdk.xml.internal.JdkProperty.State;
import jdk.xml.internal.JdkProperty;
import javax.swing.SwingWorker.StateValue;
import javax.swing.SwingWorker;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.BoundaryAttribute;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_math3_geometry_euclidean_twod_PolygonsSetTest {
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.boxBoundary
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method boxBoundary(double, double, double, double)
    
    @Test
    public void testBoxBoundaryByFuzzer() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException  {
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class doubleType = double.class;
        Method boxBoundaryMethod = polygonsSetClazz.getDeclaredMethod("boxBoundary", doubleType, doubleType, doubleType, doubleType);
        boxBoundaryMethod.setAccessible(true);
        java.lang.Object[] boxBoundaryMethodArguments = new java.lang.Object[4];
        boxBoundaryMethodArguments[0] = 0.0;
        boxBoundaryMethodArguments[1] = -8.636168555094445E-78;
        boxBoundaryMethodArguments[2] = 0.0;
        boxBoundaryMethodArguments[3] = -1.0;
        org.apache.commons.math3.geometry.euclidean.twod.Line[] actual = ((org.apache.commons.math3.geometry.euclidean.twod.Line[]) boxBoundaryMethod.invoke(null, boxBoundaryMethodArguments));
        
        org.apache.commons.math3.geometry.euclidean.twod.Line[] expected = new org.apache.commons.math3.geometry.euclidean.twod.Line[4];
        Class lineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line");
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line$1");
        Constructor lineConstructor = lineClazz.getDeclaredConstructor(doubleType, doubleType, doubleType, doubleType, anonymousObjectType);
        lineConstructor.setAccessible(true);
        java.lang.Object[] lineConstructorArguments = new java.lang.Object[5];
        lineConstructorArguments[0] = 3.141592653589793;
        lineConstructorArguments[1] = -1.0;
        lineConstructorArguments[2] = 1.2246467991473532E-16;
        lineConstructorArguments[3] = -0.0;
        lineConstructorArguments[4] = ((Object) null);
        Line line = ((Line) lineConstructor.newInstance(lineConstructorArguments));
        expected[0] = line;
        java.lang.Object[] lineConstructorArguments1 = new java.lang.Object[5];
        lineConstructorArguments1[0] = 4.71238898038469;
        lineConstructorArguments1[1] = -1.8369701987210297E-16;
        lineConstructorArguments1[2] = -1.0;
        lineConstructorArguments1[3] = -8.636168555094445E-78;
        lineConstructorArguments1[4] = ((Object) null);
        Line line1 = ((Line) lineConstructor.newInstance(lineConstructorArguments1));
        expected[1] = line1;
        java.lang.Object[] lineConstructorArguments2 = new java.lang.Object[5];
        lineConstructorArguments2[0] = 0.0;
        lineConstructorArguments2[1] = 1.0;
        lineConstructorArguments2[2] = 0.0;
        lineConstructorArguments2[3] = -1.0;
        lineConstructorArguments2[4] = ((Object) null);
        Line line2 = ((Line) lineConstructor.newInstance(lineConstructorArguments2));
        expected[2] = line2;
        java.lang.Object[] lineConstructorArguments3 = new java.lang.Object[5];
        lineConstructorArguments3[0] = 1.5707963267948966;
        lineConstructorArguments3[1] = 6.123233995736766E-17;
        lineConstructorArguments3[2] = 1.0;
        lineConstructorArguments3[3] = -0.0;
        lineConstructorArguments3[4] = ((Object) null);
        Line line3 = ((Line) lineConstructor.newInstance(lineConstructorArguments3));
        expected[3] = line3;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node, org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 *  */
    @Test
    public void testFollowLoop() throws Exception  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        Vector2D start = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "start", start);
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "end", start);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree.Node parent = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(parent, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", parent);
        setField(parent, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", parent);
        Class skewClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew");
        Object skew = getEnumConstantByName(skewClazz, "BALANCED");
        setField(parent, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "skew", skew);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", parent);
        
        AVLTree.Node nodeParent = ((AVLTree.Node) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent"));
        Object initialNodeParentSkew = getFieldValue(nodeParent, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "skew");
        
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        ArrayList actual = ((ArrayList) followLoopMethod.invoke(polygonsSet, followLoopMethodArguments));
        
        ArrayList expected = new ArrayList();
        expected.add(element);
        
        assertTrue(deepEquals(expected, actual));
        
        Comparable finalNodeElement = ((Comparable) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element"));
        AVLTree.Node nodeParent1 = ((AVLTree.Node) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent"));
        Object finalNodeParentSkew = getFieldValue(nodeParent1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "skew");
        
        assertFalse(initialNodeParentSkew == finalNodeParentSkew);
        
        assertNull(finalNodeElement);
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 *  */
    @Test
    public void testFollowLoop_1() throws Exception  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        Vector2D start = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "start", start);
        Vector2D end = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "end", end);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree.Node right = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        AVLTree.Node left = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        XMLSecurityManager.Limit element1 = XMLSecurityManager.Limit.ENTITY_EXPANSION_LIMIT;
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element1);
        AVLTree.Node right1 = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(right1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", right1);
        setField(right1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right1);
        setField(right1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", right1);
        Class skewClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew");
        Object skew = getEnumConstantByName(skewClazz, "RIGHT_HIGH");
        setField(right1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "skew", skew);
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right1);
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", right1);
        setField(right, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", left);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right);
        
        Comparable initialNodeElement = ((Comparable) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element"));
        
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        ArrayList actual = ((ArrayList) followLoopMethod.invoke(polygonsSet, followLoopMethodArguments));
        
        ArrayList expected = new ArrayList();
        expected.add(element);
        
        assertTrue(deepEquals(expected, actual));
        
        Comparable finalNodeElement = ((Comparable) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element"));
        
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.executesCondition {@code (end == null): True}
 * @utbot.executesCondition {@code (!open): False}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment#getStart()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.returnsFrom {@code return loop;}
 *  */
    @Test
    public void testFollowLoop_Open() throws Exception  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree this$0 = ((AVLTree) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree"));
        AVLTree.Node top = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(this$0, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree", "top", top);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "this$0", this$0);
        
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        ArrayList actual = ((ArrayList) followLoopMethod.invoke(polygonsSet, followLoopMethodArguments));
        
        ArrayList expected = new ArrayList();
        expected.add(element);
        
        assertTrue(deepEquals(expected, actual));
        
        Comparable finalNodeElement = ((Comparable) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element"));
        AVLTree nodeThis$0 = ((AVLTree) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "this$0"));
        AVLTree.Node finalNodeThis$0Top = ((AVLTree.Node) getFieldValue(nodeThis$0, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree", "top"));
        
        assertNull(finalNodeElement);
        
        assertNull(finalNodeThis$0Top);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node, org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ComparableSegment segment = node.getElement();
 *  */
    @Test
    public void testFollowLoop_ThrowNullPointerException() throws Throwable  {
        PolygonsSet polygonsSet = new PolygonsSet();
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(PolygonsSet.java:297) */
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = ((Object) null);
        followLoopMethodArguments[1] = ((Object) null);
        try {
            followLoopMethod.invoke(polygonsSet, followLoopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D globalStart = segment.getStart();
 *  */
    @Test
    public void testFollowLoop_ThrowNullPointerException_1() throws Throwable  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(PolygonsSet.java:299) */
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        try {
            followLoopMethod.invoke(polygonsSet, followLoopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.delete();
 *  */
    @Test
    public void testFollowLoop_ThrowNullPointerException_6() throws Throwable  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        Vector2D start = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "start", start);
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "end", start);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree.Node left = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        JdkProperty.State element1 = JdkProperty.State.DEFAULT;
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element1);
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", left);
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", left);
        Class skewClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew");
        Object skew = getEnumConstantByName(skewClazz, "RIGHT_HIGH");
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "skew", skew);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", left);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.rebalanceLeftShrunk(AVLTree.java:499)
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.delete(AVLTree.java:401)
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(PolygonsSet.java:301) */
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        try {
            followLoopMethod.invoke(polygonsSet, followLoopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.delete();
 *  */
    @Test
    public void testFollowLoop_ThrowNullPointerException_2() throws Throwable  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        Vector2D start = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "start", start);
        Vector2D end = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "end", end);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree.Node parent = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(parent, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", node);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", parent);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.rebalanceLeftShrunk(AVLTree.java:494)
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.delete(AVLTree.java:401)
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(PolygonsSet.java:301) */
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        try {
            followLoopMethod.invoke(polygonsSet, followLoopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.delete();
 *  */
    @Test
    public void testFollowLoop_ThrowNullPointerException_4() throws Throwable  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        Vector2D start = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "start", start);
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "end", start);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree.Node parent = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(parent, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", parent);
        Class skewClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew");
        Object skew = getEnumConstantByName(skewClazz, "LEFT_HIGH");
        setField(parent, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "skew", skew);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", parent);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.rebalanceRightShrunk(AVLTree.java:544)
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.delete(AVLTree.java:401)
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(PolygonsSet.java:301) */
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        try {
            followLoopMethod.invoke(polygonsSet, followLoopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.delete();
 *  */
    @Test
    public void testFollowLoop_ThrowNullPointerException_5() throws Throwable  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        Vector2D end = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "end", end);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree.Node left = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        JdkProperty.State element1 = JdkProperty.State.DEFAULT;
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element1);
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", left);
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", left);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", left);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.rebalanceLeftShrunk(AVLTree.java:494)
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.delete(AVLTree.java:401)
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(PolygonsSet.java:301) */
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        try {
            followLoopMethod.invoke(polygonsSet, followLoopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.delete();
 *  */
    @Test
    public void testFollowLoop_ThrowNullPointerException_8() throws Throwable  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        Vector2D end = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "end", end);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree.Node left = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        AVLTree.Node right = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        SwingWorker.StateValue element1 = SwingWorker.StateValue.PENDING;
        setField(right, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element1);
        AVLTree.Node left1 = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(left1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", left1);
        setField(left1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", left1);
        setField(left1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", left1);
        setField(right, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", left1);
        setField(right, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", left1);
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", left);
        AVLTree.Node parent = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", parent);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.rebalanceRightShrunk(AVLTree.java:539)
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.delete(AVLTree.java:401)
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(PolygonsSet.java:301) */
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        try {
            followLoopMethod.invoke(polygonsSet, followLoopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.delete();
 *  */
    @Test
    public void testFollowLoop_ThrowNullPointerException_3() throws Throwable  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree.Node right = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element1 = createInstance("java.nio.HeapIntBuffer");
        setField(right, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element1);
        AVLTree.Node right1 = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(right1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", right);
        setField(right1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", right1);
        setField(right, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right1);
        setField(right, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", right1);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", right1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.rebalanceLeftShrunk(AVLTree.java:494)
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.delete(AVLTree.java:401)
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(PolygonsSet.java:301) */
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        try {
            followLoopMethod.invoke(polygonsSet, followLoopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.delete();
 *  */
    @Test
    public void testFollowLoop_ThrowNullPointerException_7() throws Throwable  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        Vector2D start = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "start", start);
        Vector2D end = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "end", end);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree.Node right = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        AVLTree.Node left = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        SwingWorker.StateValue element1 = SwingWorker.StateValue.PENDING;
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element1);
        AVLTree.Node right1 = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(right1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", right1);
        setField(right1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right1);
        setField(right1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", right1);
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right1);
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", right1);
        setField(right, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", left);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.rebalanceRightShrunk(AVLTree.java:539)
            org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node.delete(AVLTree.java:401)
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(PolygonsSet.java:301) */
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        try {
            followLoopMethod.invoke(polygonsSet, followLoopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node, org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node,org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)}
 * @utbot.executesCondition {@code (end == null): True}
 * @utbot.executesCondition {@code (!open): True}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node#getElement()}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment#getStart()}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment#getEnd()}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node#delete()}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment#getStart()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathInternalError} when: (end == null) && !open
 *  */
    @Test(expected = MathInternalError.class)
    public void testFollowLoop_ThrowMathInternalError() throws Throwable  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        Vector2D start = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(element, "org.apache.commons.math3.geometry.euclidean.twod.Segment", "start", start);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree this$0 = ((AVLTree) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree"));
        AVLTree.Node top = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(this$0, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree", "top", top);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "this$0", this$0);
        
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        try {
            followLoopMethod.invoke(polygonsSet, followLoopMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node, org.apache.commons.math3.geometry.partitioning.utilities.AVLTree)
    
    @Test
    public void testFollowLoop1() throws Exception  {
        PolygonsSet polygonsSet = new PolygonsSet();
        AVLTree.Node node = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        Object element = createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$ComparableSegment");
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element", element);
        AVLTree.Node right = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        AVLTree.Node left = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right);
        AVLTree.Node parent = ((AVLTree.Node) createInstance("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node"));
        setField(parent, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", right);
        Class skewClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew");
        Object skew = getEnumConstantByName(skewClazz, "LEFT_HIGH");
        setField(parent, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "skew", skew);
        setField(left, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "parent", parent);
        setField(right, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left", left);
        Object skew1 = getEnumConstantByName(skewClazz, "BALANCED");
        setField(right, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "skew", skew1);
        setField(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right", right);
        
        AVLTree.Node nodeRight = ((AVLTree.Node) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right"));
        Object initialNodeRightSkew = getFieldValue(nodeRight, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "skew");
        
        Class polygonsSetClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet");
        Class nodeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node");
        Class aVLTreeType = Class.forName("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
        Method followLoopMethod = polygonsSetClazz.getDeclaredMethod("followLoop", nodeType, aVLTreeType);
        followLoopMethod.setAccessible(true);
        java.lang.Object[] followLoopMethodArguments = new java.lang.Object[2];
        followLoopMethodArguments[0] = node;
        followLoopMethodArguments[1] = ((Object) null);
        ArrayList actual = ((ArrayList) followLoopMethod.invoke(polygonsSet, followLoopMethodArguments));
        
        ArrayList expected = new ArrayList();
        expected.add(element);
        
        assertTrue(deepEquals(expected, actual));
        
        Comparable finalNodeElement = ((Comparable) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "element"));
        AVLTree.Node nodeRight1 = ((AVLTree.Node) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right"));
        AVLTree.Node finalNodeRightLeft = ((AVLTree.Node) getFieldValue(nodeRight1, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "left"));
        AVLTree.Node nodeRight2 = ((AVLTree.Node) getFieldValue(node, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "right"));
        Object finalNodeRightSkew = getFieldValue(nodeRight2, "org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Node", "skew");
        
        assertFalse(initialNodeRightSkew == finalNodeRightSkew);
        
        assertNull(finalNodeElement);
        
        assertNull(finalNodeRightLeft);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.buildNew
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree)
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree)}
 * @utbot.returnsFrom {@code return new PolygonsSet(tree);}
 *  */
    @Test
    public void testBuildNew_Return() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        PolygonsSet polygonsSet = new PolygonsSet();
        
        PolygonsSet actual = polygonsSet.buildNew(((BSPTree) null));
        
        PolygonsSet expected = new PolygonsSet(((BSPTree) null));
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] actualVertices = actual.getVertices();
        assertNull(actualVertices);
        
        BSPTree actualTree = ((BSPTree) getFieldValue(actual, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree"));
        assertNull(actualTree);
        
        double expectedSize = expected.getSize();
        double actualSize = actual.getSize();
        org.junit.Assert.assertEquals(expectedSize, actualSize, 1.0E-6);
        
        Vector actualBarycenter = actual.getBarycenter();
        assertNull(actualBarycenter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVertices()
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (vertices == null): False}
 * @utbot.returnsFrom {@code return vertices.clone();}
 *  */
    @Test
    public void testGetVertices_VerticesNotEqualsNull() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = {};
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] actual = polygonsSet.getVertices();
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (vertices == null): True}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): True}
 * @utbot.returnsFrom {@code return vertices.clone();}
 *  */
    @Test
    public void testGetVertices_GetTreeFalseGetCutEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] initialPolygonsSetVertices = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][]) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices"));
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] actual = polygonsSet.getVertices();
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] finalPolygonsSetVertices = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][]) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices"));
        
        assertFalse(initialPolygonsSetVertices == finalPolygonsSetVertices);
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (vertices == null): True}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getTree(boolean)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.partitioning.BSPTree#visit(org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor)}
 *  */
    @Test
    public void testGetVertices_GetTreeFalseGetCutNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        BoundaryAttribute boundaryAttribute = new BoundaryAttribute(null, null);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class boundaryAttributeType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, boundaryAttributeType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = boundaryAttribute;
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] initialPolygonsSetVertices = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][]) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices"));
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] actual = polygonsSet.getVertices();
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] finalPolygonsSetVertices = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][]) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices"));
        
        assertFalse(initialPolygonsSetVertices == finalPolygonsSetVertices);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getVertices()
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathInternalError} in: getTree(true).visit(visitor);
 *  */
    @Test(expected = MathInternalError.class)
    public void testGetVertices_ThrowMathInternalError() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -1.0851037677700094E-308);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(orientedPoint, null);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -5.713046902490549E-306);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubPlane subPlane = new SubPlane(orientedPoint1, null);
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
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subOrientedPoint;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathInternalError} in: getTree(true).visit(visitor);
 *  */
    @Test(expected = MathInternalError.class)
    public void testGetVertices_ThrowMathInternalError_1() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -1.3435752215134178E-138);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(orientedPoint, null);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -2.0973910069021049E-94);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, true);
        SubLine subLine = new SubLine(orientedPoint1, ((Region) null));
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
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subOrientedPoint;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        polygonsSet.getVertices();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getVertices()
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(null, null);
        byte[] byteArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, byteArray);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowClassCastException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubPlane subPlane = new SubPlane(null, null);
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        byte[][] byteArray = {};
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subPlaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class byteArrayType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subPlaneType, bSPTreeClazz, bSPTreeClazz, byteArrayType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = ((Object) byteArray);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowClassCastException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
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
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(line, null);
        SubPlane subPlane = new SubPlane(null, null);
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
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subOrientedPoint;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowClassCastException_3() throws Exception  {
        Vector1D vector1D = new Vector1D(0.0);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(orientedPoint, null);
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
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subOrientedPoint;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.euclidean.threed.Vector3D can not be casted to org.apache.commons.math3.geometry.euclidean.oned.Vector1D] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowClassCastException_4() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        Plane plane = new Plane(((Plane) null));
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
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowClassCastException_5() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Plane plane = new Plane(((Plane) null));
        SubLine subLine = new SubLine(plane, ((Region) null));
        SubPlane subPlane = new SubPlane(null, null);
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
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowClassCastException_6() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        byte[] byteArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, byteArray);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        Class subOrientedPointClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subOrientedPointConstructor = subOrientedPointClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subOrientedPointConstructor.setAccessible(true);
        java.lang.Object[] subOrientedPointConstructorArguments = new java.lang.Object[2];
        subOrientedPointConstructorArguments[0] = ((Object) null);
        subOrientedPointConstructorArguments[1] = intervalsSet;
        SubOrientedPoint subOrientedPoint = ((SubOrientedPoint) subOrientedPointConstructor.newInstance(subOrientedPointConstructorArguments));
        Class boundaryAttributeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BoundaryAttribute");
        Class subHyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Constructor boundaryAttributeConstructor = boundaryAttributeClazz.getDeclaredConstructor(subHyperplaneType, subHyperplaneType);
        boundaryAttributeConstructor.setAccessible(true);
        java.lang.Object[] boundaryAttributeConstructorArguments = new java.lang.Object[2];
        boundaryAttributeConstructorArguments[0] = ((Object) null);
        boundaryAttributeConstructorArguments[1] = subOrientedPoint;
        BoundaryAttribute boundaryAttribute = ((BoundaryAttribute) boundaryAttributeConstructor.newInstance(boundaryAttributeConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class boundaryAttributeType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subHyperplaneType, bSPTreeClazz, bSPTreeClazz, boundaryAttributeType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = boundaryAttribute;
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowClassCastException_7() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        PolygonsSet polygonsSet = new PolygonsSet();
        Class subOrientedPointClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polygonsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subOrientedPointConstructor = subOrientedPointClazz.getDeclaredConstructor(hyperplaneType, polygonsSetType);
        subOrientedPointConstructor.setAccessible(true);
        java.lang.Object[] subOrientedPointConstructorArguments = new java.lang.Object[2];
        subOrientedPointConstructorArguments[0] = ((Object) null);
        subOrientedPointConstructorArguments[1] = polygonsSet;
        SubOrientedPoint subOrientedPoint = ((SubOrientedPoint) subOrientedPointConstructor.newInstance(subOrientedPointConstructorArguments));
        Class boundaryAttributeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BoundaryAttribute");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Constructor boundaryAttributeConstructor = boundaryAttributeClazz.getDeclaredConstructor(subOrientedPointType, subOrientedPointType);
        boundaryAttributeConstructor.setAccessible(true);
        java.lang.Object[] boundaryAttributeConstructorArguments = new java.lang.Object[2];
        boundaryAttributeConstructorArguments[0] = subOrientedPoint;
        boundaryAttributeConstructorArguments[1] = ((Object) null);
        BoundaryAttribute boundaryAttribute = ((BoundaryAttribute) boundaryAttributeConstructor.newInstance(boundaryAttributeConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class boundaryAttributeType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, boundaryAttributeType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = boundaryAttribute;
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Region can not be casted to org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet] */
        polygonsSet1.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowClassCastException_8() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, byteArray);
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        Class subOrientedPointClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polygonsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subOrientedPointConstructor = subOrientedPointClazz.getDeclaredConstructor(hyperplaneType, polygonsSetType);
        subOrientedPointConstructor.setAccessible(true);
        java.lang.Object[] subOrientedPointConstructorArguments = new java.lang.Object[2];
        subOrientedPointConstructorArguments[0] = ((Object) null);
        subOrientedPointConstructorArguments[1] = polygonsSet;
        SubOrientedPoint subOrientedPoint = ((SubOrientedPoint) subOrientedPointConstructor.newInstance(subOrientedPointConstructorArguments));
        Boolean boolean1 = false;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean1);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = bSPTree1;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree2);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        polygonsSet1.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowClassCastException_9() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, intArray);
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        Class subOrientedPointClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polygonsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subOrientedPointConstructor = subOrientedPointClazz.getDeclaredConstructor(hyperplaneType, polygonsSetType);
        subOrientedPointConstructor.setAccessible(true);
        java.lang.Object[] subOrientedPointConstructorArguments = new java.lang.Object[2];
        subOrientedPointConstructorArguments[0] = ((Object) null);
        subOrientedPointConstructorArguments[1] = polygonsSet;
        SubOrientedPoint subOrientedPoint = ((SubOrientedPoint) subOrientedPointConstructor.newInstance(subOrientedPointConstructorArguments));
        Boolean boolean1 = true;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean1);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = bSPTree1;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree2 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree2);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        polygonsSet1.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: getTree(false).getCut() == null
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException() {
        PolygonsSet polygonsSet = new PolygonsSet(((BSPTree) null));
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices(PolygonsSet.java:208) */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(null, null);
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
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
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
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException_3() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(null, null);
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException_4() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        Class subOrientedPointClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polygonsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subOrientedPointConstructor = subOrientedPointClazz.getDeclaredConstructor(hyperplaneType, polygonsSetType);
        subOrientedPointConstructor.setAccessible(true);
        java.lang.Object[] subOrientedPointConstructorArguments = new java.lang.Object[2];
        subOrientedPointConstructorArguments[0] = ((Object) null);
        subOrientedPointConstructorArguments[1] = polygonsSet;
        SubOrientedPoint subOrientedPoint = ((SubOrientedPoint) subOrientedPointConstructor.newInstance(subOrientedPointConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException] */
        polygonsSet1.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException_5() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Boolean boolean1 = false;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        Class subOrientedPointClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polygonsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subOrientedPointConstructor = subOrientedPointClazz.getDeclaredConstructor(hyperplaneType, polygonsSetType);
        subOrientedPointConstructor.setAccessible(true);
        java.lang.Object[] subOrientedPointConstructorArguments = new java.lang.Object[2];
        subOrientedPointConstructorArguments[0] = ((Object) null);
        subOrientedPointConstructorArguments[1] = polygonsSet;
        SubOrientedPoint subOrientedPoint = ((SubOrientedPoint) subOrientedPointConstructor.newInstance(subOrientedPointConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException] */
        polygonsSet1.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException_6() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 1.0132425420038099E308);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(orientedPoint, null);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 7.865421789154085E307);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, true);
        SubLine subLine = new SubLine(orientedPoint1, ((Region) null));
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
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subOrientedPoint;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException_7() throws Exception  {
        Vector1D vector1D = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", 3.607133562749259E144);
        OrientedPoint orientedPoint = new OrientedPoint(vector1D, false);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(orientedPoint, null);
        Vector1D vector1D1 = ((Vector1D) createInstance("org.apache.commons.math3.geometry.euclidean.oned.Vector1D"));
        setField(vector1D1, "org.apache.commons.math3.geometry.euclidean.oned.Vector1D", "x", -6.07467146785735E138);
        OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
        SubOrientedPoint subOrientedPoint1 = new SubOrientedPoint(orientedPoint1, null);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPoint1Type = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPoint1Type, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint1;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subOrientedPoint;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException_8() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubPlane subPlane = new SubPlane(null, null);
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(null, null);
        Class boundaryAttributeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BoundaryAttribute");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Constructor boundaryAttributeConstructor = boundaryAttributeClazz.getDeclaredConstructor(subOrientedPointType, subOrientedPointType);
        boundaryAttributeConstructor.setAccessible(true);
        java.lang.Object[] boundaryAttributeConstructorArguments = new java.lang.Object[2];
        boundaryAttributeConstructorArguments[0] = subOrientedPoint;
        boundaryAttributeConstructorArguments[1] = ((Object) null);
        BoundaryAttribute boundaryAttribute = ((BoundaryAttribute) boundaryAttributeConstructor.newInstance(boundaryAttributeConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class boundaryAttributeType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, boundaryAttributeType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = boundaryAttribute;
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException_9() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubPlane subPlane = new SubPlane(null, null);
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        Class subOrientedPointClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subOrientedPointConstructor = subOrientedPointClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subOrientedPointConstructor.setAccessible(true);
        java.lang.Object[] subOrientedPointConstructorArguments = new java.lang.Object[2];
        subOrientedPointConstructorArguments[0] = ((Object) null);
        subOrientedPointConstructorArguments[1] = intervalsSet;
        SubOrientedPoint subOrientedPoint = ((SubOrientedPoint) subOrientedPointConstructor.newInstance(subOrientedPointConstructorArguments));
        Class boundaryAttributeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BoundaryAttribute");
        Class subHyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Constructor boundaryAttributeConstructor = boundaryAttributeClazz.getDeclaredConstructor(subHyperplaneType, subHyperplaneType);
        boundaryAttributeConstructor.setAccessible(true);
        java.lang.Object[] boundaryAttributeConstructorArguments = new java.lang.Object[2];
        boundaryAttributeConstructorArguments[0] = ((Object) null);
        boundaryAttributeConstructorArguments[1] = subOrientedPoint;
        BoundaryAttribute boundaryAttribute = ((BoundaryAttribute) boundaryAttributeConstructor.newInstance(boundaryAttributeConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class boundaryAttributeType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subHyperplaneType, bSPTreeClazz, bSPTreeClazz, boundaryAttributeType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = boundaryAttribute;
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException] */
        polygonsSet.getVertices();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
 * @utbot.executesCondition {@code (getTree(false).getCut() == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getTree(true).visit(visitor);
 *  */
    @Test
    public void testGetVertices_ThrowNullPointerException_10() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(null, null);
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        IntervalsSet intervalsSet = new IntervalsSet(bSPTree);
        Class subOrientedPointClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class intervalsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subOrientedPointConstructor = subOrientedPointClazz.getDeclaredConstructor(hyperplaneType, intervalsSetType);
        subOrientedPointConstructor.setAccessible(true);
        java.lang.Object[] subOrientedPointConstructorArguments = new java.lang.Object[2];
        subOrientedPointConstructorArguments[0] = ((Object) null);
        subOrientedPointConstructorArguments[1] = intervalsSet;
        SubOrientedPoint subOrientedPoint1 = ((SubOrientedPoint) subOrientedPointConstructor.newInstance(subOrientedPointConstructorArguments));
        Class boundaryAttributeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BoundaryAttribute");
        Class subHyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Constructor boundaryAttributeConstructor = boundaryAttributeClazz.getDeclaredConstructor(subHyperplaneType, subHyperplaneType);
        boundaryAttributeConstructor.setAccessible(true);
        java.lang.Object[] boundaryAttributeConstructorArguments = new java.lang.Object[2];
        boundaryAttributeConstructorArguments[0] = ((Object) null);
        boundaryAttributeConstructorArguments[1] = subOrientedPoint1;
        BoundaryAttribute boundaryAttribute = ((BoundaryAttribute) boundaryAttributeConstructor.newInstance(boundaryAttributeConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class boundaryAttributeType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subHyperplaneType, bSPTreeClazz, bSPTreeClazz, boundaryAttributeType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = boundaryAttribute;
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices] produces [java.lang.NullPointerException] */
        polygonsSet.getVertices();
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getVertices()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#getVertices()}
     */
    @Test(expected = MathInternalError.class)
    public void testGetVerticesThrowsMIE() {
        PolygonsSet polygonsSet = new PolygonsSet(java.lang.Double.NaN, -1.0, -1.0, -1.0);
        
        polygonsSet.getVertices();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeGeometricalProperties()
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): False}
 * @utbot.executesCondition {@code (v[0][0] == null): True}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#setSize(double)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#setBarycenter(org.apache.commons.math3.geometry.Vector)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#setBarycenter(org.apache.commons.math3.geometry.Vector)}
 *  */
    @Test
    public void testComputeGeometricalProperties_0OfV0EqualsNull() throws Exception  {
        Vector2D prevNaN = Vector2D.NaN;
        try {
            Vector2D naN = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
            setField(naN, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", java.lang.Double.NaN);
            Class vector2DClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
            setStaticField(vector2DClazz, "NaN", naN);
            PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[1][];
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray = {null};
            vertices[0] = vector2DArray;
            setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
            setField(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "size", 0.0);
            
            Vector initialPolygonsSetBarycenter = ((Vector) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "barycenter"));
            
            polygonsSet.computeGeometricalProperties();
            
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] polygonsSetVertices = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][]) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices"));
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] polygonsSetVerticesVertices0 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D[]) get(polygonsSetVertices, 0));
            Vector2D finalPolygonsSetVertices00 = ((Vector2D) get(polygonsSetVerticesVertices0, 0));
            double finalPolygonsSetSize = ((Double) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "size"));
            Vector finalPolygonsSetBarycenter = ((Vector) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "barycenter"));
            
            assertFalse(initialPolygonsSetBarycenter == finalPolygonsSetBarycenter);
            
            assertNull(finalPolygonsSetVertices00);
            
            org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalPolygonsSetSize, 1.0E-6);
        } finally {
            setStaticField(Vector2D.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): True}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#setSize(double)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#setBarycenter(org.apache.commons.math3.geometry.Vector)}
 *  */
    @Test
    public void testComputeGeometricalProperties_PolygonsSetSetBarycenter() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = {};
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        BSPTree tree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        Boolean attribute = false;
        tree.setAttribute(attribute);
        setField(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree", tree);
        setField(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "size", 0.0);
        
        Vector initialPolygonsSetBarycenter = ((Vector) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "barycenter"));
        
        polygonsSet.computeGeometricalProperties();
        
        Vector finalPolygonsSetBarycenter = ((Vector) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "barycenter"));
        
        assertFalse(initialPolygonsSetBarycenter == finalPolygonsSetBarycenter);
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): True}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#setSize(double)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#setBarycenter(org.apache.commons.math3.geometry.Vector)}
 * @utbot.invokes {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#setBarycenter(org.apache.commons.math3.geometry.Vector)}
 *  */
    @Test
    public void testComputeGeometricalProperties_PolygonsSetSetSize() throws Exception  {
        Vector2D prevNaN = Vector2D.NaN;
        try {
            Vector2D naN = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
            setField(naN, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", java.lang.Double.NaN);
            Class vector2DClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Vector2D");
            setStaticField(vector2DClazz, "NaN", naN);
            Boolean boolean1 = true;
            BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
            PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
            
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] initialPolygonsSetVertices = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][]) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices"));
            Vector initialPolygonsSetBarycenter = ((Vector) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "barycenter"));
            
            polygonsSet.computeGeometricalProperties();
            
            org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] finalPolygonsSetVertices = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][]) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices"));
            double finalPolygonsSetSize = ((Double) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "size"));
            Vector finalPolygonsSetBarycenter = ((Vector) getFieldValue(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "barycenter"));
            
            assertFalse(initialPolygonsSetVertices == finalPolygonsSetVertices);
            
            assertFalse(initialPolygonsSetBarycenter == finalPolygonsSetBarycenter);
            
            org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalPolygonsSetSize, 1.0E-6);
        } finally {
            setStaticField(Vector2D.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeGeometricalProperties()
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: v.length == 0
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[1][];
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray = {};
        vertices[0] = vector2DArray;
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties(PolygonsSet.java:144) */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): False}
 * @utbot.executesCondition {@code (v[0][0] == null): False}
 * @utbot.iterates iterate the loop {@code for(Vector2D[] loop: v)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double x1 = loop[loop.length - 1].getX();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[2][];
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[1];
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 0.0);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", 0.0);
        vector2DArray[0] = vector2D;
        vertices[0] = vector2DArray;
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray1 = {};
        vertices[1] = vector2DArray1;
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties(PolygonsSet.java:156) */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: (Boolean) tree.getAttribute()
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = {};
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        BSPTree tree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        byte[] attribute = {};
        tree.setAttribute(attribute);
        setField(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree", tree);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Boolean ([B and java.lang.Boolean are in module java.base of loader 'bootstrap')]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties(PolygonsSet.java:136) */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: (Boolean) tree.getAttribute()
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException_1() {
        short[] shortArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, shortArray);
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final Vector2D[][] v = getVertices();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        byte[] byteArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, byteArray);
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
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException_3() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        short[][] shortArray = {};
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subLineType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class shortArrayType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subLineType, bSPTreeClazz, bSPTreeClazz, shortArrayType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = ((Object) shortArray);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException_4() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Plane plane = new Plane(((Plane) null));
        PolyhedronsSet polyhedronsSet = new PolyhedronsSet();
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class planeType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polyhedronsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(planeType, polyhedronsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = plane;
        subLineConstructorArguments[1] = polyhedronsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        SubPlane subPlane = new SubPlane(null, null);
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
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException_5() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        Plane plane = new Plane(((Plane) null));
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
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException_6() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        PolygonsSet polygonsSet = new PolygonsSet();
        Class subOrientedPointClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polygonsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subOrientedPointConstructor = subOrientedPointClazz.getDeclaredConstructor(hyperplaneType, polygonsSetType);
        subOrientedPointConstructor.setAccessible(true);
        java.lang.Object[] subOrientedPointConstructorArguments = new java.lang.Object[2];
        subOrientedPointConstructorArguments[0] = ((Object) null);
        subOrientedPointConstructorArguments[1] = polygonsSet;
        SubOrientedPoint subOrientedPoint = ((SubOrientedPoint) subOrientedPointConstructor.newInstance(subOrientedPointConstructorArguments));
        Class boundaryAttributeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BoundaryAttribute");
        Class subHyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Constructor boundaryAttributeConstructor = boundaryAttributeClazz.getDeclaredConstructor(subHyperplaneType, subHyperplaneType);
        boundaryAttributeConstructor.setAccessible(true);
        java.lang.Object[] boundaryAttributeConstructorArguments = new java.lang.Object[2];
        boundaryAttributeConstructorArguments[0] = ((Object) null);
        boundaryAttributeConstructorArguments[1] = subOrientedPoint;
        BoundaryAttribute boundaryAttribute = ((BoundaryAttribute) boundaryAttributeConstructor.newInstance(boundaryAttributeConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class boundaryAttributeType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subHyperplaneType, bSPTreeClazz, bSPTreeClazz, boundaryAttributeType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = boundaryAttribute;
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Region can not be casted to org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet] */
        polygonsSet1.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException_7() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        short[] shortArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, shortArray);
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
        Boolean boolean1 = false;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean1);
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
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree2);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException_8() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        short[] shortArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, shortArray);
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
        Boolean boolean1 = true;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean1);
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
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree2);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException_9() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        Plane plane = new Plane(((Plane) null));
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(plane, null);
        Class boundaryAttributeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BoundaryAttribute");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Constructor boundaryAttributeConstructor = boundaryAttributeClazz.getDeclaredConstructor(subOrientedPointType, subOrientedPointType);
        boundaryAttributeConstructor.setAccessible(true);
        java.lang.Object[] boundaryAttributeConstructorArguments = new java.lang.Object[2];
        boundaryAttributeConstructorArguments[0] = subOrientedPoint;
        boundaryAttributeConstructorArguments[1] = ((Object) null);
        BoundaryAttribute boundaryAttribute = ((BoundaryAttribute) boundaryAttributeConstructor.newInstance(boundaryAttributeConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class boundaryAttributeType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, boundaryAttributeType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subLine;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = boundaryAttribute;
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: The object with type org.apache.commons.math3.geometry.partitioning.Hyperplane can not be casted to org.apache.commons.math3.geometry.euclidean.twod.Line] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowClassCastException_10() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubPlane subPlane = new SubPlane(null, null);
        int[] intArray = {};
        BSPTree bSPTree = new BSPTree(null, null, null, intArray);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subPlaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subPlaneType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolyhedronsSet polyhedronsSet = new PolyhedronsSet(bSPTree1);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polyhedronsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, polyhedronsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = polyhedronsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        Boolean boolean1 = false;
        BSPTree bSPTree2 = new BSPTree(null, null, null, boolean1);
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree2;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree3);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Boolean] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: v.length == 0
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = {null};
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties(PolygonsSet.java:144) */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): False}
 * @utbot.executesCondition {@code (v[0][0] == null): False}
 * @utbot.iterates iterate the loop {@code for(Vector2D[] loop: v)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x1 = loop[loop.length - 1].getX();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_1() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[1][];
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[2];
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        vector2DArray[0] = vector2D;
        vertices[0] = vector2DArray;
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties(PolygonsSet.java:156) */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): False}
 * @utbot.executesCondition {@code (v[0][0] == null): False}
 * @utbot.iterates iterate the loop {@code for(Vector2D[] loop: v)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: x1 = point.getX();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_2() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[1][];
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[4];
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 0.0);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", 0.0);
        vector2DArray[0] = vector2D;
        Vector2D vector2D1 = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        vector2DArray[2] = vector2D1;
        vector2DArray[3] = vector2D;
        vertices[0] = vector2DArray;
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties(PolygonsSet.java:161) */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): False}
 * @utbot.executesCondition {@code (v[0][0] == null): False}
 * @utbot.iterates iterate the loop {@code for(Vector2D[] loop: v)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double x1 = loop[loop.length - 1].getX();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_3() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[2][];
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[1];
        Vector2D vector2D = ((Vector2D) createInstance("org.apache.commons.math3.geometry.euclidean.twod.Vector2D"));
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "x", 0.0);
        setField(vector2D, "org.apache.commons.math3.geometry.euclidean.twod.Vector2D", "y", 0.0);
        vector2DArray[0] = vector2D;
        vertices[0] = vector2DArray;
        vertices[1] = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D[]) null);
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties(PolygonsSet.java:156) */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (Boolean) tree.getAttribute()
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_4() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = {};
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties(PolygonsSet.java:136) */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.executesCondition {@code (v.length == 0): True}
 * @utbot.invokes {@link java.lang.Boolean#booleanValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (Boolean) tree.getAttribute()
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_5() throws Exception  {
        PolygonsSet polygonsSet = ((PolygonsSet) createInstance("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet"));
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[][] vertices = {};
        setField(polygonsSet, "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", "vertices", vertices);
        BSPTree tree = ((BSPTree) createInstance("org.apache.commons.math3.geometry.partitioning.BSPTree"));
        setField(polygonsSet, "org.apache.commons.math3.geometry.partitioning.AbstractRegion", "tree", tree);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException]
            org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties(PolygonsSet.java:136) */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D[][] v = getVertices();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_6() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(null, null);
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
        BSPTree bSPTree = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D[][] v = getVertices();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_7() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
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
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D[][] v = getVertices();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_8() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubLine subLine = new SubLine(((Hyperplane) null), ((Region) null));
        BSPTree bSPTree = new BSPTree(null, null, null, null);
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
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D[][] v = getVertices();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_9() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        PolyhedronsSet polyhedronsSet = new PolyhedronsSet(bSPTree);
        Class subOrientedPointClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polyhedronsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subOrientedPointConstructor = subOrientedPointClazz.getDeclaredConstructor(hyperplaneType, polyhedronsSetType);
        subOrientedPointConstructor.setAccessible(true);
        java.lang.Object[] subOrientedPointConstructorArguments = new java.lang.Object[2];
        subOrientedPointConstructorArguments[0] = ((Object) null);
        subOrientedPointConstructorArguments[1] = polyhedronsSet;
        SubOrientedPoint subOrientedPoint = ((SubOrientedPoint) subOrientedPointConstructor.newInstance(subOrientedPointConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subOrientedPoint;
        bSPTreeConstructorArguments[1] = bSPTree;
        bSPTreeConstructorArguments[2] = ((Object) null);
        bSPTreeConstructorArguments[3] = ((Object) null);
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D[][] v = getVertices();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_10() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Boolean boolean1 = false;
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
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_11() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubPlane subPlane = new SubPlane(null, null);
        BSPTree bSPTree = new BSPTree(null, null, null, null);
        SubOrientedPoint subOrientedPoint = new SubOrientedPoint(null, null);
        Class boundaryAttributeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BoundaryAttribute");
        Class subOrientedPointType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Constructor boundaryAttributeConstructor = boundaryAttributeClazz.getDeclaredConstructor(subOrientedPointType, subOrientedPointType);
        boundaryAttributeConstructor.setAccessible(true);
        java.lang.Object[] boundaryAttributeConstructorArguments = new java.lang.Object[2];
        boundaryAttributeConstructorArguments[0] = subOrientedPoint;
        boundaryAttributeConstructorArguments[1] = ((Object) null);
        BoundaryAttribute boundaryAttribute = ((BoundaryAttribute) boundaryAttributeConstructor.newInstance(boundaryAttributeConstructorArguments));
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class boundaryAttributeType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subOrientedPointType, bSPTreeClazz, bSPTreeClazz, boundaryAttributeType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane;
        bSPTreeConstructorArguments[1] = ((Object) null);
        bSPTreeConstructorArguments[2] = bSPTree;
        bSPTreeConstructorArguments[3] = boundaryAttribute;
        BSPTree bSPTree1 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree1);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException] */
        polygonsSet.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D[][] v = getVertices();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_12() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polygonsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, polygonsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = polygonsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        Boolean boolean2 = false;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean2);
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
        PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree2);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException] */
        polygonsSet1.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D[][] v = getVertices();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_13() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Boolean boolean1 = false;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree);
        Class subLineClazz = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class hyperplaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Class polygonsSetType = Class.forName("org.apache.commons.math3.geometry.partitioning.Region");
        Constructor subLineConstructor = subLineClazz.getDeclaredConstructor(hyperplaneType, polygonsSetType);
        subLineConstructor.setAccessible(true);
        java.lang.Object[] subLineConstructorArguments = new java.lang.Object[2];
        subLineConstructorArguments[0] = ((Object) null);
        subLineConstructorArguments[1] = polygonsSet;
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        Boolean boolean2 = true;
        BSPTree bSPTree1 = new BSPTree(null, null, null, boolean2);
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
        PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree2);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException] */
        polygonsSet1.computeGeometricalProperties();
    }
    
    /**
    @utbot.classUnderTest {@link PolygonsSet}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Vector2D[][] v = getVertices();
 *  */
    @Test
    public void testComputeGeometricalProperties_ThrowNullPointerException_14() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        SubPlane subPlane = new SubPlane(null, null);
        Boolean boolean1 = true;
        BSPTree bSPTree = new BSPTree(null, null, null, boolean1);
        Class bSPTreeClazz = Class.forName("org.apache.commons.math3.geometry.partitioning.BSPTree");
        Class subPlaneType = Class.forName("org.apache.commons.math3.geometry.partitioning.SubHyperplane");
        Class objectType = Class.forName("java.lang.Object");
        Constructor bSPTreeConstructor = bSPTreeClazz.getDeclaredConstructor(subPlaneType, bSPTreeClazz, bSPTreeClazz, objectType);
        bSPTreeConstructor.setAccessible(true);
        java.lang.Object[] bSPTreeConstructorArguments = new java.lang.Object[4];
        bSPTreeConstructorArguments[0] = subPlane;
        bSPTreeConstructorArguments[1] = ((Object) null);
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
        SubLine subLine = ((SubLine) subLineConstructor.newInstance(subLineConstructorArguments));
        Boolean boolean2 = false;
        BSPTree bSPTree2 = new BSPTree(null, null, null, boolean2);
        java.lang.Object[] bSPTreeConstructorArguments1 = new java.lang.Object[4];
        bSPTreeConstructorArguments1[0] = subLine;
        bSPTreeConstructorArguments1[1] = bSPTree2;
        bSPTreeConstructorArguments1[2] = ((Object) null);
        bSPTreeConstructorArguments1[3] = ((Object) null);
        BSPTree bSPTree3 = ((BSPTree) bSPTreeConstructor.newInstance(bSPTreeConstructorArguments1));
        PolygonsSet polygonsSet = new PolygonsSet(bSPTree3);
        
        /* This test fails because method [org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties] produces [java.lang.NullPointerException] */
        polygonsSet.computeGeometricalProperties();
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeGeometricalProperties()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet#computeGeometricalProperties()}
     */
    @Test(expected = MathInternalError.class)
    public void testComputeGeometricalPropertiesThrowsMIE() {
        PolygonsSet polygonsSet = new PolygonsSet(java.lang.Double.NaN, -1.0, -1.0, -1.0);
        
        polygonsSet.computeGeometricalProperties();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields725150782789000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields725150782789000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass725150782797700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields725150782789000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass725150782797700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields725150783264200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields725150783264200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass725150783268400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields725150783264200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass725150783268400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields725150783522200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields725150783522200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass725150783526200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields725150783522200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass725150783526200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


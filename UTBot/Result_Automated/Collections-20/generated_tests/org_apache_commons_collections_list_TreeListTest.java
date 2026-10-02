package org.apache.commons.collections.list;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.collections.list.TreeList.AVLNode;
import java.util.ArrayList;
import org.apache.commons.collections.list.TreeList.TreeListIterator;
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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_collections_list_TreeListTest {
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.checkInterval
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkInterval(int, int, int)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#checkInterval(int,int,int)}
 * @utbot.executesCondition {@code (index < startIndex): False}
 * @utbot.executesCondition {@code (index > endIndex): False}
 *  */
    @Test
    public void testCheckInterval_IndexLessOrEqualEndIndex() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        TreeList treeList = new TreeList();
        
        Class treeListClazz = Class.forName("org.apache.commons.collections.list.TreeList");
        Class intType = int.class;
        Method checkIntervalMethod = treeListClazz.getDeclaredMethod("checkInterval", intType, intType, intType);
        checkIntervalMethod.setAccessible(true);
        java.lang.Object[] checkIntervalMethodArguments = new java.lang.Object[3];
        checkIntervalMethodArguments[0] = 2;
        checkIntervalMethodArguments[1] = 2;
        checkIntervalMethodArguments[2] = 2;
        checkIntervalMethod.invoke(treeList, checkIntervalMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkInterval(int, int, int)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#checkInterval(int,int,int)}
 * @utbot.executesCondition {@code (index < startIndex): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index < startIndex || index > endIndex
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCheckInterval_ThrowIndexOutOfBoundsException() throws Throwable  {
        TreeList treeList = new TreeList();
        
        Class treeListClazz = Class.forName("org.apache.commons.collections.list.TreeList");
        Class intType = int.class;
        Method checkIntervalMethod = treeListClazz.getDeclaredMethod("checkInterval", intType, intType, intType);
        checkIntervalMethod.setAccessible(true);
        java.lang.Object[] checkIntervalMethodArguments = new java.lang.Object[3];
        checkIntervalMethodArguments[0] = 255;
        checkIntervalMethodArguments[1] = 256;
        checkIntervalMethodArguments[2] = -255;
        try {
            checkIntervalMethod.invoke(treeList, checkIntervalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#checkInterval(int,int,int)}
 * @utbot.executesCondition {@code (index < startIndex): False}
 * @utbot.executesCondition {@code (index > endIndex): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index < startIndex || index > endIndex
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testCheckInterval_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        TreeList treeList = new TreeList();
        
        Class treeListClazz = Class.forName("org.apache.commons.collections.list.TreeList");
        Class intType = int.class;
        Method checkIntervalMethod = treeListClazz.getDeclaredMethod("checkInterval", intType, intType, intType);
        checkIntervalMethod.setAccessible(true);
        java.lang.Object[] checkIntervalMethodArguments = new java.lang.Object[3];
        checkIntervalMethodArguments[0] = -1;
        checkIntervalMethodArguments[1] = -1;
        checkIntervalMethodArguments[2] = -2;
        try {
            checkIntervalMethod.invoke(treeList, checkIntervalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#add(int,java.lang.Object)}
 * @utbot.executesCondition {@code (root == null): True}
 * @utbot.invokes {@link org.apache.commons.collections.list.TreeList#size()}
 * @utbot.invokes org.apache.commons.collections.list.TreeList#checkInterval(int,int,int)
 *  */
    @Test
    public void testAdd_RootEqualsNull() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        treeList.add(0, null);
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(1, finalTreeListSize);
        
        assertEquals(-254, finalTreeListModCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: checkInterval(index, 0, size());
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_ThrowIndexOutOfBoundsException() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -1);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        treeList.add(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: checkInterval(index, 0, size());
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -255);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        treeList.add(-1, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(int, java.lang.Object)
    
    @Test
    public void testAdd1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", root);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "height", 1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1317699586);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1610612736);
        Object object = new Object();
        
        treeList.add(1073741825, object);
        
        TreeList.AVLNode treeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListRootHeight = ((Integer) getFieldValue(treeListRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        TreeList.AVLNode treeListRoot1 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListRootRelativePosition = ((Integer) getFieldValue(treeListRoot1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertEquals(3, finalTreeListRootHeight);
        
        assertEquals(1317699586, finalTreeListRootRelativePosition);
        
        assertEquals(1610612737, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testAdd2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147483645);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Object object = new Object();
        
        TreeList.AVLNode treeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode initialTreeListRootLeft = ((TreeList.AVLNode) getFieldValue(treeListRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        
        treeList.add(0, object);
        
        TreeList.AVLNode treeListRoot1 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode finalTreeListRootLeft = ((TreeList.AVLNode) getFieldValue(treeListRoot1, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        TreeList.AVLNode treeListRoot2 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        boolean finalTreeListRootLeftIsPrevious = ((Boolean) getFieldValue(treeListRoot2, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        TreeList.AVLNode treeListRoot3 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListRootHeight = ((Integer) getFieldValue(treeListRoot3, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        TreeList.AVLNode treeListRoot4 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListRootRelativePosition = ((Integer) getFieldValue(treeListRoot4, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRootLeft == finalTreeListRootLeft);
        
        assertFalse(finalTreeListRootLeftIsPrevious);
        
        assertEquals(1, finalTreeListRootHeight);
        
        assertEquals(2147483646, finalTreeListRootRelativePosition);
        
        assertEquals(1, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testAdd3() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", root);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "height", -2147483647);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -679479356);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1879048192);
        Object object = new Object();
        
        TreeList.AVLNode treeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode initialTreeListRootLeft = ((TreeList.AVLNode) getFieldValue(treeListRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        
        treeList.add(1610612739, object);
        
        TreeList.AVLNode treeListRoot1 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode finalTreeListRootLeft = ((TreeList.AVLNode) getFieldValue(treeListRoot1, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        TreeList.AVLNode treeListRoot2 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        boolean finalTreeListRootLeftIsPrevious = ((Boolean) getFieldValue(treeListRoot2, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        TreeList.AVLNode treeListRoot3 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListRootHeight = ((Integer) getFieldValue(treeListRoot3, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRootLeft == finalTreeListRootLeft);
        
        assertFalse(finalTreeListRootLeftIsPrevious);
        
        assertEquals(2, finalTreeListRootHeight);
        
        assertEquals(1879048193, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testAdd4() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "height", 3);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -3);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Object object = new Object();
        
        TreeList.AVLNode treeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode initialTreeListRootRight = ((TreeList.AVLNode) getFieldValue(treeListRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        
        treeList.add(0, object);
        
        TreeList.AVLNode treeListRoot1 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode finalTreeListRootRight = ((TreeList.AVLNode) getFieldValue(treeListRoot1, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        TreeList.AVLNode treeListRoot2 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        boolean finalTreeListRootRightIsNext = ((Boolean) getFieldValue(treeListRoot2, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        TreeList.AVLNode treeListRoot3 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListRootHeight = ((Integer) getFieldValue(treeListRoot3, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        TreeList.AVLNode treeListRoot4 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListRootRelativePosition = ((Integer) getFieldValue(treeListRoot4, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRootRight == finalTreeListRootRight);
        
        assertFalse(finalTreeListRootRightIsNext);
        
        assertEquals(1, finalTreeListRootHeight);
        
        assertEquals(-4, finalTreeListRootRelativePosition);
        
        assertEquals(1, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testAdd5() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741824);
        Object object = new Object();
        
        TreeList.AVLNode treeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode initialTreeListRootRight = ((TreeList.AVLNode) getFieldValue(treeListRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        
        treeList.add(3, object);
        
        TreeList.AVLNode treeListRoot1 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode finalTreeListRootRight = ((TreeList.AVLNode) getFieldValue(treeListRoot1, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        TreeList.AVLNode treeListRoot2 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        boolean finalTreeListRootRightIsNext = ((Boolean) getFieldValue(treeListRoot2, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        TreeList.AVLNode treeListRoot3 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListRootHeight = ((Integer) getFieldValue(treeListRoot3, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRootRight == finalTreeListRootRight);
        
        assertFalse(finalTreeListRootRightIsNext);
        
        assertEquals(1, finalTreeListRootHeight);
        
        assertEquals(1073741825, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testAdd6() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147483646);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 16);
        Object object = new Object();
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        treeList.add(1, object);
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(17, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testAdd7() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741824);
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        treeList.add(67108741, null);
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(1073741825, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testAdd8() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -781336586);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147483084);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 771752424);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073742340);
        Object object = new Object();
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        treeList.add(1073741876, object);
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(1073742341, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testAdd9() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2098505988);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147482838);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -4);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 536870912);
        Object object = new Object();
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        treeList.add(512, object);
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(536870913, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testAdd10() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right1, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(right1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -205520896);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right1);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -251658242);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -79691776);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1644167168);
        Object object = new Object();
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        treeList.add(1610612737, object);
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(1644167169, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testAdd11() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -539754229);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -269484296);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Object object = new Object();
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        treeList.add(0, object);
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(1, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(int, java.lang.Object)
    
    @Test(expected = RuntimeException.class)
    public void testAdd12() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right1, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -218628096);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right1);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -243531778);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -75497472);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1611005952);
        Object object = new Object();
        
        treeList.add(1610874881, object);
    }
    
    @Test(expected = RuntimeException.class)
    public void testAdd13() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right1);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147483646);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 131072);
        Object object = new Object();
        
        treeList.add(1, object);
    }
    
    @Test(expected = RuntimeException.class)
    public void testAdd14() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "height", 1);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -129);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 2147483520);
        Object object = new Object();
        
        treeList.add(2147483520, object);
    }
    
    @Test(expected = RuntimeException.class)
    public void testAdd15() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right1, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(right1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -16777219);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right1);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2130706433);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1610612711);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741824);
        Object object = new Object();
        
        treeList.add(536870938, object);
    }
    
    @Test(expected = RuntimeException.class)
    public void testAdd16() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -8193);
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147438592);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left1);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -565248);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147307520);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 32896);
        Object object = new Object();
        
        treeList.add(32768, object);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(int, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testAdd17() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", root);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147483646);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 2097152);
        Object object = new Object();
        
        treeList.add(1, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testAdd18() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Object object = new Object();
        
        treeList.add(0, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testAdd19() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", left);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Object object = new Object();
        
        treeList.add(0, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testAdd20() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "left", root);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", root);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2143289344);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 67108864);
        
        treeList.add(1, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testAdd21() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", right);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -129);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 2147483520);
        Object object = new Object();
        
        treeList.add(2147483520, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.remove
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove(int)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#remove(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: checkInterval(index, 0, size() - 1);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_ThrowIndexOutOfBoundsException() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -255);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        treeList.remove(-1);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#remove(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: checkInterval(index, 0, size() - 1);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        treeList.remove(0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method remove(int)
    
    @Test
    public void testRemove1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147474996);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right1);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -94372507);
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 463464601);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left1);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1778382848);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 20478);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", Integer.MIN_VALUE);
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        Object actual = treeList.remove(3120);
        
        assertNull(actual);
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(Integer.MAX_VALUE, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testRemove2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", root);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        Object value = createInstance("java.lang.Object");
        left.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", left);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741825);
        
        Object actual = treeList.remove(1);
        
        Object expected = new Object();
        
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertEquals(1073741824, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testRemove3() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        Object value = createInstance("java.lang.Object");
        right.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741825);
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        Object actual = treeList.remove(1);
        
        Object expected = new Object();
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(1073741824, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testRemove4() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        Object value = createInstance("java.lang.Object");
        left.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2147483647);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741825);
        
        TreeList.AVLNode treeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode initialTreeListRootLeft = ((TreeList.AVLNode) getFieldValue(treeListRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        
        Object actual = treeList.remove(1);
        
        Object expected = new Object();
        
        TreeList.AVLNode treeListRoot1 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode finalTreeListRootLeft = ((TreeList.AVLNode) getFieldValue(treeListRoot1, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRootLeft == finalTreeListRootLeft);
        
        assertEquals(1073741824, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testRemove5() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        Object actual = treeList.remove(0);
        
        assertNull(actual);
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(0, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testRemove6() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "height", 2147483645);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", root);
        Object value = createInstance("java.lang.Object");
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1024);
        
        Object actual = treeList.remove(0);
        
        Object expected = new Object();
        
        TreeList.AVLNode treeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode finalTreeListRootLeft = ((TreeList.AVLNode) getFieldValue(treeListRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        TreeList.AVLNode treeListRoot1 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        boolean finalTreeListRootLeftIsPrevious = ((Boolean) getFieldValue(treeListRoot1, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        TreeList.AVLNode treeListRoot2 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListRootHeight = ((Integer) getFieldValue(treeListRoot2, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        TreeList.AVLNode treeListRoot3 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        Object finalTreeListRootValue = getFieldValue(treeListRoot3, "org.apache.commons.collections.list.TreeList$AVLNode", "value");
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertNull(finalTreeListRootLeft);
        
        assertTrue(finalTreeListRootLeftIsPrevious);
        
        assertEquals(1, finalTreeListRootHeight);
        
        assertNull(finalTreeListRootValue);
        
        assertEquals(1023, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testRemove7() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "height", -17);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left1);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left1);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "height", 2);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -536840192);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 537593856);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 33554433);
        
        TreeList.AVLNode initialTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        
        Object actual = treeList.remove(753664);
        
        assertNull(actual);
        
        TreeList.AVLNode finalTreeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialTreeListRoot == finalTreeListRoot);
        
        assertEquals(33554432, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    
    @Test
    public void testRemove8() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", root);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "height", -3);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 4);
        
        Object actual = treeList.remove(0);
        
        assertNull(actual);
        
        TreeList.AVLNode treeListRoot = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode finalTreeListRootRight = ((TreeList.AVLNode) getFieldValue(treeListRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        TreeList.AVLNode treeListRoot1 = ((TreeList.AVLNode) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "root"));
        int finalTreeListRootHeight = ((Integer) getFieldValue(treeListRoot1, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertNull(finalTreeListRootRight);
        
        assertEquals(0, finalTreeListRootHeight);
        
        assertEquals(3, finalTreeListSize);
        
        assertEquals(1, finalTreeListModCount);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove(int)
    
    @Test(expected = RuntimeException.class)
    public void testRemove9() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", root);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741825);
        
        treeList.remove(1);
    }
    
    @Test(expected = RuntimeException.class)
    public void testRemove10() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right1, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right1);
        setField(right1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 545815556);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right1);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1598491970);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2142761474);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1548289);
        
        treeList.remove(1546052);
    }
    
    @Test(expected = RuntimeException.class)
    public void testRemove11() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "height", -3);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        treeList.remove(0);
    }
    
    @Test(expected = RuntimeException.class)
    public void testRemove12() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "height", Integer.MIN_VALUE);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", left);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741825);
        
        treeList.remove(1);
    }
    
    @Test(expected = RuntimeException.class)
    public void testRemove13() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "height", 2013265919);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left1);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", left);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "height", -2147483646);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -536743936);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 537531188);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 268435456);
        
        treeList.remove(787252);
    }
    
    @Test(expected = RuntimeException.class)
    public void testRemove14() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "height", Integer.MAX_VALUE);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "height", 134217730);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741825);
        
        treeList.remove(1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method remove(int)
    
    @Test(expected = StackOverflowError.class)
    public void testRemove15() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741825);
        
        treeList.remove(1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testRemove16() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", right);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741825);
        
        treeList.remove(1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testRemove17() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2147483647);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1073741825);
        
        treeList.remove(1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testRemove18() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        treeList.remove(0);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testRemove19() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", root);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "right", root);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "height", 3);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        Object value = createInstance("java.lang.Object");
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1024);
        
        treeList.remove(0);
    }
    
    @Test
    public void testRemove20() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "right", left1);
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147483646);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left1);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2147353088);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2147352576);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2147479555);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 655360);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.TreeList.get(TreeList.java:97)
            org.apache.commons.collections.list.TreeList.remove(TreeList.java:233) */
        treeList.remove(264192);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(int)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#get(int)}
 * @utbot.returnsFrom {@code return root.get(index).getValue();}
 *  */
    @Test
    public void testGet_ReturnRootGetIndexGetValue() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        Object actual = treeList.get(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#get(int)}
 * @utbot.returnsFrom {@code return root.get(index).getValue();}
 *  */
    @Test
    public void testGet_ReturnRootGetIndexGetValue_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        Object actual = treeList.get(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get(int)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: checkInterval(index, 0, size() - 1);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_ThrowIndexOutOfBoundsException() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -255);
        
        treeList.get(-1);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: checkInterval(index, 0, size() - 1);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_ThrowIndexOutOfBoundsException_1() {
        TreeList treeList = new TreeList();
        
        treeList.get(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(int)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return root.get(index).getValue();
 *  */
    @Test
    public void testGet_ThrowNullPointerException_3() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.get] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.TreeList.get(TreeList.java:97) */
        treeList.get(0);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return root.get(index).getValue();
 *  */
    @Test
    public void testGet_ThrowNullPointerException_4() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.get] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.TreeList.get(TreeList.java:97) */
        treeList.get(0);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return root.get(index).getValue();
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.get] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.TreeList.get(TreeList.java:97) */
        treeList.get(0);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return root.get(index).getValue();
 *  */
    @Test
    public void testGet_ThrowNullPointerException_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.get] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.TreeList.get(TreeList.java:97) */
        treeList.get(0);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return root.get(index).getValue();
 *  */
    @Test
    public void testGet_ThrowNullPointerException_2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.get] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.TreeList.get(TreeList.java:97) */
        treeList.get(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.indexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#indexOf(java.lang.Object)}
 * @utbot.executesCondition {@code (root == null): True}
 * @utbot.returnsFrom {@code return -1;}
 *  */
    @Test
    public void testIndexOf_RootEqualsNull() {
        TreeList treeList = new TreeList();
        
        int actual = treeList.indexOf(null);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#indexOf(java.lang.Object)}
 * @utbot.executesCondition {@code (root == null): False}
 * @utbot.returnsFrom {@code return root.indexOf(object, root.relativePosition);}
 *  */
    @Test
    public void testIndexOf_RootNotEqualsNull_3() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        int actual = treeList.indexOf(null);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#indexOf(java.lang.Object)}
 * @utbot.executesCondition {@code (root == null): False}
 * @utbot.returnsFrom {@code return root.indexOf(object, root.relativePosition);}
 *  */
    @Test
    public void testIndexOf_RootNotEqualsNull_4() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        Integer value = 0;
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        int actual = treeList.indexOf(integer);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#indexOf(java.lang.Object)}
 * @utbot.executesCondition {@code (root == null): False}
 * @utbot.returnsFrom {@code return root.indexOf(object, root.relativePosition);}
 *  */
    @Test
    public void testIndexOf_RootNotEqualsNull() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        int actual = treeList.indexOf(null);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#indexOf(java.lang.Object)}
 * @utbot.executesCondition {@code (root == null): False}
 * @utbot.returnsFrom {@code return root.indexOf(object, root.relativePosition);}
 *  */
    @Test
    public void testIndexOf_RootNotEqualsNull_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        byte[] byteArray = {};
        
        int actual = treeList.indexOf(byteArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#indexOf(java.lang.Object)}
 * @utbot.executesCondition {@code (root == null): False}
 * @utbot.returnsFrom {@code return root.indexOf(object, root.relativePosition);}
 *  */
    @Test
    public void testIndexOf_RootNotEqualsNull_5() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        Long value = 0L;
        right.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        Character value1 = '\u0000';
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Long long1 = 0L;
        
        int actual = treeList.indexOf(long1);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#indexOf(java.lang.Object)}
 * @utbot.executesCondition {@code (root == null): False}
 * @utbot.returnsFrom {@code return root.indexOf(object, root.relativePosition);}
 *  */
    @Test
    public void testIndexOf_RootNotEqualsNull_6() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        Integer value = 0;
        left.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        int actual = treeList.indexOf(null);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#indexOf(java.lang.Object)}
 * @utbot.executesCondition {@code (root == null): False}
 * @utbot.returnsFrom {@code return root.indexOf(object, root.relativePosition);}
 *  */
    @Test
    public void testIndexOf_RootNotEqualsNull_2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        Character value = '\u0000';
        right.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Character character = '\u0000';
        
        int actual = treeList.indexOf(character);
        
        assertEquals(-510, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexOf(java.lang.Object)
    
    @Test
    public void testIndexOf1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Object object = new Object();
        
        int actual = treeList.indexOf(object);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        ArrayList value = new ArrayList();
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        int actual = treeList.indexOf(null);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf3() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 8);
        ArrayList value = new ArrayList();
        left.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        int actual = treeList.indexOf(null);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testIndexOf4() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 8);
        ArrayList value = new ArrayList();
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        int actual = treeList.indexOf(null);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf5() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        Integer value = 0;
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        int actual = treeList.indexOf(integer);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testIndexOf6() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2);
        ArrayList value = new ArrayList();
        left1.setValue(value);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        int actual = treeList.indexOf(null);
        
        assertEquals(-255, actual);
    }
    
    @Test
    public void testIndexOf7() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        Integer value = 0;
        left.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        ArrayList value1 = new ArrayList();
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        int actual = treeList.indexOf(integer);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf8() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        Integer value = 0;
        right.setValue(value);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        ArrayList value1 = new ArrayList();
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        int[] intArray = {};
        
        int actual = treeList.indexOf(intArray);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf9() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2);
        Integer value = 0;
        left.setValue(value);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        ArrayList value1 = new ArrayList();
        right.setValue(value1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        int[] intArray = {};
        
        int actual = treeList.indexOf(intArray);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf10() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        ArrayList value = new ArrayList();
        right.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        short[] shortArray = {};
        
        int actual = treeList.indexOf(shortArray);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf11() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        Integer value = 0;
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        int actual = treeList.indexOf(null);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testIndexOf12() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        ArrayList value = new ArrayList();
        right.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 8);
        Integer value1 = 0;
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        byte[] byteArray = {};
        
        int actual = treeList.indexOf(byteArray);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf13() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        Character value = '\u0000';
        right.setValue(value);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -254);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        ArrayList value1 = new ArrayList();
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        int[] intArray = {};
        
        int actual = treeList.indexOf(intArray);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf14() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        Integer value = 0;
        left.setValue(value);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        ArrayList value1 = new ArrayList();
        right.setValue(value1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        int actual = treeList.indexOf(integer);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf15() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        Integer value = 0;
        left.setValue(value);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        ArrayList value1 = new ArrayList();
        right.setValue(value1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MAX_VALUE);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        int actual = treeList.indexOf(integer);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf16() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        Character value = '\u0000';
        left.setValue(value);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        ArrayList value1 = new ArrayList();
        right.setValue(value1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        Integer value2 = 0;
        root.setValue(value2);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Character character = '\u0000';
        
        int actual = treeList.indexOf(character);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf17() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        Long value = 0L;
        left.setValue(value);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        Integer value1 = 1;
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        int actual = treeList.indexOf(integer);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf18() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        ArrayList value = new ArrayList();
        right.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        Integer value1 = 0;
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        int actual = treeList.indexOf(null);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf19() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        Integer value = 0;
        right.setValue(value);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        ArrayList value1 = new ArrayList();
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        int actual = treeList.indexOf(integer);
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testIndexOf20() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        Integer value = 0;
        right.setValue(value);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        ArrayList value1 = new ArrayList();
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        int actual = treeList.indexOf(integer);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method indexOf(java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testIndexOf21() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Object object = new Object();
        
        treeList.indexOf(object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#clear()}
 *  */
    @Test
    public void testClear() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -255);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        treeList.clear();
        
        int finalTreeListSize = ((Integer) getFieldValue(treeList, "org.apache.commons.collections.list.TreeList", "size"));
        int finalTreeListModCount = ((Integer) getFieldValue(treeList, "java.util.AbstractList", "modCount"));
        
        assertEquals(0, finalTreeListSize);
        
        assertEquals(-254, finalTreeListModCount);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#size()}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testSize_ReturnSize() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -255);
        
        int actual = treeList.size();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.toArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toArray()
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#toArray()}
 * @utbot.executesCondition {@code (root != null): False}
 * @utbot.returnsFrom {@code return array;}
 *  */
    @Test
    public void testToArray_RootEqualsNull() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        java.lang.Object[] actual = treeList.toArray();
        
        java.lang.Object[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#toArray()}
 * @utbot.executesCondition {@code (root != null): True}
 * @utbot.returnsFrom {@code return array;}
 *  */
    @Test
    public void testToArray_RootNotEqualsNull() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 2);
        
        java.lang.Object[] actual = treeList.toArray();
        
        java.lang.Object[] expected = {null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#toArray()}
 * @utbot.executesCondition {@code (root != null): True}
 * @utbot.returnsFrom {@code return array;}
 *  */
    @Test
    public void testToArray_RootNotEqualsNull_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 2);
        
        java.lang.Object[] actual = treeList.toArray();
        
        java.lang.Object[] expected = {null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#toArray()}
 * @utbot.executesCondition {@code (root != null): True}
 * @utbot.returnsFrom {@code return array;}
 *  */
    @Test
    public void testToArray_RootNotEqualsNull_2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 2);
        
        java.lang.Object[] actual = treeList.toArray();
        
        java.lang.Object[] expected = {null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toArray()
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#toArray()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final Object[] array = new Object[size()];
 *  */
    @Test
    public void testToArray_ThrowNegativeArraySizeException() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -256);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.toArray] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.collections.list.TreeList.toArray(TreeList.java:180) */
        treeList.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#toArray()}
 * @utbot.executesCondition {@code (root != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: root.toArray(array, root.relativePosition);
 *  */
    @Test
    public void testToArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -256);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.toArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.collections.list.TreeList$AVLNode.toArray(TreeList.java:373)
            org.apache.commons.collections.list.TreeList.toArray(TreeList.java:182) */
        treeList.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#toArray()}
 * @utbot.executesCondition {@code (root != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: root.toArray(array, root.relativePosition);
 *  */
    @Test
    public void testToArray_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 256);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        Object value = createInstance("java.lang.Object");
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.toArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 256 out of bounds for length 1]
            org.apache.commons.collections.list.TreeList$AVLNode.toArray(TreeList.java:373)
            org.apache.commons.collections.list.TreeList$AVLNode.toArray(TreeList.java:375)
            org.apache.commons.collections.list.TreeList.toArray(TreeList.java:182) */
        treeList.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#toArray()}
 * @utbot.executesCondition {@code (root != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: root.toArray(array, root.relativePosition);
 *  */
    @Test
    public void testToArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 16);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        Object value = createInstance("java.lang.Object");
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.toArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 1]
            org.apache.commons.collections.list.TreeList$AVLNode.toArray(TreeList.java:373)
            org.apache.commons.collections.list.TreeList$AVLNode.toArray(TreeList.java:378)
            org.apache.commons.collections.list.TreeList.toArray(TreeList.java:182) */
        treeList.toArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#iterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testIterator_ReturnListIterator() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.iterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        assertNull(actualParentRoot);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#iterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testIterator_ReturnListIterator_5() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.iterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.next = root;
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode expectedNext = expected.next;
        TreeList.AVLNode actualNext = actual.next;
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#iterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testIterator_ReturnListIterator_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -3);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.iterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertTrue(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#iterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testIterator_ReturnListIterator_4() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.iterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertTrue(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#iterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testIterator_ReturnListIterator_2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -3);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.iterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#iterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testIterator_ReturnListIterator_3() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.iterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.next = left;
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode expectedParentRootLeft = ((TreeList.AVLNode) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        TreeList.AVLNode actualParentRootLeftLeft = ((TreeList.AVLNode) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeftLeft);
        
        boolean actualParentRootLeftLeftIsPrevious = ((Boolean) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootLeftRight = ((TreeList.AVLNode) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootLeftRight);
        
        boolean actualParentRootLeftRightIsNext = ((Boolean) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootLeftRightIsNext);
        
        int expectedParentRootLeftHeight = ((Integer) getFieldValue(expectedParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootLeftHeight = ((Integer) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootLeftHeight, actualParentRootLeftHeight);
        
        int expectedParentRootLeftRelativePosition = ((Integer) getFieldValue(expectedParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootLeftRelativePosition = ((Integer) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootLeftRelativePosition, actualParentRootLeftRelativePosition);
        
        Object actualParentRootLeftValue = actualParentRootLeft.getValue();
        assertNull(actualParentRootLeftValue);
        
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode expectedNext = expected.next;
        TreeList.AVLNode actualNext = actual.next;
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#iterator()}
 * @utbot.invokes {@link org.apache.commons.collections.list.TreeList#listIterator(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return listIterator(0);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testIterator_ThrowIndexOutOfBoundsException() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -1);
        
        treeList.iterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(object) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero() {
        TreeList treeList = new TreeList();
        
        boolean actual = treeList.contains(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(object) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_4() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        Character value = '\u0000';
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Character character = '\u0000';
        
        boolean actual = treeList.contains(character);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(object) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        Integer value = 0;
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        boolean actual = treeList.contains(integer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(object) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -255);
        Integer value = -1;
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        boolean actual = treeList.contains(integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(object) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_5() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2);
        Integer value = 0;
        left.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        boolean actual = treeList.contains(integer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return indexOf(object) >= 0;}
 *  */
    @Test
    public void testContains_ReturnIndexOfLessThanZero_3() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2);
        Integer value = 0;
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        boolean actual = treeList.contains(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method contains(java.lang.Object)
    
    @Test
    public void testContains1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Object object = new Object();
        
        boolean actual = treeList.contains(object);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        boolean actual = treeList.contains(null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testContains3() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        Character value = '\u0001';
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Character character = '\u0000';
        
        boolean actual = treeList.contains(character);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains4() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        boolean actual = treeList.contains(null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testContains5() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Object object = new Object();
        
        boolean actual = treeList.contains(object);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains6() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        Integer value = 0;
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        boolean actual = treeList.contains(integer);
        
        assertTrue(actual);
    }
    
    @Test
    public void testContains7() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MAX_VALUE);
        Integer value = 0;
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        boolean actual = treeList.contains(null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains8() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        Character value = '\u0000';
        left.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        Long value1 = 0L;
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Long long1 = 0L;
        
        boolean actual = treeList.contains(long1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testContains9() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        ArrayList value = new ArrayList();
        left.setValue(value);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -252);
        Integer value1 = 1;
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        boolean actual = treeList.contains(integer);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains10() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        ArrayList value = new ArrayList();
        left.setValue(value);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2);
        Character value1 = '\u0001';
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Character character = '\u0000';
        
        boolean actual = treeList.contains(character);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains11() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        ArrayList value = new ArrayList();
        root.setValue(value);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        int[] intArray = {};
        
        boolean actual = treeList.contains(intArray);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains12() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        Integer value = 0;
        left.setValue(value);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2);
        ArrayList value1 = new ArrayList();
        right.setValue(value1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        boolean actual = treeList.contains(integer);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains13() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        Character value = '\u0000';
        left.setValue(value);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", Integer.MIN_VALUE);
        ArrayList value1 = new ArrayList();
        right.setValue(value1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Character character = '\u0000';
        
        boolean actual = treeList.contains(character);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains14() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right1 = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right1, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 4);
        ArrayList value = new ArrayList();
        right1.setValue(value);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right1);
        Long value1 = 0L;
        right.setValue(value1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2);
        Character value2 = '\u0001';
        root.setValue(value2);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Character character = '\u0000';
        
        boolean actual = treeList.contains(character);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains15() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        Integer value = 0;
        left.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        ArrayList value1 = new ArrayList();
        right.setValue(value1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        boolean actual = treeList.contains(integer);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains16() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        Integer value = 0;
        left.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        ArrayList value1 = new ArrayList();
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        
        boolean actual = treeList.contains(null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains17() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        Integer value = 0;
        right.setValue(value);
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        ArrayList value1 = new ArrayList();
        root.setValue(value1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        Integer integer = 0;
        
        boolean actual = treeList.contains(integer);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains18() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        ArrayList value = new ArrayList();
        right.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        byte[] byteArray = {};
        
        boolean actual = treeList.contains(byteArray);
        
        assertFalse(actual);
    }
    
    @Test
    public void testContains19() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2);
        ArrayList value = new ArrayList();
        right.setValue(value);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 2);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        byte[] byteArray = {};
        
        boolean actual = treeList.contains(byteArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.set
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method set(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#set(int,java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testSet_ReturnResult() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        Object actual = treeList.set(0, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#set(int,java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testSet_ReturnResult_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        Object actual = treeList.set(0, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#set(int,java.lang.Object)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testSet_ReturnResult_2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 249);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -249);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        Object actual = treeList.set(0, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: checkInterval(index, 0, size() - 1);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -255);
        
        treeList.set(-1, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: checkInterval(index, 0, size() - 1);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet_ThrowIndexOutOfBoundsException() {
        TreeList treeList = new TreeList();
        
        treeList.set(0, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#set(int,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.collections.list.TreeList#size()}
 * @utbot.invokes org.apache.commons.collections.list.TreeList#checkInterval(int,int,int)
 * @utbot.invokes {@link org.apache.commons.collections.list.TreeList.AVLNode#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AVLNode<E> node = root.get(index);
 *  */
    @Test
    public void testSet_ThrowNullPointerException() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", 1);
        
        /* This test fails because method [org.apache.commons.collections.list.TreeList.set] produces [java.lang.NullPointerException]
            org.apache.commons.collections.list.TreeList.set(TreeList.java:217) */
        treeList.set(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.listIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listIterator(int)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator(int)}
 * @utbot.returnsFrom {@code return new TreeListIterator<E>(this, fromIndex);}
 *  */
    @Test
    public void testListIterator_Return() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator(0));
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        assertNull(actualParentRoot);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator(int)}
 * @utbot.returnsFrom {@code return new TreeListIterator<E>(this, fromIndex);}
 *  */
    @Test
    public void testListIterator_Return_5() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator(0));
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.next = root;
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode expectedNext = expected.next;
        TreeList.AVLNode actualNext = actual.next;
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator(int)}
 * @utbot.returnsFrom {@code return new TreeListIterator<E>(this, fromIndex);}
 *  */
    @Test
    public void testListIterator_Return_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -2);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator(0));
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertTrue(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator(int)}
 * @utbot.returnsFrom {@code return new TreeListIterator<E>(this, fromIndex);}
 *  */
    @Test
    public void testListIterator_Return_2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator(0));
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertTrue(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator(int)}
 * @utbot.returnsFrom {@code return new TreeListIterator<E>(this, fromIndex);}
 *  */
    @Test
    public void testListIterator_Return_4() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator(0));
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator(int)}
 * @utbot.returnsFrom {@code return new TreeListIterator<E>(this, fromIndex);}
 *  */
    @Test
    public void testListIterator_Return_3() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode right = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(right, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "right", right);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", 1);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator(0));
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.next = right;
        expected.currentIndex = -1;
        expected.expectedModCount = 1;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode expectedParentRootRight = ((TreeList.AVLNode) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertTrue(deepEquals(expectedParentRootRight, actualParentRootRight));
        assertTrue(deepEquals(expectedParentRootRight, actualParentRootRight));
        TreeList.AVLNode actualParentRootRightRight = ((TreeList.AVLNode) getFieldValue(actualParentRootRight, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRightRight);
        
        boolean actualParentRootRightRightIsNext = ((Boolean) getFieldValue(actualParentRootRight, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootRightRightIsNext);
        
        int expectedParentRootRightHeight = ((Integer) getFieldValue(expectedParentRootRight, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootRightHeight = ((Integer) getFieldValue(actualParentRootRight, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootRightHeight, actualParentRootRightHeight);
        
        int expectedParentRootRightRelativePosition = ((Integer) getFieldValue(expectedParentRootRight, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRightRelativePosition = ((Integer) getFieldValue(actualParentRootRight, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRightRelativePosition, actualParentRootRightRelativePosition);
        
        Object actualParentRootRightValue = actualParentRootRight.getValue();
        assertNull(actualParentRootRightValue);
        
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode expectedNext = expected.next;
        TreeList.AVLNode actualNext = actual.next;
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method listIterator(int)
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: checkInterval(fromIndex, 0, size());
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIterator_ThrowIndexOutOfBoundsException() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -255);
        
        treeList.listIterator(-1);
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: checkInterval(fromIndex, 0, size());
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIterator_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -1);
        
        treeList.listIterator(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.list.TreeList.listIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method listIterator()
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testListIterator_ReturnListIterator() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        assertNull(actualParentRoot);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testListIterator_ReturnListIterator_5() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.next = root;
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode expectedNext = expected.next;
        TreeList.AVLNode actualNext = actual.next;
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testListIterator_ReturnListIterator_1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -3);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertTrue(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testListIterator_ReturnListIterator_4() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious", true);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertTrue(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testListIterator_ReturnListIterator_2() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -3);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeft);
        
        boolean actualParentRootLeftIsPrevious = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootRight = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootRight);
        
        boolean actualParentRootRightIsNext = ((Boolean) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootRightIsNext);
        
        int expectedParentRootHeight = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootHeight = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootHeight, actualParentRootHeight);
        
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        Object actualParentRootValue = actualParentRoot.getValue();
        assertNull(actualParentRootValue);
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode actualNext = actual.next;
        assertNull(actualNext);
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator()}
 * @utbot.returnsFrom {@code return listIterator(0);}
 *  */
    @Test
    public void testListIterator_ReturnListIterator_3() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        TreeList.AVLNode root = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        TreeList.AVLNode left = ((TreeList.AVLNode) createInstance("org.apache.commons.collections.list.TreeList$AVLNode"));
        setField(left, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", -1);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "left", left);
        setField(root, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition", 1);
        setField(treeList, "org.apache.commons.collections.list.TreeList", "root", root);
        setField(treeList, "java.util.AbstractList", "modCount", -255);
        
        TreeList.TreeListIterator actual = ((TreeList.TreeListIterator) treeList.listIterator());
        
        TreeList.TreeListIterator expected = ((TreeList.TreeListIterator) createInstance("org.apache.commons.collections.list.TreeList$TreeListIterator"));
        setField(expected, "org.apache.commons.collections.list.TreeList$TreeListIterator", "parent", treeList);
        expected.next = left;
        expected.currentIndex = -1;
        expected.expectedModCount = -255;
        
        TreeList expectedParent = expected.parent;
        TreeList actualParent = actual.parent;
        TreeList.AVLNode expectedParentRoot = ((TreeList.AVLNode) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode actualParentRoot = ((TreeList.AVLNode) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "root"));
        TreeList.AVLNode expectedParentRootLeft = ((TreeList.AVLNode) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        TreeList.AVLNode actualParentRootLeft = ((TreeList.AVLNode) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        TreeList.AVLNode actualParentRootLeftLeft = ((TreeList.AVLNode) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "left"));
        assertNull(actualParentRootLeftLeft);
        
        boolean actualParentRootLeftLeftIsPrevious = ((Boolean) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "leftIsPrevious"));
        assertFalse(actualParentRootLeftLeftIsPrevious);
        
        TreeList.AVLNode actualParentRootLeftRight = ((TreeList.AVLNode) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "right"));
        assertNull(actualParentRootLeftRight);
        
        boolean actualParentRootLeftRightIsNext = ((Boolean) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "rightIsNext"));
        assertFalse(actualParentRootLeftRightIsNext);
        
        int expectedParentRootLeftHeight = ((Integer) getFieldValue(expectedParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        int actualParentRootLeftHeight = ((Integer) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "height"));
        assertEquals(expectedParentRootLeftHeight, actualParentRootLeftHeight);
        
        int expectedParentRootLeftRelativePosition = ((Integer) getFieldValue(expectedParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootLeftRelativePosition = ((Integer) getFieldValue(actualParentRootLeft, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootLeftRelativePosition, actualParentRootLeftRelativePosition);
        
        Object actualParentRootLeftValue = actualParentRootLeft.getValue();
        assertNull(actualParentRootLeftValue);
        
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        int expectedParentRootRelativePosition = ((Integer) getFieldValue(expectedParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        int actualParentRootRelativePosition = ((Integer) getFieldValue(actualParentRoot, "org.apache.commons.collections.list.TreeList$AVLNode", "relativePosition"));
        assertEquals(expectedParentRootRelativePosition, actualParentRootRelativePosition);
        
        assertTrue(deepEquals(expectedParentRoot, actualParentRoot));
        
        int expectedParentSize = ((Integer) getFieldValue(expectedParent, "org.apache.commons.collections.list.TreeList", "size"));
        int actualParentSize = ((Integer) getFieldValue(actualParent, "org.apache.commons.collections.list.TreeList", "size"));
        assertEquals(expectedParentSize, actualParentSize);
        
        int expectedParentModCount = ((Integer) getFieldValue(expectedParent, "java.util.AbstractList", "modCount"));
        int actualParentModCount = ((Integer) getFieldValue(actualParent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentModCount, actualParentModCount);
        
        TreeList.AVLNode expectedNext = expected.next;
        TreeList.AVLNode actualNext = actual.next;
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        assertTrue(deepEquals(expectedNext, actualNext));
        
        int expectedNextIndex = expected.nextIndex;
        int actualNextIndex = actual.nextIndex;
        assertEquals(expectedNextIndex, actualNextIndex);
        
        TreeList.AVLNode actualCurrent = actual.current;
        assertNull(actualCurrent);
        
        int expectedCurrentIndex = expected.currentIndex;
        int actualCurrentIndex = actual.currentIndex;
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
        int expectedExpectedModCount = expected.expectedModCount;
        int actualExpectedModCount = actual.expectedModCount;
        assertEquals(expectedExpectedModCount, actualExpectedModCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method listIterator()
    
    /**
    @utbot.classUnderTest {@link TreeList}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.list.TreeList#listIterator()}
 * @utbot.invokes {@link org.apache.commons.collections.list.TreeList#listIterator(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return listIterator(0);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testListIterator_ThrowIndexOutOfBoundsException1() throws Exception  {
        TreeList treeList = ((TreeList) createInstance("org.apache.commons.collections.list.TreeList"));
        setField(treeList, "org.apache.commons.collections.list.TreeList", "size", -1);
        
        treeList.listIterator();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields947949611025500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields947949611025500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass947949611029900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields947949611025500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass947949611029900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields947949611601500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields947949611601500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass947949611603000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields947949611601500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass947949611603000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


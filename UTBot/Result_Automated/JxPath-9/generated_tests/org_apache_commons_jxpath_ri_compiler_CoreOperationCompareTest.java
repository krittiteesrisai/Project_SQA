package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import java.lang.reflect.Constructor;
import org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer;
import com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyIterator;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_jxpath_ri_compiler_CoreOperationCompareTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.getPrecedence
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrecedence()
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#getPrecedence()}
 * @utbot.returnsFrom {@code return 2;}
 *  */
    @Test
    public void testGetPrecedence_Return2() {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        
        int actual = nameAttributeTest.getPrecedence();
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.isSymmetric
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSymmetric()
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#isSymmetric()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSymmetric_ReturnTrue() {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        
        boolean actual = nameAttributeTest.isSymmetric();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMatch(java.util.Iterator, java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#findMatch(java.util.Iterator,java.util.Iterator)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testFindMatch_ReturnFalse() {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();
        
        boolean actual = nameAttributeTest.findMatch(iterator, iterator1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#findMatch(java.util.Iterator,java.util.Iterator)}
 * @utbot.executesCondition {@code (contains(left.iterator(), rit.next())): False}
 * @utbot.invokes {@link java.util.HashSet#iterator()}
 * @utbot.invokes {@link java.util.Iterator#next()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#contains(java.util.Iterator,java.lang.Object)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testFindMatch_NotContains() {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();
        
        boolean actual = nameAttributeTest.findMatch(iterator, iterator1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findMatch(java.util.Iterator, java.util.Iterator)
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#findMatch(java.util.Iterator,java.util.Iterator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(lit.hasNext())
 *  */
    @Test
    public void testFindMatch_ThrowNullPointerException() {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch(CoreOperationCompare.java:111) */
        coreOperationEqual.findMatch(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#findMatch(java.util.Iterator,java.util.Iterator)}
 * @utbot.invokes {@link java.util.Iterator#hasNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(rit.hasNext())
 *  */
    @Test
    public void testFindMatch_ThrowNullPointerException_1() {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch(CoreOperationCompare.java:114) */
        coreOperationEqual.findMatch(iterator, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method findMatch(java.util.Iterator, java.util.Iterator)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#findMatch(java.util.Iterator,java.util.Iterator)}
     */
    @Test
    public void testFindMatchReturnsFalse() {
        Constant constant = new Constant("-3");
        VariableReference variableReference = new VariableReference(null);
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(constant, variableReference);
        Iterator iterator = emptyIterator();
        Iterator iterator1 = emptyIterator();
        
        boolean actual = coreOperationNotEqual.findMatch(iterator, iterator1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.util.Iterator, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#contains(java.util.Iterator,java.lang.Object)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContains_ItHasNext() {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        
        boolean actual = nameAttributeTest.contains(iterator, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.util.Iterator, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#contains(java.util.Iterator,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(it.hasNext())
 *  */
    @Test
    public void testContains_ThrowNullPointerException() {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.contains] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.contains(CoreOperationCompare.java:100) */
        nameAttributeTest.contains(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains(java.util.Iterator, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#contains(java.util.Iterator,java.lang.Object)}
     */
    @Test
    public void testContainsReturnsFalse() {
        Constant constant = new Constant("-3");
        VariableReference variableReference = new VariableReference(null);
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(constant, variableReference);
        Iterator iterator = emptyIterator();
        Object object = new Object();
        
        boolean actual = coreOperationNotEqual.contains(iterator, object);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equal(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (l instanceof Pointer && r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l instanceof Pointer): False}
 * @utbot.executesCondition {@code (r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l == r): False}
 * @utbot.executesCondition {@code (l instanceof Boolean || r instanceof Boolean): True}
 * @utbot.executesCondition {@code (l instanceof Number || r instanceof Number): True}
 * @utbot.executesCondition {@code (l instanceof String || r instanceof String): True}
 * @utbot.returnsFrom {@code return l != null && l.equals(r);}
 *  */
    @Test
    public void testEqual_LEqualsNullAndLEquals() {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        short[] shortArray = {};
        
        boolean actual = coreOperationEqual.equal(null, shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (l instanceof Pointer && r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l instanceof Pointer): False}
 * @utbot.executesCondition {@code (r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l == r): True}
 *  */
    @Test
    public void testEqual_LEqualsR() {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        
        boolean actual = coreOperationEqual.equal(null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (l instanceof Pointer && r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l instanceof Pointer): False}
 * @utbot.executesCondition {@code (r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l == r): False}
 * @utbot.executesCondition {@code (l instanceof Boolean || r instanceof Boolean): True}
 * @utbot.executesCondition {@code (l instanceof Number || r instanceof Number): True}
 * @utbot.returnsFrom {@code return (InfoSetUtil.doubleValue(l) == InfoSetUtil.doubleValue(r));}
 *  */
    @Test
    public void testEqual_LInstanceOfNumberOrRInstanceOfNumber() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        Integer integer = 0;
        
        boolean actual = coreOperationNotEqual.equal(initialContext, integer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (l instanceof Pointer && r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l instanceof Pointer): False}
 * @utbot.executesCondition {@code (r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l == r): False}
 * @utbot.executesCondition {@code (l instanceof Boolean || r instanceof Boolean): True}
 * @utbot.executesCondition {@code (l instanceof Number || r instanceof Number): False}
 * @utbot.returnsFrom {@code return (InfoSetUtil.doubleValue(l) == InfoSetUtil.doubleValue(r));}
 *  */
    @Test
    public void testEqual_LNotInstanceOfNumberOrRNotInstanceOfNumber() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        Long long1 = 0L;
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        
        boolean actual = coreOperationNotEqual.equal(long1, initialContext);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (l instanceof Pointer && r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l instanceof Pointer): False}
 * @utbot.executesCondition {@code (r instanceof Pointer): True}
 * @utbot.executesCondition {@code (l == r): True}
 *  */
    @Test
    public void testEqual_LEqualsR_1() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        Class dOMAttributePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer");
        Class nodePointerType = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Constructor dOMAttributePointerConstructor = dOMAttributePointerClazz.getDeclaredConstructor(nodePointerType, iIOAttrType);
        dOMAttributePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMAttributePointerConstructorArguments = new java.lang.Object[2];
        dOMAttributePointerConstructorArguments[0] = ((Object) null);
        dOMAttributePointerConstructorArguments[1] = iIOAttr;
        DOMAttributePointer dOMAttributePointer = ((DOMAttributePointer) dOMAttributePointerConstructor.newInstance(dOMAttributePointerConstructorArguments));
        
        boolean actual = coreOperationEqual.equal(null, dOMAttributePointer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (l instanceof Pointer && r instanceof Pointer): True}
 * @utbot.executesCondition {@code (l instanceof Pointer): True}
 * @utbot.executesCondition {@code (r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l == r): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.Pointer#getValue()}
 *  */
    @Test
    public void testEqual_LInstanceOfPointer() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        Class dOMAttributePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer");
        Class nodePointerType = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Constructor dOMAttributePointerConstructor = dOMAttributePointerClazz.getDeclaredConstructor(nodePointerType, iIOAttrType);
        dOMAttributePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMAttributePointerConstructorArguments = new java.lang.Object[2];
        dOMAttributePointerConstructorArguments[0] = ((Object) null);
        dOMAttributePointerConstructorArguments[1] = iIOAttr;
        DOMAttributePointer dOMAttributePointer = ((DOMAttributePointer) dOMAttributePointerConstructor.newInstance(dOMAttributePointerConstructorArguments));
        
        boolean actual = coreOperationEqual.equal(dOMAttributePointer, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (l instanceof Pointer && r instanceof Pointer): False}
 * @utbot.executesCondition {@code (l instanceof Pointer): False}
 * @utbot.executesCondition {@code (r instanceof Pointer): True}
 * @utbot.executesCondition {@code (l == r): False}
 * @utbot.executesCondition {@code (l instanceof Boolean || r instanceof Boolean): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.InfoSetUtil#booleanValue(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.InfoSetUtil#booleanValue(java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueNotEqualsInfoSetUtilBooleanValue() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        Boolean boolean1 = true;
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        Class dOMAttributePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer");
        Class nodePointerType = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Constructor dOMAttributePointerConstructor = dOMAttributePointerClazz.getDeclaredConstructor(nodePointerType, iIOAttrType);
        dOMAttributePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMAttributePointerConstructorArguments = new java.lang.Object[2];
        dOMAttributePointerConstructorArguments[0] = ((Object) null);
        dOMAttributePointerConstructorArguments[1] = iIOAttr;
        DOMAttributePointer dOMAttributePointer = ((DOMAttributePointer) dOMAttributePointerConstructor.newInstance(dOMAttributePointerConstructorArguments));
        
        boolean actual = coreOperationEqual.equal(boolean1, dOMAttributePointer);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equal(java.lang.Object, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (l instanceof Pointer && r instanceof Pointer): False},
    ///     {@code (l instanceof Pointer): False},
    ///     {@code (r instanceof Pointer): False},
    ///     {@code (l == r): False},
    ///     {@code (l instanceof Boolean || r instanceof Boolean): True}
    /// invoke:
    ///     {@link org.apache.commons.jxpath.ri.InfoSetUtil#booleanValue(java.lang.Object)} twice
    /// return from: {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueEqualsInfoSetUtilBooleanValue() {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        int[] intArray = {};
        Boolean boolean1 = true;
        
        boolean actual = coreOperationEqual.equal(intArray, boolean1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueNotEqualsInfoSetUtilBooleanValue_2() {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        Boolean boolean1 = true;
        
        boolean actual = coreOperationEqual.equal(null, boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueNotEqualsInfoSetUtilBooleanValue_3() {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        String string = "";
        Boolean boolean1 = true;
        
        boolean actual = nameAttributeTest.equal(string, boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueNotEqualsInfoSetUtilBooleanValue_4() {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        Integer integer = 0;
        Boolean boolean1 = true;
        
        boolean actual = coreOperationEqual.equal(integer, boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueNotEqualsInfoSetUtilBooleanValue_5() {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        Integer integer = 692175107;
        Boolean boolean1 = false;
        
        boolean actual = coreOperationNotEqual.equal(integer, boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueNotEqualsInfoSetUtilBooleanValue_1() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        Boolean boolean1 = true;
        
        boolean actual = coreOperationEqual.equal(initialContext, boolean1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equal(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (l instanceof Pointer && r instanceof Pointer): True}
 * @utbot.executesCondition {@code (l instanceof Pointer): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.Pointer#getValue()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: l = ((Pointer) l).getValue();
 *  */
    @Test
    public void testEqual_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 8);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(nodeImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = nodeImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Comment] */
        coreOperationEqual.equal(dOMNodePointer, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method equal(java.lang.Object, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
     */
    @Test
    public void testEqualReturnsFalse() {
        Constant constant = new Constant("-3");
        VariableReference variableReference = new VariableReference(null);
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(constant, variableReference);
        Object object = new Object();
        Object object1 = new Object();
        
        boolean actual = coreOperationNotEqual.equal(object, object1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equal(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression)
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowClassCastException1() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(unionContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowClassCastException_2() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        LocationPath locationPath = new LocationPath(true, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:608)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:618)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(rootContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowClassCastException_3() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(initialContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        LocationPath locationPath = new LocationPath(true, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:608)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:618)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(initialContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowClassCastException_4() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        RootContext parentContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(initialContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        LocationPath locationPath = new LocationPath(true, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:608)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:618)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(initialContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowClassCastException_1() throws Exception  {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        Object object = createInstance("java.lang.Object");
        readOnlyPointers.add(object);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.ri.model.NodePointer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        nameAttributeTest.equal(unionContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowIndexOutOfBoundsException() throws Exception  {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -1073741824);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.IndexOutOfBoundsException: Index -1073741825 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        nameAttributeTest.equal(unionContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowNullPointerException() {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowNullPointerException_2() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        DynamicPointer pointer = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "pointer", pointer);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:216)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:66)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(rootContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowNullPointerException_1() throws Exception  {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        readOnlyPointers.add(beanPropertyPointer);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:216)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:66)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        nameAttributeTest.equal(unionContext, locationPath, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method equal(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
     */
    @Test
    public void testEqualThrowsNPE() {
        Constant constant = new Constant(((Number) null));
        VariableReference variableReference = new VariableReference(null);
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(constant, variableReference);
        RootContext rootContext = new RootContext(null, null);
        rootContext.setPosition(-1);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest("#$\\\"'");
        SelfContext selfContext = new SelfContext(rootContext, processingInstructionTest);
        selfContext.setPosition(-2147467264);
        Constant constant1 = new Constant("\n\t\r");
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:61) */
        coreOperationEqual.equal(selfContext, constant1, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equal(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression)
    
    @Test(expected = StackOverflowError.class)
    public void testEqual1() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        AncestorContext ancestorContext = ((AncestorContext) createInstance("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        VariablePointer rootPointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", namespaceResolver);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(ancestorContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        LocationPath locationPath = new LocationPath(true, null);
        
        coreOperationNotEqual.equal(ancestorContext, locationPath, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testEqual2() throws Exception  {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        DynaBeanPropertyPointer rootPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", namespaceResolver);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        AncestorContext ancestorContext = new AncestorContext(rootContext, false, null);
        LocationPath locationPath = new LocationPath(true, null);
        
        nameAttributeTest.equal(ancestorContext, locationPath, null);
    }
    
    @Test
    public void testEqual3() throws Exception  {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[9];
        UnionContext unionContext1 = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext1, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        contexts[0] = ((EvalContext) unionContext1);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        LocationPath locationPath = new LocationPath(false, null);
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:53)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:63)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.nextNode(NodeSetContext.java:65)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        nameAttributeTest.equal(unionContext, locationPath, coreFunction);
    }
    
    @Test
    public void testEqual4() throws Exception  {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[9];
        UnionContext unionContext1 = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        contexts[0] = ((EvalContext) unionContext1);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        LocationPath locationPath = new LocationPath(false, null);
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:50)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.nextNode(NodeSetContext.java:65)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:53)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        nameAttributeTest.equal(unionContext, locationPath, coreFunction);
    }
    
    @Test
    public void testEqual5() throws Exception  {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[9];
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MAX_VALUE);
        contexts[0] = ((EvalContext) nodeSetContext);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        LocationPath locationPath = new LocationPath(false, null);
        CoreFunction coreFunction = new CoreFunction(0, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:52)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        nameAttributeTest.equal(unionContext, locationPath, coreFunction);
    }
    
    @Test
    public void testEqual6() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(nodeSetContext, locationPath, null);
    }
    
    @Test
    public void testEqual7() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        ArrayList values = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet", "values", values);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(unionContext, locationPath, null);
    }
    
    @Test
    public void testEqual8() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        LocationPath locationPath = new LocationPath(true, null);
        Constant constant = new Constant(((String) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:618)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationEqual.equal(rootContext, locationPath, constant);
    }
    
    @Test
    public void testEqual9() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        ParentContext parentContext = ((ParentContext) createInstance("org.apache.commons.jxpath.ri.axes.ParentContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        AncestorContext ancestorContext = new AncestorContext(parentContext, false, null);
        LocationPath locationPath = new LocationPath(true, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(ancestorContext, locationPath, null);
    }
    
    @Test
    public void testEqual10() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = {};
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationEqual.equal(unionContext, locationPath, null);
    }
    
    @Test
    public void testEqual11() throws Exception  {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        AncestorContext ancestorContext = ((AncestorContext) createInstance("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(ancestorContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        LocationPath locationPath = new LocationPath(true, null);
        Constant constant = new Constant(((String) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:618)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        nameAttributeTest.equal(ancestorContext, locationPath, constant);
    }
    
    @Test
    public void testEqual12() throws Exception  {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JDOMNamespacePointer rootPointer = ((JDOMNamespacePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent1 = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(parent, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent1);
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        LocationPath locationPath = new LocationPath(true, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:216)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:66)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        nameAttributeTest.equal(rootContext, locationPath, null);
    }
    
    @Test
    public void testEqual13() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        AncestorContext ancestorContext = ((AncestorContext) createInstance("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        VariablePointer rootPointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(ancestorContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        LocationPath locationPath = new LocationPath(true, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:216)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:66)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(ancestorContext, locationPath, null);
    }
    
    @Test
    public void testEqual14() throws Exception  {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        AncestorContext ancestorContext = new AncestorContext(rootContext, false, null);
        LocationPath locationPath = new LocationPath(true, null);
        Constant constant = new Constant(((String) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:618)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        nameAttributeTest.equal(ancestorContext, locationPath, constant);
    }
    
    @Test
    public void testEqual15() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        DynamicPropertyPointer rootPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        AncestorContext ancestorContext = new AncestorContext(rootContext, false, null);
        LocationPath locationPath = new LocationPath(true, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:216)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:66)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationEqual.equal(ancestorContext, locationPath, null);
    }
    
    @Test
    public void testEqual16() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        pointers.add(null);
        pointers.add(null);
        pointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:60) */
        coreOperationNotEqual.equal(unionContext, locationPath, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1045260938678800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1045260938678800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1045260938693000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1045260938678800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1045260938693000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


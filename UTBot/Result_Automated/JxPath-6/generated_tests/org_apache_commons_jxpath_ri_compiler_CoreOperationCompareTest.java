package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.reflect.Constructor;
import org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyIterator;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_jxpath_ri_compiler_CoreOperationCompareTest {
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
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#contains(java.util.Iterator,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code while(it.hasNext())} once
 *  */
    @Test
    public void testContains_Equal() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
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
        
        boolean actual = coreOperationEqual.contains(iterator, dOMAttributePointer);
        
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
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.contains] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.contains(CoreOperationCompare.java:86) */
        coreOperationEqual.contains(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method contains(java.util.Iterator, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#contains(java.util.Iterator,java.lang.Object)}
     */
    @Test
    public void testContainsReturnsFalse() {
        Constant constant = new Constant(((Number) null));
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equal(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.Expression, org.apache.commons.jxpath.ri.compiler.Expression)
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowClassCastException() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4a4691f4)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:48)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:50) */
        coreOperationEqual.equal(unionContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowClassCastException_1() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        LocationPath locationPath = new LocationPath(true, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4a4691f4)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:608)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:618)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:50) */
        coreOperationEqual.equal(rootContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowClassCastException_3() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(initialContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        LocationPath locationPath = new LocationPath(true, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4a4691f4)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:608)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:618)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:50) */
        coreOperationEqual.equal(initialContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowClassCastException_4() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        RootContext parentContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(initialContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        LocationPath locationPath = new LocationPath(true, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4a4691f4)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:608)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:618)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:61)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:50) */
        coreOperationEqual.equal(initialContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowClassCastException_2() throws Exception  {
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.ri.model.NodePointer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4a4691f4)]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:39)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:64)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:50) */
        nameAttributeTest.equal(unionContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowIndexOutOfBoundsException() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
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
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:50) */
        coreOperationNotEqual.equal(unionContext, locationPath, null);
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
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:50) */
        coreOperationNotEqual.equal(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowNullPointerException_1() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        DynamicPointer pointer = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "pointer", pointer);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:216)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:66)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:50) */
        coreOperationEqual.equal(rootContext, locationPath, null);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object l = left.compute(context);
 *  */
    @Test
    public void testEqual_ThrowNullPointerException_2() throws Exception  {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        readOnlyPointers.add(collectionPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        LocationPath locationPath = new LocationPath(false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:216)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:66)
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.equal(CoreOperationCompare.java:50) */
        coreOperationEqual.equal(unionContext, locationPath, null);
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
    public void testEqual_LEqualsNullAndLEquals_1() {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        short[] shortArray = {};
        
        boolean actual = coreOperationNotEqual.equal(null, shortArray);
        
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
 * @utbot.executesCondition {@code (l instanceof Number || r instanceof Number): True}
 * @utbot.executesCondition {@code (l instanceof String || r instanceof String): True}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return l != null && l.equals(r);}
 *  */
    @Test
    public void testEqual_LEqualsNullAndLEquals() {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        Character character = '\u0000';
        
        boolean actual = coreOperationNotEqual.equal(character, null);
        
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
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        
        boolean actual = coreOperationNotEqual.equal(null, null);
        
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
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.InfoSetUtil#doubleValue(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.InfoSetUtil#doubleValue(java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.doubleValue(l) == InfoSetUtil.doubleValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilDoubleValueNotEqualsInfoSetUtilDoubleValue() throws Exception  {
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
 * @utbot.executesCondition {@code (r instanceof Pointer): True}
 * @utbot.executesCondition {@code (l == r): True}
 *  */
    @Test
    public void testEqual_LEqualsR_1() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
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
        
        boolean actual = coreOperationNotEqual.equal(null, dOMAttributePointer);
        
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
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
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
        
        boolean actual = coreOperationNotEqual.equal(dOMAttributePointer, null);
        
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
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
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
        
        boolean actual = coreOperationNotEqual.equal(boolean1, dOMAttributePointer);
        
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
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        byte[] byteArray = {};
        Boolean boolean1 = true;
        
        boolean actual = coreOperationNotEqual.equal(byteArray, boolean1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueNotEqualsInfoSetUtilBooleanValue_1() {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        String string = "";
        Boolean boolean1 = true;
        
        boolean actual = coreOperationEqual.equal(string, boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueNotEqualsInfoSetUtilBooleanValue_2() {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        String string = "\u0000";
        Boolean boolean1 = false;
        
        boolean actual = coreOperationNotEqual.equal(string, boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueEqualsInfoSetUtilBooleanValue_2() {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        Integer integer = 0;
        Boolean boolean1 = false;
        
        boolean actual = nameAttributeTest.equal(integer, boolean1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueNotEqualsInfoSetUtilBooleanValue_3() {
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        Integer integer = -3107775;
        Boolean boolean1 = false;
        
        boolean actual = nameAttributeTest.equal(integer, boolean1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#equal(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (InfoSetUtil.booleanValue(l) == InfoSetUtil.booleanValue(r));}
 *  */
    @Test
    public void testEqual_InfoSetUtilBooleanValueEqualsInfoSetUtilBooleanValue_1() throws Exception  {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        InitialContext initialContext = ((InitialContext) createInstance("org.apache.commons.jxpath.ri.axes.InitialContext"));
        Boolean boolean1 = false;
        
        boolean actual = coreOperationNotEqual.equal(initialContext, boolean1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findMatch(java.util.Iterator, java.util.Iterator)
    
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
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        ArrayList arrayList = new ArrayList();
        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();
        
        boolean actual = coreOperationEqual.findMatch(iterator, iterator1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CoreOperationCompare}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.CoreOperationCompare#findMatch(java.util.Iterator,java.util.Iterator)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testFindMatch_ReturnFalse() {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();
        
        boolean actual = coreOperationEqual.findMatch(iterator, iterator1);
        
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
        NameAttributeTest nameAttributeTest = new NameAttributeTest(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch(CoreOperationCompare.java:97) */
        nameAttributeTest.findMatch(null, null);
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
            org.apache.commons.jxpath.ri.compiler.CoreOperationCompare.findMatch(CoreOperationCompare.java:100) */
        coreOperationEqual.findMatch(iterator, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findMatch(java.util.Iterator, java.util.Iterator)
    
    @Test
    public void testFindMatch1() {
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator1 = arrayList1.iterator();
        
        boolean actual = coreOperationEqual.findMatch(iterator, iterator1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testFindMatch2() {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();
        
        boolean actual = coreOperationNotEqual.findMatch(iterator, iterator1);
        
        assertTrue(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1044220223093300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1044220223093300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1044220223107100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1044220223093300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1044220223107100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.BasicNodeSet;
import java.util.ArrayList;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_jxpath_ri_compiler_ExpressionTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.Expression.iterate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterate(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iterate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object result = compute(context);
 *  */
    @Test
    public void testIterate_ThrowClassCastException() throws Exception  {
        LocationPath locationPath = new LocationPath(true, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:65)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        locationPath.iterate(rootContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iterate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object result = compute(context);
 *  */
    @Test
    public void testIterate_ThrowClassCastException_3() throws Exception  {
        LocationPath locationPath = new LocationPath(true, null);
        AncestorContext ancestorContext = ((AncestorContext) createInstance("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(ancestorContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:65)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        locationPath.iterate(ancestorContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iterate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIterate_ThrowClassCastException_1() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:51)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        expressionPath.iterate(unionContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iterate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIterate_ThrowIndexOutOfBoundsException() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        expressionPath.iterate(nodeSetContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iterate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIterate_ThrowClassCastException_2() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        Object object = createInstance("java.lang.Object");
        readOnlyPointers.add(object);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.ri.model.NodePointer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        expressionPath.iterate(nodeSetContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iterate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testIterate_ThrowNullPointerException_1() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        AncestorContext ancestorContext = ((AncestorContext) createInstance("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        BeanPointer currentNodePointer = ((BeanPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPointer"));
        setField(ancestorContext, "org.apache.commons.jxpath.ri.axes.AncestorContext", "currentNodePointer", currentNodePointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:220)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:70)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        expressionPath.iterate(ancestorContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iterate(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testIterate_ThrowNullPointerException() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        DynaBeanPointer dynaBeanPointer = ((DynaBeanPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
        readOnlyPointers.add(dynaBeanPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(unionContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:220)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:70)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        expressionPath.iterate(unionContext);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method iterate(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testIterate1() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        locationPath.iterate(unionContext);
    }
    
    @Test
    public void testIterate2() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[1];
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "startedSet", true);
        contexts[0] = ((EvalContext) nodeSetContext);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        expressionPath.iterate(unionContext);
    }
    
    @Test
    public void testIterate3() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        expressionPath.iterate(unionContext);
    }
    
    @Test
    public void testIterate4() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        expressionPath.iterate(nodeSetContext);
    }
    
    @Test
    public void testIterate5() throws Exception  {
        LocationPath locationPath = new LocationPath(true, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        NullPointer rootPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        String defaultNamespaceURI = "";
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "defaultNamespaceURI", defaultNamespaceURI);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        AncestorContext ancestorContext = new AncestorContext(rootContext, false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iterate] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:220)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:70)
            org.apache.commons.jxpath.ri.compiler.Expression.iterate(Expression.java:73) */
        locationPath.iterate(ancestorContext);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isContextDependent()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return contextDependent;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#isContextDependent()}
 * @utbot.executesCondition {@code (!contextDependencyKnown): False}
 * @utbot.returnsFrom {@code return contextDependent;}
 *  */
    @Test
    public void testIsContextDependent_ContextDependencyKnown() throws Exception  {
        ExtensionFunction extensionFunction = ((ExtensionFunction) createInstance("org.apache.commons.jxpath.ri.compiler.ExtensionFunction"));
        setField(extensionFunction, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown", true);
        
        boolean actual = extensionFunction.isContextDependent();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#isContextDependent()}
 * @utbot.executesCondition {@code (!contextDependencyKnown): True}
 * @utbot.returnsFrom {@code return contextDependent;}
 *  */
    @Test
    public void testIsContextDependent_NotContextDependencyKnown() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        
        boolean actual = locationPath.isContextDependent();
        
        assertTrue(actual);
        
        boolean finalLocationPathContextDependencyKnown = ((Boolean) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        boolean finalLocationPathContextDependent = ((Boolean) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependent"));
        
        assertTrue(finalLocationPathContextDependencyKnown);
        
        assertTrue(finalLocationPathContextDependent);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#isContextDependent()}
 * @utbot.executesCondition {@code (!contextDependencyKnown): True}
 * @utbot.returnsFrom {@code return contextDependent;}
 *  */
    @Test
    public void testIsContextDependent_NotContextDependencyKnown_1() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        
        boolean actual = locationPath.isContextDependent();
        
        assertFalse(actual);
        
        boolean finalLocationPathContextDependencyKnown = ((Boolean) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalLocationPathContextDependencyKnown);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isContextDependent()
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#isContextDependent()}
 * @utbot.executesCondition {@code (!contextDependencyKnown): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.Expression#computeContextDependent()}
 * @utbot.returnsFrom {@code return contextDependent;}
 *  */
    @Test
    public void testIsContextDependent_NotContextDependencyKnown_2() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[0] = ((Expression) variableReference);
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[1] = ((Expression) constant);
        ExtensionFunction extensionFunction = ((ExtensionFunction) createInstance("org.apache.commons.jxpath.ri.compiler.ExtensionFunction"));
        setField(extensionFunction, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown", true);
        setField(extensionFunction, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependent", true);
        predicates[2] = ((Expression) extensionFunction);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = locationPath.isContextDependent();
        
        assertTrue(actual);
        
        boolean finalLocationPathContextDependencyKnown = ((Boolean) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        boolean finalLocationPathContextDependent = ((Boolean) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependent"));
        
        assertTrue(finalLocationPathContextDependencyKnown);
        
        assertTrue(finalLocationPathContextDependent);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isContextDependent()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#isContextDependent()}
     */
    @Test
    public void testIsContextDependentReturnsFalse() {
        QName qName = new QName("XZ", "-3");
        VariableReference variableReference = new VariableReference(qName);
        
        boolean actual = variableReference.isContextDependent();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isContextDependent()
    
    @Test
    public void testIsContextDependent1() throws Exception  {
        CoreOperationLessThan coreOperationLessThan = ((CoreOperationLessThan) createInstance("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan"));
        
        boolean actual = coreOperationLessThan.isContextDependent();
        
        assertFalse(actual);
        
        boolean finalCoreOperationLessThanContextDependencyKnown = ((Boolean) getFieldValue(coreOperationLessThan, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalCoreOperationLessThanContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent2() throws Exception  {
        CoreFunction coreFunction = ((CoreFunction) createInstance("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        
        boolean actual = coreFunction.isContextDependent();
        
        assertFalse(actual);
        
        boolean finalCoreFunctionContextDependencyKnown = ((Boolean) getFieldValue(coreFunction, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalCoreFunctionContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent3() throws Exception  {
        ExtensionFunction extensionFunction = ((ExtensionFunction) createInstance("org.apache.commons.jxpath.ri.compiler.ExtensionFunction"));
        
        boolean actual = extensionFunction.isContextDependent();
        
        assertTrue(actual);
        
        boolean finalExtensionFunctionContextDependencyKnown = ((Boolean) getFieldValue(extensionFunction, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalExtensionFunctionContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent4() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[0] = ((Expression) variableReference);
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[1] = ((Expression) constant);
        CoreOperationLessThan coreOperationLessThan = ((CoreOperationLessThan) createInstance("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan"));
        predicates[2] = ((Expression) coreOperationLessThan);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = locationPath.isContextDependent();
        
        assertFalse(actual);
        
        org.apache.commons.jxpath.ri.compiler.Step[] locationPathSteps = ((org.apache.commons.jxpath.ri.compiler.Step[]) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps"));
        Step locationPathStepsSteps0 = ((Step) get(locationPathSteps, 0));
        org.apache.commons.jxpath.ri.compiler.Expression[] locationPathStepsSteps0Steps0Predicates = ((org.apache.commons.jxpath.ri.compiler.Expression[]) getFieldValue(locationPathStepsSteps0, "org.apache.commons.jxpath.ri.compiler.Step", "predicates"));
        Expression locationPathStepsSteps0Steps0PredicatesSteps0Predicates2 = ((Expression) get(locationPathStepsSteps0Steps0Predicates, 2));
        boolean finalLocationPathSteps0Predicates2ContextDependencyKnown = ((Boolean) getFieldValue(locationPathStepsSteps0Steps0PredicatesSteps0Predicates2, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        boolean finalLocationPathContextDependencyKnown = ((Boolean) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalLocationPathSteps0Predicates2ContextDependencyKnown);
        
        assertTrue(finalLocationPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent5() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[0] = ((Expression) variableReference);
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[1] = ((Expression) constant);
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        CoreFunction expression = ((CoreFunction) createInstance("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        predicates[2] = ((Expression) expressionPath);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = locationPath.isContextDependent();
        
        assertFalse(actual);
        
        org.apache.commons.jxpath.ri.compiler.Step[] locationPathSteps = ((org.apache.commons.jxpath.ri.compiler.Step[]) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps"));
        Step locationPathStepsSteps0 = ((Step) get(locationPathSteps, 0));
        org.apache.commons.jxpath.ri.compiler.Expression[] locationPathStepsSteps0Steps0Predicates = ((org.apache.commons.jxpath.ri.compiler.Expression[]) getFieldValue(locationPathStepsSteps0, "org.apache.commons.jxpath.ri.compiler.Step", "predicates"));
        Expression locationPathStepsSteps0Steps0PredicatesSteps0Predicates2 = ((Expression) get(locationPathStepsSteps0Steps0Predicates, 2));
        Expression locationPathStepsSteps0Steps0PredicatesSteps0Predicates2Steps0Predicates2Expression = ((Expression) getFieldValue(locationPathStepsSteps0Steps0PredicatesSteps0Predicates2, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression"));
        boolean finalLocationPathSteps0Predicates2ExpressionContextDependencyKnown = ((Boolean) getFieldValue(locationPathStepsSteps0Steps0PredicatesSteps0Predicates2Steps0Predicates2Expression, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        org.apache.commons.jxpath.ri.compiler.Step[] locationPathSteps1 = ((org.apache.commons.jxpath.ri.compiler.Step[]) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps"));
        Step locationPathSteps1Steps0 = ((Step) get(locationPathSteps1, 0));
        org.apache.commons.jxpath.ri.compiler.Expression[] locationPathSteps1Steps0Steps0Predicates = ((org.apache.commons.jxpath.ri.compiler.Expression[]) getFieldValue(locationPathSteps1Steps0, "org.apache.commons.jxpath.ri.compiler.Step", "predicates"));
        Expression locationPathSteps1Steps0Steps0PredicatesSteps0Predicates2 = ((Expression) get(locationPathSteps1Steps0Steps0Predicates, 2));
        boolean finalLocationPathSteps0Predicates2ContextDependencyKnown = ((Boolean) getFieldValue(locationPathSteps1Steps0Steps0PredicatesSteps0Predicates2, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        boolean finalLocationPathContextDependencyKnown = ((Boolean) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalLocationPathSteps0Predicates2ExpressionContextDependencyKnown);
        
        assertTrue(finalLocationPathSteps0Predicates2ContextDependencyKnown);
        
        assertTrue(finalLocationPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent6() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[0] = ((Expression) variableReference);
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[1] = ((Expression) constant);
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        ExtensionFunction expression = ((ExtensionFunction) createInstance("org.apache.commons.jxpath.ri.compiler.ExtensionFunction"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        predicates[2] = ((Expression) expressionPath);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = locationPath.isContextDependent();
        
        assertTrue(actual);
        
        org.apache.commons.jxpath.ri.compiler.Step[] locationPathSteps = ((org.apache.commons.jxpath.ri.compiler.Step[]) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps"));
        Step locationPathStepsSteps0 = ((Step) get(locationPathSteps, 0));
        org.apache.commons.jxpath.ri.compiler.Expression[] locationPathStepsSteps0Steps0Predicates = ((org.apache.commons.jxpath.ri.compiler.Expression[]) getFieldValue(locationPathStepsSteps0, "org.apache.commons.jxpath.ri.compiler.Step", "predicates"));
        Expression locationPathStepsSteps0Steps0PredicatesSteps0Predicates2 = ((Expression) get(locationPathStepsSteps0Steps0Predicates, 2));
        Expression locationPathStepsSteps0Steps0PredicatesSteps0Predicates2Steps0Predicates2Expression = ((Expression) getFieldValue(locationPathStepsSteps0Steps0PredicatesSteps0Predicates2, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression"));
        boolean finalLocationPathSteps0Predicates2ExpressionContextDependencyKnown = ((Boolean) getFieldValue(locationPathStepsSteps0Steps0PredicatesSteps0Predicates2Steps0Predicates2Expression, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        org.apache.commons.jxpath.ri.compiler.Step[] locationPathSteps1 = ((org.apache.commons.jxpath.ri.compiler.Step[]) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps"));
        Step locationPathSteps1Steps0 = ((Step) get(locationPathSteps1, 0));
        org.apache.commons.jxpath.ri.compiler.Expression[] locationPathSteps1Steps0Steps0Predicates = ((org.apache.commons.jxpath.ri.compiler.Expression[]) getFieldValue(locationPathSteps1Steps0, "org.apache.commons.jxpath.ri.compiler.Step", "predicates"));
        Expression locationPathSteps1Steps0Steps0PredicatesSteps0Predicates2 = ((Expression) get(locationPathSteps1Steps0Steps0Predicates, 2));
        boolean finalLocationPathSteps0Predicates2ContextDependencyKnown = ((Boolean) getFieldValue(locationPathSteps1Steps0Steps0PredicatesSteps0Predicates2, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        boolean finalLocationPathContextDependencyKnown = ((Boolean) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalLocationPathSteps0Predicates2ExpressionContextDependencyKnown);
        
        assertTrue(finalLocationPathSteps0Predicates2ContextDependencyKnown);
        
        assertTrue(finalLocationPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent7() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[2];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        steps[0] = step;
        Step step1 = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath1 = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        predicates[0] = ((Expression) locationPath1);
        setField(step1, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[1] = step1;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = locationPath.isContextDependent();
        
        assertTrue(actual);
        
        boolean finalLocationPathContextDependencyKnown = ((Boolean) getFieldValue(locationPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalLocationPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent8() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        LocationPath expression = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        
        boolean actual = expressionPath.isContextDependent();
        
        assertTrue(actual);
        
        boolean finalExpressionPathContextDependencyKnown = ((Boolean) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalExpressionPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent9() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        Constant expression = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = ((CoreOperationLessThanOrEqual) createInstance("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual"));
        predicates[0] = ((Expression) coreOperationLessThanOrEqual);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        
        boolean actual = expressionPath.isContextDependent();
        
        assertFalse(actual);
        
        boolean finalExpressionPathContextDependencyKnown = ((Boolean) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalExpressionPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent10() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        VariableReference expression = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[0] = ((Expression) constant);
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[1] = ((Expression) variableReference);
        CoreOperationSubtract coreOperationSubtract = ((CoreOperationSubtract) createInstance("org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract"));
        predicates[2] = ((Expression) coreOperationSubtract);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        
        boolean actual = expressionPath.isContextDependent();
        
        assertFalse(actual);
        
        boolean finalExpressionPathContextDependencyKnown = ((Boolean) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalExpressionPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent11() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        Constant expression = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[0] = ((Expression) constant);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        predicates1[0] = ((Expression) constant);
        CoreFunction coreFunction = ((CoreFunction) createInstance("org.apache.commons.jxpath.ri.compiler.CoreFunction"));
        predicates1[1] = ((Expression) coreFunction);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[0] = step;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = expressionPath.isContextDependent();
        
        assertFalse(actual);
        
        org.apache.commons.jxpath.ri.compiler.Step[] expressionPathSteps = ((org.apache.commons.jxpath.ri.compiler.Step[]) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps"));
        Step expressionPathStepsSteps0 = ((Step) get(expressionPathSteps, 0));
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionPathStepsSteps0Steps0Predicates = ((org.apache.commons.jxpath.ri.compiler.Expression[]) getFieldValue(expressionPathStepsSteps0, "org.apache.commons.jxpath.ri.compiler.Step", "predicates"));
        Expression expressionPathStepsSteps0Steps0PredicatesSteps0Predicates1 = ((Expression) get(expressionPathStepsSteps0Steps0Predicates, 1));
        boolean finalExpressionPathSteps0Predicates1ContextDependencyKnown = ((Boolean) getFieldValue(expressionPathStepsSteps0Steps0PredicatesSteps0Predicates1, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        boolean finalExpressionPathContextDependencyKnown = ((Boolean) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalExpressionPathSteps0Predicates1ContextDependencyKnown);
        
        assertTrue(finalExpressionPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent12() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        Constant expression = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[0] = ((Expression) constant);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        predicates1[0] = ((Expression) constant);
        ExtensionFunction extensionFunction = ((ExtensionFunction) createInstance("org.apache.commons.jxpath.ri.compiler.ExtensionFunction"));
        predicates1[1] = ((Expression) extensionFunction);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[0] = step;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = expressionPath.isContextDependent();
        
        assertTrue(actual);
        
        org.apache.commons.jxpath.ri.compiler.Step[] expressionPathSteps = ((org.apache.commons.jxpath.ri.compiler.Step[]) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps"));
        Step expressionPathStepsSteps0 = ((Step) get(expressionPathSteps, 0));
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionPathStepsSteps0Steps0Predicates = ((org.apache.commons.jxpath.ri.compiler.Expression[]) getFieldValue(expressionPathStepsSteps0, "org.apache.commons.jxpath.ri.compiler.Step", "predicates"));
        Expression expressionPathStepsSteps0Steps0PredicatesSteps0Predicates1 = ((Expression) get(expressionPathStepsSteps0Steps0Predicates, 1));
        boolean finalExpressionPathSteps0Predicates1ContextDependencyKnown = ((Boolean) getFieldValue(expressionPathStepsSteps0Steps0PredicatesSteps0Predicates1, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        boolean finalExpressionPathContextDependencyKnown = ((Boolean) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalExpressionPathSteps0Predicates1ContextDependencyKnown);
        
        assertTrue(finalExpressionPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent13() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        Constant expression = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        predicates[0] = ((Expression) expression);
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[1] = ((Expression) variableReference);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[2];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        steps[0] = step;
        Step step1 = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        predicates1[0] = ((Expression) locationPath);
        setField(step1, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[1] = step1;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = expressionPath.isContextDependent();
        
        assertTrue(actual);
        
        boolean finalExpressionPathContextDependencyKnown = ((Boolean) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalExpressionPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent14() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        VariableReference expression = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = {};
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[2];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        steps[0] = step;
        Step step1 = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates1[0] = ((Expression) variableReference);
        CoreOperationAdd coreOperationAdd = ((CoreOperationAdd) createInstance("org.apache.commons.jxpath.ri.compiler.CoreOperationAdd"));
        predicates1[1] = ((Expression) coreOperationAdd);
        setField(step1, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[1] = step1;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = expressionPath.isContextDependent();
        
        assertFalse(actual);
        
        boolean finalExpressionPathContextDependencyKnown = ((Boolean) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalExpressionPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent15() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        Constant expression = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[0] = ((Expression) variableReference);
        CoreOperationDivide coreOperationDivide = ((CoreOperationDivide) createInstance("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide"));
        predicates[1] = ((Expression) coreOperationDivide);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = expressionPath.isContextDependent();
        
        assertFalse(actual);
        
        boolean finalExpressionPathContextDependencyKnown = ((Boolean) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalExpressionPathContextDependencyKnown);
    }
    
    @Test
    public void testIsContextDependent16() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        VariableReference expression = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[2];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[0] = ((Expression) constant);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        Step step1 = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        predicates1[0] = ((Expression) locationPath);
        setField(step1, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[1] = step1;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        boolean actual = expressionPath.isContextDependent();
        
        assertTrue(actual);
        
        boolean finalExpressionPathContextDependencyKnown = ((Boolean) getFieldValue(expressionPath, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown"));
        
        assertTrue(finalExpressionPathContextDependencyKnown);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isContextDependent()
    
    @Test(expected = StackOverflowError.class)
    public void testIsContextDependent17() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        Constant expression = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = {};
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        predicates1[0] = ((Expression) expressionPath);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[0] = step;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        expressionPath.isContextDependent();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsContextDependent18() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        Constant expression = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[0] = ((Expression) variableReference);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[9];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[9];
        VariableReference variableReference1 = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates1[0] = ((Expression) variableReference1);
        predicates1[1] = ((Expression) expressionPath);
        predicates1[2] = ((Expression) expressionPath);
        predicates1[3] = ((Expression) expressionPath);
        predicates1[4] = ((Expression) expressionPath);
        predicates1[5] = ((Expression) expressionPath);
        predicates1[6] = ((Expression) expressionPath);
        predicates1[7] = ((Expression) expressionPath);
        predicates1[8] = ((Expression) expressionPath);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[0] = step;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        expressionPath.isContextDependent();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsContextDependent19() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        Constant expression = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[0] = ((Expression) constant);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[10];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        steps[0] = step;
        Step step1 = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[13];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates1[0] = ((Expression) variableReference);
        predicates1[1] = ((Expression) variableReference);
        predicates1[2] = ((Expression) expressionPath);
        predicates1[3] = ((Expression) expressionPath);
        predicates1[4] = ((Expression) expressionPath);
        predicates1[5] = ((Expression) expressionPath);
        predicates1[6] = ((Expression) expressionPath);
        predicates1[7] = ((Expression) expressionPath);
        predicates1[8] = ((Expression) expressionPath);
        predicates1[9] = ((Expression) expressionPath);
        predicates1[10] = ((Expression) expressionPath);
        predicates1[11] = ((Expression) expressionPath);
        predicates1[12] = ((Expression) expressionPath);
        setField(step1, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[1] = step1;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        expressionPath.isContextDependent();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsContextDependent20() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        VariableReference expression = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = {};
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        predicates1[0] = ((Expression) expressionPath);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[0] = step;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        expressionPath.isContextDependent();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsContextDependent21() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        VariableReference expression = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[0] = ((Expression) constant);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[9];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[9];
        Constant constant1 = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates1[0] = ((Expression) constant1);
        predicates1[1] = ((Expression) expressionPath);
        predicates1[2] = ((Expression) expressionPath);
        predicates1[3] = ((Expression) expressionPath);
        predicates1[4] = ((Expression) expressionPath);
        predicates1[5] = ((Expression) expressionPath);
        predicates1[6] = ((Expression) expressionPath);
        predicates1[7] = ((Expression) expressionPath);
        predicates1[8] = ((Expression) expressionPath);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[0] = step;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        expressionPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent22() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[0] = ((Expression) variableReference);
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[1] = ((Expression) constant);
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        ExtensionFunction expression = ((ExtensionFunction) createInstance("org.apache.commons.jxpath.ri.compiler.ExtensionFunction"));
        setField(expression, "org.apache.commons.jxpath.ri.compiler.Expression", "contextDependencyKnown", true);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        ExpressionPath expressionPath1 = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        predicates1[0] = ((Expression) expressionPath1);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates1);
        predicates[2] = ((Expression) expressionPath);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:71)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:76)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54)
            org.apache.commons.jxpath.ri.compiler.Step.isContextDependent(Step.java:51)
            org.apache.commons.jxpath.ri.compiler.Path.computeContextDependent(Path.java:58)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeContextDependent(LocationPath.java:44)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54) */
        locationPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent23() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[9];
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[0] = ((Expression) constant);
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[1] = ((Expression) variableReference);
        predicates[2] = ((Expression) variableReference);
        predicates[3] = ((Expression) variableReference);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Step.isContextDependent(Step.java:51)
            org.apache.commons.jxpath.ri.compiler.Path.computeContextDependent(Path.java:58)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeContextDependent(LocationPath.java:44)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54) */
        locationPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent24() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[0] = ((Expression) variableReference);
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[1] = ((Expression) constant);
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", constant);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        ExpressionPath expressionPath1 = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        predicates1[0] = ((Expression) expressionPath1);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates1);
        predicates[2] = ((Expression) expressionPath);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:71)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:76)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54)
            org.apache.commons.jxpath.ri.compiler.Step.isContextDependent(Step.java:51)
            org.apache.commons.jxpath.ri.compiler.Path.computeContextDependent(Path.java:58)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeContextDependent(LocationPath.java:44)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54) */
        locationPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent25() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[2];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = {};
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        Step step1 = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates1[0] = ((Expression) constant);
        predicates1[1] = ((Expression) constant);
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        predicates1[2] = ((Expression) expressionPath);
        setField(step1, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[1] = step1;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException] */
        locationPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent26() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[2];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        steps[0] = step;
        Step step1 = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[9];
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[0] = ((Expression) constant);
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[1] = ((Expression) variableReference);
        predicates[2] = ((Expression) constant);
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        predicates[3] = ((Expression) expressionPath);
        setField(step1, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[1] = step1;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:71)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54)
            org.apache.commons.jxpath.ri.compiler.Step.isContextDependent(Step.java:51)
            org.apache.commons.jxpath.ri.compiler.Path.computeContextDependent(Path.java:58)
            org.apache.commons.jxpath.ri.compiler.LocationPath.computeContextDependent(LocationPath.java:44)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54) */
        locationPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent27() throws Exception  {
        LocationPath locationPath = ((LocationPath) createInstance("org.apache.commons.jxpath.ri.compiler.LocationPath"));
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.LocationPath", "absolute", true);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[2];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        steps[0] = step;
        Step step1 = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates[0] = ((Expression) constant);
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[1] = ((Expression) variableReference);
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        predicates[2] = ((Expression) expressionPath);
        setField(step1, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[1] = step1;
        setField(locationPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException] */
        locationPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent28() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        Constant expression = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[0] = ((Expression) variableReference);
        ExpressionPath expressionPath1 = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        predicates[1] = ((Expression) expressionPath1);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:71)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:76)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54) */
        expressionPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent29() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        VariableReference expression = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[2];
        predicates[0] = ((Expression) expression);
        ExpressionPath expressionPath1 = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        predicates[1] = ((Expression) expressionPath1);
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:71)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:76)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54) */
        expressionPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent30() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        VariableReference expression = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = {};
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "predicates", predicates);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates1 = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        predicates1[0] = ((Expression) expression);
        Constant constant = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        predicates1[1] = ((Expression) constant);
        ExpressionPath expressionPath1 = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        predicates1[2] = ((Expression) expressionPath1);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates1);
        steps[0] = step;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException] */
        expressionPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent31() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        Constant expression = ((Constant) createInstance("org.apache.commons.jxpath.ri.compiler.Constant"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[3];
        predicates[0] = ((Expression) expression);
        VariableReference variableReference = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        predicates[1] = ((Expression) variableReference);
        ExpressionPath expressionPath1 = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        predicates[2] = ((Expression) expressionPath1);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException] */
        expressionPath.isContextDependent();
    }
    
    @Test
    public void testIsContextDependent32() throws Exception  {
        ExpressionPath expressionPath = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        VariableReference expression = ((VariableReference) createInstance("org.apache.commons.jxpath.ri.compiler.VariableReference"));
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.ExpressionPath", "expression", expression);
        org.apache.commons.jxpath.ri.compiler.Step[] steps = new org.apache.commons.jxpath.ri.compiler.Step[1];
        Step step = ((Step) createInstance("org.apache.commons.jxpath.ri.compiler.Step"));
        org.apache.commons.jxpath.ri.compiler.Expression[] predicates = new org.apache.commons.jxpath.ri.compiler.Expression[1];
        ExpressionPath expressionPath1 = ((ExpressionPath) createInstance("org.apache.commons.jxpath.ri.compiler.ExpressionPath"));
        predicates[0] = ((Expression) expressionPath1);
        setField(step, "org.apache.commons.jxpath.ri.compiler.Step", "predicates", predicates);
        steps[0] = step;
        setField(expressionPath, "org.apache.commons.jxpath.ri.compiler.Path", "steps", steps);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:71)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54)
            org.apache.commons.jxpath.ri.compiler.Step.isContextDependent(Step.java:51)
            org.apache.commons.jxpath.ri.compiler.Path.computeContextDependent(Path.java:58)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.computeContextDependent(ExpressionPath.java:81)
            org.apache.commons.jxpath.ri.compiler.Expression.isContextDependent(Expression.java:54) */
        expressionPath.isContextDependent();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iteratePointers(org.apache.commons.jxpath.ri.EvalContext)
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iteratePointers(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object result = compute(context);
 *  */
    @Test
    public void testIteratePointers_ThrowClassCastException() throws Exception  {
        LocationPath locationPath = new LocationPath(true, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:65)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        locationPath.iteratePointers(rootContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iteratePointers(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object result = compute(context);
 *  */
    @Test
    public void testIteratePointers_ThrowClassCastException_3() throws Exception  {
        LocationPath locationPath = new LocationPath(true, null);
        AncestorContext ancestorContext = ((AncestorContext) createInstance("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(ancestorContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:65)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        locationPath.iteratePointers(ancestorContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iteratePointers(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object result = compute(context);
 *  */
    @Test
    public void testIteratePointers_ThrowClassCastException_4() throws Exception  {
        LocationPath locationPath = new LocationPath(true, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object rootPointer = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        AncestorContext ancestorContext = new AncestorContext(rootContext, false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer and org.apache.commons.jxpath.ri.model.NodePointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootPointer(JXPathContextReferenceImpl.java:607)
            org.apache.commons.jxpath.ri.JXPathContextReferenceImpl.getAbsoluteRootContext(JXPathContextReferenceImpl.java:617)
            org.apache.commons.jxpath.ri.axes.RootContext.getAbsoluteRootContext(RootContext.java:62)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:65)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        locationPath.iteratePointers(ancestorContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iteratePointers(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIteratePointers_ThrowClassCastException_1() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:51)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:44)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        expressionPath.iteratePointers(unionContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iteratePointers(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIteratePointers_ThrowIndexOutOfBoundsException() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        expressionPath.iteratePointers(nodeSetContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iteratePointers(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIteratePointers_ThrowClassCastException_2() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        Object object = createInstance("java.lang.Object");
        readOnlyPointers.add(object);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.ri.model.NodePointer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:48)
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        expressionPath.iteratePointers(nodeSetContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iteratePointers(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testIteratePointers_ThrowNullPointerException_1() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        AncestorContext ancestorContext = ((AncestorContext) createInstance("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        BeanPointer currentNodePointer = ((BeanPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPointer"));
        setField(ancestorContext, "org.apache.commons.jxpath.ri.axes.AncestorContext", "currentNodePointer", currentNodePointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:220)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:70)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        expressionPath.iteratePointers(ancestorContext);
    }
    
    /**
    @utbot.classUnderTest {@link Expression}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.compiler.Expression#iteratePointers(org.apache.commons.jxpath.ri.EvalContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testIteratePointers_ThrowNullPointerException() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        readOnlyPointers.add(dynaBeanPropertyPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:220)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:70)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        expressionPath.iteratePointers(nodeSetContext);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method iteratePointers(org.apache.commons.jxpath.ri.EvalContext)
    
    @Test
    public void testIteratePointers1() throws Exception  {
        LocationPath locationPath = new LocationPath(true, null);
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        NullPointer rootPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        AncestorContext ancestorContext = new AncestorContext(rootContext, false, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:220)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:70)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        locationPath.iteratePointers(ancestorContext);
    }
    
    @Test
    public void testIteratePointers2() throws Exception  {
        LocationPath locationPath = new LocationPath(true, null);
        AncestorContext ancestorContext = ((AncestorContext) createInstance("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        RootContext rootContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        JXPathContextReferenceImpl jxpathContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        NullPointer rootPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "rootPointer", rootPointer);
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(jxpathContext, "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", "namespaceResolver", namespaceResolver);
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jxpathContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        setField(rootContext, "org.apache.commons.jxpath.ri.axes.RootContext", "jxpathContext", jxpathContext);
        setField(ancestorContext, "org.apache.commons.jxpath.ri.EvalContext", "rootContext", rootContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.compiler.Path.evalSteps(Path.java:220)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:70)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        locationPath.iteratePointers(ancestorContext);
    }
    
    @Test
    public void testIteratePointers3() throws Exception  {
        LocationPath locationPath = new LocationPath(false, null);
        ExpressionPath expressionPath = new ExpressionPath(locationPath, null, null);
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(unionContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.InitialContext.<init>(InitialContext.java:40)
            org.apache.commons.jxpath.ri.compiler.LocationPath.compute(LocationPath.java:68)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.expressionPath(ExpressionPath.java:141)
            org.apache.commons.jxpath.ri.compiler.ExpressionPath.compute(ExpressionPath.java:127)
            org.apache.commons.jxpath.ri.compiler.Expression.iteratePointers(Expression.java:81) */
        expressionPath.iteratePointers(unionContext);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1043365076942200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1043365076942200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1043365076961600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043365076942200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043365076961600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1043365080712000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043365080712000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043365080720700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043365080712000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043365080720700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


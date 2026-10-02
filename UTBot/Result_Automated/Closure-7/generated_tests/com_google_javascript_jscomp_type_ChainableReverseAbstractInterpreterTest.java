package com.google.javascript.jscomp.type;

import org.junit.Test;
import com.google.javascript.rhino.jstype.Visitor;
import java.util.Map;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.JSType;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.List;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.TemplateType;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_jscomp_type_ChainableReverseAbstractInterpreterTest {
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#append(com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(lastLink.nextLink == null);): True}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.returnsFrom {@code return lastLink;}
 *  */
    @Test
    public void testAppend_PreconditionsCheckArgument() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        ClosureReverseAbstractInterpreter actual = ((ClosureReverseAbstractInterpreter) closureReverseAbstractInterpreter.append(closureReverseAbstractInterpreter));
        
        Visitor actualRestrictToArrayVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "restrictToArrayVisitor"));
        assertNull(actualRestrictToArrayVisitor);
        
        Visitor actualRestrictToNotArrayVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "restrictToNotArrayVisitor"));
        assertNull(actualRestrictToNotArrayVisitor);
        
        Visitor actualRestrictToObjectVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "restrictToObjectVisitor"));
        assertNull(actualRestrictToObjectVisitor);
        
        Visitor actualRestrictToNotObjectVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "restrictToNotObjectVisitor"));
        assertNull(actualRestrictToNotObjectVisitor);
        
        Map actualRestricters = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "restricters"));
        assertNull(actualRestricters);
        
        CodingConvention actualConvention = actual.convention;
        assertNull(actualConvention);
        
        JSTypeRegistry actualTypeRegistry = actual.typeRegistry;
        assertNull(actualTypeRegistry);
        
        ChainableReverseAbstractInterpreter actualFirstLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actual, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink"));
        assertNull(actualFirstLink);
        
        ChainableReverseAbstractInterpreter closureReverseAbstractInterpreterNextLink = ((ChainableReverseAbstractInterpreter) getFieldValue(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink"));
        ChainableReverseAbstractInterpreter actualNextLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actual, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink"));
        assertTrue(deepEquals(closureReverseAbstractInterpreterNextLink, actualNextLink));
        assertTrue(deepEquals(closureReverseAbstractInterpreterNextLink, actualNextLink));
        assertTrue(deepEquals(closureReverseAbstractInterpreterNextLink, actualNextLink));
        assertTrue(deepEquals(closureReverseAbstractInterpreterNextLink, actualNextLink));
        assertTrue(deepEquals(closureReverseAbstractInterpreterNextLink, actualNextLink));
        assertTrue(deepEquals(closureReverseAbstractInterpreterNextLink, actualNextLink));
        assertTrue(deepEquals(closureReverseAbstractInterpreterNextLink, actualNextLink));
        assertTrue(deepEquals(closureReverseAbstractInterpreterNextLink, actualNextLink));
        assertTrue(deepEquals(closureReverseAbstractInterpreterNextLink, actualNextLink));
        Visitor actualNextLinkRestrictUndefinedVisitor = ((Visitor) getFieldValue(actualNextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        assertNull(actualNextLinkRestrictUndefinedVisitor);
        
        Visitor actualNextLinkRestrictNullVisitor = ((Visitor) getFieldValue(actualNextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        assertNull(actualNextLinkRestrictNullVisitor);
        
        assertTrue(deepEquals(closureReverseAbstractInterpreter, actual));
        assertTrue(deepEquals(closureReverseAbstractInterpreter, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#append(com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(lastLink.nextLink == null);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.append] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.append(ChainableReverseAbstractInterpreter.java:82) */
        closureReverseAbstractInterpreter.append(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#append(com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(lastLink.nextLink == null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(lastLink.nextLink == null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter nextLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        
        closureReverseAbstractInterpreter.append(closureReverseAbstractInterpreter);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getFirst
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFirst()
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getFirst()}
 * @utbot.returnsFrom {@code return firstLink;}
 *  */
    @Test
    public void testGetFirst_ReturnFirstLink() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        ChainableReverseAbstractInterpreter actual = closureReverseAbstractInterpreter.getFirst();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeIfRefinable(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getTypeIfRefinable(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 *  */
    @Test
    public void testGetTypeIfRefinable_ReturnNull() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getTypeIfRefinableMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getTypeIfRefinable", numberNodeType, flowScopeType);
        getTypeIfRefinableMethod.setAccessible(true);
        java.lang.Object[] getTypeIfRefinableMethodArguments = new java.lang.Object[2];
        getTypeIfRefinableMethodArguments[0] = numberNode;
        getTypeIfRefinableMethodArguments[1] = ((Object) null);
        JSType actual = ((JSType) getTypeIfRefinableMethod.invoke(closureReverseAbstractInterpreter, getTypeIfRefinableMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getTypeIfRefinable(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (qualifiedName == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 *  */
    @Test
    public void testGetTypeIfRefinable_QualifiedNameEqualsNull() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getTypeIfRefinableMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getTypeIfRefinable", numberNodeType, flowScopeType);
        getTypeIfRefinableMethod.setAccessible(true);
        java.lang.Object[] getTypeIfRefinableMethodArguments = new java.lang.Object[2];
        getTypeIfRefinableMethodArguments[0] = numberNode;
        getTypeIfRefinableMethodArguments[1] = ((Object) null);
        JSType actual = ((JSType) getTypeIfRefinableMethod.invoke(semanticReverseAbstractInterpreter, getTypeIfRefinableMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypeIfRefinable(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getTypeIfRefinable(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(node.getType())
 *  */
    @Test
    public void testGetTypeIfRefinable_ThrowNullPointerException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:120) */
        closureReverseAbstractInterpreter.getTypeIfRefinable(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getTypeIfRefinable(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> nameVar = scope.getSlot(node.getString());
 *  */
    @Test
    public void testGetTypeIfRefinable_ThrowNullPointerException_1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:122) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getTypeIfRefinableMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getTypeIfRefinable", stringNodeType, flowScopeType);
        getTypeIfRefinableMethod.setAccessible(true);
        java.lang.Object[] getTypeIfRefinableMethodArguments = new java.lang.Object[2];
        getTypeIfRefinableMethodArguments[0] = stringNode;
        getTypeIfRefinableMethodArguments[1] = ((Object) null);
        try {
            getTypeIfRefinableMethod.invoke(closureReverseAbstractInterpreter, getTypeIfRefinableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTypeIfRefinable(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getTypeIfRefinable(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: StaticSlot<JSType> nameVar = scope.getSlot(node.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetTypeIfRefinable_ThrowUnsupportedOperationException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Node node = new Node(38);
        
        closureReverseAbstractInterpreter.getTypeIfRefinable(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getTypeIfRefinable(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = node.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetTypeIfRefinable_ThrowUnsupportedOperationException_1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getTypeIfRefinableMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getTypeIfRefinable", numberNodeType, flowScopeType);
        getTypeIfRefinableMethod.setAccessible(true);
        java.lang.Object[] getTypeIfRefinableMethodArguments = new java.lang.Object[2];
        getTypeIfRefinableMethodArguments[0] = numberNode;
        getTypeIfRefinableMethodArguments[1] = ((Object) null);
        try {
            getTypeIfRefinableMethod.invoke(closureReverseAbstractInterpreter, getTypeIfRefinableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.declareNameInScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method declareNameInScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 *  */
    @Test
    public void testDeclareNameInScope_SwitchNodeGetTypeCasedefault() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(42);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNameInScopeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("declareNameInScope", flowScopeType, numberNodeType, jSTypeType);
        declareNameInScopeMethod.setAccessible(true);
        java.lang.Object[] declareNameInScopeMethodArguments = new java.lang.Object[3];
        declareNameInScopeMethodArguments[0] = ((Object) null);
        declareNameInScopeMethodArguments[1] = numberNode;
        declareNameInScopeMethodArguments[2] = ((Object) null);
        declareNameInScopeMethod.invoke(closureReverseAbstractInterpreter, declareNameInScopeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#inferSlotType(java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 *  */
    @Test
    public void testDeclareNameInScope_FlowScopeInferSlotType() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Object initialLinkedFlowScopeLastSlot = getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNameInScopeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("declareNameInScope", linkedFlowScopeType, stringNodeType, jSTypeType);
        declareNameInScopeMethod.setAccessible(true);
        java.lang.Object[] declareNameInScopeMethodArguments = new java.lang.Object[3];
        declareNameInScopeMethodArguments[0] = linkedFlowScope;
        declareNameInScopeMethodArguments[1] = stringNode;
        declareNameInScopeMethodArguments[2] = ((Object) null);
        declareNameInScopeMethod.invoke(closureReverseAbstractInterpreter, declareNameInScopeMethodArguments);
        
        int finalLinkedFlowScopeDepth = ((Integer) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        Object finalLinkedFlowScopeLastSlot = getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        
        assertFalse(initialLinkedFlowScopeLastSlot == finalLinkedFlowScopeLastSlot);
        
        assertEquals(1, finalLinkedFlowScopeDepth);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareNameInScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(node.getType())
 *  */
    @Test
    public void testDeclareNameInScope_ThrowNullPointerException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.declareNameInScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.declareNameInScope(ChainableReverseAbstractInterpreter.java:159) */
        closureReverseAbstractInterpreter.declareNameInScope(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.inferSlotType(node.getString(), type);
 *  */
    @Test
    public void testDeclareNameInScope_ThrowNullPointerException_1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.declareNameInScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.declareNameInScope(ChainableReverseAbstractInterpreter.java:161) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNameInScopeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("declareNameInScope", flowScopeType, stringNodeType, jSTypeType);
        declareNameInScopeMethod.setAccessible(true);
        java.lang.Object[] declareNameInScopeMethodArguments = new java.lang.Object[3];
        declareNameInScopeMethodArguments[0] = ((Object) null);
        declareNameInScopeMethodArguments[1] = stringNode;
        declareNameInScopeMethodArguments[2] = ((Object) null);
        try {
            declareNameInScopeMethod.invoke(closureReverseAbstractInterpreter, declareNameInScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNameInScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#toStringTree()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.activatesSwitch {@code switch(node.getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: node.toStringTree()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNameInScope_ThrowIllegalStateException() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNameInScopeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("declareNameInScope", flowScopeType, numberNodeType, jSTypeType);
        declareNameInScopeMethod.setAccessible(true);
        java.lang.Object[] declareNameInScopeMethodArguments = new java.lang.Object[3];
        declareNameInScopeMethodArguments[0] = ((Object) null);
        declareNameInScopeMethodArguments[1] = numberNode;
        declareNameInScopeMethodArguments[2] = ((Object) null);
        try {
            declareNameInScopeMethod.invoke(closureReverseAbstractInterpreter, declareNameInScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: scope.inferSlotType(node.getString(), type);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeclareNameInScope_ThrowUnsupportedOperationException() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNameInScopeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("declareNameInScope", flowScopeType, numberNodeType, jSTypeType);
        declareNameInScopeMethod.setAccessible(true);
        java.lang.Object[] declareNameInScopeMethodArguments = new java.lang.Object[3];
        declareNameInScopeMethodArguments[0] = ((Object) null);
        declareNameInScopeMethodArguments[1] = numberNode;
        declareNameInScopeMethodArguments[2] = ((Object) null);
        try {
            declareNameInScopeMethod.invoke(closureReverseAbstractInterpreter, declareNameInScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = node.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDeclareNameInScope_ThrowUnsupportedOperationException_1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNameInScopeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("declareNameInScope", flowScopeType, stringNodeType, jSTypeType);
        declareNameInScopeMethod.setAccessible(true);
        java.lang.Object[] declareNameInScopeMethodArguments = new java.lang.Object[3];
        declareNameInScopeMethodArguments[0] = ((Object) null);
        declareNameInScopeMethodArguments[1] = stringNode;
        declareNameInScopeMethodArguments[2] = ((Object) null);
        try {
            declareNameInScopeMethod.invoke(closureReverseAbstractInterpreter, declareNameInScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#inferSlotType(java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scope.inferSlotType(node.getString(), type);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNameInScope_ThrowIllegalStateException_1() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen", true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNameInScopeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("declareNameInScope", linkedFlowScopeType, stringNodeType, jSTypeType);
        declareNameInScopeMethod.setAccessible(true);
        java.lang.Object[] declareNameInScopeMethodArguments = new java.lang.Object[3];
        declareNameInScopeMethodArguments[0] = linkedFlowScope;
        declareNameInScopeMethodArguments[1] = stringNode;
        declareNameInScopeMethodArguments[2] = ((Object) null);
        try {
            declareNameInScopeMethod.invoke(closureReverseAbstractInterpreter, declareNameInScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(qualifiedName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testDeclareNameInScope_ThrowNullPointerException_2() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNameInScopeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("declareNameInScope", flowScopeType, stringNodeType, jSTypeType);
        declareNameInScopeMethod.setAccessible(true);
        java.lang.Object[] declareNameInScopeMethodArguments = new java.lang.Object[3];
        declareNameInScopeMethodArguments[0] = ((Object) null);
        declareNameInScopeMethodArguments[1] = stringNode;
        declareNameInScopeMethodArguments[2] = ((Object) null);
        try {
            declareNameInScopeMethod.invoke(closureReverseAbstractInterpreter, declareNameInScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(qualifiedName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testDeclareNameInScope_ThrowNullPointerException_3() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNameInScopeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("declareNameInScope", flowScopeType, numberNodeType, jSTypeType);
        declareNameInScopeMethod.setAccessible(true);
        java.lang.Object[] declareNameInScopeMethodArguments = new java.lang.Object[3];
        declareNameInScopeMethodArguments[0] = ((Object) null);
        declareNameInScopeMethodArguments[1] = numberNode;
        declareNameInScopeMethodArguments[2] = ((Object) null);
        try {
            declareNameInScopeMethod.invoke(semanticReverseAbstractInterpreter, declareNameInScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return typeRegistry.getNativeType(typeId);}
 *  */
    @Test
    public void testGetNativeType_JSTypeRegistryGetNativeType() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        JSType actual = semanticReverseAbstractInterpreter.getNativeType(jSTypeNative);
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return typeRegistry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687) */
        closureReverseAbstractInterpreter.getNativeType(jSTypeNative);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeRegistry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowNullPointerException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687) */
        closureReverseAbstractInterpreter.getNativeType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictUndefinedVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_TypeEqualsNull() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        JSType actual = closureReverseAbstractInterpreter.getRestrictedWithoutUndefined(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictUndefinedVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_TypeNotEqualsNull_2() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object restrictUndefinedVisitor = createInstance("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor");
        String value = "";
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "value", value);
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "resultEqualsValue", true);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        JSType actual = closureReverseAbstractInterpreter.getRestrictedWithoutUndefined(anonymousFunctionType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictUndefinedVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_TypeNotEqualsNull_6() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ModificationVisitor restrictUndefinedVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(restrictUndefinedVisitor, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry", registry);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        JSType actual = semanticReverseAbstractInterpreter.getRestrictedWithoutUndefined(unknownType);
        
        assertNull(actual);
        
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitorRestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitorRestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitorRestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes0 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitorRestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 0));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor1 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor1RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor1, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor1RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor1RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes1 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor1RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 1));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor2 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor2RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor2, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor2RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor2RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes2 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor2RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 2));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor3 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor3RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor3, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor3RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor3RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes3 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor3RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 3));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor4 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor4RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor4, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor4RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor4RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes4 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor4RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 4));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor5 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor5RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor5, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor5RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor5RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes5 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor5RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 5));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor6 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor6RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor6, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor6RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor6RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes6 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor6RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 6));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor7 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor7RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor7, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor7RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor7RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes7 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor7RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 7));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor8 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor8RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor8, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor8RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor8RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes8 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor8RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 8));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor9 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor9RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor9, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor9RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor9RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes9 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor9RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 9));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor10 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor10RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor10, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor10RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor10RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes10 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor10RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 10));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor11 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor11RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor11, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor11RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor11RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes11 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor11RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 11));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor12 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor12RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor12, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor12RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor12RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes12 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor12RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 12));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor13 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor13RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor13, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor13RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor13RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes13 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor13RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 13));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor14 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor14RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor14, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor14RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor14RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes14 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor14RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 14));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor15 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor15RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor15, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor15RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor15RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes15 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor15RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 15));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor16 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor16RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor16, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor16RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor16RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes16 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor16RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 16));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor17 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor17RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor17, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor17RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor17RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes17 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor17RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 17));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor18 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor18RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor18, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor18RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor18RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes18 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor18RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 18));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor19 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor19RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor19, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor19RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor19RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes19 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor19RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 19));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor20 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor20RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor20, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor20RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor20RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes20 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor20RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 20));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor21 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor21RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor21, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor21RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor21RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes21 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor21RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 21));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor22 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor22RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor22, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor22RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor22RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes22 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor22RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 22));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor23 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor23RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor23, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor23RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor23RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes23 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor23RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 23));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor24 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor24RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor24, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor24RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor24RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes24 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor24RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 24));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor25 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor25RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor25, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor25RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor25RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes25 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor25RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 25));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor26 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor26RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor26, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor26RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor26RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes26 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor26RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 26));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor27 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor27RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor27, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor27RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor27RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes27 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor27RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 27));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor28 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor28RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor28, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor28RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor28RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes28 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor28RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 28));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor29 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor29RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor29, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor29RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor29RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes29 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor29RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 29));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor30 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor30RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor30, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor30RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor30RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes30 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor30RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 30));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor31 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor31RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor31, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor31RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor31RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes31 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor31RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 31));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor32 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor32RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor32, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor32RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor32RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes32 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor32RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 32));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor33 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor33RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor33, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor33RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor33RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes33 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor33RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 33));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor34 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor34RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor34, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor34RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor34RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes34 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor34RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 34));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor35 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor35RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor35, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor35RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor35RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes35 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor35RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 35));
        Visitor semanticReverseAbstractInterpreterRestrictUndefinedVisitor36 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictUndefinedVisitor36RestrictUndefinedVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor36, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictUndefinedVisitor36RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictUndefinedVisitor36RestrictUndefinedVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes36 = ((JSType) get(semanticReverseAbstractInterpreterRestrictUndefinedVisitor36RestrictUndefinedVisitorRegistryRestrictUndefinedVisitorRegistryNativeTypes, 36));
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes0);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes1);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes2);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes3);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes4);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes5);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes6);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes7);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes8);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes9);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes10);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes11);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes12);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes13);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes14);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes15);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes16);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes17);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes18);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes19);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes20);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes21);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes22);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes23);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes24);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes25);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes26);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes27);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes28);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes29);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes30);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes31);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes32);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes33);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes34);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes35);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictUndefinedVisitorRegistryNativeTypes36);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictUndefinedVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_TypeNotEqualsNull() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        ModificationVisitor restrictUndefinedVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionType actual = ((FunctionType) closureReverseAbstractInterpreter.getRestrictedWithoutUndefined(anonymousFunctionType));
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertNull(actualPropAccess);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        ImmutableList actualTemplateTypeNames = actual.getTemplateTypeNames();
        assertNull(actualTemplateTypeNames);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertTrue(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = ((FunctionType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictUndefinedVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_TypeNotEqualsNull_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        ModificationVisitor restrictUndefinedVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = ((FunctionType) closureReverseAbstractInterpreter.getRestrictedWithoutUndefined(anonymousFunctionType));
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object anonymousFunctionTypeKind = getFieldValue(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(anonymousFunctionTypeKind, actualKind);
        
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertNull(actualPropAccess);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        ImmutableList actualTemplateTypeNames = actual.getTemplateTypeNames();
        assertNull(actualTemplateTypeNames);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = ((FunctionType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictUndefinedVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_TypeNotEqualsNull_3() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object restrictUndefinedVisitor = createInstance("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor");
        String value = "";
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "value", value);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getRestrictedWithoutUndefinedMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedWithoutUndefined", errorFunctionTypeType);
        getRestrictedWithoutUndefinedMethod.setAccessible(true);
        java.lang.Object[] getRestrictedWithoutUndefinedMethodArguments = new java.lang.Object[1];
        getRestrictedWithoutUndefinedMethodArguments[0] = errorFunctionType;
        Object actual = getRestrictedWithoutUndefinedMethod.invoke(closureReverseAbstractInterpreter, getRestrictedWithoutUndefinedMethodArguments);
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertNull(actualPropAccess);
        
        ObjectType actualTypeOfThis = (((FunctionType) actual)).getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = (((FunctionType) actual)).getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = (((FunctionType) actual)).getSubTypes();
        assertNull(actualSubTypes);
        
        ImmutableList actualTemplateTypeNames = (((FunctionType) actual)).getTemplateTypeNames();
        assertNull(actualTemplateTypeNames);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = ((FunctionType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictUndefinedVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_TypeNotEqualsNull_4() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object restrictUndefinedVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        UnknownType target = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        FunctionType actual = ((FunctionType) closureReverseAbstractInterpreter.getRestrictedWithoutUndefined(anonymousFunctionType));
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertNull(actualPropAccess);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        ImmutableList actualTemplateTypeNames = actual.getTemplateTypeNames();
        assertNull(actualTemplateTypeNames);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = ((FunctionType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictUndefinedVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_TypeNotEqualsNull_5() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object restrictUndefinedVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        ParameterizedType target = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        FunctionType actual = ((FunctionType) closureReverseAbstractInterpreter.getRestrictedWithoutUndefined(anonymousFunctionType));
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertNull(actualPropAccess);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        ImmutableList actualTemplateTypeNames = actual.getTemplateTypeNames();
        assertNull(actualTemplateTypeNames);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = ((FunctionType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ModificationVisitor restrictUndefinedVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(restrictUndefinedVisitor, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry", registry);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(ModificationVisitor.java:217)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:63)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined(ChainableReverseAbstractInterpreter.java:635) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getRestrictedWithoutUndefinedMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedWithoutUndefined", noResolvedTypeType);
        getRestrictedWithoutUndefinedMethod.setAccessible(true);
        java.lang.Object[] getRestrictedWithoutUndefinedMethodArguments = new java.lang.Object[1];
        getRestrictedWithoutUndefinedMethodArguments[0] = noResolvedType;
        try {
            getRestrictedWithoutUndefinedMethod.invoke(semanticReverseAbstractInterpreter, getRestrictedWithoutUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Visitor restrictUndefinedVisitor = ((Visitor) createInstance("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2"));
        SemanticReverseAbstractInterpreter this$0 = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(this$0, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2", "this$0", this$0);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2.caseNoType(ChainableReverseAbstractInterpreter.java:300)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2.caseNoType(ChainableReverseAbstractInterpreter.java:275)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined(ChainableReverseAbstractInterpreter.java:635) */
        semanticReverseAbstractInterpreter.getRestrictedWithoutUndefined(noType);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type.visit(restrictUndefinedVisitor)
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_ThrowNullPointerException() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ModificationVisitor restrictUndefinedVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(ModificationVisitor.java:217)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:63)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined(ChainableReverseAbstractInterpreter.java:635) */
        semanticReverseAbstractInterpreter.getRestrictedWithoutUndefined(noType);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_ThrowNullPointerException_2() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object restrictUndefinedVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.applyCommonRestriction(SemanticReverseAbstractInterpreter.java:541)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseObjectType(SemanticReverseAbstractInterpreter.java:527)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:537)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:503)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:1054)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined(ChainableReverseAbstractInterpreter.java:635) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getRestrictedWithoutUndefinedMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedWithoutUndefined", errorFunctionTypeType);
        getRestrictedWithoutUndefinedMethod.setAccessible(true);
        java.lang.Object[] getRestrictedWithoutUndefinedMethodArguments = new java.lang.Object[1];
        getRestrictedWithoutUndefinedMethodArguments[0] = errorFunctionType;
        try {
            getRestrictedWithoutUndefinedMethod.invoke(closureReverseAbstractInterpreter, getRestrictedWithoutUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type.visit(restrictUndefinedVisitor)
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_ThrowNullPointerException_3() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        ModificationVisitor restrictUndefinedVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(ModificationVisitor.java:217)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseUnknownType(ModificationVisitor.java:165)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseUnknownType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.UnknownType.visit(UnknownType.java:120)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined(ChainableReverseAbstractInterpreter.java:635) */
        closureReverseAbstractInterpreter.getRestrictedWithoutUndefined(unknownType);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetRestrictedWithoutUndefined_ThrowNullPointerException_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        ModificationVisitor restrictUndefinedVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object typeOfThis = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(ModificationVisitor.java:217)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:63)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(ModificationVisitor.java:100)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:1054)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined(ChainableReverseAbstractInterpreter.java:635) */
        closureReverseAbstractInterpreter.getRestrictedWithoutUndefined(functionType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictNullVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutNull_TypeEqualsNull() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        JSType actual = closureReverseAbstractInterpreter.getRestrictedWithoutNull(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictNullVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutNull_TypeNotEqualsNull_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object restrictNullVisitor = createInstance("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor");
        String value = "";
        setField(restrictNullVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "value", value);
        setField(restrictNullVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "resultEqualsValue", true);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        JSType actual = closureReverseAbstractInterpreter.getRestrictedWithoutNull(anonymousFunctionType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictNullVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutNull_TypeNotEqualsNull_5() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(restrictNullVisitor, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry", registry);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        JSType actual = semanticReverseAbstractInterpreter.getRestrictedWithoutNull(unknownType);
        
        assertNull(actual);
        
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitorRestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitorRestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitorRestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes0 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitorRestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 0));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor1 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor1RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor1, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor1RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor1RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes1 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor1RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 1));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor2 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor2RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor2, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor2RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor2RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes2 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor2RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 2));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor3 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor3RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor3, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor3RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor3RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes3 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor3RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 3));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor4 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor4RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor4, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor4RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor4RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes4 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor4RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 4));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor5 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor5RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor5, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor5RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor5RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes5 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor5RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 5));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor6 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor6RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor6, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor6RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor6RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes6 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor6RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 6));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor7 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor7RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor7, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor7RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor7RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes7 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor7RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 7));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor8 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor8RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor8, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor8RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor8RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes8 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor8RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 8));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor9 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor9RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor9, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor9RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor9RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes9 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor9RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 9));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor10 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor10RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor10, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor10RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor10RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes10 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor10RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 10));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor11 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor11RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor11, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor11RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor11RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes11 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor11RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 11));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor12 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor12RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor12, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor12RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor12RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes12 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor12RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 12));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor13 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor13RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor13, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor13RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor13RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes13 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor13RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 13));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor14 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor14RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor14, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor14RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor14RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes14 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor14RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 14));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor15 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor15RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor15, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor15RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor15RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes15 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor15RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 15));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor16 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor16RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor16, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor16RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor16RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes16 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor16RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 16));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor17 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor17RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor17, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor17RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor17RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes17 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor17RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 17));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor18 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor18RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor18, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor18RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor18RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes18 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor18RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 18));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor19 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor19RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor19, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor19RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor19RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes19 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor19RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 19));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor20 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor20RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor20, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor20RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor20RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes20 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor20RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 20));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor21 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor21RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor21, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor21RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor21RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes21 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor21RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 21));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor22 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor22RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor22, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor22RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor22RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes22 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor22RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 22));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor23 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor23RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor23, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor23RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor23RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes23 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor23RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 23));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor24 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor24RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor24, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor24RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor24RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes24 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor24RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 24));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor25 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor25RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor25, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor25RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor25RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes25 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor25RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 25));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor26 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor26RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor26, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor26RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor26RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes26 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor26RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 26));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor27 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor27RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor27, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor27RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor27RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes27 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor27RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 27));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor28 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor28RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor28, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor28RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor28RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes28 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor28RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 28));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor29 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor29RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor29, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor29RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor29RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes29 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor29RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 29));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor30 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor30RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor30, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor30RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor30RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes30 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor30RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 30));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor31 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor31RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor31, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor31RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor31RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes31 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor31RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 31));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor32 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor32RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor32, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor32RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor32RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes32 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor32RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 32));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor33 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor33RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor33, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor33RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor33RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes33 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor33RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 33));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor34 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor34RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor34, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor34RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor34RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes34 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor34RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 34));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor35 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor35RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor35, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor35RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor35RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes35 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor35RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 35));
        Visitor semanticReverseAbstractInterpreterRestrictNullVisitor36 = ((Visitor) getFieldValue(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        JSTypeRegistry semanticReverseAbstractInterpreterRestrictNullVisitor36RestrictNullVisitorRegistry = ((JSTypeRegistry) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor36, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry"));
        com.google.javascript.rhino.jstype.JSType[] semanticReverseAbstractInterpreterRestrictNullVisitor36RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(semanticReverseAbstractInterpreterRestrictNullVisitor36RestrictNullVisitorRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes36 = ((JSType) get(semanticReverseAbstractInterpreterRestrictNullVisitor36RestrictNullVisitorRegistryRestrictNullVisitorRegistryNativeTypes, 36));
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes0);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes1);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes2);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes3);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes4);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes5);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes6);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes7);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes8);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes9);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes10);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes11);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes12);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes13);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes14);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes15);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes16);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes17);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes18);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes19);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes20);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes21);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes22);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes23);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes24);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes25);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes26);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes27);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes28);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes29);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes30);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes31);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes32);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes33);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes34);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes35);
        
        assertNull(finalSemanticReverseAbstractInterpreterRestrictNullVisitorRegistryNativeTypes36);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictNullVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutNull_TypeNotEqualsNull() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionType actual = ((FunctionType) closureReverseAbstractInterpreter.getRestrictedWithoutNull(anonymousFunctionType));
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertNull(actualPropAccess);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        ImmutableList actualTemplateTypeNames = actual.getTemplateTypeNames();
        assertNull(actualTemplateTypeNames);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertTrue(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = ((FunctionType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictNullVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutNull_TypeNotEqualsNull_2() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object restrictNullVisitor = createInstance("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor");
        String value = "";
        setField(restrictNullVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "value", value);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getRestrictedWithoutNullMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedWithoutNull", errorFunctionTypeType);
        getRestrictedWithoutNullMethod.setAccessible(true);
        java.lang.Object[] getRestrictedWithoutNullMethodArguments = new java.lang.Object[1];
        getRestrictedWithoutNullMethodArguments[0] = errorFunctionType;
        Object actual = getRestrictedWithoutNullMethod.invoke(closureReverseAbstractInterpreter, getRestrictedWithoutNullMethodArguments);
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertNull(actualPropAccess);
        
        ObjectType actualTypeOfThis = (((FunctionType) actual)).getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = (((FunctionType) actual)).getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = (((FunctionType) actual)).getSubTypes();
        assertNull(actualSubTypes);
        
        ImmutableList actualTemplateTypeNames = (((FunctionType) actual)).getTemplateTypeNames();
        assertNull(actualTemplateTypeNames);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = ((FunctionType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictNullVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutNull_TypeNotEqualsNull_3() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object restrictNullVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        UnknownType target = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(restrictNullVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        FunctionType actual = ((FunctionType) closureReverseAbstractInterpreter.getRestrictedWithoutNull(anonymousFunctionType));
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertNull(actualPropAccess);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        ImmutableList actualTemplateTypeNames = actual.getTemplateTypeNames();
        assertNull(actualTemplateTypeNames);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = ((FunctionType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictNullVisitor);}
 *  */
    @Test
    public void testGetRestrictedWithoutNull_TypeNotEqualsNull_4() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object restrictNullVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        ParameterizedType target = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(restrictNullVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        FunctionType actual = ((FunctionType) closureReverseAbstractInterpreter.getRestrictedWithoutNull(anonymousFunctionType));
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertNull(actualPropAccess);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        ImmutableList actualTemplateTypeNames = actual.getTemplateTypeNames();
        assertNull(actualTemplateTypeNames);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = ((FunctionType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRestrictedWithoutNull_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(restrictNullVisitor, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry", registry);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(ModificationVisitor.java:217)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:63)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:642) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getRestrictedWithoutNullMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedWithoutNull", noResolvedTypeType);
        getRestrictedWithoutNullMethod.setAccessible(true);
        java.lang.Object[] getRestrictedWithoutNullMethodArguments = new java.lang.Object[1];
        getRestrictedWithoutNullMethodArguments[0] = noResolvedType;
        try {
            getRestrictedWithoutNullMethod.invoke(semanticReverseAbstractInterpreter, getRestrictedWithoutNullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRestrictedWithoutNull_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Visitor restrictNullVisitor = ((Visitor) createInstance("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2"));
        SemanticReverseAbstractInterpreter this$0 = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(this$0, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        setField(restrictNullVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2", "this$0", this$0);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2.caseNoType(ChainableReverseAbstractInterpreter.java:300)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2.caseNoType(ChainableReverseAbstractInterpreter.java:275)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:642) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getRestrictedWithoutNullMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedWithoutNull", noResolvedTypeType);
        getRestrictedWithoutNullMethod.setAccessible(true);
        java.lang.Object[] getRestrictedWithoutNullMethodArguments = new java.lang.Object[1];
        getRestrictedWithoutNullMethodArguments[0] = noResolvedType;
        try {
            getRestrictedWithoutNullMethod.invoke(semanticReverseAbstractInterpreter, getRestrictedWithoutNullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return type == null ? null : type.visit(restrictNullVisitor);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return type == null ? null : type.visit(restrictNullVisitor);
 *  */
    @Test
    public void testGetRestrictedWithoutNull_ThrowNullPointerException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:1087)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(ModificationVisitor.java:99)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:1054)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:642) */
        closureReverseAbstractInterpreter.getRestrictedWithoutNull(anonymousFunctionType);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type.visit(restrictNullVisitor)
 *  */
    @Test
    public void testGetRestrictedWithoutNull_ThrowNullPointerException_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(ModificationVisitor.java:217)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:63)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:642) */
        semanticReverseAbstractInterpreter.getRestrictedWithoutNull(noType);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetRestrictedWithoutNull_ThrowNullPointerException_3() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object restrictNullVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.applyCommonRestriction(SemanticReverseAbstractInterpreter.java:541)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseObjectType(SemanticReverseAbstractInterpreter.java:527)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:537)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:503)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:1054)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:642) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getRestrictedWithoutNullMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedWithoutNull", errorFunctionTypeType);
        getRestrictedWithoutNullMethod.setAccessible(true);
        java.lang.Object[] getRestrictedWithoutNullMethodArguments = new java.lang.Object[1];
        getRestrictedWithoutNullMethodArguments[0] = errorFunctionType;
        try {
            getRestrictedWithoutNullMethod.invoke(closureReverseAbstractInterpreter, getRestrictedWithoutNullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type.visit(restrictNullVisitor)
 *  */
    @Test
    public void testGetRestrictedWithoutNull_ThrowNullPointerException_4() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(ModificationVisitor.java:217)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseUnknownType(ModificationVisitor.java:165)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseUnknownType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.UnknownType.visit(UnknownType.java:120)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:642) */
        closureReverseAbstractInterpreter.getRestrictedWithoutNull(unknownType);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedWithoutNull(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetRestrictedWithoutNull_ThrowNullPointerException_2() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object typeOfThis = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(ModificationVisitor.java:217)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:63)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(ModificationVisitor.java:100)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:1054)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:642) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getRestrictedWithoutNullMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedWithoutNull", errorFunctionTypeType);
        getRestrictedWithoutNullMethod.setAccessible(true);
        java.lang.Object[] getRestrictedWithoutNullMethodArguments = new java.lang.Object[1];
        getRestrictedWithoutNullMethodArguments[0] = errorFunctionType;
        try {
            getRestrictedWithoutNullMethod.invoke(closureReverseAbstractInterpreter, getRestrictedWithoutNullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type.visit(new RestrictByOneTypeOfResultVisitor(value, resultEqualsValue));}
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_TypeNotEqualsNull() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method getRestrictedByTypeOfResultMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedByTypeOfResult", errorFunctionTypeType, stringType, booleanType);
        getRestrictedByTypeOfResultMethod.setAccessible(true);
        java.lang.Object[] getRestrictedByTypeOfResultMethodArguments = new java.lang.Object[3];
        getRestrictedByTypeOfResultMethodArguments[0] = errorFunctionType;
        getRestrictedByTypeOfResultMethodArguments[1] = ((Object) null);
        getRestrictedByTypeOfResultMethodArguments[2] = true;
        JSType actual = ((JSType) getRestrictedByTypeOfResultMethod.invoke(closureReverseAbstractInterpreter, getRestrictedByTypeOfResultMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.executesCondition {@code (resultEqualsValue): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_NotResultEqualsValue() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        JSType actual = closureReverseAbstractInterpreter.getRestrictedByTypeOfResult(null, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type.visit(new RestrictByOneTypeOfResultVisitor(value, resultEqualsValue));}
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_TypeNotEqualsNull_2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method getRestrictedByTypeOfResultMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedByTypeOfResult", unresolvedTypeExpressionType, stringType, booleanType);
        getRestrictedByTypeOfResultMethod.setAccessible(true);
        java.lang.Object[] getRestrictedByTypeOfResultMethodArguments = new java.lang.Object[3];
        getRestrictedByTypeOfResultMethodArguments[0] = unresolvedTypeExpression;
        getRestrictedByTypeOfResultMethodArguments[1] = ((Object) null);
        getRestrictedByTypeOfResultMethodArguments[2] = false;
        JSType actual = ((JSType) getRestrictedByTypeOfResultMethod.invoke(semanticReverseAbstractInterpreter, getRestrictedByTypeOfResultMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13TypeRegistryNativeTypes, 13));
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.executesCondition {@code (resultEqualsValue): True}
 * @utbot.returnsFrom {@code return result == null ? getNativeType(CHECKED_UNKNOWN_TYPE) : result;}
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ResultEqualsValue_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[30];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "number";
        
        JSType actual = semanticReverseAbstractInterpreter.getRestrictedByTypeOfResult(null, string, true);
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry25 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry jSTypeRegistry26 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes26 = ((JSType) get(jSTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry jSTypeRegistry27 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes27 = ((JSType) get(jSTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry jSTypeRegistry28 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes28 = ((JSType) get(jSTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry jSTypeRegistry29 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes29 = ((JSType) get(jSTypeRegistry29TypeRegistryNativeTypes, 29));
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes14);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes15);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes16);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes17);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes18);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes19);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes20);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes21);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes22);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes23);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes24);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes25);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes26);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes27);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes28);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes29);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.executesCondition {@code (resultEqualsValue): True}
 * @utbot.returnsFrom {@code return result == null ? getNativeType(CHECKED_UNKNOWN_TYPE) : result;}
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ResultEqualsValue_3() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "@";
        
        JSType actual = closureReverseAbstractInterpreter.getRestrictedByTypeOfResult(null, string, true);
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13TypeRegistryNativeTypes, 13));
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes1);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes2);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes3);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes4);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes5);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes6);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes7);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes8);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes9);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes10);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes11);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes12);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes13);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.executesCondition {@code (resultEqualsValue): True}
 * @utbot.returnsFrom {@code return result == null ? getNativeType(CHECKED_UNKNOWN_TYPE) : result;}
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ResultEqualsValue() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        nativeTypes[16] = ((JSType) parameterizedType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "number";
        
        ParameterizedType actual = ((ParameterizedType) semanticReverseAbstractInterpreter.getRestrictedByTypeOfResult(null, string, true));
        
        JSType actualParameterType = actual.getParameterType();
        assertNull(actualParameterType);
        
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
        JSTypeRegistry jSTypeRegistry = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry16TypeRegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry17 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry17TypeRegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry18 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry18TypeRegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry19 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry19TypeRegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry20 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry20TypeRegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry21 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry21TypeRegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry22 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry22TypeRegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry23 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry23TypeRegistryNativeTypes, 24));
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes14);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes15);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes17);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes18);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes19);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes20);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes21);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes22);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes23);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes24);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.executesCondition {@code (resultEqualsValue): True}
 * @utbot.returnsFrom {@code return result == null ? getNativeType(CHECKED_UNKNOWN_TYPE) : result;}
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ResultEqualsValue_2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        nativeTypes[2] = ((JSType) parameterizedType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "boolean";
        
        ParameterizedType actual = ((ParameterizedType) semanticReverseAbstractInterpreter.getRestrictedByTypeOfResult(null, string, true));
        
        JSType actualParameterType = actual.getParameterType();
        assertNull(actualParameterType);
        
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
        JSTypeRegistry jSTypeRegistry = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry2TypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry3 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry3TypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry4 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry4TypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry5 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry5TypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry6 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry6TypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry7 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry7TypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry8 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry8TypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry9 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry9TypeRegistryNativeTypes, 10));
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.executesCondition {@code (resultEqualsValue): True}
 * @utbot.returnsFrom {@code return result == null ? getNativeType(CHECKED_UNKNOWN_TYPE) : result;}
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ResultEqualsValue_4() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[31];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        nativeTypes[30] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "string";
        
        TemplateType actual = ((TemplateType) semanticReverseAbstractInterpreter.getRestrictedByTypeOfResult(null, string, true));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
        JSTypeRegistry jSTypeRegistry = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry25 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry jSTypeRegistry26 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes26 = ((JSType) get(jSTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry jSTypeRegistry27 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes27 = ((JSType) get(jSTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry jSTypeRegistry28 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes28 = ((JSType) get(jSTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry jSTypeRegistry29 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes29 = ((JSType) get(jSTypeRegistry29TypeRegistryNativeTypes, 29));
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes14);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes15);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes16);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes17);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes18);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes19);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes20);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes21);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes22);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes23);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes24);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes25);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes26);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes27);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes28);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes29);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.returnsFrom {@code return type.visit(new RestrictByOneTypeOfResultVisitor(value, resultEqualsValue));}
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_TypeNotEqualsNull_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        FunctionType actual = ((FunctionType) closureReverseAbstractInterpreter.getRestrictedByTypeOfResult(anonymousFunctionType, null, false));
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertNull(actualPropAccess);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        ImmutableList actualTemplateTypeNames = actual.getTemplateTypeNames();
        assertNull(actualTemplateTypeNames);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = ((FunctionType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor.caseNoType(ChainableReverseAbstractInterpreter.java:404)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor.caseNoType(ChainableReverseAbstractInterpreter.java:363)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult(ChainableReverseAbstractInterpreter.java:682) */
        semanticReverseAbstractInterpreter.getRestrictedByTypeOfResult(noType, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor.caseUnknownType(ChainableReverseAbstractInterpreter.java:383)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor.caseUnknownType(ChainableReverseAbstractInterpreter.java:363)
            com.google.javascript.rhino.jstype.UnknownType.visit(UnknownType.java:120)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult(ChainableReverseAbstractInterpreter.java:682) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method getRestrictedByTypeOfResultMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedByTypeOfResult", unresolvedTypeExpressionType, stringType, booleanType);
        getRestrictedByTypeOfResultMethod.setAccessible(true);
        java.lang.Object[] getRestrictedByTypeOfResultMethodArguments = new java.lang.Object[3];
        getRestrictedByTypeOfResultMethodArguments[0] = unresolvedTypeExpression;
        getRestrictedByTypeOfResultMethodArguments[1] = ((Object) null);
        getRestrictedByTypeOfResultMethodArguments[2] = false;
        try {
            getRestrictedByTypeOfResultMethod.invoke(closureReverseAbstractInterpreter, getRestrictedByTypeOfResultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.executesCondition {@code (resultEqualsValue): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "number";
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(ChainableReverseAbstractInterpreter.java:701)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult(ChainableReverseAbstractInterpreter.java:676) */
        semanticReverseAbstractInterpreter.getRestrictedByTypeOfResult(null, string, true);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.executesCondition {@code (resultEqualsValue): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "string";
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(ChainableReverseAbstractInterpreter.java:705)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult(ChainableReverseAbstractInterpreter.java:676) */
        semanticReverseAbstractInterpreter.getRestrictedByTypeOfResult(null, string, true);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.executesCondition {@code (resultEqualsValue): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType result = getNativeTypeForTypeOf(value);
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ThrowNullPointerException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(ChainableReverseAbstractInterpreter.java:700)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult(ChainableReverseAbstractInterpreter.java:676) */
        closureReverseAbstractInterpreter.getRestrictedByTypeOfResult(null, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getRestrictedByTypeOfResult(com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetRestrictedByTypeOfResult_ThrowNullPointerException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(ChainableReverseAbstractInterpreter.java:700)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.access$000(ChainableReverseAbstractInterpreter.java:52)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor.caseTopType(ChainableReverseAbstractInterpreter.java:575)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor.caseUnknownType(ChainableReverseAbstractInterpreter.java:383)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor.caseUnknownType(ChainableReverseAbstractInterpreter.java:363)
            com.google.javascript.rhino.jstype.UnknownType.visit(UnknownType.java:120)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult(ChainableReverseAbstractInterpreter.java:682) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method getRestrictedByTypeOfResultMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getRestrictedByTypeOfResult", unresolvedTypeExpressionType, stringType, booleanType);
        getRestrictedByTypeOfResultMethod.setAccessible(true);
        java.lang.Object[] getRestrictedByTypeOfResultMethodArguments = new java.lang.Object[3];
        getRestrictedByTypeOfResultMethodArguments[0] = unresolvedTypeExpression;
        getRestrictedByTypeOfResultMethodArguments[1] = ((Object) null);
        getRestrictedByTypeOfResultMethodArguments[2] = true;
        try {
            getRestrictedByTypeOfResultMethod.invoke(semanticReverseAbstractInterpreter, getRestrictedByTypeOfResultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNativeTypeForTypeOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeTypeForTypeOf(java.lang.String)}
 * @utbot.executesCondition {@code (value.equals("number")): False}
 * @utbot.executesCondition {@code (value.equals("boolean")): False}
 * @utbot.executesCondition {@code (value.equals("string")): False}
 * @utbot.executesCondition {@code (value.equals("undefined")): False}
 * @utbot.executesCondition {@code (value.equals("function")): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNativeTypeForTypeOf_NotValueEquals() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        String string = " ";
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringType = Class.forName("java.lang.String");
        Method getNativeTypeForTypeOfMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getNativeTypeForTypeOf", stringType);
        getNativeTypeForTypeOfMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeForTypeOfMethodArguments = new java.lang.Object[1];
        getNativeTypeForTypeOfMethodArguments[0] = string;
        JSType actual = ((JSType) getNativeTypeForTypeOfMethod.invoke(closureReverseAbstractInterpreter, getNativeTypeForTypeOfMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeTypeForTypeOf(java.lang.String)}
 * @utbot.executesCondition {@code (value.equals("number")): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return getNativeType(NUMBER_TYPE);}
 *  */
    @Test
    public void testGetNativeTypeForTypeOf_ValueEquals() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "number";
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringType = Class.forName("java.lang.String");
        Method getNativeTypeForTypeOfMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getNativeTypeForTypeOf", stringType);
        getNativeTypeForTypeOfMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeForTypeOfMethodArguments = new java.lang.Object[1];
        getNativeTypeForTypeOfMethodArguments[0] = string;
        JSType actual = ((JSType) getNativeTypeForTypeOfMethod.invoke(semanticReverseAbstractInterpreter, getNativeTypeForTypeOfMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24TypeRegistryNativeTypes, 24));
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes14);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes15);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes16);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes17);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes18);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes19);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes20);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes21);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes22);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes23);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes24);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeTypeForTypeOf(java.lang.String)}
 * @utbot.executesCondition {@code (value.equals("number")): False}
 * @utbot.executesCondition {@code (value.equals("boolean")): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return getNativeType(BOOLEAN_TYPE);}
 *  */
    @Test
    public void testGetNativeTypeForTypeOf_ValueEquals_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "boolean";
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringType = Class.forName("java.lang.String");
        Method getNativeTypeForTypeOfMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getNativeTypeForTypeOf", stringType);
        getNativeTypeForTypeOfMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeForTypeOfMethodArguments = new java.lang.Object[1];
        getNativeTypeForTypeOfMethodArguments[0] = string;
        JSType actual = ((JSType) getNativeTypeForTypeOfMethod.invoke(closureReverseAbstractInterpreter, getNativeTypeForTypeOfMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10TypeRegistryNativeTypes, 10));
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes1);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes2);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes3);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes4);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes5);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes6);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes7);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes8);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes9);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes10);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeTypeForTypeOf(java.lang.String)}
 * @utbot.executesCondition {@code (value.equals("number")): False}
 * @utbot.executesCondition {@code (value.equals("boolean")): False}
 * @utbot.executesCondition {@code (value.equals("string")): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return getNativeType(STRING_TYPE);}
 *  */
    @Test
    public void testGetNativeTypeForTypeOf_ValueEquals_2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[31];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "string";
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringType = Class.forName("java.lang.String");
        Method getNativeTypeForTypeOfMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getNativeTypeForTypeOf", stringType);
        getNativeTypeForTypeOfMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeForTypeOfMethodArguments = new java.lang.Object[1];
        getNativeTypeForTypeOfMethodArguments[0] = string;
        JSType actual = ((JSType) getNativeTypeForTypeOfMethod.invoke(semanticReverseAbstractInterpreter, getNativeTypeForTypeOfMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry25 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry jSTypeRegistry26 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes26 = ((JSType) get(jSTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry jSTypeRegistry27 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes27 = ((JSType) get(jSTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry jSTypeRegistry28 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes28 = ((JSType) get(jSTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry jSTypeRegistry29 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes29 = ((JSType) get(jSTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry jSTypeRegistry30 = semanticReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes30 = ((JSType) get(jSTypeRegistry30TypeRegistryNativeTypes, 30));
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes1);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes2);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes3);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes4);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes5);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes6);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes7);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes8);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes9);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes10);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes11);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes12);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes13);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes14);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes15);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes16);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes17);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes18);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes19);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes20);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes21);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes22);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes23);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes24);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes25);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes26);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes27);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes28);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes29);
        
        assertNull(finalSemanticReverseAbstractInterpreterTypeRegistryNativeTypes30);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeTypeForTypeOf(java.lang.String)}
 * @utbot.executesCondition {@code (value.equals("number")): False}
 * @utbot.executesCondition {@code (value.equals("boolean")): False}
 * @utbot.executesCondition {@code (value.equals("string")): False}
 * @utbot.executesCondition {@code (value.equals("undefined")): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return getNativeType(VOID_TYPE);}
 *  */
    @Test
    public void testGetNativeTypeForTypeOf_ValueEquals_3() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "undefined";
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringType = Class.forName("java.lang.String");
        Method getNativeTypeForTypeOfMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getNativeTypeForTypeOf", stringType);
        getNativeTypeForTypeOfMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeForTypeOfMethodArguments = new java.lang.Object[1];
        getNativeTypeForTypeOfMethodArguments[0] = string;
        JSType actual = ((JSType) getNativeTypeForTypeOfMethod.invoke(closureReverseAbstractInterpreter, getNativeTypeForTypeOfMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry25 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry jSTypeRegistry26 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes26 = ((JSType) get(jSTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry jSTypeRegistry27 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes27 = ((JSType) get(jSTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry jSTypeRegistry28 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes28 = ((JSType) get(jSTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry jSTypeRegistry29 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes29 = ((JSType) get(jSTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry jSTypeRegistry30 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes30 = ((JSType) get(jSTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry jSTypeRegistry31 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes31 = ((JSType) get(jSTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry jSTypeRegistry32 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes32 = ((JSType) get(jSTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry jSTypeRegistry33 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes33 = ((JSType) get(jSTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry jSTypeRegistry34 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes34 = ((JSType) get(jSTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry jSTypeRegistry35 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes35 = ((JSType) get(jSTypeRegistry35TypeRegistryNativeTypes, 35));
        JSTypeRegistry jSTypeRegistry36 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes36 = ((JSType) get(jSTypeRegistry36TypeRegistryNativeTypes, 36));
        JSTypeRegistry jSTypeRegistry37 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry37TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry37, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes37 = ((JSType) get(jSTypeRegistry37TypeRegistryNativeTypes, 37));
        JSTypeRegistry jSTypeRegistry38 = closureReverseAbstractInterpreter.typeRegistry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry38TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry38, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes38 = ((JSType) get(jSTypeRegistry38TypeRegistryNativeTypes, 38));
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes0);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes1);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes2);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes3);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes4);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes5);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes6);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes7);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes8);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes9);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes10);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes11);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes12);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes13);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes14);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes15);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes16);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes17);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes18);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes19);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes20);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes21);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes22);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes23);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes24);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes25);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes26);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes27);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes28);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes29);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes30);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes31);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes32);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes33);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes34);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes35);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes36);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes37);
        
        assertNull(finalClosureReverseAbstractInterpreterTypeRegistryNativeTypes38);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNativeTypeForTypeOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeTypeForTypeOf(java.lang.String)}
 * @utbot.executesCondition {@code (value.equals("number")): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(NUMBER_TYPE);
 *  */
    @Test
    public void testGetNativeTypeForTypeOf_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "number";
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(ChainableReverseAbstractInterpreter.java:701) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringType = Class.forName("java.lang.String");
        Method getNativeTypeForTypeOfMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getNativeTypeForTypeOf", stringType);
        getNativeTypeForTypeOfMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeForTypeOfMethodArguments = new java.lang.Object[1];
        getNativeTypeForTypeOfMethodArguments[0] = string;
        try {
            getNativeTypeForTypeOfMethod.invoke(semanticReverseAbstractInterpreter, getNativeTypeForTypeOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeTypeForTypeOf(java.lang.String)}
 * @utbot.executesCondition {@code (value.equals("number")): False}
 * @utbot.executesCondition {@code (value.equals("boolean")): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(BOOLEAN_TYPE);
 *  */
    @Test
    public void testGetNativeTypeForTypeOf_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "boolean";
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(ChainableReverseAbstractInterpreter.java:703) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringType = Class.forName("java.lang.String");
        Method getNativeTypeForTypeOfMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getNativeTypeForTypeOf", stringType);
        getNativeTypeForTypeOfMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeForTypeOfMethodArguments = new java.lang.Object[1];
        getNativeTypeForTypeOfMethodArguments[0] = string;
        try {
            getNativeTypeForTypeOfMethod.invoke(semanticReverseAbstractInterpreter, getNativeTypeForTypeOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeTypeForTypeOf(java.lang.String)}
 * @utbot.executesCondition {@code (value.equals("number")): False}
 * @utbot.executesCondition {@code (value.equals("boolean")): False}
 * @utbot.executesCondition {@code (value.equals("string")): False}
 * @utbot.executesCondition {@code (value.equals("undefined")): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(VOID_TYPE);
 *  */
    @Test
    public void testGetNativeTypeForTypeOf_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "undefined";
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(ChainableReverseAbstractInterpreter.java:707) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringType = Class.forName("java.lang.String");
        Method getNativeTypeForTypeOfMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getNativeTypeForTypeOf", stringType);
        getNativeTypeForTypeOfMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeForTypeOfMethodArguments = new java.lang.Object[1];
        getNativeTypeForTypeOfMethodArguments[0] = string;
        try {
            getNativeTypeForTypeOfMethod.invoke(semanticReverseAbstractInterpreter, getNativeTypeForTypeOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeTypeForTypeOf(java.lang.String)}
 * @utbot.executesCondition {@code (value.equals("number")): False}
 * @utbot.executesCondition {@code (value.equals("boolean")): False}
 * @utbot.executesCondition {@code (value.equals("string")): False}
 * @utbot.executesCondition {@code (value.equals("undefined")): False}
 * @utbot.executesCondition {@code (value.equals("function")): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(U2U_CONSTRUCTOR_TYPE);
 *  */
    @Test
    public void testGetNativeTypeForTypeOf_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        String string = "function";
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 47 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:687)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(ChainableReverseAbstractInterpreter.java:709) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringType = Class.forName("java.lang.String");
        Method getNativeTypeForTypeOfMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getNativeTypeForTypeOf", stringType);
        getNativeTypeForTypeOfMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeForTypeOfMethodArguments = new java.lang.Object[1];
        getNativeTypeForTypeOfMethodArguments[0] = string;
        try {
            getNativeTypeForTypeOfMethod.invoke(closureReverseAbstractInterpreter, getNativeTypeForTypeOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getNativeTypeForTypeOf(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: value.equals("number")
 *  */
    @Test
    public void testGetNativeTypeForTypeOf_ThrowNullPointerException() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(ChainableReverseAbstractInterpreter.java:700) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringType = Class.forName("java.lang.String");
        Method getNativeTypeForTypeOfMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("getNativeTypeForTypeOf", stringType);
        getNativeTypeForTypeOfMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeForTypeOfMethodArguments = new java.lang.Object[1];
        getNativeTypeForTypeOfMethodArguments[0] = ((Object) null);
        try {
            getNativeTypeForTypeOfMethod.invoke(closureReverseAbstractInterpreter, getNativeTypeForTypeOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (nextLink != null): False}
 * @utbot.returnsFrom {@code return nextLink != null ? nextLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome) : blindScope;}
 *  */
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome_NextLinkEqualsNull() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        FlowScope actual = closureReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(null, null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (nextLink != null): True}
 * @utbot.returnsFrom {@code return nextLink != null ? nextLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome) : blindScope;}
 *  */
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome_NextLinkNotEqualsNull_2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter nextLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", stringNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (nextLink != null): True}
 * @utbot.returnsFrom {@code return nextLink != null ? nextLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome) : blindScope;}
 *  */
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome_NextLinkNotEqualsNull() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (nextLink != null): True}
 * @utbot.returnsFrom {@code return nextLink != null ? nextLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome) : blindScope;}
 *  */
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome_NextLinkNotEqualsNull_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter nextLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (nextLink != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: nextLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testNextPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(46);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome3() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(12);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome4() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(12);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome5() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(45);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome6() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(13);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(32);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome7() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(111);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(32);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome8() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome9() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", nextLink);
        ClosureReverseAbstractInterpreter nextLink1 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink1);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(15);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome10() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(46);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(32);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first1);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", stringNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome11() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        FlowScope actual = semanticReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome12() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome13() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome14() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome15() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(52);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome16() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter nextLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", next);
        
        FlowScope actual = semanticReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(node, null, false);
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome17() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome18() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter nextLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNextPreciserScopeKnowingConditionOutcome19() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNextPreciserScopeKnowingConditionOutcome20() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = new Node(38);
        
        closureReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(node, null, false);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNextPreciserScopeKnowingConditionOutcome21() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNextPreciserScopeKnowingConditionOutcome22() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNextPreciserScopeKnowingConditionOutcome23() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testNextPreciserScopeKnowingConditionOutcome24() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", nextLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(51);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNextPreciserScopeKnowingConditionOutcome25() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNextPreciserScopeKnowingConditionOutcome26() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(101);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNextPreciserScopeKnowingConditionOutcome27() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(17);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testNextPreciserScopeKnowingConditionOutcome28() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(15);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, linkedFlowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test(expected = StackOverflowError.class)
    public void testNextPreciserScopeKnowingConditionOutcome29() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = new Node(0);
        
        closureReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(node, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testNextPreciserScopeKnowingConditionOutcome30() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testNextPreciserScopeKnowingConditionOutcome31() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter nextLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testNextPreciserScopeKnowingConditionOutcome32() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(15);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, linkedFlowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testNextPreciserScopeKnowingConditionOutcome33() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(firstLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", firstLink);
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testNextPreciserScopeKnowingConditionOutcome34() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(firstLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", firstLink);
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome35() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1557)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:133)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseNameOrGetProp(SemanticReverseAbstractInterpreter.java:428)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:218)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome36() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1553)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:133)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseNameOrGetProp(SemanticReverseAbstractInterpreter.java:428)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:218)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:228)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome37() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1557)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:133)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseNameOrGetProp(SemanticReverseAbstractInterpreter.java:428)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:218)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome38() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException] */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome39() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(111);
        setField(first, "com.google.javascript.rhino.Node", "parent", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:147)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:356)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:184)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome40() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(52);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:120)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseInstanceOf(SemanticReverseAbstractInterpreter.java:446)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:241)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:356)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:184)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome41() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(13);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:150)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:228)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome42() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(51);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:246)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:356)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:184)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome43() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:128)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting(SemanticReverseAbstractInterpreter.java:325)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:172)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome44() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:224)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:356)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:184)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome45() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashMap symbols = new LinkedHashMap();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols", symbols);
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:491)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:152)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:122)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseNameOrGetProp(SemanticReverseAbstractInterpreter.java:428)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:218)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", stringNodeType, linkedFlowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome46() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:356)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:175)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:228)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome47() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(17);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:120)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:285)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:236)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", nodeType, linkedFlowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = node;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome48() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        dirtySymbols.add(null);
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:488)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:152)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:122)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseNameOrGetProp(SemanticReverseAbstractInterpreter.java:428)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:218)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", stringNodeType, linkedFlowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome49() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(16);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:120)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:285)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:236)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome50() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:184)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testNextPreciserScopeKnowingConditionOutcome51() throws Throwable  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:208)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting(SemanticReverseAbstractInterpreter.java:325)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:181)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:110) */
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method nextPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("nextPreciserScopeKnowingConditionOutcome", stringNodeType, linkedFlowScopeType, booleanType);
        nextPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] nextPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        nextPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            nextPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, nextPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test(timeout = 1000L)
    public void testNextPreciserScopeKnowingConditionOutcome52() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(nextLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        semanticReverseAbstractInterpreter.nextPreciserScopeKnowingConditionOutcome(node, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} twice,
    ///     {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testFirstPreciserScopeKnowingConditionOutcome_ReturnFirstLinkGetPreciserScopeKnowingConditionOutcome() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(15);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method firstPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("firstPreciserScopeKnowingConditionOutcome", stringNodeType, flowScopeType, booleanType);
        firstPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] firstPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) firstPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, firstPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testFirstPreciserScopeKnowingConditionOutcome_ReturnFirstLinkGetPreciserScopeKnowingConditionOutcome_1() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method firstPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("firstPreciserScopeKnowingConditionOutcome", stringNodeType, flowScopeType, booleanType);
        firstPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] firstPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) firstPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, firstPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testFirstPreciserScopeKnowingConditionOutcome_ReturnFirstLinkGetPreciserScopeKnowingConditionOutcome_2() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(51);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method firstPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("firstPreciserScopeKnowingConditionOutcome", stringNodeType, flowScopeType, booleanType);
        firstPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] firstPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) firstPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, firstPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testFirstPreciserScopeKnowingConditionOutcome_ReturnFirstLinkGetPreciserScopeKnowingConditionOutcome_3() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter nextLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(firstLink, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method firstPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("firstPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        firstPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] firstPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) firstPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, firstPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testFirstPreciserScopeKnowingConditionOutcome_ReturnFirstLinkGetPreciserScopeKnowingConditionOutcome_7() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method firstPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("firstPreciserScopeKnowingConditionOutcome", stringNodeType, flowScopeType, booleanType);
        firstPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] firstPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) firstPreciserScopeKnowingConditionOutcomeMethod.invoke(closureReverseAbstractInterpreter, firstPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testFirstPreciserScopeKnowingConditionOutcome_ReturnFirstLinkGetPreciserScopeKnowingConditionOutcome_4() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method firstPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("firstPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        firstPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] firstPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) firstPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, firstPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testFirstPreciserScopeKnowingConditionOutcome_ReturnFirstLinkGetPreciserScopeKnowingConditionOutcome_6() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method firstPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("firstPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        firstPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] firstPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) firstPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, firstPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testFirstPreciserScopeKnowingConditionOutcome_ReturnFirstLinkGetPreciserScopeKnowingConditionOutcome_5() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method firstPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("firstPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        firstPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] firstPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) firstPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, firstPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test
    public void testFirstPreciserScopeKnowingConditionOutcome_ThrowNullPointerException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:100) */
        closureReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(null, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testFirstPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException() throws Exception  {
        ClosureReverseAbstractInterpreter closureReverseAbstractInterpreter = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(closureReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Node node = new Node(38);
        
        closureReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(node, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ChainableReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return firstLink.getPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testFirstPreciserScopeKnowingConditionOutcome_ThrowIllegalStateException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class chainableReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method firstPreciserScopeKnowingConditionOutcomeMethod = chainableReverseAbstractInterpreterClazz.getDeclaredMethod("firstPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        firstPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] firstPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        firstPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            firstPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, firstPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields881115838592700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields881115838592700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass881115838600700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields881115838592700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass881115838600700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields881115842284400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields881115842284400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass881115842287300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields881115842284400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass881115842287300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


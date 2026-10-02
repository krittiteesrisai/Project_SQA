package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import java.lang.reflect.Method;
import com.google.javascript.rhino.SimpleErrorReporter;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_rhino_jstype_ArrowTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.getLeastSupertype
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetLeastSupertype_ThrowUnsupportedOperationException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        arrowType.getLeastSupertype(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(other instanceof ArrowType)): True}
 *  */
    @Test
    public void testIsSubtype_NotOtherInstanceOfArrowType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        boolean actual = arrowType.isSubtype(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(other instanceof ArrowType)): False}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && thatParam != null)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSubtype_ThisParamEqualsNullAndThatParamEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "propListHead", next);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(other instanceof ArrowType)): False}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && thatParam != null)} once
 *  */
    @Test
    public void testIsSubtype_ThatParamTypeEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", parameters);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!(other instanceof ArrowType)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.JSType#isSubtype(com.google.javascript.rhino.jstype.JSType)} once,
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} twice,
    ///     {@link com.google.javascript.rhino.Node#isOptionalArg()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!thisParam.isOptionalArg()): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSubtype_ThisParamIsOptionalArg() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 37);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!thisParam.isOptionalArg()): True}
 * @utbot.executesCondition {@code (!thisParam.isOptionalArg()): True}
 * @utbot.executesCondition {@code (!thisParam.isOptionalArg()): True}
 *  */
    @Test
    public void testIsSubtype_NotThisParamIsOptionalArg() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!thisParam.isOptionalArg()): True}
 * @utbot.executesCondition {@code (!thisParam.isOptionalArg()): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSubtype_ThisParamIsOptionalArg_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!(other instanceof ArrowType)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.JSType#isSubtype(com.google.javascript.rhino.jstype.JSType)} once,
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} twice,
    ///     {@link com.google.javascript.rhino.Node#getJSType()} twice
    /// execute conditions:
    ///     {@code (thisParamType != null): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#isVarArgs()} twice,
    ///     {@link com.google.javascript.rhino.Node#isOptionalArg()} once
    /// execute conditions:
    ///     {@code (!thisIsOptional): True},
    ///     {@code (thatIsOptional): True},
    ///     {@code (!isTopFunction): False},
    ///     {@code (!thisIsVarArgs): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getNext()} once
    /// execute conditions:
    ///     {@code (!thatIsVarArgs): False},
    ///     {@code (thisIsVarArgs && thatIsVarArgs): False}
    /// return from: {@code return true;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && thatParam != null)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSubtype_NotThatParamTypeIsUnknownType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(parameters1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        UnresolvedTypeExpression jsType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && thatParam != null)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSubtype_BooleanIsTopFunctionInitializedByThatIsVarArgsAndThatParamTypeEqualsNullOrThatParamTypeIsUnknownTypeOrThatParamTypeIsNoType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(parameters1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && thatParam != null)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSubtype_NotThatParamTypeIsUnknownType_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        jsType.setReferencedType(referencedType);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.isSubtype(arrowType1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !this.returnType.isSubtype(that.returnType)
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:91) */
        arrowType.isSubtype(arrowType);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisParam = parameters.getFirstChild();
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:114) */
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisParam = parameters.getFirstChild();
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:114) */
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisParam = parameters.getFirstChild();
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:114) */
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisParam = parameters.getFirstChild();
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:114) */
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thatParam = that.parameters.getFirstChild();
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.isSubtype(ArrowType.java:115) */
        arrowType.isSubtype(arrowType1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && thatParam != null)} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: boolean thisIsVarArgs = thisParam.isVarArgs();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsSubtype_ThrowUnsupportedOperationException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        UnresolvedTypeExpression jsType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && thatParam != null)} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: boolean thisIsVarArgs = thisParam.isVarArgs();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsSubtype_ThrowUnsupportedOperationException_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        UnresolvedTypeExpression jsType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && thatParam != null)} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: boolean thatIsVarArgs = thatParam.isVarArgs();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsSubtype_ThrowUnsupportedOperationException_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(parameters1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.isSubtype(arrowType1);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isOptionalArg()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: !thisParam.isOptionalArg()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsSubtype_ThrowUnsupportedOperationException_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 37);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.isSubtype(arrowType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return thisParam == otherParam;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamNotEqualsOtherParam() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamEqualsOtherParam() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamEqualsNullAndOtherParamEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getJSType()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 *  */
    @Test
    public void testHasEqualParameters_OtherParamTypeNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_OtherParamTypeEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "next", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} twice
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamTypeCheckEquivalenceHelper() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next1);
        ParameterizedType jsType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType referencedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType.setReferencedType(referencedType1);
        jsType2.setReferencedType(referencedType);
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, true);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getJSType()} twice
    /// execute conditions:
    ///     {@code (thisParamType != null): True},
    ///     {@code (otherParamType != null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.JSType#checkEquivalenceHelper(com.google.javascript.rhino.jstype.JSType,boolean)} once
    /// execute conditions:
    ///     {@code (!thisParamType.checkEquivalenceHelper(otherParamType, tolerateUnknowns)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getNext()} twice
    /// return from: {@code return thisParam == otherParam;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamNotEqualsOtherParam_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamEqualsOtherParam_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        UnknownType jsType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, true);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamEqualsOtherParam_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        IndexedType jsType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        UnknownType jsType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, true);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamEqualsOtherParam_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType.setReferencedType(referencedType1);
        jsType1.setReferencedType(referencedType);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, true);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.iterates iterate the loop {@code while(thisParam != null && otherParam != null)} once
 * @utbot.returnsFrom {@code return thisParam == otherParam;}
 *  */
    @Test
    public void testHasEqualParameters_ThisParamEqualsNullAndOtherParamEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        UnresolvedTypeExpression jsType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        UnknownType jsType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", next);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        
        boolean actual = arrowType.hasEqualParameters(arrowType1, true);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisParam = parameters.getFirstChild();
 *  */
    @Test
    public void testHasEqualParameters_ThrowNullPointerException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:178) */
        arrowType.hasEqualParameters(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node otherParam = that.parameters.getFirstChild();
 *  */
    @Test
    public void testHasEqualParameters_ThrowNullPointerException_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:179) */
        arrowType.hasEqualParameters(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node otherParam = that.parameters.getFirstChild();
 *  */
    @Test
    public void testHasEqualParameters_ThrowNullPointerException_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:179) */
        arrowType.hasEqualParameters(arrowType1, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node actualParameters = actual.parameters;
        assertNull(actualParameters);
        
        JSType actualReturnType = actual.returnType;
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersEqualsNull_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node actualParameters = actual.parameters;
        assertNull(actualParameters);
        
        JSType actualReturnType = actual.returnType;
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        JSType finalArrowTypeReturnType = arrowType.returnType;
        
        assertNull(finalArrowTypeReturnType);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", returnType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node actualParameters = actual.parameters;
        assertNull(actualParameters);
        
        JSType arrowTypeReturnType = arrowType.returnType;
        JSType actualReturnType = actual.returnType;
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(arrowTypeReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersNotEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node arrowTypeParameters = arrowType.parameters;
        Node actualParameters = actual.parameters;
        int arrowTypeParametersType = arrowTypeParameters.getType();
        int actualParametersType = actualParameters.getType();
        assertEquals(arrowTypeParametersType, actualParametersType);
        
        Node actualParametersNext = actualParameters.getNext();
        assertNull(actualParametersNext);
        
        Node arrowTypeParametersFirst = ((Node) getFieldValue(arrowTypeParameters, "com.google.javascript.rhino.Node", "first"));
        Node actualParametersFirst = ((Node) getFieldValue(actualParameters, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(arrowTypeParametersFirst, actualParametersFirst));
        assertTrue(deepEquals(arrowTypeParametersFirst, actualParametersFirst));
        assertTrue(deepEquals(arrowTypeParametersFirst, actualParametersFirst));
        Node actualParametersFirstLast = ((Node) getFieldValue(actualParametersFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualParametersFirstLast);
        
        Object actualParametersFirstPropListHead = getFieldValue(actualParametersFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualParametersFirstPropListHead);
        
        int arrowTypeParametersFirstSourcePosition = arrowTypeParametersFirst.getSourcePosition();
        int actualParametersFirstSourcePosition = actualParametersFirst.getSourcePosition();
        assertEquals(arrowTypeParametersFirstSourcePosition, actualParametersFirstSourcePosition);
        
        JSType arrowTypeParametersFirstJsType = ((JSType) getFieldValue(arrowTypeParametersFirst, "com.google.javascript.rhino.Node", "jsType"));
        JSType actualParametersFirstJsType = ((JSType) getFieldValue(actualParametersFirst, "com.google.javascript.rhino.Node", "jsType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(arrowTypeParametersFirstJsType, actualParametersFirstJsType);
        
        Node actualParametersFirstParent = actualParametersFirst.getParent();
        assertNull(actualParametersFirstParent);
        
        assertTrue(deepEquals(arrowTypeParameters, actualParameters));
        assertTrue(deepEquals(arrowTypeParameters, actualParameters));
        assertTrue(deepEquals(arrowTypeParameters, actualParameters));
        assertTrue(deepEquals(arrowTypeParameters, actualParameters));
        assertTrue(deepEquals(arrowTypeParameters, actualParameters));
        
        JSType actualReturnType = actual.returnType;
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        ParameterizedType resolveResult = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        JSType initialArrowTypeReturnType = arrowType.returnType;
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node arrowTypeParameters = arrowType.parameters;
        Node actualParameters = actual.parameters;
        int arrowTypeParametersType = arrowTypeParameters.getType();
        int actualParametersType = actualParameters.getType();
        assertEquals(arrowTypeParametersType, actualParametersType);
        
        Node actualParametersNext = actualParameters.getNext();
        assertNull(actualParametersNext);
        
        Node actualParametersFirst = ((Node) getFieldValue(actualParameters, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualParametersFirst);
        
        Node actualParametersLast = ((Node) getFieldValue(actualParameters, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualParametersLast);
        
        Object actualParametersPropListHead = getFieldValue(actualParameters, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualParametersPropListHead);
        
        int arrowTypeParametersSourcePosition = arrowTypeParameters.getSourcePosition();
        int actualParametersSourcePosition = actualParameters.getSourcePosition();
        assertEquals(arrowTypeParametersSourcePosition, actualParametersSourcePosition);
        
        JSType actualParametersJsType = ((JSType) getFieldValue(actualParameters, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualParametersJsType);
        
        Node actualParametersParent = actualParameters.getParent();
        assertNull(actualParametersParent);
        
        JSType arrowTypeReturnType = arrowType.returnType;
        JSType actualReturnType = actual.returnType;
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(arrowTypeReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        JSType finalArrowTypeReturnType = arrowType.returnType;
        
        assertFalse(initialArrowTypeReturnType == finalArrowTypeReturnType);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResolveInternal_ParametersEqualsNull_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoResolvedType returnType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        ArrowType actual = ((ArrowType) arrowType.resolveInternal(null, null));
        
        Node actualParameters = actual.parameters;
        assertNull(actualParameters);
        
        JSType arrowTypeReturnType = arrowType.returnType;
        JSType actualReturnType = actual.returnType;
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(arrowTypeReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = actual.returnTypeInferred;
        assertFalse(actualReturnTypeInferred);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
        JSType jSType = arrowType.returnType;
        boolean finalArrowTypeReturnTypeResolved = ((Boolean) getFieldValue(jSType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        
        assertTrue(finalArrowTypeReturnTypeResolved);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: paramNode.setJSType(paramNode.getJSType().resolve(t, scope));
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        ParameterizedType resolveResult = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.ParameterizedType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.ParameterizedType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @47f535b6)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1170)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:265) */
        arrowType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: paramNode.setJSType(paramNode.getJSType().resolve(t, scope));
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1269)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:265) */
        arrowType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1269)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:1306)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1170)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:265) */
        arrowType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: paramNode.setJSType(paramNode.getJSType().resolve(t, scope));
 *  */
    @Test
    public void testResolveInternal_ThrowNullPointerException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        ParameterizedType resolveResult = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:265) */
        arrowType.resolveInternal(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test
    public void testResolveInternal1() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        EnumType type = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(type, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(type, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot.setType(type);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        Object oldRhinoNullReporter = createInstance("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter");
        Object concreteScope = createInstance("com.google.javascript.jscomp.TightenTypes$ConcreteScope");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1269)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:1306)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1173)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:1306)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:261) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class oldRhinoNullReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class concreteScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = arrowTypeClazz.getDeclaredMethod("resolveInternal", oldRhinoNullReporterType, concreteScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = oldRhinoNullReporter;
        resolveInternalMethodArguments[1] = concreteScope;
        try {
            resolveInternalMethod.invoke(arrowType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveInternal2() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NamedType resolveResult = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        Object oldRhinoErrorReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1198)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:1306)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:261) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class oldRhinoErrorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = arrowTypeClazz.getDeclaredMethod("resolveInternal", oldRhinoErrorReporterType, staticScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = oldRhinoErrorReporter;
        resolveInternalMethodArguments[1] = ((Object) null);
        try {
            resolveInternalMethod.invoke(arrowType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveInternal3() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        UnresolvedTypeExpression typeOfThis = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1198)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:1306)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:261) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = arrowTypeClazz.getDeclaredMethod("resolveInternal", errorReporterType, parameterizedTypeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = ((Object) null);
        resolveInternalMethodArguments[1] = parameterizedType;
        try {
            resolveInternalMethod.invoke(arrowType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveInternal4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        StringType type = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(type, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        NamedType resolveResult = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(type, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        prototypeSlot.setType(type);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1198)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:265) */
        arrowType.resolveInternal(null, null);
    }
    
    @Test
    public void testResolveInternal5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        JSTypeRegistry registry1 = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(unionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry1);
        nativeTypes[35] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:221)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1189)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:1306)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:261) */
        arrowType.resolveInternal(simpleErrorReporter, null);
    }
    
    @Test
    public void testResolveInternal6() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        RecordType typeOfThis = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        UnionType resolveResult = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(resolveResult, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        Object oldRhinoErrorReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:221)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1189)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:265) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class oldRhinoErrorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = arrowTypeClazz.getDeclaredMethod("resolveInternal", oldRhinoErrorReporterType, staticScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = oldRhinoErrorReporter;
        resolveInternalMethodArguments[1] = ((Object) null);
        try {
            resolveInternalMethod.invoke(arrowType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testResolveInternal7() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList implementedInterfaces = new ArrayList();
        jsType.setImplementedInterfaces(implementedInterfaces);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        AllType resolveResult = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:548)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1214)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:265) */
        arrowType.resolveInternal(null, null);
    }
    
    @Test
    public void testResolveInternal8() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        AllType type = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(type, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(type, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot.setType(type);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NamedType returnType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        InstanceObjectType resolveResult = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1269)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:1306)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1173)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.ArrowType.resolveInternal(ArrowType.java:265) */
        arrowType.resolveInternal(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.toStringHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringHelper(boolean)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#toStringHelper(boolean)}
 * @utbot.returnsFrom {@code return "[ArrowType]";}
 *  */
    @Test
    public void testToStringHelper_ReturnArrowType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        String actual = arrowType.toStringHelper(false);
        
        String expected = "[ArrowType]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.getGreatestSubtype
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetGreatestSubtype_ThrowUnsupportedOperationException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        arrowType.getGreatestSubtype(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that, tolerateUnknowns);}
 *  */
    @Test
    public void testCheckArrowEquivalenceHelper_ReturnHasEqualParameters_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that, tolerateUnknowns);}
 *  */
    @Test
    public void testCheckArrowEquivalenceHelper_ReturnHasEqualParameters() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.returnsFrom {@code return hasEqualParameters(that, tolerateUnknowns);}
 *  */
    @Test
    public void testCheckArrowEquivalenceHelper_ReturnHasEqualParameters_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType, boolean)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !returnType.checkEquivalenceHelper(that.returnType, tolerateUnknowns)
 *  */
    @Test
    public void testCheckArrowEquivalenceHelper_ThrowNullPointerException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:206) */
        arrowType.checkArrowEquivalenceHelper(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#checkEquivalenceHelper(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !returnType.checkEquivalenceHelper(that.returnType, tolerateUnknowns)
 *  */
    @Test
    public void testCheckArrowEquivalenceHelper_ThrowNullPointerException_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:206) */
        arrowType.checkArrowEquivalenceHelper(arrowType, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType, boolean)
    
    @Test
    public void testCheckArrowEquivalenceHelper1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        ParameterizedType returnType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        returnType1.setReferencedType(referencedType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertTrue(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        jsType1.setReferencedType(referencedType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertTrue(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        referencedType1.setReferencedType(jsType);
        referencedType.setReferencedType(referencedType1);
        jsType1.setReferencedType(referencedType);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, false);
        
        assertFalse(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType2 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType1.setReferencedType(referencedType2);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, false);
        
        assertFalse(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        UnknownType jsType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertTrue(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper6() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        referencedType.setReferencedType(jsType);
        jsType1.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertFalse(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper7() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "jsType", referencedType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        jsType1.setReferencedType(referencedType1);
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", referencedType);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertTrue(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper8() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NumberType jsType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        UnknownType jsType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", parameters1);
        UnknownType jsType2 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        NoObjectType jsType3 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType3);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        ParameterizedType returnType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertFalse(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper9() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        IndexedType jsType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType.setReferencedType(referencedType1);
        jsType1.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        IndexedType returnType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", referencedType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertTrue(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper10() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        jsType1.setReferencedType(jsType);
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertTrue(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper11() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NamedType jsType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        RecordType returnType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType jsType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType2.setReferencedType(referencedType1);
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, false);
        
        assertFalse(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper12() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NamedType jsType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "jsType", referencedType);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertTrue(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper13() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        IndexedType jsType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertTrue(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper14() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        NamedType jsType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        ParameterizedType returnType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertFalse(actual);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper15() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        IndexedType jsType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        ParameterizedType returnType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        boolean actual = arrowType.checkArrowEquivalenceHelper(arrowType1, true);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType, boolean)
    
    @Test(expected = StackOverflowError.class)
    public void testCheckArrowEquivalenceHelper16() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        jsType1.setReferencedType(jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.checkArrowEquivalenceHelper(arrowType1, true);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCheckArrowEquivalenceHelper17() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        jsType1.setReferencedType(jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        arrowType.checkArrowEquivalenceHelper(arrowType1, true);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCheckArrowEquivalenceHelper18() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        NamedType jsType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ProxyObjectType returnType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType jsType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        jsType2.setReferencedType(jsType2);
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        arrowType.checkArrowEquivalenceHelper(arrowType1, false);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper19() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        jsType.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NumberType returnType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:525)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, false);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper20() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType3 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        PrototypeObjectType returnType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:526)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, false);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper21() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:526)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, true);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper22() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:526)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, true);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper23() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:525)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, true);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper24() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        ParameterizedType jsType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        UnknownType returnType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:526)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, true);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper25() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        RecordType returnType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType jsType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType2 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType1.setReferencedType(referencedType2);
        jsType2.setReferencedType(referencedType1);
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:564)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, false);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper26() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ProxyObjectType returnType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        IndexedType jsType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:526)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, false);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper27() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        IndexedType jsType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        ParameterizedType returnType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        returnType1.setReferencedType(referencedType);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:525)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, true);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper28() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        IndexedType jsType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        UnresolvedTypeExpression jsType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        ParameterizedType jsType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType.setReferencedType(referencedType1);
        jsType2.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType2);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        UnknownType jsType3 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType3);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        PrototypeObjectType returnType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:526)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, true);
    }
    
    @Test
    public void testCheckArrowEquivalenceHelper29() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(next1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        NamedType jsType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType1.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        UnresolvedTypeExpression returnType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:526)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:186)
            com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(ArrowType.java:209) */
        arrowType.checkArrowEquivalenceHelper(arrowType1, true);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType, boolean)
    
    @Test(timeout = 1000L)
    public void testCheckArrowEquivalenceHelper30() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        arrowType.checkArrowEquivalenceHelper(arrowType1, false);
    }
    
    @Test(timeout = 1000L)
    public void testCheckArrowEquivalenceHelper31() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        jsType.setReferencedType(referencedType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        jsType1.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        BooleanType returnType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        ArrowType arrowType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        setField(arrowType1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        arrowType.checkArrowEquivalenceHelper(arrowType1, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasTemplatedParameterType()
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersNotEqualsNull_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersNotEqualsNull_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.SingletonImmutableList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersNotEqualsNull_5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersNotEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersNotEqualsNull_4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoResolvedType parameterType1 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersNotEqualsNull_6() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoResolvedType parameterType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableList");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersNotEqualsNull_7() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumElementType parameterType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameterType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersNotEqualsNull_9() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoResolvedType typeOfThis = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableList");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasTemplatedParameterType()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTemplatedParameterType_ParametersNotEqualsNull_8() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        EnumElementType typeOfThis = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasTemplatedParameterType()
    
    @Test
    public void testHasTemplatedParameterType1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType parameterType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasTemplatedParameterType2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        StringType jsType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasTemplatedParameterType3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType parameterType6 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(parameterType5, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType6);
        setField(parameterType4, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType5);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method hasTemplatedParameterType()
    
    @Test(timeout = 1000L)
    public void testHasTemplatedParameterType4() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testHasTemplatedParameterType5() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testHasTemplatedParameterType6() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumElementType parameterType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameterType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testHasTemplatedParameterType7() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        EnumElementType typeOfThis = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasTemplatedParameterType()
    
    @Test
    public void testHasTemplatedParameterType8() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableSortedMap$EntrySet$1");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType9() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableSortedMap$EntrySet$1");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType10() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableMultiset$EntrySet$1");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType11() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType12() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableMultiset$EntrySet$1");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType13() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType parameterType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType14() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableSortedMap$EntrySet$1");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType15() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType parameterType2 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(parameterType2, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType16() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType17() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType parameterType4 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType18() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType3 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableMultiset$EntrySet$1");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType19() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoObjectType parameterType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableMultimap$Keys$KeysEntrySet$1");
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType20() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType21() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        ParameterizedType typeOfThis1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ProxyObjectType parameterType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(parameterType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType22() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType parameterType2 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(parameterType2, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType23() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType5 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableMultimap$Keys$KeysEntrySet$1");
        setField(parameterType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType4, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType5);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType24() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType4 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType parameterType5 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType5);
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasTemplatedParameterType25() throws Throwable  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableSortedMap$EntrySet$1");
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300) */
        Class arrowTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Method hasTemplatedParameterTypeMethod = arrowTypeClazz.getDeclaredMethod("hasTemplatedParameterType");
        hasTemplatedParameterTypeMethod.setAccessible(true);
        java.lang.Object[] hasTemplatedParameterTypeMethodArguments = new java.lang.Object[0];
        try {
            hasTemplatedParameterTypeMethod.invoke(arrowType, hasTemplatedParameterTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.getPossibleToBooleanOutcomes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPossibleToBooleanOutcomes()
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#getPossibleToBooleanOutcomes()}
 * @utbot.returnsFrom {@code return BooleanLiteralSet.TRUE;}
 *  */
    @Test
    public void testGetPossibleToBooleanOutcomes_ReturnBooleanLiteralSetTRUE() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        BooleanLiteralSet actual = arrowType.getPossibleToBooleanOutcomes();
        
        BooleanLiteralSet expected = BooleanLiteralSet.TRUE;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.hasUnknownParamsOrReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasUnknownParamsOrReturn()
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeNotEqualsNullOrReturnTypeIsUnknownType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ParametersNotEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeEqualsNullOrReturnTypeIsUnknownType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ParametersNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ParametersNotEqualsNull_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ParametersNotEqualsNull_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        NamedType jsType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeEqualsNullOrReturnTypeIsUnknownType_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeNotEqualsNullOrReturnTypeIsUnknownType_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeNotEqualsNullOrReturnTypeIsUnknownType_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        IndexedType returnType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasUnknownParamsOrReturn()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return returnType == null || returnType.isUnknownType();}
 *  */
    @Test
    public void testHasUnknownParamsOrReturn_ReturnTypeNotEqualsNullOrReturnTypeIsUnknownType_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType referencedType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        UnresolvedTypeExpression referencedType2 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasUnknownParamsOrReturn()
    
    @Test
    public void testHasUnknownParamsOrReturn1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType referencedType4 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        IndexedType referencedType5 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType10 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ArrowType referencedType11 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasUnknownParamsOrReturn2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType referencedType6 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType10 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType11 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ArrowType referencedType12 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedType11.setReferencedType(referencedType12);
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertTrue(actual);
    }
    
    @Test
    public void testHasUnknownParamsOrReturn3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType referencedType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType referencedType9 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType10 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType11 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType12 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType13 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType14 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType15 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType16 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ArrowType referencedType17 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedType16.setReferencedType(referencedType17);
        referencedType15.setReferencedType(referencedType16);
        referencedType14.setReferencedType(referencedType15);
        referencedType13.setReferencedType(referencedType14);
        referencedType12.setReferencedType(referencedType13);
        referencedType11.setReferencedType(referencedType12);
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        returnType.setReferencedType(referencedType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasUnknownParamsOrReturn();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAnyTemplateInternal()
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasAnyTemplateInternal()}
 * @utbot.returnsFrom {@code return returnType.hasAnyTemplate() || hasTemplatedParameterType();}
 *  */
    @Test
    public void testHasAnyTemplateInternal_ReturnReturnTypeHasAnyTemplateOrHasTemplatedParameterType_6() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasAnyTemplateInternal()}
 * @utbot.returnsFrom {@code return returnType.hasAnyTemplate() || hasTemplatedParameterType();}
 *  */
    @Test
    public void testHasAnyTemplateInternal_ReturnReturnTypeHasAnyTemplateOrHasTemplatedParameterType_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoResolvedType returnType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableList");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasAnyTemplateInternal()}
 * @utbot.returnsFrom {@code return returnType.hasAnyTemplate() || hasTemplatedParameterType();}
 *  */
    @Test
    public void testHasAnyTemplateInternal_ReturnReturnTypeHasAnyTemplateOrHasTemplatedParameterType_5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoResolvedType returnType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.SingletonImmutableList");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasAnyTemplateInternal()}
 * @utbot.returnsFrom {@code return returnType.hasAnyTemplate() || hasTemplatedParameterType();}
 *  */
    @Test
    public void testHasAnyTemplateInternal_ReturnReturnTypeHasAnyTemplateOrHasTemplatedParameterType() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasAnyTemplateInternal()}
 * @utbot.returnsFrom {@code return returnType.hasAnyTemplate() || hasTemplatedParameterType();}
 *  */
    @Test
    public void testHasAnyTemplateInternal_ReturnReturnTypeHasAnyTemplateOrHasTemplatedParameterType_4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoResolvedType parameterType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableList");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(returnType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasAnyTemplateInternal()}
 * @utbot.returnsFrom {@code return returnType.hasAnyTemplate() || hasTemplatedParameterType();}
 *  */
    @Test
    public void testHasAnyTemplateInternal_ReturnReturnTypeHasAnyTemplateOrHasTemplatedParameterType_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasAnyTemplateInternal()}
 * @utbot.returnsFrom {@code return returnType.hasAnyTemplate() || hasTemplatedParameterType();}
 *  */
    @Test
    public void testHasAnyTemplateInternal_ReturnReturnTypeHasAnyTemplateOrHasTemplatedParameterType_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoResolvedType parameterType1 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        NoResolvedType typeOfThis = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableList");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasAnyTemplateInternal()
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hasAnyTemplateInternal()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#hasAnyTemplate()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return returnType.hasAnyTemplate() || hasTemplatedParameterType();
 *  */
    @Test
    public void testHasAnyTemplateInternal_ThrowNullPointerException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291) */
        arrowType.hasAnyTemplateInternal();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasAnyTemplateInternal()
    
    @Test
    public void testHasAnyTemplateInternal1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        BooleanType returnType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasAnyTemplateInternal2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasAnyTemplateInternal3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType parameterType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(parameterType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(returnType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasAnyTemplateInternal4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        PrototypeObjectType parameterType6 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(parameterType5, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType6);
        setField(parameterType4, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType5);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(returnType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasAnyTemplateInternal5() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        IndexedType typeOfThis = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        RecordType returnType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        boolean actual = arrowType.hasAnyTemplateInternal();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasAnyTemplateInternal()
    
    @Test
    public void testHasAnyTemplateInternal6() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NamedType returnType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.hasAnyTemplateInternal(ProxyObjectType.java:442)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal7() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableAsList");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal8() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableList$SubList");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal9() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableSortedAsList");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(returnType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal10() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        IndexedType jsType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        BooleanType returnType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.hasAnyTemplateInternal(ProxyObjectType.java:442)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal11() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableSortedAsList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal12() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableList$SubList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal13() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableMultimap$Keys$KeysEntrySet$1");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal14() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableMultimap$Keys$KeysEntrySet$1");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal15() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        NoResolvedType jsType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableList$SubList");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal16() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        IndexedType jsType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        PrototypeObjectType returnType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.hasAnyTemplateInternal(ProxyObjectType.java:442)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal17() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType4 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        PrototypeObjectType typeOfThis = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(returnType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal18() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType5 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableMultimap$Keys$KeysEntrySet$1");
        setField(parameterType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType4, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType5);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(returnType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal19() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType parameterType6 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(parameterType5, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType6);
        setField(parameterType4, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType5);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(returnType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.hasAnyTemplateInternal(ProxyObjectType.java:442)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal20() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType5 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableList$SubList");
        setField(parameterType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType4, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType5);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(returnType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal21() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        PrototypeObjectType typeOfThis = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException] */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal22() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        IndexedType typeOfThis = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(returnType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal23() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableAsList");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal24() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        PrototypeObjectType typeOfThis = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal25() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.RegularImmutableAsList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal26() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        PrototypeObjectType parameterType1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException] */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal27() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableSortedAsList");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal28() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType2 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoType typeOfThis1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableMapKeySet$1");
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal29() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType parameterType4 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(parameterType4, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(parameterType3, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType4);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NumberType returnType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal30() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(parameterType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        IndexedType typeOfThis1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(parameterType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(parameterType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ProxyObjectType returnType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal31() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType parameterType2 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object templateTypeNames = createInstance("com.google.common.collect.ImmutableMapKeySet$1");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableAsList.isEmpty(ImmutableAsList.java:51)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1270)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1271)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal32() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType parameterType3 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(parameterType3, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(parameterType2, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType3);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(parameterType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ArrowType returnType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    
    @Test
    public void testHasAnyTemplateInternal33() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType parameterType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType parameterType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(parameterType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        IndexedType typeOfThis1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(parameterType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        setField(parameterType1, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType2);
        setField(parameterType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType", parameterType);
        setField(next, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ProxyObjectType returnType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:291)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.FunctionType.hasAnyTemplateInternal(FunctionType.java:1272)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateInternal(ParameterizedType.java:84)
            com.google.javascript.rhino.jstype.JSType.hasAnyTemplate(JSType.java:403)
            com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType(ArrowType.java:300)
            com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateInternal(ArrowType.java:292) */
        arrowType.hasAnyTemplateInternal();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method hasAnyTemplateInternal()
    
    @Test(timeout = 1000L)
    public void testHasAnyTemplateInternal34() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ParameterizedType returnType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit", true);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        arrowType.hasAnyTemplateInternal();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method hashCode()
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull_2() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(1334395093, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        int actual = arrowType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        
        int actual = arrowType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull_3() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(returnType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        int actual = arrowType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.executesCondition {@code (parameters != null): False}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParametersEqualsNull_4() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        returnType.setOwnerFunction(ownerFunction);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        
        int actual = arrowType.hashCode();
        
        assertEquals(-534953605, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method hashCode()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (parameters != null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once,
    ///     {@link com.google.javascript.rhino.Node#getJSType()} once,
    ///     {@link com.google.javascript.rhino.Node#getNext()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.iterates iterate the loop {@code while(param != null)} once
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParamTypeNotEqualsNull_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(976968731, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.iterates iterate the loop {@code while(param != null)} once
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParamTypeEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.iterates iterate the loop {@code while(param != null)} once
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ParamTypeNotEqualsNull() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method hashCode()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.jstype.JSType#hashCode()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ReturnHashCode() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.returnsFrom {@code return hashCode;}
 *  */
    @Test
    public void testHashCode_ReturnHashCode_1() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        String name = "";
        setField(jsType, "com.google.javascript.rhino.jstype.EnumElementType", "name", name);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoResolvedType returnType1 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(arrowType, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        
        int actual = arrowType.hashCode();
        
        assertEquals(417666199, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.testForEquality
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method testForEquality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#testForEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTestForEquality_ThrowUnsupportedOperationException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        arrowType.testForEquality(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ArrowType.visit
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    /**
    @utbot.classUnderTest {@link ArrowType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ArrowType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Exception  {
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        arrowType.visit(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields918208616701900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields918208616701900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass918208616706200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields918208616701900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass918208616706200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields918208616987500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields918208616987500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass918208616989100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields918208616987500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass918208616989100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


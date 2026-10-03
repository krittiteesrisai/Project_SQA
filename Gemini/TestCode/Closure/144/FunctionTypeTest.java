package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class FunctionTypeTest {

    private JSTypeRegistry registry;
    private ErrorReporter errorReporter;

    @Before
    public void setUp() {
        errorReporter = new SimpleErrorReporter();
        registry = new JSTypeRegistry(errorReporter);
    }

    @Test
    public void testConstructorAndBasicGetters() {
        Node source = new Node(Token.FUNCTION);
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        
        FunctionType ctorFunc = new FunctionType(
                registry, "MyCtor", source, arrowType, null, "T", true, false
        );

        assertTrue(ctorFunc.isConstructor());
        assertFalse(ctorFunc.isInterface());
        assertFalse(ctorFunc.isOrdinaryFunction());
        assertTrue(ctorFunc.isFunctionType());
        assertTrue(ctorFunc.canBeCalled());
        assertTrue(ctorFunc.hasInstanceType());
        assertEquals(source, ctorFunc.getSource());
        assertEquals("T", ctorFunc.getTemplateTypeName());
        assertNotNull(ctorFunc.getInstanceType());
    }

    @Test
    public void testInterfaceFunction() {
        Node source = new Node(Token.FUNCTION);
        FunctionType ifaceFunc = FunctionType.forInterface(registry, "MyInterface", source);

        assertTrue(ifaceFunc.isInterface());
        assertFalse(ifaceFunc.isConstructor());
        assertFalse(ifaceFunc.isOrdinaryFunction());
        assertEquals("MyInterface", ifaceFunc.getReferenceName());
        assertNotNull(ifaceFunc.getPrototype());
    }

    @Test
    public void testOrdinaryFunctionArguments() {
        // Build parameters: arg1 (normal), arg2 (optional), arg3 (varargs)
        Node lp = new Node(Token.LP);
        Node arg1 = Node.newString(Token.NAME, "a");
        Node arg2 = Node.newString(Token.NAME, "b");
        arg2.setOptionalArg(true);
        Node arg3 = Node.newString(Token.NAME, "c");
        arg3.setVarArgs(true);

        lp.addChildToBack(arg1);
        lp.addChildToBack(arg2);
        lp.addChildToBack(arg3);

        ArrowType arrowType = new ArrowType(registry, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType ordFunc = new FunctionType(
                registry, "OrdFunc", null, arrowType, null, null, false, false
        );

        // Min arguments should count non-optional, non-varargs = 1 (arg1)
        assertEquals(1, ordFunc.getMinArguments());
        // Max arguments should be Integer.MAX_VALUE because of varargs
        assertEquals(Integer.MAX_VALUE, ordFunc.getMaxArguments());
        assertNotNull(ordFunc.getParametersNode());
        assertFalse(Iterables.isEmpty(ordFunc.getParameters()));
    }

    @Test
    public void testMaxArgumentsWithoutVarArgs() {
        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "a"));
        lp.addChildToBack(Node.newString(Token.NAME, "b"));

        ArrowType arrowType = new ArrowType(registry, lp, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType ordFunc = new FunctionType(
                registry, "OrdFunc", null, arrowType, null, null, false, false
        );

        assertEquals(2, ordFunc.getMaxArguments());
    }

    @Test
    public void testEmptyParametersArguments() {
        ArrowType arrowType = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType ordFunc = new FunctionType(
                registry, "EmptyFunc", null, arrowType, null, null, false, false
        );

        assertEquals(0, ordFunc.getMinArguments());
        assertEquals(Integer.MAX_VALUE, ordFunc.getMaxArguments());
        assertTrue(Iterables.isEmpty(ordFunc.getParameters()));
        assertNull(ordFunc.getParametersNode());
    }

    @Test
    public void testGetPropertyTypeCallAndApply() {
        // Test "call" property lazy initialization with parameters
        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "x"));
        ArrowType arrowType = new ArrowType(registry, lp, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType func = new FunctionType(
                registry, "FuncCall", null, arrowType, null, null, false, false
        );

        JSType callProp = func.getPropertyType("call");
        assertNotNull(callProp);

        // Test "apply" property lazy initialization
        JSType applyProp = func.getPropertyType("apply");
        assertNotNull(applyProp);

        // Test "prototype" property
        JSType protoProp = func.getPropertyType("prototype");
        assertNotNull(protoProp);
    }

    @Test
    public void testGetPropertyTypeCallWithoutParams() {
        ArrowType arrowType = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType func = new FunctionType(
                registry, "FuncNoParams", null, arrowType, null, null, false, false
        );

        JSType callProp = func.getPropertyType("call");
        assertNotNull(callProp);
    }

    @Test
    public void testIsEquivalentTo() {
        ArrowType arrowType1 = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType func1 = new FunctionType(registry, "F1", null, arrowType1, null, null, false, false);
        FunctionType func2 = new FunctionType(registry, "F2", null, arrowType1, null, null, false, false);

        assertFalse(func1.isEquivalentTo(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        assertTrue(func1.isEquivalentTo(func1));

        // Interfaces equivalence by reference name
        FunctionType iface1 = FunctionType.forInterface(registry, "I1", null);
        FunctionType iface2 = FunctionType.forInterface(registry, "I1", null);
        FunctionType iface3 = FunctionType.forInterface(registry, "I2", null);
        assertTrue(iface1.isEquivalentTo(iface2));
        assertFalse(iface1.isEquivalentTo(iface3));
        assertFalse(iface1.isEquivalentTo(func1));
    }

    @Test
    public void testIsSubtype() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType func1 = new FunctionType(registry, "F1", null, arrowType, null, null, false, false);
        FunctionType iface = FunctionType.forInterface(registry, "I1", null);

        // Any function can be assigned to an interface function
        assertTrue(func1.isSubtype(iface));
        // An interface function cannot be assigned to ordinary/other functions
        assertFalse(iface.isSubtype(func1));

        // Union type subtype check
        JSType unionType = new UnionType(registry, Arrays.asList(func1, registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        assertTrue(func1.isSubtype(unionType));
    }

    @Test
    public void testSupAndInfHelper() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType func1 = new FunctionType(registry, "F1", null, arrowType, null, null, false, false);
        FunctionType func2 = new FunctionType(registry, "F2", null, arrowType, null, null, false, false);

        JSType leastSuper = func1.getLeastSupertype(func2);
        assertNotNull(leastSuper);

        JSType greatestSub = func1.getGreatestSubtype(func2);
        assertNotNull(greatestSub);

        // Non-function type interaction
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType leastSuperNonFunc = func1.getLeastSupertype(numType);
        assertNotNull(leastSuperNonFunc);
    }

    @Test
    public void testImplementedInterfacesAndSubTypes() {
        FunctionType ctor = new FunctionType(
                registry, "Ctor", null,
                new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE)),
                null, null, true, false
        );

        ObjectType ifaceObj = FunctionType.forInterface(registry, "TestIface", null).getInstanceType();
        ctor.setImplementedInterfaces(Collections.singletonList(ifaceObj));
        
        assertNotNull(ctor.getImplementedInterfaces());
        assertNotNull(ctor.getAllImplementedInterfaces());
    }

    @Test
    public void testToStringAndDebugHashCode() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType func = new FunctionType(registry, "ToStringFunc", null, arrowType, null, null, false, false);

        assertNotNull(func.toString());
        assertNotNull(func.toDebugHashCodeString());
    }
}
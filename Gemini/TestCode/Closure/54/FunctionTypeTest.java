package com.google.javascript.rhino.jstype;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FunctionTypeTest {

    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int character) {}
            @Override
            public void error(String message, String sourceName, int line, int character) {}
        });
    }

    @Test
    public void testOrdinaryFunctionCreationAndProperties() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn = new FunctionType(
                registry, "myFunc", null, arrowType, null, null, false, false
        );

        assertTrue(fn.isOrdinaryFunction());
        assertFalse(fn.isConstructor());
        assertFalse(fn.isInterface());
        assertTrue(fn.canBeCalled());
        assertEquals(0, fn.getMinArguments());
        assertEquals(0, fn.getMaxArguments());
        assertNotNull(fn.getPrototype());
        assertNotNull(fn.getOwnPropertyNames());
    }

    @Test
    public void testConstructorFunctionEdges() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType ctor = new FunctionType(
                registry, "MyCtor", null, arrowType, null, null, true, false
        );

        assertTrue(ctor.isConstructor());
        assertFalse(ctor.isOrdinaryFunction());
        assertTrue(ctor.hasInstanceType());
        assertNotNull(ctor.getInstanceType());
        assertNull(ctor.getSuperClassConstructor());
    }

    @Test
    public void testInterfaceFunctionCreation() {
        FunctionType iface = FunctionType.forInterface(registry, "MyInterface", null);

        assertTrue(iface.isInterface());
        assertFalse(iface.isConstructor());
        assertTrue(iface.hasInstanceType());
        assertEquals("MyInterface", iface.getReferenceName());
        assertEquals(0, iface.getExtendedInterfacesCount());
    }

    @Test
    public void testArgumentsHandlingMinMax() {
        Node params = new Node(Token.LP);
        Node reqArg = Node.newString(Token.NAME, "req");
        Node optArg = Node.newString(Token.NAME, "opt");
        optArg.setOptionalArg(true);
        Node varArg = Node.newString(Token.NAME, "var");
        varArg.setVarArgs(true);

        params.addChildToBack(reqArg);
        params.addChildToBack(optArg);
        params.addChildToBack(varArg);

        ArrowType arrowType = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn = new FunctionType(
                registry, "funcWithArgs", null, arrowType, null, null, false, false
        );

        assertEquals(1, fn.getMinArguments());
        assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());
    }

    @Test
    public void testMaxArgumentsWithoutVarArgs() {
        Node params = new Node(Token.LP);
        params.addChildToBack(Node.newString(Token.NAME, "arg1"));
        params.addChildToBack(Node.newString(Token.NAME, "arg2"));

        ArrowType arrowType = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn = new FunctionType(
                registry, "funcFixedArgs", null, arrowType, null, null, false, false
        );

        assertEquals(2, fn.getMinArguments());
        assertEquals(2, fn.getMaxArguments());
    }

    @Test
    public void testGetPropertyTypeCallAndApply() {
        ArrowType arrowType = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn = new FunctionType(
                registry, "funcCallApply", null, arrowType, null, null, false, false
        );

        JSType callProp = fn.getPropertyType("call");
        assertNotNull(callProp);

        JSType applyProp = fn.getPropertyType("apply");
        assertNotNull(applyProp);
    }

    @Test
    public void testGetPropertyTypeCallWithParams() {
        Node params = new Node(Token.LP);
        params.addChildToBack(Node.newString(Token.NAME, "arg1"));

        ArrowType arrowType = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn = new FunctionType(
                registry, "funcCallWithParams", null, arrowType, null, null, false, false
        );

        JSType callProp = fn.getPropertyType("call");
        assertNotNull(callProp);
    }

    @Test
    public void testSetPrototypeEdges() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType ctor = new FunctionType(
                registry, "MyCtor2", null, arrowType, null, null, true, false
        );

        // Null prototype should return false
        assertFalse(ctor.setPrototype(null));

        // Prototype equals instance type for constructor should return false
        assertFalse(ctor.setPrototype((PrototypeObjectType) ctor.getInstanceType()));
    }

    @Test
    public void testImplementedInterfacesBranch() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn = new FunctionType(
                registry, "fnWithoutInterfaces", null, arrowType, null, null, false, false
        );

        assertFalse(fn.hasImplementedInterfaces());
        
        // Test setImplementedInterfaces and getAllImplementedInterfaces
        FunctionType iface = FunctionType.forInterface(registry, "TestIface", null);
        fn.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));
        assertTrue(fn.hasImplementedInterfaces());
        assertNotNull(fn.getAllImplementedInterfaces());
    }

    @Test
    public void testIsSubtypeBranches() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn1 = new FunctionType(registry, "fn1", null, arrowType, null, null, false, false);
        FunctionType fn2 = new FunctionType(registry, "fn2", null, arrowType, null, null, false, false);

        FunctionType iface = FunctionType.forInterface(registry, "SubIface", null);

        // Any function can be assigned to an interface function (returns true)
        assertTrue(fn1.isSubtype(iface));

        // An interface function cannot be assigned to anything (returns false)
        assertFalse(iface.isSubtype(fn1));

        // Same function is subtype of itself
        assertTrue(fn1.isSubtype(fn1));
    }

    @Test
    public void testToStringAndDebugHashCode() {
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn = new FunctionType(registry, "toStringFn", null, arrowType, null, null, false, false);

        assertNotNull(fn.toString());
        assertNotNull(fn.toDebugHashCodeString());
    }
}
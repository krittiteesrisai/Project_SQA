package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class FunctionTypeTest {

    private JSTypeRegistry registry;
    private FunctionType ordinaryFunc;
    private FunctionType constructorFunc;
    private FunctionType interfaceFunc;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(null);
        
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        ordinaryFunc = new FunctionType(registry, "ordinary", null, arrow, null, null, false, false);
        constructorFunc = new FunctionType(registry, "ctor", null, arrow, null, null, true, false);
        interfaceFunc = FunctionType.forInterface(registry, "Iface", new Node(Token.FUNCTION));
    }

    @Test
    public void testIsEquivalentTo_EdgeCases() {
        assertFalse(ordinaryFunc.isEquivalentTo(registry.getNativeType(JSTypeNative.OBJECT_TYPE)));
        
        // Constructor equivalence
        assertTrue(constructorFunc.isEquivalentTo(constructorFunc));
        FunctionType constructorFunc2 = new FunctionType(registry, "ctor2", null, 
            new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE)), 
            null, null, true, false);
        assertFalse(constructorFunc.isEquivalentTo(constructorFunc2));

        // Interface equivalence
        FunctionType interfaceFunc2 = FunctionType.forInterface(registry, "Iface", new Node(Token.FUNCTION));
        FunctionType interfaceFuncDiff = FunctionType.forInterface(registry, "DiffIface", new Node(Token.FUNCTION));
        assertTrue(interfaceFunc.isEquivalentTo(interfaceFunc2));
        assertFalse(interfaceFunc.isEquivalentTo(interfaceFuncDiff));
        assertFalse(interfaceFunc.isEquivalentTo(ordinaryFunc));
        assertFalse(ordinaryFunc.isEquivalentTo(interfaceFunc));
    }

    @Test
    public void testIsSubtype_Branches() {
        // Interface subtyping
        assertTrue(ordinaryFunc.isSubtype(interfaceFunc));
        assertFalse(interfaceFunc.isSubtype(ordinaryFunc));

        // Ordinary function subtyping
        ArrowType arrow2 = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType ordinaryFunc2 = new FunctionType(registry, "ordinary2", null, arrow2, null, null, false, false);
        assertTrue(ordinaryFunc.isSubtype(ordinaryFunc2));
    }

    @Test
    public void testSupAndInfHelper_Merging() {
        ArrowType arrow1 = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        ArrowType arrow2 = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        
        FunctionType f1 = new FunctionType(registry, "f1", null, arrow1, null, null, false, false);
        FunctionType f2 = new FunctionType(registry, "f2", null, arrow2, null, null, false, false);

        JSType leastSuper = f1.getLeastSupertype(f2);
        assertNotNull(leastSuper);

        JSType greatestSub = f1.getGreatestSubtype(f2);
        assertNotNull(greatestSub);

        // Equivalent types in supAndInfHelper
        assertEquals(f1, f1.getLeastSupertype(f1));
    }

    @Test
    public void testGetPropertyType_LazyInitialization() {
        // Test "prototype"
        assertNotNull(ordinaryFunc.getPropertyType("prototype"));

        // Test "call" with null parameters
        JSType callPropNullParams = ordinaryFunc.getPropertyType("call");
        assertNotNull(callPropNullParams);

        // Test "call" with non-null parameters
        Node paramNode = new Node(Token.LP, Node.newString(Token.NAME, "arg1"));
        ArrowType arrowWithParams = new ArrowType(registry, paramNode, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType funcWithParams = new FunctionType(registry, "funcParams", null, arrowWithParams, null, null, false, false);
        assertNotNull(funcWithParams.getPropertyType("call"));

        // Test "apply"
        assertNotNull(ordinaryFunc.getPropertyType("apply"));

        // Test standard property fallback
        assertNotNull(ordinaryFunc.getPropertyType("nonExistentProp"));
    }

    @Test
    public void testArgumentsAndMinMax() {
        Node params = new Node(Token.LP);
        Node reqArg = Node.newString(Token.NAME, "req");
        Node optArg = Node.newString(Token.NAME, "opt");
        optArg.setOptionalArg(true);
        
        params.addChildToBack(reqArg);
        params.addChildToBack(optArg);

        ArrowType arrow = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType func = new FunctionType(registry, "fnArgs", null, arrow, null, null, false, false);

        assertEquals(1, func.getMinArguments());
        assertEquals(2, func.getMaxArguments());
    }

    @Test
    public void testDefinePropertyPrototype() {
        ObjectType objType = registry.createAnonymousObjectType();
        boolean defined = ordinaryFunc.defineProperty("prototype", objType, false, false);
        assertTrue(defined);

        // Equivalent prototype
        boolean definedAgain = ordinaryFunc.defineProperty("prototype", ordinaryFunc.getPrototype(), false, false);
        assertTrue(definedAgain);

        // Invalid prototype object type
        boolean definedInvalid = ordinaryFunc.defineProperty("prototype", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, false);
        assertFalse(definedInvalid);
    }
}
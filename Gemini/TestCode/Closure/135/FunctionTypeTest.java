package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class FunctionTypeTest {

    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(new SimpleErrorReporter());
    }

    @Test
    public void testConstructorAndOrdinaryFunctionKinds() {
        Node source = new Node(Token.FUNCTION);
        FunctionType ordinary = new FunctionType(registry, "OrdinaryFn", source, null, null);
        assertFalse(ordinary.isConstructor());
        assertFalse(ordinary.isInterface());
        assertTrue(ordinary.isOrdinaryFunction());
        assertTrue(ordinary.isFunctionType());
        assertTrue(ordinary.canBeCalled());

        FunctionType ctor = new FunctionType(registry, "CtorFn", source, null, null, null, null, true, false);
        assertTrue(ctor.isConstructor());
        assertFalse(ctor.isInterface());
        assertFalse(ctor.isOrdinaryFunction());
        assertTrue(ctor.hasInstanceType());
        assertNotNull(ctor.getInstanceType());

        FunctionType iface = new FunctionType(registry, "IfaceFn", source);
        assertFalse(iface.isConstructor());
        assertTrue(iface.isInterface());
        assertFalse(iface.isOrdinaryFunction());
        assertNull(iface.getParametersNode());
    }

    @Test
    public void testGetMinAndMaxArguments() {
        // ไม่มี parameters
        FunctionType fnNoParams = new FunctionType(registry, "fn1", null, null, null);
        assertEquals(0, fnNoParams.getMinArguments());
        assertEquals(Integer.MAX_VALUE, fnNoParams.getMaxArguments());

        // พารามิเตอร์ปกติ และ VarArgs
        Node params = new Node(Token.LP);
        Node p1 = Node.newString(Token.NAME, "p1");
        Node p2 = Node.newString(Token.NAME, "p2");
        p2.setVarArgs(true);
        params.addChildToBack(p1);
        params.addChildToBack(p2);

        FunctionType fnWithVarArg = new FunctionType(registry, "fn2", null, params, null);
        assertEquals(1, fnWithVarArg.getMinArguments());
        assertEquals(Integer.MAX_VALUE, fnWithVarArg.getMaxArguments());

        // พารามิเตอร์ที่เป็น Optional
        Node paramsOpt = new Node(Token.LP);
        Node p3 = Node.newString(Token.NAME, "p3");
        p3.setOptionalArg(true);
        paramsOpt.addChildToBack(p3);

        FunctionType fnWithOpt = new FunctionType(registry, "fn3", null, paramsOpt, null);
        assertEquals(0, fnWithOpt.getMinArguments());
        assertEquals(1, fnWithOpt.getMaxArguments());
    }

    @Test
    public void testEqualsAndHashCode() {
        Node source = new Node(Token.FUNCTION);
        FunctionType fn1 = new FunctionType(registry, "fn", source, null, null);
        FunctionType fn2 = new FunctionType(registry, "fn", source, null, null);
        FunctionType ctor1 = new FunctionType(registry, "C", source, null, null, null, null, true, false);
        FunctionType ctor2 = new FunctionType(registry, "C", source, null, null, null, null, true, false);
        FunctionType iface1 = new FunctionType(registry, "I", source);
        FunctionType iface2 = new FunctionType(registry, "I", source);
        FunctionType ifaceDifferentName = new FunctionType(registry, "J", source);

        assertFalse(fn1.equals(new Object()));
        assertFalse(fn1.equals(ctor1));
        assertFalse(ctor1.equals(fn1));
        
        // Constructor equals เฉพาะ reference เดียวกัน
        assertTrue(ctor1.equals(ctor1));
        assertFalse(ctor1.equals(ctor2));

        // Interface equals เมื่อ reference Name เหมือนกัน
        assertTrue(iface1.equals(iface2));
        assertFalse(iface1.equals(iface2.getPrototype()));
        assertFalse(iface1.equals(ifaceDifferentName));
        assertFalse(ctor1.equals(iface1));
        assertFalse(iface1.equals(ctor1));

        // Ordinary functions
        assertTrue(fn1.equals(fn2));
        assertNotNull(fn1.hashCode());
        assertNotNull(iface1.hashCode());
    }

    @Test
    public void testGetPropertyTypeSpecialProperties() {
        Node source = new Node(Token.FUNCTION);
        FunctionType fn = new FunctionType(registry, "fn", source, null, null);

        // ทดสอบ property "prototype"
        assertNotNull(fn.getPropertyType("prototype"));
        assertTrue(fn.hasProperty("prototype"));
        assertTrue(fn.isPropertyTypeInferred("prototype"));

        // ทดสอบ property "call" และ "apply" (Lazy evaluation)
        assertNotNull(fn.getPropertyType("call"));
        assertNotNull(fn.getPropertyType("apply"));

        // ทดสอบ "call" แบบมี parameters
        Node params = new Node(Token.LP);
        params.addChildToBack(Node.newString(Token.NAME, "arg1"));
        FunctionType fnWithParams = new FunctionType(registry, "fnParams", source, params, null);
        assertNotNull(fnWithParams.getPropertyType("call"));
    }

    @Test
    public void testDefinePropertyPrototypeEdgeCases() {
        Node source = new Node(Token.FUNCTION);
        FunctionType fn = new FunctionType(registry, "fn", source, null, null);

        // Define prototype ด้วย ObjectType ที่ถูกต้อง
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        assertTrue(fn.defineProperty("prototype", objType, false, false));

        // Define prototype ด้วยค่าที่ไม่ใช่ ObjectType (ควรคืนค่า false)
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(fn.defineProperty("prototype", numberType, false, false));
    }

    @Test
    public void testIsSubtypeVariations() {
        Node source = new Node(Token.FUNCTION);
        FunctionType ordinary = new FunctionType(registry, "ord", source, null, null);
        FunctionType iface = new FunctionType(registry, "iface", source);
        FunctionType ctor = new FunctionType(registry, "ctor", source, null, null, null, null, true, false);

        // เท่ากันเอง
        assertTrue(ordinary.isSubtype(ordinary));

        // Function สามารถกำหนดให้กับ Interface ได้
        assertTrue(ordinary.isSubtype(iface));

        // Interface ไม่สามารถเป็น subtype ของฟังก์ชันปกติได้
        assertFalse(iface.isSubtype(ordinary));

        // ทดสอบ UnionType ใน isSubtype
        UnionType unionType = new UnionType(registry, Arrays.asList(ordinary, ctor));
        assertTrue(ordinary.isSubtype(unionType));
    }

    @Test
    public void testLeastAndGreatestSupertype() {
        Node source = new Node(Token.FUNCTION);
        FunctionType fn1 = new FunctionType(registry, "fn1", source, null, null);
        FunctionType fn2 = new FunctionType(registry, "fn2", source, null, null);
        JSType funcInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);

        assertEquals(fn1, fn1.getLeastSupertype(fn1));
        assertEquals(funcInstance, fn1.getLeastSupertype(funcInstance));
        assertEquals(funcInstance, funcInstance.getLeastSupertype(fn1));
        assertNotNull(fn1.getLeastSupertype(fn2));

        assertEquals(fn1, fn1.getGreatestSubtype(fn1));
        assertEquals(fn1, fn1.getGreatestSubtype(funcInstance));
        assertEquals(funcInstance, funcInstance.getGreatestSubtype(fn1));
        assertNotNull(fn1.getGreatestSubtype(fn2));
    }

    @Test
    public void testToStringFormatting() {
        Node source = new Node(Token.FUNCTION);
        FunctionType fn = new FunctionType(registry, "fn", source, null, null);
        assertNotNull(fn.toString());

        JSType funcInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
        assertEquals("Function", funcInstance.toString());

        // ฟังก์ชันที่มี Parameters และ VarArgs
        Node params = new Node(Token.LP);
        Node p1 = Node.newString(Token.NAME, "p1");
        p1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        params.addChildToBack(p1);
        FunctionType fnParams = new FunctionType(registry, "fnP", source, params, registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        assertNotNull(fnParams.toString());
    }

    @Test
    public void testImplementedInterfacesAndSubTypes() {
        Node source = new Node(Token.FUNCTION);
        FunctionType ctor = new FunctionType(registry, "Ctor", source, null, null, null, null, true, false);
        
        ObjectType ifaceObj = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        ctor.setImplementedInterfaces(Collections.singletonList(ifaceObj));
        assertNotNull(ctor.getImplementedInterfaces());
        assertNotNull(ctor.getAllImplementedInterfaces());

        assertNull(ctor.getSubTypes());
    }
}
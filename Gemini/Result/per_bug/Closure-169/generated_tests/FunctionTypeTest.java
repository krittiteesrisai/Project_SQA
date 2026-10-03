package com.google.javascript.rhino.jstype;

import com.google.common.collect.ImmutableList;
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
    private FunctionType ordinaryFn;
    private FunctionType constructorFn;
    private FunctionType interfaceFn;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(new SimpleErrorReporter());
        
        // สร้าง Ordinary Function
        Node paramList = new Node(Token.PARAM_LIST);
        ArrowType arrowType = new ArrowType(registry, paramList, registry.getNativeType(JSTypeNative.VOID_TYPE));
        ordinaryFn = new FunctionType(
                registry, "ordinaryFn", null, arrowType, null, null, false, false);

        // สร้าง Constructor Function
        constructorFn = new FunctionType(
                registry, "CtorFn", null, arrowType, null, null, true, false);

        // สร้าง Interface Function
        interfaceFn = FunctionType.forInterface(registry, "InterfaceFn", null);
    }

    @Test
    public void testKindGettersAndBasicProperties() {
        assertFalse(ordinaryFn.isConstructor());
        assertFalse(ordinaryFn.isInterface());
        assertTrue(ordinaryFn.isOrdinaryFunction());
        assertTrue(ordinaryFn.canBeCalled());

        assertTrue(constructorFn.isConstructor());
        assertFalse(constructorFn.isInterface());
        assertFalse(constructorFn.isOrdinaryFunction());
        assertTrue(constructorFn.hasInstanceType());

        assertFalse(interfaceFn.isConstructor());
        assertTrue(interfaceFn.isInterface());
        assertFalse(interfaceFn.isOrdinaryFunction());
        assertTrue(interfaceFn.hasInstanceType());
    }

    @Test
    public void testMakesStructsAndDictsEdgeCases() {
        // กรณีไม่ใช่ Constructor จะต้องคืนค่า false เสมอ
        assertFalse(ordinaryFn.makesStructs());
        assertFalse(ordinaryFn.makesDicts());

        // กรณีเป็น Constructor แต่ไม่ได้ตั้งค่า struct/dict
        assertFalse(constructorFn.makesStructs());
        assertFalse(constructorFn.makesDicts());

        // ตั้งค่า Struct และ Dict โดยตรง
        constructorFn.setStruct();
        assertTrue(constructorFn.makesStructs());
        assertFalse(constructorFn.makesDicts());

        constructorFn.setDict();
        assertTrue(constructorFn.makesDicts());
    }

    @Test
    public void testHasImplementedInterfacesBranches() {
        // 1. ไม่มี implementedInterfaces และไม่มี SuperClass
        assertFalse(constructorFn.hasImplementedInterfaces());

        // 2. มี implementedInterfaces แบบกำหนดเอง (ต้องผ่าน setImplementedInterfaces สำหรับ Constructor)
        ObjectType dummyInterface = FunctionType.forInterface(registry, "DummyIface", null);
        constructorFn.setImplementedInterfaces(Collections.singletonList(dummyInterface));
        assertTrue(constructorFn.hasImplementedInterfaces());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetImplementedInterfacesOnOrdinaryFunctionThrowsException() {
        ObjectType dummyInterface = FunctionType.forInterface(registry, "DummyIface", null);
        ordinaryFn.setImplementedInterfaces(Collections.singletonList(dummyInterface));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetExtendedInterfacesOnOrdinaryFunctionThrowsException() {
        ObjectType dummyInterface = FunctionType.forInterface(registry, "DummyIface", null);
        ordinaryFn.setExtendedInterfaces(Collections.singletonList(dummyInterface));
    }

    @Test
    public void testArgumentLimits() {
        // พารามิเตอร์ปกติ, optional, และ varargs
        Node params = new Node(Token.PARAM_LIST);
        Node p1 = Node.newString(Token.NAME, "a");
        Node p2 = Node.newString(Token.NAME, "b");
        p2.setOptionalArg(true);
        Node p3 = Node.newString(Token.NAME, "c");
        p3.setIsVarArgs(true);

        params.addChildToBack(p1);
        params.addChildToBack(p2);
        params.addChildToBack(p3);

        ArrowType arrow = new ArrowType(registry, params, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn = new FunctionType(registry, "fnArgs", null, arrow, null, null, false, false);

        assertEquals(1, fn.getMinArguments()); // นับถึง p1 เพราะ p2 เป็น optional และ p3 เป็น varargs
        assertEquals(Integer.MAX_VALUE, fn.getMaxArguments()); // เพราะมี varargs
    }

    @Test
    public void testGetPropertyTypeLazyGeneration() {
        // ทดสอบ property "call", "bind", และ "apply"
        assertNotNull(ordinaryFn.getPropertyType("call"));
        assertNotNull(ordinaryFn.getPropertyType("bind"));
        assertNotNull(ordinaryFn.getPropertyType("apply"));
        assertNotNull(ordinaryFn.getPropertyType("prototype"));
    }

    @Test
    public void testGetBindReturnType() {
        FunctionType bound = ordinaryFn.getBindReturnType(2);
        assertNotNull(bound);
        assertNotNull(bound.getReturnType());
    }

    @Test
    public void testSupAndInfHelperBranches() {
        // สมมูลกันเอง
        assertEquals(ordinaryFn, ordinaryFn.supAndInfHelper(ordinaryFn, true));

        // เปรียบเทียบกับ Function Instance Type
        JSType funcInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
        assertEquals(funcInstance, ordinaryFn.supAndInfHelper((FunctionType) funcInstance, true));
        assertEquals(ordinaryFn, ((FunctionType) funcInstance).supAndInfHelper(ordinaryFn, true));
    }

    @Test
    public void testCheckFunctionEquivalenceHelper() {
        // Constructor กับ Non-constructor
        assertFalse(constructorFn.checkFunctionEquivalenceHelper(ordinaryFn, false));

        // Interface กับ Interface ที่ชื่อต่างกัน
        FunctionType interfaceFn2 = FunctionType.forInterface(registry, "InterfaceFn2", null);
        assertFalse(interfaceFn.checkFunctionEquivalenceHelper(interfaceFn2, false));
        assertTrue(interfaceFn.checkFunctionEquivalenceHelper(interfaceFn, false));
    }

    @Test
    public void testCloneWithoutArrowType() {
        FunctionType cloned = constructorFn.cloneWithoutArrowType();
        assertNotNull(cloned);
        assertTrue(cloned.isConstructor());
    }

    @Test
    public void testToStringHelperAndDebugHashCode() {
        assertNotNull(ordinaryFn.toString());
        assertNotNull(ordinaryFn.toDebugHashCodeString());
        
        constructorFn.setStruct();
        assertNotNull(constructorFn.toDebugHashCodeString());
    }
}
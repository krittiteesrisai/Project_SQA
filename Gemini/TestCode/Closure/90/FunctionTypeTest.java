package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class FunctionTypeTest {

    private JSTypeRegistry registry;
    private FunctionType ordinaryFunction;
    private FunctionType constructorFunction;
    private FunctionType interfaceFunction;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(new SimpleErrorReporter());
        
        // สร้าง ArrowType พื้นฐานสำหรับทดสอบ
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        
        ordinaryFunction = new FunctionType(
                registry, "ordinaryFn", null, arrowType, null, null, false, false
        );
        
        constructorFunction = new FunctionType(
                registry, "CtorFn", null, arrowType, null, null, true, false
        );

        interfaceFunction = FunctionType.forInterface(registry, "InterfaceFn", null);
    }

    @Test
    public void testGetMinAndMaxArguments_OrdinaryAndEdgeCases() {
        // ทดสอบพารามิเตอร์ปกติ, Optional และ VarArgs
        Node lpNode = new Node(Token.LP);
        Node param1 = Node.newString(Token.NAME, "a");
        Node param2 = Node.newString(Token.NAME, "b");
        param2.setOptionalArg(true);
        Node param3 = Node.newString(Token.NAME, "c");
        param3.setVarArgs(true);

        lpNode.addChildToBack(param1);
        lpNode.addChildToBack(param2);
        lpNode.addChildToBack(param3);

        ArrowType arrowWithParams = new ArrowType(registry, lpNode, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn = new FunctionType(registry, "fnWithParams", null, arrowWithParams, null, null, false, false);

        // Min arguments ควรนับถึงตัวสุดท้ายที่ไม่ใช่ optional และไม่ใช่ varargs (คือ param1 -> min = 1)
        assertEquals(1, fn.getMinArguments());
        // Max arguments ควรเป็น Integer.MAX_VALUE เพราะมี VarArgs
        assertEquals(Integer.MAX_VALUE, fn.getMaxArguments());
    }

    @Test
    public void testGetMaxArguments_NoVarArgs() {
        Node lpNode = new Node(Token.LP);
        Node param1 = Node.newString(Token.NAME, "a");
        lpNode.addChildToBack(param1);

        ArrowType arrow = new ArrowType(registry, lpNode, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fn = new FunctionType(registry, "fnFixed", null, arrow, null, null, false, false);

        assertEquals(1, fn.getMinArguments());
        assertEquals(1, fn.getMaxArguments());
        
        // ทดสอบกรณี params เป็น null
        ArrowType arrowNullParams = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fnNullParams = new FunctionType(registry, "fnNull", null, arrowNullParams, null, null, false, false);
        assertEquals(0, fnNullParams.getMinArguments());
        assertEquals(Integer.MAX_VALUE, fnNullParams.getMaxArguments());
    }

    @Test
    public void testIsEquivalentTo_EdgeCases() {
        // เปรียบเทียบกับประเภทที่ไม่ใช่ FunctionType
        JSType notFunction = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(ordinaryFunction.isEquivalentTo(notFunction));

        // Constructor เปรียบเทียบกับตัวเอง
        assertTrue(constructorFunction.isEquivalentTo(constructorFunction));

        // Constructor เปรียบเทียบกับ Constructor อื่น
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType anotherCtor = new FunctionType(registry, "CtorFn2", null, arrowType, null, null, true, false);
        assertFalse(constructorFunction.isEquivalentTo(anotherCtor));
        assertFalse(constructorFunction.isEquivalentTo(ordinaryFunction));

        // Interface เปรียบเทียบกับ Interface (ชื่อเดียวกัน vs ต่างกัน)
        FunctionType interfaceFn2 = FunctionType.forInterface(registry, "InterfaceFn", null);
        FunctionType interfaceFnDiff = FunctionType.forInterface(registry, "DiffInterface", null);
        assertTrue(interfaceFunction.isEquivalentTo(interfaceFn2));
        assertFalse(interfaceFunction.isEquivalentTo(interfaceFnDiff));
        assertFalse(interfaceFunction.isEquivalentTo(ordinaryFunction));
        assertFalse(ordinaryFunction.isEquivalentTo(interfaceFunction));
    }

    @Test
    public void testGetPropertyType_LazyInitialization() {
        // ทดสอบดึง property "prototype"
        assertNotNull(ordinaryFunction.getPropertyType("prototype"));

        // ทดสอบดึง property "call" เมื่อ parameters เป็น null
        ArrowType arrowNullParams = new ArrowType(registry, null, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fnNullParams = new FunctionType(registry, "fnNull", null, arrowNullParams, null, null, false, false);
        assertNotNull(fnNullParams.getPropertyType("call"));

        // ทดสอบดึง property "call" เมื่อมี parameters
        Node lpNode = new Node(Token.LP);
        lpNode.addChildToBack(Node.newString(Token.NAME, "arg1"));
        ArrowType arrowWithParams = new ArrowType(registry, lpNode, registry.getNativeType(JSTypeNative.VOID_TYPE));
        FunctionType fnWithParams = new FunctionType(registry, "fnParams", null, arrowWithParams, null, null, false, false);
        assertNotNull(fnWithParams.getPropertyType("call"));

        // ทดสอบดึง property "apply"
        assertNotNull(ordinaryFunction.getPropertyType("apply"));
    }

    @Test
    public void testIsSubtype_EdgeCases() {
        // Interface สามารถรับฟังก์ชันใดๆ ไปกำหนดค่าได้ (return true)
        assertTrue(ordinaryFunction.isSubtype(interfaceFunction));

        // Interface ไม่สามารถเป็น Subtype ของฟังก์ชันทั่วไปได้ (return false)
        assertFalse(interfaceFunction.isSubtype(ordinaryFunction));

        // ทดสอบ Subtype ระหว่าง Constructor / Ordinary Function
        assertTrue(ordinaryFunction.isSubtype(ordinaryFunction));
    }

    @Test
    public void testDefinePropertyPrototype_EdgeCases() {
        // กำหนด property prototype ด้วย ObjectType ที่เทียบเท่ากัน
        FunctionPrototypeType proto = ordinaryFunction.getPrototype();
        boolean resultSame = ordinaryFunction.defineProperty("prototype", proto, false, false);
        assertTrue(resultSame);

        // กำหนด prototype ด้วยค่าที่ไม่ใช่ ObjectType (เช่น Number)
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        boolean resultInvalid = ordinaryFunction.defineProperty("prototype", numType, false, false);
        assertFalse(resultInvalid);
    }
}
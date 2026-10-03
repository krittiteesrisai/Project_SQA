package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.common.collect.Lists;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Senior Java Test Automation Engineer - JUnit 4 Test Suite for AmbiguateProperties (Closure-134b)
 */
public class AmbiguatePropertiesTest {

    private Compiler compiler;
    private AmbiguateProperties ambiguateProperties;
    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนดค่าเริ่มต้นพื้นฐานสำหรับ Compiler options ถ้าจำเป็น
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        registry = compiler.getTypeRegistry();
        
        char[] reserved = new char[] {'a', 'b'};
        ambiguateProperties = new AmbiguateProperties(compiler, reserved);
    }

    @Test
    public void testProcessWithBasicGetPropAndObjectLit() {
        // ทดสอบกระบวนการ process หลักผ่าน NodeTraversal สำหรับ GETPROP และ OBJECTLIT (unquoted & quoted)
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);

        // สร้าง Node สำหรับ: obj.prop1 = 1;
        Node qName = Node.newString(Token.NAME, "obj");
        qName.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node propNode = Node.newString(Token.STRING, "prop1");
        Node getProp = new Node(Token.GETPROP, qName, propNode);
        getProp.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        root.addChildToBack(getProp);

        // สร้าง Object literal ที่มีคีย์ unquoted และ quoted
        Node objLit = new Node(Token.OBJECTLIT);
        Node keyUnquoted = Node.newString(Token.STRING, "prop2");
        Node valUnquoted = Node.newNumber(10);
        objLit.addChildToBack(keyUnquoted);
        objLit.addChildToBack(valUnquoted);

        Node keyQuoted = Node.newString(Token.STRING, "propQuoted");
        keyQuoted.putBooleanProp(Node.QUOTED_STRING, true);
        Node valQuoted = Node.newNumber(20);
        objLit.addChildToBack(keyQuoted);
        objLit.addChildToBack(valQuoted);
        
        objLit.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        root.addChildToBack(objLit);

        // รันกระบวนการ process
        ambiguateProperties.process(externs, root);

        Map<String, String> renamingMap = ambiguateProperties.getRenamingMap();
        assertNotNull("Renaming map should not be null", renamingMap);
    }

    @Test
    public void testProcessWithGetElemQuotedString() {
        // ทดสอบ Token.GETELEM ที่มีสัญลักษณ์เป็น Token.STRING เพื่อทดสอบการเพิ่ม quotedNames
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);

        Node target = Node.newString(Token.NAME, "obj");
        Node index = Node.newString(Token.STRING, "elemProp");
        Node getElem = new Node(Token.GETELEM, target, index);
        root.addChildToBack(getElem);

        ambiguateProperties.process(externs, root);
        // ตรวจสอบว่าไม่มีข้อผิดพลาดเกิดขึ้นระหว่างการทำงานผ่าน GETELEM branch
    }

    @Test
    public void testSkipAmbiguatingPrefix() throws Exception {
        // ทดสอบกรณี Property ที่ขึ้นต้นด้วย SKIP_PREFIX ("JSAbstractCompiler") ต้องถูกข้ามการทำ Ambiguating
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);

        Node qName = Node.newString(Token.NAME, "obj");
        qName.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node propNode = Node.newString(Token.STRING, AmbiguateProperties.SKIP_PREFIX + "Test");
        Node getProp = new Node(Token.GETPROP, qName, propNode);
        root.addChildToBack(getProp);

        ambiguateProperties.process(externs, root);
        Map<String, String> renamingMap = ambiguateProperties.getRenamingMap();
        
        // ตรวจสอบว่าพร็อพเพอร์ตี้ที่ขึ้นต้นด้วย SKIP_PREFIX จะไม่ถูกเปลี่ยนชื่อใน renamingMap
        assertFalse(renamingMap.containsKey(AmbiguateProperties.SKIP_PREFIX + "Test"));
    }

    @Test
    public void testGetJSTypeWithNullJSTypeFallback() throws Exception {
        // ทดสอบเมธอด getJSType เมื่อ Node ไม่มี JSType (คืนค่า UNKNOWN_TYPE) โดยใช้ Reflection
        Method getJSTypeMethod = AmbiguateProperties.class.getDeclaredMethod("getJSType", Node.class);
        getJSTypeMethod.setAccessible(true);

        Node nodeWithoutType = new Node(Token.NAME, "unknownVar");
        // ไม่กำหนด JSType ให้ node ทำให้เป็น null

        JSType resultType = (JSType) getJSTypeMethod.invoke(ambiguateProperties, nodeWithoutType);
        assertNotNull("Should fallback to UNKNOWN_TYPE when JSType is null", resultType);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), resultType);
    }

    @Test
    public void testIsInvalidatingTypeEdgeCases() throws Exception {
        // ทดสอบเงื่อนไข Invalidating Types ผ่าน Reflection สำหรับ isInvalidatingType
        Method isInvalidatingMethod = AmbiguateProperties.class.getDeclaredMethod("isInvalidatingType", JSType.class);
        isInvalidatingMethod.setAccessible(true);

        // ทดสอบกับ ALL_TYPE ซึ่งเป็นหนึ่งใน invalidatingTypes
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        Boolean isInvalid = (Boolean) isInvalidatingMethod.invoke(ambiguateProperties, allType);
        assertTrue("ALL_TYPE should be an invalidating type", isInvalid);

        // ทดสอบกับ UnionType ที่ประกอบด้วย invalidating types
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        UnionType unionType = new UnionType(registry, Lists.newArrayList(nullType, voidType));
        
        Boolean isUnionInvalid = (Boolean) isInvalidatingMethod.invoke(ambiguateProperties, unionType);
        assertTrue("UnionType of invalidating types should be invalidating", isUnionInvalid);
    }
}
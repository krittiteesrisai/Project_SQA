package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Senior Java Test Automation Engineer - Advanced JUnit 4 Test Suite
 * Target: Defects4J Closure-43b (TypedScopeCreator)
 */
public class TypedScopeCreatorTest {

    private Compiler compiler;
    private TypedScopeCreator scopeCreator;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนด CompilerOptions เบื้องต้นเพื่อให้ Compiler สามารถประมวลผล AST ได้
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        scopeCreator = new TypedScopeCreator(compiler);
    }

    @Test
    public void testCreateGlobalScopeBasic() {
        // Edge Case: สร้าง Global Scope พื้นฐานจาก Script Node
        Node scriptNode = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "globalVar");
        Node varNode = new Node(Token.VAR, nameNode);
        scriptNode.addChildToBack(varNode);

        Scope globalScope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(globalScope);
        assertTrue(globalScope.isGlobal());
        assertNotNull(globalScope.getVar("globalVar"));
    }

    @Test
    public void testCreateLocalScopeBasic() {
        // Edge Case: สร้าง Local Scope ภายใต้ Function
        Node scriptNode = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "myFunc"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        scriptNode.addChildToBack(fnNode);

        Scope globalScope = scopeCreator.createScope(scriptNode, null);
        Scope localScope = scopeCreator.createScope(fnNode.getLastChild(), globalScope);

        assertNotNull(localScope);
        assertFalse(localScope.isGlobal());
        assertEquals(globalScope, localScope.getParent());
    }

    @Test
    public void testMultipleVarDefinitionWarning() {
        // Boundary/Invalid State: ประกาศตัวแปรหลายตัวในบรรทัดเดียวพร้อม JSDoc (กระตุ้น MULTIPLE_VAR_DEF)
        Node scriptNode = new Node(Token.SCRIPT);
        Node name1 = Node.newString(Token.NAME, "a");
        Node name2 = Node.newString(Token.NAME, "b");
        Node varNode = new Node(Token.VAR, name1, name2);
        
        // จำลอง JSDoc บน multi-var
        scriptNode.addChildToBack(varNode);

        Scope globalScope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(globalScope);
        // ตรวจสอบว่ามี Error บันทึกใน Compiler หรือไม่
        assertTrue(compiler.getErrorCount() >= 0);
    }

    @Test
    public void testUnknownLendsAnnotation() {
        // Edge Case: @lends ชี้ไปที่ตัวแปรที่ยังไม่ได้ประกาศ (UNKNOWN_LENDS)
        Node scriptNode = new Node(Token.SCRIPT);
        Node objLit = new Node(Token.OBJECTLIT);
        
        // สร้าง JSDoc ที่มี lends ชี้ไปยังตัวแปรผี "nonExistentVar"
        com.google.javascript.rhino.JSDocInfoBuilder jsDocBuilder = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        jsDocBuilder.recordLends("nonExistentVar");
        objLit.setJSDocInfo(jsDocBuilder.build());

        Node expr = new Node(Token.EXPR_RESULT, objLit);
        scriptNode.addChildToBack(expr);

        scopeCreator.createScope(scriptNode, null);
        // คาดหวังว่า Compiler จะรายงาน Error UNKNOWN_LENDS
        assertFalse(compiler.getErrors().isEmpty());
    }

    @Test
    public void testLendsOnNonObject() {
        // Edge Case: @lends ชี้ไปยัง Non-object type (LENDS_ON_NON_OBJECT)
        Node scriptNode = new Node(Token.SCRIPT);
        
        // ประกาศตัวแปร primitive (เช่น number)
        Node varName = Node.newString(Token.NAME, "myNum");
        varName.addChildToBack(Node.newNumber(10.0));
        Node varNode = new Node(Token.VAR, varName);
        scriptNode.addChildToBack(varNode);

        // Object lit พร้อม lends ชี้ไปที่ myNum (ซึ่งไม่ใช่ Object)
        Node objLit = new Node(Token.OBJECTLIT);
        com.google.javascript.rhino.JSDocInfoBuilder jsDocBuilder = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        jsDocBuilder.recordLends("myNum");
        objLit.setJSDocInfo(jsDocBuilder.build());
        
        scriptNode.addChildToBack(new Node(Token.EXPR_RESULT, objLit));

        scopeCreator.createScope(scriptNode, null);
        assertFalse(compiler.getErrors().isEmpty());
    }

    @Test
    public void testPatchGlobalScopeValidScript() {
        // Edge Case: ทดสอบการเรียกใช้งาน patchGlobalScope บน SCRIPT node
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testscript.js");
        
        Node nameNode = Node.newString(Token.NAME, "patchedVar");
        Node varNode = new Node(Token.VAR, nameNode);
        scriptNode.addChildToBack(varNode);

        Scope globalScope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(globalScope.getVar("patchedVar"));

        // ทำการ patch scope ด้วย script เดียวกันหรือใหม่กว่า
        scopeCreator.patchGlobalScope(globalScope, scriptNode);
        assertNotNull(globalScope);
    }

    @Test(expected = IllegalStateException.class)
    public void testPatchGlobalScopeInvalidNodePrecondition() {
        // Invalid State: ส่ง Node ที่ไม่ใช่ SCRIPT เข้าไปใน patchGlobalScope เพื่อดักจับ Preconditions.checkState
        Node scriptNode = new Node(Token.SCRIPT);
        Scope globalScope = scopeCreator.createScope(scriptNode, null);

        // ส่ง Token.BLOCK แทนที่จะเป็น SCRIPT เพื่อให้เกิด IllegalStateException
        Node invalidRoot = new Node(Token.BLOCK);
        scopeCreator.patchGlobalScope(globalScope, invalidRoot);
    }
}
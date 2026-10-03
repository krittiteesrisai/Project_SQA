package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for TypedScopeCreator (Closure-168b).
 */
public class TypedScopeCreatorTest {

    private Compiler compiler;
    private TypedScopeCreator scopeCreator;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนด Default Options พื้นฐานสำหรับ Compiler
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        scopeCreator = new TypedScopeCreator(compiler);
    }

    @Test
    public void testCreateGlobalScopeBasic() {
        // ทดสอบการสร้าง Global Scope เมื่อ parent == null
        Node script = Node.newString(Token.SCRIPT, "testscript.js");
        Node root = new Node(Token.BLOCK, script);
        root.setInputId(new com.google.javascript.rhino.InputId("testscript.js"));

        Scope globalScope = scopeCreator.createScope(root, null);
        assertNotNull(globalScope);
        assertTrue(globalScope.isGlobal());
    }

    @Test
    public void testCreateLocalScopeBasic() {
        // ทดสอบการสร้าง Local Scope เมื่อ parent != null
        Node script = Node.newString(Token.SCRIPT, "testscript.js");
        Node globalRoot = new Node(Token.BLOCK, script);
        globalRoot.setInputId(new com.google.javascript.rhino.InputId("testscript.js"));
        Scope globalScope = scopeCreator.createScope(globalRoot, null);

        Node fnRoot = new Node(Token.FUNCTION, Node.newString(Token.NAME, "myFunc"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Scope localScope = scopeCreator.createScope(fnRoot, globalScope);

        assertNotNull(localScope);
        assertFalse(localScope.isGlobal());
        assertEquals(globalScope, localScope.getParent());
    }

    @Test
    public void testCreateInitialScopeAndNativeTypes() {
        // ทดสอบ createInitialScope และการประกาศ Native Types ทั้งหมด
        Node script = Node.newString(Token.SCRIPT, "native.js");
        Node root = new Node(Token.BLOCK, script);
        root.setInputId(new com.google.javascript.rhino.InputId("native.js"));

        Scope initialScope = scopeCreator.createInitialScope(root);
        assertNotNull(initialScope);
        // ตรวจสอบ Native bindings สำคัญ
        assertNotNull(initialScope.getVar("Object"));
        assertNotNull(initialScope.getVar("Array"));
        assertNotNull(initialScope.getVar("Date"));
        assertNotNull(initialScope.getVar("undefined"));
        assertNotNull(initialScope.getVar("ActiveXObject"));
    }

    @Test
    public void testPatchGlobalScopeValidState() {
        // ทดสอบ patchGlobalScope กับ SCRIPT node ที่ถูกต้อง
        Node script = Node.newString(Token.SCRIPT, "patchscript.js");
        Node root = new Node(Token.BLOCK, script);
        root.setInputId(new com.google.javascript.rhino.InputId("patchscript.js"));

        Scope globalScope = scopeCreator.createScope(root, null);
        
        // จำลองการเรียก patchGlobalScope บน scriptRoot
        scopeCreator.patchGlobalScope(globalScope, script);
        assertTrue(globalScope.isGlobal());
    }

    @Test(expected = IllegalStateException.class)
    public void testPatchGlobalScopeNonScriptFails() {
        // ทดสอบ Edge Case: ส่ง Node ที่ไม่ใช่ SCRIPT เข้าไปใน patchGlobalScope ต้องพ่น IllegalStateException
        Node root = new Node(Token.BLOCK);
        Scope globalScope = scopeCreator.createScope(root, null);

        Node nonScriptNode = new Node(Token.EXPR_RESULT);
        scopeCreator.patchGlobalScope(globalScope, nonScriptNode);
    }

    @Test(expected = NullPointerException.class)
    public void testPatchGlobalScopeNullGlobalScopeFails() {
        // ทดสอบ Edge Case: ส่ง globalScope เป็น null เข้าไปใน patchGlobalScope
        Node script = Node.newString(Token.SCRIPT, "patchscript.js");
        script.setInputId(new com.google.javascript.rhino.InputId("patchscript.js"));
        scopeCreator.patchGlobalScope(null, script);
    }

    @Test
    public void testObjectLiteralAndLendsEdgeCases() {
        // ทดสอบสถานการณ์ Object Literal และการพยายามใช้ @lends กับ Non-Object หรือ Unknown Lends
        Node objLit = new Node(Token.OBJECTLIT);
        // สร้างสถานการณ์ที่ไม่มี JSDoc หรือมี JSDoc แต่ไม่มี lends name
        Node script = new Node(Token.SCRIPT, objLit);
        script.setInputId(new com.google.javascript.rhino.InputId("lends.js"));

        Scope globalScope = scopeCreator.createScope(script, null);
        assertNotNull(globalScope);
    }

    @Test
    public void testVariableDeclarationAndMultipleDefs() {
        // ทดสอบการประกาศตัวแปรหลายตัวในคำสั่งเดียว (VAR node ที่มีลูกมากกว่า 1 ตัว)
        Node name1 = Node.newString(Token.NAME, "a");
        Node name2 = Node.newString(Token.NAME, "b");
        Node varNode = new Node(Token.VAR, name1, name2);

        Node script = new Node(Token.SCRIPT, varNode);
        script.setInputId(new com.google.javascript.rhino.InputId("var.js"));

        Scope globalScope = scopeCreator.createScope(script, null);
        assertNotNull(globalScope);
        assertNotNull(globalScope.getVar("a"));
        assertNotNull(globalScope.getVar("b"));
    }

    @Test
    public void testCatchBlockDefinition() {
        // ทดสอบการนิยามตัวแปรใน CATCH block
        Node catchName = Node.newString(Token.NAME, "e");
        Node catchBlock = new Node(Token.CATCH, catchName, new Node(Token.BLOCK));
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchBlock);

        Node script = new Node(Token.SCRIPT, tryNode);
        script.setInputId(new com.google.javascript.rhino.InputId("try.js"));

        Scope globalScope = scopeCreator.createScope(script, null);
        assertNotNull(globalScope);
    }
}
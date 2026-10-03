package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for TypedScopeCreator (Closure-17b)
 */
public class TypedScopeCreatorTest {

    private Compiler compiler;
    private TypedScopeCreator scopeCreator;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนด CompilerOptions เบื้องต้นให้เพียงพอต่อการรัน Type check
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        scopeCreator = new TypedScopeCreator(compiler);
    }

    @Test
    public void testGlobalScopeCreationBasic() {
        // ทดสอบการสร้าง Global Scope (parent == null)
        Node root = new Node(Token.SCRIPT);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
    }

    @Test
    public void testLocalScopeCreationBasic() {
        // ทดสอบการสร้าง Local Scope (parent != null)
        Node root = new Node(Token.SCRIPT);
        Scope globalScope = scopeCreator.createScope(root, null);

        Node fnNode = new Node(Token.FUNCTION, new Node(Token.NAME, "myFunc"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Scope localScope = scopeCreator.createScope(fnNode, globalScope);

        assertNotNull(localScope);
        assertFalse(localScope.isGlobal());
        assertEquals(globalScope, localScope.getParent());
    }

    @Test
    public void testPatchGlobalScopeEdgeCase() {
        // ทดสอบ patchGlobalScope เมื่อกำหนด SCRIPT node และ global scope
        Node scriptRoot = new Node(Token.SCRIPT);
        scriptRoot.setInputId(new com.google.javascript.rhino.InputId("testScript"));
        
        Scope globalScope = scopeCreator.createScope(scriptRoot, null);
        
        // เรียกใช้ patchGlobalScope เพื่อทดสอบ branch การลบตัวแปรเก่าและรีทราเวิร์ส
        scopeCreator.patchGlobalScope(globalScope, scriptRoot);
        assertTrue(globalScope.isGlobal());
    }

    @Test
    public void testDiscoverEnumsAndTypedefsWithMalformed() {
        // ทดสอบการตรวจจับ Typedef และ Enum ผิดพลาด (MALFORMED_TYPEDEF)
        Node script = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "MyTypedef");
        varNode.addChildToBack(nameNode);
        script.addChildToBack(varNode);

        // จำลอง JSDoc ที่มี typedef แต่ไม่มี type ข้อมูลจริง
        com.google.javascript.rhino.JSDocInfoBuilder jsDocBuilder = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        jsDocBuilder.recordTypedef(null);
        varNode.setJSDocInfo(jsDocBuilder.build());

        Scope scope = scopeCreator.createScope(script, null);
        assertNotNull(scope);
    }

    @Test
    public void testLendsOnNonObjectAndUnknownLends() {
        // ทดสอบ Object literal พร้อม @lends ที่ชี้ไปยังตัวแปรที่ไม่รู้จัก (UNKNOWN_LENDS)
        Node script = new Node(Token.SCRIPT);
        Node objLit = new Node(Token.OBJECTLIT);
        
        com.google.javascript.rhino.JSDocInfoBuilder jsDocBuilder = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        jsDocBuilder.recordLends("UnknownVar");
        objLit.setJSDocInfo(jsDocBuilder.build());

        script.addChildToBack(new Node(Token.EXPR_RESULT, objLit));

        Scope scope = scopeCreator.createScope(script, null);
        assertNotNull(scope);
    }

    @Test
    public void testClassDefiningCallsEdgeCases() {
        // ทดสอบคลาสที่เรียกใช้ระบบ Subclass / Coding Convention
        Node script = new Node(Token.SCRIPT);
        // สร้าง Call node เปล่าๆ เพื่อกระตุ้น checkForClassDefiningCalls
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "goog.inherits"));
        script.addChildToBack(new Node(Token.EXPR_RESULT, callNode));

        Scope scope = scopeCreator.createScope(script, null);
        assertNotNull(scope);
    }

    @Test
    public void testCatchBlockScopeDefinition() {
        // ทดสอบการประกาศตัวแปรใน CATCH block
        Node script = new Node(Token.SCRIPT);
        Node catchNode = new Node(Token.CATCH, new Node(Token.NAME, "e"), new Node(Token.BLOCK));
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchNode);
        script.addChildToBack(tryNode);

        Scope scope = scopeCreator.createScope(script, null);
        assertNotNull(scope);
    }
}
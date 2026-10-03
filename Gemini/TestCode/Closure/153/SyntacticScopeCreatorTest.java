package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Comprehensive JUnit 4 Test Suite for SyntacticScopeCreator (Closure-153b)
 * Aiming for maximum Branch/Condition Coverage and Edge Case validation.
 */
public class SyntacticScopeCreatorTest extends TestCase {

    private Compiler compiler;
    private SyntacticScopeCreator scopeCreator;

    @Before
    public void setUp() throws Exception {
        compiler = new Compiler();
        // กำหนด CompilerOptions พื้นฐานเพื่อป้องกัน NullPointer เมื่อทำการ report error
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        scopeCreator = new SyntacticScopeCreator(compiler);
    }

    @Test
    public void testGlobalScopeCreation() {
        // ทดสอบ SCRIPT และ Global Block (parent == null)
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Scope scope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
        assertNull(scope.getParent());
    }

    @Test
    public void testVarDeclarationInScript() {
        // ทดสอบ Token.VAR ภายใน SCRIPT (ประกาศตัวแปรหลายตัว: var x, y;)
        Node varNode = new Node(Token.VAR, 
            Node.newString(Token.NAME, "x"), 
            Node.newString(Token.NAME, "y")
        );
        Node scriptNode = new Node(Token.SCRIPT, varNode);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Scope scope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(scope.getVar("x"));
        assertNotNull(scope.getVar("y"));
    }

    @Test
    public void testFunctionDeclarationAndArguments() {
        // ทดสอบ Function Statement และ Arguments (Token.FUNCTION, Token.LP, Parameters)
        Node fnNameNode = Node.newString(Token.NAME, "myFunc");
        Node argsNode = new Node(Token.LP, Node.newString(Token.NAME, "arg1"));
        Node bodyNode = new Node(Token.BLOCK, new Node(Token.RETURN));
        
        Node fnNode = new Node(Token.FUNCTION, fnNameNode, argsNode, bodyNode);
        fnNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Scope globalScope = scopeCreator.createScope(new Node(Token.SCRIPT), null);
        Scope fnScope = scopeCreator.createScope(fnNode, globalScope);

        assertNotNull(fnScope);
        assertTrue(fnScope.isLocal());
        assertNotNull(fnScope.getVar("myFunc"));
        assertNotNull(fnScope.getVar("arg1"));
        assertNotNull(fnScope.getVar("arguments")); // Special arguments variable
    }

    @Test
    public void testFunctionExpressionNoBleed() {
        // ทดสอบ Function Expression (ชื่อฟังก์ชันจะไม่ถูกประกาศในสโคปหลักถ้าเป็น Expression)
        Node fnNameNode = Node.newString(Token.NAME, "exprFunc");
        Node argsNode = new Node(Token.LP);
        Node bodyNode = new Node(Token.BLOCK);
        
        Node fnNode = new Node(Token.FUNCTION, fnNameNode, argsNode, bodyNode);
        // ทำให้เป็น Function Expression โดยการห่อหุ้มหรือเซ็ตบริบท (จำลองผ่าน NodeUtil หรือโครงสร้าง)
        // ในที่นี้ทดสอบผ่านการส่งเข้าไปในโครงสร้างที่ NodeUtil.isFunctionExpression ให้ค่า true หรือจำลองเคส
        Node exprNode = new Node(Token.EXPR_RESULT, fnNode);
        Node scriptNode = new Node(Token.SCRIPT, exprNode);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Scope scope = scopeCreator.createScope(scriptNode, null);
        // Function expression name shouldn't bleed into global scope
        assertNull(scope.getVar("exprFunc"));
    }

    @Test
    public void testCatchBlockDeclaration() {
        // ทดสอบ Token.CATCH และตัวแปรใน Catch clause
        Node catchVar = Node.newString(Token.NAME, "e");
        Node catchBlock = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH, catchVar, catchBlock);
        
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchNode, new Node(Token.BLOCK));
        Node scriptNode = new Node(Token.SCRIPT, tryNode);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Scope scope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(scope.getVar("e"));
    }

    @Test
    public void testGlobalVariableMultiplyDeclaredError() {
        // ทดสอบ Rededlaration Error ที่ Global Scope (VAR_MULTIPLY_DECLARED_ERROR)
        Node var1 = Node.newString(Token.NAME, "dupVar");
        Node var2 = Node.newString(Token.NAME, "dupVar");
        
        Node stmt1 = new Node(Token.VAR, var1);
        Node stmt2 = new Node(Token.VAR, var2);

        Node scriptNode = new Node(Token.SCRIPT, stmt1, stmt2);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        scopeCreator.createScope(scriptNode, null);
        // ตรวจสอบว่า Compiler ทำการ Report Error ออกมา
        assertEquals(1, compiler.getErrorCount());
        assertTrue(compiler.getErrors()[0].description.contains("Variable dupVar first declared"));
    }

    @Test
    public void testGlobalVariableMultiplyDeclaredWithSuppression() {
        // ทดสอบการประกาศตัวแปรซ้ำ แต่มี JSDoc @suppress {duplicate}
        Node var1 = Node.newString(Token.NAME, "dupVar");
        Node var2 = Node.newString(Token.NAME, "dupVar");
        
        JSDocInfo info = new JSDocInfo();
        info.addSuppression("duplicate");
        var2.setJSDocInfo(info);

        Node stmt1 = new Node(Token.VAR, var1);
        Node stmt2 = new Node(Token.VAR, var2);

        Node scriptNode = new Node(Token.SCRIPT, stmt1, stmt2);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        scopeCreator.createScope(scriptNode, null);
        // ต้องไม่มี Error เกิดขึ้นเพราะถูก Suppress ไว้
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testCatchVariableMultiplyDeclaredInGlobal() {
        // ทดสอบเคสพิเศษ: Catch ซ้อน Catch ใน Global Scope (อนุญาตให้ซ้ำกันได้ตามเงื่อนไขโค้ด)
        Node catchVar1 = Node.newString(Token.NAME, "err");
        Node catchNode1 = new Node(Token.CATCH, catchVar1, new Node(Token.BLOCK));
        
        Node catchVar2 = Node.newString(Token.NAME, "err");
        Node catchNode2 = new Node(Token.CATCH, catchVar2, new Node(Token.BLOCK));

        Node try1 = new Node(Token.TRY, new Node(Token.BLOCK), catchNode1, new Node(Token.BLOCK));
        Node try2 = new Node(Token.TRY, new Node(Token.BLOCK), catchNode2, new Node(Token.BLOCK));

        Node scriptNode = new Node(Token.SCRIPT, try1, try2);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        scopeCreator.createScope(scriptNode, null);
        // Catch variables sharing the same name in global scope catch blocks should not trigger error
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testArgumentsShadowingError() {
        // ทดสอบการพยายาม Shadowing ตัวแปร "arguments" ใน Local Scope (VAR_ARGUMENTS_SHADOWED_ERROR)
        Node fnNameNode = Node.newString(Token.NAME, "f");
        Node argsNode = new Node(Token.LP);
        // กำหนดให้มีการประกาศตัวแปรชื่อ "arguments" ภายในฟังก์ชัน (ไม่ใช่รูปแบบ var declaration ปกติ)
        Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "arguments"), Node.newNumber(1));
        Node bodyNode = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, assignNode));
        
        Node fnNode = new Node(Token.FUNCTION, fnNameNode, argsNode, bodyNode);
        fnNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Scope globalScope = scopeCreator.createScope(new Node(Token.SCRIPT), null);
        scopeCreator.createScope(fnNode, globalScope);

        assertEquals(1, compiler.getErrorCount());
        assertTrue(compiler.getErrors()[0].description.contains("Shadowing \"arguments\" is not allowed"));
    }
}
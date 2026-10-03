package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for TypedScopeCreator (Defects4J Closure-95b).
 */
public class TypedScopeCreatorTest extends TestCase {

    private Compiler compiler;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        compiler = new Compiler();
        // ตั้งค่า Compiler Options พื้นฐานให้พร้อมใช้งาน
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
    }

    @Test
    public void testGlobalScopeCreation() {
        // Trigger Global Scope Branch (parent == null)
        Node root = new Node(Token.SCRIPT);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
        // ตรวจสอบ Native object ที่ถูกประกาศใน Initial Scope
        assertNotNull(scope.getVar("Object"));
        assertNotNull(scope.getVar("Array"));
    }

    @Test
    public void testLocalScopeCreation() {
        // Trigger Local Scope Branch (parent != null)
        Node globalRoot = new Node(Token.SCRIPT);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope globalScope = creator.createScope(globalRoot, null);

        // สร้าง Function node สำหรับ Local Scope
        Node fnName = Node.newString(Token.NAME, "myFunc");
        Node fnParams = new Node(Token.LP);
        Node fnBody = new Node(Token.BLOCK);
        Node fnNode = new Node(Token.FUNCTION, fnName, fnParams, fnBody);
        
        globalRoot.addChildToBack(fnNode);

        Scope localScope = creator.createScope(fnNode, globalScope);
        assertNotNull(localScope);
        assertFalse(localScope.isGlobal());
    }

    @Test
    public void testMalformedTypedefEdgeCase() {
        // Trigger MALFORMED_TYPEDEF diagnostic error handling
        CompilerInput input = new CompilerInput(SourceFile.fromCode("testcode", "var /** @typedef */ x;"));
        compiler.addJSInput(input);
        Node root = input.getAstRoot(compiler);

        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);

        assertNotNull(scope);
        // ตรวจสอบว่า Compiler ทำการบันทึก Error เมื่อ Typedef ไม่มี Type ข้อมูล
        assertTrue("Should report warnings for malformed typedef", compiler.getErrorCount() > 0 || compiler.getWarningCount() > 0);
    }

    @Test
    public void testEnumInitializerErrorEdgeCase() {
        // Trigger ENUM_INITIALIZER diagnostic error when enum initializer is invalid
        CompilerInput input = new CompilerInput(SourceFile.fromCode("testcode", "var /** @enum {string} */ x = 123;"));
        compiler.addJSInput(input);
        Node root = input.getAstRoot(compiler);

        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        creator.createScope(root, null);

        // ค่าพรีมิทีฟ (123) ไม่ใช่ออบเจกต์หรือ enum ที่ถูกต้อง ควรแจ้งเตือน ENUM_INITIALIZER
        assertTrue(compiler.getErrorCount() > 0 || compiler.getWarningCount() > 0);
    }

    @Test
    public void testPrototypePropertyOwnerEdgeCase() {
        // Trigger GETPROP prototype property mapping branches
        String code = "function Foo() {} Foo.prototype.bar = function() {};";
        CompilerInput input = new CompilerInput(SourceFile.fromCode("testcode", code));
        compiler.addJSInput(input);
        Node root = input.getAstRoot(compiler);

        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);

        assertNotNull(scope);
        // ตรวจสอบว่า Prototype และ Method ถูกประมวลผล
        assertNotNull(scope.getVar("Foo"));
        assertNotNull(scope.getVar("Foo.prototype"));
    }

    @Test
    public void testFunctionWithInnerScopeAndParameters() {
        // Trigger LocalScopeBuilder handleFunctionInputs and declareArguments
        String code = "function testArgs(a, b) { var c = a + b; }";
        CompilerInput input = new CompilerInput(SourceFile.fromCode("testcode", code));
        compiler.addJSInput(input);
        Node root = input.getAstRoot(compiler);

        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);

        assertNotNull(scope);
        Var fnVar = scope.getVar("testArgs");
        assertNotNull(fnVar);
    }
}
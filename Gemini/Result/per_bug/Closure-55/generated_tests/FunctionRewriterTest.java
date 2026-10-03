package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for FunctionRewriter (Closure-55b)
 */
public class FunctionRewriterTest {

    private Compiler compiler;
    private FunctionRewriter rewriter;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนด Mock/Default Options พื้นฐานให้ Compiler ทำงานได้โดยไม่ NullPointer
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        rewriter = new FunctionRewriter(compiler);
    }

    @Test
    public void testEmptyFunctionReducer_Match() {
        // function() {}
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        Node lp = new Node(Token.LP);
        fn.addChildToBack(lp);
        Node body = new Node(Token.BLOCK);
        fn.addChildToBack(body);

        FunctionRewriter.EmptyFunctionReducer reducer = new FunctionRewriter.EmptyFunctionReducer();
        Node result = reducer.reduce(fn);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
        assertEquals("JSCompiler_emptyFn", result.getFirstChild().getString());
    }

    @Test
    public void testEmptyFunctionReducer_NoMatch() {
        // function() { return 1; } -> ไม่ใช่ empty function
        Node fn = createSingleReturnFunction(Token.NUMBER, "1");
        FunctionRewriter.EmptyFunctionReducer reducer = new FunctionRewriter.EmptyFunctionReducer();
        Node result = reducer.reduce(fn);

        assertEquals(fn, result);
    }

    @Test
    public void testIdentityReducer_Match() {
        // function(a) { return a; }
        Node fn = createIdentityFunction("a");
        FunctionRewriter.IdentityReducer reducer = new FunctionRewriter.IdentityReducer();
        Node result = reducer.reduce(fn);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
        assertEquals("JSCompiler_identityFn", result.getFirstChild().getString());
    }

    @Test
    public void testIdentityReducer_NoMatchDifferentName() {
        // function(a) { return b; }
        Node fn = createIdentityFunction("b"); // แต่พารามิเตอร์คือ a
        FunctionRewriter.IdentityReducer reducer = new FunctionRewriter.IdentityReducer();
        Node result = reducer.reduce(fn);

        assertEquals(fn, result);
    }

    @Test
    public void testReturnConstantReducer_Match() {
        // function() { return 42; }
        Node fn = createSingleReturnFunction(Token.NUMBER, "42");
        FunctionRewriter.ReturnConstantReducer reducer = new FunctionRewriter.ReturnConstantReducer();
        Node result = reducer.reduce(fn);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
        assertEquals("JSCompiler_returnArg", result.getFirstChild().getString());
    }

    @Test
    public void testReturnConstantReducer_NoMatchNonImmutable() {
        // function() { return x; } (x ไม่ใช่ immutable value)
        Node nameNode = Node.newString(Token.NAME, "x");
        Node fn = createSingleReturnFunctionNode(nameNode);
        FunctionRewriter.ReturnConstantReducer reducer = new FunctionRewriter.ReturnConstantReducer();
        Node result = reducer.reduce(fn);

        assertEquals(fn, result);
    }

    @Test
    public void testGetterReducer_Match() {
        // function() { return this.foo_; }
        Node getProp = new Node(Token.GETPROP, 
            new Node(Token.THIS), 
            Node.newString(Token.STRING, "foo_")
        );
        Node fn = createSingleReturnFunctionNode(getProp);
        
        FunctionRewriter.GetterReducer reducer = new FunctionRewriter.GetterReducer();
        Node result = reducer.reduce(fn);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
        assertEquals("JSCompiler_get", result.getFirstChild().getString());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetterReducer_InvalidPropTypeThrowsException() {
        // จำลองสถานการณ์ Edge Case ที่ได้ Token ไม่ใช่ STRING (เช่น COMPUTED property)
        Node getProp = new Node(Token.GETPROP, 
            new Node(Token.THIS), 
            new Node(Token.NUMBER, "123")
        );
        Node fn = createSingleReturnFunctionNode(getProp);

        FunctionRewriter.GetterReducer reducer = new FunctionRewriter.GetterReducer();
        reducer.reduce(fn); // ควรโยน IllegalStateException ดักจับ Fault ของ Defects4J
    }

    @Test
    public void testSetterReducer_Match() {
        // function(val) { this.foo_ = val; }
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        
        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "val"));
        fn.addChildToBack(lp);

        Node body = new Node(Token.BLOCK);
        Node assign = new Node(Token.ASSIGN,
            new Node(Token.GETPROP, new Node(Token.THIS), Node.newString(Token.STRING, "foo_")),
            Node.newString(Token.NAME, "val")
        );
        Node expr = new Node(Token.EXPR_RESULT, assign);
        body.addChildToBack(expr);
        fn.addChildToBack(body);

        FunctionRewriter.SetterReducer reducer = new FunctionRewriter.SetterReducer();
        Node result = reducer.reduce(fn);

        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
        assertEquals("JSCompiler_set", result.getFirstChild().getString());
    }

    @Test
    public void testProcess_EmptyReductionsAndHelperNull() {
        // ทดสอบกระบวนการ process() เมื่อ AST ไม่มีฟังก์ชันที่ลดรูปได้ (Reductions ว่างเปล่า)
        Node root = new Node(Token.BLOCK);
        rewriter.process(null, root);
        assertTrue(true); // ผ่านโดยไม่มี Exception
    }

    // --- Helper Methods สำหรับสร้าง AST โครงสร้างจำลอง ---

    private Node createSingleReturnFunction(int tokenType, String value) {
        Node valNode = (tokenType == Token.NUMBER) ? Node.newNumber(Double.parseDouble(value)) : Node.newString(tokenType, value);
        return createSingleReturnFunctionNode(valNode);
    }

    private Node createSingleReturnFunctionNode(Node returnVal) {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        
        Node lp = new Node(Token.LP);
        fn.addChildToBack(lp);

        Node body = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN, returnVal);
        body.addChildToBack(ret);
        fn.addChildToBack(body);
        return fn;
    }

    private Node createIdentityFunction(String paramName) {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(Node.newString(Token.NAME, ""));
        
        Node lp = new Node(Token.LP);
        lp.addChildToBack(Node.newString(Token.NAME, "a"));
        fn.addChildToBack(lp);

        Node body = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN, Node.newString(Token.NAME, paramName));
        body.addChildToBack(ret);
        fn.addChildToBack(body);
        return fn;
    }
}
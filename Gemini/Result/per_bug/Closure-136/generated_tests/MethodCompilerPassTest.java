package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import java.util.HashMap;
import java.util.Map;

/**
 * ชุดทดสอบ JUnit 4 สำหรับคลาส MethodCompilerPass
 * มุ่งเน้นการครอบคลุม Branch/Condition และจำลองสถานการณ์ Edge Cases (Defects4J Closure-136b)
 */
public class MethodCompilerPassTest extends TestCase {

    // คลาสลูกจำลอง (Concrete Implementation) เพื่อทดสอบ Abstract Class
    private static class TestMethodCompilerPass extends MethodCompilerPass {
        private final SignatureStore signatureStore = new TestSignatureStore();
        private final Callback actingCallback;
        private boolean actingCallbackCalled = false;

        public TestMethodCompilerPass(AbstractCompiler compiler, Callback actingCallback) {
            super(compiler);
            this.actingCallback = actingCallback != null ? actingCallback : new NodeTraversal.AbstractPostOrderCallback() {
                @Override
                public void visit(NodeTraversal t, Node n, Node parent) {
                    actingCallbackCalled = true;
                }
            };
        }

        @Override
        Callback getActingCallback() {
            return actingCallback;
        }

        @Override
        SignatureStore getSignatureStore() {
            return signatureStore;
        }
    }

    private static class TestSignatureStore implements MethodCompilerPass.SignatureStore {
        final Map<String, Node> signatures = new HashMap<String, Node>();

        @Override
        public void reset() {
            signatures.clear();
        }

        @Override
        public void addSignature(String functionName, Node functionNode, String sourceFile) {
            signatures.put(functionName, functionNode);
        }

        @Override
        public void removeSignature(String functionName) {
            signatures.remove(functionName);
        }
    }

    // Mock Compiler ง่ายๆ ที่รองรับ Compiler interface
    private static class DummyCompiler extends Compiler {
        private boolean ideMode = false;

        public void setIdeMode(boolean ideMode) {
            this.ideMode = ideMode;
        }

        @Override
        public boolean isIdeMode() {
            return ideMode;
        }
    }

    /**
     * Test Case 1: process() เมื่อ externs เป็น null และ root เป็น node เปล่า
     * Trigger Branch: externs == null (False branch ของ if (externs != null))
     */
    public void testProcessWithNullExterns() {
        DummyCompiler compiler = new DummyCompiler();
        TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler, null);

        Node root = new Node(Token.BLOCK);
        pass.process(null, root);

        assertTrue(pass.signatureStore.signatures.isEmpty());
    }

    /**
     * Test Case 2: ประมวลผล Externs ที่มี Token.GETPROP โดยปลายทางไม่ใช่ Token.STRING
     * Trigger Branch: dest.getType() != Token.STRING (True branch -> return)
     */
    public void testGetExternMethodsNonStringDest() {
        DummyCompiler compiler = new DummyCompiler();
        TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler, null);

        // สร้างโครงสร้าง: externs.1() โดยไม่ใช่ string
        Node externs = new Node(Token.BLOCK);
        Node getProp = new Node(Token.GETPROP, Node.newString("obj"), Node.newNumber(123)); // 123 ไม่ใช่ STRING
        externs.addChildToBack(getProp);

        Node root = new Node(Token.BLOCK);
        pass.process(externs, root);

        assertTrue(pass.externMethods.isEmpty());
    }

    /**
     * Test Case 3: ประมวลผล Externs แบบ GETPROP ที่เป็นฟังก์ชันสมบูรณ์ (ASSIGN)
     * Trigger Branch: parent.getType() == Token.ASSIGN && parent.getFirstChild() == n && n.getNext().getType() == Token.FUNCTION
     */
    public void testGetExternMethodsValidFunctionAssignment() {
        DummyCompiler compiler = new DummyCompiler();
        TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler, null);

        Node externs = new Node(Token.BLOCK);
        Node getProp = new Node(Token.GETPROP, Node.newString("window"), Node.newString("setTimeout"));
        Node funcNode = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN, getProp, funcNode);
        externs.addChildToBack(assign);

        Node root = new Node(Token.BLOCK);
        pass.process(externs, root);

        assertTrue(pass.externMethods.contains("setTimeout"));
    }

    /**
     * Test Case 4: ประมวลผล Externs แบบ GETPROP ที่ไม่มีฟังก์ชัน (ถูกถอด Signature ออก)
     * Trigger Branch: else block ของ GetExternMethods เมื่อไม่ใช่ ASSIGN ฟังก์ชัน
     */
    public void testGetExternMethodsWithoutSignature() {
        DummyCompiler compiler = new DummyCompiler();
        TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler, null);

        Node externs = new Node(Token.BLOCK);
        Node getProp = new Node(Token.GETPROP, Node.newString("window"), Node.newString("notAFunction"));
        Node numberNode = new Node(Token.NUMBER, 1.0);
        Node assign = new Node(Token.ASSIGN, getProp, numberNode);
        externs.addChildToBack(assign);

        Node root = new Node(Token.BLOCK);
        pass.process(externs, root);

        assertTrue(pass.externMethodsWithoutSignatures.contains("notAFunction"));
    }

    /**
     * Test Case 5: ประมวลผล OBJECTLIT ใน Externs
     * Trigger Branch: Token.OBJECTLIT case และตรวจสอบคีย์ที่เป็น STRING และ VALUE เป็น FUNCTION
     */
    public void testGetExternMethodsObjectLiteral() {
        DummyCompiler compiler = new DummyCompiler();
        TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler, null);

        Node externs = new Node(Token.BLOCK);
        Node key = Node.newString("myMethod");
        Node val = new Node(Token.FUNCTION);
        key.addChildToBack(val);
        Node objLit = new Node(Token.OBJECTLIT, key);
        externs.addChildToBack(objLit);

        Node root = new Node(Token.BLOCK);
        pass.process(externs, root);

        assertTrue(pass.externMethods.contains("myMethod"));
    }

    /**
     * Test Case 6: GatherSignatures กับ Prototype การเรียกซ้อน (GETPROP . prototype)
     * Trigger Branch: processPrototypeParent กับ GETPROP และ ASSIGN
     */
    public void testGatherSignaturesPrototypeAssignment() {
        DummyCompiler compiler = new DummyCompiler();
        TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler, null);

        Node externs = new Node(Token.BLOCK);
        
        // สร้าง Foo.prototype.bar = function() {}
        Node nameFoo = Node.newString("Foo");
        Node protoStr = Node.newString("prototype");
        Node getPropProto = new Node(Token.GETPROP, nameFoo, protoStr);
        Node barStr = Node.newString("bar");
        Node getPropBar = new Node(Token.GETPROP, getPropProto, barStr);
        
        Node funcNode = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN, getPropBar, funcNode);
        
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(assign);

        pass.process(externs, root);
        assertTrue(pass.signatureStore.signatures.containsKey("bar"));
    }

    /**
     * Test Case 7: addPossibleSignature Edge Case - ตัวแปรอ้างอิงเป็น null (undefined function) และ IDE mode เป็น false
     * Trigger Branch: v == null && !compiler.isIdeMode() -> คาดหวังว่าจะโยน IllegalStateException
     */
    public void testAddPossibleSignatureUndefinedVarThrowsException() {
        DummyCompiler compiler = new DummyCompiler();
        compiler.setIdeMode(false);

        TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler, null);

        // จำลองการใช้ Token.NAME ที่ไม่มี Scope Var รองรับ
        Node externs = new Node(Token.BLOCK);
        Node nameFoo = Node.newString("Foo");
        Node barStr = Node.newString("bar");
        Node getPropBar = new Node(Token.GETPROP, nameFoo, barStr);
        Node undefinedName = Node.newString("nonExistentFunc");
        Node assign = new Node(Token.ASSIGN, getPropBar, undefinedName);

        Node root = new Node(Token.BLOCK);
        root.addChildToBack(assign);

        try {
            pass.process(externs, root);
            fail("Expected IllegalStateException due to undefined function in non-IDE mode");
        } catch (IllegalStateException e) {
            // Expected exception
            assertNotNull(e.getMessage());
        }
    }

    /**
     * Test Case 8: addPossibleSignature Edge Case - ตัวแปรอ้างอิงเป็น null แต่ IDE mode เป็น true
     * Trigger Branch: v == null && compiler.isIdeMode() -> คาดหวังว่าจะ return ออกไปเงียบๆ (ไม่พัง)
     */
    public void testAddPossibleSignatureUndefinedVarIdeMode() {
        DummyCompiler compiler = new DummyCompiler();
        compiler.setIdeMode(true); // เปิด IDE mode

        TestMethodCompilerPass pass = new TestMethodCompilerPass(compiler, null);

        Node externs = new Node(Token.BLOCK);
        Node nameFoo = Node.newString("Foo");
        Node barStr = Node.newString("bar");
        Node getPropBar = new Node(Token.GETPROP, nameFoo, barStr);
        Node undefinedName = Node.newString("nonExistentFunc");
        Node assign = new Node(Token.ASSIGN, getPropBar, undefinedName);

        Node root = new Node(Token.BLOCK);
        root.addChildToBack(assign);

        // ไม่ควร Throw Exception ใดๆ
        pass.process(externs, root);
        assertTrue(pass.signatureStore.signatures.isEmpty());
    }
}
package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for NameAnalyzer (Closure-40b)
 * Focuses on high branch/condition coverage and edge cases.
 */
public class NameAnalyzerTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนด Error Handler พื้นฐานเพื่อป้องกัน NullPointerException ระหว่างคอมไพล์
        compiler.initOptions(new CompilerOptions());
    }

    @Test
    public void testGlobalVariableAndFunctionDeclaration() {
        // Trigger: Global scope var and function declarations
        String js = "var x = 10; function foo() { return x; }";
        Node root = compiler.parseSyntheticCode("testjs", js);
        Node externs = new Node(Token.BLOCK);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        String report = analyzer.getHtmlReport();
        assertNotNull(report);
        assertTrue(report.contains("x"));
        assertTrue(report.contains("foo"));
    }

    @Test
    public void testPrototypeAssignmentAndReferences() {
        // Trigger: Prototype set node, Class definition, and references
        String js = "function A() {} A.prototype.bar = function() {}; var a = new A(); a.bar();";
        Node root = compiler.parseSyntheticCode("testjs", js);
        Node externs = new Node(Token.BLOCK);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        String report = analyzer.getHtmlReport();
        assertNotNull(report);
        assertTrue(report.contains("A"));
    }

    @Test
    public void testInstanceOfCheckNode() {
        // Trigger: InstanceOfCheckNode branch in FindReferences
        String js = "function A() {} var x = {}; var b = (x instanceof A);";
        Node root = compiler.parseSyntheticCode("testjs", js);
        Node externs = new Node(Token.BLOCK);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        assertNotNull(analyzer.getHtmlReport());
    }

    @Test
    public void testClassDefiningFunctionAndInheritance() {
        // Trigger: ClassDefiningFunctionNode, Superclass inheritance references
        String js = "goog.provide('A'); goog.provide('B'); goog.inherits(B, A);";
        Node root = compiler.parseSyntheticCode("testjs", js);
        Node externs = new Node(Token.BLOCK);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        assertNotNull(analyzer.getHtmlReport());
    }

    @Test
    public void testForLoopStructures() {
        // Trigger: For loop branches in FindDependencyScopes and FindReferences (For-in vs standard for)
        String js = "for (var i = 0; i < 10; i++) { var y = i; } " +
                    "var obj = {a:1, b:2}; for (var key in obj) { var val = obj[key]; }";
        Node root = compiler.parseSyntheticCode("testjs", js);
        Node externs = new Node(Token.BLOCK);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        assertNotNull(analyzer.getHtmlReport());
    }

    @Test
    public void testGetElemAndAliases() {
        // Trigger: GetElem (e.g., a['b']), recordWriteOnProperties, and aliases
        String js = "var a = {}; a['b'] = 5; var c = a; c['b'] = 10;";
        Node root = compiler.parseSyntheticCode("testjs", js);
        Node externs = new Node(Token.BLOCK);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        assertNotNull(analyzer.getHtmlReport());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidParentNodeTypeInReplaceWithRhs() {
        // Edge Case / Invalid State: Trigger IllegalArgumentException in replaceTopLevelExpressionWithRhs
        // ส่ง BLOCK node ที่มีลูกเป็น Token ที่ไม่รองรับ เพื่อบังคับให้เกิด Exception
        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        
        Node invalidParent = new Node(Token.BLOCK);
        Node invalidChild = new Node(Token.NUMBER, 123);
        invalidParent.addChildToBack(invalidChild);

        // เรียกใช้ผ่าน Reflection หรือจำลองพฤติกรรมผ่านเมธอดภายในที่รับ Parent/Child ผิดประเภท
        // เนื่องจาก replaceTopLevelExpressionWithRhs เป็น private สามารถทดสอบผ่านกระบวนการ process 
        // หรือจำลองโครงสร้าง AST ที่ผิดเพี้ยนผิดไวยากรณ์ JavaScript ทั่วไป
        compiler.parseSyntheticCode("testjs", "123;");
        
        // จำลองการเรียกผ่านเงื่อนไขบังคับ
        java.lang.reflect.Method method;
        try {
            method = NameAnalyzer.class.getDeclaredMethod("replaceTopLevelExpressionWithRhs", Node.class, Node.class);
            method.setAccessible(true);
            method.invoke(analyzer, invalidParent, invalidChild);
        } catch (Exception e) {
            // Unwrap InvocationTargetException เพื่อเช็ค IllegalArgumentException 
            if (e.getCause() instanceof RuntimeException) {
                throw (RuntimeException) e.getCause();
            }
            throw new RuntimeException(e);
        }
    }
}
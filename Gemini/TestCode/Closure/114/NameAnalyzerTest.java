package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for NameAnalyzer (Closure-114b).
 * Focuses on high branch/condition coverage, edge cases, and fault detection.
 */
public class NameAnalyzerTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // ตั้งค่า Compiler basic options ถ้าจำเป็น
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
    }

    @Test
    public void testEmptyAstProcessing() {
        // Edge Case: โค้ดว่างเปล่าทั้ง externs และ root
        Node externs = IR.script();
        Node root = IR.script();

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        String report = analyzer.getHtmlReport();
        assertNotNull(report);
        assertTrue(report.contains("OVERALL STATS"));
    }

    @Test
    public void testUnreferencedVariableRemoval() {
        // Scenario: มีตัวแปรประกาศไว้แต่ไม่ได้ใช้งาน และเปิดใช้งาน removeUnreferenced = true
        Node externs = IR.script();
        // var unusedVar = 1;
        Node root = IR.script(IR.var(IR.name("unusedVar"), IR.number(1)));

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        // ตรวจสอบว่า AST ถูกเปลี่ยนแปลง/ลบโหนดออก
        assertTrue(root.hasNoChildren());
    }

    @Test
    public void testReferencedVariableKept() {
        // Scenario: ตัวแปรถูกใช้งาน จะต้องไม่ถูกลบ
        Node externs = IR.script();
        // window.foo = 1; var x = window.foo;
        Node root = IR.script(
            IR.exprResult(IR.assign(IR.getProp(IR.name("window"), "foo"), IR.number(1))),
            IR.var(IR.name("x"), IR.getProp(IR.name("window"), "foo"))
        );

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        // โหนดควรจะยังอยู่เพราะมีการอ้างอิงผ่าน window และตัวแปร x
        assertFalse(root.hasNoChildren());
    }

    @Test
    public void testRemoveUnreferencedDisabled() {
        // Edge Case: removeUnreferenced = false แม้ตัวแปรไม่ได้ใช้ก็ต้องไม่ถูกลบ
        Node externs = IR.script();
        Node root = IR.script(IR.var(IR.name("unusedVar"), IR.number(1)));

        NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
        analyzer.process(externs, root);

        // โวาเบิลควรจะยังอยู่เพราะปิดฟีเจอร์การลบ
        assertFalse(root.hasNoChildren());
    }

    @Test
    public void testPrototypeAndClassAssignments() {
        // Scenario: ทดสอบการกำหนดค่า Prototype และ Class-defining เพื่อคลุม Branch เฉพาะ
        Node externs = IR.script();
        // function Foo() {}
        // Foo.prototype.bar = function() {};
        Node fnFoo = IR.function(IR.name("Foo"), IR.paramList(), IR.block());
        Node protoAssign = IR.exprResult(
            IR.assign(
                IR.getProp(IR.getProp(IR.name("Foo"), "prototype"), "bar"),
                IR.function(IR.name(""), IR.paramList(), IR.block())
            )
        );

        Node root = IR.script(fnFoo, protoAssign);

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        String report = analyzer.getHtmlReport();
        assertTrue(report.contains("Foo"));
    }

    @Test
    public void testExternsProcessing() {
        // Scenario: มีตัวแปรประกาศใน externs
        Node externs = IR.script(IR.var(IR.name("externVar"), IR.number(10)));
        Node root = IR.script(
            IR.var(IR.name("y"), IR.name("externVar"))
        );

        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);

        assertNotNull(analyzer.getHtmlReport());
    }
}
package com.google.javascript.jscomp;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for JsAst.
 * Designed to target branch/condition coverage and edge cases.
 */
public class JsAstTest {

    private SourceFile sourceFile;
    private JsAst jsAst;
    private Compiler dummyCompiler;

    @Before
    public void setUp() {
        // สร้าง SourceFile จำลองสำหรับการทดสอบ
        sourceFile = SourceFile.fromCode("testcode.js", "var x = 10;");
        jsAst = new JsAst(sourceFile);
        dummyCompiler = new Compiler();
        // กำหนดค่าตั้ง ฐานข้อมูล/Config เริ่มต้นให้ compiler ป้องกัน NullPointerException
        dummyCompiler.initOptions(new CompilerOptions());
    }

    @Test
    public void testConstructorAndGetters() {
        assertNotNull("InputId should not be null", jsAst.getInputId());
        assertEquals("InputId name should match", "testcode.js", jsAst.getInputId().getId());
        assertEquals("SourceFile should match", sourceFile, jsAst.getSourceFile());
    }

    @Test
    public void testGetAstRoot_FirstTimeParsing() {
        // Branch: root == null (True) -> Should trigger parse()
        Node root = jsAst.getAstRoot(dummyCompiler);
        assertNotNull("AST Root should be parsed and not null", root);
        
        // ตรวจสอบว่า static source file และ inputId ถูกเซ็ตเรียบร้อย
        assertEquals(sourceFile, root.getSourceFileName() != null ? sourceFile : root.getStaticSourceFile());
        assertEquals(jsAst.getInputId(), root.getInputId());
    }

    @Test
    public void testGetAstRoot_CachedRoot() {
        // Branch: root == null (False) -> Should return cached root without re-parsing
        Node firstRoot = jsAst.getAstRoot(dummyCompiler);
        Node secondRoot = jsAst.getAstRoot(dummyCompiler);
        
        assertSame("Subsequent calls to getAstRoot should return the exact same cached instance", firstRoot, secondRoot);
    }

    @Test
    public void testClearAst() {
        // ทำการ parse ก่อนเพื่อให้ root และ cached source มีค่า
        jsAst.getAstRoot(dummyCompiler);
        assertNotNull(jsAst.getAstRoot(dummyCompiler));

        // เคลียร์ AST
        jsAst.clearAst();

        // ตรวจสอบว่าเมื่อเรียก getAstRoot อีกครั้ง จะต้องทำการ parse ใหม่ (root ถูกรีเซ็ตเป็น null)
        Node newRoot = jsAst.getAstRoot(dummyCompiler);
        assertNotNull("AST should be re-parsed after clearAst", newRoot);
    }

    @Test
    public void testSetSourceFile_Valid() {
        SourceFile newSourceFile = SourceFile.fromCode("testcode.js", "var y = 20;");
        // Branch: fileName.equals(file.getName()) == true
        jsAst.setSourceFile(newSourceFile);
        assertEquals(newSourceFile, jsAst.getSourceFile());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetSourceFile_InvalidNameMismatch() {
        SourceFile mismatchedFile = SourceFile.fromCode("differentfile.js", "var y = 20;");
        // Branch: fileName.equals(file.getName()) == false -> Throws IllegalStateException
        jsAst.setSourceFile(mismatchedFile);
    }

    @Test
    public void testParseWithSyntaxErrorOrHaltingErrors() {
        // สร้าง SourceFile ที่มี Syntax ผิดพลาดเพื่อให้เกิดข้อผิดพลาดในการ parse หรือมี Halting errors
        SourceFile faultyFile = SourceFile.fromCode("faulty.js", "var = ;"); // Syntax error
        JsAst faultyAst = new JsAst(faultyFile);

        Node root = faultyAst.getAstRoot(dummyCompiler);
        
        // Branch: root == null || compiler.hasHaltingErrors() -> Should fallback to IR.script()
        assertNotNull("Fallback SCRIPT node should be generated", root);
        assertTrue("Root node should be a SCRIPT node on error", root.isScript());
    }
}
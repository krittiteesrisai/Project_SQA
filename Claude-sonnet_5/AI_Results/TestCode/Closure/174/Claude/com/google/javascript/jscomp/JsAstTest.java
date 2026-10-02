package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Unit tests for {@link JsAst}.
 *
 * ใช้ com.google.javascript.jscomp.Compiler ตัวจริง (ไม่ mock) เพราะ classpath
 * ที่กำหนดไม่มีไลบรารี mocking ใด ๆ เข้าใช้งาน
 */
public class JsAstTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // จำเป็นต้อง initOptions ก่อน เพื่อให้ getParserConfig(), report(),
    // hasHaltingErrors() ทำงานได้โดยไม่ throw NPE
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  // ---------- Constructor ----------

  @Test
  public void testConstructor_setsInputIdAndSourceFile() {
    SourceFile sf = SourceFile.fromCode("test.js", "var x = 1;");
    JsAst ast = new JsAst(sf);

    assertNotNull(ast.getInputId());
    assertEquals("test.js", ast.getInputId().getIdName());
    assertSame(sf, ast.getSourceFile());
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullSourceFile_throwsNPE() {
    // Constructor เรียก sourceFile.getName() ทันที -> คาดว่าเกิด NPE
    new JsAst(null);
  }

  // ---------- getAstRoot() : root == null branch ----------

  @Test
  public void testGetAstRoot_validCode_parsesSuccessfully() {
    SourceFile sf = SourceFile.fromCode("valid.js", "var x = 1;");
    JsAst ast = new JsAst(sf);

    Node root = ast.getAstRoot(compiler);

    assertNotNull(root);
    assertFalse(compiler.hasHaltingErrors());
    // ตรวจว่า root.setInputId(inputId) ถูกเรียกจริง
    assertEquals(ast.getInputId(), root.getInputId());
  }

  @Test
  public void testGetAstRoot_calledTwice_returnsSameCachedRoot() {
    // ครอบคลุม branch: เมื่อ root != null จะไม่ parse ซ้ำ
    SourceFile sf = SourceFile.fromCode("cache.js", "var y = 2;");
    JsAst ast = new JsAst(sf);

    Node first = ast.getAstRoot(compiler);
    Node second = ast.getAstRoot(compiler);

    assertSame(first, second);
  }

  @Test
  public void testGetAstRoot_emptyCode_parsesToEmptyScriptWithoutErrors() {
    SourceFile sf = SourceFile.fromCode("empty.js", "");
    JsAst ast = new JsAst(sf);

    Node root = ast.getAstRoot(compiler);

    assertNotNull(root);
    assertFalse(compiler.hasHaltingErrors());
  }

  // ---------- parse() : if (root == null || hasHaltingErrors()) ----------

  @Test
  public void testGetAstRoot_malformedCode_returnsDummyScript() {
    // syntax ผิดพลาด -> คาด hasHaltingErrors() == true -> root = IR.script() (dummy, ไม่มีลูก)
    SourceFile sf = SourceFile.fromCode("bad.js", "var x = ;");
    JsAst ast = new JsAst(sf);

    Node root = ast.getAstRoot(compiler);

    assertNotNull(root);
    assertTrue(compiler.hasHaltingErrors());
    assertFalse(root.hasChildren());
  }

  @Test
  public void testGetAstRoot_ioException_returnsDummyScript() {
    // ไม่แน่ใจ 100% ว่า SourceFile.fromFile กับไฟล์ที่ไม่มีอยู่จริง
    // จะ throw IOException ตอนเรียก getCode() ภายใน parse() หรือไม่
    // (พฤติกรรมขึ้นกับ implementation ภายในของ SourceFile ที่ไม่ได้แสดงในซอร์สที่ให้มา)
    // เขียนไว้เพื่อพยายาม cover branch catch(IOException) -> report(READ_ERROR) -> root = IR.script()
    SourceFile sf = SourceFile.fromFile(new File("this_file_does_not_exist_12345.js"));
    JsAst ast = new JsAst(sf);

    Node root = ast.getAstRoot(compiler);

    assertNotNull(root);
    assertFalse(root.hasChildren());
  }

  // ---------- clearAst() ----------

  @Test
  public void testClearAst_resetsRootAndAllowsReparse() {
    SourceFile sf = SourceFile.fromCode("clear.js", "var z = 3;");
    JsAst ast = new JsAst(sf);

    Node firstRoot = ast.getAstRoot(compiler);
    assertNotNull(firstRoot);

    ast.clearAst();

    Node secondRoot = ast.getAstRoot(compiler);
    assertNotNull(secondRoot);
    // หลัง clearAst แล้วเรียก getAstRoot อีกครั้ง ต้อง parse ใหม่ (root ถูก set เป็น null)
    // จึงได้ Node object คนละตัวกับก่อนหน้า
    assertNotSame(firstRoot, secondRoot);
  }

  // ---------- getInputId() / getSourceFile() ----------

  @Test
  public void testGetInputId_matchesSourceFileName() {
    SourceFile sf = SourceFile.fromCode("idcheck.js", "var m = 1;");
    JsAst ast = new JsAst(sf);

    InputId id = ast.getInputId();

    assertNotNull(id);
    assertEquals("idcheck.js", id.getIdName());
  }

  @Test
  public void testGetSourceFile_returnsInitialSourceFile() {
    SourceFile sf = SourceFile.fromCode("sfcheck.js", "var n = 1;");
    JsAst ast = new JsAst(sf);

    assertSame(sf, ast.getSourceFile());
  }

  // ---------- setSourceFile() : Preconditions.checkState branch ----------

  @Test
  public void testSetSourceFile_sameName_succeeds() {
    SourceFile sf1 = SourceFile.fromCode("same.js", "var a = 1;");
    JsAst ast = new JsAst(sf1);
    SourceFile sf2 = SourceFile.fromCode("same.js", "var b = 2;");

    ast.setSourceFile(sf2);

    assertSame(sf2, ast.getSourceFile());
  }

  @Test(expected = IllegalStateException.class)
  public void testSetSourceFile_differentName_throwsIllegalStateException() {
    SourceFile sf1 = SourceFile.fromCode("name1.js", "var a = 1;");
    JsAst ast = new JsAst(sf1);
    SourceFile sf2 = SourceFile.fromCode("name2.js", "var b = 2;");

    ast.setSourceFile(sf2);
  }
}

package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link Normalize} (Defects4J Closure-79b).
 *
 * หมายเหตุ: หลายเมธอดในซอร์สเป็น private และหลายส่วนต้องพึ่ง Scope /
 * CompilerInput ที่ไม่ได้แสดงรายละเอียดในซอร์สที่ให้มา จึงทดสอบผ่าน
 * package-private static/nested class ที่เข้าถึงได้จาก package เดียวกัน
 * (Normalize.NormalizeStatements) และ static helper methods เท่านั้น
 */
public class NormalizeTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // ASSUMPTION: การ initOptions ก่อน parse เป็น pattern มาตรฐานของโปรเจกต์นี้
    // (ไม่ปรากฏตรงในซอร์สที่ให้มา) เพื่อให้ parseTestCode/parseSyntheticCode
    // ทำงานได้ถูกต้อง
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  /** รัน NormalizeStatements บนโค้ดที่ parse แล้ว คืนค่า root Node */
  private Node parseAndNormalize(String js, boolean assertOnChange) {
    Node root = compiler.parseTestCode(js);
    NodeTraversal.traverse(
        compiler, root,
        new Normalize.NormalizeStatements(compiler, assertOnChange));
    return root;
  }

  // ---------------------------------------------------------------------
  // WHILE -> FOR conversion (Token.WHILE case, CONVERT_WHILE_TO_FOR branch)
  // ---------------------------------------------------------------------

  @Test
  public void testWhileConvertedToFor() {
    Node root = parseAndNormalize("while(x) foo();", false);
    Node stmt = root.getFirstChild();
    assertEquals(Token.FOR, stmt.getType());
    assertEquals(4, stmt.getChildCount());
    Node init = stmt.getFirstChild();
    Node incr = init.getNext().getNext();
    assertEquals(Token.EMPTY, init.getType());
    assertEquals(Token.EMPTY, incr.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testWhileAssertOnChangeThrows() {
    // assertOnChange = true -> reportCodeChange ต้อง throw
    parseAndNormalize("while(x) foo();", true);
  }

  // ---------------------------------------------------------------------
  // extractForInitializer: FOR loop (ไม่ใช่ for-in), initializer != EMPTY
  // ---------------------------------------------------------------------

  @Test
  public void testForInitializerVarExtracted() {
    Node root = parseAndNormalize("for(var a=0;a<10;a++) foo();", false);
    Node first = root.getFirstChild();
    assertEquals(Token.VAR, first.getType());
    Node second = first.getNext();
    assertEquals(Token.FOR, second.getType());
    assertEquals(Token.EMPTY, second.getFirstChild().getType());
  }

  @Test
  public void testForInitializerExpressionExtracted() {
    // ครอบคลุม else branch: newStatement = NodeUtil.newExpr(init)
    Node root = parseAndNormalize("for(a=0;a<10;a++) foo();", false);
    Node first = root.getFirstChild();
    assertTrue(first.getType() != Token.VAR); // ต้องเป็น expr statement ไม่ใช่ VAR
    Node second = first.getNext();
    assertEquals(Token.FOR, second.getType());
    assertEquals(Token.EMPTY, second.getFirstChild().getType());
  }

  @Test
  public void testForEmptyInitializerUnchanged() {
    // c.getFirstChild().getType() == EMPTY -> ไม่ทำการแยก initializer
    Node root = parseAndNormalize("for(;;) foo();", false);
    Node first = root.getFirstChild();
    assertEquals(Token.FOR, first.getType());
    assertEquals(Token.EMPTY, first.getFirstChild().getType());
    assertNull(first.getNext()); // ไม่มี statement เพิ่มก่อนหน้า
  }

  @Test(expected = IllegalStateException.class)
  public void testForInitializerAssertOnChangeThrows() {
    parseAndNormalize("for(var a=0;a<10;a++) foo();", true);
  }

  // ---------------------------------------------------------------------
  // extractForInitializer: for-in loop, VAR branch / non-VAR branch
  // ---------------------------------------------------------------------

  @Test
  public void testForInVarExtracted() {
    Node root = parseAndNormalize("for(var a in b) foo();", false);
    Node first = root.getFirstChild();
    assertEquals(Token.VAR, first.getType());
    Node second = first.getNext();
    assertEquals(Token.FOR, second.getType());
    Node forFirst = second.getFirstChild();
    assertEquals(Token.NAME, forFirst.getType());
    assertEquals("a", forFirst.getString());
  }

  @Test
  public void testForInWithoutVarUnchanged() {
    // first.getType() != VAR -> ไม่มีการแก้ไข
    Node root = parseAndNormalize("for(a in b) foo();", false);
    Node first = root.getFirstChild();
    assertEquals(Token.FOR, first.getType());
    assertEquals(Token.NAME, first.getFirstChild().getType());
    assertNull(first.getFirstChild().getFirstChild());
  }

  // ---------------------------------------------------------------------
  // extractForInitializer: recursive case Token.LABEL
  // ---------------------------------------------------------------------

  @Test
  public void testForInitializerExtractedThroughLabel() {
    Node root = parseAndNormalize("foo: for(var a=0;a<10;a++) foo();", false);
    Node first = root.getFirstChild();
    assertEquals(Token.VAR, first.getType()); // VAR ถูกยกออกมาก่อน LABEL
    Node second = first.getNext();
    assertEquals(Token.LABEL, second.getType());
    Node forNode = second.getLastChild();
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  // ---------------------------------------------------------------------
  // normalizeLabels: wrap / no-wrap branches
  // ---------------------------------------------------------------------

  @Test
  public void testLabelNonBlockWrapped() {
    Node root = parseAndNormalize("foo: bar();", false);
    Node label = root.getFirstChild();
    assertEquals(Token.LABEL, label.getType());
    assertEquals(Token.BLOCK, label.getLastChild().getType());
  }

  @Test
  public void testLabelBlockUnchanged() {
    Node root = parseAndNormalize("foo: {}", false);
    Node label = root.getFirstChild();
    Node last = label.getLastChild();
    assertEquals(Token.BLOCK, last.getType());
    assertFalse(last.hasChildren()); // ไม่มีการ wrap เพิ่ม
  }

  @Test
  public void testLabelForUnchanged() {
    Node root = parseAndNormalize("foo: for(;;) {}", false);
    Node label = root.getFirstChild();
    assertEquals(Token.FOR, label.getLastChild().getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testLabelWrapAssertOnChangeThrows() {
    parseAndNormalize("foo: bar();", true);
  }

  // ---------------------------------------------------------------------
  // splitVarDeclarations
  // ---------------------------------------------------------------------

  @Test
  public void testSplitMultipleVarDeclarations() {
    Node root = parseAndNormalize("var a, b;", false);
    assertEquals(2, root.getChildCount());
    Node first = root.getFirstChild();
    Node second = first.getNext();
    assertEquals(Token.VAR, first.getType());
    assertEquals(Token.VAR, second.getType());
    assertTrue(first.hasOneChild());
    assertTrue(second.hasOneChild());
    assertEquals("a", first.getFirstChild().getString());
    assertEquals("b", second.getFirstChild().getString());
  }

  @Test
  public void testSingleVarDeclarationUnchanged() {
    // c.getFirstChild() == c.getLastChild() -> loop ไม่ทำงาน
    Node root = parseAndNormalize("var a = 0;", false);
    assertEquals(1, root.getChildCount());
    assertTrue(root.getFirstChild().hasOneChild());
  }

  @Test(expected = IllegalStateException.class)
  public void testSplitVarAssertOnChangeThrows() {
    parseAndNormalize("var a, b;", true);
  }

  @Test
  public void testNoChangeDoesNotThrowEvenWhenAssertOnChangeTrue() {
    // ไม่มี branch ใดถูก trigger -> reportCodeChange ไม่ถูกเรียก -> ไม่ throw
    Node root = parseAndNormalize("var a = 0;", true);
    assertNotNull(root);
  }

  // ---------------------------------------------------------------------
  // normalizeFunctionDeclaration / rewriteFunctionDeclaration
  // ---------------------------------------------------------------------

  @Test
  public void testUnhoistedFunctionDeclarationRewritten() {
    // function ที่อยู่ใน if-block ถือเป็น "unhoisted" -> ถูกแปลงเป็น var
    Node root = parseAndNormalize("if (true) { function f(){} }", false);
    Node ifNode = root.getFirstChild();
    assertEquals(Token.IF, ifNode.getType());
    Node thenBlock = ifNode.getFirstChild().getNext();
    Node stmt = thenBlock.getFirstChild();
    assertEquals(Token.VAR, stmt.getType());
    Node nameNode = stmt.getFirstChild();
    assertEquals("f", nameNode.getString());
    assertEquals(Token.FUNCTION, nameNode.getFirstChild().getType());
  }

  @Test
  public void testFunctionExpressionNotRewritten() {
    // เป็น function expression อยู่แล้ว -> ไม่ถูกแก้ไข
    Node root = parseAndNormalize("var f = function(){};", false);
    Node varNode = root.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node fnNode = nameNode.getFirstChild();
    assertEquals(Token.FUNCTION, fnNode.getType());
    assertEquals("", fnNode.getFirstChild().getString());
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionRewriteAssertOnChangeThrows() {
    parseAndNormalize("if (true) { function f(){} }", true);
  }

  // ---------------------------------------------------------------------
  // moveNamedFunctions
  // ---------------------------------------------------------------------

  @Test
  public void testMoveNamedFunctionsToTop() {
    // ASSUMPTION: function g() ที่อยู่ตรงใน body ของ f (parent เป็น FUNCTION)
    // ถือว่า "hoisted" จึงไม่ถูก rewrite เป็น var แต่จะถูกย้ายขึ้นบนสุดของ body
    Node root = parseAndNormalize(
        "function f() { var x = 1; function g(){} }", false);
    Node fNode = root.getFirstChild();
    assertEquals(Token.FUNCTION, fNode.getType());
    Node body = fNode.getLastChild();
    Node firstStmt = body.getFirstChild();
    assertEquals(Token.FUNCTION, firstStmt.getType());
    assertEquals("g", firstStmt.getFirstChild().getString());
    Node secondStmt = firstStmt.getNext();
    assertEquals(Token.VAR, secondStmt.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testMoveNamedFunctionsAssertOnChangeThrows() {
    parseAndNormalize("function f() { var x = 1; function g(){} }", true);
  }

  // ---------------------------------------------------------------------
  // annotateConstantsByConvention (NAME / STRING(GETPROP) / OBJLIT key)
  // หมายเหตุ: ไม่ทราบ CodingConvention ที่ compiler default ใช้แน่ชัด
  // (ไม่ปรากฏในซอร์สที่ให้มา) จึงทดสอบเฉพาะกรณีชื่อพิมพ์เล็กที่ "ต้องไม่"
  // ถูก mark เป็น constant ไม่ว่า convention ใดก็ตาม
  // ---------------------------------------------------------------------

  @Test
  public void testOrdinaryNameNotMarkedConstant() {
    Node root = parseAndNormalize("var abc = 1;", false);
    Node nameNode = root.getFirstChild().getFirstChild();
    assertEquals(Token.NAME, nameNode.getType());
    assertFalse(nameNode.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void testGetPropPropertyNotMarkedConstantForLowercaseName() {
    Node root = parseAndNormalize("a.bcd;", false);
    Node exprStmt = root.getFirstChild();
    Node getProp = exprStmt.getFirstChild();
    assertEquals(Token.GETPROP, getProp.getType());
    Node prop = getProp.getLastChild();
    assertFalse(prop.getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  // ---------------------------------------------------------------------
  // Boundary / empty / malformed input
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyProgramNormalizes() {
    Node root = parseAndNormalize("", false);
    assertNotNull(root);
    assertFalse(root.hasChildren());
  }

  @Test
  public void testMalformedCodeDoesNotThrowFromNormalizeLogic() {
    // NOTE: ถ้า parser ล้มเหลว parseTestCode อาจคืน best-effort AST หรือ null
    // (ไม่ระบุแน่ชัดในซอร์สที่ให้มา) เราตรวจสอบเพียงว่าตัว Normalize เอง
    // ไม่ throw exception ที่ไม่คาดคิดเมื่อรับ AST ที่ parse ได้
    Node root = compiler.parseTestCode("function (;");
    if (root != null) {
      NodeTraversal.traverse(
          compiler, root, new Normalize.NormalizeStatements(compiler, false));
    }
  }

  // ---------------------------------------------------------------------
  // Static helper methods: parseAndNormalizeSyntheticCode /
  // parseAndNormalizeTestCode
  // ---------------------------------------------------------------------

  @Test
  public void testParseAndNormalizeSyntheticCode() {
    Node result = Normalize.parseAndNormalizeSyntheticCode(
        compiler, "while(1) foo();", "synthetic$$");
    assertNotNull(result);
    assertEquals(Token.FOR, result.getFirstChild().getType());
  }

  @Test
  public void testParseAndNormalizeTestCode() {
    Node result = Normalize.parseAndNormalizeTestCode(compiler, "var a, b;", "");
    assertNotNull(result);
    assertEquals(2, result.getChildCount());
  }

  @Test
  public void testParseAndNormalizeSyntheticCodeWithNullCodeThrows() {
    // NOTE: ไม่ทราบ exact exception type ของ parser ภายในเมื่อ code เป็น null
    try {
      Normalize.parseAndNormalizeSyntheticCode(compiler, null, "p$$");
      fail("คาดว่าต้องเกิด exception เมื่อ code เป็น null");
    } catch (RuntimeException expected) {
      // ผ่าน: ยอมรับ RuntimeException ทุกชนิดเนื่องจากไม่ระบุชนิดแน่ชัดในซอร์ส
    }
  }
}

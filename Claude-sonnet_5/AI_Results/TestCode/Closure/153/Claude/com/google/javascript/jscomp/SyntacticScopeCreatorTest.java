package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link SyntacticScopeCreator} (Defects4J Closure-153b).
 *
 * หมายเหตุ: ใช้ com.google.javascript.jscomp.Compiler จริงในการ parse โค้ด JS
 * ผ่าน parseTestCode(...) ซึ่งเป็น helper มาตรฐานของ Closure Compiler test suite
 * (ไม่ได้ระบุใน source เป้าหมาย แต่จำเป็นสำหรับสร้าง Node tree จริง)
 */
public class SyntacticScopeCreatorTest {

  private Compiler compiler;
  private SyntacticScopeCreator creator;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    creator = new SyntacticScopeCreator(compiler);
  }

  private Node parse(String js) {
    // ไม่ assert error count == 0 ที่นี่ เพราะบางเทสต้องการเช็ค error
    // ที่เกิดจาก SyntacticScopeCreator เอง (ไม่ใช่จาก parser)
    return compiler.parseTestCode(js);
  }

  /** RedeclarationHandler ปลอมสำหรับดักจับการเรียก onRedeclaration โดยตรง */
  private static class RecordingHandler
      implements SyntacticScopeCreator.RedeclarationHandler {
    int callCount = 0;
    String lastName;
    Node lastNode;
    Node lastParent;
    Node lastGramps;
    Node lastNodeWithLineNumber;

    public void onRedeclaration(
        Scope s, String name, Node n, Node parent, Node gramps,
        Node nodeWithLineNumber) {
      callCount++;
      lastName = name;
      lastNode = n;
      lastParent = parent;
      lastGramps = gramps;
      lastNodeWithLineNumber = nodeWithLineNumber;
    }
  }

  // ---------- 1. Global scope: การประกาศ var หลายตัว ----------
  @Test
  public void testCreateScope_globalScope_declaresMultipleVars() {
    Node script = parse("var a, b; var c = 1;");
    Scope scope = creator.createScope(script, null);

    assertTrue(scope.isGlobal());
    assertNull(scope.getParent());
    assertTrue(scope.isDeclared("a", false));
    assertTrue(scope.isDeclared("b", false));
    assertTrue(scope.isDeclared("c", false));
    assertFalse(scope.isDeclared("z", false));
  }

  // ---------- 2. Boundary: empty script ----------
  @Test
  public void testCreateScope_emptyScript_noVarsDeclared() {
    Node script = parse("");
    Scope scope = creator.createScope(script, null);

    assertTrue(scope.isGlobal());
    assertFalse(scope.isDeclared("a", false));
  }

  // ---------- 3. Boundary: null Node -> ต้อง throw exception ----------
  @Test(expected = NullPointerException.class)
  public void testCreateScope_nullNode_throwsNullPointerException() {
    creator.createScope(null, null);
  }

  // ---------- 4. FUNCTION (declaration, ไม่ใช่ expression) ----------
  @Test
  public void testFunctionDeclaration_nameDeclaredInEnclosingScope() {
    Node script = parse("function f(a, b) {}");
    Scope scope = creator.createScope(script, null);

    assertTrue(scope.isDeclared("f", false));
  }

  // ---------- 5. scanRoot FUNCTION branch: params + body vars ----------
  @Test
  public void testFunctionParamsAndBodyVars_declaredInLocalScope() {
    Node script = parse("function f(a, b) { var c; }");
    Scope global = creator.createScope(script, null);
    Node functionNode = script.getFirstChild();
    assertEquals(Token.FUNCTION, functionNode.getType());

    Scope local = creator.createScope(functionNode, global);

    assertFalse(local.isGlobal());
    assertTrue(local.isDeclared("a", false));
    assertTrue(local.isDeclared("b", false));
    assertTrue(local.isDeclared("c", false));
    // ชื่อฟังก์ชัน f ถูกประกาศใน global scope โดย scanVars(FUNCTION) ไม่ใช่ใน local
    assertFalse(local.isDeclared("f", false));
  }

  // ---------- 6. Function expression: bleed name เข้า scope ของตัวเองเท่านั้น ----------
  @Test
  public void testFunctionExpressionName_bleedsIntoOwnLocalScopeOnly() {
    Node script = parse("var g = function foo() { return foo; };");
    Scope global = creator.createScope(script, null);
    Node varNode = script.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node functionNode = nameNode.getFirstChild();
    assertEquals(Token.FUNCTION, functionNode.getType());

    Scope local = creator.createScope(functionNode, global);

    assertTrue(local.isDeclared("foo", false));
    assertFalse(global.isDeclared("foo", false));
  }

  // ---------- 7. CATCH: ประกาศ catch var + scan block ต่อ ----------
  @Test
  public void testCatchVariable_declaredAndCatchBlockScanned() {
    Node script = parse("try { } catch (e) { var inCatch; }");
    Scope scope = creator.createScope(script, null);

    assertTrue(scope.isDeclared("e", false));
    assertTrue(scope.isDeclared("inCatch", false));
  }

  // ---------- 8. Catch-Catch special case: ไม่ควร error ----------
  @Test
  public void testDuplicateCatchVariablesSameName_defaultHandler_noErrorReported() {
    Node script = parse("try { } catch (e) { } try { } catch (e) { }");
    creator.createScope(script, null);

    assertEquals(0, compiler.getErrorCount());
  }

  // ---------- 9. Duplicate var: default handler รายงาน error ----------
  @Test
  public void testDuplicateVarDeclaration_defaultHandler_reportsOneError() {
    Node script = parse("var a; var a;");
    creator.createScope(script, null);

    assertEquals(1, compiler.getErrorCount());
  }

  // ---------- 10. Custom handler ถูกเรียกเมื่อซ้ำ ----------
  @Test
  public void testDuplicateVarDeclaration_customHandlerInvokedOnce() {
    RecordingHandler handler = new RecordingHandler();
    SyntacticScopeCreator customCreator =
        new SyntacticScopeCreator(compiler, handler);
    Node script = parse("var a; var a;");

    Scope scope = customCreator.createScope(script, null);

    assertEquals(1, handler.callCount);
    assertEquals("a", handler.lastName);
    // 'a' ตัวแรกถูก declare สำเร็จก่อนตัวซ้ำจะถูกสกัดไว้
    assertTrue(scope.isDeclared("a", false));
  }

  // ---------- 11. Declare ใหม่ (ไม่ซ้ำ) -> handler ไม่ถูกเรียก ----------
  @Test
  public void testFreshVariableDeclaration_customHandlerNotInvoked() {
    RecordingHandler handler = new RecordingHandler();
    SyntacticScopeCreator customCreator =
        new SyntacticScopeCreator(compiler, handler);
    Node script = parse("var a;");

    customCreator.createScope(script, null);

    assertEquals(0, handler.callCount);
  }

  // ---------- 12. arguments เป็น parameter -> trigger handler แม้ครั้งแรก ----------
  @Test
  public void testArgumentsParam_triggersHandlerEvenOnFirstDeclaration() {
    RecordingHandler handler = new RecordingHandler();
    SyntacticScopeCreator customCreator =
        new SyntacticScopeCreator(compiler, handler);
    Node script = parse("function f(arguments) {}");

    Scope global = customCreator.createScope(script, null);
    assertEquals(0, handler.callCount);

    Node functionNode = script.getFirstChild();
    customCreator.createScope(functionNode, global);

    assertEquals(1, handler.callCount);
    assertEquals("arguments", handler.lastName);
  }

  // ---------- 13. arguments ถูก shadow ด้วย catch param -> error ----------
  @Test
  public void testArgumentsShadowedByCatchParam_defaultHandler_reportsError() {
    Node script = parse("function f() { try { } catch (arguments) { } }");
    Scope global = creator.createScope(script, null);
    Node functionNode = script.getFirstChild();

    creator.createScope(functionNode, global);

    assertEquals(1, compiler.getErrorCount());
  }

  // ---------- 14. arguments ผ่าน var declaration -> เงียบ ไม่ error ไม่ declare ----------
  @Test
  public void testArgumentsAsVarDeclaration_silentlyIgnoredNoErrorNotDeclared() {
    Node script = parse("function f() { var arguments; }");
    Scope global = creator.createScope(script, null);
    Node functionNode = script.getFirstChild();

    Scope local = creator.createScope(functionNode, global);

    assertEquals(0, compiler.getErrorCount());
    // redeclarationHandler ถูกเรียกแทน scope.declare -> ไม่ถูกเพิ่มเข้า scope จริง
    assertFalse(local.isDeclared("arguments", false));
  }

  // ---------- 15. Control structure / statement block traversal ----------
  @Test
  public void testVarsInsideIfWhileFor_declaredInEnclosingScope() {
    Node script = parse(
        "if (true) { var x; } else { var y; } "
        + "while (false) { var z; } "
        + "for (var i = 0; i < 1; i++) { var j; }");
    Scope scope = creator.createScope(script, null);

    assertTrue(scope.isDeclared("x", false));
    assertTrue(scope.isDeclared("y", false));
    assertTrue(scope.isDeclared("z", false));
    assertTrue(scope.isDeclared("i", false));
    assertTrue(scope.isDeclared("j", false));
  }

  // ---------- 16. var ภายใน function expression ไม่ถูก hoist ออกไป outer scope ----------
  @Test
  public void testVarsInsideFunctionExpressionBody_notHoistedToOuterScope() {
    Node script = parse("var g = function() { var inner; };");
    Scope global = creator.createScope(script, null);

    assertTrue(global.isDeclared("g", false));
    assertFalse(global.isDeclared("inner", false));
  }

  // ---------- 17. Function ไม่มี parameter -> loop 0 รอบ, arguments ไม่ explicit ----------
  @Test
  public void testFunctionWithNoParams_onlyFunctionNameDeclared() {
    Node script = parse("function f() {}");
    Scope global = creator.createScope(script, null);
    assertTrue(global.isDeclared("f", false));

    Node functionNode = script.getFirstChild();
    Scope local = creator.createScope(functionNode, global);

    assertFalse(local.isDeclared("arguments", false));
  }

  // ---------- 18. ตรวจ argument ที่ redeclarationHandler ได้รับสำหรับ VAR-case ----------
  @Test
  public void testDuplicateVarDeclaration_handlerReceivesExpectedNodesForVarCase() {
    RecordingHandler handler = new RecordingHandler();
    SyntacticScopeCreator customCreator =
        new SyntacticScopeCreator(compiler, handler);
    Node script = parse("var a; var a;");

    customCreator.createScope(script, null);

    assertEquals(1, handler.callCount);
    // declareVar(name, child /*NAME*/, n /*VAR*/, parent /*script*/, null, n /*VAR*/)
    assertEquals(Token.VAR, handler.lastParent.getType());
    assertEquals(Token.NAME, handler.lastNode.getType());
    assertSame(handler.lastParent, handler.lastNodeWithLineNumber);
    assertSame(script, handler.lastGramps);
  }

  // ---------- 19. ชื่อซ้ำภายใน var statement เดียวกัน (loop ภายใน VAR case) ----------
  @Test
  public void testSingleVarStatementWithDuplicateNames_reportsOneRedeclaration() {
    RecordingHandler handler = new RecordingHandler();
    SyntacticScopeCreator customCreator =
        new SyntacticScopeCreator(compiler, handler);
    Node script = parse("var a, a;");

    customCreator.createScope(script, null);

    assertEquals(1, handler.callCount);
    assertEquals("a", handler.lastName);
  }

  // ---------- 20. Loop ต้องทำงานต่อหลังพบตัวซ้ำ (ไม่ break) ----------
  @Test
  public void testVarStatementLoopContinuesAfterRedeclaration_laterVarsStillDeclared() {
    Node script = parse("var a, a, b;");
    Scope scope = creator.createScope(script, null);

    assertTrue(scope.isDeclared("b", false));
    assertEquals(1, compiler.getErrorCount());
  }
}

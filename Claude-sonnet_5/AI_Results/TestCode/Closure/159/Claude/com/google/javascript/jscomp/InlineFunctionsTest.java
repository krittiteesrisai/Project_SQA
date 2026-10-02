package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Suppliers;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

/**
 * Unit tests สำหรับ {@link InlineFunctions} (Defects4J Closure-159b)
 *
 * หมายเหตุสำคัญ:
 * - InlineFunctions เป็น package-private class จึงไม่มี import statement
 *   (อยู่ package เดียวกันคือ com.google.javascript.jscomp)
 * - ส่วน "white-box" (constructor, getOrCreateFunctionState, isCandidateUsage)
 *   เป็นเทสที่ไม่ต้องเดา behavior เลย เพราะ trace ได้จาก source โดยตรง
 * - ส่วน "integration" (testProcess_*) ใช้ CompilerTestCase ซึ่งสมมติว่ามีอยู่ใน
 *   classpath เดียวกัน (เป็น test-utility มาตรฐานของ Closure Compiler)
 *   ผลลัพธ์ exact-output บางกรณีที่ตรวจสอบไม่ได้จาก source ที่ให้มา
 *   (เช่นรายละเอียดของ FunctionInjector) จะถูก "งด" หรือคอมเมนต์กำกับ
 *   ระดับความมั่นใจไว้อย่างชัดเจน
 */
public class InlineFunctionsTest extends CompilerTestCase {

  private boolean inlineGlobalFunctions;
  private boolean inlineLocalFunctions;
  private boolean blockFunctionInliningEnabled;

  public InlineFunctionsTest() {
    // process() ต้องการ compiler.getLifeCycleStage().isNormalized() == true
    enableNormalize();
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    inlineGlobalFunctions = true;
    inlineLocalFunctions = true;
    blockFunctionInliningEnabled = true;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    // สมมติฐาน: AbstractCompiler.LifeCycleStage.NORMALIZED คือ enum ที่ตรงกับ
    // compiler.getLifeCycleStage().isNormalized() ในซอร์สต้นฉบับ
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    return new InlineFunctions(
        compiler,
        compiler.getUniqueNameIdSupplier(),
        inlineGlobalFunctions,
        inlineLocalFunctions,
        blockFunctionInliningEnabled);
  }

  // =====================================================================
  // 1) Constructor -- ครอบคลุม Preconditions.checkArgument() ทั้ง 2 branch
  // =====================================================================

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_NullCompilerThrows() {
    new InlineFunctions(null, Suppliers.ofInstance("x"), true, true, true);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_NullSupplierThrows() {
    Compiler compiler = new Compiler();
    new InlineFunctions(compiler, null, true, true, true);
  }

  @Test
  public void testConstructor_ValidArgumentsDoesNotThrow() {
    Compiler compiler = new Compiler();
    InlineFunctions inst =
        new InlineFunctions(compiler, Suppliers.ofInstance("x"), true, true, true);
    assertNotNull(inst);
  }

  // =====================================================================
  // 2) getOrCreateFunctionState -- ครอบคลุม branch fs==null / fs!=null
  //    (คืนค่าเป็น private nested type จึงต้องรับด้วย Object)
  // =====================================================================

  @Test
  public void testGetOrCreateFunctionState_CreatesNewOnFirstCall() {
    InlineFunctions inst =
        new InlineFunctions(new Compiler(), Suppliers.ofInstance("x"), true, true, true);
    Object fs = inst.getOrCreateFunctionState("foo");
    assertNotNull(fs);
  }

  @Test
  public void testGetOrCreateFunctionState_ReturnsSameInstanceForSameName() {
    InlineFunctions inst =
        new InlineFunctions(new Compiler(), Suppliers.ofInstance("x"), true, true, true);
    Object fs1 = inst.getOrCreateFunctionState("foo");
    Object fs2 = inst.getOrCreateFunctionState("foo");
    assertSame("ต้อง cache FunctionState เดิมสำหรับชื่อฟังก์ชันเดียวกัน (fs != null branch)",
        fs1, fs2);
  }

  @Test
  public void testGetOrCreateFunctionState_DifferentNamesGetDifferentInstances() {
    InlineFunctions inst =
        new InlineFunctions(new Compiler(), Suppliers.ofInstance("x"), true, true, true);
    Object fs1 = inst.getOrCreateFunctionState("foo");
    Object fs2 = inst.getOrCreateFunctionState("bar");
    assertNotSame(fs1, fs2);
  }

  // =====================================================================
  // 3) isCandidateUsage(Node) -- white-box, ครอบคลุมทุก if/else branch
  //    โดยสร้าง Node tree เองแบบ deterministic (ไม่ต้องเดา behavior)
  // =====================================================================

  @Test
  public void testIsCandidateUsage_VarDeclarationIsCandidate() {
    Node nameNode = Node.newString(Token.NAME, "foo");
    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(nameNode);
    assertTrue(InlineFunctions.isCandidateUsage(nameNode));
  }

  @Test
  public void testIsCandidateUsage_FunctionDeclarationIsCandidate() {
    Node nameNode = Node.newString(Token.NAME, "foo");
    Node fnNode = new Node(Token.FUNCTION);
    fnNode.addChildToBack(nameNode);
    assertTrue(InlineFunctions.isCandidateUsage(nameNode));
  }

  @Test
  public void testIsCandidateUsage_CallFirstChildIsCandidate() {
    Node nameNode = Node.newString(Token.NAME, "foo");
    new Node(Token.CALL, nameNode); // ผูก parent ให้ nameNode
    assertTrue(InlineFunctions.isCandidateUsage(nameNode));
  }

  @Test
  public void testIsCandidateUsage_CallNonFirstChildIsNotCandidate() {
    Node firstArg = Node.newString(Token.NAME, "bar");
    Node nameNode = Node.newString(Token.NAME, "foo");
    Node callNode = new Node(Token.CALL, firstArg);
    callNode.addChildToBack(nameNode); // "foo" เป็นอาร์กิวเมนต์ ไม่ใช่ตัวถูกเรียก
    assertFalse(InlineFunctions.isCandidateUsage(nameNode));
  }

  @Test
  public void testIsCandidateUsage_DotCallWithCallGrandparentIsCandidate() {
    // pattern: foo.call(...)
    Node nameNode = Node.newString(Token.NAME, "foo");
    Node stringNode = Node.newString(Token.STRING, "call");
    Node getPropNode = new Node(Token.GETPROP, nameNode, stringNode);
    new Node(Token.CALL, getPropNode);
    assertTrue(InlineFunctions.isCandidateUsage(nameNode));
  }

  @Test
  public void testIsCandidateUsage_DotCallWithoutCallGrandparentIsNotCandidate() {
    // pattern: foo.call ที่ไม่ได้ถูกครอบด้วย CALL อีกชั้น
    Node nameNode = Node.newString(Token.NAME, "foo");
    Node stringNode = Node.newString(Token.STRING, "call");
    Node getPropNode = new Node(Token.GETPROP, nameNode, stringNode);
    new Node(Token.EXPR_RESULT, getPropNode); // gramps ไม่ใช่ CALL
    assertFalse(InlineFunctions.isCandidateUsage(nameNode));
  }

  @Test
  public void testIsCandidateUsage_DotPropertyNotCallIsNotCandidate() {
    // pattern: foo.length -- string ไม่ใช่ "call"
    Node nameNode = Node.newString(Token.NAME, "foo");
    Node stringNode = Node.newString(Token.STRING, "length");
    new Node(Token.GETPROP, nameNode, stringNode);
    assertFalse(InlineFunctions.isCandidateUsage(nameNode));
  }

  @Test
  public void testIsCandidateUsage_OtherUsageIsNotCandidate() {
    // pattern: new foo() -- isCandidateUsage ไม่มี branch พิเศษสำหรับ NEW
    Node nameNode = Node.newString(Token.NAME, "foo");
    new Node(Token.NEW, nameNode);
    assertFalse(InlineFunctions.isCandidateUsage(nameNode));
  }

  // =====================================================================
  // 4) process() -- integration test ผ่าน CompilerTestCase
  //    เลือกเฉพาะกรณีที่ trace logic ได้ชัดเจนจาก source ที่ให้มา
  // =====================================================================

  @Test
  public void testProcess_EmptyScriptNoChange() {
    // ครอบคลุม early-return: fns.isEmpty() หลัง FindCandidateFunctions
    testSame("");
  }

  @Test
  public void testProcess_UnusedCandidateFunctionIsRemoved() {
    // ฟังก์ชันเข้าเกณฑ์ inline ได้ ไม่มี call site และไม่มี usage อื่นที่ทำให้
    // canRemove()==false -> removeInlinedFunctions() จะลบฟังก์ชันทิ้ง
    // แม้ไม่มีการ inline เกิดขึ้นจริง (ความมั่นใจสูง เพราะ trace ได้ตรงจาก
    // removeInlinedFunctions()/trimCanidatesUsingOnCost() ที่ให้มา)
    test("function foo(){return 1;}", "");
  }

  @Test
  public void testProcess_FunctionReferencedAsValueIsNotRemovedOrChanged() {
    // "var x = foo;" -> isCandidateUsage คืน false -> เข้า else-branch ของ
    // checkNameUsage -> fs.setRemove(false); เนื่องจากไม่มี call site
    // (hasReferences()==false) และ canRemove()==false -> ถูกตัดจาก fns ใน
    // trimCanidatesUsingOnCost() -> fns.isEmpty() -> process() คืนก่อนแก้โค้ด
    testSame("function foo(){return 1;} var x = foo;");
  }

  @Test
  public void testProcess_AssignToFunctionNameDisablesInline() {
    // "foo = 2;" -> parent ของ NAME คือ ASSIGN ฝั่งซ้าย -> fs.setInline(false)
    // -> ถูกตัดใน trimCanidatesNotMeetingMinimumRequirements()
    testSame("function foo(){return 1;} foo = 2;");
  }

  @Test
  public void testProcess_GlobalInliningDisabledKeepsCode() {
    inlineGlobalFunctions = false;
    // visit() ของ FindCandidateFunctions: (inGlobalScope && inlineGlobalFunctions)
    // เป็น false และไม่ใช่ local scope -> findNamedFunctions ไม่ถูกเรียก
    // -> fns ว่าง -> testSame
    testSame("function foo(){return 1;} foo();");
  }

  @Test
  public void testProcess_LocalInliningDisabledSkipsLocalFunction() {
    inlineLocalFunctions = false;
    // shouldTraverse() = inlineLocalFunctions || inGlobalScope
    // เมื่อ inlineLocalFunctions==false และเข้าไปใน local scope แล้ว
    // จะไม่ traverse ต่อ จึงไม่พบฟังก์ชัน foo ที่ประกาศภายใน outer
    testSame(
        "function outer(){ function foo(){return 1;} var x = foo(); return x; }");
  }

  @Test
  public void testProcess_BlockInliningDisabledKeepsMultiStatementFunction() {
    blockFunctionInliningEnabled = false;
    // body มี var-declaration + return (ไม่ใช่ return เดียวล้วน ๆ) ตาม javadoc
    // ของคลาส ฟังก์ชันแบบนี้ inline "directly" ไม่ได้ ต้องใช้ block-inlining
    // ซึ่งถูกปิด -> fs.setInline(false) -> ไม่มีการแก้ไขซอร์ส
    testSame("function foo(a){var b=a; return b;} var x = foo(1);");
  }

  @Test
  public void testProcess_SimpleDirectInlineNoArgs() {
    // ฟังก์ชันมี statement เดียว (return literal) ถูกเรียกครั้งเดียว
    // -> isDirectCallNodeReplacementPossible==true -> inline โดยตรง
    // (pattern พื้นฐานที่สุดของ direct-inlining, ความมั่นใจสูง)
    test("function foo(){return 1;} foo();", "1;");
  }

  @Test
  public void testProcess_SimpleDirectInlineWithArgument() {
    test("function foo(a){return a;} var x = foo(1);", "var x = 1;");
  }

  @Test
  public void testProcess_ImmediatelyInvokedFunctionExpression() {
    // ครอบคลุม findFunctionExpressions(): CALL ที่ first child เป็น FUNCTION
    // (ความมั่นใจระดับกลาง: ผลลัพธ์ที่แน่นอนขึ้นกับ FunctionInjector
    // ซึ่งไม่ได้อยู่ใน source ที่ให้มา แต่เป็น pattern พื้นฐานของ IIFE inlining)
    test("(function(){return 1;})();", "1;");
  }

  @Test
  public void testProcess_RecursiveFunctionIsNotInlined() {
    // ตาม class javadoc: ฟังก์ชัน recursive จะไม่ถูก inline
    // (เงื่อนไขจริงตรวจใน FunctionInjector.doesFunctionMeetMinimumRequirements
    // ซึ่งไม่มีอยู่ใน source ที่ให้มา จึงอ้างอิง contract จาก javadoc เท่านั้น
    // -- ความมั่นใจระดับกลาง)
    testSame(
        "function foo(a){ if (a > 0) { return foo(a - 1); } return 0; } "
        + "foo(5);");
  }
}

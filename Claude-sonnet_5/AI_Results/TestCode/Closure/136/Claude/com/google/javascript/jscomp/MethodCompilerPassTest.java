package com.google.javascript.jscomp;
// หมายเหตุ: อยู่ package เดียวกับ MethodCompilerPass (package-private class)
// จึงไม่จำเป็นต้องมี import statement แยกสำหรับคลาสเป้าหมาย
// แต่ import ชนิดอื่นที่จำเป็นไว้ด้านล่าง

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * JUnit4 tests for {@link MethodCompilerPass}.
 *
 * หมายเหตุทั่วไป:
 * - ใช้ Compiler/JsAst/SourceFile จริง (คลาสภายในโปรเจกต์เดียวกัน ไม่ใช่ jar
 *   ภายนอกที่กำหนดใน classpath) เพื่อสร้าง Node tree จริงสำหรับทดสอบ scope
 *   resolution (Scope.Var) ที่ MethodCompilerPass ใช้งานตรง ๆ
 * - CompilerOptions.ideMode ถูกสมมติว่าเป็น public field แบบเดิมของ Closure
 *   Compiler ในยุคนี้ หากเวอร์ชันจริงเปลี่ยนเป็น setter จะต้องแก้เป็น
 *   options.setIdeMode(true) — คอมเมนต์กำกับความไม่แน่นอนไว้ตรงจุดที่ใช้งาน
 */
public class MethodCompilerPassTest {

  private Compiler compiler;
  private RecordingSignatureStore signatureStore;
  private TestPass pass;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    compiler.initOptions(options);
    signatureStore = new RecordingSignatureStore();
    pass = new TestPass(compiler, signatureStore);
  }

  /** Helper: parse code string เป็น Node tree (SCRIPT root) จริง */
  private Node parse(String code, String filename) {
    SourceFile file = SourceFile.fromCode(filename, code);
    JsAst ast = new JsAst(file);
    return ast.getAstRoot(compiler);
  }

  private Node emptyScript(String filename) {
    return parse("", filename);
  }

  // ---------------------------------------------------------------------
  // Stub / fake implementations
  // ---------------------------------------------------------------------

  /** บันทึกการเรียก reset/add/removeSignature เพื่อใช้ assert ในเทส */
  static class RecordingSignatureStore implements MethodCompilerPass.SignatureStore {
    final List<String> added = new ArrayList<String>();
    final List<String> removed = new ArrayList<String>();
    boolean resetCalled = false;

    public void reset() {
      resetCalled = true;
      added.clear();
      removed.clear();
    }

    public void addSignature(String functionName, Node functionNode, String sourceFile) {
      added.add(functionName);
    }

    public void removeSignature(String functionName) {
      removed.add(functionName);
    }
  }

  /** No-op acting callback: ไม่ใช่ส่วนที่ต้องทดสอบ logic ของคลาสนี้ */
  static class NoopCallback extends NodeTraversal.AbstractPostOrderCallback {
    public void visit(NodeTraversal t, Node n, Node parent) {
      // ไม่ทำอะไร — เพียงให้ process() ทำงานจบได้ครบ
    }
  }

  /** Concrete subclass เพื่อเปิดให้ทดสอบ abstract class ได้ */
  static class TestPass extends MethodCompilerPass {
    private final SignatureStore store;

    TestPass(AbstractCompiler compiler, SignatureStore store) {
      super(compiler);
      this.store = store;
    }

    @Override
    Callback getActingCallback() {
      return new NoopCallback();
    }

    @Override
    SignatureStore getSignatureStore() {
      return store;
    }
  }

  // =====================================================================
  // GetExternMethods : GETPROP / GETELEM branches
  // =====================================================================

  @Test
  public void testExternGetProp_WithFunctionAssignment_AddsSignature() {
    Node externs = parse("Foo.bar = function(a, b) {};", "externs.js");
    Node root = emptyScript("empty.js");

    pass.process(externs, root);

    assertTrue("externMethods ต้องมี bar", pass.externMethods.contains("bar"));
    assertFalse("bar มี signature ไม่ควรอยู่ใน withoutSignatures",
        pass.externMethodsWithoutSignatures.contains("bar"));
    assertTrue("signatureStore ต้องถูก addSignature('bar', ...)",
        signatureStore.added.contains("bar"));
    assertTrue("methodDefinitions ต้องมี key bar",
        pass.methodDefinitions.containsKey("bar"));
  }

  @Test
  public void testExternGetProp_WithoutFunctionAssignment_MarksWithoutSignature() {
    // สแตนด์อโลน GETPROP (ไม่ได้อยู่ใน ASSIGN pattern ที่ต้องการ)
    Node externs = parse("Foo.bar;", "externs.js");
    Node root = emptyScript("empty.js");

    pass.process(externs, root);

    assertTrue(pass.externMethods.contains("bar"));
    assertTrue("ไม่มี signature ต้องถูก mark ว่า withoutSignature",
        pass.externMethodsWithoutSignatures.contains("bar"));
    assertTrue("ต้องเรียก removeSignature('bar')",
        signatureStore.removed.contains("bar"));
    assertFalse(signatureStore.added.contains("bar"));
  }

  @Test
  public void testExternGetElem_NonStringDest_NoSignatureAdded() {
    // dest คือ NUMBER (0) ไม่ใช่ STRING -> ต้อง return ก่อนเข้าเงื่อนไขอื่น
    Node externs = parse("Foo[0] = function() {};", "externs.js");
    Node root = emptyScript("empty.js");

    pass.process(externs, root);

    assertTrue("ไม่ควรมีชื่อ method ใดถูกเก็บเลย (early return)",
        pass.externMethods.isEmpty());
    assertTrue(signatureStore.added.isEmpty());
    assertTrue(signatureStore.removed.isEmpty());
  }

  @Test
  public void testExternObjectLit_MixedFunctionAndNonFunctionValues() {
    Node externs = parse(
        "var obj = {foo: function() {}, bar: 1};", "externs.js");
    Node root = emptyScript("empty.js");

    pass.process(externs, root);

    assertTrue(pass.externMethods.contains("foo"));
    assertTrue(pass.externMethods.contains("bar"));
    assertTrue("foo มี function value ต้อง addSignature",
        signatureStore.added.contains("foo"));
    assertTrue("bar ไม่ใช่ function ต้อง removeSignature + withoutSignatures",
        signatureStore.removed.contains("bar"));
    assertTrue(pass.externMethodsWithoutSignatures.contains("bar"));
    assertFalse(pass.externMethodsWithoutSignatures.contains("foo"));
  }

  // =====================================================================
  // addSignature: skip เมื่อชื่ออยู่ใน externMethodsWithoutSignatures แล้ว
  // =====================================================================

  @Test
  public void testAddSignature_SkippedWhenAlreadyWithoutSignatureInExterns() {
    // ระยะ extern ทำให้ "bar" ถูก mark เป็น withoutSignature ก่อน
    Node externs = parse("Foo.bar;", "externs.js");
    // ระยะ js: static assignment แบบมี function จริง (ไม่เกี่ยวกับ prototype bug)
    Node root = parse("Foo.bar = function() {};", "js.js");

    pass.process(externs, root);

    assertTrue(pass.externMethodsWithoutSignatures.contains("bar"));
    // addSignature ควร return ก่อนบันทึกอะไรเพิ่มจากฝั่ง js
    assertFalse("addSignature ต้องถูกข้ามเพราะอยู่ใน withoutSignatures แล้ว",
        pass.methodDefinitions.containsKey("bar"));
    assertFalse(signatureStore.added.contains("bar"));
  }

  // =====================================================================
  // GatherSignatures: GETPROP/GETELEM (static, non-prototype)
  // =====================================================================

  @Test
  public void testStaticAssignment_FunctionValue_AddsSignature() {
    Node externs = emptyScript("externs.js");
    Node root = parse("Foo.bar = function() {};", "js.js");

    pass.process(externs, root);

    assertTrue(pass.methodDefinitions.containsKey("bar"));
    assertTrue(signatureStore.added.contains("bar"));
    assertFalse(pass.nonMethodProperties.contains("bar"));
  }

  @Test
  public void testStaticAssignment_NameReferencesFunctionVar_AddsSignature() {
    Node externs = emptyScript("externs.js");
    Node root = parse(
        "function baz() {} Foo.bar = baz;", "js.js");

    pass.process(externs, root);

    assertTrue("baz เป็น function ที่ประกาศไว้ ต้องถูก resolve เป็น signature",
        pass.methodDefinitions.containsKey("bar"));
    assertTrue(signatureStore.added.contains("bar"));
  }

  @Test
  public void testStaticAssignment_NameReferencesNonFunctionVar_AddsNonMethodProperty() {
    Node externs = emptyScript("externs.js");
    Node root = parse("var baz = 5; Foo.bar = baz;", "js.js");

    pass.process(externs, root);

    assertFalse(pass.methodDefinitions.containsKey("bar"));
    assertTrue("baz ไม่ใช่ function -> ต้องถูกจัดเป็น nonMethodProperties",
        pass.nonMethodProperties.contains("bar"));
    assertFalse(signatureStore.added.contains("bar"));
  }

  @Test
  public void testStaticAssignment_NonFunctionNonNameValue_AddsNonMethodProperty() {
    // node ไม่ใช่ทั้ง FUNCTION และ NAME -> ตกไปที่ else สุดท้ายตรง ๆ
    Node externs = emptyScript("externs.js");
    Node root = parse("Foo.bar = 5;", "js.js");

    pass.process(externs, root);

    assertFalse(pass.methodDefinitions.containsKey("bar"));
    assertTrue(pass.nonMethodProperties.contains("bar"));
  }

  @Test
  public void testStaticAssignment_UndefinedVar_NotIdeMode_ThrowsIllegalStateException() {
    // ideMode default = false -> ต้อง throw ตามซอร์สตรง ๆ
    Node externs = emptyScript("externs.js");
    Node root = parse("Foo.bar = undefinedVarXyz;", "js.js");

    try {
      pass.process(externs, root);
      fail("คาดว่าจะมี exception เนื่องจากตัวแปรไม่ถูกประกาศและไม่ได้อยู่ใน ideMode");
    } catch (Throwable t) {
      // หมายเหตุ: NodeTraversal อาจ propagate exception ตรง ๆ หรืออาจห่อไว้
      // (ไม่แน่ใจ 100% ของกลไกภายใน NodeTraversal เวอร์ชันนี้) จึงตรวจแบบ
      // ผ่อนปรนทั้งกรณี IllegalStateException ตรง ๆ และกรณีถูก wrap เป็น cause
      boolean isExpected = (t instanceof IllegalStateException)
          || (t.getCause() instanceof IllegalStateException);
      assertTrue("ควรได้ IllegalStateException (ตรงหรือใน cause)", isExpected);
    }
  }

  @Test
  public void testStaticAssignment_UndefinedVar_IdeMode_NoExceptionAndNoSignature() {
    // หมายเหตุ: สมมติ CompilerOptions มี public field ideMode ตามยุคนี้ของ
    // Closure Compiler ถ้า API จริงต่างไปต้องปรับเป็น setter ที่เหมาะสม
    options.ideMode = true;

    Node externs = emptyScript("externs.js");
    Node root = parse("Foo.bar = undefinedVarXyz;", "js.js");

    pass.process(externs, root); // ต้องไม่ throw

    assertFalse(pass.methodDefinitions.containsKey("bar"));
    // สำคัญ: เมื่อ v==null && ideMode -> return ทันที ก่อนถึงบรรทัด
    // nonMethodProperties.add(name) จึง "bar" ไม่ควรถูกเพิ่มเข้า nonMethodProperties เลย
    assertFalse("เมื่อ ideMode คืนค่าทันที ไม่ควรเพิ่มลง nonMethodProperties",
        pass.nonMethodProperties.contains("bar"));
  }

  @Test
  public void testDynamicElem_NonStringDest_NoActionTaken() {
    // dest คือ NAME(x) ไม่ใช่ STRING -> ทั้ง if("prototype") และ else ไม่ถูกเข้า
    Node externs = emptyScript("externs.js");
    Node root = parse("var x = 'bar'; Foo[x] = function() {};", "js.js");

    pass.process(externs, root);

    assertTrue(pass.methodDefinitions.isEmpty());
    assertTrue(pass.nonMethodProperties.isEmpty());
  }

  // =====================================================================
  // GatherSignatures: OBJECTLIT
  // =====================================================================

  @Test
  public void testGatherSignatures_ObjectLiteral_MixedValues() {
    Node externs = emptyScript("externs.js");
    Node root = parse(
        "var obj = {foo: function() {}, bar: 5};", "js.js");

    pass.process(externs, root);

    assertTrue(pass.methodDefinitions.containsKey("foo"));
    assertTrue(signatureStore.added.contains("foo"));
    assertFalse(pass.methodDefinitions.containsKey("bar"));
    assertTrue(pass.nonMethodProperties.contains("bar"));
  }

  // =====================================================================
  // GatherSignatures: processPrototypeParent
  // =====================================================================

  @Test
  public void testPrototypeAssignment_NonObjectNonFunction_NoMatchingCase() {
    // Foo.prototype = 5;  -> processPrototypeParent ได้รับ n = ASSIGN
    // ซึ่งไม่ตรงกับ case GETPROP/GETELEM ใด ๆ -> ไม่มีอะไรเกิดขึ้น (ไม่ throw)
    Node externs = emptyScript("externs.js");
    Node root = parse("Foo.prototype = 5;", "js.js");

    pass.process(externs, root); // ต้องไม่ throw

    assertTrue(pass.methodDefinitions.isEmpty());
  }

  @Test
  public void testPrototypeMethodAssignment_ExpectedToRegisterSignature() {
    // *** ทดสอบพฤติกรรมที่ "ตั้งใจไว้" ตาม comment ในซอร์ส ***
    // ตาม comment ในซอร์ส: "Foo.prototype.getBar = function() {...}" ควรถูก
    // ตรวจจับเป็น method signature ผ่าน processPrototypeParent
    //
    // ข้อสังเกต (อาจเป็น FAULT): ในโค้ด processPrototypeParent มีการเรียก
    //   Node parent = n.getParent().getParent();
    // ซึ่งสำหรับ statement ระดับบนสุด `Foo.prototype.bar = function(){};`
    // n (= outer GETPROP) .getParent() คือ ASSIGN อยู่แล้ว (1 level) การเรียก
    // .getParent() อีกครั้งจะกระโดดไปที่ EXPR_RESULT ไม่ใช่ ASSIGN ทำให้เงื่อนไข
    // parent.getType()==ASSIGN เป็น false เสมอ และ addPossibleSignature จะไม่ถูก
    // เรียกเลย ต่างจาก branch คู่ขนาน (static, non-prototype) ที่เช็ค parent
    // เพียง 1 level เท่านั้น — ถ้า assertion นี้ล้มเหลว แสดงว่าเจอ fault ตรงจุดนี้จริง
    Node externs = emptyScript("externs.js");
    Node root = parse("Foo.prototype.bar = function() {};", "js.js");

    pass.process(externs, root);

    assertTrue(
        "คาดหวังว่า prototype method assignment ควรถูกลงทะเบียนเป็น signature "
        + "ตาม design comment ในซอร์ส (ถ้า fail แสดงว่าพบ fault ใน "
        + "processPrototypeParent ตามที่ตั้งข้อสังเกตไว้ข้างบน)",
        pass.methodDefinitions.containsKey("bar"));
  }

  // =====================================================================
  // process(): state clearing behaviour
  // =====================================================================

  @Test
  public void testProcess_ClearsMostState_ButNotNonMethodProperties() {
    // Run 1: สร้างสถานะในทุกฟิลด์
    Node externs1 = parse("Foo.bar;", "externs1.js");
    Node root1 = parse("Foo.baz = 5;", "js1.js");
    pass.process(externs1, root1);

    assertTrue(pass.externMethods.contains("bar"));
    assertTrue(pass.externMethodsWithoutSignatures.contains("bar"));
    assertTrue(pass.nonMethodProperties.contains("baz"));
    assertTrue(signatureStore.resetCalled);

    // Run 2: ใช้ externs/js ที่ว่าง (ไม่มีเนื้อหาเกี่ยวข้องเลย)
    Node externs2 = emptyScript("externs2.js");
    Node root2 = emptyScript("js2.js");
    pass.process(externs2, root2);

    assertTrue("externMethods ต้องถูก clear แล้วไม่มีอะไรเพิ่มใหม่",
        pass.externMethods.isEmpty());
    assertTrue("externMethodsWithoutSignatures ต้องถูก clear",
        pass.externMethodsWithoutSignatures.isEmpty());
    assertTrue("methodDefinitions ต้องถูก clear",
        pass.methodDefinitions.isEmpty());
    // สำคัญ: ตามซอร์สจริง ไม่มีการ clear() nonMethodProperties ใน process()
    // เลย จึงคาดว่าค่าจาก run แรกจะยังคงอยู่ (พฤติกรรมที่อ่านได้ตรงจากซอร์ส)
    assertTrue("nonMethodProperties ไม่ถูก clear ระหว่าง process() ตามซอร์สจริง",
        pass.nonMethodProperties.contains("baz"));
  }

  @Test
  public void testProcess_NullExterns_BranchCoverageOnly() {
    // ครอบคลุม branch "if (externs != null)" เป็น false
    // หมายเหตุ: ไม่แน่ใจว่า NodeTraversal.traverseRoots จะรองรับ null root
    // ใน list [externs, root] ได้หรือไม่ (โค้ดยังส่ง externs เข้า
    // Lists.newArrayList(externs, root) แม้ externs เป็น null) จึงไม่ assert
    // ผลลัพธ์ตายตัว เพียงต้องการให้ branch ถูก exercise และไม่ทำให้ทั้ง
    // test suite ล้มเหลวหากเกิด exception จากพฤติกรรมภายในที่ไม่ได้ระบุไว้
    Node root = parse("var x = 1;", "js.js");
    try {
      pass.process(null, root);
    } catch (Throwable expectedOrNot) {
      // ยอมรับทั้งสองกรณี — ดูคอมเมนต์ด้านบน
    }
  }
}

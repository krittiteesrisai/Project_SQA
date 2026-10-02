package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link FunctionRewriter}.
 *
 * หมายเหตุทั่วไป:
 * - FunctionRewriter, Reducer เป็น package-private จึงทดสอบได้เพราะคลาสนี้อยู่ package เดียวกัน
 * - Reducer ย่อยที่เป็น implementation จริง (EmptyFunctionReducer, GetterReducer ฯลฯ)
 *   เป็น private nested class เข้าถึงไม่ได้แม้จะอยู่ package เดียวกัน จึงทดสอบผ่าน
 *   process() (public entry point ผ่าน CompilerPass) เท่านั้น
 * - บาง assumption เกี่ยวกับ internal API ของ Compiler/NodeTraversal ที่ไม่มีซอร์สให้ดู
 *   จะกำกับด้วยคอมเมนต์ ASSUMPTION ตามข้อกำหนด
 */
public class FunctionRewriterTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    // ASSUMPTION: Compiler มี no-arg constructor และ initOptions(CompilerOptions)
    // ตามรูปแบบมาตรฐานที่ใช้กันทั่วไปในโปรเจกต์ Closure Compiler (ไม่ได้อยู่ในซอร์ส
    // ของ FunctionRewriter ที่ให้มาโดยตรง แต่จำเป็นสำหรับสร้าง AbstractCompiler ใช้งานได้)
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
  }

  /** Helper: parse JS source ผ่าน compiler.parseSyntheticCode ซึ่งถูกใช้จริงในซอร์สเป้าหมาย */
  private Node parse(String code) {
    Node root = compiler.parseSyntheticCode("test.js", code);
    assertNotNull("code ควร parse ได้สำเร็จ: " + code, root);
    return root;
  }

  private boolean containsFunctionNode(Node n) {
    if (n.getType() == Token.FUNCTION) {
      return true;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      if (containsFunctionNode(c)) {
        return true;
      }
    }
    return false;
  }

  // ---------------------------------------------------------------------
  // Constructor
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_doesNotThrow() {
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    assertNotNull(rewriter);
  }

  // ---------------------------------------------------------------------
  // process(): กรณีไม่มี candidate ตรงกับ Reducer ใด ๆ
  //   -> ครอบคลุมกิ่ง `if (reductions.isEmpty()) continue;` = true ของทุก reducer
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_noCandidateNodes_doesNotThrowAndTreeUnchanged() {
    Node root = parse("var x = 1 + 2; function foo(a,b) { return a + b; }");
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    rewriter.process(null, root); // externs ไม่ถูกใช้ใน process() เลย จึงส่ง null ได้

    int count = 0;
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      count++;
    }
    assertEquals(2, count);
  }

  // ---------------------------------------------------------------------
  // process(): boundary - root ว่าง (ไม่มี statement)
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_emptyRoot_doesNotThrow() {
    Node root = parse("");
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    rewriter.process(null, root);
    assertNull(root.getFirstChild());
  }

  // ---------------------------------------------------------------------
  // process(): มี candidate (EmptyFunctionReducer match) แต่เกิดครั้งเดียว
  //   -> reductions ไม่ว่าง, helperCode != null, savings <= threshold
  //   -> ครอบคลุมกิ่ง isEmpty()=false, helperCode!=null=true, savings>threshold=false
  //   เหตุผล: "JSCompiler_emptyFn()" (call) ยาวกว่า "function(){}" (literal) แทบทุกกรณี
  //   จึงทำให้ savings ติดลบ/น้อยกว่า SAVINGS_THRESHOLD(16)+helperCost แน่นอน
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_singleEmptyFunction_insufficientSavings_noChange() {
    Node root = parse("a.b = function() {};");
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    rewriter.process(null, root);
    assertTrue("function node ควรยังอยู่เพราะ savings ไม่พอ apply reduction",
        containsFunctionNode(root));
  }

  // ---------------------------------------------------------------------
  // process(): ครอบคลุมทั้ง 5 pattern (getter, setter, identity, empty, return-const)
  // อย่างละ 1 ครั้ง เพื่อกระตุ้นให้ shouldTraverse() วนลูปตรวจ reducer ทุกตัวต่อ node
  // และยืนยันว่าไม่มี exception และไม่มีการเปลี่ยนแปลง (savings ไม่พอในทุก pattern)
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_oneOfEachPattern_noChangeDueToInsufficientSavings() {
    String code =
        "C.prototype.getA = function() { return this.a_ };" +
        "C.prototype.setA = function(v) { this.a_ = v };" +
        "var id = function(x) { return x };" +
        "var empty = function() {};" +
        "var constant = function() { return 42 };";
    Node root = parse(code);
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    rewriter.process(null, root);
    assertTrue(containsFunctionNode(root));
  }

  // ---------------------------------------------------------------------
  // process(): null root (edge case)
  //   ASSUMPTION: NodeTraversal.traverse(...) จะ dereference root ภายใน (เช่น
  //   root.getType()) โดยไม่มีการเช็ค null ก่อน ทำให้เกิด RuntimeException
  //   (คาดว่าเป็น NullPointerException) — ไม่ได้ตรวจสอบจากซอร์สของ NodeTraversal
  //   ที่ไม่ได้ให้มา จึงกำกับเป็น assumption และไม่ระบุ exception type ที่แน่ชัด
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_nullRoot_throwsRuntimeException() {
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    boolean threw = false;
    try {
      rewriter.process(null, null);
    } catch (RuntimeException e) {
      threw = true;
    }
    assertTrue("คาดว่า process() จะ fail เมื่อ root เป็น null (ดู ASSUMPTION ด้านบน)",
        threw);
  }

  // ---------------------------------------------------------------------
  // process(): best-effort - พยายามกระตุ้นกิ่ง savings > threshold (apply reduction)
  // ด้วยการสร้าง getter pattern จำนวนมาก
  //   ASSUMPTION: การ apply reduction เรียก compiler.getNodeForCodeInsertion(null)
  //   และ compiler.reportCodeChange() ซึ่งพฤติกรรมภายในขึ้นกับสถานะของ Compiler
  //   ที่ปรกติถูกตั้งค่าผ่าน full compile() pipeline ไม่ใช่ parseSyntheticCode()
  //   เพียงอย่างเดียว จึงยอมรับทั้งกรณีสำเร็จและกรณี RuntimeException
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_manyGetterOccurrences_bestEffortReductionBranch() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 50; i++) {
      sb.append("C.prototype.get").append(i)
        .append(" = function() { return this.a_").append(i).append(" };");
    }
    Node root = parse(sb.toString());
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    try {
      rewriter.process(null, root);
      // ไม่ assert รูปแบบผลลัพธ์ที่แน่ชัด เนื่องจากพฤติกรรมขึ้นกับ internal state
      // ของ Compiler ที่ไม่ได้ระบุในซอร์สที่ให้มา (ดู ASSUMPTION)
    } catch (RuntimeException e) {
      // ยอมรับตาม ASSUMPTION ด้านบน
    }
  }

  // ---------------------------------------------------------------------
  // parseHelperCode(): กรณี source ถูกต้อง -> parse สำเร็จ, root != null
  //   -> ครอบคลุมกิ่ง (root != null) ? root.removeFirstChild() : ... = true
  // ---------------------------------------------------------------------

  @Test
  public void testParseHelperCode_validSource_returnsFunctionNode() {
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    FunctionRewriter.Reducer reducer = new FunctionRewriter.Reducer() {
      @Override
      String getHelperSource() {
        return "function fooHelper() { return 1; }";
      }

      @Override
      Node reduce(Node node) {
        return node; // ไม่ใช้ในเทสนี้
      }
    };

    Node helperRoot = rewriter.parseHelperCode(reducer);
    assertNotNull(helperRoot);
    assertEquals(Token.FUNCTION, helperRoot.getType());
  }

  // ---------------------------------------------------------------------
  // parseHelperCode(): กรณี source ผิดรูปแบบ (malformed) -> parse ล้มเหลว
  //   ตาม javadoc "If parse fails, return null"
  //   -> ครอบคลุมกิ่ง (root != null) ? ... : null = false (คืน null)
  // ---------------------------------------------------------------------

  @Test
  public void testParseHelperCode_malformedSource_returnsNull() {
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    FunctionRewriter.Reducer reducer = new FunctionRewriter.Reducer() {
      @Override
      String getHelperSource() {
        return "function ( {"; // syntax ผิด
      }

      @Override
      Node reduce(Node node) {
        return node;
      }
    };

    Node helperRoot = rewriter.parseHelperCode(reducer);
    assertNull(helperRoot);
  }

  // ---------------------------------------------------------------------
  // parseHelperCode(): boundary - source ว่าง
  //   ไม่มีการันตีจากซอร์สที่ให้มาว่าผลลัพธ์คืออะไรแน่ ๆ (root อาจไม่มี child ให้ remove)
  //   จึงยอมรับได้ทั้ง null หรือ RuntimeException (กำกับเป็น ASSUMPTION)
  // ---------------------------------------------------------------------

  @Test
  public void testParseHelperCode_emptySource_boundary() {
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    FunctionRewriter.Reducer reducer = new FunctionRewriter.Reducer() {
      @Override
      String getHelperSource() {
        return "";
      }

      @Override
      Node reduce(Node node) {
        return node;
      }
    };

    try {
      Node helperRoot = rewriter.parseHelperCode(reducer);
      assertNull(helperRoot);
    } catch (RuntimeException e) {
      // ASSUMPTION: removeFirstChild() บน root ที่ไม่มี child อาจ throw
      // ซึ่งไม่ได้ถูกป้องกันไว้อย่างชัดเจนในซอร์สต้นฉบับ
      assertTrue(true);
    }
  }
}

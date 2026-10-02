# แนวคิดและข้อจำกัดสำคัญ (โปรดอ่านก่อน)

`NameAnalyzer` เป็น `final class` **package-private** ที่ทำงานอยู่บน AST (`Node`) ที่ถูก parse โดย `Compiler` เต็มรูปแบบ พึ่งพา `Scope`, `NodeTraversal`, `CodingConvention`, `NodeUtil`, `IR` ฯลฯ ซึ่ง **source ของคลาสช่วยเหล่านี้ไม่ได้ถูกให้มาในโจทย์** การจะสร้าง unit test ที่ isolate เฉพาะ `NameAnalyzer` โดยไม่ผ่าน AST จริงจึงเป็นไปไม่ได้ในทางปฏิบัติ

แนวทางที่ใช้ (ตรงกับรูปแบบทดสอบจริงของไฟล์นี้ใน Closure Compiler codebase):

- Test class อยู่ใน package เดียวกัน (`com.google.javascript.jscomp`) จึง **ไม่จำเป็นต้อง `import NameAnalyzer`** (นี่คือวิธี “import” ที่ถูกต้องสำหรับ package-private class — คือไม่ import แต่ประกาศอยู่ package เดียวกัน)
- ใช้ `CompilerTestCase` ซึ่งเป็น test-utility ที่มาพร้อมกับ source ของโปรเจกต์นี้เอง (ไม่ใช่ third-party jar) เพื่อ parse JS เป็น AST จริงแล้วรัน pass ผ่าน `getProcessor()`
- จุดใดที่พฤติกรรมขึ้นกับ helper ที่ไม่มี source ให้ (เช่น `NodeUtil.*`, `Scope`, `NodeTraversal`) และผมไม่มั่นใจ 100% จะ **คอมเมนต์กำกับไว้ชัดเจน** และ **ไม่เขียนเทสสำหรับ branch ที่เดา** (เช่น `InstanceOfCheckNode.remove()` ที่พึ่ง `GatherSideEffectSubexpressionsCallback` ซึ่งไม่มี source ให้)

```java
package com.google.javascript.jscomp;

import org.junit.Test;

/**
 * Unit tests for {@link NameAnalyzer} (Defects4J Closure-114b).
 *
 * ASSUMPTIONS / หมายเหตุความไม่แน่นอน:
 * 1) ใช้ {@code CompilerTestCase} (test helper เดิมของโปรเจกต์ ไม่ใช่ third-party lib)
 *    เพื่อ parse source เป็น AST จริงและรัน NameAnalyzer ผ่าน getProcessor()
 *    เนื่องจาก NameAnalyzer พึ่ง Scope/NodeTraversal/CodingConvention เต็มรูปแบบ
 *    ซึ่งไม่มี source ให้วิเคราะห์ตรง ๆ
 * 2) CompilerTestCase ในโปรเจกต์นี้ historically สืบทอดจาก junit.framework.TestCase
 *    (สไตล์ JUnit3: ตรวจจับเทสจากชื่อเมธอด "testXxx") ดังนั้นทุกเมธอดเทสจึงตั้งชื่อ
 *    ขึ้นต้นด้วย "test" และใส่ @Test annotation ควบคู่กันเพื่อความชัดเจนตามข้อกำหนด JUnit4
 *    (annotation จะถูก JUnit3-runner มองข้ามอย่างปลอดภัย ไม่ทำให้เทส fail)
 * 3) จุดใดที่พฤติกรรมขึ้นกับ NodeUtil.*, IR.*, Scope, CodingConvention (ไม่มี source ให้)
 *    จะกำกับด้วยคอมเมนต์ "ASSUMPTION" ในแต่ละเทส หากไม่มั่นใจเพียงพอ จะไม่เขียนเทสสำหรับ
 *    branch นั้น (ตามข้อกำหนดห้ามเดา behavior) เช่น InstanceOfCheckNode.remove()
 */
public class NameAnalyzerTest extends CompilerTestCase {

  /** ควบคุมว่า process() จะเรียก removeUnreferenced() หรือไม่ (ค่า default = true) */
  private boolean removeUnreferenced = true;

  public NameAnalyzerTest() {
    super("");
  }

  @Override
  protected int getNumRepetitions() {
    // ป้องกันปัญหาการรัน pass ซ้ำสองรอบบน AST ที่ถูกลบโหนดไปแล้วในรอบแรก
    // (ASSUMPTION: เมธอดนี้มีอยู่จริงใน CompilerTestCase ของโปรเจกต์นี้)
    return 1;
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    removeUnreferenced = true;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new NameAnalyzer(compiler, removeUnreferenced);
  }

  // =======================================================================
  // Boundary: empty / no-op input
  // =======================================================================

  @Test
  public void testEmptyProgram() {
    // Boundary case: source ว่างเปล่า ต้องไม่ crash และไม่มีการเปลี่ยนแปลง
    test("", "");
  }

  // =======================================================================
  // การลบชื่อที่ไม่ถูกอ้างอิง (JsNameRefNode.remove(): Token.VAR / Token.FUNCTION /
  // Token.ASSIGN กรณี containingNode.isExprResult() == true)
  // =======================================================================

  @Test
  public void testUnreferencedVarIsRemoved() {
    // ครอบคลุม case Token.VAR ใน JsNameRefNode.remove()
    // และ branch isExternallyReferenceable() == false / isGlobalRef ปกติ
    test("var foo = 1;", "");
  }

  @Test
  public void testUnreferencedFunctionIsRemoved() {
    // ครอบคลุม case Token.FUNCTION ใน JsNameRefNode.remove()
    // และ getRhsSubexpressions(FUNCTION) -> Collections.emptyList()
    test("function foo() {}", "");
  }

  @Test
  public void testUnreferencedAssignStatementIsRemoved() {
    // ครอบคลุม case Token.ASSIGN โดย containingNode.isExprResult() == true
    // (replaceTopLevelExpressionWithRhs ถูกเรียกผ่าน EXPR_RESULT)
    // และ recordWriteOnProperties()/recordSet() สำหรับ qualified name "a.b"
    test("var a = {}; a.b = 1;", "");
  }

  // =======================================================================
  // removeUnreferenced == false -> ไม่มีการลบใด ๆ (if (removeUnreferenced) ... )
  // =======================================================================

  @Test
  public void testUnreferencedNamesKeptWhenRemoveUnreferencedIsFalse() {
    removeUnreferenced = false;
    testSame("var foo = 1; function bar() {}");
  }

  // =======================================================================
  // ชื่อที่ externally referenceable (ผ่าน DEFAULT_GLOBAL_NAMES: "window", "goog.global")
  // ครอบคลุม loop `for (String s : globalNames) { if (name.startsWith(s)) ... }`
  // =======================================================================

  @Test
  public void testGlobalWindowPropertyIsKept() {
    // "window" -> isExternallyReferenceable == true -> reference จาก WINDOW เสมอ
    testSame("window.foo = 1;");
  }

  @Test
  public void testGlobalGoogGlobalPropertyIsKept() {
    // ต้องประกาศ goog ก่อน เพื่อให้ isGlobalRef == true (v != null)
    // แล้วจึงตรวจ prefix "goog.global" ใน isExternallyReferenceable()
    // และ referenceParentNames(): globalNames.contains("goog.global") == true
    // -> ไม่มีการสร้าง JsName กลาง "goog.global" แต่เชื่อม "goog" กับ "goog.global.foo" ตรง ๆ
    testSame("var goog = {}; goog.global.foo = 1;");
  }

  @Test
  public void testTopLevelThisPropertyIsExternallyReferenceable() {
    // ครอบคลุม case Token.THIS ใน createNameInformation(NodeTraversal, Node)
    // และ branch name.indexOf('.') == 0 (strip leading ".")
    // ASSUMPTION: top-level ของ SCRIPT ถือเป็น t.inGlobalScope() == true
    testSame("this.foo = 1;");
  }

  // =======================================================================
  // Reference propagation ผ่าน dependency scope / alias
  // ครอบคลุม recordAssignment(), recordDepScope(), maybeRecordAlias(),
  // recordAlias(), และ ReferencePropagationCallback.traverseEdge()
  // =======================================================================

  @Test
  public void testFunctionReferencedThroughWindowPropertyIsKept() {
    // อิงตัวอย่างใน class javadoc: window['foo'] = new Foo();
    // ที่นี่ใช้ GETPROP แทน GETELEM: window.foo = foo;
    // foo (rhs) ถูก alias เข้ากับ window.foo ผ่าน dependency scope ของ ASSIGN
    // แล้ว window.foo ถูกอ้างอิงจาก WINDOW เสมอ -> propagate ไปถึง foo
    testSame("function foo() {} window.foo = foo;");
  }

  @Test
  public void testGetElemShortensNameToRoot() {
    // ครอบคลุม branch bNameWasShortened = true ใน createNameInformation()
    // เมื่อใช้ GETELEM (window['arr']) แทน GETPROP: name จะถูก reset เป็น root name เดียว
    // เนื่องจาก root คือ "window" ซึ่ง referenced = true เสมอ -> ไม่มีการลบ
    testSame("window['arr'] = {};");
  }

  // =======================================================================
  // Prototype property parsing (idx != -1 ของ PROTOTYPE_SUBSTRING) และ
  // PrototypeSetNode.remove() กรณี gramps.isExprResult() == true
  // =======================================================================

  @Test
  public void testUnreferencedPrototypeMethodIsRemoved() {
    // ns.isPrototype == true -> recordPrototypeSet() แทน recordSet() ปกติ
    // ทั้ง Foo (FUNCTION) และ Foo.prototype.bar (PrototypeSetNode) ใช้ JsName เดียวกัน "Foo"
    test("function Foo() {} Foo.prototype.bar = function() {};", "");
  }

  // =======================================================================
  // ข้อจำกัดที่ระบุใน TODO comment ของซอร์ส:
  // case Token.OBJECTLIT ใน JsNameRefNode.remove() เป็น no-op
  // -> object literal key ไม่ถูกลบแม้จะไม่ถูกอ้างอิงเลย
  // =======================================================================

  @Test
  public void testObjectLiteralKeyIsNotRemovedEvenIfUnreferenced() {
    // obj ถูกอ้างอิงผ่าน window.obj = obj (รูปแบบเดียวกับเทสก่อนหน้า) ดังนั้น
    // "var obj = {foo:1}" ทั้งก้อนจะไม่ถูกแตะต้อง ไม่ว่า key "foo" จะถูกอ้างอิงหรือไม่ก็ตาม
    // (ถ้า foo ไม่ถูกอ้างอิง remove() ของ OBJECTLIT case จะเป็น no-op อยู่ดี)
    testSame("var obj = {foo: 1}; window.obj = obj;");
  }

  // =======================================================================
  // externallyDefined ป้องกันการลบ แม้ referenced == false
  // ครอบคลุม condition `!name.referenced && !name.externallyDefined`
  // ใน removeUnreferenced() และ ProcessExternals callback
  // =======================================================================

  @Test
  public void testExternallyDefinedNameIsNeverRemoved() {
    // extFoo ถูกประกาศใน externs -> externallyDefined = true (ผ่าน ProcessExternals)
    // การ re-declare "var extFoo = 1;" ในซอร์สหลัก (v != null ใน scope ของ root)
    // ทำให้ isExtern == false และ isExternallyReferenceable == false (ไม่ตรง prefix ใด ๆ)
    // ดังนั้น referenced จะยังเป็น false แต่ต้อง "ไม่ถูกลบ" เพราะ externallyDefined == true
    test(
        "var extFoo;",
        "var extFoo = 1;",
        "var extFoo = 1;");
  }

  // =======================================================================
  // Branch ที่จงใจไม่เขียนเทส (ตามข้อกำหนดห้ามเดา behavior):
  // - InstanceOfCheckNode.remove() / parent.isInstanceOf() branch:
  //   ผลลัพธ์สุดท้ายขึ้นกับ NodeUtil.isVarOrSimpleAssignLhs, addSimplifiedExpression,
  //   และ GatherSideEffectSubexpressionsCallback ซึ่งไม่มี source ให้ตรวจสอบ
  // - goog.inherits / classDefiningCall branch (ns.onlyAffectsClassDef):
  //   ขึ้นกับ CodingConvention.getClassesDefinedByCall() ที่ไม่ทราบ default behavior แน่ชัด
  // - FOR-loop dependency scope branch (parent.isFor() && !NodeUtil.isForIn(parent)):
  //   ผลลัพธ์ขึ้นกับ shouldTraverse()/addSimplifiedExpression() ที่ซับซ้อนเกินกว่าจะยืนยัน
  //   exact output ได้อย่างมั่นใจจาก source ที่ให้มา
  // =======================================================================
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| เมธอดเทส | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testEmptyProgram` | Boundary: input ว่าง, traversal ทั้งหมดไม่พบ node ที่เกี่ยว |
| `testUnreferencedVarIsRemoved` | `JsNameRefNode.remove()` → `case Token.VAR`; `getRhsSubexpressions(VAR)`; ชื่อไม่ referenced/ไม่ externallyDefined |
| `testUnreferencedFunctionIsRemoved` | `case Token.FUNCTION`; `getRhsSubexpressions(FUNCTION)` → empty list |
| `testUnreferencedAssignStatementIsRemoved` | `case Token.ASSIGN` เมื่อ `containingNode.isExprResult()==true`; `recordSet()`/`recordWriteOnProperties()` สำหรับ dotted name |
| `testUnreferencedNamesKeptWhenRemoveUnreferencedIsFalse` | `process()`: `if (removeUnreferenced)` = false branch |
| `testGlobalWindowPropertyIsKept` | `isExternallyReferenceable()` loop, `startsWith("window")` = true |
| `testGlobalGoogGlobalPropertyIsKept` | `startsWith("goog.global")`; `referenceParentNames()` เมื่อ `globalNames.contains(parentName)==true` (ข้าม if) |
| `testTopLevelThisPropertyIsExternallyReferenceable` | `createNameInformation`: `case Token.THIS`, `t.inGlobalScope()==true`, `name.indexOf('.')==0` |
| `testFunctionReferencedThroughWindowPropertyIsKept` | `recordAssignment`→`recordDepScope`; `maybeRecordAlias()` true branch; `ReferencePropagationCallback.traverseEdge` |
| `testGetElemShortensNameToRoot` | `createNameInformation`: `bNameWasShortened=true` (GETELEM branch) |
| `testUnreferencedPrototypeMethodIsRemoved` | `ns.isPrototype==true`→`recordPrototypeSet()`; `PrototypeSetNode.remove()` เมื่อ `gramps.isExprResult()==true` |
| `testObjectLiteralKeyIsNotRemovedEvenIfUnreferenced` | `JsNameRefNode.remove()` → `case Token.OBJECTLIT` (no-op) |
| `testExternallyDefinedNameIsNeverRemoved` | `removeUnreferenced()`: `!name.referenced && !name.externallyDefined` (externallyDefined ป้องกันการลบ); `ProcessExternals` |

**หมายเหตุ:** branch เกี่ยวกับ `InstanceOfCheckNode`, class-defining call (`goog.inherits`), และ FOR-loop dependency-scope patch ไม่ได้ถูกทดสอบ เนื่องจากผลลัพธ์สุดท้ายขึ้นกับ helper class (`NodeUtil`, `GatherSideEffectSubexpressionsCallback`, `CodingConvention`) ที่ไม่มี source ให้ตรวจสอบในโจทย์ จึงไม่สามารถยืนยัน expected output ได้อย่างมั่นใจตามข้อกำหนดห้ามเดา behavior
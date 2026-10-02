# DevirtualizePrototypeMethodsTest

## หมายเหตุสำคัญก่อนเริ่ม

`DevirtualizePrototypeMethods` เป็นคลาส **package-private** (constructor รับ `AbstractCompiler`) และเมธอดทั้งหมดเป็น `private` ดังนั้นวิธีเดียวที่จะทดสอบ behavior ของ `process()` ได้คือ:

1. เขียนคลาสทดสอบให้อยู่ใน package เดียวกัน (`com.google.javascript.jscomp`)
2. ใช้ `CompilerTestCase` ซึ่งเป็น test-harness มาตรฐานของโปรเจกต์ Closure Compiler เอง (ไม่ใช่ jar ภายนอก แต่เป็นส่วนหนึ่งของ source tree เดียวกันกับคลาสเป้าหมาย) — **นี่คือเหตุผลที่ `junit4-legacy.jar` ถูกใส่ไว้ใน classpath** เพื่อรองรับการรัน `TestCase` (JUnit3-style) ผ่าน JUnit4 runner
3. เนื่องจาก `CompilerTestCase.test()/testSame()` เปรียบเทียบ **โครงสร้าง AST** ไม่ใช่ string เป๊ะๆ จึงไม่ต้องกังวลเรื่อง whitespace/semicolon

จุดที่ **ไม่แน่ใจ 100%** จาก source ที่ให้มา (เพราะไม่มี source ของ `NodeUtil`, `SimpleDefinitionFinder`, `CodingConvention`) จะกำกับด้วยคอมเมนต์ไว้ในโค้ดทุกจุด

```java
package com.google.javascript.jscomp;

// คลาสเป้าหมายอยู่ package เดียวกัน (import ซ้ำแต่ไม่ผิดตามข้อกำหนดของ Java)
import com.google.javascript.jscomp.DevirtualizePrototypeMethods;

/**
 * Unit tests for {@link DevirtualizePrototypeMethods}.
 *
 * ใช้ CompilerTestCase เป็นฐานเพราะ DevirtualizePrototypeMethods เป็น package-private
 * class ที่ implement CompilerPass — วิธีเดียวที่ทดสอบ process() ได้คือ compile
 * source จริงแล้วตรวจ AST ที่ได้
 */
public class DevirtualizePrototypeMethodsTest extends CompilerTestCase {

  public DevirtualizePrototypeMethodsTest() {
    super(""); // ไม่ต้องใช้ externs พิเศษสำหรับกรณีทดสอบส่วนใหญ่
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    // สมมติฐาน: enableNormalize() มีอยู่ใน CompilerTestCase (ไม่ได้อยู่ใน source ที่ให้มา)
    // ใช้เพื่อให้รูปแบบ AST ของ input สอดคล้องกันก่อนรัน pass
    enableNormalize();
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return new DevirtualizePrototypeMethods(compiler);
  }

  // ---------- Boundary: โปรแกรมว่างเปล่า ----------
  // ครอบคลุม for-loop ใน process() ที่ทำงาน 0 ครั้ง (getDefinitionSites() ว่าง)
  public void testEmptyProgram() {
    testSame("");
  }

  // ---------- กรณี rewrite สำเร็จ: basic case ----------
  // ครอบคลุม: isEligibleDefinition() = true ทุกเงื่อนไข, isPrototypeMethodDefinition() = true,
  // ancestor loop ไม่เจอ control structure, rewriteDefinition(), rewriteCallSites()
  public void testRewriteSingleCallSite() {
    test(
        "A.prototype.foo = function() { return this.x; };" +
        "A.prototype.bar = function() { return this.foo(); };",

        "var JSCompiler_StaticMethods_foo = " +
        "function(JSCompiler_StaticMethods_foo$self) {" +
        "  return JSCompiler_StaticMethods_foo$self.x;" +
        "};" +
        "A.prototype.bar = function() {" +
        "  return JSCompiler_StaticMethods_foo(this);" +
        "};");
  }

  // ---------- Loop coverage: หลาย use site ของ definition เดียวกัน ----------
  // ครอบคลุม for-loop ใน isEligibleDefinition() และ rewriteCallSites() ที่ทำงานมากกว่า 1 รอบ
  // และ boundary: ฟังก์ชันมี parameter อยู่แล้วก่อนถูกเพิ่ม "self"
  public void testRewriteMultipleCallSites() {
    test(
        "A.prototype.foo = function(a, b) { return this.x + a + b; };" +
        "var p = new A();" +
        "p.foo(1, 2);" +
        "p.foo(3, 4);",

        "var JSCompiler_StaticMethods_foo = " +
        "function(JSCompiler_StaticMethods_foo$self, a, b) {" +
        "  return JSCompiler_StaticMethods_foo$self.x + a + b;" +
        "};" +
        "var p = new A();" +
        "JSCompiler_StaticMethods_foo(p, 1, 2);" +
        "JSCompiler_StaticMethods_foo(p, 3, 4);");
  }

  // ---------- replaceReferencesToThis: ต้องไม่ traverse ข้าม function boundary ----------
  // ครอบคลุม if (NodeUtil.isFunction(node)) return; และ branch else (recursive call)
  public void testDoNotRewriteThisInsideNestedFunction() {
    test(
        "A.prototype.foo = function() {" +
        "  var f = function() { return this; };" +
        "  return this.x;" +
        "};" +
        "(new A()).foo();",

        "var JSCompiler_StaticMethods_foo = " +
        "function(JSCompiler_StaticMethods_foo$self) {" +
        "  var f = function() { return this; };" +
        "  return JSCompiler_StaticMethods_foo$self.x;" +
        "};" +
        "JSCompiler_StaticMethods_foo(new A());");
  }

  // ---------- rewrite สำเร็จ: boundary กรณีมี parameter อยู่แล้ว (argList ไม่ว่างตั้งแต่ต้น) ----------
  public void testRewriteFunctionWithExistingParameters() {
    test(
        "A.prototype.setX = function(v) { this.x = v; };" +
        "(new A()).setX(5);",

        "var JSCompiler_StaticMethods_setX = " +
        "function(JSCompiler_StaticMethods_setX$self, v) {" +
        "  JSCompiler_StaticMethods_setX$self.x = v;" +
        "};" +
        "JSCompiler_StaticMethods_setX(new A(), 5);");
  }

  // ---------- ไม่ eligible: useSites.isEmpty() == true ----------
  public void testNoRewriteWhenUnused() {
    testSame("A.prototype.foo = function() { return this.x; };");
  }

  // ---------- ไม่ eligible: isCall(site) == false (เข้าถึง property ตรงๆ ไม่เรียกเป็น call) ----------
  public void testNoRewriteWhenAccessedWithoutCall() {
    testSame(
        "A.prototype.foo = function() { return this.x; };" +
        "var g = (new A()).foo;");
  }

  // ---------- ไม่ eligible: property ถูกใช้เป็น argument ของ call อื่น (ไม่ใช่ตำแหน่ง callee) ----------
  // ครอบคลุม branch parent.getFirstChild() != node ใน isCall()
  public void testNoRewriteWhenUsedAsCallbackArgument() {
    testSame(
        "function bar(fn) {}" +
        "A.prototype.foo = function() { return this.x; };" +
        "bar((new A()).foo);");
  }

  // ---------- loop short-circuit: use site แรก valid, ตัวที่สอง invalid ----------
  // ครอบคลุม early-return ภายใน for-loop ของ isEligibleDefinition เมื่อพบ site ที่ไม่ใช่ call
  public void testNoRewriteWhenAnyUseSiteIsNotACall() {
    testSame(
        "A.prototype.foo = function() { return this.x; };" +
        "var p = new A();" +
        "p.foo();" +
        "var g = p.foo;");
  }

  // ---------- ไม่ eligible: NodeUtil.isVarArgsFunction(rValue) == true ----------
  public void testNoRewriteWhenUsesArguments() {
    testSame(
        "A.prototype.foo = function() { return arguments.length; };" +
        "(new A()).foo();");
  }

  // ---------- อินพุตกึ่งผิดรูปแบบเชิงความหมาย: rValue ไม่ใช่ function ----------
  // ครอบคลุม !NodeUtil.isFunction(rValue) ใน isEligibleDefinition
  public void testNoRewriteWhenRValueIsNotFunction() {
    testSame(
        "A.prototype.foo = 5;" +
        "(new A()).foo();");
  }

  // ---------- ไม่ eligible: lValue ไม่ใช่ prototype pattern แม้ isEligibleDefinition ผ่าน ----------
  // ครอบคลุม isPrototypeMethodDefinition() -> NodeUtil.isGetProp(nameNode) == false
  // หมายเหตุ: สมมติฐานว่า SimpleDefinitionFinder ถือว่า "A.foo = ..." เป็น definition
  // ของ property "foo" เช่นเดียวกับ prototype pattern (ไม่ได้ยืนยันจาก source ที่ให้มา)
  public void testNoRewriteForNonPrototypeAssignment() {
    testSame(
        "A.foo = function() { return 1; };" +
        "A.foo();");
  }

  // ---------- ไม่ eligible: definition อยู่ภายใน control structure (ancestor loop) ----------
  // หมายเหตุ: สมมติฐานว่า IF ถูกจัดเป็น control structure ตาม NodeUtil.isControlStructure
  public void testNoRewriteWhenDefinitionInsideControlStructure() {
    testSame(
        "if (true) {" +
        "  A.prototype.foo = function() { return this.x; };" +
        "}" +
        "(new A()).foo();");
  }

  // ---------- ไม่ eligible: defSite.inGlobalScope == false ----------
  public void testNoRewriteWhenDefinedInLocalScope() {
    testSame(
        "function init() {" +
        "  A.prototype.foo = function() { return this.x; };" +
        "}" +
        "init();" +
        "(new A()).foo();");
  }

  // ---------- ไม่ eligible: defSite.inExterns == true ----------
  public void testNoRewriteWhenDefinedInExterns() {
    String externs = "A.prototype.foo = function() { return this.x; };";
    String js = "(new A()).foo();";
    test(externs, js, js);
  }

  // ---------- ไม่ eligible: singleSiteDefinitions.size() > 1 (นิยามชื่อ property ซ้ำ) ----------
  // หมายเหตุ: สมมติฐานว่า SimpleDefinitionFinder จัดกลุ่ม Definition ตามชื่อ property
  // เมื่อไม่มี type information ทำให้การเรียก .foo() ถูกมองว่า ambiguous
  // (ไม่ได้ยืนยัน exact behavior จาก source ที่ให้มา)
  public void testNoRewriteWhenMultipleDefinitionsForSameName() {
    testSame(
        "A.prototype.foo = function() { return 1; };" +
        "B.prototype.foo = function() { return 2; };" +
        "var x = new A();" +
        "x.foo();");
  }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEmptyProgram` | `process()` for-loop ทำงาน 0 รอบ (boundary: ไม่มี definition site) |
| `testRewriteSingleCallSite` | เส้นทาง eligible ทั้งหมด (rValue เป็น function, ไม่ใช้ arguments, lValue เป็น getProp, ไม่ export, มี use site, isCall=true, single definition, isPrototypeMethodDefinition=true, ไม่มี control structure ancestor) → เข้า `rewriteDefinition` + `rewriteCallSites` |
| `testRewriteMultipleCallSites` | for-loop ใน `isEligibleDefinition` และ `rewriteCallSites` ทำงาน >1 รอบ; boundary function มี parameter เดิม |
| `testDoNotRewriteThisInsideNestedFunction` | `replaceReferencesToThis`: branch `if (NodeUtil.isFunction(node)) return;` และ branch else (recursion) |
| `testRewriteFunctionWithExistingParameters` | boundary `argList` ไม่ว่างก่อนเพิ่ม self parameter |
| `testNoRewriteWhenUnused` | `useSites.isEmpty()` == true |
| `testNoRewriteWhenAccessedWithoutCall` | `isCall(site)` == false (ไม่ใช่ callee) |
| `testNoRewriteWhenUsedAsCallbackArgument` | `isCall`: `parent.getFirstChild() != node` |
| `testNoRewriteWhenAnyUseSiteIsNotACall` | for-loop early-return เมื่อพบ site ที่ไม่ผ่าน `isCall` ระหว่างวนหลาย site |
| `testNoRewriteWhenUsesArguments` | `NodeUtil.isVarArgsFunction(rValue)` == true |
| `testNoRewriteWhenRValueIsNotFunction` | `!NodeUtil.isFunction(rValue)` (rValue ไม่ใช่ function) |
| `testNoRewriteForNonPrototypeAssignment` | `isEligibleDefinition` ผ่าน แต่ `isPrototypeMethodDefinition` == false (`NodeUtil.isGetProp(nameNode)` false) |
| `testNoRewriteWhenDefinitionInsideControlStructure` | ancestor for-loop พบ `NodeUtil.isControlStructure(ancestor)` == true |
| `testNoRewriteWhenDefinedInLocalScope` | `!defSite.inGlobalScope` == true |
| `testNoRewriteWhenDefinedInExterns` | `defSite.inExterns` == true |
| `testNoRewriteWhenMultipleDefinitionsForSameName` | `singleSiteDefinitions.size() > 1` (ambiguous definitions) |

**จุดที่ไม่ได้ทดสอบเพราะข้อมูล source ไม่พอ (ตามข้อกำหนดห้ามเดา behavior):**
- `rValue == null` และ `lValue == null` — ไม่สามารถสร้าง JS input ที่ทำให้เกิด definition แบบนี้ได้อย่างมั่นใจโดยไม่รู้ internal ของ `SimpleDefinitionFinder`/`DefinitionsRemover`
- `codingConvention.isExported(name)` — ไม่รู้ default naming convention ที่ใช้ตัดสิน export
- `definitionModule != callModule` และ `moduleGraph.dependsOn(...)` — ต้องสร้าง `JSModuleGraph` หลาย module ซึ่งไม่มี source ยืนยัน API ที่แน่ชัดใน `CompilerTestCase`
# แนวทางการออกแบบชุดทดสอบ

`CollapseProperties` เป็นคลาส `package-private` ที่ทำงานบนโครงสร้าง AST ของ Compiler (ผ่าน `GlobalNamespace`, `Scope`, `Node` ฯลฯ) การสร้าง object เหล่านี้เองโดยไม่ผ่าน compiler pipeline นั้นแทบเป็นไปไม่ได้ ผมจึงใช้ `CompilerTestCase` ซึ่งเป็น **test harness มาตรฐานของโปรเจกต์ Closure Compiler เอง** (อยู่ใน source tree เดียวกับ `CollapseProperties` จึงถือว่าอยู่บน classpath เดียวกันตอน build/test — ไม่ใช่ third‑party library ที่อยู่นอกเหนือ classpath ที่กำหนด) เพื่อ parse/รัน pass/เทียบผลลัพธ์

**ข้อจำกัดที่ต้องระบุ:** เนื่องจาก `CompilerTestCase` สืบทอดจาก `junit.framework.TestCase` (JUnit 3) เมธอดทดสอบจึงต้องใช้ naming convention `testXxx` (JUnit 4 runner รองรับ backward-compat กับ JUnit 3 TestCase ได้ปกติ) — เป็นรูปแบบเดียวกับที่ใช้ทดสอบคลาสนี้จริงในโปรเจกต์ ผลลัพธ์ (`expected`) ของกรณีที่พึ่งพา `GlobalNamespace.Name/Ref` (ซึ่ง**ไม่ได้แสดงซอร์สมาให้**) เป็นการคาดการณ์จากการไล่ตรรกะของ `CollapseProperties` เท่านั้น — ได้ทำเครื่องหมาย/คอมเมนต์กำกับความเสี่ยงไว้ในทุกเทสที่เกี่ยวข้องตามข้อกำหนดที่ 4

```java
package com.google.javascript.jscomp;

import com.google.javascript.jscomp.CollapseProperties; // คลาสเป้าหมาย (package-private, อยู่ package เดียวกัน)
import com.google.javascript.jscomp.CompilerTestCase;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerPass;

/**
 * JUnit4-compatible test suite สำหรับ {@link CollapseProperties} (Defects4J: Closure-89b)
 *
 * หมายเหตุ: ใช้ CompilerTestCase (test harness ของโปรเจกต์เอง) เนื่องจากการสร้าง
 * Node/Scope/GlobalNamespace ด้วยมือทำได้ยากมากและเสี่ยงต่อการเดา behavior
 * ที่ไม่มีอยู่ในซอร์สที่ให้มา
 */
public class CollapsePropertiesTest extends CompilerTestCase {

  private boolean collapsePropertiesOnExternTypes = false;
  private boolean inlineAliases = false;

  public CollapsePropertiesTest() {
    super(""); // externs ว่าง (สมมติ constructor CompilerTestCase(String externs))
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    collapsePropertiesOnExternTypes = false;
    inlineAliases = false;
  }

  // สมมติ signature: protected/abstract CompilerPass getProcessor(Compiler compiler);
  public CompilerPass getProcessor(Compiler compiler) {
    return new CollapseProperties(
        compiler, collapsePropertiesOnExternTypes, inlineAliases);
  }

  // ------------------------------------------------------------------
  // 1) Boundary: input ว่าง / ไม่มี qualified name เลย
  // ------------------------------------------------------------------

  public void testEmptySource() {
    // globalNames / nameMap จะว่าง -> for-loop ทั้งหมดใน process() ทำงาน 0 รอบ
    testSame("");
  }

  public void testNoQualifiedNames() {
    // ไม่มี Name ที่มี props -> flattenReferencesToCollapsibleDescendantNames
    // จะ return ทันทีที่ n.props == null
    testSame("var x = 1; function f() { return x + 1; }");
  }

  // ------------------------------------------------------------------
  // 2) process(): branch collapsePropertiesOnExternTypes (if/else)
  // ------------------------------------------------------------------

  public void testProcessWithCollapseOnExternTypesFalse() {
    collapsePropertiesOnExternTypes = false; // -> new GlobalNamespace(compiler, root)
    testSame("var x = 1;");
  }

  public void testProcessWithCollapseOnExternTypesTrue() {
    collapsePropertiesOnExternTypes = true; // -> new GlobalNamespace(compiler, externs, root)
    testSame("var x = 1;");
  }

  // ------------------------------------------------------------------
  // 3) process(): branch inlineAliases (if) + inlineAliases() while-loop
  // ------------------------------------------------------------------

  public void testInlineAliasesDisabledIsNoOp() {
    inlineAliases = false; // inlineAliases(namespace) จะไม่ถูกเรียกเลย
    testSame("var a = 1; var b = 2;");
  }

  public void testInlineAliasesEnabledNoEligibleAlias() {
    inlineAliases = true;
    // a.aliasingGets == 0 -> เงื่อนไข (globalSets==1 && localSets==0 && aliasingGets>0)
    // เป็นเท็จ, และ a ไม่ใช่ OBJECTLIT/FUNCTION -> ไม่ถูกเติมลง workList อีก
    // -> while loop ทำงาน 1 รอบแล้วจบโดยไม่มีการแก้ไขโค้ด
    testSame("var a = 1;");
  }

  // ------------------------------------------------------------------
  // 4) checkNamespaces(): เงื่อนไข if/else-if ครบ (โค้ดส่วนนี้แสดงเต็มในซอร์ส
  //    จึงมั่นใจในผลลัพธ์ระดับสูงกว่าส่วน collapse จริง)
  // ------------------------------------------------------------------

  public void testWarnOnNamespaceAliasing() {
    // a เป็น namespace (objlit + prop), aliasingGets>0 จาก "var c = a"
    // -> ref type ALIASING_GET -> warnAboutNamespaceAliasing()
    // ตาม javadoc: property จะไม่ถูก collapse เมื่อถูก alias แบบนี้
    test("var a = {b: 0}; var c = a; use(c.b);",
         "var a = {b: 0}; var c = a; use(c.b);",
         CollapseProperties.UNSAFE_NAMESPACE_WARNING);
  }

  public void testWarnOnNamespaceRedefinition() {
    // a ถูก set ที่ global scope 2 ครั้ง (localSets+globalSets>1)
    // -> ref ที่สองเป็น SET_FROM_GLOBAL ขณะ initialized=true -> warnAboutNamespaceRedefinition()
    // ตาม javadoc: "ถ้า global object ถูก assign มากกว่าหนึ่งครั้ง...
    // จะไม่มี property ใดถูก collapse"
    test("var a = {}; a.b = 1; a = {};",
         "var a = {}; a.b = 1; a = {};",
         CollapseProperties.NAMESPACE_REDEFINED_WARNING);
  }

  public void testNoWarningForSingleAssignmentNoAlias() {
    // aliasingGets==0 และ localSets+globalSets==1 -> เงื่อนไขนอกใน checkNamespaces()
    // เป็นเท็จ -> ข้าม name นี้ไปเลย ไม่มี warning ใด ๆ
    // หมายเหตุ: ไม่ยืนยัน exact output เพราะพึ่งพา GlobalNamespace.Name ที่ไม่ได้ให้ซอร์สมา
    test("var a = {b: 1}; use(a.b);",
         "var a$b = 1; use(a$b);"); // คาดการณ์ผลลัพธ์ (ดู testCollapseObjectLiteralProperties)
  }

  // ------------------------------------------------------------------
  // 5) flattenReferencesToCollapsibleDescendantNames(): p.canCollapse() == false
  // ------------------------------------------------------------------

  public void testDoNotCollapseMultiplySetProperty() {
    // a.b ถูก set 2 ครั้งที่ global scope -> คาดว่า canCollapse() ของ a.b เป็น false
    // (ตามหลักการทั่วไปที่ระบุใน javadocของคลาส) -> ไม่ flatten/ไม่ collapse
    testSame("var a = {}; a.b = 1; a.b = 2; use(a.b);");
  }

  // ------------------------------------------------------------------
  // 6) Collapsing behavior (best-effort ตามการไล่ตรรกะ flatten+collapse)
  // ------------------------------------------------------------------

  public void testCollapseSimplePropertyAssignment() {
    // ไล่ตรรกะ: "var a = {}" ถูกกำจัดเพราะ n.canEliminate() (objlit เปล่า, a ไม่ถูกอ้างอิงตรง)
    // "a.b = 1" (ASSIGN) -> updateSimpleDeclaration() -> "var a$b = 1;"
    // "use(a.b)" -> flattenNameRef() -> "use(a$b);"
    test("var a = {}; a.b = 1; use(a.b);",
         "var a$b = 1; use(a$b);");
  }

  public void testCollapseObjectLiteralProperties() {
    // ไล่ตรรกะ declareVarsForObjLitValues(): แยกทุก key ของ objlit เป็น var ใหม่
    // แล้ว eliminate "var a = {...}" เดิม (n.canEliminate())
    test("var a = {b: 1, c: 2}; use(a.b, a.c);",
         "var a$b = 1; var a$c = 2; use(a$b, a$c);");
  }

  public void testAppendPropForAliasDollarEncoding() {
    // ทดสอบ branch: prop.indexOf('$') != -1 ใน appendPropForAlias()
    // '$' ใน property ถูกเข้ารหัสเป็น "$0" ก่อนต่อด้วย '$'
    test("var a = {}; a.$b = 1; use(a.$b);",
         "var a$$0b = 1; use(a$$0b);");
  }

  public void testDoNotCollapseFunctionPropertyWithUnsafeThis() {
    // ความเสี่ยงสูง: ต้องพึ่งพา JSDocInfo/docInfo ที่ไม่มีซอร์สมาให้ (n.docInfo)
    // ไล่ตรรกะ checkForHosedThisReferences(): ไม่มี @constructor/@this
    // และมี Token.THIS ในฟังก์ชันที่ถูก collapse -> UNSAFE_THIS warning
    test(
        "var a = {}; a.b = function() { return this; };",
        "var a$b = function() { return this; };",
        CollapseProperties.UNSAFE_THIS);
  }

  // ------------------------------------------------------------------
  // 7) Nested prefix flatten (flattenPrefixes / flattenNameRefAtDepth)
  //    *** ความเสี่ยงสูงสุด: กลไก multi-level ขึ้นกับ GlobalNamespace.Ref
  //        ที่ไม่ได้แสดงในซอร์ส หากรันจริงแล้วไม่ตรง ต้องปรับ expected ***
  // ------------------------------------------------------------------

  public void testNestedNamespaceFlattenBestEffort() {
    test("var a = {}; a.b = {}; a.b.c = 1; use(a.b.c);",
         "var a$b$c = 1; use(a$b$c);");
  }
}
```

## สรุปตาราง Branch/Condition ที่แต่ละเทสครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม | ระดับความเชื่อมั่น |
|---|---|---|
| `testEmptySource` | `process()`: for-loop 0 รอบ (globalNames/nameMap ว่าง) | สูง |
| `testNoQualifiedNames` | `flattenReferencesToCollapsibleDescendantNames`: `n.props == null` → return | สูง |
| `testProcessWithCollapseOnExternTypesFalse` | `process()`: else ของ `if (collapsePropertiesOnExternTypes)` | สูง |
| `testProcessWithCollapseOnExternTypesTrue` | `process()`: if ของ `collapsePropertiesOnExternTypes` | สูง |
| `testInlineAliasesDisabledIsNoOp` | `process()`: `if (inlineAliases)` = false | สูง |
| `testInlineAliasesEnabledNoEligibleAlias` | `process()`: `if (inlineAliases)` = true; `inlineAliases()`: while-loop, เงื่อนไข (b)/(c) และ OBJECTLIT/FUNCTION เป็นเท็จ | ปานกลาง-สูง |
| `testWarnOnNamespaceAliasing` | `checkNamespaces()`: `aliasingGets>0`, branch `ALIASING_GET` → `warnAboutNamespaceAliasing` | สูง |
| `testWarnOnNamespaceRedefinition` | `checkNamespaces()`: `localSets+globalSets>1`, branch `SET_FROM_GLOBAL` เมื่อ `initialized=true` → `warnAboutNamespaceRedefinition` | สูง |
| `testNoWarningForSingleAssignmentNoAlias` | `checkNamespaces()`: เงื่อนไขนอก (`isNamespace && (...)`) เป็นเท็จ → ข้าม | สูง (ส่วน warning), ปานกลาง (ส่วน output) |
| `testDoNotCollapseMultiplySetProperty` | `flattenReferencesToCollapsibleDescendantNames`: `p.canCollapse()` = false | ปานกลาง |
| `testCollapseSimplePropertyAssignment` | `updateSimpleDeclaration` (branch `EXPR_RESULT`), `canEliminate()` = true, `flattenNameRef` | ปานกลาง (พึ่งพา class ที่ไม่แสดงซอร์ส) |
| `testCollapseObjectLiteralProperties` | `declareVarsForObjLitValues` loop, `discardKeys` = true, `canEliminate()` | ปานกลาง |
| `testAppendPropForAliasDollarEncoding` | `appendPropForAlias`: `prop.indexOf('$') != -1` → encode เป็น `$0` | สูง (โค้ด method นี้แสดงเต็ม) |
| `testDoNotCollapseFunctionPropertyWithUnsafeThis` | `updateObjLitOrFunctionDeclarationAtAssignNode`: `rvalue.getType()==FUNCTION`; `checkForHosedThisReferences`: `docInfo==null` → ตรวจ `Token.THIS` | ต่ำ-ปานกลาง (พึ่ง JSDocInfo ที่ไม่มีซอร์ส) |
| `testNestedNamespaceFlattenBestEffort` | `flattenPrefixes` / `flattenNameRefAtDepth`: loop `depth>1`, recursive `collapseDeclarationOfNameAndDescendants` | ต่ำ (best-effort, ต้อง verify ผลจริง) |

**ข้อจำกัดที่ต้องเปิดเผย:** เทสในกลุ่ม "Collapsing behavior" และ "Nested prefix flatten" อาศัยการไล่ตรรกะของเมธอดที่ให้มา แต่พฤติกรรมจริงบางส่วนขึ้นกับคลาส `GlobalNamespace.Name` และ `GlobalNamespace.Ref` ซึ่ง **ไม่ได้แสดงซอร์สมาในโจทย์** จึงมีคอมเมนต์กำกับความเสี่ยงไว้ในโค้ดทุกจุด ตามข้อกำหนดที่ 4 — ควรรันจริงกับ `CollapseProperties` เวอร์ชัน fixed/buggy เพื่อยืนยัน/ปรับค่า `expected` หากจำเป็น
# หมายเหตุสำคัญก่อนดูโค้ด

เนื่องจากคลาส `ScopedAliases` เป็น **package-private class** ที่พึ่งพา `Compiler`, `NodeTraversal`, `Scope`, `Node`, `JSDocInfo`, `PreprocessorSymbolTable` ฯลฯ ซึ่งเป็นส่วนหนึ่งของ source tree เดียวกัน (ไม่ใช่จาก jar ภายนอกที่ระบุ) การทดสอบ pass ประเภทนี้ในโปรเจกต์ Closure Compiler ทำผ่านโครงสร้างพื้นฐาน `CompilerTestCase` (อยู่ใน `com.google.javascript.jscomp` เช่นกัน) ซึ่งจัดการ parse/run/compare AST ให้อัตโนมัติ — ผมจึงใช้ฐานนี้ตามแบบมาตรฐานของโปรเจกต์

**สิ่งที่ไม่แน่ใจ / ไม่ครอบคลุม (ตามข้อกำหนดที่ 4 ห้ามเดา):**
- เงื่อนไข `preprocessorSymbolTable != null` ใน `validateScopeCall` — ไม่ได้ทดสอบ เพราะไม่มีข้อมูล constructor ของ `PreprocessorSymbolTable` ในซอร์สที่ให้มา จึงไม่กล้าสร้าง instance
- การประมวลผล `JSDocInfo`/`fixTypeNode` (type node aliasing) — ต้องพึ่งพา config การ parse JSDoc เพิ่มเติมที่ไม่ปรากฏในซอร์สเป้าหมาย จึงไม่รวมการทดสอบเพื่อไม่เดา behavior
- กรณี `n.getType() == Token.FUNCTION && t.inGlobalScope() && parent == null` (edge case ของ root function node) — ไม่สามารถ trigger ได้จาก JS source ระดับปกติ

---

```java
package com.google.javascript.jscomp;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.SourcePosition;

/**
 * Unit tests for {@link ScopedAliases} (Closure-162b).
 *
 * ใช้ {@link CompilerTestCase} เป็นฐาน เนื่องจากเป็นวิธีมาตรฐานที่โปรเจกต์
 * Closure Compiler ใช้ทดสอบ CompilerPass ทุกตัว (parse -> run pass ->
 * เทียบ AST ผลลัพธ์ / diagnostic ที่รายงาน)
 */
public class ScopedAliasesTest extends CompilerTestCase {

  /** Stub ตาม method ที่ถูกเรียกใช้จริงในซอร์ส: transformation.addAlias(name, qualifiedName) */
  private static class StubAliasTransformation implements AliasTransformation {
    @Override
    public void addAlias(String alias, String definition) {
      // no-op: ไม่ตรวจสอบ transformation log โดยตรงในชุดทดสอบนี้
    }
  }

  /** Stub ตาม method ที่ถูกเรียกใช้จริงในซอร์ส: transformationHandler.logAliasTransformation(...) */
  private static class StubAliasTransformationHandler
      implements AliasTransformationHandler {
    @Override
    public AliasTransformation logAliasTransformation(
        String sourceFile, SourcePosition<AliasTransformation> position) {
      return new StubAliasTransformation();
    }
  }

  private final AliasTransformationHandler transformationHandler =
      new StubAliasTransformationHandler();

  public ScopedAliasesTest() {
    super("");
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    // preprocessorSymbolTable = null -> ไม่ครอบคลุม branch "!= null" (ดูหมายเหตุด้านบน)
    return new ScopedAliases(compiler, null, transformationHandler);
  }

  // ---------------------------------------------------------------
  // Boundary / empty input
  // ---------------------------------------------------------------

  public void testEmptyScript() {
    // boundary: ไม่มี statement ใด ๆ เลย ต้องไม่ throw และไม่เปลี่ยนแปลง
    testSame("");
  }

  public void testNoScopeCallsAtAll() {
    // ไม่มี goog.scope -> loop ทั้งสามใน hotSwapScript ว่าง, ไม่มีการเปลี่ยนแปลง
    testSame("var x = 5;");
  }

  // ---------------------------------------------------------------
  // Success path: alias substitution
  // ---------------------------------------------------------------

  public void testSimpleAlias() {
    test(
        "goog.scope(function() {" +
        "  var dom = goog.dom;" +
        "  dom.createElement(dom.TagName.DIV);" +
        "});",
        "goog.dom.createElement(goog.dom.TagName.DIV);");
  }

  public void testTransitiveAlias() {
    // alias ที่อ้างอิง alias อื่น (g -> goog, dom -> g.dom)
    test(
        "goog.scope(function() {" +
        "  var g = goog;" +
        "  var dom = g.dom;" +
        "  dom.createElement('DIV');" +
        "});",
        "goog.dom.createElement('DIV');");
  }

  public void testMultipleAliasesInOneVarStatement() {
    // ครอบคลุมทั้ง 2 สาขาของ `aliasDefinition.getParent().hasOneChild()`
    // ในลูปลบ alias definitions: ตัวแรก parent มี 2 children (false-branch,
    // detach เฉพาะ node) ตัวที่สอง parent เหลือ 1 child (true-branch,
    // detach ทั้ง VAR statement)
    test(
        "goog.scope(function() {" +
        "  var a = goog.dom, b = goog.events;" +
        "  a.createElement(b.EventType.CLICK);" +
        "});",
        "goog.dom.createElement(goog.events.EventType.CLICK);");
  }

  public void testAliasShadowedInNestedFunctionIsNotReplaced() {
    // ทดสอบสาขา false ของ (aliasVar != null && t.getScope().getVar(name) == aliasVar)
    // เพราะ local var x ใน f() บังตัวแปร alias x ระดับนอก
    // และ 'return' ใน f() (scopeDepth != 2) ต้องไม่ทำให้เกิด GOOG_SCOPE_USES_RETURN
    test(
        "goog.scope(function() {" +
        "  var x = goog.dom;" +
        "  function f() {" +
        "    var x = 5;" +
        "    return x;" +
        "  }" +
        "  x.createElement('DIV');" +
        "});",
        "function f() {" +
        "  var x = 5;" +
        "  return x;" +
        "}" +
        "goog.dom.createElement('DIV');");
  }

  public void testNestedGlobalFunctionNotTraversedAndEmptyScopeCollapses() {
    // ทดสอบ shouldTraverse: ฟังก์ชัน global ที่ไม่ใช่ goog.scope ต้องไม่ถูก
    // traverse เข้าไป (มิฉะนั้น 'return' จะทำให้เกิด error ผิด ๆ ที่ depth == 2)
    // และ goog.scope ที่มี body ว่าง ต้อง collapse ออกไปทั้งหมด
    test(
        "function foo() { return 5; } goog.scope(function() {});",
        "function foo() { return 5; }");
  }

  // ---------------------------------------------------------------
  // Error path: การเรียก goog.scope ผิดรูปแบบ (validateScopeCall)
  // ---------------------------------------------------------------

  public void testScopeCallMustBeAloneInStatement() {
    // parent ของ CALL ไม่ใช่ EXPR_RESULT -> !isExpressionNode(parent) == true
    test(
        "var x = goog.scope(function() {});",
        null,
        ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  public void testScopeCallWithNoArguments() {
    // n.getChildCount() != 2  (มีแค่ callee, childCount == 1)
    test(
        "goog.scope();",
        null,
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  public void testScopeCallWithTooManyArguments() {
    // n.getChildCount() != 2  (childCount == 3)
    test(
        "goog.scope(function() {}, 1);",
        null,
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  public void testScopeCallArgumentNotFunction() {
    // !NodeUtil.isFunction(anonymousFnNode)
    test(
        "goog.scope(5);",
        null,
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  public void testScopeCallFunctionHasName() {
    // NodeUtil.getFunctionName(anonymousFnNode) != null
    test(
        "goog.scope(function foo() {});",
        null,
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  public void testScopeCallFunctionHasParameters() {
    // NodeUtil.getFunctionParameters(anonymousFnNode).hasChildren()
    test(
        "goog.scope(function(a) {});",
        null,
        ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  // ---------------------------------------------------------------
  // Error path: กฎภายใน goog.scope block (scopeDepth == 2)
  // ---------------------------------------------------------------

  public void testAliasRedefinitionIsError() {
    // type == NAME && isAssignmentOp(parent) && n == parent.getFirstChild()
    test(
        "goog.scope(function() {" +
        "  var x = goog.dom;" +
        "  x = goog.events;" +
        "});",
        null,
        ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  public void testNonAliasLocalWithLiteralValueIsError() {
    // n.hasChildren() == true แต่ !isQualifiedName()
    test(
        "goog.scope(function() {" +
        "  var x = 5;" +
        "});",
        null,
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  public void testNonAliasLocalWithNoInitializerIsError() {
    // n.hasChildren() == false
    test(
        "goog.scope(function() {" +
        "  var x;" +
        "});",
        null,
        ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  public void testReturnInsideScopeIsError() {
    // type == Token.RETURN ที่ scopeDepth == 2
    test(
        "goog.scope(function() {" +
        "  return;" +
        "});",
        null,
        ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  public void testThisInsideScopeIsError() {
    // type == Token.THIS ที่ scopeDepth == 2
    test(
        "goog.scope(function() {" +
        "  this.x = 1;" +
        "});",
        null,
        ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  public void testThrowInsideScopeIsError() {
    // type == Token.THROW ที่ scopeDepth == 2
    test(
        "goog.scope(function() {" +
        "  throw 'e';" +
        "});",
        null,
        ScopedAliases.GOOG_SCOPE_USES_THROW);
  }
}
```

---

## สรุป Branch / Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEmptyScript`, `testNoScopeCallsAtAll` | `hotSwapScript`: loop ทั้ง 3 ว่าง (aliasUsages/aliasDefinitions/scopeCalls == 0), เงื่อนไข report code change เป็น false |
| `testSimpleAlias` | `isCallToScopeMethod` true, alias definition (`type==NAME && parent==VAR`, `hasChildren && isQualifiedName` = true), `AliasedNode.applyAlias`, ลบ alias var (hasOneChild = true) |
| `testTransitiveAlias` | alias อ้างอิง alias อื่น, ตรวจ `aliasVar.getInitialValue().getQualifiedName()` |
| `testMultipleAliasesInOneVarStatement` | `hasOneChild()` ทั้ง true/false branch ในลูปลบ alias definitions |
| `testAliasShadowedInNestedFunctionIsNotReplaced` | เงื่อนไข `t.getScope().getVar(name) == aliasVar` = false, `scopeDepth==2` เงื่อนไข false สำหรับ nested function (RETURN ไม่ error) |
| `testNestedGlobalFunctionNotTraversedAndEmptyScopeCollapses` | `shouldTraverse`: `FUNCTION && inGlobalScope && !isCallToScopeMethod(parent)` = true (skip), scope collapse ของ block ว่าง |
| `testScopeCallMustBeAloneInStatement` | `!NodeUtil.isExpressionNode(parent)` = true → `GOOG_SCOPE_USED_IMPROPERLY` |
| `testScopeCallWithNoArguments` | `n.getChildCount() != 2` (น้อยกว่า) |
| `testScopeCallWithTooManyArguments` | `n.getChildCount() != 2` (มากกว่า) |
| `testScopeCallArgumentNotFunction` | `!NodeUtil.isFunction(anonymousFnNode)` |
| `testScopeCallFunctionHasName` | `getFunctionName(anonymousFnNode) != null` |
| `testScopeCallFunctionHasParameters` | `getFunctionParameters(anonymousFnNode).hasChildren()` |
| `testAliasRedefinitionIsError` | `type==NAME && isAssignmentOp(parent) && n==parent.getFirstChild()` = true |
| `testNonAliasLocalWithLiteralValueIsError` | `hasChildren()==true && isQualifiedName()==false` → else-branch report |
| `testNonAliasLocalWithNoInitializerIsError` | `hasChildren()==false` → else-branch report |
| `testReturnInsideScopeIsError` | `type==Token.RETURN` at `scopeDepth==2` |
| `testThisInsideScopeIsError` | `type==Token.THIS` (else-if) |
| `testThrowInsideScopeIsError` | `type==Token.THROW` (else-if) |

**Branch ที่ไม่ครอบคลุม (ระบุเหตุผลตามข้อ 4):**
- `preprocessorSymbolTable != null` — ไม่มีข้อมูล constructor เพียงพอ
- `fixTypeNode` / JSDoc type node aliasing — ต้องพึ่ง config parser ที่ไม่ปรากฏในซอร์ส
- `FUNCTION && inGlobalScope() && parent == null` — edge case ที่ trigger ไม่ได้จาก JS source ปกติ
# วิเคราะห์และแนวทาง

`AnalyzePrototypeProperties` เป็นคลาส **package-private** (ไม่มี access modifier) จึงต้องวางไฟล์ทดสอบไว้ใน package เดียวกัน (`com.google.javascript.jscomp`) — ด้วยเหตุนี้จึง **ไม่มี import statement สำหรับคลาสเป้าหมายโดยตรง** (เป็นข้อจำกัดของภาษา Java ไม่ใช่การละเลยข้อกำหนด)

เนื่องจากตรรกะภายในพึ่งพา `NodeTraversal`/`Scope` จริง (การเช็ค `var.isGlobal()`, `var.getScope()`, `t.inGlobalScope()` ฯลฯ) การสร้าง AST ด้วยมือจะไม่ปลอดภัยและอาจไม่สะท้อน behavior จริง จึงเลือก parse source code จริงผ่าน `Compiler` (คลาสในโปรเจกต์เดียวกัน ไม่ใช่ mock) — มีการระบุ **ข้อสมมติฐาน** เกี่ยวกับ helper method (`parseTestCode`, `initOptions`) ไว้ในคอมเมนต์ เพราะไม่ได้อยู่ใน source ที่ให้มา

กรณีที่ต้องพึ่ง `JSModuleGraph`/`JSModule` (moduleGraph != null) **ไม่ได้เขียนเทส** เพราะ source ที่ให้มาไม่แสดง constructor/behavior ของคลาสเหล่านี้ชัดเจน การเดาอาจทำให้ compile ไม่ผ่านทั้งไฟล์ — ระบุไว้ในตารางสรุปว่าไม่ครอบคลุม

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

/**
 * หมายเหตุ (ข้อสมมติฐานเกี่ยวกับ infrastructure ของโปรเจกต์ ไม่ใช่ตัวคลาสเป้าหมาย):
 *
 * - AnalyzePrototypeProperties เป็น package-private จึงต้องวางเทสไว้ใน package เดียวกัน
 *   (com.google.javascript.jscomp) ทำให้ไม่มี import สำหรับคลาสเป้าหมายโดยตรง
 *
 * - เพื่อให้ NodeTraversal/Scope ทำงานถูกต้องจริง (var.isGlobal(), t.inGlobalScope() ฯลฯ)
 *   จำเป็นต้อง parse source code จริงผ่าน com.google.javascript.jscomp.Compiler
 *   โดยใช้ Compiler#initOptions(CompilerOptions) และ Compiler#parseTestCode(String)
 *   ซึ่งเป็น helper method ที่ใช้กันทั่วไปในชุดทดสอบภายในของ Closure Compiler
 *   แต่ "ไม่ได้อยู่ใน source ของคลาสเป้าหมายที่ให้มา" — หากเวอร์ชันจริงต่างออกไป
 *   อาจต้องปรับปรุงเมธอด setUp()/parse()
 *
 * - งดเว้นการทดสอบกรณี moduleGraph != null (constructor/PropagateReferences ที่พึ่ง
 *   JSModuleGraph.getRootModule()/dependsOn()/getDeepestCommonDependencyInclusive())
 *   เนื่องจาก source ที่ให้มาไม่ได้แสดง constructor/behavior ของ JSModule, JSModuleGraph
 *   การเดา API เหล่านี้อาจทำให้เกิด compile error ทั้งไฟล์ จึงเลือกไม่เขียนเทสสำหรับ branch นี้
 *   (ดูตารางสรุปท้ายคำตอบ)
 */
public class AnalyzePrototypePropertiesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  /** แปลง source code string เป็น Node tree จริงโดยใช้ parser ของ Closure Compiler */
  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private AnalyzePrototypeProperties newPass(boolean canModifyExterns,
      boolean anchorUnusedVars) {
    return new AnalyzePrototypeProperties(
        compiler, /* moduleGraph */ null, canModifyExterns, anchorUnusedVars);
  }

  private AnalyzePrototypeProperties.NameInfo findInfo(
      AnalyzePrototypeProperties pass, String name) {
    for (AnalyzePrototypeProperties.NameInfo info : pass.getAllNameInfo()) {
      if (name.equals(info.name)) {
        return info;
      }
    }
    return null;
  }

  // ---------------------------------------------------------------------
  // 1. Boundary: input ว่าง / implicit properties
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyInput_onlyImplicitPropertiesExist() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("");

    pass.process(null, root);

    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertEquals(3, infos.size());

    assertNotNull(findInfo(pass, "length"));
    assertNotNull(findInfo(pass, "toString"));
    assertNotNull(findInfo(pass, "valueOf"));

    // externNode ถูก markReference ไว้ตั้งแต่ constructor และเชื่อมกับ implicit properties
    // หลัง process() (fixed point propagation) ต้อง referenced == true ทั้งหมด
    assertTrue(findInfo(pass, "length").isReferenced());
    assertTrue(findInfo(pass, "toString").isReferenced());
    assertTrue(findInfo(pass, "valueOf").isReferenced());
  }

  // ---------------------------------------------------------------------
  // 2. process(): canModifyExterns true/false
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_canModifyExternsTrue_doesNotProcessExterns() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node externs = parse("Foo.prototype.bar;");
    Node root = parse("");

    pass.process(externs, root);

    // canModifyExterns == true -> ไม่ traverse externRoot เลย
    assertNull(findInfo(pass, "bar"));
    assertNull(findInfo(pass, "prototype"));
    assertEquals(3, pass.getAllNameInfo().size());
  }

  @Test
  public void testProcess_canModifyExternsFalse_processesExterns() {
    AnalyzePrototypeProperties pass = newPass(false, false);
    Node externs = parse("Foo.prototype.bar;");
    Node root = parse("");

    pass.process(externs, root);

    // ProcessExternProperties connect externNode -> ทุก GETPROP ที่เจอใน externs
    AnalyzePrototypeProperties.NameInfo bar = findInfo(pass, "bar");
    AnalyzePrototypeProperties.NameInfo prototype = findInfo(pass, "prototype");
    assertNotNull(bar);
    assertNotNull(prototype);
    assertTrue(bar.isReferenced());
    assertTrue(prototype.isReferenced());
  }

  // ---------------------------------------------------------------------
  // 3. Global function declaration + anchorUnusedVars
  // ---------------------------------------------------------------------

  @Test
  public void testUnusedGlobalFunction_notReferenced_whenAnchorUnusedVarsFalse() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("function foo() {}");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo foo = findInfo(pass, "foo");
    assertNotNull(foo);
    assertFalse(foo.isReferenced());
  }

  @Test
  public void testUnusedGlobalFunction_referenced_whenAnchorUnusedVarsTrue() {
    AnalyzePrototypeProperties pass = newPass(true, true);
    Node root = parse("function foo() {}");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo foo = findInfo(pass, "foo");
    assertNotNull(foo);
    assertTrue(foo.isReferenced());
  }

  @Test
  public void testVarAssignedFunctionExpression_treatedAsGlobalFunctionDeclaration() {
    // ครอบคลุมสาขา "firstChild != null && isGlobalFunctionDeclaration(t, firstChild)"
    AnalyzePrototypeProperties pass = newPass(true, true);
    Node root = parse("var foo = function() {};");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo foo = findInfo(pass, "foo");
    assertNotNull(foo);
    assertEquals(1, foo.getDeclarations().size());
    assertTrue(foo.isReferenced()); // anchorUnusedVars = true
  }

  @Test
  public void testDuplicateGlobalFunctionDeclaration_reusesNameInfoAndAccumulatesDeclarations() {
    // ครอบคลุม getNameInfoForName(): map.containsKey(name) == false (ครั้งแรก)
    // และ == true (ครั้งที่สอง) สำหรับ type == VAR
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("function foo() {} function foo() {}");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo foo = findInfo(pass, "foo");
    assertNotNull(foo);
    assertEquals(2, foo.getDeclarations().size());
  }

  @Test
  public void testGlobalFunctionReferencedInsideAnotherFunction_addsSymbolUse() {
    // ครอบคลุม else (ไม่ inGlobalScope) -> addSymbolUse(name, module, VAR)
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("function Foo() {} function bar() { return Foo; }");

    pass.process(null, root);

    assertNotNull(findInfo(pass, "Foo"));
    assertNotNull(findInfo(pass, "bar"));
    assertFalse(findInfo(pass, "bar").isReferenced());
    assertFalse(findInfo(pass, "Foo").isReferenced());
  }

  // ---------------------------------------------------------------------
  // 4. Prototype property assignment (Foo.prototype.bar = function(){})
  // ---------------------------------------------------------------------

  @Test
  public void testPrototypePropertyAssignment_createsDeclarationForEachUsage() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse(
        "Foo.prototype.bar = function() {};"
        + "Baz.prototype.bar = function() {};");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo bar = findInfo(pass, "bar");
    assertNotNull(bar);
    // containsKey(name) == false (ครั้งแรก) และ true (ครั้งที่สอง) สำหรับ type == PROPERTY
    assertEquals(2, bar.getDeclarations().size());
    for (Object decl : bar.getDeclarations()) {
      assertTrue(decl instanceof AnalyzePrototypeProperties.AssignmentProperty);
    }
    assertFalse(bar.isReferenced());
  }

  @Test
  public void testPrototypeObjectLiteralAssignment_createsDeclarationsForEachKey() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("Foo.prototype = { bar: function() {}, baz: 3 };");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo bar = findInfo(pass, "bar");
    AnalyzePrototypeProperties.NameInfo baz = findInfo(pass, "baz");
    assertNotNull(bar);
    assertNotNull(baz);
    assertEquals(1, bar.getDeclarations().size());
    assertEquals(1, baz.getDeclarations().size());
    assertTrue(bar.getDeclarations().peek()
        instanceof AnalyzePrototypeProperties.LiteralProperty);

    // Foo.prototype = {...} : key เหล่านี้ต้องไม่ถูกนับเป็น "usage"
    assertFalse(bar.isReferenced());
    assertFalse(baz.isReferenced());
  }

  @Test
  public void testPrototypeAssignedNonObjectLiteral_noPropertyDeclarationsCreated() {
    // ครอบคลุมสาขา map.getType() != OBJECTLIT ใน processPrototypeParent (case ASSIGN)
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("var bar = function(){}; Foo.prototype = bar;");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo bar = findInfo(pass, "bar");
    assertNotNull(bar);
    assertEquals(1, bar.getDeclarations().size());
    // ต้องเป็น GlobalFunction (จาก var bar = function(){}) ไม่ใช่ LiteralProperty
    assertTrue(bar.getDeclarations().peek()
        instanceof AnalyzePrototypeProperties.GlobalFunction);
  }

  @Test
  public void testPrototypeAloneAsExpression_doesNotCrash() {
    // Foo.prototype; -> parent ของ GETPROP(Foo.prototype) ไม่ตรงกับ case ใดใน switch
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("Foo.prototype;");

    pass.process(null, root);

    assertEquals(3, pass.getAllNameInfo().size());
  }

  // ---------------------------------------------------------------------
  // 5. Fixed point propagation: global usage -> prototype property -> property อื่น
  // ---------------------------------------------------------------------

  @Test
  public void testPrototypePropertyReferencedThroughGlobalUsage_becomesReferenced() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse(
        "function Foo() {}"
        + "Foo.prototype.bar = function() { this.baz(); };"
        + "var f = new Foo();"
        + "f.bar();");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo bar = findInfo(pass, "bar");
    AnalyzePrototypeProperties.NameInfo baz = findInfo(pass, "baz");
    assertNotNull(bar);
    assertNotNull(baz);
    assertTrue(bar.isReferenced());
    assertTrue(baz.isReferenced());
  }

  // ---------------------------------------------------------------------
  // 6. Object literal เป็นตัวแปรทั่วไป และ quoted string key
  // ---------------------------------------------------------------------

  @Test
  public void testObjectLiteralAsRegularVar_countsAsPropertyUse() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("var x = {a: 1, b: 2};");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo a = findInfo(pass, "a");
    AnalyzePrototypeProperties.NameInfo b = findInfo(pass, "b");
    assertNotNull(a);
    assertNotNull(b);
    assertTrue(a.isReferenced());
    assertTrue(b.isReferenced());
  }

  @Test
  public void testObjectLiteralWithQuotedStringKey_notCountedAsPropertyUse() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("var y = {\"a\": 1};");

    pass.process(null, root);

    // propNameNode.isQuotedString() == true -> ต้อง skip addSymbolUse
    assertNull(findInfo(pass, "a"));
  }

  // ---------------------------------------------------------------------
  // 7. isPrototypePropertyAssign: isChainedProperty == false
  // ---------------------------------------------------------------------

  @Test
  public void testChainedGetPropOnNonPrototype_notTreatedAsPrototypeDeclaration() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("var x = {}; x.bar = 3;");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo bar = findInfo(pass, "bar");
    assertNotNull(bar);
    assertEquals(0, bar.getDeclarations().size());
    assertTrue(bar.isReferenced());
  }

  // ---------------------------------------------------------------------
  // 8. readClosureVariables
  // ---------------------------------------------------------------------

  @Test
  public void testClosureVariableCapture_marksReadClosureVariablesTrue() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse(
        "function outer() {"
        + "  var localVar = 1;"
        + "  function inner() { return localVar; }"
        + "}");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo outer = findInfo(pass, "outer");
    assertNotNull(outer);
    assertTrue(outer.readsClosureVariables());
  }

  @Test
  public void testLocalVariableSameScope_doesNotMarkReadClosureVariablesTrue() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse(
        "function outer() {"
        + "  var localVar = 1;"
        + "  return localVar;"
        + "}");

    pass.process(null, root);

    AnalyzePrototypeProperties.NameInfo outer = findInfo(pass, "outer");
    assertNotNull(outer);
    assertFalse(outer.readsClosureVariables());
  }

  // ---------------------------------------------------------------------
  // 9. NAME node: var == null / initial value ไม่ใช่ function / ไม่มี initial value
  // ---------------------------------------------------------------------

  @Test
  public void testGlobalVarNonFunctionInitializer_notTrackedAsVarNameInfo() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("var x = 5;");

    pass.process(null, root);

    assertNull(findInfo(pass, "x"));
  }

  @Test
  public void testGlobalVarWithoutInitializer_notTrackedAsVarNameInfo() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("var z;");

    pass.process(null, root);

    assertNull(findInfo(pass, "z"));
  }

  @Test
  public void testUndeclaredNameReference_doesNotThrow() {
    // "undeclaredName" ไม่มี declaration -> t.getScope().getVar() คืน null -> ต้อง skip
    AnalyzePrototypeProperties pass = newPass(true, false);
    Node root = parse("undeclaredName;");

    pass.process(null, root);

    assertNull(findInfo(pass, "undeclaredName"));
  }

  // ---------------------------------------------------------------------
  // 10. Boundary / null
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_nullRoot_throwsException() {
    AnalyzePrototypeProperties pass = newPass(true, false);
    try {
      pass.process(null, null);
      fail("คาดหวังว่าจะมี exception เกิดขึ้นเมื่อ root เป็น null "
          + "เนื่องจากไม่มีการตรวจ null ใน process()/NodeTraversal ของ source ที่ให้มา");
    } catch (RuntimeException expected) {
      // ตามที่คาดไว้ - ไม่ระบุ subtype ที่แน่นอนเพราะไม่มีการระบุใน source ที่ให้มา
    }
  }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEmptyInput_onlyImplicitPropertiesExist` | constructor: loop `IMPLICITLY_USED_PROPERTIES` (moduleGraph==null), `markReference` เริ่มต้น |
| `testProcess_canModifyExternsTrue_doesNotProcessExterns` | `process()`: if `!canModifyExterns` == false (skip externs) |
| `testProcess_canModifyExternsFalse_processesExterns` | `process()`: if `!canModifyExterns` == true, `ProcessExternProperties.visit` |
| `testUnusedGlobalFunction_notReferenced_whenAnchorUnusedVarsFalse` | `processGlobalFunctionDeclaration`: `isExported||anchorUnusedVars` == false |
| `testUnusedGlobalFunction_referenced_whenAnchorUnusedVarsTrue` | เงื่อนไขเดียวกัน == true (`anchorUnusedVars`) |
| `testVarAssignedFunctionExpression_treatedAsGlobalFunctionDeclaration` | `processGlobalFunctionDeclaration`: `firstChild != null && isGlobalFunctionDeclaration(firstChild)` |
| `testDuplicateGlobalFunctionDeclaration_...` | `getNameInfoForName`: `containsKey` true/false, type==VAR |
| `testGlobalFunctionReferencedInsideAnotherFunction_addsSymbolUse` | NAME branch: `else { addSymbolUse }` เมื่อไม่ `inGlobalScope` |
| `testPrototypePropertyAssignment_createsDeclarationForEachUsage` | `isPrototypePropertyAssign`==true (chained), `processPrototypeParent` case GETPROP, `containsKey` type==PROPERTY |
| `testPrototypeObjectLiteralAssignment_createsDeclarationsForEachKey` | `processPrototypeParent` case ASSIGN, `map.getType()==OBJECTLIT`==true |
| `testPrototypeAssignedNonObjectLiteral_noPropertyDeclarationsCreated` | case ASSIGN, `map.getType()==OBJECTLIT`==false |
| `testPrototypeAloneAsExpression_doesNotCrash` | `processPrototypeParent` switch: ไม่ตรง case ใด (default) |
| `testPrototypePropertyReferencedThroughGlobalUsage_becomesReferenced` | `PropagateReferences.traverseEdge`: `start.isReferenced()==true`, fixed-point propagation หลายชั้น |
| `testObjectLiteralAsRegularVar_countsAsPropertyUse` | OBJECTLIT branch: exclusion condition == false (ไม่ใช่ prototype assign) |
| `testObjectLiteralWithQuotedStringKey_notCountedAsPropertyUse` | `propNameNode.isQuotedString()` == true (skip) |
| `testChainedGetPropOnNonPrototype_notTreatedAsPrototypeDeclaration` | `isPrototypePropertyAssign`: `isChainedProperty` == false |
| `testClosureVariableCapture_marksReadClosureVariablesTrue` | NAME branch: `var.getScope() != t.getScope()` == true (readClosureVariables loop) |
| `testLocalVariableSameScope_doesNotMarkReadClosureVariablesTrue` | เงื่อนไขเดียวกัน == false |
| `testGlobalVarNonFunctionInitializer_notTrackedAsVarNameInfo` | NAME branch: `initialValue.getType()==FUNCTION` == false |
| `testGlobalVarWithoutInitializer_notTrackedAsVarNameInfo` | NAME branch: `var.getInitialValue() != null` == false |
| `testUndeclaredNameReference_doesNotThrow` | NAME branch: `var != null` == false |
| `testProcess_nullRoot_throwsException` | Boundary/null: ไม่มี null-check ใน `process()` |

**หมายเหตุ**: กรณี `moduleGraph != null` (constructor else branch, `NameInfo.markReference` ที่ `moduleGraph != null`, `PropagateReferences.traverseEdge` ที่เรียก `moduleGraph.dependsOn`) และกรณี `compiler.getCodingConvention().isExported(name)==true` **ไม่ได้ถูกทดสอบ** เนื่องจาก source ที่ให้มาไม่ได้เปิดเผย API ของ `JSModuleGraph`/`JSModule` และ default `CodingConvention` อย่างชัดเจน การเดาอาจทำให้ผิด behavior จริงหรือ compile ไม่ผ่าน จึงงดเว้นตามข้อกำหนดที่ 4
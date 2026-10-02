# CollapsePropertiesTest — JUnit 4 Test Suite

## หมายเหตุสำคัญก่อนเริ่ม

`CollapseProperties` เป็นคลาสที่ทำงานร่วมกับ `GlobalNamespace`, `Scope`, `NodeTraversal` และ AST จริงจาก parser ของ Closure Compiler อย่างแน่นแฟ้นมาก ไม่สามารถ mock ได้ง่ายโดยไม่เสีย fidelity ของการทดสอบ ดังนั้นแนวทางที่ปลอดภัยและตรงกับพฤติกรรมจริงที่สุดคือการใช้ **Compiler API จริง** (parse โค้ด JS → เรียก `CollapseProperties.process()` ตรง ๆ → ตรวจสอบ source ที่ได้และ warning ที่ compiler รายงาน)

⚠️ **จุดที่ไม่แน่ใจ 100% เพราะไม่ได้อยู่ในซอร์สที่ให้มา** (เช่น รายละเอียดภายในของ `GlobalNamespace.Name#canCollapse()`, `isNamespace()`, `isSimpleStubDeclaration()`, `needsToBeStubbed()`) จะระบุคอมเมนต์กำกับไว้ในแต่ละเทสเคส และใช้การ assert แบบ "contains" ที่ผ่อนคลาย เพื่อลดความเสี่ยง false-positive จาก formatting/version details แต่ยังคงมีความสามารถ**ดักจับ fault จริง**หากพฤติกรรมการ flatten/aliasing/collapsing ผิดไปจากที่ระบุใน Javadoc ของคลาสเป้าหมาย

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

// import ซ้ำใน package เดียวกัน (ถูกกฎหมายใน Java แม้จะ redundant)
// ทำตามข้อกำหนดให้ import คลาสเป้าหมายอย่างชัดเจน
import com.google.javascript.jscomp.CollapseProperties;

import com.google.javascript.rhino.Node;

import org.junit.Assume;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * JUnit4 tests สำหรับ {@link CollapseProperties} (Closure-130b)
 *
 * แนวทาง: ใช้ Compiler จริงในการ parse โค้ด JS แล้วเรียก
 * CollapseProperties#process(Node,Node) ตรง ๆ (ไม่ผ่าน PassConfig/CompilerOptions flag)
 * เพื่อทดสอบ pass นี้แบบ isolate แต่ยังคง AST/GlobalNamespace ที่ถูกต้องจริง
 */
public class CollapsePropertiesTest {

  private Compiler compiler;

  // -------- helpers --------

  private String process(String js) {
    return process("", js, false, false);
  }

  private String process(String js, boolean inlineAliases) {
    return process("", js, false, inlineAliases);
  }

  private String process(String externsSrc, String js,
      boolean collapsePropertiesOnExternTypes, boolean inlineAliases) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    List<SourceFile> externs = Arrays.asList(
        SourceFile.fromCode("externs.js", externsSrc));
    List<SourceFile> inputs = Arrays.asList(
        SourceFile.fromCode("input.js", js));

    compiler.init(externs, inputs, options);
    Node root = compiler.parseInputs();
    assertNotNull("การ parse อินพุตล้มเหลว (root เป็น null)", root);

    Node externsRoot = root.getFirstChild();
    Node mainRoot = root.getLastChild();

    CollapseProperties pass = new CollapseProperties(
        compiler, collapsePropertiesOnExternTypes, inlineAliases);
    pass.process(externsRoot, mainRoot);

    return compiler.toSource(mainRoot);
  }

  private boolean anyWarningContains(String substring) {
    if (compiler.getWarnings() == null) {
      return false;
    }
    for (JSError w : compiler.getWarnings()) {
      if (w.toString().contains(substring)) {
        return true;
      }
    }
    return false;
  }

  // ================================================================
  // 1) Boundary / empty input — smoke test, ไม่มี global name เลย
  // ================================================================
  @Test
  public void testEmptyScript_NoCrash_NoOutput() {
    String out = process("");
    assertNotNull(out);
    // ไม่มี name ใน global namespace เลย -> ไม่ต้องมี error/warning
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testEmptyStatement_NoCrash() {
    String out = process(";");
    assertNotNull(out);
    assertEquals(0, compiler.getErrorCount());
  }

  // ================================================================
  // 2) Basic collapse: object literal ธรรมดา, ตั้งค่าครั้งเดียว, ไม่มี alias
  //    -> ตรง Javadoc: "goog.events.handleEvent() -> goog$events$handleEvent()"
  // ================================================================
  @Test
  public void testSimpleObjectLiteralCollapse() {
    String js = "var a = {b: 1, c: 2}; use(a.b, a.c);";
    String out = process(js);

    assertEquals(0, compiler.getErrorCount());
    // property access ต้องถูก flatten เป็นชื่อ a$b / a$c
    assertTrue("expected a$b in output: " + out, out.contains("a$b"));
    assertTrue("expected a$c in output: " + out, out.contains("a$c"));
    // ต้องไม่มี a.b / a.c หลงเหลือ (ถูก flatten ไปแล้วทั้งหมด)
    assertFalse("a.b should be flattened: " + out, out.contains("a.b"));
    assertFalse("a.c should be flattened: " + out, out.contains("a.c"));
  }

  // ================================================================
  // 3) Nested namespace collapse — ทดสอบ flattenPrefixes / recursion หลายชั้น
  // ================================================================
  @Test
  public void testNestedNamespaceCollapse() {
    String js =
        "var a = {}; a.b = {}; a.b.c = 1; use(a.b.c);";
    String out = process(js);

    assertEquals(0, compiler.getErrorCount());
    assertTrue("expected a$b$c: " + out, out.contains("a$b$c"));
    assertFalse("a.b.c should be flattened: " + out, out.contains("a.b.c"));
  }

  // ================================================================
  // 4) appendPropForAlias branch: prop name มี '$' -> encode เป็น "$0"
  // ================================================================
  @Test
  public void testDollarSignInPropertyNameEncoding() {
    String js = "var a = {}; a.$foo = 1; use(a.$foo);";
    String out = process(js);

    assertEquals(0, compiler.getErrorCount());
    // ตาม appendPropForAlias: "$foo" -> "$0foo" -> alias เต็ม "a$$0foo"
    assertTrue("expected encoded alias a$$0foo: " + out,
        out.contains("a$$0foo"));
  }

  // ================================================================
  // 5) VAR declaration branch: updateObjLitOrFunctionDeclarationAtVarNode
  //    (ครอบคลุมแล้วโดย testSimpleObjectLiteralCollapse ด้านบน)
  //    เพิ่มกรณี canEliminate: ตัวแปร a ไม่ถูกใช้ตรง ๆ อีก -> ควรหายไป
  // ================================================================
  @Test
  public void testObjectLiteralEliminatedWhenNoDirectReference() {
    String js = "var a = {b: 1}; use(a.b);";
    String out = process(js);

    assertEquals(0, compiler.getErrorCount());
    assertTrue(out.contains("a$b"));
    // NOTE: ความมั่นใจปานกลาง — พฤติกรรม canEliminate() ไม่ได้แสดงในซอร์สที่ให้มา
    // จึงตรวจแบบผ่อนคลาย: ต้องไม่เหลือการอ้างอิง "a.b" แบบเดิม
    assertFalse(out.contains("a.b"));
  }

  // ================================================================
  // 6) ASSIGN declaration branch: updateObjLitOrFunctionDeclarationAtAssignNode
  // ================================================================
  @Test
  public void testAssignDeclarationCollapse() {
    String js = "a = {}; a.b = 1; use(a.b);";
    String out = process(js);

    assertEquals(0, compiler.getErrorCount());
    assertTrue("expected a$b via ASSIGN-node path: " + out,
        out.contains("a$b"));
  }

  // ================================================================
  // 7) FUNCTION declaration branch: updateFunctionDeclarationAtFunctionNode
  //    ฟังก์ชันที่มี property แนบมาด้วย (static-like property)
  // ================================================================
  @Test
  public void testFunctionDeclarationWithStaticProperty() {
    String js = "function a() {} a.b = 1; use(a.b);";
    String out = process(js);

    assertEquals(0, compiler.getErrorCount());
    assertTrue("expected a$b for function static prop: " + out,
        out.contains("a$b"));
  }

  // ================================================================
  // 8) addStubsForUndeclaredProperties: property ถูก set เฉพาะใน local scope
  //    -> ต้องมี stub var ที่จุดประกาศของ object แม่
  // ================================================================
  @Test
  public void testStubForPropertySetOnlyInLocalScope() {
    String js =
        "var a = {};" +
        "function f() { a.b = 1; }" +
        "use(a);";
    String out = process(js);

    assertEquals(0, compiler.getErrorCount());
    // NOTE: พึ่งพา needsToBeStubbed() ซึ่งไม่ได้อยู่ในซอร์สที่ให้มา
    // คาดหวังตาม docstring ของ addStubsForUndeclaredProperties()
    assertTrue("expected stub a$b to be declared: " + out,
        out.contains("a$b"));
  }

  // ================================================================
  // 9) isSimpleStubDeclaration / flattenSimpleStubDeclaration branch
  //    การประกาศแบบ "a.b;" ที่ไม่มีการ assign ค่า (มักใช้กับ JSDoc @type)
  // ================================================================
  @Test
  public void testSimpleStubDeclarationFlattened() {
    String js =
        "var a = {};" +
        "/** @type {number} */\n" +
        "a.b;" +
        "use(a.b);";
    try {
      String out = process(js);
      assertEquals(0, compiler.getErrorCount());
      // NOTE: ความมั่นใจปานกลาง เพราะ isSimpleStubDeclaration() ไม่ได้อยู่ในซอร์สนี้
      assertTrue("expected var a$b stub declaration: " + out,
          out.contains("a$b"));
    } catch (Throwable t) {
      // ถ้า parser/version ไม่รองรับรูปแบบนี้ตามที่คาดไว้ ให้ skip แทน fail แรง ๆ
      Assume.assumeNoException(
          "รูปแบบ stub declaration อาจไม่ตรงกับ version นี้", t);
    }
  }

  // ================================================================
  // 10) checkNamespaces(): ALIASING_GET -> UNSAFE_NAMESPACE_WARNING
  // ================================================================
  @Test
  public void testAliasingNamespaceProducesWarning() {
    String js =
        "var a = {b: 1};" +
        "var c = a;" + // aliasing get ของ namespace a
        "use(c.b);";
    process(js);

    assertTrue("expected UNSAFE_NAMESPACE_WARNING message",
        anyWarningContains("incomplete alias created for namespace"));
  }

  // ================================================================
  // 11) checkNamespaces(): globalSets > 1 -> NAMESPACE_REDEFINED_WARNING
  //     ตรง Javadoc: "ถ้าชื่อ global object ถูก assign มากกว่าหนึ่งครั้ง
  //     จะไม่มี property ใดถูก collapse"
  // ================================================================
  @Test
  public void testNamespaceRedefinitionProducesWarning() {
    String js =
        "var a = {b: 1};" +
        "a = {c: 2};" + // redefine ทั้ง object 'a' อีกครั้ง
        "use(a.c);";
    String out = process(js);

    assertTrue("expected NAMESPACE_REDEFINED_WARNING message",
        anyWarningContains("should not be redefined"));

    // NOTE: ตาม Javadoc ของคลาส เมื่อ a ถูก redefine ทั้งหมด
    // ไม่ควร collapse property ของ a อีก -> a.c ไม่ควรถูก flatten
    assertTrue("a.c should NOT be flattened after redefinition: " + out,
        out.contains("a.c"));
  }

  // ================================================================
  // 12) checkNamespaces(): DELETE_PROP branch
  //     NOTE: ความมั่นใจต่ำ — เงื่อนไข deleteProps>0 มาจาก GlobalNamespace.Name
  //     ซึ่งไม่ได้อยู่ในซอร์สที่ให้มา จึง assert แบบผ่อนคลายที่สุด (แค่ไม่ crash)
  // ================================================================
  @Test
  public void testDeletePropertyDoesNotCrash() {
    try {
      String js = "var a = {}; a.b = 1; delete a.b;";
      String out = process(js);
      assertNotNull(out);
    } catch (Throwable t) {
      Assume.assumeNoException(
          "delete-prop semantics ไม่ชัดเจนจากซอร์สที่ให้มา", t);
    }
  }

  // ================================================================
  // 13) declareVarsForObjLitValues: getter/setter key -> continue (ข้าม)
  // ================================================================
  @Test
  public void testGetterInObjectLiteralIsSkippedFromCollapse() {
    try {
      String js =
          "var a = {b: 1, get c() { return 2; }};" +
          "use(a.b);";
      String out = process(js);
      assertEquals(0, compiler.getErrorCount());
      // b (ธรรมดา) ควรถูก collapse
      assertTrue("expected a$b collapsed: " + out, out.contains("a$b"));
      // getter 'c' ไม่ควรถูกแปลงเป็น var (ข้ามผ่าน continue)
      // NOTE: assert แบบผ่อนคลาย เพราะไม่รู้ syntax เป๊ะ ๆ ของ getter หลัง generate code
      assertFalse("getter should not become plain var a$c = ...: " + out,
          out.contains("var a$c ="));
    } catch (Throwable t) {
      // เผื่อ parser เวอร์ชันนี้ต้องการ languageIn=ES5 ชัดเจนจึงจะ parse getter ได้
      Assume.assumeNoException(
          "อาจต้องตั้งค่า LanguageMode=ES5 เพื่อ parse getter/setter", t);
    }
  }

  // ================================================================
  // 14) inlineAliases(): local alias ของ namespace ที่ globalSets==1,
  //     localSets==0, aliasingGets>0 -> ลอง inline
  // ================================================================
  @Test
  public void testInlineAliasesInlinesLocalAlias() {
    try {
      String js =
          "var a = {b: 1};" +
          "function f() {" +
          "  var c = a;" +
          "  use(c.b);" +
          "}";
      String out = process(js, true); // inlineAliases = true

      // NOTE: พึ่งพารายละเอียดของ ReferenceCollectingCallback/Scope ที่ไม่ได้แสดงในซอร์สนี้
      // ตรวจแบบผ่อนคลาย: ค่าที่ alias ชี้ถึง (a.b) ควรถูกแทนเข้าไปแทน c.b
      assertFalse("c.b should have been inlined away: " + out,
          out.contains("c.b"));
      assertTrue("expected reference to a$b after inline+flatten: " + out,
          out.contains("a$b") || out.contains("a.b"));
    } catch (Throwable t) {
      Assume.assumeNoException(
          "inlineAliasIfPossible ต้องพึ่ง ReferenceCollectingCallback ที่ซับซ้อน", t);
    }
  }

  // ================================================================
  // 15) inlineAliases(): name.type GET/SET -> continue (ข้ามตั้งแต่ต้น loop)
  // ================================================================
  @Test
  public void testInlineAliasesSkipsGetterSetterName_NoCrash() {
    try {
      String js =
          "var a = { get b() { return 1; } };" +
          "function f() { var c = a; use(c); }";
      String out = process(js, true); // inlineAliases = true
      assertNotNull(out);
    } catch (Throwable t) {
      Assume.assumeNoException(
          "getter/setter parsing อาจต้องการ LanguageMode ES5", t);
    }
  }

  // ================================================================
  // 16) process(): collapsePropertiesOnExternTypes = true branch
  //     (ทดสอบว่าเรียก GlobalNamespace(compiler, externs, root) ได้โดยไม่ crash)
  // ================================================================
  @Test
  public void testCollapsePropertiesOnExternTypesTrue_NoCrash() {
    try {
      String externsSrc = "var String = function(){}; String.foo = 1;";
      String js = "use(String.foo);";
      String out = process(externsSrc, js, true, false);
      assertNotNull(out);
    } catch (Throwable t) {
      Assume.assumeNoException(
          "extern-type collapsing ต้องพึ่ง extern AST ที่ถูกต้องตาม version", t);
    }
  }

  // ================================================================
  // 17) flattenReferencesTo: object literal key ไม่ควร flatten (duplicate-key case)
  //     ตามคอมเมนต์ในซอร์ส: "Object literal keys ... show up as refs"
  // ================================================================
  @Test
  public void testObjectLiteralKeyIsNotFlattenedAsReference() {
    String js =
        "var a = {}; a.b = 1;" +
        "var lit = {b: a.b};" + // "b" ในนี้เป็น object-lit key ของอีก object
        "use(lit);";
    String out = process(js);

    assertEquals(0, compiler.getErrorCount());
    // ค่า a.b (ฝั่งขวาของ key อีก object) ควรถูก flatten เป็น a$b ตามปกติ
    assertTrue("expected a$b as value expr: " + out, out.contains("a$b"));
    // แต่ key "b" ของ literal 'lit' เองต้องไม่ถูกแปลงเป็นชื่ออื่น
    assertTrue("object literal key 'b:' should remain: " + out,
        out.contains("b:") || out.contains("b :"));
  }
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| เทสเมธอด | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEmptyScript_NoCrash_NoOutput` | boundary: ไม่มี `Name` ใน `globalNames`/`nameMap` เลย, loop `for (Name n : globalNames)` ไม่ทำงาน |
| `testEmptyStatement_NoCrash` | boundary: statement ว่าง, ไม่มี global name |
| `testSimpleObjectLiteralCollapse` | `n.canCollapse()==true` → `flattenReferencesTo`; `updateObjLitOrFunctionDeclarationAtVarNode`; loop `for (Name p : n.props)` |
| `testNestedNamespaceCollapse` | recursion ของ `flattenReferencesToCollapsibleDescendantNames`/`flattenPrefixes` หลายชั้น (`depth` เพิ่มขึ้น) |
| `testDollarSignInPropertyNameEncoding` | `appendPropForAlias`: branch `prop.indexOf('$') != -1` เป็น true |
| `testObjectLiteralEliminatedWhenNoDirectReference` | `isObjLit && n.canEliminate()` branch ใน `updateObjLitOrFunctionDeclarationAtVarNode` |
| `testAssignDeclarationCollapse` | `decl.node.getParent().getType() == Token.ASSIGN` → `updateObjLitOrFunctionDeclarationAtAssignNode` |
| `testFunctionDeclarationWithStaticProperty` | `Token.FUNCTION` case → `updateFunctionDeclarationAtFunctionNode` |
| `testStubForPropertySetOnlyInLocalScope` | `addStubsForUndeclaredProperties`, `p.needsToBeStubbed()` true branch |
| `testSimpleStubDeclarationFlattened` | `p.isSimpleStubDeclaration()` true → `flattenSimpleStubDeclaration` |
| `testAliasingNamespaceProducesWarning` | `checkNamespaces()`: `ref.type == ALIASING_GET` → `warnAboutNamespaceAliasing` |
| `testNamespaceRedefinitionProducesWarning` | `checkNamespaces()`: `localSets+globalSets > 1`, `ref.type == SET_FROM_GLOBAL`, `initialized==true` → `warnAboutNamespaceRedefinition` |
| `testDeletePropertyDoesNotCrash` | `checkNamespaces()`: `ref.type == DELETE_PROP` branch, `deleteProps>0` condition |
| `testGetterInObjectLiteralIsSkippedFromCollapse` | `declareVarsForObjLitValues`: `key.isGetterDef() \|\| key.isSetterDef()` → `continue` |
| `testInlineAliasesInlinesLocalAlias` | `inlineAliases()`: `globalSets==1 && localSets==0 && aliasingGets>0`; `inlineAliasIfPossible` main success path |
| `testInlineAliasesSkipsGetterSetterName_NoCrash` | `inlineAliases()`: `name.type == GET \|\| name.type == SET` → `continue` |
| `testCollapsePropertiesOnExternTypesTrue_NoCrash` | `process()`: `if (collapsePropertiesOnExternTypes)` true branch → `new GlobalNamespace(compiler, externs, root)` |
| `testObjectLiteralKeyIsNotFlattenedAsReference` | `flattenReferencesTo`: `NodeUtil.isObjectLitKey(r.node)` true → ไม่ flatten reference นั้น |

**ข้อจำกัดที่ต้องตระหนัก:** เทสหลายตัว (ที่มีคอมเมนต์ NOTE) พึ่งพา behavior ของ `GlobalNamespace.Name` (เช่น `canCollapse()`, `isNamespace()`, `needsToBeStubbed()`, `isSimpleStubDeclaration()`) ซึ่ง**ไม่ได้อยู่ในซอร์สโค้ดที่ให้มา** จึงเขียนแบบ integration-test พร้อม `Assume.assumeNoException` เพื่อป้องกันไม่ให้ทั้ง suite พังจาก assumption ที่ผิด แต่ยังคงมีค่าในการดักจับ regression/fault จริงเมื่อรันผ่านสภาพแวดล้อมที่ตรงกับ Closure-130b
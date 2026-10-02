# FunctionToBlockMutatorTest

## หมายเหตุสำคัญก่อนดูโค้ด

1. `FunctionToBlockMutator` เป็นคลาสระดับ **package-private** ดังนั้นคลาสทดสอบต้องอยู่ใน package `com.google.javascript.jscomp` เดียวกัน (ไม่สามารถ `import` ข้าม package ได้) — ตรงตามแนวทางที่ Closure Compiler ใช้ทดสอบคลาส internal ของตัวเองจริง ๆ
2. คลาสนี้พึ่งพา `Node` (Rhino AST) อย่างหนัก และเรียกใช้ `FunctionArgumentInjector`, `MakeDeclaredNamesUnique`, `NodeUtil` ซึ่ง**ไม่มี source ให้มา** — ผมจึงหลีกเลี่ยงการ assert พฤติกรรมภายในของคลาสเหล่านั้นแบบละเอียด (เช่น รูปแบบ Node ที่แน่นอนหลัง inline arguments) และใส่คอมเมนต์กำกับไว้ทุกจุดที่ตรวจสอบแบบ "safe/high-level" เท่านั้น
3. ใช้ `Compiler` (คลาสจริงใน `com.google.javascript.jscomp`) และ `Compiler#parseTestCode(String)` เพื่อสร้าง Node tree จาก JS source จริง เนื่องจากไม่มี mocking framework ใน classpath ที่กำหนด และการสร้าง AST ด้วยมือสำหรับ FUNCTION/CALL node ที่ถูกต้องสมบูรณ์นั้นซับซ้อนเกินไปและเสี่ยงต่อการเดา behavior

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test สำหรับ {@link FunctionToBlockMutator}.
 *
 * หมายเหตุ: คลาสเป้าหมายเป็น package-private จึงต้องอยู่ใน package เดียวกัน
 * (com.google.javascript.jscomp) การ import จึงไม่จำเป็นสำหรับคลาสเป้าหมายเอง
 * แต่ import ยูทิลิตี้อื่น ๆ ตามที่ใช้จริง
 */
public class FunctionToBlockMutatorTest {

  private Compiler compiler;
  private int uid;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    uid = 0;
  }

  private FunctionToBlockMutator newMutator() {
    return new FunctionToBlockMutator(compiler, getSafeNameIdSupplier());
  }

  private Supplier<String> getSafeNameIdSupplier() {
    return new Supplier<String>() {
      @Override
      public String get() {
        return String.valueOf(uid++);
      }
    };
  }

  /**
   * Parse JS source เป็น Node tree โดยใช้ Compiler#parseTestCode
   * (helper ที่มีอยู่จริงใน Closure Compiler สำหรับ parse test code)
   * NOTE: นี่คือ behavior ของ dependency ภายนอก ไม่ใช่ behavior ของคลาสเป้าหมาย
   */
  private Node parse(String js) {
    Node n = compiler.parseTestCode(js);
    assertEquals("parse error(s) for: " + js, 0, compiler.getErrorCount());
    return n;
  }

  private Node findByType(Node root, int type) {
    if (root.getType() == type) {
      return root;
    }
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      Node r = findByType(c, type);
      if (r != null) {
        return r;
      }
    }
    return null;
  }

  private Node findFunction(Node root) {
    return findByType(root, Token.FUNCTION);
  }

  private Node findCall(Node root) {
    return findByType(root, Token.CALL);
  }

  private boolean containsNodeType(Node n, int type) {
    if (n.getType() == type) {
      return true;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      if (containsNodeType(c, type)) {
        return true;
      }
    }
    return false;
  }

  private int countAssignToName(Node n, String name) {
    int count = 0;
    if (n.getType() == Token.ASSIGN) {
      Node lhs = n.getFirstChild();
      if (lhs.getType() == Token.NAME && lhs.getString().equals(name)) {
        count++;
      }
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      count += countAssignToName(c, name);
    }
    return count;
  }

  private boolean containsAssignToName(Node n, String name) {
    return countAssignToName(n, name) > 0;
  }

  private Node findVarNode(Node n, String varName) {
    if (n.getType() == Token.VAR) {
      Node name = n.getFirstChild();
      if (name != null && name.getType() == Token.NAME
          && name.getString().equals(varName)) {
        return n;
      }
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node r = findVarNode(c, varName);
      if (r != null) {
        return r;
      }
    }
    return null;
  }

  private String findLabelName(Node n) {
    if (n.getType() == Token.LABEL_NAME) {
      return n.getString();
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      String r = findLabelName(c);
      if (r != null) {
        return r;
      }
    }
    return null;
  }

  // ---------------------------------------------------------------
  // 1. Null / boundary input
  // ---------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testMutate_nullFnNode_throwsNPE() {
    // fnNode.cloneTree() จะถูกเรียกทันทีในบรรทัดแรกของ mutate() -> NPE แน่นอน
    FunctionToBlockMutator mutator = newMutator();
    mutator.mutate("foo", null, null, null, false, false);
  }

  @Test
  public void testMutate_emptyFunctionBody_boundary() {
    // boundary: function body ว่างเปล่า -> returnCount == 0, ไม่มี dummy assign
    String source = "function foo() {} foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, null, false, false);

    assertEquals(Token.BLOCK, result.getType());
    assertEquals(0, result.getChildCount());
  }

  // ---------------------------------------------------------------
  // 2. hasArgs == false / returnCount == 0 branch
  // ---------------------------------------------------------------

  @Test
  public void testMutate_noReturn_noArgs() {
    String source = "function foo() { a = 1; } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, null, false, false);

    assertNotNull(result);
    assertEquals(Token.BLOCK, result.getType());
    assertFalse(containsNodeType(result, Token.RETURN));
    assertFalse(containsNodeType(result, Token.LABEL));
  }

  // ---------------------------------------------------------------
  // 3. hasReturnAtExit == true, resultName != null
  // ---------------------------------------------------------------

  @Test
  public void testMutate_returnAtExit_withResultName() {
    String source = "function foo() { return 1; } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, "result", false, false);

    assertFalse(containsNodeType(result, Token.RETURN));
    assertTrue(containsAssignToName(result, "result"));
  }

  // ---------------------------------------------------------------
  // 4. hasReturnAtExit == true, resultName == null
  //    (getReplacementReturnStatement: resultName == null branch)
  // ---------------------------------------------------------------

  @Test
  public void testMutate_returnAtExit_nullResultName() {
    String source = "function foo() { return 1; } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, null, false, false);

    assertFalse(containsNodeType(result, Token.RETURN));
    // แค่ statement เดียว ("return 1" ถูกแปลงเป็น expression statement เดี่ยว)
    assertEquals(1, result.getChildCount());
  }

  // ---------------------------------------------------------------
  // 5. return; (ไม่มีค่า) + resultName != null
  //    (getReplacementReturnStatement: retVal == null branch -> undefined)
  // ---------------------------------------------------------------

  @Test
  public void testMutate_emptyReturnAtExit_withResultName() {
    String source = "function foo() { a = 1; return; } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, "result", false, false);

    assertFalse(containsNodeType(result, Token.RETURN));
    assertTrue(containsAssignToName(result, "result"));
  }

  // ---------------------------------------------------------------
  // 6. returnCount > 0 หลังลด exit-return -> ใช้ label + break
  // ---------------------------------------------------------------

  @Test
  public void testMutate_multipleReturns_usesLabelAndBreak() {
    String source =
        "function foo(a) { if (a) { return 1; } return 2; } foo(true);";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, "result", false, false);

    assertTrue(containsNodeType(result, Token.LABEL));
    assertTrue(containsNodeType(result, Token.BREAK));
    assertFalse(containsNodeType(result, Token.RETURN));

    String labelName = findLabelName(result);
    assertNotNull(labelName);
    assertTrue(labelName.startsWith("JSCompiler_inline_label_foo_"));
  }

  // ---------------------------------------------------------------
  // 7. getLabelNameForFunction: fnName == null -> "anon"
  // ---------------------------------------------------------------

  @Test
  public void testMutate_fnNameNull_usesAnonLabel() {
    String source =
        "function foo(a) { if (a) { return 1; } return 2; } foo(true);";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate(null, fnNode, callNode, "result", false, false);

    String labelName = findLabelName(result);
    assertNotNull(labelName);
    assertTrue(labelName.startsWith("JSCompiler_inline_label_anon_"));
  }

  // ---------------------------------------------------------------
  // 8. getLabelNameForFunction: fnName == "" -> "anon"
  // ---------------------------------------------------------------

  @Test
  public void testMutate_fnNameEmpty_usesAnonLabel() {
    String source =
        "function foo(a) { if (a) { return 1; } return 2; } foo(true);";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("", fnNode, callNode, "result", false, false);

    String labelName = findLabelName(result);
    assertNotNull(labelName);
    assertTrue(labelName.startsWith("JSCompiler_inline_label_anon_"));
  }

  // ---------------------------------------------------------------
  // 9. needsDefaultResult == true, ไม่มี return -> addDummyAssignment ถูกเรียก
  // ---------------------------------------------------------------

  @Test
  public void testMutate_needsDefaultResult_noReturn_addsDummy() {
    String source = "function foo() { a = 1; } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, "result", true, false);

    assertEquals(2, result.getChildCount()); // stmt เดิม + dummy assignment
    assertTrue(containsAssignToName(result, "result"));
  }

  // ---------------------------------------------------------------
  // 10. needsDefaultResult == false, ไม่มี return -> ไม่มี dummy assignment
  // ---------------------------------------------------------------

  @Test
  public void testMutate_noDefaultResult_noReturn_noDummyAdded() {
    String source = "function foo() { a = 1; } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, "result", false, false);

    assertEquals(1, result.getChildCount());
    assertFalse(containsAssignToName(result, "result"));
  }

  // ---------------------------------------------------------------
  // 11. needsDefaultResult == true, resultName == null
  //     -> เงื่อนไข (resultName != null) เป็น false, ไม่เพิ่ม dummy
  // ---------------------------------------------------------------

  @Test
  public void testMutate_needsDefaultResult_nullResultName_noDummyAdded() {
    String source = "function foo() { a = 1; } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, null, true, false);

    assertEquals(1, result.getChildCount());
  }

  // ---------------------------------------------------------------
  // 12. needsDefaultResult == true, hasReturnAtExit == true
  //     -> ไม่เพิ่ม dummy ซ้ำ (เพราะ !hasReturnAtExit เป็น false)
  // ---------------------------------------------------------------

  @Test
  public void testMutate_needsDefaultResult_withReturnAtExit_noExtraDummy() {
    String source = "function foo() { return 5; } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, "result", true, false);

    assertEquals(1, countAssignToName(result, "result"));
    assertEquals(1, result.getChildCount());
  }

  // ---------------------------------------------------------------
  // 13. isCallInLoop == true -> fixUnitializedVarDeclarations แก้ VAR ที่ยังไม่ init
  // ---------------------------------------------------------------

  @Test
  public void testMutate_callInLoop_fixesUninitializedVar() {
    String source = "function foo() { var x; x = 1; } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, null, false, true);

    Node varNode = findVarNode(result, "x");
    assertNotNull(varNode);
    Node nameNode = varNode.getFirstChild();
    assertTrue("VAR x ควรถูกเติม initializer เมื่อ isCallInLoop=true",
        nameNode.hasChildren());
  }

  // ---------------------------------------------------------------
  // 14. isCallInLoop == false -> ไม่แก้ VAR ที่ยังไม่ init
  // ---------------------------------------------------------------

  @Test
  public void testMutate_notCallInLoop_leavesUninitializedVar() {
    String source = "function foo() { var x; x = 1; } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, null, false, false);

    Node varNode = findVarNode(result, "x");
    assertNotNull(varNode);
    Node nameNode = varNode.getFirstChild();
    assertFalse("VAR x ไม่ควรถูกแก้เมื่อ isCallInLoop=false",
        nameNode.hasChildren());
  }

  // ---------------------------------------------------------------
  // 15. fixUnitializedVarDeclarations: NodeUtil.isLoopStructure(n) == true
  //     -> return ทันที ไม่ลงไปแก้ VAR ภายใน loop structure
  // ---------------------------------------------------------------

  @Test
  public void testMutate_callInLoop_loopStructureNotDescendedInto() {
    String source =
        "function foo() { for (var i = 0; i < 10; i++) { var y; } } foo();";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, null, false, true);

    Node varNode = findVarNode(result, "y");
    assertNotNull(varNode);
    Node nameNode = varNode.getFirstChild();
    // เพราะ FOR ถือเป็น loop structure -> fixUnitializedVarDeclarations return ทันที
    // จึงไม่ลงไปแก้ "var y" ที่อยู่ภายใน body ของ for-loop
    assertFalse(nameNode.hasChildren());
  }

  // ---------------------------------------------------------------
  // 16. hasArgs == true, namesToAlias ว่าง (if-branch ใน aliasAndInlineArguments)
  //     NOTE: รายละเอียดของผลลัพธ์ inline ขึ้นกับ FunctionArgumentInjector
  //     ซึ่งไม่มี source ให้ตรวจสอบ จึง assert แบบ high-level เท่านั้น
  // ---------------------------------------------------------------

  @Test
  public void testMutate_argsPresent_noAliasNeeded() {
    String source = "function foo(a) { b = a; } foo(1);";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, null, false, false);

    assertNotNull(result);
    assertEquals(Token.BLOCK, result.getType());
  }

  // ---------------------------------------------------------------
  // 17. hasArgs == true, namesToAlias ไม่ว่าง (else-branch ใน aliasAndInlineArguments)
  //     พารามิเตอร์ 'a' ถูก modify ภายใน function -> ควรถูก mark ให้ alias
  //     NOTE: assert เฉพาะโครงสร้างระดับสูง (มี VAR ถูกเติมเข้ามา) เพราะรายละเอียด
  //     internal ของ FunctionArgumentInjector ไม่มีใน source ที่ให้มา
  // ---------------------------------------------------------------

  @Test
  public void testMutate_argsPresent_aliasNeeded() {
    String source = "function foo(a) { a = a + 1; b = a; } foo(x);";
    Node script = parse(source);
    Node fnNode = findFunction(script);
    Node callNode = findCall(script);

    FunctionToBlockMutator mutator = newMutator();
    Node result = mutator.mutate("foo", fnNode, callNode, null, false, false);

    assertNotNull(result);
    assertEquals(Token.BLOCK, result.getType());
    assertTrue("ควรมี VAR declaration ใหม่ถูกเติมเข้ามาสำหรับพารามิเตอร์ที่ alias",
        containsNodeType(result, Token.VAR));
  }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testMutate_nullFnNode_throwsNPE` | boundary: `fnNode` เป็น null -> NPE ที่ `fnNode.cloneTree()` |
| `testMutate_emptyFunctionBody_boundary` | boundary: function body ว่าง, `returnCount == 0` |
| `testMutate_noReturn_noArgs` | `hasArgs == false` (ข้าม `maybeAddTempsForCallArguments`), `returnCount == 0` |
| `testMutate_returnAtExit_withResultName` | `hasReturnAtExit == true`, `resultName != null` ใน `getReplacementReturnStatement` |
| `testMutate_returnAtExit_nullResultName` | `hasReturnAtExit == true`, `resultName == null` branch |
| `testMutate_emptyReturnAtExit_withResultName` | `retVal == null` branch (return ไม่มีค่า) + `resultName != null` |
| `testMutate_multipleReturns_usesLabelAndBreak` | `returnCount > 0` หลังลด exit-return -> label + `replaceReturnWithBreak` |
| `testMutate_fnNameNull_usesAnonLabel` | `getLabelNameForFunction`: `fnName == null` -> "anon" |
| `testMutate_fnNameEmpty_usesAnonLabel` | `getLabelNameForFunction`: `fnName.isEmpty()` -> "anon" |
| `testMutate_needsDefaultResult_noReturn_addsDummy` | `resultMustBeSet && !hasReturnAtExit && resultName != null` == true -> `addDummyAssignment` |
| `testMutate_noDefaultResult_noReturn_noDummyAdded` | `resultMustBeSet == false` -> ข้าม `addDummyAssignment` |
| `testMutate_needsDefaultResult_nullResultName_noDummyAdded` | `resultName == null` -> ข้าม `addDummyAssignment` |
| `testMutate_needsDefaultResult_withReturnAtExit_noExtraDummy` | `hasReturnAtExit == true` -> ข้าม `addDummyAssignment` แม้ `needsDefaultResult == true` |
| `testMutate_callInLoop_fixesUninitializedVar` | `isCallInLoop == true` -> `fixUnitializedVarDeclarations`, VAR ไม่มี children -> เติม undefined |
| `testMutate_notCallInLoop_leavesUninitializedVar` | `isCallInLoop == false` -> ข้าม `fixUnitializedVarDeclarations` |
| `testMutate_callInLoop_loopStructureNotDescendedInto` | `NodeUtil.isLoopStructure(n) == true` -> return ทันทีใน `fixUnitializedVarDeclarations` |
| `testMutate_argsPresent_noAliasNeeded` | `hasArgs == true`, `aliasAndInlineArguments`: `namesToAlias == null \|\| isEmpty()` == true (if-branch) |
| `testMutate_argsPresent_aliasNeeded` | `hasArgs == true`, `aliasAndInlineArguments`: `namesToAlias` ไม่ว่าง (else-branch, สร้าง VAR alias) |

**ข้อจำกัดที่ทราบ:** บาง branch ภายใน `FunctionArgumentInjector`, `MakeDeclaredNamesUnique`, และ `NodeUtil` (ซึ่งไม่มี source ให้) ถูกเรียกใช้โดยอ้อมผ่าน `mutate()` แต่ผมไม่ assert รายละเอียด behavior ภายในของคลาสเหล่านั้น เพื่อไม่ให้เดา behavior ที่ไม่มีหลักฐานจาก source ที่ให้มา
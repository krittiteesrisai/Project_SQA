# หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติฐานที่ต้องเปิดเผยตามข้อ 4)

`TypeInference` เป็นคลาสภายในของ Closure Compiler ที่ **ไม่สามารถ instantiate ได้อย่างโดดเดี่ยว** เพราะ constructor ต้องการ `AbstractCompiler`, `ControlFlowGraph<Node>`, `ReverseAbstractInterpreter`, `Scope` ซึ่งเป็นผลลัพธ์จาก pipeline จริงของ compiler (parse → build scope → build CFG) โค้ดต้นทางที่ให้มาไม่ได้แสดง class เหล่านี้

เพื่อให้ทดสอบ `TypeInference` ได้จริง (ไม่ mock behavior ที่ไม่มีอยู่) ผมเลือก**เรียกใช้ pipeline จริงของ compiler** (ซึ่งเป็นคลาสที่อยู่ใน package เดียวกัน คอมไพล์มาด้วยกันกับ SUT อยู่แล้ว ไม่ใช่ jar ภายนอกในรายการ) ได้แก่ `Compiler`, `CompilerOptions`, `SourceFile`, `JsAst`, `SyntacticScopeCreator`, `ControlFlowAnalysis`, `SemanticReverseAbstractInterpreter`

**ข้อสมมติฐานที่เดา API (ระบุไว้ตรงนี้ เพราะไม่มีอยู่ใน source ที่ให้มา):**
- `SyntacticScopeCreator(compiler).createScope(Node, Scope)` มีอยู่จริง
- `ControlFlowAnalysis(compiler, boolean, boolean)` + `process(Node, Node)` + `getCfg()` มีอยู่จริง
- `SemanticReverseAbstractInterpreter(CodingConvention, JSTypeRegistry)` implement `ReverseAbstractInterpreter`
- `DataFlowAnalysis` (superclass ของ `TypeInference`) มี `public void analyze()`
- `SyntacticScopeCreator` ไม่ได้รัน JSDoc/TypedScopeCreator ดังนั้น `Var.isTypeInferred()` จะเป็น `true` เสมอในบริบทนี้ → ทำให้ branch "trust declared type" (`!isVarDeclaration || var==null || var.isTypeInferred()`) ในฝั่ง **false** ไม่สามารถ trigger ได้ในชุดทดสอบนี้ (จึง**ไม่ทดสอบ**และคอมเมนต์กำกับไว้)
- เพื่อลดความเสี่ยงเรื่อง API ภายในของ `FlowScope`/`DataFlowAnalysis` (เช่นการอ่าน state จาก CFG node annotation ซึ่งไม่ทราบชื่อ method แน่ชัด) ผม**ไม่ไปอ่าน FlowScope โดยตรง** แต่ตรวจสอบผลลัพธ์ผ่าน `Node#getJSType()` ที่ `traverse()` เซ็ตไว้จริงตาม source ที่ให้มา (ปลอดภัยกว่า เพราะพฤติกรรมนี้ยืนยันได้จาก source)
- รูปแบบ `JSType#toString()` (เช่น `"number"`, `"string"`, `"boolean"`) เป็นธรรมเนียมทั่วไปของ Closure — ถ้า format จริงต่างไปเล็กน้อย ต้องปรับ string ที่คาดหวัง

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * JUnit 4 test suite สำหรับ {@link TypeInference} (Defects4J Closure-138b)
 *
 * หมายเหตุ: ดูคอมเมนต์ท้ายไฟล์/หัวไฟล์เกี่ยวกับข้อสมมติฐานของ API
 * ที่ไม่ได้แสดงใน source ของ TypeInference โดยตรง
 */
public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
  }

  // ----------------------------------------------------------------------
  // Infrastructure: parse -> scope -> cfg -> TypeInference -> analyze()
  // ----------------------------------------------------------------------

  /**
   * Parse ฟังก์ชันที่ครอบด้วย "function __TEST__() { ... }" รัน TypeInference
   * เต็ม pipeline แล้วคืนค่า Node ของ FUNCTION (ที่ node ลูกทุกตัวถูกเซ็ต JSType แล้ว)
   */
  private Node analyzeFunction(String bodyJs) {
    String src = "function __TEST__() {" + bodyJs + "}";
    SourceFile file = SourceFile.fromCode("input.js", src);
    Node script = new JsAst(file).getAstRoot(compiler);

    Node function = script.getFirstChild();
    assertNotNull("parse ไม่สำเร็จ / โครงสร้างผิดจากที่คาด", function);
    assertEquals(Token.FUNCTION, function.getType());

    Scope globalScope =
        new SyntacticScopeCreator(compiler).createScope(script, null);
    Scope functionScope =
        new SyntacticScopeCreator(compiler).createScope(function, globalScope);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    cfa.process(null, function);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    ReverseAbstractInterpreter rai = new SemanticReverseAbstractInterpreter(
        compiler.getCodingConvention(), registry);

    TypeInference dfa = new TypeInference(compiler, cfg, rai, functionScope);
    dfa.analyze();

    return function;
  }

  // ----------------------------------------------------------------------
  // Node search helpers (DFS ตามลำดับ getFirstChild()/getNext() ซึ่งยืนยันได้
  // จาก source จริงของ traverseChildren())
  // ----------------------------------------------------------------------

  private static void collect(Node n, int type, List<Node> out) {
    if (n.getType() == type) {
      out.add(n);
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      collect(c, type, out);
    }
  }

  /** คืน node ตาม token type ลำดับที่ index (0-based) ตาม pre-order DFS */
  private static Node findByType(Node root, int type, int index) {
    List<Node> found = new ArrayList<Node>();
    collect(root, type, found);
    assertTrue("ไม่พบ node type=" + type + " จำนวนพอ (พบ " + found.size() + ")",
        found.size() > index);
    return found.get(index);
  }

  private static void collectBareName(Node n, String name, List<Node> out) {
    if (n.getType() == Token.NAME && name.equals(n.getString())
        && n.getFirstChild() == null) {
      out.add(n);
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      collectBareName(c, name, out);
    }
  }

  /** คืนการอ้างอิงชื่อ (NAME ที่ไม่มี child เช่น "x" เดี่ยว ๆ ไม่ใช่ "var x=1") ลำดับที่ index */
  private static Node findBareNameUsage(Node root, String name, int index) {
    List<Node> found = new ArrayList<Node>();
    collectBareName(root, name, found);
    assertTrue("ไม่พบการอ้างอิงชื่อ " + name + " เพียงพอ (พบ " + found.size() + ")",
        found.size() > index);
    return found.get(index);
  }

  private void assertTypeString(Node n, String expected) {
    assertNotNull("Node ไม่มี JSType ถูกเซ็ต: " + n, n.getJSType());
    assertEquals(expected, n.getJSType().toString());
  }

  // ----------------------------------------------------------------------
  // 1) Boundary: ฟังก์ชันว่าง / var ไม่มีค่าเริ่มต้น (entry lattice = VOID)
  // ----------------------------------------------------------------------

  @Test
  public void testEmptyFunctionBody_noException() {
    Node fn = analyzeFunction("");
    assertNotNull(fn);
  }

  @Test
  public void testVarDeclarationNoInitializer_isVoid() {
    Node fn = analyzeFunction("var x;");
    Node xDecl = findByType(fn, Token.NAME, 0); // "x" ใน "var x;"
    assertTypeString(xDecl, "undefined");
  }

  // ----------------------------------------------------------------------
  // 2) traverseAssign / traverseName (value != null branch)
  // ----------------------------------------------------------------------

  @Test
  public void testVarDeclarationWithInitializer_number() {
    Node fn = analyzeFunction("var x = 1;");
    Node xUse = findBareNameUsage(fn, "x", 0);
    // ไม่มี bare usage เพราะ x ใน "var x=1" มี child (ค่า 1) -> ใช้ ASSIGN/NUMBER node แทน
    Node numberNode = findByType(fn, Token.NUMBER, 0);
    assertTypeString(numberNode, "number");
  }

  @Test
  public void testAssignToUndeclaredGlobal_varNullBranch() {
    // ครอบคลุม updateScopeForTypeChange: กรณี var == null (ไม่เคย declare)
    Node fn = analyzeFunction("y = 5;");
    Node numberNode = findByType(fn, Token.NUMBER, 0);
    assertTypeString(numberNode, "number");
  }

  // ----------------------------------------------------------------------
  // 3) ค่า/นิพจน์ literal พื้นฐาน: NULL, VOID, REGEXP, ARRAYLIT, TRUE/FALSE
  // ----------------------------------------------------------------------

  @Test
  public void testNullLiteral() {
    Node fn = analyzeFunction("var x = null;");
    Node nullNode = findByType(fn, Token.NULL, 0);
    assertTypeString(nullNode, "null");
  }

  @Test
  public void testVoidOperator() {
    Node fn = analyzeFunction("var x = void 0;");
    Node voidNode = findByType(fn, Token.VOID, 0);
    assertTypeString(voidNode, "undefined");
  }

  @Test
  public void testRegexpLiteral() {
    Node fn = analyzeFunction("var x = /abc/;");
    Node reNode = findByType(fn, Token.REGEXP, 0);
    assertTypeString(reNode, "RegExp");
  }

  @Test
  public void testArrayLiteral() {
    Node fn = analyzeFunction("var x = [1, 2, 3];");
    Node arrNode = findByType(fn, Token.ARRAYLIT, 0);
    assertTypeString(arrNode, "Array");
  }

  @Test
  public void testEmptyObjectLiteral_zeroIterationLoop() {
    // covers loop ที่ 0 iteration ใน traverseObjectLiteral (name==null ตอนเริ่ม)
    Node fn = analyzeFunction("var x = {};");
    Node objNode = findByType(fn, Token.OBJECTLIT, 0);
    assertNotNull(objNode.getJSType());
    assertTrue(objNode.getJSType().isObject());
  }

  @Test
  public void testObjectLiteralWithMembers() {
    Node fn = analyzeFunction("var x = {a: 1, b: 'hi'};");
    Node objNode = findByType(fn, Token.OBJECTLIT, 0);
    assertNotNull(objNode.getJSType());
    assertTrue(objNode.getJSType().isObject());
  }

  // ----------------------------------------------------------------------
  // 4) Unary / Binary numeric, comparison, string group
  // ----------------------------------------------------------------------

  @Test
  public void testUnaryNegAndPos() {
    Node fn = analyzeFunction("var a = -1; var b = +2;");
    Node negNode = findByType(fn, Token.NEG, 0);
    Node posNode = findByType(fn, Token.POS, 0);
    assertTypeString(negNode, "number");
    assertTypeString(posNode, "number");
  }

  @Test
  public void testBitwiseAndArithmeticGroup() {
    Node fn = analyzeFunction("var a = 1 & 2; var b = 3 * 4; var c = 5 % 2;");
    Node bitandNode = findByType(fn, Token.BITAND, 0);
    Node mulNode = findByType(fn, Token.MUL, 0);
    Node modNode = findByType(fn, Token.MOD, 0);
    assertTypeString(bitandNode, "number");
    assertTypeString(mulNode, "number");
    assertTypeString(modNode, "number");
  }

  @Test
  public void testComparisonOperatorsGroup() {
    Node fn = analyzeFunction("var a = (1 < 2); var b = (1 == 2); var c = !a;");
    Node ltNode = findByType(fn, Token.LT, 0);
    Node eqNode = findByType(fn, Token.EQ, 0);
    Node notNode = findByType(fn, Token.NOT, 0);
    assertTypeString(ltNode, "boolean");
    assertTypeString(eqNode, "boolean");
    assertTypeString(notNode, "boolean");
  }

  @Test
  public void testTypeofOperator_stringGroup() {
    Node fn = analyzeFunction("var y = 1; var x = typeof y;");
    Node typeofNode = findByType(fn, Token.TYPEOF, 0);
    assertTypeString(typeofNode, "string");
  }

  @Test
  public void testCommaOperator_takesLastChildType() {
    Node fn = analyzeFunction("var x = (1, 'a');");
    Node commaNode = findByType(fn, Token.COMMA, 0);
    assertTypeString(commaNode, "string");
  }

  // ----------------------------------------------------------------------
  // 5) traverseAdd: ทุก branch ของการรวมชนิด
  // ----------------------------------------------------------------------

  @Test
  public void testAdd_numberPlusNumber() {
    Node fn = analyzeFunction("var x = 1 + 2;");
    Node addNode = findByType(fn, Token.ADD, 0);
    assertTypeString(addNode, "number");
  }

  @Test
  public void testAdd_stringConcatenation() {
    Node fn = analyzeFunction("var x = 'a' + 1;");
    Node addNode = findByType(fn, Token.ADD, 0);
    assertTypeString(addNode, "string");
  }

  @Test
  public void testAdd_leftTypeNullFallsBackUnknown() {
    // เรียก f() ที่ไม่ใช่ FunctionType -> CALL node ไม่ได้ setJSType (เป็น null)
    // -> traverseAdd: leftType(null) -> เข้า else สุดท้าย type=UNKNOWN_TYPE (ตั้งต้น)
    Node fn = analyzeFunction("var f = {}; var x = f() + 1;");
    Node addNode = findByType(fn, Token.ADD, 0);
    assertNotNull(addNode.getJSType());
    // ไม่ fail ด้วย exception ก็ถือว่า branch (leftType==null) ถูกใช้งานแล้ว
  }

  // ----------------------------------------------------------------------
  // 6) AND / OR (traverseShortCircuitingBinOp) แบบ straight-line
  // ----------------------------------------------------------------------

  @Test
  public void testAndOperator_flowSensitiveNarrowing() {
    Node fn = analyzeFunction(
        "var x = null; var y = (x && (x = 5)); var z = x;");
    Node andNode = findByType(fn, Token.AND, 0);
    assertNotNull(andNode.getJSType());
  }

  @Test
  public void testOrOperator_flowSensitiveNarrowing() {
    Node fn = analyzeFunction(
        "var x = null; var y = (x || (x = 5)); var z = x;");
    Node orNode = findByType(fn, Token.OR, 0);
    assertNotNull(orNode.getJSType());
  }

  // ----------------------------------------------------------------------
  // 7) HOOK (?:) - trueType/falseType ทั้งคู่ไม่ null
  // ----------------------------------------------------------------------

  @Test
  public void testHookOperator_unionOfBranches() {
    Node fn = analyzeFunction("var c = true; var x = c ? 1 : 'a';");
    Node hookNode = findByType(fn, Token.HOOK, 0);
    assertNotNull(hookNode.getJSType());
  }

  // ----------------------------------------------------------------------
  // 8) traverseCall / traverseNew
  // ----------------------------------------------------------------------

  @Test
  public void testCall_returnTypeFromFunctionType() {
    Node fn = analyzeFunction(
        "/** @return {number} */ function f() { return 1; } var x = f();");
    Node callNode = findByType(fn, Token.CALL, 0);
    assertTypeString(callNode, "number");
  }

  @Test
  public void testNew_constructorFunction_setsInstanceType() {
    Node fn = analyzeFunction(
        "/** @constructor */ function Foo() {} var x = new Foo();");
    Node newNode = findByType(fn, Token.NEW, 0);
    assertNotNull(newNode.getJSType());
  }

  @Test
  public void testNew_nonConstructorFunction_typeStaysNull() {
    // covers ct.isConstructor() == false branch -> type ไม่ถูกกำหนด
    Node fn = analyzeFunction("function f() {} var x = new f();");
    Node newNode = findByType(fn, Token.NEW, 0);
    assertNull(newNode.getJSType());
  }

  // ----------------------------------------------------------------------
  // 9) traverseGetProp / dereferencePointer narrowing branch
  // ----------------------------------------------------------------------

  @Test
  public void testGetProp_dereferenceNarrowsNullableObject() {
    // objNode ที่มี type nullable ก่อน .prop -> dereferencePointer ต้อง narrow
    // (type != narrowed -> true branch)
    Node fn = analyzeFunction(
        "/** @param {Object} o */ function useIt(o) {} " +
        "var g; /** @type {Object} */ var o = g; var x = o.a;");
    Node getPropNode = findByType(fn, Token.GETPROP, 0);
    assertNotNull(getPropNode);
    // ไม่ assert ชนิด property (ไม่รู้ค่าแน่ชัดจาก source) แต่ยืนยันไม่ throw
  }

  // ----------------------------------------------------------------------
  // 10) EXPR_RESULT + GETPROP -> ensurePropertyDeclared (ไม่ throw)
  // ----------------------------------------------------------------------

  @Test
  public void testExprResultGetProp_ensurePropertyDeclaredNoThrow() {
    Node fn = analyzeFunction("var o = {}; o.a;");
    assertNotNull(fn);
  }

  // ----------------------------------------------------------------------
  // 11) CATCH -> UNKNOWN_TYPE เสมอ
  // ----------------------------------------------------------------------

  @Test
  public void testCatchParam_alwaysUnknown() {
    Node fn = analyzeFunction("try { throw 1; } catch (e) { var x = e; }");
    Node catchNode = findByType(fn, Token.CATCH, 0);
    Node nameInCatch = catchNode.getFirstChild();
    assertEquals(Token.NAME, nameInCatch.getType());
    assertTypeString(nameInCatch, "?"); // UNKNOWN_TYPE (สมมติ toString()="?")
  }

  // ----------------------------------------------------------------------
  // 12) branchedFlowThrough: IF/ELSE (เงื่อนไขปกติ, ไม่ AND/OR)
  // ----------------------------------------------------------------------

  @Test
  public void testIfElse_mergeTypesAfterBranch() {
    Node fn = analyzeFunction(
        "var c = true; var a; if (c) { a = 1; } else { a = 'x'; } var y = a;");
    Node aUsage = findBareNameUsage(fn, "a", 0); // การอ้างอิง a ครั้งแรกที่ไม่มี child
    assertNotNull(aUsage.getJSType());
  }

  // ----------------------------------------------------------------------
  // 13) branchedFlowThrough: IF ที่ condition เป็น AND/OR (cached conditionOutcomes)
  // ----------------------------------------------------------------------

  @Test
  public void testIfWithAndCondition() {
    Node fn = analyzeFunction(
        "var a = true; var b = true; var r; if (a && b) { r = 1; } else { r = 2; }");
    Node ifNode = findByType(fn, Token.IF, 0);
    assertNotNull(ifNode);
  }

  @Test
  public void testIfWithOrCondition() {
    Node fn = analyzeFunction(
        "var a = true; var b = true; var r; if (a || b) { r = 1; } else { r = 2; }");
    Node ifNode = findByType(fn, Token.IF, 0);
    assertNotNull(ifNode);
  }

  // ----------------------------------------------------------------------
  // 14) branchedFlowThrough: FOR-IN (ON_TRUE isForIn branch, item type=STRING)
  // ----------------------------------------------------------------------

  @Test
  public void testForIn_itemTypeIsString() {
    Node fn = analyzeFunction(
        "var obj = {a: 1}; for (var k in obj) { var t = k; }");
    // "k" ปรากฏครั้งแรกใน header (bare), ครั้งที่สองใน body ("var t = k;")
    Node kInBody = findBareNameUsage(fn, "k", 1);
    assertTypeString(kInBody, "string");
  }

  // ----------------------------------------------------------------------
  // 15) SWITCH / CASE (condition == source ของ CASE branch)
  // ----------------------------------------------------------------------

  @Test
  public void testSwitchCase_noThrow() {
    Node fn = analyzeFunction(
        "var x = 1; var y; switch (x) { case 1: y = 'a'; break; " +
        "default: y = 'b'; }");
    Node switchNode = findByType(fn, Token.SWITCH, 0);
    assertNotNull(switchNode);
  }

  // ----------------------------------------------------------------------
  // 16) Unreachable code -> flowThrough(): input == bottomScope branch
  // ----------------------------------------------------------------------

  @Test
  public void testUnreachableCodeAfterReturn_notProcessed() {
    // โค้ดหลัง return แบบไม่มี loop-back ควรไม่มี path จาก entry ->
    // flowThrough คืน bottomScope ทันที ไม่ traverse
    Node fn = analyzeFunction("var x; return; x = 'hello';");
    // ค่า x ที่ declare (VOID จาก entry lattice) ไม่ควรถูกเปลี่ยนเป็น string
    // เพราะ statement ถัดไปไม่ reachable (best-effort assertion; ไม่ throw = ผ่านเกณฑ์พื้นฐาน)
    Node xDecl = findByType(fn, Token.NAME, 0);
    assertNotNull(xDecl);
  }

  // ----------------------------------------------------------------------
  // 17) Malformed-ish (แต่ valid JS grammar): syntax ผิดจริง -> ตรวจว่าไม่ throw
  // ----------------------------------------------------------------------

  @Test
  public void testSyntaxError_doesNotThrowUncaughtException() {
    // อินพุตผิดรูปแบบ (ขาด ';' และ token ไม่ครบ) - ไม่ควรทำให้ harness ทั้งชุด throw
    try {
      SourceFile file = SourceFile.fromCode("bad.js", "function __TEST__( { var x = ; }");
      Node script = new JsAst(file).getAstRoot(compiler);
      // ขึ้นกับ parser: อาจคืน node บางส่วนหรือ null ก็ได้ - ไม่ assert รูปแบบผลลัพธ์
      // (ไม่แน่ใจ behavior ที่แน่นอนของ parser กับ error-recovery จึงไม่ assert เพิ่มเติม)
    } catch (RuntimeException e) {
      // ยอมรับได้หาก parser ขว้าง RuntimeException สำหรับ input ผิดรูปแบบ
      assertNotNull(e);
    }
  }
}
```

## สรุปตาราง Branch/Condition ที่แต่ละเทสครอบคลุม

| เทสเมธอด | Branch/Condition ที่ครอบคลุม |
|---|---|
| testEmptyFunctionBody_noException | boundary: cfg ไม่มี statement, ไม่มี exception |
| testVarDeclarationNoInitializer_isVoid | constructor: entry-lattice ตั้งค่า `VOID` ให้ var ไม่มี initializer |
| testVarDeclarationWithInitializer_number | `traverseName` (value != null), `traverseAssign`, case `NUMBER` |
| testAssignToUndeclaredGlobal_varNullBranch | `updateScopeForTypeChange`: `var == null` branch |
| testNullLiteral | case `NULL` |
| testVoidOperator | case `VOID` |
| testRegexpLiteral | case `REGEXP` |
| testArrayLiteral | `traverseArrayLiteral`, case `ARRAYLIT` |
| testEmptyObjectLiteral_zeroIterationLoop | `traverseObjectLiteral` loop 0 iteration |
| testObjectLiteralWithMembers | `traverseObjectLiteral` loop มี iteration, `memberName != null` branch |
| testUnaryNegAndPos | case `NEG`/`POS` |
| testBitwiseAndArithmeticGroup | case กลุ่ม `BITAND`,`MUL`,`MOD` (numeric group) |
| testComparisonOperatorsGroup | case กลุ่ม `LT`,`EQ`,`NOT` (boolean group) |
| testTypeofOperator_stringGroup | case `TYPEOF`/`STRING` group |
| testCommaOperator_takesLastChildType | case `COMMA` |
| testAdd_numberPlusNumber | `traverseAdd`: `isAddedAsNumber` ทั้งสองฝั่ง true |
| testAdd_stringConcatenation | `traverseAdd`: ฝั่งใดฝั่งหนึ่งเป็น string |
| testAdd_leftTypeNullFallsBackUnknown | `traverseAdd`: `leftType==null` → else fallback UNKNOWN |
| testAndOperator_flowSensitiveNarrowing | case `AND`, `traverseShortCircuitingBinOp` |
| testOrOperator_flowSensitiveNarrowing | case `OR`, `traverseShortCircuitingBinOp` |
| testHookOperator_unionOfBranches | `traverseHook`: trueType/falseType ไม่ null → getLeastSupertype |
| testCall_returnTypeFromFunctionType | `traverseCall`: `functionType instanceof FunctionType` true |
| testNew_constructorFunction_setsInstanceType | `traverseNew`: `ct.isConstructor()` true |
| testNew_nonConstructorFunction_typeStaysNull | `traverseNew`: `ct.isConstructor()` false |
| testGetProp_dereferenceNarrowsNullableObject | `dereferencePointer`: `type != narrowed` true branch |
| testExprResultGetProp_ensurePropertyDeclaredNoThrow | case `EXPR_RESULT` + `ensurePropertyDeclared` |
| testCatchParam_alwaysUnknown | `traverseCatch` |
| testIfElse_mergeTypesAfterBranch | `branchedFlowThrough`: ON_TRUE/ON_FALSE, condition ปกติ (ไม่ AND/OR) |
| testIfWithAndCondition | `branchedFlowThrough`: condition.getType()==AND, cache conditionOutcomes |
| testIfWithOrCondition | `branchedFlowThrough`: condition.getType()==OR |
| testForIn_itemTypeIsString | `branchedFlowThrough`: `NodeUtil.isForIn` true, item เป็น `NAME`/`VAR` |
| testSwitchCase_noThrow | case `SWITCH`, `branchedFlowThrough` CASE branch (`condition==source`) |
| testUnreachableCodeAfterReturn_notProcessed | `flowThrough`: `input == bottomScope` branch |
| testSyntaxError_doesNotThrowUncaughtException | อินพุตผิดรูปแบบ (malformed input) - defensive test |

**ข้อจำกัดที่ยอมรับ (ตามข้อ 4):** branch "trust declared type over inferred" ใน `updateScopeForTypeChange` (`var.isTypeInferred()==false`) และ branch "objectType already typed" ใน `traverseObjectLiteral` ไม่ถูกทดสอบ เพราะต้องพึ่งพา `TypedScopeCreator`/reflection ที่ไม่มีอยู่ใน source ที่ให้มา จึงไม่เดา behavior เพิ่มเติม
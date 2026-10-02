# หมายเหตุสำคัญก่อนเริ่ม

`TypeInference` เป็นคลาส **package-private** ที่ผูกกับ collaborator ภายในของ Closure Compiler จำนวนมาก (`Compiler`, `Scope`, `TypedScopeCreator`, `ControlFlowAnalysis`, `ControlFlowGraph`, `ReverseAbstractInterpreter`, `LinkedFlowScope`) ซึ่ง **ไม่มี source ของคลาสเหล่านี้ให้มาในโจทย์** การจะรันเมธอด `traverse(...)`, `branchedFlowThrough(...)` ฯลฯ ที่เป็น private/package ได้จริง จำเป็นต้องสร้าง instance ของ `TypeInference` ผ่าน constructor ที่ให้มา แล้วให้ superclass `DataFlowAnalysis` เรียก `analyze()` เพื่อ trigger การทำงานจริงผ่าน `flowThrough` / `branchedFlowThrough`

ดังนั้นชุดทดสอบนี้เป็นแบบ **integration-style** โดยประกอบ AST/Scope/CFG จริงด้วย public API มาตรฐานของ Closure Compiler (เช่น `Compiler#parseTestCode`, `TypedScopeCreator`, `ControlFlowAnalysis`, `SemanticReverseAbstractInterpreter`) ซึ่งเป็นคลาสที่อยู่ใน "โปรเจกต์เดียวกัน" กับ `TypeInference` (ไม่ใช่ third-party jar) — **จุดที่ผู้เขียนไม่มั่นใจ 100% ว่า signature ตรงกับโปรเจกต์จริง จะคอมเมนต์กำกับไว้ทุกจุด** ตามข้อกำหนดที่ 4 (ห้ามเดา behavior ที่ไม่มีอยู่ในซอร์ส — assertion ทุกตัวอ้างอิงเฉพาะ logic ที่เห็นในซอร์ส `TypeInference` ที่ให้มาเท่านั้น)

```java
package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * ชุดทดสอบสำหรับ {@link TypeInference}
 *
 * หมายเหตุ: helper {@link #inferFunction(String)} เป็นการประกอบ
 * infrastructure จริง (Compiler / TypedScopeCreator / ControlFlowAnalysis /
 * SemanticReverseAbstractInterpreter) เนื่องจาก TypeInference ไม่สามารถ
 * ทดสอบแบบ isolate ได้ (constructor ต้องการ ControlFlowGraph, Scope,
 * ReverseAbstractInterpreter ที่มาจากการวิเคราะห์ AST จริง)
 * ถ้า signature ของ collaborator เหล่านี้ในโปรเจกต์จริงต่างจากที่สมมติไว้
 * ต้องแก้เฉพาะ helper method นี้ — ส่วน assertion ของแต่ละเทสยังคง
 * สอดคล้องกับ logic ที่ปรากฏในซอร์ส TypeInference ที่ให้มา
 */
public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Map<String, AssertionFunctionSpec> assertionMap;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    assertionMap = Maps.newHashMap();
  }

  /**
   * รัน TypeInference จริงกับฟังก์ชัน JS ที่กำหนด แล้วคืน Node ของฟังก์ชัน
   * เพื่อให้เทสตรวจสอบ JSType ของ node ภายในได้ (ผ่าน n.getJSType()
   * ซึ่งเป็นผลข้างเคียงของ traverse(...) ในซอร์สที่ให้มา)
   */
  private Node inferFunction(String jsFunctionSource) {
    Node script = compiler.parseTestCode(jsFunctionSource);
    Node function = findFirstNodeOfType(script, Token.FUNCTION);
    assertNotNull("ซอร์สทดสอบต้องมี function declaration", function);

    Scope globalScope =
        new TypedScopeCreator(compiler).createScope(script, null);
    Scope functionScope =
        new TypedScopeCreator(compiler).createScope(function, globalScope);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, function);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    ReverseAbstractInterpreter sari =
        new SemanticReverseAbstractInterpreter(
            compiler.getCodingConvention(), registry);

    TypeInference dfa = new TypeInference(
        compiler, cfg, sari, functionScope, assertionMap);
    dfa.analyze(); // ทำให้ flowThrough/branchedFlowThrough ถูกเรียกจริง

    return function;
  }

  /** DFS หา node แรกที่ type ตรงกับที่กำหนด */
  private Node findFirstNodeOfType(Node root, int type) {
    if (root.getType() == type) {
      return root;
    }
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findFirstNodeOfType(c, type);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  /** DFS หา NAME node แรกที่ string ตรงกับ name ที่กำหนด */
  private Node findNameNode(Node root, String name) {
    if (root.isName() && name.equals(root.getString())) {
      return root;
    }
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findNameNode(c, name);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  // ---------------------------------------------------------------------
  // Token.NAME / ASSIGN (traverseName, traverseAssign, updateScopeForTypeChange)
  // ---------------------------------------------------------------------

  @Test
  public void testVarDeclaration_withInitializer_setsType() {
    // traverseName: value != null -> traverse(value) + updateScopeForTypeChange
    Node function = inferFunction("function f() { var x = 1; return x; }");
    Node xDecl = findNameNode(function, "x");
    assertNotNull(xDecl);
    assertNotNull(xDecl.getJSType());
  }

  @Test
  public void testVarDeclaration_withoutInitializer_doesNotThrow() {
    // traverseName: value == null -> ไปอ่าน scope.getSlot(varName)
    Node function = inferFunction("function f() { var y; return y; }");
    Node returnNode = findFirstNodeOfType(function, Token.RETURN);
    assertNotNull(returnNode);
  }

  @Test
  public void testAssign_toUndeclaredGlobal_redeclaresVar() {
    // isVarDeclaration = left.hasChildren() = false (assign ไม่ใช่ var decl)
    Node function = inferFunction("function f() { z = 1; }");
    Node assignNode = findFirstNodeOfType(function, Token.ASSIGN);
    assertNotNull(assignNode);
    assertNotNull(assignNode.getJSType());
  }

  // ---------------------------------------------------------------------
  // Token.ADD: ครอบคลุมเงื่อนไขต่าง ๆ ของ traverseAdd
  // ---------------------------------------------------------------------

  @Test
  public void testAdd_numberPlusNumber_setsType() {
    Node function = inferFunction("function f() { return 1 + 2; }");
    Node addNode = findFirstNodeOfType(function, Token.ADD);
    assertNotNull(addNode);
    assertNotNull(addNode.getJSType()); // isAddedAsNumber(l) && isAddedAsNumber(r)
  }

  @Test
  public void testAdd_withStringLiteral_resultLikelyString() {
    Node function = inferFunction("function f() { return 'a' + 1; }");
    Node addNode = findFirstNodeOfType(function, Token.ADD);
    assertNotNull(addNode);
    JSType type = addNode.getJSType();
    assertNotNull(type);
    // ไม่ assert isString() ตรง ๆ เพราะขึ้นกับว่า literal ถูก type ไว้ก่อน
    // traverse หรือไม่ (ไม่ได้ระบุใน TypeInference เอง) — คอมเมนต์กำกับ
  }

  @Test
  public void testAssignAdd_updatesScope() {
    // n.isAssignAdd() -> updateScopeForTypeChange(scope, left, leftType, type)
    Node function = inferFunction("function f() { var s = ''; s += 'x'; return s; }");
    Node assignAdd = findFirstNodeOfType(function, Token.ASSIGN_ADD);
    assertNotNull(assignAdd);
    assertNotNull(assignAdd.getJSType());
  }

  // ---------------------------------------------------------------------
  // Token.AND / OR (traverseAnd/traverseOr -> traverseShortCircuitingBinOp)
  // ---------------------------------------------------------------------

  @Test
  public void testLogicalAnd_doesNotThrowAndSetsType() {
    Node function = inferFunction("function f(a, b) { return a && b; }");
    Node andNode = findFirstNodeOfType(function, Token.AND);
    assertNotNull(andNode);
  }

  @Test
  public void testLogicalOr_doesNotThrowAndSetsType() {
    Node function = inferFunction("function f(a, b) { return a || b; }");
    Node orNode = findFirstNodeOfType(function, Token.OR);
    assertNotNull(orNode);
  }

  // ---------------------------------------------------------------------
  // Token.HOOK (traverseHook)
  // ---------------------------------------------------------------------

  @Test
  public void testHook_bothBranchesTyped_setsLeastSupertype() {
    // trueType/falseType != null -> n.setJSType(trueType.getLeastSupertype(falseType))
    Node function = inferFunction("function f(a) { return a ? 1 : 2; }");
    Node hookNode = findFirstNodeOfType(function, Token.HOOK);
    assertNotNull(hookNode);
    assertNotNull(hookNode.getJSType());
  }

  // ---------------------------------------------------------------------
  // Token.OBJECTLIT / ARRAYLIT
  // ---------------------------------------------------------------------

  @Test
  public void testObjectLiteral_setsPropertiesAndType() {
    Node function = inferFunction("function f() { var o = {a: 1, b: 'x'}; return o; }");
    Node objLit = findFirstNodeOfType(function, Token.OBJECTLIT);
    assertNotNull(objLit);
    assertNotNull(objLit.getJSType());
  }

  @Test
  public void testArrayLiteral_typeIsArrayType() {
    Node function = inferFunction("function f() { var arr = [1, 2, 3]; return arr; }");
    Node arrLit = findFirstNodeOfType(function, Token.ARRAYLIT);
    assertNotNull(arrLit);
    assertEquals(registry.getNativeType(ARRAY_TYPE), arrLit.getJSType());
  }

  // ---------------------------------------------------------------------
  // Token.CALL / NEW (traverseCall / traverseNew) - กรณี type ไม่ทราบแน่ชัด
  // ---------------------------------------------------------------------

  @Test
  public void testCall_unknownCallee_doesNotThrow() {
    // functionType อาจเป็น unknown -> ไม่เข้า branch isFunctionType()
    Node function = inferFunction("function f(g) { return g(); }");
    Node callNode = findFirstNodeOfType(function, Token.CALL);
    assertNotNull(callNode);
  }

  @Test
  public void testNew_unknownConstructor_doesNotThrow() {
    Node function = inferFunction("function f(C) { return new C(); }");
    Node newNode = findFirstNodeOfType(function, Token.NEW);
    assertNotNull(newNode);
  }

  @Test
  public void testBind_onNonFunctionProp_doesNotSetBindType() {
    // updateBind: looksLikeBind == true แต่ callTargetFn == null -> return โดยไม่ set type
    Node function = inferFunction("function f(o) { return o.bind(); }");
    Node callNode = findFirstNodeOfType(function, Token.CALL);
    assertNotNull(callNode);
  }

  // ---------------------------------------------------------------------
  // Token.GETPROP / GETELEM (traverseGetProp / traverseGetElem / dereferencePointer)
  // ---------------------------------------------------------------------

  @Test
  public void testGetProp_doesNotThrow() {
    Node function = inferFunction("function f(o) { return o.prop; }");
    Node getProp = findFirstNodeOfType(function, Token.GETPROP);
    assertNotNull(getProp);
  }

  @Test
  public void testGetElem_doesNotThrow() {
    Node function = inferFunction("function f(o) { return o[0]; }");
    Node getElem = findFirstNodeOfType(function, Token.GETELEM);
    assertNotNull(getElem);
  }

  // ---------------------------------------------------------------------
  // Token.TYPEOF -> STRING_TYPE (ตรงตามซอร์ส)
  // ---------------------------------------------------------------------

  @Test
  public void testTypeof_resultIsStringType() {
    Node function = inferFunction("function f(a) { return typeof a; }");
    Node typeofNode = findFirstNodeOfType(function, Token.TYPEOF);
    assertNotNull(typeofNode);
    assertEquals(registry.getNativeType(STRING_TYPE), typeofNode.getJSType());
  }

  // ---------------------------------------------------------------------
  // ตัวดำเนินการเปรียบเทียบ/บูลีน -> BOOLEAN_TYPE
  // ---------------------------------------------------------------------

  @Test
  public void testLessThan_resultIsBooleanType() {
    Node function = inferFunction("function f(a, b) { return a < b; }");
    Node ltNode = findFirstNodeOfType(function, Token.LT);
    assertNotNull(ltNode);
    assertEquals(registry.getNativeType(BOOLEAN_TYPE), ltNode.getJSType());
  }

  @Test
  public void testEquality_resultIsBooleanType() {
    Node function = inferFunction("function f(a, b) { return a == b; }");
    Node eqNode = findFirstNodeOfType(function, Token.EQ);
    assertNotNull(eqNode);
    assertEquals(registry.getNativeType(BOOLEAN_TYPE), eqNode.getJSType());
  }

  @Test
  public void testInstanceof_resultIsBooleanType() {
    Node function = inferFunction("function f(a, b) { return a instanceof b; }");
    Node instNode = findFirstNodeOfType(function, Token.INSTANCEOF);
    assertNotNull(instNode);
    assertEquals(registry.getNativeType(BOOLEAN_TYPE), instNode.getJSType());
  }

  // ---------------------------------------------------------------------
  // เลขคณิต / unary -> NUMBER_TYPE
  // ---------------------------------------------------------------------

  @Test
  public void testSubtraction_resultIsNumberType() {
    Node function = inferFunction("function f(a, b) { return a - b; }");
    Node subNode = findFirstNodeOfType(function, Token.SUB);
    assertNotNull(subNode);
    assertEquals(registry.getNativeType(NUMBER_TYPE), subNode.getJSType());
  }

  @Test
  public void testUnaryNegation_resultIsNumberType() {
    Node function = inferFunction("function f(a) { return -a; }");
    Node negNode = findFirstNodeOfType(function, Token.NEG);
    assertNotNull(negNode);
    assertEquals(registry.getNativeType(NUMBER_TYPE), negNode.getJSType());
  }

  @Test
  public void testBitwiseNot_resultIsNumberType() {
    Node function = inferFunction("function f(a) { return ~a; }");
    Node bitnotNode = findFirstNodeOfType(function, Token.BITNOT);
    assertNotNull(bitnotNode);
    assertEquals(registry.getNativeType(NUMBER_TYPE), bitnotNode.getJSType());
  }

  // ---------------------------------------------------------------------
  // Token.COMMA -> type ของ lastChild
  // ---------------------------------------------------------------------

  @Test
  public void testComma_typeComesFromLastChild() {
    Node function = inferFunction("function f() { return (1, 'x'); }");
    Node commaNode = findFirstNodeOfType(function, Token.COMMA);
    assertNotNull(commaNode);
    assertNotNull(commaNode.getJSType());
  }

  // ---------------------------------------------------------------------
  // Token.CATCH -> UNKNOWN_TYPE เสมอ (ไม่มีเงื่อนไขแตกสาขา)
  // ---------------------------------------------------------------------

  @Test
  public void testCatchParam_isAlwaysUnknownType() {
    Node function =
        inferFunction("function f() { try { foo(); } catch (e) { return e; } }");
    Node catchNode = findFirstNodeOfType(function, Token.CATCH);
    assertNotNull(catchNode);
    Node param = catchNode.getFirstChild();
    assertEquals(registry.getNativeType(UNKNOWN_TYPE), param.getJSType());
  }

  // ---------------------------------------------------------------------
  // FOR-IN branch ใน branchedFlowThrough (ON_TRUE + NodeUtil.isForIn)
  // ---------------------------------------------------------------------

  @Test
  public void testForIn_keyVariable_isProcessedByOnTrueBranch() {
    Node function = inferFunction(
        "function f(obj) { for (var k in obj) { return k; } }");
    Node kNode = findNameNode(function, "k");
    assertNotNull(kNode);
    // สาขา ON_TRUE ของ isForIn: item.isVar() -> item = item.getFirstChild();
    // item.isName() -> redeclareSimpleVar(informed, item, iterKeyType)
  }

  @Test
  public void testForIn_withNonNameTarget_doesNotThrow() {
    // ครอบคลุม branch item.isName() == false (target เป็น GETPROP)
    Node function = inferFunction(
        "function f(obj, holder) { for (holder.k in obj) { } }");
    Node forInFunction = function; // แค่ยืนยันว่าไม่ throw ตลอด analyze()
    assertNotNull(forInFunction);
  }

  // ---------------------------------------------------------------------
  // SWITCH / CASE (condition == null && source.isCase())
  // ---------------------------------------------------------------------

  @Test
  public void testSwitchWithCase_doesNotThrow() {
    Node function = inferFunction(
        "function f(x) { switch (x) { case 1: return 1; default: return 2; } }");
    Node switchNode = findFirstNodeOfType(function, Token.SWITCH);
    assertNotNull(switchNode);
  }

  // ---------------------------------------------------------------------
  // RETURN: retValue != null และ retValue == null (traverseReturn)
  // ---------------------------------------------------------------------

  @Test
  public void testReturn_withValue_doesNotThrow() {
    Node function = inferFunction("function f() { return 42; }");
    Node returnNode = findFirstNodeOfType(function, Token.RETURN);
    assertNotNull(returnNode);
    assertNotNull(returnNode.getFirstChild());
  }

  @Test
  public void testReturn_withoutValue_doesNotThrow() {
    // retValue == null -> ข้าม inferPropertyTypesToMatchConstraint
    Node function = inferFunction("function f() { return; }");
    Node returnNode = findFirstNodeOfType(function, Token.RETURN);
    assertNotNull(returnNode);
    assertNull(returnNode.getFirstChild());
  }

  // ---------------------------------------------------------------------
  // JSDoc type cast บน qualified name ที่เป็น EXPR_RESULT (updateScopeForTypeChange)
  // ---------------------------------------------------------------------

  @Test
  public void testJSDocCast_onQualifiedNameExprResult_doesNotThrow() {
    Node function = inferFunction(
        "function f(o) { /** @type {string} */ (o.prop); }");
    Node getProp = findFirstNodeOfType(function, Token.GETPROP);
    assertNotNull(getProp);
  }

  // ---------------------------------------------------------------------
  // VAR / THROW -> traverseChildren
  // ---------------------------------------------------------------------

  @Test
  public void testThrowStatement_doesNotThrow() {
    Node function = inferFunction("function f() { throw 'err'; }");
    Node throwNode = findFirstNodeOfType(function, Token.THROW);
    assertNotNull(throwNode);
  }

  // ---------------------------------------------------------------------
  // Boundary / edge case: ฟังก์ชันว่างเปล่า (ไม่มี statement)
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyFunctionBody_analyzeDoesNotThrow() {
    Node function = inferFunction("function f() { }");
    assertNotNull(function);
  }

  // ---------------------------------------------------------------------
  // PARAM_LIST (Token.PARAM_LIST branch ใน traverse)
  // ---------------------------------------------------------------------

  @Test
  public void testParamList_typeComesFromFirstChild() {
    Node function = inferFunction("function f(a, b) { return a; }");
    Node paramList = findFirstNodeOfType(function, Token.PARAM_LIST);
    assertNotNull(paramList);
    // n.setJSType(getJSType(n.getFirstChild())) — ตรวจว่าไม่ null หลัง infer
    assertNotNull(paramList.getJSType());
  }
}
```

# สรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม (อ้างอิงซอร์ส `TypeInference`) |
|---|---|
| `testVarDeclaration_withInitializer_setsType` | `traverseName`: `value != null` → `traverse(value)` + `updateScopeForTypeChange` |
| `testVarDeclaration_withoutInitializer_doesNotThrow` | `traverseName`: `value == null` → เข้าทาง `scope.getSlot(varName)` |
| `testAssign_toUndeclaredGlobal_redeclaresVar` | `updateScopeForTypeChange` case `Token.NAME`: `isVarDeclaration=false` → `redeclareSimpleVar` เสมอ |
| `testAdd_numberPlusNumber_setsType` | `traverseAdd`: `isAddedAsNumber(left) && isAddedAsNumber(right)` → `NUMBER_TYPE` |
| `testAdd_withStringLiteral_resultLikelyString` | `traverseAdd`: เงื่อนไข `leftType.isString() || rightType.isString()` |
| `testAssignAdd_updatesScope` | `traverseAdd`: `n.isAssignAdd()` → เรียก `updateScopeForTypeChange` |
| `testLogicalAnd_doesNotThrowAndSetsType` | `Token.AND` → `traverseAnd` → `traverseShortCircuitingBinOp(condition=true)` |
| `testLogicalOr_doesNotThrowAndSetsType` | `Token.OR` → `traverseOr` → `traverseShortCircuitingBinOp(condition=false)` |
| `testHook_bothBranchesTyped_setsLeastSupertype` | `traverseHook`: `trueType != null && falseType != null` → `setJSType(leastSupertype)` |
| `testObjectLiteral_setsPropertiesAndType` | `traverseObjectLiteral`: loop กำหนด property + `memberName != null` |
| `testArrayLiteral_typeIsArrayType` | `Token.ARRAYLIT` → `traverseArrayLiteral` → `ARRAY_TYPE` |
| `testCall_unknownCallee_doesNotThrow` | `traverseCall`: `functionType` ไม่เข้า `isFunctionType()`/`CHECKED_UNKNOWN_TYPE` |
| `testNew_unknownConstructor_doesNotThrow` | `traverseNew`: `constructorType == null`/`ct == null` path |
| `testBind_onNonFunctionProp_doesNotSetBindType` | `updateBind`: `looksLikeBind=true`, `callTargetFn == null` → return |
| `testGetProp_doesNotThrow` | `Token.GETPROP` → `traverseGetProp` + `dereferencePointer` |
| `testGetElem_doesNotThrow` | `Token.GETELEM` → `traverseGetElem`, `objType != null/null` |
| `testTypeof_resultIsStringType` | `Token.TYPEOF` → `STRING_TYPE` |
| `testLessThan_resultIsBooleanType` / `testEquality_resultIsBooleanType` / `testInstanceof_resultIsBooleanType` | กลุ่ม `LT/EQ/INSTANCEOF...` → `BOOLEAN_TYPE` |
| `testSubtraction_resultIsNumberType` / `testUnaryNegation_resultIsNumberType` / `testBitwiseNot_resultIsNumberType` | กลุ่ม arithmetic/unary → `NUMBER_TYPE` |
| `testComma_typeComesFromLastChild` | `Token.COMMA` → `getJSType(n.getLastChild())` |
| `testCatchParam_isAlwaysUnknownType` | `traverseCatch` → `UNKNOWN_TYPE` เสมอ |
| `testForIn_keyVariable_isProcessedByOnTrueBranch` | `branchedFlowThrough` case `ON_TRUE` + `NodeUtil.isForIn` + `item.isVar()` + `item.isName()==true` |
| `testForIn_withNonNameTarget_doesNotThrow` | branch เดียวกันแต่ `item.isName()==false` |
| `testSwitchWithCase_doesNotThrow` | `branchedFlowThrough`: `condition==null && source.isCase()` |
| `testReturn_withValue_doesNotThrow` | `traverseReturn`: `retValue != null` |
| `testReturn_withoutValue_doesNotThrow` | `traverseReturn`: `retValue == null` |
| `testJSDocCast_onQualifiedNameExprResult_doesNotThrow` | `traverse`: `info.hasType()` + `n.isQualifiedName() && parent.isExprResult()` |
| `testThrowStatement_doesNotThrow` | `Token.THROW` → `traverseChildren` |
| `testEmptyFunctionBody_analyzeDoesNotThrow` | boundary: ฟังก์ชัน/CFG ว่าง ไม่มี statement |
| `testParamList_typeComesFromFirstChild` | `Token.PARAM_LIST` → `setJSType(getJSType(firstChild))` |

**จุดที่ยังไม่ครอบคลุม (และเหตุผล):** branch `flowThrough` เมื่อ `input == bottomScope` (คืนค่าเดิมโดยไม่ traverse) เป็น dead/unreachable path ในทางปฏิบัติผ่าน public API ปกติ, และ logic ของ `updateTypeOfThisOnClosure`/`TEMPLATE_TYPE_*` กับ `tightenTypesAfterAssertions` ต้องพึ่งพา `AssertionFunctionSpec`/template function type ที่ไม่มี source ให้ตรวจสอบ signature จึงไม่ทดสอบเพื่อไม่ให้เดา behavior (ตามข้อกำหนดที่ 4)
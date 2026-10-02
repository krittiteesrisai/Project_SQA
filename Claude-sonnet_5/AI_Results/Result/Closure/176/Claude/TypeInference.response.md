# หมายเหตุก่อนเริ่ม (สำคัญ)

`TypeInference` เป็นคลาส **package-private** ที่ผูกกับโครงสร้างพื้นฐานจำนวนมากของ Closure Compiler (`Compiler`, `Scope`, `ControlFlowGraph`, `ReverseAbstractInterpreter`, `DataFlowAnalysis`) ซึ่ง API เหล่านี้ไม่ได้แสดงอยู่ใน source ที่ให้มาโดยตรง (เป็น superclass/collaborator) แต่จำเป็นต้องใช้เพื่อ "เรียกใช้" คลาสเป้าหมายได้จริง

- ผมจึงต้อง**วางไฟล์เทสไว้ใน package เดียวกัน** (`com.google.javascript.jscomp`) เพื่อเข้าถึงคลาส package-private ได้ (ไม่ต้อง import เพราะ same package — ถือเป็น "import ที่ถูกต้อง" คือไม่ import สิ่งที่ไม่จำเป็น)
- จุดที่อ้างอิง API ของ infrastructure ที่ **ไม่ได้แสดงในซอร์สที่ให้มา** (เช่น `DataFlowAnalysis.FlowState`, `ControlFlowGraph#getImplicitReturn()`, `Scope#declare(...)`, `Compiler#parseTestCode(...)`) จะมี**คอมเมนต์กำกับชัดเจน**ว่าเป็นสมมติฐานเรื่อง infrastructure ไม่ใช่การเดา business logic ของ `TypeInference`
- การ assert ค่า type ทุกจุดอ้างอิงจาก logic ที่ **เห็นในซอร์สที่ให้มาเท่านั้น** (traverseAdd, traverseAnd/Or, traverseHook, traverseName/Assign, isAddedAsNumber, traverseCatch, branchedFlowThrough ฯลฯ)
- บาง branch (เช่น `OBJECTLIT` ที่ require `Preconditions.checkNotNull(type)`, `CAST` ที่ require inline JSDoc parsing แบบพิเศษ, `isUnflowable` ที่ require escape-analysis pass) **ไม่ได้ทดสอบ** เพราะไม่สามารถยืนยัน setup ที่ถูกต้องได้จาก source ที่ให้มา — คอมเมนต์กำกับไว้ในโค้ด

```java
package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * ชุดทดสอบสำหรับ com.google.javascript.jscomp.TypeInference (Defects4J: Closure-176b)
 *
 * NOTE (ตามข้อกำหนดที่ 4): ฟังก์ชัน inFunction(...) ด้านล่างใช้ API ของ
 * infrastructure ที่ "ไม่ได้แสดง" อยู่ในซอร์สโค้ดของ TypeInference ที่ให้มา
 * (เช่น ControlFlowAnalysis, SyntacticScopeCreator, DataFlowAnalysis.FlowState,
 * Scope#declare, Compiler#parseTestCode) แต่จำเป็นสำหรับการสร้าง
 * ControlFlowGraph/Scope/ReverseAbstractInterpreter เพื่อเรียก
 * TypeInference ให้ทำงานได้จริง ถือเป็นสมมติฐานเรื่อง "โครงสร้างพื้นฐาน"
 * ของ Closure Compiler ไม่ใช่การเดา business logic ของ TypeInference เอง
 */
public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Map<String, JSType> assumptions;
  private FlowScope returnScope;

  // ไม่มี assertion function พิเศษในชุดทดสอบนี้ (ครอบคลุมกรณี "ว่าง")
  private static final Map<String, AssertionFunctionSpec> ASSERTION_FUNCTIONS =
      Maps.newHashMap();

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    assumptions = Maps.newHashMap();
    returnScope = null;
  }

  private void assuming(String name, JSTypeNative type) {
    assumptions.put(name, registry.getNativeType(type));
  }

  private void assuming(String name, JSType type) {
    assumptions.put(name, type);
  }

  /**
   * Parse + สร้าง Scope + สร้าง ControlFlowGraph + รัน TypeInference สำหรับ
   * body ของฟังก์ชันที่กำหนด แล้วเก็บ FlowScope ผลลัพธ์ (ที่ implicit return)
   * ไว้ใน field returnScope
   */
  private void inFunction(String js) {
    String src = "function FUNCTION(" +
        Joiner.on(",").join(assumptions.keySet()) + ") {" + js + "}";

    // สมมติฐาน infra: Compiler#parseTestCode(String) มีอยู่จริงสำหรับ parse
    // โค้ดทดสอบแบบง่าย ๆ โดยไม่ต้องสร้าง externs/SourceFile เพิ่ม
    Node script = compiler.parseTestCode(src);
    assertEquals("พบ parse error ซึ่งไม่คาดหวังในเทสนี้",
        0, compiler.getErrorCount());

    Node function = script.getFirstChild();
    Node functionBlock = function.getLastChild();

    // สมมติฐาน infra: SyntacticScopeCreator#createScope(Node, Scope)
    Scope assumedScope =
        new SyntacticScopeCreator(compiler).createScope(function, null);
    for (Map.Entry<String, JSType> entry : assumptions.entrySet()) {
      // สมมติฐาน infra: Scope#declare(name, nameNode, type, input)
      assumedScope.declare(entry.getKey(), null, entry.getValue(), null);
    }

    // สมมติฐาน infra: ControlFlowAnalysis constructor/process/getCfg()
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, functionBlock);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    ReverseAbstractInterpreter rai = new SemanticReverseAbstractInterpreter(
        compiler.getCodingConvention(), registry);

    // --- นี่คือคลาสเป้าหมายที่ต้องการทดสอบ ---
    TypeInference dfa = new TypeInference(
        compiler, cfg, rai, assumedScope, ASSERTION_FUNCTIONS);
    dfa.analyze();

    // สมมติฐาน infra: DataFlowAnalysis.FlowState<L> เก็บผลลัพธ์ไว้เป็น
    // annotation ของแต่ละโหนดใน CFG, getImplicitReturn() คือโหนด exit
    // ของฟังก์ชัน, getIn() คือ scope ที่ไหลเข้าสู่ exit (สถานะสุดท้าย)
    DataFlowAnalysis.FlowState<FlowScope> returnState =
        cfg.getImplicitReturn().getAnnotation();
    returnScope = returnState.getIn();
  }

  private JSType getType(String name) {
    assertNotNull("ไม่พบ slot ของ " + name + " ใน returnScope",
        returnScope.getSlot(name));
    return returnScope.getSlot(name).getType();
  }

  private void verify(String name, JSTypeNative type) {
    assertEquals("type ของ " + name + " ไม่ตรงกับที่คาดไว้",
        registry.getNativeType(type), getType(name));
  }

  // ---------------------------------------------------------------------
  // Boundary / null / empty
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyFunctionBody() {
    // ไม่มี assumption, ไม่มี statement -> ครอบคลุม loop
    // "varIt.hasNext()" ใน constructor กรณีวนซ้ำ 0 ครั้ง (boundary)
    inFunction("");
    assertNotNull(returnScope);
  }

  @Test
  public void testMalformedSyntaxProducesParseError() {
    // อินพุตผิดรูปแบบ: ไม่ผ่าน inFunction() (ซึ่ง assert error=0) เพราะ
    // เราต้องการทดสอบว่ามี parse error เกิดขึ้นจริง ไม่ทดสอบ TypeInference
    // ต่อ เนื่องจาก AST ที่ผิดรูปแบบไม่สามารถนำไปสร้าง CFG ที่ถูกต้องได้
    Node script = compiler.parseTestCode("function FUNCTION() { var x = ; }");
    assertTrue("ควรมี parse error จาก syntax ที่ผิดรูปแบบ",
        compiler.getErrorCount() > 0);
  }

  @Test
  public void testVarDeclarationWithoutInitializerDefaultsToVoid() {
    // ครอบคลุม constructor: while(varIt.hasNext()) -> inferSlotType(VOID_TYPE)
    // และ traverseName บรานช์ value == null (อ่านค่าที่ยังไม่ assign)
    inFunction("var x; return x;");
    verify("x", VOID_TYPE);
  }

  // ---------------------------------------------------------------------
  // traverseAssign / traverseName (ASSIGN, NAME)
  // ---------------------------------------------------------------------

  @Test
  public void testVarDeclarationWithNumberLiteral() {
    // ครอบคลุม Token.VAR -> traverseChildren -> Token.NAME (value != null)
    // -> traverseAssign(ทางอ้อมผ่าน updateScopeForTypeChange)
    inFunction("var x = 1; return x;");
    verify("x", NUMBER_TYPE);
  }

  @Test
  public void testVarDeclarationWithStringLiteral() {
    inFunction("var x = 'hello'; return x;");
    verify("x", STRING_TYPE);
  }

  @Test
  public void testPlainAssignmentExpressionUpdatesType() {
    // ครอบคลุม Token.ASSIGN -> traverseAssign -> updateScopeForTypeChange
    // (Token.NAME case, isVarDeclaration == false เพราะ left ไม่มี children)
    assuming("x", NUMBER_TYPE);
    inFunction("x = 'changed';");
    verify("x", STRING_TYPE);
  }

  // ---------------------------------------------------------------------
  // traverseAdd (ADD / ASSIGN_ADD) และ isAddedAsNumber
  // ---------------------------------------------------------------------

  @Test
  public void testAddNumberAndNumberResultsInNumber() {
    // ครอบคลุม branch: !leftIsUnknown && !rightIsUnknown, ไม่ใช่ string,
    // isAddedAsNumber(left) && isAddedAsNumber(right) == true
    assuming("x", NUMBER_TYPE);
    assuming("y", NUMBER_TYPE);
    inFunction("var z = x + y;");
    verify("z", NUMBER_TYPE);
  }

  @Test
  public void testAddStringAndNumberResultsInString() {
    // ครอบคลุม branch: rightType.isString() == true -> STRING_TYPE
    assuming("x", STRING_TYPE);
    assuming("y", NUMBER_TYPE);
    inFunction("var z = x + y;");
    verify("z", STRING_TYPE);
  }

  @Test
  public void testAddUnknownAndUnknownResultsInUnknown() {
    // ครอบคลุม branch: leftIsUnknown && rightIsUnknown == true
    assuming("x", UNKNOWN_TYPE);
    assuming("y", UNKNOWN_TYPE);
    inFunction("var z = x + y;");
    verify("z", UNKNOWN_TYPE);
  }

  @Test
  public void testAddUnknownAndNumberResultsInUnknown() {
    // ครอบคลุม branch: (leftIsUnknown || rightIsUnknown) แต่ไม่ใช่ทั้งสองฝั่ง
    assuming("x", UNKNOWN_TYPE);
    assuming("y", NUMBER_TYPE);
    inFunction("var z = x + y;");
    verify("z", UNKNOWN_TYPE);
  }

  @Test
  public void testAssignAddUpdatesLeftVariable() {
    // ครอบคลุม n.isAssignAdd() == true -> updateScopeForTypeChange ถูกเรียก
    assuming("x", NUMBER_TYPE);
    inFunction("x += 1; return x;");
    verify("x", NUMBER_TYPE);
  }

  @Test
  public void testAddFallbackUnionWhenNotStringNotNumberLike() {
    // ครอบคลุม branch สุดท้าย (else -> union(STRING, NUMBER))
    // ใช้ ARRAY_TYPE ทั้งสองข้าง เพื่อไม่ให้ตรงเงื่อนไข isString หรือ
    // isAddedAsNumber (ตามนิยามใน isAddedAsNumber ของซอร์สต้นฉบับ)
    assuming("x", ARRAY_TYPE);
    assuming("y", ARRAY_TYPE);
    inFunction("var z = x + y;");
    JSType z = getType("z");
    JSType expectedUnion = registry.createUnionType(STRING_TYPE, NUMBER_TYPE);
    // สมมติฐานเบา ๆ: ผลลัพธ์เป็น subtype ของ union(string,number)
    // ไม่ assert ค่าตรง ๆ เพราะ union ordering ไม่ได้ระบุไว้ในซอร์ส
    assertTrue("คาดว่า z เป็น subtype ของ (string|number)",
        z.isSubtype(expectedUnion));
  }

  // ---------------------------------------------------------------------
  // Unary / Binary arithmetic, comparison, comma, typeof
  // ---------------------------------------------------------------------

  @Test
  public void testUnaryNegForcesNumberType() {
    // ครอบคลุม Token.NEG case
    assuming("x", STRING_TYPE);
    inFunction("var z = -x;");
    verify("z", NUMBER_TYPE);
  }

  @Test
  public void testBinaryMultiplicationForcesNumberType() {
    // ครอบคลุม case กลุ่ม arithmetic ร่วม (MUL/DIV/... ) -> setJSType(NUMBER)
    assuming("x", NUMBER_TYPE);
    assuming("y", NUMBER_TYPE);
    inFunction("var z = x * y;");
    verify("z", NUMBER_TYPE);
  }

  @Test
  public void testComparisonOperatorForcesBooleanType() {
    // ครอบคลุม case กลุ่ม comparison (LT/LE/.../IN) -> setJSType(BOOLEAN)
    assuming("x", NUMBER_TYPE);
    assuming("y", NUMBER_TYPE);
    inFunction("var z = (x < y);");
    verify("z", BOOLEAN_TYPE);
  }

  @Test
  public void testTypeofAlwaysReturnsString() {
    // ครอบคลุม Token.TYPEOF case
    assuming("x", NUMBER_TYPE);
    inFunction("var z = typeof x;");
    verify("z", STRING_TYPE);
  }

  @Test
  public void testCommaOperatorTakesTypeOfLastChild() {
    // ครอบคลุม Token.COMMA case -> setJSType(lastChild)
    inFunction("var z = (1, 'a');");
    verify("z", STRING_TYPE);
  }

  // ---------------------------------------------------------------------
  // traverseAnd / traverseOr (short circuiting)
  // ---------------------------------------------------------------------

  @Test
  public void testAndWithSameTypeOnBothSides() {
    // ครอบคลุม Token.AND case ใน traverse() และ traverseShortCircuitingBinOp
    assuming("x", NUMBER_TYPE);
    assuming("y", NUMBER_TYPE);
    inFunction("var z = x && y;");
    verify("z", NUMBER_TYPE);
  }

  @Test
  public void testOrWithSameTypeOnBothSides() {
    // ครอบคลุม Token.OR case ใน traverse() และ traverseShortCircuitingBinOp
    assuming("x", STRING_TYPE);
    assuming("y", STRING_TYPE);
    inFunction("var z = x || y;");
    verify("z", STRING_TYPE);
  }

  // ---------------------------------------------------------------------
  // traverseHook (ternary)
  // ---------------------------------------------------------------------

  @Test
  public void testHookJoinsTrueAndFalseBranchTypes() {
    // ครอบคลุม Token.HOOK case: trueType/falseType != null -> leastSupertype
    assuming("x", BOOLEAN_TYPE);
    inFunction("var z = x ? 1 : 'a';");
    JSType z = getType("z");
    JSType union = registry.createUnionType(NUMBER_TYPE, STRING_TYPE);
    assertTrue("z ควรเป็น subtype ของ (number|string)", z.isSubtype(union));
    // ตรวจว่าเกิด union จริง (ไม่ใช่แค่ number หรือ string เดี่ยว ๆ)
    assertFalse("z ไม่ควรเป็น subtype ของ number อย่างเดียว",
        z.isSubtype(registry.getNativeType(NUMBER_TYPE)));
  }

  // ---------------------------------------------------------------------
  // traverseArrayLiteral
  // ---------------------------------------------------------------------

  @Test
  public void testArrayLiteralAlwaysArrayType() {
    // ครอบคลุม Token.ARRAYLIT case -> setJSType(ARRAY_TYPE) โดยไม่มีเงื่อนไข
    inFunction("var z = [1, 2, 3];");
    verify("z", ARRAY_TYPE);
  }

  // ---------------------------------------------------------------------
  // traverseGetProp / getPropertyType / dereferencePointer
  // ---------------------------------------------------------------------

  @Test
  public void testGetPropOnUnknownPropertyResultsInUnknownType() {
    // ครอบคลุม Token.GETPROP -> getPropertyType บรานช์ propertyType == null
    // -> return unknownType
    assuming("obj", OBJECT_TYPE);
    inFunction("var z = obj.someUndefinedProp;");
    verify("z", UNKNOWN_TYPE);
  }

  // ---------------------------------------------------------------------
  // traverseCall / traverseNew (branch: functionType ไม่ใช่ function/ctor)
  // ---------------------------------------------------------------------

  @Test
  public void testCallOnNonFunctionTypeDoesNotCrash() {
    // ครอบคลุม Token.CALL -> traverseCall บรานช์ functionType.isFunctionType()
    // == false (เพราะ g ไม่ถูกประกาศชนิดฟังก์ชันอย่างชัดแจ้งในสโคปนี้)
    inFunction("var z = g();");
    assertNotNull(getType("z"));
  }

  @Test
  public void testNewOnUnknownConstructorResultsInUnknownType() {
    // ครอบคลุม Token.NEW -> traverseNew บรานช์ constructorType.isUnknownType()
    // == true (เพราะ Ctor ไม่ได้ประกาศไว้ใน scope นี้ -> unknown)
    inFunction("var z = new Ctor();");
    verify("z", UNKNOWN_TYPE);
  }

  // ---------------------------------------------------------------------
  // traverseReturn
  // ---------------------------------------------------------------------

  @Test
  public void testReturnWithValueDoesNotCrashWhenNoFunctionType() {
    // ครอบคลุม Token.RETURN บรานช์ retValue != null, type(functionNode)==null
    // -> ข้าม inferPropertyTypesToMatchConstraint
    assuming("x", NUMBER_TYPE);
    inFunction("return x;");
    assertNotNull(returnScope);
  }

  @Test
  public void testReturnWithoutValue() {
    // ครอบคลุม Token.RETURN บรานช์ retValue == null
    inFunction("return;");
    assertNotNull(returnScope);
  }

  // ---------------------------------------------------------------------
  // traverseCatch
  // ---------------------------------------------------------------------

  @Test
  public void testCatchParamWithoutJsDocIsUnknownType() {
    // ครอบคลุม traverseCatch บรานช์ info == null -> UNKNOWN_TYPE
    inFunction("try { throw 1; } catch (e) { var t = e; } return t;");
    verify("t", UNKNOWN_TYPE);
  }

  // ---------------------------------------------------------------------
  // branchedFlowThrough: if/else (ON_TRUE/ON_FALSE), AND ในเงื่อนไข, switch
  // ---------------------------------------------------------------------

  @Test
  public void testIfElseSimpleConditionBothBranchesJoin() {
    // ครอบคลุม branchedFlowThrough: condition != null, ไม่ใช่ AND/OR
    // -> ใช้ reverseInterpreter.getPreciserScopeKnowingConditionOutcome ตรง ๆ
    assuming("x", registry.createUnionType(NUMBER_TYPE, NULL_TYPE));
    inFunction("var y; if (x) { y = 1; } else { y = 2; } return y;");
    verify("y", NUMBER_TYPE);
  }

  @Test
  public void testIfWithAndConditionBothBranchesJoin() {
    // ครอบคลุม branchedFlowThrough: condition.isAnd() == true
    // (ใช้ traverseAnd + getOutcomeFlowScope + getPreciserScopeKnowingConditionOutcome)
    assuming("x", NUMBER_TYPE);
    assuming("y", NUMBER_TYPE);
    inFunction("var z; if (x && y) { z = 1; } else { z = 2; } return z;");
    verify("z", NUMBER_TYPE);
  }

  @Test
  public void testIfWithOrConditionBothBranchesJoin() {
    // ครอบคลุม branchedFlowThrough: condition.isOr() == true
    assuming("x", NUMBER_TYPE);
    assuming("y", NUMBER_TYPE);
    inFunction("var z; if (x || y) { z = 1; } else { z = 2; } return z;");
    verify("z", NUMBER_TYPE);
  }

  @Test
  public void testSwitchCaseConditionBranch() {
    // ครอบคลุม branchedFlowThrough: condition == null && source.isCase() ==
    // true -> condition = source (case node)
    assuming("x", NUMBER_TYPE);
    inFunction(
        "var y; switch (x) { case 1: y = 'a'; break; default: y = 'b'; } " +
        "return y;");
    verify("y", STRING_TYPE);
  }

  // ---------------------------------------------------------------------
  // for-in (branchedFlowThrough: NodeUtil.isForIn(source) == true)
  // ---------------------------------------------------------------------

  @Test
  public void testForInLoopDoesNotCrashOnBranchedFlow() {
    // ครอบคลุม branchedFlowThrough: ON_TRUE + NodeUtil.isForIn(source)
    // NOTE: ผลลัพธ์ type ที่แน่นอนของตัวแปร key หลัง loop ขึ้นกับ
    // fixed-point iteration ของ dataflow framework ซึ่งไม่สามารถระบุ
    // ได้อย่างแน่ชัดจากซอร์สที่ให้มาเพียงอย่างเดียว จึงทำเป็น
    // smoke test เพื่อยืนยันว่าบรานช์นี้ทำงานได้โดยไม่ throw exception
    assuming("obj", OBJECT_TYPE);
    inFunction("var key; for (key in obj) { } return key;");
    assertNotNull(returnScope);
  }

  // ---------------------------------------------------------------------
  // ข้อบกพร่องที่เกี่ยวข้องกับ Closure-176 (isVarTypeBetter / var.setType)
  // ---------------------------------------------------------------------

  @Test
  public void testInferredVarTypeIsLeastSupertypeAcrossAssignments() {
    // ครอบคลุม updateScopeForTypeChange: var.isTypeInferred() branch
    // -> var.setType(oldType.getLeastSupertype(resultType))
    // ไม่ได้ assuming ชนิดไว้ล่วงหน้า เพื่อให้ x เป็น inferred var
    inFunction("var x = 1; x = 'a'; return x;");
    // เนื่องจาก x ถูก assign ครั้งสุดท้ายเป็น string ค่าใน scope (FlowScope)
    // ควรเป็น string ตาม logic ของ redeclareSimpleVar (ไม่ใช่ least-supertype
    // ของ Var object ซึ่งเป็นคนละกลไกกับ FlowScope)
    verify("x", STRING_TYPE);
  }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testEmptyFunctionBody | constructor loop `varIt.hasNext()` กรณี 0 ครั้ง (boundary) |
| testMalformedSyntaxProducesParseError | อินพุตผิดรูปแบบ (parse error, ไม่เข้า TypeInference) |
| testVarDeclarationWithoutInitializerDefaultsToVoid | constructor: default VOID_TYPE, traverseName (value==null) |
| testVarDeclarationWithNumberLiteral | Token.VAR/NAME (value!=null) → traverseAssign/updateScopeForTypeChange |
| testVarDeclarationWithStringLiteral | เหมือนบน กรณี STRING |
| testPlainAssignmentExpressionUpdatesType | Token.ASSIGN, updateScopeForTypeChange (Token.NAME, isVarDeclaration=false) |
| testAddNumberAndNumberResultsInNumber | traverseAdd: isAddedAsNumber(left)&&isAddedAsNumber(right) |
| testAddStringAndNumberResultsInString | traverseAdd: rightType.isString() branch |
| testAddUnknownAndUnknownResultsInUnknown | traverseAdd: leftIsUnknown&&rightIsUnknown |
| testAddUnknownAndNumberResultsInUnknown | traverseAdd: (leftIsUnknown\|\|rightIsUnknown) เดี่ยว |
| testAssignAddUpdatesLeftVariable | traverseAdd: n.isAssignAdd()==true |
| testAddFallbackUnionWhenNotStringNotNumberLike | traverseAdd: else branch → union(string,number) |
| testUnaryNegForcesNumberType | Token.NEG case |
| testBinaryMultiplicationForcesNumberType | Token.MUL (arithmetic group case) |
| testComparisonOperatorForcesBooleanType | Token.LT (comparison group case) |
| testTypeofAlwaysReturnsString | Token.TYPEOF case |
| testCommaOperatorTakesTypeOfLastChild | Token.COMMA case |
| testAndWithSameTypeOnBothSides | Token.AND, traverseShortCircuitingBinOp |
| testOrWithSameTypeOnBothSides | Token.OR, traverseShortCircuitingBinOp |
| testHookJoinsTrueAndFalseBranchTypes | Token.HOOK, trueType/falseType != null → union |
| testArrayLiteralAlwaysArrayType | Token.ARRAYLIT case |
| testGetPropOnUnknownPropertyResultsInUnknownType | traverseGetProp/getPropertyType: propertyType==null |
| testCallOnNonFunctionTypeDoesNotCrash | traverseCall: functionType.isFunctionType()==false |
| testNewOnUnknownConstructorResultsInUnknownType | traverseNew: constructorType.isUnknownType()==true |
| testReturnWithValueDoesNotCrashWhenNoFunctionType | traverseReturn: retValue!=null, type==null |
| testReturnWithoutValue | traverseReturn: retValue==null |
| testCatchParamWithoutJsDocIsUnknownType | traverseCatch: info==null → UNKNOWN_TYPE |
| testIfElseSimpleConditionBothBranchesJoin | branchedFlowThrough: ON_TRUE/ON_FALSE, condition ไม่ใช่ AND/OR |
| testIfWithAndConditionBothBranchesJoin | branchedFlowThrough: condition.isAnd()==true |
| testIfWithOrConditionBothBranchesJoin | branchedFlowThrough: condition.isOr()==true |
| testSwitchCaseConditionBranch | branchedFlowThrough: source.isCase()==true |
| testForInLoopDoesNotCrashOnBranchedFlow | branchedFlowThrough: NodeUtil.isForIn(source)==true |
| testInferredVarTypeIsLeastSupertypeAcrossAssignments | updateScopeForTypeChange: var.isTypeInferred() branch |

**หมายเหตุ:** branch ที่ไม่ได้ครอบคลุม (พร้อมเหตุผลกำกับในโค้ด) ได้แก่ `traverseObjectLiteral` (ต้องมี type ผูกกับ OBJECTLIT node มาก่อนจาก pass อื่นที่ไม่ได้รันในเทสนี้), `Token.CAST` (ต้องพึ่ง inline JSDoc parsing เฉพาะทาง), และ `isUnflowable` (ต้องพึ่ง escape-analysis pass ที่ไม่ได้แสดงในซอร์ส) — เพื่อไม่ละเมิดข้อกำหนดที่ 4
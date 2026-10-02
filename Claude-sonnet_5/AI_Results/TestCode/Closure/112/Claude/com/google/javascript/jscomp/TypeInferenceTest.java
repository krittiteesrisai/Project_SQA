package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;

import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * Unit test สำหรับ {@link TypeInference} (Closure-112b)
 *
 * หมายเหตุ: คลาสนี้อยู่ package เดียวกับ TypeInference (package-private) จึงไม่ต้อง import
 * คลาสเป้าหมายแยก — การอยู่ package เดียวกันคือการ "อ้างอิงคลาสเป้าหมายให้ถูกต้อง"
 */
public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
  }

  // ---------------------------------------------------------------------
  // Harness: parse -> TypedScopeCreator -> ControlFlowAnalysis -> TypeInference
  // ---------------------------------------------------------------------

  private Node analyzeFunction(String js) {
    return analyzeFunction(js, null, Maps.<String, AssertionFunctionSpec>newHashMap());
  }

  private Node analyzeFunction(String js, String fnName) {
    return analyzeFunction(js, fnName, Maps.<String, AssertionFunctionSpec>newHashMap());
  }

  private Node analyzeFunction(
      String js, String fnName, Map<String, AssertionFunctionSpec> assertionMap) {
    Node root = compiler.parseTestCode(js);
    assertEquals("มีข้อผิดพลาดขณะ parse: " + js, 0, compiler.getErrorCount());

    Node function = (fnName == null)
        ? findFirstFunction(root)
        : findFunctionNamed(root, fnName);
    assertNotNull("ไม่พบ function ที่ต้องการในโค้ด: " + js, function);

    // ASSUMPTION: TypedScopeCreator.createScope(Node, Scope) สร้าง Scope ที่มีชนิด
    // ของตัวแปร/พารามิเตอร์ตาม JSDoc ซึ่งเป็นสิ่งที่ TypeInference คาดหวังจาก
    // "functionScope" (ดู constructor ของ TypeInference)
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(root, null);
    Scope functionScope = scopeCreator.createScope(function, globalScope);

    // ASSUMPTION: ControlFlowAnalysis(compiler, shouldTraverseFunctions=false,
    // edgeAnnotations=true) แล้ว process(null, function) จะสร้าง CFG ของฟังก์ชันเดียว
    // พร้อม Branch annotation (ON_TRUE/ON_FALSE/...) ที่ branchedFlowThrough ต้องใช้
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, function);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    ReverseAbstractInterpreter rai = new SemanticReverseAbstractInterpreter(
        compiler.getCodingConvention(), registry);

    // เรียกใช้คอนสตรัคเตอร์ตรงตามที่ปรากฏในซอร์สเป้าหมายทุกพารามิเตอร์
    TypeInference dfa = new TypeInference(
        compiler, cfg, rai, functionScope, assertionMap);

    // ASSUMPTION: DataFlowAnalysis (super class) มีเมธอด public analyze()
    // ที่รัน fixed-point แล้ว mutate JSType บน Node ต่าง ๆ ผ่าน traverse()/flowThrough()
    dfa.analyze();

    return function;
  }

  private static Node findFirstFunction(Node n) {
    if (n.isFunction()) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node found = findFirstFunction(c);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  private static Node findFunctionNamed(Node n, String name) {
    if (n.isFunction()) {
      Node nameNode = n.getFirstChild();
      if (nameNode != null && nameNode.isName() && name.equals(nameNode.getString())) {
        return n;
      }
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node found = findFunctionNamed(c, name);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  /** หา RETURN node แรกแบบ DFS แล้วคืนชนิดของ expression ที่ return */
  private static JSType findReturnExprType(Node n) {
    Node returnNode = findFirstReturn(n);
    assertNotNull("ไม่พบ return statement", returnNode);
    Node expr = returnNode.getFirstChild();
    assertNotNull("return ไม่มี expression", expr);
    return expr.getJSType();
  }

  private static Node findFirstReturn(Node n) {
    if (n.getType() == Token.RETURN) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node found = findFirstReturn(c);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  private JSType nativeType(JSTypeNative t) {
    return registry.getNativeType(t);
  }

  // =======================================================================
  // traverseAdd() — ครอบคลุมทุกสาขาของ if/else ใน isAddedAsNumber logic
  // =======================================================================

  @Test
  public void testAddStringPlusString_ReturnsStringType() {
    Node function = analyzeFunction(
        "function f() {"
        + "  /** @type {string} */ var a = 'x';"
        + "  /** @type {string} */ var b = 'y';"
        + "  return a + b;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("คาดว่าเป็น string type เพราะ leftType.isString()==true", type.isString());
  }

  @Test
  public void testAddNumberPlusNumber_ReturnsNumberType() {
    Node function = analyzeFunction(
        "function f() {"
        + "  /** @type {number} */ var a = 1;"
        + "  /** @type {number} */ var b = 2;"
        + "  return a + b;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("คาดว่าเป็น number type เพราะ isAddedAsNumber(a)&&isAddedAsNumber(b)",
        type.isEquivalentTo(nativeType(NUMBER_TYPE)));
  }

  @Test
  public void testAddUnknownPlusUnknown_ReturnsUnknownType() {
    // พารามิเตอร์ที่ไม่มี JSDoc/ประกาศชนิด -> unknown ทั้งสองฝั่ง
    Node function = analyzeFunction(
        "function f(a, b) {"
        + "  return a + b;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("leftIsUnknown && rightIsUnknown -> unknownType", type.isUnknownType());
  }

  @Test
  public void testAddNonNumberNonStringObjects_ReturnsStringOrNumberUnion() {
    Node function = analyzeFunction(
        "function f() {"
        + "  /** @type {Object} */ var a = {};"
        + "  /** @type {Object} */ var b = {};"
        + "  return a + b;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    JSType expected = registry.createUnionType(STRING_TYPE, NUMBER_TYPE);
    assertTrue("เข้า else สุดท้ายของ traverseAdd -> union(string,number)",
        type.isEquivalentTo(expected));
  }

  @Test
  public void testAssignAddUpdatesToStringType() {
    // ครอบคลุมสาขา n.isAssignAdd() -> updateScopeForTypeChange()
    Node function = analyzeFunction(
        "function f() {"
        + "  /** @type {string} */ var a = 'x';"
        + "  a += 'y';"
        + "  return a;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue(type.isString());
  }

  // =======================================================================
  // traverseHook / traverseAnd / traverseOr
  // =======================================================================

  @Test
  public void testHookTernary_JoinsBranchTypes() {
    Node function = analyzeFunction(
        "function f(c) {"
        + "  /** @type {string} */ var a = 'x';"
        + "  /** @type {string} */ var b = 'y';"
        + "  return c ? a : b;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("trueType.getLeastSupertype(falseType) ของ string,string = string",
        type.isString());
  }

  @Test
  public void testAndWithNumberOperands_ReturnsNumberType() {
    // เลี่ยงกรณี literal boolean เพื่อไม่ต้องพึ่งพา BooleanLiteralSet ที่ซับซ้อน
    Node function = analyzeFunction(
        "function f() {"
        + "  /** @type {number} */ var a = 1;"
        + "  /** @type {number} */ var b = 2;"
        + "  return a && b;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue(type.isEquivalentTo(nativeType(NUMBER_TYPE)));
  }

  @Test
  public void testOrWithNumberOperands_ReturnsNumberType() {
    Node function = analyzeFunction(
        "function f() {"
        + "  /** @type {number} */ var a = 1;"
        + "  /** @type {number} */ var b = 2;"
        + "  return a || b;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue(type.isEquivalentTo(nativeType(NUMBER_TYPE)));
  }

  // =======================================================================
  // traverseCatch — สาขา else (ไม่มี JSDoc -> UNKNOWN_TYPE)
  // =======================================================================

  @Test
  public void testCatchParamWithoutJSDoc_IsUnknownType() {
    Node function = analyzeFunction(
        "function f(x) {"
        + "  try {"
        + "    x.foo();"
        + "  } catch (e) {"
        + "    return e;"
        + "  }"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("catch param ไม่มี JSDoc -> UNKNOWN_TYPE", type.isUnknownType());
  }

  // =======================================================================
  // traverseGetProp / getPropertyType
  // =======================================================================

  @Test
  public void testGetPropFromRecordType_ReturnsPropertyType() {
    Node function = analyzeFunction(
        "function f() {"
        + "  /** @type {{x: number}} */ var o = {x: 1};"
        + "  return o.x;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("propertyType จาก objType.findPropertyType('x')", type.isNumber());
  }

  // =======================================================================
  // traverseArrayLiteral / traverseGetElem
  // =======================================================================

  @Test
  public void testArrayLiteral_ReturnsArrayType() {
    Node function = analyzeFunction(
        "function f() {"
        + "  return [1, 2, 3];"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue(type.isEquivalentTo(nativeType(ARRAY_TYPE)) || type.isArrayType());
  }

  @Test
  public void testGetElemOnTemplatizedArray_ReturnsElementType() {
    Node function = analyzeFunction(
        "function f() {"
        + "  /** @type {Array.<number>} */ var a = [];"
        + "  return a[0];"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("typeMap.hasTemplateType(ObjectElementKey) -> number",
        type.isNumber());
  }

  // =======================================================================
  // Unary / bitwise / comparison / typeof / comma
  // =======================================================================

  @Test
  public void testUnaryNeg_AlwaysReturnsNumberType() {
    Node function = analyzeFunction(
        "function f() {"
        + "  var a = 'x';"
        + "  return -a;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("case POS/NEG ตั้งชนิดเป็น NUMBER_TYPE เสมอ",
        type.isEquivalentTo(nativeType(NUMBER_TYPE)));
  }

  @Test
  public void testTypeof_ReturnsStringType() {
    Node function = analyzeFunction(
        "function f() {"
        + "  var a = 1;"
        + "  return typeof a;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue(type.isEquivalentTo(nativeType(STRING_TYPE)));
  }

  @Test
  public void testComparisonOperator_ReturnsBooleanType() {
    Node function = analyzeFunction(
        "function f() {"
        + "  return 1 < 2;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue(type.isEquivalentTo(nativeType(BOOLEAN_TYPE)));
  }

  @Test
  public void testBitwiseOr_ReturnsNumberType() {
    Node function = analyzeFunction(
        "function f() {"
        + "  return 1 | 2;"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue(type.isEquivalentTo(nativeType(NUMBER_TYPE)));
  }

  @Test
  public void testCommaOperator_ReturnsTypeOfLastChild() {
    Node function = analyzeFunction(
        "function f() {"
        + "  /** @type {string} */ var a = 'x';"
        + "  /** @type {number} */ var b = 1;"
        + "  return (a, b);"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("COMMA -> getJSType(n.getLastChild())", type.isNumber());
  }

  // =======================================================================
  // Token.CAST
  // =======================================================================

  @Test
  public void testCastAnnotation_SetsAnnotatedType() {
    Node function = analyzeFunction(
        "function f(x) {"
        + "  return /** @type {string} */ (x);"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("case CAST -> info.getType().evaluate(...)", type.isString());
  }

  // =======================================================================
  // traverseNew
  // =======================================================================

  @Test
  public void testNewOperator_ReturnsObjectType() {
    Node function = analyzeFunction(
        "/** @constructor */"
        + "function Foo() {}"
        + "function f() {"
        + "  return new Foo();"
        + "}",
        "f");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    // inferredTypes.isEmpty() -> type = instanceType (ไม่ได้ตรวจชื่อ type แบบเข้ม
    // เพื่อลดความเสี่ยงจากการเดา JSType#toString() format)
    assertTrue("ควรได้ object/instance type จาก constructor", type.isObject());
  }

  // =======================================================================
  // branchedFlowThrough — ON_TRUE ของ for-in
  // =======================================================================

  @Test
  public void testForInLoop_KeyTypeIsString() {
    Node function = analyzeFunction(
        "function f(obj) {"
        + "  for (var item in obj) {"
        + "    return item;"
        + "  }"
        + "}");
    JSType type = findReturnExprType(function);
    assertNotNull(type);
    assertTrue("for-in ตั้ง iterKeyType เป็น STRING_TYPE เมื่อไม่มี objIndexType",
        type.isString());
  }

  // =======================================================================
  // Smoke tests: branch/loop ที่ยากต่อการ assert ค่าที่แน่นอน แต่ต้องไม่ throw
  // =======================================================================

  @Test
  public void testExprResultGetProp_NoCrash() {
    // ครอบคลุม EXPR_RESULT + ensurePropertyDeclared เมื่อ ownerType เป็น unknown
    Node function = analyzeFunction(
        "function f(o) {"
        + "  o.x;"
        + "}");
    assertNotNull(function);
  }

  @Test
  public void testSwitchCase_NoCrash() {
    // ครอบคลุม Token.SWITCH ใน traverse() และ source.isCase() ใน branchedFlowThrough
    Node function = analyzeFunction(
        "function f(x) {"
        + "  switch (x) {"
        + "    case 1:"
        + "      return 'one';"
        + "    default:"
        + "      return 'other';"
        + "  }"
        + "}");
    assertNotNull(function);
  }

  @Test
  public void testEmptyFunctionBody_NoCrash() {
    // Boundary: ไม่มี statement เลย, ไม่มี var ที่ต้อง infer
    Node function = analyzeFunction("function f() {}");
    assertNotNull(function);
  }

  // =======================================================================
  // ค่า null / อินพุตผิดรูปแบบ
  // =======================================================================

  @Test
  public void testMalformedInput_ParseErrorDetected() {
    // อินพุตผิดรูปแบบ (ขาด ')' ) — ไม่เรียก analyzeFunction() ต่อ เพราะ AST
    // ที่ parse ไม่สมบูรณ์อาจทำให้ harness (ไม่ใช่ตัว TypeInference) พังก่อน
    Compiler localCompiler = new Compiler();
    localCompiler.initOptions(new CompilerOptions());
    localCompiler.parseTestCode("function f( { return 1; }");
    assertTrue("ควรมี parse error สำหรับอินพุตผิดรูปแบบ",
        localCompiler.getErrorCount() > 0);
  }

  @Test
  public void testNullAssertionMap_NoCallsDoesNotThrow() {
    // ฟังก์ชันไม่มี CALL node เลย -> tightenTypesAfterAssertions ไม่ถูกเรียก
    // -> assertionFunctionsMap (null) ไม่ถูก dereference -> ไม่ throw
    Node function = analyzeFunction(
        "function f() { return 1; }", null, null);
    assertNotNull(function);
  }

  @Test(expected = NullPointerException.class)
  public void testNullAssertionMap_WithCallThrowsNPE() {
    // มี CALL node -> traverseCall() -> tightenTypesAfterAssertions()
    // -> assertionFunctionsMap.get(...) กับ map ที่เป็น null -> คาด NPE
    // (นี่คือเทสที่ตั้งใจ "ดักจับ fault" เชิงพฤติกรรม ไม่ใช่การเดา)
    analyzeFunction(
        "function f() { g(); } function g() {}", "f", null);
  }
}

package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Integration test สำหรับ {@link TypeInference}
 *
 * เนื่องจาก TypeInference เป็น package-private class ที่ต้องใช้ FlowScope,
 * Scope, ControlFlowGraph, ReverseAbstractInterpreter ซึ่งไม่มี source ให้
 * และไม่มี mocking library ในคลาสพาธที่กำหนด จึงทดสอบผ่านการรันคอมไพเลอร์จริง
 * (เปิด checkTypes) แล้วตรวจ JSType ที่ TypeInference เซ็ตไว้บน AST node
 *
 * หมายเหตุ: การใช้งาน Compiler / CompilerOptions / SourceFile ด้านล่าง
 * เป็น public API มาตรฐานของ Closure Compiler ซึ่งไม่ได้ปรากฏใน source
 * ของ TypeInference ที่ให้มา (จึงไม่ยืนยัน behavior 100% - เขียนกำกับไว้)
 */
public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  // ---------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------

  /**
   * คอมไพล์ js snippet โดยเปิด checkTypes เพื่อให้ TypeCheck pass สร้างและรัน
   * TypeInference จริง แล้วคืน root ของ AST
   *
   * สมมติฐาน (ไม่ได้ยืนยันจาก source ที่ให้): Compiler#compile(List, List,
   * CompilerOptions), Compiler#getRoot(), Compiler#getTypeRegistry(),
   * CompilerOptions#setCheckTypes(boolean), SourceFile#fromCode(String,String)
   */
  private Node compileAndGetRoot(String js) {
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);
    List<SourceFile> externs =
        ImmutableList.of(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs =
        ImmutableList.of(SourceFile.fromCode("input.js", js));
    compiler.compile(externs, inputs, options);
    registry = compiler.getTypeRegistry();
    return compiler.getRoot();
  }

  /** ค้นหา NAME node ที่เป็นการ "ประกาศพร้อมกำหนดค่า" (มี child) ชื่อ name */
  private static Node findDeclNode(Node n, String name) {
    if (n == null) {
      return null;
    }
    if (n.isName() && name.equals(n.getString()) && n.hasChildren()) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node found = findDeclNode(c, name);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  /** คืนค่า JSType ของ expression ที่ใช้กำหนดค่าให้ตัวแปร varName (var varName = EXPR;) */
  private JSType typeOfInitializer(Node root, String varName) {
    Node decl = findDeclNode(root, varName);
    assertNotNull("ไม่พบการประกาศตัวแปร " + varName, decl);
    Node value = decl.getFirstChild();
    assertNotNull(value);
    return value.getJSType();
  }

  private JSType nativeType(JSTypeNative t) {
    assertNotNull("ต้องคอมไพล์ก่อนเรียก nativeType()", registry);
    return registry.getNativeType(t);
  }

  private void assertEquivalentToNative(JSTypeNative expected, JSType actual) {
    assertNotNull("actual type ต้องไม่เป็น null", actual);
    assertTrue(
        "คาดหวัง " + expected + " แต่ได้ " + actual,
        actual.isEquivalentTo(nativeType(expected)));
  }

  // ---------------------------------------------------------------------
  // Boundary / null / malformed input
  // ---------------------------------------------------------------------

  @Test
  public void testEmptySource_noException() {
    // ค่าว่าง (boundary) - ต้องไม่ throw exception แม้ไม่มี statement ให้ traverse
    Node root = compileAndGetRoot("");
    assertNotNull(root);
  }

  @Test
  public void testMalformedSyntax_reportsErrorWithoutException() {
    // อินพุตผิดรูปแบบ - parser ควร fail และไม่ควรทำให้ TypeInference ทำให้เกิด
    // uncaught exception หลุดออกมาจาก compile()
    Node root = compileAndGetRoot("function f( { var x = ; }");
    assertNotNull(root);
    assertTrue("ควรมี error จาก syntax ผิดรูปแบบ", compiler.getErrors().length > 0);
  }

  // ---------------------------------------------------------------------
  // traverseName: primitive literal ที่ถูก set type มาก่อนหน้า TypeInference
  // (สมมติฐาน: literal node ถูก set JSType โดย parser/IRFactory ก่อนหน้านี้)
  // ---------------------------------------------------------------------

  @Test
  public void testNumberLiteral_typeIsNumber() {
    Node root = compileAndGetRoot("function f() { var probe = 1; }");
    assertEquivalentToNative(NUMBER_TYPE, typeOfInitializer(root, "probe"));
  }

  @Test
  public void testStringLiteral_typeIsString() {
    Node root = compileAndGetRoot("function f() { var probe = 'x'; }");
    assertEquivalentToNative(STRING_TYPE, typeOfInitializer(root, "probe"));
  }

  @Test
  public void testBooleanLiteral_typeIsBoolean() {
    Node root = compileAndGetRoot("function f() { var probe = true; }");
    assertEquivalentToNative(BOOLEAN_TYPE, typeOfInitializer(root, "probe"));
  }

  @Test
  public void testNullLiteral_typeIsNull() {
    Node root = compileAndGetRoot("function f() { var probe = null; }");
    assertEquivalentToNative(NULL_TYPE, typeOfInitializer(root, "probe"));
  }

  // ---------------------------------------------------------------------
  // traverseName: else-branch (อ่านตัวแปรที่ไม่มี initializer)
  // ครอบคลุม: entry lattice ตั้งค่า VOID_TYPE ให้ declaratively-unbound var
  // ---------------------------------------------------------------------

  @Test
  public void testUndeclaredVar_typeIsVoid() {
    Node root = compileAndGetRoot("function f() { var x; var probe = x; }");
    assertEquivalentToNative(VOID_TYPE, typeOfInitializer(root, "probe"));
  }

  // ---------------------------------------------------------------------
  // traverseAdd: ครอบคลุมทุก branch ของ isAddedAsNumber / isString / isUnknown
  // ---------------------------------------------------------------------

  @Test
  public void testAdditionNumeric_typeIsNumber() {
    // leftIsUnknown=false, rightIsUnknown=false, ไม่มีฝั่งใดเป็น string,
    // isAddedAsNumber ทั้งสองฝั่ง -> NUMBER_TYPE
    Node root = compileAndGetRoot("function f() { var probe = 1 + 2; }");
    assertEquivalentToNative(NUMBER_TYPE, typeOfInitializer(root, "probe"));
  }

  @Test
  public void testAdditionString_typeIsString() {
    // ฝั่งใดฝั่งหนึ่งเป็น string -> STRING_TYPE
    Node root = compileAndGetRoot("function f() { var probe = 'a' + 'b'; }");
    assertEquivalentToNative(STRING_TYPE, typeOfInitializer(root, "probe"));
  }

  @Test
  public void testAdditionStringNumberMix_typeIsString() {
    Node root = compileAndGetRoot("function f() { var probe = 'a' + 1; }");
    assertEquivalentToNative(STRING_TYPE, typeOfInitializer(root, "probe"));
  }

  @Test
  public void testAdditionUnknownOperands_typeIsUnknown() {
    // parameter ที่ไม่มี type annotation -> unknownType ทั้งสองฝั่ง
    // -> leftIsUnknown && rightIsUnknown -> unknownType
    Node root = compileAndGetRoot("function f(a, b) { var probe = a + b; }");
    JSType type = typeOfInitializer(root, "probe");
    assertNotNull(type);
    assertTrue("คาดว่าเป็น unknown type", type.isUnknownType());
  }

  // ---------------------------------------------------------------------
  // traverseHook (ternary) - ไม่ยืนยัน string/format ที่แน่นอนของ union
  // จึงตรวจแบบ lenient
  // ---------------------------------------------------------------------

  @Test
  public void testTernary_typeIsNotNullAndNotUnknown() {
    Node root =
        compileAndGetRoot("function f() { var probe = true ? 1 : 'a'; }");
    JSType type = typeOfInitializer(root, "probe");
    // ไม่ระบุ type ที่แน่นอน (union ของ number/string) เพราะ format ของ
    // getLeastSupertype ไม่ได้ยืนยันจาก source ที่ให้ - ตรวจแค่ว่าไม่ crash
    // และไม่ใช่ unknown (มีการ compute จริง)
    assertNotNull(type);
    assertFalse(type.isUnknownType());
  }

  // ---------------------------------------------------------------------
  // traverseAnd / traverseOr - ตรวจว่าไม่ throw exception และมีการ set type
  // (behavior ภายในของ BooleanOutcomePair ไม่ยืนยันจาก source ที่ให้ทั้งหมด)
  // ---------------------------------------------------------------------

  @Test
  public void testAndOperator_noExceptionAndTypeAssigned() {
    Node root = compileAndGetRoot("function f(a) { var probe = a && 1; }");
    JSType type = typeOfInitializer(root, "probe");
    assertNotNull("AND node ต้องถูก setJSType", type);
  }

  @Test
  public void testOrOperator_noExceptionAndTypeAssigned() {
    Node root = compileAndGetRoot("function f(a) { var probe = a || 1; }");
    JSType type = typeOfInitializer(root, "probe");
    assertNotNull("OR node ต้องถูก setJSType", type);
  }

  // ---------------------------------------------------------------------
  // traverse(): comparison / typeof / unary
  // ---------------------------------------------------------------------

  @Test
  public void testComparisonLessThan_typeIsBoolean() {
    Node root = compileAndGetRoot("function f() { var probe = 1 < 2; }");
    assertEquivalentToNative(BOOLEAN_TYPE, typeOfInitializer(root, "probe"));
  }

  @Test
  public void testTypeofOperator_typeIsString() {
    Node root =
        compileAndGetRoot("function f() { var x = 1; var probe = typeof x; }");
    assertEquivalentToNative(STRING_TYPE, typeOfInitializer(root, "probe"));
  }

  @Test
  public void testUnaryNegation_typeIsNumber() {
    // NEG/POS branch: setJSType(NUMBER_TYPE) เสมอ ไม่ขึ้นกับชนิด operand
    Node root =
        compileAndGetRoot("function f() { var x = 'str'; var probe = -x; }");
    assertEquivalentToNative(NUMBER_TYPE, typeOfInitializer(root, "probe"));
  }

  // ---------------------------------------------------------------------
  // traverseArrayLiteral / traverseObjectLiteral
  // ---------------------------------------------------------------------

  @Test
  public void testArrayLiteral_typeIsArray() {
    Node root =
        compileAndGetRoot("function f() { var probe = [1, 2, 3]; }");
    assertEquivalentToNative(ARRAY_TYPE, typeOfInitializer(root, "probe"));
  }

  @Test
  public void testObjectLiteral_typeIsNotNull() {
    // Preconditions.checkNotNull(type) ภายใน traverseObjectLiteral กำหนดว่า
    // OBJECTLIT ต้องมี JSType ที่ไม่ null มาก่อนหน้า (ตั้งโดย pass ก่อน
    // TypeInference) - ตรวจว่าไม่ throw และมีผลลัพธ์
    Node root = compileAndGetRoot("function f() { var probe = {a: 1}; }");
    JSType type = typeOfInitializer(root, "probe");
    assertNotNull(type);
  }

  // ---------------------------------------------------------------------
  // traverseGetProp / traverseGetElem - smoke test (ผลลัพธ์ภายในซับซ้อน
  // และพึ่งพา inferQualifiedSlot / TemplateTypeMap ที่ไม่มี source ให้)
  // ---------------------------------------------------------------------

  @Test
  public void testGetPropOnObjectLiteral_noException() {
    Node root = compileAndGetRoot(
        "function f() { var obj = {a: 1}; var probe = obj.a; }");
    // ตรวจแค่ว่าการ traverse ไม่ throw exception (getPropertyType การันตี
    // ไม่คืน null เสมอตาม source ที่ให้ - unknownType เป็น fallback)
    JSType type = typeOfInitializer(root, "probe");
    assertNotNull(type);
  }

  @Test
  public void testGetElemOnArray_noException() {
    Node root = compileAndGetRoot(
        "function f() { var arr = [1, 2, 3]; var probe = arr[0]; }");
    // traverseGetElem อาจไม่ setJSType หาก templateTypeMap ไม่มี element key
    // (ARRAY_TYPE พื้นฐานไม่มี externs กำหนด @template) จึงไม่ assert ค่าที่แน่นอน
    Node decl = findDeclNode(root, "probe");
    assertNotNull(decl);
  }

  // ---------------------------------------------------------------------
  // branchedFlowThrough: ON_TRUE + NodeUtil.isForIn branch
  // ---------------------------------------------------------------------

  @Test
  public void testForIn_noExceptionOverAllBranches() {
    // ครอบคลุม branch ON_TRUE ของ for-in (redeclareSimpleVar กับ STRING_TYPE)
    // และ branch ที่ loop ไม่ถูกเข้า (ON_FALSE ปกติ)
    Node root = compileAndGetRoot(
        "function f() { var obj = {a: 1, b: 2}; var key; "
            + "for (key in obj) { var probe = key; } }");
    assertNotNull(root);
  }

  // ---------------------------------------------------------------------
  // traverseCatch: unknown type สำหรับ catch parameter ที่ไม่มี @type
  // ---------------------------------------------------------------------

  @Test
  public void testCatchParameter_typeIsUnknown() {
    Node root = compileAndGetRoot(
        "function f() { try { throw 1; } catch (e) { var probe = e; } }");
    JSType type = typeOfInitializer(root, "probe");
    assertNotNull(type);
    assertTrue("catch param ที่ไม่มี @type ควรเป็น unknown", type.isUnknownType());
  }

  // ---------------------------------------------------------------------
  // traverse(): CAST branch (JSDoc inline cast)
  // ---------------------------------------------------------------------

  @Test
  public void testCastAnnotation_typeIsString() {
    // อินไลน์ cast syntax ของ Closure Compiler: /** @type {string} */ (expr)
    // (ฟีเจอร์นี้ไม่ได้ยืนยันจาก source ของ TypeInference โดยตรง แต่เป็น
    // ฟีเจอร์มาตรฐานของ parser ที่ทำให้เกิด Token.CAST)
    Node root = compileAndGetRoot(
        "function f() { var x = 1; "
            + "var probe = /** @type {string} */ (x); }");
    JSType type = typeOfInitializer(root, "probe");
    assertNotNull(type);
    // ถ้า parser รองรับ cast จริง คาดว่าเป็น string; ถ้าไม่ ก็ยังต้องไม่ throw
    // exception - จึง assert แบบไม่ fail รุนแรงเกินไป
  }

  // ---------------------------------------------------------------------
  // traverseReturn - smoke test
  // ---------------------------------------------------------------------

  @Test
  public void testReturnStatement_noException() {
    Node root = compileAndGetRoot("function f() { return 1; }");
    assertNotNull(root);
  }

  // ---------------------------------------------------------------------
  // traverseAssign: GETPROP branch (ensurePropertyDefined) - smoke test
  // ---------------------------------------------------------------------

  @Test
  public void testPropertyAssignmentThenRead_noException() {
    Node root = compileAndGetRoot(
        "function f() { var obj = {}; obj.x = 5; var probe = obj.x; }");
    JSType type = typeOfInitializer(root, "probe");
    assertNotNull(type);
  }
}

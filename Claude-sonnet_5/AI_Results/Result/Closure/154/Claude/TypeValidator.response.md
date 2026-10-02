ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับ `TypeValidator` (Defects4J: Closure-154b)

**หมายเหตุสำคัญก่อนเริ่ม:**
- คลาส `TypeValidator` อยู่ใน package `com.google.javascript.jscomp` และใช้งาน internal classes อื่น ๆ ของ Closure Compiler เอง (เช่น `Compiler`, `NodeTraversal`, `JSTypeRegistry`) ซึ่งเป็นส่วนหนึ่งของ source tree เดียวกัน ไม่ใช่ external jar ดังนั้นจึงใช้ของจริงได้ (ไม่มี mocking framework ใน classpath ที่ให้มา)
- บาง behavior ของ `JSType` (เช่น `matchesStringContext()`, `matchesNumberContext()`, `canTestForShallowEqualityWith()` สำหรับ native type ต่าง ๆ) ไม่ได้แสดงอยู่ใน source ของ `TypeValidator` ที่ให้มา จึงอ้างอิงจากพฤติกรรมที่เป็นที่รู้จักทั่วไปของ Closure Compiler type system และ**คอมเมนต์กำกับไว้ชัดเจนว่าเป็นสมมติฐาน**
- บางเมธอด (`expectSuperType`, `expectUndeclaredVariable`, `expectAllInterfaceProperties`) ต้องพึ่งพา object graph ที่ซับซ้อนมาก (Scope/Var, FunctionType prototype chain) ซึ่งไม่สามารถสร้างได้อย่างปลอดภัยจาก API ที่มีอยู่ในซอร์สที่ให้มา จึง **ข้ามและคอมเมนต์กำกับ** ตามข้อกำหนด #4

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Unit tests for {@link TypeValidator}.
 *
 * หมายเหตุ: บาง assertion อ้างอิงพฤติกรรมมาตรฐานของ JSType hierarchy ของ Closure Compiler
 * ที่ไม่ได้แสดงไว้ในซอร์สของ TypeValidator ที่ให้มาโดยตรง (เช่น matchesStringContext,
 * matchesNumberContext ของ native type ต่าง ๆ) จึงคอมเมนต์กำกับไว้ ณ จุดที่ใช้งาน
 */
public class TypeValidatorTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private TypeValidator validator;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // จำเป็นต้องเรียก initOptions เพื่อให้ error manager ภายใน compiler พร้อมใช้งาน
    // (compiler.report(...) ที่ถูกเรียกจาก TypeValidator ต้องมี error manager)
    compiler.initOptions(new CompilerOptions());
    registry = compiler.getTypeRegistry();
    validator = new TypeValidator(compiler);
  }

  // ---------- Helpers ----------

  private JSType nativeType(JSTypeNative type) {
    return registry.getNativeType(type);
  }

  /**
   * สร้าง NodeTraversal โดยไม่ต้อง traverse จริง ใช้ได้กับกรณีที่ TypeValidator
   * ไม่เรียก t.inGlobalScope() (เช่นเมื่อ Node ที่ส่งเข้าไปไม่ใช่ GETPROP)
   */
  private NodeTraversal simpleTraversal() {
    return new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        // no-op ไม่ได้ถูกเรียกจริงเพราะไม่มีการ traverse
      }
    });
  }

  private int countMismatches() {
    int count = 0;
    Iterator<TypeMismatch> it = validator.getMismatches().iterator();
    while (it.hasNext()) {
      it.next();
      count++;
    }
    return count;
  }

  private Node findFirstGetProp(Node n) {
    if (n.getType() == Token.GETPROP) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findFirstGetProp(c);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  // ==================================================================
  // expectObject
  // ==================================================================

  @Test
  public void testExpectObject_MatchesObjectContext_ReturnsTrueNoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    boolean result = validator.expectObject(t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
    assertTrue(result);
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectObject_VoidDoesNotMatchObjectContext_ReturnsFalseMismatch() {
    // สมมติฐาน: VOID_TYPE.matchesObjectContext() == false (undefined ไม่ใช่ object context)
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    boolean result = validator.expectObject(t, n, nativeType(JSTypeNative.VOID_TYPE), "msg");
    assertFalse(result);
    assertEquals(1, countMismatches());
  }

  // ==================================================================
  // expectActualObject
  // ==================================================================

  @Test
  public void testExpectActualObject_IsObject_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectActualObject(t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectActualObject_NotObject_Mismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectActualObject(t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg");
    assertEquals(1, countMismatches());
  }

  // ==================================================================
  // expectAnyObject
  // ==================================================================

  @Test
  public void testExpectAnyObject_IsSubtypeOfNoObjectSuperset_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    // OBJECT_TYPE เป็น supertype ของ NO_OBJECT_TYPE -> anyObjectType.isSubtype(type) == true
    validator.expectAnyObject(t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectAnyObject_EmptyType_NoMismatch() {
    // สมมติฐาน: NO_TYPE (bottom type) ทำให้ type.isEmptyType() == true
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectAnyObject(t, n, nativeType(JSTypeNative.NO_TYPE), "msg");
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectAnyObject_NotObjectAndNotEmpty_Mismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectAnyObject(t, n, nativeType(JSTypeNative.STRING_TYPE), "msg");
    assertEquals(1, countMismatches());
  }

  // ==================================================================
  // expectString / expectNumber
  // ==================================================================

  @Test
  public void testExpectString_StringMatches_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectString(t, n, nativeType(JSTypeNative.STRING_TYPE), "msg");
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectString_VoidDoesNotMatch_Mismatch() {
    // สมมติฐาน: VOID_TYPE.matchesStringContext() == false
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectString(t, n, nativeType(JSTypeNative.VOID_TYPE), "msg");
    assertEquals(1, countMismatches());
  }

  @Test
  public void testExpectNumber_NumberMatches_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectNumber(t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg");
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectNumber_VoidDoesNotMatch_Mismatch() {
    // สมมติฐาน: VOID_TYPE.matchesNumberContext() == false
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectNumber(t, n, nativeType(JSTypeNative.VOID_TYPE), "msg");
    assertEquals(1, countMismatches());
  }

  // ==================================================================
  // expectBitwiseable
  // ==================================================================

  @Test
  public void testExpectBitwiseable_MatchesNumberContext_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectBitwiseable(t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg");
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectBitwiseable_NotNumberButSubtypeOfAllValueTypes_NoMismatch() {
    // VOID_TYPE ไม่ match number context (สมมติฐานเดียวกับข้างบน) แต่เป็นสมาชิกของ
    // allValueTypes (STRING|NUMBER|BOOLEAN|NULL|VOID) จึง isSubtype == true -> ไม่เกิด mismatch
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectBitwiseable(t, n, nativeType(JSTypeNative.VOID_TYPE), "msg");
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectBitwiseable_NotNumberAndNotSubtype_Mismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectBitwiseable(t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
    assertEquals(1, countMismatches());
  }

  // ==================================================================
  // expectStringOrNumber
  // ==================================================================

  @Test
  public void testExpectStringOrNumber_NumberMatches_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectStringOrNumber(t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg");
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectStringOrNumber_VoidMatchesNeither_Mismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectStringOrNumber(t, n, nativeType(JSTypeNative.VOID_TYPE), "msg");
    assertEquals(1, countMismatches());
  }

  // ==================================================================
  // expectNotNullOrUndefined
  // ==================================================================

  @Test
  public void testExpectNotNullOrUndefined_NoType_ReturnsTrue() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    boolean result = validator.expectNotNullOrUndefined(
        t, n, nativeType(JSTypeNative.NO_TYPE), "msg", nativeType(JSTypeNative.OBJECT_TYPE));
    assertTrue(result);
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectNotNullOrUndefined_UnknownType_ReturnsTrue() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    boolean result = validator.expectNotNullOrUndefined(
        t, n, nativeType(JSTypeNative.UNKNOWN_TYPE), "msg",
        nativeType(JSTypeNative.OBJECT_TYPE));
    assertTrue(result);
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectNotNullOrUndefined_NotSubtypeOfNullOrUndefined_ReturnsTrue() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    boolean result = validator.expectNotNullOrUndefined(
        t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg",
        nativeType(JSTypeNative.OBJECT_TYPE));
    assertTrue(result);
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectNotNullOrUndefined_ForwardDeclaredUnresolved_ReturnsTrue() {
    // สมมติฐาน: NO_RESOLVED_TYPE.isNoResolvedType() == true และเป็น subtype ของ (null|void)
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    boolean result = validator.expectNotNullOrUndefined(
        t, n, nativeType(JSTypeNative.NO_RESOLVED_TYPE), "msg",
        nativeType(JSTypeNative.OBJECT_TYPE));
    assertTrue(result);
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectNotNullOrUndefined_NullNonGetProp_Mismatch() {
    // n ไม่ใช่ GETPROP -> เงื่อนไข inGlobalScope() จะไม่ถูกเรียก (short-circuit)
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString(Token.NAME, "x");
    boolean result = validator.expectNotNullOrUndefined(
        t, n, nativeType(JSTypeNative.NULL_TYPE), "msg",
        nativeType(JSTypeNative.OBJECT_TYPE));
    assertFalse(result);
    assertEquals(1, countMismatches());
  }

  @Test
  public void testExpectNotNullOrUndefined_VoidNonGetProp_Mismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString(Token.NAME, "x");
    boolean result = validator.expectNotNullOrUndefined(
        t, n, nativeType(JSTypeNative.VOID_TYPE), "msg",
        nativeType(JSTypeNative.OBJECT_TYPE));
    assertFalse(result);
    assertEquals(1, countMismatches());
  }

  @Test
  public void testExpectNotNullOrUndefined_GetPropInGlobalScope_Mismatch() {
    // ใช้การ traverse จริงเพื่อให้ t.inGlobalScope() ทำงานได้อย่างถูกต้อง
    // สมมติฐาน: Compiler#parseTestCode(String) มีอยู่จริงใน commit นี้สำหรับ parse โค้ดทดสอบ
    final Node script = compiler.parseTestCode("a.b;");
    final Node getProp = findFirstGetProp(script);
    assertNotNull("ควรพบ GETPROP node ในสคริปต์ทดสอบ", getProp);

    final boolean[] resultHolder = new boolean[1];
    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal tt, Node n, Node parent) {
        if (n == getProp) {
          resultHolder[0] = validator.expectNotNullOrUndefined(
              tt, n, nativeType(JSTypeNative.NULL_TYPE), "msg",
              nativeType(JSTypeNative.OBJECT_TYPE));
        }
      }
    });
    t.traverse(script);

    // ที่ global scope: !t.inGlobalScope() == false -> ไม่เข้า early-return -> เกิด mismatch
    assertFalse(resultHolder[0]);
    assertEquals(1, countMismatches());
  }

  @Test
  public void testExpectNotNullOrUndefined_GetPropInLocalScope_AllowedNull() {
    final Node script = compiler.parseTestCode("function f() { return a.b; }");
    final Node getProp = findFirstGetProp(script);
    assertNotNull("ควรพบ GETPROP node ในสคริปต์ทดสอบ", getProp);

    final boolean[] resultHolder = new boolean[1];
    NodeTraversal t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal tt, Node n, Node parent) {
        if (n == getProp) {
          resultHolder[0] = validator.expectNotNullOrUndefined(
              tt, n, nativeType(JSTypeNative.NULL_TYPE), "msg",
              nativeType(JSTypeNative.OBJECT_TYPE));
        }
      }
    });
    t.traverse(script);

    // ภายใน local scope (ในฟังก์ชัน): !t.inGlobalScope() == true และ type.isNullType() == true
    // -> เข้า early-return true โดยไม่เกิด mismatch (edge-case ตาม comment ใน source)
    assertTrue(resultHolder[0]);
    assertEquals(0, countMismatches());
  }

  // ==================================================================
  // expectSwitchMatchesCase
  // ==================================================================

  @Test
  public void testExpectSwitchMatchesCase_SameType_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node caseExpr = Node.newNumber(1);
    Node caseNode = new Node(Token.CASE, caseExpr);
    validator.expectSwitchMatchesCase(
        t, caseNode, nativeType(JSTypeNative.NUMBER_TYPE), nativeType(JSTypeNative.NUMBER_TYPE));
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectSwitchMatchesCase_IncompatibleType_Mismatch() {
    // สมมติฐาน: switch เป็น NUMBER, case เป็น OBJECT_TYPE จะไม่ canTestForShallowEqualityWith กัน
    // และ autoboxesTo() ของ OBJECT_TYPE เป็น null -> เข้าเงื่อนไข mismatch
    NodeTraversal t = simpleTraversal();
    Node caseExpr = Node.newString("x");
    Node caseNode = new Node(Token.CASE, caseExpr);
    validator.expectSwitchMatchesCase(
        t, caseNode, nativeType(JSTypeNative.NUMBER_TYPE), nativeType(JSTypeNative.OBJECT_TYPE));
    assertEquals(1, countMismatches());
  }

  // ==================================================================
  // expectIndexMatch
  // ==================================================================

  @Test
  public void testExpectIndexMatch_UnknownObjectType_NumberIndex_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectIndexMatch(
        t, n, nativeType(JSTypeNative.UNKNOWN_TYPE), nativeType(JSTypeNative.NUMBER_TYPE));
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectIndexMatch_UnknownObjectType_VoidIndex_Mismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectIndexMatch(
        t, n, nativeType(JSTypeNative.UNKNOWN_TYPE), nativeType(JSTypeNative.VOID_TYPE));
    assertEquals(1, countMismatches());
  }

  @Test
  public void testExpectIndexMatch_ArrayType_NumberIndex_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectIndexMatch(
        t, n, nativeType(JSTypeNative.ARRAY_TYPE), nativeType(JSTypeNative.NUMBER_TYPE));
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectIndexMatch_ArrayType_VoidIndex_Mismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectIndexMatch(
        t, n, nativeType(JSTypeNative.ARRAY_TYPE), nativeType(JSTypeNative.VOID_TYPE));
    assertEquals(1, countMismatches());
  }

  @Test
  public void testExpectIndexMatch_ObjectType_StringIndex_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectIndexMatch(
        t, n, nativeType(JSTypeNative.OBJECT_TYPE), nativeType(JSTypeNative.STRING_TYPE));
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectIndexMatch_ObjectType_VoidIndex_Mismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectIndexMatch(
        t, n, nativeType(JSTypeNative.OBJECT_TYPE), nativeType(JSTypeNative.VOID_TYPE));
    assertEquals(1, countMismatches());
  }

  @Test
  public void testExpectIndexMatch_NeitherArrayNorObject_Mismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectIndexMatch(
        t, n, nativeType(JSTypeNative.NUMBER_TYPE), nativeType(JSTypeNative.NUMBER_TYPE));
    assertEquals(1, countMismatches());
  }

  // หมายเหตุ: กรณี objType.toObjectType() != null && getIndexType() != null (index signature
  // ของ record/dict type) ไม่สามารถสร้างได้อย่างปลอดภัยจาก API พื้นฐานที่มีอยู่ใน source
  // ที่ให้มา จึงข้ามการทดสอบ branch นี้

  // ==================================================================
  // expectCanAssignTo / expectCanAssignToPropertyOf
  // ==================================================================

  @Test
  public void testExpectCanAssignTo_Compatible_ReturnsTrue() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    boolean result = validator.expectCanAssignTo(
        t, n, nativeType(JSTypeNative.NUMBER_TYPE), nativeType(JSTypeNative.NUMBER_TYPE), "msg");
    assertTrue(result);
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectCanAssignTo_Incompatible_ReturnsFalseMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    boolean result = validator.expectCanAssignTo(
        t, n, nativeType(JSTypeNative.STRING_TYPE), nativeType(JSTypeNative.NUMBER_TYPE), "msg");
    assertFalse(result);
    assertEquals(1, countMismatches());
  }

  @Test
  public void testExpectCanAssignToPropertyOf_LeftTypeIsNoType_ReturnsTrue() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    Node owner = Node.newString(Token.NAME, "owner");
    boolean result = validator.expectCanAssignToPropertyOf(
        t, n, nativeType(JSTypeNative.STRING_TYPE), nativeType(JSTypeNative.NO_TYPE),
        owner, "prop");
    assertTrue(result);
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectCanAssignToPropertyOf_Compatible_ReturnsTrue() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    Node owner = Node.newString(Token.NAME, "owner");
    boolean result = validator.expectCanAssignToPropertyOf(
        t, n, nativeType(JSTypeNative.NUMBER_TYPE), nativeType(JSTypeNative.NUMBER_TYPE),
        owner, "prop");
    assertTrue(result);
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectCanAssignToPropertyOf_Incompatible_ReturnsFalseMismatch() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    Node owner = Node.newString(Token.NAME, "owner");
    boolean result = validator.expectCanAssignToPropertyOf(
        t, n, nativeType(JSTypeNative.STRING_TYPE), nativeType(JSTypeNative.NUMBER_TYPE),
        owner, "prop");
    assertFalse(result);
    assertEquals(1, countMismatches());
  }

  // หมายเหตุ: branch bothIntrinsics(...) (isConstructor()/isEnumType() ของทั้งสองด้าน) ต้องใช้
  // constructor/enum type ที่สร้างจาก JSTypeRegistry ด้วย signature ที่ไม่ปรากฏชัดใน source
  // ที่ให้มา จึงไม่ทดสอบ branch นี้เพื่อป้องกันการเดา behavior ผิด

  // ==================================================================
  // expectArgumentMatchesParameter
  // ==================================================================

  @Test
  public void testExpectArgumentMatchesParameter_Compatible_NoMismatch() {
    NodeTraversal t = simpleTraversal();
    Node arg = Node.newString("x");
    Node callee = Node.newString(Token.NAME, "foo");
    Node callNode = new Node(Token.CALL, callee);
    validator.expectArgumentMatchesParameter(
        t, arg, nativeType(JSTypeNative.NUMBER_TYPE), nativeType(JSTypeNative.NUMBER_TYPE),
        callNode, 1);
    assertEquals(0, countMismatches());
  }

  @Test
  public void testExpectArgumentMatchesParameter_Incompatible_Mismatch() {
    NodeTraversal t = simpleTraversal();
    Node arg = Node.newString("x");
    Node callee = Node.newString(Token.NAME, "foo");
    Node callNode = new Node(Token.CALL, callee);
    validator.expectArgumentMatchesParameter(
        t, arg, nativeType(JSTypeNative.STRING_TYPE), nativeType(JSTypeNative.NUMBER_TYPE),
        callNode, 1);
    assertEquals(1, countMismatches());
  }

  // ==================================================================
  // expectCanOverride
  // ==================================================================

  @Test
  public void testExpectCanOverride_Compatible_NoMismatchNoReport() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectCanOverride(
        t, n, nativeType(JSTypeNative.NUMBER_TYPE), nativeType(JSTypeNative.NUMBER_TYPE),
        "prop", nativeType(JSTypeNative.OBJECT_TYPE));
    assertEquals(0, countMismatches());
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanOverride_Incompatible_ShouldReportTrue_MismatchAndWarning() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectCanOverride(
        t, n, nativeType(JSTypeNative.STRING_TYPE), nativeType(JSTypeNative.NUMBER_TYPE),
        "prop", nativeType(JSTypeNative.OBJECT_TYPE));
    assertEquals(1, countMismatches());
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanOverride_Incompatible_ShouldReportFalse_MismatchNoWarning() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.setShouldReport(false);
    validator.expectCanOverride(
        t, n, nativeType(JSTypeNative.STRING_TYPE), nativeType(JSTypeNative.NUMBER_TYPE),
        "prop", nativeType(JSTypeNative.OBJECT_TYPE));
    assertEquals(1, countMismatches());
    assertEquals(0, compiler.getWarningCount());
  }

  // ==================================================================
  // expectCanCast
  // ==================================================================

  @Test
  public void testExpectCanCast_Compatible_NoMismatchNoReport() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectCanCast(
        t, n, nativeType(JSTypeNative.OBJECT_TYPE), nativeType(JSTypeNative.OBJECT_TYPE));
    assertEquals(0, countMismatches());
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanCast_Incompatible_ShouldReportTrue_MismatchAndWarning() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.expectCanCast(
        t, n, nativeType(JSTypeNative.STRING_TYPE), nativeType(JSTypeNative.NUMBER_TYPE));
    assertEquals(1, countMismatches());
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanCast_Incompatible_ShouldReportFalse_MismatchNoWarning() {
    NodeTraversal t = simpleTraversal();
    Node n = Node.newString("x");
    validator.setShouldReport(false);
    validator.expectCanCast(
        t, n, nativeType(JSTypeNative.STRING_TYPE), nativeType(JSTypeNative.NUMBER_TYPE));
    assertEquals(1, countMismatches());
    assertEquals(0, compiler.getWarningCount());
  }

  // ==================================================================
  // getReadableJSTypeName
  // ==================================================================

  @Test
  public void testGetReadableJSTypeName_NameNodeWithQualifiedName() {
    Node nameNode = Node.newString(Token.NAME, "foo");
    String result = validator.getReadableJSTypeName(nameNode, false);
    assertEquals("foo", result);
  }

  @Test
  public void testGetReadableJSTypeName_GetPropNode_UsesQualifiedName() {
    // สมมติฐาน: เมื่อ JSType ของ firstChild ไม่ได้ถูกกำหนด (unknown) การ dereference()
    // จะไม่นำไปสู่การไล่ prototype chain (objectType == null) ดังนั้นค่าที่คืนจะมาจาก
    // n.getQualifiedName() ("a.b") แทน
    Node getProp = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "a"), Node.newString("b"));
    String result = validator.getReadableJSTypeName(getProp, false);
    assertEquals("a.b", result);
  }

  @Test
  public void testGetReadableJSTypeName_NoQualifiedName_ReturnsTypeToString() {
    Node numNode = Node.newNumber(5);
    String result = validator.getReadableJSTypeName(numNode, false);
    assertEquals(nativeType(JSTypeNative.UNKNOWN_TYPE).toString(), result);
  }

  // ==================================================================
  // getMismatches / setShouldReport (sanity)
  // ==================================================================

  @Test
  public void testGetMismatches_EmptyInitially() {
    assertEquals(0, countMismatches());
  }

  @Test
  public void testSetShouldReport_DoesNotThrow() {
    validator.setShouldReport(false);
    validator.setShouldReport(true);
    // ไม่มี assertion เพิ่มเติม: ทดสอบเพียงว่าเรียกได้โดยไม่ throw exception
  }
}
```

## สรุปตาราง Test method → Branch/Condition ที่ครอบคลุม

| Test method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testExpectObject_MatchesObjectContext_ReturnsTrueNoMismatch | `expectObject`: `matchesObjectContext()==true` → return true |
| testExpectObject_VoidDoesNotMatchObjectContext_ReturnsFalseMismatch | `expectObject`: `matchesObjectContext()==false` → mismatch, return false |
| testExpectActualObject_IsObject_NoMismatch | `expectActualObject`: `isObject()==true` |
| testExpectActualObject_NotObject_Mismatch | `expectActualObject`: `isObject()==false` → mismatch |
| testExpectAnyObject_IsSubtypeOfNoObjectSuperset_NoMismatch | `expectAnyObject`: `isSubtype(type)==true` |
| testExpectAnyObject_EmptyType_NoMismatch | `expectAnyObject`: `isEmptyType()==true` |
| testExpectAnyObject_NotObjectAndNotEmpty_Mismatch | `expectAnyObject`: ทั้งสองเงื่อนไขเป็น false → mismatch |
| testExpectString_StringMatches_NoMismatch / VoidDoesNotMatch_Mismatch | `expectString`: true/false branch |
| testExpectNumber_NumberMatches_NoMismatch / VoidDoesNotMatch_Mismatch | `expectNumber`: true/false branch |
| testExpectBitwiseable_* (3 tests) | `expectBitwiseable`: matchesNumberContext true, false+isSubtype true, false+isSubtype false |
| testExpectStringOrNumber_* (2 tests) | `expectStringOrNumber`: true/false branch |
| testExpectNotNullOrUndefined_NoType | `isNoType()==true` early return true |
| testExpectNotNullOrUndefined_UnknownType | `isUnknownType()==true` early return true |
| testExpectNotNullOrUndefined_NotSubtypeOfNullOrUndefined | `isSubtype(nullOrUndefined)==false` → return true |
| testExpectNotNullOrUndefined_ForwardDeclaredUnresolved | `containsForwardDeclaredUnresolvedName==true` → return true |
| testExpectNotNullOrUndefined_NullNonGetProp_Mismatch / VoidNonGetProp_Mismatch | main mismatch branch (non-GETPROP) |
| testExpectNotNullOrUndefined_GetPropInGlobalScope_Mismatch | GETPROP + global scope → mismatch |
| testExpectNotNullOrUndefined_GetPropInLocalScope_AllowedNull | GETPROP + local scope + null → early return true (edge case) |
| testExpectSwitchMatchesCase_* (2 tests) | `expectSwitchMatchesCase`: match/mismatch branch |
| testExpectIndexMatch_* (7 tests) | `expectIndexMatch`: unknown-type branch (match/mismatch), array branch (match/mismatch), object branch (match/mismatch), else-mismatch branch |
| testExpectCanAssignTo_* (2 tests) | `expectCanAssignTo`: true/false branch |
| testExpectCanAssignToPropertyOf_* (3 tests) | `expectCanAssignToPropertyOf`: `leftType.isNoType()`, compatible, incompatible |
| testExpectArgumentMatchesParameter_* (2 tests) | `expectArgumentMatchesParameter`: canAssignTo true/false |
| testExpectCanOverride_* (3 tests) | `expectCanOverride`: compatible, incompatible+shouldReport true, incompatible+shouldReport false |
| testExpectCanCast_* (3 tests) | `expectCanCast`: compatible, incompatible+shouldReport true/false |
| testGetReadableJSTypeName_* (3 tests) | `getReadableJSTypeName`: non-GETPROP+qualifiedName, GETPROP+qualifiedName fallback, no-qualifiedName→toString |
| testGetMismatches_EmptyInitially / testSetShouldReport_DoesNotThrow | sanity check ของ getter/setter |

**Branch ที่ไม่ได้ทดสอบ (พร้อมเหตุผล คอมเมนต์ไว้ในโค้ด):**
- `expectIndexMatch`: กรณี `toObjectType()!=null && getIndexType()!=null` (index-signature type)
- `bothIntrinsics(...)` ใน `expectCanAssignTo`/`expectCanAssignToPropertyOf`
- `expectSuperType`, `expectUndeclaredVariable`, `expectAllInterfaceProperties`/`expectInterfaceProperty` — ต้องสร้าง object graph ที่ซับซ้อน (Scope/Var, prototype chain) ซึ่งไม่มีข้อมูล API เพียงพอในซอร์สที่ให้มาเพื่อสร้างอย่างถูกต้องโดยไม่เดา behavior
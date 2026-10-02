# วิเคราะห์และแนวทางการทดสอบ

**หมายเหตุสำคัญก่อนเริ่ม:** `TypeValidator` เป็น **package-private class** ที่ผูกกับ infrastructure ของ Closure Compiler อย่างมาก (`Compiler`, `NodeTraversal`, `JSTypeRegistry`, `Node`) ซึ่ง class เหล่านี้ไม่ได้อยู่ใน jar libraries ที่ระบุ แต่เป็น source ในโปรเจกต์เดียวกัน (compile ร่วมกัน) ดังนั้น:

- Test class ต้องอยู่ใน package `com.google.javascript.jscomp` เดียวกัน (ไม่มี `import TypeValidator` เพราะ same package — คอมเมนต์อธิบายไว้ในโค้ด)
- ไม่มี mocking library ใน classpath (ไม่มี Mockito) จึงต้องสร้าง **real objects** (`Compiler`, `JSTypeRegistry`, `Node`) ผ่าน parse+traverse จริง เพื่อไม่ต้องเดา internal state ของ `NodeTraversal`
- พฤติกรรมภายในของ `JSType` (เช่น `matchesNumberContext()`, `canTestForShallowEqualityWith()`, `canCastTo()`, `isSubtype` ของ bottom-type) **ไม่ได้อยู่ในซอร์สที่ให้มา** — จุดที่ต้องอาศัยความเข้าใจทั่วไปของ Closure type-lattice จะมี **คอมเมนต์กำกับชัดเจน** ว่าเป็นสมมติฐาน

```java
package com.google.javascript.jscomp;
// หมายเหตุ: TypeValidator เป็น package-private class (constructor ก็ package-private)
// จึงจำเป็นต้องประกาศ test class ไว้ใน package เดียวกัน ไม่สามารถ import ข้ามแพ็กเกจได้
// (import com.google.javascript.jscomp.TypeValidator; ไม่จำเป็นเพราะอยู่ package เดียวกันแล้ว)

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test สำหรับ {@link TypeValidator}
 *
 * ข้อจำกัด/สมมติฐานสำคัญ (เนื่องจากไม่มี mocking framework ใน classpath ที่กำหนด
 * และพฤติกรรมภายในของ JSType ไม่ได้อยู่ในซอร์สที่ให้มา):
 *  1) ใช้ Compiler จริง + JSTypeRegistry จริง เพื่อให้ได้ native type ที่ถูกต้อง
 *  2) สำหรับกรณีที่ต้องใช้ NodeTraversal (t) ที่มี state ของ scope ถูกต้อง
 *     (ใช้ใน expectNotNullOrUndefined) จะ parse โค้ด JS จริงแล้ว traverse จริง
 *     เพื่อไม่ต้อง "เดา" การทำงานภายในของ NodeTraversal
 *  3) พฤติกรรมของ matchesNumberContext()/matchesStringContext()/matchesObjectContext()/
 *     canTestForShallowEqualityWith()/canCastTo() ไม่ได้อยู่ในซอร์สที่ให้มา
 *     - จุดที่ใช้จะมีคอมเมนต์ "[SMTP]" (Semantic assumption) กำกับไว้
 */
public class TypeValidatorTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private TypeValidator validator;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    validator = new TypeValidator(compiler);
  }

  private JSType nativeType(JSTypeNative t) {
    return registry.getNativeType(t);
  }

  // ---------------------------------------------------------------------
  // Helper infrastructure: สร้าง NodeTraversal จริงจากการ parse + traverse
  // ---------------------------------------------------------------------

  private interface TraversalAction {
    void run(NodeTraversal t, Node n);
  }

  /**
   * Parse โค้ด js แล้ว traverse จริง เมื่อพบ node แรกที่ matcher คืนค่า true
   * จะเรียก action.run(t, n) โดยที่ t ยังอยู่ระหว่าง traversal จริง
   * (ทำให้ t.inGlobalScope()/t.getSourceName() มีค่าตาม engine จริง ไม่ต้องเดา)
   */
  private void withMatchedNode(String js, final NodePredicate matcher,
      final TraversalAction action) {
    Node script = compiler.parse(SourceFile.fromCode("input.js", js));
    assertNotNull("parse ล้มเหลวสำหรับ: " + js, script);
    final boolean[] found = {false};
    NodeTraversal.traverse(compiler, script,
        new NodeTraversal.AbstractPostOrderCallback() {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {
            if (!found[0] && matcher.matches(n)) {
              found[0] = true;
              action.run(t, n);
            }
          }
        });
    assertTrue("ไม่พบ node ที่ต้องการใน: " + js, found[0]);
  }

  private interface NodePredicate {
    boolean matches(Node n);
  }

  private static final NodePredicate ANY_NODE = new NodePredicate() {
    @Override public boolean matches(Node n) { return true; }
  };

  private static final NodePredicate GETPROP_NODE = new NodePredicate() {
    @Override public boolean matches(Node n) { return n.isGetProp(); }
  };

  private static final NodePredicate GETELEM_NODE = new NodePredicate() {
    @Override public boolean matches(Node n) { return n.isGetElem(); }
  };

  // =========================================================================
  // expectObject
  // =========================================================================

  @Test
  public void testExpectObject_ObjectType_Passes() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        boolean result = validator.expectObject(
            t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
        assertTrue(result);
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectObject_NullType_FailsAndRecordsMismatch() {
    // NULL ไม่สามารถถือเป็น object context ได้ -> ควรเป็น false + mismatch
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        boolean result = validator.expectObject(
            t, n, nativeType(JSTypeNative.NULL_TYPE), "msg");
        assertFalse(result);
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectActualObject
  // =========================================================================

  @Test
  public void testExpectActualObject_ObjectType_NoMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectActualObject(
            t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectActualObject_NumberType_RecordsMismatch() {
    // Number ไม่ใช่ object จริง (isObject() == false ตามนิยาม) -> mismatch
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectActualObject(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg");
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectAnyObject  ("Expect the type to contain an object sometimes")
  // =========================================================================

  @Test
  public void testExpectAnyObject_ObjectType_NoMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectAnyObject(
            t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectAnyObject_NumberType_RecordsMismatch() {
    // ตาม docstring ของเมธอด: Number ไม่ "contain an object" เลย -> ต้อง mismatch
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectAnyObject(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg");
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  @Test
  public void testExpectAnyObject_EmptyType_NoMismatch() {
    // type.isEmptyType() == true (NO_TYPE คือ bottom type) -> เงื่อนไข false เสมอ
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectAnyObject(
            t, n, nativeType(JSTypeNative.NO_TYPE), "msg");
        assertEquals(before, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectString / expectNumber
  // [SMTP] plain OBJECT_TYPE ไม่ match string/number context ตามความเข้าใจทั่วไป
  // ของ closure type-checker (มีตัวอย่าง diagnostic แบบนี้ใน closure-compiler)
  // =========================================================================

  @Test
  public void testExpectString_StringType_NoMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectString(
            t, n, nativeType(JSTypeNative.STRING_TYPE), "msg");
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectString_ObjectType_RecordsMismatch() { // [SMTP]
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectString(
            t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  @Test
  public void testExpectNumber_NumberType_NoMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectNumber(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg");
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectNumber_ObjectType_RecordsMismatch() { // [SMTP]
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectNumber(
            t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectBitwiseable
  // allValueTypes = STRING|NUMBER|BOOLEAN|NULL|VOID  (union สร้างใน constructor)
  // NULL_TYPE เป็นสมาชิกโดยตรงของ union นี้ -> isSubtype(allValueTypes) ต้อง true แน่นอน
  // (ไม่ต้องพึ่ง matchesNumberContext เลย เพราะ OR เงื่อนไขที่สองเป็น false อยู่แล้ว)
  // =========================================================================

  @Test
  public void testExpectBitwiseable_NullType_NoMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectBitwiseable(
            t, n, nativeType(JSTypeNative.NULL_TYPE), "msg");
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectBitwiseable_NumberType_NoMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectBitwiseable(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg");
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectBitwiseable_ObjectType_RecordsMismatch() { // [SMTP]
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectBitwiseable(
            t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectStringOrNumber
  // =========================================================================

  @Test
  public void testExpectStringOrNumber_String_NoMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectStringOrNumber(
            t, n, nativeType(JSTypeNative.STRING_TYPE), "msg");
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectStringOrNumber_Number_NoMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectStringOrNumber(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg");
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectStringOrNumber_Object_RecordsMismatch() { // [SMTP]
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectStringOrNumber(
            t, n, nativeType(JSTypeNative.OBJECT_TYPE), "msg");
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectNotNullOrUndefined  <-- เมธอดหลักที่เกี่ยวข้องกับ defect ของ Closure-117
  // =========================================================================

  @Test
  public void testExpectNotNullOrUndefined_UnknownType_ReturnsTrue() {
    // type.isUnknownType() == true -> ข้ามการเช็คทั้งหมด, คืน true, ไม่มี mismatch
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        boolean r = validator.expectNotNullOrUndefined(
            t, n, nativeType(JSTypeNative.UNKNOWN_TYPE), "msg",
            nativeType(JSTypeNative.OBJECT_TYPE));
        assertTrue(r);
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectNotNullOrUndefined_NoType_ReturnsTrue() {
    // type.isNoType() == true -> ข้ามการเช็ค, คืน true
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        boolean r = validator.expectNotNullOrUndefined(
            t, n, nativeType(JSTypeNative.NO_TYPE), "msg",
            nativeType(JSTypeNative.OBJECT_TYPE));
        assertTrue(r);
      }
    });
  }

  @Test
  public void testExpectNotNullOrUndefined_NotNullableType_ReturnsTrue() {
    // STRING ไม่ใช่ subtype ของ (null|undefined) -> คืน true, ไม่มี mismatch
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        boolean r = validator.expectNotNullOrUndefined(
            t, n, nativeType(JSTypeNative.STRING_TYPE), "msg",
            nativeType(JSTypeNative.OBJECT_TYPE));
        assertTrue(r);
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectNotNullOrUndefined_VoidType_ReturnsFalseAndMismatch() {
    // VOID เป็น subtype ของ (null|undefined) แต่ isNullType()==false
    // -> ไม่เข้า special-case ของ GETPROP -> ต้อง mismatch เสมอ (ทุก node/scope)
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        boolean r = validator.expectNotNullOrUndefined(
            t, n, nativeType(JSTypeNative.VOID_TYPE), "msg",
            nativeType(JSTypeNative.OBJECT_TYPE));
        assertFalse(r);
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  @Test
  public void testExpectNotNullOrUndefined_NullType_NonGetProp_ReturnsFalse() {
    // n เป็น NAME (ไม่ใช่ GetProp) -> ไม่เข้า special-case -> mismatch
    withMatchedNode("a;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        boolean r = validator.expectNotNullOrUndefined(
            t, n, nativeType(JSTypeNative.NULL_TYPE), "msg",
            nativeType(JSTypeNative.OBJECT_TYPE));
        assertFalse(r);
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  @Test
  public void testExpectNotNullOrUndefined_NullType_GetProp_GlobalScope_ReturnsFalse() {
    // n เป็น GETPROP แต่ t.inGlobalScope() == true -> เงื่อนไข special-case
    // (!t.inGlobalScope()) เป็น false -> ไม่เข้า exemption -> ต้อง mismatch
    withMatchedNode("a.b;", GETPROP_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        boolean r = validator.expectNotNullOrUndefined(
            t, n, nativeType(JSTypeNative.NULL_TYPE), "msg",
            nativeType(JSTypeNative.OBJECT_TYPE));
        assertFalse(r);
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  @Test
  public void testExpectNotNullOrUndefined_NullType_GetProp_NonGlobalScope_ReturnsTrueNoMismatch() {
    // n เป็น GETPROP และอยู่ใน scope ของ function (ไม่ใช่ global)
    // -> เข้าเงื่อนไข special-case ทั้งหมด -> คืน true และ "ไม่" บันทึก mismatch
    withMatchedNode("function f(a){ a.b; }", GETPROP_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        boolean r = validator.expectNotNullOrUndefined(
            t, n, nativeType(JSTypeNative.NULL_TYPE), "msg",
            nativeType(JSTypeNative.OBJECT_TYPE));
        assertTrue(r);
        assertEquals(before, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectCanAssignTo
  // =========================================================================

  @Test
  public void testExpectCanAssignTo_CompatibleTypes_ReturnsTrue() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        boolean r = validator.expectCanAssignTo(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE),
            nativeType(JSTypeNative.NUMBER_TYPE), "msg");
        assertTrue(r);
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectCanAssignTo_IncompatibleTypes_ReturnsFalse() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        boolean r = validator.expectCanAssignTo(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE),
            nativeType(JSTypeNative.STRING_TYPE), "msg");
        assertFalse(r);
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectCanAssignToPropertyOf
  // owner ที่ไม่มีการ setJSType() -> getJSType(owner) คืน UNKNOWN_TYPE ตามที่ระบุ
  // ไว้ชัดเจนใน source (getJSType) จึง UNKNOWN_TYPE.isFunctionPrototypeType() ควรเป็น false
  // ทำให้ไม่เข้า branch พิเศษของ interface -> ตรงไปที่การเช็ค isSubtype ปกติ
  // =========================================================================

  @Test
  public void testExpectCanAssignToPropertyOf_Compatible_ReturnsTrue() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        Node owner = new Node(Token.NAME); // ไม่ set JSType -> UNKNOWN_TYPE
        int before = countMismatches();
        boolean r = validator.expectCanAssignToPropertyOf(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE),
            nativeType(JSTypeNative.NUMBER_TYPE), owner, "prop");
        assertTrue(r);
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectCanAssignToPropertyOf_Incompatible_ReturnsFalse() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        Node owner = new Node(Token.NAME);
        int before = countMismatches();
        boolean r = validator.expectCanAssignToPropertyOf(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE),
            nativeType(JSTypeNative.STRING_TYPE), owner, "prop");
        assertFalse(r);
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  @Test
  public void testExpectCanAssignToPropertyOf_LeftIsNoType_ReturnsTrue() {
    // leftType.isNoType() == true -> ข้าม branch ทั้งหมด, คืน true ทันที
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        Node owner = new Node(Token.NAME);
        boolean r = validator.expectCanAssignToPropertyOf(
            t, n, nativeType(JSTypeNative.STRING_TYPE),
            nativeType(JSTypeNative.NO_TYPE), owner, "prop");
        assertTrue(r);
      }
    });
  }

  // =========================================================================
  // expectArgumentMatchesParameter
  // =========================================================================

  @Test
  public void testExpectArgumentMatchesParameter_Match_NoMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
        int before = countMismatches();
        validator.expectArgumentMatchesParameter(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE),
            nativeType(JSTypeNative.NUMBER_TYPE), callNode, 1);
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectArgumentMatchesParameter_Mismatch_RecordsMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));
        int before = countMismatches();
        validator.expectArgumentMatchesParameter(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE),
            nativeType(JSTypeNative.STRING_TYPE), callNode, 1);
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectCanCast
  // อ้างอิงจาก DiagnosticType INVALID_CAST ที่ระบุใน source ชัดเจนว่า
  // "invalid cast - must be a subtype or supertype" จึงใช้คู่ type ที่ไม่มี
  // ความสัมพันธ์ subtype ใด ๆ กัน เพื่อ trigger branch ผิดพลาด
  // =========================================================================

  @Test
  public void testExpectCanCast_SameType_NoMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectCanCast(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE),
            nativeType(JSTypeNative.NUMBER_TYPE));
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectCanCast_UnrelatedTypes_RecordsMismatch() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectCanCast(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE),
            nativeType(JSTypeNative.OBJECT_TYPE));
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectIndexMatch
  // =========================================================================

  @Test
  public void testExpectIndexMatch_UnknownObjType_StringIndex_NoMismatch() {
    withMatchedNode("a[b];", GETELEM_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectIndexMatch(t, n,
            nativeType(JSTypeNative.UNKNOWN_TYPE),
            nativeType(JSTypeNative.STRING_TYPE));
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectIndexMatch_UnknownObjType_ObjectIndex_RecordsMismatch() { // [SMTP]
    withMatchedNode("a[b];", GETELEM_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectIndexMatch(t, n,
            nativeType(JSTypeNative.UNKNOWN_TYPE),
            nativeType(JSTypeNative.OBJECT_TYPE));
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  @Test
  public void testExpectIndexMatch_ArrayType_NumberIndex_NoMismatch() {
    withMatchedNode("a[b];", GETELEM_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectIndexMatch(t, n,
            nativeType(JSTypeNative.ARRAY_TYPE),
            nativeType(JSTypeNative.NUMBER_TYPE));
        assertEquals(before, countMismatches());
      }
    });
  }

  @Test
  public void testExpectIndexMatch_ArrayType_ObjectIndex_RecordsMismatch() { // [SMTP]
    withMatchedNode("a[b];", GETELEM_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectIndexMatch(t, n,
            nativeType(JSTypeNative.ARRAY_TYPE),
            nativeType(JSTypeNative.OBJECT_TYPE));
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  @Test
  public void testExpectIndexMatch_PlainObject_StringIndex_NoMismatch() {
    withMatchedNode("a[b];", GETELEM_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectIndexMatch(t, n,
            nativeType(JSTypeNative.OBJECT_TYPE),
            nativeType(JSTypeNative.STRING_TYPE));
        assertEquals(before, countMismatches());
      }
    });
  }

  // =========================================================================
  // expectValidTypeofName - smoke test เท่านั้น (ไม่ throw exception)
  // ไม่ตรวจสอบผลลัพธ์ของ compiler.report() ในเชิงลึก เพราะ API การอ่าน
  // ErrorManager ไม่มีอยู่ในซอร์สที่ให้มา
  // =========================================================================

  @Test
  public void testExpectValidTypeofName_DoesNotThrow() {
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        validator.expectValidTypeofName(t, n, "weirdtype");
      }
    });
  }

  // =========================================================================
  // setShouldReport / getMismatches
  // report() ถูกเรียกก่อนแล้วส่งผลลัพธ์เข้า registerMismatch ไม่ว่า shouldReport
  // จะเป็น true/false (ดูจาก source: mismatch() เรียก registerMismatch(...,report(...)))
  // ดังนั้น mismatches list ไม่ควรถูกกระทบจาก setShouldReport
  // =========================================================================

  @Test
  public void testSetShouldReportFalse_StillRecordsMismatch() {
    validator.setShouldReport(false);
    withMatchedNode("1;", ANY_NODE, new TraversalAction() {
      @Override public void run(NodeTraversal t, Node n) {
        int before = countMismatches();
        validator.expectActualObject(
            t, n, nativeType(JSTypeNative.NUMBER_TYPE), "msg");
        assertEquals(before + 1, countMismatches());
      }
    });
  }

  @Test
  public void testGetMismatches_InitiallyEmpty() {
    assertEquals(0, countMismatches());
  }

  // =========================================================================
  // TypeValidator.TypeMismatch (inner class) - equals/hashCode/toString
  // =========================================================================

  @Test
  public void testTypeMismatch_EqualsSameOrder() {
    JSType a = nativeType(JSTypeNative.NUMBER_TYPE);
    JSType b = nativeType(JSTypeNative.STRING_TYPE);
    JSError err = JSError.make(
        "test.js", new Node(Token.NAME), TypeValidator.UNKNOWN_TYPEOF_VALUE, "x");
    TypeValidator.TypeMismatch m1 = new TypeValidator.TypeMismatch(a, b, err);
    TypeValidator.TypeMismatch m2 = new TypeValidator.TypeMismatch(a, b, err);
    assertEquals(m1, m2);
    assertEquals(m1.hashCode(), m2.hashCode());
  }

  @Test
  public void testTypeMismatch_EqualsSwappedOrder() {
    JSType a = nativeType(JSTypeNative.NUMBER_TYPE);
    JSType b = nativeType(JSTypeNative.STRING_TYPE);
    JSError err = JSError.make(
        "test.js", new Node(Token.NAME), TypeValidator.UNKNOWN_TYPEOF_VALUE, "x");
    TypeValidator.TypeMismatch m1 = new TypeValidator.TypeMismatch(a, b, err);
    TypeValidator.TypeMismatch m2 = new TypeValidator.TypeMismatch(b, a, err);
    assertEquals(m1, m2); // equals() ยอมรับลำดับสลับกันได้ตาม source
  }

  @Test
  public void testTypeMismatch_NotEqualsDifferentTypes() {
    JSType a = nativeType(JSTypeNative.NUMBER_TYPE);
    JSType b = nativeType(JSTypeNative.STRING_TYPE);
    JSType c = nativeType(JSTypeNative.BOOLEAN_TYPE);
    JSError err = JSError.make(
        "test.js", new Node(Token.NAME), TypeValidator.UNKNOWN_TYPEOF_VALUE, "x");
    TypeValidator.TypeMismatch m1 = new TypeValidator.TypeMismatch(a, b, err);
    TypeValidator.TypeMismatch m2 = new TypeValidator.TypeMismatch(a, c, err);
    assertNotEquals(m1, m2);
  }

  @Test
  public void testTypeMismatch_NotEqualsNonMismatchObject() {
    JSType a = nativeType(JSTypeNative.NUMBER_TYPE);
    JSType b = nativeType(JSTypeNative.STRING_TYPE);
    JSError err = JSError.make(
        "test.js", new Node(Token.NAME), TypeValidator.UNKNOWN_TYPEOF_VALUE, "x");
    TypeValidator.TypeMismatch m1 = new TypeValidator.TypeMismatch(a, b, err);
    assertFalse(m1.equals("not a mismatch"));
  }

  @Test
  public void testTypeMismatch_ToStringContainsBothTypes() {
    JSType a = nativeType(JSTypeNative.NUMBER_TYPE);
    JSType b = nativeType(JSTypeNative.STRING_TYPE);
    JSError err = JSError.make(
        "test.js", new Node(Token.NAME), TypeValidator.UNKNOWN_TYPEOF_VALUE, "x");
    TypeValidator.TypeMismatch m1 = new TypeValidator.TypeMismatch(a, b, err);
    String s = m1.toString();
    assertTrue(s.contains(a.toString()));
    assertTrue(s.contains(b.toString()));
  }

  // ---------------------------------------------------------------------
  private int countMismatches() {
    int c = 0;
    for (TypeValidator.TypeMismatch m : validator.getMismatches()) {
      c++;
    }
    return c;
  }
}
```

# สรุป Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testExpectObject_*` | `expectObject`: `!type.matchesObjectContext()` true/false |
| `testExpectActualObject_*` | `expectActualObject`: `!type.isObject()` true/false |
| `testExpectAnyObject_*` | `expectAnyObject`: `!isSubtype && !isEmptyType` (true/false), และ `isEmptyType()==true` short-circuit |
| `testExpectString_*`, `testExpectNumber_*` | `!matchesStringContext()`/`!matchesNumberContext()` true/false |
| `testExpectBitwiseable_*` | `!matchesNumberContext && !isSubtype(allValueTypes)`: ทั้งสอง operand, รวม NULL ที่ short-circuit ผ่าน isSubtype |
| `testExpectStringOrNumber_*` | `!matchesNumberContext && !matchesStringContext` true/false |
| `testExpectNotNullOrUndefined_*` (7 เมธอด) | `isNoType()`, `isUnknownType()`, `isSubtype(nullOrUndefined)` false, และ special-case `n.isGetProp() && !t.inGlobalScope() && type.isNullType()` ทุก combination (GetProp×scope, isNullType true/false) |
| `testExpectCanAssignTo_*` | `!rightType.isSubtype(leftType)` true/false |
| `testExpectCanAssignToPropertyOf_*` | `leftType.isNoType()`, `!rightType.isSubtype(leftType)`, (interface-owner branch ถูก **ข้าม** เพราะต้องสร้าง FunctionType/interface hierarchy ซับซ้อนเกินซอร์สที่ให้มา — คอมเมนต์ไว้แล้ว) |
| `testExpectArgumentMatchesParameter_*` | `!argType.isSubtype(paramType)` true/false |
| `testExpectCanCast_*` | `!type.canCastTo(castType)` true/false |
| `testExpectIndexMatch_*` (5 เมธอด) | `objType.isUnknownType()` → `expectStringOrNumber`; `dereferenced.isArrayType()` → `expectNumber`; `matchesObjectContext()` → `expectString`; (branch `isStruct()` และ template-index-key ถูกข้ามเพราะต้องสร้าง ObjectType ที่มี template map ซับซ้อน) |
| `testExpectValidTypeofName_*` | smoke test เรียก `report()` ผ่าน |
| `testSetShouldReportFalse_*`, `testGetMismatches_*` | ยืนยันว่า `mismatches` list ไม่ผูกกับ `shouldReport` flag |
| `testTypeMismatch_*` (5 เมธอด) | `TypeMismatch.equals()` (ลำดับตรง/สลับ/ต่างชนิด/ไม่ใช่ TypeMismatch), `hashCode()`, `toString()` |

**เมธอดที่ไม่ได้ทดสอบ (พร้อมเหตุผล เพื่อไม่ละเมิดข้อ 4):**
- `expectSuperType`, `expectCanOverride`, `expectAllInterfaceProperties`/`expectInterfaceProperty`, `expectUndeclaredVariable`, `expectSwitchMatchesCase` — ต้องสร้าง `ObjectType`/`FunctionType`/`Scope.Var`/`TemplateTypeMap` ที่มีความสัมพันธ์ inheritance/interface ซับซ้อน ซึ่งพฤติกรรมการสร้าง object เหล่านี้ไม่ปรากฏในซอร์สที่ให้มา การเดา setup อาจทำให้ผลทดสอบไม่สะท้อน behavior จริง จึงงดเว้นตามคำสั่งข้อ 4 (ควรเพิ่มด้วย integration test ที่ใช้ parser จริง + TypeCheck pass เต็มรูปแบบในโปรเจกต์จริง)
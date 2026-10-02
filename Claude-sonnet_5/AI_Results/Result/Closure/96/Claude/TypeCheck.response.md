# หมายเหตุสำคัญก่อนเริ่ม (ข้อจำกัดของ Defects4J Closure-96)

`TypeCheck` เป็นคลาสที่ผูกกับ infrastructure ภายในของ Closure Compiler อย่างลึก (`AbstractCompiler`, `JSTypeRegistry`, `Scope`, `ScopeCreator`, `TypedScopeCreator`, `TypeInferencePass`, `SemanticReverseAbstractInterpreter` ฯลฯ) ซึ่ง**เป็นคลาสในโปรเจกต์เดียวกัน (ไม่ใช่ jar ภายนอก)** จึงถือว่า compile อยู่ร่วมกันแล้วตามลักษณะมาตรฐานของ Defects4J benchmark (jar list ที่ให้มาคือ dependency เสริมของชุดทดสอบเท่านั้น)

ผมเลือกใช้ entry point ที่ **มีอยู่จริงในซอร์สที่ให้มา** คือ `processForTesting(Node, Node)` และ constructor package-private 3-arg ซึ่งถูกออกแบบมาเพื่อการทดสอบโดยเฉพาะ (คอมเมนต์ในซอร์ส: `/** Main entry point of this phase for testing code. */`)

**จุดที่เป็น "สมมติฐาน" (ไม่ได้อยู่ในซอร์สที่ให้มาโดยตรง) จะมีคอมเมนต์ `// ASSUMPTION` กำกับไว้ชัดเจน**

```java
package com.google.javascript.jscomp; // ต้องอยู่ package เดียวกัน เพราะใช้ constructor/field ที่เป็น package-private

import static org.junit.Assert.*;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test สำหรับ com.google.javascript.jscomp.TypeCheck (Defects4J Closure-96b)
 *
 * แนวทาง: ใช้ Compiler จริง + TypeCheck.processForTesting(...) ซึ่งเป็น public API
 * ที่ประกาศไว้ในซอร์สต้นฉบับสำหรับการทดสอบโดยเฉพาะ (สร้าง scopeCreator/topScope
 * ผ่าน TypedScopeCreator + MemoizedScopeCreator + TypeInferencePass ให้เอง)
 */
public class TypeCheckTest {

  private Compiler compiler;
  private CompilerOptions options;

  // เก็บ instance ล่าสุดของ TypeCheck ที่ processForTesting ใช้งาน
  // เพื่อให้เข้าถึง getTypedPercent() ได้หลัง process
  private TypeCheck lastTypeCheck;

  // externs เปล่า: native type (Object/Function/Number/...) ถูก bootstrap โดย
  // JSTypeRegistry เองอยู่แล้ว ไม่จำเป็นต้องประกาศใน externs สำหรับกรณีทดสอบนี้
  private static final String EMPTY_EXTERNS = "";

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    compiler.initOptions(options);
  }

  // ---------------------------------------------------------------------
  // Helper infrastructure
  // ---------------------------------------------------------------------

  /**
   * Parse externs+js -> สร้าง scope ผ่าน TypedScopeCreator -> รัน TypeInferencePass
   * -> รัน TypeCheck.process ทั้งหมดผ่าน processForTesting() (มีอยู่แล้วในซอร์สจริง)
   */
  private Node parseAndTypeCheck(String js) {
    compiler.init(
        ImmutableList.of(SourceFile.fromCode("externs.js", EMPTY_EXTERNS)),
        ImmutableList.of(SourceFile.fromCode("input.js", js)),
        options);

    Node root = compiler.parseInputs();
    assertNotNull("parse error, root ควรไม่เป็น null", root);

    Node externsRoot = root.getFirstChild();
    Node jsRoot = root.getLastChild();

    JSTypeRegistry registry = compiler.getTypeRegistry();

    // ASSUMPTION: SemanticReverseAbstractInterpreter(CodingConvention, JSTypeRegistry)
    // เป็น implementation มาตรฐานของ ReverseAbstractInterpreter ในโปรเจกต์เดียวกัน
    // (ไม่ได้แสดงอยู่ในซอร์ส TypeCheck ที่ให้มา แต่จำเป็นสำหรับ TypeInferencePass)
    ReverseAbstractInterpreter rai =
        new SemanticReverseAbstractInterpreter(
            compiler.getCodingConvention(), registry);

    // ใช้ constructor package-private 3-arg -> scopeCreator=null, topScope=null
    // ตรงตาม precondition ของ processForTesting()
    TypeCheck typeCheck = new TypeCheck(compiler, rai, registry);
    typeCheck.processForTesting(externsRoot, jsRoot);
    this.lastTypeCheck = typeCheck;

    return jsRoot;
  }

  private void assertHasWarning(DiagnosticType type) {
    for (JSError w : compiler.getWarnings()) {
      if (w.getType() == type) {
        return;
      }
    }
    fail("คาดหวัง warning ประเภท " + type + " แต่ไม่พบ. warnings ที่ได้: "
        + java.util.Arrays.toString(compiler.getWarnings()));
  }

  private void assertNoWarningOfType(DiagnosticType type) {
    for (JSError w : compiler.getWarnings()) {
      if (w.getType() == type) {
        fail("ไม่คาดหวัง warning ประเภท " + type + " แต่พบ: " + w);
      }
    }
  }

  private void assertNoErrors() {
    assertEquals("ไม่ควรมี hard error",
        0, compiler.getErrors().length);
  }

  // =======================================================================
  // 1) getTypedPercent() : boundary total==0 vs total!=0
  // =======================================================================

  @Test
  public void testGetTypedPercent_zeroWhenTotalIsZero() {
    // ยังไม่มีการ process ใด ๆ -> nullCount=unknownCount=typedCount=0
    // -> ตรงกับ branch (total == 0) ใน getTypedPercent()
    TypeCheck typeCheck = new TypeCheck(
        compiler, null, compiler.getTypeRegistry());
    assertEquals(0.0, typeCheck.getTypedPercent(), 0.0001);
  }

  @Test
  public void testGetTypedPercent_positiveAfterProcessing() {
    parseAndTypeCheck("var x = 1; var y = x + 1;");
    // มี node ที่ typeable (NUMBER, NAME, ADD) -> total != 0
    // -> ตรงกับ branch (total != 0) ใน getTypedPercent()
    assertTrue("getTypedPercent ควรมากกว่า 0 หลัง process โค้ดที่มี typed nodes",
        lastTypeCheck.getTypedPercent() > 0.0);
  }

  // =======================================================================
  // 2) Empty program - boundary (ไม่มี statement ใด ๆ)
  // =======================================================================

  @Test
  public void testEmptyProgram_noErrorsNoWarnings() {
    parseAndTypeCheck("");
    assertNoErrors();
    assertEquals(0, compiler.getWarnings().length);
  }

  // =======================================================================
  // 3) DELPROP -> isReference(...) : NAME/GETPROP/GETELEM = reference,
  //    ค่าอื่น = ไม่ reference -> BAD_DELETE
  // =======================================================================

  @Test
  public void testDelete_onName_noWarning() {
    parseAndTypeCheck("var x = {}; delete x;");
    assertNoWarningOfType(TypeCheck.BAD_DELETE);
  }

  @Test
  public void testDelete_onGetProp_noWarning() {
    parseAndTypeCheck("var x = {}; delete x.y;");
    assertNoWarningOfType(TypeCheck.BAD_DELETE);
  }

  @Test
  public void testDelete_onGetElem_noWarning() {
    parseAndTypeCheck("var x = []; delete x[0];");
    assertNoWarningOfType(TypeCheck.BAD_DELETE);
  }

  @Test
  public void testDelete_onNonReference_warns() {
    // ตัวถูกดำเนินการเป็น NUMBER literal -> ไม่ใช่ NAME/GETPROP/GETELEM
    parseAndTypeCheck("delete 3;");
    assertHasWarning(TypeCheck.BAD_DELETE);
  }

  // =======================================================================
  // 4) NEW -> visitNew(): constructor type ไม่ใช่ FunctionType constructor
  //    -> ถ้าไม่ใช่ GETPROP -> NOT_A_CONSTRUCTOR
  // =======================================================================

  @Test
  public void testNew_nonConstructorType_warns() {
    parseAndTypeCheck("var x = 1; new x();");
    assertHasWarning(TypeCheck.NOT_A_CONSTRUCTOR);
  }

  @Test
  public void testNew_withConstructor_noWarning() {
    parseAndTypeCheck("/** @constructor */ function Foo(){} new Foo();");
    assertNoWarningOfType(TypeCheck.NOT_A_CONSTRUCTOR);
  }

  // =======================================================================
  // 5) CALL -> visitCall(): canBeCalled() == false -> NOT_CALLABLE
  //    constructor เรียกตรงไม่ผ่าน new -> CONSTRUCTOR_NOT_CALLABLE
  // =======================================================================

  @Test
  public void testCall_nonCallable_warns() {
    parseAndTypeCheck("var x = 1; x();");
    assertHasWarning(TypeCheck.NOT_CALLABLE);
  }

  @Test
  public void testCall_constructorWithoutNew_warns() {
    parseAndTypeCheck("/** @constructor */ function Foo(){} Foo();");
    assertHasWarning(TypeCheck.CONSTRUCTOR_NOT_CALLABLE);
  }

  // =======================================================================
  // 6) visitParameterList(): WRONG_ARGUMENT_COUNT boundary (minArgs>numArgs)
  // =======================================================================

  @Test
  public void testCall_wrongArgumentCount_tooFew_warns() {
    parseAndTypeCheck(
        "/** @param {number} a */ function f(a) {} f();");
    assertHasWarning(TypeCheck.WRONG_ARGUMENT_COUNT);
  }

  @Test
  public void testCall_correctArgumentCount_noWarning() {
    parseAndTypeCheck(
        "/** @param {number} a */ function f(a) {} f(1);");
    assertNoWarningOfType(TypeCheck.WRONG_ARGUMENT_COUNT);
  }

  // =======================================================================
  // 7) shouldTraverse(): FUNCTION_MASKS_VARIABLE
  //    (functionPrivateName ถูก declare แล้วในสโคปเดียวกัน และไม่ใช่ FunctionType)
  // =======================================================================

  @Test
  public void testFunctionMasksVariable_warns() {
    // ASSUMPTION: t.getScope() ตอน shouldTraverse(FUNCTION) คือ outer scope
    // ของฟังก์ชันนั้น (สอดคล้องกับชื่อตัวแปร outerScope ในซอร์ส)
    parseAndTypeCheck(
        "function f() { var x = 3; function x() {} }");
    assertHasWarning(TypeCheck.FUNCTION_MASKS_VARIABLE);
  }

  // =======================================================================
  // 8) visitInterfaceGetprop(): INTERFACE_FUNCTION_NOT_EMPTY /
  //    INVALID_INTERFACE_MEMBER_DECLARATION
  // =======================================================================

  @Test
  public void testInterfaceMemberNonEmptyBody_warns() {
    parseAndTypeCheck(
        "/** @interface */ function I() {}\n"
        + "I.prototype.foo = function() { return 1; };");
    assertHasWarning(TypeCheck.INTERFACE_FUNCTION_NOT_EMPTY);
  }

  @Test
  public void testInterfaceMemberEmptyFunction_noWarning() {
    parseAndTypeCheck(
        "/** @interface */ function I() {}\n"
        + "I.prototype.foo = function() {};");
    assertNoWarningOfType(TypeCheck.INTERFACE_FUNCTION_NOT_EMPTY);
    assertNoWarningOfType(TypeCheck.INVALID_INTERFACE_MEMBER_DECLARATION);
  }

  @Test
  public void testInterfaceMemberInvalidDeclaration_warns() {
    // rvalue ไม่ใช่ ordinary function และไม่ใช่ qualified name ของ abstractMethod
    parseAndTypeCheck(
        "/** @interface */ function I() {}\n"
        + "I.prototype.bar = 3;");
    assertHasWarning(TypeCheck.INVALID_INTERFACE_MEMBER_DECLARATION);
  }

  // =======================================================================
  // 9) visitFunction(): CONFLICTING_EXTENDED_TYPE / BAD_IMPLEMENTED_TYPE
  // =======================================================================

  @Test
  public void testConflictingExtendedType_warns() {
    // constructor พยายาม extend interface -> ขัดแย้งตามเงื่อนไขในซอร์ส
    parseAndTypeCheck(
        "/** @interface */ function I() {}\n"
        + "/** @constructor\n * @extends {I} */\n"
        + "function Foo() {}");
    assertHasWarning(TypeCheck.CONFLICTING_EXTENDED_TYPE);
  }

  @Test
  public void testBadImplementedType_warns() {
    // implements ประเภทที่ไม่ใช่ interface
    parseAndTypeCheck(
        "/** @constructor */ function Foo() {}\n"
        + "/** @constructor\n * @implements {Foo} */\n"
        + "function Bar() {}");
    assertHasWarning(TypeCheck.BAD_IMPLEMENTED_TYPE);
  }

  // =======================================================================
  // 10) checkDeclaredPropertyInheritance(): UNKNOWN_OVERRIDE
  // =======================================================================

  @Test
  public void testUnknownOverride_warns() {
    // @override แต่ไม่มี superclass/interface ใดประกาศ property นี้ไว้จริง
    parseAndTypeCheck(
        "/** @constructor */ function Foo() {}\n"
        + "/** @override */\n"
        + "Foo.prototype.bar = function() {};");
    assertHasWarning(TypeCheck.UNKNOWN_OVERRIDE);
  }

  // =======================================================================
  // 11) checkPropertyAccess(): INEXISTENT_ENUM_ELEMENT
  // =======================================================================

  @Test
  public void testEnumInexistentElement_warns() {
    parseAndTypeCheck(
        "/** @enum {number} */ var Color = {RED:1, GREEN:2};\n"
        + "var c = Color.BLUE;");
    assertHasWarning(TypeCheck.INEXISTENT_ENUM_ELEMENT);
  }

  @Test
  public void testEnumExistingElement_noWarning() {
    parseAndTypeCheck(
        "/** @enum {number} */ var Color = {RED:1, GREEN:2};\n"
        + "var c = Color.RED;");
    assertNoWarningOfType(TypeCheck.INEXISTENT_ENUM_ELEMENT);
  }

  // =======================================================================
  // 12) checkNoTypeCheckSection(): @notypecheck section suppress ทุก report()
  //     (ยืนยันได้จากคอมเมนต์ในซอร์สจริง: "state boolean ... @notypecheck section")
  // =======================================================================

  @Test
  public void testNoTypeCheckSection_suppressesWarning() {
    parseAndTypeCheck(
        "/**\n * @notypecheck\n */\n"
        + "function f() {\n"
        + "  var x = 1;\n"
        + "  new x();\n" // ปกติจะ trigger NOT_A_CONSTRUCTOR
        + "}");
    // ASSUMPTION: แท็ก "@notypecheck" ตรงกับ JSDocInfo.isNoTypeCheck()==true
    assertNoWarningOfType(TypeCheck.NOT_A_CONSTRUCTOR);
  }
}
```

## สรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetTypedPercent_zeroWhenTotalIsZero` | `getTypedPercent()`: branch `total == 0` → return 0.0 |
| `testGetTypedPercent_positiveAfterProcessing` | `getTypedPercent()`: branch `total != 0` → คำนวณเปอร์เซ็นต์ |
| `testEmptyProgram_noErrorsNoWarnings` | Boundary: ไม่มี node ใด ๆ ให้ traverse |
| `testDelete_onName_noWarning` | `DELPROP` case + `isReference()` → `Token.NAME` = true |
| `testDelete_onGetProp_noWarning` | `isReference()` → `Token.GETPROP` = true |
| `testDelete_onGetElem_noWarning` | `isReference()` → `Token.GETELEM` = true |
| `testDelete_onNonReference_warns` | `isReference()` → `default` = false → `report(...BAD_DELETE)` |
| `testNew_nonConstructorType_warns` | `visitNew()`: `type==null` และ `constructor.getType()!=GETPROP` → `NOT_A_CONSTRUCTOR` |
| `testNew_withConstructor_noWarning` | `visitNew()`: `type!=null && type.isConstructor()` → ไม่ warn |
| `testCall_nonCallable_warns` | `visitCall()`: `!childType.canBeCalled()` → `NOT_CALLABLE` |
| `testCall_constructorWithoutNew_warns` | `visitCall()`: `functionType.isConstructor() && !isNativeObjectType()` → `CONSTRUCTOR_NOT_CALLABLE` |
| `testCall_wrongArgumentCount_tooFew_warns` | `visitParameterList()`: `minArgs > numArgs` → `WRONG_ARGUMENT_COUNT` |
| `testCall_correctArgumentCount_noWarning` | `visitParameterList()`: `minArgs<=numArgs<=maxArgs` → ไม่ warn |
| `testFunctionMasksVariable_warns` | `shouldTraverse()`: เงื่อนไข name length>0, `isDeclared`, ไม่ใช่ FunctionType → `FUNCTION_MASKS_VARIABLE` |
| `testInterfaceMemberNonEmptyBody_warns` | `visitInterfaceGetprop()`: `FUNCTION` body ไม่ empty → `INTERFACE_FUNCTION_NOT_EMPTY` |
| `testInterfaceMemberEmptyFunction_noWarning` | `visitInterfaceGetprop()`: ordinary function + empty body → ไม่ warn ทั้งสองแบบ |
| `testInterfaceMemberInvalidDeclaration_warns` | `visitInterfaceGetprop()`: ไม่ใช่ ordinary function/abstractMethod → `INVALID_INTERFACE_MEMBER_DECLARATION` |
| `testConflictingExtendedType_warns` | `visitFunction()`: `baseConstructor.isInterface() && functionType.isConstructor()` → `CONFLICTING_EXTENDED_TYPE` |
| `testBadImplementedType_warns` | `visitFunction()`: `interfaceConstructor != null && !isInterface()` → `BAD_IMPLEMENTED_TYPE` |
| `testUnknownOverride_warns` | `checkDeclaredPropertyInheritance()`: `declaredOverride && !superClassHasProperty && !foundInterfaceProperty` → `UNKNOWN_OVERRIDE` |
| `testEnumInexistentElement_warns` | `checkPropertyAccess()`: `!hasProperty && objectType instanceof EnumType` → `INEXISTENT_ENUM_ELEMENT` |
| `testEnumExistingElement_noWarning` | `checkPropertyAccess()`: `hasProperty==true` → ไม่ warn |
| `testNoTypeCheckSection_suppressesWarning` | `checkNoTypeCheckSection()` + `report()`: `noTypeCheckSection != 0` → ไม่ report |

**หมายเหตุความเสี่ยง**: เนื่องจากพฤติกรรมเชิงลึกของ `JSType`, `FunctionType`, `EnumType`, `TypedScopeCreator`, `SemanticReverseAbstractInterpreter` ไม่ได้แสดงในซอร์สที่ให้มา จุดที่มีคอมเมนต์ `// ASSUMPTION` คือส่วนที่อาศัยความเข้าใจทั่วไปของ Closure Compiler ในยุคนั้น หากรันแล้วพบว่า signature หรือชื่อ tag ไม่ตรง อาจต้องปรับ helper method (`parseAndTypeCheck`) หรือชื่อ tag ให้ตรงกับเวอร์ชันจริงของโปรเจกต์
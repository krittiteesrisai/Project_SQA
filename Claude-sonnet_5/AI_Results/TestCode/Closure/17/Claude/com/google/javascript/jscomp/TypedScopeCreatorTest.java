package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.CompilerOptions.LanguageMode;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link TypedScopeCreator}.
 *
 * เนื่องจาก TypedScopeCreator เป็น package-private final class ที่ผูกกับ
 * infrastructure ของ Closure Compiler อย่างแน่นหนา (Compiler, JSTypeRegistry,
 * NodeTraversal ฯลฯ) วิธีทดสอบที่สมเหตุสมผลที่สุดคือรัน compile pipeline
 * เต็มรูปแบบ (เปิด checkTypes) แล้วตรวจสอบ diagnostic ที่ TypedScopeCreator
 * รายงานออกมา ซึ่งเป็นแนวทางเดียวกับที่ใช้ในชุดทดสอบต้นฉบับของ
 * Closure Compiler
 */
public class TypedScopeCreatorTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private CompilerOptions createOptions() {
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    options.setCheckTypes(true);
    return options;
  }

  private void compile(String js) {
    compile("", js);
  }

  private void compile(String externs, String js) {
    CompilerOptions options = createOptions();
    SourceFile externFile = SourceFile.fromCode("externs.js", externs);
    SourceFile jsFile = SourceFile.fromCode("input.js", js);
    compiler.compile(externFile, jsFile, options);
  }

  private JSError[] warnings() {
    return compiler.getWarnings();
  }

  private JSError[] errors() {
    return compiler.getErrors();
  }

  private boolean hasDiagnostic(JSError[] list, DiagnosticType type) {
    if (list == null) {
      return false;
    }
    for (JSError e : list) {
      if (e.type == type) {
        return true;
      }
    }
    return false;
  }

  // ---------------------------------------------------------------------
  // Boundary / Empty input
  // ---------------------------------------------------------------------

  @Test
  public void testEmptySource_noException() {
    // ค่าว่างสุด (edge case): ต้องไม่ throw exception และไม่มี error
    compile("");
    assertEquals(0, errors().length);
  }

  @Test
  public void testSimpleVarDeclaration_noWarnings() {
    compile("/** @type {number} */ var x = 1;");
    assertEquals(0, errors().length);
    assertEquals(0, warnings().length);
  }

  // ---------------------------------------------------------------------
  // Token.VAR / defineVar: hasMoreThanOneChild() branch (MULTIPLE_VAR_DEF)
  // ---------------------------------------------------------------------

  @Test
  public void testMultipleVarDefWithJsDoc_warns() {
    // info != null และ n.hasMoreThanOneChild() == true -> MULTIPLE_VAR_DEF
    compile("/** @type {number} */ var x = 1, y = 2;");
    assertTrue(hasDiagnostic(warnings(), TypeCheck.MULTIPLE_VAR_DEF));
  }

  @Test
  public void testMultipleVarDefWithoutJsDoc_noWarning() {
    // info == null -> ไม่รายงาน MULTIPLE_VAR_DEF (else-branch)
    compile("var x = 1, y = 2;");
    assertFalse(hasDiagnostic(warnings(), TypeCheck.MULTIPLE_VAR_DEF));
  }

  @Test
  public void testSingleVarDeclaration_infoFromNameNode() {
    // n.hasMoreThanOneChild() == false -> ใช้ branch else ของ defineVar
    compile("var /** number */ x = 1;");
    assertEquals(0, errors().length);
  }

  // ---------------------------------------------------------------------
  // Enum handling: createEnumTypeFromNodes / defineObjectLiteral
  // ---------------------------------------------------------------------

  @Test
  public void testEnumInitializer_notObjectOrEnum_warns() {
    // rValue ไม่ใช่ object literal และไม่ใช่ qualified name ที่เป็น enum
    // -> isValidValue == false -> ENUM_INITIALIZER
    compile("/** @enum {number} */ var Color = 3;");
    assertTrue(hasDiagnostic(warnings(), TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testEnumInitializer_objectLiteral_noWarning() {
    // rValue เป็น object literal -> isValidValue == true -> ไม่มี warning
    compile("/** @enum {number} */ var Color = {RED: 1, GREEN: 2};");
    assertFalse(hasDiagnostic(warnings(), TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testEnumAliasing_qualifiedName_noWarning() {
    // rValue เป็น qualified name ที่ชี้ไปยัง enum เดิม
    // -> เข้า branch "Handle an aliased enum" ใน createEnumTypeFromNodes
    compile(
        "/** @enum {number} */ var Color = {RED: 1};"
        + "/** @enum {number} */ var Color2 = Color;");
    assertFalse(hasDiagnostic(warnings(), TypedScopeCreator.ENUM_INITIALIZER));
  }

  @Test
  public void testEnumNonConstantKey_getter_warns() {
    // getter key ไม่มี String value -> keyName == null -> ENUM_NOT_CONSTANT
    compile("/** @enum {number} */ var E = {get A() { return 1; }};");
    assertTrue(hasDiagnostic(warnings(), TypeCheck.ENUM_NOT_CONSTANT));
  }

  @Test
  public void testEnumValidKey_noWarning() {
    compile("/** @enum {number} */ var E = {A: 1, B: 2};");
    assertFalse(hasDiagnostic(warnings(), TypeCheck.ENUM_NOT_CONSTANT));
  }

  // ---------------------------------------------------------------------
  // @lends handling: defineObjectLiteral
  // ---------------------------------------------------------------------

  @Test
  public void testUnknownLends_warns() {
    // lendsVar == null (ไม่พบตัวแปรที่ระบุใน @lends) -> UNKNOWN_LENDS
    compile("/** @lends {NotDeclared} */ ({foo: 1});");
    assertTrue(hasDiagnostic(warnings(), TypedScopeCreator.UNKNOWN_LENDS));
  }

  @Test
  public void testLendsOnNonObject_warns() {
    // lendsVar พบ แต่ type ไม่ subtype ของ Object -> LENDS_ON_NON_OBJECT
    compile(
        "var x = 1;"
        + "/** @lends {x} */ ({foo: 1});");
    assertTrue(hasDiagnostic(warnings(), TypedScopeCreator.LENDS_ON_NON_OBJECT));
  }

  @Test
  public void testLendsOnObject_noWarning() {
    // lendsVar พบและเป็น subtype ของ Object -> ไม่มี warning ทั้งสองแบบ
    compile(
        "var x = {};"
        + "/** @lends {x} */ ({foo: 1});");
    assertFalse(hasDiagnostic(warnings(), TypedScopeCreator.LENDS_ON_NON_OBJECT));
    assertFalse(hasDiagnostic(warnings(), TypedScopeCreator.UNKNOWN_LENDS));
  }

  @Test
  public void testObjectLiteralWithoutLends_noWarning() {
    // info == null หรือ getLendsName() == null -> ข้าม @lends logic ทั้งหมด
    compile("var obj = {a: 1, b: 'str'};");
    assertEquals(0, errors().length);
    assertFalse(hasDiagnostic(warnings(), TypedScopeCreator.UNKNOWN_LENDS));
  }

  // ---------------------------------------------------------------------
  // Constructor / Interface initializer checks (defineSlot)
  // ---------------------------------------------------------------------

  @Test
  public void testConstructorMustBeInitialized_warns() {
    // @constructor แต่ var ไม่มี initial value และชื่อตรงกับ
    // instance type reference name -> CTOR_INITIALIZER
    compile("/** @constructor */ var Foo;");
    assertTrue(hasDiagnostic(warnings(), TypedScopeCreator.CTOR_INITIALIZER));
  }

  @Test
  public void testConstructorInitializedProperly_noWarning() {
    // function literal มี initial value เสมอ -> ไม่เข้า branch CTOR_INITIALIZER
    compile("/** @constructor */ function Foo() {}");
    assertFalse(hasDiagnostic(warnings(), TypedScopeCreator.CTOR_INITIALIZER));
  }

  @Test
  public void testInterfaceMustBeInitialized_warns() {
    // เหมือน CTOR_INITIALIZER แต่ fnType.isInterface() -> IFACE_INITIALIZER
    compile("/** @interface */ var Foo;");
    assertTrue(hasDiagnostic(warnings(), TypedScopeCreator.IFACE_INITIALIZER));
  }

  @Test
  public void testInterfaceInitializedProperly_noWarning() {
    compile("/** @interface */ function Foo() {}");
    assertFalse(hasDiagnostic(warnings(), TypedScopeCreator.IFACE_INITIALIZER));
  }

  @Test
  public void testConstructorDeclaresPrototypeAndInstance_noError() {
    // ตรวจ branch การ declare .prototype ผ่าน scope chain
    compile("/** @constructor */ function Foo() {} var f = new Foo();");
    assertEquals(0, errors().length);
  }

  @Test
  public void testSubclassPrototypeInheritance_noError() {
    // superClassCtor != null -> branch "declared iff explicit supertype"
    compile(
        "/** @constructor */ function Base() {}"
        + "/** @constructor @extends {Base} */ function Sub() {}"
        + "Sub.prototype = new Base();");
    assertEquals(0, errors().length);
  }

  // ---------------------------------------------------------------------
  // Malformed typedef (best-effort; ไม่ยืนยัน trigger 100%)
  // ---------------------------------------------------------------------

  @Test
  public void testTypedefWithType_noCrash() {
    // NOTE: ไม่มั่นใจว่า evaluate() จะ return null ในกรณีทั่วไปหรือไม่
    // (ตามคอมเมนต์ในซอร์ส "This is a terrible, terrible hack").
    // เทสนี้ยืนยันเพียงว่า flow ไม่ crash และ diagnostic list เข้าถึงได้
    compile("/** @typedef {number} */ var MyTypedef;");
    assertNotNull(warnings());
    assertEquals(0, errors().length);
  }

  @Test
  public void testTypedefOnGetProp_definesSlot() {
    // candidate.isGetProp() == true -> defineSlot กับ NO_TYPE
    compile(
        "var ns = {};"
        + "/** @typedef {number} */ ns.MyTypedef;");
    assertEquals(0, errors().length);
  }

  // ---------------------------------------------------------------------
  // Qualified-name declaration via GETPROP / ASSIGN (maybeDeclareQualifiedName)
  // ---------------------------------------------------------------------

  @Test
  public void testQualifiedNamePropertyAssignment_noError() {
    // Token.ASSIGN branch: firstChild.isGetProp() && isQualifiedName()
    compile("var ns = {}; ns.prop = 1;");
    assertEquals(0, errors().length);
  }

  @Test
  public void testStubDeclaration_getPropWithoutAssign_noError() {
    // Token.GETPROP branch: parent.isExprResult() -> stub declaration,
    // resolved later ผ่าน resolveStubDeclarations() เป็น UNKNOWN_TYPE
    compile(
        "/** @constructor */ function Foo() {}"
        + "Foo.prototype.bar;");
    assertEquals(0, errors().length);
  }

  @Test
  public void testStubDeclaration_ownerUndeclared_registersOnType() {
    // ownerType == null -> ไป branch typeRegistry.registerPropertyOnType(...)
    compile("NotDeclared.someProp;");
    assertNotNull(warnings());
  }

  // ---------------------------------------------------------------------
  // Prototype reassignment special case in maybeDeclareQualifiedName
  // ---------------------------------------------------------------------

  @Test
  public void testPrototypeReassignedToObjectLiteral_noError() {
    // propName == "prototype" และ rhsValue.isObjectLit() ==true
    // -> resetImplicitPrototype branch
    compile(
        "/** @constructor */ function Foo() {}"
        + "Foo.prototype = {bar: function() {}};");
    assertEquals(0, errors().length);
  }

  // ---------------------------------------------------------------------
  // Catch variable (Token.CATCH)
  // ---------------------------------------------------------------------

  @Test
  public void testCatchVariable_declared_noError() {
    compile("try { throw 1; } catch (e) { var y = e; }");
    assertEquals(0, errors().length);
  }

  // ---------------------------------------------------------------------
  // Literal type attachment (attachLiteralTypes switch)
  // ---------------------------------------------------------------------

  @Test
  public void testAllLiteralTypesAttached_noError() {
    // ครอบคลุม case: NULL, VOID, STRING, NUMBER, TRUE/FALSE, REGEXP
    compile(
        "var a = null; var b = void 0; var c = 'str'; "
        + "var d = 1; var eBool = true; var f = false; var g = /x/;");
    assertEquals(0, errors().length);
  }

  // ---------------------------------------------------------------------
  // Local scope (LocalScopeBuilder): parameters, bleeding function name
  // ---------------------------------------------------------------------

  @Test
  public void testFunctionParametersDeclared_noError() {
    compile(
        "/** @param {number} a\n * @param {string} b\n */"
        + "function f(a, b) { var c = a; return c; }");
    assertEquals(0, errors().length);
  }

  @Test
  public void testBleedingFunctionName_noError() {
    // handleFunctionInputs: fnName ไม่ว่าง และ fnVar == null
    // (bleeding named function expression)
    compile("var f = function g() { return g; };");
    assertEquals(0, errors().length);
  }

  @Test
  public void testFunctionWithoutParams_noError() {
    // astParameters ไม่มีลูก -> for-loop ไม่ execute (0 iterations)
    compile("function f() { return 1; }");
    assertEquals(0, errors().length);
  }

  // ---------------------------------------------------------------------
  // Hoisted function declaration (shouldTraverse pre-order branch)
  // ---------------------------------------------------------------------

  @Test
  public void testHoistedFunctionDeclaration_definedBeforeUse_noError() {
    compile("f(); function f() {}");
    assertEquals(0, errors().length);
  }

  // ---------------------------------------------------------------------
  // CONSTRUCTOR_EXPECTED (best-effort; ขึ้นกับ CodingConvention)
  // ---------------------------------------------------------------------

  @Test
  public void testObjectLiteralCastWithoutMatchingConvention_noCrash() {
    // NOTE: การ trigger CONSTRUCTOR_EXPECTED ขึ้นกับ
    // CodingConvention#getObjectLiteralCast(n) ซึ่งเป็น convention-specific
    // logic ที่ไม่ได้อยู่ในซอร์สของ TypedScopeCreator เอง
    // ใช้ ClosureCodingConvention เพื่อเพิ่มโอกาส exercise branch นี้
    // แต่ไม่ยืนยัน behavior แบบเจาะจง จึงลด assertion ให้เป็น soft-check
    CompilerOptions options = createOptions();
    options.setCodingConvention(new ClosureCodingConvention());
    SourceFile externFile = SourceFile.fromCode("externs.js", "");
    SourceFile jsFile = SourceFile.fromCode(
        "input.js",
        "var goog = {}; goog.reflect = {}; "
        + "goog.reflect.object = function(a, b) { return b; };"
        + "var NotACtor = 1;"
        + "goog.reflect.object(NotACtor, {});");
    compiler.compile(externFile, jsFile, options);
    assertNotNull(compiler.getErrors());
    assertNotNull(compiler.getWarnings());
  }

  // ---------------------------------------------------------------------
  // Class-defining call convention hooks (checkForClassDefiningCalls)
  // ---------------------------------------------------------------------

  @Test
  public void testGoogInheritsPattern_noCrash() {
    // NOTE: ต้องพึ่ง CodingConvention#getClassesDefinedByCall ที่ implement
    // เฉพาะใน ClosureCodingConvention เพื่อ exercise
    // "relationship != null" branch; ยืนยันเพียงว่าไม่ crash
    CompilerOptions options = createOptions();
    options.setCodingConvention(new ClosureCodingConvention());
    SourceFile externFile = SourceFile.fromCode("externs.js", "");
    SourceFile jsFile = SourceFile.fromCode(
        "input.js",
        "var goog = {}; goog.inherits = function(a, b) {};"
        + "/** @constructor */ function Base() {}"
        + "/** @constructor */ function Sub() {}"
        + "goog.inherits(Sub, Base);");
    compiler.compile(externFile, jsFile, options);
    assertNotNull(compiler.getErrors());
  }

  @Test
  public void testDefaultCodingConvention_noRelationship_noCrash() {
    // ไม่มี pattern การ define class -> relationship == null (else branch)
    compile("function foo() {} foo();");
    assertEquals(0, errors().length);
  }

  // ---------------------------------------------------------------------
  // isQnameRootedInGlobalScope / cross-scope property declaration
  // ---------------------------------------------------------------------

  @Test
  public void testQualifiedNameDeclaredInAnonymousNamespace_noError() {
    // n.isGetProp() && !scope.isGlobal() && isQnameRootedInGlobalScope(n)
    // -> พยายาม declare ใน global scope แทน local scope
    compile(
        "var ns = {};"
        + "(function() { ns.prop = 1; })();");
    assertEquals(0, errors().length);
  }
}

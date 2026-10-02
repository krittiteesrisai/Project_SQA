package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * JUnit 4 test suite for {@link TypedScopeCreator}.
 *
 * แนวทางทดสอบ: ใช้ {@link Compiler} จริงในการ parse externs + js source
 * แล้วเรียก {@code new TypedScopeCreator(compiler).createScope(root, null)}
 * โดยตรง จากนั้นตรวจสอบผลลัพธ์ผ่าน {@link Scope}, {@link Scope.Var},
 * และ diagnostics ที่ compiler รายงาน (errors / warnings)
 *
 * ไฟล์นี้ต้องอยู่ใน package com.google.javascript.jscomp เนื่องจาก
 * TypedScopeCreator และสมาชิกที่เกี่ยวข้อง (DiagnosticType คงที่ต่าง ๆ,
 * createInitialScope) เป็น package-private
 */
public class TypedScopeCreatorTest {

  // Externs แบบย่อ กำหนด constructor พื้นฐานที่จำเป็นสำหรับหลาย testcase
  // (native type ส่วนใหญ่ถูกสร้างไว้ล่วงหน้าใน JSTypeRegistry อยู่แล้ว
  // externs นี้เพียงช่วยให้ syntax เช่น @constructor ทำงานได้ราบรื่น)
  private static final String EXTERNS =
      "/** @constructor \n * @param {*=} opt_v \n * @return {!Object} */\n"
      + "function Object(opt_v) {}\n"
      + "/** @constructor \n * @param {...*} var_args */\n"
      + "function Function(var_args) {}\n"
      + "/** @constructor \n * @param {*=} opt_v */\n"
      + "function Array(opt_v) {}\n"
      + "/** @constructor */\n"
      + "function String() {}\n"
      + "/** @constructor */\n"
      + "function Number() {}\n"
      + "/** @constructor */\n"
      + "function Boolean() {}\n"
      + "/** @constructor \n * @param {*=} opt_a \n * @param {*=} opt_b */\n"
      + "function Error(opt_a, opt_b) {}\n"
      + "/** @constructor */\n"
      + "function RegExp() {}\n"
      + "/** @constructor */\n"
      + "function Date() {}\n";

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
  }

  /** Overload หลักที่รับ externs ที่กำหนดเอง (สำหรับ test ที่ต้องแก้ externs) */
  private Scope parseAndCreateScope(String externs, String js) {
    List<SourceFile> externsList =
        ImmutableList.of(SourceFile.fromCode("externs.js", externs));
    List<SourceFile> inputsList =
        ImmutableList.of(SourceFile.fromCode("input.js", js));
    compiler.init(externsList, inputsList, options);

    Node root = compiler.parseInputs();
    assertNotNull("การ parse ล้มเหลว - ตรวจสอบซอร์ส JS ของเทส", root);

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    return creator.createScope(root, null);
  }

  /** ใช้ EXTERNS มาตรฐานของชุดทดสอบนี้ */
  private Scope parseAndCreateScope(String js) {
    return parseAndCreateScope(EXTERNS, js);
  }

  private List<JSError> getWarnings() {
    return ImmutableList.copyOf(compiler.getWarnings());
  }

  private List<JSError> getErrors() {
    return ImmutableList.copyOf(compiler.getErrors());
  }

  // =====================================================================
  // 1) var ธรรมดา ไม่มี JSDoc -> inferred type, ไม่มี error
  //    ครอบคลุม: defineName() branch info == null -> type == null (inferred)
  // =====================================================================
  @Test
  public void testSimpleVarDeclaration_isDeclaredAndInferred() {
    Scope scope = parseAndCreateScope("var x = 1;");
    Scope.Var x = scope.getVar("x");
    assertNotNull("ตัวแปร x ควรถูก declare ใน global scope", x);
    assertTrue("ชนิดของ x ที่ไม่มี JSDoc ควรถูก infer", x.isTypeInferred());
    assertTrue("ไม่ควรมี error", getErrors().isEmpty());
  }

  // =====================================================================
  // 2) var พร้อม @type -> declared (ไม่ inferred)
  //    ครอบคลุม: getDeclaredType() branch info.hasType() == true
  // =====================================================================
  @Test
  public void testVarWithTypeAnnotation_isDeclaredNotInferred() {
    Scope scope = parseAndCreateScope("/** @type {number} */ var x = 1;");
    Scope.Var x = scope.getVar("x");
    assertNotNull(x);
    assertFalse("มี @type annotation จึงไม่ควร inferred", x.isTypeInferred());
    assertEquals("number", x.getType().toString());
  }

  // =====================================================================
  // 3) หลายตัวแปรใน var เดียว + JSDoc -> MULTIPLE_VAR_DEF warning
  //    ครอบคลุม: defineVar() branch n.hasMoreThanOneChild() && info != null
  // =====================================================================
  @Test
  public void testMultipleVarDeclarationWithJSDoc_reportsWarning() {
    parseAndCreateScope("/** @type {number} */ var a = 1, b = 2;");
    boolean found = false;
    for (JSError w : getWarnings()) {
      if (w.getType() == TypeCheck.MULTIPLE_VAR_DEF) {
        found = true;
      }
    }
    assertTrue("ควรพบ MULTIPLE_VAR_DEF warning", found);
  }

  // =====================================================================
  // 4) หลายตัวแปรใน var เดียว ไม่มี JSDoc -> ไม่มี MULTIPLE_VAR_DEF
  //    ครอบคลุม: defineVar() branch n.hasMoreThanOneChild() && info == null
  // =====================================================================
  @Test
  public void testMultipleVarDeclarationNoJSDoc_noWarning() {
    parseAndCreateScope("var a = 1, b = 2;");
    for (JSError w : getWarnings()) {
      assertFalse(w.getType() == TypeCheck.MULTIPLE_VAR_DEF);
    }
  }

  // =====================================================================
  // 5) Function declaration -> declared เป็น FunctionType
  //    ครอบคลุม: defineFunctionLiteral(), NodeUtil.isFunctionDeclaration true
  // =====================================================================
  @Test
  public void testFunctionDeclaration_isDeclaredAsFunctionType() {
    Scope scope = parseAndCreateScope("function foo() {}");
    Scope.Var foo = scope.getVar("foo");
    assertNotNull(foo);
    assertNotNull(foo.getType());
    assertTrue(foo.getType().isFunctionType());
  }

  // =====================================================================
  // 6) @constructor พร้อม initializer -> ไม่ error, prototype ถูก declare
  //    ครอบคลุม: defineSlot() branch fnType.isConstructor() == true,
  //    prototype declare logic
  // =====================================================================
  @Test
  public void testConstructorWithInitializer_declaresPrototype() {
    Scope scope = parseAndCreateScope("/** @constructor */ function Foo() {}");
    assertNotNull(scope.getVar("Foo"));
    assertNotNull("ควรมี Foo.prototype ถูก declare โดย implicit",
        scope.getVar("Foo.prototype"));
    assertTrue(getErrors().isEmpty());
  }

  // =====================================================================
  // 7) @constructor ไม่มี initializer -> CTOR_INITIALIZER error
  //    ครอบคลุม: defineSlot() branch newVar.getInitialValue() == null &&
  //    variableName.equals(instanceType.getReferenceName()) -> fnType.isConstructor()
  // =====================================================================
  @Test
  public void testConstructorWithoutInitializer_reportsCtorInitializerError() {
    parseAndCreateScope("/** @constructor */ var Foo;");
    boolean found = false;
    for (JSError e : getErrors()) {
      if (e.getType() == TypedScopeCreator.CTOR_INITIALIZER) {
        found = true;
      }
    }
    assertTrue("ควรพบ CTOR_INITIALIZER error", found);
  }

  // =====================================================================
  // 8) @interface ไม่มี initializer -> IFACE_INITIALIZER error
  //    ครอบคลุม: defineSlot() branch fnType.isConstructor() == false (isInterface)
  // =====================================================================
  @Test
  public void testInterfaceWithoutInitializer_reportsIfaceInitializerError() {
    parseAndCreateScope("/** @interface */ var Foo;");
    boolean found = false;
    for (JSError e : getErrors()) {
      if (e.getType() == TypedScopeCreator.IFACE_INITIALIZER) {
        found = true;
      }
    }
    assertTrue("ควรพบ IFACE_INITIALIZER error", found);
  }

  // =====================================================================
  // 9) Object literal ธรรมดา -> anonymous object type, ไม่ error
  //    ครอบคลุม: defineObjectLiteral() branch info == null (ไม่มี @lends, ไม่ enum)
  // =====================================================================
  @Test
  public void testObjectLiteral_declaresAnonymousType() {
    Scope scope = parseAndCreateScope("var obj = {a: 1, b: 2};");
    Scope.Var obj = scope.getVar("obj");
    assertNotNull(obj);
    assertNotNull(obj.getType());
    assertTrue(obj.getType().isObject());
  }

  // =====================================================================
  // 10) Enum object literal -> EnumType ถูกสร้าง
  //     ครอบคลุม: createEnumTypeFromNodes() branch rValue.isObjectLit() == true,
  //     valid enum key path
  // =====================================================================
  @Test
  public void testEnumDeclaration_createsEnumType() {
    Scope scope = parseAndCreateScope(
        "/** @enum {number} */ var Color = {RED: 1, GREEN: 2};");
    Scope.Var color = scope.getVar("Color");
    assertNotNull(color);
    assertNotNull(color.getType());
    assertTrue(color.getType().isEnumType());
    assertTrue(getErrors().isEmpty());
  }

  // =====================================================================
  // 11) Enum initializer ไม่ใช่ object literal/enum -> ENUM_INITIALIZER warning
  //     ครอบคลุม: defineSlot() branch type instanceof EnumType && !isValidValue
  // =====================================================================
  @Test
  public void testEnumInitializerNotObjectLiteral_reportsWarning() {
    parseAndCreateScope("/** @enum {number} */ var Color = 5;");
    boolean found = false;
    for (JSError w : getWarnings()) {
      if (w.getType() == TypedScopeCreator.ENUM_INITIALIZER) {
        found = true;
      }
    }
    assertTrue("ควรพบ ENUM_INITIALIZER warning", found);
  }

  // =====================================================================
  // 12) Enum key เป็น getter -> keyName == null -> ENUM_NOT_CONSTANT
  //     ครอบคลุม: createEnumTypeFromNodes() branch keyName == null
  // =====================================================================
  @Test
  public void testEnumWithGetterKey_reportsEnumNotConstant() {
    parseAndCreateScope(
        "/** @enum {number} */ var Color = {get RED() { return 1; }};");
    boolean found = false;
    for (JSError w : getWarnings()) {
      if (w.getType() == TypeCheck.ENUM_NOT_CONSTANT) {
        found = true;
      }
    }
    assertTrue("ควรพบ ENUM_NOT_CONSTANT สำหรับ getter key ใน enum", found);
  }

  // =====================================================================
  // 13) Catch parameter -> declared, inferred
  //     ครอบคลุม: defineCatch(), Token.CATCH case ใน visit()
  // =====================================================================
  @Test
  public void testCatchParameter_isDeclaredInferred() {
    Scope scope = parseAndCreateScope(
        "try { throw 1; } catch (e) { var y = e; }");
    Scope.Var e = scope.getVar("e");
    assertNotNull("ตัวแปร catch e ควรถูก declare", e);
    assertTrue(e.isTypeInferred());
  }

  // =====================================================================
  // 14) Qualified name property assignment พร้อม @type
  //     ครอบคลุม: Token.ASSIGN case, maybeDeclareQualifiedName(),
  //     getDeclaredType() branch info.hasType()
  // =====================================================================
  @Test
  public void testQualifiedNamePropertyAssignment_isDeclared() {
    Scope scope = parseAndCreateScope(
        "var ns = {}; /** @type {number} */ ns.value = 1;");
    Scope.Var val = scope.getVar("ns.value");
    assertNotNull("ns.value ควรถูก declare เป็น qualified name", val);
    assertEquals("number", val.getType().toString());
  }

  // =====================================================================
  // 15) Typedef ที่ evaluate ได้ปกติ -> ไม่มี error
  //     ครอบคลุม: checkForTypedef() branch info.hasTypedefType() == true,
  //     realType != null
  // =====================================================================
  @Test
  public void testTypedef_noErrorForValidTypedef() {
    parseAndCreateScope("/** @typedef {number} */ var MyNum;");
    assertTrue("Typedef ที่ evaluate ได้ ไม่ควร error", getErrors().isEmpty());
  }

  // หมายเหตุ: กรณี MALFORMED_TYPEDEF (realType == null) ไม่ได้เขียนทดสอบ
  // เพราะไม่พบวิธีสร้างอินพุตที่ทำให้ info.getTypedefType().evaluate(...)
  // คืน null ได้อย่างแน่นอนจากซอร์สที่ให้มาเพียงอย่างเดียว (ขึ้นกับ JSTypeExpression
  // ภายในที่ไม่ได้แสดงในซอร์ส) จึงไม่กล่าวอ้าง behavior ที่ไม่มีหลักฐานรองรับ

  // =====================================================================
  // 16) @lends อ้างถึงตัวแปรที่ยังไม่ถูก declare -> UNKNOWN_LENDS
  //     ครอบคลุม: defineObjectLiteral() branch lendsVar == null
  // =====================================================================
  @Test
  public void testLendsOnUndeclaredVariable_reportsUnknownLends() {
    parseAndCreateScope("/** @lends {NotDeclared} */ ({foo: 1});");
    boolean found = false;
    for (JSError w : getWarnings()) {
      if (w.getType() == TypedScopeCreator.UNKNOWN_LENDS) {
        found = true;
      }
    }
    assertTrue("ควรพบ UNKNOWN_LENDS", found);
  }

  // =====================================================================
  // 17) @lends อ้างถึงตัวแปรที่ไม่ใช่ object type -> LENDS_ON_NON_OBJECT
  //     ครอบคลุม: defineObjectLiteral() branch !type.isSubtype(OBJECT_TYPE)
  // =====================================================================
  @Test
  public void testLendsOnNonObjectVariable_reportsLendsOnNonObject() {
    parseAndCreateScope(
        "/** @type {number} */ var num = 1;\n"
        + "/** @lends {num} */ ({foo: 1});");
    boolean found = false;
    for (JSError w : getWarnings()) {
      if (w.getType() == TypedScopeCreator.LENDS_ON_NON_OBJECT) {
        found = true;
      }
    }
    assertTrue("ควรพบ LENDS_ON_NON_OBJECT", found);
  }

  // =====================================================================
  // 18) @lends บนตัวแปรที่เป็น object -> ไม่ error
  //     ครอบคลุม: defineObjectLiteral() branch type.isSubtype(OBJECT_TYPE)==true
  // =====================================================================
  @Test
  public void testLendsOnObjectVariable_noWarning() {
    parseAndCreateScope(
        "/** @constructor */ function Foo() {}\n"
        + "/** @lends {Foo.prototype} */ ({bar: 1});");
    assertTrue(getErrors().isEmpty());
    for (JSError w : getWarnings()) {
      assertFalse(w.getType() == TypedScopeCreator.UNKNOWN_LENDS);
      assertFalse(w.getType() == TypedScopeCreator.LENDS_ON_NON_OBJECT);
    }
  }

  // =====================================================================
  // 19) createInitialScope() ต้อง declare native types หลัก ๆ
  //     ครอบคลุม: createInitialScope() ทุกเรียก declareNativeFunctionType/
  //     declareNativeValueType (boundary: ตรวจสอบตัวแทนบางส่วน)
  // =====================================================================
  @Test
  public void testCreateInitialScope_declaresNativeTypes() {
    List<SourceFile> externsList =
        ImmutableList.of(SourceFile.fromCode("externs.js", EXTERNS));
    List<SourceFile> inputsList =
        ImmutableList.of(SourceFile.fromCode("input.js", "var z = 1;"));
    compiler.init(externsList, inputsList, options);
    Node root = compiler.parseInputs();

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope s = creator.createInitialScope(root);

    assertNotNull(s.getVar("Array"));
    assertNotNull(s.getVar("Object"));
    assertNotNull(s.getVar("Function"));
    assertNotNull(s.getVar("undefined"));
    assertNotNull("ActiveXObject เป็น native value type พิเศษ",
        s.getVar("ActiveXObject"));
  }

  // =====================================================================
  // 20) Empty source (edge case: ค่าว่าง) -> ไม่ error, ไม่มีตัวแปรที่ไม่รู้จัก
  // =====================================================================
  @Test
  public void testEmptySource_noErrorsNoUnexpectedVars() {
    Scope scope = parseAndCreateScope("");
    assertNotNull(scope);
    assertTrue(getErrors().isEmpty());
    assertNull(scope.getVar("nonExistentVar"));
  }

  // =====================================================================
  // 21) Function มี @param -> local scope builder ทำงานผ่าน declareArguments()
  //     ครอบคลุม: LocalScopeBuilder.declareArguments() branch jsDocParameters != null
  // =====================================================================
  @Test
  public void testFunctionWithParams_noErrors() {
    Scope scope = parseAndCreateScope(
        "/** @param {number} a\n * @param {string} b */\n"
        + "function foo(a, b) {}");
    Scope.Var foo = scope.getVar("foo");
    assertNotNull(foo);
    assertTrue(foo.getType().isFunctionType());
    assertTrue(getErrors().isEmpty());
  }

  // =====================================================================
  // 22) Constructor alias: var Bar = Foo; (Foo เป็น @constructor)
  //     ครอบคลุม: createFunctionTypeFromNodes() branch
  //     rValue.isQualifiedName() && scope.isGlobal() && aliasedType.isConstructor()
  // =====================================================================
  @Test
  public void testConstructorAlias_sharesFunctionType() {
    Scope scope = parseAndCreateScope(
        "/** @constructor */ function Foo() {}\n"
        + "var Bar = Foo;");
    Scope.Var foo = scope.getVar("Foo");
    Scope.Var bar = scope.getVar("Bar");
    assertNotNull(foo);
    assertNotNull(bar);
    assertTrue(bar.getType().isFunctionType());
    assertTrue(bar.getType().isConstructor());
  }

  // =====================================================================
  // 23) var ประกาศใน externs โดยไม่มี @type -> UNKNOWN_TYPE (boundary case)
  //     ครอบคลุม: defineName() branch name.isFromExterns() == true, type == null
  // =====================================================================
  @Test
  public void testVarInExterns_typeIsUnknownWhenNoAnnotation() {
    Scope scope = parseAndCreateScope(EXTERNS + "var extVar;", "");
    Scope.Var extVar = scope.getVar("extVar");
    assertNotNull(extVar);
    assertNotNull(extVar.getType());
    assertTrue("ตัวแปรใน externs ที่ไม่มี @type ควรได้ UNKNOWN_TYPE",
        extVar.getType().isUnknownType());
  }

  // =====================================================================
  // 24) Malformed/ไม่มีข้อมูลเพียงพอ: GETPROP stub declaration (ไม่มี rhsValue)
  //     ครอบคลุม: Token.GETPROP case ใน visit(), maybeDeclareQualifiedName()
  //     branch valueType == null && parent.isExprResult() -> stubDeclarations
  // =====================================================================
  @Test
  public void testStubPropertyDeclaration_resolvedToUnknown() {
    Scope scope = parseAndCreateScope(
        "var ns = {}; ns.stubProp;");
    Scope.Var stub = scope.getVar("ns.stubProp");
    assertNotNull("Stub property ควรถูก resolve เป็น UNKNOWN_TYPE ท้ายที่สุด",
        stub);
    assertTrue(stub.getType().isUnknownType());
  }

  // =====================================================================
  // 25) Object literal key ที่เป็น getter (ไม่ใช่ enum) -> ไม่ throw exception
  //     หมายเหตุ: ไม่ assert type ที่แน่ชัดเพราะไม่มีหลักฐานพฤติกรรมที่แน่นอน
  //     จากซอร์สที่ให้มาสำหรับ getter/setter ใน object literal ปกติ
  // =====================================================================
  @Test
  public void testObjectLiteralWithGetter_doesNotThrow() {
    Scope scope = parseAndCreateScope(
        "var obj = { get foo() { return 1; } };");
    assertNotNull(scope.getVar("obj"));
  }
}

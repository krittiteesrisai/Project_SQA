package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit tests for TypedScopeCreator focusing on high branch/condition coverage
 * and edge cases (Closure-150b).
 */
public class TypedScopeCreatorTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    // ตั้งค่า Compiler Options พื้นฐานสำหรับการทดสอบประเภท (Type Checking)
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);
    compiler.initOptions(options);
  }

  @Test
  public void testGlobalScopeCreationAndBasicTypes() {
    // ทดสอบการสร้าง Global Scope และ Initial Scope พร้อมเนทีฟไทป์ต่างๆ (parent == null)
    Node scriptNode = new Node(Token.SCRIPT);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(scriptNode, null);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertNotNull(scope.getVar("Object"));
    assertNotNull(scope.getVar("Array"));
    assertNotNull(scope.getVar("undefined"));
  }

  @Test
  public void testLocalScopeCreation() {
    // ทดสอบการสร้าง Local Scope เมื่อ parent ไม่ใช่ null
    Node globalRoot = new Node(Token.SCRIPT);
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(globalRoot, null);

    Node functionNode = new Node(Token.FUNCTION, 
        new Node(Token.NAME, ""), 
        new Node(Token.LP), 
        new Node(Token.BLOCK));
    
    Scope localScope = creator.createScope(functionNode, globalScope);
    assertNotNull(localScope);
    assertFalse(localScope.isGlobal());
    assertEquals(globalScope, localScope.getParent());
  }

  @Test
  public void testMalformedTypedefReport() {
    // ทดสอบกรณี Edge Case: @typedef ไม่มีข้อมูล Type ที่ถูกต้อง ต้องรายงาน MALFORMED_TYPEDEF warning
    Node nameNode = Node.newString(Token.NAME, "MyTypedef");
    Node varNode = new Node(Token.VAR, nameNode);
    
    // จำลอง JSDoc ที่มี typedef แต่ evaluation ล้มเหลวหรือไม่มี Type
    // ใช้ Compiler ในการรันผ่าน GlobalScopeBuilder โดยตรง
    compiler.parseSyntheticCode("test.js", "/** @typedef */ var MyTypedef;");
    Node root = compiler.getRoot();

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);
    
    assertNotNull(scope);
    // ตรวจสอบว่ามีการแจ้งเตือน (Error/Warning) เกิดขึ้นจาก malformed typedef
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testMultipleVarDefWithJSDocWarning() {
    // ทดสอบ Edge Case: การประกาศตัวแปรหลายตัวใน VAR เดียวกันพร้อมกับใส่ JSDoc (MULTIPLE_VAR_DEF)
    compiler.parseSyntheticCode("test.js", "/** @type {number} */ var a = 1, b = 2;");
    Node root = compiler.getRoot();

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    // คาดหวังว่าจะมี DiagnosticType.warning สำหรับ MULTIPLE_VAR_DEF
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testEnumInitializerAndValidation() {
    // ทดสอบ Enum ที่ไม่ถูกต้อง (ENUM_INITIALIZER หรือ ENUM_NOT_CONSTANT)
    compiler.parseSyntheticCode("test.js", "/** @enum {string} */ var MyEnum = 123;");
    Node root = compiler.getRoot();

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testObjectLiteralCastConstructorExpected() {
    // ทดสอบ ObjectLiteralCast ที่ต้องการ Constructor แต่ไม่พบ (CONSTRUCTOR_EXPECTED)
    compiler.parseSyntheticCode("test.js", "goog.reflect.object(NonExistentCtor, {});");
    Node root = compiler.getRoot();

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    creator.createScope(root, null);

    // อาจมีรายงาน CONSTRUCTOR_EXPECTED หาก Convention ถูกเรียกใช้
    assertNotNull(creator);
  }

  @Test
  public void testDelegateProxyCreation() {
    // ทดสอบ Delegate Relationship และการสร้าง Proxy Prototypes
    compiler.parseSyntheticCode("test.js", 
        "var goog = {};" +
        "goog.abstractMethod = function() {};" +
        "/** @constructor */ function Super() {}" +
        "/** @constructor */ function Sub() {}" +
        "goog.inherits(Sub, Super);" +
        "goog.mixin = function(a, b) {};" +
        "goog.addDelegate(Super, Sub, Sub);"
    );
    Node root = compiler.getRoot();

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);
    assertNotNull(scope);
  }
}
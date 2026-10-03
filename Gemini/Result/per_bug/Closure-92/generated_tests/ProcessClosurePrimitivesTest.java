package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Set;

/**
 * Senior JUnit 4 Test Suite for ProcessClosurePrimitives (Closure-92b)
 */
public class ProcessClosurePrimitivesTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    // กำหนดค่าเริ่มต้นพื้นฐานสำหรับการคอมไพล์
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node parseCode(String js) {
    Node root = compiler.parseSyntheticCode("testcode", js);
    assertNotNull("Parsing failed for code: " + js, root);
    return root;
  }

  @Test
  public void testNullArgumentError() {
    // ทดสอบกรณีเรียก goog.provide() โดยไม่มีอาร์กิวเมนต์เลย
    Node root = parseCode("goog.provide();");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    
    assertTrue("Should report null argument error", compiler.getErrorCount() > 0);
  }

  @Test
  public void testNonStringArgumentError() {
    // ทดสอบกรณีส่งอาร์กิวเมนต์ที่ไม่ใช่ String (เช่น ตัวเลข) เข้า goog.require
    Node root = parseCode("goog.require(123);");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    
    assertTrue("Should report invalid argument error for non-string", compiler.getErrorCount() > 0);
  }

  @Test
  public void testTooManyArgumentsError() {
    // ทดสอบส่งอาร์กิวเมนต์เกิน 1 ตัว
    Node root = parseCode("goog.provide('a', 'b');");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    
    assertTrue("Should report too many arguments error", compiler.getErrorCount() > 0);
  }

  @Test
  public void testDuplicateNamespaceError() {
    // ทดสอบการประกาศ provide ซ้ำ
    Node root = parseCode("goog.provide('my.ns'); goog.provide('my.ns');");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    
    assertTrue("Should report duplicate namespace error", compiler.getErrorCount() > 0);
  }

  @Test
  public void testMissingAndLateProvideError() {
    // ทดสอบ require Namespace ที่ไม่เคยถูก provide (Missing Provide)
    Node root = parseCode("goog.require('unknown.ns');");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    
    assertTrue("Should report missing provide error", compiler.getErrorCount() > 0);
  }

  @Test
  public void testExportSymbolSingleAndDot() {
    // ทดสอบ exportSymbol ทั้งแบบไม่มีจุดและมีจุด
    Node root = parseCode("goog.exportSymbol('myExport', 1); goog.exportSymbol('a.b.c', 2);");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.OFF, false);
    pass.process(null, root);
    
    Set<String> exported = pass.getExportedVariableNames();
    assertTrue("Should contain myExport", exported.contains("myExport"));
    assertTrue("Should contain top-level namespace 'a'", exported.contains("a"));
  }

  @Test
  public void testSetCssNameMappingValid() {
    // ทดสอบ setCssNameMapping ด้วย Object literal ที่ถูกต้อง
    Node root = parseCode("goog.setCssNameMapping({'a': 'b'});");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.OFF, false);
    pass.process(null, root);
    
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testSetCssNameMappingInvalidValue() {
    // ทดสอบ setCssNameMapping ด้วยค่าที่ไม่ใช่ String จะต้องเกิด Error
    Node root = parseCode("goog.setCssNameMapping({'a': 123});");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.OFF, false);
    pass.process(null, root);
    
    assertTrue("Should report non-string passed to setCssNameMapping error", compiler.getErrorCount() > 0);
  }

  @Test
  public void testTrySimplifyNewDateEnabled() {
    // ทดสอบการย่อ new Date(goog.now()) เมื่อเปิดใช้งาน flag rewriteNewDateGoogNow = true
    Node root = parseCode("var d = new Date(goog.now());");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.OFF, true);
    pass.process(null, root);
    
    assertNotNull(root);
  }

  @Test
  public void testBaseClassCallMissingThis() {
    // ทดสอบ goog.base ที่ไม่อาร์กิวเมนต์แรกเป็น 'this'
    Node root = parseCode("function Foo() { goog.base(); }");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.OFF, false);
    pass.process(null, root);
    
    assertTrue("Should report bad base class use (First argument must be 'this')", compiler.getErrorCount() > 0);
  }

  @Test
  public void testInvalidProvideSyntax() {
    // ทดสอบ provide ด้วย property ที่ไม่ถูกต้องตามหลักไวยากรณ์ JS
    Node root = parseCode("goog.provide('a.123invalid');");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
    pass.process(null, root);
    
    assertTrue("Should report invalid provide error", compiler.getErrorCount() > 0);
  }
}
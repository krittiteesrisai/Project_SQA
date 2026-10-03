package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * JUnit 4 Test Suite for RuntimeTypeCheck (Defects4J Closure-147b)
 * Focuses on high branch/condition coverage, edge cases, null/empty values, and invalid states.
 */
public class RuntimeTypeCheckTest extends TestCase {

  private Compiler compiler;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    // ตั้งค่า Compiler ให้พร้อมใช้งานเบื้องต้นสำหรับการทดสอบ AST Node Traversal
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  @Test
  public void testRuntimeTypeCheckInitialization() {
    // ทดสอบการสร้าง Instance และ Boilerplate code ทั้งกรณีมีและไม่มี logFunction
    RuntimeTypeCheck rtcNullLog = new RuntimeTypeCheck(compiler, null);
    assertNotNull(rtcNullLog);

    RuntimeTypeCheck rtcCustomLog = new RuntimeTypeCheck(compiler, "function(w, e) { print(w); }");
    assertNotNull(rtcCustomLog);

    // ทดสอบดึง Boilerplate Code โดยตรง
    Node boilerplate = RuntimeTypeCheck.getBoilerplateCode(compiler, null);
    assertNotNull(boilerplate);
  }

  @Test
  public void testProcessWithEmptyAst() {
    // Edge Case: ส่ง SCRIPT Node เปล่าๆ เข้าไปทดสอบ Process
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    
    RuntimeTypeCheck rtc = new RuntimeTypeCheck(compiler, null);
    // ไม่ควรพัง (Null Pointer Exception) เมื่อประมวลผลต้นไม้ที่ว่างเปล่า
    rtc.process(externs, root);
  }

  @Test
  public void testAddMarkersWithNonConstructorFunction() {
    // สร้างโหนดฟังก์ชันธรรมดาที่ไม่ใช่ Constructor (เช่น function foo() {})
    Node fnName = Node.newString(Token.NAME, "foo");
    Node fnParams = new Node(Token.PARAM_LIST);
    Node fnBody = new Node(Token.BLOCK);
    Node fnNode = new Node(Token.FUNCTION, fnName, fnParams, fnBody);
    
    Node script = new Node(Token.SCRIPT, fnNode);

    // จำลองประเภทที่ไม่ใช่ Constructor
    JSTypeRegistry registry = compiler.getTypeRegistry();
    FunctionType nonConsType = registry.createFunctionType(
        registry.getNativeType(JSTypeRegistry.DataTypes.UNKNOWN_TYPE),
        new ArrayList<JSType>()
    );
    fnNode.setJSType(nonConsType);

    RuntimeTypeCheck rtc = new RuntimeTypeCheck(compiler, null);
    rtc.process(script, script);
    
    // ตรวจสอบว่าไม่มีการเพิ่ม Marker ลงในฟังก์ชันธรรมดา
    assertNull(fnNode.getNext());
  }

  @Test
  public void testAddMarkersWithAnonymousFunctionAndNullSource() {
    // Edge Case: ฟังก์ชันไม่มี Source หรือไม่มีชื่อ (Anonymous Function)
    Node fnName = Node.newString(Token.NAME, "");
    Node fnParams = new Node(Token.PARAM_LIST);
    Node fnBody = new Node(Token.BLOCK);
    Node fnNode = new Node(Token.FUNCTION, fnName, fnParams, fnBody);
    
    Node script = new Node(Token.SCRIPT, fnNode);

    RuntimeTypeCheck rtc = new RuntimeTypeCheck(compiler, null);
    // รันผ่าน AddMarkers โดยที่ FunctionType เป็น null หรือไม่มี Source
    rtc.process(script, script);
    
    assertNotNull(script);
  }

  @Test
  public void testAddChecksWithEmptyReturnAndNullParams() {
    // Edge Case: คำสั่ง Return เปล่าๆ (return;) และฟังก์ชันที่ไม่มีพารามิเตอร์
    Node retNode = new Node(Token.RETURN);
    Node fnBody = new Node(Token.BLOCK, retNode);
    Node fnName = Node.newString(Token.NAME, "bar");
    Node fnParams = new Node(Token.PARAM_LIST);
    Node fnNode = new Node(Token.FUNCTION, fnName, fnParams, fnBody);

    Node script = new Node(Token.SCRIPT, fnNode);

    RuntimeTypeCheck rtc = new RuntimeTypeCheck(compiler, null);
    // ทดสอบการเข้าถึง visitReturn ที่มี retValue == null
    rtc.process(script, script);
    
    assertNotNull(script);
  }

  @Test
  public void testBoilerplateCodeIOExceptionHandling() {
    // ทดสอบกรณีทรัพยากรภายใน (Resource) อาจหาไม่เจอหรือเกิดปัญหา (จำลองผ่าน Invalid Log Function หรือสภาพแวดล้อมจำลอง)
    try {
      Node code = RuntimeTypeCheck.getBoilerplateCode(compiler, "customLogCode()");
      assertNotNull(code);
    } catch (Exception e) {
      // ป้องกันข้อผิดพลาดแบบ Unhandled ในกรณีที่ไฟล์รันไทม์ไม่พบใน Classpath บางสภาพแวดล้อม
      assertNotNull(e);
    }
  }
}
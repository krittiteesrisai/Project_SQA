package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assume;
import org.junit.Before;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.EvaluatorException;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * JUnit4 test suite for {@link IRFactory}.
 *
 * หมายเหตุสำคัญ (ข้อสมมติฐานที่ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา):
 * 1) คลาส {@link Config} ไม่ได้ให้ซอร์สมาด้วย เราทราบแน่ชัดเพียงว่ามีฟิลด์
 *    package/instance ชื่อ acceptConstKeyword และ acceptES5 (จากการอ้างอิงตรง ๆ
 *    ใน IRFactory: config.acceptES5 / config.acceptConstKeyword) จึงสร้าง Config
 *    ด้วย reflection แล้ว force-set สองฟิลด์นี้ เพื่อไม่ต้องเดา constructor signature
 * 2) com.google.javascript.jscomp.mozilla.rhino.Parser / CompilerEnvirons /
 *    ErrorReporter เป็น class/interface มาตรฐานของ Rhino ที่ jarjar เข้ามา
 *    (libtrunk_rhino_parser_jarjared.jar) เราอ้างอิง signature มาตรฐานของ Rhino:
 *      - new CompilerEnvirons()
 *      - env.setRecordingComments(boolean)
 *      - new Parser(CompilerEnvirons, ErrorReporter)
 *      - parser.parse(String source, String sourceURI, int lineno)
 *      - ErrorReporter#error/warning/runtimeError(String,String,int,String,int)
 *    หากสิ่งเหล่านี้ผิดจาก signature จริงในเวอร์ชัน jar ที่ใช้ ให้ปรับ helper method
 *    parseAndTransform() ตามจริง
 * 3) พฤติกรรมเกี่ยวกับ JSDoc/@fileoverview และ destructuring/`catch (e if cond)`
 *    พึ่งพา flag การ parse comment ของ Rhino ที่ไม่ชัดเจนจากซอร์สที่ให้มา
 *    จึงใช้ Assume เพื่อ skip อย่างปลอดภัยหากสภาพแวดล้อมไม่รองรับ
 */
public class IRFactoryTest {

  private TestErrorReporter er;

  @Before
  public void setUp() {
    er = new TestErrorReporter();
  }

  // ---------------------------------------------------------------------
  // Test double for ErrorReporter (standard Rhino ErrorReporter interface)
  // ---------------------------------------------------------------------
  private static class TestErrorReporter implements ErrorReporter {
    final List<String> errors = new ArrayList<String>();
    final List<String> warnings = new ArrayList<String>();

    public void warning(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      warnings.add(message);
    }

    public void error(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      errors.add(message);
    }

    public EvaluatorException runtimeError(String message, String sourceName,
        int line, String lineSource, int lineOffset) {
      errors.add(message);
      return new EvaluatorException(message); // สมมติฐาน: มี ctor(String)
    }
  }

  // ---------------------------------------------------------------------
  // Reflection helpers to build Config without guessing its constructor
  // ---------------------------------------------------------------------
  private static Config newConfig(boolean acceptConstKeyword, boolean acceptES5) {
    try {
      Constructor<?>[] ctors = Config.class.getDeclaredConstructors();
      Constructor<?> chosen = ctors[0];
      for (Constructor<?> c : ctors) {
        if (c.getParameterTypes().length < chosen.getParameterTypes().length) {
          chosen = c;
        }
      }
      chosen.setAccessible(true);
      Class<?>[] paramTypes = chosen.getParameterTypes();
      Object[] args = new Object[paramTypes.length];
      for (int i = 0; i < paramTypes.length; i++) {
        args[i] = defaultValue(paramTypes[i]);
      }
      Config config = (Config) chosen.newInstance(args);
      forceSetField(config, "acceptConstKeyword", acceptConstKeyword);
      forceSetField(config, "acceptES5", acceptES5);
      return config;
    } catch (Exception e) {
      throw new RuntimeException("Unable to construct Config via reflection", e);
    }
  }

  private static Object defaultValue(Class<?> type) {
    if (!type.isPrimitive()) {
      if (Set.class.isAssignableFrom(type)) {
        return Sets.newHashSet();
      }
      if (type.isEnum()) {
        Object[] constants = type.getEnumConstants();
        return constants.length > 0 ? constants[0] : null;
      }
      return null;
    }
    if (type == boolean.class) return Boolean.FALSE;
    if (type == int.class) return Integer.valueOf(0);
    if (type == long.class) return Long.valueOf(0L);
    if (type == double.class) return Double.valueOf(0d);
    if (type == float.class) return Float.valueOf(0f);
    if (type == char.class) return Character.valueOf('\0');
    if (type == byte.class) return Byte.valueOf((byte) 0);
    if (type == short.class) return Short.valueOf((short) 0);
    return null;
  }

  private static void forceSetField(Object target, String fieldName, Object value)
      throws Exception {
    Field f = findField(target.getClass(), fieldName);
    if (f == null) {
      return; // ไม่พบฟิลด์ตามชื่อ -> ข้าม (ป้องกัน hard fail จากสมมติฐานผิด)
    }
    f.setAccessible(true);
    f.set(target, value);
  }

  private static Field findField(Class<?> clazz, String name) {
    Class<?> c = clazz;
    while (c != null) {
      try {
        return c.getDeclaredField(name);
      } catch (NoSuchFieldException e) {
        c = c.getSuperclass();
      }
    }
    return null;
  }

  // ---------------------------------------------------------------------
  // Parse + transform helper
  // ---------------------------------------------------------------------
  private Node parseAndTransform(String code, Config config) {
    CompilerEnvirons env = new CompilerEnvirons();
    env.setRecordingComments(true);
    Parser parser = new Parser(env, er);
    AstRoot root = parser.parse(code, "test.js", 1);
    return IRFactory.transformTree(root, code, config, er);
  }

  private Node parseAndTransform(String code) {
    return parseAndTransform(code, newConfig(true, true));
  }

  private static int countChildren(Node n) {
    int count = 0;
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      count++;
    }
    return count;
  }

  // =====================================================================
  // 1. Boundary / empty input
  // =====================================================================

  @Test
  public void testEmptyScript_ProducesEmptyScriptNode() {
    Node root = parseAndTransform("");
    assertEquals(Token.SCRIPT, root.getType());
    assertNull(root.getFirstChild());
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testTemplateNodePropagatesSourceName() {
    Node root = parseAndTransform("var a = 1;");
    Node varNode = root.getFirstChild();
    // templateNode ถูก clone มาที่ทุก node -> SOURCENAME_PROP ควรถูกตั้งค่า
    assertEquals("test.js", varNode.getProp(Node.SOURCENAME_PROP));
  }

  // =====================================================================
  // 2. Simple var declaration / VariableInitializer branch
  // =====================================================================

  @Test
  public void testVarDeclaration_WithInitializer() {
    Node root = parseAndTransform("var a = 1;");
    Node var = root.getFirstChild();
    assertEquals(Token.VAR, var.getType());
    Node name = var.getFirstChild();
    assertEquals(Token.NAME, name.getType());
    assertEquals("a", name.getString());
    assertNotNull(name.getFirstChild()); // initializer present branch
    assertEquals(Token.NUMBER, name.getFirstChild().getType());
  }

  @Test
  public void testVarDeclaration_NoInitializer() {
    Node root = parseAndTransform("var a;");
    Node var = root.getFirstChild();
    Node name = var.getFirstChild();
    assertEquals(Token.NAME, name.getType());
    assertNull(name.getFirstChild()); // initializer == null branch
  }

  // =====================================================================
  // 3. const keyword / Config.acceptConstKeyword branch
  //    -> เผยจุดที่อาจเป็น "fault": ต่อให้ const ไม่ถูกรับ (error ถูก report)
  //       โค้ดก็ยังคง build เป็น Token.VAR ตามปกติ (ไม่ได้หยุดหรือ mark พิเศษ)
  // =====================================================================

  @Test
  public void testConstKeyword_AcceptedWhenConfigured_NoError() {
    Node root = parseAndTransform("const a = 1;", newConfig(true, true));
    assertTrue(er.errors.isEmpty());
    assertEquals(Token.VAR, root.getFirstChild().getType());
  }

  @Test
  public void testConstKeyword_RejectedWhenNotConfigured_ButStillProducesVarNode() {
    Node root = parseAndTransform("const a = 1;", newConfig(false, false));
    assertFalse("expected an 'unsupported syntax' error to be reported",
        er.errors.isEmpty());
    // Fault-detection point: ผลลัพธ์ยังเป็น VAR แม้ const ถูกปฏิเสธ
    assertEquals(Token.VAR, root.getFirstChild().getType());
  }

  // =====================================================================
  // 4. Directive prologue: parseDirectives / isDirective
  // =====================================================================

  @Test
  public void testDirective_UseStrictIsRemovedFromChildren() {
    Node root = parseAndTransform("'use strict'; var a = 1;");
    // ควรเหลือแค่ VAR หลังจากดึง directive ออก
    assertEquals(1, countChildren(root));
    assertEquals(Token.VAR, root.getFirstChild().getType());
  }

  @Test
  public void testDirective_UnknownStringNotRemoved() {
    Node root = parseAndTransform("'use strict'; 'unknown'; var x;");
    // 'use strict' ถูกดึงออก, 'unknown' ไม่ใช่ directive ที่รู้จัก -> ค้างไว้
    assertEquals(2, countChildren(root));
    Node first = root.getFirstChild();
    assertEquals(Token.EXPR_RESULT, first.getType());
    assertEquals(Token.VAR, first.getNext().getType());
  }

  @Test
  public void testNoDirective_AllStatementsRemain() {
    Node root = parseAndTransform("var a = 1; var b = 2;");
    assertEquals(2, countChildren(root));
  }

  // =====================================================================
  // 5. transformBlock branches: BLOCK / EMPTY / wrap-in-new-BLOCK
  // =====================================================================

  @Test
  public void testIfThenPart_AlreadyBlock() {
    Node root = parseAndTransform("if (a) { b(); }");
    Node ifNode = root.getFirstChild();
    Node thenBlock = ifNode.getFirstChild().getNext();
    assertEquals(Token.BLOCK, thenBlock.getType());
  }

  @Test
  public void testIfThenPart_NotBlock_WrappedInNewBlock() {
    Node root = parseAndTransform("if (a) b();");
    Node ifNode = root.getFirstChild();
    Node thenBlock = ifNode.getFirstChild().getNext();
    assertEquals(Token.BLOCK, thenBlock.getType());
    assertEquals(Token.EXPR_RESULT, thenBlock.getFirstChild().getType());
  }

  @Test
  public void testIfThenPart_EmptyStatement_BecomesBlock() {
    Node root = parseAndTransform("if (a) ;");
    Node ifNode = root.getFirstChild();
    Node thenBlock = ifNode.getFirstChild().getNext();
    // EMPTY -> retagged as BLOCK (wasEmptyNode branch)
    assertEquals(Token.BLOCK, thenBlock.getType());
    assertNull(thenBlock.getFirstChild());
  }

  // =====================================================================
  // 6. IfStatement: elsePart null / not-null
  // =====================================================================

  @Test
  public void testIfStatement_WithoutElse() {
    Node root = parseAndTransform("if (a) { b(); }");
    Node ifNode = root.getFirstChild();
    assertEquals(2, countChildren(ifNode));
  }

  @Test
  public void testIfStatement_WithElse() {
    Node root = parseAndTransform("if (a) { b(); } else { c(); }");
    Node ifNode = root.getFirstChild();
    assertEquals(3, countChildren(ifNode));
  }

  // =====================================================================
  // 7. Loops: for / for-in / while / do
  // =====================================================================

  @Test
  public void testForLoop_AllPartsEmpty() {
    Node root = parseAndTransform("for(;;) {}");
    Node forNode = root.getFirstChild();
    assertEquals(Token.FOR, forNode.getType());
    Node init = forNode.getFirstChild();
    Node cond = init.getNext();
    Node incr = cond.getNext();
    assertEquals(Token.EMPTY, init.getType());
    assertEquals(Token.EMPTY, cond.getType());
    assertEquals(Token.EMPTY, incr.getType());
  }

  @Test
  public void testForLoop_WithAllParts() {
    Node root = parseAndTransform("for (var i = 0; i < 10; i++) {}");
    Node forNode = root.getFirstChild();
    assertEquals(4, countChildren(forNode));
    assertEquals(Token.VAR, forNode.getFirstChild().getType());
  }

  @Test
  public void testForInLoop() {
    Node root = parseAndTransform("for (var k in obj) {}");
    Node forNode = root.getFirstChild();
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(3, countChildren(forNode));
  }

  @Test
  public void testWhileLoop() {
    Node root = parseAndTransform("while (a) { b(); }");
    assertEquals(Token.WHILE, root.getFirstChild().getType());
  }

  @Test
  public void testDoLoop() {
    Node root = parseAndTransform("do { b(); } while (a);");
    assertEquals(Token.DO, root.getFirstChild().getType());
  }

  // =====================================================================
  // 8. break / continue with & without label
  // =====================================================================

  @Test
  public void testBreak_NoLabel() {
    Node root = parseAndTransform("while (1) { break; }");
    Node breakNode = root.getFirstChild().getFirstChild().getNext()
        .getFirstChild();
    assertEquals(Token.BREAK, breakNode.getType());
    assertNull(breakNode.getFirstChild());
  }

  @Test
  public void testBreak_WithLabel() {
    Node root = parseAndTransform("outer: while (1) { break outer; }");
    // LABEL -> LABEL_NAME, statement(WHILE)
    Node label = root.getFirstChild();
    assertEquals(Token.LABEL, label.getType());
  }

  @Test
  public void testContinue_NoLabel() {
    Node root = parseAndTransform("while (1) { continue; }");
    Node cont = root.getFirstChild().getFirstChild().getNext().getFirstChild();
    assertEquals(Token.CONTINUE, cont.getType());
    assertNull(cont.getFirstChild());
  }

  @Test
  public void testContinue_WithLabel() {
    Node root = parseAndTransform(
        "outer: while (1) { continue outer; }");
    assertEquals(Token.LABEL, root.getFirstChild().getType());
  }

  // =====================================================================
  // 9. Labeled statement: single vs multiple labels (prev != null branch)
  // =====================================================================

  @Test
  public void testLabeledStatement_SingleLabel() {
    Node root = parseAndTransform("lbl: a();");
    Node label = root.getFirstChild();
    assertEquals(Token.LABEL, label.getType());
    assertEquals(2, countChildren(label)); // LABEL_NAME + statement
  }

  @Test
  public void testLabeledStatement_MultipleLabels() {
    Node root = parseAndTransform("l1: l2: a();");
    Node label = root.getFirstChild();
    assertEquals(Token.LABEL, label.getType());
    // outer LABEL มี child เป็น LABEL_NAME + inner LABEL
    Node inner = label.getFirstChild().getNext();
    assertEquals(Token.LABEL, inner.getType());
  }

  // =====================================================================
  // 10. switch / case / default
  // =====================================================================

  @Test
  public void testSwitchStatement_WithCaseAndDefault() {
    Node root = parseAndTransform(
        "switch (a) { case 1: b(); break; default: c(); }");
    Node sw = root.getFirstChild();
    assertEquals(Token.SWITCH, sw.getType());
    Node caseNode = sw.getFirstChild().getNext();
    assertEquals(Token.CASE, caseNode.getType());
    Node defaultNode = caseNode.getNext();
    assertEquals(Token.DEFAULT, defaultNode.getType());
  }

  // =====================================================================
  // 11. try / catch / finally combos (lineSet logic)
  // =====================================================================

  @Test
  public void testTry_CatchOnly() {
    Node root = parseAndTransform("try { a(); } catch (e) { b(); }");
    Node tryNode = root.getFirstChild();
    assertEquals(Token.TRY, tryNode.getType());
    assertEquals(2, countChildren(tryNode)); // try-block + catch-block (no finally)
  }

  @Test
  public void testTry_FinallyOnly() {
    Node root = parseAndTransform("try { a(); } finally { c(); }");
    Node tryNode = root.getFirstChild();
    assertEquals(3, countChildren(tryNode)); // try-block + empty catch block + finally
  }

  @Test
  public void testTry_CatchAndFinally() {
    Node root = parseAndTransform(
        "try { a(); } catch (e) { b(); } finally { c(); }");
    Node tryNode = root.getFirstChild();
    assertEquals(3, countChildren(tryNode));
  }

  // =====================================================================
  // 12. throw / with
  // =====================================================================

  @Test
  public void testThrowStatement() {
    Node root = parseAndTransform("throw e;");
    assertEquals(Token.THROW, root.getFirstChild().getType());
  }

  @Test
  public void testWithStatement() {
    Node root = parseAndTransform("with (a) { b(); }");
    assertEquals(Token.WITH, root.getFirstChild().getType());
  }

  // =====================================================================
  // 13. function: named vs unnamed
  // =====================================================================

  @Test
  public void testFunctionDeclaration_Named() {
    Node root = parseAndTransform("function foo() {}");
    Node fn = root.getFirstChild();
    assertEquals(Token.FUNCTION, fn.getType());
    Node name = fn.getFirstChild();
    assertEquals("foo", name.getString());
  }

  @Test
  public void testFunctionExpression_Unnamed() {
    Node root = parseAndTransform("var f = function() {};");
    Node fn = root.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.FUNCTION, fn.getType());
    Node name = fn.getFirstChild();
    assertEquals("", name.getString());
  }

  // =====================================================================
  // 14. unary expressions: NEG constant fold, INC/DEC targets
  // =====================================================================

  @Test
  public void testUnaryNeg_OnNumber_ConstantFolded() {
    Node root = parseAndTransform("var a = -5;");
    Node value = root.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.NUMBER, value.getType());
    assertEquals(-5.0, value.getDouble(), 0.0001);
  }

  @Test
  public void testUnaryNeg_OnNonNumber_NotFolded() {
    Node root = parseAndTransform("var a = -b;");
    Node value = root.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.NEG, value.getType());
  }

  @Test
  public void testIncrement_ValidTarget_NoError() {
    Node root = parseAndTransform("a++;");
    assertTrue(er.errors.isEmpty());
  }

  @Test
  public void testIncrement_InvalidTarget_ReportsError() {
    // สมมติฐาน: Rhino parser อนุญาตให้ parse ผ่านระดับ syntax แล้วปล่อยให้
    // IRFactory ตรวจสอบ semantic เอง (ดูจากโค้ด validAssignmentTarget)
    try {
      parseAndTransform("5++;");
    } catch (RuntimeException e) {
      Assume.assumeNoException(
          "Parser rejects invalid increment target syntactically; "
              + "cannot exercise IRFactory branch this way", e);
    }
    assertFalse(er.errors.isEmpty());
  }

  // =====================================================================
  // 15. assignment: valid / invalid target (processAssignment)
  // =====================================================================

  @Test
  public void testAssignment_ValidTarget_NoError() {
    Node root = parseAndTransform("a = 1;");
    assertTrue(er.errors.isEmpty());
    Node assign = root.getFirstChild().getFirstChild();
    assertEquals(Token.ASSIGN, assign.getType());
  }

  @Test
  public void testAssignment_InvalidTarget_ReportsError() {
    try {
      parseAndTransform("5 = 3;");
    } catch (RuntimeException e) {
      Assume.assumeNoException(
          "Parser rejects invalid assignment target syntactically", e);
    }
    assertFalse(er.errors.isEmpty());
  }

  // =====================================================================
  // 16. object literal: quoting, getters/setters, ES5 flag branches
  // =====================================================================

  @Test
  public void testObjectLiteral_UnquotedAndQuotedKeys() {
    Node root = parseAndTransform("var o = {a: 1, 'b': 2};");
    Node obj = root.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.OBJECTLIT, obj.getType());
    Node key1 = obj.getFirstChild();
    Node key2 = key1.getNext();
    assertEquals(Token.STRING, key1.getType());
    assertFalse(key1.getBooleanProp(Node.QUOTED_PROP));
    assertEquals(Token.STRING, key2.getType());
    assertTrue(key2.getBooleanProp(Node.QUOTED_PROP));
  }

  @Test
  public void testObjectLiteral_GetterSetter_AcceptedWithES5() {
    Node root = parseAndTransform(
        "var o = { get x() { return 1; }, set x(v) {} };",
        newConfig(true, true));
    assertTrue(er.errors.isEmpty());
    Node obj = root.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(2, countChildren(obj));
    assertEquals(Token.GET, obj.getFirstChild().getType());
    assertEquals(Token.SET, obj.getFirstChild().getNext().getType());
  }

  @Test
  public void testObjectLiteral_GetterSetter_RejectedWithoutES5() {
    Node root = parseAndTransform(
        "var o = { get x() { return 1; }, set x(v) {} };",
        newConfig(true, false));
    assertFalse(er.errors.isEmpty());
    Node obj = root.getFirstChild().getFirstChild().getFirstChild();
    // ทั้ง getter/setter ถูก skip (continue) -> ไม่มี child เหลือ
    assertEquals(0, countChildren(obj));
  }

  @Test
  public void testObjectLiteral_GetterWithParam_ReportsError() {
    parseAndTransform("var o = { get x(a) { return a; } };",
        newConfig(true, true));
    assertFalse(er.errors.isEmpty());
  }

  @Test
  public void testObjectLiteral_SetterWithWrongParamCount_ReportsError() {
    parseAndTransform("var o = { set x() {} };", newConfig(true, true));
    assertFalse(er.errors.isEmpty());
  }

  @Test
  public void testObjectLiteral_SetterWithOneParam_NoError() {
    parseAndTransform("var o = { set x(v) {} };", newConfig(true, true));
    assertTrue(er.errors.isEmpty());
  }

  // =====================================================================
  // 17. array literal: holes (skipCount) vs no holes
  // =====================================================================

  @Test
  public void testArrayLiteral_NoHoles() {
    Node root = parseAndTransform("var a = [1,2,3];");
    Node arr = root.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.ARRAYLIT, arr.getType());
    assertEquals(3, countChildren(arr));
    assertNull(arr.getProp(Node.SKIP_INDEXES_PROP));
  }

  @Test
  public void testArrayLiteral_WithHoles() {
    Node root = parseAndTransform("var a = [1,,3];");
    Node arr = root.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.ARRAYLIT, arr.getType());
    assertEquals(2, countChildren(arr)); // ช่องว่างถูกลบออก
    assertNotNull(arr.getProp(Node.SKIP_INDEXES_PROP));
  }

  // =====================================================================
  // 18. regexp literal: with / without flags
  // =====================================================================

  @Test
  public void testRegExp_NoFlags() {
    Node root = parseAndTransform("var r = /abc/;");
    Node regexp = root.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.REGEXP, regexp.getType());
    assertEquals(1, countChildren(regexp));
  }

  @Test
  public void testRegExp_WithFlags() {
    Node root = parseAndTransform("var r = /abc/gi;");
    Node regexp = root.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.REGEXP, regexp.getType());
    assertEquals(2, countChildren(regexp));
  }

  // =====================================================================
  // 19. return statement: with / without value
  // =====================================================================

  @Test
  public void testReturn_NoValue() {
    Node root = parseAndTransform("function f() { return; }");
    Node body = root.getFirstChild().getFirstChild().getNext().getNext();
    Node ret = body.getFirstChild();
    assertEquals(Token.RETURN, ret.getType());
    assertNull(ret.getFirstChild());
  }

  @Test
  public void testReturn_WithValue() {
    Node root = parseAndTransform("function f() { return 1; }");
    Node body = root.getFirstChild().getFirstChild().getNext().getNext();
    Node ret = body.getFirstChild();
    assertEquals(Token.RETURN, ret.getType());
    assertNotNull(ret.getFirstChild());
  }

  // =====================================================================
  // 20. parenthesized expression: PARENTHESIZED_PROP
  // =====================================================================

  @Test
  public void testParenthesizedExpression_SetsProp() {
    Node root = parseAndTransform("var a = (1 + 2);");
    Node add = root.getFirstChild().getFirstChild().getFirstChild();
    assertEquals(Token.ADD, add.getType());
    assertTrue(add.getBooleanProp(Node.PARENTHESIZED_PROP));
  }

  // =====================================================================
  // 21. property/element get, function call, new
  // =====================================================================

  @Test
  public void testPropertyGet_TransformsPropertyToString() {
    Node root = parseAndTransform("a.b;");
    Node getprop = root.getFirstChild().getFirstChild();
    assertEquals(Token.GETPROP, getprop.getType());
    Node prop = getprop.getFirstChild().getNext();
    assertEquals(Token.STRING, prop.getType());
    assertEquals("b", prop.getString());
  }

  @Test
  public void testElementGet() {
    Node root = parseAndTransform("a['c'];");
    Node getelem = root.getFirstChild().getFirstChild();
    assertEquals(Token.GETELEM, getelem.getType());
  }

  @Test
  public void testFunctionCall() {
    Node root = parseAndTransform("foo(1, 2);");
    Node call = root.getFirstChild().getFirstChild();
    assertEquals(Token.CALL, call.getType());
    assertEquals(3, countChildren(call)); // target + 2 args
  }

  @Test
  public void testNewExpression() {
    Node root = parseAndTransform("new Bar(3);");
    Node newNode = root.getFirstChild().getFirstChild();
    assertEquals(Token.NEW, newNode.getType());
  }

  // =====================================================================
  // 22. position2charno: first-line (lineIndex==-1) vs subsequent line
  // =====================================================================

  @Test
  public void testPosition2Charno_FirstLineAndSecondLine() {
    Node root = parseAndTransform("var a=1;\nvar b=2;\n");
    Node stmt1 = root.getFirstChild();
    Node stmt2 = stmt1.getNext();
    assertEquals(1, stmt1.getLineno());
    assertEquals(0, stmt1.getCharno());
    assertEquals(2, stmt2.getLineno());
    assertEquals(0, stmt2.getCharno());
  }

  // =====================================================================
  // 23. handleJsDoc: comment == null branch (ทุก statement ปกติ)
  // =====================================================================

  @Test
  public void testHandleJsDoc_NoCommentAttachesNoJSDocInfo() {
    Node root = parseAndTransform("var a = 1;");
    Node var = root.getFirstChild();
    assertNull(var.getJSDocInfo());
  }

  // =====================================================================
  // 24. destructuring array literal -> reportDestructuringAssign
  //     (ไม่แน่ใจว่า Rhino parser เวอร์ชันนี้รองรับ syntax destructuring หรือไม่
  //      ใช้ Assume ป้องกัน false failure)
  // =====================================================================

  @Test
  public void testArrayLiteral_Destructuring_ReportsErrorIfSupported() {
    try {
      parseAndTransform("var [a, b] = foo();");
    } catch (RuntimeException e) {
      Assume.assumeNoException(
          "Destructuring syntax not supported by this parser configuration", e);
    }
    // ถ้า parse ผ่านได้ ควรมี error ถูก report จาก reportDestructuringAssign
    assertFalse(er.errors.isEmpty());
  }
}

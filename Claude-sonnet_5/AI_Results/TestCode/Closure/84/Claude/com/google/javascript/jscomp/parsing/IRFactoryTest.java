package com.google.javascript.jscomp.parsing;

// NOTE: import ตามข้อกำหนด (คลาสอยู่ package เดียวกับ target จึงไม่บังคับ แต่ใส่ตามที่กำหนดไว้)
import com.google.javascript.jscomp.parsing.IRFactory;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Unit tests for {@link IRFactory}.
 *
 * ดูหมายเหตุด้านบนเรื่องข้อสมมติของ API ภายนอกที่ไม่ได้แสดง source มาให้.
 */
public class IRFactoryTest {

  private static final String SOURCE_NAME = "in.js";

  // ---------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------

  /** เก็บ error/warning ที่ IRFactory / Parser รายงานออกมา ผ่าน dynamic proxy
   *  เพื่อไม่ต้อง "เดา" signature ที่แน่นอนของ interface ErrorReporter ทั้งหมด
   *  (รู้แน่ชัดแค่ error(String,...) และ warning(String,...) จาก source ของ IRFactory) */
  static class ErrorCollector {
    final List<String> errors = new ArrayList<String>();
    final List<String> warnings = new ArrayList<String>();

    ErrorReporter asErrorReporter() {
      return (ErrorReporter) Proxy.newProxyInstance(
          ErrorReporter.class.getClassLoader(),
          new Class<?>[] { ErrorReporter.class },
          new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
              String name = method.getName();
              if (args != null && args.length > 0) {
                if ("error".equals(name)) {
                  errors.add(String.valueOf(args[0]));
                } else if ("warning".equals(name)) {
                  warnings.add(String.valueOf(args[0]));
                }
              }
              return null; // ใช้ได้กับ method ที่ return type เป็น object/void
            }
          });
    }
  }

  private static boolean containsSubstring(List<String> list, String needle) {
    for (String s : list) {
      if (s != null && s.contains(needle)) {
        return true;
      }
    }
    return false;
  }

  /** สร้าง Config ด้วย reflection แบบ defensive เนื่องจากไม่รู้ constructor จริง
   *  รู้แน่ชัดแค่ว่ามี field ชื่อ acceptES5 (จากการอ้างอิง config.acceptES5 ใน source) */
  private static Config newConfigInstance(boolean acceptES5) throws Exception {
    Exception last = null;
    for (Constructor<?> ctor : Config.class.getDeclaredConstructors()) {
      try {
        ctor.setAccessible(true);
        Class<?>[] paramTypes = ctor.getParameterTypes();
        Object[] args = new Object[paramTypes.length];
        for (int i = 0; i < paramTypes.length; i++) {
          args[i] = defaultValueFor(paramTypes[i]);
        }
        Config config = (Config) ctor.newInstance(args);
        Field f = Config.class.getDeclaredField("acceptES5");
        f.setAccessible(true);
        f.setBoolean(config, acceptES5);
        return config;
      } catch (Exception e) {
        last = e;
      }
    }
    throw new RuntimeException("Cannot construct Config via reflection", last);
  }

  private static Object defaultValueFor(Class<?> type) {
    if (type == boolean.class) return Boolean.FALSE;
    if (type == int.class) return Integer.valueOf(0);
    if (type == long.class) return Long.valueOf(0L);
    if (type == double.class) return Double.valueOf(0d);
    if (type == float.class) return Float.valueOf(0f);
    if (type == short.class) return Short.valueOf((short) 0);
    if (type == byte.class) return Byte.valueOf((byte) 0);
    if (type == char.class) return Character.valueOf('\0');
    if (Set.class.isAssignableFrom(type)) {
      return Sets.newHashSet();
    }
    return null;
  }

  private Node parse(String js) throws Exception {
    return parse(js, true, new ErrorCollector());
  }

  private Node parse(String js, boolean acceptES5, ErrorCollector ec) throws Exception {
    // NOTE: สมมติ API มาตรฐานของ Rhino Parser/CompilerEnvirons (ไม่ได้แสดง source มาให้)
    CompilerEnvirons env = new CompilerEnvirons();
    env.setRecordingComments(true);
    ErrorReporter er = ec.asErrorReporter();
    Parser parser = new Parser(env, er);
    AstRoot root = parser.parse(js, SOURCE_NAME, 1);
    Config config = newConfigInstance(acceptES5);
    return IRFactory.transformTree(root, js, config, er);
  }

  private static Node getChild(Node n, int index) {
    Node c = n.getFirstChild();
    for (int i = 0; i < index; i++) {
      c = c.getNext();
    }
    return c;
  }

  /** ดึง expression ภายใน EXPR_RESULT ตัวแรกของ script */
  private static Node firstExpr(Node script) {
    Node stmt = script.getFirstChild();
    assertEquals(Token.EXPR_RESULT, stmt.getType());
    return stmt.getFirstChild();
  }

  /** ดึงค่า initializer ของ var แรกใน script (ตาม processVariableInitializer
   *  ซึ่ง addChildToBack initializer เข้ากับ NAME node โดยตรง) */
  private static Node firstVarValue(Node script) {
    Node varNode = script.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    return nameNode.getFirstChild();
  }

  // ---------------------------------------------------------------------
  // A. Directive prologue (parseDirectives / isDirective ผ่าน transform จริง)
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyScript_NoChildren() throws Exception {
    Node script = parse("");
    assertEquals(Token.SCRIPT, script.getType());
    assertFalse(script.hasChildren());
  }

  @Test
  public void testUseStrictDirective_RemovedFromChildren() throws Exception {
    Node script = parse("'use strict'; var x = 1;");
    assertEquals(1, script.getChildCount());
    assertEquals(Token.VAR, script.getFirstChild().getType());
  }

  @Test
  public void testDuplicateDirectives_BothRemoved() throws Exception {
    Node script = parse("'use strict'; 'use strict'; var x = 1;");
    assertEquals(1, script.getChildCount());
    assertEquals(Token.VAR, script.getFirstChild().getType());
  }

  @Test
  public void testNonAllowedDirective_NotRemoved() throws Exception {
    Node script = parse("'random directive'; var x = 1;");
    assertEquals(2, script.getChildCount());
    assertEquals(Token.EXPR_RESULT, script.getFirstChild().getType());
  }

  // ---------------------------------------------------------------------
  // B. If / transformBlock
  // ---------------------------------------------------------------------

  @Test
  public void testIf_NoElse_TwoChildren() throws Exception {
    Node ifNode = parse("if (a) { b; }").getFirstChild();
    assertEquals(Token.IF, ifNode.getType());
    assertEquals(2, ifNode.getChildCount());
  }

  @Test
  public void testIf_WithElse_ThreeChildren() throws Exception {
    Node ifNode = parse("if (a) { b; } else { c; }").getFirstChild();
    assertEquals(3, ifNode.getChildCount());
  }

  @Test
  public void testIf_ThenNonBlockStatement_WrappedInBlock() throws Exception {
    Node ifNode = parse("if (a) b;").getFirstChild();
    Node thenPart = getChild(ifNode, 1);
    assertEquals(Token.BLOCK, thenPart.getType());
    assertEquals(1, thenPart.getChildCount());
    assertEquals(Token.EXPR_RESULT, thenPart.getFirstChild().getType());
  }

  @Test
  public void testIf_ThenEmptyStatement_RetypedToEmptyBlock() throws Exception {
    Node ifNode = parse("if (a) ;").getFirstChild();
    Node thenPart = getChild(ifNode, 1);
    assertEquals(Token.BLOCK, thenPart.getType()); // EMPTY -> BLOCK (setWasEmptyNode)
    assertEquals(0, thenPart.getChildCount());
  }

  // ---------------------------------------------------------------------
  // C. Loops
  // ---------------------------------------------------------------------

  @Test
  public void testForLoop_FourChildren() throws Exception {
    Node forNode = parse("for (var i = 0; i < 10; i++) { x; }").getFirstChild();
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(4, forNode.getChildCount());
    assertEquals(Token.BLOCK, forNode.getLastChild().getType());
  }

  @Test
  public void testForInLoop_ThreeChildren() throws Exception {
    Node forNode = parse("for (var k in obj) { x; }").getFirstChild();
    assertEquals(Token.FOR, forNode.getType());
    assertEquals(3, forNode.getChildCount());
  }

  @Test
  public void testWhileLoop_TwoChildren() throws Exception {
    Node whileNode = parse("while (a) { b; }").getFirstChild();
    assertEquals(Token.WHILE, whileNode.getType());
    assertEquals(2, whileNode.getChildCount());
  }

  @Test
  public void testDoWhileLoop_TwoChildren() throws Exception {
    Node doNode = parse("do { b; } while (a);").getFirstChild();
    assertEquals(Token.DO, doNode.getType());
    assertEquals(Token.BLOCK, doNode.getFirstChild().getType());
    assertEquals(2, doNode.getChildCount());
  }

  @Test
  public void testBreakAndContinue_NoLabel_NoChild() throws Exception {
    Node breakStmt = getChild(parse("for (;;) { break; }").getFirstChild().getLastChild(), 0);
    assertEquals(Token.BREAK, breakStmt.getType());
    assertEquals(0, breakStmt.getChildCount());

    Node contStmt = getChild(parse("for (;;) { continue; }").getFirstChild().getLastChild(), 0);
    assertEquals(Token.CONTINUE, contStmt.getType());
    assertEquals(0, contStmt.getChildCount());
  }

  @Test
  public void testLabeledLoop_BreakWithLabel() throws Exception {
    Node label = parse("outer: for (;;) { break outer; }").getFirstChild();
    assertEquals(Token.LABEL, label.getType());
    Node labelName = label.getFirstChild();
    assertEquals(Token.LABEL_NAME, labelName.getType());
    assertEquals("outer", labelName.getString());

    Node forNode = labelName.getNext();
    Node breakStmt = forNode.getLastChild().getFirstChild();
    assertEquals(Token.BREAK, breakStmt.getType());
    assertEquals(1, breakStmt.getChildCount());
    assertEquals(Token.LABEL_NAME, breakStmt.getFirstChild().getType());
    assertEquals("outer", breakStmt.getFirstChild().getString());
  }

  @Test
  public void testLabeledLoop_ContinueWithLabel() throws Exception {
    Node label = parse("outer: for (;;) { continue outer; }").getFirstChild();
    Node forNode = label.getFirstChild().getNext();
    Node contStmt = forNode.getLastChild().getFirstChild();
    assertEquals(Token.CONTINUE, contStmt.getType());
    assertEquals(1, contStmt.getChildCount());
  }

  // ---------------------------------------------------------------------
  // D. Switch
  // ---------------------------------------------------------------------

  @Test
  public void testSwitch_CaseAndDefault() throws Exception {
    Node sw = parse("switch (x) { case 1: a; break; default: b; }").getFirstChild();
    assertEquals(Token.SWITCH, sw.getType());
    Node caseNode = getChild(sw, 1);
    assertEquals(Token.CASE, caseNode.getType());
    Node defaultNode = caseNode.getNext();
    assertEquals(Token.DEFAULT, defaultNode.getType());
    assertEquals(Token.BLOCK, caseNode.getFirstChild().getType());
    assertEquals(Token.BLOCK, defaultNode.getFirstChild().getType());
  }

  // ---------------------------------------------------------------------
  // E. Try / Catch / Finally
  // ---------------------------------------------------------------------

  @Test
  public void testTry_CatchAndFinally_Structure() throws Exception {
    Node tryNode = parse("try { a; } catch (e) { b; } finally { c; }").getFirstChild();
    assertEquals(Token.TRY, tryNode.getType());
    assertEquals(3, tryNode.getChildCount());
    Node catchContainer = getChild(tryNode, 1);
    assertEquals(Token.BLOCK, catchContainer.getType());
    assertEquals(1, catchContainer.getChildCount());
    assertEquals(Token.CATCH, catchContainer.getFirstChild().getType());
    assertEquals(Token.BLOCK, getChild(tryNode, 2).getType());
  }

  @Test
  public void testTry_CatchOnly_NoFinallyChild() throws Exception {
    Node tryNode = parse("try { a; } catch (e) { b; }").getFirstChild();
    assertEquals(2, tryNode.getChildCount()); // ไม่มี finally -> ไม่ addChildToBack
  }

  @Test
  public void testTry_FinallyOnly_CatchBlockLineTakenFromFinally() throws Exception {
    Node tryNode = parse("try { a; }\nfinally { c; }").getFirstChild();
    assertEquals(2, tryNode.getChildCount());
    Node catchContainer = getChild(tryNode, 1);
    assertEquals(0, catchContainer.getChildCount()); // ไม่มี catch clause
    Node finallyBlock = catchContainer.getNext();
    // lineSet == false && finallyBlock != null -> block.setLineno(finallyBlock.getLineno())
    assertEquals(finallyBlock.getLineno(), catchContainer.getLineno());
  }

  // ---------------------------------------------------------------------
  // F. Array / Object literal
  // ---------------------------------------------------------------------

  @Test
  public void testArrayLiteral_WithHoles_SkipIndexesSet() throws Exception {
    Node arr = firstVarValue(parse("var a = [1, , 3];"));
    assertEquals(Token.ARRAYLIT, arr.getType());
    assertEquals(2, arr.getChildCount());
    Object skip = arr.getProp(Node.SKIP_INDEXES_PROP);
    assertNotNull(skip);
    assertTrue(skip instanceof int[]);
    assertArrayEquals(new int[] { 1 }, (int[]) skip);
  }

  @Test
  public void testArrayLiteral_NoHoles_ChildCountMatches() throws Exception {
    Node arr = firstVarValue(parse("var a = [1, 2, 3];"));
    assertEquals(3, arr.getChildCount());
  }

  @Test
  public void testObjectLiteral_GetterRejected_WhenNotES5() throws Exception {
    ErrorCollector ec = new ErrorCollector();
    Node obj = firstVarValue(parse("var o = { get x() { return 1; } };", false, ec));
    assertEquals(Token.OBJECTLIT, obj.getType());
    assertEquals(0, obj.getChildCount()); // reportGetter + continue -> ไม่ถูกเพิ่ม
    assertTrue(containsSubstring(ec.errors, "getters are not supported"));
  }

  @Test
  public void testObjectLiteral_GetterAccepted_WhenES5() throws Exception {
    Node obj = firstVarValue(parse("var o = { get x() { return 1; } };", true, new ErrorCollector()));
    assertEquals(1, obj.getChildCount());
    assertEquals(Token.GET, obj.getFirstChild().getType());
  }

  @Test
  public void testObjectLiteral_SetterRejected_WhenNotES5() throws Exception {
    ErrorCollector ec = new ErrorCollector();
    Node obj = firstVarValue(parse("var o = { set x(v) {} };", false, ec));
    assertEquals(0, obj.getChildCount());
    assertTrue(containsSubstring(ec.errors, "setters are not supported"));
  }

  @Test
  public void testObjectLiteral_QuotedVsUnquotedKey() throws Exception {
    Node obj = firstVarValue(parse("var o = {a: 1, 'b': 2};"));
    Node keyA = obj.getFirstChild();
    Node keyB = keyA.getNext();
    assertEquals("a", keyA.getString());
    assertFalse(keyA.getBooleanProp(Node.QUOTED_PROP));
    assertEquals("b", keyB.getString());
    assertTrue(keyB.getBooleanProp(Node.QUOTED_PROP));
  }

  // ---------------------------------------------------------------------
  // G. Property / element access
  // ---------------------------------------------------------------------

  @Test
  public void testPropertyGet_NameConvertedToStringNode() throws Exception {
    Node expr = firstExpr(parse("a.b;"));
    assertEquals(Token.GETPROP, expr.getType());
    Node prop = expr.getLastChild();
    assertEquals(Token.STRING, prop.getType());
    assertEquals("b", prop.getString());
  }

  @Test
  public void testElementGet_TwoChildren() throws Exception {
    Node expr = firstExpr(parse("a[b];"));
    assertEquals(Token.GETELEM, expr.getType());
    assertEquals(2, expr.getChildCount());
  }

  // ---------------------------------------------------------------------
  // H. Unary expression
  // ---------------------------------------------------------------------

  @Test
  public void testUnaryNeg_OnNumberLiteral_FoldedIntoNegativeNumber() throws Exception {
    Node expr = firstExpr(parse("-5;"));
    assertEquals(Token.NUMBER, expr.getType()); // ไม่มี NEG wrapper
    assertEquals(-5.0, expr.getDouble(), 0.0001);
  }

  @Test
  public void testUnaryNeg_OnNonNumber_WrappedInNegNode() throws Exception {
    Node expr = firstExpr(parse("-a;"));
    assertEquals(Token.NEG, expr.getType());
    assertEquals(Token.NAME, expr.getFirstChild().getType());
  }

  @Test
  public void testPostfixIncrement_SetsIncrDecrProp() throws Exception {
    Node expr = firstExpr(parse("a++;"));
    assertEquals(Token.INC, expr.getType());
    assertTrue(expr.getBooleanProp(Node.INCRDECR_PROP));
  }

  @Test
  public void testPrefixIncrement_DoesNotSetIncrDecrProp() throws Exception {
    Node expr = firstExpr(parse("++a;"));
    assertEquals(Token.INC, expr.getType());
    assertFalse(expr.getBooleanProp(Node.INCRDECR_PROP));
  }

  // ---------------------------------------------------------------------
  // I. Call / new / regex / ternary / paren / function
  // ---------------------------------------------------------------------

  @Test
  public void testNewExpression_DelegatesToFunctionCallProcessing() throws Exception {
    Node expr = firstExpr(parse("new Foo(1, 2);"));
    assertEquals(Token.NEW, expr.getType());
    assertEquals(3, expr.getChildCount());
  }

  @Test
  public void testFunctionCall_WithArguments() throws Exception {
    Node expr = firstExpr(parse("foo(1, 2, 3);"));
    assertEquals(Token.CALL, expr.getType());
    assertEquals(4, expr.getChildCount());
  }

  @Test
  public void testRegex_WithFlags_TwoChildren() throws Exception {
    Node expr = firstExpr(parse("/abc/gi;"));
    assertEquals(Token.REGEXP, expr.getType());
    assertEquals(2, expr.getChildCount());
    assertEquals("gi", expr.getLastChild().getString());
  }

  @Test
  public void testRegex_NoFlags_OneChild() throws Exception {
    Node expr = firstExpr(parse("/abc/;"));
    assertEquals(Token.REGEXP, expr.getType());
    assertEquals(1, expr.getChildCount());
  }

  @Test
  public void testConditional_Hook_ThreeChildren() throws Exception {
    Node expr = firstExpr(parse("a ? b : c;"));
    assertEquals(Token.HOOK, expr.getType());
    assertEquals(3, expr.getChildCount());
  }

  @Test
  public void testParenthesized_SetsParenthesizedProp() throws Exception {
    Node expr = firstExpr(parse("(a);"));
    assertEquals(Token.NAME, expr.getType());
    assertTrue(expr.getBooleanProp(Node.PARENTHESIZED_PROP));
  }

  @Test
  public void testNamedFunctionDeclaration_NameNodePresent() throws Exception {
    Node fn = parse("function foo(a, b) { return a; }").getFirstChild();
    assertEquals(Token.FUNCTION, fn.getType());
    Node name = fn.getFirstChild();
    assertEquals(Token.NAME, name.getType());
    assertEquals("foo", name.getString());
    Node lp = name.getNext();
    assertEquals(Token.LP, lp.getType());
    assertEquals(2, lp.getChildCount());
  }

  @Test
  public void testAnonymousFunctionExpression_EmptyNameIdentifier() throws Exception {
    Node fn = firstVarValue(parse("var f = function(a) { return a; };"));
    assertEquals(Token.FUNCTION, fn.getType());
    assertEquals("", fn.getFirstChild().getString()); // isUnnamedFunction branch
  }

  // ---------------------------------------------------------------------
  // J. Reflection-based tests สำหรับ private/static method ที่เข้าถึงยากผ่าน public API
  // ---------------------------------------------------------------------

  @Test
  public void testPosition2Charno_NoPrecedingNewline() throws Exception {
    assertEquals(0, position2charno("abcdef", 0));
    assertEquals(3, position2charno("abcdef", 3)); // lineIndex == -1 -> return position
  }

  @Test
  public void testPosition2Charno_AfterNewline() throws Exception {
    // "a\ndef" : index 0='a',1='\n',2='d',3='e',4='f'
    assertEquals(1, position2charno("a\ndef", 3)); // 3 - 1 - 1 = 1
  }

  @Test
  public void testPosition2Charno_AtNewlineItself_BoundaryBehavior() throws Exception {
    // ตำแหน่งชี้ไปที่ '\n' เอง: lastIndexOf('\n', pos) เจอตัวมันเอง -> ผลลัพธ์ -1
    // (พฤติกรรมตรงตาม logic ในซอร์ส แม้จะดูขัดสามัญสำนึกว่า charno ติดลบได้)
    assertEquals(-1, position2charno("a\ndef", 1));
  }

  private int position2charno(String sourceString, int position) throws Exception {
    Constructor<IRFactory> ctor = IRFactory.class.getDeclaredConstructor(
        String.class, String.class, Config.class, ErrorReporter.class);
    ctor.setAccessible(true);
    IRFactory factory = ctor.newInstance(sourceString, SOURCE_NAME, null, null);
    Method m = IRFactory.class.getDeclaredMethod("position2charno", int.class);
    m.setAccessible(true);
    return (Integer) m.invoke(factory, position);
  }

  @Test
  public void testTransformTokenType_KnownMappings() throws Exception {
    assertEquals(Token.NAME, transformTokenType(
        com.google.javascript.jscomp.mozilla.rhino.Token.NAME));
    assertEquals(Token.NUMBER, transformTokenType(
        com.google.javascript.jscomp.mozilla.rhino.Token.NUMBER));
    assertEquals(Token.STRING, transformTokenType(
        com.google.javascript.jscomp.mozilla.rhino.Token.STRING));
    assertEquals(Token.IF, transformTokenType(
        com.google.javascript.jscomp.mozilla.rhino.Token.IF));
    assertEquals(Token.FUNCTION, transformTokenType(
        com.google.javascript.jscomp.mozilla.rhino.Token.FUNCTION));
    // EXPR_VOID และ EXPR_RESULT ต้อง map ไปที่ Token.EXPR_RESULT ตัวเดียวกัน (fall-through case)
    assertEquals(Token.EXPR_RESULT, transformTokenType(
        com.google.javascript.jscomp.mozilla.rhino.Token.EXPR_VOID));
    assertEquals(Token.EXPR_RESULT, transformTokenType(
        com.google.javascript.jscomp.mozilla.rhino.Token.EXPR_RESULT));
  }

  @Test
  public void testTransformTokenType_UnknownTokenThrowsIllegalState() throws Exception {
    Method m = IRFactory.class.getDeclaredMethod("transformTokenType", int.class);
    m.setAccessible(true);
    try {
      m.invoke(null, -999999);
      fail("expected IllegalStateException");
    } catch (InvocationTargetException e) {
      assertTrue(e.getCause() instanceof IllegalStateException);
    }
  }

  private int transformTokenType(int rhinoToken) throws Exception {
    Method m = IRFactory.class.getDeclaredMethod("transformTokenType", int.class);
    m.setAccessible(true);
    return (Integer) m.invoke(null, rhinoToken);
  }

  @Test
  public void testIsDirective_VariousCases() throws Exception {
    Constructor<IRFactory> ctor = IRFactory.class.getDeclaredConstructor(
        String.class, String.class, Config.class, ErrorReporter.class);
    ctor.setAccessible(true);
    IRFactory factory = ctor.newInstance("", SOURCE_NAME, null, null);

    Field tdField = IRFactory.class.getDeclaredField("transformDispatcher");
    tdField.setAccessible(true);
    Object dispatcher = tdField.get(factory);
    Method isDirective = dispatcher.getClass().getDeclaredMethod("isDirective", Node.class);
    isDirective.setAccessible(true);

    // n == null -> false
    assertFalse((Boolean) isDirective.invoke(dispatcher, (Node) null));

    // ไม่ใช่ EXPR_RESULT/EXPR_VOID -> false (short-circuit, ไม่ NPE แม้ไม่มีลูก)
    Node blockNode = new Node(Token.BLOCK);
    assertFalse((Boolean) isDirective.invoke(dispatcher, blockNode));

    // EXPR_RESULT + STRING "use strict" ที่อยู่ใน ALLOWED_DIRECTIVES -> true
    Node allowed = new Node(Token.EXPR_RESULT);
    allowed.addChildToBack(Node.newString(Token.STRING, "use strict"));
    assertTrue((Boolean) isDirective.invoke(dispatcher, allowed));

    // EXPR_RESULT + STRING ที่ไม่อยู่ใน ALLOWED_DIRECTIVES -> false
    Node disallowed = new Node(Token.EXPR_RESULT);
    disallowed.addChildToBack(Node.newString(Token.STRING, "not a directive"));
    assertFalse((Boolean) isDirective.invoke(dispatcher, disallowed));

    // EXPR_VOID + STRING "use strict" -> true
    Node exprVoid = new Node(Token.EXPR_VOID);
    exprVoid.addChildToBack(Node.newString(Token.STRING, "use strict"));
    assertTrue((Boolean) isDirective.invoke(dispatcher, exprVoid));

    // EXPR_RESULT + child ที่ไม่ใช่ STRING -> false
    Node nonString = new Node(Token.EXPR_RESULT);
    nonString.addChildToBack(Node.newString(Token.NAME, "x"));
    assertFalse((Boolean) isDirective.invoke(dispatcher, nonString));
  }

  // ---------------------------------------------------------------------
  // K. เคสที่ตั้งใจ "ไม่เขียนทดสอบ" เพราะไม่มีหลักฐานพอใน source ที่ให้มา
  // ---------------------------------------------------------------------
  //
  // 1) reportDestructuringAssign (processArrayLiteral/processObjectLiteral เมื่อ
  //    isDestructuring()==true): ไม่มีข้อมูลว่า parser รุ่นนี้รองรับ syntax
  //    destructuring แบบ Mozilla extension (`var [a,b] = c;`) หรือ AstNode มี setter
  //    ให้ตั้ง flag นี้ได้หรือไม่ จึงไม่เขียนทดสอบเพื่อไม่ "เดา" behavior
  //
  // 2) processCatchClause เมื่อ getCatchCondition() != null (`catch(e if cond)`):
  //    เป็น syntax เฉพาะของ JS1.7 ไม่มีหลักฐานว่า parser ในคลาสพาธนี้รองรับ
  //    จึงไม่เขียนทดสอบ
}

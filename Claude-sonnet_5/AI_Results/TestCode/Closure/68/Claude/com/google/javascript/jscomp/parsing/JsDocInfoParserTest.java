package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.*;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.EvaluatorException;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

/**
 * JUnit4 test สำหรับ {@link JsDocInfoParser} (Defects4J Closure-68b)
 *
 * หมายเหตุสมมติฐาน (assumption) ที่ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา:
 *  - Config มี constructor (Set<String>, Set<String>, boolean, LanguageMode, boolean)
 *    ตามที่ใช้จริงใน parseTypeString() ของซอร์สต้นฉบับ และ default annotationNames map
 *    ยังคงมีคำสั่งมาตรฐาน (@constructor, @param, @return ฯลฯ) แม้ส่ง Set ว่างเข้าไป
 *  - com.google.javascript.jscomp.mozilla.rhino.ErrorReporter มี method
 *    warning/error/runtimeError ตามรูปแบบมาตรฐานของ Mozilla Rhino
 *  - com.google.javascript.rhino.Node มี getType()/getFirstChild()/getString()/getChildCount()
 *    ซึ่งเป็น API มาตรฐานของ Closure's Node (ใช้ addChildToBack/addChildToFront ในซอร์สต้นฉบับ)
 *  - JsDocTokenStream(String) แปลงข้อความเป็นสตรีมโทเคน โดย "*/" คือ EOC
 */
public class JsDocInfoParserTest {

  // ---------------------------------------------------------------------
  // Helper: ErrorReporter ที่นับจำนวน warning/error เพื่อตรวจ branch การเตือน
  // ---------------------------------------------------------------------
  private static class CountingErrorReporter implements ErrorReporter {
    int warnings = 0;
    int errors = 0;

    @Override
    public void warning(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      warnings++;
    }

    @Override
    public void error(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      errors++;
    }

    @Override
    public EvaluatorException runtimeError(String message, String sourceName,
        int line, String lineSource, int lineOffset) {
      errors++;
      return new EvaluatorException(message);
    }
  }

  private JsDocInfoParser createParser(String comment,
      boolean parseDocumentation, CountingErrorReporter reporter) {
    Config config = new Config(
        Sets.<String>newHashSet(),
        Sets.<String>newHashSet(),
        parseDocumentation,
        LanguageMode.ECMASCRIPT3,
        false);
    return new JsDocInfoParser(
        new JsDocTokenStream(comment),
        null,
        "testcode",
        config,
        reporter);
  }

  // =====================================================================
  // 1. ทดสอบ parseTypeString(String) - static, public -> ปลอดภัยสุด
  //    ครอบคลุม parseTypeExpression / parseBasicTypeExpression /
  //    parseTypeName / parseUnionType / parseArrayType / parseRecordType /
  //    parseFunctionType / parseParametersType / parseResultType
  // =====================================================================

  @Test
  public void testSimpleTypeName() {
    Node n = JsDocInfoParser.parseTypeString("number");
    assertNotNull(n);
    assertEquals("number", n.getString());
  }

  @Test
  public void testNullAndUndefinedLiterals() {
    Node n1 = JsDocInfoParser.parseTypeString("null");
    Node n2 = JsDocInfoParser.parseTypeString("undefined");
    assertNotNull(n1);
    assertNotNull(n2);
    assertEquals("null", n1.getString());
    assertEquals("undefined", n2.getString());
  }

  @Test
  public void testBareQuestionMarkAloneReturnsNull() {
    // token QMARK แล้วตามด้วย EOF -> lookahead ไม่ตรง -> parseBasicTypeExpression(EOF)
    // ไม่ match case ใด ๆ -> reportGenericTypeSyntaxWarning() -> null
    // (edge case ที่มีโอกาสดักจับ fault สูง)
    Node n = JsDocInfoParser.parseTypeString("?");
    assertNull(n);
  }

  @Test
  public void testQuestionMarkEqualsLookahead() {
    // "?=" -> lookahead เจอ EQUALS -> คืน newNode(QMARK) โดยไม่มี child
    Node n = JsDocInfoParser.parseTypeString("?=");
    assertNotNull(n);
    assertEquals(Token.QMARK, n.getType());
    assertNull(n.getFirstChild());
  }

  @Test
  public void testStarToken() {
    Node n = JsDocInfoParser.parseTypeString("*");
    assertNotNull(n);
    assertEquals(Token.STAR, n.getType());
  }

  @Test
  public void testBangWrapsBasicType() {
    Node n = JsDocInfoParser.parseTypeString("!Object");
    assertNotNull(n);
    assertEquals(Token.BANG, n.getType());
    assertEquals("Object", n.getFirstChild().getString());
  }

  @Test
  public void testOptionalQuestionSuffix() {
    Node n = JsDocInfoParser.parseTypeString("Object?");
    assertNotNull(n);
    assertEquals(Token.QMARK, n.getType());
    assertEquals("Object", n.getFirstChild().getString());
  }

  @Test
  public void testNonNullBangSuffix() {
    Node n = JsDocInfoParser.parseTypeString("Object!");
    assertNotNull(n);
    assertEquals(Token.BANG, n.getType());
    assertEquals("Object", n.getFirstChild().getString());
  }

  @Test
  public void testGenericTypeApplication() {
    Node n = JsDocInfoParser.parseTypeString("Array.<string>");
    assertNotNull(n);
    assertEquals("Array", n.getString());
    assertNotNull(n.getFirstChild()); // BLOCK ของ type list
  }

  @Test
  public void testGenericTypeMissingGtReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString("Array.<string");
    assertNull(n);
  }

  @Test
  public void testParenUnionType() {
    Node n = JsDocInfoParser.parseTypeString("(number|string)");
    assertNotNull(n);
    assertEquals(Token.PIPE, n.getType());
    assertEquals("number", n.getFirstChild().getString());
    assertEquals("string", n.getFirstChild().getNext().getString());
  }

  @Test
  public void testDoublePipeTopLevelUnionBackwardCompat() {
    Node n = JsDocInfoParser.parseTypeString("number||string");
    assertNotNull(n);
    assertEquals(Token.PIPE, n.getType());
  }

  @Test
  public void testArrayTypeMultipleElements() {
    Node n = JsDocInfoParser.parseTypeString("[number,string]");
    assertNotNull(n);
    assertEquals(Token.LB, n.getType());
    assertEquals("number", n.getFirstChild().getString());
    assertEquals("string", n.getFirstChild().getNext().getString());
  }

  @Test
  public void testArrayTypeVarArgs() {
    Node n = JsDocInfoParser.parseTypeString("[...number]");
    assertNotNull(n);
    assertEquals(Token.LB, n.getType());
    assertEquals(Token.ELLIPSIS, n.getFirstChild().getType());
  }

  @Test
  public void testArrayTypeMissingRbReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString("[number");
    assertNull(n);
  }

  @Test
  public void testRecordTypeWithFields() {
    Node n = JsDocInfoParser.parseTypeString("{a: number, b: string}");
    assertNotNull(n);
    assertEquals(Token.LC, n.getType());
    Node fieldList = n.getFirstChild();
    assertNotNull(fieldList);
    Node first = fieldList.getFirstChild();
    assertEquals(Token.COLON, first.getType());
  }

  @Test
  public void testRecordTypeFieldWithoutColon() {
    Node n = JsDocInfoParser.parseTypeString("{a}");
    assertNotNull(n);
    Node fieldList = n.getFirstChild();
    Node field = fieldList.getFirstChild();
    // ไม่มี ':' -> field เป็น STRING node ตรง ๆ ไม่ใช่ COLON
    assertEquals("a", field.getString());
  }

  @Test
  public void testRecordTypeMissingRcReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString("{a: number");
    assertNull(n);
  }

  @Test
  public void testFunctionTypeWithParamsAndResult() {
    Node n = JsDocInfoParser.parseTypeString("function(number,string):boolean");
    assertNotNull(n);
    assertEquals(Token.FUNCTION, n.getType());
  }

  @Test
  public void testFunctionTypeWithThisContextAndVoidResult() {
    Node n = JsDocInfoParser.parseTypeString("function(this:Object):void");
    assertNotNull(n);
    assertEquals(Token.FUNCTION, n.getType());
    assertEquals(Token.THIS, n.getFirstChild().getType());
  }

  @Test
  public void testFunctionTypeMissingColonAfterThisReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString("function(this Object):void");
    assertNull(n);
  }

  @Test
  public void testFunctionTypeMissingLpReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString("function number");
    assertNull(n);
  }

  @Test
  public void testFunctionTypeEmptyVarArgs() {
    Node n = JsDocInfoParser.parseTypeString("function(...):void");
    assertNotNull(n);
    assertEquals(Token.FUNCTION, n.getType());
  }

  @Test
  public void testGenericBasicTypeSyntaxWarningReturnsNull() {
    // ":" ไม่ match กับ case ใดใน parseBasicTypeExpression -> null
    Node n = JsDocInfoParser.parseTypeString(":");
    assertNull(n);
  }

  // =====================================================================
  // 2. ทดสอบ parse() (instance, package-private) ผ่านการสร้าง
  //    JsDocInfoParser ตรง ๆ ใน package เดียวกัน
  // =====================================================================

  @Test
  public void testEmptyCommentParsesTrue() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testEofWithoutEocReturnsFalse() {
    // ไม่มี "*/" เลย -> token EOF -> parse() คืน false + มี warning
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("", true, r);
    assertFalse(p.parse());
    assertTrue(r.warnings >= 1);
  }

  @Test
  public void testUnknownAnnotationWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@bogusAnnotation\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testConstructorRecordedNoWarning() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@constructor\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
    assertTrue(p.hasParsedJSDocInfo());
  }

  @Test
  public void testConstructorThenInterfaceWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@constructor\n@interface\n*/", true, r);
    assertTrue(p.parse());
    assertTrue(r.warnings >= 1);
  }

  @Test
  public void testConstAnnotationDuplicateWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@const\n@const\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testDeprecatedWithReason() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser(
        "@deprecated Use foo instead.\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testDescExtraWarnsOnSecondDesc() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser(
        "@desc First\n@desc Second\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testFileOverviewRecorded() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser(
        "@fileoverview This overview.\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
    assertNotNull(p.getFileOverviewJSDocInfo());
  }

  @Test
  public void testExtendsWithBracesSuccess() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@extends {Base}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testExtendsMissingTypeNameWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    // '|' ไม่ใช่ LC หรือ STRING -> เข้า else -> addTypeWarning msg.no.type.name
    JsDocInfoParser p = createParser("@extends |\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testExtendsMissingClosingRcWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@extends {Base\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testImplementsSuccess() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@implements {Foo}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testParamWithTypeAndName() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@param {number} x\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testParamWithoutType() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@param x\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testParamTypeButMissingNameWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@param {number}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testParamDuplicateNameWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser(
        "@param {number} x\n@param {string} x\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testParamDottedNameIgnoredNoWarning() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@param {number} x.y\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testParamBracketedOptional() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@param {number} [x]\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testParamBracketedMissingRbWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@param {number} [x\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testThrowsWithType() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser(
        "@throws {Error} Something bad\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testThrowsWithoutTypeDoesNotCrash() {
    // เคส edge: ไม่มี '{' นำ -> token=current() อาจได้ null buffer
    // เป็นเคสที่มีโอกาสดักจับ fault (NPE/พฤติกรรมผิดปกติ)
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser(
        "@throws Some description\n*/", true, r);
    assertTrue(p.parse());
  }

  @Test
  public void testThrowsWithMalformedTypeWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@throws {\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testSuppressUnknownNameWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@suppress {checkTypes}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testSuppressTwoUnknownNamesWarnsTwice() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@suppress {a|b}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(2, r.warnings);
  }

  @Test
  public void testSuppressWithoutBraceNoWarning() {
    // เคส edge: ไม่มี '{' -> parseSuppressTag คืน token ทันทีโดยไม่เตือน
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@suppress\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testSuppressEmptyBracesWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@suppress {}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testModifiesKeywordNoWarning() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@modifies {this}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testModifiesUnknownNameWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@modifies {foo}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testTemplateSuccess() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@template T\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testTemplateEmptyWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@template \n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testTemplateDuplicateWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser(
        "@template T\n@template U\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testVersionSuccess() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@version 1.0\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testVersionEmptyWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@version \n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testVersionDuplicateWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser(
        "@version 1.0\n@version 2.0\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testSeeSuccessWithDocumentation() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@see Something\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testSeeEmptyWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@see \n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testAuthorEmptyWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@author \n*/", true, r);
    assertTrue(p.parse());
    assertEquals(1, r.warnings);
  }

  @Test
  public void testAuthorSuccess() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@author me@example.com\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testVisibilityPrivatePublicProtected() {
    CountingErrorReporter r1 = new CountingErrorReporter();
    assertTrue(createParser("@private\n*/", true, r1).parse());
    assertEquals(0, r1.warnings);

    CountingErrorReporter r2 = new CountingErrorReporter();
    assertTrue(createParser("@protected\n*/", true, r2).parse());
    assertEquals(0, r2.warnings);

    CountingErrorReporter r3 = new CountingErrorReporter();
    assertTrue(createParser("@public\n*/", true, r3).parse());
    assertEquals(0, r3.warnings);
  }

  @Test
  public void testEnumDefaultTypeWhenOmitted() {
    // @enum ไม่มี type -> ใช้ "number" เป็น default
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@enum\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testEnumExplicitType() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@enum {string}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testTypedefSuccess() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@typedef {number}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testReturnWithoutTypeAnnotationUsesUnknown() {
    // ไม่มี '{' หลัง @return -> lookAheadForTypeAnnotation() false -> QMARK
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@return something\n*/", true, r);
    assertTrue(p.parse());
  }

  @Test
  public void testReturnWithTypeAndDescription() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser(
        "@return {number} the value\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testThisAnnotationBraceless() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@this Object\n*/", true, r);
    assertTrue(p.parse());
  }

  @Test
  public void testOverrideAndInheritDoc() {
    CountingErrorReporter r1 = new CountingErrorReporter();
    assertTrue(createParser("@override\n*/", true, r1).parse());

    CountingErrorReporter r2 = new CountingErrorReporter();
    assertTrue(createParser("@inheritDoc\n*/", true, r2).parse());
  }

  @Test
  public void testLendsMissingBraceWarns() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@lends\n*/", true, r);
    assertTrue(p.parse());
    assertTrue(r.warnings >= 1);
  }

  @Test
  public void testLendsWithNameSuccess() {
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("@lends {Foo}\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testParseDocumentationFalseSkipsDescriptionExtraction() {
    // parseDocumentation=false -> ไม่ extractBlockComment, ใช้
    // recordBlockDescription("") ถ้ามีเนื้อหา
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser(
        "Some description text\n@constructor\n*/", false, r);
    assertTrue(p.parse());
  }

  @Test
  public void testStarAtSearchingAnnotationStateIsSkipped() {
    // '*' ตอน state==SEARCHING_ANNOTATION ถูกข้ามผ่าน default-case ใน parse()
    CountingErrorReporter r = new CountingErrorReporter();
    JsDocInfoParser p = createParser("* @constructor\n*/", true, r);
    assertTrue(p.parse());
    assertEquals(0, r.warnings);
  }

  @Test
  public void testPreserveTryAndNoShadowAndNoSideEffects() {
    CountingErrorReporter r1 = new CountingErrorReporter();
    assertTrue(createParser("@preservertry\n*/", true, r1).parse());

    CountingErrorReporter r2 = new CountingErrorReporter();
    assertTrue(createParser("@noshadow\n*/", true, r2).parse());

    CountingErrorReporter r3 = new CountingErrorReporter();
    assertTrue(createParser("@nosideeffects\n*/", true, r3).parse());
  }
}

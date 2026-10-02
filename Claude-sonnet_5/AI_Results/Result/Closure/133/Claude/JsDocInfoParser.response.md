# วิเคราะห์และแนวทางการทดสอบ

`JsDocInfoParser` เป็น package-private class ที่มี constructor เป็น package-private เช่นกัน ดังนั้น **JsDocInfoParserTest ต้องอยู่ใน package เดียวกัน** (`com.google.javascript.jscomp.parsing`) เพื่อให้เข้าถึง constructor และ method อย่าง `parse()`, `hasParsedJSDocInfo()`, `parseInlineTypeDoc()` ได้

จุดที่ผมมั่นใจสูง (จาก source ที่ให้มาโดยตรง): เมธอด `parseTypeString(String)` เป็น `public static` และมีตัวอย่างการสร้าง `Config`/`JsDocInfoParser` ให้ดูในซอร์สแล้ว → ใช้ทดสอบ grammar การ parse type expression ได้อย่างปลอดภัย

จุดที่มีการอนุมาน (comment ไว้ในโค้ด): รูปแบบข้อความที่ป้อนให้ `parse()` (ต้องมี `*/` ปิดท้ายเพื่อให้เกิด `EOC`) และพฤติกรรม default ของ `Config`/`annotationNames` เพราะ source ของ `Config` ไม่ได้ให้มา

```java
package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.jscomp.parsing.JsDocInfoParser;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * JUnit4 test suite for {@link JsDocInfoParser} (Defects4J Closure-133b).
 *
 * หมายเหตุสำคัญ (ข้อสมมติที่ไม่มีระบุตรงๆในซอร์สที่ให้มา แต่จำเป็นต้องอนุมานเพื่อ compile/run ได้):
 * 1) Config มี constructor (Set<String>, Set<String>, boolean parseJsDocDocumentation,
 *    LanguageMode, boolean) ตามที่เห็นใน JsDocInfoParser.parseTypeString().
 * 2) JsDocTokenStream ใช้เนื้อหาที่ "ไม่มี" prefix "/**" แต่ "มี" suffix "*/" เพื่อให้เกิด
 *    JsDocToken.EOC (อ้างอิงพฤติกรรมทั่วไปของ Closure Compiler ที่ตัด "/**" ออกก่อนส่งเข้า stream)
 * 3) Config เมื่อสร้างด้วย Set ว่าง จะยังรู้จัก annotation มาตรฐานเช่น @param, @return,
 *    @deprecated, @private, @extends, @suppress, @template, @fileoverview, @const, @type
 *    (เป็น annotation หลักของ Closure Compiler)
 * ถ้าข้อสมมติเหล่านี้ผิดไปจากพฤติกรรมจริงของ Config/JsDocTokenStream โปรดปรับ helper method
 * newParser()/newParserWithNames() ให้ตรงกับ signature จริง
 */
public class JsDocInfoParserTest {

  /** ErrorReporter ทดสอบที่บันทึกจำนวน/ข้อความ warning/error เพื่อตรวจสอบ branch ต่างๆ */
  private static class RecordingErrorReporter implements ErrorReporter {
    final List<String> warnings = new ArrayList<String>();
    final List<String> errors = new ArrayList<String>();

    @Override
    public void warning(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      warnings.add(message);
    }

    @Override
    public void error(String message, String sourceName, int line,
        String lineSource, int lineOffset) {
      errors.add(message);
    }

    @Override
    public EvaluatorException runtimeError(String message, String sourceName,
        int line, String lineSource, int lineOffset) {
      return null;
    }
  }

  private final RecordingErrorReporter reporter = new RecordingErrorReporter();

  /** สร้าง parser พร้อม annotationWhitelist/suppressionNames เป็น Set ว่าง (เหมือน parseTypeString) */
  private JsDocInfoParser newParser(String content, boolean parseDocs) {
    return newParserWithNames(content, parseDocs, Sets.<String>newHashSet());
  }

  /**
   * สร้าง parser โดยกำหนด Set เดียวกันให้ทั้งพารามิเตอร์ตัวที่ 1 และ 2 ของ Config
   * เพื่อไม่ต้องเดาว่าพารามิเตอร์ตัวไหนคือ suppressionNames จริงๆ (ลด risk จากการเดา signature)
   */
  private JsDocInfoParser newParserWithNames(String content, boolean parseDocs,
      Set<String> names) {
    Config config = new Config(
        names,
        names,
        parseDocs,
        LanguageMode.ECMASCRIPT3,
        false);
    return new JsDocInfoParser(
        new JsDocTokenStream(content),
        null,
        null,
        config,
        reporter);
  }

  // =========================================================================
  // GROUP A: parseTypeString() - public static entry point, high confidence
  // =========================================================================

  @Test
  public void testParseSimpleTypeName() {
    Node n = JsDocInfoParser.parseTypeString("number");
    assertNotNull(n);
    assertEquals(Token.STRING, n.getType());
    assertEquals("number", n.getString());
  }

  @Test
  public void testParseStarType() {
    Node n = JsDocInfoParser.parseTypeString("*");
    assertNotNull(n);
    assertEquals(Token.STAR, n.getType());
  }

  @Test
  public void testParseNullType() {
    Node n = JsDocInfoParser.parseTypeString("null");
    assertNotNull(n);
    assertEquals(Token.STRING, n.getType());
    assertEquals("null", n.getString());
  }

  @Test
  public void testParseUndefinedType() {
    Node n = JsDocInfoParser.parseTypeString("undefined");
    assertNotNull(n);
    assertEquals("undefined", n.getString());
  }

  @Test
  public void testParseNullableSuffix() {
    // BasicTypeExpression '?' -> wrapNode(QMARK, basic)
    Node n = JsDocInfoParser.parseTypeString("Object?");
    assertNotNull(n);
    assertEquals(Token.QMARK, n.getType());
    assertEquals(1, n.getChildCount());
    assertEquals("Object", n.getFirstChild().getString());
  }

  @Test
  public void testParseBangSuffix() {
    Node n = JsDocInfoParser.parseTypeString("Object!");
    assertNotNull(n);
    assertEquals(Token.BANG, n.getType());
    assertEquals("Object", n.getFirstChild().getString());
  }

  @Test
  public void testParseNullablePrefixWrapsType() {
    Node n = JsDocInfoParser.parseTypeString("?number");
    assertNotNull(n);
    assertEquals(Token.QMARK, n.getType());
    assertEquals(1, n.getChildCount());
    assertEquals("number", n.getFirstChild().getString());
  }

  @Test
  public void testParseBangPrefixWrapsType() {
    Node n = JsDocInfoParser.parseTypeString("!Object");
    assertNotNull(n);
    assertEquals(Token.BANG, n.getType());
    assertEquals("Object", n.getFirstChild().getString());
  }

  @Test
  public void testParseUnknownTypeQmarkLookaheadComma() {
    // '?' immediately followed by ',' -> unknown-type marker node (no child)
    Node n = JsDocInfoParser.parseTypeString("?,");
    assertNotNull(n);
    assertEquals(Token.QMARK, n.getType());
    assertEquals(0, n.getChildCount());
  }

  @Test
  public void testParseUnknownTypeQmarkLookaheadPipe() {
    Node n = JsDocInfoParser.parseTypeString("?|");
    assertNotNull(n);
    assertEquals(Token.QMARK, n.getType());
    assertEquals(0, n.getChildCount());
  }

  @Test
  public void testParseUnionTypeParens() {
    Node n = JsDocInfoParser.parseTypeString("(number|string)");
    assertNotNull(n);
    assertEquals(Token.PIPE, n.getType());
    assertEquals(2, n.getChildCount());
  }

  @Test
  public void testParseUnionTypeTopLevelSinglePipe() {
    Node n = JsDocInfoParser.parseTypeString("number|string");
    assertNotNull(n);
    assertEquals(Token.PIPE, n.getType());
    assertEquals(2, n.getChildCount());
  }

  @Test
  public void testParseUnionTypeTopLevelDoublePipe() {
    // backward-compat double-pipe branch
    Node n = JsDocInfoParser.parseTypeString("number||string");
    assertNotNull(n);
    assertEquals(Token.PIPE, n.getType());
    assertEquals(2, n.getChildCount());
  }

  @Test
  public void testParseArrayTypeSimple() {
    Node n = JsDocInfoParser.parseTypeString("[number]");
    assertNotNull(n);
    assertEquals(Token.LB, n.getType());
    assertEquals(1, n.getChildCount());
  }

  @Test
  public void testParseArrayTypeMultipleElements() {
    Node n = JsDocInfoParser.parseTypeString("[number, string]");
    assertNotNull(n);
    assertEquals(Token.LB, n.getType());
    assertEquals(2, n.getChildCount());
  }

  @Test
  public void testParseArrayTypeVarArgs() {
    Node n = JsDocInfoParser.parseTypeString("[...number]");
    assertNotNull(n);
    assertEquals(Token.LB, n.getType());
    assertEquals(1, n.getChildCount());
    assertEquals(Token.ELLIPSIS, n.getFirstChild().getType());
  }

  @Test
  public void testParseRecordTypeWithFieldTypes() {
    Node n = JsDocInfoParser.parseTypeString("{a: number, b: string}");
    assertNotNull(n);
    assertEquals(Token.LC, n.getType());
    Node fieldList = n.getFirstChild();
    assertEquals(Token.LB, fieldList.getType());
    assertEquals(2, fieldList.getChildCount());
    Node firstField = fieldList.getFirstChild();
    assertEquals(Token.COLON, firstField.getType());
    assertEquals("a", firstField.getFirstChild().getString());
    assertEquals("number", firstField.getLastChild().getString());
  }

  @Test
  public void testParseRecordTypeNameOnlyField() {
    Node n = JsDocInfoParser.parseTypeString("{a}");
    assertNotNull(n);
    Node fieldList = n.getFirstChild();
    assertEquals(1, fieldList.getChildCount());
    assertEquals(Token.STRING, fieldList.getFirstChild().getType());
    assertEquals("a", fieldList.getFirstChild().getString());
  }

  @Test
  public void testParseFunctionTypeWithParamsAndReturn() {
    Node n = JsDocInfoParser.parseTypeString("function(number, string): boolean");
    assertNotNull(n);
    assertEquals(Token.FUNCTION, n.getType());
    assertEquals(2, n.getChildCount());
    Node params = n.getFirstChild();
    assertEquals(Token.PARAM_LIST, params.getType());
    assertEquals(2, params.getChildCount());
    assertEquals("boolean", n.getLastChild().getString());
  }

  @Test
  public void testParseFunctionTypeEmptyParamsNoReturn() {
    Node n = JsDocInfoParser.parseTypeString("function()");
    assertNotNull(n);
    assertEquals(Token.FUNCTION, n.getType());
    // ไม่มี PARAM_LIST เพราะ parameters ยังเป็น null (match(RP) สำเร็จทันที)
    assertEquals(1, n.getChildCount());
    assertEquals(Token.EMPTY, n.getFirstChild().getType());
  }

  @Test
  public void testParseFunctionTypeVoidReturn() {
    Node n = JsDocInfoParser.parseTypeString("function(): void");
    assertNotNull(n);
    assertEquals(Token.VOID, n.getLastChild().getType());
  }

  @Test
  public void testParseFunctionTypeThisContext() {
    Node n = JsDocInfoParser.parseTypeString("function(this:Object): void");
    assertNotNull(n);
    assertEquals(Token.FUNCTION, n.getType());
    assertEquals(Token.THIS, n.getFirstChild().getType());
  }

  @Test
  public void testParseFunctionTypeBareEllipsis() {
    Node n = JsDocInfoParser.parseTypeString("function(...)");
    assertNotNull(n);
    Node params = n.getFirstChild();
    assertEquals(Token.PARAM_LIST, params.getType());
    assertEquals(1, params.getChildCount());
    assertEquals(Token.ELLIPSIS, params.getFirstChild().getType());
  }

  @Test
  public void testParseFunctionTypeOldStyleVarArgsWithBrackets() {
    Node n = JsDocInfoParser.parseTypeString("function(...[number]): boolean");
    assertNotNull(n);
    Node params = n.getFirstChild();
    assertEquals(1, params.getChildCount());
    assertEquals(Token.ELLIPSIS, params.getFirstChild().getType());
  }

  @Test
  public void testParseFunctionTypeVarArgsMissingBracketReturnsNull() {
    // ตาม parseParametersType: '...' ที่ไม่ตามด้วย RP ต้องมี '[' เสมอ ไม่มี -> msg.jsdoc.missing.lb -> null
    Node n = JsDocInfoParser.parseTypeString("function(...number): boolean");
    assertNull(n);
  }

  @Test
  public void testParseTypeApplicationSingleParam() {
    Node n = JsDocInfoParser.parseTypeString("Array.<string>");
    assertNotNull(n);
    assertEquals("Array", n.getString());
    assertEquals(1, n.getChildCount());
    Node memberList = n.getFirstChild();
    assertEquals(1, memberList.getChildCount());
    assertEquals("string", memberList.getFirstChild().getString());
  }

  @Test
  public void testParseTypeApplicationMultipleParams() {
    Node n = JsDocInfoParser.parseTypeString("Object.<string,number>");
    assertNotNull(n);
    Node memberList = n.getFirstChild();
    assertEquals(2, memberList.getChildCount());
  }

  @Test
  public void testParseEmptyStringReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString("");
    assertNull(n);
  }

  @Test
  public void testParseUnmatchedBraceReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString("{");
    assertNull(n);
  }

  @Test
  public void testParseCommaAloneReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString(",");
    assertNull(n);
  }

  @Test
  public void testParseBangAloneReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString("!");
    assertNull(n);
  }

  @Test
  public void testParseUnionMissingRpReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString("(number");
    assertNull(n);
  }

  @Test
  public void testParseIncompleteFunctionReturnsNull() {
    Node n = JsDocInfoParser.parseTypeString("function(");
    assertNull(n);
  }

  // =========================================================================
  // GROUP B: parse() - ต้องอาศัยการอนุมานรูปแบบ input ของ JsDocTokenStream
  // (มี comment กำกับ assumption ในหัวไฟล์)
  // =========================================================================

  @Test
  public void testParseUnknownAnnotationWarns() {
    JsDocInfoParser parser = newParser(" * @bogusAnnotation\n */", true);
    boolean result = parser.parse();
    assertTrue(result);
    assertEquals(1, reporter.warnings.size());
  }

  @Test
  public void testParseDeprecatedWithReason() {
    JsDocInfoParser parser = newParser(
        " * @deprecated Use newMethod instead.\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseDeprecatedWithoutReasonNoWarning() {
    JsDocInfoParser parser = newParser(" * @deprecated\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseDeprecatedDuplicateWarns() {
    JsDocInfoParser parser = newParser(
        " * @deprecated First.\n * @deprecated Second.\n */", true);
    assertTrue(parser.parse());
    assertEquals(1, reporter.warnings.size());
  }

  @Test
  public void testParseParamValidNoWarnings() {
    JsDocInfoParser parser = newParser(
        " * @param {string} foo A parameter.\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseParamMissingNameWarns() {
    JsDocInfoParser parser = newParser(" * @param {string}\n */", true);
    assertTrue(parser.parse());
    assertEquals(1, reporter.warnings.size());
  }

  @Test
  public void testParseParamDuplicateWarns() {
    JsDocInfoParser parser = newParser(
        " * @param {string} foo First.\n"
        + " * @param {number} foo Second.\n */", true);
    assertTrue(parser.parse());
    assertEquals(1, reporter.warnings.size());
  }

  @Test
  public void testParseParamBracketedOptionalNoWarnings() {
    JsDocInfoParser parser = newParser(
        " * @param {string} [foo] Optional param.\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseParamBracketedMissingRbWarns() {
    JsDocInfoParser parser = newParser(
        " * @param {string} [foo An optional parameter.\n */", true);
    assertTrue(parser.parse());
    assertEquals(1, reporter.warnings.size());
  }

  @Test
  public void testParseParamDottedNameDiscardedNoWarning() {
    JsDocInfoParser parser = newParser(
        " * @param {string} foo.bar A dotted param.\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseReturnWithTypeNoWarnings() {
    JsDocInfoParser parser = newParser(
        " * @return {boolean} Whether it worked.\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseReturnWithoutTypeUsesUnknown() {
    JsDocInfoParser parser = newParser(
        " * @return Nothing special.\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParsePrivateVisibilityNoWarnings() {
    JsDocInfoParser parser = newParser(" * @private\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseVisibilityConflictWarns() {
    JsDocInfoParser parser = newParser(
        " * @private\n * @public\n */", true);
    assertTrue(parser.parse());
    assertEquals(1, reporter.warnings.size());
  }

  @Test
  public void testParseConstAnnotationNoWarnings() {
    JsDocInfoParser parser = newParser(" * @const\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseExtendsValidNoWarnings() {
    JsDocInfoParser parser = newParser(" * @extends {Foo}\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseImplementsMissingTypeNameWarns() {
    JsDocInfoParser parser = newParser(" * @implements\n */", true);
    assertTrue(parser.parse());
    assertEquals(1, reporter.warnings.size());
  }

  @Test
  public void testParseSuppressKnownNoWarnings() {
    JsDocInfoParser parser = newParserWithNames(
        " * @suppress {visibility}\n */", true,
        Sets.newHashSet("visibility"));
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseSuppressUnknownWarns() {
    JsDocInfoParser parser = newParser(" * @suppress {bogus}\n */", true);
    assertTrue(parser.parse());
    assertEquals(1, reporter.warnings.size());
  }

  @Test
  public void testParseSuppressMissingBraceNoWarning() {
    // ไม่มี '{' ตามหลัง @suppress -> parseSuppressTag คืน token เดิมโดยไม่ warn
    JsDocInfoParser parser = newParser(" * @suppress\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseModifiesUnknownWarns() {
    JsDocInfoParser parser = newParser(" * @modifies {bogus}\n */", true);
    assertTrue(parser.parse());
    assertEquals(1, reporter.warnings.size());
  }

  @Test
  public void testParseModifiesThisKeywordNoWarning() {
    JsDocInfoParser parser = newParser(" * @modifies {this}\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseTemplateValidNoWarnings() {
    JsDocInfoParser parser = newParser(" * @template T\n */", true);
    assertTrue(parser.parse());
    assertEquals(0, reporter.warnings.size());
  }

  @Test
  public void testParseTemplateEmptyWarns() {
    JsDocInfoParser parser = newParser(" * @template\n */", true);
    assertTrue(parser.parse());
    assertEquals(1, reporter.warnings.size());
  }

  @Test
  public void testParseFileOverviewDuplicateWarns() {
    JsDocInfoParser parser = newParser(
        " * @fileoverview First overview.\n"
        + " * @fileoverview Second overview.\n */", true);
    assertTrue(parser.parse());
    assertEquals(1, reporter.warnings.size());
    assertNotNull(parser.getFileOverviewJSDocInfo());
  }

  @Test
  public void testParseEOFTriggersFalseAndWarning() {
    // ไม่มี '*/' ปิด -> stream หมดกลางทาง -> JsDocToken.EOF -> parse() คืน false
    JsDocInfoParser parser = newParser(" * @deprecated", true);
    boolean result = parser.parse();
    assertFalse(result);
    assertEquals(1, reporter.warnings.size());
  }

  // =========================================================================
  // GROUP C: misc package-private methods
  // =========================================================================

  @Test
  public void testHasParsedJSDocInfoDefaultFalse() {
    JsDocInfoParser parser = newParser(" */", true);
    assertFalse(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParseInlineTypeDocValid() {
    JsDocInfoParser parser = newParser("{string}", true);
    JSDocInfo info = parser.parseInlineTypeDoc();
    assertNotNull(info);
  }

  @Test
  public void testParseInlineTypeDocInvalidReturnsNull() {
    JsDocInfoParser parser = newParser("", true);
    JSDocInfo info = parser.parseInlineTypeDoc();
    assertNull(info);
  }
}
```

## สรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| กลุ่ม | เมธอดทดสอบ (ตัวอย่าง) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| A | testParseSimpleTypeName, testParseStarType, testParseNullType/UndefinedType | `parseBasicTypeExpression`: STAR / STRING("null","undefined") / TypeName |
| A | testParseNullableSuffix/BangSuffix, testParseNullablePrefix/BangPrefix | `parseTypeExpression`: prefix QMARK/BANG, suffix `match(QMARK)`/`match(BANG)` |
| A | testParseUnknownTypeQmarkLookahead* | `parseTypeExpression` QMARK look-ahead (COMMA/PIPE branch → unknown-type node) |
| A | testParseUnionType* (parens/singlePipe/doublePipe) | `parseUnionType`, `parseTopLevelTypeExpression` (single/double pipe backward-compat) |
| A | testParseArrayType* | `parseArrayType`: element เดียว/หลาย element/varargs (`hasVarArgs` break) |
| A | testParseRecordType* | `parseRecordType`/`parseFieldTypeList`/`parseFieldType`: มี/ไม่มี `:` |
| A | testParseFunctionType* | `parseFunctionType`: params+return, ไม่มี params, void, this-context, bare `...`, old-style varargs `[type]`, missing `[` warning |
| A | testParseType
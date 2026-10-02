package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

/**
 * Unit tests for {@link JsDocInfoParser}.
 *
 * หมายเหตุสำคัญ:
 * - คลาสนี้ถูกวางไว้ใน package เดียวกับ target class เพื่อเข้าถึง
 *   package-private constructor/method ได้ (parse(), hasParsedJSDocInfo(), ฯลฯ)
 * - การสร้าง Config/JsDocTokenStream/NullErrorReporter อ้างอิงโดยตรงจาก
 *   วิธีที่เห็นในซอร์สต้นฉบับ (เมธอด parseTypeString) ซึ่งเป็นหลักฐานที่มีจริง
 *   ไม่ใช่การเดา
 * - ชื่อ annotation tag บางตัว (เช่น @preserveTry, @javaDispatch, @noshadow)
 *   ไม่มีอยู่ในซอร์สที่ให้มา (มีแต่ชื่อ enum) จึงอ้างอิงจากความรู้ทั่วไปของ
 *   Closure Compiler และมีคอมเมนต์กำกับความไม่แน่นอนไว้ในแต่ละจุด
 */
public class JsDocInfoParserTest {

  private Set<String> extraAnnotations;
  private Set<String> extraSuppressions;

  @Before
  public void setUp() {
    extraAnnotations = Sets.newHashSet();
    // ชื่อ suppression ที่กำหนดเองเพื่อควบคุมกรณี known/unknown suppression
    extraSuppressions = Sets.newHashSet("uselessCode", "with", "custom1");
  }

  /**
   * Helper: สร้าง parser จาก "เนื้อหาภายใน jsdoc comment" (ไม่รวม "/**" นำหน้า
   * แต่รวม "*\/" ปิดท้าย เพื่อให้ tokenizer สร้าง EOC ได้ถูกต้อง)
   * parseJsDocDocumentation = true เพื่อให้ครอบคลุม branch การสกัด description
   */
  private JsDocInfoParser createParser(String comment) {
    return createParser(comment, true);
  }

  private JsDocInfoParser createParser(String comment, boolean parseDocs) {
    JsDocTokenStream stream = new JsDocTokenStream(comment);
    Config config = new Config(
        extraAnnotations,
        extraSuppressions,
        parseDocs,
        LanguageMode.ECMASCRIPT3,
        false);
    return new JsDocInfoParser(stream, null, null, config,
        NullErrorReporter.forNewRhino());
  }

  // =======================================================================
  // parseTypeString(String) - public static entry point
  // =======================================================================

  @Test
  public void testParseTypeString_simpleName() {
    Node n = JsDocInfoParser.parseTypeString("string");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_star() {
    Node n = JsDocInfoParser.parseTypeString("*");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_questionMarkAlone() {
    // '?' ตัวเดียว หมายถึง unknown type (ตาม comment ในซอร์ส parseTypeExpression)
    Node n = JsDocInfoParser.parseTypeString("?");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_nullablePrefix() {
    Node n = JsDocInfoParser.parseTypeString("?Foo");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_nonNullablePrefix() {
    Node n = JsDocInfoParser.parseTypeString("!Foo");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_nullableSuffix() {
    Node n = JsDocInfoParser.parseTypeString("Foo?");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_nonNullableSuffix() {
    Node n = JsDocInfoParser.parseTypeString("Foo!");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_nullKeyword() {
    Node n = JsDocInfoParser.parseTypeString("null");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_undefinedKeyword() {
    Node n = JsDocInfoParser.parseTypeString("undefined");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_functionType() {
    Node n = JsDocInfoParser.parseTypeString("function(number, string): boolean");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_functionTypeThis() {
    Node n = JsDocInfoParser.parseTypeString("function(this:Object): void");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_functionTypeNew() {
    Node n = JsDocInfoParser.parseTypeString("function(new:Object): void");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_functionTypeMissingLp() {
    // "function" ไม่ตามด้วย '(' -> parseFunctionType คืน
    // reportTypeSyntaxWarning("msg.jsdoc.missing.lp") -> null
    Node n = JsDocInfoParser.parseTypeString("function");
    assertNull(n);
  }

  @Test
  public void testParseTypeString_recordType() {
    Node n = JsDocInfoParser.parseTypeString("{a: number, b: string}");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_unionTypeParen() {
    Node n = JsDocInfoParser.parseTypeString("(number|string)");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_unionTypeTopLevelPipe() {
    Node n = JsDocInfoParser.parseTypeString("number|string");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_unionTypeDoublePipe() {
    // รองรับ double pipe เพื่อ backward-compat ตาม comment ในซอร์ส
    Node n = JsDocInfoParser.parseTypeString("number||string");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_arrayType() {
    Node n = JsDocInfoParser.parseTypeString("[number,string]");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_arrayTypeVarArgs() {
    Node n = JsDocInfoParser.parseTypeString("[...number]");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_genericType() {
    Node n = JsDocInfoParser.parseTypeString("Array.<string>");
    assertNotNull(n);
  }

  @Test
  public void testParseTypeString_invalidTokenStart() {
    // ')' ที่จุดเริ่มต้นไม่ตรงกับ BasicTypeExpression ใดๆ -> null
    Node n = JsDocInfoParser.parseTypeString(")");
    assertNull(n);
  }

  @Test
  public void testParseTypeString_emptyString() {
    // สตริงว่าง -> tokenizer คืน EOF ทันที -> parseBasicTypeExpression คืน null
    Node n = JsDocInfoParser.parseTypeString("");
    assertNull(n);
  }

  // หมายเหตุ: ไม่ทดสอบ parseTypeString(null) เพราะพฤติกรรมของ
  // new JsDocTokenStream(null) ไม่ปรากฏในซอร์สที่ให้มา (ความเสี่ยงเดา behavior)

  // =======================================================================
  // parse() - full JSDoc parsing
  // =======================================================================

  @Test
  public void testParse_emptyComment_returnsTrue() {
    JsDocInfoParser parser = createParser("*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_unknownAnnotation_stillReturnsTrue() {
    JsDocInfoParser parser = createParser("@thisTagDoesNotExist\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_constructor() {
    JsDocInfoParser parser = createParser("@constructor\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.isConstructor());
  }

  @Test
  public void testParse_interface() {
    JsDocInfoParser parser = createParser("@interface\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.isInterface());
  }

  @Test
  public void testParse_constructorThenInterface_conflictWarningBranch() {
    // recordInterface() ควร false เพราะ isConstructorRecorded()==true
    // -> เข้า branch "msg.jsdoc.interface.constructor"
    JsDocInfoParser parser = createParser("@constructor\n@interface\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.isConstructor());
  }

  @Test
  public void testParse_constructorRecordedTwice_incompatTypeWarningBranch() {
    // recordConstructor() ครั้งที่สอง false, isInterfaceRecorded()==false
    // -> เข้า branch "msg.jsdoc.incompat.type"
    JsDocInfoParser parser = createParser("@constructor\n@constructor\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_deprecatedNoReason() {
    JsDocInfoParser parser = createParser("@deprecated\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.isDeprecated());
  }

  @Test
  public void testParse_deprecatedWithReason() {
    JsDocInfoParser parser = createParser("@deprecated Use Bar instead.\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.isDeprecated());
  }

  @Test
  public void testParse_desc() {
    JsDocInfoParser parser = createParser("@desc Some description.\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertNotNull(info.getDescription());
  }

  @Test
  public void testParse_descTwice_extraWarningBranch() {
    JsDocInfoParser parser = createParser("@desc First.\n@desc Second.\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_fileOverview() {
    JsDocInfoParser parser = createParser("@fileoverview Overview text.\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_fileOverviewAlreadySet_extraWarningBranch() {
    // ตั้ง fileOverviewJSDocInfo ไว้ก่อน (!= null) แล้วเจอ @fileoverview อีก
    // -> เงื่อนไข OR ฝั่งขวา (fileOverviewJSDocInfo != null) ต้อง true
    JsDocInfoParser helper = createParser("@fileoverview x\n*/");
    assertTrue(helper.parse());
    JSDocInfo existing = helper.getFileOverviewJSDocInfo();
    assertNotNull(existing);

    JsDocInfoParser parser = createParser("@fileoverview Overview text.\n*/");
    parser.setFileOverviewJSDocInfo(existing);
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_enumDefaultsToNumber() {
    // ไม่มี type ตามหลัง @enum ก่อน EOL -> ค่า default = number
    JsDocInfoParser parser = createParser("@enum\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.hasEnumParameterType());
  }

  @Test
  public void testParse_enumWithExplicitType() {
    JsDocInfoParser parser = createParser("@enum {string}\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.hasEnumParameterType());
  }

  @Test
  public void testParse_export() {
    JsDocInfoParser parser = createParser("@export\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_expose() {
    JsDocInfoParser parser = createParser("@expose\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_externs() {
    JsDocInfoParser parser = createParser("@externs\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_javaDispatch_uncertainTagSpelling() {
    // NOTE: ชื่อ tag จริงของ enum JAVA_DISPATCH ไม่ปรากฏในซอร์สที่ให้มา
    // ใช้ "@javaDispatch" ตามความรู้ทั่วไป หากสะกดผิดจะกลาย
    // เป็น branch "unknown annotation" แทน แต่ parse() ยังควร return true
    JsDocInfoParser parser = createParser("@javaDispatch\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_extendsBraceless() {
    JsDocInfoParser parser = createParser("@extends Foo\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_extendsWithBraces() {
    JsDocInfoParser parser = createParser("@extends {Foo}\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_extendsMissingTypeName_warningBranch() {
    JsDocInfoParser parser = createParser("@extends \n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_implements() {
    JsDocInfoParser parser = createParser("@implements {Foo}\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_hidden() {
    JsDocInfoParser parser = createParser("@hidden\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_lendsWithBraces() {
    JsDocInfoParser parser = createParser("@lends {Foo}\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_lendsMissingName_warningBranch() {
    JsDocInfoParser parser = createParser("@lends {}\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_lendsMissingRc_warningBranch() {
    JsDocInfoParser parser = createParser("@lends {Foo\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_meaning() {
    JsDocInfoParser parser = createParser("@meaning some meaning text\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_noAlias() {
    JsDocInfoParser parser = createParser("@noalias\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_noCompile() {
    JsDocInfoParser parser = createParser("@nocompile\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_noTypeCheck() {
    JsDocInfoParser parser = createParser("@notypecheck\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_notImplemented_uncertainTagSpelling() {
    // NOTE: การสะกดจริงของ tag สำหรับ NOT_IMPLEMENTED ไม่ปรากฏในซอร์ส
    JsDocInfoParser parser = createParser("@notImplemented\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_override() {
    JsDocInfoParser parser = createParser("@override\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_inheritDoc() {
    JsDocInfoParser parser = createParser("@inheritDoc\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_throwsWithType() {
    JsDocInfoParser parser = createParser("@throws {Error} bad things happen\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_throwsNoType() {
    JsDocInfoParser parser = createParser("@throws bad things happen\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_paramBasic() {
    JsDocInfoParser parser = createParser("@param {number} x The x value.\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertEquals(1, info.getParameterCount());
  }

  @Test
  public void testParse_paramBracketedOptional() {
    JsDocInfoParser parser = createParser("@param {number} [x] The x value.\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertEquals(1, info.getParameterCount());
  }

  @Test
  public void testParse_paramBracketedWithDefaultValueIgnored() {
    // ค่า default ของ JsDocToolkit ("=...") ต้องถูกอ่านทิ้ง
    JsDocInfoParser parser = createParser("@param {number} [x=5] The x value.\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertEquals(1, info.getParameterCount());
  }

  @Test
  public void testParse_paramBracketedMissingRb_warningBranch() {
    JsDocInfoParser parser = createParser("@param {number} [x description\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_paramMissingName_warningBranch() {
    JsDocInfoParser parser = createParser("@param {number}\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_paramDottedNameDiscarded() {
    // ชื่อพารามิเตอร์ที่มี '.' จะถูกทิ้งเงียบๆ ไม่ถูกบันทึก
    JsDocInfoParser parser = createParser("@param {number} x.y description\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertEquals(0, info.getParameterCount());
  }

  @Test
  public void testParse_paramDuplicateName_warningBranch() {
    JsDocInfoParser parser = createParser(
        "@param {number} x First.\n@param {string} x Second.\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_paramTypeParseError_recoveryBranch() {
    // '{' ไม่มี RC ปิด -> parseAndRecordParamTypeNode คืน null
    // -> เข้า branch eatTokensUntilEOL()+continue retry (recovery)
    JsDocInfoParser parser = createParser("@param {number x description\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_preserveTry_uncertainTagSpelling() {
    // NOTE: การสะกดจริงของ tag PRESERVE_TRY ไม่ปรากฏในซอร์สที่ให้มา
    JsDocInfoParser parser = createParser("@preserveTry\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_visibilityPrivate() {
    JsDocInfoParser parser = createParser("@private\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertEquals(Visibility.PRIVATE, info.getVisibility());
  }

  @Test
  public void testParse_visibilityProtected() {
    JsDocInfoParser parser = createParser("@protected\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertEquals(Visibility.PROTECTED, info.getVisibility());
  }

  @Test
  public void testParse_visibilityPublic() {
    JsDocInfoParser parser = createParser("@public\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertEquals(Visibility.PUBLIC, info.getVisibility());
  }

  @Test
  public void testParse_visibilityDuplicate_warningBranch() {
    JsDocInfoParser parser = createParser("@private\n@private\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_noShadow_uncertainTagSpelling() {
    // NOTE: การสะกดจริงของ tag NO_SHADOW ไม่ปรากฏในซอร์สที่ให้มา
    JsDocInfoParser parser = createParser("@noshadow\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_noSideEffects() {
    JsDocInfoParser parser = createParser("@nosideeffects\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_modifiesThis() {
    JsDocInfoParser parser = createParser("@modifies {this}\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_modifiesUnknownKeyword_warningBranch() {
    JsDocInfoParser parser = createParser("@modifies {foo}\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_modifiesMultipleWithPipe() {
    JsDocInfoParser parser = createParser("@modifies {this|arguments}\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_modifiesMissingRc_warningBranch() {
    JsDocInfoParser parser = createParser("@modifies {this\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_modifiesNoLcAtAll() {
    // token != LC -> parseModifiesTag คืน token เดิมทันที ไม่ทำอะไร
    JsDocInfoParser parser = createParser("@modifies this\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_modifiesRecordedTwice_duplicateWarningBranch() {
    JsDocInfoParser parser = createParser(
        "@modifies {this}\n@modifies {arguments}\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_implicitCast() {
    JsDocInfoParser parser = createParser("@implicitCast\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_seeWithReference() {
    JsDocInfoParser parser = createParser("@see SomeClass#someMethod\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_seeMissingReference_warningBranch() {
    JsDocInfoParser parser = createParser("@see \n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_suppressKnown() {
    JsDocInfoParser parser = createParser("@suppress {uselessCode}\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_suppressUnknown_warningBranch() {
    JsDocInfoParser parser = createParser("@suppress {notARealSuppression}\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_suppressMultiplePipe() {
    JsDocInfoParser parser = createParser("@suppress {uselessCode|with}\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_suppressMissingRc_warningBranch() {
    JsDocInfoParser parser = createParser("@suppress {uselessCode\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_suppressNoStringAfterLc_warningBranch() {
    JsDocInfoParser parser = createParser("@suppress {}\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_suppressDuplicate_warningBranch() {
    JsDocInfoParser parser = createParser(
        "@suppress {uselessCode}\n@suppress {with}\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_template() {
    JsDocInfoParser parser = createParser("@template T\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_templateMissingName_warningBranch() {
    JsDocInfoParser parser = createParser("@template \n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_templateRecordedTwice_warningBranch() {
    JsDocInfoParser parser = createParser("@template T\n@template U\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_idGenerator_uncertainTagSpelling() {
    JsDocInfoParser parser = createParser("@idGenerator\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_consistentIdGenerator_uncertainTagSpelling() {
    JsDocInfoParser parser = createParser("@consistentIdGenerator\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_constant() {
    JsDocInfoParser parser = createParser("@const\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_version() {
    JsDocInfoParser parser = createParser("@version 1.0.0\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_versionMissing_warningBranch() {
    JsDocInfoParser parser = createParser("@version \n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_versionRecordedTwice_warningBranch() {
    JsDocInfoParser parser = createParser("@version 1.0\n@version 2.0\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_define() {
    JsDocInfoParser parser = createParser("@define {boolean}\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_returnWithType() {
    JsDocInfoParser parser = createParser("@return {number} the result\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_returnNoTypeAnnotation_defaultsUnknown() {
    // lookAheadForTypeAnnotation() ควร false (ไม่มี '{' ตามหลัง)
    // -> typeNode = newNode(QMARK) ตาม branch พิเศษของ RETURN
    JsDocInfoParser parser = createParser("@return the result\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_returnRecordedTwice_incompatWarningBranch() {
    JsDocInfoParser parser = createParser(
        "@return {number} a\n@return {string} b\n*/");
    assertTrue(parser.parse());
  }

  @Test
  public void testParse_thisType() {
    JsDocInfoParser parser = createParser("@this {Object}\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_typeAnnotation() {
    JsDocInfoParser parser = createParser("@type {string}\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.hasType());
  }

  @Test
  public void testParse_typedef() {
    JsDocInfoParser parser = createParser("@typedef {string}\n*/");
    assertTrue(parser.parse());
    assertTrue(parser.hasParsedJSDocInfo());
  }

  @Test
  public void testParse_typeAnnotationParseError_recoveryBranch() {
    // '{' ไม่มี RC ปิด -> type == null -> เข้า branch "error reported..."
    // (คอมเมนต์ // error reported during recursive descent ในซอร์ส)
    JsDocInfoParser parser = createParser("@type {string\n*/");
    assertTrue(parser.parse());
  }

  // =======================================================================
  // Boundary / malformed input ที่ระดับ token stream
  // =======================================================================

  @Test
  public void testParse_unexpectedEof_returnsFalse() {
    // ไม่มี "*/" ปิด comment -> EOF branch -> return false
    JsDocInfoParser parser = createParser("@type {string}");
    assertFalse(parser.parse());
  }

  @Test
  public void testParse_starAndFreeTextBetweenAnnotations_defaultBranches() {
    // ครอบคลุมทั้งสองสาขาของ default-case ใน main retry-loop:
    //  1) token==STAR && state==SEARCHING_ANNOTATION -> skip
    //  2) token อื่น (ข้อความธรรมดา) -> state=SEARCHING_NEWLINE,
    //     eatTokensUntilEOL()
    JsDocInfoParser parser = createParser(
        "@constructor\n* Some more text.\n* @param {number} x The x value.\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.isConstructor());
    assertEquals(1, info.getParameterCount());
  }

  @Test
  public void testParse_eolResetsStateToSearchingAnnotation() {
    // ครอบคลุม case EOL: if (state==SEARCHING_NEWLINE) state=SEARCHING_ANNOTATION
    JsDocInfoParser parser = createParser("@constructor\n\n\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.isConstructor());
  }

  @Test
  public void testParse_blockDescriptionRecordedWhenParseDocumentationTrue() {
    // เนื้อความก่อน annotation แรก ถูกดักด้วย extractBlockComment และบันทึกลง
    // recordBlockDescription เมื่อ non-empty
    JsDocInfoParser parser = createParser(
        "This is a block description.\n@constructor\n*/");
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.isConstructor());
  }

  @Test
  public void testParse_blockDescriptionSkippedWhenParseDocumentationFalse() {
    // shouldParseDocumentation()==false และ token แรกไม่ใช่ ANNOTATION/EOC
    // -> recordBlockDescription("") (บันทึกแค่ "มี description" โดยไม่เก็บเนื้อหา)
    JsDocInfoParser parser = createParser(
        "This is ignored text.\n@constructor\n*/", false);
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.isConstructor());
  }

  @Test
  public void testParse_blockDescriptionNotRecordedWhenFirstTokenIsAnnotation() {
    // เมื่อ parseJsDocDocumentation=false และ token แรกคือ ANNOTATION ทันที
    // เงื่อนไข (token != ANNOTATION && token != EOC) เป็น false -> ไม่เรียก
    // recordBlockDescription เลย
    JsDocInfoParser parser = createParser("@constructor\n*/", false);
    assertTrue(parser.parse());
    JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
    assertTrue(info.isConstructor());
  }
}

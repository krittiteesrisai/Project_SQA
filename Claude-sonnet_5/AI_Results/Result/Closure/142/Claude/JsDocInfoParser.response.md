# วิเคราะห์และแนวทางการทดสอบ

**ข้อสังเกตสำคัญ**: คลาส `JsDocInfoParser` มี constructor แบบ package-private ที่ต้องพึ่งพา `Config`, `JsDocTokenStream`, `ErrorReporter` ซึ่ง**ไม่มีซอร์สโค้ดของคลาสเหล่านี้ให้มาในโจทย์** (ไม่ทราบ constructor signature ที่แน่นอนของ `Config` หรือพฤติกรรมเต็มของ `JsDocTokenStream` สำหรับ multi-line comment parsing) ดังนั้นตามข้อกำหนดที่ 4 (ห้ามเดา behavior) ผมจึงเลือกทดสอบผ่าน **`JsDocInfoParser.parseTypeString(String)`** ซึ่งเป็น `public static` เมธอดเดียวที่มีสัญญาแน่ชัดในซอร์สที่ให้มา (สร้าง `Config`/`JsDocTokenStream`/`ErrorReporter` ภายในตัวเองตามที่เห็นในโค้ด) และเมธอดนี้เรียกลึกเข้าไปถึง `parseTopLevelTypeExpression`, `parseTypeExpression`, `parseBasicTypeExpression`, `parseTypeName`, `parseFunctionType`, `parseParametersType`, `parseResultType`, `parseUnionType(WithAlternate)`, `parseArrayType`, `parseRecordType`, `parseFieldTypeList`, `parseFieldType`, `parseFieldName`, `skipEOLs`, `match`, `wrapNode`, `newNode`, `newStringNode`, `reportTypeSyntaxWarning` — ซึ่งครอบคลุม branch ส่วนใหญ่ของไฟล์ (ยกเว้น switch-case ของ `parse()` สำหรับ annotation tag ต่าง ๆ ที่ไม่สามารถเข้าถึงได้อย่างปลอดภัยโดยไม่เดา API ของ `Config`/`JsDocTokenStream`)

การอ้างอิงเมธอดของ `Node` (เช่น `getType()`, `getString()`, `getFirstChild()`) เป็น API มาตรฐานของไลบรารี Rhino/Closure ที่อยู่ใน classpath (ไม่ใช่การเดา behavior ของ "target class" แต่เป็นการอ่านผลลัพธ์ผ่าน API สาธารณะของ support library)

```java
package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

/**
 * Unit test สำหรับ {@link JsDocInfoParser}
 *
 * หมายเหตุสำคัญ: constructor ของ JsDocInfoParser เป็น package-private และต้องการ
 * Config / JsDocTokenStream / ErrorReporter ซึ่งไม่มีซอร์สโค้ดแนบมาในโจทย์
 * (ไม่ทราบ signature ที่แน่นอนของ Config หรือพฤติกรรมเต็มของ JsDocTokenStream)
 * ดังนั้นการทดสอบทั้งหมดจึงเรียกผ่าน public static entry point เดียวที่มีสัญญาชัดเจน
 * คือ {@link JsDocInfoParser#parseTypeString(String)} ซึ่งภายในสร้าง dependency ทั้งหมด
 * ให้เองตามที่ปรากฏในซอร์สโค้ดจริง เมธอดนี้ครอบคลุม private method จำนวนมาก
 * ของการ parse type-expression (แต่ไม่ครอบคลุม branch ของ parse() ที่จัดการ
 * @param/@return/@type ฯลฯ เนื่องจากเข้าถึงไม่ได้อย่างปลอดภัย)
 */
public class JsDocInfoParserTest {

  // ---------- BasicTypeExpression: STAR / STRING(null,undefined) / TypeName ----------

  @Test
  public void testParseTypeString_star_returnsStarNode() {
    Node result = JsDocInfoParser.parseTypeString("*");
    assertNotNull(result);
    assertEquals(Token.STAR, result.getType());
  }

  @Test
  public void testParseTypeString_nullLiteral_returnsStringNodeNull() {
    Node result = JsDocInfoParser.parseTypeString("null");
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("null", result.getString());
  }

  @Test
  public void testParseTypeString_undefinedLiteral_returnsStringNodeUndefined() {
    Node result = JsDocInfoParser.parseTypeString("undefined");
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("undefined", result.getString());
  }

  @Test
  public void testParseTypeString_simpleTypeName_returnsStringNode() {
    Node result = JsDocInfoParser.parseTypeString("MyClass");
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("MyClass", result.getString());
  }

  // ---------- TypeExpression: prefix/postfix QMARK & BANG ----------

  @Test
  public void testParseTypeString_prefixBang_wrapsBangNode() {
    Node result = JsDocInfoParser.parseTypeString("!Object");
    assertNotNull(result);
    assertEquals(Token.BANG, result.getType());
    Node child = result.getFirstChild();
    assertNotNull(child);
    assertEquals(Token.STRING, child.getType());
    assertEquals("Object", child.getString());
  }

  @Test
  public void testParseTypeString_prefixQmark_wrapsQmarkNode() {
    Node result = JsDocInfoParser.parseTypeString("?Object");
    assertNotNull(result);
    assertEquals(Token.QMARK, result.getType());
  }

  @Test
  public void testParseTypeString_postfixBang_wrapsBangNode() {
    Node result = JsDocInfoParser.parseTypeString("Object!");
    assertNotNull(result);
    assertEquals(Token.BANG, result.getType());
  }

  @Test
  public void testParseTypeString_postfixQmark_wrapsQmarkNode() {
    Node result = JsDocInfoParser.parseTypeString("Object?");
    assertNotNull(result);
    assertEquals(Token.QMARK, result.getType());
  }

  @Test
  public void testParseTypeString_prefixBangMissingName_returnsNull() {
    // '!' ตามด้วย EOF ทำให้ parseBasicTypeExpression คืน null -> wrapNode คืน null
    Node result = JsDocInfoParser.parseTypeString("!");
    assertNull(result);
  }

  // ---------- TypeName + TypeApplication (generics) ----------

  @Test
  public void testParseTypeString_genericSingleArg_returnsStringNodeWithChild() {
    Node result = JsDocInfoParser.parseTypeString("Array.<string>");
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("Array", result.getString());
    Node memberBlock = result.getFirstChild();
    assertNotNull(memberBlock);
    assertEquals(Token.BLOCK, memberBlock.getType());
  }

  @Test
  public void testParseTypeString_genericTwoArgs_returnsStringNodeWithBlockOfTwo() {
    Node result = JsDocInfoParser.parseTypeString("Object.<string,number>");
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    Node memberBlock = result.getFirstChild();
    assertEquals(Token.BLOCK, memberBlock.getType());
  }

  @Test
  public void testParseTypeString_genericMissingGt_returnsNull() {
    // ไม่มี '>' ปิด -> reportTypeSyntaxWarning("msg.jsdoc.missing.gt") -> null
    Node result = JsDocInfoParser.parseTypeString("Array.<string");
    assertNull(result);
  }

  // ---------- ArrayType ----------

  @Test
  public void testParseTypeString_arraySingle_returnsLbNode() {
    Node result = JsDocInfoParser.parseTypeString("[number]");
    assertNotNull(result);
    assertEquals(Token.LB, result.getType());
  }

  @Test
  public void testParseTypeString_arrayCommaList_returnsLbNode() {
    Node result = JsDocInfoParser.parseTypeString("[number,string]");
    assertNotNull(result);
    assertEquals(Token.LB, result.getType());
  }

  @Test
  public void testParseTypeString_arrayVarArgs_returnsLbNodeWithEllipsisChild() {
    Node result = JsDocInfoParser.parseTypeString("[...number]");
    assertNotNull(result);
    assertEquals(Token.LB, result.getType());
    Node child = result.getFirstChild();
    assertNotNull(child);
    assertEquals(Token.ELLIPSIS, child.getType());
  }

  @Test
  public void testParseTypeString_arrayMissingRb_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("[number");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_arrayMalformedElement_returnsNull() {
    // '[' ตามด้วย EOF ทันที -> parseTypeExpression(EOF) คืน null
    Node result = JsDocInfoParser.parseTypeString("[");
    assertNull(result);
  }

  // ---------- UnionType (parenthesized) ----------

  @Test
  public void testParseTypeString_parenUnion_returnsPipeNode() {
    Node result = JsDocInfoParser.parseTypeString("(number|string)");
    assertNotNull(result);
    assertEquals(Token.PIPE, result.getType());
  }

  @Test
  public void testParseTypeString_parenUnionDoublePipe_returnsPipeNode() {
    // รองรับ "||" เพื่อความ backwards-compatible
    Node result = JsDocInfoParser.parseTypeString("(number||string)");
    assertNotNull(result);
    assertEquals(Token.PIPE, result.getType());
  }

  @Test
  public void testParseTypeString_parenUnionMissingRp_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("(number|string");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_parenOnly_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("(");
    assertNull(result);
  }

  // ---------- Top-level union (ไม่มีวงเล็บ) ----------

  @Test
  public void testParseTypeString_topLevelUnionNoParens_returnsPipeNode() {
    Node result = JsDocInfoParser.parseTypeString("number|string");
    assertNotNull(result);
    assertEquals(Token.PIPE, result.getType());
  }

  @Test
  public void testParseTypeString_topLevelUnionDoublePipeNoParens_returnsPipeNode() {
    Node result = JsDocInfoParser.parseTypeString("number||string");
    assertNotNull(result);
    assertEquals(Token.PIPE, result.getType());
  }

  // ---------- RecordType ----------

  @Test
  public void testParseTypeString_recordSingleFieldWithColon_returnsLcNode() {
    Node result = JsDocInfoParser.parseTypeString("{a:number}");
    assertNotNull(result);
    assertEquals(Token.LC, result.getType());
  }

  @Test
  public void testParseTypeString_recordFieldNoColon_fieldTypeIsBareStringNode() {
    // FieldType ที่ไม่มี ':' จะคืน fieldName ตรง ๆ (ไม่ห่อด้วย Token.COLON)
    Node result = JsDocInfoParser.parseTypeString("{a}");
    assertNotNull(result);
    assertEquals(Token.LC, result.getType());
    Node fieldTypeList = result.getFirstChild();
    assertEquals(Token.LB, fieldTypeList.getType());
    Node field = fieldTypeList.getFirstChild();
    assertNotNull(field);
    assertEquals(Token.STRING, field.getType());
    assertEquals("a", field.getString());
  }

  @Test
  public void testParseTypeString_recordTwoFieldsCommaSeparated_returnsLcNode() {
    Node result = JsDocInfoParser.parseTypeString("{a:number,b:string}");
    assertNotNull(result);
    assertEquals(Token.LC, result.getType());
  }

  @Test
  public void testParseTypeString_emptyRecord_returnsNull() {
    // '{' ตามด้วย '}' ทันที -> parseFieldName ไม่เจอ STRING -> null
    Node result = JsDocInfoParser.parseTypeString("{}");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_recordUnclosed_singleChar_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("{");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_recordUnclosed_withField_returnsNull() {
    // มี field แต่ไม่มี '}' ปิด -> reportTypeSyntaxWarning("msg.jsdoc.missing.rc")
    Node result = JsDocInfoParser.parseTypeString("{a");
    assertNull(result);
  }

  // ---------- FunctionType ----------

  @Test
  public void testParseTypeString_functionMissingLp_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("function");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_functionNoParamsNoColon_returnsFunctionWithEmptyResult() {
    Node result = JsDocInfoParser.parseTypeString("function()");
    assertNotNull(result);
    assertEquals(Token.FUNCTION, result.getType());
    Node resultType = result.getFirstChild();
    assertNotNull(resultType);
    assertEquals(Token.EMPTY, resultType.getType());
  }

  @Test
  public void testParseTypeString_functionWithParamsAndBooleanReturn_returnsFunctionNode() {
    Node result = JsDocInfoParser.parseTypeString("function(number,string):boolean");
    assertNotNull(result);
    assertEquals(Token.FUNCTION, result.getType());
  }

  @Test
  public void testParseTypeString_functionVoidReturn_resultTypeIsVoid() {
    // Test นี้ตรงเจาะจง branch ':' void ใน parseResultType
    // *อาจดักจับ fault ที่เกี่ยวกับการอ่าน token ผิดตำแหน่งหลัง ')' ได้*
    Node result = JsDocInfoParser.parseTypeString("function():void");
    assertNotNull(result);
    assertEquals(Token.FUNCTION, result.getType());
    Node resultType = result.getFirstChild();
    assertNotNull(resultType);
    assertEquals(Token.VOID, resultType.getType());
  }

  @Test
  public void testParseTypeString_functionThisType_hitsThisBranch() {
    Node result = JsDocInfoParser.parseTypeString("function(this:Object):void");
    assertNotNull(result);
    assertEquals(Token.FUNCTION, result.getType());
    Node thisChild = result.getFirstChild();
    assertNotNull(thisChild);
    assertEquals(Token.THIS, thisChild.getType());
  }

  @Test
  public void testParseTypeString_functionThisMissingColon_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("function(this,number):void");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_functionBareVarArgs_returnsFunctionWithEllipsisParam() {
    // '...' ตามด้วย ')' ทันที -> paramType = newNode(ELLIPSIS) (bare, ไม่มี bracket type)
    Node result = JsDocInfoParser.parseTypeString("function(...):void");
    assertNotNull(result);
    assertEquals(Token.FUNCTION, result.getType());
  }

  @Test
  public void testParseTypeString_functionBracketedVarArgs_returnsFunctionNode() {
    // '...[type]' รูปแบบมี bracket ตามที่ parseParametersType กำหนด
    Node result = JsDocInfoParser.parseTypeString("function(...[number]):void");
    assertNotNull(result);
    assertEquals(Token.FUNCTION, result.getType());
  }

  @Test
  public void testParseTypeString_functionOptionalParam_returnsFunctionNode() {
    // ทดสอบ branch EQUALS (optional parameter) ใน parseParametersType
    Node result = JsDocInfoParser.parseTypeString("function(number=):void");
    assertNotNull(result);
    assertEquals(Token.FUNCTION, result.getType());
  }

  // ---------- Boundary / Null / Empty ----------

  @Test
  public void testParseTypeString_emptyString_returnsNull() {
    // ไม่มี token ที่ตรง STAR/LB/LC/LP/STRING -> parseBasicTypeExpression คืน null เสมอ
    Node result = JsDocInfoParser.parseTypeString("");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_nullInput_doesNotHangAndHandledConsistently() {
    // หมายเหตุ: ไม่มีการ null-check ที่มองเห็นได้ใน parseTypeString/JsDocTokenStream
    // ในซอร์สที่ให้มา จึงไม่สามารถยืนยัน behavior ที่แน่ชัดได้ -> ยอมรับได้ทั้ง null
    // ผลลัพธ์ หรือ NullPointerException
    try {
      Node result = JsDocInfoParser.parseTypeString(null);
      assertNull(result);
    } catch (NullPointerException expected) {
      // พฤติกรรมนี้ยอมรับได้ เนื่องจากไม่มีการ null-check ในซอร์สที่มองเห็นได้
      assertTrue(true);
    }
  }

  @Test
  public void testParseTypeString_garbageToken_returnsNull() {
    // token แรกเป็น RC ('}') ซึ่งไม่ตรงกับกรณีใดใน parseBasicTypeExpression
    Node result = JsDocInfoParser.parseTypeString("}");
    assertNull(result);
  }

  @Test
  public void testParseTypeString_qmarkAlone_missingBasicType_returnsNull() {
    Node result = JsDocInfoParser.parseTypeString("?");
    assertNull(result);
  }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testParseTypeString_star_returnsStarNode | `parseBasicTypeExpression`: token==STAR |
| testParseTypeString_nullLiteral_/_undefinedLiteral_ | `parseBasicTypeExpression`: STRING+"null"/"undefined" branch |
| testParseTypeString_simpleTypeName_returnsStringNode | `parseBasicTypeExpression`→`parseTypeName` ปกติ (else branch) |
| testParseTypeString_prefixBang/_prefixQmark | `parseTypeExpression`: token==BANG / QMARK (prefix) |
| testParseTypeString_postfixBang/_postfixQmark | `parseTypeExpression`: else branch + match(QMARK)/match(BANG) postfix |
| testParseTypeString_prefixBangMissingName_returnsNull | `wrapNode` เมื่อ n==null |
| testParseTypeString_genericSingleArg/_genericTwoArgs | `parseTypeName`: match(LT) true, `parseTypeExpressionList` ทั้ง single/comma loop |
| testParseTypeString_genericMissingGt_returnsNull | `parseTypeName`: !match(GT) → reportTypeSyntaxWarning |
| testParseTypeString_arraySingle/_arrayCommaList | `parseArrayType`: loop match(COMMA) true/false |
| testParseTypeString_arrayVarArgs | `parseArrayType`: token==ELLIPSIS, hasVarArgs break |
| testParseTypeString_arrayMissingRb_/_arrayMalformedElement | `parseArrayType`: !match(RB) / arg==null |
| testParseTypeString_parenUnion/_parenUnionDoublePipe | `parseUnionType`→`parseUnionTypeWithAlternate`: isPipe + double-pipe backward-compat |
| testParseTypeString_parenUnionMissingRp/_parenOnly | `parseUnionTypeWithAlternate`: alternate==null, !match(RP); expr==null early return |
| testParseTypeString_topLevelUnionNoParens/_DoublePipe | `parseTopLevelTypeExpression`: match(PIPE) branch (ไม่มีวงเล็บ) + double pipe |
| testParseTypeString_recordSingleFieldWithColon | `parseFieldType`: match(COLON) true |
| testParseTypeString_recordFieldNoColon | `parseFieldType`: !match(COLON) → return fieldName ตรง ๆ |
| testParseTypeString_recordTwoFieldsCommaSeparated | `parseFieldTypeList`: loop match(COMMA) true |
| testParseTypeString_emptyRecord/_recordUnclosed_* | `parseFieldName` default null / `parseRecordType` !match(RC) |
| testParseTypeString_functionMissingLp_returnsNull | `parseFunctionType`: token != LP |
| testParseTypeString_functionNoParamsNoColon | `parseFunctionType`: match(RP) ทันที (ไม่มี params) + `parseResultType`: !match(COLON) → EMPTY |
| testParseTypeString_functionWithParamsAndBooleanReturn | `parseParametersType` hasParams path + `parseResultType` generic type branch |
| testParseTypeString_functionVoidReturn_resultTypeIsVoid | `parseResultType`: match(STRING)+"void" branch (**จุดที่อาจดักจับ fault ของ Closure-142**) |
| testParseTypeString_functionThisType_hitsThisBranch | `parseFunctionType`: token=="this" + match(COLON) true |
| testParseTypeString_functionThisMissingColon_returnsNull | `parseFunctionType`: "this" ไม่มี COLON → reportTypeSyntaxWarning |
| testParseTypeString_functionBareVarArgs | `parseParametersType`: ELLIPSIS + match(RP) ทันที (bare) |
| testParseTypeString_functionBracketedVarArgs | `parseParametersType`: ELLIPSIS + match(LB) bracket-typed vararg |
| testParseTypeString_functionOptionalParam | `parseParametersType`: match(EQUALS) branch |
| testParseTypeString_emptyString_returnsNull | `parseBasicTypeExpression`: default → reportGenericTypeSyntaxWarning (boundary: empty input) |
| testParseTypeString_nullInput_* | Null input (boundary/null case, พฤติกรรมไม่ชัดเจน — คอมเมนต์กำกับ) |
| testParseTypeString_garbageToken_returnsNull | อินพุตผิดรูปแบบ (token ไม่ตรงกรณีใด) |
| testParseTypeString_qmarkAlone_missingBasicType_returnsNull | `parseTypeExpression`(QMARK) + `parseBasicTypeExpression`(EOF)==null → wrapNode(null) |

**ข้อจำกัดที่ระบุไว้ชัดเจน**: ไม่ได้ทดสอบ `parse()` (annotation tags เช่น `@param`, `@return`, `@type`, `@suppress` ฯลฯ) และ `parseSuppressTag`, `extractBlockComment`, `extractMultilineTextualBlock` โดยตรง เนื่องจากต้องพึ่งพา `Config`/`JsDocTokenStream` ที่ไม่มีซอร์สโค้ดยืนยัน constructor/behavior ให้ในโจทย์ — การเขียนเทสสำหรับส่วนนี้จะต้องเดา behavior ซึ่งขัดกับข้อกำหนดที่ 4
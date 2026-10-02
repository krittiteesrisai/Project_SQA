# วิเคราะห์และแนวทางการทดสอบ

**ข้อจำกัดสำคัญที่พบจากการวิเคราะห์ซอร์สโค้ด:**

- `CodeGenerator` เป็น package-private class ต้องวาง test ไว้ใน package `com.google.javascript.jscomp` เดียวกัน
- เมธอด `add(Node)` ส่วนใหญ่ (switch-case ทั้งหมด) ต้องพึ่งพา `CodeConsumer` (abstract class) ซึ่ง**ไม่มีซอร์สโค้ดให้มา** ผมจึงไม่สามารถ mock/implement มันได้โดยไม่เดา behavior ตามข้อกำหนดที่ 4 — จึงทดสอบเฉพาะ "จุดเข้า" ที่พิสูจน์ได้ตรงจากซอร์ส (NPE เมื่อ `cc == null`) และเน้นความครอบคลุมสูงสุดกับเมธอดที่ **ไม่ต้องพึ่ง CodeConsumer**: `isSimpleNumber`, `getSimpleNumber`, `identifierEscape`, `regexpEscape`, `escapeToDoubleQuotedJsString` (ผ่าน `forCostEstimation(null)`)
- ค่า string ที่คาดหวังถูกสร้างด้วยการ **concatenate ชิ้นย่อยที่มีคอมเมนต์กำกับ** แทนการเขียน escaped literal ยาว ๆ เพื่อลดความผิดพลาดจากการ escape ผิด
- branch ของ `Character.isSupplementaryCodePoint(...)` ใน `appendHexJavaScriptRepresentation(int,...)` **ไม่สามารถ reach ได้** จาก caller ที่มีอยู่ (caller ส่ง `char` เท่านั้น) — ไม่ทดสอบ พร้อมคอมเมนต์กำกับ
- สมมติฐานที่ไม่ verified 100% (คอมเมนต์กำกับไว้ในโค้ด): พฤติกรรมของ `NodeUtil.isLatin(String)` (คาดว่า pure-ASCII → true, มีอักขระนอก ASCII → false) และค่าคร่าว ๆ ของ `NodeUtil.MAX_POSITIVE_INTEGER_NUMBER` (คาดว่าน้อยกว่า `Long.MAX_VALUE` มาก)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * JUnit4 tests for {@link CodeGenerator}.
 *
 * หมายเหตุสำคัญ:
 * - CodeGenerator.add(Node) ส่วนใหญ่ (switch-case ทั้งหมดของ Token) ต้องใช้ CodeConsumer
 *   ซึ่งเป็น abstract class ที่ไม่มีซอร์สโค้ดให้มาในโจทย์นี้ ผมจึงไม่ implement/mock มันแบบเดา ๆ
 *   (ตามข้อ 4 ของโจทย์) จึงทดสอบเฉพาะ path ที่พิสูจน์ได้ตรงจากซอร์ส (การโยน NPE เมื่อ cc == null)
 *   และทดสอบ logic ที่ "ไม่พึ่งพา cc" อย่างละเอียดแทน (strEscape / isSimpleNumber / getSimpleNumber /
 *   identifierEscape) ซึ่งเข้าถึงได้ผ่าน static factory `forCostEstimation(null)`
 * - บางกรณีอิงสมมติฐานเกี่ยวกับ NodeUtil.isLatin(...) และ NodeUtil.MAX_POSITIVE_INTEGER_NUMBER
 *   ที่ไม่ได้ verify จาก source ที่ให้มา จะมีคอมเมนต์กำกับไว้ ณ จุดนั้น ๆ
 */
public class CodeGeneratorTest {

  // ======================================================================
  // isSimpleNumber(String)
  // ======================================================================

  @Test
  public void testIsSimpleNumber_emptyString_false() {
    // len == 0 -> false
    assertEquals(false, CodeGenerator.isSimpleNumber(""));
  }

  @Test
  public void testIsSimpleNumber_singleZero_true() {
    // len == 1 short-circuits the "leading zero" check
    assertEquals(true, CodeGenerator.isSimpleNumber("0"));
  }

  @Test
  public void testIsSimpleNumber_singleNonZeroDigit_true() {
    assertEquals(true, CodeGenerator.isSimpleNumber("5"));
  }

  @Test
  public void testIsSimpleNumber_multiDigitNoLeadingZero_true() {
    assertEquals(true, CodeGenerator.isSimpleNumber("123"));
  }

  @Test
  public void testIsSimpleNumber_multiDigitLeadingZero_false() {
    // len != 1 && charAt(0) == '0' -> false
    assertEquals(false, CodeGenerator.isSimpleNumber("0123"));
  }

  @Test
  public void testIsSimpleNumber_containsNonDigit_false() {
    // loop breaks on first non-digit char
    assertEquals(false, CodeGenerator.isSimpleNumber("12a"));
  }

  @Test
  public void testIsSimpleNumber_negativeSign_false() {
    // '-' < '0' -> caught by the range check
    assertEquals(false, CodeGenerator.isSimpleNumber("-5"));
  }

  // ======================================================================
  // getSimpleNumber(String)
  // ======================================================================

  @Test
  public void testGetSimpleNumber_valid_returnsParsedValue() {
    assertEquals(123.0d, CodeGenerator.getSimpleNumber("123"), 0.0d);
  }

  @Test
  public void testGetSimpleNumber_notSimpleNumber_returnsNaN() {
    // isSimpleNumber(s) == false path
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("12a")));
  }

  @Test
  public void testGetSimpleNumber_belowThresholdButHuge_returnsNaN() {
    // Long.MAX_VALUE (19 digits) is parseable by Long.parseLong without exception,
    // and is virtually certain to be >= NodeUtil.MAX_POSITIVE_INTEGER_NUMBER
    // (ค่านี้เกี่ยวข้องกับ JS safe integer ~2^53 ซึ่งเล็กกว่า Long.MAX_VALUE มาก - สมมติฐานความ
    // ปลอดภัยสูง แต่ยังไม่ verify จาก source ตรง ๆ)
    String s = String.valueOf(Long.MAX_VALUE);
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber(s)));
  }

  @Test
  public void testGetSimpleNumber_numberFormatException_returnsNaN() {
    // 20-digit all-nines string overflows Long.parseLong -> NumberFormatException
    // is caught internally -> falls through to NaN.
    String s = "99999999999999999999"; // 20 nines
    assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber(s)));
  }

  // ======================================================================
  // identifierEscape(String)
  //   สมมติฐาน (ไม่ verify จาก source ที่ให้): NodeUtil.isLatin(pure-ASCII) == true,
  //   NodeUtil.isLatin(มีอักขระ non-ASCII) == false
  // ======================================================================

  @Test
  public void testIdentifierEscape_pureAscii_unchanged() {
    assertEquals("hello123", CodeGenerator.identifierEscape("hello123"));
  }

  @Test
  public void testIdentifierEscape_fullyNonLatin_allEscaped() {
    // 'e5','672c','8a9e' = codepoints of 日,本,語
    String input = "\u65e5\u672c\u8a9e";
    String expected = "\\u65e5" + "\\u672c" + "\\u8a9e";
    assertEquals(expected, CodeGenerator.identifierEscape(input));
  }

  @Test
  public void testIdentifierEscape_mixedAsciiAndNonLatin() {
    // 'c','a','f' ascii ผ่านตรง ๆ, é (U+00E9) ถูก escape
    String input = "caf\u00e9";
    String expected = "caf" + "\\u00e9";
    assertEquals(expected, CodeGenerator.identifierEscape(input));
  }

  @Test
  public void testIdentifierEscape_boundaryDEL_escaped() {
    // c == 0x7F -> ไม่ผ่านเงื่อนไข c < 0x7F -> ต้อง escape (boundary test)
    String input = "a\u007F\u00e9"; // é เพื่อบังคับให้ isLatin(s) เป็น false ทั้ง string
    String expected = "a" + "\\u007f" + "\\u00e9";
    assertEquals(expected, CodeGenerator.identifierEscape(input));
  }

  @Test
  public void testIdentifierEscape_boundarySpace_passThrough() {
    // c == 0x20 -> อยู่ในช่วง (0x1F,0x7F) -> ผ่านตรง ๆ
    String input = " \u00e9";
    String expected = " " + "\\u00e9";
    assertEquals(expected, CodeGenerator.identifierEscape(input));
  }

  // ======================================================================
  // regexpEscape(String)  ->  quote = '/'
  //   ใช้ CodeGenerator.forCostEstimation(null) ซึ่งตั้ง trustedStrings = true เสมอ
  // ======================================================================

  @Test
  public void testRegexpEscape_simple_wrapsWithSlashes() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    assertEquals("/abc/", cg.regexpEscape("abc"));
  }

  @Test
  public void testRegexpEscape_backslash_passedThroughUnchanged() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "\\"; // 1 backslash char
    String expected = "/" + "\\" + "/"; // backslashEscape ของ regexpEscape คือ "\\" (1 ตัวอักษร)
    assertEquals(expected, cg.regexpEscape(input));
  }

  @Test
  public void testRegexpEscape_equalsAndAmpersand_rawBecauseIsRegexp() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    assertEquals("/a=b&c/", cg.regexpEscape("a=b&c"));
  }

  @Test
  public void testRegexpEscape_lt_noPatternMatch_raw() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    assertEquals("/a<b/", cg.regexpEscape("a<b"));
  }

  @Test
  public void testRegexpEscape_lt_matchesScriptTag_escaped() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "a</script";
    String expected = "/" + "a" + "\\x3c" + "/script" + "/";
    assertEquals(expected, cg.regexpEscape(input));
  }

  @Test
  public void testRegexpEscape_lt_matchesCommentStart_escaped() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "a<!--b";
    String expected = "/" + "a" + "\\x3c" + "!--b" + "/";
    assertEquals(expected, cg.regexpEscape(input));
  }

  @Test
  public void testRegexpEscape_gt_precededByDoubleDash_escaped() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "a-->b";
    String expected = "/" + "a--" + "\\x3e" + "b" + "/";
    assertEquals(expected, cg.regexpEscape(input));
  }

  @Test
  public void testRegexpEscape_gt_noPrecedingDash_raw() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    assertEquals("/a>b/", cg.regexpEscape("a>b"));
  }

  @Test
  public void testRegexpEscape_withCharsetEncoder_canEncodeBothBranches() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
    // 'A' canEncode == true -> raw ; é canEncode == false -> hex escape
    String result = cg.regexpEscape("A\u00e9", asciiEncoder);
    String expected = "/" + "A" + "\\u00e9" + "/";
    assertEquals(expected, result);
  }

  // ======================================================================
  // escapeToDoubleQuotedJsString(String) -> quote = '"', outputCharsetEncoder = null,
  //   useSlashV = false, isRegexp = false เสมอ
  // ======================================================================

  @Test
  public void testEscapeToDoubleQuotedJsString_plainAscii() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    assertEquals("\"hello\"", cg.escapeToDoubleQuotedJsString("hello"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_doubleQuoteEscaped() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "\"";
    String expected = "\"" + "\\\"" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_singleQuoteUnescaped() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "'";
    String expected = "\"" + "'" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_backslashDoubled() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "\\"; // 1 backslash char
    String expected = "\"" + "\\\\" + "\""; // backslashEscape = "\\\\" (2 backslash chars)
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_equalsAmpersand_rawWhenTrusted() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null); // trustedStrings = true
    assertEquals("\"a=b&c\"", cg.escapeToDoubleQuotedJsString("a=b&c"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_ltGt_rawWhenNoSpecialPattern() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    assertEquals("\"a<b>c\"", cg.escapeToDoubleQuotedJsString("a<b>c"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_ltMatchesScriptTag_escaped() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "a</script";
    String expected = "\"" + "a" + "\\x3c" + "/script" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_gtMatchesDoubleDash_escaped() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "a-->b";
    String expected = "\"" + "a--" + "\\x3e" + "b" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_nullChar() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "\u0000";
    String expected = "\"" + "\\x00" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_singleEscapeCharacters() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "\b\f\n\r\t";
    String expected = "\"" + "\\b" + "\\f" + "\\n" + "\\r" + "\\t" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_verticalTab_noSlashV() {
    // useSlashV เป็น false เสมอในเมธอดนี้ -> ใช้ \x0B ไม่ใช่ \v
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "\u000B";
    String expected = "\"" + "\\x0B" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_lineTerminators() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "\u2028\u2029";
    String expected = "\"" + "\\u2028" + "\\u2029" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_defaultControlChar_escaped() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "\u0001"; // ไม่ตรง case พิเศษใด ๆ, ไม่อยู่ในช่วง printable -> hex escape
    String expected = "\"" + "\\u0001" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_boundaryDEL_escaped() {
    // c == 0x7F -> ไม่เข้าเงื่อนไข c < 0x7F -> escape (boundary)
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "\u007F";
    String expected = "\"" + "\\u007f" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_boundaryTilde_raw() {
    // c == 0x7E -> อยู่ในช่วง (0x1F,0x7F) -> raw (boundary complement)
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    assertEquals("\"~\"", cg.escapeToDoubleQuotedJsString("~"));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_boundaryUnitSeparator_escaped() {
    // c == 0x1F -> ไม่เข้าเงื่อนไข c > 0x1F -> escape (boundary)
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    String input = "\u001F";
    String expected = "\"" + "\\u001f" + "\"";
    assertEquals(expected, cg.escapeToDoubleQuotedJsString(input));
  }

  @Test
  public void testEscapeToDoubleQuotedJsString_boundarySpace_raw() {
    // c == 0x20 -> raw (boundary complement)
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    assertEquals("\" \"", cg.escapeToDoubleQuotedJsString(" "));
  }

  // ======================================================================
  // add(String) / add(Node) - พึ่งพา CodeConsumer (cc) โดยตรง
  //   ทดสอบเฉพาะ path ที่พิสูจน์ได้ตรงจาก source: เมื่อ cc == null จะ NPE
  //   (ไม่ได้พยายาม mock/implement CodeConsumer เพราะไม่มี source ให้ - เลี่ยงการเดา)
  // ======================================================================

  @Test(expected = NullPointerException.class)
  public void testAddString_withoutConsumer_throwsNPE() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    cg.add("test");
  }

  @Test(expected = NullPointerException.class)
  public void testAddNode_withoutConsumer_throwsNPE() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    // n เป็น null ก็เพียงพอ เพราะ cc.continueProcessing() ถูกเรียกก่อนแตะ n ใด ๆ
    cg.add((Node) null);
  }

  @Test
  public void testForCostEstimation_returnsUsableInstance() {
    CodeGenerator cg = CodeGenerator.forCostEstimation(null);
    // ยืนยันว่า instance ถูกสร้างสำเร็จและ method ที่ไม่พึ่ง cc ทำงานได้ปกติ
    assertEquals("/x/", cg.regexpEscape("x"));
  }
}
```

## ตารางสรุป Test ↔ Branch/Condition ที่ครอบคลุม

| กลุ่ม / เมธอด | Test method(s) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `isSimpleNumber` | testIsSimpleNumber_* (7 tests) | `len==0` true/false, loop non-digit break, `len==1` true/false, `charAt(0)!='0'` true/false, ตัวอักษร `-` ไม่ผ่าน range check |
| `getSimpleNumber` | testGetSimpleNumber_* (4 tests) | `isSimpleNumber` false path, `try` สำเร็จและ `l<MAX` true, `l<MAX` false (fallthrough NaN), `NumberFormatException` catch branch |
| `identifierEscape` | testIdentifierEscape_* (5 tests) | `NodeUtil.isLatin(s)` true (return ตรง)/false (เข้า loop), boundary `c>0x1F` และ `c<0x7F` ทั้งสองด้าน (0x7F escape, 0x20 raw) |
| `regexpEscape(String)` / `regexpEscape(String,CharsetEncoder)` | testRegexpEscape_* (9 tests) | backslash passthrough, `=`/`&` raw (isRegexp/trusted), `<` ไม่ match/match `/script`/match `!--`, `>` match `--`/ไม่ match, `outputCharsetEncoder!=null` ทั้ง `canEncode` true/false |
| `escapeToDoubleQuotedJsString` | testEscapeToDoubleQuotedJsString_* (17 tests) | quote/backslash/singlequote escape, `=`/`&` raw, `<`/`>` raw & match ทั้งสอง pattern, control chars (`\0`,`\b`,`\f`,`\n`,`\r`,`\t`), `\u000B` (useSlashV=false), line terminators `\u2028/\u2029`, default charsetEncoder-null hex escape, boundary `0x1F/0x20/0x7E/0x7F` (branch coverage เต็มของ `c>0x1F && c<0x7F`) |
| `add(String)` / `add(Node)` | testAddString_withoutConsumer_throwsNPE, testAddNode_withoutConsumer_throwsNPE | ยืนยัน dependency กับ `cc` — NPE เมื่อ consumer เป็น null (จุดเข้าแรกของทั้งสองเมธอด) |
| `forCostEstimation` | testForCostEstimation_returnsUsableInstance | sanity check ว่า factory ทำงานถูกต้องตาม constructor ที่ให้มา |

**ส่วนที่ตั้งใจไม่ทดสอบ (พร้อมเหตุผล ไม่ได้เดา behavior):**
- switch-case ทั้งหมดใน `add(Node, Context)` (TRY/CATCH/FOR/IF/FUNCTION/... ฯลฯ), `unrollBinaryOperator`, `addNonEmptyStatement`, `jsString`/`addJsString` (private, ใช้ `useSlashV=true` ไม่ได้ผ่าน path อื่น) — ทั้งหมดต้องพึ่งพา `CodeConsumer` (abstract, ไม่มี source ให้) หรือ `Node` tree ที่ถูกต้องตาม grammar ซึ่งเสี่ยงเดาผิด
- branch `Character.isSupplementaryCodePoint(...)` ใน `appendHexJavaScriptRepresentation(int,...)` — unreachable จาก caller ที่มีอยู่ (ส่ง `char` เท่านั้น)
- constructor สาธารณะ `CodeGenerator(CodeConsumer, CompilerOptions)` — ต้องมี `CompilerOptions` จริงที่ไม่มี API ยืนยันจาก source
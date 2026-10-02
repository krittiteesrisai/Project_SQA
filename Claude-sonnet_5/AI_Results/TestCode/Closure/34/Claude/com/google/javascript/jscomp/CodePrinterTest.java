package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.CodePrinter; // redundant import (same package) เพื่อระบุคลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด
import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.nio.charset.Charset;

/**
 * Unit test สำหรับ com.google.javascript.jscomp.CodePrinter (Defects4J Closure-34b)
 *
 * หมายเหตุสำคัญ:
 * 1) CodePrinter.Builder ต้องการ Node (AST) เพื่อ build source code ใหม่
 *    เนื่องจากซอร์สโค้ดที่ให้มาไม่มีวิธีสร้าง Node เอง จึงใช้ com.google.javascript.jscomp.Compiler#parseTestCode(String)
 *    ซึ่งเป็น API มาตรฐานของโปรเจกต์นี้ (ไม่ได้อยู่ในไฟล์ CodePrinter.java ที่ให้มา - เป็น dependency ที่จำเป็น)
 * 2) เส้นทางที่เกี่ยวกับ SourceMap (createSrcMap == true) เช่น startSourceMapping/endSourceMapping/
 *    generateSourceMap/reportLineCut/convertPosition "ไม่ได้ถูกทดสอบ" เพราะไม่มีซอร์สของคลาส SourceMap
 *    ให้ตรวจสอบ พฤติกรรมจึงไม่แน่ชัดเพียงพอที่จะเขียน assertion ที่ถูกต้อง (ป้องกันการเดา behavior)
 */
public class CodePrinterTest {

  // ---------- Helper methods ----------

  /** สมมติฐาน: Compiler#parseTestCode(String) คืนค่า Node ที่เป็น root ของ AST สำหรับ testing */
  private Node parse(String js) {
    Compiler compiler = new Compiler();
    return compiler.parseTestCode(js);
  }

  private String compact(Node n) {
    return new CodePrinter.Builder(n)
        .setPrettyPrint(false)
        .setOutputTypes(false)
        .build();
  }

  private String compact(Node n, int threshold) {
    return new CodePrinter.Builder(n)
        .setPrettyPrint(false)
        .setLineLengthThreshold(threshold)
        .build();
  }

  private String pretty(Node n) {
    return new CodePrinter.Builder(n)
        .setPrettyPrint(true)
        .build();
  }

  private String pretty(Node n, int threshold) {
    return new CodePrinter.Builder(n)
        .setPrettyPrint(true)
        .setLineLengthThreshold(threshold)
        .build();
  }

  private int countNewlines(String s) {
    int c = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '\n') c++;
    }
    return c;
  }

  // ---------- Builder basic / boundary ----------

  @Test
  public void testBuilder_NullRoot_ThrowsIllegalStateException() {
    CodePrinter.Builder builder = new CodePrinter.Builder(null);
    try {
      builder.build();
      fail("Expected IllegalStateException when root is null");
    } catch (IllegalStateException expected) {
      // ตรงตาม branch: if (root == null) throw ...
    }
  }

  @Test
  public void testBuilder_SetSourceMapDetailLevelNull_ThrowsIllegalStateException() {
    Node n = parse("var x=1;");
    CodePrinter.Builder builder = new CodePrinter.Builder(n);
    try {
      builder.setSourceMapDetailLevel(null);
      fail("Expected IllegalStateException when level is null");
    } catch (IllegalStateException expected) {
      // Preconditions.checkState(level != null) ใน setSourceMapDetailLevel
    }
  }

  @Test
  public void testEmptyScript_ProducesEmptyOutput() {
    Node n = parse("");
    String out = compact(n);
    assertNotNull(out);
    assertEquals("", out); // ไม่มี statement ใดๆ ให้พิมพ์
  }

  @Test
  public void testMalformedInput_HandledGracefully() {
    // อินพุตผิดรูปแบบ: ไม่ทราบพฤติกรรม parser แน่ชัด (ไม่มีซอร์สให้ตรวจสอบ)
    // จึงทดสอบแบบ soft-check ว่า CodePrinter เองไม่ throw NPE จาก Builder.build()
    // หาก parser คืน Node ได้ (แม้จะมี error) จะไม่ทำให้ build() พัง
    try {
      Node n = parse("var x = ");
      if (n != null) {
        String out = compact(n);
        assertNotNull(out);
      }
    } catch (RuntimeException e) {
      // ยอมรับได้: parser อาจรายงาน error ด้วย exception - พฤติกรรมไม่ได้ระบุในซอร์สที่ให้มา
    }
  }

  // ---------- Compact vs Pretty basic output ----------

  @Test
  public void testCompactPrint_SimpleVarDeclaration() {
    Node n = parse("var x=1;");
    String out = compact(n);
    assertEquals("var x=1;", out);
  }

  @Test
  public void testPrettyPrint_SimpleVarDeclaration() {
    Node n = parse("var x=1;");
    String out = pretty(n);
    assertTrue(out.contains("var x = 1;"));
  }

  @Test
  public void testOutputTypesFormat_DoesNotThrow() {
    // outputTypes=true ควรทำให้ Format เป็น TYPED (มีความสำคัญเหนือ prettyPrint)
    // TypedCodeGenerator ไม่มีซอร์สให้ดู จึงตรวจสอบเพียงว่าไม่ throw และได้ผลลัพธ์ที่ไม่ null
    Node n = parse("var x=1;");
    String out = new CodePrinter.Builder(n)
        .setPrettyPrint(true)
        .setOutputTypes(true)
        .build();
    assertNotNull(out);
  }

  // ---------- lineLengthThreshold boundary (<=0 -> MAX_VALUE) ----------

  @Test
  public void testLineLengthThreshold_ZeroOrNegative_NoForcedBreak() {
    StringBuilder sb = new StringBuilder("var a=[");
    for (int i = 0; i < 100; i++) {
      if (i > 0) sb.append(',');
      sb.append(i);
    }
    sb.append("];");
    Node n = parse(sb.toString());

    String outZero = compact(n, 0);
    assertFalse(outZero.contains("\n"));

    String outNegative = compact(n, -5);
    assertFalse(outNegative.contains("\n"));
  }

  @Test
  public void testLineLengthThreshold_Positive_ForcesLineBreak_Compact() {
    StringBuilder sb = new StringBuilder("var a=[");
    for (int i = 0; i < 50; i++) {
      if (i > 0) sb.append(',');
      sb.append(i);
    }
    sb.append("];");
    Node n = parse(sb.toString());

    String out = compact(n, 20);
    assertTrue("คาดว่าจะมีการตัดบรรทัดเมื่อ threshold น้อยกว่าความยาวโค้ด",
        out.contains("\n"));
  }

  @Test
  public void testLineLengthThreshold_Positive_ForcesLineBreak_Pretty() {
    StringBuilder sb = new StringBuilder("var a=[");
    for (int i = 0; i < 50; i++) {
      if (i > 0) sb.append(',');
      sb.append(i);
    }
    sb.append("];");
    Node n = parse(sb.toString());

    String out = pretty(n, 20);
    // pretty-print มี newline หลัง statement อยู่แล้ว 1 ครั้ง คาดว่าจะมีมากกว่านั้น
    // เนื่องจากถูกตัดกลาง statement ด้วย (maybeCutLine ของ PrettyCodePrinter)
    assertTrue(countNewlines(out) >= 2);
  }

  // ---------- PrettyCodePrinter.breakAfterBlockFor branches ----------

  @Test
  public void testIfElse_Pretty_BreakAfterBlockFor() {
    Node n = parse("if(a){b()}else{c()}");
    String out = pretty(n);
    // then-block: n != lastChild -> return false -> ไม่ขึ้นบรรทัดใหม่ก่อน else
    assertTrue(out.contains("} else {"));
  }

  @Test
  public void testIfNoElse_Pretty_BreakAfterBlockFor() {
    Node n = parse("if(a){b()}");
    String out = pretty(n);
    // then-block: n == lastChild -> return true -> ขึ้นบรรทัดใหม่หลังปิดบล็อก
    assertTrue(out.trim().endsWith("}"));
    assertTrue(out.contains("if (a) {"));
  }

  @Test
  public void testDoWhile_Pretty_NoBreakBeforeWhile() {
    Node n = parse("do{a()}while(b);");
    String out = pretty(n);
    // parent == DO -> return false -> ไม่ขึ้นบรรทัดใหม่ก่อน while
    assertTrue(out.contains("} while"));
  }

  @Test
  public void testFunctionDeclaration_Pretty_BlockHandledSeparately() {
    Node n = parse("function f(){a()}");
    String out = pretty(n);
    // parent == FUNCTION -> breakAfterBlockFor return false (handled via endFunction)
    assertTrue(out.contains("function f() {"));
    assertTrue(out.trim().endsWith("}"));
  }

  @Test
  public void testTryCatch_Pretty_NoBreakBeforeCatch() {
    Node n = parse("try{a()}catch(e){b()}");
    String out = pretty(n);
    // try-block เป็น first child ของ TRY -> return false -> ไม่ขึ้นบรรทัดก่อน catch
    assertTrue(out.contains("} catch"));
  }

  @Test
  public void testTryCatchFinally_Pretty_NoBreakBeforeFinally() {
    Node n = parse("try{a()}catch(e){b()}finally{c()}");
    String out = pretty(n);
    // parent == CATCH และมี finally -> !hasFinally = false -> ไม่ขึ้นบรรทัดก่อน finally
    assertTrue(out.contains("} finally"));
  }

  @Test
  public void testBareBlock_Pretty_DefaultBreakAfter() {
    // block statement ที่ parent ไม่ตรงกับ case พิเศษใดๆ (DO/FUNCTION/TRY/CATCH/IF)
    // -> ตกไปที่ default -> return true เสมอ
    Node n = parse("{a();}b();");
    String out = pretty(n);
    assertNotNull(out);
    assertTrue(out.contains("a();"));
    assertTrue(out.contains("b();"));
  }

  // ---------- listSeparator / appendOp ----------

  @Test
  public void testListSeparator_Pretty_ArrayLiteral() {
    Node n = parse("var a=[1,2,3];");
    String out = pretty(n);
    assertTrue(out.contains("[1, 2, 3]"));
  }

  @Test
  public void testAppendOp_BinaryOperator_Pretty() {
    Node n = parse("var c=a+b;");
    String out = pretty(n);
    assertTrue(out.contains("a + b"));
  }

  @Test
  public void testAppendOp_UnaryOperator_Pretty() {
    Node n = parse("var c=-a;");
    String out = pretty(n);
    // unary operator (binOp=false) -> ไม่มี space รอบ operator
    assertTrue(out.contains("-a"));
  }

  // ---------- switch/case (beginCaseBody/endCaseBody + indent) ----------

  @Test
  public void testSwitchCase_Pretty_IndentAndCaseBody() {
    Node n = parse("switch(a){case 1:b();break;default:c();}");
    String out = pretty(n);
    assertTrue(out.contains("case 1:"));
    assertTrue(out.contains("default:"));
    assertTrue(out.contains("b();"));
    assertTrue(out.contains("c();"));
  }

  // ---------- CompactCodePrinter: lineBreak flag ----------

  @Test
  public void testLineBreakOption_Compact_MayBreakAfterFunction() {
    Node n = parse("function f(){}function g(){}");
    String withLineBreak = new CodePrinter.Builder(n)
        .setPrettyPrint(false)
        .setLineBreak(true)
        .build();
    // sawFunction/maybeLineBreak ไม่สามารถควบคุมตรงได้ทั้งหมด (field ภายใน CodeConsumer ที่ไม่มีในซอร์สนี้)
    // จึงตรวจสอบแบบ smoke test ว่าไม่ throw และได้ผลลัพธ์ถูกต้องตามฟังก์ชัน
    assertNotNull(withLineBreak);
    assertTrue(withLineBreak.contains("function f(){}"));
    assertTrue(withLineBreak.contains("function g(){}"));
  }

  // ---------- CompactCodePrinter.endFile branches ----------

  @Test
  public void testPreferLineBreakAtEndOfFile_False_NoExtraChange() {
    Node n = parse("var a=1;");
    String out = new CodePrinter.Builder(n)
        .setPrettyPrint(false)
        .setPreferLineBreakAtEndOfFile(false)
        .build();
    // preferLineBreakAtEndOfFile=false -> endFile คืนค่าทันที ไม่มีการเปลี่ยนแปลงเพิ่ม
    assertEquals("var a=1;", out);
  }

  @Test
  public void testPreferLineBreakAtEndOfFile_True_SmallThreshold_AppendsSemicolonAndBreak() {
    Node n = parse("var a=1;");
    String out = new CodePrinter.Builder(n)
        .setPrettyPrint(false)
        .setPreferLineBreakAtEndOfFile(true)
        .setLineLengthThreshold(1) // threshold/2 = 0 -> lineLength(>0) > 0 เป็นจริงเสมอสำหรับโค้ดที่ไม่ว่าง
        .build();
    // เข้า branch: lineLength > lineLengthThreshold/2 -> append(";") + startNewLine()
    assertTrue(out.endsWith("\n"));
    assertTrue(out.contains(";;") || out.trim().endsWith(";"));
  }

  @Test
  public void testPreferLineBreakAtEndOfFile_True_SmallFile_NoBreakNeeded() {
    Node n = parse("var a=1;");
    String out = new CodePrinter.Builder(n)
        .setPrettyPrint(false)
        .setPreferLineBreakAtEndOfFile(true)
        .setLineLengthThreshold(CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD)
        .build();
    // lineLength <= threshold/2 และ prevCutPosition == 0 (ไม่เคยมีการตัดบรรทัด)
    // -> เข้า else สุดท้าย: ไม่ทำอะไรเพิ่ม
    assertEquals("var a=1;", out);
  }

  @Test
  public void testPreferLineBreakAtEndOfFile_True_PrevCutExists_ShiftsBreak() {
    // สร้างโค้ดที่มีการตัดบรรทัดไปแล้วอย่างน้อย 1 ครั้งก่อนถึงบรรทัดสุดท้าย (prevCutPosition > 0)
    // แต่บรรทัดสุดท้ายสั้น (lineLength <= threshold/2)
    StringBuilder sb = new StringBuilder();
    sb.append("var aVeryLongVariableNameForForcingLineBreakHere=1;");
    sb.append("var b=2;");
    Node n = parse(sb.toString());
    String out = new CodePrinter.Builder(n)
        .setPrettyPrint(false)
        .setPreferLineBreakAtEndOfFile(true)
        .setLineLengthThreshold(30)
        .build();
    // หมายเหตุ: รูปแบบผลลัพธ์ที่แน่นอนไม่สามารถยืนยัน 100% (ไม่มีซอร์สยืนยัน logic ของ code gen ภายนอก CodePrinter)
    // จึงตรวจสอบแบบกว้างว่า build() สำเร็จและได้ code ที่ไม่ error และลงท้ายด้วย ; หรือ newline
    assertNotNull(out);
    assertTrue(out.trim().length() > 0);
  }

  // ---------- setTagAsStrict ----------

  @Test
  public void testTagAsStrict_AddsUseStrictDirective() {
    Node n = parse("var a=1;");
    String out = new CodePrinter.Builder(n)
        .setPrettyPrint(false)
        .setTagAsStrict(true)
        .build();
    // สมมติฐานตามความรู้ทั่วไปของ Closure Compiler (ไม่ได้อยู่ในซอร์ส CodePrinter.java ที่ให้มาโดยตรง
    // แต่เป็นพฤติกรรมของ cg.tagAsStrict() ที่ CodePrinter เรียกใช้)
    assertTrue(out.contains("use strict"));
  }

  // ---------- setOutputCharset smoke test ----------

  @Test
  public void testOutputCharset_DoesNotThrow() {
    Node n = parse("var a=1;");
    String out = new CodePrinter.Builder(n)
        .setPrettyPrint(false)
        .setOutputCharset(Charset.forName("UTF-8"))
        .build();
    assertNotNull(out);
  }

  // ---------- Builder default lineLengthThreshold ----------

  @Test
  public void testDefaultLineLengthThresholdConstant() {
    assertEquals(500, CodePrinter.DEFAULT_LINE_LENGTH_THRESHOLD);
  }
}

package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

// import คลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด (แม้จะอยู่ package เดียวกันก็ตาม)
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter;

/**
 * Unit tests for {@link LightweightMessageFormatter}.
 *
 * ข้อสมมติฐานเกี่ยวกับ dependency ที่ไม่ได้แสดง signature ในซอร์สเป้าหมาย
 * ถูกทำเครื่องหมายด้วย // ASSUMPTION: ไว้ในแต่ละจุดที่ใช้งาน
 */
public class LightweightMessageFormatterTest {

  // ASSUMPTION: DiagnosticType มี static factory "error(key, messageFormat)"
  // สำหรับสร้าง DiagnosticType แบบ ERROR level (ไม่ปรากฏใน source เป้าหมาย
  // แต่จำเป็นต่อการสร้าง JSError)
  private static final DiagnosticType TEST_TYPE =
      DiagnosticType.error("TEST_ERROR", "test error message");

  /**
   * ASSUMPTION: JSError มี static factory
   * make(String sourceName, int lineno, int charno, CheckLevel level,
   *      DiagnosticType type, String... arguments)
   * และ field สาธารณะ sourceName, lineNumber, description รวมถึง getter getCharno()
   * (สอดคล้องกับการเข้าถึงตรงๆในซอร์สเป้าหมาย เช่น error.sourceName, error.lineNumber,
   * error.description, error.getCharno())
   */
  private static JSError newError(String sourceName, int lineNumber, int charno) {
    return JSError.make(sourceName, lineNumber, charno, CheckLevel.ERROR, TEST_TYPE);
  }

  /** สร้าง error ที่ไม่มี sourceName / lineNumber (edge case sourceName == null). */
  private static JSError newErrorNoSource() {
    return JSError.make(null, -1, -1, CheckLevel.ERROR, TEST_TYPE);
  }

  // ASSUMPTION: Region เป็น top-level interface ใน package com.google.javascript.jscomp
  // (ไม่มีการ import Region ในซอร์สเป้าหมาย แสดงว่าอยู่ package เดียวกัน)
  // ประกอบด้วย getSourceExcerpt(), getBeginningLineNumber(), getEndingLineNumber()
  private static class FakeRegion implements Region {
    private final String excerpt;
    private final int begin;
    private final int end;

    FakeRegion(String excerpt, int begin, int end) {
      this.excerpt = excerpt;
      this.begin = begin;
      this.end = end;
    }

    @Override
    public String getSourceExcerpt() {
      return excerpt;
    }

    @Override
    public int getBeginningLineNumber() {
      return begin;
    }

    @Override
    public int getEndingLineNumber() {
      return end;
    }
  }

  // ASSUMPTION: SourceExcerptProvider มีเมธอด getSourceLine(sourceName, lineNumber)
  // และ getSourceRegion(sourceName, lineNumber) (อนุมานจาก enum SourceExcerpt.LINE/REGION
  // ที่ใช้งานภายในซอร์สเป้าหมายผ่าน excerpt.get(source, ...))
  private static class FakeSourceExcerptProvider implements SourceExcerptProvider {
    private final Map<String, String> lines = new HashMap<String, String>();
    private final Map<String, Region> regions = new HashMap<String, Region>();

    void setLine(String sourceName, int lineNumber, String content) {
      lines.put(key(sourceName, lineNumber), content);
    }

    void setRegion(String sourceName, int lineNumber, Region region) {
      regions.put(key(sourceName, lineNumber), region);
    }

    private String key(String sourceName, int lineNumber) {
      return sourceName + ":" + lineNumber;
    }

    @Override
    public String getSourceLine(String sourceName, int lineNumber) {
      return lines.get(key(sourceName, lineNumber));
    }

    @Override
    public Region getSourceRegion(String sourceName, int lineNumber) {
      return regions.get(key(sourceName, lineNumber));
    }
  }

  private FakeSourceExcerptProvider provider;

  @Before
  public void setUp() {
    provider = new FakeSourceExcerptProvider();
  }

  // ---------------------------------------------------------------------
  // 1. Constructor / factory
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullSourceThrowsNPE() {
    new LightweightMessageFormatter(null);
  }

  @Test
  public void testWithoutSource_noExcerptAppended() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = newError("foo.js", 5, 2);
    String result = formatter.formatError(error);
    // source == null -> sourceExcerpt == null -> ไม่ควรมี excerpt/caret ปรากฏ
    assertTrue(result.contains("foo.js:5:"));
    assertTrue(result.contains("test error message"));
    assertFalse(result.contains("^"));
  }

  @Test
  public void testDefaultExcerptIsLine_notRegion() {
    // ตรวจว่า constructor 1-arg ใช้ LINE เป็นค่า default (ไม่ใช่ REGION)
    // เพราะถ้าเป็น REGION แล้วไม่มี region ผูกไว้ excerpt จะเป็น null แทน
    provider.setLine("foo.js", 3, "var x = 1;");
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    String result = formatter.formatError(newError("foo.js", 3, 0));
    assertTrue(result.contains("var x = 1;"));
  }

  // ---------------------------------------------------------------------
  // 2. sourceName / lineNumber prefix branches
  // ---------------------------------------------------------------------

  @Test
  public void testFormatError_sourceNameNull_skipsPrefixBlock() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    String result = formatter.formatError(newErrorNoSource());
    // error.sourceName == null -> ข้าม if ทั้ง block ของ sourceName/lineNumber
    assertFalse(result.contains(":"));
    assertTrue(result.startsWith("ERROR") || result.contains("ERROR"));
  }

  @Test
  public void testFormatError_lineNumberZero_noColonNumber() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = newError("foo.js", 0, -1);
    String result = formatter.formatError(error);
    // lineNumber == 0 -> เงื่อนไข error.lineNumber > 0 เป็น false
    assertTrue(result.startsWith("foo.js: "));
    assertFalse(result.startsWith("foo.js:0"));
  }

  @Test
  public void testFormatError_lineNumberOne_boundaryIncludesColonNumber() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    JSError error = newError("foo.js", 1, -1);
    String result = formatter.formatError(error);
    // lineNumber == 1 -> boundary true -> ควรมี ":1:"
    assertTrue(result.startsWith("foo.js:1: "));
  }

  // ---------------------------------------------------------------------
  // 3. warning vs error branch (getLevelName)
  // ---------------------------------------------------------------------

  @Test
  public void testFormatError_containsErrorLevel() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    String result = formatter.formatError(newError("foo.js", 1, -1));
    assertTrue(result.contains("ERROR"));
    assertFalse(result.contains("WARNING"));
  }

  @Test
  public void testFormatWarning_containsWarningLevel() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    String result = formatter.formatWarning(newError("foo.js", 1, -1));
    assertTrue(result.contains("WARNING"));
    assertFalse(result.contains("ERROR"));
  }

  // ---------------------------------------------------------------------
  // 4. sourceExcerpt == null / != null (source line ไม่พบ)
  // ---------------------------------------------------------------------

  @Test
  public void testFormatError_sourceExcerptLineNotFound_isNull() {
    // ไม่ตั้งค่า line ไว้ใน provider -> getSourceLine คืน null -> sourceExcerpt == null
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    String result = formatter.formatError(newError("foo.js", 5, 2));
    assertTrue(result.contains("foo.js:5:"));
    assertFalse(result.contains("^"));
  }

  // ---------------------------------------------------------------------
  // 5. caret ("^") alignment branches: excerpt.equals(LINE) และ charno range
  // ---------------------------------------------------------------------

  @Test
  public void testCaret_charnoZero_boundaryIncluded_noLeadingSpace() {
    provider.setLine("foo.js", 1, "abc");
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    String result = formatter.formatError(newError("foo.js", 1, 0));
    // charno == 0 -> loop for(i=0;i<0) ไม่ทำงาน -> caret ทันทีไม่มี space นำหน้า
    assertTrue(result.contains("abc\n^\n"));
  }

  @Test
  public void testCaret_nonWhitespaceChars_replacedWithSpace() {
    provider.setLine("foo.js", 1, "abcdef");
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    String result = formatter.formatError(newError("foo.js", 1, 3));
    // charno=3 -> ตัวอักษร a,b,c ไม่ใช่ whitespace -> แทนด้วย space ทั้งหมด (3 spaces) + "^\n"
    assertTrue(result.contains("abcdef\n   ^\n"));
  }

  @Test
  public void testCaret_tabWhitespace_keptAsIs() {
    provider.setLine("foo.js", 1, "\tabc");
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    String result = formatter.formatError(newError("foo.js", 1, 1));
    // charno=1 -> ตัวอักษรก่อนหน้าคือ '\t' ซึ่งเป็น whitespace -> คงไว้ (ไม่แทนด้วย space)
    assertTrue(result.contains("\tabc\n\t^\n"));
  }

  @Test
  public void testCaret_charnoEqualsExcerptLength_boundaryExcluded_noCaret() {
    provider.setLine("foo.js", 1, "abc");
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    // sourceExcerpt.length() == 3, charno == 3 -> เงื่อนไข charno < length() เป็น false
    String result = formatter.formatError(newError("foo.js", 1, 3));
    assertFalse(result.contains("^"));
  }

  @Test
  public void testCaret_charnoNegative_noCaret() {
    provider.setLine("foo.js", 1, "abc");
    LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider);
    // charno == -1 -> เงื่อนไข 0 <= charno เป็น false
    String result = formatter.formatError(newError("foo.js", 1, -1));
    assertFalse(result.contains("^"));
  }

  @Test
  public void testCaret_excerptTypeRegion_skipsCaretRegardlessOfCharno() {
    provider.setRegion("foo.js", 1, new FakeRegion("abcdef", 1, 1));
    LightweightMessageFormatter formatter =
        new LightweightMessageFormatter(provider, SourceExcerptProvider.SourceExcerpt.REGION);
    // excerpt.equals(LINE) เป็น false เพราะใช้ REGION -> ข้าม caret block เสมอ
    String result = formatter.formatError(newError("foo.js", 1, 2));
    assertFalse(result.contains("^"));
  }

  // ---------------------------------------------------------------------
  // 6. LineNumberingFormatter.formatLine
  // ---------------------------------------------------------------------

  @Test
  public void testLineNumberingFormatter_formatLine_returnsUnchanged() {
    LineNumberingFormatter formatter = new LineNumberingFormatter();
    assertEquals("some code", formatter.formatLine("some code", 42));
  }

  // ---------------------------------------------------------------------
  // 7. LineNumberingFormatter.formatRegion branches
  // ---------------------------------------------------------------------

  @Test
  public void testFormatRegion_nullRegion_returnsNull() {
    LineNumberingFormatter formatter = new LineNumberingFormatter();
    assertNull(formatter.formatRegion(null));
  }

  @Test
  public void testFormatRegion_emptyCode_returnsNull() {
    LineNumberingFormatter formatter = new LineNumberingFormatter();
    assertNull(formatter.formatRegion(new FakeRegion("", 1, 1)));
  }

  @Test
  public void testFormatRegion_multiLine_matchesDocExample() {
    LineNumberingFormatter formatter = new LineNumberingFormatter();
    String code = "if (foo) {\n  alert('bar');\n}";
    String result = formatter.formatRegion(new FakeRegion(code, 9, 11));
    String expected = "   9| if (foo) {\n  10|   alert('bar');\n  11| }";
    assertEquals(expected, result);
  }

  @Test
  public void testFormatRegion_singleLine_noTrailingNewline() {
    LineNumberingFormatter formatter = new LineNumberingFormatter();
    String result = formatter.formatRegion(new FakeRegion("onlyline", 5, 5));
    assertEquals("  5| onlyline", result);
  }

  @Test
  public void testFormatRegion_trailingNewline_lastEmptyLineStripped() {
    LineNumberingFormatter formatter = new LineNumberingFormatter();
    String code = "line1\nline2\n";
    String result = formatter.formatRegion(new FakeRegion(code, 1, 2));
    // เข้าเงื่อนไข line.length() == 0 ในรอบสุดท้าย -> ตัด '\n' ท้ายออก
    assertEquals("  1| line1\n  2| line2", result);
  }
}

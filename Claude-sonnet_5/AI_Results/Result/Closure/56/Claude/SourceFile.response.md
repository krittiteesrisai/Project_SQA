# วิเคราะห์และออกแบบ Test Cases

จากการวิเคราะห์ซอร์สโค้ด `SourceFile.java` พบ branch/condition สำคัญที่ต้องครอบคลุม เช่น constructor validation, การ cache code แบบ lazy (Generated/OnDisk), logic ของ `getLine()`/`getRegion()` ที่มีการเก็บ state (lastOffset/lastLine), และ IOException handling

**หมายเหตุสำคัญ:** จากการวิเคราะห์ พบว่า:
1. `getCode()` ของ base class คืนค่า `null` ได้โดยไม่ throw exception ถ้ายังไม่ set code → ทำให้ `getLine()`/`getRegion()` เกิด `NullPointerException` (ไม่ถูกจับด้วย `catch(IOException)`) — นี่คือ fault ที่แท้จริงในโค้ด จึงเขียนเทสไว้เพื่อ "document" behavior นี้
2. บรรทัดสุดท้ายที่ไม่มี `\n` ปิดท้าย จะทำให้ `getLine()` คืนค่า `null` แทนเนื้อหาบรรทัดนั้น — เป็น edge-case behavior ที่ derive ได้จากโค้ดจริง ไม่ใช่การเดา
3. `Region`/`SimpleRegion` ไม่มี source ให้ จึงทดสอบเฉพาะ `null`/`non-null` ของ return value โดยไม่เรียก method อื่นบน object นั้น (ป้องกันการเดา API)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;
// import ตามข้อกำหนด (แม้จะอยู่ package เดียวกันแล้ว - ไม่ก่อ compile error)
import com.google.javascript.jscomp.SourceFile;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

/**
 * Unit tests for {@link SourceFile} (Defects4J: Closure-56b).
 *
 * หมายเหตุ: test class ถูกวางไว้ใน package เดียวกับ SourceFile
 * เพื่อให้เข้าถึง package-private members ได้ (getNumLines, hasSourceInMemory,
 * setIsExtern) ตามที่ปรากฏใน source
 */
public class SourceFileTest {

  //////////////////////////////////////////////////////////////////////
  // Helper: subclass ที่จำลอง IOException เพื่อทดสอบ catch(IOException)
  // branch ใน getLine(), getRegion(), findLineOffsets()
  //////////////////////////////////////////////////////////////////////
  private static class ThrowingSourceFile extends SourceFile {
    private static final long serialVersionUID = 1L;

    ThrowingSourceFile(String fileName) {
      super(fileName);
    }

    @Override
    public String getCode() throws IOException {
      throw new IOException("Simulated IO failure for testing");
    }
  }

  private File createTempFile(String content) throws IOException {
    File f = File.createTempFile("sourceFileTest", ".js");
    f.deleteOnExit();
    Files.write(content, f, Charsets.UTF_8);
    return f;
  }

  //////////////////////////////////////////////////////////////////////
  // Constructor tests
  //////////////////////////////////////////////////////////////////////

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_NullFileNameThrows() {
    new SourceFile(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_EmptyFileNameThrows() {
    new SourceFile("");
  }

  @Test
  public void testConstructor_WhitespaceFileNameAllowed() {
    // fileName.isEmpty() เป็น false สำหรับ " " จึงไม่ throw
    SourceFile sf = new SourceFile(" ");
    assertEquals(" ", sf.getName());
    assertEquals(" ", sf.toString());
  }

  @Test
  public void testGetCode_ReturnsNullWhenNotSet() throws IOException {
    // Base SourceFile ที่ไม่ผ่าน factory method ใด ๆ: code field ยังเป็น null
    SourceFile sf = new SourceFile("bare.js");
    assertNull(sf.getCode());
    assertNull(sf.getCodeNoCache());
    assertFalse(sf.hasSourceInMemory());
  }

  //////////////////////////////////////////////////////////////////////
  // getName / toString / getOriginalPath / setOriginalPath / isExtern
  //////////////////////////////////////////////////////////////////////

  @Test
  public void testGetOriginalPath_DefaultsToFileName() {
    SourceFile sf = SourceFile.fromCode("name.js", "code");
    assertEquals("name.js", sf.getOriginalPath());
    assertEquals("name.js", sf.getName());
    assertEquals("name.js", sf.toString());
  }

  @Test
  public void testGetOriginalPath_ExplicitViaThreeArgFromCode() {
    SourceFile sf = SourceFile.fromCode("name.js", "orig/path.js", "code");
    assertEquals("orig/path.js", sf.getOriginalPath());
    assertEquals("name.js", sf.getName());
  }

  @Test
  public void testSetOriginalPath_OverridesDefault() {
    SourceFile sf = SourceFile.fromCode("name.js", "code");
    sf.setOriginalPath("custom/path.js");
    assertEquals("custom/path.js", sf.getOriginalPath());
  }

  @Test
  public void testIsExtern_DefaultFalseAndSetter() {
    SourceFile sf = SourceFile.fromCode("a.js", "code");
    assertFalse(sf.isExtern());
    sf.setIsExtern(true);
    assertTrue(sf.isExtern());
    sf.setIsExtern(false);
    assertFalse(sf.isExtern());
  }

  //////////////////////////////////////////////////////////////////////
  // Preloaded (fromCode) - getCode/getCodeNoCache/getCodeReader/clearCachedSource
  //////////////////////////////////////////////////////////////////////

  @Test
  public void testFromCode_BasicRoundTrip() throws IOException {
    SourceFile sf = SourceFile.fromCode("a.js", "hello world");
    assertEquals("hello world", sf.getCode());
    assertEquals("hello world", sf.getCodeNoCache());
    assertTrue(sf.hasSourceInMemory());
  }

  @Test
  public void testFromCode_GetCodeReader() throws IOException {
    SourceFile sf = SourceFile.fromCode("a.js", "reader test");
    Reader r = sf.getCodeReader();
    assertEquals("reader test", CharStreams.toString(r));
  }

  @Test
  public void testPreloaded_ClearCachedSource_IsNoOp() throws IOException {
    // Preloaded ไม่ override clearCachedSource() -> ใช้ default (no-op)
    SourceFile sf = SourceFile.fromCode("a.js", "hello");
    sf.clearCachedSource();
    assertEquals("hello", sf.getCode());
    assertTrue(sf.hasSourceInMemory());
  }

  //////////////////////////////////////////////////////////////////////
  // fromFile (OnDisk)
  //////////////////////////////////////////////////////////////////////

  @Test
  public void testFromFile_File_ReadsContentLazily() throws IOException {
    File f = createTempFile("disk content lazy");
    SourceFile sf = SourceFile.fromFile(f);
    assertFalse(sf.hasSourceInMemory());
    assertEquals("disk content lazy", sf.getCode());
    assertTrue(sf.hasSourceInMemory());
    assertEquals(f.getPath(), sf.getName());
  }

  @Test
  public void testFromFile_StringFileName() throws IOException {
    File f = createTempFile("disk content string");
    SourceFile sf = SourceFile.fromFile(f.getPath());
    assertEquals("disk content string", sf.getCode());
    assertEquals(f.getPath(), sf.getName());
  }

  @Test
  public void testFromFile_StringFileNameWithCharset() throws IOException {
    File f = createTempFile("disk content charset");
    SourceFile sf = SourceFile.fromFile(f.getPath(), Charsets.UTF_8);
    assertEquals("disk content charset", sf.getCode());
  }

  @Test
  public void testFromFile_FileWithNonNullCharset() throws IOException {
    File f = createTempFile("charset branch true");
    SourceFile sf = SourceFile.fromFile(f, Charsets.UTF_8);
    assertEquals("charset branch true", sf.getCode());
  }

  @Test
  public void testFromFile_FileWithNullCharset_UsesDefault() throws IOException {
    // ทดสอบ branch: if (c != null) ... เป็น false -> ใช้ default UTF-8
    File f = createTempFile("charset branch false");
    SourceFile sf = SourceFile.fromFile(f, null);
    assertEquals("charset branch false", sf.getCode());
  }

  @Test
  public void testOnDisk_ClearCachedSource_ReloadsFromDisk() throws IOException {
    File f = createTempFile("disk content clear");
    SourceFile sf = SourceFile.fromFile(f);
    sf.getCode();
    assertTrue(sf.hasSourceInMemory());
    sf.clearCachedSource();
    assertFalse(sf.hasSourceInMemory());
    assertEquals("disk content clear", sf.getCode());
    assertTrue(sf.hasSourceInMemory());
  }

  @Test
  public void testOnDisk_GetCodeReader_BeforeCaching_UsesFileReader() throws IOException {
    File f = createTempFile("reader content disk");
    SourceFile sf = SourceFile.fromFile(f);
    assertFalse(sf.hasSourceInMemory());
    Reader r1 = sf.getCodeReader(); // hasSourceInMemory()==false -> FileReader path
    assertEquals("reader content disk", CharStreams.toString(r1));
    assertFalse(sf.hasSourceInMemory()); // ยังไม่ cache แม้อ่านผ่าน reader แล้ว
  }

  @Test
  public void testOnDisk_GetCodeReader_AfterCaching_UsesSuperReader() throws IOException {
    File f = createTempFile("reader content disk2");
    SourceFile sf = SourceFile.fromFile(f);
    sf.getCode(); // บังคับให้ cache
    assertTrue(sf.hasSourceInMemory());
    Reader r2 = sf.getCodeReader(); // hasSourceInMemory()==true -> super.getCodeReader()
    assertEquals("reader content disk2", CharStreams.toString(r2));
  }

  //////////////////////////////////////////////////////////////////////
  // fromGenerator (Generated)
  //////////////////////////////////////////////////////////////////////

  @Test
  public void testFromGenerator_LazyGenerationAndCache() throws IOException {
    final int[] callCount = {0};
    SourceFile.Generator generator = new SourceFile.Generator() {
      @Override
      public String getCode() {
        callCount[0]++;
        return "generated code";
      }
    };
    SourceFile sf = SourceFile.fromGenerator("gen.js", generator);

    assertFalse(sf.hasSourceInMemory());
    assertNull(sf.getCodeNoCache());

    assertEquals("generated code", sf.getCode());
    assertEquals(1, callCount[0]);
    assertTrue(sf.hasSourceInMemory());
    assertEquals("generated code", sf.getCodeNoCache());

    // เรียกซ้ำ -> ต้องใช้ cache ไม่เรียก generator อีก
    assertEquals("generated code", sf.getCode());
    assertEquals(1, callCount[0]);
  }

  @Test
  public void testGenerated_ClearCachedSource_RegeneratesOnNextCall() throws IOException {
    final int[] callCount = {0};
    SourceFile.Generator generator = new SourceFile.Generator() {
      @Override
      public String getCode() {
        callCount[0]++;
        return "gen-" + callCount[0];
      }
    };
    SourceFile sf = SourceFile.fromGenerator("gen2.js", generator);

    assertEquals("gen-1", sf.getCode());
    sf.clearCachedSource();
    assertFalse(sf.hasSourceInMemory());
    assertEquals("gen-2", sf.getCode());
    assertEquals(2, callCount[0]);
  }

  //////////////////////////////////////////////////////////////////////
  // fromInputStream / fromReader
  //////////////////////////////////////////////////////////////////////

  @Test
  public void testFromInputStream_TwoArg() throws IOException {
    InputStream in = new ByteArrayInputStream(
        "stream content".getBytes(Charsets.UTF_8));
    SourceFile sf = SourceFile.fromInputStream("stream.js", in);
    assertEquals("stream content", sf.getCode());
    assertEquals("stream.js", sf.getOriginalPath());
  }

  @Test
  public void testFromInputStream_ThreeArg() throws IOException {
    InputStream in = new ByteArrayInputStream(
        "stream content2".getBytes(Charsets.UTF_8));
    SourceFile sf = SourceFile.fromInputStream(
        "stream2.js", "orig/path.js", in);
    assertEquals("stream content2", sf.getCode());
    assertEquals("orig/path.js", sf.getOriginalPath());
  }

  @Test
  public void testFromReader() throws IOException {
    Reader r = new StringReader("reader content");
    SourceFile sf = SourceFile.fromReader("reader.js", r);
    assertEquals("reader content", sf.getCode());
  }

  //////////////////////////////////////////////////////////////////////
  // getLineOffset / getNumLines / findLineOffsets
  //////////////////////////////////////////////////////////////////////

  @Test
  public void testGetLineOffset_NormalAndBoundaries() {
    SourceFile sf = SourceFile.fromCode("a.js", "a\nb\nc");
    assertEquals(3, sf.getNumLines());
    assertEquals(0, sf.getLineOffset(1));
    assertEquals(2, sf.getLineOffset(2));
    assertEquals(4, sf.getLineOffset(3));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetLineOffset_LowerBoundThrows() {
    SourceFile sf = SourceFile.fromCode("a.js", "a\nb\nc");
    sf.getLineOffset(0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetLineOffset_UpperBoundThrows() {
    SourceFile sf = SourceFile.fromCode("a.js", "a\nb\nc");
    sf.getLineOffset(4);
  }

  @Test
  public void testGetLineOffset_EmptyCode() {
    SourceFile sf = SourceFile.fromCode("empty.js", "");
    assertEquals(1, sf.getNumLines());
    assertEquals(0, sf.getLineOffset(1));
  }

  @Test
  public void testFindLineOffsets_IOExceptionCaught() {
    SourceFile sf = new ThrowingSourceFile("bad.js");
    // catch(IOException) branch -> lineOffsets = new int[]{0}
    assertEquals(1, sf.getNumLines());
    assertEquals(0, sf.getLineOffset(1));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFindLineOffsets_IOException_ThenOutOfBoundsThrows() {
    SourceFile sf = new ThrowingSourceFile("bad.js");
    sf.getLineOffset(2); // เกิน lineOffsets.length(1)
  }

  //////////////////////////////////////////////////////////////////////
  // getLine
  //////////////////////////////////////////////////////////////////////

  @Test
  public void testGetLine_ForwardSequentialCaching() {
    // code ไม่มี '\n' ปิดท้าย
    SourceFile sf = SourceFile.fromCode("a.js", "a\nb\nc");
    assertEquals("a", sf.getLine(1));
    assertEquals("b", sf.getLine(2));
    // บรรทัดสุดท้ายไม่มี '\n' ปิดท้าย -> ตาม logic ปัจจุบันคืน null
    // (พฤติกรรมนี้ derive จาก source โดยตรง ไม่ใช่การเดา)
    assertNull(sf.getLine(3));
    assertNull(sf.getLine(4)); // เกินขอบไฟล์ -> nextpos == -1 ใน loop
  }

  @Test
  public void testGetLine_BackwardCallResetsToDefaultStart() {
    SourceFile sf = SourceFile.fromCode("a.js", "a\nb\nc");
    assertNull(sf.getLine(3)); // ทำให้ lastLine = 3
    // lineNumber(1) < lastLine(3) -> ใช้ pos=0,startLine=1 (ไม่ใช้ cache)
    assertEquals("a", sf.getLine(1));
  }

  @Test
  public void testGetLine_EmptyCodeReturnsNull() {
    SourceFile sf = SourceFile.fromCode("empty.js", "");
    assertNull(sf.getLine(1));
  }

  @Test
  public void testGetLine_IOExceptionReturnsNull() {
    SourceFile sf = new ThrowingSourceFile("bad.js");
    assertNull(sf.getLine(1));
  }

  @Test(expected = NullPointerException.class)
  public void testGetLine_NullCodeCausesNPE_DocumentedFault() {
    // FAULT: getCode() คืน null โดยไม่ throw IOException เมื่อยังไม่ set code
    // ทำให้ js == null และ js.indexOf(...) ทำให้เกิด NPE ที่ไม่ถูก catch
    SourceFile sf = new SourceFile("noCode.js");
    sf.getLine(1);
  }

  //////////////////////////////////////////////////////////////////////
  // getRegion
  //////////////////////////////////////////////////////////////////////

  @Test
  public void testGetRegion_IOExceptionReturnsNull() {
    SourceFile sf = new ThrowingSourceFile("bad.js");
    assertNull(sf.getRegion(1));
  }

  @Test
  public void testGetRegion_FullFiveLineWindow_NoBreak() {
    // 10 บรรทัด ไม่มี '\n' ปิดท้าย -> loop วิ่งครบ 5 รอบไม่ break
    String code = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj";
    SourceFile sf = SourceFile.fromCode("a.js", code);
    assertNotNull(sf.getRegion(1));
  }

  @Test
  public void testGetRegion_NullWhenLineNumberAtEndLine() {
    // ไฟล์สั้น (3 บรรทัด, ไม่มี '\n' ปิดท้าย)
    SourceFile sf = SourceFile.fromCode("a.js", "a\nb\nc");
    assertNotNull(sf.getRegion(1));
    assertNotNull(sf.getRegion(2));
    // lineNumber >= endLine -> null
    assertNull(sf.getRegion(3));
  }

  @Test
  public void testGetRegion_NullWhenStartLineBeyondFile() {
    // startLine loop break เร็วเพราะไฟล์สั้นกว่า startLine ที่ต้องการ
    SourceFile sf = SourceFile.fromCode("a.js", "a\nb\nc");
    assertNull(sf.getRegion(10));
  }

  @Test
  public void testGetRegion_TrailingNewline_SubBranch() {
    // end == -1 และบรรทัดสุดท้ายลงท้ายด้วย '\n' -> substring(pos, last)
    SourceFile sf = SourceFile.fromCode("a.js", "a\nb\nc\n");
    assertNotNull(sf.getRegion(1));
  }

  @Test
  public void testGetRegion_NoTrailingNewline_SubBranch() {
    // end == -1 และบรรทัดสุดท้ายไม่ลงท้ายด้วย '\n' -> substring(pos)
    SourceFile sf = SourceFile.fromCode("a.js", "a\nb\nc");
    assertNotNull(sf.getRegion(1));
  }

  @Test
  public void testGetRegion_LineNumberZero_ClampedToOne() {
    // Math.max(1, lineNumber - 2) กรณี lineNumber <= 2 -> startLine = 1
    String code = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj";
    SourceFile sf = SourceFile.fromCode("a.js", code);
    assertNotNull(sf.getRegion(0));
  }

  @Test(expected = NullPointerException.class)
  public void testGetRegion_NullCodeCausesNPE_DocumentedFault() {
    // เช่นเดียวกับ getLine(): js == null -> NPE ที่ไม่ถูก catch
    SourceFile sf = new SourceFile("noCode.js");
    sf.getRegion(1);
  }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_NullFileNameThrows` / `EmptyFileNameThrows` | constructor: `fileName==null \|\| isEmpty()` = true |
| `testConstructor_WhitespaceFileNameAllowed` | constructor: condition เป็น false |
| `testGetCode_ReturnsNullWhenNotSet` | `getCode()` คืน null เมื่อ code ไม่ถูก set |
| `testGetOriginalPath_*` | `getOriginalPath()`: `originalPath != null` true/false |
| `testIsExtern_*` | `isExtern()`/`setIsExtern()` true/false |
| `testFromCode_*`, `testPreloaded_ClearCachedSource_IsNoOp` | Preloaded, base `clearCachedSource()` no-op |
| `testFromFile_*` | OnDisk constructors, charset null/non-null branch |
| `testOnDisk_ClearCachedSource_ReloadsFromDisk` | OnDisk `getCode()`: `cachedCode==null` true/false |
| `testOnDisk_GetCodeReader_Before/AfterCaching` | `getCodeReader()`: `hasSourceInMemory()` true/false |
| `testFromGenerator_*`, `testGenerated_ClearCachedSource_*` | Generated `getCode()`: cache hit/miss, `clearCachedSource()` |
| `testFromInputStream_*`, `testFromReader` | static factory delegation |
| `testGetLineOffset_*` | `getLineOffset()`: boundary `lineno<1`, `lineno>length`, ปกติ |
| `testFindLineOffsets_IOExceptionCaught*` | `findLineOffsets()`: catch(IOException) branch |
| `testGetLine_ForwardSequentialCaching` | `getLine()`: loop iterate, `nextpos==-1`, last-line-no-newline branch |
| `testGetLine_BackwardCallResetsToDefaultStart` | `if(lineNumber>=lastLine)` false branch |
| `testGetLine_EmptyCodeReturnsNull` / `IOExceptionReturnsNull` | `indexOf==-1` ตั้งแต่ต้น, catch(IOException) |
| `testGetLine_NullCodeCausesNPE_DocumentedFault` | **Fault**: unguarded null `js` |
| `testGetRegion_IOExceptionReturnsNull` | catch(IOException) branch |
| `testGetRegion_FullFiveLineWindow_NoBreak` | loop ครบ 5 รอบไม่ break, `end!=-1` branch |
| `testGetRegion_NullWhenLineNumberAtEndLine` | `lineNumber>=endLine` true/false |
| `testGetRegion_NullWhenStartLineBeyondFile` | first loop break (`nextpos==-1`), second loop break ทันที |
| `testGetRegion_TrailingNewline_SubBranch` / `NoTrailingNewline_SubBranch` | `end==-1` แล้ว `charAt(last)=='\n'` true/false |
| `testGetRegion_LineNumberZero_ClampedToOne` | `Math.max(1, ...)` clamp branch |
| `testGetRegion_NullCodeCausesNPE_DocumentedFault` | **Fault**: unguarded null `js` |
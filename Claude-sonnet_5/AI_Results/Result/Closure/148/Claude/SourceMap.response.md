# วิเคราะห์และแผนการทดสอบ

จากการอ่านซอร์สโค้ด `SourceMap` พบว่า method ที่เข้าถึงได้ (package-private/public) และมี branch ที่ต้องทดสอบคือ:

- `addMapping()` — เงื่อนไข `sourceFile==null || lineno<0`, cache ของ `lastSourceFile`, `originalName!=null`, เงื่อนไข `startPosition.line>0` / `endPosition.line>0`
- `setWrapperPrefix()` — loop และเงื่อนไข `\n` vs ตัวอักษรอื่น
- `setStartingPosition()`, `reset()`
- `appendTo()` / `LineMapper` (private class ที่ทดสอบทางอ้อมผ่าน `appendTo`) — `isOverlapped()` (สอง clause ของ OR), การ push/pop stack, `Preconditions.checkState`

**หมายเหตุสำคัญ (ตามข้อ 4):**
- คลาสทดสอบต้องอยู่ package เดียวกัน (`com.google.javascript.jscomp`) เพราะ `addMapping/setWrapperPrefix/setStartingPosition/reset` เป็น package-private
- `Position` ใช้ตาม constructor/getter ที่เห็นในซอร์ส `SourceMap` เอง (ปลอดภัย เพราะ compile ร่วมกันอยู่แล้ว)
- ไม่เดารูปแบบผลลัพธ์ของ `CodeGenerator.escapeToDoubleQuotedJsString` — เรียกใช้ method จริงในเทสเพื่อคำนวณค่าที่คาดหวัง แทนการฮาร์ดโค้ดสมมติฐาน
- สำหรับ `Node` สมมติว่ามี `Node.newString(String)`, `putProp/getProp`, `setLineno/getLineno`, `setCharno/getCharno`, `Node.SOURCEFILE_PROP`, `Node.ORIGINALNAME_PROP` (ตามที่ปรากฏใช้ตรงในซอร์ส `SourceMap` — คอมเมนต์กำกับไว้ในโค้ด)
- ผลลัพธ์ของ `LineMapper` (multi-line, overlap) คำนวณด้วยมือตาม logic ในซอร์สทีละบรรทัด (ระบุ comment ไว้เพื่อความโปร่งใส)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Unit tests for {@link SourceMap}.
 *
 * NOTE: This test class MUST live in the same package as SourceMap
 * (com.google.javascript.jscomp) because addMapping(), setWrapperPrefix(),
 * setStartingPosition() and reset() are package-private.
 *
 * ASSUMPTIONS (documented per requirement #4 - not verifiable from the
 * given SourceMap source alone, but required for the code to compile):
 *  - Node.newString(String) is a valid static factory that returns a Node.
 *  - Node has public setLineno(int)/getLineno(), setCharno(int)/getCharno().
 *  - Node.SOURCEFILE_PROP / Node.ORIGINALNAME_PROP are accessible int
 *    constants (they are referenced directly, unqualified, in SourceMap).
 *  - Position(int line, int col) with getLineNumber()/getCharacterIndex()
 *    behaves exactly as used inside SourceMap's own source.
 */
public class SourceMapTest {

  private SourceMap sourceMap;

  @Before
  public void setUp() {
    sourceMap = new SourceMap();
  }

  /** Helper to build a Node with the properties addMapping() cares about. */
  private Node createNode(String sourceFile, int lineno, int charno) {
    Node node = Node.newString("value"); // token type irrelevant to SourceMap
    if (sourceFile != null) {
      node.putProp(Node.SOURCEFILE_PROP, sourceFile);
    }
    node.setLineno(lineno);
    node.setCharno(charno);
    return node;
  }

  // =========================================================================
  // addMapping(): early-return branch  (sourceFile == null || lineno < 0)
  // =========================================================================

  @Test(expected = IllegalStateException.class)
  public void testAddMapping_nullSourceFile_notAdded() throws IOException {
    Node node = createNode(null, 1, 0);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));
    // No mapping should have been added -> appendTo's internal
    // Preconditions.checkState(!mappings.isEmpty()) must fail.
    sourceMap.appendTo(new StringBuilder(), "out.js");
  }

  @Test(expected = IllegalStateException.class)
  public void testAddMapping_negativeLineno_notAdded() throws IOException {
    Node node = createNode("a.js", -1, 0); // sourceFile != null, lineno < 0
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));
    sourceMap.appendTo(new StringBuilder(), "out.js");
  }

  @Test
  public void testAddMapping_linenoZero_isBoundaryValid() throws IOException {
    // lineno == 0 is NOT < 0 -> boundary case, mapping must be added.
    Node node = createNode("a.js", 0, 0);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name"); // must not throw
    assertTrue(sb.toString().contains(",0,0]"));
  }

  @Test(expected = IllegalStateException.class)
  public void testAppendTo_noMappingsAtAll_throws() throws IOException {
    sourceMap.appendTo(new StringBuilder(), "out.js");
  }

  // =========================================================================
  // addMapping(): valid mapping, full deterministic output check
  // =========================================================================

  @Test
  public void testAddMapping_validSingleMapping_exactOutput() throws IOException {
    Node node = createNode("a.js", 1, 0);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name");

    // Compute expected escaped values via the *real* escaping function,
    // instead of guessing its exact output format.
    String escapedName = CodeGenerator.escapeToDoubleQuotedJsString("name");
    String escapedFile = CodeGenerator.escapeToDoubleQuotedJsString("a.js");

    String expected =
        "/** Begin line maps. **/{ \"file\" : " + escapedName
            + ", \"count\": 1 }\n"
            + "[0,0,0,0,0]\n"
            + "/** Begin file information. **/\n"
            + "[]\n"
            + "/** Begin mapping definitions. **/\n"
            + "[" + escapedFile + ",1,0]\n";

    assertEquals(expected, sb.toString());
  }

  @Test
  public void testAddMapping_withOriginalName_includedInOutput() throws IOException {
    Node node = createNode("a.js", 1, 0);
    node.putProp(Node.ORIGINALNAME_PROP, "myVar");
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name");

    String escapedOriginalName = CodeGenerator.escapeToDoubleQuotedJsString("myVar");
    assertTrue(sb.toString().contains("," + escapedOriginalName + "]"));
  }

  /**
   * Covers both branches of `if (lastSourceFile != sourceFile)`:
   *  - true branch on the first mapping (lastSourceFile starts null)
   *  - false branch on the second mapping, since both use the identical
   *    interned String literal "a.js" (=> lastSourceFile == sourceFile).
   */
  @Test
  public void testAddMapping_sourceFileCacheBranch_bothBranchesHit() throws IOException {
    Node nodeA = createNode("a.js", 1, 0);
    sourceMap.addMapping(nodeA, new Position(0, 0), new Position(0, 5));

    Node nodeB = createNode("a.js", 2, 0);
    sourceMap.addMapping(nodeB, new Position(0, 10), new Position(0, 15));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name");

    String escapedFile = CodeGenerator.escapeToDoubleQuotedJsString("a.js");
    assertTrue(sb.toString().contains(escapedFile));
  }

  // =========================================================================
  // addMapping(): startPosition.line>0 / endPosition.line>0 branches
  // =========================================================================

  @Test
  public void testAddMapping_startEndLineZero_usesOffsetCharIndex() throws IOException {
    sourceMap.setStartingPosition(3, 7);
    Node node = createNode("a.js", 1, 0);
    // start/end line == 0 -> "false" branch of both `if (...line > 0)`
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name");

    // Manually traced: mapping.start=(3,7) mapping.end=(3,12) -> maxLine=3 -> count=4
    assertTrue(sb.toString().contains("\"count\": 4"));
    assertTrue(sb.toString().contains(
        "[]\n[]\n[]\n[-1,-1,-1,-1,-1,-1,-1,0,0,0,0,0]\n"));
  }

  @Test
  public void testAddMapping_startEndLineGreaterThanZero_offsetNotApplied() throws IOException {
    sourceMap.setStartingPosition(3, 7);
    Node node = createNode("a.js", 1, 0);
    // start/end line > 0 -> "true" branch: offset char index becomes 0
    sourceMap.addMapping(node, new Position(1, 2), new Position(1, 9));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name");

    // mapping.start=(4,2) mapping.end=(4,9) -> maxLine=4 -> count=5
    assertTrue(sb.toString().contains("\"count\": 5"));
  }

  // =========================================================================
  // setWrapperPrefix()
  // =========================================================================

  @Test
  public void testSetWrapperPrefix_emptyString_zeroIterations() throws IOException {
    sourceMap.setWrapperPrefix(""); // boundary: loop body never runs
    Node node = createNode("a.js", 1, 0);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name");
    assertTrue(sb.toString().contains("\"count\": 1"));
  }

  @Test
  public void testSetWrapperPrefix_noNewline_elseBranch() throws IOException {
    sourceMap.setWrapperPrefix("abc"); // else-branch: prefixIndex++ each char
    Node node = createNode("a.js", 1, 0);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name");
    // prefixLine stays 0 -> count unaffected (still 1)
    assertTrue(sb.toString().contains("\"count\": 1"));
    // Column offset from prefixIndex(3) applied on first (rawLine==0) line.
    assertTrue(sb.toString().contains("[-1,-1,-1,0,0,0,0,0]\n"));
  }

  @Test
  public void testSetWrapperPrefix_withNewlines_ifBranch() throws IOException {
    sourceMap.setWrapperPrefix("\n\n"); // if-branch hit twice: prefixLine=2
    Node node = createNode("a.js", 1, 0);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name");
    // maxLine = endLine(0) + prefixLine(2) = 2 -> count = 3
    assertTrue(sb.toString().contains("\"count\": 3"));
  }

  @Test(expected = NullPointerException.class)
  public void testSetWrapperPrefix_null_throwsNPE() {
    // No null-guard in source; prefix.length() on null triggers NPE.
    // Documents current (unchecked) behavior, does not guess new behavior.
    sourceMap.setWrapperPrefix(null);
  }

  // =========================================================================
  // reset()
  // =========================================================================

  @Test(expected = IllegalStateException.class)
  public void testReset_clearsMappings() throws IOException {
    Node node = createNode("a.js", 1, 0);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));
    sourceMap.reset();
    sourceMap.appendTo(new StringBuilder(), "name"); // mappings empty again
  }

  @Test
  public void testReset_clearsOffsetAndPrefixPositions() throws IOException {
    sourceMap.setStartingPosition(5, 5);
    sourceMap.setWrapperPrefix("\n\n");
    sourceMap.reset();

    Node node = createNode("a.js", 1, 0);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name");
    // Behaves like a pristine SourceMap -> count back to 1.
    assertTrue(sb.toString().contains("\"count\": 1"));
  }

  // =========================================================================
  // LineMapper / isOverlapped(): sibling (non-overlap) vs nested (overlap)
  // =========================================================================

  @Test
  public void testAppendTo_twoSiblingMappings_nonOverlapPopsStack() throws IOException {
    Node nodeA = createNode("a.js", 1, 0);
    sourceMap.addMapping(nodeA, new Position(0, 0), new Position(0, 5));

    Node nodeB = createNode("a.js", 2, 0);
    sourceMap.addMapping(nodeB, new Position(0, 10), new Position(0, 15));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "name");

    // Manually traced through the algorithm (gap between A and B filled
    // with UNMAPPED(-1) entries after A is popped off the stack).
    assertTrue(sb.toString().contains(
        "[0,0,0,0,0,-1,-1,-1,-1,-1,1,1,1,1,1]\n"));
  }

  @Test
  public void testAppendTo_nestedMappings_overlapBranch_noEarlyPop() throws IOException {
    Node outer = createNode("a.js", 1, 0);
    sourceMap.addMapping(outer, new Position(0, 0), new Position(0, 20));

    Node inner = createNode("a.js", 1, 5);
    sourceMap.addMapping(inner, new Position(0, 5), new Position(0, 10));

    StringBuilder sb = new StringBuilder();
    // Exercises isOverlapped() == true (l1==l2 && c1>=c2) -> parent (outer)
    // is NOT popped early; must complete without exception.
    sourceMap.appendTo(sb, "name");

    String output = sb.toString();
    assertTrue(output.contains(",1,0]")); // outer originalPosition
    assertTrue(output.contains(",1,5]")); // inner originalPosition
    assertTrue(output.contains(
        "[0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0]\n"));
  }

  @Test
  public void testAppendTo_multiLineOverlap_lineGreaterThanBranch() throws IOException {
    Node outer = createNode("a.js", 1, 0);
    // outer spans line 0 to line 2
    sourceMap.addMapping(outer, new Position(0, 0), new Position(2, 5));

    Node inner = createNode("a.js", 5, 2);
    // inner starts on line 1, strictly between outer's start/end lines
    sourceMap.addMapping(inner, new Position(1, 0), new Position(1, 3));

    StringBuilder sb = new StringBuilder();
    // Exercises isOverlapped()'s second OR-clause: l1 > l2
    // (outer.end.line(2) > inner.start.line(1)) -> must not throw.
    sourceMap.appendTo(sb, "name");

    String output = sb.toString();
    assertTrue(output.contains(",1,0]"));
    assertTrue(output.contains(",5,2]"));
    // Manually traced line map (documents the actual, possibly surprising,
    // column-carry-over behavior across line boundaries in this algorithm).
    assertTrue(output.contains("[]\n[1,1,1]\n[0,0]\n"));
  }

  // =========================================================================
  // Null-input / missing-guard behavior (documents current, unguessed state)
  // =========================================================================

  @Test(expected = NullPointerException.class)
  public void testAddMapping_nullNode_throwsNPE() throws IOException {
    sourceMap.addMapping(null, new Position(0, 0), new Position(0, 5));
  }

  @Test(expected = NullPointerException.class)
  public void testAddMapping_nullStartPosition_throwsNPE() throws IOException {
    Node node = createNode("a.js", 1, 0);
    sourceMap.addMapping(node, null, new Position(0, 5));
  }

  @Test(expected = NullPointerException.class)
  public void testAddMapping_nullEndPosition_throwsNPE() throws IOException {
    Node node = createNode("a.js", 1, 0);
    sourceMap.addMapping(node, new Position(0, 0), null);
  }

  @Test(expected = NullPointerException.class)
  public void testAppendTo_nullAppendable_throwsNPE() throws IOException {
    sourceMap.appendTo(null, "name");
  }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testAddMapping_nullSourceFile_notAdded | `addMapping`: `sourceFile == null` → true (early return) |
| testAddMapping_negativeLineno_notAdded | `addMapping`: `sourceFile==null`→false, `lineno<0`→true |
| testAddMapping_linenoZero_isBoundaryValid | boundary `lineno==0` → เงื่อนไข false, mapping ถูกเพิ่มจริง |
| testAppendTo_noMappingsAtAll_throws | `Preconditions.checkState(!mappings.isEmpty())` → false (throw) |
| testAddMapping_validSingleMapping_exactOutput | happy path เต็มรูปแบบ, `originalName==null` (false branch) |
| testAddMapping_withOriginalName_includedInOutput | `originalName != null` → true branch ใน `addMapping`/`Mapping.appendTo` |
| testAddMapping_sourceFileCacheBranch_bothBranchesHit | `lastSourceFile != sourceFile` → true (ครั้งแรก) และ false (ครั้งที่สอง) |
| testAddMapping_startEndLineZero_usesOffsetCharIndex | `startPosition.line>0` และ `endPosition.line>0` → false/false |
| testAddMapping_startEndLineGreaterThanZero_offsetNotApplied | `startPosition.line>0` และ `endPosition.line>0` → true/true |
| testSetWrapperPrefix_emptyString_zeroIterations | `setWrapperPrefix` loop: 0 iterations (boundary ว่าง) |
| testSetWrapperPrefix_noNewline_elseBranch | loop else-branch (`prefixIndex++`) + `getAdjustedCol` rawLine==0 |
| testSetWrapperPrefix_withNewlines_ifBranch | loop if-branch (`prefixLine++`, reset index) |
| testSetWrapperPrefix_null_throwsNPE | ค่า null → NPE (ไม่มี guard, สังเกตพฤติกรรมปัจจุบัน) |
| testReset_clearsMappings | `reset()` ล้าง `mappings` → appendTo throw ใหม่ |
| testReset_clearsOffsetAndPrefixPositions | `reset()` ล้าง `offsetPosition`/`prefixPosition` |
| testAppendTo_twoSiblingMappings_nonOverlapPopsStack | `isOverlapped()`→false, while-loop pop, `writeCharsBetween` กับ parent=null |
| testAppendTo_nestedMappings_overlapBranch_noEarlyPop | `isOverlapped()`→true (clause `l1==l2 && c1>=c2`), ไม่ pop parent |
| testAppendTo_multiLineOverlap_lineGreaterThanBranch | `isOverlapped()`→true (clause `l1>l2`), multi-line transition ใน `writeCharsUpTo` |
| testAddMapping_nullNode_throwsNPE | ไม่มี null-check ของ `node` |
| testAddMapping_nullStartPosition_throwsNPE | ไม่มี null-check ของ `startPosition` |
| testAddMapping_nullEndPosition_throwsNPE | ไม่มี null-check ของ `endPosition` |
| testAppendTo_nullAppendable_throwsNPE | ไม่มี null-check ของ `out` |

**ข้อจำกัดที่ต้องเปิดเผย:** ผลลัพธ์ที่คาดหวังของ `LineMapper` (การจัดคอลัมน์/บรรทัดใน `[...]` ) คำนวณด้วยมือจากการไล่ตาม logic ในซอร์สทีละ statement ไม่ได้รันจริงเพื่อยืนยัน จึงมีความเสี่ยงเล็กน้อยที่จะผิดพลาดหากตีความ loop ผิดจุดใดจุดหนึ่ง — ได้ตรวจทานซ้ำ 2 รอบสำหรับกรณีซับซ้อน (multi-line overlap) แล้ว
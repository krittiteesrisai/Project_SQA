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

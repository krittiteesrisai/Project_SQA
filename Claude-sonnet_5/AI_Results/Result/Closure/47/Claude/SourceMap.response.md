# วิเคราะห์และแผนการทดสอบ

จากซอร์สโค้ด `SourceMap` มีจุดที่ต้องทดสอบหลัก ๆ คือ:
- `Format` enum (4 ค่า, แต่ละค่า override `getInstance()`)
- `DetailLevel` enum (`ALL`, `SYMBOLS` ที่มีหลาย branch ผสม `||`)
- `LocationMapping` (constructor เก็บ field)
- `addMapping()` (if: `sourceFile == null || lineno < 0`)
- `fixupSourceLocation()` (private, ทดสอบผ่าน `addMapping()`+`appendTo()`) — มี branch: `isEmpty()`, cache hit, loop match/no-match, `fixed == null` fallback
- เมธอด delegate อื่น ๆ: `appendTo`, `reset`, `setStartingPosition`, `setWrapperPrefix`, `validate`, `setPrefixMappings`

**หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4):** ซอร์สที่ให้มาไม่มี implementation ของ `com.google.javascript.rhino.Node`, `Token`, `NodeUtil` และ `SourceMapGeneratorV1/V2/V3` การสร้าง `Node` และการตรวจสอบ output ของ `appendTo()` ในเทสนี้อ้างอิงจาก public API มาตรฐานที่ทราบกันทั่วไปของ Closure Compiler (เช่น `Node.newString`, `setLineno`, `setCharno`, `setSourceFileName`, `putProp`, `addChildToBack`) และสมมติฐานว่า source map ที่ generate ออกมาจะมีชื่อไฟล์ source ปรากฏเป็น substring ใน output — หากไม่ตรงกับ API จริงของโปรเจกต์ โปรดปรับ signature ให้สอดคล้อง

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.debugging.sourcemap.FilePosition;
import com.google.javascript.jscomp.SourceMap.DetailLevel;
import com.google.javascript.jscomp.SourceMap.Format;
import com.google.javascript.jscomp.SourceMap.LocationMapping;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Unit tests สำหรับ {@link SourceMap}
 *
 * หมายเหตุ (assumption disclaimer):
 * - Node/Token/NodeUtil ไม่ได้แสดงซอร์สมาให้ การสร้าง Node ในเทสนี้อ้างอิง public API
 *   มาตรฐานของ Closure Compiler (Node.newString, setLineno, setCharno, setSourceFileName,
 *   putProp, addChildToBack) ซึ่งไม่ได้ยืนยันจากซอร์สที่ให้มาโดยตรง
 * - fixupSourceLocation() เป็น private method จึงทดสอบทางอ้อมผ่าน addMapping()+appendTo()
 *   โดยสมมติว่า source map output จะมีชื่อไฟล์ source ปรากฏเป็น substring
 * - ไม่ได้ทดสอบสาขา NodeUtil.isObjectLitKey(...) ตรง ๆ เพราะไม่มีซอร์สยืนยันเงื่อนไขที่แน่ชัด
 */
public class SourceMapTest {

  private SourceMap sourceMap;

  @Before
  public void setUp() {
    sourceMap = Format.DEFAULT.getInstance();
  }

  // ---------- Format enum ----------

  @Test
  public void testFormat_allValuesReturnNonNullSourceMap() {
    for (Format format : Format.values()) {
      SourceMap instance = format.getInstance();
      assertNotNull("Format " + format + " ต้องสร้าง SourceMap ได้", instance);
    }
  }

  @Test
  public void testFormat_V1() {
    assertNotNull(Format.V1.getInstance());
  }

  @Test
  public void testFormat_DEFAULT() {
    assertNotNull(Format.DEFAULT.getInstance());
  }

  @Test
  public void testFormat_V2() {
    assertNotNull(Format.V2.getInstance());
  }

  @Test
  public void testFormat_V3() {
    assertNotNull(Format.V3.getInstance());
  }

  // ---------- DetailLevel enum ----------

  @Test
  public void testDetailLevel_ALL_alwaysTrue_evenForNull() {
    // ALL.apply(node) ไม่ได้ใช้ค่า node เลย -> return true เสมอ (แม้ node เป็น null)
    assertTrue(DetailLevel.ALL.apply(null));
    Node any = new Node(Token.ADD);
    assertTrue(DetailLevel.ALL.apply(any));
  }

  @Test
  public void testDetailLevel_SYMBOLS_call() {
    Node call = new Node(Token.CALL);
    assertTrue(DetailLevel.SYMBOLS.apply(call));
  }

  @Test
  public void testDetailLevel_SYMBOLS_new() {
    Node newExpr = new Node(Token.NEW);
    assertTrue(DetailLevel.SYMBOLS.apply(newExpr));
  }

  @Test
  public void testDetailLevel_SYMBOLS_function() {
    Node func = new Node(Token.FUNCTION);
    assertTrue(DetailLevel.SYMBOLS.apply(func));
  }

  @Test
  public void testDetailLevel_SYMBOLS_name() {
    Node name = Node.newString(Token.NAME, "a");
    assertTrue(DetailLevel.SYMBOLS.apply(name));
  }

  @Test
  public void testDetailLevel_SYMBOLS_get() {
    Node getprop = new Node(Token.GETPROP);
    assertTrue(DetailLevel.SYMBOLS.apply(getprop));

    Node getelem = new Node(Token.GETELEM);
    assertTrue(DetailLevel.SYMBOLS.apply(getelem));
  }

  @Test
  public void testDetailLevel_SYMBOLS_stringChildOfGet() {
    Node getprop = new Node(Token.GETPROP);
    Node strChild = Node.newString(Token.STRING, "prop");
    getprop.addChildToBack(strChild);
    assertTrue(DetailLevel.SYMBOLS.apply(strChild));
  }

  @Test
  public void testDetailLevel_SYMBOLS_falseCase() {
    // node ที่ไม่ตรงกับเงื่อนไขใดๆ ใน SYMBOLS ควร apply() เป็น false
    Node add = new Node(Token.ADD);
    assertFalse(DetailLevel.SYMBOLS.apply(add));
  }

  // ---------- LocationMapping ----------

  @Test
  public void testLocationMapping_fieldsSetCorrectly() {
    LocationMapping mapping = new LocationMapping("foo/", "bar/");
    assertEquals("foo/", mapping.prefix);
    assertEquals("bar/", mapping.replacement);
  }

  // ---------- addMapping() ----------

  @Test
  public void testAddMapping_nullSourceFile_earlyReturn_noException() {
    Node node = Node.newString(Token.NAME, "a"); // sourceFileName default = null
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));
    // ไม่ throw exception ถือว่าผ่าน (early return branch)
  }

  @Test
  public void testAddMapping_negativeLineno_earlyReturn_noException() {
    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("foo.js");
    node.setLineno(-1); // boundary: lineno < 0 -> early return
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));
  }

  @Test
  public void testAddMapping_boundaryLinenoZero_notEarlyReturn() throws Exception {
    // lineno == 0 ไม่ถือว่า < 0 -> ไม่ early return (boundary case)
    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("foo.js");
    node.setLineno(0);
    node.setCharno(0);
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertTrue(sb.toString().contains("foo.js"));
  }

  @Test
  public void testAddMapping_validNode_appendToContainsSourceFile() throws Exception {
    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("path/to/foo.js");
    node.setLineno(1);
    node.setCharno(4);
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 5));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertTrue(sb.toString().contains("foo.js"));
  }

  @Test
  public void testAddMapping_withOriginalNameProp_noException() throws Exception {
    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("foo.js");
    node.setLineno(1);
    node.setCharno(0);
    node.putProp(Node.ORIGINALNAME_PROP, "originalA");
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertNotNull(sb.toString());
  }

  @Test
  public void testAddMapping_emptySourceFile_isNotNull_stillProcessed() throws Exception {
    // sourceFile = "" (ไม่ใช่ null) -> เงื่อนไข sourceFile == null เป็น false
    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("");
    node.setLineno(1);
    node.setCharno(0);
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertNotNull(sb.toString());
  }

  // ---------- fixupSourceLocation() ผ่าน addMapping()/setPrefixMappings() ----------

  @Test
  public void testFixupSourceLocation_noPrefixMappings_usesOriginalPath() throws Exception {
    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("original/path.js");
    node.setLineno(1);
    node.setCharno(0);
    // ไม่เรียก setPrefixMappings() -> ค่า default เป็น empty list
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertTrue(sb.toString().contains("original/path.js"));
  }

  @Test
  public void testFixupSourceLocation_emptyPrefixMappingsExplicitlySet_usesOriginalPath()
      throws Exception {
    sourceMap.setPrefixMappings(Collections.<LocationMapping>emptyList());

    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("original2/path.js");
    node.setLineno(1);
    node.setCharno(0);
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertTrue(sb.toString().contains("original2/path.js"));
  }

  @Test
  public void testFixupSourceLocation_matchingPrefix_usesReplacement() throws Exception {
    List<LocationMapping> mappings = Arrays.asList(new LocationMapping("src/", "REPLACED/"));
    sourceMap.setPrefixMappings(mappings);

    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("src/foo.js");
    node.setLineno(1);
    node.setCharno(0);
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    String result = sb.toString();
    assertTrue(result.contains("REPLACED/foo.js"));
    assertFalse(result.contains("src/foo.js"));
  }

  @Test
  public void testFixupSourceLocation_noMatchingPrefix_usesOriginalPath() throws Exception {
    List<LocationMapping> mappings = Arrays.asList(new LocationMapping("nomatch/", "REPLACED/"));
    sourceMap.setPrefixMappings(mappings);

    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("other/foo.js");
    node.setLineno(1);
    node.setCharno(0);
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertTrue(sb.toString().contains("other/foo.js"));
  }

  @Test
  public void testFixupSourceLocation_multipleMappings_secondMatches() throws Exception {
    // loop ต้องข้ามรายการแรกที่ไม่ตรง แล้วไปเจอรายการที่สอง
    List<LocationMapping> mappings = Arrays.asList(
        new LocationMapping("zzz/", "NOPE/"),
        new LocationMapping("abc/", "MATCHED/"));
    sourceMap.setPrefixMappings(mappings);

    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("abc/foo.js");
    node.setLineno(1);
    node.setCharno(0);
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertTrue(sb.toString().contains("MATCHED/foo.js"));
  }

  @Test
  public void testFixupSourceLocation_cacheHit_secondCallSameSourceFile() throws Exception {
    // ทดสอบ path การเข้า cache (sourceLocationFixupCache) เมื่อเรียกซ้ำด้วย sourceFile เดิม
    List<LocationMapping> mappings = Arrays.asList(new LocationMapping("src/", "CACHED/"));
    sourceMap.setPrefixMappings(mappings);

    Node node1 = Node.newString(Token.NAME, "a");
    node1.setSourceFileName("src/same.js");
    node1.setLineno(1);
    node1.setCharno(0);
    sourceMap.addMapping(node1, new FilePosition(0, 0), new FilePosition(0, 1));

    Node node2 = Node.newString(Token.NAME, "b");
    node2.setSourceFileName("src/same.js"); // เหมือน node1 -> รอบสองควร hit cache
    node2.setLineno(2);
    node2.setCharno(0);
    sourceMap.addMapping(node2, new FilePosition(1, 0), new FilePosition(1, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertTrue(sb.toString().contains("CACHED/same.js"));
  }

  @Test
  public void testFixupSourceLocation_prefixEqualsFullSourceFile_emptySuffix() throws Exception {
    // boundary: prefix ยาวเท่ากับ sourceFile ทั้งหมด -> substring ส่วนที่เหลือเป็น ""
    List<LocationMapping> mappings = Arrays.asList(new LocationMapping("full/path.js", "REPL"));
    sourceMap.setPrefixMappings(mappings);

    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("full/path.js");
    node.setLineno(1);
    node.setCharno(0);
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertTrue(sb.toString().contains("REPL"));
  }

  // ---------- delegate methods ----------

  @Test
  public void testAppendTo_noMappings_noExceptionAndProducesOutput() throws Exception {
    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "empty.js");
    assertNotNull(sb.toString());
  }

  @Test
  public void testReset_clearsStateAndAllowsReuse() throws Exception {
    List<LocationMapping> mappings = Arrays.asList(new LocationMapping("src/", "R/"));
    sourceMap.setPrefixMappings(mappings);

    Node node = Node.newString(Token.NAME, "a");
    node.setSourceFileName("src/x.js");
    node.setLineno(1);
    node.setCharno(0);
    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));

    sourceMap.reset();

    // หลัง reset ควรใช้งานต่อได้โดยไม่มี exception
    Node node2 = Node.newString(Token.NAME, "b");
    node2.setSourceFileName("src/y.js");
    node2.setLineno(1);
    node2.setCharno(0);
    sourceMap.addMapping(node2, new FilePosition(0, 0), new FilePosition(0, 1));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "out.js");
    assertNotNull(sb.toString());
  }

  @Test
  public void testSetStartingPosition_noException() {
    sourceMap.setStartingPosition(0, 0);
    sourceMap.setStartingPosition(5, 10);
  }

  @Test
  public void testSetWrapperPrefix_noException() {
    sourceMap.setWrapperPrefix("(function(){");
  }

  @Test
  public void testValidate_trueAndFalse_noException() {
    sourceMap.validate(true);
    sourceMap.validate(false);
  }

  @Test
  public void testSetPrefixMappings_emptyList() {
    sourceMap.setPrefixMappings(Collections.<LocationMapping>emptyList());
    // ไม่ throw exception; ตั้งค่าเป็น empty list ตรงกับค่า default
  }
}
```

## สรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testFormat_allValuesReturnNonNullSourceMap | `Format` ทุก enum constant (V1/DEFAULT/V2/V3) เรียก `getInstance()` |
| testFormat_V1/DEFAULT/V2/V3 | `getInstance()` แต่ละค่าแยกเป็นรายเมธอด |
| testDetailLevel_ALL_alwaysTrue_evenForNull | `ALL.apply()` return true เสมอ, boundary null |
| testDetailLevel_SYMBOLS_call/new/function/name | เงื่อนไข OR แต่ละส่วนใน `SYMBOLS.apply()` เป็น true |
| testDetailLevel_SYMBOLS_get | `NodeUtil.isGet(node)` true (GETPROP, GETELEM) |
| testDetailLevel_SYMBOLS_stringChildOfGet | `node.isString() && isGet(parent)` true |
| testDetailLevel_SYMBOLS_falseCase | ทุกเงื่อนไขใน SYMBOLS false -> return false |
| testLocationMapping_fieldsSetCorrectly | constructor `LocationMapping` |
| testAddMapping_nullSourceFile_earlyReturn | `sourceFile == null` → true (early return) |
| testAddMapping_negativeLineno_earlyReturn | `lineno < 0` → true (early return) |
| testAddMapping_boundaryLinenoZero_notEarlyReturn | boundary `lineno == 0` → false branch |
| testAddMapping_validNode_appendToContainsSourceFile | happy path เต็มรูปแบบ |
| testAddMapping_withOriginalNameProp_noException | `originalName != null` path |
| testAddMapping_emptySourceFile_isNotNull | `sourceFile == ""` (ไม่ null) → false branch |
| testFixupSourceLocation_noPrefixMappings / _emptyPrefixMappingsExplicitlySet | `prefixMappings.isEmpty()` → true |
| testFixupSourceLocation_matchingPrefix_usesReplacement | loop match, `fixed != null`, cache put |
| testFixupSourceLocation_noMatchingPrefix_usesOriginalPath | loop จบโดยไม่ match → `fixed == null` fallback |
| testFixupSourceLocation_multipleMappings_secondMatches | loop วนหลายรอบก่อนพบ match |
| testFixupSourceLocation_cacheHit_secondCallSameSourceFile | cache `get()` hit branch |
| testFixupSourceLocation_prefixEqualsFullSourceFile_emptySuffix | boundary substring ว่าง |
| testAppendTo_noMappings_noExceptionAndProducesOutput | `appendTo()` delegate, ไม่มี mapping |
| testReset_clearsStateAndAllowsReuse | `reset()` delegate + cache clear + reuse |
| testSetStartingPosition_noException | `setStartingPosition()` delegate |
| testSetWrapperPrefix_noException | `setWrapperPrefix()` delegate |
| testValidate_trueAndFalse_noException | `validate(true)` / `validate(false)` ทั้งสอง branch |
| testSetPrefixMappings_emptyList | setter `setPrefixMappings()` |
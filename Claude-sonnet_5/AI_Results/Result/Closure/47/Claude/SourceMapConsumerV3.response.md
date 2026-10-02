# วิเคราะห์และออกแบบ Test Cases

ก่อนเขียนโค้ด ผมได้วิเคราะห์ branch/condition หลักในคลาส `SourceMapConsumerV3` และคำนวณค่า Base64 VLQ ที่ใช้เอง (ตามมาตรฐาน Source Map spec: digit = value*2 สำหรับค่าบวก, value*2+1 สำหรับค่าลบ, แล้ว map เป็นตัวอักษร A-Z index 0-25) เพื่อสร้าง mapping string ที่ควบคุมผลลัพธ์ได้แน่นอน

**หมายเหตุสำคัญ (ป้องกันการเดา behavior):**
- `Base64VLQ`, `SourceMapGeneratorV3`, `FilePosition` ไม่มีซอร์สให้ดู จึงหลีกเลี่ยงการเรียก method ที่ไม่ปรากฏใน snippet ที่ให้มา (เช่นไม่เรียก getter ของ `FilePosition` เพราะไม่รู้ชื่อ method แน่ชัด)
- การเข้ารหัส VLQ อ้างอิงจากมาตรฐาน Source Map ทั่วไป (ระบุ comment กำกับไว้ทุกที่ที่ใช้)
- ทดสอบ behavior ที่เห็นจริงในโค้ด แม้บางจุดอาจดูเหมือน "บั๊ก" (เช่น mapping สุดท้ายไม่ถูก commit ถ้าไม่มี `;` ปิดท้าย) — นี่คือ Defects4J Closure-47b ตัวจริง จึงตั้งใจใส่ทดสอบนี้เพื่อดักจับ fault

```java
package com.google.debugging.sourcemap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.debugging.sourcemap.proto.Mapping.OriginalMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Unit tests for {@link SourceMapConsumerV3}.
 *
 * หมายเหตุการเข้ารหัส Base64 VLQ ที่ใช้สร้าง mapping string ในเทสนี้
 * (อ้างอิงมาตรฐาน Source Map VLQ ทั่วไป ไม่ได้เดา behavior เฉพาะของ Base64VLQ class):
 *   value=0  -> 'A'
 *   value=1  -> 'C'
 *   value=2  -> 'E'
 *   value=3  -> 'G'
 *   value=4  -> 'I'
 *   value=5  -> 'K'
 *   value=10 -> 'U'
 *   value=-1 -> 'D'
 */
public class SourceMapConsumerV3Test {

  private SourceMapConsumerV3 consumer;

  @Before
  public void setUp() {
    consumer = new SourceMapConsumerV3();
  }

  // ---------------------------------------------------------------------
  // 1) parse(String) - basic valid path + getMappingForLine exact match
  // ---------------------------------------------------------------------
  @Test
  public void testParseValidSimpleMap_exactMatch() throws SourceMapParseException {
    String json = "{"
        + "\"version\":3,"
        + "\"file\":\"out.js\","
        + "\"lineCount\":1,"
        + "\"mappings\":\"AAAA;\","
        + "\"sources\":[\"input.js\"],"
        + "\"names\":[]"
        + "}";
    consumer.parse(json);

    OriginalMapping mapping = consumer.getMappingForLine(1, 1);
    assertNotNull(mapping);
    assertEquals("input.js", mapping.getOriginalFile());
    assertEquals(0, mapping.getLineNumber());
    assertEquals(0, mapping.getColumnPosition());
    assertFalse(mapping.hasIdentifier());
  }

  // ---------------------------------------------------------------------
  // 2) getOriginalSources() หลัง parse
  // ---------------------------------------------------------------------
  @Test
  public void testGetOriginalSources_afterParse() throws SourceMapParseException {
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"AAAA;\",\"sources\":[\"input.js\",\"other.js\"],\"names\":[]}";
    consumer.parse(json);
    Collection<String> sources = consumer.getOriginalSources();
    assertEquals(2, sources.size());
    assertTrue(sources.contains("input.js"));
    assertTrue(sources.contains("other.js"));
  }

  // ---------------------------------------------------------------------
  // 3) getOriginalSources() ก่อน parse -> sources==null -> Arrays.asList(null)
  //    หมายเหตุ: พฤติกรรมนี้อ้างอิง Java std lib (Arrays.asList ตรวจ null ผ่าน
  //    Objects.requireNonNull ในหลาย JDK) ไม่ได้เดา behavior ของคลาสเป้าหมาย
  // ---------------------------------------------------------------------
  @Test(expected = NullPointerException.class)
  public void testGetOriginalSources_beforeParse_throwsNPE() {
    consumer.getOriginalSources();
  }

  // ---------------------------------------------------------------------
  // 4) Binary search branches ใน getMappingForLine / search()
  // ---------------------------------------------------------------------
  @Test
  public void testGetMappingForLine_binarySearchBranches() throws SourceMapParseException {
    // 3 mapped entries บนบรรทัดเดียว: col=0,5,10 ; srcCol=0,1,2 (srcLine คงที่ 0)
    String mappings = "AAAA,KAAC,KAAC;";
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"" + mappings + "\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);

    // target=0 (exact match, compare==0 ทันที)
    OriginalMapping m0 = consumer.getMappingForLine(1, 1);
    assertNotNull(m0);
    assertEquals(0, m0.getColumnPosition());

    // target=3 -> floor entry index0 (col0)  (compare<0 แล้ว compare<0 -> return end)
    OriginalMapping m3 = consumer.getMappingForLine(1, 4);
    assertNotNull(m3);
    assertEquals(0, m3.getColumnPosition());

    // target=7 -> floor entry index1 (col5)
    OriginalMapping m7 = consumer.getMappingForLine(1, 8);
    assertNotNull(m7);
    assertEquals(1, m7.getColumnPosition());

    // target=12 -> floor entry index2 (col10), เกินตัวสุดท้าย
    OriginalMapping m12 = consumer.getMappingForLine(1, 13);
    assertNotNull(m12);
    assertEquals(2, m12.getColumnPosition());
  }

  // ---------------------------------------------------------------------
  // 5) getMappingForLine: column ก่อน entry แรก -> getPreviousMapping
  // ---------------------------------------------------------------------
  @Test
  public void testGetMappingForLine_columnBeforeFirstEntry_returnsPreviousMapping()
      throws SourceMapParseException {
    // line0: entry col0 mapped (srcLine0,srcCol0)
    // line1: entry col5 mapped (srcLine delta1 -> absolute1, srcCol delta0)
    String mappings = "AAAA;KACA;";
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":2,"
        + "\"mappings\":\"" + mappings + "\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);

    // request line2(1-based)=lineNumber1, column2(0-based)=column3(1-based) < 5
    OriginalMapping mapping = consumer.getMappingForLine(2, 3);
    assertNotNull(mapping);
    // ต้องได้ mapping จาก entry สุดท้ายของ line0 (srcCol=0)
    assertEquals(0, mapping.getColumnPosition());
    assertEquals(0, mapping.getLineNumber());
  }

  // ---------------------------------------------------------------------
  // 6) getMappingForLine: null line (บรรทัดว่าง) -> getPreviousMapping สำเร็จ
  // ---------------------------------------------------------------------
  @Test
  public void testGetMappingForLine_nullLine_returnsPreviousMapping()
      throws SourceMapParseException {
    // line0 mapped(col0), line1 ว่าง(null), line2 mapped(col0)
    String mappings = "AAAA;;KACA;";
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":3,"
        + "\"mappings\":\"" + mappings + "\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);

    OriginalMapping mapping = consumer.getMappingForLine(2, 2); // line index1 (null line)
    assertNotNull(mapping);
    assertEquals(0, mapping.getColumnPosition()); // จาก entry สุดท้ายของ line0
  }

  // ---------------------------------------------------------------------
  // 7) getPreviousMapping คืนค่า null เมื่อบรรทัดก่อนหน้าไม่มีเลย (lineNumber==0)
  // ---------------------------------------------------------------------
  @Test
  public void testGetMappingForLine_previousMapping_returnsNull()
      throws SourceMapParseException {
    // line0 ว่าง(null), line1 mapped
    String mappings = ";AAAA;";
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":2,"
        + "\"mappings\":\"" + mappings + "\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);

    OriginalMapping mapping = consumer.getMappingForLine(1, 1); // lineNumber0 -> null line
    assertNull(mapping);
  }

  // ---------------------------------------------------------------------
  // 8) boundary: lineNumber < 0 และ lineNumber >= lines.size()
  // ---------------------------------------------------------------------
  @Test
  public void testGetMappingForLine_outOfBounds() throws SourceMapParseException {
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"AAAA;\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);

    assertNull(consumer.getMappingForLine(0, 1)); // lineNumber = -1
    assertNull(consumer.getMappingForLine(5, 1)); // lineNumber >= lines.size()
  }

  // ---------------------------------------------------------------------
  // 9) Unmapped entry (case1) -> getOriginalMappingForEntry คืน null
  // ---------------------------------------------------------------------
  @Test
  public void testGetMappingForLine_unmappedEntry_returnsNull()
      throws SourceMapParseException {
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"A;\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);
    assertNull(consumer.getMappingForLine(1, 1));
  }

  // ---------------------------------------------------------------------
  // 10) Named entry (case5) -> identifier ถูก set
  // ---------------------------------------------------------------------
  @Test
  public void testGetMappingForLine_namedEntry_setsIdentifier()
      throws SourceMapParseException {
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"AAAAA;\",\"sources\":[\"input.js\"],\"names\":[\"myName\"]}";
    consumer.parse(json);
    OriginalMapping mapping = consumer.getMappingForLine(1, 1);
    assertNotNull(mapping);
    assertTrue(mapping.hasIdentifier());
    assertEquals("myName", mapping.getIdentifier());
  }

  // ---------------------------------------------------------------------
  // 11) parse: version != 3
  // ---------------------------------------------------------------------
  @Test
  public void testParse_versionNotThree_throws() {
    String json = "{\"version\":2,\"file\":\"out.js\",\"lineCount\":0,"
        + "\"mappings\":\"\",\"sources\":[],\"names\":[]}";
    try {
      consumer.parse(json);
      fail("ต้อง throw SourceMapParseException");
    } catch (SourceMapParseException e) {
      assertTrue(e.getMessage().contains("Unknown version"));
    }
  }

  // ---------------------------------------------------------------------
  // 12) parse: file ว่าง
  // ---------------------------------------------------------------------
  @Test
  public void testParse_emptyFile_throws() {
    String json = "{\"version\":3,\"file\":\"\",\"lineCount\":0,"
        + "\"mappings\":\"\",\"sources\":[],\"names\":[]}";
    try {
      consumer.parse(json);
      fail("ต้อง throw SourceMapParseException");
    } catch (SourceMapParseException e) {
      assertTrue(e.getMessage().contains("File entry is missing or empty"));
    }
  }

  // ---------------------------------------------------------------------
  // 13) parse: JSON ผิดรูปแบบ (malformed)
  // ---------------------------------------------------------------------
  @Test
  public void testParse_malformedJson_throws() {
    String malformed = "{not valid json";
    try {
      consumer.parse(malformed);
      fail("ต้อง throw SourceMapParseException");
    } catch (SourceMapParseException e) {
      assertTrue(e.getMessage().contains("JSON parse exception"));
    }
  }

  // ---------------------------------------------------------------------
  // 14) parse: ขาด key "version" -> JSONException ถูก catch
  // ---------------------------------------------------------------------
  @Test
  public void testParse_missingVersionKey_throws() {
    String json = "{\"file\":\"out.js\",\"lineCount\":0,"
        + "\"mappings\":\"\",\"sources\":[],\"names\":[]}";
    try {
      consumer.parse(json);
      fail("ต้อง throw SourceMapParseException");
    } catch (SourceMapParseException e) {
      assertTrue(e.getMessage().contains("JSON parse exception"));
    }
  }

  // ---------------------------------------------------------------------
  // 15) parseMetaMap: sections + lineCount ปนกัน -> Invalid map format
  // ---------------------------------------------------------------------
  @Test
  public void testParseMetaMap_sectionsWithLineCount_throwsInvalid()
      throws Exception {
    JSONObject root = new JSONObject();
    root.put("version", 3);
    root.put("file", "out.js");
    root.put("sections", new JSONArray());
    root.put("lineCount", 1);
    try {
      consumer.parse(root, null);
      fail("ต้อง throw SourceMapParseException");
    } catch (SourceMapParseException e) {
      assertTrue(e.getMessage().contains("Invalid map format"));
    }
  }

  // ---------------------------------------------------------------------
  // 16) parseMetaMap: section มีทั้ง map และ url -> throw
  // ---------------------------------------------------------------------
  @Test
  public void testParseMetaMap_sectionBothMapAndUrl_throws() throws Exception {
    JSONObject root = new JSONObject();
    root.put("version", 3);
    root.put("file", "out.js");

    JSONObject section = new JSONObject();
    section.put("map", "{}");
    section.put("url", "http://example.com/map");

    JSONArray sections = new JSONArray();
    sections.put(section);
    root.put("sections", sections);

    try {
      consumer.parse(root, null);
      fail("ต้อง throw SourceMapParseException");
    } catch (SourceMapParseException e) {
      assertTrue(e.getMessage().contains("may not have both"));
    }
  }

  // ---------------------------------------------------------------------
  // 17) parseMetaMap: section ไม่มีทั้ง map และ url -> throw (ต้องมี offset ก่อน)
  // ---------------------------------------------------------------------
  @Test
  public void testParseMetaMap_sectionNeitherMapNorUrl_throws() throws Exception {
    JSONObject root = new JSONObject();
    root.put("version", 3);
    root.put("file", "out.js");

    JSONObject offset = new JSONObject();
    offset.put("line", 0);
    offset.put("column", 0);

    JSONObject section = new JSONObject();
    section.put("offset", offset);

    JSONArray sections = new JSONArray();
    sections.put(section);
    root.put("sections", sections);

    try {
      consumer.parse(root, null);
      fail("ต้อง throw SourceMapParseException");
    } catch (SourceMapParseException e) {
      assertTrue(e.getMessage().contains("must have either"));
    }
  }

  // ---------------------------------------------------------------------
  // 18) parseMetaMap: section มี url, sectionSupplier=null -> DefaultSourceMapSupplier
  //     คืน null -> throw "Unable to retrieve"
  // ---------------------------------------------------------------------
  @Test
  public void testParseMetaMap_urlWithDefaultSupplier_throwsUnableToRetrieve()
      throws Exception {
    JSONObject root = new JSONObject();
    root.put("version", 3);
    root.put("file", "out.js");

    JSONObject offset = new JSONObject();
    offset.put("line", 0);
    offset.put("column", 0);

    JSONObject section = new JSONObject();
    section.put("offset", offset);
    section.put("url", "http://example.com/x.map");

    JSONArray sections = new JSONArray();
    sections.put(section);
    root.put("sections", sections);

    try {
      consumer.parse(root, null);
      fail("ต้อง throw SourceMapParseException");
    } catch (SourceMapParseException e) {
      assertTrue(e.getMessage().contains("Unable to retrieve"));
    }
  }

  // ---------------------------------------------------------------------
  // 19) parseMetaMap: ขาด offset -> JSONException ถูก catch ภายใน parseMetaMap
  // ---------------------------------------------------------------------
  @Test
  public void testParseMetaMap_missingOffset_throwsJsonParseException()
      throws Exception {
    JSONObject root = new JSONObject();
    root.put("version", 3);
    root.put("file", "out.js");

    JSONObject section = new JSONObject(); // ไม่มี offset
    JSONArray sections = new JSONArray();
    sections.put(section);
    root.put("sections", sections);

    try {
      consumer.parse(root, null);
      fail("ต้อง throw SourceMapParseException");
    } catch (SourceMapParseException e) {
      assertTrue(e.getMessage().contains("JSON parse exception"));
    }
  }

  // ---------------------------------------------------------------------
  // 20) parseMetaMap: custom sectionSupplier ถูกใช้จริง (ไม่ใช่ Default)
  // ---------------------------------------------------------------------
  @Test
  public void testParseMetaMap_customSupplier_isInvokedWithCorrectUrl()
      throws Exception {
    final String[] capturedUrl = new String[1];
    SourceMapSupplier supplier = new SourceMapSupplier() {
      @Override
      public String getSourceMap(String url) {
        capturedUrl[0] = url;
        throw new RuntimeException("stop-here"); // หยุดก่อนเข้า generator (behavior ไม่รู้จัก)
      }
    };

    JSONObject root = new JSONObject();
    root.put("version", 3);
    root.put("file", "out.js");

    JSONObject offset = new JSONObject();
    offset.put("line", 0);
    offset.put("column", 0);

    JSONObject section = new JSONObject();
    section.put("offset", offset);
    section.put("url", "http://example.com/custom.map");

    JSONArray sections = new JSONArray();
    sections.put(section);
    root.put("sections", sections);

    try {
      consumer.parse(root, supplier);
      fail("ต้อง propagate RuntimeException");
    } catch (RuntimeException e) {
      assertEquals("stop-here", e.getMessage());
    }
    assertEquals("http://example.com/custom.map", capturedUrl[0]);
  }

  // ---------------------------------------------------------------------
  // 21) parse(JSONObject) overload (1-arg)
  // ---------------------------------------------------------------------
  @Test
  public void testParseJSONObjectOverload_works() throws Exception {
    JSONObject root = new JSONObject();
    root.put("version", 3);
    root.put("file", "out.js");
    root.put("lineCount", 1);
    root.put("mappings", "AAAA;");
    root.put("sources", new JSONArray(new String[]{"input.js"}));
    root.put("names", new JSONArray());

    consumer.parse(root);
    OriginalMapping mapping = consumer.getMappingForLine(1, 1);
    assertNotNull(mapping);
    assertEquals("input.js", mapping.getOriginalFile());
  }

  // ---------------------------------------------------------------------
  // 22) decodeEntry: จำนวนค่าไม่ตรง (2 values) -> default case -> IllegalStateException
  // ---------------------------------------------------------------------
  @Test(expected = IllegalStateException.class)
  public void testDecodeEntry_invalidValueCount_throwsIllegalState()
      throws SourceMapParseException {
    // "AA;" -> entry มี 2 ค่า (ไม่ตรงกับ case 1,4,5)
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"AA;\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);
  }

  // ---------------------------------------------------------------------
  // 23) validateEntry: sourceFileId >= sources.length -> IllegalStateException
  // ---------------------------------------------------------------------
  @Test(expected = IllegalStateException.class)
  public void testValidateEntry_sourceFileIdOutOfRange_throws()
      throws SourceMapParseException {
    // col0='A', srcFileDelta=1='C' (=> srcFile=1 แต่ sources.length=1) , srcLine0='A', srcCol0='A'
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"ACAA;\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);
  }

  // ---------------------------------------------------------------------
  // 24) validateEntry: nameId >= names.length -> IllegalStateException
  // ---------------------------------------------------------------------
  @Test(expected = IllegalStateException.class)
  public void testValidateEntry_nameIdOutOfRange_throws()
      throws SourceMapParseException {
    // case5 (5 values) ทั้งหมด delta 0, names=[] length0 -> nameId0 >= 0 -> fail
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"AAAAA;\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);
  }

  // ---------------------------------------------------------------------
  // 25) validateEntry: line >= lineCount -> IllegalStateException
  // ---------------------------------------------------------------------
  @Test(expected = IllegalStateException.class)
  public void testValidateEntry_lineExceedsLineCount_throws()
      throws SourceMapParseException {
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":0,"
        + "\"mappings\":\"AAAA;\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);
  }

  // ---------------------------------------------------------------------
  // 26) MappingBuilder: ไม่มี trailing ';' -> บรรทัดสุดท้ายไม่ถูก commit
  //     (แสดงพฤติกรรมจริงของโค้ด/ดักจับ fault ที่เกี่ยวข้องกับ Closure-47b)
  // ---------------------------------------------------------------------
  @Test
  public void testParse_missingTrailingSemicolon_lastLineNotStored()
      throws SourceMapParseException {
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"AAAA\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);
    // ตาม logic ของ build(): บรรทัดสุดท้ายไม่ถูก push เข้า lines list เพราะไม่มี ';' ปิด
    OriginalMapping mapping = consumer.getMappingForLine(1, 1);
    assertNull(mapping); // เพราะ lines.size() == 0 ทำให้ lineNumber(0) >= lines.size() -> null
  }

  // ---------------------------------------------------------------------
  // 27) getReverseMapping: unknown file -> empty
  // ---------------------------------------------------------------------
  @Test
  public void testGetReverseMapping_unknownFile_returnsEmpty()
      throws SourceMapParseException {
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"AAAA;\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);
    Collection<OriginalMapping> result =
        consumer.getReverseMapping("nonexistent.js", 0, 0);
    assertTrue(result.isEmpty());
  }

  // ---------------------------------------------------------------------
  // 28) getReverseMapping: known file, unknown line -> empty
  // ---------------------------------------------------------------------
  @Test
  public void testGetReverseMapping_knownFileUnknownLine_returnsEmpty()
      throws SourceMapParseException {
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"AAAA;\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);
    Collection<OriginalMapping> result =
        consumer.getReverseMapping("input.js", 999, 0);
    assertTrue(result.isEmpty());
  }

  // ---------------------------------------------------------------------
  // 29) getReverseMapping: known file/line -> ได้ mapping ครบ
  // ---------------------------------------------------------------------
  @Test
  public void testGetReverseMapping_knownFileKnownLine_returnsMappings()
      throws SourceMapParseException {
    // 3 entries เดียวกัน srcLine=0 ทั้งหมด: col0/5/10
    String mappings = "AAAA,KAAC,KAAC;";
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"" + mappings + "\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);

    Collection<OriginalMapping> result = consumer.getReverseMapping("input.js", 0, 0);
    assertEquals(3, result.size());

    List<Integer> cols = new ArrayList<Integer>();
    for (OriginalMapping m : result) {
      cols.add(m.getColumnPosition());
    }
    assertTrue(cols.contains(0));
    assertTrue(cols.contains(5));
    assertTrue(cols.contains(10));
  }

  // ---------------------------------------------------------------------
  // 30) createReverseMapping: entry ที่ sourceFileId valid แต่ sourceLine == UNMAPPED(-1)
  //     -> ไม่ถูกเพิ่มลง reverse map (เงื่อนไข && ฝั่งขวาเป็น false)
  // ---------------------------------------------------------------------
  @Test
  public void testCreateReverseMapping_negativeSourceLine_notIncluded()
      throws SourceMapParseException {
    // col0='A', srcFileDelta0='A', srcLineDelta=-1='D' (=> absolute srcLine=-1), srcCol0='A'
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"AADA;\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);

    Collection<OriginalMapping> result = consumer.getReverseMapping("input.js", -1, 0);
    assertTrue(result.isEmpty());
  }

  // ---------------------------------------------------------------------
  // 31) visitMappings: pending flush logic (if(pending) ... visitor.visit(...))
  //     หมายเหตุ: ไม่ตรวจสอบ getter ภายใน FilePosition เพราะไม่มีซอร์สให้ยืนยัน API
  // ---------------------------------------------------------------------
  @Test
  public void testVisitMappings_flushesPendingEntry() throws SourceMapParseException {
    // entry1: col0, srcFile0, srcLine10, srcCol0  ("AAUA")
    // entry2: col5, srcFile0, srcLine delta10(=>20), srcCol0 ("KAUA")
    String mappings = "AAUA,KAUA;";
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":1,"
        + "\"mappings\":\"" + mappings + "\",\"sources\":[\"input.js\"],\"names\":[]}";
    consumer.parse(json);

    final List<String> visitedSourceNames = new ArrayList<String>();
    final List<String> visitedSymbolNames = new ArrayList<String>();
    final int[] callCount = new int[1];

    consumer.visitMappings(new SourceMapConsumerV3.EntryVisitor() {
      @Override
      public void visit(String sourceName, String symbolName,
          FilePosition sourceStartPosition, FilePosition startPosition,
          FilePosition endPosition) {
        callCount[0]++;
        visitedSourceNames.add(sourceName);
        visitedSymbolNames.add(symbolName);
        assertNotNull(sourceStartPosition);
        assertNotNull(startPosition);
        assertNotNull(endPosition);
      }
    });

    // มีเพียง entry แรกเท่านั้นที่ flush ได้ (entry สุดท้ายไม่มี entry ถัดไปมาปิด pending)
    assertEquals(1, callCount[0]);
    assertEquals("input.js", visitedSourceNames.get(0));
    assertNull(visitedSymbolNames.get(0)); // ไม่มี nameId ในทั้งสอง entry
  }

  // ---------------------------------------------------------------------
  // 32) visitMappings: ไม่มีบรรทัดใดมี entry เลย (lines ทุกตัวเป็น null) -> ไม่ throw
  // ---------------------------------------------------------------------
  @Test
  public void testVisitMappings_allNullLines_noCallback() throws SourceMapParseException {
    String json = "{\"version\":3,\"file\":\"out.js\",\"lineCount\":2,"
        + "\"mappings\":\";;\",\"sources\":[],\"names\":[]}";
    consumer.parse(json);

    final int[] callCount = new int[1];
    consumer.visitMappings(new SourceMapConsumerV3.EntryVisitor() {
      @Override
      public void visit(String sourceName, String symbolName,
          FilePosition sourceStartPosition, FilePosition startPosition,
          FilePosition endPosition) {
        callCount[0]++;
      }
    });
    assertEquals(0, callCount[0]);
  }
}
```

# ตารางสรุป Coverage

| # | Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|---|
| 1 | testParseValidSimpleMap_exactMatch | parse ปกติผ่านทุก validation, MappingBuilder case4, search compare==0 |
| 2 | testGetOriginalSources_afterParse | Arrays.asList(sources) ปกติ |
| 3 | testGetOriginalSources_beforeParse_throwsNPE | sources==null (edge case ก่อน parse) |
| 4 | testGetMappingForLine_binarySearchBranches | search(): compare==0, compare<0 (2 จุด), compare>0, start>end return end, end<start return end |
| 5 | testGetMappingForLine_columnBeforeFirstEntry_... | `entries.get(0).getGeneratedColumn() > column` = true → getPreviousMapping |
| 6 | testGetMappingForLine_nullLine_returnsPreviousMapping | `lines.get(lineNumber)==null` = true, getPreviousMapping สำเร็จ |
| 7 | testGetMappingForLine_previousMapping_returnsNull | getPreviousMapping: `lineNumber==0` → return null |
| 8 | testGetMappingForLine_outOfBounds | `lineNumber<0` และ `lineNumber>=lines.size()` |
| 9 | testGetMappingForLine_unmappedEntry_returnsNull | getOriginalMappingForEntry: sourceFileId==UNMAPPED → null |
| 10 | testGetMappingForLine_namedEntry_setsIdentifier | MappingBuilder case5, `nameId != UNMAPPED` → setIdentifier |
| 11 | testParse_versionNotThree_throws | `version != 3` |
| 12 | testParse_emptyFile_throws | `file.isEmpty()` |
| 13 | testParse_malformedJson_throws | catch(JSONException) ใน parse(String) |
| 14 | testParse_missingVersionKey_throws | JSONException จาก getInt("version") |
| 15 | testParseMetaMap_sectionsWithLineCount_throwsInvalid | `has("lineCount")||...` = true |
| 16 | testParseMetaMap_sectionBothMapAndUrl_throws | `section.has("map") && section.has("url")` |
| 17 | testParseMetaMap_sectionNeitherMapNorUrl_throws | else-throw "must have either" |
| 18 | testParseMetaMap_urlWithDefaultSupplier_... | `sectionSupplier==null`→Default, getSourceMap คืน null |
| 19 | testParseMetaMap_missingOffset_... | JSONException ใน parseMetaMap try-block |
| 20 | testParseMetaMap_customSupplier_isInvoked... | `sectionSupplier==null` = false (ใช้ supplier ที่ส่งมา) |
| 21 | testParseJSONObjectOverload_works | parse(JSONObject) 1-arg overload |
| 22 | testDecodeEntry_invalidValueCount_throwsIllegalState | decodeEntry default case |
| 23 | testValidateEntry_sourceFileIdOutOfRange_throws | validateEntry: sourceFileId < sources.length = false |
| 24 | testValidateEntry_nameIdOutOfRange_throws | validateEntry: nameId < names.length = false |
| 25 | testValidateEntry_lineExceedsLineCount_throws | validateEntry: line < lineCount = false |
| 26 | testParse_missingTrailingSemicolon_lastLineNotStored | build(): บรรทัดสุดท้ายไม่ถูก push เข้า lines (fault-detection) |
| 27 | testGetReverseMapping_unknownFile_returnsEmpty | sourceLineToCollectionMap==null → emptyList |
| 28 | testGetReverseMapping_knownFileUnknownLine_returnsEmpty | mappings==null (จาก map.get(line)) → emptyList |
| 29 | testGetReverseMapping_knownFileKnownLine_returnsMappings | createReverseMapping ปกติ, loop entries |
| 30 | testCreateReverseMapping_negativeSourceLine_notIncluded | `entry.getSourceLine() != UNMAPPED` = false (ฝั่งขวาของ && เป็น false) |
| 31 | testVisitMappings_flushesPendingEntry | `if(pending)` = true → visitor.visit ถูกเรียก, `sourceFileId!=UNMAPPED` = true |
| 32 | testVisitMappings_allNullLines_noCallback | `line != null` = false ทุก iteration, loop ไม่ทำอะไร |

หมายเหตุ: บางส่วนของ `parseMetaMap` ที่เกี่ยวกับการ merge สำเร็จผ่าน `SourceMapGeneratorV3.mergeMapSection` ไม่ได้ทดสอบ เนื่องจากไม่มีซอร์สโค้ดของคลาสนั้นให้ยืนยัน behavior ตามข้อกำหนดข้อ 4
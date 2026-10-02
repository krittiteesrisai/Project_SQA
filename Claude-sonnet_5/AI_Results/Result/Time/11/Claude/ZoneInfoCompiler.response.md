# วิเคราะห์และแผนการทดสอบ

เนื่องจาก `ZoneInfoCompiler` มีเมธอด static และ instance จำนวนมากที่เป็น **package-private** (ไม่มี modifier) ซึ่งสามารถเข้าถึงได้เฉพาะจากคลาสในแพ็กเกจเดียวกันเท่านั้น (`org.joda.time.tz`) ดังนั้นคลาสทดสอบ `ZoneInfoCompilerTest` จะต้องอยู่ใน package เดียวกัน (จึงไม่จำเป็นต้อง `import` ตัวคลาสเป้าหมายเอง แต่จะ import คลาสสนับสนุนอื่น ๆ ที่ต้องใช้)

nested class อื่น ๆ เช่น `Rule`, `RuleSet`, `Zone` เป็น `private static` จึงไม่สามารถเข้าถึงได้ตรง ๆ — จะทดสอบผ่าน public API (`parseDataFile`, `compile`) แทน ส่วน `DateTimeOfYear` เป็น package-private จึงเข้าถึงได้ตรง

```java
package org.joda.time.tz;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit4 test suite for {@link ZoneInfoCompiler}.
 *
 * NOTE: คลาสนี้ต้องอยู่ใน package org.joda.time.tz เนื่องจากเมธอด/ฟิลด์ส่วนใหญ่ของ
 * ZoneInfoCompiler เป็น package-private (ไม่มี modifier) จึงไม่จำเป็นต้อง import
 * ZoneInfoCompiler เอง (อยู่ใน package เดียวกัน) แต่ import คลาสสนับสนุนอื่น ๆ ตามที่ใช้
 *
 * ข้อสังเกต: nested class Rule/RuleSet/Zone เป็น private static ของ ZoneInfoCompiler
 * จึงไม่สามารถ new/เข้าถึงได้โดยตรงจาก test — ทดสอบผ่าน public API (parseDataFile/compile) แทน
 */
public class ZoneInfoCompilerTest {

    private PrintStream originalOut;

    @Before
    public void setUp() {
        // reset shared static ThreadLocal state ก่อนทุกเทสเพื่อไม่ให้ผลกระทบกัน
        ZoneInfoCompiler.cVerbose.set(Boolean.FALSE);
        originalOut = System.out;
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
        ZoneInfoCompiler.cVerbose.set(Boolean.FALSE);
    }

    private BufferedReader reader(String content) {
        return new BufferedReader(new StringReader(content));
    }

    private File createTempFile(String content) throws IOException {
        File f = File.createTempFile("zic_test", ".tzdata");
        f.deleteOnExit();
        FileWriter w = new FileWriter(f);
        w.write(content);
        w.close();
        return f;
    }

    // ----------------------------------------------------------------
    // verbose()
    // ----------------------------------------------------------------

    @Test
    public void testVerbose_defaultFalse() {
        assertFalse(ZoneInfoCompiler.verbose());
    }

    @Test
    public void testVerbose_afterSetTrue() {
        ZoneInfoCompiler.cVerbose.set(Boolean.TRUE);
        assertTrue(ZoneInfoCompiler.verbose());
    }

    // ----------------------------------------------------------------
    // parseYear
    // ----------------------------------------------------------------

    @Test
    public void testParseYear_minimum() {
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("minimum", 1900));
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("MIN", 1900)); // case-insensitive
    }

    @Test
    public void testParseYear_maximum() {
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("maximum", 1900));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("MAX", 1900));
    }

    @Test
    public void testParseYear_only_returnsDefault() {
        assertEquals(1900, ZoneInfoCompiler.parseYear("only", 1900));
        assertEquals(1900, ZoneInfoCompiler.parseYear("ONLY", 1900));
    }

    @Test
    public void testParseYear_numeric() {
        assertEquals(1970, ZoneInfoCompiler.parseYear("1970", 0));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseYear_invalidString_throws() {
        ZoneInfoCompiler.parseYear("notayear", 0);
    }

    // ----------------------------------------------------------------
    // parseMonth / parseDayOfWeek
    // ----------------------------------------------------------------

    @Test
    public void testParseMonth_validNames() {
        assertEquals(1, ZoneInfoCompiler.parseMonth("Jan"));
        assertEquals(12, ZoneInfoCompiler.parseMonth("Dec"));
    }

    @Test
    public void testParseDayOfWeek_validNames() {
        assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("Mon"));
        assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("Sun"));
    }

    // ----------------------------------------------------------------
    // parseOptional
    // ----------------------------------------------------------------

    @Test
    public void testParseOptional_dashReturnsNull() {
        assertNull(ZoneInfoCompiler.parseOptional("-"));
    }

    @Test
    public void testParseOptional_otherReturnsSame() {
        assertEquals("abc", ZoneInfoCompiler.parseOptional("abc"));
    }

    // ----------------------------------------------------------------
    // parseTime
    // ----------------------------------------------------------------

    @Test
    public void testParseTime_positive() {
        assertEquals(2 * 3600 * 1000, ZoneInfoCompiler.parseTime("2:00"));
    }

    @Test
    public void testParseTime_negative() {
        assertEquals(-2 * 3600 * 1000, ZoneInfoCompiler.parseTime("-2:00"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseTime_malformed_throws() {
        ZoneInfoCompiler.parseTime("not-a-time");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseTime_empty_throws() {
        ZoneInfoCompiler.parseTime("");
    }

    // ----------------------------------------------------------------
    // parseZoneChar
    // ----------------------------------------------------------------

    @Test
    public void testParseZoneChar_standard() {
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('s'));
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('S'));
    }

    @Test
    public void testParseZoneChar_utc() {
        char[] utcChars = {'u', 'U', 'g', 'G', 'z', 'Z'};
        for (char c : utcChars) {
            assertEquals('u', ZoneInfoCompiler.parseZoneChar(c));
        }
    }

    @Test
    public void testParseZoneChar_wallAndDefault() {
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('w'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('W'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('x')); // default branch
    }

    // ----------------------------------------------------------------
    // getStartOfYear / getLenientISOChronology (singleton + default values)
    // ----------------------------------------------------------------

    @Test
    public void testGetStartOfYear_singletonAndDefaults() {
        ZoneInfoCompiler.DateTimeOfYear y1 = ZoneInfoCompiler.getStartOfYear();
        ZoneInfoCompiler.DateTimeOfYear y2 = ZoneInfoCompiler.getStartOfYear();
        assertSame(y1, y2); // cache branch: cStartOfYear == null เฉพาะครั้งแรก

        assertEquals(1, y1.iMonthOfYear);
        assertEquals(1, y1.iDayOfMonth);
        assertEquals(0, y1.iDayOfWeek);
        assertFalse(y1.iAdvanceDayOfWeek);
        assertEquals(0, y1.iMillisOfDay);
        assertEquals('w', y1.iZoneChar);
    }

    @Test
    public void testGetLenientISOChronology_singleton() {
        Chronology c1 = ZoneInfoCompiler.getLenientISOChronology();
        Chronology c2 = ZoneInfoCompiler.getLenientISOChronology();
        assertSame(c1, c2);
        assertNotNull(c1);
    }

    // ----------------------------------------------------------------
    // writeZoneInfoMap
    // ----------------------------------------------------------------

    @Test
    public void testWriteZoneInfoMap_emptyMap() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(baos);
        Map<String, DateTimeZone> zimap = new LinkedHashMap<String, DateTimeZone>();

        ZoneInfoCompiler.writeZoneInfoMap(dout, zimap);
        dout.flush();

        DataInputStream in = new DataInputStream(new ByteArrayInputStream(baos.toByteArray()));
        assertEquals(0, in.readShort()); // pool size = 0
        assertEquals(0, in.readShort()); // mapping size = 0
    }

    @Test
    public void testWriteZoneInfoMap_withEntries() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(baos);

        Map<String, DateTimeZone> zimap = new LinkedHashMap<String, DateTimeZone>();
        DateTimeZone utc = DateTimeZone.forID("UTC");
        zimap.put("Alpha", utc);
        zimap.put("Beta", utc); // ค่า id "UTC" ซ้ำ -> ควรไม่ถูกเพิ่มใน pool ซ้ำ

        ZoneInfoCompiler.writeZoneInfoMap(dout, zimap);
        dout.flush();

        DataInputStream in = new DataInputStream(new ByteArrayInputStream(baos.toByteArray()));
        short poolSize = in.readShort();
        assertEquals(3, poolSize); // Alpha, UTC, Beta

        String[] pool = new String[poolSize];
        for (int i = 0; i < poolSize; i++) {
            pool[i] = in.readUTF();
        }
        assertEquals("Alpha", pool[0]);
        assertEquals("UTC", pool[1]);
        assertEquals("Beta", pool[2]);

        short mapSize = in.readShort();
        assertEquals(2, mapSize);

        // entry1: Alpha(idx0) -> UTC(idx1)
        assertEquals(0, in.readShort());
        assertEquals(1, in.readShort());
        // entry2: Beta(idx2) -> UTC(idx1)
        assertEquals(2, in.readShort());
        assertEquals(1, in.readShort());
    }

    // ----------------------------------------------------------------
    // test(String id, DateTimeZone tz)
    // ----------------------------------------------------------------

    @Test
    public void testTest_idMismatch_returnsTrueImmediately() {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        // branch: !id.equals(tz.getID()) -> return true ทันที (ไม่ตรวจ transition)
        assertTrue(ZoneInfoCompiler.test("MismatchedId", utc));
    }

    @Test
    public void testTest_fixedZone_noTransitions_returnsTrue() {
        DateTimeZone utc = DateTimeZone.forID("UTC");
        // UTC ไม่มี transition -> while loop break ทันที (next == millis) -> return true
        assertTrue(ZoneInfoCompiler.test(utc.getID(), utc));
    }

    // ----------------------------------------------------------------
    // parseDataFile - basic line handling
    // ----------------------------------------------------------------

    @Test
    public void testParseDataFile_onlyBlankAndCommentLines() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.parseDataFile(reader("# a comment\n\n   \n# another\n"));
        // ไม่มี Zone ถูกเพิ่ม -> compile กับ sources=null จะได้ map ว่าง
        Map<String, DateTimeZone> map = zic.compile(null, null);
        assertEquals(0, map.size());
    }

    @Test
    public void testParseDataFile_ZoneContinuationLinkAndUnknownLine() throws IOException {
        // Zone ที่มี cutover ทำให้ offset เปลี่ยนจาก 0 เป็น 1 ชม. ที่ปี 1980
        // หมายเหตุ: ผลลัพธ์ของ test() ขึ้นกับ DateTimeZoneBuilder ภายใน
        // แต่เนื่องจาก offset/key เปลี่ยนจริงที่ cutover จึงคาดว่าจะผ่าน (ไม่ยืนยัน internal logic เพิ่มเติม)
        String content =
            "# full comment line\n" +
            "\n" +
            "Zone Test/Zone 0:00 - GMT 1980 Jan 1 0:00\n" +
            "\t1:00  -      PST\n" +
            "Link Test/Zone Test/Alias\n" +
            "Foo bar  # trailing comment should be stripped\n";

        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.parseDataFile(reader(content));

        Map<String, DateTimeZone> map = zic.compile(null, null);

        assertNotNull(map.get("Test/Zone"));
        assertNotNull(map.get("Test/Alias"));
        assertSame(map.get("Test/Zone"), map.get("Test/Alias"));
    }

    @Test
    public void testParseDataFile_LinkToMissingZone_notAdded() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.parseDataFile(reader("Link NoSuchZone SomeAlias\n"));
        Map<String, DateTimeZone> map = zic.compile(null, null);
        // branch: tz == null -> ไม่ put ลง map (ยกเว้น print บน pass>0)
        assertNull(map.get("SomeAlias"));
        assertEquals(0, map.size());
    }

    @Test
    public void testParseDataFile_RuleSet_sameNameAddRule_noException() throws IOException {
        String content =
            "Rule Testr 1970 1975 - Jan 1 0:00 0:00 -\n" +
            "Rule Testr 1980 only - Feb 2 0:00 0:00 -\n";
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        // branch: rs != null -> rs.addRule(r) กรณีชื่อ Rule ตรงกัน ต้องไม่มี exception
        zic.parseDataFile(reader(content));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDataFile_RuleToYearLessThanFromYear_throws() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        // Rule constructor: if (iToYear < iFromYear) throw IllegalArgumentException
        zic.parseDataFile(reader("Rule Bad 1980 1970 - Jan 1 0:00 0:00 -\n"));
    }

    // ----------------------------------------------------------------
    // DateTimeOfYear parsing branches (ผ่าน Zone 'until' token) : last, >=, <=, numeric, invalid, 24:00
    // ----------------------------------------------------------------

    @Test
    public void testParseDataFile_UntilDay_numeric_noException() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.parseDataFile(reader("Zone Zn 0:00 - FMT 1980 Jan 15 2:00\n"));
    }

    @Test
    public void testParseDataFile_UntilDay_last_noException() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.parseDataFile(reader("Zone Zl 0:00 - FMT 1980 Jan lastSun 2:00\n"));
    }

    @Test
    public void testParseDataFile_UntilDay_greaterEqual_noException() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.parseDataFile(reader("Zone Zg 0:00 - FMT 1980 Jan Sun>=8 2:00\n"));
    }

    @Test
    public void testParseDataFile_UntilDay_lessEqual_noException() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.parseDataFile(reader("Zone Zle 0:00 - FMT 1980 Jan Sun<=8 2:00\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDataFile_UntilDay_invalidFormat_throws() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        // ไม่ match ตัวเลข, ไม่มี ">=" หรือ "<=" -> throw IllegalArgumentException(str)
        zic.parseDataFile(reader("Zone Zx 0:00 - FMT 1980 Jan BAD 2:00\n"));
    }

    @Test
    public void testParseDataFile_UntilTime_2400_withNumericDay_noException() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.parseDataFile(reader("Zone Zy 0:00 - FMT 1980 Jan 15 24:00\n"));
    }

    @Test
    public void testParseDataFile_UntilTime_2400_withLastDay_noException() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.parseDataFile(reader("Zone Zz 0:00 - FMT 1980 Jan lastSun 24:00\n"));
    }

    // ----------------------------------------------------------------
    // compile()
    // ----------------------------------------------------------------

    @Test
    public void testCompile_nullSourcesAndOutputDir_emptyMap() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        Map<String, DateTimeZone> map = zic.compile(null, null);
        assertNotNull(map);
        assertEquals(0, map.size());
    }

    @Test(expected = IOException.class)
    public void testCompile_outputDirIsFile_throwsIOException() throws IOException {
        File notADir = File.createTempFile("zic_notdir", ".tmp");
        notADir.deleteOnExit();
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        zic.compile(notADir, null);
    }

    @Test
    public void testCompile_outputDirNotExists_isCreatedAndZoneInfoMapWritten() throws IOException {
        File dir = new File(System.getProperty("java.io.tmpdir"),
                             "zic_test_dir_" + System.nanoTime());
        assertFalse(dir.exists());
        try {
            ZoneInfoCompiler zic = new ZoneInfoCompiler();
            zic.compile(dir, null); // sources=null, outputDir ยังไม่มีอยู่ -> mkdirs()
            assertTrue(dir.exists());
            assertTrue(dir.isDirectory());
            File zoneInfoMapFile = new File(dir, "ZoneInfoMap");
            assertTrue(zoneInfoMapFile.exists());
        } finally {
            // cleanup
            File zim = new File(dir, "ZoneInfoMap");
            if (zim.exists()) zim.delete();
            if (dir.exists()) dir.delete();
        }
    }

    @Test(expected = IOException.class)
    public void testCompile_sourceFileNotExist_throws() throws IOException {
        ZoneInfoCompiler zic = new ZoneInfoCompiler();
        File nonExist = new File(System.getProperty("java.io.tmpdir"),
                                  "no_such_zic_source_" + System.nanoTime());
        zic.compile(null, new File[] { nonExist });
    }

    // ----------------------------------------------------------------
    // main()
    // ----------------------------------------------------------------

    @Test
    public void testMain_noArgs_printsUsageAndReturns() throws Exception {
        ZoneInfoCompiler.main(new String[0]);
        // ไม่มี exception คือการยืนยัน branch: args.length==0 -> printUsage(); return;
    }

    @Test
    public void testMain_helpOption_printsUsageAndReturns() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        ZoneInfoCompiler.main(new String[] { "-?" });
        String output = baos.toString();
        assertTrue(output.contains("Usage"));
    }

    @Test
    public void testMain_srcOptionMissingArgument_printsUsageAndReturns() throws Exception {
        // ++i เกิน array bound -> IndexOutOfBoundsException ถูก catch -> printUsage(); return
        ZoneInfoCompiler.main(new String[] { "-src" });
    }

    @Test
    public void testMain_dstOptionMissingArgument_printsUsageAndReturns() throws Exception {
        ZoneInfoCompiler.main(new String[] { "-dst" });
    }

    @Test
    public void testMain_onlyOptionsNoSourceFiles_printsUsageAndReturns() throws Exception {
        // หลัง parse options แล้ว i >= args.length -> printUsage(); return
        File tmpDir = new File(System.getProperty("java.io.tmpdir"));
        ZoneInfoCompiler.main(new String[] { "-src", tmpDir.getAbsolutePath() });
    }

    @Test(expected = Exception.class)
    public void testMain_unknownOptionTreatedAsSourceFile_fileNotFound_throws() throws Exception {
        // branch else -> break ออกจาก option loop ทันทีที่ argument แรกไม่ match option ใด ๆ
        // จากนั้นถือเป็นชื่อไฟล์ source ซึ่งไม่มีอยู่จริง -> FileNotFoundException(IOException)
        ZoneInfoCompiler.main(new String[] { "-not_a_real_option_or_file_" + System.nanoTime() });
    }

    @Test
    public void testMain_verboseFlagWithValidEmptySourceFile_setsVerboseAndCompiles() throws Exception {
        File src = createTempFile("# just a comment, no zones\n");
        ZoneInfoCompiler.main(new String[] { "-verbose", src.getAbsolutePath() });
        assertTrue(ZoneInfoCompiler.verbose());
    }
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testVerbose_defaultFalse / testVerbose_afterSetTrue | ค่า default ของ `cVerbose` และการ set เป็น true |
| testParseYear_minimum/maximum/only/numeric/invalidString | ทุก branch ของ `parseYear`: minimum/min, maximum/max, only, ตัวเลข, exception เมื่อ parse ไม่ได้ |
| testParseMonth_validNames / testParseDayOfWeek_validNames | การแปลงชื่อเดือน/วันเป็นตัวเลข |
| testParseOptional_dashReturnsNull / otherReturnsSame | if/else ของ `parseOptional` |
| testParseTime_positive/negative/malformed/empty | branch `startsWith("-")`, การคำนวณ millis, exception เมื่อ parse ไม่สำเร็จ |
| testParseZoneChar_standard/utc/wallAndDefault | ทุก case ของ switch (`s/S`, `u/U/g/G/z/Z`, `w/W`/default) |
| testGetStartOfYear_singletonAndDefaults | branch `cStartOfYear == null` (lazy init) + ค่า default ฟิลด์ |
| testGetLenientISOChronology_singleton | branch `cLenientISO == null` (lazy init) |
| testWriteZoneInfoMap_emptyMap / withEntries | loop สร้าง string pool, branch `!idToIndex.containsKey(id)` ทั้ง key/value, การเขียนข้อมูล |
| testTest_idMismatch_returnsTrueImmediately | branch `!id.equals(tz.getID())` return true ทันที |
| testTest_fixedZone_noTransitions_returnsTrue | branch while-loop break ทันที (`next == millis`) |
| testParseDataFile_onlyBlankAndCommentLines | branch `trimmed.length()==0 \|\| charAt(0)=='#'` → continue |
| testParseDataFile_ZoneContinuationLinkAndUnknownLine | Zone continuation (`isWhitespace` + chain), Link, inline comment stripping, Unknown line branch |
| testParseDataFile_LinkToMissingZone_notAdded | branch `tz == null` ใน loop link (pass 0/1) |
| testParseDataFile_RuleSet_sameNameAddRule_noException | branch `rs != null` → `addRule` (ชื่อตรงกัน) |
| testParseDataFile_RuleToYearLessThanFromYear_throws | branch `iToYear < iFromYear` throw exception ใน `Rule` |
| testParseDataFile_UntilDay_* (numeric/last/>=/<=/invalid) | ทุก branch parsing วันใน `DateTimeOfYear` (`try parseInt`, `last`, `>=`, `<=`, invalid → exception) |
| testParseDataFile_UntilTime_2400_* | branch `str.equals("24:00")` ทั้งกรณี `day==-1` และ `day!=-1` |
| testCompile_nullSourcesAndOutputDir_emptyMap | branch `sources != null` false, `outputDir != null` false |
| testCompile_outputDirIsFile_throwsIOException | branch `!outputDir.isDirectory()` → throw |
| testCompile_outputDirNotExists_isCreatedAndZoneInfoMapWritten | branch `!outputDir.exists()` → `mkdirs()`, การเขียนไฟล์ ZoneInfoMap |
| testCompile_sourceFileNotExist_throws | branch `sources != null` true + FileReader exception |
| testMain_noArgs_printsUsageAndReturns | branch `args.length == 0` |
| testMain_helpOption_printsUsageAndReturns | branch `"-?".equals(args[i])` |
| testMain_srcOptionMissingArgument / dstOptionMissingArgument | branch `catch (IndexOutOfBoundsException e)` |
| testMain_onlyOptionsNoSourceFiles_printsUsageAndReturns | branch `i >= args.length` หลัง parse options |
| testMain_unknownOptionTreatedAsSourceFile_fileNotFound_throws | branch `else { break; }` ของ option loop |
| testMain_verboseFlagWithValidEmptySourceFile_setsVerboseAndCompiles | branch `"-verbose".equals(args[i])`, `cVerbose.set(verbose)` |

**หมายเหตุ/ข้อจำกัดที่ระบุไว้ในคอมเมนต์โค้ด:**
- nested class `Rule`, `RuleSet`, `Zone` เป็น `private static` เข้าถึงไม่ได้ตรง ๆ จึงทดสอบผ่าน `parseDataFile`/`compile` แทน
- branch mismatch-name exception ใน `RuleSet.addRule` ไม่สามารถทริกเกอร์ได้จาก public API เนื่องจาก `iRuleSets.get(r.iName)` การันตีชื่อตรงกันเสมอ จึงไม่ได้เขียนเทสสำหรับ branch นี้
- ผลลัพธ์ที่แท้จริงของ `test()` ในกรณี Zone ที่มี cutover ขึ้นกับ internal logic ของ `DateTimeZoneBuilder` ซึ่งไม่ได้ตรวจสอบโดยตรงในชุดเทสนี้ — ได้ระบุไว้ในคอมเมนต์
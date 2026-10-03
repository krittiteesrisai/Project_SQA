package org.joda.time.tz;

import org.joda.time.DateTimeZone;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import static org.junit.Assert.*;

public class ZoneInfoCompilerTest {

    private File tempDir;

    @Before
    public void setUp() throws Exception {
        tempDir = new File(System.getProperty("java.io.tmpdir"), "zic_test_" + System.currentTimeMillis());
        if (!tempDir.exists()) {
            tempDir.mkdirs();
        }
    }

    @After
    public void tearDown() throws Exception {
        if (tempDir != null && tempDir.exists()) {
            deleteRecursive(tempDir);
        }
    }

    private void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File child : file.listFiles()) {
                deleteRecursive(child);
            }
        }
        file.delete();
    }

    // -------------------------------------------------------------------------
    // 1. Tests for parsing methods (parseYear, parseMonth, parseDayOfWeek, parseTime, parseZoneChar, parseOptional)
    // -------------------------------------------------------------------------

    @Test
    public void testParseYear() {
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("min", 2000));
        assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("MINIMUM", 2000));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("max", 2000));
        assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("MAXIMUM", 2000));
        assertEquals(1999, ZoneInfoCompiler.parseYear("only", 1999));
        assertEquals(2023, ZoneInfoCompiler.parseYear("2023", 2000));
        assertEquals(-50, ZoneInfoCompiler.parseYear("-50", 2000));
    }

    @Test(expected = NumberFormatException.class)
    public void testParseYearInvalid() {
        ZoneInfoCompiler.parseYear("invalid_year", 2000);
    }

    @Test
    public void testParseMonth() {
        assertEquals(1, ZoneInfoCompiler.parseMonth("Jan"));
        assertEquals(1, ZoneInfoCompiler.parseMonth("January"));
        assertEquals(12, ZoneInfoCompiler.parseMonth("Dec"));
        assertEquals(12, ZoneInfoCompiler.parseMonth("December"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseMonthInvalid() {
        ZoneInfoCompiler.parseMonth("InvalidMonth");
    }

    @Test
    public void testParseDayOfWeek() {
        assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("Mon"));
        assertEquals(1, ZoneInfoCompiler.parseDayOfWeek("Monday"));
        assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("Sun"));
        assertEquals(7, ZoneInfoCompiler.parseDayOfWeek("Sunday"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDayOfWeekInvalid() {
        ZoneInfoCompiler.parseDayOfWeek("InvalidDay");
    }

    @Test
    public void testParseOptional() {
        assertNull(ZoneInfoCompiler.parseOptional("-"));
        assertEquals("EST", ZoneInfoCompiler.parseOptional("EST"));
        assertEquals("", ZoneInfoCompiler.parseOptional(""));
    }

    @Test
    public void testParseTime() {
        assertEquals(0, ZoneInfoCompiler.parseTime("0"));
        assertEquals(0, ZoneInfoCompiler.parseTime("00:00"));
        assertEquals(3600000, ZoneInfoCompiler.parseTime("1:00"));
        assertEquals(3661000, ZoneInfoCompiler.parseTime("1:01:01"));
        assertEquals(-3600000, ZoneInfoCompiler.parseTime("-1:00"));
        assertEquals(-7200000, ZoneInfoCompiler.parseTime("-02:00:00"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseTimeInvalid() {
        ZoneInfoCompiler.parseTime("invalid:time");
    }

    @Test
    public void testParseZoneChar() {
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('s'));
        assertEquals('s', ZoneInfoCompiler.parseZoneChar('S'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('u'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('U'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('g'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('G'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('z'));
        assertEquals('u', ZoneInfoCompiler.parseZoneChar('Z'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('w'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('W'));
        assertEquals('w', ZoneInfoCompiler.parseZoneChar('a')); // default branch
    }

    // -------------------------------------------------------------------------
    // 2. Tests for DateTimeOfYear parsing and edge cases
    // -------------------------------------------------------------------------

    @Test
    public void testDateTimeOfYearParsing() {
        // Default constructor
        ZoneInfoCompiler.DateTimeOfYear dtDefault = new ZoneInfoCompiler.DateTimeOfYear();
        assertEquals(1, dtDefault.iMonthOfYear);
        assertEquals(1, dtDefault.iDayOfMonth);
        assertEquals(0, dtDefault.iDayOfWeek);
        assertFalse(dtDefault.iAdvanceDayOfWeek);
        assertEquals(0, dtDefault.iMillisOfDay);
        assertEquals('w', dtDefault.iZoneChar);
        assertNotNull(dtDefault.toString());

        // 'last' format: e.g., "Oct lastSun 2:00s"
        StringTokenizer st1 = new StringTokenizer("Oct lastSun 2:00s");
        ZoneInfoCompiler.DateTimeOfYear dt1 = new ZoneInfoCompiler.DateTimeOfYear(st1);
        assertEquals(10, dt1.iMonthOfYear);
        assertEquals(-1, dt1.iDayOfMonth);
        assertEquals(7, dt1.iDayOfWeek);
        assertEquals('s', dt1.iZoneChar);
        assertEquals(7200000, dt1.iMillisOfDay);

        // '>=' format: e.g., "Mar Sun>=8 2:00u"
        StringTokenizer st2 = new StringTokenizer("Mar Sun>=8 2:00u");
        ZoneInfoCompiler.DateTimeOfYear dt2 = new ZoneInfoCompiler.DateTimeOfYear(st2);
        assertEquals(3, dt2.iMonthOfYear);
        assertEquals(8, dt2.iDayOfMonth);
        assertEquals(7, dt2.iDayOfWeek);
        assertTrue(dt2.iAdvanceDayOfWeek);
        assertEquals('u', dt2.iZoneChar);

        // '<=' format: e.g., "Nov Sun<=7 2:00"
        StringTokenizer st3 = new StringTokenizer("Nov Sun<=7 2:00");
        ZoneInfoCompiler.DateTimeOfYear dt3 = new ZoneInfoCompiler.DateTimeOfYear(st3);
        assertEquals(11, dt3.iMonthOfYear);
        assertEquals(7, dt3.iDayOfMonth);
        assertEquals(7, dt3.iDayOfWeek);
        assertFalse(dt3.iAdvanceDayOfWeek);

        // Specific day format: e.g., "Jan 15 0:00"
        StringTokenizer st4 = new StringTokenizer("Jan 15 0:00");
        ZoneInfoCompiler.DateTimeOfYear dt4 = new ZoneInfoCompiler.DateTimeOfYear(st4);
        assertEquals(1, dt4.iMonthOfYear);
        assertEquals(15, dt4.iDayOfMonth);
        assertEquals(0, dt4.iDayOfWeek);

        // 24:00 rollover with lastDay
        StringTokenizer st5 = new StringTokenizer("Feb lastSun 24:00");
        ZoneInfoCompiler.DateTimeOfYear dt5 = new ZoneInfoCompiler.DateTimeOfYear(st5);
        assertEquals(3, dt5.iMonthOfYear);
        assertEquals(1, dt5.iDayOfMonth);

        // 24:00 rollover with specific day
        StringTokenizer st6 = new StringTokenizer("Jan 31 24:00");
        ZoneInfoCompiler.DateTimeOfYear dt6 = new ZoneInfoCompiler.DateTimeOfYear(st6);
        assertEquals(2, dt6.iMonthOfYear);
        assertEquals(1, dt6.iDayOfMonth);
        assertTrue(dt6.iAdvanceDayOfWeek);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDateTimeOfYearInvalidDayFormat() {
        StringTokenizer st = new StringTokenizer("Jan InvalidDayFormat 0:00");
        new ZoneInfoCompiler.DateTimeOfYear(st);
    }

    // -------------------------------------------------------------------------
    // 3. Tests for Data File Parsing, Rule, RuleSet, and Zone compilation
    // -------------------------------------------------------------------------

    @Test
    public void testParseDataFileAndCompileSuccess() throws Exception {
        String tzData =
                "# Olson TZ Data Sample\n" +
                "Rule US 1918 1919 - Mar lastSun 2:00 1:00 D\n" +
                "Rule US 1918 1919 - Oct lastSun 2:00 0 S\n" +
                "Rule US 1942 only - Feb 9 2:00 1:00 W # War time\n" +
                "Rule US 1945 only - Aug 14 19:00u 1:00 P # Peace time\n" +
                "Rule US 1945 only - Sep 30 2:00 0 S\n" +
                "\n" +
                "Zone America/Sample_Zone -5:00 US E%sT 1945 Sep 30 2:00\n" +
                " -5:00 - EST\n" +
                "\n" +
                "Zone Slash/Zone -6:00 - CST/CDT\n" +
                "Zone Fixed/Zone 3:00 1:00 FST\n" +
                "\n" +
                "Link America/Sample_Zone America/Sample_Link\n" +
                "Link NonExistent/Zone Broken_Link\n"; // Test broken link path

        File sourceFile = new File(tempDir, "sample.tz");
        FileWriter writer = new FileWriter(sourceFile);
        writer.write(tzData);
        writer.close();

        File outputDir = new File(tempDir, "compiled_tz");

        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        Map<String, DateTimeZone> zones = compiler.compile(outputDir, new File[]{sourceFile});

        assertNotNull(zones);
        assertTrue(zones.containsKey("America/Sample_Zone"));
        assertTrue(zones.containsKey("America/Sample_Link"));
        assertTrue(zones.containsKey("Slash/Zone"));
        assertTrue(zones.containsKey("Fixed/Zone"));
        assertFalse(zones.containsKey("Broken_Link"));

        // Verify output files were created
        assertTrue(new File(outputDir, "ZoneInfoMap").exists());
        assertTrue(new File(outputDir, "America/Sample_Zone").exists());
    }

    @Test
    public void testCompileWithNullSourcesAndNullOutput() throws Exception {
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        Map<String, DateTimeZone> map = compiler.compile(null, null);
        assertNotNull(map);
        assertTrue(map.isEmpty());
    }

    @Test(expected = IOException.class)
    public void testCompileOutputNotADirectory() throws Exception {
        File fileOutput = new File(tempDir, "not_a_dir.txt");
        fileOutput.createNewFile();

        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.compile(fileOutput, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDataFileRuleYearOrderInvalid() throws IOException {
        String data = "Rule InvalidYears 2020 2010 - Mar lastSun 2:00 1:00 D\n";
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new StringReader(data)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseDataFileRuleSetMismatch() throws IOException {
        String data =
                "Rule R1 2000 2005 - Mar lastSun 2:00 1:00 D\n" +
                "Rule R2 2000 2005 - Oct lastSun 2:00 0 S\n";
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new StringReader(data)));
        // Attempt manual rule add mismatch trigger directly through Zone logic
        String zoneData = "Zone Z1 0:00 R1 GMT\n";
        compiler.parseDataFile(new BufferedReader(new StringReader(zoneData)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZoneMissingRuleSetThrowsException() throws Exception {
        String data = "Zone MissingRuleZone 0:00 NoSuchRule GMT\n";
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new StringReader(data)));
        compiler.compile(null, null);
    }

    @Test
    public void testParseDataFileUnknownLineAndComments() throws IOException {
        String data =
                "# Full line comment\n" +
                "   # Indented comment\n" +
                "UnknownCommand with arguments\n" +
                "\n"; // empty line
        ZoneInfoCompiler compiler = new ZoneInfoCompiler();
        compiler.parseDataFile(new BufferedReader(new StringReader(data)));
    }

    // -------------------------------------------------------------------------
    // 4. Tests for writeZoneInfoMap
    // -------------------------------------------------------------------------

    @Test
    public void testWriteZoneInfoMap() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(baos);

        Map<String, DateTimeZone> map = new HashMap<String, DateTimeZone>();
        map.put("UTC", DateTimeZone.UTC);
        map.put("GMT", DateTimeZone.UTC);

        ZoneInfoCompiler.writeZoneInfoMap(dout, map);
        dout.flush();

        byte[] bytes = baos.toByteArray();
        assertTrue(bytes.length > 0);
    }

    // -------------------------------------------------------------------------
    // 5. Tests for test(String, DateTimeZone) validation method
    // -------------------------------------------------------------------------

    @Test
    public void testTestZoneValidation() {
        DateTimeZone utc = DateTimeZone.UTC;
        // Non-matching id should pass immediately
        assertTrue(ZoneInfoCompiler.test("OTHER_ID", utc));
        // Matching id should run transition checks
        assertTrue(ZoneInfoCompiler.test("UTC", utc));
    }

    // -------------------------------------------------------------------------
    // 6. Tests for main(String[]) entry point and command-line arguments
    // -------------------------------------------------------------------------

    @Test
    public void testMainNoArgs() throws Exception {
        ZoneInfoCompiler.main(new String[0]);
    }

    @Test
    public void testMainHelpArg() throws Exception {
        ZoneInfoCompiler.main(new String[]{"-?"});
    }

    @Test
    public void testMainMissingArgValue() throws Exception {
        ZoneInfoCompiler.main(new String[]{"-src"});
        ZoneInfoCompiler.main(new String[]{"-dst"});
    }

    @Test
    public void testMainNoFilesSpecified() throws Exception {
        ZoneInfoCompiler.main(new String[]{"-verbose", "-src", tempDir.getAbsolutePath()});
    }

    @Test
    public void testMainExecutionFull() throws Exception {
        File srcDir = new File(tempDir, "src");
        srcDir.mkdirs();
        File dstDir = new File(tempDir, "dst");
        dstDir.mkdirs();

        String tzData =
                "Zone Simple/Zone 0:00 - UTC\n";

        File file = new File(srcDir, "tz_file.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(tzData);
        fw.close();

        String[] args = new String[]{
                "-verbose",
                "-src", srcDir.getAbsolutePath(),
                "-dst", dstDir.getAbsolutePath(),
                "tz_file.txt"
        };

        ZoneInfoCompiler.main(args);
        assertTrue(ZoneInfoCompiler.verbose());
        assertTrue(new File(dstDir, "Simple/Zone").exists());
        assertTrue(new File(dstDir, "ZoneInfoMap").exists());
    }

    // -------------------------------------------------------------------------
    // 7. Tests for singletons and helpers
    // -------------------------------------------------------------------------

    @Test
    public void testGetStartOfYearAndLenientISO() {
        assertNotNull(ZoneInfoCompiler.getStartOfYear());
        assertSame(ZoneInfoCompiler.getStartOfYear(), ZoneInfoCompiler.getStartOfYear());
        assertNotNull(ZoneInfoCompiler.getLenientISOChronology());
        assertSame(ZoneInfoCompiler.getLenientISOChronology(), ZoneInfoCompiler.getLenientISOChronology());
    }
}
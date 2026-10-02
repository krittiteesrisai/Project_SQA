package org.apache.commons.cli.test;

import static org.junit.Assert.*;

import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.AmbiguousOptionException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class DefaultParserTest
{
    private DefaultParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new DefaultParser();
        options = new Options();
    }

    // ---------- boundary: null / empty arguments ----------

    @Test
    public void testParseNullArguments() throws Exception
    {
        CommandLine cmd = parser.parse(options, null);
        assertEquals(0, cmd.getArgList().size());
    }

    @Test
    public void testParseEmptyArguments() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[0]);
        assertEquals(0, cmd.getArgList().size());
    }

    // ---------- "--" -> skipParsing ----------

    @Test
    public void testDoubleDashStopsParsing() throws Exception
    {
        options.addOption("a", false, "a option");
        String[] args = {"--", "-a", "foo"};
        CommandLine cmd = parser.parse(options, args);
        assertFalse(cmd.hasOption("a"));
        assertTrue(cmd.getArgList().contains("-a"));
        assertTrue(cmd.getArgList().contains("foo"));
    }

    // ---------- lone "-" token ----------

    @Test
    public void testLoneDashIsArgument() throws Exception
    {
        String[] args = {"-"};
        CommandLine cmd = parser.parse(options, args);
        assertEquals("-", cmd.getArgs()[0]);
    }

    // ---------- simple short option ----------

    @Test
    public void testShortOptionNoArg() throws Exception
    {
        options.addOption("a", false, "a option");
        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testShortOptionUnknown() throws Exception
    {
        parser.parse(options, new String[]{"-x"});
    }

    // ---------- short option with arg (separate token) ----------

    @Test
    public void testShortOptionArgSeparateToken() throws Exception
    {
        options.addOption("a", true, "a option");
        CommandLine cmd = parser.parse(options, new String[]{"-a", "value"});
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test(expected = MissingArgumentException.class)
    public void testShortOptionMissingArgAtEnd() throws Exception
    {
        options.addOption("a", true, "a option");
        parser.parse(options, new String[]{"-a"});
    }

    @Test(expected = MissingArgumentException.class)
    public void testCheckRequiredArgsWhenNextOptionAppears() throws Exception
    {
        options.addOption("a", true, "a option");
        options.addOption("b", false, "b option");
        // "-a" ต้องการ argument แต่ตามด้วย "-b" ทันที -> checkRequiredArgs() ใน handleOption ต้องโยน exception
        parser.parse(options, new String[]{"-a", "-b"});
    }

    // ---------- short option attached value (-avalue) via handleConcatenatedOptions ----------

    @Test
    public void testShortOptionAttachedValueViaConcatenation() throws Exception
    {
        options.addOption("a", true, "a option");
        CommandLine cmd = parser.parse(options, new String[]{"-avalue"});
        assertEquals("value", cmd.getOptionValue("a"));
    }

    // ---------- short option with "=" ----------

    @Test
    public void testShortOptionEqualsWithArg() throws Exception
    {
        options.addOption("a", true, "a option");
        CommandLine cmd = parser.parse(options, new String[]{"-a=value"});
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testShortOptionEqualsWithoutArgSupport() throws Exception
    {
        options.addOption("a", false, "a option");
        parser.parse(options, new String[]{"-a=value"});
    }

    // ---------- concatenated short options (-abc), no trailing arg branch ----------

    @Test
    public void testConcatenatedShortOptionsAllNoArg() throws Exception
    {
        options.addOption("a", false, "a");
        options.addOption("b", false, "b");
        options.addOption("c", false, "c");
        CommandLine cmd = parser.parse(options, new String[]{"-abc"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertTrue(cmd.hasOption("c"));
    }

    @Test
    public void testConcatenatedOptionsLastArgOptionNoTrailChars() throws Exception
    {
        // -ba : b ไม่มี arg, a มี arg, ไม่มีอักขระเหลือหลัง a -> branch "token.length()!=i+1" เป็น false, ไม่ break
        options.addOption("b", false, "b option");
        options.addOption("a", true, "a option");
        CommandLine cmd = parser.parse(options, new String[]{"-ba", "value"});
        assertTrue(cmd.hasOption("b"));
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testConcatenatedOptionsUnknownCharThrows() throws Exception
    {
        options.addOption("a", false, "a");
        parser.parse(options, new String[]{"-ax"});
    }

    // ---------- long options ----------

    @Test
    public void testLongOptionWithoutEqual() throws Exception
    {
        options.addOption("a", "alpha", false, "alpha option");
        CommandLine cmd = parser.parse(options, new String[]{"--alpha"});
        assertTrue(cmd.hasOption("alpha"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testLongOptionUnknown() throws Exception
    {
        parser.parse(options, new String[]{"--zzz"});
    }

    @Test
    public void testLongOptionWithEqualAcceptsArg() throws Exception
    {
        options.addOption("a", "alpha", true, "alpha with arg");
        CommandLine cmd = parser.parse(options, new String[]{"--alpha=val"});
        assertEquals("val", cmd.getOptionValue("alpha"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testLongOptionWithEqualNoArgSupport() throws Exception
    {
        options.addOption("a", "alpha", false, "alpha no arg");
        parser.parse(options, new String[]{"--alpha=val"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testAmbiguousLongOptionWithoutEqual() throws Exception
    {
        options.addOption(null, "alpha1", false, "desc1");
        options.addOption(null, "alpha2", false, "desc2");
        parser.parse(options, new String[]{"--al"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testAmbiguousLongOptionWithEqual() throws Exception
    {
        options.addOption(null, "alpha1", false, "desc1");
        options.addOption(null, "alpha2", false, "desc2");
        parser.parse(options, new String[]{"--al=v"});
    }

    // ---------- long-prefix option (-Xmx512m style) ----------

    @Test
    public void testLongPrefixOptionAcceptsArg() throws Exception
    {
        options.addOption("x", "Xmx", true, "xmx option");
        CommandLine cmd = parser.parse(options, new String[]{"-Xmx512m"});
        assertEquals("512m", cmd.getOptionValue("Xmx"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testLongPrefixOptionNoArgFallsToUnknown() throws Exception
    {
        // getLongPrefix เจอ "Xmx" แต่ acceptsArg()=false -> ตกไป isJavaProperty (false) -> handleConcatenatedOptions -> unknown
        options.addOption("x", "Xmx", false, "xmx no-arg");
        parser.parse(options, new String[]{"-Xmx512m"});
    }

    // ---------- java-property style option (-Dkey=value / -Dflag) ----------

    @Test
    public void testJavaPropertyStyleWithEquals() throws Exception
    {
        Option d = new Option("D", true, "define");
        d.setArgs(2);
        options.addOption(d);
        CommandLine cmd = parser.parse(options, new String[]{"-Dkey=value"});
        assertArrayEquals(new String[]{"key", "value"}, cmd.getOptionValues("D"));
    }

    @Test
    public void testJavaPropertyStyleWithoutEquals() throws Exception
    {
        Option d = new Option("D", true, "define");
        d.setArgs(2);
        options.addOption(d);
        CommandLine cmd = parser.parse(options, new String[]{"-Dflag"});
        assertEquals("flag", cmd.getOptionValue("D"));
    }

    // ---------- short-option "=" with single-char opt ----------

    @Test
    public void testShortEqualsSingleCharAcceptsArg() throws Exception
    {
        options.addOption("a", true, "a option");
        CommandLine cmd = parser.parse(options, new String[]{"-a=v"});
        assertEquals("v", cmd.getOptionValue("a"));
    }

    // ---------- unknown token (plain arg) ----------

    @Test
    public void testPlainArgumentAddedToArgs() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[]{"foo"});
        assertEquals("foo", cmd.getArgs()[0]);
    }

    // ---------- stopAtNonOption ----------

    @Test
    public void testStopAtNonOptionTrueSkipsRemaining() throws Exception
    {
        options.addOption("a", false, "a option");
        String[] args = {"-x", "-a"};
        CommandLine cmd = parser.parse(options, args, true);
        assertTrue(cmd.getArgList().contains("-x"));
        assertTrue(cmd.getArgList().contains("-a"));
        assertFalse(cmd.hasOption("a"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testStopAtNonOptionFalseThrows() throws Exception
    {
        parser.parse(options, new String[]{"-x"}, false);
    }

    // ---------- isArgument / isNegativeNumber / isOption interplay ----------

    @Test
    public void testNegativeNumberConsumedAsOptionArgument() throws Exception
    {
        // "5" ถูกกำหนดเป็น short option ด้วย เพื่อบังคับให้ isOption("-5")=true
        // และตรวจว่า isNegativeNumber ทำให้ isArgument กลับเป็น true (ค่าตัวเลขลบ)
        options.addOption("a", true, "a option");
        options.addOption("5", false, "five option");
        CommandLine cmd = parser.parse(options, new String[]{"-a", "-5"});
        assertEquals("-5", cmd.getOptionValue("a"));
        assertFalse(cmd.hasOption("5"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testNegativeNumberAloneWithoutPrecedingOptionIsUnknown() throws Exception
    {
        // ไม่มี currentOption ก่อนหน้า -> "-5" ถูกตีความเป็น short option ที่ไม่รู้จัก
        parser.parse(options, new String[]{"-5"});
    }

    // ---------- handleProperties ----------

    @Test
    public void testHandlePropertiesNullDoesNothing() throws Exception
    {
        CommandLine cmd = parser.parse(options, new String[0], (Properties) null);
        assertEquals(0, cmd.getArgList().size());
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testHandlePropertiesUnrecognizedOption() throws Exception
    {
        Properties props = new Properties();
        props.setProperty("z", "true");
        parser.parse(options, new String[0], props);
    }

    @Test
    public void testHandlePropertiesSkippedWhenAlreadySetByArgs() throws Exception
    {
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLine cmd = parser.parse(options, new String[]{"-a"}, props);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testHandlePropertiesSkippedWhenGroupAlreadySelected() throws Exception
    {
        OptionGroup group = new OptionGroup();
        Option a = new Option("a", false, "a option");
        Option b = new Option("b", false, "b option");
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);

        Properties props = new Properties();
        props.setProperty("b", "true");

        CommandLine cmd = parser.parse(options, new String[]{"-a"}, props);
        assertTrue(cmd.hasOption("a"));
        assertFalse(cmd.hasOption("b"));
    }

    @Test
    public void testHandlePropertiesHasArgAddsValue() throws Exception
    {
        options.addOption("a", true, "a option");
        Properties props = new Properties();
        props.setProperty("a", "value1");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertEquals("value1", cmd.getOptionValue("a"));
    }

    // หมายเหตุ: branch "opt.getValues() != null && length>0" (ข้ามการเพิ่มค่าซ้ำ) ใน handleProperties
    // ไม่สามารถ trigger ได้ง่ายผ่าน public API เดียว เพราะ Option ต้นฉบับ (ไม่ใช่ clone ใน cmd) จะไม่มีค่าเดิม
    // ในสถานการณ์ปกติของการเรียก parse ครั้งเดียว จึงไม่ได้เขียนเทสสำหรับ branch นี้ตามข้อกำหนดห้ามเดา behavior

    @Test
    public void testHandlePropertiesNoArgTrueValueAdds() throws Exception
    {
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testHandlePropertiesNoArgYesValueAdds() throws Exception
    {
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "yes");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testHandlePropertiesNoArgOneValueAdds() throws Exception
    {
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "1");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testHandlePropertiesNoArgOtherValueSkipped() throws Exception
    {
        options.addOption("a", false, "a option");
        Properties props = new Properties();
        props.setProperty("a", "no");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertFalse(cmd.hasOption("a"));
    }

    // ---------- required options / groups ----------

    @Test(expected = MissingOptionException.class)
    public void testRequiredOptionMissingThrows() throws Exception
    {
        Option a = new Option("a", false, "a option");
        a.setRequired(true);
        options.addOption(a);
        parser.parse(options, new String[0]);
    }

    @Test
    public void testRequiredOptionSatisfied() throws Exception
    {
        Option a = new Option("a", false, "a option");
        a.setRequired(true);
        options.addOption(a);
        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    @Test(expected = MissingOptionException.class)
    public void testRequiredOptionGroupMissingThrows() throws Exception
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option a = new Option("a", false, "a");
        Option b = new Option("b", false, "b");
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);
        parser.parse(options, new String[0]);
    }

    @Test
    public void testRequiredOptionGroupSatisfied() throws Exception
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option a = new Option("a", false, "a");
        Option b = new Option("b", false, "b");
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);
        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    @Test(expected = AlreadySelectedException.class)
    public void testAlreadySelectedOptionGroupThrows() throws Exception
    {
        OptionGroup group = new OptionGroup();
        Option a = new Option("a", false, "a");
        Option b = new Option("b", false, "b");
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);
        parser.parse(options, new String[]{"-a", "-b"});
    }
}

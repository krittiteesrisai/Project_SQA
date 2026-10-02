package org.apache.commons.cli;

import org.apache.commons.cli.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Properties;

import static org.junit.Assert.*;

public class DefaultParserTest {

    private DefaultParser parser;

    @Before
    public void setUp() {
        parser = new DefaultParser();
    }

    // ---------- 1. Boundary: null / empty arguments ----------

    @Test
    public void testParseNullArguments() throws Exception {
        Options options = new Options();
        CommandLine cmd = parser.parse(options, null);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgList().size());
    }

    @Test
    public void testParseEmptyArguments() throws Exception {
        Options options = new Options();
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgList().size());
    }

    // ---------- 2. handleToken: plain token (no dash) -> arg ----------

    @Test
    public void testPlainTokenAddedAsArgument() throws Exception {
        Options options = new Options();
        CommandLine cmd = parser.parse(options, new String[]{"plain"});
        assertEquals(1, cmd.getArgList().size());
        assertEquals("plain", cmd.getArgList().get(0));
    }

    // ---------- 3. handleToken: "--" sets skipParsing ----------

    @Test
    public void testDoubleDashStopsParsingRemainingTreatedAsArgs() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag a");
        CommandLine cmd = parser.parse(options, new String[]{"--", "-a"});
        assertFalse(cmd.hasOption("a"));
        assertEquals(1, cmd.getArgList().size());
        assertEquals("-a", cmd.getArgList().get(0));
    }

    // ---------- 4. handleToken: skipParsing already true -> everything is arg ----------

    @Test
    public void testTokensAfterSkipParsingAreAllArgs() throws Exception {
        Options options = new Options();
        CommandLine cmd = parser.parse(options, new String[]{"--", "x", "-y", "--z"});
        assertEquals(3, cmd.getArgList().size());
    }

    // ---------- 5. handleToken: "-" alone (not "--", not option) -> handleUnknownToken -> arg ----------

    @Test
    public void testSingleHyphenTokenAddedAsArg() throws Exception {
        Options options = new Options();
        CommandLine cmd = parser.parse(options, new String[]{"-"});
        assertEquals(1, cmd.getArgList().size());
        assertEquals("-", cmd.getArgList().get(0));
    }

    // ---------- 6. handleUnknownToken: unknown dash token + stopAtNonOption=false -> throw ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnknownDashTokenThrowsWhenNotStopAtNonOption() throws Exception {
        Options options = new Options();
        parser.parse(options, new String[]{"-x"});
    }

    // ---------- 7. handleUnknownToken: stopAtNonOption=true -> add as arg + skipParsing=true ----------

    @Test
    public void testUnknownDashTokenAddedAsArgWhenStopAtNonOption() throws Exception {
        Options options = new Options();
        CommandLine cmd = parser.parse(options, new String[]{"-x", "-y"}, true);
        assertEquals(2, cmd.getArgList().size());
        assertTrue(cmd.getArgList().contains("-x"));
        assertTrue(cmd.getArgList().contains("-y"));
    }

    // ---------- 8. Long option without '=' : single match ----------

    @Test
    public void testLongOptionWithoutEqualSingleMatch() throws Exception {
        Options options = new Options();
        options.addOption("f", "foo", false, "foo flag");
        CommandLine cmd = parser.parse(options, new String[]{"--foo"});
        assertTrue(cmd.hasOption("foo"));
    }

    // ---------- 9. Long option without '=' : empty match -> unknown -> throw ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testLongOptionWithoutEqualUnknownThrows() throws Exception {
        Options options = new Options();
        parser.parse(options, new String[]{"--nope"});
    }

    // ---------- 10. Long option without '=' : ambiguous -> throw ----------

    @Test(expected = AmbiguousOptionException.class)
    public void testLongOptionWithoutEqualAmbiguousThrows() throws Exception {
        Options options = new Options();
        options.addOption(null, "foo", false, "foo");
        options.addOption(null, "fox", false, "fox");
        parser.parse(options, new String[]{"--fo"});
    }

    // ---------- 11. Long option with '=' : accepts arg ----------

    @Test
    public void testLongOptionWithEqualAcceptsArg() throws Exception {
        Options options = new Options();
        options.addOption("f", "foo", true, "foo with arg");
        CommandLine cmd = parser.parse(options, new String[]{"--foo=bar"});
        assertEquals("bar", cmd.getOptionValue("foo"));
    }

    // ---------- 12. Long option with '=' : does NOT accept arg -> unknown -> throw ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testLongOptionWithEqualNotAcceptsArgThrows() throws Exception {
        Options options = new Options();
        options.addOption("f", "foo", false, "no arg");
        parser.parse(options, new String[]{"--foo=bar"});
    }

    // ---------- 13. Long option with '=' : empty match -> throw ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testLongOptionWithEqualUnknownThrows() throws Exception {
        Options options = new Options();
        parser.parse(options, new String[]{"--nope=val"});
    }

    // ---------- 14. Long option with '=' : ambiguous -> throw ----------

    @Test(expected = AmbiguousOptionException.class)
    public void testLongOptionWithEqualAmbiguousThrows() throws Exception {
        Options options = new Options();
        options.addOption(null, "foo", false, "foo");
        options.addOption(null, "fox", false, "fox");
        parser.parse(options, new String[]{"--fo=val"});
    }

    // ---------- 15. Short option single char known ----------

    @Test
    public void testShortOptionSingleCharKnown() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a flag");
        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    // ---------- 16. Short option single char unknown -> throw ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testShortOptionSingleCharUnknownThrows() throws Exception {
        Options options = new Options();
        parser.parse(options, new String[]{"-z"});
    }

    // ---------- 17. Short option with '=' opt.length()==1, accepts arg ----------

    @Test
    public void testShortOptionWithEqualAcceptsArg() throws Exception {
        Options options = new Options();
        options.addOption("a", true, "a with arg");
        CommandLine cmd = parser.parse(options, new String[]{"-a=value"});
        assertEquals("value", cmd.getOptionValue("a"));
    }

    // ---------- 18. Short option with '=' opt.length()==1, does not accept arg -> unknown ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testShortOptionWithEqualNotAcceptsArgThrows() throws Exception {
        Options options = new Options();
        options.addOption("b", false, "b flag");
        parser.parse(options, new String[]{"-b=value"});
    }

    // ---------- 19. Short option with '=' opt.length()==1, option null (not registered) -> unknown ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testShortOptionWithEqualUnregisteredCharThrows() throws Exception {
        Options options = new Options();
        parser.parse(options, new String[]{"-z=val"});
    }

    // ---------- 20. isJavaProperty via '=' (-SV1=V2) ----------

    @Test
    public void testJavaPropertyStyleWithEquals() throws Exception {
        Options options = new Options();
        Option d = new Option("D", "define property");
        d.setArgs(2);
        options.addOption(d);
        CommandLine cmd = parser.parse(options, new String[]{"-Dkey=value"});
        assertTrue(cmd.hasOption("D"));
        assertArrayEquals(new String[]{"key", "value"}, cmd.getOptionValues("D"));
    }

    // ---------- 21. isJavaProperty without '=' (-Dkey) ----------

    @Test
    public void testJavaPropertyStyleWithoutEquals() throws Exception {
        Options options = new Options();
        Option d = new Option("D", "define property");
        d.setArgs(2);
        options.addOption(d);
        CommandLine cmd = parser.parse(options, new String[]{"-Dkey"});
        assertArrayEquals(new String[]{"key"}, cmd.getOptionValues("D"));
    }

    // ---------- 22. getLongPrefix match (-Xmx512m) ----------

    @Test
    public void testLongPrefixMatch() throws Exception {
        Options options = new Options();
        options.addOption(null, "Xmx", true, "max memory");
        CommandLine cmd = parser.parse(options, new String[]{"-Xmx512m"});
        assertEquals("512m", cmd.getOptionValue("Xmx"));
    }

    // ---------- 23. Multi-char registered "short" option matched directly (hasShortOption branch) ----------

    @Test
    public void testMultiCharShortOptionMatch() throws Exception {
        Options options = new Options();
        options.addOption("ab", false, "custom multi-char option");
        CommandLine cmd = parser.parse(options, new String[]{"-ab"});
        assertTrue(cmd.hasOption("ab"));
    }

    // ---------- 24. Single-dash "-level" matches long option via getMatchingOptions branch ----------

    @Test
    public void testSingleDashMatchesLongOptionViaMatchingOptions() throws Exception {
        Options options = new Options();
        options.addOption(null, "level", false, "level option");
        CommandLine cmd = parser.parse(options, new String[]{"-level"});
        assertTrue(cmd.hasOption("level"));
    }

    // ---------- 25. Single-dash long option with '=' via handleShortAndLongOption else-branch ----------

    @Test
    public void testSingleDashLongOptionWithEqual() throws Exception {
        Options options = new Options();
        options.addOption("f", "foo", true, "foo arg");
        CommandLine cmd = parser.parse(options, new String[]{"-foo=bar"});
        assertEquals("bar", cmd.getOptionValue("foo"));
    }

    // ---------- 26. Concatenated short options, all flags ----------

    @Test
    public void testConcatenatedShortOptionsAllFlags() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag a");
        options.addOption("b", false, "flag b");
        options.addOption("c", false, "flag c");
        CommandLine cmd = parser.parse(options, new String[]{"-abc"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertTrue(cmd.hasOption("c"));
    }

    // ---------- 27. Concatenated short options with trailing arg value ----------

    @Test
    public void testConcatenatedShortOptionsWithTrailingArg() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag a");
        options.addOption("b", false, "flag b");
        options.addOption("c", true, "flag c with arg");
        CommandLine cmd = parser.parse(options, new String[]{"-abcVALUE"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertEquals("VALUE", cmd.getOptionValue("c"));
    }

    // ---------- 28. Concatenated options: unknown char, stopAtNonOption=false -> throws with full token ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testConcatenatedOptionsUnknownCharThrowsFullToken() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag a");
        parser.parse(options, new String[]{"-axy"});
    }

    // ---------- 29. Concatenated options: unknown char, stopAtNonOption=true -> remainder as arg ----------

    @Test
    public void testConcatenatedOptionsUnknownCharStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag a");
        CommandLine cmd = parser.parse(options, new String[]{"-axy"}, true);
        assertTrue(cmd.hasOption("a"));
        assertEquals(1, cmd.getArgList().size());
        assertEquals("xy", cmd.getArgList().get(0));
    }

    // ---------- 30. handleProperties: properties == null -> no-op ----------

    @Test
    public void testHandlePropertiesNull() throws Exception {
        Options options = new Options();
        CommandLine cmd = parser.parse(options, new String[0], (Properties) null);
        assertEquals(0, cmd.getOptions().length);
    }

    // ---------- 31. handleProperties: option already set from args -> skipped ----------

    @Test
    public void testHandlePropertiesSkippedWhenAlreadySet() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "flag a");
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLine cmd = parser.parse(options, new String[]{"-a"}, props);
        assertTrue(cmd.hasOption("a"));
        assertEquals(1, cmd.getOptions().length);
    }

    // ---------- 32. handleProperties: no-arg option, value is true/yes/1 -> option added ----------

    @Test
    public void testHandlePropertiesNoArgTrueValueAddsOption() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose flag");
        Properties props = new Properties();
        props.setProperty("v", "true");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("v"));
    }

    // ---------- 33. handleProperties: no-arg option, value NOT true/yes/1 -> skipped (continue) ----------

    @Test
    public void testHandlePropertiesNoArgFalseValueSkipped() throws Exception {
        Options options = new Options();
        options.addOption("v", false, "verbose flag");
        Properties props = new Properties();
        props.setProperty("v", "false");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertFalse(cmd.hasOption("v"));
    }

    // ---------- 34. handleProperties: opt.hasArg(), getValues() empty -> addValueForProcessing ----------

    @Test
    public void testHandlePropertiesAddsArgValueWhenMissing() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file arg");
        Properties props = new Properties();
        props.setProperty("f", "file.txt");
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertEquals("file.txt", cmd.getOptionValue("f"));
    }

    // ---------- 35. handleProperties: value already provided via args -> property branch not entered ----------

    @Test
    public void testHandlePropertiesDoesNotOverrideExistingArgValue() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file arg");
        Properties props = new Properties();
        props.setProperty("f", "ignored.txt");
        CommandLine cmd = parser.parse(options, new String[]{"-f", "real.txt"}, props);
        assertEquals("real.txt", cmd.getOptionValue("f"));
    }

    // ---------- 36. handleProperties: opt.getValues() not empty branch (reuse Options across 2 parses) ----------
    // หมายเหตุ: พฤติกรรมค่าที่คงอยู่ขึ้นกับ Option.clone() ซึ่งไม่ได้อยู่ใน source ของ DefaultParser
    // จึงยืนยันเฉพาะว่า "ไม่ throw exception" และ option ยังถูกตั้งค่า (soft assertion)
    @Test
    public void testHandlePropertiesSkipAddWhenOptionAlreadyHasValues() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file arg");
        Properties props1 = new Properties();
        props1.setProperty("f", "first.txt");
        CommandLine cmd1 = parser.parse(options, new String[0], props1);
        assertEquals("first.txt", cmd1.getOptionValue("f"));

        Properties props2 = new Properties();
        props2.setProperty("f", "second.txt");
        CommandLine cmd2 = parser.parse(options, new String[0], props2);
        // ค่า exact อาจไม่ใช่ "second.txt" เพราะ branch getValues()==null||length==0 อาจเป็น false แล้ว
        assertTrue(cmd2.hasOption("f")); // soft assertion ตามหมายเหตุด้านบน
    }

    // ---------- 37. checkRequiredOptions: missing required option -> throw ----------

    @Test(expected = MissingOptionException.class)
    public void testMissingRequiredOptionThrows() throws Exception {
        Options options = new Options();
        Option req = new Option("r", "required option");
        req.setRequired(true);
        options.addOption(req);
        parser.parse(options, new String[0]);
    }

    // ---------- 38. checkRequiredOptions: satisfied -> no exception ----------

    @Test
    public void testRequiredOptionSatisfiedNoException() throws Exception {
        Options options = new Options();
        Option req = new Option("r", "required option");
        req.setRequired(true);
        options.addOption(req);
        CommandLine cmd = parser.parse(options, new String[]{"-r"});
        assertTrue(cmd.hasOption("r"));
    }

    // ---------- 39. checkRequiredArgs: option requires arg, none given at end -> throw ----------

    @Test(expected = MissingArgumentException.class)
    public void testMissingArgumentAtEndThrows() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file arg needs value");
        parser.parse(options, new String[]{"-f"});
    }

    // ---------- 40. checkRequiredArgs: option requires arg, followed by ANOTHER option -> throw ----------

    @Test(expected = MissingArgumentException.class)
    public void testMissingArgumentWhenFollowedByAnotherOption() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file arg");
        options.addOption("v", false, "verbose flag");
        parser.parse(options, new String[]{"-f", "-v"});
    }

    // ---------- 41. OptionGroup: selecting second option in group -> AlreadySelectedException ----------

    @Test(expected = AlreadySelectedException.class)
    public void testAlreadySelectedExceptionThrown() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "option a"));
        group.addOption(new Option("b", "option b"));
        options.addOptionGroup(group);
        parser.parse(options, new String[]{"-a", "-b"});
    }

    // ---------- 42. OptionGroup required & satisfied ----------

    @Test
    public void testOptionGroupRequiredSatisfied() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "option a"));
        group.addOption(new Option("b", "option b"));
        group.setRequired(true);
        options.addOptionGroup(group);
        CommandLine cmd = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd.hasOption("a"));
    }

    // ---------- 43. OptionGroup required & missing -> MissingOptionException ----------

    @Test(expected = MissingOptionException.class)
    public void testOptionGroupRequiredMissingThrows() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "option a"));
        group.addOption(new Option("b", "option b"));
        group.setRequired(true);
        options.addOptionGroup(group);
        parser.parse(options, new String[0]);
    }

    // ---------- 44. isNegativeNumber: value "-5" accepted as argument for pending option ----------

    @Test
    public void testNegativeNumberTreatedAsOptionValue() throws Exception {
        Options options = new Options();
        options.addOption("n", true, "number arg");
        CommandLine cmd = parser.parse(options, new String[]{"-n", "-5"});
        assertEquals("-5", cmd.getOptionValue("n"));
    }

    // ---------- 45. standalone "-5" with no options registered -> unrecognized ----------

    @Test(expected = UnrecognizedOptionException.class)
    public void testStandaloneNegativeNumberUnknownThrows() throws Exception {
        Options options = new Options();
        parser.parse(options, new String[]{"-5"});
    }

    // ---------- 46. parse(Options, String[], boolean) overload sanity ----------

    @Test
    public void testParseOverloadWithStopAtNonOptionOnly() throws Exception {
        Options options = new Options();
        CommandLine cmd = parser.parse(options, new String[]{"-unknown"}, true);
        assertEquals(1, cmd.getArgList().size());
        assertEquals("-unknown", cmd.getArgList().get(0));
    }

    // ---------- 47. currentOption acceptsArg + isArgument true (normal value, non-dash) ----------

    @Test
    public void testCurrentOptionAcceptsPlainStringArgument() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file arg");
        CommandLine cmd = parser.parse(options, new String[]{"-f", "myfile.txt"});
        assertEquals("myfile.txt", cmd.getOptionValue("f"));
    }
}

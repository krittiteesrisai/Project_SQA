# DefaultParserTest.java

หมายเหตุสำคัญก่อนโค้ด:
- คลาส `Options`, `Option`, `OptionGroup`, `CommandLine` และ exception ต่าง ๆ เป็นคลาสจริงจาก Apache Commons CLI ที่ต้องอยู่ใน classpath คู่กับ `DefaultParser` ที่ต้องการทดสอบ (ไม่ได้แนบซอร์สมาให้ แต่เป็น public API ที่มีสัญญาชัดเจนตาม Javadoc ของไลบรารี) จึงใช้ตาม public/package API ที่ทราบแน่ชัด
- บางจุดของซอร์ส (เช่น branch `opt.getValues() != null && length != 0` ใน `handleProperties`) ดูเหมือนจะ **unreachable** ในทางปฏิบัติเพราะถูกป้องกันด้วยเงื่อนไข `!cmd.hasOption(option)` ก่อนหน้า — จึงไม่ได้เขียนเทสสำหรับ branch นี้ตรง ๆ (คอมเมนต์กำกับไว้ในโค้ด) เพราะไม่อยากเดา behavior ที่ไม่สามารถยืนยันได้จากซอร์ส

```java
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Properties;

public class DefaultParserTest
{
    // ---------- 1. Overload delegation & null handling ----------

    @Test
    public void testParseTwoArgOverload_NoArguments() throws Exception
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
        assertTrue(cmd.getArgList().isEmpty());
    }

    @Test
    public void testParseNullArguments_NoException() throws Exception
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        // arguments == null -> "if (arguments != null)" branch เป็น false
        CommandLine cmd = parser.parse(options, null);
        assertTrue(cmd.getArgList().isEmpty());
    }

    @Test
    public void testParseNullProperties_NoException() throws Exception
    {
        Options options = new Options();
        options.addOption("f", true, "file");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-f", "v"}, (Properties) null);
        assertEquals("v", cmd.getOptionValue("f"));
    }

    @Test
    public void testParseThreeArgOverload_StopAtNonOptionDefaultFalse()
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"-x"});
            fail("expected UnrecognizedOptionException");
        }
        catch (ParseException expected)
        {
            assertTrue(expected instanceof UnrecognizedOptionException);
        }
    }

    @Test
    public void testParseStopAtNonOptionOverload_True() throws Exception
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-x"}, true);
        assertEquals(1, cmd.getArgList().size());
        assertEquals("-x", cmd.getArgList().get(0));
    }

    // ---------- 2. handleToken: "--" / skipParsing ----------

    @Test
    public void testDoubleDashStopsParsingAndCollectsRemainingArgs() throws Exception
    {
        Options options = new Options();
        options.addOption("a", false, "desc");
        DefaultParser parser = new DefaultParser();
        String[] args = {"--", "-a", "b"};
        CommandLine cmd = parser.parse(options, args);
        assertFalse(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgList().size());
        assertEquals("-a", cmd.getArgList().get(0));
        assertEquals("b", cmd.getArgList().get(1));
    }

    // ---------- 3. currentOption.acceptsArg && isArgument ----------

    @Test
    public void testOptionWithArgConsumesNextTokenAsValue() throws Exception
    {
        Options options = new Options();
        options.addOption("f", true, "file");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-f", "hello"});
        assertEquals("hello", cmd.getOptionValue("f"));
    }

    @Test
    public void testOptionWithArgConsumesNegativeNumberAsValue() throws Exception
    {
        Options options = new Options();
        options.addOption("n", true, "num");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-n", "-5"});
        assertEquals("-5", cmd.getOptionValue("n"));
    }

    @Test
    public void testNegativeNumberPreferredOverMatchingShortOption() throws Exception
    {
        // ทดสอบ branch: isArgument = !isOption(token) || isNegativeNumber(token)
        // โดยบังคับให้ isOption("-1") เป็น true (มี short option "1" จริง)
        // เพื่อให้ isNegativeNumber ถูกเรียกจริง ๆ (ไม่ short-circuit)
        Options options = new Options();
        options.addOption("n", true, "desc");
        options.addOption("1", false, "one flag");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-n", "-1"});
        assertEquals("-1", cmd.getOptionValue("n"));
        assertFalse("ค่า -1 ควรถูกใช้เป็น value ไม่ใช่ตี option '1'", cmd.hasOption("1"));
    }

    @Test
    public void testOptionWithArgFollowedByOptionThrowsMissingArgument()
    {
        Options options = new Options();
        options.addOption("f", true, "file");
        options.addOption("a", false, "flag");
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"-f", "-a"});
            fail("expected MissingArgumentException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof MissingArgumentException);
        }
    }

    // ---------- 4. handleLongOption (without '=') ----------

    @Test
    public void testLongOptionExactMatch() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option(null, "verbose", false, "desc"));
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"--verbose"});
        assertTrue(cmd.hasOption("verbose"));
    }

    @Test
    public void testLongOptionAmbiguousPrefixThrowsAmbiguousOptionException()
    {
        Options options = new Options();
        options.addOption(new Option(null, "foo", false, "desc"));
        options.addOption(new Option(null, "foobar", false, "desc"));
        DefaultParser parser = new DefaultParser();
        try
        {
            // "--fo" เป็น prefix ของทั้ง foo และ foobar (ไม่ exact match ใดๆ)
            parser.parse(options, new String[]{"--fo"});
            fail("expected AmbiguousOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof AmbiguousOptionException);
        }
    }

    @Test
    public void testLongOptionUnknownThrowsUnrecognizedOptionException()
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"--unknown"});
            fail("expected UnrecognizedOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }

    @Test
    public void testLongOptionUnknownStopAtNonOptionAddsArg() throws Exception
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"--unknown", "next"}, true);
        // stopAtNonOption = true -> skipParsing ถูกตั้งหลังพบ token แปลก -> "next" ก็ถูกเก็บดิบๆ
        assertEquals(2, cmd.getArgList().size());
        assertEquals("--unknown", cmd.getArgList().get(0));
        assertEquals("next", cmd.getArgList().get(1));
    }

    // ---------- 5. handleLongOptionWithEqual ----------

    @Test
    public void testLongOptionWithEqualAcceptsArg() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option(null, "file", true, "desc"));
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"--file=test.txt"});
        assertEquals("test.txt", cmd.getOptionValue("file"));
    }

    @Test
    public void testLongOptionWithEqualNotAcceptingArgThrowsUnrecognized()
    {
        Options options = new Options();
        options.addOption(new Option(null, "verbose", false, "desc"));
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"--verbose=true"});
            fail("expected UnrecognizedOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }

    @Test
    public void testLongOptionWithEqualAmbiguous()
    {
        Options options = new Options();
        options.addOption(new Option(null, "foo", false, "desc"));
        options.addOption(new Option(null, "foobar", false, "desc"));
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"--fo=x"});
            fail("expected AmbiguousOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof AmbiguousOptionException);
        }
    }

    @Test
    public void testLongOptionWithEqualUnknown()
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"--xyz=val"});
            fail("expected UnrecognizedOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }

    // ---------- 6. handleShortAndLongOption: length==1 ----------

    @Test
    public void testShortOptionSingleCharExists() throws Exception
    {
        Options options = new Options();
        options.addOption("x", false, "desc");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-x"});
        assertTrue(cmd.hasOption("x"));
    }

    @Test
    public void testShortOptionSingleCharUnknownThrows()
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"-z"});
            fail("expected UnrecognizedOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }

    // ---------- 7. handleShortAndLongOption: no '=' branches ----------

    @Test
    public void testShortOptionConcatenatedFlags() throws Exception
    {
        Options options = new Options();
        options.addOption("a", false, "a");
        options.addOption("b", false, "b");
        options.addOption("c", false, "c");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-abc"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertTrue(cmd.hasOption("c"));
    }

    @Test
    public void testShortOptionConcatenatedWithTrailingValue() throws Exception
    {
        Options options = new Options();
        options.addOption("a", true, "a with arg");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-aXYZ"});
        assertEquals("XYZ", cmd.getOptionValue("a"));
    }

    @Test
    public void testShortOptionConcatenatedUnknownCharThrows_StopAtNonOptionFalse()
    {
        Options options = new Options();
        options.addOption("a", false, "a");
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"-ax"});
            fail("expected UnrecognizedOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }

    @Test
    public void testShortOptionConcatenatedUnknownChar_StopAtNonOptionTrue_MidToken() throws Exception
    {
        // i > 1 && stopAtNonOption -> handleUnknownToken(token.substring(i))
        Options options = new Options();
        options.addOption("a", false, "a");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-ax", "extra"}, true);
        assertTrue(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgList().size());
        assertEquals("x", cmd.getArgList().get(0));
        assertEquals("extra", cmd.getArgList().get(1));
    }

    @Test
    public void testShortOptionConcatenatedUnknownChar_StopAtNonOptionTrue_FirstChar() throws Exception
    {
        // i == 1 -> ternary เลือก token เต็ม (มี '-') ไม่ substring
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-zzz", "after"}, true);
        assertEquals(2, cmd.getArgList().size());
        assertEquals("-zzz", cmd.getArgList().get(0));
        assertEquals("after", cmd.getArgList().get(1));
    }

    @Test
    public void testShortOptionMatchesLongPrefix_LikeXmxStyle() throws Exception
    {
        // -Xmx512m: 'X' เป็น long option (ไม่มี short) เก็บ arg แบบ "Xmx" + "512m"
        Options options = new Options();
        options.addOption(new Option(null, "Xmx", true, "memory"));
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-Xmx512m"});
        assertEquals("512m", cmd.getOptionValue("Xmx"));
    }

    @Test
    public void testShortOptionJavaPropertyWithoutEquals() throws Exception
    {
        // -Dflag : 'D' ต้องมี args >= 2 หรือ UNLIMITED_VALUES เพื่อเข้า isJavaProperty
        Options options = new Options();
        Option d = new Option("D", "define", true, "define property");
        d.setArgs(2);
        options.addOption(d);
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-Dflag"});
        assertTrue(cmd.hasOption("D"));
        assertEquals("flag", cmd.getOptionValues("D")[0]);
    }

    @Test
    public void testShortOptionJavaPropertyWithEquals() throws Exception
    {
        Options options = new Options();
        Option d = new Option("D", "define", true, "define property");
        d.setArgs(2);
        options.addOption(d);
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-Dfoo=bar"});
        String[] values = cmd.getOptionValues("D");
        assertEquals("foo", values[0]);
        assertEquals("bar", values[1]);
    }

    // ---------- 8. handleShortAndLongOption: '=' branches ----------

    @Test
    public void testShortOptionEqualsAcceptsArg() throws Exception
    {
        Options options = new Options();
        options.addOption("s", true, "desc");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-s=value"});
        assertEquals("value", cmd.getOptionValue("s"));
    }

    @Test
    public void testShortOptionEqualsNotAcceptsArgThrowsUnknown()
    {
        Options options = new Options();
        options.addOption("s", false, "desc");
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"-s=value"});
            fail("expected UnrecognizedOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }

    @Test
    public void testShortOptionEqualsWithUnknownOptionThrowsUnknown()
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"-s=value"});
            fail("expected UnrecognizedOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }

    @Test
    public void testShortOptionEqualsLongOptDelegation() throws Exception
    {
        // opt.length() > 1 -> delegate to handleLongOptionWithEqual (-L=V style)
        Options options = new Options();
        options.addOption(new Option(null, "level", true, "level"));
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-level=5"});
        assertEquals("5", cmd.getOptionValue("level"));
    }

    // ---------- 9. required options / groups ----------

    @Test
    public void testRequiredOptionMissingThrowsMissingOptionException()
    {
        Options options = new Options();
        options.addRequiredOption("r", "required", false, "required option");
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[0]);
            fail("expected MissingOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof MissingOptionException);
        }
    }

    @Test
    public void testRequiredOptionSatisfied_NoException() throws Exception
    {
        Options options = new Options();
        options.addRequiredOption("r", "required", false, "required option");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-r"});
        assertTrue(cmd.hasOption("r"));
    }

    @Test
    public void testOptionGroupAlreadySelectedThrowsException()
    {
        Options options = new Options();
        Option a = new Option("a", false, "a");
        Option b = new Option("b", false, "b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);

        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[]{"-a", "-b"});
            fail("expected AlreadySelectedException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof AlreadySelectedException);
        }
    }

    @Test
    public void testOptionGroupSelectionClearedBetweenParses() throws Exception
    {
        Options options = new Options();
        Option a = new Option("a", false, "a");
        Option b = new Option("b", false, "b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);

        DefaultParser parser = new DefaultParser();
        CommandLine cmd1 = parser.parse(options, new String[]{"-a"});
        assertTrue(cmd1.hasOption("a"));

        // การ parse ครั้งใหม่ต้อง reset group selection (ไม่ throw AlreadySelectedException)
        CommandLine cmd2 = parser.parse(options, new String[]{"-b"});
        assertTrue(cmd2.hasOption("b"));
    }

    @Test
    public void testRequiredOptionGroupMissingThrows()
    {
        Options options = new Options();
        Option a = new Option("a", false, "a");
        Option b = new Option("b", false, "b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        group.setRequired(true);
        options.addOptionGroup(group);

        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[0]);
            fail("expected MissingOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof MissingOptionException);
        }
    }

    // ---------- 10. handleProperties ----------

    @Test
    public void testHandlePropertiesUnknownOptionThrows()
    {
        Options options = new Options();
        Properties props = new Properties();
        props.setProperty("unknown", "true");
        DefaultParser parser = new DefaultParser();
        try
        {
            parser.parse(options, new String[0], props);
            fail("expected UnrecognizedOptionException");
        }
        catch (ParseException e)
        {
            assertTrue(e instanceof UnrecognizedOptionException);
        }
    }

    @Test
    public void testHandlePropertiesSkippedWhenAlreadySetOnCommandLine() throws Exception
    {
        Options options = new Options();
        options.addOption("f", true, "file");
        Properties props = new Properties();
        props.setProperty("f", "propvalue");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-f", "cmdlinevalue"}, props);
        assertEquals("cmdlinevalue", cmd.getOptionValue("f"));
    }

    @Test
    public void testHandlePropertiesSkippedWhenGroupAlreadySelected() throws Exception
    {
        Options options = new Options();
        Option a = new Option("a", false, "a");
        Option b = new Option("b", false, "b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        options.addOptionGroup(group);

        Properties props = new Properties();
        props.setProperty("b", "true");

        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a"}, props);
        assertTrue(cmd.hasOption("a"));
        assertFalse("b ไม่ควรถูกเลือกเพราะ group ถูกเลือกด้วย a แล้ว", cmd.hasOption("b"));
    }

    @Test
    public void testHandlePropertiesSetsValueForArgOption() throws Exception
    {
        Options options = new Options();
        options.addOption("f", true, "file");
        Properties props = new Properties();
        props.setProperty("f", "propval");
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertEquals("propval", cmd.getOptionValue("f"));
    }

    @Test
    public void testHandlePropertiesFlagWithTrueValueAddsOption() throws Exception
    {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        Properties props = new Properties();
        props.setProperty("v", "yes"); // "yes"/"true"/"1" (case-insensitive)
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("v"));
    }

    @Test
    public void testHandlePropertiesFlagWithNonTrueValueSkipped() throws Exception
    {
        Options options = new Options();
        options.addOption("v", false, "verbose");
        Properties props = new Properties();
        props.setProperty("v", "false"); // ไม่ใช่ yes/true/1 -> continue (ไม่เพิ่ม option)
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[0], props);
        assertFalse(cmd.hasOption("v"));
    }

    // ---------- 11. plain / positional args ----------

    @Test
    public void testPlainTokenNotStartingWithDashAddedAsArg() throws Exception
    {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"plainArg"});
        assertEquals(1, cmd.getArgList().size());
        assertEquals("plainArg", cmd.getArgList().get(0));
    }

    @Test
    public void testSingleDashTokenTreatedAsArgument() throws Exception
    {
        // token.startsWith("-") && !"-".equals(token) เป็น false เมื่อ token == "-"
        // จึงตกไป handleUnknownToken -> เนื่องจาก length==1 ไม่เข้าเงื่อนไข throw -> เก็บเป็น arg
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-"});
        assertEquals(1, cmd.getArgList().size());
        assertEquals("-", cmd.getArgList().get(0));
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testParseTwoArgOverload_NoArguments | `parse(options,args)` delegate, arguments loop ว่าง |
| testParseNullArguments_NoException | `if (arguments != null)` = false |
| testParseNullProperties_NoException | `parse(...,Properties)` overload, `properties==null` ใน handleProperties |
| testParseThreeArgOverload_StopAtNonOptionDefaultFalse | `parse(options,args,stopAtNonOption)` overload, false path |
| testParseStopAtNonOptionOverload_True | overload เดียวกัน, true path |
| testDoubleDashStopsParsingAndCollectsRemainingArgs | `"--".equals(token)` → skipParsing=true, args เก็บดิบ |
| testOptionWithArgConsumesNextTokenAsValue | `currentOption!=null && acceptsArg && isArgument(token)`=true (ทั่วไป) |
| testOptionWithArgConsumesNegativeNumberAsValue | isArgument ผ่านทาง `!isOption` |
| testNegativeNumberPreferredOverMatchingShortOption | isArgument ผ่านทาง `isNegativeNumber` (isOption=true) |
| testOptionWithArgFollowedByOptionThrowsMissingArgument | checkRequiredArgs ภายใน handleOption → MissingArgumentException |
| testLongOptionExactMatch | handleLongOptionWithoutEqual: matchingOpts.size()==1 |
| testLongOptionAmbiguousPrefixThrowsAmbiguousOptionException | matchingOpts.size()>1 |
| testLongOptionUnknownThrowsUnrecognizedOptionException | matchingOpts.isEmpty(), stopAtNonOption=false |
| testLongOptionUnknownStopAtNonOptionAddsArg | matchingOpts.isEmpty(), stopAtNonOption=true |
| testLongOptionWithEqualAcceptsArg | handleLongOptionWithEqual: option.acceptsArg()=true |
| testLongOptionWithEqualNotAcceptingArgThrowsUnrecognized | option.acceptsArg()=false |
| testLongOptionWithEqualAmbiguous | matchingOpts.size()>1 (มี '=') |
| testLongOptionWithEqualUnknown | matchingOpts.isEmpty() (มี '=') |
| testShortOptionSingleCharExists | handleShortAndLongOption: t.length()==1, hasShortOption=true |
| testShortOptionSingleCharUnknownThrows | t.length()==1, hasShortOption=false |
| testShortOptionConcatenatedFlags | handleConcatenatedOptions: loop เต็ม ไม่มี arg |
| testShortOptionConcatenatedWithTrailingValue | handleConcatenatedOptions: `currentOption!=null && length!=i+1` → addValue+break |
| testShortOptionConcatenatedUnknownCharThrows_StopAtNonOptionFalse | else branch (hasOption=false), stopAtNonOption=false |
| testShortOptionConcatenatedUnknownChar_StopAtNonOptionTrue_MidToken | ternary `i>1 && stopAtNonOption` = true |
| testShortOptionConcatenatedUnknownChar_StopAtNonOptionTrue_FirstChar | ternary กรณี i==1 (ใช้ token เต็ม) |
| testShortOptionMatchesLongPrefix_LikeXmxStyle | getLongPrefix != null && acceptsArg |
| testShortOptionJavaPropertyWithoutEquals | isJavaProperty(t) = true (ไม่มี '=') |
| testShortOptionJavaPropertyWithEquals | isJavaProperty(opt) = true (มี '=') |
| testShortOptionEqualsAcceptsArg | pos!=-1, opt.length()==1, option.acceptsArg()=true |
| testShortOptionEqualsNotAcceptsArgThrowsUnknown | opt.length()==1, acceptsArg=false |
| testShortOptionEqualsWithUnknownOptionThrowsUnknown | opt.length()==1, option==null |
| testShortOptionEqualsLongOptDelegation | opt.length()>1 → handleLongOptionWithEqual |
| testRequiredOptionMissingThrowsMissingOptionException | checkRequiredOptions: expectedOpts ไม่ว่าง |
| testRequiredOptionSatisfied_NoException | expectedOpts ว่างหลัง updateRequiredOptions |
| testOptionGroupAlreadySelectedThrowsException | updateRequiredOptions/group.setSelected → AlreadySelectedException |
| testOptionGroupSelectionClearedBetweenParses | loop `group.setSelected(null)` ต้น parse() |
| testRequiredOptionGroupMissingThrows | expectedOpts มี group object, group required |
| testHandlePropertiesUnknownOptionThrows | handleProperties: opt==null → UnrecognizedOptionException |
| testHandlePropertiesSkippedWhenAlreadySetOnCommandLine | `!cmd.hasOption(option)` = false → skip |
| testHandlePropertiesSkippedWhenGroupAlreadySelected | `selected` = true → skip |
| testHandlePropertiesSetsValueForArgOption | opt.hasArg()=true, values ว่าง → addValueForProcessing |
| testHandlePropertiesFlagWithTrueValueAddsOption | !hasArg(), value=yes/true/1 → handleOption |
| testHandlePropertiesFlagWithNonTrueValueSkipped | !hasArg(), value อื่น → continue |
| testPlainTokenNotStartingWithDashAddedAsArg | handleUnknownToken: ไม่ขึ้นด้วย '-' |
| testSingleDashTokenTreatedAsArgument | token=="-" → else-branch เต็มไปยัง handleUnknownToken, length==1 ไม่ throw |

**ข้อจำกัดที่ระบุไว้**: branch `opt.getValues() != null && opt.getValues().length != 0` ใน `handleProperties` ไม่ได้เขียนเทสแยก เพราะดูเหมือนไม่สามารถ reach ได้จริงในทางปฏิบัติ (ถูกกันด้วย `!cmd.hasOption(option)` ก่อนแล้ว) — ไม่ต้องการเดา behavior ที่ไม่ยืนยันได้จากซอร์ส
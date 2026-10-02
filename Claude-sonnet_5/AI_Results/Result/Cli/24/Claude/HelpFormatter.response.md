# HelpFormatterTest - JUnit 4 Test Suite

**หมายเหตุสำคัญ:**
- ซอร์สโค้ดที่ให้มาอ้างถึงคลาส `Option`, `Options`, `OptionGroup` ซึ่งไม่ได้แสดง signature เต็มในซอร์ส แต่เป็น public API มาตรฐานของ Apache Commons CLI (เวอร์ชันร่วมสมัยกับ Cli-24) จึงใช้ constructor/method ที่เป็นมาตรฐาน เช่น `Option(String opt, boolean hasArg, String desc)`, `Option(String opt, String longOpt, boolean hasArg, String desc)`, `Options.addOption(Option)`, `Options.addOptionGroup(OptionGroup)`, `OptionGroup.setRequired(boolean)` — หากพฤติกรรมจริงต่างจากนี้ อาจต้องปรับ import/­signature
- พบ **fault ที่เป็นไปได้จริง** ในเมธอด `findWrapPos`: loop วนหา whitespace ตัวที่สอง (`while ((pos <= text.length()) && ...)`) ใช้เงื่อนไข `pos <= text.length()` แทนที่จะเป็น `pos < text.length()` ทำให้เมื่อไม่พบ whitespace เลยจนถึงท้ายข้อความ จะเกิด `StringIndexOutOfBoundsException` จาก `text.charAt(text.length())` แทนที่จะ return `-1` ตามที่ Javadoc/ตรรกะ return ท้ายเมธอดตั้งใจไว้ — เขียนเทสไว้ 1 ตัวเพื่อดักจับพฤติกรรมนี้อย่างชัดเจน (`testFindWrapPosDirectNoWhitespaceAtAllFault`)

```java
package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

/**
 * JUnit4 test suite for org.apache.commons.cli.HelpFormatter (Defects4J Cli-24b)
 */
public class HelpFormatterTest
{
    private HelpFormatter formatter;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
    }

    // =========================================================
    // Getter / Setter - default values & set/get round trip
    // =========================================================

    @Test
    public void testDefaultValues()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetters()
    {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(7);
        assertEquals(7, formatter.getDescPadding());

        formatter.setSyntaxPrefix("myUsage: ");
        assertEquals("myUsage: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\r\n");
        assertEquals("\r\n", formatter.getNewLine());

        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());

        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());

        formatter.setArgName("param");
        assertEquals("param", formatter.getArgName());
    }

    // =========================================================
    // setOptionComparator - null vs non-null branch
    // =========================================================

    @Test
    public void testSetOptionComparatorNull()
    {
        formatter.setOptionComparator(null);
        // ไม่สามารถตรวจสอบ instance type ของ private OptionComparator ได้ตรง ๆ
        // ตรวจว่าไม่ null และ ไม่ throw exception
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorNonNull()
    {
        Comparator custom = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return 0;
            }
        };
        formatter.setOptionComparator(custom);
        assertSame(custom, formatter.getOptionComparator());
    }

    // =========================================================
    // printHelp(PrintWriter, ...) - core method: boundary/null/if-else
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpNullSyntaxThrows()
    {
        PrintWriter pw = new PrintWriter(new StringWriter());
        Options options = new Options();
        formatter.printHelp(pw, 80, null, null, options, 1, 3, null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpEmptySyntaxThrows()
    {
        PrintWriter pw = new PrintWriter(new StringWriter());
        Options options = new Options();
        formatter.printHelp(pw, 80, "", null, options, 1, 3, null, false);
    }

    @Test
    public void testPrintHelpAutoUsageTrue()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));

        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, true);
        pw.flush();

        String out = sw.toString();
        assertTrue(out.contains("usage: app"));
        assertTrue(out.contains("-a"));
    }

    @Test
    public void testPrintHelpAutoUsageFalse()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));

        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        pw.flush();

        assertTrue(sw.toString().contains("usage: app"));
    }

    @Test
    public void testPrintHelpWithHeaderAndFooter()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));

        formatter.printHelp(pw, 80, "app", "HEADER TEXT", options, 1, 3, "FOOTER TEXT", false);
        pw.flush();

        String out = sw.toString();
        assertTrue(out.contains("HEADER TEXT"));
        assertTrue(out.contains("FOOTER TEXT"));
    }

    @Test
    public void testPrintHelpHeaderBlank()
    {
        // header/footer เป็น blank (trim length == 0) -> ไม่ควรเข้า printWrapped สำหรับ header/footer
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));

        formatter.printHelp(pw, 80, "app", "   ", options, 1, 3, "   ", false);
        pw.flush();

        assertTrue(sw.toString().contains("usage: app"));
    }

    @Test
    public void testPrintHelpNullHeaderFooter()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));

        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        pw.flush();

        assertTrue(sw.toString().contains("usage: app"));
    }

    // =========================================================
    // printHelp overloads (delegate methods) - just ensure no exception
    // =========================================================

    @Test
    public void testPrintHelpOverload2Args()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp("app", options);
    }

    @Test
    public void testPrintHelpOverload3Args()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp("app", options, true);
    }

    @Test
    public void testPrintHelpOverload4Args()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp("app", "header", options, "footer");
    }

    @Test
    public void testPrintHelpOverload5Args()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp("app", "header", options, "footer", true);
    }

    @Test
    public void testPrintHelpOverloadWidth5Args()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp(80, "app", "header", options, "footer");
    }

    @Test
    public void testPrintHelpOverloadWidth6Args()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp(80, "app", "header", options, "footer", true);
    }

    @Test
    public void testPrintHelpPrintWriter8Args()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));

        formatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer");
        pw.flush();

        assertTrue(sw.toString().contains("usage: app"));
    }

    // =========================================================
    // printUsage(pw,width,app,options) - group / required / prefix branches
    // =========================================================

    @Test
    public void testPrintUsageNoOptions()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        assertTrue(sw.toString().trim().startsWith("usage: app"));
    }

    @Test
    public void testPrintUsageSingleRequiredOptionNoGroup()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        Option opt = new Option("r", false, "required option");
        opt.setRequired(true);
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String out = sw.toString();
        assertTrue(out.contains("-r"));
        assertFalse(out.contains("[-r]")); // required option ต้องไม่ถูกครอบด้วย []
    }

    @Test
    public void testPrintUsageSingleOptionalOptionNoGroup()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("o", false, "optional option"));

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        assertTrue(sw.toString().contains("[-o]"));
    }

    @Test
    public void testPrintUsageWithOptionGroupRequired()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "option a"));
        group.addOption(new Option("b", false, "option b"));
        group.setRequired(true);
        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String out = sw.toString();
        assertTrue(out.contains("|"));
        assertFalse(out.startsWith("usage: app ["));
    }

    @Test
    public void testPrintUsageWithOptionGroupNotRequired()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "option a"));
        group.addOption(new Option("b", false, "option b"));
        group.setRequired(false);
        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String out = sw.toString();
        assertTrue(out.contains("["));
        assertTrue(out.contains("]"));
        assertTrue(out.contains("|"));
    }

    @Test
    public void testPrintUsageMixedGroupAndSingleOptions()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "option a"));
        group.addOption(new Option("b", false, "option b"));
        options.addOptionGroup(group);
        options.addOption(new Option("c", false, "single option"));

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String out = sw.toString();
        assertTrue(out.contains("-c"));
        assertTrue(out.contains("-a") || out.contains("-b"));
    }

    @Test
    public void testPrintUsageOptionWithArgAndArgName()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        Option opt = new Option("f", true, "file option");
        opt.setArgName("file");
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        assertTrue(sw.toString().contains("<file>"));
    }

    @Test
    public void testPrintUsageOptionWithLongOptOnly()
    {
        // Option ที่ opt == null (getOpt()==null) -> ใช้ longOpt branch
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        Option opt = new Option(null, "longOnly", false, "long only option");
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        assertTrue(sw.toString().contains("--longOnly"));
    }

    // =========================================================
    // printUsage(pw,width,cmdLineSyntax)
    // =========================================================

    @Test
    public void testPrintUsageSimple()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printUsage(pw, 80, "app arg1 arg2");
        pw.flush();

        assertTrue(sw.toString().contains("usage: app arg1 arg2"));
    }

    // =========================================================
    // printOptions / renderOptions integration
    // =========================================================

    @Test
    public void testPrintOptions()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "the a option"));

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();

        String out = sw.toString();
        assertTrue(out.contains("-a"));
        assertTrue(out.contains("--aaa"));
        assertTrue(out.contains("the a option"));
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintOptionsWidthTooSmallThrows()
    {
        // width เล็กกว่า nextLineTabStop (max+descPad) -> ต้อง throw IllegalStateException
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        Option opt = new Option("a", "aaaaaaaaaa", false,
                "some description with several words here");
        options.addOption(opt);

        formatter.printOptions(pw, 5, options, 1, 3);
    }

    // =========================================================
    // printWrapped / renderWrappedText
    // =========================================================

    @Test
    public void testPrintWrappedShortText()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 80, "short text");
        pw.flush();

        assertEquals("short text" + formatter.getNewLine(), sw.toString());
    }

    @Test
    public void testPrintWrappedLongTextWithTabStop()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String longText = "This is a very long piece of text that should be wrapped "
                + "across multiple lines when the width is small enough to force wrapping.";

        formatter.printWrapped(pw, 20, 5, longText);
        pw.flush();

        assertTrue(sw.toString().length() > 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintWrappedTabStopTooLarge()
    {
        PrintWriter pw = new PrintWriter(new StringWriter());
        String longText = "aaaaaaaaaa bbbbbbbbbb cccccccccc dddddddddd";

        // nextLineTabStop(10) >= width(10) -> ต้อง throw
        formatter.printWrapped(pw, 10, 10, longText);
    }

    @Test
    public void testRenderWrappedTextForcedWidthBranch()
    {
        // เจาะจงกรณี branch: (text.length() > width) && (pos == nextLineTabStop - 1)
        // คำนวณด้วยมือ (trace): width=6, tabStop=4, text="abcdef ghij"
        // ผลลัพธ์ที่คาดหวัง = "abcdef" + nl + "    gh" + nl + "    ij" + nl(println)
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 6, 4, "abcdef ghij");
        pw.flush();

        String nl = formatter.getNewLine();
        String expected = "abcdef" + nl + "    gh" + nl + "    ij" + nl;
        assertEquals(expected, sw.toString());
    }

    // =========================================================
    // findWrapPos - integration through printWrapped (\n, \t, short text)
    // =========================================================

    @Test
    public void testFindWrapPosWithNewlineCharacter()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 80, "short\nline");
        pw.flush();

        String out = sw.toString();
        assertTrue(out.contains("short"));
        assertTrue(out.contains("line"));
    }

    @Test
    public void testFindWrapPosWithTabCharacter()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 80, "short\tline");
        pw.flush();

        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void testFindWrapPosShortTextNoWrap()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        formatter.printWrapped(pw, 100, "tiny");
        pw.flush();

        assertEquals("tiny" + formatter.getNewLine(), sw.toString());
    }

    // =========================================================
    // findWrapPos - direct unit tests (protected, same package access)
    // =========================================================

    @Test
    public void testFindWrapPosDirectNewline()
    {
        int pos = formatter.findWrapPos("abc\ndef", 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPosDirectTab()
    {
        int pos = formatter.findWrapPos("abc\tdef", 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPosDirectEndOfText()
    {
        int pos = formatter.findWrapPos("abc", 10, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPosDirectFoundWhitespaceBeforeLimit()
    {
        // "aaaaa bbbbb", width=7 -> พบ whitespace ที่ index 5 ก่อนถึง limit
        int pos = formatter.findWrapPos("aaaaa bbbbb", 7, 0);
        assertEquals(5, pos);
    }

    @Test
    public void testFindWrapPosDirectNoWhitespaceBeforeButFoundAfter()
    {
        // ไม่พบ whitespace ก่อน startPos+width แต่พบหลังจากนั้น (index 10)
        String text = "aaaaaaaaaa bbbbbbbbbb";
        int pos = formatter.findWrapPos(text, 5, 0);
        assertEquals(10, pos);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testFindWrapPosDirectNoWhitespaceAtAllFault()
    {
        // *** FAULT DETECTED ***
        // เมื่อไม่มี whitespace เลยตั้งแต่ startPos+width จนถึงท้ายข้อความ
        // เงื่อนไข loop ที่สอง "pos <= text.length()" ทำให้เกิดการเรียก
        // text.charAt(text.length()) ซึ่งอยู่นอกขอบเขต -> StringIndexOutOfBoundsException
        // (ที่ถูกต้องควรใช้ "pos < text.length()" และ return -1 ตาม Javadoc)
        formatter.findWrapPos("aaaaaaaaaaaaaaaaaaaa", 5, 0);
    }

    // =========================================================
    // createPadding
    // =========================================================

    @Test
    public void testCreatePaddingZero()
    {
        assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void testCreatePaddingPositive()
    {
        assertEquals("     ", formatter.createPadding(5));
    }

    // =========================================================
    // rtrim
    // =========================================================

    @Test
    public void testRtrimNull()
    {
        assertNull(formatter.rtrim(null));
    }

    @Test
    public void testRtrimEmpty()
    {
        assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void testRtrimNoTrailingWhitespace()
    {
        assertEquals("hello", formatter.rtrim("hello"));
    }

    @Test
    public void testRtrimWithTrailingWhitespace()
    {
        assertEquals("hello", formatter.rtrim("hello   "));
    }

    // =========================================================
    // renderOptions - branches: getOpt()==null, hasLongOpt, hasArg/hasArgName, desc null
    // =========================================================

    @Test
    public void testRenderOptionsOptWithLongOptAndDescription()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        Option opt = new Option("a", "aaa", true, "desc a");
        opt.setArgName("ARG");
        options.addOption(opt);

        formatter.renderOptions(sb, 80, options, 1, 3);

        String out = sb.toString();
        assertTrue(out.contains("-a"));
        assertTrue(out.contains("--aaa"));
        assertTrue(out.contains("<ARG>"));
        assertTrue(out.contains("desc a"));
    }

    @Test
    public void testRenderOptionsOptWithoutLongOpt()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        options.addOption(new Option("b", false, "desc b"));

        formatter.renderOptions(sb, 80, options, 1, 3);

        String out = sb.toString();
        assertTrue(out.contains("-b"));
        assertFalse(out.contains("--"));
    }

    @Test
    public void testRenderOptionsOptWithNullOpt_LongOptOnly()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        options.addOption(new Option(null, "longOnly", false, "desc long"));

        formatter.renderOptions(sb, 80, options, 1, 3);

        assertTrue(sb.toString().contains("--longOnly"));
    }

    @Test
    public void testRenderOptionsHasArgWithoutArgName()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        // hasArg=true แต่ไม่ได้ set argName -> hasArgName() ควรเป็น false
        options.addOption(new Option("c", true, "desc c"));

        formatter.renderOptions(sb, 80, options, 1, 3);

        assertTrue(sb.toString().contains("-c"));
    }

    @Test
    public void testRenderOptionsNullDescription()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        options.addOption(new Option("d", false, null));

        formatter.renderOptions(sb, 80, options, 1, 3);

        assertTrue(sb.toString().contains("-d"));
    }

    @Test
    public void testRenderOptionsMultipleOptionsNewlineBranch()
    {
        StringBuffer sb = new StringBuffer();
        Options options = new Options();
        options.addOption(new Option("a", false, "desc a"));
        options.addOption(new Option("b", false, "desc b"));

        formatter.renderOptions(sb, 80, options, 1, 3);

        assertTrue(sb.toString().contains(formatter.getNewLine()));
    }

    // =========================================================
    // OptionComparator (default & custom) integration via printUsage
    // =========================================================

    @Test
    public void testOptionComparatorSortingCaseInsensitive()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("B", false, "opt B"));
        options.addOption(new Option("a", false, "opt a"));

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String out = sw.toString();
        int idxA = out.indexOf("-a");
        int idxB = out.indexOf("-B");
        assertTrue(idxA >= 0 && idxB >= 0 && idxA < idxB);
    }

    @Test
    public void testCustomComparatorUsedInPrintUsage()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("a", false, "opt a"));
        options.addOption(new Option("b", false, "opt b"));

        formatter.setOptionComparator(new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                Option op1 = (Option) o1;
                Option op2 = (Option) o2;
                return op2.getKey().compareToIgnoreCase(op1.getKey());
            }
        });

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();

        String out = sw.toString();
        int idxA = out.indexOf("-a");
        int idxB = out.indexOf("-b");
        assertTrue(idxA >= 0 && idxB >= 0 && idxB < idxA);
    }
}
```

## สรุปตาราง Test → Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultValues, testSetters | Getter/Setter ทุกตัว (ไม่มี branch แต่จำเป็นสำหรับ mutation/line coverage) |
| testSetOptionComparatorNull / NonNull | `if (comparator == null)` true/false |
| testPrintHelpNullSyntaxThrows / EmptySyntaxThrows | `(cmdLineSyntax==null) \|\| (length()==0)` ทั้งสองเงื่อนไข |
| testPrintHelpAutoUsageTrue / False | `if (autoUsage)` true/false |
| testPrintHelpWithHeaderAndFooter / HeaderBlank / NullHeaderFooter | `(header!=null)&&(trim().length()>0)` และเดียวกันกับ footer: true/false/null |
| testPrintHelpOverload* (2-6 args), PrintWriter8Args | delegate methods ทุก overload |
| testPrintUsageNoOptions | loop ไม่ execute (options ว่าง) |
| testPrintUsageSingleRequiredOptionNoGroup / OptionalOptionNoGroup | `group==null` → `appendOption(...,required)` true/false |
| testPrintUsageWithOptionGroupRequired / NotRequired | `appendOptionGroup`: `!group.isRequired()` true/false, `i.hasNext()` |
| testPrintUsageMixedGroupAndSingleOptions | `group!=null` + `processedGroups.contains(group)` true/false |
| testPrintUsageOptionWithArgAndArgName | `appendOption`: `hasArg() && hasArgName()` true |
| testPrintUsageOptionWithLongOptOnly | `option.getOpt()==null` branch ใน appendOption |
| testPrintUsageSimple | printUsage(pw,width,cmdLineSyntax) พื้นฐาน |
| testPrintOptions | printOptions/renderOptions ปกติ |
| testPrintOptionsWidthTooSmallThrows | `nextLineTabStop >= width` → throw ใน renderWrappedText ผ่าน renderOptions |
| testPrintWrappedShortText | `pos==-1` (ไม่ต้อง wrap) |
| testPrintWrappedLongTextWithTabStop | loop wrap หลายรอบ, `pos!=-1` |
| testPrintWrappedTabStopTooLarge | throw IllegalStateException ตอน iteration แรก |
| testRenderWrappedTextForcedWidthBranch | branch พิเศษ `(text.length()>width)&&(pos==nextLineTabStop-1)` |
| testFindWrapPosWithNewlineCharacter/TabCharacter/ShortTextNoWrap | findWrapPos ผ่าน printWrapped: `\n`, `\t`, และ end-of-text branch |
| testFindWrapPosDirectNewline/Tab/EndOfText | เรียก findWrapPos ตรง: เงื่อนไข `\n`,`\t`,`startPos+width>=length` |
| testFindWrapPosDirectFoundWhitespaceBeforeLimit | backward search พบ whitespace (`pos>startPos` true) |
| testFindWrapPosDirectNoWhitespaceBeforeButFoundAfter | backward ไม่พบ, forward พบ (`pos==length?` false) |
| **testFindWrapPosDirectNoWhitespaceAtAllFault** | **FAULT**: ทั้ง backward/forward ไม่พบ whitespace → StringIndexOutOfBoundsException (บั๊กจริงในโค้ด) |
| testCreatePaddingZero / Positive | loop `for (i=0;i<len;i++)`: len=0 (ไม่ execute), len>0 |
| testRtrimNull/Empty/NoTrailing/WithTrailing | `(s==null)\|\|(length()==0)` true/false, whitespace loop true/false |
| testRenderOptionsOptWithLongOptAndDescription | `getOpt()!=null`, `hasLongOpt()` true, `hasArg()&&hasArgName()` true, description!=null |
| testRenderOptionsOptWithoutLongOpt | `hasLongOpt()` false |
| testRenderOptionsOptWithNullOpt_LongOptOnly | `option.getOpt()==null` branch |
| testRenderOptionsHasArgWithoutArgName | `hasArg()` true, `hasArgName()` false |
| testRenderOptionsNullDescription | `option.getDescription()!=null` false |
| testRenderOptionsMultipleOptionsNewlineBranch | `i.hasNext()` true → append newline |
| testOptionComparatorSortingCaseInsensitive | default `OptionComparator.compare` (case-insensitive) |
| testCustomComparatorUsedInPrintUsage | custom comparator ถูกใช้จริงแทน default |

**หมายเหตุความไม่แน่ใจ:** บางเมธอด overload ของ `printHelp` เขียนไปยัง `System.out` โดยตรง (ผ่าน `new PrintWriter(System.out)`) จึงไม่สามารถ assert เนื้อหาที่พิมพ์ได้ในลักษณะ deterministic — เทสเหล่านี้จึงตรวจแค่ "ไม่ throw exception" (smoke test) ตามข้อจำกัดของซอร์สที่ให้มา
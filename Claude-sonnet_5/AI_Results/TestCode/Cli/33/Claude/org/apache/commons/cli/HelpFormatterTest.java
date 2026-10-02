package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter; // ซ้ำซ้อนเพราะอยู่ package เดียวกัน แต่ใส่ตามข้อกำหนด

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

/**
 * JUnit4 test suite for org.apache.commons.cli.HelpFormatter (Cli-33b)
 *
 * หมายเหตุ: คลาสทดสอบนี้อยู่ใน package เดียวกับคลาสเป้าหมาย (org.apache.commons.cli)
 * เพื่อให้เข้าถึง protected method (renderOptions, renderWrappedText, findWrapPos,
 * createPadding, rtrim) ได้โดยตรงตามกฎ Java access modifier (protected = package + subclass)
 */
public class HelpFormatterTest
{
    private HelpFormatter formatter;
    private Options options;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
        options = new Options();
    }

    // ------------------------------------------------------------------
    // Helper methods
    // ------------------------------------------------------------------

    private String captureSystemOut(Runnable r)
    {
        PrintStream original = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        try
        {
            r.run();
        }
        finally
        {
            System.setOut(original);
        }
        return baos.toString();
    }

    // ==================================================================
    // 1. Constants
    // ==================================================================

    @Test
    public void testDefaultConstants()
    {
        assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
        assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
        assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
        assertEquals("usage: ", HelpFormatter.DEFAULT_SYNTAX_PREFIX);
        assertEquals("-", HelpFormatter.DEFAULT_OPT_PREFIX);
        assertEquals("--", HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        assertEquals(" ", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        assertEquals("arg", HelpFormatter.DEFAULT_ARG_NAME);
    }

    // ==================================================================
    // 2. Getter / Setter
    // ==================================================================

    @Test
    public void testGetSetWidth()
    {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    @Test
    public void testGetSetLeftPadding()
    {
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void testGetSetDescPadding()
    {
        formatter.setDescPadding(7);
        assertEquals(7, formatter.getDescPadding());
    }

    @Test
    public void testGetSetSyntaxPrefix()
    {
        formatter.setSyntaxPrefix("USE: ");
        assertEquals("USE: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void testGetSetNewLine()
    {
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void testGetSetOptPrefix()
    {
        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());
    }

    @Test
    public void testGetSetLongOptPrefix()
    {
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
    }

    @Test
    public void testGetSetLongOptSeparator()
    {
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetSetArgName()
    {
        formatter.setArgName("VALUE");
        assertEquals("VALUE", formatter.getArgName());
    }

    @Test
    public void testOptionComparatorDefaultNotNull()
    {
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorNullResetsToDefault()
    {
        // ตั้งค่า custom ก่อน แล้ว reset ด้วย null -> ต้องกลับไปใช้ default (case-insensitive)
        formatter.setOptionComparator(new Comparator()
        {
            public int compare(Object o1, Object o2) { return 0; }
        });
        formatter.setOptionComparator(null); // branch: comparator == null
        assertNotNull(formatter.getOptionComparator());

        // ตรวจสอบผลลัพธ์ผ่านการ sort จริงใน printUsage (case-insensitive ascending)
        options.addOption(new Option("z", false, "zzz"));
        options.addOption(new Option("a", false, "aaa"));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String out = sw.toString();
        assertTrue(out.indexOf("-a") < out.indexOf("-z"));
    }

    @Test
    public void testSetOptionComparatorCustom()
    {
        // custom comparator: เรียงย้อนกลับ (z มาก่อน a)
        formatter.setOptionComparator(new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                Option op1 = (Option) o1;
                Option op2 = (Option) o2;
                return op2.getKey().compareToIgnoreCase(op1.getKey());
            }
        });
        options.addOption(new Option("a", false, "aaa"));
        options.addOption(new Option("z", false, "zzz"));

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String out = sw.toString();
        assertTrue(out.indexOf("-z") < out.indexOf("-a"));
    }

    // ==================================================================
    // 3. printHelp - Exception cases (boundary / null / empty)
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpNullSyntaxThrows()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, null, null, options, 1, 3, null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpEmptySyntaxThrows()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "", null, options, 1, 3, null, false);
    }

    // ==================================================================
    // 4. printHelp - header/footer branch (null, blank, ตัวอักษรจริง)
    // ==================================================================

    @Test
    public void testPrintHelpNoHeaderNoFooter()
    {
        options.addOption(new Option("a", false, "desc a"));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        pw.flush();
        String out = sw.toString();
        assertTrue(out.indexOf("usage: app") >= 0);
        assertTrue(out.indexOf("-a") >= 0);
    }

    @Test
    public void testPrintHelpBlankHeaderSkipped()
    {
        // header.trim().length() == 0 -> ไม่พิมพ์ header (branch false)
        options.addOption(new Option("a", false, "desc a"));

        StringWriter sw1 = new StringWriter();
        formatter.printHelp(new PrintWriter(sw1), 80, "app", "   ", options, 1, 3, null, false);

        StringWriter sw2 = new StringWriter();
        formatter.printHelp(new PrintWriter(sw2), 80, "app", null, options, 1, 3, null, false);

        assertEquals(sw2.toString(), sw1.toString());
    }

    @Test
    public void testPrintHelpBlankFooterSkipped()
    {
        options.addOption(new Option("a", false, "desc a"));

        StringWriter sw1 = new StringWriter();
        formatter.printHelp(new PrintWriter(sw1), 80, "app", null, options, 1, 3, "   ", false);

        StringWriter sw2 = new StringWriter();
        formatter.printHelp(new PrintWriter(sw2), 80, "app", null, options, 1, 3, null, false);

        assertEquals(sw2.toString(), sw1.toString());
    }

    @Test
    public void testPrintHelpWithHeaderAndFooterText()
    {
        options.addOption(new Option("a", false, "desc a"));
        StringWriter sw = new StringWriter();
        formatter.printHelp(new PrintWriter(sw), 80, "app", "HEADERTEXT", options, 1, 3, "FOOTERTEXT", false);
        String out = sw.toString();
        assertTrue(out.indexOf("HEADERTEXT") >= 0);
        assertTrue(out.indexOf("FOOTERTEXT") >= 0);
        // ตรวจลำดับ usage -> header -> options -> footer
        int usageIdx = out.indexOf("usage:");
        int headerIdx = out.indexOf("HEADERTEXT");
        int optIdx = out.indexOf("-a");
        int footerIdx = out.indexOf("FOOTERTEXT");
        assertTrue(usageIdx < headerIdx);
        assertTrue(headerIdx < optIdx);
        assertTrue(optIdx < footerIdx);
    }

    // ==================================================================
    // 5. printHelp - autoUsage true/false
    // ==================================================================

    @Test
    public void testPrintHelpAutoUsageTrueIncludesOptionInUsageLine()
    {
        options.addOption(new Option("a", false, "desc a"));
        StringWriter sw = new StringWriter();
        formatter.printHelp(new PrintWriter(sw), 80, "app", null, options, 1, 3, null, true);
        String firstLine = sw.toString().split(formatter.getNewLine())[0];
        assertTrue(firstLine.indexOf("-a") >= 0);
    }

    @Test
    public void testPrintHelpAutoUsageFalseUsageLinePlain()
    {
        options.addOption(new Option("a", false, "desc a"));
        StringWriter sw = new StringWriter();
        formatter.printHelp(new PrintWriter(sw), 80, "app", null, options, 1, 3, null, false);
        String firstLine = sw.toString().split(formatter.getNewLine())[0];
        assertFalse(firstLine.indexOf("-a") >= 0);
        // แต่ต้องมีปรากฏใน options listing ที่ตามมา
        assertTrue(sw.toString().indexOf("-a") >= 0);
    }

    // ==================================================================
    // 6. Delegating overloads (เขียนไป System.out)
    // ==================================================================

    @Test
    public void testPrintHelpTwoArgOverload()
    {
        options.addOption(new Option("a", false, "desc a"));
        final Options opts = options;
        String out = captureSystemOut(new Runnable()
        {
            public void run() { formatter.printHelp("app", opts); }
        });
        assertTrue(out.indexOf("usage: app") >= 0);
    }

    @Test
    public void testPrintHelpThreeArgOverloadAutoUsage()
    {
        options.addOption(new Option("a", false, "desc a"));
        final Options opts = options;
        String out = captureSystemOut(new Runnable()
        {
            public void run() { formatter.printHelp("app", opts, true); }
        });
        assertTrue(out.indexOf("-a") >= 0);
    }

    @Test
    public void testPrintHelpFourArgOverload()
    {
        options.addOption(new Option("a", false, "desc a"));
        final Options opts = options;
        String out = captureSystemOut(new Runnable()
        {
            public void run() { formatter.printHelp("app", "HEAD", opts, "FOOT"); }
        });
        assertTrue(out.indexOf("HEAD") >= 0);
        assertTrue(out.indexOf("FOOT") >= 0);
    }

    @Test
    public void testPrintHelpFiveArgOverload()
    {
        options.addOption(new Option("a", false, "desc a"));
        final Options opts = options;
        String out = captureSystemOut(new Runnable()
        {
            public void run() { formatter.printHelp("app", "HEAD", opts, "FOOT", true); }
        });
        assertTrue(out.indexOf("HEAD") >= 0);
    }

    @Test
    public void testPrintHelpIntWidthOverload()
    {
        options.addOption(new Option("a", false, "desc a"));
        final Options opts = options;
        String out = captureSystemOut(new Runnable()
        {
            public void run() { formatter.printHelp(100, "app", "HEAD", opts, "FOOT"); }
        });
        assertTrue(out.indexOf("HEAD") >= 0);
    }

    // ==================================================================
    // 7. printUsage - appendOption / appendOptionGroup branches
    // ==================================================================

    @Test
    public void testPrintUsageRequiredOptionNoBrackets()
    {
        Option o = new Option("f", true, "file desc");
        o.setRequired(true);
        options.addOption(o);
        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app", options);
        String out = sw.toString();
        assertTrue(out.indexOf("-f <arg>") >= 0);
        assertFalse(out.indexOf("[-f") >= 0);
    }

    @Test
    public void testPrintUsageOptionalOptionWithBrackets()
    {
        Option o = new Option("v", false, "verbose");
        options.addOption(o);
        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app", options);
        String out = sw.toString();
        assertTrue(out.indexOf("[-v]") >= 0);
    }

    @Test
    public void testPrintUsageArgNameCustom()
    {
        Option o = new Option("f", true, "file desc");
        o.setArgName("FILE");
        options.addOption(o);
        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app", options);
        assertTrue(sw.toString().indexOf("<FILE>") >= 0);
    }

    @Test
    public void testPrintUsageArgNameBlankNoArgPlaceholder()
    {
        // argName == "" (length()==0) -> เงื่อนไข (argName==null || length!=0) เป็น false
        // ดังนั้นไม่ต่อ "<...>" ใน usage clause
        Option o = new Option("f", true, "file desc");
        o.setArgName("");
        options.addOption(o);
        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app", options);
        String out = sw.toString();
        assertFalse(out.indexOf("<") >= 0);
        assertTrue(out.indexOf("-f") >= 0);
    }

    @Test
    public void testPrintUsageLongOptOnlyNullShortOpt()
    {
        // สมมติฐาน: Option constructor ยอมรับ opt=null สำหรับ long-only option
        // (มาตรฐานของ commons-cli OptionValidator.validateOption จะ return ทันทีถ้า opt==null)
        Option o = new Option(null, "verbose", false, "verbose desc");
        options.addOption(o);
        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app", options);
        String out = sw.toString();
        assertTrue(out.indexOf("--verbose") >= 0);
        assertTrue(out.indexOf("[--verbose]") >= 0); // ไม่ required -> มีวงเล็บ
    }

    @Test
    public void testPrintUsageLongOptOnlyWithArgUsesLongOptSeparator()
    {
        formatter.setLongOptSeparator("=");
        Option o = new Option(null, "file", true, "file desc");
        options.addOption(o);
        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app", options);
        String out = sw.toString();
        assertTrue(out.indexOf("--file=<arg>") >= 0);
    }

    @Test
    public void testPrintUsageOptionGroupNotRequiredBrackets()
    {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "desc a"));
        group.addOption(new Option("b", false, "desc b"));
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app", options);
        String out = sw.toString();
        assertTrue(out.indexOf("[-a | -b]") >= 0);
    }

    @Test
    public void testPrintUsageOptionGroupRequiredNoBrackets()
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", false, "desc a"));
        group.addOption(new Option("b", false, "desc b"));
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app", options);
        String out = sw.toString();
        assertTrue(out.indexOf("-a | -b") >= 0);
        assertFalse(out.indexOf("[-a") >= 0);
    }

    @Test
    public void testPrintUsageOptionGroupProcessedOnlyOnce()
    {
        // ตรวจว่า option ตัวที่สองใน group เดียวกันไม่ถูกพิมพ์ซ้ำ (processedGroups.contains(group))
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "desc a"));
        group.addOption(new Option("b", false, "desc b"));
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app", options);
        String out = sw.toString();

        int count = 0, idx = 0;
        while ((idx = out.indexOf("-a", idx)) != -1)
        {
            count++;
            idx += 2;
        }
        assertEquals(1, count);
    }

    @Test
    public void testPrintUsageCmdLineSyntaxNoSpace()
    {
        // argPos = indexOf(' ') + 1 = -1 + 1 = 0 เมื่อไม่มี space
        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app");
        assertTrue(sw.toString().indexOf("usage: app") >= 0);
    }

    @Test
    public void testPrintUsageCmdLineSyntaxWithSpace()
    {
        StringWriter sw = new StringWriter();
        formatter.printUsage(new PrintWriter(sw), 80, "app arg1 arg2");
        assertTrue(sw.toString().indexOf("usage: app arg1 arg2") >= 0);
    }

    // ==================================================================
    // 8. printOptions / renderOptions
    // ==================================================================

    @Test
    public void testPrintOptionsBasic()
    {
        options.addOption(new Option("a", "aaa", false, "description a"));
        StringWriter sw = new StringWriter();
        formatter.printOptions(new PrintWriter(sw), 80, options, 1, 3);
        String out = sw.toString();
        assertTrue(out.indexOf("-a") >= 0);
        assertTrue(out.indexOf("--aaa") >= 0);
        assertTrue(out.indexOf("description a") >= 0);
    }

    @Test
    public void testRenderOptionsShortOptOnlyExact()
    {
        Option o = new Option("a", "description");
        options.addOption(o);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        // lpad(1)=" " + "-" + "a" = " -a" ; ไม่มี long opt / arg
        // dpad(3)="   " ; description ต่อท้ายทันที (ไม่ wrap เพราะ width=80 พอ)
        assertEquals(" -a   description", sb.toString());
    }

    @Test
    public void testRenderOptionsLongOptOnlyNullShortOptExact()
    {
        Option o = new Option(null, "verbose", false, "vdesc");
        options.addOption(o);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        // lpad(1)=" " + "   --" + "verbose" = "    --verbose" (1+3+2 spaces=6) ; dpad(3)="   "
        assertEquals("    --verbose   vdesc", sb.toString());
    }

    @Test
    public void testRenderOptionsBlankArgNameAddsSpaceOnly()
    {
        Option o = new Option("f", true, "file desc");
        o.setArgName("");
        options.addOption(o);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String s = sb.toString();
        assertFalse(s.indexOf("<") >= 0);
        assertTrue(s.indexOf("-f ") >= 0);
    }

    @Test
    public void testRenderOptionsMultipleLinesSeparatedByNewLine()
    {
        options.addOption(new Option("a", false, "desc a"));
        options.addOption(new Option("b", false, "desc b"));
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String s = sb.toString();
        assertTrue(s.indexOf(formatter.getNewLine()) >= 0);
    }

    // ==================================================================
    // 9. printWrapped
    // ==================================================================

    @Test
    public void testPrintWrappedNoWrap()
    {
        StringWriter sw = new StringWriter();
        formatter.printWrapped(new PrintWriter(sw), 80, "short text");
        assertEquals("short text" + formatter.getNewLine(), sw.toString());
    }

    // ==================================================================
    // 10. renderWrappedText - deterministic cases
    // ==================================================================

    @Test
    public void testRenderWrappedTextNoWrapNeeded()
    {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 20, 0, "short text  ");
        // pos == -1 -> rtrim(text) เท่านั้น
        assertEquals("short text", sb.toString());
    }

    @Test
    public void testRenderWrappedTextWrapMultipleLines()
    {
        StringBuffer sb = new StringBuffer();
        String nl = formatter.getNewLine();
        formatter.renderWrappedText(sb, 5, 0, "alpha beta gamma");
        assertEquals("alpha" + nl + "beta" + nl + "gamma", sb.toString());
    }

    @Test
    public void testRenderWrappedTextNextLineTabStopGreaterEqualsWidthResetTo1()
    {
        StringBuffer sb = new StringBuffer();
        String nl = formatter.getNewLine();
        // nextLineTabStop(10) >= width(5) -> reset เป็น 1 (padding 1 ช่องว่าง)
        formatter.renderWrappedText(sb, 5, 10, "abcdef ghij");
        assertEquals("abcde" + nl + " f" + nl + " ghij", sb.toString());
    }

    @Test
    public void testRenderWrappedTextForcedPosEqualsWidthBranch()
    {
        // ทดสอบ branch: (text.length() > width) && (pos == nextLineTabStop - 1) -> pos = width
        StringBuffer sb = new StringBuffer();
        String nl = formatter.getNewLine();
        formatter.renderWrappedText(sb, 10, 3, "start abcdefghijk");
        assertEquals("start" + nl + "   abcdefg" + nl + "   hijk", sb.toString());
    }

    // ==================================================================
    // 11. findWrapPos - ทุก branch
    // ==================================================================

    @Test
    public void testFindWrapPosNewlineFound()
    {
        assertEquals(3, formatter.findWrapPos("ab\ncdef", 5, 0));
    }

    @Test
    public void testFindWrapPosTabFound()
    {
        assertEquals(3, formatter.findWrapPos("ab\tcdef", 5, 0));
    }

    @Test
    public void testFindWrapPosReturnsMinusOneWhenTextFitsWithinWidth()
    {
        assertEquals(-1, formatter.findWrapPos("abcdef", 10, 0));
    }

    @Test
    public void testFindWrapPosWhitespaceFoundBeforeWidth()
    {
        assertEquals(5, formatter.findWrapPos("abcde fghij", 5, 0));
    }

    @Test
    public void testFindWrapPosNoWhitespaceChopAtWidth()
    {
        assertEquals(5, formatter.findWrapPos("abcdefghij", 5, 0));
    }

    @Test
    public void testFindWrapPosChopAtWidthEqualsTextLengthReturnsMinusOne()
    {
        // pos == text.length() -> return -1 (edge case: chop position เท่ากับความยาว string)
        assertEquals(-1, formatter.findWrapPos("abcde", 5, 0));
    }

    // ==================================================================
    // 12. createPadding
    // ==================================================================

    @Test
    public void testCreatePaddingPositiveLength()
    {
        assertEquals("     ", formatter.createPadding(5));
    }

    @Test
    public void testCreatePaddingZeroLength()
    {
        assertEquals("", formatter.createPadding(0));
    }

    // ==================================================================
    // 13. rtrim
    // ==================================================================

    @Test
    public void testRtrimNull()
    {
        assertNull(formatter.rtrim(null));
    }

    @Test
    public void testRtrimEmptyString()
    {
        assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void testRtrimNoTrailingWhitespace()
    {
        assertEquals("abc", formatter.rtrim("abc"));
    }

    @Test
    public void testRtrimWithTrailingWhitespace()
    {
        assertEquals("abc", formatter.rtrim("abc   "));
    }

    @Test
    public void testRtrimAllWhitespace()
    {
        assertEquals("", formatter.rtrim("     "));
    }
}

package org.apache.commons.cli;

// import แบบ explicit ตามข้อกำหนด (แม้จะอยู่ package เดียวกันจึงไม่บังคับ แต่ระบุไว้เพื่อความชัดเจน)
import org.apache.commons.cli.HelpFormatter;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link HelpFormatter} (Defects4J Cli-11b).
 *
 * หมายเหตุ: คลาสทดสอบนี้อยู่ package เดียวกับ HelpFormatter (org.apache.commons.cli)
 * เพื่อให้เรียก protected methods ได้ตรง ๆ (Options/Option/OptionGroup/OptionBuilder
 * ก็อยู่ package เดียวกันจึงไม่ต้อง import เพิ่ม)
 *
 * ข้อสมมติ (assumption) ที่ไม่ได้แสดงใน source ที่ให้มา แต่อ้างอิงจาก public API
 * มาตรฐานของ commons-cli (Options/Option/OptionGroup/OptionBuilder) — กำกับด้วยคอมเมนต์
 * ในแต่ละจุดที่ใช้งาน
 */
public class HelpFormatterTest
{
    private HelpFormatter formatter;
    private ByteArrayOutputStream baos;
    private PrintWriter pw;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
        baos = new ByteArrayOutputStream();
        pw = new PrintWriter(baos, true);
    }

    private String output()
    {
        pw.flush();
        return baos.toString();
    }

    // ----------------------------------------------------------------
    // Default values & getter/setter
    // ----------------------------------------------------------------

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
    public void testSettersAndGetters()
    {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(7);
        assertEquals(7, formatter.getDescPadding());

        formatter.setSyntaxPrefix("Usage: ");
        assertEquals("Usage: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\r\n");
        assertEquals("\r\n", formatter.getNewLine());

        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());

        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());

        formatter.setArgName("value");
        assertEquals("value", formatter.getArgName());
    }

    @Test
    public void testSetOptionComparatorNullResetsToDefault()
    {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());

        // ทดสอบพฤติกรรมของ default comparator ทางอ้อม: alphabetical, case-insensitive
        Options options = new Options();
        options.addOption(OptionBuilder.create("b"));
        options.addOption(OptionBuilder.create("A"));

        formatter.printUsage(pw, 80, "app", options);
        String out = output();

        int idxA = out.indexOf("-A");
        int idxB = out.indexOf("-b");
        assertTrue("Default comparator ต้องเรียง 'A' มาก่อน 'b' (ไม่สนตัวพิมพ์)",
                   idxA >= 0 && idxB >= 0 && idxA < idxB);
    }

    @Test
    public void testSetOptionComparatorCustom()
    {
        Comparator reverseComparator = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                Option opt1 = (Option) o1;
                Option opt2 = (Option) o2;
                return opt2.getKey().compareToIgnoreCase(opt1.getKey());
            }
        };
        formatter.setOptionComparator(reverseComparator);
        assertSame(reverseComparator, formatter.getOptionComparator());

        Options options = new Options();
        options.addOption(OptionBuilder.create("a"));
        options.addOption(OptionBuilder.create("b"));

        formatter.printUsage(pw, 80, "app", options);
        String out = output();

        int idxA = out.indexOf("-a");
        int idxB = out.indexOf("-b");
        assertTrue("Custom comparator ต้องเรียง 'b' มาก่อน 'a'", idxB < idxA);
    }

    // ----------------------------------------------------------------
    // printHelp - cmdLineSyntax validation (null/empty)
    // ----------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpNullSyntaxThrows()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpEmptySyntaxThrows()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", false);
    }

    // ----------------------------------------------------------------
    // printHelp - autoUsage true/false branch
    // ----------------------------------------------------------------

    @Test
    public void testPrintHelpAutoUsageTrue()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.isRequired().create("r"));

        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, true);
        String out = output();
        assertTrue(out.indexOf("-r") >= 0);
    }

    @Test
    public void testPrintHelpAutoUsageFalse()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.create("r"));

        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        String out = output();
        assertTrue(out.indexOf("usage: app") >= 0);
    }

    // ----------------------------------------------------------------
    // printHelp - header branches: null / empty / whitespace / non-empty
    // ----------------------------------------------------------------

    @Test
    public void testPrintHelpHeaderNull()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        assertNotNull(output());
    }

    @Test
    public void testPrintHelpHeaderEmpty()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "app", "", options, 1, 3, null, false);
        assertNotNull(output());
    }

    @Test
    public void testPrintHelpHeaderWhitespaceOnly()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "app", "   ", options, 1, 3, null, false);
        assertNotNull(output());
    }

    @Test
    public void testPrintHelpHeaderNonEmpty()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "app", "MY_HEADER_TEXT", options, 1, 3, null, false);
        assertTrue(output().contains("MY_HEADER_TEXT"));
    }

    // ----------------------------------------------------------------
    // printHelp - footer branches: null / empty / whitespace / non-empty
    // ----------------------------------------------------------------

    @Test
    public void testPrintHelpFooterNull()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        assertNotNull(output());
    }

    @Test
    public void testPrintHelpFooterEmpty()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, "", false);
        assertNotNull(output());
    }

    @Test
    public void testPrintHelpFooterWhitespaceOnly()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, "   ", false);
        assertNotNull(output());
    }

    @Test
    public void testPrintHelpFooterNonEmpty()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, "MY_FOOTER_TEXT", false);
        assertTrue(output().contains("MY_FOOTER_TEXT"));
    }

    // ----------------------------------------------------------------
    // printHelp overloads (smoke tests - เขียนไป System.out, ตรวจว่าไม่ throw)
    // ----------------------------------------------------------------

    @Test
    public void testPrintHelpTwoArgOverload()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.create("a"));
        formatter.printHelp("app", options);
    }

    @Test
    public void testPrintHelpThreeArgOverloadAutoUsage()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.create("a"));
        formatter.printHelp("app", options, true);
        formatter.printHelp("app", options, false);
    }

    @Test
    public void testPrintHelpFourArgOverload()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.create("a"));
        formatter.printHelp("app", "header", options, "footer");
    }

    @Test
    public void testPrintHelpFiveArgOverload()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.create("a"));
        formatter.printHelp("app", "header", options, "footer", true);
    }

    @Test
    public void testPrintHelpWidthFiveArgOverload()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.create("a"));
        formatter.printHelp(100, "app", "header", options, "footer");
    }

    @Test
    public void testPrintHelpPwEightArgOverload()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.create("a"));
        formatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer");
        assertTrue(output().length() > 0);
    }

    // ----------------------------------------------------------------
    // printUsage - OptionGroup handling (required/not, single/multi)
    // ----------------------------------------------------------------

    @Test
    public void testPrintUsageRequiredOptionNoGroup()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.isRequired().create("a"));

        formatter.printUsage(pw, 80, "app", options);
        String out = output();
        assertTrue(out.contains("-a"));
        assertFalse(out.contains("[-a]"));
    }

    @Test
    public void testPrintUsageOptionalOptionNoGroup()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.create("a"));

        formatter.printUsage(pw, 80, "app", options);
        assertTrue(output().contains("[-a]"));
    }

    @Test
    public void testPrintUsageOptionGroupRequired()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(OptionBuilder.create("a"));
        group.addOption(OptionBuilder.create("b"));
        group.setRequired(true);
        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "app", options);
        String out = output();
        assertTrue(out.contains("-a"));
        assertTrue(out.contains("-b"));
        assertTrue(out.contains(" | "));
        assertFalse(out.contains("[-a | -b]"));
    }

    @Test
    public void testPrintUsageOptionGroupNotRequired()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(OptionBuilder.create("a"));
        group.addOption(OptionBuilder.create("b"));
        group.setRequired(false);
        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "app", options);
        assertTrue(output().contains("[-a | -b]"));
    }

    @Test
    public void testPrintUsageOptionGroupSingleOption()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(OptionBuilder.create("a"));
        group.setRequired(false);
        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "app", options);
        String out = output();
        assertTrue(out.contains("[-a]"));
        assertFalse(out.contains(" | "));
    }

    @Test
    public void testPrintUsageMultipleOptionsSpacing()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.create("a"));
        options.addOption(OptionBuilder.create("b"));

        formatter.printUsage(pw, 80, "app", options);
        assertTrue(output().contains("[-a] [-b]"));
    }

    @Test
    public void testPrintUsageLongOptOnly()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.withLongOpt("aaa").create());

        formatter.printUsage(pw, 80, "app", options);
        assertTrue(output().contains("--aaa"));
    }

    @Test
    public void testPrintUsageHasArgWithArgName()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.hasArg().withArgName("val").create("a"));

        formatter.printUsage(pw, 80, "app", options);
        assertTrue(output().contains("-a <val>"));
    }

    @Test
    public void testPrintUsageHasArgNoArgName()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.hasArg().create("a"));

        formatter.printUsage(pw, 80, "app", options);
        assertFalse(output().contains("<"));
    }

    // ----------------------------------------------------------------
    // printUsage(pw, width, cmdLineSyntax) - 3-arg overload
    // ----------------------------------------------------------------

    @Test
    public void testPrintUsageThreeArgs()
    {
        formatter.printUsage(pw, 80, "app -a -b");
        assertTrue(output().startsWith(HelpFormatter.DEFAULT_SYNTAX_PREFIX + "app"));
    }

    // ----------------------------------------------------------------
    // printOptions
    // ----------------------------------------------------------------

    @Test
    public void testPrintOptions()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.withDescription("desc").create("a"));

        formatter.printOptions(pw, 80, options, 1, 3);
        String out = output();
        assertTrue(out.contains("-a"));
        assertTrue(out.contains("desc"));
    }

    // ----------------------------------------------------------------
    // printWrapped
    // ----------------------------------------------------------------

    @Test
    public void testPrintWrappedShortTextNoWrap()
    {
        formatter.printWrapped(pw, 80, "short text");
        assertTrue(output().contains("short text"));
    }

    @Test
    public void testPrintWrappedLongTextWithTabStop()
    {
        String longText = "This is a very long piece of text that should be wrapped "
                + "across multiple lines when the given width is small enough "
                + "to force wrapping to occur more than once in the loop.";
        formatter.printWrapped(pw, 20, 4, longText);
        String out = output();
        assertTrue(out.length() > 0);
        int lineCount = out.split(formatter.getNewLine()).length;
        assertTrue(lineCount > 1);
    }

    // ----------------------------------------------------------------
    // renderOptions (protected) - direct tests
    // ----------------------------------------------------------------

    @Test
    public void testRenderOptionsShortOptOnly()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.withDescription("d").create("a"));

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String out = sb.toString();
        assertTrue(out.contains("-a"));
        assertTrue(out.contains("d"));
    }

    @Test
    public void testRenderOptionsShortWithLongOpt()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.withLongOpt("aaa").withDescription("d").create("a"));

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.toString().contains("-a,--aaa"));
    }

    @Test
    public void testRenderOptionsLongOptOnly()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.withLongOpt("aaa").withDescription("d").create());

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.toString().contains("--aaa"));
    }

    @Test
    public void testRenderOptionsHasArgWithArgName()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.hasArg().withArgName("val").withDescription("d").create("a"));

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.toString().contains("<val>"));
    }

    @Test
    public void testRenderOptionsHasArgNoArgName()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.hasArg().withDescription("d").create("a"));

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertFalse(sb.toString().contains("<"));
    }

    @Test
    public void testRenderOptionsDescriptionNull()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.create("a")); // ไม่มี description

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.toString().contains("-a"));
    }

    @Test
    public void testRenderOptionsMultipleOptionsNewlineSeparator()
    {
        Options options = new Options();
        options.addOption(OptionBuilder.withDescription("d1").create("a"));
        options.addOption(OptionBuilder.withDescription("d2").create("b"));

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.toString().contains(formatter.getNewLine()));
    }

    // ----------------------------------------------------------------
    // renderWrappedText (protected)
    // ----------------------------------------------------------------

    @Test
    public void testRenderWrappedTextFitsOneLine()
    {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 80, 0, "short text");
        assertEquals("short text", sb.toString());
    }

    @Test
    public void testRenderWrappedTextMultipleLines()
    {
        StringBuffer sb = new StringBuffer();
        String text = "aaaaa bbbbb ccccc ddddd eeeee fffff ggggg hhhhh";
        formatter.renderWrappedText(sb, 12, 2, text);
        assertTrue(sb.toString().contains(formatter.getNewLine()));
    }

    // ----------------------------------------------------------------
    // findWrapPos (protected) - ครอบคลุมทุก branch
    // ----------------------------------------------------------------

    @Test
    public void testFindWrapPosNewlineWithinWidth()
    {
        String text = "abc\ndef";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPosTabWithinWidth()
    {
        String text = "abc\tdef"; // ไม่มี '\n' แต่มี '\t'
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPosTextFitsWithinWidthReturnsMinusOne()
    {
        String text = "short";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPosWhitespaceFoundBeforeWidth()
    {
        String text = "aaaaa bbbbb ccccc ddddd";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertTrue(pos > 0 && pos <= 10);
        assertEquals(' ', text.charAt(pos));
    }

    @Test
    public void testFindWrapPosNoWhitespaceBeforeWidthSearchesForward()
    {
        String text = "aaaaaaaaaa bbbbbbbbbb"; // 10a + space + 10b, length 21
        int pos = formatter.findWrapPos(text, 5, 0);
        assertTrue(pos >= 5);
    }

    /**
     * กรณีข้อความยาวคำเดียวไม่มี whitespace เลย และการค้นหาไปข้างหน้า (forward search)
     * ต้องเดินจนถึงจุดสิ้นสุดข้อความ โค้ดต้นฉบับมีเงื่อนไข (pos <= text.length())
     * ซึ่งอาจทำให้เกิด StringIndexOutOfBoundsException เมื่อ pos == text.length()
     * แล้วเรียก text.charAt(pos) — นี่คือจุดที่คาดว่าจะดักจับ fault ตาม Defects4J Cli-11b ได้
     */
    @Test
    public void testFindWrapPosLongSingleWordNoWhitespace()
    {
        String text = "aaaaaaaaaa" + "aaaaaaaaaa"; // 20 ตัวอักษร ไม่มี whitespace
        try
        {
            int pos = formatter.findWrapPos(text, 5, 0);
            assertEquals(-1, pos);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            fail("พบข้อบกพร่องที่คาดว่ามีจริงตาม Defects4J Cli-11b: "
                 + "StringIndexOutOfBoundsException ใน findWrapPos เมื่อค้นหาเกินขอบข้อความ: "
                 + e.getMessage());
        }
    }

    // ----------------------------------------------------------------
    // createPadding (protected)
    // ----------------------------------------------------------------

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

    // ----------------------------------------------------------------
    // rtrim (protected)
    // ----------------------------------------------------------------

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
        assertEquals("", formatter.rtrim("   "));
    }
}

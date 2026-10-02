package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test สำหรับ HelpFormatter (Defects4J Cli-25b)
 *
 * หมายเหตุ:
 * - ใช้ JUnit4 annotation ตามที่ระบุไว้ในข้อกำหนดที่ 2 (แม้ classpath ที่ระบุ
 *   จะเป็น junit-3.8.1.jar ก็ตาม สมมติว่ามี JUnit4 runner ประกอบอยู่ในสภาพแวดล้อมทดสอบจริง)
 * - Option/Options/OptionGroup ไม่มีซอร์สโค้ดมาให้ จึงอ้างอิง API มาตรฐานของ
 *   Apache Commons-CLI ที่ใช้ตรงกับลายเซ็นเมธอดที่ปรากฏใน HelpFormatter เอง
 *   (getOpt(), getLongOpt(), hasArg(), hasArgName(), hasLongOpt(), getKey(),
 *   getDescription(), isRequired() ฯลฯ) — จุดที่ไม่มั่นใจจะคอมเมนต์ ASSUMPTION ไว้
 */
public class HelpFormatterTest
{
    private HelpFormatter formatter;
    private PrintStream originalOut;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
        originalOut = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown()
    {
        System.setOut(originalOut);
    }

    // =================================================================
    // Getter / Setter / Default value
    // =================================================================

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
    }

    @Test
    public void testSetGetWidth()
    {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    @Test
    public void testSetGetLeftPadding()
    {
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void testSetGetDescPadding()
    {
        formatter.setDescPadding(7);
        assertEquals(7, formatter.getDescPadding());
    }

    @Test
    public void testSetGetSyntaxPrefix()
    {
        formatter.setSyntaxPrefix("call: ");
        assertEquals("call: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void testSetGetNewLine()
    {
        formatter.setNewLine("\r\n");
        assertEquals("\r\n", formatter.getNewLine());
    }

    @Test
    public void testSetGetOptPrefix()
    {
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
    }

    @Test
    public void testSetGetLongOptPrefix()
    {
        formatter.setLongOptPrefix("==");
        assertEquals("==", formatter.getLongOptPrefix());
    }

    @Test
    public void testSetGetArgName()
    {
        formatter.setArgName("value");
        assertEquals("value", formatter.getArgName());
    }

    @Test
    public void testGetOptionComparatorDefaultNotNull()
    {
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorNullResetsToDefault()
    {
        // branch: comparator == null -> ใช้ OptionComparator ภายในแทน (ไม่ null)
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorCustom()
    {
        // branch: comparator != null -> ใช้ comparator ที่ส่งเข้ามา
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

    // =================================================================
    // printHelp(PrintWriter,...) - validation & branch header/footer/autoUsage
    // =================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpNullSyntaxThrows()
    {
        PrintWriter pw = new PrintWriter(new StringWriter());
        formatter.printHelp(pw, 80, null, null, new Options(), 1, 3, null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpEmptySyntaxThrows()
    {
        PrintWriter pw = new PrintWriter(new StringWriter());
        formatter.printHelp(pw, 80, "", null, new Options(), 1, 3, null, false);
    }

    @Test
    public void testPrintHelpAutoUsageTrue()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option")); // ASSUMPTION: ctor(opt,hasArg,desc)
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, true);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("usage: app"));
        assertTrue(result.contains("-a"));
    }

    @Test
    public void testPrintHelpAutoUsageFalse()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        pw.flush();
        assertTrue(sw.toString().contains("usage: app"));
    }

    @Test
    public void testPrintHelpWithHeaderAndFooterPrinted()
    {
        // branch: header/footer != null และ trim().length() > 0 -> ถูกพิมพ์
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", "HEADER TEXT", options, 1, 3, "FOOTER TEXT", false);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("HEADER TEXT"));
        assertTrue(result.contains("FOOTER TEXT"));
    }

    @Test
    public void testPrintHelpWithNullHeaderAndFooterSkipped()
    {
        // branch: header/footer == null -> ไม่ถูกพิมพ์ (ไม่ throw)
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        pw.flush();
        assertNotNull(sw.toString());
    }

    @Test
    public void testPrintHelpWithBlankHeaderAndFooterSkipped()
    {
        // branch: header/footer != null แต่ trim().length()==0 -> ไม่ถูกพิมพ์
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", "   ", options, 1, 3, "   ", false);
        pw.flush();
        assertNotNull(sw.toString());
    }

    // =================================================================
    // printHelp overload delegation (smoke test ผ่าน System.out)
    // =================================================================

    @Test
    public void testPrintHelpTwoArgOverload()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp("app", options);
        assertTrue(outContent.toString().length() > 0);
    }

    @Test
    public void testPrintHelpThreeArgOverloadAutoUsageTrue()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp("app", options, true);
        assertTrue(outContent.toString().length() > 0);
    }

    @Test
    public void testPrintHelpFourArgOverload()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp("app", "header", options, "footer");
        assertTrue(outContent.toString().length() > 0);
    }

    @Test
    public void testPrintHelpFiveArgOverload()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp("app", "header", options, "footer", true);
        assertTrue(outContent.toString().length() > 0);
    }

    @Test
    public void testPrintHelpWidthFiveArgOverload()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "the a option"));
        formatter.printHelp(80, "app", "header", options, "footer");
        assertTrue(outContent.toString().length() > 0);
    }

    // =================================================================
    // printUsage(pw,width,app,options) - loop/group branches
    // =================================================================

    @Test
    public void testPrintUsageNoOptions()
    {
        Options options = new Options(); // loop ไม่ execute เลย
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().trim().startsWith("usage: app"));
    }

    @Test
    public void testPrintUsageSingleRequiredOptionNoGroup()
    {
        Options options = new Options();
        Option opt = new Option("a", false, "opt a");
        opt.setRequired(true); // ASSUMPTION: setter มาตรฐานของ Option
        options.addOption(opt);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("-a"));
        assertFalse(result.contains("[-a]")); // required -> ไม่มี bracket
    }

    @Test
    public void testPrintUsageSingleOptionalOptionNoGroup()
    {
        Options options = new Options();
        Option opt = new Option("a", false, "opt a");
        opt.setRequired(false);
        options.addOption(opt);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().contains("[-a]")); // optional -> มี bracket
    }

    @Test
    public void testPrintUsageOptionGroupRequired()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", false, "opt a");
        Option opt2 = new Option("b", false, "opt b");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        assertFalse(result.contains("[-a | -b]"));
        assertTrue(result.contains("-a | -b") || result.contains("-b | -a"));
    }

    @Test
    public void testPrintUsageOptionGroupNotRequired()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", false, "opt a");
        Option opt2 = new Option("b", false, "opt b");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(false);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("[-a | -b]") || result.contains("[-b | -a]"));
    }

    @Test
    public void testPrintUsageOptionGroupOnlyProcessedOnce()
    {
        // branch: processedGroups.contains(group) == true -> ข้าม (option ที่ 2 ในกลุ่มเดียวกัน)
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", false, "opt a");
        Option opt2 = new Option("b", false, "opt b");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        int firstIdx = result.indexOf("-a");
        int lastIdx = result.lastIndexOf("-a");
        assertEquals("กลุ่มเดียวกันต้องถูก render เพียงครั้งเดียว", firstIdx, lastIdx);
    }

    @Test
    public void testPrintUsageMixedGroupAndNonGroupOptions()
    {
        // branch: option ไม่ได้อยู่ใน group -> else -> appendOption ตรง ๆ
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "opt a"));
        group.addOption(new Option("b", false, "opt b"));
        group.setRequired(false);
        options.addOptionGroup(group);
        options.addOption(new Option("c", false, "opt c"));

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().contains("-c"));
    }

    // =================================================================
    // appendOption branches (ทดสอบผ่าน printUsage)
    // =================================================================

    @Test
    public void testPrintUsageOptionWithLongOptOnly()
    {
        // branch: option.getOpt() == null -> ใช้ "--" + longOpt
        Options options = new Options();
        options.addOption(new Option(null, "alpha", false, "long opt only")); // ASSUMPTION: ctor 4-arg รองรับ opt=null
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().contains("--alpha"));
    }

    @Test
    public void testPrintUsageOptionWithArgAndArgName()
    {
        Options options = new Options();
        Option opt = new Option("a", true, "opt with arg");
        opt.setArgName("value");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().contains("<value>"));
    }

    @Test
    public void testPrintUsageOptionWithArgNoArgName()
    {
        Options options = new Options();
        Option opt = new Option("a", true, "opt with arg");
        opt.setArgName(null); // ASSUMPTION: hasArgName() = false เมื่อ argName null/ว่าง
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertFalse(sw.toString().contains("<"));
    }

    // =================================================================
    // printUsage(pw,width,cmdLineSyntax) - overload อย่างง่าย
    // =================================================================

    @Test
    public void testPrintUsageSimpleOverload()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app arg1 arg2");
        pw.flush();
        assertTrue(sw.toString().contains("usage: app arg1 arg2"));
    }

    // =================================================================
    // renderOptions branches
    // =================================================================

    @Test
    public void testRenderOptionsShortOptOnly()
    {
        Options options = new Options();
        options.addOption(new Option("a", "description a")); // ASSUMPTION: ctor(opt,desc) ไม่มี long opt
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("description a"));
    }

    @Test
    public void testRenderOptionsShortAndLongOpt()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "description a")); // ASSUMPTION: ctor(opt,longOpt,hasArg,desc)
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("--aaa"));
    }

    @Test
    public void testRenderOptionsLongOptOnly()
    {
        Options options = new Options();
        options.addOption(new Option(null, "alpha", false, "long only"));
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.toString().contains("--alpha"));
    }

    @Test
    public void testRenderOptionsWithArgAndArgName()
    {
        Options options = new Options();
        Option opt = new Option("a", true, "opt with arg");
        opt.setArgName("value");
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.toString().contains("<value>"));
    }

    @Test
    public void testRenderOptionsWithArgNoArgName()
    {
        Options options = new Options();
        Option opt = new Option("a", true, "opt with arg");
        opt.setArgName(null);
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertFalse(sb.toString().contains("<"));
    }

    @Test
    public void testRenderOptionsNoArg()
    {
        // branch: hasArg() == false -> ข้าม block ของ arg
        Options options = new Options();
        options.addOption(new Option("a", false, "no arg opt"));
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.toString().contains("-a"));
    }

    @Test
    public void testRenderOptionsNullDescription()
    {
        // branch: option.getDescription() == null -> ไม่ append description, ไม่ throw NPE
        Options options = new Options();
        Option opt = new Option("a", false, "temp");
        opt.setDescription(null); // ASSUMPTION: setter มาตรฐาน
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertNotNull(sb.toString());
    }

    @Test
    public void testRenderOptionsMultipleOptionsNewLineBetween()
    {
        // branch: i.hasNext() == true -> append newline ระหว่าง option
        Options options = new Options();
        options.addOption(new Option("a", false, "desc a"));
        options.addOption(new Option("b", false, "desc b"));
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertTrue(sb.toString().contains(formatter.getNewLine()));
    }

    @Test
    public void testRenderOptionsPaddingWhenShorterThanMax()
    {
        // branch: optBuf.length() < max -> ต้อง createPadding เพิ่ม
        Options options = new Options();
        options.addOption(new Option("a", false, "short"));
        options.addOption(new Option("bb", "longlongopt", false, "long"));
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertNotNull(sb.toString());
    }

    // =================================================================
    // renderWrappedText branches
    // =================================================================

    @Test
    public void testRenderWrappedTextNoWrapNeeded()
    {
        // branch: pos == -1 -> append rtrim(text) แล้ว return ทันที
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 80, 0, "short text");
        assertEquals("short text", sb.toString());
    }

    @Test
    public void testRenderWrappedTextWithWrap()
    {
        StringBuffer sb = new StringBuffer();
        String text = "This is a long piece of text that should be wrapped at width value here";
        formatter.renderWrappedText(sb, 20, 0, text);
        assertTrue(sb.toString().contains(formatter.getNewLine()));
    }

    @Test
    public void testRenderWrappedTextNextLineTabStopGreaterThanWidth()
    {
        // branch: nextLineTabStop >= width -> ปรับเป็น width-1
        StringBuffer sb = new StringBuffer();
        String text = "aaaaaaaaaa bbbbbbbbbb cccccccccc dddddddddd";
        formatter.renderWrappedText(sb, 10, 15, text);
        assertNotNull(sb.toString());
    }

    @Test
    public void testRenderWrappedTextMultipleLinesLoop()
    {
        // branch: loop ทำงานซ้ำหลายรอบก่อนพบ pos == -1
        StringBuffer sb = new StringBuffer();
        String text = "one two three four five six seven eight nine ten eleven twelve";
        formatter.renderWrappedText(sb, 10, 0, text);
        String result = sb.toString();
        int count = 0, idx = 0;
        String nl = formatter.getNewLine();
        while ((idx = result.indexOf(nl, idx)) != -1)
        {
            count++;
            idx += nl.length();
        }
        assertTrue("ควร wrap มากกว่า 1 ครั้ง", count > 1);
    }

    // หมายเหตุ: branch เฉพาะ (text.length() > width) && (pos == nextLineTabStop - 1)
    // ภายใน renderWrappedText เป็นเงื่อนไขซับซ้อนที่ขึ้นกับ interaction ระหว่าง
    // findWrapPos/padding/tabstop พร้อมกัน — ไม่สามารถยืนยัน input ที่ trigger ได้แน่นอน
    // จาก static analysis เพียงอย่างเดียว จึงไม่ assert ผลลัพธ์เฉพาะเจาะจง (ตามข้อกำหนดที่ 4)
    @Test
    public void testRenderWrappedTextEdgeTabStopBoundaryNoException()
    {
        StringBuffer sb = new StringBuffer();
        String text = "aaaa bbbb cccccccccccccccccc";
        formatter.renderWrappedText(sb, 5, 4, text);
        assertNotNull(sb.toString());
    }

    // =================================================================
    // findWrapPos branches
    // =================================================================

    @Test
    public void testFindWrapPosNewlineBeforeWidth()
    {
        String text = "abc\ndef";
        assertEquals(4, formatter.findWrapPos(text, 10, 0));
    }

    @Test
    public void testFindWrapPosTabBeforeWidth()
    {
        String text = "abc\tdef";
        assertEquals(4, formatter.findWrapPos(text, 10, 0));
    }

    @Test
    public void testFindWrapPosEndOfTextWithinWidth()
    {
        // branch: startPos + width >= text.length() -> return -1
        String text = "short";
        assertEquals(-1, formatter.findWrapPos(text, 80, 0));
    }

    @Test
    public void testFindWrapPosBackwardSearchFindsSpace()
    {
        String text = "aaaaa bbbbbbbbbb"; // space ที่ index 5
        assertEquals(5, formatter.findWrapPos(text, 10, 0));
    }

    @Test
    public void testFindWrapPosForwardSearchFindsSpace()
    {
        // backward search ไม่พบ whitespace -> forward search พบที่ index 12
        String text = "aaaaaaaaaaaa bbbb";
        assertEquals(12, formatter.findWrapPos(text, 5, 0));
    }

    /**
     * NOTE / FAULT-DETECTION TEST:
     * ตาม Javadoc ของ findWrapPos ถ้าหา whitespace ไม่พบเลยจนถึงท้ายข้อความ
     * ควร return -1 แต่จากการ trace source พบว่า loop forward-search ใช้เงื่อนไข
     * `pos <= text.length()` แล้วเรียก text.charAt(pos) ทันที ซึ่งเมื่อ pos == length
     * จะทำให้เกิด StringIndexOutOfBoundsException แทนที่จะ return -1
     * (สงสัยว่าเป็น fault ที่ตรงกับ Defects4J Cli-25)
     * เทสนี้ตั้งใจดักจับพฤติกรรมที่ผิดตาม contract ของ Javadoc
     */
    @Test
    public void testFindWrapPosNoWhitespaceAtAll_ExpectMinusOnePerJavadoc()
    {
        String text = "aaaaa"; // ไม่มี whitespace เลย
        int pos = formatter.findWrapPos(text, 1, 0);
        assertEquals(-1, pos);
    }

    // =================================================================
    // createPadding branches
    // =================================================================

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

    // =================================================================
    // rtrim branches
    // =================================================================

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

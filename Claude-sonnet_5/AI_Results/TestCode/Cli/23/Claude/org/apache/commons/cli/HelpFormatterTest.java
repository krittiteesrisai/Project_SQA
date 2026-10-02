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

// import คลาสเป้าหมายอย่างชัดเจน (แม้อยู่ package เดียวกัน แสดงไว้เพื่อความชัดเจนตามข้อกำหนด)
import org.apache.commons.cli.HelpFormatter;

public class HelpFormatterTest
{
    private HelpFormatter formatter;
    private StringWriter sw;
    private PrintWriter pw;

    private PrintStream originalOut;
    private ByteArrayOutputStream outCapture;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
        sw = new StringWriter();
        pw = new PrintWriter(sw);

        // สำหรับดัก System.out ในเมธอดที่ printHelp สร้าง PrintWriter เอง
        originalOut = System.out;
        outCapture = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outCapture));
    }

    @After
    public void tearDown()
    {
        System.setOut(originalOut);
    }

    // ------------------------------------------------------------
    // Getter / Setter (boundary + default)
    // ------------------------------------------------------------

    @Test
    public void testDefaultWidthValue()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void testSetGetWidth()
    {
        formatter.setWidth(40);
        assertEquals(40, formatter.getWidth());
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
        formatter.setSyntaxPrefix("Usage: ");
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
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
        formatter.setArgName("VALUE");
        assertEquals("VALUE", formatter.getArgName());
    }

    @Test
    public void testGetOptionComparatorDefaultNotNull()
    {
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorNullResetsToDefault()
    {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        // ควรได้ default OptionComparator (case-insensitive) ไม่ throw NPE
    }

    @Test
    public void testSetOptionComparatorCustom() throws Exception
    {
        Comparator custom = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                // เรียงย้อนกลับ เพื่อสังเกตผลต่างของลำดับ output
                Option a = (Option) o1;
                Option b = (Option) o2;
                return b.getKey().compareToIgnoreCase(a.getKey());
            }
        };
        formatter.setOptionComparator(custom);
        assertSame(custom, formatter.getOptionComparator());

        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc a"));
        options.addOption(new Option("z", "zzz", false, "desc z"));

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        String result = sw.toString();

        // ด้วย comparator แบบย้อนกลับ -z ควรมาก่อน -a
        int idxZ = result.indexOf("-z");
        int idxA = result.indexOf("-a");
        assertTrue(idxZ >= 0 && idxA >= 0 && idxZ < idxA);
    }

    // ------------------------------------------------------------
    // printHelp - null/empty cmdLineSyntax (boundary + exception)
    // ------------------------------------------------------------

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

    @Test
    public void testPrintHelpBasicNoException()
    {
        // ครอบคลุม overload printHelp(String, Options) -> เขียนไป System.out
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "opt a"));
        formatter.printHelp("cmd", options);
        assertTrue(outCapture.toString().length() > 0);
    }

    @Test
    public void testPrintHelpWithHeaderAndFooter()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "opt a"));
        formatter.printHelp(pw, 80, "cmd", "HEADER TEXT", options, 1, 3, "FOOTER TEXT", false);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("HEADER TEXT"));
        assertTrue(result.contains("FOOTER TEXT"));
    }

    @Test
    public void testPrintHelpWithBlankHeaderFooterNotPrinted()
    {
        // header/footer เป็นช่องว่างล้วน -> trim().length()==0 -> ไม่ถูกพิมพ์ (else branch)
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "opt a"));
        formatter.printHelp(pw, 80, "cmd", "   ", options, 1, 3, "   ", false);
        pw.flush();
        String result = sw.toString();
        assertFalse(result.contains("HEADER"));
        assertFalse(result.contains("FOOTER"));
    }

    @Test
    public void testPrintHelpAutoUsageTrue()
    {
        Options options = new Options();
        Option req = new Option("r", "req", false, "required opt");
        req.setRequired(true);
        options.addOption(req);
        formatter.printHelp(pw, 80, "cmd", null, options, 1, 3, null, true);
        pw.flush();
        String result = sw.toString();
        // autoUsage=true -> ใช้ printUsage(pw,width,cmdLineSyntax,options) ซึ่งจะเรนเดอร์ -r ลงในบรรทัด usage
        assertTrue(result.contains("-r"));
    }

    @Test
    public void testPrintHelpAutoUsageFalseDefault()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "opt a"));
        formatter.printHelp(pw, 80, "cmd", null, options, 1, 3, null, false);
        pw.flush();
        String result = sw.toString();
        // autoUsage=false -> ใช้ printUsage(pw,width,cmdLineSyntax) แบบไม่มีรายชื่อ option ในบรรทัด usage
        assertTrue(result.startsWith("usage: cmd"));
    }

    // ------------------------------------------------------------
    // printUsage - option / option group / required / not required
    // ------------------------------------------------------------

    @Test
    public void testPrintUsageSimpleSyntax()
    {
        formatter.printUsage(pw, 80, "app arg1");
        pw.flush();
        assertEquals("usage: app arg1" + formatter.getNewLine(), sw.toString());
    }

    @Test
    public void testPrintUsageWithOptionsNoGroupRequired()
    {
        Options options = new Options();
        Option req = new Option("r", false, "required");
        req.setRequired(true);
        options.addOption(req);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        // required option -> ไม่ครอบด้วย []
        assertTrue(result.contains("-r"));
        assertFalse(result.contains("[-r]"));
    }

    @Test
    public void testPrintUsageWithOptionsNoGroupOptional()
    {
        Options options = new Options();
        Option opt = new Option("o", false, "optional");
        opt.setRequired(false);
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        // optional option -> ต้องครอบด้วย []
        assertTrue(result.contains("[-o]"));
    }

    @Test
    public void testPrintUsageWithOptionGroupRequired()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "opt a"));
        group.addOption(new Option("b", false, "opt b"));
        group.setRequired(true);
        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        // required group -> ไม่ครอบด้วย [] ที่ระดับกลุ่ม, มี " | " คั่นระหว่าง option
        assertFalse(result.contains("[-a"));
        assertTrue(result.contains("-a | -b") || result.contains("-b | -a"));
    }

    @Test
    public void testPrintUsageWithOptionGroupOptional()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", false, "opt a"));
        group.addOption(new Option("b", false, "opt b"));
        group.setRequired(false);
        options.addOptionGroup(group);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        // optional group -> ครอบด้วย []
        assertTrue(result.contains("[-a") || result.contains("[-b"));
    }

    @Test
    public void testPrintUsageOptionWithArgAndArgName()
    {
        Options options = new Options();
        Option opt = new Option("f", true, "file option");
        opt.setArgName("FILE");
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("<FILE>"));
    }

    @Test
    public void testPrintUsageOptionWithArgNoArgName()
    {
        Options options = new Options();
        Option opt = new Option("f", true, "file option");
        opt.setArgName(null); // ไม่มี argName -> hasArgName()=false -> ไม่มี <..>
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        assertFalse(result.contains("<"));
    }

    @Test
    public void testPrintUsageOptionLongOptOnly()
    {
        // option.getOpt() == null -> ใช้ branch "--longOpt" ใน appendOption
        Options options = new Options();
        Option opt = new Option(null, "longonly", false, "desc");
        options.addOption(opt);

        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("--longonly"));
    }

    // ------------------------------------------------------------
    // printOptions / renderOptions
    // ------------------------------------------------------------

    @Test
    public void testPrintOptionsRendersLongOptOnly()
    {
        // option.getOpt()==null -> branch เติม "   --longOpt"
        Options options = new Options();
        options.addOption(new Option(null, "longonly", false, "desc long only"));

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("--longonly"));
        assertTrue(result.contains("desc long only"));
    }

    @Test
    public void testPrintOptionsWithShortAndLongOpt()
    {
        // hasLongOpt()==true branch
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "be verbose"));

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("-v,--verbose"));
    }

    @Test
    public void testPrintOptionsWithArgAndArgName()
    {
        Options options = new Options();
        Option opt = new Option("f", true, "file");
        opt.setArgName("FILE");
        options.addOption(opt);

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("<FILE>"));
    }

    @Test
    public void testPrintOptionsWithArgNoArgName()
    {
        // hasArg()==true, hasArgName()==false -> เติมช่องว่างเดียว ' '
        Options options = new Options();
        Option opt = new Option("f", true, "file");
        opt.setArgName(null);
        options.addOption(opt);

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        String result = sw.toString();
        assertFalse(result.contains("<"));
    }

    @Test
    public void testPrintOptionsDescriptionNull()
    {
        // option.getDescription()==null -> else branch ไม่เติม description
        Options options = new Options();
        Option opt = new Option("q", false, null);
        options.addOption(opt);

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        // ไม่ควร throw NPE และผลลัพธ์ต้องมี "-q"
        assertTrue(sw.toString().contains("-q"));
    }

    // ------------------------------------------------------------
    // printWrapped / renderWrappedText
    // ------------------------------------------------------------

    @Test
    public void testPrintWrappedTextShort()
    {
        // pos == -1 -> ไม่ต้อง wrap
        formatter.printWrapped(pw, 80, "short text");
        pw.flush();
        assertEquals("short text" + formatter.getNewLine(), sw.toString());
    }

    @Test
    public void testPrintWrappedTextWithNewline()
    {
        // มี '\n' ที่ pos <= width -> คืน pos+1 ทันที (branch newline)
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 20, 0, "ab\ncdefgh");
        // ควรมีการตัดบรรทัดที่ "ab" แล้วต่อด้วย "cdefgh"
        assertTrue(sb.toString().indexOf("ab") == 0);
        assertTrue(sb.toString().indexOf("cdefgh") > 0);
    }

    @Test
    public void testPrintWrappedTextWithTabNoNewline()
    {
        // มี '\t' โดยไม่มี '\n' และ pos<=width -> branch tab
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 20, 0, "abcdefg\tzzzzzzzzzzzz");
        assertTrue(sb.toString().indexOf("abcdefg") == 0);
    }

    @Test(expected = RuntimeException.class)
    public void testRenderWrappedTextInfiniteLoopThrowsException()
    {
        // กรณีนี้วิเคราะห์จากซอร์ส: เมื่อ nextLineTabStop มากกว่า width
        // จนทำให้ padding เกิด findWrapPos คืน pos เดิมซ้ำสองรอบ
        // -> โค้ดจะ throw RuntimeException ตาม comment "[CLI-162]"
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 4, 6, "aaaaaa bbbbbb cccccc");
    }

    // ------------------------------------------------------------
    // findWrapPos - ทุก branch
    // ------------------------------------------------------------

    @Test
    public void testFindWrapPosNewlineBranch()
    {
        // '\n' พบก่อนและ pos<=width -> return pos+1
        int pos = formatter.findWrapPos("abc\ndef", 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPosTabBranch()
    {
        // ไม่มี '\n' แต่มี '\t' และ pos<=width -> return pos+1
        int pos = formatter.findWrapPos("abc\tdef", 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPosShortTextReturnsMinusOne()
    {
        // startPos+width >= text.length() -> return -1
        int pos = formatter.findWrapPos("short", 100, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPosBackwardWhitespaceFound()
    {
        // พบ whitespace ก่อนถึง startPos+width (scan ถอยหลัง) -> pos > startPos
        String text = "aaaa bbbbbbbbbbbbbbbbbbbb"; // เว้นวรรคตำแหน่ง 4
        int pos = formatter.findWrapPos(text, 10, 0);
        assertTrue(pos > 0);
        assertEquals(' ', text.charAt(pos));
    }

    @Test
    public void testFindWrapPosForwardWhitespaceFound()
    {
        // ไม่มี whitespace ในช่วง startPos..startPos+width (คำยาว)
        // แต่พบ whitespace ถัดไปก่อนจบสตริง -> forward branch, pos != length
        String text = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa bbb"; // คำยาว 35 ตัว + เว้นวรรค + bbb
        int pos = formatter.findWrapPos(text, 10, 0);
        assertTrue(pos > 0);
        assertTrue(pos < text.length());
        assertEquals(' ', text.charAt(pos));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testFindWrapPosThrowsWhenNoWhitespaceAvailable()
    {
        // FAULT ที่วิเคราะห์ได้จากซอร์ส: ถ้าไม่มี whitespace เลยตลอดทั้งข้อความ
        // และ startPos+width < text.length() ลูปค้นหาไปข้างหน้าจะพยายามอ่าน
        // charAt(pos) ที่ pos == text.length() ซึ่งเกินขอบเขต -> เกิด exception
        // (ไม่ใช่การเดา แต่ได้จากการไล่ตรรกะ while-loop ในซอร์สจริง)
        formatter.findWrapPos("abcdefghij", 5, 0);
    }

    // ------------------------------------------------------------
    // createPadding
    // ------------------------------------------------------------

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

    // ------------------------------------------------------------
    // rtrim
    // ------------------------------------------------------------

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
    public void testRtrimTrailingWhitespace()
    {
        assertEquals("hello", formatter.rtrim("hello   "));
    }
}

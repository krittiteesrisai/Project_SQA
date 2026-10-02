package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link HelpFormatter} (Defects4J Cli-31b).
 *
 * หมายเหตุ: คลาส Option / Options / OptionGroup / OptionBuilder เป็น dependency
 * ของคลาสเป้าหมาย (อยู่ใน classpath เดียวกัน) จึงใช้ public API ปกติของคลาสเหล่านี้
 * ในการสร้าง fixture โดยไม่ได้ "เดา" behavior ของ HelpFormatter เอง
 * จุดที่ยังไม่แน่ใจ 100% (เช่น ค่า default ของ Option.getArgName() เมื่อไม่ได้ set)
 * จะมีคอมเมนต์กำกับไว้
 */
public class HelpFormatterTest
{
    private HelpFormatter formatter;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
    }

    private String capturePrintUsage(int width, String app, Options options)
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, width, app, options);
        pw.flush();
        return sw.toString();
    }

    private String captureFullHelp(int width, String syntax, String header,
                                    Options options, int leftPad, int descPad,
                                    String footer, boolean autoUsage)
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, width, syntax, header, options, leftPad, descPad, footer, autoUsage);
        pw.flush();
        return sw.toString();
    }

    private String capturePrintOptions(int width, Options options, int leftPad, int descPad)
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, width, options, leftPad, descPad);
        pw.flush();
        return sw.toString();
    }

    private String capturePrintWrapped(int width, int tabStop, String text)
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, width, tabStop, text);
        pw.flush();
        return sw.toString();
    }

    // ------------------------------------------------------------------
    // Simple getter/setter tests (boundary/default values)
    // ------------------------------------------------------------------

    @Test
    public void testWidthGetSetDefault()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        formatter.setWidth(120);
        assertEquals(120, formatter.getWidth());
    }

    @Test
    public void testLeftPaddingGetSet()
    {
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void testDescPaddingGetSet()
    {
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        formatter.setDescPadding(0);
        assertEquals(0, formatter.getDescPadding());
    }

    @Test
    public void testSyntaxPrefixGetSet()
    {
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix("USAGE: ");
        assertEquals("USAGE: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void testNewLineGetSet()
    {
        formatter.setNewLine("\r\n");
        assertEquals("\r\n", formatter.getNewLine());
    }

    @Test
    public void testOptPrefixGetSet()
    {
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());
    }

    @Test
    public void testLongOptPrefixGetSet()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
    }

    @Test
    public void testLongOptSeparatorGetSetDefault()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void testArgNameGetSet()
    {
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        formatter.setArgName("VALUE");
        assertEquals("VALUE", formatter.getArgName());
    }

    // ------------------------------------------------------------------
    // OptionComparator (if/else branch in setOptionComparator)
    // ------------------------------------------------------------------

    @Test
    public void testOptionComparatorDefaultSortsAlphabetically() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("b", "bbb", false, "b desc"));
        options.addOption(new Option("a", "aaa", false, "a desc"));

        String output = capturePrintUsage(80, "app", options);

        int idxA = output.indexOf("-a");
        int idxB = output.indexOf("-b");
        assertTrue("default comparator should sort -a before -b", idxA < idxB);
    }

    @Test
    public void testOptionComparatorCustomReversesOrder() throws Exception
    {
        formatter.setOptionComparator(new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                Option opt1 = (Option) o1;
                Option opt2 = (Option) o2;
                // reverse of default
                return opt2.getKey().compareToIgnoreCase(opt1.getKey());
            }
        });

        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "a desc"));
        options.addOption(new Option("b", "bbb", false, "b desc"));

        String output = capturePrintUsage(80, "app", options);

        int idxA = output.indexOf("-a");
        int idxB = output.indexOf("-b");
        assertTrue("custom comparator should sort -b before -a", idxB < idxA);
    }

    @Test
    public void testOptionComparatorSetNullResetsToDefault() throws Exception
    {
        formatter.setOptionComparator(new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return 0;
            }
        });
        formatter.setOptionComparator(null); // should reset to default (else branch -> if branch)

        Options options = new Options();
        options.addOption(new Option("b", "bbb", false, "b desc"));
        options.addOption(new Option("a", "aaa", false, "a desc"));

        String output = capturePrintUsage(80, "app", options);
        int idxA = output.indexOf("-a");
        int idxB = output.indexOf("-b");
        assertTrue(idxA < idxB);
    }

    // ------------------------------------------------------------------
    // printHelp - argument validation branch
    // ------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpNullSyntaxThrows()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, null, "header", new Options(), 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpEmptySyntaxThrows()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "", "header", new Options(), 1, 3, "footer", false);
    }

    @Test
    public void testPrintHelpAutoUsageTrueWithHeaderFooter() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("v", false, "verbose mode"));

        String output = captureFullHelp(80, "app", "This is header", options, 1, 3, "This is footer", true);

        assertTrue(output.startsWith(HelpFormatter.DEFAULT_SYNTAX_PREFIX));
        assertTrue(output.contains("This is header"));
        assertTrue(output.contains("This is footer"));
        assertTrue(output.contains("-v"));
    }

    @Test
    public void testPrintHelpAutoUsageFalse() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("v", false, "verbose mode"));

        String output = captureFullHelp(80, "app arg1 arg2", null, options, 1, 3, null, false);

        // autoUsage=false -> printUsage(pw,width,cmdLineSyntax) branch (no options rendering in the usage line)
        assertTrue(output.startsWith(HelpFormatter.DEFAULT_SYNTAX_PREFIX + "app"));
    }

    @Test
    public void testPrintHelpBlankHeaderAndFooterAreSkipped() throws Exception
    {
        Options options = new Options();
        options.addOption(new Option("v", false, "verbose mode"));

        // header = "" and footer = "   " (blank) -> printWrapped for header/footer must be skipped
        String output = captureFullHelp(80, "app", "", options, 1, 3, "   ", false);

        // Should not throw and should not contain any extraneous blank-only wrapped lines
        assertNotNull(output);
    }

    @Test
    public void testPrintHelpDelegationOverloads()
    {
        // These simply delegate down to the core method and print to System.out.
        // We only verify that no exception is thrown (covers delegation branches).
        Options options = new Options();
        options.addOption(new Option("x", false, "desc"));

        formatter.printHelp("app", options);
        formatter.printHelp("app", options, true);
        formatter.printHelp("app", "header", options, "footer");
        formatter.printHelp("app", "header", options, "footer", true);
        formatter.printHelp(80, "app", "header", options, "footer");
        formatter.printHelp(80, "app", "header", options, "footer", true);
    }

    // ------------------------------------------------------------------
    // printUsage(pw,width,cmdLineSyntax) - simple usage (no options)
    // ------------------------------------------------------------------

    @Test
    public void testPrintUsageSimpleNoSpaceInSyntax() throws Exception
    {
        // cmdLineSyntax has no space -> argPos = indexOf(' ')+1 = 0
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app");
        pw.flush();
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX + "app" + formatter.getNewLine(), sw.toString());
    }

    // ------------------------------------------------------------------
    // printUsage(pw,width,app,options) + appendOption + appendOptionGroup
    // ------------------------------------------------------------------

    @Test
    public void testPrintUsageOptionalOptionNoArg() throws Exception
    {
        Option opt = new Option("a", "aaa", false, "desc a");
        opt.setRequired(false);

        Options options = new Options();
        options.addOption(opt);

        String output = capturePrintUsage(80, "app", options);
        assertTrue(output.contains("[-a]"));
    }

    @Test
    public void testPrintUsageRequiredOptionWithArgAndArgName() throws Exception
    {
        Option opt = new Option("f", true, "file description");
        opt.setArgName("FILE");
        opt.setRequired(true);

        Options options = new Options();
        options.addOption(opt);

        String output = capturePrintUsage(80, "app", options);
        assertTrue(output.contains("-f <FILE>"));
        assertFalse(output.contains("[-f"));
    }

    @Test
    public void testPrintUsageLongOnlyOption() throws Exception
    {
        // Option ที่ไม่มี short opt (getOpt()==null) สร้างผ่าน OptionBuilder ตามรูปแบบมาตรฐานของ commons-cli
        OptionBuilder.withLongOpt("verbose");
        Option opt = OptionBuilder.create();
        opt.setRequired(false);

        Options options = new Options();
        options.addOption(opt);

        String output = capturePrintUsage(80, "app", options);
        assertTrue(output.contains("--verbose"));
    }

    @Test
    public void testPrintUsageLongOnlyOptionWithArgUsesLongOptSeparator() throws Exception
    {
        formatter.setLongOptSeparator("=");

        OptionBuilder.withLongOpt("file");
        OptionBuilder.hasArg();
        Option opt = OptionBuilder.create();
        opt.setArgName("FILE");
        opt.setRequired(true);

        Options options = new Options();
        options.addOption(opt);

        String output = capturePrintUsage(80, "app", options);
        assertTrue(output.contains("--file=<FILE>"));
    }

    @Test
    public void testPrintUsageOptionGroupRequiredNotShownInBrackets() throws Exception
    {
        Option o1 = new Option("x", "desc x");
        Option o2 = new Option("y", "desc y");

        OptionGroup group = new OptionGroup();
        group.addOption(o1);
        group.addOption(o2);
        group.setRequired(true);

        Options options = new Options();
        options.addOptionGroup(group);

        String output = capturePrintUsage(80, "app", options);
        assertTrue(output.contains("-x | -y") || output.contains("-y | -x"));
        assertFalse(output.contains("[-x"));
        assertFalse(output.contains("[-y"));
    }

    @Test
    public void testPrintUsageOptionGroupOptionalShownInBrackets() throws Exception
    {
        Option o1 = new Option("x", "desc x");
        Option o2 = new Option("y", "desc y");

        OptionGroup group = new OptionGroup();
        group.addOption(o1);
        group.addOption(o2);
        group.setRequired(false);

        Options options = new Options();
        options.addOptionGroup(group);

        String output = capturePrintUsage(80, "app", options);
        assertTrue(output.contains("[-x | -y]") || output.contains("[-y | -x]"));
    }

    @Test
    public void testPrintUsageOptionGroupProcessedOnlyOnce() throws Exception
    {
        // group ที่มี 2 options -> loop จะเจอ option ทั้งสองที่อยู่ใน group เดียวกัน
        // ครั้งแรก processedGroups.contains(group) == false -> เข้า if branch
        // ครั้งที่สอง processedGroups.contains(group) == true -> เข้า else (ข้าม)
        Option o1 = new Option("m", "desc m");
        Option o2 = new Option("n", "desc n");

        OptionGroup group = new OptionGroup();
        group.addOption(o1);
        group.addOption(o2);
        group.setRequired(true);

        Options options = new Options();
        options.addOptionGroup(group);

        String output = capturePrintUsage(80, "app", options);

        int firstBracketCount = output.split("-m \\| -n|-n \\| -m", -1).length - 1;
        assertEquals(1, firstBracketCount);
    }

    // ------------------------------------------------------------------
    // printOptions / renderOptions
    // ------------------------------------------------------------------

    @Test
    public void testRenderOptionsShortAndLongWithArgName() throws Exception
    {
        Option opt = new Option("f", "file", true, "the file to use");
        opt.setArgName("FILE");

        Options options = new Options();
        options.addOption(opt);

        String output = capturePrintOptions(80, options, 1, 3);
        assertTrue(output.contains("-f,--file"));
        assertTrue(output.contains("<FILE>"));
        assertTrue(output.contains("the file to use"));
    }

    @Test
    public void testRenderOptionsBlankArgName() throws Exception
    {
        Option opt = new Option("f", "file", true, "desc");
        opt.setArgName(""); // blank argName -> single-space branch, no <..>

        Options options = new Options();
        options.addOption(opt);

        String output = capturePrintOptions(80, options, 1, 3);
        assertFalse(output.contains("<>"));
    }

    @Test
    public void testRenderOptionsNullArgNameFallsBackToDefault() throws Exception
    {
        // หมายเหตุ: สมมติว่า Option ที่สร้างโดยไม่เรียก setArgName() จะมี getArgName()==null
        // (ค่า default ของ Option ไม่ได้แสดงอยู่ใน source ของ HelpFormatter ที่ให้มา
        // แต่เป็น behavior มาตรฐานของ Option ใน commons-cli)
        Option opt = new Option("f", true, "desc"); // hasArg=true, ไม่ set argName

        Options options = new Options();
        options.addOption(opt);

        String output = capturePrintOptions(80, options, 1, 3);
        assertTrue(output.contains("<" + HelpFormatter.DEFAULT_ARG_NAME + ">"));
    }

    @Test
    public void testRenderOptionsNoLongOpt() throws Exception
    {
        Option opt = new Option("q", false, "desc q"); // ไม่มี long opt

        Options options = new Options();
        options.addOption(opt);

        String output = capturePrintOptions(80, options, 1, 3);
        assertTrue(output.contains("-q"));
        assertFalse(output.contains("-q,--"));
    }

    @Test
    public void testRenderOptionsOptWithNullGetOpt() throws Exception
    {
        OptionBuilder.withLongOpt("verbose");
        Option opt = OptionBuilder.create(); // getOpt()==null

        Options options = new Options();
        options.addOption(opt);

        String output = capturePrintOptions(80, options, 1, 3);
        assertTrue(output.contains("--verbose"));
    }

    @Test
    public void testRenderOptionsNullDescriptionSkipsAppend() throws Exception
    {
        Option opt = new Option("z", false, null); // description == null

        Options options = new Options();
        options.addOption(opt);

        String output = capturePrintOptions(80, options, 1, 3);
        assertNotNull(output);
        assertTrue(output.contains("-z"));
    }

    @Test
    public void testRenderOptionsMultipleOptionsPaddingBranch() throws Exception
    {
        // ทำให้ max length ต่างกัน เพื่อกระตุ้น branch optBuf.length() < max
        Options options = new Options();
        options.addOption(new Option("a", false, "short"));
        options.addOption(new Option("bbbbbbbbbb", "longlonglong", false, "long option desc"));

        String output = capturePrintOptions(80, options, 1, 3);
        assertNotNull(output);
    }

    // ------------------------------------------------------------------
    // printWrapped / renderWrappedText
    // ------------------------------------------------------------------

    @Test
    public void testRenderWrappedTextNoWrapNeeded() throws Exception
    {
        String text = "short text";
        String output = capturePrintWrapped(80, 0, text);
        assertEquals(text + formatter.getNewLine(), output);
    }

    @Test
    public void testRenderWrappedTextSimpleWrapMultipleLines() throws Exception
    {
        String text = "one two three four five six seven eight nine ten";
        String output = capturePrintWrapped(10, 2, text);
        // ควรมีมากกว่า 1 บรรทัด (มี newline)
        assertTrue(output.split(formatter.getNewLine()).length > 1);
    }

    @Test
    public void testRenderWrappedTextTabStopGreaterOrEqualWidthResetsToOne() throws Exception
    {
        String text = "alpha beta gamma delta epsilon zeta eta theta";
        // nextLineTabStop (100) >= width (10) -> reset to 1 ภายใน method
        String output = capturePrintWrapped(10, 100, text);

        String[] lines = output.split(formatter.getNewLine());
        assertTrue(lines.length > 1);
        // บรรทัดถัดไปควรขึ้นต้นด้วย space เดียว (padding=1) แล้วตามด้วยตัวอักษรที่ไม่ใช่ space
        String secondLine = lines[1];
        assertTrue(secondLine.startsWith(" "));
        assertFalse(secondLine.startsWith("  "));
    }

    // ------------------------------------------------------------------
    // findWrapPos - ทดสอบตรง เนื่องจากอยู่ package เดียวกัน (protected method)
    // ------------------------------------------------------------------

    @Test
    public void testFindWrapPosNewlineFoundEarly()
    {
        String text = "abc\ndefghij";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(4, pos); // pos of '\n' (index3) + 1
    }

    @Test
    public void testFindWrapPosTabFoundEarlyNoNewline()
    {
        String text = "abc\tdefghij";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPosTextShorterThanWidthReturnsMinusOne()
    {
        String text = "abcde"; // length 5
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPosBackwardScanFindsWhitespace()
    {
        String text = "this is a long text for wrapping";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertTrue(pos > 0);
        assertTrue(Character.isWhitespace(text.charAt(pos)) || pos == text.length());
    }

    @Test
    public void testFindWrapPosForwardScanFallback()
    {
        // ไม่มี whitespace ระหว่าง index0..width(5) เลย -> backward scan fail (pos กลับไปเป็น -1)
        // แล้วไป forward scan หาช่องว่างถัดไปหลัง width และพบที่ index8
        String text = "abcdefgh ijk";
        int pos = formatter.findWrapPos(text, 5, 0);
        assertEquals(8, pos);
    }

    @Test
    public void testFindWrapPosForwardScanReachesEndReturnsMinusOne()
    {
        // ไม่มี whitespace เลยตลอดทั้งสตริง -> คืนค่า -1 (forward scan ไปจนสุด text)
        String text = "abcdefghij";
        int pos = formatter.findWrapPos(text, 3, 0);
        assertEquals(-1, pos);
    }

    // ------------------------------------------------------------------
    // createPadding
    // ------------------------------------------------------------------

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

    // ------------------------------------------------------------------
    // rtrim
    // ------------------------------------------------------------------

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
}

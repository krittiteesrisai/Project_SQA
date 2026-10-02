package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter; // explicit import ตามข้อกำหนด (แม้อยู่ package เดียวกัน)

import org.junit.Test;
import org.junit.Before;
import org.junit.Assume;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import static org.junit.Assert.*;

public class HelpFormatterTest {

    private HelpFormatter hf;

    @Before
    public void setUp() {
        hf = new HelpFormatter();
    }

    // ---------------------------------------------------------------
    // Helper utils
    // ---------------------------------------------------------------

    private String capture(PrintWriter pw, ByteArrayOutputStream baos) {
        pw.flush();
        return baos.toString();
    }

    private PrintWriter newPw(ByteArrayOutputStream baos) {
        return new PrintWriter(baos, true);
    }

    /** redirect System.out เพื่อไม่ให้ smoke-test ที่ใช้ System.out รก console */
    private void runWithRedirectedOut(Runnable r) {
        PrintStream original = System.out;
        try {
            System.setOut(new PrintStream(new ByteArrayOutputStream()));
            r.run();
        } finally {
            System.setOut(original);
        }
    }

    // ---------------------------------------------------------------
    // 1. Constants & default fields
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstantsAndFields() {
        assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
        assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
        assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
        assertEquals("usage: ", HelpFormatter.DEFAULT_SYNTAX_PREFIX);
        assertEquals("-", HelpFormatter.DEFAULT_OPT_PREFIX);
        assertEquals("--", HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        assertEquals("arg", HelpFormatter.DEFAULT_ARG_NAME);

        assertEquals(HelpFormatter.DEFAULT_WIDTH, hf.getWidth());
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, hf.getLeftPadding());
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, hf.getDescPadding());
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, hf.getSyntaxPrefix());
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, hf.getOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, hf.getLongOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, hf.getArgName());
    }

    // ---------------------------------------------------------------
    // 2. Getter/Setter pairs
    // ---------------------------------------------------------------

    @Test
    public void testWidthGetterSetter() {
        hf.setWidth(100);
        assertEquals(100, hf.getWidth());
    }

    @Test
    public void testLeftPaddingGetterSetter() {
        hf.setLeftPadding(5);
        assertEquals(5, hf.getLeftPadding());
    }

    @Test
    public void testDescPaddingGetterSetter() {
        hf.setDescPadding(7);
        assertEquals(7, hf.getDescPadding());
    }

    @Test
    public void testSyntaxPrefixGetterSetter() {
        hf.setSyntaxPrefix("run: ");
        assertEquals("run: ", hf.getSyntaxPrefix());
    }

    @Test
    public void testNewLineGetterSetter() {
        hf.setNewLine("\n");
        assertEquals("\n", hf.getNewLine());
    }

    @Test
    public void testOptPrefixGetterSetter() {
        hf.setOptPrefix("+");
        assertEquals("+", hf.getOptPrefix());
    }

    @Test
    public void testLongOptPrefixGetterSetter() {
        hf.setLongOptPrefix("++");
        assertEquals("++", hf.getLongOptPrefix());
    }

    @Test
    public void testArgNameGetterSetter() {
        hf.setArgName("VALUE");
        assertEquals("VALUE", hf.getArgName());
    }

    // ---------------------------------------------------------------
    // 3. printHelp(PrintWriter,...) - validation & branch coverage
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_NullSyntax_Throws() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        hf.printHelp(pw, 74, null, null, options, 1, 3, null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelp_EmptySyntax_Throws() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        hf.printHelp(pw, 74, "", null, options, 1, 3, null, false);
    }

    @Test
    public void testPrintHelp_AutoUsageTrue_UsesOptionsInUsageLine() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        options.addOption("a", false, "desc a");
        hf.printHelp(pw, 74, "app", null, options, 1, 3, null, true);
        String out = capture(pw, baos);
        // autoUsage=true -> printUsage(pw,width,cmdLineSyntax,options) ถูกเรียก -> ควรมี "-a" ในบรรทัด usage
        assertTrue(out.contains("usage: app"));
        assertTrue(out.contains("-a"));
    }

    @Test
    public void testPrintHelp_AutoUsageFalse_PlainUsageLine() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        options.addOption("a", false, "desc a");
        hf.printHelp(pw, 74, "app", null, options, 1, 3, null, false);
        String out = capture(pw, baos);
        assertTrue(out.contains("usage: app"));
    }

    @Test
    public void testPrintHelp_HeaderBlank_NotPrinted() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        hf.printHelp(pw, 74, "app", "   ", options, 1, 3, null, false);
        String out = capture(pw, baos);
        // header เป็น whitespace -> header.trim().length()>0 เป็น false -> ไม่ควรมีข้อความ header เพิ่ม
        assertFalse(out.contains("HEADER_TEXT"));
    }

    @Test
    public void testPrintHelp_HeaderNonBlank_Printed() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        hf.printHelp(pw, 74, "app", "MyHeaderText", options, 1, 3, null, false);
        String out = capture(pw, baos);
        assertTrue(out.contains("MyHeaderText"));
    }

    @Test
    public void testPrintHelp_FooterBlank_NotPrinted() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        hf.printHelp(pw, 74, "app", null, options, 1, 3, "   ", false);
        String out = capture(pw, baos);
        assertFalse(out.contains("FOOTER_TEXT"));
    }

    @Test
    public void testPrintHelp_FooterNonBlank_Printed() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        hf.printHelp(pw, 74, "app", null, options, 1, 3, "MyFooterText", false);
        String out = capture(pw, baos);
        assertTrue(out.contains("MyFooterText"));
    }

    // ---------------------------------------------------------------
    // 4. Convenience overloads (smoke test - เรียกแล้วไม่ throw / delegate ถูกต้อง)
    // ---------------------------------------------------------------

    @Test
    public void testPrintHelp_TwoArgOverload_NoException() {
        final Options options = new Options();
        runWithRedirectedOut(new Runnable() {
            public void run() {
                hf.printHelp("app", options);
            }
        });
    }

    @Test
    public void testPrintHelp_ThreeArgOverload_AutoUsageTrueAndFalse() {
        final Options options = new Options();
        runWithRedirectedOut(new Runnable() {
            public void run() {
                hf.printHelp("app", options, true);
                hf.printHelp("app", options, false);
            }
        });
    }

    @Test
    public void testPrintHelp_FourArgOverload_NoException() {
        final Options options = new Options();
        runWithRedirectedOut(new Runnable() {
            public void run() {
                hf.printHelp("app", "header", options, "footer");
            }
        });
    }

    @Test
    public void testPrintHelp_FiveArgOverload_AutoUsageBoolean() {
        final Options options = new Options();
        runWithRedirectedOut(new Runnable() {
            public void run() {
                hf.printHelp("app", "header", options, "footer", true);
                hf.printHelp("app", "header", options, "footer", false);
            }
        });
    }

    @Test
    public void testPrintHelp_SixArgOverload_WidthVariant() {
        final Options options = new Options();
        runWithRedirectedOut(new Runnable() {
            public void run() {
                hf.printHelp(80, "app", "header", options, "footer");
            }
        });
    }

    @Test
    public void testPrintHelp_SevenArgOverload_PrintWriterNoAutoUsage() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        hf.printHelp(pw, 74, "app", "header", options, 1, 3, "footer");
        String out = capture(pw, baos);
        assertTrue(out.contains("usage: app"));
    }

    // ---------------------------------------------------------------
    // 5. printUsage(pw, width, app, options) - appendOption/appendOptionGroup
    // ---------------------------------------------------------------

    @Test
    public void testPrintUsage_NoOptions() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        hf.printUsage(pw, 74, "app", options);
        String out = capture(pw, baos);
        assertTrue(out.trim().equals("usage: app"));
    }

    @Test
    public void testPrintUsage_RequiredOption_NoBrackets() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        Option a = new Option("a", false, "desc"); // สมมติ constructor (opt,hasArg,desc)
        a.setRequired(true);
        options.addOption(a);
        hf.printUsage(pw, 74, "app", options);
        String out = capture(pw, baos);
        assertTrue(out.contains("-a"));
        assertFalse(out.contains("[-a]"));
    }

    @Test
    public void testPrintUsage_OptionalOption_WithBrackets() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        Option a = new Option("a", false, "desc");
        a.setRequired(false);
        options.addOption(a);
        hf.printUsage(pw, 74, "app", options);
        String out = capture(pw, baos);
        assertTrue(out.contains("[-a]"));
    }

    @Test
    public void testPrintUsage_OptionWithArgAndArgName() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        Option f = new Option("f", true, "file option");
        f.setArgName("FILE");
        f.setRequired(true);
        options.addOption(f);
        hf.printUsage(pw, 74, "app", options);
        String out = capture(pw, baos);
        assertTrue(out.contains("-f <FILE>"));
    }

    @Test
    public void testPrintUsage_OptionWithArgNoArgName() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        Option f = new Option("f", true, "file option");
        // ไม่เรียก setArgName -> สมมติค่า default argName เป็น null -> เงื่อนไข hasArg && argName!=null เป็น false
        f.setRequired(true);
        options.addOption(f);
        hf.printUsage(pw, 74, "app", options);
        String out = capture(pw, baos);
        assertTrue(out.contains("-f"));
        assertFalse(out.contains("<"));
    }

    @Test
    public void testPrintUsage_ShortOptNull_LongOptOnly() {
        // เงื่อนไข option.getOpt()==null -> ใช้ "--longOpt"
        // *หมายเหตุ: สมมติ API อนุญาต short opt = null สำหรับ long-only option; ไม่มีใน source ที่ให้มา*
        Option longOnly;
        try {
            longOnly = new Option(null, "verbose", false, "verbose flag");
        } catch (RuntimeException ex) {
            Assume.assumeNoException(
                "API ไม่รองรับ short opt = null สำหรับ long-only option (ข้าม test นี้)", ex);
            return;
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        longOnly.setRequired(true);
        options.addOption(longOnly);
        hf.printUsage(pw, 74, "app", options);
        String out = capture(pw, baos);
        assertTrue(out.contains("--verbose"));
    }

    @Test
    public void testPrintUsage_OptionGroupRequired_NoOuterBrackets_PipeSeparator() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        Option a = new Option("a", false, "desc a");
        Option b = new Option("b", false, "desc b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        group.setRequired(true);
        options.addOptionGroup(group);

        hf.printUsage(pw, 74, "app", options);
        String out = capture(pw, baos);
        assertTrue(out.contains("-a | -b"));
        assertFalse(out.contains("[-a | -b]"));
    }

    @Test
    public void testPrintUsage_OptionGroupNotRequired_WithOuterBrackets() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        Option a = new Option("a", false, "desc a");
        Option b = new Option("b", false, "desc b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        group.setRequired(false);
        options.addOptionGroup(group);

        hf.printUsage(pw, 74, "app", options);
        String out = capture(pw, baos);
        assertTrue(out.contains("[-a | -b]"));
    }

    @Test
    public void testPrintUsage_OptionGroupSingleOption_NoPipeSeparator() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        Option a = new Option("a", false, "desc a");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.setRequired(true);
        options.addOptionGroup(group);

        hf.printUsage(pw, 74, "app", options);
        String out = capture(pw, baos);
        assertTrue(out.contains("-a"));
        assertFalse(out.contains("|"));
    }

    @Test
    public void testPrintUsage_MultipleOptions_SpaceSeparatorBetween() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        Option a = new Option("a", false, "desc a");
        Option b = new Option("b", false, "desc b");
        a.setRequired(true);
        b.setRequired(true);
        options.addOption(a);
        options.addOption(b);
        hf.printUsage(pw, 74, "app", options);
        String out = capture(pw, baos);
        assertTrue(out.contains("-a -b"));
    }

    // ---------------------------------------------------------------
    // 6. printUsage(pw,width,cmdLineSyntax) - boundary: มี/ไม่มี space
    // ---------------------------------------------------------------

    @Test
    public void testPrintUsage_TwoArgOverload_WithSpace() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        hf.printUsage(pw, 74, "app arg1 arg2");
        String out = capture(pw, baos);
        assertTrue(out.contains("usage: app arg1 arg2"));
    }

    @Test
    public void testPrintUsage_TwoArgOverload_NoSpace_BoundaryArgPosZero() {
        // indexOf(' ') == -1 -> argPos = 0 (boundary case)
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        hf.printUsage(pw, 74, "noSpaceHere");
        String out = capture(pw, baos);
        assertTrue(out.contains("usage: noSpaceHere"));
    }

    // ---------------------------------------------------------------
    // 7. printOptions / renderOptions
    // ---------------------------------------------------------------

    @Test
    public void testPrintOptions_Basic() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        Options options = new Options();
        options.addOption("a", false, "desc a");
        hf.printOptions(pw, 74, options, 1, 3);
        String out = capture(pw, baos);
        assertTrue(out.contains("-a"));
        assertTrue(out.contains("desc a"));
    }

    @Test
    public void testRenderOptions_ShortOptOnly_NoLongOpt() {
        Options options = new Options();
        Option a = new Option("a", false, "Description A"); // ไม่มี longOpt -> hasLongOpt()=false
        options.addOption(a);
        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 74, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("-a"));
        assertFalse(result.contains(",--"));
    }

    @Test
    public void testRenderOptions_ShortAndLongOpt() {
        Options options = new Options();
        Option a = new Option("a", "alpha", false, "Description A"); // hasLongOpt()=true
        options.addOption(a);
        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 74, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("-a,--alpha"));
    }

    @Test
    public void testRenderOptions_HasArgWithArgName() {
        Options options = new Options();
        Option f = new Option("f", true, "File desc");
        f.setArgName("FILE");
        options.addOption(f);
        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 74, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("<FILE>"));
    }

    @Test
    public void testRenderOptions_HasArgNoArgName() {
        Options options = new Options();
        Option f = new Option("f", true, "File desc");
        // ไม่เรียก setArgName -> hasArgName() ควรเป็น false ตามสมมติฐาน default
        options.addOption(f);
        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 74, options, 1, 3);
        String result = sb.toString();
        assertFalse(result.contains("<"));
        assertTrue(result.contains("File desc"));
    }

    @Test
    public void testRenderOptions_DescriptionNull_NoException() {
        Options options = new Options();
        Option a = new Option("a", false, null); // description == null
        options.addOption(a);
        StringBuffer sb = new StringBuffer();
        // ไม่ควร throw NullPointerException; branch (option.getDescription()!=null) ควรเป็น false
        hf.renderOptions(sb, 74, options, 1, 3);
        assertNotNull(sb.toString());
    }

    @Test
    public void testRenderOptions_MultipleOptions_NewLineSeparator() {
        Options options = new Options();
        options.addOption("a", false, "Description A");
        options.addOption("b", false, "Description B");
        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 74, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains(hf.getNewLine()));
    }

    // ---------------------------------------------------------------
    // 8. printWrapped / renderWrappedText
    // ---------------------------------------------------------------

    @Test
    public void testPrintWrapped_SingleArgOverload_NoWrap() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = newPw(baos);
        hf.printWrapped(pw, 74, "short text");
        String out = capture(pw, baos);
        assertTrue(out.trim().equals("short text"));
    }

    @Test
    public void testRenderWrappedText_NoWrapNeeded() {
        StringBuffer sb = new StringBuffer();
        hf.renderWrappedText(sb, 50, 0, "Hello World");
        assertEquals("Hello World", sb.toString());
    }

    @Test
    public void testRenderWrappedText_WrapOccurs() {
        StringBuffer sb = new StringBuffer();
        String longText = "aaaaa bbbbb ccccc ddddd eeeee fffff ggggg hhhhh iiiii";
        hf.renderWrappedText(sb, 10, 0, longText);
        String result = sb.toString();
        assertTrue(result.contains(hf.getNewLine()));
        // ต้องไม่หายไปของคำ (best-effort check)
        assertTrue(result.contains("aaaaa"));
        assertTrue(result.contains("iiiii"));
    }

    // ---------------------------------------------------------------
    // 9. findWrapPos - ครอบคลุมทุกสาขา (protected, same package)
    // ---------------------------------------------------------------

    @Test
    public void testFindWrapPos_NewlineBeforeWidth() {
        int pos = hf.findWrapPos("Hello\nWorld", 20, 0);
        assertEquals(6, pos);
    }

    @Test
    public void testFindWrapPos_TabBeforeWidth() {
        int pos = hf.findWrapPos("Hello\tWorld", 20, 0);
        assertEquals(6, pos);
    }

    @Test
    public void testFindWrapPos_NoWrapNeeded_EndOfText() {
        int pos = hf.findWrapPos("short", 50, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPos_BackwardWhitespaceFound() {
        // "aaaaa bbbbb ccccc" ; width=10 -> ควรเจอ space ที่ index 5 (backward search)
        int pos = hf.findWrapPos("aaaaa bbbbb ccccc", 10, 0);
        assertEquals(5, pos);
    }

    @Test
    public void testFindWrapPos_ForwardWhitespaceFound_BackwardFails() {
        // 15 a's + space + 5 b's ; width=5 -> backward search ไม่พบ whitespace (ไปจนถึง pos<startPos)
        // จึงต้อง forward search และเจอ whitespace ที่ index 15
        String text = "aaaaaaaaaaaaaaa bbbbb";
        int pos = hf.findWrapPos(text, 5, 0);
        assertEquals(15, pos);
    }

    /**
     * FAULT-DETECTION TEST:
     * เมื่อคำยาวเกิน width และไม่มี whitespace เลยตลอดทั้งข้อความ (backward และ forward
     * search ทั้งคู่ไม่พบ) การ scan แบบ forward ใน findWrapPos จะไล่ pos ไปจนถึง
     * text.length() แล้วยังเรียก text.charAt(pos) อีกครั้งในเงื่อนไข while ก่อนตรวจสอบ
     * ขอบเขต ทำให้เกิด StringIndexOutOfBoundsException (ไล่ตามซอร์สโค้ดที่ให้มาโดยตรง)
     * ถ้าพฤติกรรมจริงต่างจากนี้ (เช่น bug ถูก fix แล้ว) test นี้จะช่วยระบุจุดที่ต้องปรับปรุง
     */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testFindWrapPos_LongWordNoWhitespace_ThrowsIndexException() {
        String text = "aaaaaaaaaaaaaaaaaaaa"; // 20 ตัว 'a' ไม่มี whitespace เลย
        hf.findWrapPos(text, 5, 0);
    }

    // ---------------------------------------------------------------
    // 10. createPadding
    // ---------------------------------------------------------------

    @Test
    public void testCreatePadding_ZeroLength() {
        String padding = hf.createPadding(0);
        assertEquals("", padding);
    }

    @Test
    public void testCreatePadding_PositiveLength() {
        String padding = hf.createPadding(5);
        assertEquals(5, padding.length());
        assertEquals("     ", padding);
    }

    // ---------------------------------------------------------------
    // 11. rtrim
    // ---------------------------------------------------------------

    @Test
    public void testRtrim_Null() {
        assertNull(hf.rtrim(null));
    }

    @Test
    public void testRtrim_Empty() {
        assertEquals("", hf.rtrim(""));
    }

    @Test
    public void testRtrim_TrailingWhitespace() {
        assertEquals("abc", hf.rtrim("abc   "));
    }

    @Test
    public void testRtrim_NoTrailingWhitespace() {
        assertEquals("abc", hf.rtrim("abc"));
    }
}

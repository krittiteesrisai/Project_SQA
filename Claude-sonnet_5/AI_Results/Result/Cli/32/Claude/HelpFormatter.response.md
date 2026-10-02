# HelpFormatterTest.java

```java
package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.cli.HelpFormatter (Defects4J Cli-32b)
 *
 * หมายเหตุ: บางเทสถูกออกแบบมาเพื่อดักจับข้อบกพร่อง (fault) ที่ทราบกันดีในเวอร์ชันนี้
 * (Cli-32 bug ใน findWrapPos ที่อาจโยน StringIndexOutOfBoundsException เมื่อไม่มี
 * whitespace ในข้อความและ text ยาวกว่า width) จะมีคอมเมนต์กำกับไว้ชัดเจน
 */
public class HelpFormatterTest
{
    private HelpFormatter hf;

    @Before
    public void setUp()
    {
        hf = new HelpFormatter();
    }

    // ------------------------------------------------------------------
    // Getter / Setter tests
    // ------------------------------------------------------------------

    @Test
    public void testDefaultWidth()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, hf.getWidth());
    }

    @Test
    public void testSetGetWidth()
    {
        hf.setWidth(100);
        assertEquals(100, hf.getWidth());
    }

    @Test
    public void testSetGetLeftPadding()
    {
        hf.setLeftPadding(5);
        assertEquals(5, hf.getLeftPadding());
    }

    @Test
    public void testSetGetDescPadding()
    {
        hf.setDescPadding(7);
        assertEquals(7, hf.getDescPadding());
    }

    @Test
    public void testSetGetSyntaxPrefix()
    {
        hf.setSyntaxPrefix("Usage: ");
        assertEquals("Usage: ", hf.getSyntaxPrefix());
    }

    @Test
    public void testSetGetNewLine()
    {
        hf.setNewLine("\r\n");
        assertEquals("\r\n", hf.getNewLine());
    }

    @Test
    public void testSetGetOptPrefix()
    {
        hf.setOptPrefix("+");
        assertEquals("+", hf.getOptPrefix());
    }

    @Test
    public void testSetGetLongOptPrefix()
    {
        hf.setLongOptPrefix("==");
        assertEquals("==", hf.getLongOptPrefix());
    }

    @Test
    public void testSetGetLongOptSeparator()
    {
        hf.setLongOptSeparator("=");
        assertEquals("=", hf.getLongOptSeparator());
    }

    @Test
    public void testDefaultLongOptSeparator()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, hf.getLongOptSeparator());
    }

    @Test
    public void testSetGetArgName()
    {
        hf.setArgName("VALUE");
        assertEquals("VALUE", hf.getArgName());
    }

    @Test
    public void testSetOptionComparatorNullResetsDefault()
    {
        // ตั้ง comparator แบบ custom (เรียงย้อนกลับ) ก่อน
        Comparator reverse = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                Option a = (Option) o1;
                Option b = (Option) o2;
                return b.getKey().compareToIgnoreCase(a.getKey());
            }
        };
        hf.setOptionComparator(reverse);
        assertSame(reverse, hf.getOptionComparator());

        // ตั้งเป็น null -> ต้อง reset เป็น default (ไม่ null, ไม่ใช่ instance เดิม)
        hf.setOptionComparator(null);
        assertNotNull(hf.getOptionComparator());
        assertNotSame(reverse, hf.getOptionComparator());
    }

    @Test
    public void testCustomOptionComparatorAffectsUsageOrder() throws Exception
    {
        Options options = new Options();
        Option optB = new Option("b", "bbb", false, "desc b");
        Option optA = new Option("a", "aaa", false, "desc a");
        options.addOption(optA);
        options.addOption(optB);

        Comparator reverse = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                Option x = (Option) o1;
                Option y = (Option) o2;
                return y.getKey().compareToIgnoreCase(x.getKey());
            }
        };
        hf.setOptionComparator(reverse);

        String out = captureUsage(options, "app");
        int idxB = out.indexOf("-b");
        int idxA = out.indexOf("-a");
        assertTrue("With reverse comparator, -b should appear before -a",
                idxB >= 0 && idxA >= 0 && idxB < idxA);
    }

    // ------------------------------------------------------------------
    // printHelp - null / empty cmdLineSyntax -> IllegalArgumentException
    // ------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpNullCmdLineSyntaxThrows()
    {
        Options options = new Options();
        hf.printHelp(new PrintWriter(new ByteArrayOutputStream()), 80,
                null, "header", options, 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpEmptyCmdLineSyntaxThrows()
    {
        Options options = new Options();
        hf.printHelp(new PrintWriter(new ByteArrayOutputStream()), 80,
                "", "header", options, 1, 3, "footer", false);
    }

    // ------------------------------------------------------------------
    // printHelp - autoUsage true/false branch
    // ------------------------------------------------------------------

    @Test
    public void testPrintHelpAutoUsageFalse()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        hf.printHelp(pw, 80, "myapp", null, options, 1, 3, null, false);
        pw.flush();
        String result = baos.toString();
        // เมื่อ autoUsage=false ควรใช้ syntax ตามที่ระบุตรงๆ ไม่ generate จาก options
        assertTrue(result.startsWith(HelpFormatter.DEFAULT_SYNTAX_PREFIX + "myapp"));
    }

    @Test
    public void testPrintHelpAutoUsageTrue()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        hf.printHelp(pw, 80, "myapp", null, options, 1, 3, null, true);
        pw.flush();
        String result = baos.toString();
        // เมื่อ autoUsage=true ควรมีตัวเลือก -a ปรากฏในบรรทัด usage
        assertTrue(result.contains("-a"));
    }

    // ------------------------------------------------------------------
    // printHelp - header/footer branches (null, blank, non-blank)
    // ------------------------------------------------------------------

    @Test
    public void testPrintHelpHeaderFooterNull()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        hf.printHelp(pw, 80, "myapp", null, options, 1, 3, null, false);
        pw.flush();
        assertNotNull(baos.toString());
    }

    @Test
    public void testPrintHelpHeaderFooterBlank()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        // header/footer เป็น whitespace ล้วน -> trim().length()==0 -> ไม่ควรถูกพิมพ์เพิ่ม
        hf.printHelp(pw, 80, "myapp", "   ", options, 1, 3, "   ", false);
        pw.flush();
        String result = baos.toString();
        assertFalse(result.trim().startsWith("header"));
    }

    @Test
    public void testPrintHelpHeaderFooterContent()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        hf.printHelp(pw, 80, "myapp", "MyHeader", options, 1, 3, "MyFooter", false);
        pw.flush();
        String result = baos.toString();
        assertTrue(result.contains("MyHeader"));
        assertTrue(result.contains("MyFooter"));
    }

    // ------------------------------------------------------------------
    // printHelp public overloads (delegation coverage)
    // ------------------------------------------------------------------

    @Test
    public void testPrintHelpTwoArgOverload()
    {
        // just check no exception is thrown; goes to System.out
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc"));
        hf.printHelp("cmdLineSyntax", options);
    }

    @Test
    public void testPrintHelpThreeArgAutoUsageOverload()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc"));
        hf.printHelp("cmdLineSyntax", options, true);
        hf.printHelp("cmdLineSyntax", options, false);
    }

    @Test
    public void testPrintHelpFourArgOverload()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc"));
        hf.printHelp("cmdLineSyntax", "header", options, "footer");
    }

    @Test
    public void testPrintHelpFiveArgOverload()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc"));
        hf.printHelp("cmdLineSyntax", "header", options, "footer", true);
    }

    @Test
    public void testPrintHelpWidthOverload()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc"));
        hf.printHelp(60, "cmdLineSyntax", "header", options, "footer");
    }

    // ------------------------------------------------------------------
    // printUsage - OptionGroup handling (required / not required)
    // ------------------------------------------------------------------

    @Test
    public void testPrintUsageOptionGroupRequired() throws Exception
    {
        Options options = new Options();
        Option a = new Option("a", "aaa", false, "desc a");
        Option b = new Option("b", "bbb", false, "desc b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        group.setRequired(true);
        options.addOptionGroup(group);

        String result = captureUsage(options, "app");
        // required group -> ไม่ควรมี "[" ครอบกลุ่ม
        assertFalse(result.contains("["));
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("-b"));
        assertTrue(result.contains("|"));
    }

    @Test
    public void testPrintUsageOptionGroupNotRequired() throws Exception
    {
        Options options = new Options();
        Option a = new Option("a", "aaa", false, "desc a");
        Option b = new Option("b", "bbb", false, "desc b");
        OptionGroup group = new OptionGroup();
        group.addOption(a);
        group.addOption(b);
        group.setRequired(false);
        options.addOptionGroup(group);

        String result = captureUsage(options, "app");
        assertTrue(result.contains("["));
        assertTrue(result.contains("]"));
    }

    @Test
    public void testPrintUsageOptionNotInGroupRequired() throws Exception
    {
        Options options = new Options();
        Option a = new Option("a", "aaa", false, "desc a");
        a.setRequired(true);
        options.addOption(a);

        String result = captureUsage(options, "app");
        // required option (ไม่อยู่ใน group) -> ไม่ครอบ "[" "]"
        assertTrue(result.contains("-a"));
    }

    @Test
    public void testPrintUsageOptionNotInGroupOptional() throws Exception
    {
        Options options = new Options();
        Option a = new Option("a", "aaa", false, "desc a");
        a.setRequired(false);
        options.addOption(a);

        String result = captureUsage(options, "app");
        assertTrue(result.contains("[-a]") || result.contains("[-a"));
    }

    @Test
    public void testPrintUsageOptionWithArgAndArgName() throws Exception
    {
        Options options = new Options();
        Option a = new Option("a", "aaa", true, "desc a");
        a.setArgName("FILE");
        options.addOption(a);

        String result = captureUsage(options, "app");
        assertTrue(result.contains("<FILE>"));
    }

    @Test
    public void testPrintUsageOptionWithArgNullArgNameUsesDefault() throws Exception
    {
        Options options = new Options();
        Option a = new Option("a", "aaa", true, "desc a");
        a.setArgName(null);
        options.addOption(a);

        String result = captureUsage(options, "app");
        assertTrue(result.contains("<" + HelpFormatter.DEFAULT_ARG_NAME + ">"));
    }

    @Test
    public void testPrintUsageOptionWithBlankArgNameSkipsBrackets() throws Exception
    {
        // ตาม logic ของ appendOption: ถ้า argName เป็น "" (ไม่ null, length==0)
        // จะไม่ append "<...>" เลย
        Options options = new Options();
        Option a = new Option("a", "aaa", true, "desc a");
        a.setArgName("");
        options.addOption(a);

        String result = captureUsage(options, "app");
        assertFalse(result.contains("<>"));
    }

    @Test
    public void testPrintUsageLongOptOnlyNoShortOpt() throws Exception
    {
        Options options = new Options();
        Option longOnly = new Option(null, "onlyLong", false, "desc");
        options.addOption(longOnly);

        String result = captureUsage(options, "app");
        assertTrue(result.contains("--onlyLong"));
    }

    // ------------------------------------------------------------------
    // printUsage(pw, width, cmdLineSyntax) - simple overload
    // ------------------------------------------------------------------

    @Test
    public void testPrintUsageSimpleOverload()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        hf.printUsage(pw, 80, "myCmd arg1 arg2");
        pw.flush();
        String result = baos.toString();
        assertTrue(result.startsWith(HelpFormatter.DEFAULT_SYNTAX_PREFIX));
        assertTrue(result.contains("myCmd"));
    }

    // ------------------------------------------------------------------
    // printOptions / renderOptions branches
    // ------------------------------------------------------------------

    @Test
    public void testRenderOptionsWithLongOpt()
    {
        Options options = new Options();
        Option a = new Option("a", "aaa", false, "desc a");
        options.addOption(a);

        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("--aaa"));
        assertTrue(result.contains("desc a"));
    }

    @Test
    public void testRenderOptionsWithoutLongOpt()
    {
        Options options = new Options();
        Option a = new Option("a", false, "desc a");
        options.addOption(a);

        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("-a"));
        assertFalse(result.contains(","));
    }

    @Test
    public void testRenderOptionsNoShortOpt()
    {
        Options options = new Options();
        Option longOnly = new Option(null, "onlyLong", false, "desc");
        options.addOption(longOnly);

        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("--onlyLong"));
    }

    @Test
    public void testRenderOptionsBlankArgName()
    {
        Options options = new Options();
        Option a = new Option("a", "aaa", true, "desc a");
        a.setArgName("");
        options.addOption(a);

        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        // ตาม logic renderOptions: argName blank -> append single space,
        // ไม่ใช้ "<...>"
        assertFalse(result.contains("<>"));
    }

    @Test
    public void testRenderOptionsNullArgNameUsesDefault()
    {
        Options options = new Options();
        Option a = new Option("a", "aaa", true, "desc a");
        a.setArgName(null);
        options.addOption(a);

        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("<" + HelpFormatter.DEFAULT_ARG_NAME + ">"));
    }

    @Test
    public void testRenderOptionsNullDescription()
    {
        Options options = new Options();
        Option a = new Option("a", "aaa", false, null);
        options.addOption(a);

        StringBuffer sb = new StringBuffer();
        // ไม่ควร throw NPE เมื่อ description เป็น null
        hf.renderOptions(sb, 80, options, 1, 3);
        assertNotNull(sb.toString());
    }

    @Test
    public void testRenderOptionsMultipleOptionsNewLineSeparator()
    {
        Options options = new Options();
        options.addOption(new Option("a", "aaa", false, "desc a"));
        options.addOption(new Option("b", "bbb", false, "desc b"));

        StringBuffer sb = new StringBuffer();
        hf.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.indexOf(hf.getNewLine()) >= 0);
    }

    // ------------------------------------------------------------------
    // renderWrappedText / printWrapped branches
    // ------------------------------------------------------------------

    @Test
    public void testRenderWrappedTextShortNoWrap()
    {
        StringBuffer sb = new StringBuffer();
        hf.renderWrappedText(sb, 80, 0, "short text");
        assertEquals("short text", sb.toString());
    }

    @Test
    public void testRenderWrappedTextWrapsMultipleLines()
    {
        StringBuffer sb = new StringBuffer();
        String longText = "This is a somewhat long line of text that should be "
                + "wrapped across several lines given a small width value";
        hf.renderWrappedText(sb, 20, 0, longText);
        String result = sb.toString();
        // ควรมีการตัดบรรทัดมากกว่า 1 บรรทัด
        int lines = result.split(hf.getNewLine()).length;
        assertTrue("expected multiple lines, got: " + lines, lines > 1);
    }

    @Test
    public void testRenderWrappedTextNextLineTabStopGEWidthResetsTo1()
    {
        StringBuffer sb = new StringBuffer();
        String text = "abcdefghij klmnopqrst uvwxyz";
        // nextLineTabStop (10) >= width(5) -> ควร reset เป็น 1 เพื่อป้องกัน infinite loop
        hf.renderWrappedText(sb, 5, 10, text);
        String result = sb.toString();
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testPrintWrappedSimpleOverload()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        hf.printWrapped(pw, 80, "hello world");
        pw.flush();
        assertTrue(baos.toString().startsWith("hello world"));
    }

    // ------------------------------------------------------------------
    // findWrapPos - branch coverage (protected, same package access)
    // ------------------------------------------------------------------

    @Test
    public void testFindWrapPosNewlineWithinWidth()
    {
        // pos ของ '\n' <= width -> return pos+1
        int pos = hf.findWrapPos("abc\ndef", 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPosTabWithinWidth()
    {
        // ไม่มี '\n' แต่มี '\t' ภายใน width -> return pos+1
        int pos = hf.findWrapPos("abc\tdefgh", 10, 0);
        assertEquals(4, pos);
    }

    @Test
    public void testFindWrapPosTextFitsWidthReturnsMinusOne()
    {
        // startPos+width >= text.length() -> return -1
        int pos = hf.findWrapPos("short", 100, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPosBackwardSearchFindsWhitespace()
    {
        // ค้นหาย้อนกลับพบ whitespace ก่อน startPos+width -> คืนตำแหน่งนั้น
        int pos = hf.findWrapPos("hello world foo", 8, 0);
        assertEquals(5, pos);
    }

    @Test
    public void testFindWrapPosForwardSearchFindsWhitespace()
    {
        // backward search ไม่พบ (คำแรกยาวเกิน width) -> forward search พบ whitespace
        int pos = hf.findWrapPos("aaaaa bbbbb", 3, 0);
        assertEquals(5, pos);
    }

    @Test
    public void testFindWrapPosNoWhitespaceAtAll_KnownBug()
    {
        // NOTE: นี่คือ known Defects4J Cli-32 bug — เมื่อไม่มี whitespace เลย
        // ใน text และ text ยาวกว่า width, forward-search loop ใน findWrapPos
        // อาจเรียก text.charAt(pos) โดย pos == text.length() ทำให้เกิด
        // StringIndexOutOfBoundsException. ตาม Javadoc ของเมธอด ควร "return
        // startPos+width" ไม่ควร throw exception. เทสนี้เขียนขึ้นเพื่อดักจับ fault นี้
        try
        {
            int pos = hf.findWrapPos("aaaaaaaaaa", 5, 0);
            // ถ้าไม่ throw exception ให้ตรวจสอบว่าค่าที่คืนสมเหตุสมผล
            // (ไม่มี whitespace เลย ควรถือเป็น "ไม่มีจุด wrap" -> -1)
            assertEquals(-1, pos);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            fail("findWrapPos threw StringIndexOutOfBoundsException "
                    + "(Cli-32 known bug reproduced): " + e.getMessage());
        }
    }

    // ------------------------------------------------------------------
    // createPadding
    // ------------------------------------------------------------------

    @Test
    public void testCreatePaddingZero()
    {
        assertEquals("", hf.createPadding(0));
    }

    @Test
    public void testCreatePaddingPositive()
    {
        assertEquals("     ", hf.createPadding(5));
    }

    // ------------------------------------------------------------------
    // rtrim
    // ------------------------------------------------------------------

    @Test
    public void testRtrimNull()
    {
        assertNull(hf.rtrim(null));
    }

    @Test
    public void testRtrimEmpty()
    {
        assertEquals("", hf.rtrim(""));
    }

    @Test
    public void testRtrimTrailingWhitespace()
    {
        assertEquals("hello", hf.rtrim("hello   "));
    }

    @Test
    public void testRtrimNoTrailingWhitespace()
    {
        assertEquals("hello", hf.rtrim("hello"));
    }

    @Test
    public void testRtrimAllWhitespace()
    {
        assertEquals("", hf.rtrim("     "));
    }

    // ------------------------------------------------------------------
    // Helper
    // ------------------------------------------------------------------

    private String captureUsage(Options options, String app)
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(baos);
        hf.printUsage(pw, 200, app, options);
        pw.flush();
        return baos.toString();
    }
}
```

---

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultWidth`, `testSetGet*` (width, padding, prefix, newline, argName, separator) | getter/setter พื้นฐานทั้งหมด (ไม่มี branch แต่จำเป็นสำหรับ mutation coverage) |
| `testSetOptionComparatorNullResetsDefault` | `setOptionComparator`: `if (comparator == null)` ทั้งสองสาขา |
| `testCustomOptionComparatorAffectsUsageOrder` | ยืนยันว่า comparator ถูกใช้จริงใน `Collections.sort` ของ `printUsage` |
| `testPrintHelpNullCmdLineSyntaxThrows`, `testPrintHelpEmptyCmdLineSyntaxThrows` | `if ((cmdLineSyntax == null) \|\| (cmdLineSyntax.length()==0))` ทั้งสอง sub-condition |
| `testPrintHelpAutoUsageFalse` / `True` | `if (autoUsage) ... else ...` ใน `printHelp` |
| `testPrintHelpHeaderFooterNull/Blank/Content` | `if ((header!=null) && (header.trim().length()>0))` และเช่นเดียวกันกับ footer ทั้ง 3 กรณี (null, blank, มีเนื้อหา) |
| `testPrintHelp*Overload` (2-6 args) | การ delegate ผ่าน overload ต่าง ๆ ของ `printHelp` |
| `testPrintUsageOptionGroupRequired/NotRequired` | `appendOptionGroup`: `if (!group.isRequired())` ทั้งสองสาขา, loop `i.hasNext()` เพิ่ม `" \| "` |
| `testPrintUsageOptionNotInGroupRequired/Optional` | `appendOption`: `if (!required)` ทั้งสองสาขา (ผ่าน option ที่ไม่อยู่ใน group) |
| `testPrintUsageOptionWithArgAndArgName`, `NullArgNameUsesDefault`, `BlankArgNameSkipsBrackets` | `appendOption`: เงื่อนไข `option.hasArg() && (argName==null \|\| argName.length()!=0)` ทั้ง 3 กรณี (มีชื่อ, null, blank) และ `option.getOpt()==null ? longOptSeparator : " "` |
| `testPrintUsageLongOptOnlyNoShortOpt` | `appendOption`: `if (option.getOpt()!=null) ... else ...` สาขา long-opt only |
| `testPrintUsageSimpleOverload` | `printUsage(pw,width,cmdLineSyntax)` คำนวณ `argPos` |
| `testRenderOptionsWithLongOpt/WithoutLongOpt/NoShortOpt` | `renderOptions`: `if (option.getOpt()==null) ... else ...` และ `if (option.hasLongOpt())` |
| `testRenderOptionsBlankArgName/NullArgNameUsesDefault` | `renderOptions`: `if (argName!=null && argName.length()==0)` ทั้งสองสาขาของ arg-name handling |
| `testRenderOptionsNullDescription` | `if (option.getDescription()!=null)` สาขา false (ป้องกัน NPE) |
| `testRenderOptionsMultipleOptionsNewLineSeparator` | loop `if (i.hasNext()) sb.append(defaultNewLine)` |
| `testRenderWrappedTextShortNoWrap` | `renderWrappedText`: `if (pos==-1)` สาขา true (ไม่ wrap) |
| `testRenderWrappedTextWrapsMultipleLines` | สาขา wrap หลายบรรทัด (`while(true)` loop, `pos!=-1`) |
| `testRenderWrappedTextNextLineTabStopGEWidthResetsTo1` | `if (nextLineTabStop >= width) nextLineTabStop = 1` |
| `testPrintWrappedSimpleOverload` | `printWrapped(pw,width,text)` overload |
| `testFindWrapPosNewlineWithinWidth` | `findWrapPos`: เงื่อนไข `'\n'` พบและ `pos<=width` |
| `testFindWrapPosTabWithinWidth` | เงื่อนไข `'\t'` พบ (ไม่มี `'\n'`) และ `pos<=width` |
| `testFindWrapPosTextFitsWidthReturnsMinusOne` | `else if (startPos+width >= text.length()) return -1;` |
| `testFindWrapPosBackwardSearchFindsWhitespace` | backward `while` loop พบ whitespace, `if (pos>startPos) return pos;` |
| `testFindWrapPosForwardSearchFindsWhitespace` | backward ไม่พบ -> forward `while` loop พบ whitespace ก่อนจบ text |
| `testFindWrapPosNoWhitespaceAtAll_KnownBug` | **ดักจับ Cli-32 bug**: forward loop วิ่งถึง `pos==text.length()` แล้วยังเรียก `charAt(pos)` (สาขาที่เป็นข้อบกพร่องจริง) |
| `testCreatePaddingZero/Positive` | `createPadding`: len=0 (edge) และ len>0 |
| `testRtrimNull/Empty/TrailingWhitespace/NoTrailingWhitespace/AllWhitespace` | `rtrim`: `if ((s==null)\|\|(s.length()==0))` ทั้งสอง sub-condition, `while` loop ทุกกรณี (มี/ไม่มี trailing whitespace, whitespace ล้วน) |

**หมายเหตุสำคัญ:** เทส `testFindWrapPosNoWhitespaceAtAll_KnownBug` ถูกออกแบบให้ตรวจจับข้อบกพร่องจริงตาม Defects4J Cli-32 — เมื่อรันกับซอร์สโค้ด buggy เวอร์ชันนี้ คาดว่าจะพบ `StringIndexOutOfBoundsException` ที่บรรทัด `text.charAt(pos)` เมื่อ `pos == text.length()` ใน forward-search loop ของ `findWrapPos` ซึ่งขัดกับ Javadoc ของเมธอดที่ระบุว่าควร "return startPos+width" ไม่ใช่ throw exception
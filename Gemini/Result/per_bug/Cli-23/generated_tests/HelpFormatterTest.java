package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

public class HelpFormatterTest extends TestCase {

    private HelpFormatter formatter;
    private StringWriter sw;
    private PrintWriter pw;

    protected void setUp() throws Exception {
        super.setUp();
        formatter = new HelpFormatter();
        sw = new StringWriter();
        pw = new PrintWriter(sw);
    }

    protected void tearDown() throws Exception {
        formatter = null;
        sw = null;
        pw = null;
        super.tearDown();
    }

    // --- Tests for printHelp and IllegalArgumentException ---

    public void testPrintHelpNullSyntax() {
        try {
            formatter.printHelp(null, new Options());
            fail("Expected IllegalArgumentException for null syntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    vpublic void testPrintHelpEmptySyntax() {
        try {
            formatter.printHelp("", new Options());
            fail("Expected IllegalArgumentException for empty syntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    public void testPrintHelpWithOptionsHeaderFooterAndAutoUsage() {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha description");
        options.addOption("b", "beta", false, "Beta description");

        formatter.printHelp(pw, 80, "syntax", "Header text", options, 2, 4, "Footer text", true);
        pw.flush();
        String output = sw.toString();

        assertTrue(output.contains("usage:"));
        assertTrue(output.contains("Header text"));
        assertTrue(output.contains("Footer text"));
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("--beta"));
    }

    public void testPrintHelpWithoutAutoUsage() {
        Options options = new Options();
        formatter.printHelp(pw, 80, "syntax", "Header", options, 2, 2, "Footer", false);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.startsWith("usage: syntax"));
    }

    // --- Tests for renderOptions combinations (opt, longOpt, args, argName) ---

    public void testRenderOptionsVariations() {
        Options options = new Options();
        
        // Option with only longOpt (no short opt)
        Option opt1 = new Option(null, "longonly", true, "Desc long only");
        opt1.setArgName("FILE");
        options.addOption(opt1);

        // Option with short opt and long opt, no arg name
        Option opt2 = new Option("s", "shortlong", true, "Desc short long");
        opt2.setRequired(true);
        options.addOption(opt2);

        // Option with short opt only, no arg
        Option opt3 = new Option("o", "Only short option desc");
        options.addOption(opt3);

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();

        assertTrue(result.contains("--longonly <FILE>"));
        assertTrue(result.contains("-s,--shortlong"));
        assertTrue(result.contains("-o"));
    }

    // --- Tests for OptionComparator and Custom Comparator ---

    public void testCustomOptionComparator() {
        formatter.setOptionComparator(new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o2).getKey().compareTo(((Option) o1).getKey()); // Reverse order
            }
        });

        assertNotNull(formatter.getOptionComparator());

        // Reset to default
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    // --- Tests for Wrapping and Wrap Positions (Edge cases & CLI-162) ---

    public void testRenderWrappedTextShort() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 40, 5, "Short text");
        assertEquals("Short text", sb.toString());
    }

    public void testRenderWrappedTextWithNewlineAndTab() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 20, 2, "Line1\nLine2\tTabbed");
        assertTrue(sb.toString().length() > 0);
    }

    public void testRenderWrappedTextInfiniteLoopProtection() {
        StringBuffer sb = new StringBuffer();
        try {
            // A very long single word exceeding width without spaces to trigger CLI-162 protection
            formatter.renderWrappedText(sb, 5, 2, "ThisIsAVeryLongWordThatCannotBeWrappedSafelyWithoutSpacesInsideIt");
            fail("Expected RuntimeException to avoid infinite loop [CLI-162]");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Text too long for line"));
        }
    }

    // --- Tests for Utility Methods: rtrim, createPadding, getters/setters ---

    public void testRtrimEdgeCases() {
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("abc", formatter.rtrim("abc   "));
        assertEquals("abc", formatter.rtrim("abc"));
    }

    public void testCreatePadding() {
        assertEquals("    ", formatter.createPadding(4));
        assertEquals("", formatter.createPadding(0));
    }

    public void testGettersAndSetters() {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(6);
        assertEquals(6, formatter.getDescPadding());

        formatter.setSyntaxPrefix("cmd: ");
        assertEquals("cmd: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());

        formatter.setLongOptPrefix("//");
        assertEquals("//", formatter.getLongOptPrefix());

        formatter.setArgName("parameter");
        assertEquals("parameter", formatter.getArgName());
    }

    public void testPrintHelpWithoutArgOverloads() {
        Options options = new Options();
        // Test printHelp(String, Options)
        formatter.printHelp("syntax", options);
        // Test printHelp(String, Options, boolean)
        formatter.printHelp("syntax", options, true);
        // Test printHelp(String, String, Options, String)
        formatter.printHelp("syntax", "header", options, "footer");
        // Test printHelp(String, String, Options, String, boolean)
        formatter.printHelp("syntax", "header", options, "footer", true);
        // Test printHelp(int, String, String, Options, String)
        formatter.printHelp(80, "syntax", "header", options, "footer");
    }
}
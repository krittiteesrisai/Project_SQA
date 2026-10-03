package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

/**
 * High-coverage JUnit 4 test suite for HelpFormatter (Defects4J Cli-24b)
 */
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
        pw.close();
        super.tearDown();
    }

    // --- Tests for printHelp argument validation (Edge Cases & Exceptions) ---

    public void testPrintHelp_NullSyntax() {
        try {
            formatter.printHelp(pw, 80, null, "header", new Options(), 1, 3, "footer", false);
            fail("Expected IllegalArgumentException for null syntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    public void testPrintHelp_EmptySyntax() {
        try {
            formatter.printHelp(pw, 80, "", "header", new Options(), 1, 3, "footer", false);
            fail("Expected IllegalArgumentException for empty syntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    // --- Tests for renderWrappedText & IllegalStateException (Branch Coverage) ---

    public void testRenderWrappedText_InvalidTabStopThrowsException() {
        // When nextLineTabStop >= width, it should throw IllegalStateException
        try {
            formatter.renderWrappedText(new StringBuffer(), 10, 10, "This is a long test string to trigger exception.");
            fail("Expected IllegalStateException when nextLineTabStop >= width");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Total width is less than the width"));
        }
    }

    public void testRenderWrappedText_NoWrapNeeded() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 80, 0, "Short text");
        assertEquals("Short text", sb.toString());
    }

    public void testRenderWrappedText_WithNewline() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 10, 0, "Line1\nLine2");
        String result = sb.toString();
        assertTrue(result.contains("Line1"));
        assertTrue(result.contains("Line2"));
    }

    // --- Tests for OptionComparator and Custom/Null Comparator ---

    public void testSetOptionComparator_Null() {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    public void testSetOptionComparator_Custom() {
        Comparator customComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(customComp);
        assertEquals(customComp, formatter.getOptionComparator());
    }

    // --- Tests for rtrim (Boundary limits & Null/Empty values) ---

    public void testRtrim_Null() {
        assertNull(formatter.rtrim(null));
    }

    public void testRtrim_Empty() {
        assertEquals("", formatter.rtrim(""));
    }

    public void testRtrim_NoTrailingWhitespace() {
        assertEquals("abc", formatter.rtrim("abc"));
    }

    public void testRtrim_WithTrailingWhitespace() {
        assertEquals("abc", formatter.rtrim("abc   "));
    }

    // --- Tests for printHelp with Header, Footer, and AutoUsage ---

    public void testPrintHelp_WithOptionsAndHeaderFooter() {
        Options options = new Options();
        options.addOption("a", "all", false, "Do not hide entries starting with .");
        options.addOption("A", "almost-all", false, "Do not list implied . and ..");

        formatter.printHelp(pw, 80, "mycli", "Header text here", options, 2, 4, "Footer text here", true);
        String output = sw.toString();

        assertTrue(output.contains("usage:"));
        assertTrue(output.contains("Header text here"));
        assertTrue(output.contains("-a,--all"));
        assertTrue(output.contains("Footer text here"));
    }

    public void testPrintHelp_BlankHeaderAndFooter() {
        Options options = new Options();
        // Passing blank/whitespace header and footer to test trimming condition branches
        formatter.printHelp(pw, 80, "mycli", "   ", options, 2, 4, "\t", false);
        String output = sw.toString();
        assertTrue(output.contains("usage:"));
    }
}
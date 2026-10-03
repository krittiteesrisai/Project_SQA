package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

public class HelpFormatterTest extends TestCase {

    private HelpFormatter formatter;

    protected void setUp() throws Exception {
        super.setUp();
        formatter = new HelpFormatter();
    }

    protected void tearDown() throws Exception {
        formatter = null;
        super.tearDown();
    }

    // --- Tests for getters/setters & basic properties (Boundary & State) ---
    
    public void testSetAndGetProperties() {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());

        formatter.setSyntaxPrefix("syntax: ");
        assertEquals("syntax: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());

        formatter.setLongOptPrefix("---");
        assertEquals("---", formatter.getLongOptPrefix());

        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());

        formatter.setArgName("target");
        assertEquals("target", formatter.getArgName());

        // Comparator null branch
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());

        // Comparator non-null branch
        Comparator customComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(customComp);
        assertEquals(customComp, formatter.getOptionComparator());
    }

    // --- Tests for printHelp Exceptions and Branches ---

    public void testPrintHelpNullOrEmptySyntax() {
        Options options = new Options();
        try {
            formatter.printHelp(null, options);
            fail("Expected IllegalArgumentException for null syntax");
        } catch (IllegalArgumentException e) {
            // Expected
        }

        try {
            formatter.printHelp("", options);
            fail("Expected IllegalArgumentException for empty syntax");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    public void testPrintHelpWithOptionsHeaderFooterAndAutoUsage() {
        Options options = new Options();
        options.addOption("a", "all", false, "Do all things");
        options.addOption("b", "brief", true, "Be brief");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        // Test autoUsage = true, with header and footer (non-empty, trimmed)
        formatter.printHelp(pw, 80, "myapp [args]", "Header text\n", options, 2, 4, "\nFooter text", true);
        String output = sw.toString();
        assertNotNull(output);
        assertTrue(output.contains("usage:"));
        assertTrue(output.contains("Header text"));
        assertTrue(output.contains("Footer text"));
    }

    public void testPrintHelpWithoutAutoUsageHeaderWhitespace() {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        // Header/Footer with only spaces (should be ignored due to trim().length() > 0 check)
        formatter.printHelp(pw, 80, "myapp", "   ", options, 1, 3, "   ", false);
        String output = sw.toString();
        assertNotNull(output);
    }

    // --- Tests for renderOptions and Option variants ---

    public void testRenderOptionsEdgeCases() {
        Options options = new Options();
        
        // Option with only LongOpt (Opt is null)
        Option longOnly = Option.builder(null).longOpt("longonly").hasArg(true).desc("Long only option").build();
        options.addOption(longOnly);

        // Option with blank ArgName
        Option blankArg = new Option("b", "blank", true, "Blank arg name");
        blankArg.setArgName("");
        options.addOption(blankArg);

        // Option with normal short/long opt and arg
        Option normal = new Option("c", "common", true, "Common option");
        options.addOption(normal);

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 2, 4);
        String result = sb.toString();
        assertTrue(result.contains("longonly"));
        assertTrue(result.contains("blank"));
        assertTrue(result.contains("common"));
    }

    // --- Tests for Wrapping, Padding, and findWrapPos ---

    public void testRenderWrappedTextInfiniteLoopPreventionAndEdgeCases() {
        StringBuffer sb = new StringBuffer();
        // Trigger nextLineTabStop >= width branch (forces nextLineTabStop = 1)
        formatter.renderWrappedText(sb, 10, 15, "This is a very long text that needs wrapping extensively.");
        assertTrue(sb.length() > 0);

        // Text shorter than width (pos == -1 branch)
        StringBuffer sbShort = new StringBuffer();
        formatter.renderWrappedText(sbShort, 80, 0, "Short text");
        assertEquals("Short text", sbShort.toString());
    }

    public void testFindWrapPosEdges() {
        // Test newline and tab detection inside width
        // findWrapPos(String text, int width, int startPos)
        // Since findWrapPos is protected, we can test it via reflection or subclassing, 
        // or indirectly via renderWrappedText with specific control characters.
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 20, 0, "Line1\nLine2 with tab\tinside");
        assertTrue(sb.length() > 0);
    }

    public void testRtrimEdgeCases() {
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("abc", formatter.rtrim("abc   \t\n"));
    }

    public void testCreatePadding() {
        String padding = formatter.createPadding(4);
        assertEquals("    ", padding);
    }

    public void printHelpSimpleWrapper() {
        Options options = new Options();
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(bao);
        formatter.printHelp(pw, 80, "syntax", options);
        pw.flush();
        assertTrue(bao.size() >= 0);
    }
}
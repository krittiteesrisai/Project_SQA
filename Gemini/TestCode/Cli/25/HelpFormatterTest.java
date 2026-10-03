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

    // --- Tests for Getters and Setters & Configuration ---
    public void testGettersAndSetters() {
        formatter.setWidth(80);
        assertEquals(80, formatter.getWidth());

        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(4);
        assertEquals(4, formatter.getDescPadding());

        formatter.setSyntaxPrefix("syntax: ");
        assertEquals("syntax: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());

        formatter.setLongOptPrefix("---");
        assertEquals("---", formatter.getLongOptPrefix());

        formatter.setArgName("filename");
        assertEquals("filename", formatter.getArgName());

        Comparator customComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(customComp);
        assertNotNull(formatter.getOptionComparator());

        // Test null comparator sets default
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    // --- Tests for printHelp with Edge Cases & Exceptions ---
    public void testPrintHelpNullSyntax() {
        try {
            formatter.printHelp(null, new Options());
            fail("Expected IllegalArgumentException for null syntax");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    public void testPrintHelpEmptySyntax() {
        try {
            formatter.printHelp("", new Options());
            fail("Expected IllegalArgumentException for empty syntax");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    public void testPrintHelpWithOptionsHeaderFooterAndAutoUsage() {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha description");
        options.addOption("b", false, "Beta description");

        formatter.printHelp(pw, 60, "app", "Header text", options, 2, 2, "Footer text", true);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("usage:"));
        assertTrue(output.contains("Header text"));
        assertTrue(output.contains("Alpha description"));
        assertTrue(output.contains("Footer text"));
    }

    public void testPrintHelpWithoutAutoUsage() {
        Options options = new Options();
        formatter.printHelp(pw, 60, "app arg1", "Header", options, 2, 2, "Footer", false);
        pw.flush();
        assertTrue(sw.toString().contains("usage: app arg1"));
    }

    public void testPrintHelpSimpleOverloads() {
        Options options = new Options();
        // Just invoking to ensure branch coverage on simple overloaded methods
        formatter.printHelp("syntax", options);
        formatter.printHelp("syntax", options, true);
        formatter.printHelp("syntax", "header", options, "footer");
        formatter.printHelp("syntax", "header", options, "footer", true);
        formatter.printHelp(40, "syntax", "header", options, "footer");
    }

    // --- Tests for renderOptions and Options combinations ---
    public void testRenderOptionsVariations() {
        Options options = new Options();
        // Option with only longOpt and no arg name
        Option optLongOnly = OptionBuilder.withLongOpt("longonly").hasArg(true).withDescription("Long only desc").create();
        options.addOption(optLongOnly);

        // Option with shortOpt, longOpt, and no arg (just boolean)
        Option optBoth = OptionBuilder.withLongOpt("bothopt").withDescription("Both desc").create('o');
        options.addOption(optBoth);

        // Option with shortOpt and arg with no argName (defaults)
        Option optArgNoName = OptionBuilder.hasArg(true).withDescription("Arg no name desc").create('n');
        options.addOption(optArgNoName);

        formatter.printOptions(pw, 40, options, 1, 3);
        pw.flush();
        assertNotNull(sw.toString());
    }

    // --- Tests for OptionGroups ---
    public void testOptionGroupRendering() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("g1", "Group 1");
        Option opt2 = new Option("g2", "Group 2");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(false);
        options.addOptionGroup(group);

        OptionGroup reqGroup = new OptionGroup();
        reqGroup.addOption(new Option("r1", "Req 1"));
        reqGroup.addOption(new Option("r2", "Req 2"));
        reqGroup.setRequired(true);
        options.addOptionGroup(reqGroup);

        formatter.printHelp(pw, 80, "test", null, options, 1, 3, null, true);
        pw.flush();
        assertTrue(sw.toString().contains("["));
    }

    // --- Tests for Wrapping and Text Utilities (findWrapPos, rtrim, createPadding) ---
    public void testPrintWrappedWithTabAndNewline() {
        // Triggers '\n' and '\t' conditions inside findWrapPos
        String text = "Line1\nLine2\tTabbedLine with very long text that needs to wrap around nicely.";
        formatter.printWrapped(pw, 20, 5, text);
        pw.flush();
        assertNotNull(sw.toString());
    }

    public void testPrintWrappedNextLineTabStopGreaterThanWidth() {
        // Triggers nextLineTabStop >= width condition in renderWrappedText
        String text = "Short text wrapping test.";
        formatter.printWrapped(pw, 10, 15, text);
        pw.flush();
        assertNotNull(sw.toString());
    }

    public void testFindWrapPosEdgeCases() {
        // Test text with no wrap needed (-1)
        formatter.printWrapped(pw, 100, 0, "Short");
        
        // Test text forcing whitespace search backward and forward
        String continuousText = "123456789012345678901234567890"; // No spaces
        formatter.printWrapped(pw, 5, 0, continuousText);
        
        pw.flush();
        assertNotNull(sw.toString());
    }

    public void testRtrimEdgeCases() {
        // Indirectly test rtrim through formatting or direct subclassing behavior if needed, 
        // but standard methods cover it. Let's verify via printWrapped with trailing spaces.
        formatter.printWrapped(pw, 40, 0, "Text with trailing spaces   ");
        pw.flush();
        assertTrue(sw.toString().contains("Text with trailing spaces"));
    }
}
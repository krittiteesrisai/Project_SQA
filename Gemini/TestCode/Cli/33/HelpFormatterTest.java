package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

/**
 * High-coverage JUnit 4 test suite for HelpFormatter targeting Defects4J Cli-33b.
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
        formatter = null;
        sw = null;
        pw = null;
        super.tearDown();
    }

    // 1. Edge Case: Invalid cmdLineSyntax (Null & Empty)
    public void testPrintHelpNullOrEmptySyntax() {
        Options options = new Options();
        try {
            formatter.printHelp(null, options);
            fail("Expected IllegalArgumentException for null cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            formatter.printHelp("", options);
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // 2. Branch Coverage: printHelp with Header, Footer, and autoUsage = true/false
    public void testPrintHelpWithOptionsHeaderFooterAutoUsage() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");

        formatter.printHelp(pw, 80, "syntax", "Header text", options, 2, 4, "Footer text", true);
        String output = sw.toString();
        assertTrue("Should contain usage", output.contains("usage: syntax"));
        assertTrue("Should contain header", output.contains("Header text"));
        assertTrue("Should contain option", output.contains("-a,--alpha"));
        assertTrue("Should contain footer", output.contains("Footer text"));
    }

    // 3. Branch Coverage: OptionGroup (Required vs Optional)
    public void testOptionGroupFormatting() {
        Options options = new Options();
        
        Option opt1 = new Option("o1", "opt1", false, "Option 1");
        Option opt2 = new Option("o2", "opt2", false, "Option 2");
        
        OptionGroup groupOptional = new OptionGroup();
        groupOptional.addOption(opt1);
        groupOptional.addOption(opt2);
        groupOptional.setRequired(false);
        options.addOptionGroup(groupOptional);

        Option opt3 = new Option("o3", "opt3", false, "Option 3");
        Option opt4 = new Option("o4", "opt4", false, "Option 4");
        
        OptionGroup groupRequired = new OptionGroup();
        groupRequired.addOption(opt3);
        groupRequired.addOption(opt4);
        groupRequired.setRequired(true);
        options.addOptionGroup(groupRequired);

        formatter.printUsage(pw, 80, "app", options);
        String usage = sw.toString();
        
        assertTrue("Optional group should be enclosed in []", usage.contains("[-o1,--opt1 | -o2,--opt2]"));
        assertTrue("Required group should NOT be enclosed in []", usage.contains("-o3,--opt3 | -o4,--opt4"));
    }

    // 4. Branch Coverage: Option with LongOpt only & various ArgName states
    public void testRenderOptionsEdgeCases() {
        Options options = new Options();
        
        // Option with LongOpt only (no short opt)
        Option longOnly = new Option(null, "longonly", true, "Long only description");
        longOnly.setArgName("file");
        options.addOption(longOnly);

        // Option with blank argName
        Option blankArg = new Option("b", "blank", true, "Blank arg name");
        blankArg.setArgName("");
        options.addOption(blankArg);

        // Option with null argName (should fallback to default argName)
        Option nullArg = new Option("n", "nullarg", true, "Null arg name");
        nullArg.setArgName(null);
        options.addOption(nullArg);

        formatter.printOptions(pw, 80, options, 2, 3);
        String rendered = sw.toString();
        
        assertTrue("Should handle longOpt only", rendered.contains("--longonly"));
        assertTrue("Should handle blank argName", rendered.contains("-b,--blank "));
        assertTrue("Should handle null argName falling back to default", rendered.contains("<arg>"));
    }

    // 5. Branch Coverage: Wrapped Text & Infinite Loop Prevention (Cli-33 specific)
    public void testRenderWrappedTextInfiniteLoopPrevention() {
        // Force nextLineTabStop >= width to trigger the branch: if (nextLineTabStop >= width) nextLineTabStop = 1;
        StringBuffer sb = new StringBuffer();
        // width = 10, nextLineTabStop = 15 (which is >= width)
        formatter.renderWrappedText(sb, 10, 15, "This is a very long text that needs wrapping properly without infinite looping.");
        assertNotNull(sb.toString());
        assertTrue(sb.length() > 0);
    }

    // 6. Branch Coverage: findWrapPos with newline and tab characters
    public void testFindWrapPosSpecialChars() {
        HelpFormatter hf = new HelpFormatter();
        // Test newline within width
        int posNewline = hf.findWrapPos("Line1\nLine2", 10, 0);
        assertEquals(6, posNewline);

        // Test tab within width
        int posTab = hf.findWrapPos("Col1\tCol2", 10, 0);
        assertEquals(5, posTab);

        // Test when startPos + width >= text.length()
        int posEnd = hf.findWrapPos("Short", 10, 0);
        assertEquals(-1, posEnd);
    }

    // 7. Branch Coverage: setOptionComparator with null and custom comparator
    public void testSetOptionComparator() {
        assertNotNull(formatter.getOptionComparator());
        
        formatter.setOptionComparator(null);
        assertNotNull("Setting null comparator should fallback to default OptionComparator", formatter.getOptionComparator());

        Comparator customComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(customComp);
        assertEquals(customComp, formatter.getOptionComparator());
    }

    // 8. Utility Coverage: rtrim and createPadding
    public void testUtilities() {
        assertEquals("abc", formatter.rtrim("abc   \t\n"));
        assertEquals("", formatter.rtrim("   "));
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));

        String padding = formatter.createPadding(5);
        assertEquals("     ", padding);
    }
}
package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

/**
 * High-coverage JUnit test suite for HelpFormatter targeting branches, 
 * edge cases, boundary limits, and subtle defects (such as Cli-11).
 */
public class HelpFormatterTest extends TestCase {

    private HelpFormatter formatter;
    private StringWriter stringWriter;
    private PrintWriter printWriter;
    private final String EOL = System.getProperty("line.separator");

    protected void setUp() throws Exception {
        super.setUp();
        formatter = new HelpFormatter();
        stringWriter = new StringWriter();
        printWriter = new PrintWriter(stringWriter);
    }

    // -------------------------------------------------------------------------
    // 1. Getters, Setters, and Bean Properties
    // -------------------------------------------------------------------------

    public void testGettersAndSetters() {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(8);
        assertEquals(8, formatter.getDescPadding());

        formatter.setSyntaxPrefix("Syntax: ");
        assertEquals("Syntax: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());

        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());

        formatter.setLongOptPrefix("//");
        assertEquals("//", formatter.getLongOptPrefix());

        formatter.setArgName("parameter");
        assertEquals("parameter", formatter.getArgName());
    }

    public void testOptionComparatorBranches() {
        Comparator customComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        formatter.setOptionComparator(customComparator);
        assertSame(customComparator, formatter.getOptionComparator());

        // Branch: comparator == null (reset to default OptionComparator)
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        assertNotSame(customComparator, formatter.getOptionComparator());
    }

    // -------------------------------------------------------------------------
    // 2. Validation & Boundary Conditions for printHelp
    // -------------------------------------------------------------------------

    public void testPrintHelpNullCmdLineSyntax() {
        try {
            formatter.printHelp(printWriter, 80, null, "header", new Options(), 1, 3, "footer", true);
            fail("Expected IllegalArgumentException for null cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    public void testPrintHelpEmptyCmdLineSyntax() {
        try {
            formatter.printHelp(printWriter, 80, "", "header", new Options(), 1, 3, "footer", true);
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    public void testPrintHelpWithHeaderAndFooterVariants() {
        Options options = new Options();
        options.addOption("a", false, "Option A description");

        // Case 1: Non-empty trimmed header and footer
        formatter.printHelp(printWriter, 80, "app", "Header banner", options, 2, 2, "Footer banner", false);
        printWriter.flush();
        String output = stringWriter.toString();
        assertTrue(output.contains("Header banner"));
        assertTrue(output.contains("Footer banner"));
        assertTrue(output.contains("usage: app"));

        // Case 2: Blank or null header and footer
        stringWriter.getBuffer().setLength(0);
        formatter.printHelp(printWriter, 80, "app", "   ", options, 2, 2, null, true);
        printWriter.flush();
        output = stringWriter.toString();
        assertFalse(output.contains("   " + EOL));
        assertTrue(output.contains("usage: app [-a]"));
    }

    public void testPrintHelpOverloadsCoverage() {
        Options options = new Options();
        options.addOption("h", "help", false, "Show help");

        // Redirect System.out temporarily to verify printHelp overloads printing to console
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out);

        formatter.printHelp(pw, 80, "myApp", "header", options, 1, 3, "footer");
        pw.flush();
        assertTrue(out.toString().contains("usage: myApp"));

        out.reset();
        formatter.printHelp("myApp", options);
        formatter.printHelp("myApp", options, true);
        formatter.printHelp("myApp", "hdr", options, "ftr");
        formatter.printHelp("myApp", "hdr", options, "ftr", true);
        formatter.printHelp(80, "myApp", "hdr", options, "ftr");
        formatter.printHelp(80, "myApp", "hdr", options, "ftr", true);
    }

    // -------------------------------------------------------------------------
    // 3. Option Groups & Combinations in Usage Statement
    // -------------------------------------------------------------------------

    public void testPrintUsageWithOptionGroupsRequiredAndOptional() {
        Options options = new Options();

        // Required Option Group
        OptionGroup requiredGroup = new OptionGroup();
        requiredGroup.setRequired(true);
        Option optA = new Option("a", "alpha", false, "alpha option");
        Option optB = new Option("b", "beta", true, "beta option");
        optB.setArgName("val");
        requiredGroup.addOption(optA);
        requiredGroup.addOption(optB);

        // Optional Option Group
        OptionGroup optionalGroup = new OptionGroup();
        optionalGroup.setRequired(false);
        Option optC = new Option(null, "charlie", false, "charlie option"); // Long option only
        Option optD = new Option("d", false, "delta option");
        optionalGroup.addOption(optC);
        optionalGroup.addOption(optD);

        options.addOptionGroup(requiredGroup);
        options.addOptionGroup(optionalGroup);

        formatter.printUsage(printWriter, 80, "groupApp", options);
        printWriter.flush();
        String usage = stringWriter.toString();

        // Required group should not be wrapped in outermost brackets, but separated by |
        assertTrue(usage.contains("-a | -b <val>"));
        // Optional group should be wrapped in brackets [ ... | ... ]
        assertTrue(usage.contains("[--charlie | -d]"));
    }

    // -------------------------------------------------------------------------
    // 4. Defects4J Cli-11 Bug Reproduction & Edge Cases
    // -------------------------------------------------------------------------

    public void testPrintUsageOptionWithEmptyArgNameBugCli11() {
        Options options = new Options();
        Option opt = new Option("f", true, "file path");
        // Explicitly set argName to empty string
        opt.setArgName("");
        options.addOption(opt);

        formatter.printUsage(printWriter, 80, "myApp", options);
        printWriter.flush();
        String usage = stringWriter.toString();

        // In Defects4J Cli-11, buggy HelpFormatter outputs: "usage: myApp [-f <>]"
        // The fix prevents printing "<>" when argName is empty or hasArgName() is false.
        assertFalse("Cli-11 Fault: Empty argName must not render empty brackets '<>'", 
                    usage.contains("<>"));
        assertTrue(usage.contains("[-f]"));
    }

    public void testPrintUsageOptionWithoutShortOpt() {
        Options options = new Options();
        Option opt = new Option(null, "config", true, "Config file");
        opt.setRequired(true);
        opt.setArgName("file");
        options.addOption(opt);

        formatter.printUsage(printWriter, 80, "cfgApp", options);
        printWriter.flush();
        String usage = stringWriter.toString();

        assertTrue(usage.contains("cfgApp --config <file>"));
    }

    public void testPrintUsageSimpleSyntax() {
        formatter.printUsage(printWriter, 60, "cmdLineSyntax arg1 arg2");
        printWriter.flush();
        String output = stringWriter.toString();
        assertTrue(output.contains("usage: cmdLineSyntax arg1 arg2"));
    }

    // -------------------------------------------------------------------------
    // 5. Option Rendering Variations (renderOptions)
    // -------------------------------------------------------------------------

    public void testRenderOptionsBranches() {
        Options options = new Options();
        
        // 1. Short opt only, has argument without custom name (hasArgName == false)
        Option opt1 = new Option("a", false, "Description of a");
        
        // 2. Short opt and Long opt, has argument with name
        Option opt2 = new Option("b", "beta", true, "Description of beta");
        opt2.setArgName("VAL");

        // 3. Long opt only, no short opt, no description
        Option opt3 = new Option(null, "gamma", false, null);

        // 4. Short opt, has argument but argName set to null (defaults to "arg" or empty depending on Option)
        Option opt4 = new Option("d", true, "Description with multi line text that needs to wrap properly in renderOptions");
        opt4.setArgName(null);

        options.addOption(opt1);
        options.addOption(opt2);
        options.addOption(opt3);
        options.addOption(opt4);

        formatter.printOptions(printWriter, 60, options, 2, 4);
        printWriter.flush();
        String output = stringWriter.toString();

        assertTrue(output.contains("  -a"));
        assertTrue(output.contains("  -b,--beta <VAL>"));
        assertTrue(output.contains("     --gamma"));
        assertTrue(output.contains("  -d <arg>"));
    }

    // -------------------------------------------------------------------------
    // 6. Text Wrapping Logic (findWrapPos, renderWrappedText)
    // -------------------------------------------------------------------------

    public void testFindWrapPosDirectEdgeCases() {
        // Condition: newline found within width
        String textWithNl = "Line1\nLine2";
        assertEquals(6, formatter.findWrapPos(textWithNl, 10, 0));

        // Condition: tab found within width
        String textWithTab = "Col1\tCol2";
        assertEquals(5, formatter.findWrapPos(textWithTab, 10, 0));

        // Condition: startPos + width >= text.length()
        String shortText = "Short text";
        assertEquals(-1, formatter.findWrapPos(shortText, 20, 0));

        // Condition: word fits exactly before width
        String wrapAtSpace = "Hello World Commons Cli";
        // Width 12: "Hello World " -> whitespace at index 11
        assertEquals(11, formatter.findWrapPos(wrapAtSpace, 12, 0));

        // Condition: continuous characters longer than width, whitespace found AFTER width
        String longWord = "Supercalifragilisticexpialidocious and more";
        // Width 10: no space before index 10, first space at index 34
        assertEquals(34, formatter.findWrapPos(longWord, 10, 0));

        // Condition: unbroken text with no whitespace anywhere, returns -1
        String unbroken = "Supercalifragilisticexpialidocious";
        assertEquals(-1, formatter.findWrapPos(unbroken, 10, 0));
    }

    public void testRenderWrappedTextMultiLineWithPadding() {
        String longText = "This is a long sentence that should be wrapped over multiple lines with proper indentation.";
        StringBuffer sb = new StringBuffer();
        
        // width = 30, tabStop = 4
        formatter.renderWrappedText(sb, 30, 4, longText);
        String wrapped = sb.toString();

        String[] lines = wrapped.split(EOL);
        assertTrue(lines.length > 1);
        for (int i = 1; i < lines.length; i++) {
            assertTrue("Subsequent line should be indented by 4 spaces", lines[i].startsWith("    "));
        }
    }

    public void testRenderWrappedTextShortText() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 80, 0, "No wrapping needed here.");
        assertEquals("No wrapping needed here.", sb.toString());
    }

    // -------------------------------------------------------------------------
    // 7. Utility Methods: rtrim & createPadding
    // -------------------------------------------------------------------------

    public void testRtrim() {
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("text", formatter.rtrim("text"));
        assertEquals("text", formatter.rtrim("text   "));
        assertEquals("text", formatter.rtrim("text \t \r \n"));
        assertEquals("  leading and middle", formatter.rtrim("  leading and middle   \t"));
    }

    public void testCreatePadding() {
        assertEquals("", formatter.createPadding(0));
        assertEquals("   ", formatter.createPadding(3));
        assertEquals(10, formatter.createPadding(10).length());
    }
}
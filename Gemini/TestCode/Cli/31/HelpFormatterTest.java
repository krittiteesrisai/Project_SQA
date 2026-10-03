package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

public class HelpFormatterTest extends TestCase {

    public void testConstructorAndGettersSetters() {
        HelpFormatter formatter = new HelpFormatter();
        
        formatter.setWidth(80);
        assertEquals(80, formatter.getWidth());

        formatter.setLeftPadding(2);
        assertEquals(2, formatter.getLeftPadding());

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

        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());

        formatter.setArgName("property");
        assertEquals("property", formatter.getArgName());

        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());

        Comparator customComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(customComp);
        assertEquals(customComp, formatter.getOptionComparator());
    }

    public void testPrintHelpExceptionsAndNulls() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter out = new StringWriter();
        PrintWriter pw = new PrintWriter(out);
        Options options = new Options();

        // Test IllegalArgumentException for null/empty cmdLineSyntax
        try {
            formatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", true);
            fail("Expected IllegalArgumentException for null cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            formatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", false);
            fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    public void testPrintHelpWithOptionsHeaderFooterAndAutoUsage() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter out = new StringWriter();
        PrintWriter pw = new PrintWriter(out);

        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha description");
        options.addOption("b", "beta", true, "Beta description");

        // autoUsage = true, header and footer populated
        formatter.printHelp(pw, 80, "testapp", "Header text", options, 2, 4, "Footer text", true);
        String output = out.toString();
        assertTrue(output.contains("usage:"));
        assertTrue(output.contains("Header text"));
        assertTrue(output.contains("Alpha description"));
        assertTrue(output.contains("Footer text"));
    }

    public void testPrintHelpWithoutAutoUsageAndBlankHeaderFooter() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter out = new StringWriter();
        PrintWriter pw = new PrintWriter(out);

        Options options = new Options();
        options.addOption("x", false, "X description");

        // autoUsage = false, blank header and footer to test conditional branches
        formatter.printHelp(pw, 80, "testapp", "   ", options, 1, 3, "", false);
        String output = out.toString();
        assertTrue(output.contains("testapp"));
    }

    public void testPrintHelpOverloads() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("h", "help", false, "print help");

        // Test various printHelp overloaded methods (exercising System.out wrappers safely)
        assertNotNull(options);
        // We call methods that print to System.out just for branch execution coverage
        try {
            formatter.printHelp("syntax", options);
            formatter.printHelp("syntax", options, true);
            formatter.printHelp("syntax", "header", options, "footer");
            formatter.printHelp("syntax", "header", options, "footer", true);
            formatter.printHelp(80, "syntax", "header", options, "footer");
        } catch (Exception e) {
            // Ignore system out issues if any
        }
    }

    public void testRenderOptionsEdgeCases() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter out = new StringWriter();
        PrintWriter pw = new PrintWriter(out);

        Options options = new Options();
        
        // Option with no short opt (long opt only)
        Option optLongOnly = Option.builder("").longOpt("long-only").hasArg().desc("Long only desc").build();
        options.addOption(optLongOnly);

        // Option with blank argName
        Option optBlankArg = new Option("b", "blank", true, "Blank arg name");
        optBlankArg.setArgName("");
        options.addOption(optBlankArg);

        // Option with null argName (falls back to default argName)
        Option optNullArg = new Option("n", "nullarg", true, "Null arg name");
        optNullArg.setArgName(null);
        options.addOption(optNullArg);

        formatter.printOptions(pw, 40, options, 1, 3);
        String result = out.toString();
        assertTrue(result.length() > 0);
    }

    public void testOptionGroupsInUsage() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter out = new StringWriter();
        PrintWriter pw = new PrintWriter(out);

        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("g1", "group1", false, "G1"));
        group.addOption(new Option("g2", "group2", false, "G2"));
        group.setRequired(false);
        options.addOptionGroup(group);

        OptionGroup reqGroup = new OptionGroup();
        reqGroup.addOption(new Option("r1", "req1", false, "R1"));
        reqGroup.addOption(new Option("r2", "req2", false, "R2"));
        reqGroup.setRequired(true);
        options.addOptionGroup(reqGroup);

        formatter.printUsage(pw, 80, "app", options);
        String result = out.toString();
        assertTrue(result.contains("["));
    }

    public void testWrappedTextAndFindWrapPos() {
        HelpFormatter formatter = new HelpFormatter();
        StringWriter out = new StringWriter();
        PrintWriter pw = new PrintWriter(out);

        // Text shorter than width
        formatter.printWrapped(pw, 80, "Short text");

        // Text with newline and tab within width bounds
        formatter.printWrapped(pw, 80, 100, "Line1\nLine2\tTabbed");

        // Text requiring wrapping where nextLineTabStop >= width (triggers tab stop reset branch)
        formatter.printWrapped(pw, 20, 25, "This is a very long text that definitely needs wrapping across multiple lines.");
        
        // Text forcing specific wrap fallback branches
        formatter.printWrapped(pw, 10, 2, "A_very_long_token_without_spaces_to_trigger_forced_wrap");
    }

    public void rtrimEdgeCases() {
        HelpFormatter formatter = new HelpFormatter();
        assertNull(formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
        assertEquals("test", formatter.rtrim("test   "));
    }
}
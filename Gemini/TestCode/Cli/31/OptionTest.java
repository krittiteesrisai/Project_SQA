package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.List;

/**
 * High coverage JUnit 4 (JUnit 3 compatible runner) test suite for Apache Commons CLI Option (Defects4J Cli-31b).
 */
public class OptionTest extends TestCase {

    public OptionTest(String name) {
        super(name);
    }

    // --- Constructor & Basic Getters/Setters ---

    public void testConstructorsAndGetters() {
        Option opt1 = new Option("a", "desc");
        assertEquals("a", opt1.getOpt());
        assertNull(opt1.getLongOpt());
        assertFalse(opt1.hasArg());
        assertEquals("desc", opt1.getDescription());

        Option opt2 = new Option("b", true, "descB");
        assertEquals("b", opt2.getOpt());
        assertTrue(opt2.hasArg());
        assertEquals(1, opt2.getArgs());

        Option opt3 = new Option("c", "longC", false, "descC");
        assertEquals("c", opt3.getOpt());
        assertEquals("longC", opt3.getLongOpt());
        assertFalse(opt3.hasArg());
        assertTrue(opt3.hasLongOpt());
    }

    public void testInvalidOptionCharacter() {
        try {
            new Option(" ", "Invalid option");
            fail("Expected IllegalArgumentException for invalid option character");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    // --- Key and ID ---

    public void testGetKeyAndId() {
        Option opt = new Option("a", "alpha", false, "desc");
        assertEquals("a", opt.getKey());
        assertEquals('a', opt.getId());

        Option longOnly = new Option(null, "longOpt", false, "desc");
        assertEquals("longOpt", longOnly.getKey());
    }

    // --- Argument Configuration & Boundaries ---

    public void testArgumentLimitsAndFlags() {
        Option opt = new Option("a", true, "desc");
        assertTrue(opt.hasArg());
        assertFalse(opt.hasArgs());

        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.hasArg());
        assertTrue(opt.hasArgs());

        opt.setArgs(2);
        assertTrue(opt.hasArg());
        assertTrue(opt.hasArgs());

        opt.setArgs(0);
        assertFalse(opt.hasArg());
        assertFalse(opt.hasArgs());

        opt.setOptionalArg(true);
        assertTrue(opt.hasOptionalArg());
    }

    public void testArgName() {
        Option opt = new Option("a", "desc");
        assertTrue(opt.hasArgName()); // default is "arg"
        opt.setArgName("");
        assertFalse(opt.hasArgName());
        opt.setArgName("file");
        assertTrue(opt.hasArgName());
        assertEquals("file", opt.getArgName());
    }

    // --- Value Processing & Separator ---

    public void testAddValueForProcessingUninitialized() {
        Option opt = new Option("a", "desc");
        // numberOfArgs is UNINITIALIZED (-1) by default for this constructor
        try {
            opt.addValueForProcessing("val");
            fail("Expected RuntimeException due to uninitialized args");
        } catch (RuntimeException e) {
            assertEquals("NO_ARGS_ALLOWED", e.getMessage());
        }
    }

    public void testValueSeparatorAndProcessing() {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        opt.setValueSeparator('=');
        assertEquals('=', opt.getValueSeparator());
        assertTrue(opt.hasValueSeparator());

        opt.addValueForProcessing("key=value1=value2");
        String[] values = opt.getValues();
        assertEquals(3, values.length);
        assertEquals("key", values[0]);
        assertEquals("value1", values[1]);
        assertEquals("value2", values[2]);
    }

    public void testValueSeparatorWithLimitedArgs() {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(2); // Can take 2 arguments max
        opt.setValueSeparator(':');

        opt.addValueForProcessing("v1:v2:v3");
        String[] values = opt.getValues();
        // Should stop parsing when values.size() == numberOfArgs - 1 (i.e. 2 - 1 = 1)
        assertEquals(2, values.length);
        assertEquals("v1", values[0]);
        assertEquals("v2:v3", values[1]);
    }

    public void testAddValueLimitExceeded() {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("first");
        try {
            opt.addValueForProcessing("second");
            fail("Expected RuntimeException when list is full");
        } catch (RuntimeException e) {
            assertEquals("Cannot add value, list full.", e.getMessage());
        }
    }

    // --- Value Retrieval & Edge Cases ---

    public void testValueRetrievalEdgeCases() {
        Option opt = new Option("a", true, "desc");
        assertNull(opt.getValue());
        assertNull(opt.getValues());
        assertNull(opt.getValuesList().isEmpty() ? null : opt.getValuesList());
        assertEquals("default", opt.getValue("default"));

        opt.setArgs(Option.UNLIMITED_VALUES);
        opt.addValueForProcessing("val0");
        opt.addValueForProcessing("val1");

        assertEquals("val0", opt.getValue());
        assertEquals("val0", opt.getValue(0));
        assertEquals("val1", opt.getValue(1));
        assertEquals("val0", opt.getValue("default"));

        try {
            opt.getValue(5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }

        String[] allValues = opt.getValues();
        assertEquals(2, allValues.length);
    }

    // --- RequiresArg & AcceptsArg Coverage ---

    public void testRequiresAndAcceptsArg() {
        Option opt = new Option("a", true, "desc");
        assertTrue(opt.acceptsArg());
        assertTrue(opt.requiresArg());

        opt.setOptionalArg(true);
        assertTrue(opt.requiresArg() == false); // optionalArg makes requiresArg return false

        Option optUnlimited = new Option("b", true, "desc");
        optUnlimited.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(optUnlimited.requiresArg());
        optUnlimited.addValueForProcessing("val");
        assertFalse(optUnlimited.requiresArg()); // size < 1 becomes false once added
    }

    // --- Deprecated / Unsupported methods ---

    public void testAddValueUnsupported() {
        Option opt = new Option("a", "desc");
        try {
            opt.addValue("test");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    // --- Object Methods: toString, equals, hashCode, clone, clearValues ---

    public void testToString() {
        Option opt = new Option("a", "longA", true, "descriptionA");
        opt.setType(String.class);
        String str = opt.toString();
        assertTrue(str.contains("a"));
        assertTrue(str.contains("longA"));
        assertTrue(str.contains("descriptionA"));
        assertTrue(str.contains("class java.lang.String"));

        Option optNoArg = new Option("b", false, "descB");
        assertTrue(optNoArg.toString().contains("[ARG]"));

        Option optManyArgs = new Option("c", true, "descC");
        optManyArgs.setArgs(2);
        assertTrue(optManyArgs.toString().contains("[ARG...]"));
    }

    public void testEqualsAndHashCode() {
        Option opt1 = new Option("a", "longA", false, "desc");
        Option opt2 = new Option("a", "longA", false, "desc");
        Option opt3 = new Option("b", "longA", false, "desc");
        Option opt4 = new Option("a", "longB", false, "desc");
        Option optNullOpt1 = new Option(null, "longA", false, "desc");
        Option optNullOpt2 = new Option(null, "longA", false, "desc");
        Option optNullOpt3 = new Option(null, "longB", false, "desc");

        assertEquals(opt1, opt1);
        assertEquals(opt1, opt2);
        assertEquals(opt1.hashCode(), opt2.hashCode());

        assertFalse(opt1.equals(null));
        assertFalse(opt1.equals("string-object"));
        assertFalse(opt1.equals(opt3));
        assertFalse(opt1.equals(opt4));

        assertEquals(optNullOpt1, optNullOpt2);
        assertEquals(optNullOpt1.hashCode(), optNullOpt2.hashCode());
        assertFalse(optNullOpt1.equals(optNullOpt3));

        // Mixed null opt cases
        Option optNullOptMixed = new Option(null, "longA", false, "desc");
        Option optNonNullOpt = new Option("a", "longA", false, "desc");
        assertFalse(optNonNullOpt.equals(optNullOptMixed));
        assertFalse(optNullOptMixed.equals(optNonNullOpt));
    }

    public void testCloneAndClearValues() {
        Option opt = new Option("a", true, "desc");
        opt.setArgs(2);
        opt.addValueForProcessing("val1");

        Option cloned = (Option) opt.clone();
        assertEquals(opt.getOpt(), cloned.getOpt());
        assertEquals(1, cloned.getValuesList().size());

        opt.clearValues();
        assertEquals(0, opt.getValuesList().size());
        assertEquals(1, cloned.getValuesList().size()); // Ensure deep copy of values list
    }
}
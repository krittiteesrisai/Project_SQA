package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collection;

public class OptionGroupTest {

    @Test
    public void testAddAndGetOptions() {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "Description A");
        Option optB = new Option("b", "beta", false, "Description B");

        group.addOption(optA);
        group.addOption(optB);

        Collection<Option> options = group.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(optA));
        assertTrue(options.contains(optB));

        Collection<String> names = group.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
    }

    @Test
    public void testRequiredState() {
        OptionGroup group = new OptionGroup();
        assertFalse("Default required should be false", group.isRequired());

        group.setRequired(true);
        assertTrue("Required should be true after setting", group.isRequired());

        group.setRequired(false);
        assertFalse("Required should be false after resetting", group.isRequired());
    }

    @Test
    public void testSetSelectedNull() throws AlreadySelectedException {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "Desc A");

        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        // Reset with null
        group.setSelected(null);
        assertNull("Selected should be reset to null", group.getSelected());
    }

    @Test
    public void testSetSelectedFirstTime() throws AlreadySelectedException {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "Desc A");

        group.setSelected(optA);
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testReselectSameOption() throws AlreadySelectedException {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "Desc A");

        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        // Reselecting the same option should not throw an exception
        group.setSelected(optA);
        assertEquals("a", group.getSelected());
    }

    @Test(expected = AlreadySelectedException.class)
    public void testSetSelectedConflictThrowsException() throws AlreadySelectedException {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "Desc A");
        Option optB = new Option("b", "beta", false, "Desc B");

        group.setSelected(optA);
        // Selecting a different option should trigger AlreadySelectedException
        group.setSelected(optB);
    }

    @Test
    public void testToStringEmpty() {
        OptionGroup group = new OptionGroup();
        assertEquals("[]", group.toString());
    }

    @Test
    public void testToStringWithShortOptAndDescription() {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", false, "desc a");
        group.addOption(optA);

        assertEquals("[-a desc a]", group.toString());
    }

    @Test
    public void testToStringWithLongOptOnlyNoDescription() {
        OptionGroup group = new OptionGroup();
        // Option with null short opt (using Builder pattern or constructor if available, 
        // standard constructor with null shortOpt or longOpt only)
        Option optLong = Option.builder("").longOpt("long-only").desc(null).build();
        group.addOption(optLong);

        assertEquals("[--long-only]", group.toString());
    }

    @Test
    public void testToStringMultipleOptionsComplex() {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "descA");
        Option optLong = Option.builder("").longOpt("beta").desc("descB").build();
        
        group.addOption(optA);
        group.addOption(optLong);

        // Order in HashMap might vary, but since we know keys, let's verify both possibilities or construct carefully
        String result = group.toString();
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertTrue(result.contains("-a descA"));
        assertTrue(result.contains("--beta descB"));
        assertTrue(result.contains(", "));
    }
}
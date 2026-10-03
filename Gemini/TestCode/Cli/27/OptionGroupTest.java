package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.Collection;
import java.util.Iterator;

public class OptionGroupTest extends TestCase {

    public void testAddAndGetOptions() {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "Desc A");
        Option optB = new Option("b", "beta", false, "Desc B");

        group.addOption(optA);
        group.addOption(optB);

        Collection names = group.getNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));

        Collection options = group.getOptions();
        assertEquals(2, options.size());
        assertTrue(options.contains(optA));
        assertTrue(options.contains(optB));
    }

    public void testSetSelectedNull() throws AlreadySelectedException {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "Desc A");

        group.setSelected(optA);
        assertEquals("a", group.getSelected());

        // Reset with null
        group.setSelected(null);
        assertNull(group.getSelected());
    }

    public void testSetSelectedFirstTime() throws AlreadySelectedException {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "Desc A");

        group.setSelected(optA);
        assertEquals("a", group.getSelected());
    }

    public void testReselectSameOption() throws AlreadySelectedException {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "Desc A");

        group.setSelected(optA);
        // Reselecting the same option should not throw an exception
        group.setSelected(optA);
        assertEquals("a", group.getSelected());
    }

    public void testAlreadySelectedException() {
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "Desc A");
        Option optB = new Option("b", "beta", false, "Desc B");

        try {
            group.setSelected(optA);
            group.setSelected(optB);
            fail("Expected AlreadySelectedException to be thrown");
        } catch (AlreadySelectedException e) {
            assertEquals(group, e.getOptionGroup());
            assertEquals(optB, e.getOption());
        }
    }

    public void testRequiredState() {
        OptionGroup group = new OptionGroup();
        assertFalse(group.isRequired());

        group.setRequired(true);
        assertTrue(group.isRequired());

        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    public void testToStringWithShortAndLongOpts() {
        OptionGroup group = new OptionGroup();
        
        // Option with short opt
        Option optA = new Option("a", "alpha", false, "Desc A");
        // Option without short opt (only long opt)
        Option optB = new Option(null, "beta", false, "Desc B");

        group.addOption(optA);
        group.addOption(optB);

        String result = group.toString();
        // Expected format: [-a Desc A, --beta Desc B]
        assertEquals("[-a Desc A, --beta Desc B]", result);
    }
}
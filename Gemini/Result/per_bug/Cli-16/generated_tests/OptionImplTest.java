package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import junit.framework.TestCase;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;

/**
 * Robust JUnit test suite for OptionImpl targeting high branch coverage
 * and boundary/edge cases under Defects4J Cli-16.
 */
public class OptionImplTest extends TestCase {

    /**
     * Concrete stub implementation to allow testing of abstract OptionImpl.
     */
    private static class ConcreteOption extends OptionImpl {
        private final String preferredName;
        private final String description;
        private final Set prefixes;
        private final Set triggers;
        private boolean canProcessResult = true;

        public ConcreteOption(final int id,
                              final boolean required,
                              final String preferredName,
                              final String description,
                              final Set prefixes,
                              final Set triggers) {
            super(id, required);
            this.preferredName = preferredName;
            this.description = description;
            this.prefixes = (prefixes == null) ? Collections.EMPTY_SET : prefixes;
            this.triggers = (triggers == null) ? Collections.EMPTY_SET : triggers;
        }

        public void setCanProcessResult(final boolean result) {
            this.canProcessResult = result;
        }

        public boolean canProcess(final WriteableCommandLine commandLine, final String argument) {
            return canProcessResult;
        }

        public void process(final WriteableCommandLine commandLine, final ListIterator arguments)
                throws OptionException {
            // no-op for tests
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public Set getTriggers() {
            return triggers;
        }

        public void validate(final WriteableCommandLine commandLine) throws OptionException {
            // no-op for tests
        }

        public void appendUsage(final StringBuffer buffer, final Set helpSettings, final Comparator comp) {
            if (preferredName != null) {
                buffer.append(preferredName);
            }
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return description;
        }

        public List helpLines(final int depth, final Set helpSettings, final Comparator comp) {
            return Collections.EMPTY_LIST;
        }

        // Expose protected checkPrefixes for testing
        public void testCheckPrefixes(final Set prefixes) {
            super.checkPrefixes(prefixes);
        }
    }

    private Set createSet(final String[] items) {
        final Set set = new HashSet();
        if (items != null) {
            for (int i = 0; i < items.length; i++) {
                set.add(items[i]);
            }
        }
        return set;
    }

    // -------------------------------------------------------------------------
    // Constructor, Id, Required tests
    // -------------------------------------------------------------------------

    public void testConstructorAndGetters() {
        final ConcreteOption opt1 = new ConcreteOption(1, true, "--opt", "desc", null, null);
        assertEquals(1, opt1.getId());
        assertTrue(opt1.isRequired());

        final ConcreteOption opt2 = new ConcreteOption(-100, false, null, null, null, null);
        assertEquals(-100, opt2.getId());
        assertFalse(opt2.isRequired());

        final ConcreteOption optBoundary = new ConcreteOption(Integer.MAX_VALUE, true, null, null, null, null);
        assertEquals(Integer.MAX_VALUE, optBoundary.getId());
    }

    // -------------------------------------------------------------------------
    // canProcess(WriteableCommandLine, ListIterator) tests
    // -------------------------------------------------------------------------

    public void testCanProcessWithEmptyArguments() {
        final ConcreteOption opt = new ConcreteOption(1, false, "--test", null, null, null);
        final List args = new ArrayList();
        final ListIterator it = args.listIterator();

        assertFalse("Should return false when arguments iterator has no elements",
                opt.canProcess(null, it));
    }

    public void testCanProcessWithArgumentsAndCheckPointerRollback() {
        final ConcreteOption opt = new ConcreteOption(1, false, "--test", null, null, null);
        final List args = new ArrayList();
        args.add("--test");
        args.add("extra");
        final ListIterator it = args.listIterator();

        opt.setCanProcessResult(true);
        assertTrue(opt.canProcess(null, it));
        assertEquals("Iterator position must be rolled back by previous()", 0, it.nextIndex());
        assertEquals("--test", it.next());

        opt.setCanProcessResult(false);
        final ListIterator it2 = args.listIterator();
        assertFalse(opt.canProcess(null, it2));
        assertEquals("Iterator position must still be 0", 0, it2.nextIndex());
    }

    // -------------------------------------------------------------------------
    // equals() and hashCode() tests
    // -------------------------------------------------------------------------

    public void testEqualsNotOptionImpl() {
        final ConcreteOption opt = new ConcreteOption(1, false, "--test", "desc", null, null);
        assertFalse(opt.equals(null));
        assertFalse(opt.equals("--test"));
        assertFalse(opt.equals(new Object()));
    }

    public void testEqualsSameAndDifferentId() {
        final Set prefixes = createSet(new String[]{"--"});
        final Set triggers = createSet(new String[]{"--test"});

        final ConcreteOption opt1 = new ConcreteOption(1, false, "--test", "desc", prefixes, triggers);
        final ConcreteOption opt2 = new ConcreteOption(1, false, "--test", "desc", prefixes, triggers);
        final ConcreteOption optDiffId = new ConcreteOption(2, false, "--test", "desc", prefixes, triggers);

        assertTrue("Reflexive equals", opt1.equals(opt1));
        assertTrue("Symmetric equals", opt1.equals(opt2));
        assertTrue("Symmetric equals", opt2.equals(opt1));
        assertEquals("Hashcodes must match", opt1.hashCode(), opt2.hashCode());

        assertFalse("Different ID should return false", opt1.equals(optDiffId));
    }

    public void testEqualsPreferredNameVariations() {
        final Set prefixes = createSet(new String[]{"--"});
        final Set triggers = createSet(new String[]{"--test"});

        final ConcreteOption optBothNull1 = new ConcreteOption(1, false, null, "desc", prefixes, triggers);
        final ConcreteOption optBothNull2 = new ConcreteOption(1, false, null, "desc", prefixes, triggers);
        final ConcreteOption optOneNull = new ConcreteOption(1, false, "--test", "desc", prefixes, triggers);
        final ConcreteOption optDiffName = new ConcreteOption(1, false, "--other", "desc", prefixes, triggers);

        assertTrue("Both null preferredName should match", optBothNull1.equals(optBothNull2));
        assertEquals(optBothNull1.hashCode(), optBothNull2.hashCode());

        assertFalse("One null preferredName should not match", optBothNull1.equals(optOneNull));
        assertFalse("One null preferredName should not match (reverse)", optOneNull.equals(optBothNull1));
        assertFalse("Different preferredName should not match", optOneNull.equals(optDiffName));
    }

    public void testEqualsDescriptionVariations() {
        final Set prefixes = createSet(new String[]{"--"});
        final Set triggers = createSet(new String[]{"--test"});

        final ConcreteOption optBothNull1 = new ConcreteOption(1, false, "--test", null, prefixes, triggers);
        final ConcreteOption optBothNull2 = new ConcreteOption(1, false, "--test", null, prefixes, triggers);
        final ConcreteOption optOneNull = new ConcreteOption(1, false, "--test", "desc", prefixes, triggers);
        final ConcreteOption optDiffDesc = new ConcreteOption(1, false, "--test", "other", prefixes, triggers);

        assertTrue("Both null description should match", optBothNull1.equals(optBothNull2));
        assertEquals(optBothNull1.hashCode(), optBothNull2.hashCode());

        assertFalse("One null description should not match", optBothNull1.equals(optOneNull));
        assertFalse("One null description should not match (reverse)", optOneNull.equals(optBothNull1));
        assertFalse("Different description should not match", optOneNull.equals(optDiffDesc));
    }

    public void testEqualsPrefixesAndTriggersVariations() {
        final Set prefixes1 = createSet(new String[]{"--"});
        final Set prefixes2 = createSet(new String[]{"-"});
        final Set triggers1 = createSet(new String[]{"--a", "--b"});
        final Set triggers2 = createSet(new String[]{"--a"});

        final ConcreteOption base = new ConcreteOption(1, false, "--a", "desc", prefixes1, triggers1);
        final ConcreteOption diffPrefixes = new ConcreteOption(1, false, "--a", "desc", prefixes2, triggers1);
        final ConcreteOption diffTriggers = new ConcreteOption(1, false, "--a", "desc", prefixes1, triggers2);

        assertFalse("Different prefixes should not match", base.equals(diffPrefixes));
        assertFalse("Different triggers should not match", base.equals(diffTriggers));
    }

    // -------------------------------------------------------------------------
    // findOption() tests
    // -------------------------------------------------------------------------

    public void testFindOption() {
        final Set triggers = createSet(new String[]{"-h", "--help", "-?"});
        final ConcreteOption opt = new ConcreteOption(1, false, "--help", "Help", null, triggers);

        assertSame("Trigger '-h' should find this option", opt, opt.findOption("-h"));
        assertSame("Trigger '--help' should find this option", opt, opt.findOption("--help"));
        assertSame("Trigger '-?' should find this option", opt, opt.findOption("-?"));

        assertNull("Unknown trigger should return null", opt.findOption("-v"));
        assertNull("Null trigger should return null", opt.findOption(null));
        assertNull("Empty string trigger should return null", opt.findOption(""));
    }

    // -------------------------------------------------------------------------
    // checkPrefixes() & checkPrefix() tests
    // -------------------------------------------------------------------------

    public void testCheckPrefixesEmptySet() {
        final ConcreteOption opt = new ConcreteOption(1, false, "invalid", "desc", null, null);
        // An empty prefix set should return immediately without checking preferredName or triggers
        opt.testCheckPrefixes(Collections.EMPTY_SET);
    }

    public void testCheckPrefixesSuccessSingleAndMultiplePrefixes() {
        final Set prefixes = createSet(new String[]{"--", "-"});
        final Set triggers = createSet(new String[]{"--help", "-h"});
        final ConcreteOption opt = new ConcreteOption(1, false, "--help", "desc", prefixes, triggers);

        // Both preferredName ("--help") and triggers ("--help", "-h") start with one of prefixes
        opt.testCheckPrefixes(prefixes);
    }

    public void testCheckPrefixesFailsOnPreferredName() {
        final Set prefixes = createSet(new String[]{"--", "-"});
        final Set triggers = createSet(new String[]{"--help", "-h"});
        final ConcreteOption opt = new ConcreteOption(1, false, "badPrefix", "desc", prefixes, triggers);

        try {
            opt.testCheckPrefixes(prefixes);
            fail("Expected IllegalArgumentException because preferredName doesn't start with any prefix");
        } catch (final IllegalArgumentException e) {
            // Expected
            assertTrue(e.getMessage() != null && e.getMessage().length() > 0);
        }
    }

    public void testCheckPrefixesFailsOnTrigger() {
        final Set prefixes = createSet(new String[]{"--"});
        // preferredName starts with "--", but trigger "-h" only starts with "-"
        final Set triggers = createSet(new String[]{"--help", "-h"});
        final ConcreteOption opt = new ConcreteOption(1, false, "--help", "desc", prefixes, triggers);

        try {
            opt.testCheckPrefixes(prefixes);
            fail("Expected IllegalArgumentException because trigger '-h' does not start with prefix '--'");
        } catch (final IllegalArgumentException e) {
            // Expected
            assertTrue(e.getMessage() != null && e.getMessage().length() > 0);
        }
    }

    // -------------------------------------------------------------------------
    // toString() & defaults() tests
    // -------------------------------------------------------------------------

    public void testToString() {
        final ConcreteOption opt = new ConcreteOption(1, false, "--verbose", "desc", null, null);
        assertEquals("--verbose", opt.toString());

        final ConcreteOption optNullName = new ConcreteOption(1, false, null, "desc", null, null);
        assertEquals("", optNullName.toString());
    }

    public void testDefaultsNoOp() {
        final ConcreteOption opt = new ConcreteOption(1, false, "--verbose", "desc", null, null);
        // defaults() should be safe to call and execute as a no-op
        opt.defaults(null);
    }
}
package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.GroupBuilder;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.resource.ResourceConstants;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for GroupImpl focusing on branch,
 * condition, edge cases, and boundary limits.
 */
public class GroupImplTest {

    private DefaultOptionBuilder optionBuilder;
    private ArgumentBuilder argumentBuilder;
    private GroupBuilder groupBuilder;

    private Option optA;
    private Option optB;
    private Option optRequired;
    private Argument anonArg;

    @Before
    public void setUp() {
        optionBuilder = new DefaultOptionBuilder();
        argumentBuilder = new ArgumentBuilder();
        groupBuilder = new GroupBuilder();

        optA = optionBuilder
                .withShortName("a")
                .withLongName("opt-a")
                .withDescription("Option A description")
                .withRequired(false)
                .create();

        optB = optionBuilder
                .withShortName("b")
                .withLongName("opt-b")
                .withDescription("Option B description")
                .withRequired(false)
                .create();

        optRequired = optionBuilder
                .withShortName("r")
                .withLongName("opt-req")
                .withDescription("Required Option")
                .withRequired(true)
                .create();

        anonArg = argumentBuilder
                .withName("target")
                .withMinimum(1)
                .withMaximum(1)
                .create();
    }

    // =========================================================================
    // Constructor & Initialization Tests
    // =========================================================================

    @Test
    public void testConstructorSeparatesOptionsAndAnonymousArguments() {
        final List optionsList = new ArrayList();
        optionsList.add(optA);
        optionsList.add(anonArg);
        optionsList.add(optB);

        final GroupImpl group = new GroupImpl(optionsList, "testGroup", "Test Group Desc", 1, 2);

        assertEquals("testGroup", group.getPreferredName());
        assertEquals("Test Group Desc", group.getDescription());
        assertEquals(1, group.getMinimum());
        assertEquals(2, group.getMaximum());
        assertTrue(group.isRequired());

        // Argument should be moved from options to anonymous
        assertEquals(2, group.getOptions().size());
        assertTrue(group.getOptions().contains(optA));
        assertTrue(group.getOptions().contains(optB));
        assertFalse(group.getOptions().contains(anonArg));

        assertEquals(1, group.getAnonymous().size());
        assertTrue(group.getAnonymous().contains(anonArg));

        // Triggers and prefixes
        assertTrue(group.getTriggers().contains("-a"));
        assertTrue(group.getTriggers().contains("--opt-a"));
        assertTrue(group.getPrefixes().contains("-"));
        assertTrue(group.getPrefixes().contains("--"));
    }

    @Test
    public void testConstructorWithEmptyList() {
        final GroupImpl group = new GroupImpl(new ArrayList(), null, null, 0, 0);

        assertNull(group.getPreferredName());
        assertNull(group.getDescription());
        assertEquals(0, group.getMinimum());
        assertEquals(0, group.getMaximum());
        assertFalse(group.isRequired());
        assertTrue(group.getOptions().isEmpty());
        assertTrue(group.getAnonymous().isEmpty());
        assertTrue(group.getTriggers().isEmpty());
        assertTrue(group.getPrefixes().isEmpty());
    }

    // =========================================================================
    // canProcess() Branch Coverage Tests
    // =========================================================================

    @Test
    public void testCanProcessWithNullArgument() {
        final List options = new ArrayList();
        options.add(optA);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        assertFalse("null argument must return false", group.canProcess(commandLine, (String) null));
    }

    @Test
    public void testCanProcessDirectTriggerMatch() {
        final List options = new ArrayList();
        options.add(optA);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        assertTrue(group.canProcess(commandLine, "-a"));
        assertTrue(group.canProcess(commandLine, "--opt-a"));
    }

    @Test
    public void testCanProcessBurstingViaTailMap() {
        // Create an option that accepts bursting e.g. -ab
        final Option burstOpt = new OptionImpl(0, false) {
            public boolean canProcess(WriteableCommandLine cl, String arg) {
                return arg != null && arg.startsWith("-a");
            }
            public Set getTriggers() {
                return Collections.singleton("-a");
            }
            public Set getPrefixes() {
                return Collections.singleton("-");
            }
            public void validate(WriteableCommandLine cl) {}
            public void appendUsage(StringBuffer b, Set s, Comparator c) {}
            public String getPreferredName() { return "-a"; }
            public String getDescription() { return "burst opt"; }
            public List helpLines(int depth, Set s, Comparator c) { return Collections.EMPTY_LIST; }
            public void process(WriteableCommandLine cl, ListIterator args) {}
        };

        final List options = new ArrayList();
        options.add(burstOpt);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        // "-ab" is not directly in optionMap, but burstOpt in tailMap canProcess it
        assertTrue(group.canProcess(commandLine, "-ab"));
    }

    @Test
    public void testCanProcessLooksLikeOptionReturnsFalse() {
        final List options = new ArrayList();
        options.add(optA);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        // "-unknown" looks like an option, not in map, cannot burst -> false
        assertFalse(group.canProcess(commandLine, "-unknown"));
    }

    @Test
    public void testCanProcessAnonymousArgumentsFallback() {
        // With anonymous argument: non-option argument returns true
        final List optionsWithAnon = new ArrayList();
        optionsWithAnon.add(anonArg);
        final GroupImpl groupWithAnon = new GroupImpl(optionsWithAnon, "group", "desc", 0, 1);
        final WriteableCommandLine cl1 = new WriteableCommandLineImpl(groupWithAnon, new ArrayList());

        assertTrue("Anonymous present, non-option token should return true",
                groupWithAnon.canProcess(cl1, "someValue"));

        // Without anonymous argument: non-option argument returns false
        final GroupImpl groupWithoutAnon = new GroupImpl(new ArrayList(), "group", "desc", 0, 1);
        final WriteableCommandLine cl2 = new WriteableCommandLineImpl(groupWithoutAnon, new ArrayList());

        assertFalse("No anonymous, non-option token should return false",
                groupWithoutAnon.canProcess(cl2, "someValue"));
    }

    // =========================================================================
    // process() Branch Coverage & Infinite Loop Detection Tests
    // =========================================================================

    @Test
    public void testProcessInfiniteLoopGuardWhenSameInstanceEncountered() throws Exception {
        // Custom Option that does not advance arguments iterator
        final Option passiveOption = new OptionImpl(0, false) {
            public boolean canProcess(WriteableCommandLine cl, String arg) { return true; }
            public Set getTriggers() { return Collections.singleton("-p"); }
            public Set getPrefixes() { return Collections.singleton("-"); }
            public void process(WriteableCommandLine cl, ListIterator args) {
                // Do not consume token, leave cursor as is
            }
            public void validate(WriteableCommandLine cl) {}
            public void appendUsage(StringBuffer b, Set s, Comparator c) {}
            public String getPreferredName() { return "-p"; }
            public String getDescription() { return "passive"; }
            public List helpLines(int depth, Set s, Comparator c) { return Collections.EMPTY_LIST; }
        };

        final List options = new ArrayList();
        options.add(passiveOption);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        final String token = "-p";
        final List argsList = new ArrayList();
        argsList.add(token);
        final ListIterator it = argsList.listIterator();

        // Should not loop infinitely; it hits `if (arg == previous)` and breaks
        group.process(commandLine, it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testProcessOptionDirectMatch() throws Exception {
        final List options = new ArrayList();
        options.add(optA);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        final List args = new ArrayList();
        args.add("-a");
        final ListIterator it = args.listIterator();

        group.process(commandLine, it);
        assertTrue(commandLine.hasOption(optA));
    }

    @Test
    public void testProcessLooksLikeOptionFoundInTailMap() throws Exception {
        final boolean[] processed = new boolean[] { false };
        final Option tailOption = new OptionImpl(0, false) {
            public boolean canProcess(WriteableCommandLine cl, String arg) {
                return "-burst".equals(arg);
            }
            public Set getTriggers() {
                return Collections.singleton("-b");
            }
            public Set getPrefixes() {
                return Collections.singleton("-");
            }
            public void process(WriteableCommandLine cl, ListIterator args) {
                processed[0] = true;
                args.next(); // consume "-burst"
            }
            public void validate(WriteableCommandLine cl) {}
            public void appendUsage(StringBuffer b, Set s, Comparator c) {}
            public String getPreferredName() { return "-b"; }
            public String getDescription() { return "desc"; }
            public List helpLines(int depth, Set s, Comparator c) { return Collections.EMPTY_LIST; }
        };

        final List options = new ArrayList();
        options.add(tailOption);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        final List args = new ArrayList();
        args.add("-burst");
        final ListIterator it = args.listIterator();

        group.process(commandLine, it);
        assertTrue("Member in tailMap should have processed token", processed[0]);
    }

    @Test
    public void testProcessLooksLikeOptionNotFoundInTailMap() throws Exception {
        final List options = new ArrayList();
        options.add(optA);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        final List args = new ArrayList();
        args.add("-unknown");
        final ListIterator it = args.listIterator();

        group.process(commandLine, it);
        // It should backtrack iterator and return
        assertEquals("-unknown", it.next());
    }

    @Test
    public void testProcessNonOptionArgumentWhenAnonymousIsEmpty() throws Exception {
        final List options = new ArrayList();
        options.add(optA);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        final List args = new ArrayList();
        args.add("plainValue");
        final ListIterator it = args.listIterator();

        group.process(commandLine, it);
        // Iterator backtracked, non-option token remains unconsumed
        assertEquals("plainValue", it.next());
    }

    @Test
    public void testProcessNonOptionArgumentWhenAnonymousIsPresent() throws Exception {
        final List options = new ArrayList();
        options.add(anonArg);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        final List args = new ArrayList();
        args.add("myTarget");
        final ListIterator it = args.listIterator();

        group.process(commandLine, it);
        assertTrue(commandLine.hasOption(anonArg));
        assertEquals("myTarget", commandLine.getValue(anonArg));
    }

    // =========================================================================
    // validate() Boundary Limits & State Tests
    // =========================================================================

    @Test
    public void testValidateSuccessWithinMinMax() throws Exception {
        final List options = new ArrayList();
        options.add(optA);
        options.add(optB);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 1, 2);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        commandLine.addOption(optA);
        // 1 option present, minimum=1, maximum=2 -> Valid
        group.validate(commandLine);
    }

    @Test(expected = OptionException.class)
    public void testValidateThrowsMissingOptionWhenPresentLessThanMinimum() throws Exception {
        final List options = new ArrayList();
        options.add(optA);
        options.add(optB);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 1, 2);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        // 0 option present, minimum=1 -> throws MISSING_OPTION
        group.validate(commandLine);
    }

    @Test(expected = OptionException.class)
    public void testValidateThrowsUnexpectedTokenWhenPresentGreaterThanMaximum() throws Exception {
        final List options = new ArrayList();
        options.add(optA);
        options.add(optB);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        commandLine.addOption(optA);
        commandLine.addOption(optB);

        // 2 options present, maximum=1 -> throws UNEXPECTED_TOKEN
        group.validate(commandLine);
    }

    @Test(expected = OptionException.class)
    public void testValidateRequiredChildOptionNotPresent() throws Exception {
        final List options = new ArrayList();
        options.add(optRequired);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 2);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        // optRequired is required, so option.validate(commandLine) is triggered and throws
        group.validate(commandLine);
    }

    @Test
    public void testValidateChildGroupAlwaysValidated() throws Exception {
        // Child group with minimum 1 requires at least one option
        final List childOptions = new ArrayList();
        childOptions.add(optA);
        final Group childGroup = groupBuilder
                .withName("childGroup")
                .withMinimum(1)
                .withOption(optA)
                .create();

        final List parentOptions = new ArrayList();
        parentOptions.add(childGroup);
        final GroupImpl parentGroup = new GroupImpl(parentOptions, "parent", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(parentGroup, new ArrayList());

        // Child group is not added to commandLine, but `option instanceof Group` triggers validation
        try {
            parentGroup.validate(commandLine);
            fail("Child group validation should fail because childGroup has minimum=1 and no options");
        } catch (OptionException oe) {
            assertEquals(childGroup, oe.getOption());
        }
    }

    @Test(expected = OptionException.class)
    public void testValidateAnonymousArgumentFailsWhenMissing() throws Exception {
        final List options = new ArrayList();
        options.add(anonArg); // anonArg has minimum=1
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        // Anonymous argument requires 1 value, but none supplied
        group.validate(commandLine);
    }

    // =========================================================================
    // appendUsage() & DisplaySetting Combinations
    // =========================================================================

    @Test
    public void testAppendUsageOptionalNamedAndExpanded() {
        final List options = new ArrayList();
        options.add(optA);
        options.add(optB);
        final GroupImpl group = new GroupImpl(options, "myGroup", "desc", 0, 2);

        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        final StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);

        final String result = buffer.toString();
        // Optional -> starts with '[', both named and expanded -> "myGroup (...", ends with ']'
        assertTrue(result.startsWith("[myGroup ("));
        assertTrue(result.endsWith(")]"));
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("|"));
        assertTrue(result.contains("-b"));
    }

    @Test
    public void testAppendUsageWithComparatorAndCustomSeparator() {
        final List options = new ArrayList();
        options.add(optA);
        options.add(optB);
        final GroupImpl group = new GroupImpl(options, null, "desc", 1, 2);

        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        final StringBuffer buffer = new StringBuffer();
        // Reverse alphabetical ordering comparator
        final Comparator reverseComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o2).getPreferredName().compareTo(((Option) o1).getPreferredName());
            }
        };

        group.appendUsage(buffer, settings, reverseComp, " OR ");
        final String result = buffer.toString();

        assertTrue(result.contains(" OR "));
        // Option B preferred name "-b" should come before Option A preferred name "-a"
        assertTrue(result.indexOf("-b") < result.indexOf("-a"));
    }

    @Test
    public void testAppendUsageAnonymousArgumentsWithOuterFlag() {
        final List options = new ArrayList();
        options.add(optA);
        options.add(anonArg);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);

        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);

        final StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);

        final String result = buffer.toString();
        // When DISPLAY_GROUP_OUTER is set, ']' is appended before anonymous arguments
        assertTrue(result.contains("] <target>"));
    }

    @Test
    public void testAppendUsageAnonymousArgumentsWithoutOuterFlag() {
        final List options = new ArrayList();
        options.add(optA);
        options.add(anonArg);
        final GroupImpl group = new GroupImpl(options, "group", "desc", 0, 1);

        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        final StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);

        final String result = buffer.toString();
        // When DISPLAY_GROUP_OUTER is NOT set, ']' is appended after anonymous arguments
        assertTrue(result.contains("<target>]"));
    }

    @Test
    public void testAppendUsageWithoutExpandedFlagUsesChildSettingsNone() {
        final List options = new ArrayList();
        options.add(optA);
        final GroupImpl group = new GroupImpl(options, "myGroup", "desc", 1, 1);

        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);

        final StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);

        assertEquals("myGroup", buffer.toString());
    }

    // =========================================================================
    // helpLines() Branch Coverage Tests
    // =========================================================================

    @Test
    public void testHelpLinesAllFlagsEnabled() {
        final List options = new ArrayList();
        options.add(optA);
        options.add(anonArg);
        final GroupImpl group = new GroupImpl(options, "grp", "Group Help Description", 0, 1);

        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        final List lines = group.helpLines(0, settings, null);
        assertFalse(lines.isEmpty());

        // First help line should represent the group itself
        final HelpLine groupLine = (HelpLine) lines.get(0);
        assertEquals("grp", groupLine.getOption().getPreferredName());
        assertEquals("Group Help Description", groupLine.getOption().getDescription());
    }

    @Test
    public void testHelpLinesWithComparator() {
        final List options = new ArrayList();
        options.add(optA);
        options.add(optB);
        final GroupImpl group = new GroupImpl(options, null, null, 0, 1);

        final Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        final Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o2).getPreferredName().compareTo(((Option) o1).getPreferredName());
            }
        };

        final List lines = group.helpLines(1, settings, comp);
        assertEquals(2, lines.size());
        assertEquals("-b", ((HelpLine) lines.get(0)).getOption().getPreferredName());
        assertEquals("-a", ((HelpLine) lines.get(1)).getOption().getPreferredName());
    }

    @Test
    public void testHelpLinesEmptySettingsReturnsEmptyList() {
        final List options = new ArrayList();
        options.add(optA);
        final GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);

        final List lines = group.helpLines(0, Collections.EMPTY_SET, null);
        assertTrue(lines.isEmpty());
    }

    // =========================================================================
    // findOption() & defaults() Tests
    // =========================================================================

    @Test
    public void testFindOptionDirectAndSubGroup() {
        final Group subGroup = groupBuilder
                .withName("sub")
                .withOption(optB)
                .create();

        final List options = new ArrayList();
        options.add(optA);
        options.add(subGroup);
        final GroupImpl group = new GroupImpl(options, "root", "desc", 0, 2);

        // Found at top level
        assertEquals(optA, group.findOption("-a"));
        assertEquals(optA, group.findOption("--opt-a"));

        // Found in sub-group
        assertEquals(optB, group.findOption("-b"));

        // Not found
        assertNull(group.findOption("-unknown"));
    }

    @Test
    public void testDefaultsPopulatesCommandLine() {
        final List options = new ArrayList();
        options.add(optA);
        options.add(anonArg);
        final GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1);
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        // Should not throw and invoke defaults on child options & anonymous arguments
        group.defaults(commandLine);
    }

    // =========================================================================
    // ReverseStringComparator & Boundary Conditions
    // =========================================================================

    @Test
    public void testReverseStringComparatorOrder() {
        final Comparator comp = ReverseStringComparator.getInstance();
        assertNotNull(comp);

        // Standard compare "apple".compareTo("banana") < 0; Reverse must be > 0
        assertTrue(comp.compare("apple", "banana") > 0);
        assertTrue(comp.compare("banana", "apple") < 0);
        assertEquals(0, comp.compare("same", "same"));
    }

    @Test
    public void testIsRequiredBoundary() {
        final GroupImpl optionalGroup = new GroupImpl(new ArrayList(), "opt", "desc", 0, 1);
        assertFalse(optionalGroup.isRequired());

        final GroupImpl requiredGroup = new GroupImpl(new ArrayList(), "req", "desc", 1, 1);
        assertTrue(requiredGroup.isRequired());

        final GroupImpl negativeMinGroup = new GroupImpl(new ArrayList(), "neg", "desc", -1, 1);
        assertFalse(negativeMinGroup.isRequired());
    }
}
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
import org.apache.commons.cli2.CommandLine;
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
 * High coverage JUnit 4 test suite for GroupImpl and ReverseStringComparator.
 */
public class GroupImplTest {

    private DefaultOptionBuilder obuilder;
    private ArgumentBuilder abuilder;
    private GroupBuilder gbuilder;
    private Option optA;
    private Option optB;
    private Argument arg1;
    private WriteableCommandLine commandLine;

    @Before
    public void setUp() {
        obuilder = new DefaultOptionBuilder();
        abuilder = new ArgumentBuilder();
        gbuilder = new GroupBuilder();

        optA = obuilder.withShortName("a")
                       .withLongName("optA")
                       .withDescription("Option A")
                       .withRequired(false)
                       .create();

        optB = obuilder.withShortName("b")
                       .withLongName("optB")
                       .withDescription("Option B")
                       .withRequired(false)
                       .create();

        arg1 = abuilder.withName("arg1")
                       .withMinimum(0)
                       .withMaximum(1)
                       .create();

        commandLine = new WriteableCommandLineImpl(null, Arrays.asList(new String[]{"-", "--"}));
    }

    // ==========================================
    // 1. Constructor Tests & Boundary Limits
    // ==========================================

    @Test
    public void testConstructorSeparatesArgumentsAndOptions() {
        List options = new ArrayList();
        options.add(optA);
        options.add(arg1);
        options.add(optB);

        GroupImpl group = new GroupImpl(options, "myGroup", "group desc", 1, 2, true);

        assertEquals("myGroup", group.getPreferredName());
        assertEquals("group desc", group.getDescription());
        assertEquals(1, group.getMinimum());
        assertEquals(2, group.getMaximum());
        assertEquals(group, optA.getParent());
        assertEquals(group, arg1.getParent());

        // Arguments must be removed from options and placed into anonymous
        assertEquals(2, group.getOptions().size());
        assertTrue(group.getOptions().contains(optA));
        assertTrue(group.getOptions().contains(optB));
        assertEquals(1, group.getAnonymous().size());
        assertTrue(group.getAnonymous().contains(arg1));

        assertTrue(group.getTriggers().contains("-a"));
        assertTrue(group.getTriggers().contains("--optA"));
        assertTrue(group.getPrefixes().contains("-"));
        assertTrue(group.getPrefixes().contains("--"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testConstructorUnmodifiableListWithArgumentThrows() {
        List unmodifiable = Collections.singletonList(arg1);
        new GroupImpl(unmodifiable, "failGroup", "desc", 0, 1, false);
    }

    @Test
    public void testConstructorEmptyOptionsAndNullNames() {
        GroupImpl group = new GroupImpl(new ArrayList(), null, null, 0, 0, false);
        assertNull(group.getPreferredName());
        assertNull(group.getDescription());
        assertEquals(0, group.getMinimum());
        assertEquals(0, group.getMaximum());
        assertTrue(group.getOptions().isEmpty());
        assertTrue(group.getAnonymous().isEmpty());
        assertTrue(group.getTriggers().isEmpty());
        assertTrue(group.getPrefixes().isEmpty());
    }

    // ==========================================
    // 2. canProcess Tests
    // ==========================================

    @Test
    public void testCanProcessNullArg() {
        GroupImpl group = new GroupImpl(new ArrayList(), "grp", "desc", 0, 1, false);
        assertFalse(group.canProcess(commandLine, (String) null));
    }

    @Test
    public void testCanProcessDirectTriggerMatch() {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        assertTrue(group.canProcess(commandLine, "-a"));
        assertTrue(group.canProcess(commandLine, "--optA"));
    }

    @Test
    public void testCanProcessBurstingMatch() {
        // Option that matches by prefix
        Option burstOpt = new OptionImpl(0, false) {
            public boolean canProcess(WriteableCommandLine cl, String arg) {
                return arg != null && arg.startsWith("-b");
            }
            public void process(WriteableCommandLine cl, ListIterator args) { if (args.hasNext()) args.next(); }
            public void validate(WriteableCommandLine cl) {}
            public void appendUsage(StringBuffer buf, Set hs, Comparator c) {}
            public List helpLines(int d, Set hs, Comparator c) { return Collections.EMPTY_LIST; }
            public Set getTriggers() { return Collections.singleton("-b"); }
            public Set getPrefixes() { return Collections.singleton("-"); }
            public String getPreferredName() { return "-b"; }
            public String getDescription() { return "burst"; }
            public Option findOption(String t) { return "-b".equals(t) ? this : null; }
        };

        List options = new ArrayList();
        options.add(burstOpt);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        assertTrue(group.canProcess(commandLine, "-bvalue"));
    }

    @Test
    public void testCanProcessLooksLikeOptionNotMatch() {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        // Looks like option (starts with "-") but not recognized
        assertFalse(group.canProcess(commandLine, "--unknown"));
    }

    @Test
    public void testCanProcessNonOptionWithAndWithoutAnonymous() {
        List optionsWithArg = new ArrayList();
        optionsWithArg.add(arg1);
        GroupImpl groupWithArg = new GroupImpl(optionsWithArg, "grp", "desc", 0, 1, false);

        // Non-option token accepted when anonymous argument exists
        assertTrue(groupWithArg.canProcess(commandLine, "regularToken"));

        GroupImpl groupWithoutArg = new GroupImpl(new ArrayList(), "grp", "desc", 0, 1, false);
        // Rejected when no anonymous argument exists
        assertFalse(groupWithoutArg.canProcess(commandLine, "regularToken"));
    }

    // ==========================================
    // 3. process Tests
    // ==========================================

    @Test
    public void testProcessEmptyArguments() throws OptionException {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        List args = new ArrayList();
        group.process(commandLine, args.listIterator());
        assertFalse(commandLine.hasOption(optA));
    }

    @Test
    public void testProcessDirectOption() throws OptionException {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        List args = new ArrayList(Collections.singletonList("-a"));
        ListIterator it = args.listIterator();
        group.process(commandLine, it);

        assertTrue(commandLine.hasOption(optA));
        assertFalse(it.hasNext());
    }

    @Test
    public void testProcessInfiniteLoopDetectionWhenChildDoesNotConsume() throws OptionException {
        // Child option that intentionally doesn't consume argument
        Option noopOption = new OptionImpl(0, false) {
            public boolean canProcess(WriteableCommandLine cl, String arg) { return "--noop".equals(arg); }
            public void process(WriteableCommandLine cl, ListIterator args) { /* do nothing */ }
            public void validate(WriteableCommandLine cl) {}
            public void appendUsage(StringBuffer buf, Set hs, Comparator c) {}
            public List helpLines(int d, Set hs, Comparator c) { return Collections.EMPTY_LIST; }
            public Set getTriggers() { return Collections.singleton("--noop"); }
            public Set getPrefixes() { return Collections.singleton("--"); }
            public String getPreferredName() { return "--noop"; }
            public String getDescription() { return "noop"; }
            public Option findOption(String t) { return "--noop".equals(t) ? this : null; }
        };

        List options = new ArrayList();
        options.add(noopOption);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        List args = new ArrayList(Collections.singletonList("--noop"));
        ListIterator it = args.listIterator();
        group.process(commandLine, it);

        // Successfully broke out of loop and rewound
        assertEquals(0, it.nextIndex());
    }

    @Test
    public void testProcessBurstingMemberOption() throws OptionException {
        final boolean[] processed = new boolean[]{false};
        Option burstOpt = new OptionImpl(0, false) {
            public boolean canProcess(WriteableCommandLine cl, String arg) { return arg != null && arg.startsWith("-b"); }
            public void process(WriteableCommandLine cl, ListIterator args) {
                processed[0] = true;
                if (args.hasNext()) { args.next(); }
            }
            public void validate(WriteableCommandLine cl) {}
            public void appendUsage(StringBuffer buf, Set hs, Comparator c) {}
            public List helpLines(int d, Set hs, Comparator c) { return Collections.EMPTY_LIST; }
            public Set getTriggers() { return Collections.singleton("-b"); }
            public Set getPrefixes() { return Collections.singleton("-"); }
            public String getPreferredName() { return "-b"; }
            public String getDescription() { return "burst"; }
            public Option findOption(String t) { return "-b".equals(t) ? this : null; }
        };

        List options = new ArrayList();
        options.add(burstOpt);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        List args = new ArrayList(Collections.singletonList("-bvalue"));
        ListIterator it = args.listIterator();
        group.process(commandLine, it);

        assertTrue(processed[0]);
        assertFalse(it.hasNext());
    }

    @Test
    public void testProcessLooksLikeOptionMemberNotFoundAborts() throws OptionException {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        List args = new ArrayList(Collections.singletonList("--unrecognized"));
        ListIterator it = args.listIterator();
        group.process(commandLine, it);

        // Aborted and iterator rewound
        assertEquals(0, it.nextIndex());
    }

    @Test
    public void testProcessNonOptionWithoutAnonymousBreaks() throws OptionException {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        List args = new ArrayList(Collections.singletonList("nonOptionToken"));
        ListIterator it = args.listIterator();
        group.process(commandLine, it);

        assertEquals(0, it.nextIndex());
    }

    @Test
    public void testProcessNonOptionWithAnonymousProcesses() throws OptionException {
        List options = new ArrayList();
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        List args = new ArrayList(Arrays.asList(new String[]{"value1", "value2"}));
        ListIterator it = args.listIterator();
        group.process(commandLine, it);

        // arg1 consumes maximum 1 value, value2 should remain unconsumed
        assertTrue(commandLine.hasOption(arg1));
        assertEquals(1, it.nextIndex());
    }

    // ==========================================
    // 4. validate Tests
    // ==========================================

    @Test
    public void testValidateSuccess() throws OptionException {
        List options = new ArrayList();
        options.add(optA);
        options.add(optB);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 1, 2, false);

        commandLine.addOption(optA);
        group.validate(commandLine);
    }

    @Test(expected = OptionException.class)
    public void testValidateTooManyOptionsThrows() throws OptionException {
        List options = new ArrayList();
        options.add(optA);
        options.add(optB);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        commandLine.addOption(optA);
        commandLine.addOption(optB);
        group.validate(commandLine);
    }

    @Test(expected = OptionException.class)
    public void testValidateMissingOptionThrows() throws OptionException {
        List options = new ArrayList();
        options.add(optA);
        options.add(optB);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 2, 2, false);

        commandLine.addOption(optA);
        group.validate(commandLine);
    }

    @Test(expected = OptionException.class)
    public void testValidateRequiredChildOptionMissingThrows() throws OptionException {
        Option reqOpt = obuilder.withShortName("r").withRequired(true).create();
        List options = new ArrayList();
        options.add(reqOpt);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        // reqOpt is required in group, but not added to commandLine
        group.validate(commandLine);
    }

    @Test(expected = OptionException.class)
    public void testValidateAnonymousArgumentThrows() throws OptionException {
        Argument reqArg = abuilder.withName("reqArg").withMinimum(1).create();
        List options = new ArrayList();
        options.add(reqArg);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        group.validate(commandLine);
    }

    // ==========================================
    // 5. isRequired Tests
    // ==========================================

    @Test
    public void testIsRequiredWithoutParent() {
        GroupImpl groupMin1 = new GroupImpl(new ArrayList(), "grp", "desc", 1, 1, false);
        assertTrue(groupMin1.isRequired());

        GroupImpl groupMin0 = new GroupImpl(new ArrayList(), "grp", "desc", 0, 1, true);
        assertFalse(groupMin0.isRequired());
    }

    @Test
    public void testIsRequiredWithParent() {
        GroupImpl childRequired = new GroupImpl(new ArrayList(), "child", "desc", 1, 1, true);
        GroupImpl childNotRequired = new GroupImpl(new ArrayList(), "child2", "desc", 1, 1, false);
        GroupImpl childMinZero = new GroupImpl(new ArrayList(), "child3", "desc", 0, 1, true);

        List options = new ArrayList();
        options.add(childRequired);
        options.add(childNotRequired);
        options.add(childMinZero);

        GroupImpl parent = new GroupImpl(options, "parent", "desc", 0, 3, false);

        assertTrue(childRequired.isRequired());
        assertFalse(childNotRequired.isRequired());
        assertFalse(childMinZero.isRequired());
    }

    // ==========================================
    // 6. appendUsage Tests
    // ==========================================

    @Test
    public void testAppendUsageDefaultSeparator() {
        List options = new ArrayList();
        options.add(optA);
        options.add(optB);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 2, false);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        group.appendUsage(buffer, settings, null);
        assertEquals("-a|-b", buffer.toString());
    }

    @Test
    public void testAppendUsageOptionalBrackets() {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        StringBuffer buffer1 = new StringBuffer();
        Set settings1 = new HashSet();
        settings1.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings1.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        group.appendUsage(buffer1, settings1, null, "|");
        assertEquals("[-a]", buffer1.toString());

        StringBuffer buffer2 = new StringBuffer();
        Set settings2 = new HashSet();
        settings2.add(DisplaySetting.DISPLAY_OPTIONAL_CHILD_GROUP);
        settings2.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        group.appendUsage(buffer2, settings2, null, "|");
        assertEquals("[-a]", buffer2.toString());
    }

    @Test
    public void testAppendUsageExpandedAndNamed() {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "myGroup", "desc", 0, 1, false);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);

        group.appendUsage(buffer, settings, null, "|");
        assertEquals("myGroup (-a)", buffer.toString());
    }

    @Test
    public void testAppendUsageNamedOnlyWhenNotExpanded() {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "myGroup", "desc", 0, 1, false);

        StringBuffer buffer = new StringBuffer();
        Set settings = Collections.EMPTY_SET;

        group.appendUsage(buffer, settings, null, "|");
        assertEquals("myGroup", buffer.toString());
    }

    @Test
    public void testAppendUsageNullNameExpandedWithoutSetting() {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, null, "desc", 0, 1, false);

        StringBuffer buffer = new StringBuffer();
        // Even without DISPLAY_GROUP_EXPANDED, null name forces expanded
        group.appendUsage(buffer, Collections.EMPTY_SET, null, "|");
        assertEquals("-a", buffer.toString());
    }

    @Test
    public void testAppendUsageOuterAndAnonymousArguments() {
        List options = new ArrayList();
        options.add(optA);
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, null, "desc", 0, 1, false);

        // With DISPLAY_GROUP_OUTER: ']' placed before anonymous arguments
        StringBuffer bufferOuter = new StringBuffer();
        Set settingsOuter = new HashSet();
        settingsOuter.add(DisplaySetting.DISPLAY_OPTIONAL);
        settingsOuter.add(DisplaySetting.DISPLAY_GROUP_OUTER);
        settingsOuter.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        group.appendUsage(bufferOuter, settingsOuter, null, "|");
        assertEquals("[-a] <arg1>", bufferOuter.toString());

        // Without DISPLAY_GROUP_OUTER: ']' placed after anonymous arguments
        StringBuffer bufferNotOuter = new StringBuffer();
        Set settingsNotOuter = new HashSet();
        settingsNotOuter.add(DisplaySetting.DISPLAY_OPTIONAL);
        settingsNotOuter.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        group.appendUsage(bufferNotOuter, settingsNotOuter, null, "|");
        assertEquals("[-a <arg1>]", bufferNotOuter.toString());
    }

    @Test
    public void testAppendUsageWithComparator() {
        List options = new ArrayList();
        options.add(optB);
        options.add(optA);
        GroupImpl group = new GroupImpl(options, null, "desc", 0, 2, false);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o1).getPreferredName().compareTo(((Option) o2).getPreferredName());
            }
        };

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, Collections.EMPTY_SET, comp, ", ");
        assertEquals("-a, -b", buffer.toString());
    }

    // ==========================================
    // 7. helpLines Tests
    // ==========================================

    @Test
    public void testHelpLinesAllSettings() {
        List options = new ArrayList();
        options.add(optB);
        options.add(optA);
        options.add(arg1);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 2, false);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o1).getPreferredName().compareTo(((Option) o2).getPreferredName());
            }
        };

        List lines = group.helpLines(0, settings, comp);
        assertFalse(lines.isEmpty());

        HelpLine firstLine = (HelpLine) lines.get(0);
        assertEquals(group, firstLine.getOption());
        assertEquals(0, firstLine.getDepth());
    }

    @Test
    public void testHelpLinesNoSettings() {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        List lines = group.helpLines(0, Collections.EMPTY_SET, null);
        assertTrue(lines.isEmpty());
    }

    // ==========================================
    // 8. findOption & defaults Tests
    // ==========================================

    @Test
    public void testFindOptionDirectAndAbsent() {
        List options = new ArrayList();
        options.add(optA);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        assertEquals(optA, group.findOption("-a"));
        assertEquals(optA, group.findOption("--optA"));
        assertNull(group.findOption("-unknown"));
    }

    @Test
    public void testFindOptionNestedGroup() {
        List childOptions = new ArrayList();
        childOptions.add(optB);
        GroupImpl childGroup = new GroupImpl(childOptions, "childGrp", "desc", 0, 1, false);

        List parentOptions = new ArrayList();
        parentOptions.add(optA);
        parentOptions.add(childGroup);
        GroupImpl parentGroup = new GroupImpl(parentOptions, "parentGrp", "desc", 0, 2, false);

        assertEquals(optB, parentGroup.findOption("-b"));
    }

    @Test
    public void testDefaultsAppliedToOptionsAndAnonymous() {
        Argument defaultArg = abuilder.withName("defArg").withDefault("val1").create();
        List options = new ArrayList();
        options.add(optA);
        options.add(defaultArg);
        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 1, false);

        group.defaults(commandLine);
        assertTrue(commandLine.hasOption(defaultArg));
        assertEquals("val1", commandLine.getValue(defaultArg));
    }

    // ==========================================
    // 9. ReverseStringComparator Tests
    // ==========================================

    @Test
    public void testReverseStringComparator() {
        Comparator comp = ReverseStringComparator.getInstance();
        assertNotNull(comp);

        assertTrue(comp.compare("a", "b") > 0);
        assertTrue(comp.compare("b", "a") < 0);
        assertEquals(0, comp.compare("same", "same"));
    }
}
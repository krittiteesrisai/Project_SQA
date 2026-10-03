package org.apache.commons.cli2.option;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.GroupBuilder;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GroupImplTest {

    private DefaultOptionBuilder obuilder;
    private ArgumentBuilder abuilder;
    private GroupBuilder gbuilder;

    private Option optHelp;
    private Option optVersion;
    private Option optFile;
    private Argument anonArg;

    @Before
    public void setUp() {
        obuilder = new DefaultOptionBuilder();
        abuilder = new ArgumentBuilder();
        gbuilder = new GroupBuilder();

        optHelp = obuilder
                .withShortName("h")
                .withLongName("help")
                .withDescription("display help")
                .create();

        optVersion = obuilder
                .withShortName("v")
                .withLongName("version")
                .withDescription("display version")
                .create();

        optFile = obuilder
                .withShortName("f")
                .withLongName("file")
                .withDescription("target file")
                .withArgument(abuilder.withName("filename").withMinimum(1).withMaximum(1).create())
                .create();

        anonArg = abuilder
                .withName("input")
                .withMinimum(0)
                .withMaximum(1)
                .create();
    }

    @Test
    public void testConstructorSeparatesArgumentsAndOptions() {
        List options = new ArrayList();
        options.add(optHelp);
        options.add(anonArg);
        options.add(optVersion);

        GroupImpl group = new GroupImpl(options, "testGroup", "A test group", 1, 2);

        assertEquals("Options size should exclude Argument", 2, group.getOptions().size());
        assertEquals("Anonymous arguments size", 1, group.getAnonymous().size());
        assertTrue(group.getAnonymous().contains(anonArg));
        assertTrue(group.getOptions().contains(optHelp));
        assertTrue(group.getOptions().contains(optVersion));
        assertEquals("testGroup", group.getPreferredName());
        assertEquals("A test group", group.getDescription());
        assertEquals(1, group.getMinimum());
        assertEquals(2, group.getMaximum());
        assertTrue(group.isRequired());

        Set triggers = group.getTriggers();
        assertTrue(triggers.contains("-h"));
        assertTrue(triggers.contains("--help"));
        assertTrue(triggers.contains("-v"));
        assertTrue(triggers.contains("--version"));

        Set prefixes = group.getPrefixes();
        assertTrue(prefixes.contains("-"));
        assertTrue(prefixes.contains("--"));
    }

    @Test
    public void testCanProcess() {
        List options = new ArrayList();
        options.add(optHelp);
        options.add(anonArg);

        GroupImpl group = new GroupImpl(options, "group", "group desc", 0, 1);
        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());

        // Branch 1: arg == null -> false
        assertFalse(group.canProcess(cmdLine, null));

        // Branch 2: optionMap contains arg -> true
        assertTrue(group.canProcess(cmdLine, "--help"));
        assertTrue(group.canProcess(cmdLine, "-h"));

        // Branch 3: bursting required (tailMap)
        // "-h" is present, passing combined trigger "-h"
        assertTrue(group.canProcess(cmdLine, "-h"));

        // Branch 4: looks like option but not member -> false
        assertFalse(group.canProcess(cmdLine, "--unknown"));

        // Branch 5: not option, anonymous exists -> true
        assertTrue(group.canProcess(cmdLine, "plainArgument"));

        // Branch 6: not option, no anonymous -> false
        List emptyOptions = new ArrayList();
        emptyOptions.add(optHelp);
        GroupImpl noAnonGroup = new GroupImpl(emptyOptions, "noAnon", "", 0, 1);
        assertFalse(noAnonGroup.canProcess(cmdLine, "plainArgument"));
    }

    @Test
    public void testProcessDirectOption() throws OptionException {
        List options = new ArrayList();
        options.add(optHelp);
        GroupImpl group = new GroupImpl(options, "group", "", 0, 1);

        List args = new ArrayList();
        args.add("--help");
        ListIterator iterator = args.listIterator();

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());
        group.process(cmdLine, iterator);

        assertTrue("Option --help should be present in command line", cmdLine.hasOption("--help"));
        assertFalse("Iterator should have consumed argument", iterator.hasNext());
    }

    @Test
    public void testProcessInfiniteLoopGuard() throws OptionException {
        // Mocking an option that does not consume argument when processed
        Option dummyOption = new OptionImpl(0, false) {
            public boolean canProcess(org.apache.commons.cli2.WriteableCommandLine cl, String arg) {
                return true;
            }
            public void process(org.apache.commons.cli2.WriteableCommandLine cl, ListIterator it) {
                // intentionally do nothing without advancing iterator
            }
            public Set getTriggers() {
                Set s = new HashSet();
                s.add("-dummy");
                return s;
            }
            public Set getPrefixes() {
                Set s = new HashSet();
                s.add("-");
                return s;
            }
            public void validate(org.apache.commons.cli2.WriteableCommandLine cl) {}
            public void appendUsage(StringBuffer b, Set s, Comparator c) {}
            public String getPreferredName() { return "-dummy"; }
            public String getDescription() { return ""; }
            public List helpLines(int d, Set s, Comparator c) { return Collections.EMPTY_LIST; }
        };

        List options = new ArrayList();
        options.add(dummyOption);
        GroupImpl group = new GroupImpl(options, "loopGroup", "", 0, 1);

        List args = new ArrayList();
        args.add("-dummy");
        ListIterator iterator = args.listIterator();

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());
        group.process(cmdLine, iterator);

        // arg == previous triggers break, iterator rolled back
        assertTrue(iterator.hasNext());
        assertEquals("-dummy", iterator.next());
    }

    @Test
    public void testProcessUnrecognizedOptionBacktracks() throws OptionException {
        List options = new ArrayList();
        options.add(optHelp);
        GroupImpl group = new GroupImpl(options, "group", "", 0, 1);

        List args = new ArrayList();
        args.add("--unknown");
        ListIterator iterator = args.listIterator();

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());
        group.process(cmdLine, iterator);

        // Iterator must backtrack so caller can inspect token
        assertTrue(iterator.hasNext());
        assertEquals("--unknown", iterator.next());
    }

    @Test
    public void testProcessAnonymousArgument() throws OptionException {
        List options = new ArrayList();
        options.add(anonArg);
        GroupImpl group = new GroupImpl(options, "group", "", 0, 1);

        List args = new ArrayList();
        args.add("file.txt");
        ListIterator iterator = args.listIterator();

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());
        group.process(cmdLine, iterator);

        assertFalse(iterator.hasNext());
        assertTrue(cmdLine.hasOption(anonArg));
        assertEquals("file.txt", cmdLine.getValue(anonArg));
    }

    @Test
    public void testProcessNonOptionWithoutAnonymousBreaks() throws OptionException {
        List options = new ArrayList();
        options.add(optHelp);
        GroupImpl group = new GroupImpl(options, "group", "", 0, 1);

        List args = new ArrayList();
        args.add("unexpectedArg");
        ListIterator iterator = args.listIterator();

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());
        group.process(cmdLine, iterator);

        assertTrue(iterator.hasNext());
        assertEquals("unexpectedArg", iterator.next());
    }

    @Test
    public void testValidateMinimumOptionsMissing() {
        List options = new ArrayList();
        options.add(optHelp);
        options.add(optVersion);
        GroupImpl group = new GroupImpl(options, "group", "", 1, 2);

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());

        try {
            group.validate(cmdLine);
            fail("Expected OptionException due to missing required option count");
        } catch (OptionException oe) {
            assertEquals(group, oe.getOption());
        }
    }

    @Test
    public void testValidateMaximumOptionsExceeded() {
        List options = new ArrayList();
        options.add(optHelp);
        options.add(optVersion);
        GroupImpl group = new GroupImpl(options, "group", "", 0, 1);

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());
        cmdLine.addOption(optHelp);
        cmdLine.addOption(optVersion);

        try {
            group.validate(cmdLine);
            fail("Expected OptionException due to maximum exceeded");
        } catch (OptionException oe) {
            assertEquals(group, oe.getOption());
        }
    }

    @Test
    public void testValidateRequiredOptionInGroup() {
        Option reqOption = obuilder
                .withShortName("r")
                .withRequired(true)
                .create();

        List options = new ArrayList();
        options.add(reqOption);
        GroupImpl group = new GroupImpl(options, "group", "", 0, 1);

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());

        try {
            group.validate(cmdLine);
            fail("Expected OptionException because reqOption is required");
        } catch (OptionException oe) {
            assertEquals(reqOption, oe.getOption());
        }
    }

    @Test
    public void testValidateChildGroupTriggered() throws OptionException {
        Group childGroup = gbuilder
                .withName("child")
                .withMinimum(1)
                .withOption(optHelp)
                .create();

        List options = new ArrayList();
        options.add(childGroup);
        GroupImpl parentGroup = new GroupImpl(options, "parent", "", 0, 1);

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(parentGroup, new ArrayList());

        try {
            parentGroup.validate(cmdLine);
            fail("Expected OptionException from child group");
        } catch (OptionException oe) {
            assertEquals(childGroup, oe.getOption());
        }
    }

    @Test
    public void testValidateSuccessWithAnonymous() throws OptionException {
        Argument strictArg = abuilder.withName("val").withMinimum(1).withMaximum(1).create();
        List options = new ArrayList();
        options.add(optHelp);
        options.add(strictArg);
        GroupImpl group = new GroupImpl(options, "group", "", 1, 1);

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());
        cmdLine.addOption(optHelp);
        cmdLine.addValue(strictArg, "presentValue");

        group.validate(cmdLine);
        // Successful validation without exceptions
    }

    @Test
    public void testAppendUsageCombinations() {
        List options = new ArrayList();
        options.add(optHelp);
        options.add(optVersion);
        options.add(anonArg);

        GroupImpl group = new GroupImpl(options, "myGroup", "desc", 0, 1);

        // Case 1: Optional + Outer + Named + Expanded + Arguments
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        StringBuffer buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);
        String result = buffer.toString();

        assertTrue(result.startsWith("["));
        assertTrue(result.contains("myGroup ("));
        assertTrue(result.contains("|"));
        assertTrue(result.contains(")"));
        assertTrue(result.endsWith("]"));

        // Case 2: Sorted with Comparator
        buffer = new StringBuffer();
        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option op1 = (Option) o1;
                Option op2 = (Option) o2;
                return op1.getPreferredName().compareTo(op2.getPreferredName());
            }
        };
        group.appendUsage(buffer, settings, comp, " / ");
        result = buffer.toString();
        assertTrue(result.contains(" / "));

        // Case 3: Optional without Outer
        settings.remove(DisplaySetting.DISPLAY_GROUP_OUTER);
        buffer = new StringBuffer();
        group.appendUsage(buffer, settings, null);
        result = buffer.toString();
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));

        // Case 4: No name (name == null) forces expanded
        GroupImpl unnamedGroup = new GroupImpl(options, null, null, 1, 1);
        Set simpleSettings = new HashSet();
        simpleSettings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        buffer = new StringBuffer();
        unnamedGroup.appendUsage(buffer, simpleSettings, null);
        result = buffer.toString();
        assertFalse(result.contains("("));
        assertTrue(result.contains("-h"));
    }

    @Test
    public void testHelpLines() {
        List options = new ArrayList();
        options.add(optHelp);
        options.add(anonArg);
        GroupImpl group = new GroupImpl(options, "myGroup", "group description", 0, 1);

        Set helpSettings = new HashSet();
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        helpSettings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        List lines = group.helpLines(0, helpSettings, null);
        assertNotNull(lines);
        assertFalse(lines.isEmpty());

        boolean hasGroupName = false;
        for (Iterator it = lines.iterator(); it.hasNext();) {
            HelpLine line = (HelpLine) it.next();
            if (line.getOption().equals(group)) {
                hasGroupName = true;
            }
        }
        assertTrue("Group name should be in help lines", hasGroupName);

        // Help lines with comparator
        Comparator comp = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Option) o1).getPreferredName().compareTo(((Option) o2).getPreferredName());
            }
        };
        List sortedLines = group.helpLines(1, helpSettings, comp);
        assertEquals(lines.size(), sortedLines.size());
    }

    @Test
    public void testFindOption() {
        List options = new ArrayList();
        options.add(optHelp);
        options.add(optVersion);

        GroupImpl group = new GroupImpl(options, "group", "", 0, 1);

        Option found = group.findOption("-h");
        assertEquals(optHelp, found);

        found = group.findOption("--version");
        assertEquals(optVersion, found);

        found = group.findOption("--unknown");
        assertNull(found);
    }

    @Test
    public void testDefaults() {
        List options = new ArrayList();
        options.add(optHelp);
        options.add(anonArg);

        GroupImpl group = new GroupImpl(options, "group", "", 0, 1);
        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(group, new ArrayList());

        group.defaults(cmdLine);
        // Invoking defaults verifies no NullPointerException occurs on child options
        assertFalse(cmdLine.hasOption(optHelp));
    }

    @Test
    public void testEmptyGroup() throws OptionException {
        GroupImpl emptyGroup = new GroupImpl(Collections.EMPTY_LIST, null, null, 0, 0);

        assertEquals(0, emptyGroup.getOptions().size());
        assertEquals(0, emptyGroup.getAnonymous().size());
        assertFalse(emptyGroup.isRequired());

        WriteableCommandLineImpl cmdLine = new WriteableCommandLineImpl(emptyGroup, new ArrayList());
        assertFalse(emptyGroup.canProcess(cmdLine, "anything"));

        List args = new ArrayList();
        ListIterator iterator = args.listIterator();
        emptyGroup.process(cmdLine, iterator);

        emptyGroup.validate(cmdLine);
        assertEquals(0, emptyGroup.helpLines(0, Collections.EMPTY_SET, null).size());
    }
}
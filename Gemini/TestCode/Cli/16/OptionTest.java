package org.apache.commons.cli2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.GroupBuilder;
import org.apache.commons.cli2.builder.SwitchBuilder;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.option.GroupImpl;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.option.Switch;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 Test Suite for {@link Option} interface implementations
 * covering branch conditions, boundary limits, null/empty values, and invalid states.
 */
public class OptionTest {

    private DefaultOptionBuilder obuilder;
    private ArgumentBuilder abuilder;
    private GroupBuilder gbuilder;
    private SwitchBuilder sbuilder;

    @Before
    public void setUp() {
        obuilder = new DefaultOptionBuilder();
        abuilder = new ArgumentBuilder();
        gbuilder = new GroupBuilder();
        sbuilder = new SwitchBuilder();
    }

    // =========================================================================
    // 1. canProcess(WriteableCommandLine, String) Tests
    // =========================================================================

    @Test
    public void testCanProcessWithStringTriggersAndBoundaries() {
        final Option option = obuilder
            .withShortName("o")
            .withLongName("opt")
            .withDescription("Test option")
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(option, new ArrayList());

        // Branch 1: Match short trigger
        assertTrue("Should process short trigger '-o'", option.canProcess(commandLine, "-o"));

        // Branch 2: Match long trigger
        assertTrue("Should process long trigger '--opt'", option.canProcess(commandLine, "--opt"));

        // Branch 3: Prefix matches but unrecognized trigger
        assertFalse("Should not process unknown trigger with prefix", option.canProcess(commandLine, "-x"));
        assertFalse("Should not process unknown long trigger", option.canProcess(commandLine, "--unknown"));

        // Branch 4: Edge case - null or empty string
        assertFalse("Should not process null argument", option.canProcess(commandLine, (String) null));
        assertFalse("Should not process empty string argument", option.canProcess(commandLine, ""));

        // Branch 5: Argument without trigger prefix
        assertFalse("Should not process plain string", option.canProcess(commandLine, "opt"));
    }

    // =========================================================================
    // 2. canProcess(WriteableCommandLine, ListIterator) & Iterator Restoration
    // =========================================================================

    @Test
    public void testCanProcessWithListIteratorRestoresIteratorState() {
        final Option option = obuilder
            .withShortName("f")
            .withLongName("file")
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(option, new ArrayList());

        // Case A: Argument matches -> must return true AND restore index
        final List argsMatching = new ArrayList();
        argsMatching.add("-f");
        argsMatching.add("extra");
        final ListIterator itMatching = argsMatching.listIterator();

        assertEquals("Initial index must be 0", 0, itMatching.nextIndex());
        assertTrue("Should be able to process '-f'", option.canProcess(commandLine, itMatching));
        assertEquals("Iterator position must be restored to 0 after matching canProcess", 0, itMatching.nextIndex());

        // Case B: Argument does not match -> must return false AND restore index
        final List argsNonMatching = new ArrayList();
        argsNonMatching.add("--nonexistent");
        final ListIterator itNonMatching = argsNonMatching.listIterator();

        assertEquals("Initial index must be 0", 0, itNonMatching.nextIndex());
        assertFalse("Should not process '--nonexistent'", option.canProcess(commandLine, itNonMatching));
        assertEquals("Iterator position must be restored to 0 after non-matching canProcess", 0, itNonMatching.nextIndex());

        // Case C: Empty iterator boundary
        final List emptyList = new ArrayList();
        final ListIterator emptyIt = emptyList.listIterator();
        assertFalse("Should return false on empty ListIterator", option.canProcess(commandLine, emptyIt));
        assertEquals("Iterator position must remain 0 for empty iterator", 0, emptyIt.nextIndex());
    }

    // =========================================================================
    // 3. process(WriteableCommandLine, ListIterator) Tests
    // =========================================================================

    @Test
    public void testProcessSuccessAdvancesIteratorAndRecordsOption() throws OptionException {
        final Option option = obuilder
            .withShortName("a")
            .withLongName("all")
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(option, new ArrayList());
        final List args = new ArrayList();
        args.add("-a");
        args.add("nextArg");
        final ListIterator it = args.listIterator();

        option.process(commandLine, it);

        assertTrue("CommandLine must register option", commandLine.hasOption(option));
        assertEquals("Iterator must have advanced past '-a'", 1, it.nextIndex());
        assertEquals("Next argument must be 'nextArg'", "nextArg", it.next());
    }

    @Test
    public void testProcessUnexpectedArgumentThrowsException() {
        final Option option = obuilder
            .withShortName("s")
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(option, new ArrayList());
        final List args = new ArrayList();
        args.add("-invalid");
        final ListIterator it = args.listIterator();

        try {
            option.process(commandLine, it);
            fail("Expected OptionException when processing unexpected argument");
        } catch (OptionException expected) {
            assertEquals("Exception source must be the option", option, expected.getOption());
        }
    }

    @Test
    public void testProcessMissingRequiredArgumentThrowsException() {
        final Option arg = abuilder
            .withName("value")
            .withMinimum(1)
            .withMaximum(1)
            .create();

        final Option option = obuilder
            .withShortName("k")
            .withArgument(arg)
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(option, new ArrayList());
        final List args = new ArrayList();
        args.add("-k"); // missing the actual argument value
        final ListIterator it = args.listIterator();

        try {
            option.process(commandLine, it);
            fail("Expected OptionException when required argument is missing after option");
        } catch (OptionException expected) {
            assertNotNull("Exception should contain an error message", expected.getMessage());
        }
    }

    // =========================================================================
    // 4. validate(WriteableCommandLine) Tests: Required, Optional, and Group Limits
    // =========================================================================

    @Test
    public void testValidateRequiredOptionPresentPasses() throws OptionException {
        final Option option = obuilder
            .withShortName("r")
            .withRequired(true)
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(option, new ArrayList());
        commandLine.addOption(option);

        // Branch: required is true AND option is present
        option.validate(commandLine);
    }

    @Test
    public void testValidateRequiredOptionMissingThrowsException() {
        final Option option = obuilder
            .withShortName("r")
            .withRequired(true)
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(option, new ArrayList());

        // Branch: required is true AND option is NOT present
        try {
            option.validate(commandLine);
            fail("Expected OptionException when required option is missing in CommandLine");
        } catch (OptionException expected) {
            assertEquals("Exception option must match", option, expected.getOption());
        }
    }

    @Test
    public void testValidateOptionalOptionMissingPasses() throws OptionException {
        final Option option = obuilder
            .withShortName("opt")
            .withRequired(false)
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(option, new ArrayList());
        // Branch: required is false AND option is NOT present
        option.validate(commandLine);
    }

    @Test
    public void testValidateGroupMinimumLimit() throws OptionException {
        final Option optA = obuilder.withShortName("a").create();
        final Option optB = obuilder.withShortName("b").create();

        final Option group = gbuilder
            .withName("testGroup")
            .withOption(optA)
            .withOption(optB)
            .withMinimum(1)
            .withMaximum(2)
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());

        // Sub-Branch: 0 options present, minimum is 1 -> Failure
        try {
            group.validate(commandLine);
            fail("Expected OptionException because present (0) < minimum (1)");
        } catch (OptionException expected) {
            assertEquals("Exception should point to the group", group, expected.getOption());
        }

        // Sub-Branch: 1 option present, minimum is 1 -> Success
        commandLine.addOption(optA);
        group.validate(commandLine);
    }

    @Test
    public void testValidateGroupMaximumLimitExceeded() {
        final Option optA = obuilder.withShortName("a").create();
        final Option optB = obuilder.withShortName("b").create();

        final Option group = gbuilder
            .withName("exclusiveGroup")
            .withOption(optA)
            .withOption(optB)
            .withMinimum(0)
            .withMaximum(1) // exclusive choice
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());
        commandLine.addOption(optA);
        commandLine.addOption(optB);

        // Sub-Branch: 2 options present, maximum is 1 -> Failure
        try {
            group.validate(commandLine);
            fail("Expected OptionException because present (2) > maximum (1)");
        } catch (OptionException expected) {
            assertEquals("Exception should point to the group", group, expected.getOption());
        }
    }

    @Test
    public void testValidateGroupZeroBoundaries() throws OptionException {
        // Boundary case: minimum = 0, maximum = 0 (No options allowed)
        final Option optA = obuilder.withShortName("a").create();
        final Option group = gbuilder
            .withName("emptyGroup")
            .withOption(optA)
            .withMinimum(0)
            .withMaximum(0)
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(group, new ArrayList());
        // 0 present <= 0 maximum -> Passes
        group.validate(commandLine);

        // 1 present > 0 maximum -> Throws Exception
        commandLine.addOption(optA);
        try {
            group.validate(commandLine);
            fail("Expected OptionException when maximum allowed is 0 but option is provided");
        } catch (OptionException expected) {
            assertEquals(group, expected.getOption());
        }
    }

    // =========================================================================
    // 5. defaults(WriteableCommandLine) Tests
    // =========================================================================

    @Test
    public void testDefaultsAppliedWhenOptionNotPresent() {
        final Option argumentWithDefault = abuilder
            .withName("target")
            .withDefault("default_target.txt")
            .create();

        final Option option = obuilder
            .withShortName("t")
            .withArgument(argumentWithDefault)
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(option, new ArrayList());
        assertFalse("Before defaults, commandLine has no value", commandLine.hasOption(option));

        option.defaults(commandLine);

        assertTrue("After defaults, option should have default value assigned", commandLine.hasOption(option));
        assertEquals("default_target.txt", commandLine.getValue(option));
    }

    @Test
    public void testDefaultsDoNotOverwriteExistingValue() {
        final Option argumentWithDefault = abuilder
            .withName("target")
            .withDefault("default.txt")
            .create();

        final Option option = obuilder
            .withShortName("t")
            .withArgument(argumentWithDefault)
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(option, new ArrayList());
        commandLine.addOption(option);
        commandLine.addValue(option, "user_specified.txt");

        option.defaults(commandLine);

        // Value must NOT be overwritten by default
        assertEquals("user_specified.txt", commandLine.getValue(option));
    }

    // =========================================================================
    // 6. findOption(String) Hierarchy & Edge Cases
    // =========================================================================

    @Test
    public void testFindOptionTriggersAndBoundaries() {
        final Option option = obuilder
            .withShortName("v")
            .withLongName("version")
            .create();

        // Exact match
        assertEquals("Must find option by short name", option, option.findOption("-v"));
        assertEquals("Must find option by long name", option, option.findOption("--version"));

        // Non-matching, empty, and null triggers
        assertNull("Non-matching trigger must return null", option.findOption("-other"));
        assertNull("Empty trigger must return null", option.findOption(""));
        assertNull("Null trigger must return null", option.findOption(null));
    }

    @Test
    public void testFindOptionInNestedGroup() {
        final Option child1 = obuilder.withShortName("c1").withLongName("childOne").create();
        final Option child2 = obuilder.withShortName("c2").withLongName("childTwo").create();

        final Option nestedGroup = gbuilder
            .withName("nested")
            .withOption(child1)
            .create();

        final Option rootGroup = gbuilder
            .withName("root")
            .withOption(nestedGroup)
            .withOption(child2)
            .create();

        assertEquals("Root group should find direct child", child2, rootGroup.findOption("-c2"));
        assertEquals("Root group should recursively find nested child", child1, rootGroup.findOption("-c1"));
        assertNull("Unknown option in group should return null", rootGroup.findOption("-unknown"));
    }

    // =========================================================================
    // 7. Getters, Metadata, Prefixes, and ID Boundaries
    // =========================================================================

    @Test
    public void testGetTriggersAndPrefixesNonNull() {
        final Option option = obuilder
            .withShortName("h")
            .withLongName("help")
            .create();

        final Set triggers = option.getTriggers();
        assertNotNull("Triggers must not be null", triggers);
        assertTrue("Triggers must contain '-h'", triggers.contains("-h"));
        assertTrue("Triggers must contain '--help'", triggers.contains("--help"));

        final Set prefixes = option.getPrefixes();
        assertNotNull("Prefixes must not be null", prefixes);
        assertTrue("Prefixes must contain '-'", prefixes.contains("-"));
        assertTrue("Prefixes must contain '--'", prefixes.contains("--"));
    }

    @Test
    public void testGetPreferredNameAndDescription() {
        // Case 1: Both short and long name
        final Option fullOption = obuilder
            .withShortName("s")
            .withLongName("server")
            .withDescription("Target server hostname")
            .create();
        assertEquals("--server", fullOption.getPreferredName());
        assertEquals("Target server hostname", fullOption.getDescription());

        // Case 2: Only short name provided
        final Option shortOnly = obuilder
            .withShortName("q")
            .create();
        assertEquals("-q", shortOnly.getPreferredName());
        assertNull("Description should be null if not provided", shortOnly.getDescription());
    }

    @Test
    public void testIdBoundaries() {
        final Option defaultIdOpt = obuilder.withShortName("d").create();
        assertEquals("Default ID should be 0", 0, defaultIdOpt.getId());

        final Option minIdOpt = obuilder.withShortName("min").withId(Integer.MIN_VALUE).create();
        assertEquals(Integer.MIN_VALUE, minIdOpt.getId());

        final Option maxIdOpt = obuilder.withShortName("max").withId(Integer.MAX_VALUE).create();
        assertEquals(Integer.MAX_VALUE, maxIdOpt.getId());
    }

    // =========================================================================
    // 8. appendUsage(StringBuffer, Set, Comparator) & helpLines Tests
    // =========================================================================

    @Test
    public void testAppendUsageWithDisplaySettingsAndComparators() {
        final Option option = obuilder
            .withShortName("u")
            .withLongName("user")
            .withRequired(false)
            .create();

        final StringBuffer buffer = new StringBuffer();
        final Set displaySettings = new HashSet();
        displaySettings.add(DisplaySetting.DISPLAY_OPTIONAL);

        // Branch 1: Append usage with settings and null comparator
        option.appendUsage(buffer, displaySettings, null);
        assertTrue("Usage must contain option name", buffer.toString().indexOf("-u") >= 0 || buffer.toString().indexOf("--user") >= 0);

        // Branch 2: Empty settings
        final StringBuffer bufferEmpty = new StringBuffer();
        option.appendUsage(bufferEmpty, Collections.EMPTY_SET, null);
        assertNotNull(bufferEmpty.toString());

        // Branch 3: With custom reverse comparator
        final Comparator reverseComp = new Comparator() {
            public int compare(final Object o1, final Object o2) {
                return ((Option) o2).getPreferredName().compareTo(((Option) o1).getPreferredName());
            }
        };
        final StringBuffer bufferComp = new StringBuffer();
        option.appendUsage(bufferComp, displaySettings, reverseComp);
        assertTrue(bufferComp.length() > 0);
    }

    @Test
    public void testHelpLinesDepthAndSettings() {
        final Option option = obuilder
            .withShortName("x")
            .withDescription("Execute command")
            .create();

        // Depth boundary 0
        final List helpLinesDepth0 = option.helpLines(0, Collections.EMPTY_SET, null);
        assertNotNull("HelpLines must not be null", helpLinesDepth0);
        assertFalse("HelpLines should not be empty", helpLinesDepth0.isEmpty());

        // Depth boundary > 0
        final List helpLinesDepth4 = option.helpLines(4, Collections.EMPTY_SET, null);
        assertNotNull("HelpLines must not be null at depth 4", helpLinesDepth4);
        assertEquals("Line count should remain consistent regardless of depth",
                     helpLinesDepth0.size(), helpLinesDepth4.size());
    }

    // =========================================================================
    // 9. Other Option Implementations: Switch & PropertyOption
    // =========================================================================

    @Test
    public void testSwitchOptionCanProcessAndProcess() throws OptionException {
        final Option switchOpt = sbuilder
            .withName("trace")
            .create();

        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(switchOpt, new ArrayList());

        // Switch triggers: +trace (enable), -trace (disable)
        assertTrue("Switch should process '+trace'", switchOpt.canProcess(commandLine, "+trace"));
        assertTrue("Switch should process '-trace'", switchOpt.canProcess(commandLine, "-trace"));
        assertFalse("Switch should reject non-matching", switchOpt.canProcess(commandLine, "-other"));

        final List args = new ArrayList();
        args.add("+trace");
        final ListIterator it = args.listIterator();

        switchOpt.process(commandLine, it);
        assertTrue("CommandLine should have registered switch option", commandLine.hasOption(switchOpt));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(switchOpt));
    }

    @Test
    public void testPropertyOptionCanProcessAndProcess() throws OptionException {
        final Option propOpt = new PropertyOption();
        final WriteableCommandLine commandLine = new WriteableCommandLineImpl(propOpt, new ArrayList());

        // PropertyOption accepts -Dkey=value
        assertTrue("PropertyOption can process '-Dfoo=bar'", propOpt.canProcess(commandLine, "-Dfoo=bar"));
        assertFalse("PropertyOption rejects plain '-D'", propOpt.canProcess(commandLine, "-D"));
        assertFalse("PropertyOption rejects other prefixes", propOpt.canProcess(commandLine, "-Xfoo=bar"));

        final List args = new ArrayList();
        args.add("-Ddatabase.url=localhost");
        final ListIterator it = args.listIterator();

        propOpt.process(commandLine, it);
        assertTrue("PropertyOption should be recorded in CommandLine", commandLine.hasOption(propOpt));
        assertEquals("localhost", commandLine.getProperty("database.url"));
    }

    // =========================================================================
    // 10. Custom Option Implementation for Contract Edge Cases
    // =========================================================================

    @Test
    public void testCustomOptionContractCompliance() {
        final Option stubOption = new Option() {
            public boolean canProcess(WriteableCommandLine cmd, String arg) { return arg != null && arg.equals("-test"); }
            public boolean canProcess(WriteableCommandLine cmd, ListIterator args) { return false; }
            public void process(WriteableCommandLine cmd, ListIterator args) throws OptionException {}
            public void defaults(WriteableCommandLine cmd) {}
            public Set getTriggers() { return Collections.singleton("-test"); }
            public Set getPrefixes() { return Collections.singleton("-"); }
            public void validate(WriteableCommandLine cmd) throws OptionException {}
            public List helpLines(int depth, Set helpSettings, Comparator comp) { return Collections.EMPTY_LIST; }
            public void appendUsage(StringBuffer buf, Set helpSettings, Comparator comp) { buf.append("-test"); }
            public String getPreferredName() { return "-test"; }
            public String getDescription() { return "Custom stub"; }
            public int getId() { return 999; }
            public Option findOption(String trigger) { return "-test".equals(trigger) ? this : null; }
            public boolean isRequired() { return false; }
        };

        assertEquals(999, stubOption.getId());
        assertEquals("-test", stubOption.getPreferredName());
        assertEquals("Custom stub", stubOption.getDescription());
        assertFalse(stubOption.isRequired());
        assertEquals(stubOption, stubOption.findOption("-test"));
        assertNull(stubOption.findOption("-other"));
    }
}
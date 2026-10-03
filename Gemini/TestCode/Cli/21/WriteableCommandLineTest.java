package org.apache.commons.cli2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WriteableCommandLineTest {

    private WriteableCommandLine commandLine;
    private WriteableCommandLineImpl commandLineImpl;
    private Option optA;
    private Option optB;
    private Option optRoot;
    private List prefixes;

    @Before
    public void setUp() {
        final DefaultOptionBuilder obuilder = new DefaultOptionBuilder();
        optRoot = obuilder.withShortName("r").withLongName("root").create();
        optA = obuilder.withShortName("a").withLongName("optA").withDescription("Option A").create();
        optB = obuilder.withShortName("b").withLongName("optB").withDescription("Option B").create();

        prefixes = Arrays.asList(new String[]{"-", "--"});
        commandLineImpl = new WriteableCommandLineImpl(optRoot, prefixes);
        commandLine = commandLineImpl;
    }

    // =========================================================================
    // 1. Option Registration and Membership Tests
    // =========================================================================

    @Test
    public void testAddOptionAndHasOption() {
        assertFalse("Should not have optA initially", commandLine.hasOption(optA));
        assertFalse("Should not have trigger -a initially", commandLine.hasOption("-a"));

        commandLine.addOption(optA);

        assertTrue("Should have optA after addOption", commandLine.hasOption(optA));
        assertTrue("Should have trigger -a after addOption", commandLine.hasOption("-a"));
        assertTrue("Should have trigger --optA after addOption", commandLine.hasOption("--optA"));
        assertFalse("Should not have optB", commandLine.hasOption(optB));
        assertFalse("Should not have trigger -b", commandLine.hasOption("-b"));

        Set options = commandLine.getOptions();
        assertTrue("Options set must contain optA", options.contains(optA));
        assertFalse("Options set must not contain optB", options.contains(optB));
    }

    @Test
    public void testAddOptionDuplicate() {
        commandLine.addOption(optA);
        commandLine.addOption(optA);

        assertTrue(commandLine.hasOption(optA));
        assertTrue(commandLine.hasOption("-a"));
    }

    @Test(expected = NullPointerException.class)
    public void testAddOptionNullThrowsNPE() {
        commandLine.addOption(null);
    }

    @Test
    public void testHasOptionByImplicitValueOrSwitch() {
        assertFalse(commandLine.hasOption(optA));

        // When a value is added without explicitly calling addOption
        commandLine.addValue(optA, "valA");
        assertTrue("Option should be considered present when value is added", commandLine.hasOption(optA));

        // When a switch is added without explicitly calling addOption
        assertFalse(commandLine.hasOption(optB));
        commandLine.addSwitch(optB, true);
        assertTrue("Option should be considered present when switch is added", commandLine.hasOption(optB));
    }

    // =========================================================================
    // 2. Values and Default Values Tests (Boundary & Undefaulted Logic)
    // =========================================================================

    @Test
    public void testAddValueSingleAndMultiple() {
        commandLine.addValue(optA, "first");

        List values = commandLine.getValues(optA);
        assertEquals(1, values.size());
        assertEquals("first", values.get(0));
        assertEquals("first", commandLine.getValue(optA));
        assertEquals("first", commandLine.getValue("-a"));

        commandLine.addValue(optA, "second");

        values = commandLine.getValues(optA);
        assertEquals(2, values.size());
        assertEquals("first", values.get(0));
        assertEquals("second", values.get(1));
        assertEquals("first", commandLine.getValue(optA)); // getValue returns the first value
    }

    @Test
    public void testGetValuesForNonExistentOption() {
        List values = commandLine.getValues(optA);
        assertNotNull("Values list should not be null", values);
        assertTrue("Values list should be empty", values.isEmpty());

        assertNull("Single value should be null", commandLine.getValue(optA));
        assertEquals("defaultVal", commandLine.getValue(optA, "defaultVal"));

        List fallbackList = Collections.singletonList("fallback");
        assertEquals(fallbackList, commandLine.getValues(optA, fallbackList));
    }

    @Test
    public void testGetUndefaultedValuesDoesNotReturnDefaults() {
        List defaults = Arrays.asList(new Object[]{"default1", "default2"});
        commandLine.setDefaultValues(optA, defaults);

        // Undefaulted values MUST be empty because no values were specified on the command line
        List undefaulted = commandLine.getUndefaultedValues(optA);
        assertNotNull(undefaulted);
        assertTrue("getUndefaultedValues must be empty when only defaults are set", undefaulted.isEmpty());

        // Regular getValues returns the defaults
        List actualValues = commandLine.getValues(optA);
        assertEquals(defaults, actualValues);

        // Now explicitly add a value
        commandLine.addValue(optA, "specified");

        undefaulted = commandLine.getUndefaultedValues(optA);
        assertEquals(1, undefaulted.size());
        assertEquals("specified", undefaulted.get(0));

        // getValues returns the explicitly specified value overriding defaults
        actualValues = commandLine.getValues(optA);
        assertEquals(1, actualValues.size());
        assertEquals("specified", actualValues.get(0));
    }

    @Test
    public void testSetDefaultValuesNullAndEmpty() {
        commandLine.setDefaultValues(optA, Collections.EMPTY_LIST);
        assertTrue(commandLine.getValues(optA).isEmpty());

        commandLine.setDefaultValues(optA, null);
        assertTrue(commandLine.getValues(optA).isEmpty());
    }

    @Test
    public void testAddValueAllowsNull() {
        commandLine.addValue(optA, null);
        List values = commandLine.getValues(optA);
        assertEquals(1, values.size());
        assertNull(values.get(0));
    }

    // =========================================================================
    // 3. Switch State Tests (Illegal State & Defaults)
    // =========================================================================

    @Test
    public void testAddSwitchSuccess() {
        commandLine.addSwitch(optA, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(optA));
        assertEquals(Boolean.TRUE, commandLine.getSwitch("-a"));

        commandLine.addSwitch(optB, false);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(optB));
        assertEquals(Boolean.FALSE, commandLine.getSwitch("-b"));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchDuplicateThrowsIllegalStateException() {
        commandLine.addSwitch(optA, true);
        // Adding a switch twice to the same option must throw IllegalStateException
        commandLine.addSwitch(optA, false);
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchDuplicateSameValueThrowsIllegalStateException() {
        commandLine.addSwitch(optA, true);
        commandLine.addSwitch(optA, true);
    }

    @Test
    public void testDefaultSwitchBehaviorAndOverride() {
        assertNull("Switch without default should be null", commandLine.getSwitch(optA));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(optA, Boolean.TRUE));

        commandLine.setDefaultSwitch(optA, Boolean.FALSE);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(optA));

        // Adding explicit switch overrides default switch
        commandLine.addSwitch(optA, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(optA));
    }

    @Test
    public void testSetDefaultSwitchNull() {
        commandLine.setDefaultSwitch(optA, null);
        assertNull(commandLine.getSwitch(optA));
    }

    // =========================================================================
    // 4. Properties Tests (Option and Global, Replacement, Fallbacks)
    // =========================================================================

    @Test
    public void testAddPropertyGlobalAndReplacement() {
        assertNull(commandLine.getProperty("theme"));
        assertEquals("dark", commandLine.getProperty("theme", "dark"));

        commandLine.addProperty("theme", "light");
        assertEquals("light", commandLine.getProperty("theme"));

        // Replacing existing property
        commandLine.addProperty("theme", "solarized");
        assertEquals("solarized", commandLine.getProperty("theme"));

        Set properties = commandLine.getProperties();
        assertTrue(properties.contains("theme"));
    }

    @Test
    public void testAddPropertyForSpecificOptionAndReplacement() {
        assertNull(commandLine.getProperty(optA, "timeout"));
        assertEquals("30", commandLine.getProperty(optA, "timeout", "30"));

        commandLine.addProperty(optA, "timeout", "10");
        assertEquals("10", commandLine.getProperty(optA, "timeout"));

        // Replace option property
        commandLine.addProperty(optA, "timeout", "60");
        assertEquals("60", commandLine.getProperty(optA, "timeout"));

        Set optProperties = commandLine.getProperties(optA);
        assertTrue(optProperties.contains("timeout"));
    }

    // =========================================================================
    // 5. Option Detection Tests (looksLikeOption: Prefixes, Edge Cases)
    // =========================================================================

    @Test
    public void testLooksLikeOptionNormalMatches() {
        assertTrue(commandLine.looksLikeOption("-a"));
        assertTrue(commandLine.looksLikeOption("--optA"));
        assertTrue(commandLine.looksLikeOption("-"));
        assertTrue(commandLine.looksLikeOption("--"));

        assertFalse(commandLine.looksLikeOption("value"));
        assertFalse(commandLine.looksLikeOption(""));
        assertFalse(commandLine.looksLikeOption("optA"));
    }

    @Test
    public void testLooksLikeOptionWithEmptyPrefixList() {
        WriteableCommandLine clNoPrefix = new WriteableCommandLineImpl(optRoot, Collections.EMPTY_LIST);
        assertFalse(clNoPrefix.looksLikeOption("-a"));
        assertFalse(clNoPrefix.looksLikeOption("--optA"));
        assertFalse(clNoPrefix.looksLikeOption("anything"));
    }

    @Test(expected = NullPointerException.class)
    public void testLooksLikeOptionNullArgumentThrowsNPE() {
        commandLine.looksLikeOption(null);
    }

    @Test(expected = NullPointerException.class)
    public void testLooksLikeOptionNullPrefixesThrowsNPE() {
        WriteableCommandLine clNullPrefixes = new WriteableCommandLineImpl(optRoot, null);
        clNullPrefixes.looksLikeOption("-a");
    }

    // =========================================================================
    // 6. Current Option Tracking & Defects4J Cli-21 Contract Validation
    // =========================================================================

    @Test
    public void testCurrentOptionTrackingOnImplementation() {
        assertNull(commandLineImpl.getCurrentOption());

        commandLineImpl.setCurrentOption(optA);
        assertSame(optA, commandLineImpl.getCurrentOption());

        commandLineImpl.setCurrentOption(null);
        assertNull(commandLineImpl.getCurrentOption());
    }

    /**
     * Defects4J Cli-21 Defect Trap:
     * In Cli-21b, WriteableCommandLine interface documented getCurrentOption()
     * and setCurrentOption(Option) in Javadoc but omitted the method signatures.
     * This reflection test asserts contract compliance without causing compilation failure.
     */
    @Test
    public void testWriteableCommandLineInterfaceDeclaresCurrentOptionMethods() {
        try {
            Method getMethod = WriteableCommandLine.class.getMethod("getCurrentOption", new Class[0]);
            assertNotNull("getCurrentOption() must be declared", getMethod);
            assertEquals("getCurrentOption return type must be Option", Option.class, getMethod.getReturnType());

            Method setMethod = WriteableCommandLine.class.getMethod("setCurrentOption", new Class[]{Option.class});
            assertNotNull("setCurrentOption(Option) must be declared", setMethod);
            assertEquals("setCurrentOption return type must be void", Void.TYPE, setMethod.getReturnType());
        } catch (NoSuchMethodException e) {
            fail("Defects4J Cli-21 defect detected: WriteableCommandLine interface missing method: " + e.getMessage());
        }
    }
}
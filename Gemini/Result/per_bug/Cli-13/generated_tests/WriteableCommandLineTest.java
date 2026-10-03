package org.apache.commons.cli2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * JUnit 4 Test Suite for WriteableCommandLine and its implementation.
 */
public class WriteableCommandLineTest {

    private WriteableCommandLine commandLine;
    private List prefixes;
    private Option optHelp;
    private Option optFile;
    private Option optVerbose;

    @Before
    public void setUp() {
        prefixes = new ArrayList();
        prefixes.add("-");
        prefixes.add("--");

        DefaultOptionBuilder builder = new DefaultOptionBuilder();
        optHelp = builder.reset().withShortName("h").withLongName("help").withDescription("Display help").create();
        optFile = builder.reset().withShortName("f").withLongName("file").withDescription("Target file").create();
        optVerbose = builder.reset().withShortName("v").withLongName("verbose").withDescription("Verbose mode").create();

        commandLine = new WriteableCommandLineImpl(null, prefixes);
    }

    // ==========================================
    // 1. Tests for addOption(Option)
    // ==========================================

    @Test
    public void testAddOptionSuccess() {
        assertFalse(commandLine.hasOption(optHelp));
        commandLine.addOption(optHelp);

        assertTrue(commandLine.hasOption(optHelp));
        assertTrue(commandLine.hasOption("-h"));
        assertTrue(commandLine.hasOption("--help"));
        assertEquals(optHelp, commandLine.getOption("-h"));
        assertEquals(optHelp, commandLine.getOption("--help"));
    }

    @Test
    public void testAddMultipleDistinctOptions() {
        commandLine.addOption(optHelp);
        commandLine.addOption(optFile);

        assertTrue(commandLine.hasOption(optHelp));
        assertTrue(commandLine.hasOption(optFile));
        assertFalse(commandLine.hasOption(optVerbose));
    }

    @Test
    public void testAddDuplicateOption() {
        commandLine.addOption(optHelp);
        commandLine.addOption(optHelp); // Should be idempotent

        assertTrue(commandLine.hasOption(optHelp));
        assertEquals(optHelp, commandLine.getOption("-h"));
    }

    @Test
    public void testAddOptionNull() {
        try {
            commandLine.addOption(null);
            assertFalse(commandLine.hasOption((Option) null));
        } catch (NullPointerException e) {
            // Null argument rejection is also acceptable
            assertNotNull(e);
        }
    }

    // ==========================================
    // 2. Tests for addValue(Option, Object)
    // ==========================================

    @Test
    public void testAddSingleValue() {
        commandLine.addValue(optFile, "file1.txt");

        // Adding a value must automatically register the option
        assertTrue(commandLine.hasOption(optFile));
        assertEquals("file1.txt", commandLine.getValue(optFile));

        List values = commandLine.getValues(optFile);
        assertNotNull(values);
        assertEquals(1, values.size());
        assertEquals("file1.txt", values.get(0));
    }

    @Test
    public void testAddMultipleValuesOrderPreserved() {
        commandLine.addValue(optFile, "alpha");
        commandLine.addValue(optFile, "beta");
        commandLine.addValue(optFile, "gamma");

        List values = commandLine.getValues(optFile);
        assertEquals(3, values.size());
        assertEquals("alpha", values.get(0));
        assertEquals("beta", values.get(1));
        assertEquals("gamma", values.get(2));
        assertEquals("alpha", commandLine.getValue(optFile));
    }

    @Test
    public void testAddValueEmptyAndNullValues() {
        commandLine.addValue(optFile, "");
        commandLine.addValue(optFile, null);

        List values = commandLine.getValues(optFile);
        assertEquals(2, values.size());
        assertEquals("", values.get(0));
        assertNull(values.get(1));
    }

    // ==========================================
    // 3. Tests for setDefaultValues(Option, List)
    // ==========================================

    @Test
    public void testSetDefaultValuesAppliedWhenNoValuesAdded() {
        List defaults = Arrays.asList("default1", "default2");
        commandLine.setDefaultValues(optFile, defaults);

        List actual = commandLine.getValues(optFile);
        assertEquals(defaults, actual);
        assertEquals("default1", commandLine.getValue(optFile));
    }

    @Test
    public void testExplicitValuesOverrideDefaultValues() {
        List defaults = Arrays.asList("defaultVal");
        commandLine.setDefaultValues(optFile, defaults);

        // Add explicit value
        commandLine.addValue(optFile, "explicitVal");

        List actual = commandLine.getValues(optFile);
        assertEquals(1, actual.size());
        assertEquals("explicitVal", actual.get(0));
        assertEquals("explicitVal", commandLine.getValue(optFile));
    }

    @Test
    public void testSetDefaultValuesNullOrEmpty() {
        commandLine.setDefaultValues(optFile, null);
        assertTrue(commandLine.getValues(optFile).isEmpty());

        commandLine.setDefaultValues(optFile, Collections.EMPTY_LIST);
        assertTrue(commandLine.getValues(optFile).isEmpty());
    }

    @Test
    public void testDefaultValuesWithMethodFallbackList() {
        List fallback = Collections.singletonList("fallback");

        // Case 1: No default and no explicit values
        assertEquals(fallback, commandLine.getValues(optFile, fallback));

        // Case 2: Configured default values take precedence over method fallback
        List defaults = Collections.singletonList("configuredDefault");
        commandLine.setDefaultValues(optFile, defaults);
        assertEquals(defaults, commandLine.getValues(optFile, fallback));
    }

    // ==========================================
    // 4. Tests for addSwitch(Option, boolean)
    // ==========================================

    @Test
    public void testAddSwitchTrue() {
        commandLine.addSwitch(optVerbose, true);

        assertTrue(commandLine.hasOption(optVerbose));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(optVerbose));
        assertEquals(Boolean.TRUE, commandLine.getSwitch("-v"));
    }

    @Test
    public void testAddSwitchFalse() {
        commandLine.addSwitch(optVerbose, false);

        assertTrue(commandLine.hasOption(optVerbose));
        assertEquals(Boolean.FALSE, commandLine.getSwitch(optVerbose));
        assertEquals(Boolean.FALSE, commandLine.getSwitch("-v"));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchAlreadyAddedThrowsIllegalStateException() {
        commandLine.addSwitch(optVerbose, true);
        // Adding again must throw IllegalStateException according to specification
        commandLine.addSwitch(optVerbose, false);
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchSameValueTwiceThrowsIllegalStateException() {
        commandLine.addSwitch(optVerbose, true);
        commandLine.addSwitch(optVerbose, true);
    }

    // ==========================================
    // 5. Tests for setDefaultSwitch(Option, Boolean)
    // ==========================================

    @Test
    public void testSetDefaultSwitchAppliedWhenNoSwitchAdded() {
        commandLine.setDefaultSwitch(optVerbose, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(optVerbose));

        commandLine.setDefaultSwitch(optHelp, Boolean.FALSE);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(optHelp));
    }

    @Test
    public void testExplicitSwitchOverridesDefaultSwitch() {
        commandLine.setDefaultSwitch(optVerbose, Boolean.TRUE);

        // Explicit switch added as false
        commandLine.addSwitch(optVerbose, false);

        assertEquals(Boolean.FALSE, commandLine.getSwitch(optVerbose));
    }

    @Test
    public void testSetDefaultSwitchNull() {
        commandLine.setDefaultSwitch(optVerbose, null);
        assertNull(commandLine.getSwitch(optVerbose));
    }

    // ==========================================
    // 6. Tests for addProperty(String, String)
    // ==========================================

    @Test
    public void testAddPropertyAndRetrieve() {
        commandLine.addProperty("env", "production");
        commandLine.addProperty("port", "8080");

        assertEquals("production", commandLine.getProperty("env"));
        assertEquals("8080", commandLine.getProperty("port"));
        assertNull(commandLine.getProperty("nonexistent"));
        assertEquals("defaultPort", commandLine.getProperty("nonexistent", "defaultPort"));
    }

    @Test
    public void testAddPropertyReplacesExistingValue() {
        commandLine.addProperty("key", "initialValue");
        assertEquals("initialValue", commandLine.getProperty("key"));

        // Replace value
        commandLine.addProperty("key", "updatedValue");
        assertEquals("updatedValue", commandLine.getProperty("key"));
    }

    @Test
    public void testAddPropertyBoundaryEmptyAndSpecialCharacters() {
        commandLine.addProperty("", "emptyKey");
        commandLine.addProperty("emptyVal", "");
        commandLine.addProperty("special=!@#$%^&*()", "val=123");

        assertEquals("emptyKey", commandLine.getProperty(""));
        assertEquals("", commandLine.getProperty("emptyVal"));
        assertEquals("val=123", commandLine.getProperty("special=!@#$%^&*()"));
    }

    // ==========================================
    // 7. Tests for looksLikeOption(String)
    // ==========================================

    @Test
    public void testLooksLikeOptionPositiveMatches() {
        assertTrue(commandLine.looksLikeOption("-h"));
        assertTrue(commandLine.looksLikeOption("-v"));
        assertTrue(commandLine.looksLikeOption("--help"));
        assertTrue(commandLine.looksLikeOption("--verbose"));
        assertTrue(commandLine.looksLikeOption("-Dproperty=value"));

        // Boundary: argument matches the exact prefix
        assertTrue(commandLine.looksLikeOption("-"));
        assertTrue(commandLine.looksLikeOption("--"));
    }

    @Test
    public void testLooksLikeOptionNegativeMatches() {
        assertFalse(commandLine.looksLikeOption("file.txt"));
        assertFalse(commandLine.looksLikeOption("command"));
        assertFalse(commandLine.looksLikeOption("+option"));
        assertFalse(commandLine.looksLikeOption("/help"));
        assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void testLooksLikeOptionWithEmptyPrefixes() {
        WriteableCommandLine noPrefixesCommandLine = new WriteableCommandLineImpl(null, Collections.EMPTY_LIST);
        assertFalse(noPrefixesCommandLine.looksLikeOption("-h"));
        assertFalse(noPrefixesCommandLine.looksLikeOption("--help"));
        assertFalse(noPrefixesCommandLine.looksLikeOption("plain"));
    }

    @Test
    public void testLooksLikeOptionNullArgument() {
        try {
            boolean result = commandLine.looksLikeOption(null);
            assertFalse(result);
        } catch (NullPointerException e) {
            // Documented edge case: some implementations don't allow null argument
            assertNotNull(e);
        }
    }
}
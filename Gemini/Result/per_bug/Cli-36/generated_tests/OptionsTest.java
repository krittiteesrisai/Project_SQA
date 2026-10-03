package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

/**
 * Comprehensive test suite for Options (Defects4J Cli-36b)
 * written by Senior Java Test Automation Engineer.
 */
public class OptionsTest {

    @Test
    public void testAddOptionGroupRequiredAndOptional() {
        // Test addOptionGroup with required=true and false branches
        OptionGroup groupReq = new OptionGroup();
        groupReq.setRequired(true);
        Option optA = new Option("a", "alpha", false, "alpha option");
        groupReq.addOption(optA);

        OptionGroup groupOpt = new OptionGroup();
        groupOpt.setRequired(false);
        Option optB = new Option("b", "beta", false, "beta option");
        groupOpt.addOption(optB);

        Options options = new Options();
        options.addOptionGroup(groupReq);
        options.addOptionGroup(groupOpt);

        assertTrue("Required options should contain the required group", options.getRequiredOptions().contains(groupReq));
        assertFalse("Required options should not contain the optional group", options.getRequiredOptions().contains(groupOpt));
        
        // Verify options inside group had their required flag forced to false
        assertFalse(optA.isRequired());
        assertFalse(optB.isRequired());

        // Verify optionGroups mapping & retrieval
        assertEquals(groupReq, options.getOptionGroup(optA));
        assertEquals(groupOpt, options.getOptionGroup(optB));
        
        Collection<OptionGroup> groups = options.getOptionGroups();
        assertEquals(2, groups.size());
    }

    @Test
    public void testAddOptionShortAndLongVariations() {
        Options options = new Options();

        // 1. addOption(String, String) -> short name + description only
        options.addOption("s", "short desc");
        assertTrue(options.hasShortOption("s"));
        assertFalse(options.hasLongOption("s"));

        // 2. addOption(String, boolean, String) -> short name + hasArg + description
        options.addOption("a", true, "arg desc");
        assertTrue(options.hasShortOption("a"));
        assertTrue(options.getOption("a").hasArg());

        // 3. addOption(String, String, boolean, String) -> short + long + hasArg + desc
        options.addOption("c", "char", false, "char long desc");
        assertTrue(options.hasShortOption("c"));
        assertTrue(options.hasLongOption("char"));

        // 4. Duplicate required option handling (branch coverage for requiredOpts.contains)
        Option reqOpt1 = new Option("r", "req", true, "required");
        reqOpt1.setRequired(true);
        options.addOption(reqOpt1);

        Option reqOpt2 = new Option("r", "req-updated", true, "required updated");
        reqOpt2.setRequired(true);
        options.addOption(reqOpt2); // Should replace existing entry in requiredOpts

        assertEquals(1, options.getRequiredOptions().size());
        assertEquals("req-updated", options.getOption("r").getLongOpt());
    }

    @Test
    public void testGetOptionWithHyphensAndFallbacks() {
        Options options = new Options();
        options.addOption("f", "file", true, "file option");
        options.addOption("x", false, "no long option");

        // Test stripping leading hyphens and finding short vs long options
        assertNotNull(options.getOption("-f"));
        assertNotNull(options.getOption("--file"));
        assertNotNull(options.getOption("-x"));
        assertNull(options.getOption("--nonexistent"));

        // Test hasOption, hasShortOption, hasLongOption variations
        assertTrue(options.hasOption("-file"));
        assertTrue(options.hasLongOption("--file"));
        assertTrue(options.hasShortOption("-f"));
        assertFalse(options.hasLongOption("-f")); // short option passed to hasLongOption
        assertFalse(options.hasShortOption("--file")); // long option passed to hasShortOption
    }

    @Test
    public void testGetMatchingOptions() {
        Options options = new Options();
        options.addOption("b", "block", false, "block");
        options.addOption("B", "blocks", false, "blocks");
        options.addOption("c", "cat", false, "cat");

        // Perfect match branch
        List<String> perfectMatch = options.getMatchingOptions("block");
        assertEquals(1, perfectMatch.size());
        assertEquals("block", perfectMatch.get(0));

        // Partial match branch (multiple matches)
        List<String> partialMatches = options.getMatchingOptions("blo");
        assertEquals(2, partialMatches.size());
        assertTrue(partialMatches.contains("block"));
        assertTrue(partialMatches.contains("blocks"));

        // No match branch
        List<String> noMatches = options.getMatchingOptions("dog");
        assertTrue(noMatches.isEmpty());

        // With leading hyphens
        List<String> hyphensMatch = options.getMatchingOptions("--ca");
        assertEquals(1, hyphensMatch.size());
        assertEquals("cat", hyphensMatch.get(0));
    }

    @Test
    public void testGetOptionsAndHelpOptionsImmutabilityAndToString() {
        Options options = new Options();
        options.addOption("h", "help", false, "help");

        // getOptions returns unmodifiable collection
        Collection<Option> optionList = options.getOptions();
        assertEquals(1, optionList.size());

        try {
            optionList.clear();
            fail("Expected UnsupportedOperationException when modifying unmodifiable collection");
        } catch (UnsupportedOperationException e) {
            // Expected
        }

        // Test toString() format execution
        String strOutput = options.toString();
        assertNotNull(strOutput);
        assertTrue(strOutput.contains("Options"));
        assertTrue(strOutput.contains("help"));
    }
}
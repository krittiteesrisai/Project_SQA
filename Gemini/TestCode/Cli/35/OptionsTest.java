package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class OptionsTest {

    private Options options;

    @Before
    public void setUp() {
        options = new Options();
    }

    @Test
    public void testAddOptionGroupRequiredAndNotRequired() {
        OptionGroup group1 = new OptionGroup();
        Option optA = new Option("a", "alpha", false, "alpha desc");
        Option optB = new Option("b", "beta", false, "beta desc");
        group1.addOption(optA);
        group1.addOption(optB);
        group1.setRequired(true);

        OptionGroup group2 = new OptionGroup();
        Option optC = new Option("c", "gamma", false, "gamma desc");
        group2.addOption(optC);
        group2.setRequired(false);

        options.addOptionGroup(group1);
        options.addOptionGroup(group2);

        assertTrue(options.getRequiredOptions().contains(group1));
        assertFalse(options.getRequiredOptions().contains(group2));
        
        assertEquals(group1, options.getOptionGroup(optA));
        assertEquals(group1, options.getOptionGroup(optB));
        assertEquals(group2, options.getOptionGroup(optC));

        Collection<OptionGroup> groups = options.getOptionGroups();
        assertEquals(2, groups.size());
    }

    @Test
    public void testAddSimpleOptions() {
        options.addOption("a", "Short desc");
        options.addOption("b", true, "Short with arg desc");
        options.addOption("c", "longC", true, "Full option desc");

        assertTrue(options.hasShortOption("a"));
        assertTrue(options.hasShortOption("b"));
        assertTrue(options.hasShortOption("c"));
        assertTrue(options.hasLongOption("longC"));

        assertEquals("Short desc", options.getOption("a").getDescription());
        assertEquals("Short with arg desc", options.getOption("b").getDescription());
        assertEquals("Full option desc", options.getOption("longC").getDescription());
    }

    @Test
    public void testAddOptionWithDuplicateRequired() {
        Option opt1 = new Option("d", "delta", true, "delta desc");
        opt1.setRequired(true);

        options.addOption(opt1);
        assertTrue(options.getRequiredOptions().contains("d"));

        // Add same required option again to trigger branch: requiredOpts.contains(key) == true
        Option opt2 = new Option("d", "delta", true, "delta desc updated");
        opt2.setRequired(true);
        options.addOption(opt2);

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertEquals("d", required.get(0));
        assertEquals("delta desc updated", options.getOption("d").getDescription());
    }

    @Test
    public void testGetOptionWithHyphens() {
        Option opt = new Option("e", "echo", false, "echo desc");
        options.addOption(opt);

        assertNotNull(options.getOption("-e"));
        assertNotNull(options.getOption("--echo"));
        assertNotNull(options.getOption("e"));
        assertNotNull(options.getOption("echo"));
        assertNull(options.getOption("nonexistent"));
    }

    @Test
    public void testHasOptionAndSubMethods() {
        Option opt = new Option("f", "foxtrot", false, "foxtrot desc");
        options.addOption(opt);

        assertTrue(options.hasOption("-f"));
        assertTrue(options.hasOption("--foxtrot"));
        assertTrue(options.hasShortOption("-f"));
        assertTrue(options.hasLongOption("--foxtrot"));

        assertFalse(options.hasShortOption("--foxtrot"));
        assertFalse(options.hasLongOption("-f"));
        assertFalse(options.hasOption("z"));
    }

    @Test
    public void testGetMatchingOptions() {
        options.addOption(new Option("v", "version", false, "version"));
        options.addOption(new Option("b", "verbose", false, "verbose"));
        options.addOption(new Option("m", "modify", false, "modify"));

        List<String> matches1 = options.getMatchingOptions("--ver");
        assertEquals(1, matches1.size());
        assertTrue(matches1.contains("version"));

        List<String> matches2 = options.getMatchingOptions("verb");
        assertEquals(1, matches2.size());
        assertTrue(matches2.contains("verbose"));

        List<String> matches3 = options.getMatchingOptions("m");
        assertEquals(1, matches3.size());
        assertTrue(matches3.contains("modify"));

        List<String> matchesNone = options.getMatchingOptions("notfound");
        assertTrue(matchesNone.isEmpty());
    }

    @Test
    public void testGetOptionsAndHelpOptions() {
        options.addOption(new Option("x", "extra", false, "extra"));
        Collection<Option> allOpts = options.getOptions();
        assertNotNull(allOpts);
        assertEquals(1, allOpts.size());
    }

    @Test
    public void testToStringRepresentation() {
        options.addOption("t", "test", false, "test desc");
        String str = options.toString();
        assertNotNull(str);
        assertTrue(str.contains("[ Options:"));
        assertTrue(str.contains("test"));
    }
}
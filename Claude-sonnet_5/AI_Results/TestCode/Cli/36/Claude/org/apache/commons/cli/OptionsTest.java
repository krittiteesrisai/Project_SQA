package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class OptionsTest {

    private Options options;

    @Before
    public void setUp() {
        options = new Options();
    }

    // ================= addOption(String, String) =================
    @Test
    public void testAddOption_ShortDescriptionOnly() {
        options.addOption("a", "description-a");
        assertTrue(options.hasOption("a"));
        Option opt = options.getOption("a");
        assertNotNull(opt);
        assertFalse(opt.hasArg());
    }

    // ================= addOption(String, boolean, String) =================
    @Test
    public void testAddOption_HasArgTrue() {
        options.addOption("b", true, "desc-b");
        Option opt = options.getOption("b");
        assertTrue(opt.hasArg());
    }

    @Test
    public void testAddOption_HasArgFalse() {
        options.addOption("c", false, "desc-c");
        Option opt = options.getOption("c");
        assertFalse(opt.hasArg());
    }

    // ================= addOption(String, String, boolean, String) =================
    @Test
    public void testAddOption_WithLongOpt() {
        options.addOption("d", "long-d", true, "desc-d");
        assertTrue(options.hasShortOption("d"));
        assertTrue(options.hasLongOption("long-d"));
    }

    // ================= addOption(Option): branch hasLongOpt() true/false =================
    @Test
    public void testAddOption_OptionWithLongOpt() {
        Option opt = new Option("e", "long-e", false, "desc-e");
        options.addOption(opt);
        assertTrue(options.hasLongOption("long-e"));
        assertTrue(options.hasShortOption("e"));
    }

    @Test
    public void testAddOption_OptionWithoutLongOpt() {
        Option opt = new Option("f", "desc-f");
        options.addOption(opt);
        assertFalse(options.hasLongOption("f"));
        assertTrue(options.hasShortOption("f"));
    }

    // ================= addOption(Option): branch isRequired() true/false =================
    @Test
    public void testAddOption_RequiredOption() {
        Option opt = new Option("g", "desc-g");
        opt.setRequired(true);
        options.addOption(opt);
        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertTrue(required.contains("g"));
    }

    @Test
    public void testAddOption_NotRequiredOption() {
        Option opt = new Option("h", "desc-h");
        opt.setRequired(false);
        options.addOption(opt);
        assertTrue(options.getRequiredOptions().isEmpty());
    }

    // ================= addOption(Option): branch requiredOpts.contains(key) =================
    @Test
    public void testAddOption_DuplicateRequiredOption() {
        Option opt1 = new Option("i", "desc-i");
        opt1.setRequired(true);
        options.addOption(opt1);

        // เพิ่ม key ซ้ำที่เป็น required อีกครั้ง เพื่อ trigger branch remove+re-add
        Option opt2 = new Option("i", "desc-i-2");
        opt2.setRequired(true);
        options.addOption(opt2);

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertTrue(required.contains("i"));
    }

    // ================= addOptionGroup =================
    @Test
    public void testAddOptionGroup_Required() {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("j", "desc-j");
        Option opt2 = new Option("k", "desc-k");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);

        options.addOptionGroup(group);

        List required = options.getRequiredOptions();
        assertTrue(required.contains(group));
        assertTrue(options.hasOption("j"));
        assertTrue(options.hasOption("k"));

        // ตาม source: option ใน group ต้องถูก setRequired(false) เสมอ
        assertFalse(options.getOption("j").isRequired());
        assertFalse(options.getOption("k").isRequired());

        assertSame(group, options.getOptionGroup(opt1));
        assertSame(group, options.getOptionGroup(opt2));
    }

    @Test
    public void testAddOptionGroup_NotRequired() {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("l", "desc-l");
        group.addOption(opt1);
        group.setRequired(false);

        options.addOptionGroup(group);

        List required = options.getRequiredOptions();
        assertFalse(required.contains(group));
        assertTrue(options.hasOption("l"));
    }

    @Test
    public void testAddOptionGroup_EmptyGroup() {
        // group ไม่มี option เลย -> for-loop ไม่ execute แม้แต่รอบเดียว
        OptionGroup group = new OptionGroup();
        options.addOptionGroup(group);
        assertTrue(options.getOptions().isEmpty());
    }

    // ================= getOptions() =================
    @Test
    public void testGetOptions_Empty() {
        Collection<Option> opts = options.getOptions();
        assertNotNull(opts);
        assertTrue(opts.isEmpty());
    }

    @Test
    public void testGetOptions_NonEmpty() {
        options.addOption("m", "desc-m");
        Collection<Option> opts = options.getOptions();
        assertEquals(1, opts.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptions_Unmodifiable() {
        options.addOption("n", "desc-n");
        Collection<Option> opts = options.getOptions();
        opts.clear(); // ต้อง throw เพราะ Collections.unmodifiableCollection
    }

    // ================= getRequiredOptions() =================
    @Test
    public void testGetRequiredOptions_Empty() {
        assertTrue(options.getRequiredOptions().isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetRequiredOptions_Unmodifiable() {
        Option opt = new Option("o", "desc-o");
        opt.setRequired(true);
        options.addOption(opt);
        List required = options.getRequiredOptions();
        required.clear(); // ต้อง throw เพราะ Collections.unmodifiableList
    }

    // ================= getOption(String) =================
    @Test
    public void testGetOption_ShortMatch() {
        options.addOption("p", "desc-p");
        Option opt = options.getOption("p");
        assertNotNull(opt);
        assertEquals("p", opt.getOpt());
    }

    @Test
    public void testGetOption_LongMatch() {
        options.addOption("q", "long-q", false, "desc-q");
        Option opt = options.getOption("long-q");
        assertNotNull(opt);
        assertEquals("long-q", opt.getLongOpt());
    }

    @Test
    public void testGetOption_NoMatch() {
        Option opt = options.getOption("nonexistent");
        assertNull(opt);
    }

    @Test
    public void testGetOption_StripLeadingHyphens() {
        // Util.stripLeadingHyphens ไม่มี source ให้ตรวจสอบ
        // อ้างอิง JavaDoc ของ getOption(): "leading hyphens ... ignored (up to 2)"
        options.addOption("r", "desc-r");
        Option opt = options.getOption("--r");
        assertNotNull(opt);
    }

    // ================= getMatchingOptions(String) =================
    @Test
    public void testGetMatchingOptions_ExactMatch() {
        options.addOption("s", "long-s", false, "desc-s");
        options.addOption("t", "long-st", false, "desc-t");
        List<String> matches = options.getMatchingOptions("long-s");
        // exact match -> singletonList เท่านั้น
        assertEquals(1, matches.size());
        assertEquals("long-s", matches.get(0));
    }

    @Test
    public void testGetMatchingOptions_PartialMatch() {
        options.addOption("u", "alpha", false, "desc-u");
        options.addOption("v", "alphabet", false, "desc-v");
        List<String> matches = options.getMatchingOptions("alph");
        assertEquals(2, matches.size());
        assertTrue(matches.contains("alpha"));
        assertTrue(matches.contains("alphabet"));
    }

    @Test
    public void testGetMatchingOptions_NoMatch() {
        options.addOption("w", "long-w", false, "desc-w");
        List<String> matches = options.getMatchingOptions("zzz");
        assertTrue(matches.isEmpty());
    }

    @Test
    public void testGetMatchingOptions_EmptyOptions() {
        // longOpts ว่างเปล่า -> for-loop ไม่ execute
        List<String> matches = options.getMatchingOptions("anything");
        assertTrue(matches.isEmpty());
    }

    // ================= hasOption(String) =================
    @Test
    public void testHasOption_ShortTrue() {
        options.addOption("x", "desc-x");
        assertTrue(options.hasOption("x"));
    }

    @Test
    public void testHasOption_LongTrue() {
        options.addOption("y", "long-y", false, "desc-y");
        assertTrue(options.hasOption("long-y"));
    }

    @Test
    public void testHasOption_False() {
        assertFalse(options.hasOption("notexist"));
    }

    // ================= hasLongOption(String) =================
    @Test
    public void testHasLongOption_True() {
        options.addOption("z", "long-z", false, "desc-z");
        assertTrue(options.hasLongOption("long-z"));
    }

    @Test
    public void testHasLongOption_False() {
        assertFalse(options.hasLongOption("nolong"));
    }

    // ================= hasShortOption(String) =================
    @Test
    public void testHasShortOption_True() {
        options.addOption("aa", "desc-aa");
        assertTrue(options.hasShortOption("aa"));
    }

    @Test
    public void testHasShortOption_False() {
        assertFalse(options.hasShortOption("noshort"));
    }

    // ================= getOptionGroup(Option) =================
    @Test
    public void testGetOptionGroup_Exists() {
        OptionGroup group = new OptionGroup();
        Option opt = new Option("bb", "desc-bb");
        group.addOption(opt);
        options.addOptionGroup(group);

        OptionGroup result = options.getOptionGroup(opt);
        assertSame(group, result);
    }

    @Test
    public void testGetOptionGroup_NotExists() {
        Option opt = new Option("cc", "desc-cc");
        options.addOption(opt);
        OptionGroup result = options.getOptionGroup(opt);
        assertNull(result);
    }

    // ================= toString() =================
    @Test
    public void testToString_ContainsExpectedParts() {
        options.addOption("dd", "long-dd", false, "desc-dd");
        String str = options.toString();
        assertNotNull(str);
        assertTrue(str.contains("[ Options:"));
        assertTrue(str.contains("short"));
        assertTrue(str.contains("long"));
    }

    @Test
    public void testToString_EmptyOptions() {
        String str = options.toString();
        assertNotNull(str);
        assertTrue(str.startsWith("[ Options:"));
    }
}

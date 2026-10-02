package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for org.apache.commons.cli.Options
 * วางไว้ใน package เดียวกับ target class เพื่อให้เข้าถึง
 * package-private methods (helpOptions(), getOptionGroups()) ได้
 */
public class OptionsTest
{
    private Options options;

    @Before
    public void setUp()
    {
        options = new Options();
    }

    // ---------------------------------------------------------------
    // addOption(String opt, String description)
    // ---------------------------------------------------------------
    @Test
    public void testAddOptionShortOnly()
    {
        options.addOption("a", "description a");
        assertTrue(options.hasOption("a"));
        Option opt = options.getOption("a");
        assertNotNull(opt);
        assertFalse(opt.hasLongOpt());
        assertFalse(opt.hasArg());
    }

    // ---------------------------------------------------------------
    // addOption(String opt, boolean hasArg, String description)
    // ---------------------------------------------------------------
    @Test
    public void testAddOptionShortWithArg()
    {
        options.addOption("b", true, "description b");
        Option opt = options.getOption("b");
        assertNotNull(opt);
        assertTrue(opt.hasArg());
    }

    // ---------------------------------------------------------------
    // addOption(String opt, String longOpt, boolean hasArg, String description)
    // ---------------------------------------------------------------
    @Test
    public void testAddOptionWithLongOpt()
    {
        options.addOption("c", "cee", false, "description c");
        Option opt = options.getOption("c");
        assertNotNull(opt);
        assertTrue(opt.hasLongOpt());
        // ตรวจว่า long option ก็ถูกเก็บด้วย key คนละตัว
        assertTrue(options.hasLongOption("cee"));
        assertSame(opt, options.getOption("cee"));
    }

    // ---------------------------------------------------------------
    // addOption(Option) : branch hasLongOpt() = false
    // ---------------------------------------------------------------
    @Test
    public void testAddOptionInstance_noLongOpt()
    {
        Option opt = new Option("d", "desc d");
        options.addOption(opt);
        assertFalse(options.hasLongOption("d"));
        assertTrue(options.hasShortOption("d"));
    }

    // ---------------------------------------------------------------
    // addOption(Option) : branch hasLongOpt() = true, isRequired() = false
    // ---------------------------------------------------------------
    @Test
    public void testAddOptionInstance_withLongOpt_notRequired()
    {
        Option opt = new Option("e", "eee", false, "desc e");
        options.addOption(opt);
        assertTrue(options.hasLongOption("eee"));
        assertTrue(options.getRequiredOptions().isEmpty());
    }

    // ---------------------------------------------------------------
    // addOption(Option) : branch isRequired() = true, requiredOpts.contains(key) = false (first add)
    // ---------------------------------------------------------------
    @Test
    public void testAddOptionInstance_required_firstTime()
    {
        Option opt = new Option("f", "desc f");
        opt.setRequired(true);
        options.addOption(opt);

        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertEquals("f", required.get(0));
    }

    // ---------------------------------------------------------------
    // addOption(Option) : branch isRequired() = true, requiredOpts.contains(key) = true
    // (เพิ่มตัวเดิม 2 ครั้ง เพื่อให้เข้า if remove+re-add)
    // ---------------------------------------------------------------
    @Test
    public void testAddOptionInstance_required_duplicateKey()
    {
        Option opt1 = new Option("g", "desc g1");
        opt1.setRequired(true);
        options.addOption(opt1);

        Option opt2 = new Option("g", "desc g2");
        opt2.setRequired(true);
        options.addOption(opt2); // key "g" ซ้ำ -> ต้องเข้า branch contains==true, remove แล้ว add ใหม่

        List required = options.getRequiredOptions();
        // ต้องมี "g" อยู่แค่ 1 ตัวใน list (ไม่ duplicate)
        int count = 0;
        for (Object o : required)
        {
            if ("g".equals(o))
            {
                count++;
            }
        }
        assertEquals(1, count);
    }

    // ---------------------------------------------------------------
    // addOptionGroup : branch isRequired() = true, loop มี option
    // ---------------------------------------------------------------
    @Test
    public void testAddOptionGroup_required_withOptions()
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("h", "desc h");
        opt1.setRequired(true); // ควรถูก set เป็น false โดย addOptionGroup
        Option opt2 = new Option("i", "desc i");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);

        options.addOptionGroup(group);

        // group ถูกเพิ่มเข้า requiredOpts
        assertTrue(options.getRequiredOptions().contains(group));
        // option ในกลุ่มต้องถูก setRequired(false)
        assertFalse(options.getOption("h").isRequired());
        assertFalse(options.getOption("i").isRequired());
        // optionGroups map ต้องมีทั้งสอง key
        assertSame(group, options.getOptionGroup(opt1));
        assertSame(group, options.getOptionGroup(opt2));
    }

    // ---------------------------------------------------------------
    // addOptionGroup : branch isRequired() = false
    // ---------------------------------------------------------------
    @Test
    public void testAddOptionGroup_notRequired()
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("j", "desc j");
        group.addOption(opt1);
        group.setRequired(false);

        options.addOptionGroup(group);

        assertFalse(options.getRequiredOptions().contains(group));
        assertTrue(options.hasOption("j"));
    }

    // ---------------------------------------------------------------
    // addOptionGroup : loop ไม่มี option เลย (empty group)
    // ---------------------------------------------------------------
    @Test
    public void testAddOptionGroup_emptyGroup()
    {
        OptionGroup group = new OptionGroup();
        group.setRequired(true);

        options.addOptionGroup(group);

        assertTrue(options.getRequiredOptions().contains(group));
        assertTrue(options.getOptions().isEmpty());
    }

    // ---------------------------------------------------------------
    // getOption : branch shortOpts.containsKey = true
    // ---------------------------------------------------------------
    @Test
    public void testGetOption_byShortKey()
    {
        options.addOption("k", "desc k");
        assertNotNull(options.getOption("k"));
    }

    // ---------------------------------------------------------------
    // getOption : branch shortOpts.containsKey = false, longOpts.get -> found
    // ---------------------------------------------------------------
    @Test
    public void testGetOption_byLongKey()
    {
        options.addOption("l", "ell", false, "desc l");
        assertNotNull(options.getOption("ell"));
    }

    // ---------------------------------------------------------------
    // getOption : ไม่พบทั้งสองแบบ -> return null
    // ---------------------------------------------------------------
    @Test
    public void testGetOption_notFound()
    {
        assertNull(options.getOption("zzz"));
    }

    // ---------------------------------------------------------------
    // getOption : ทดสอบการตัด leading hyphens
    // ---------------------------------------------------------------
    @Test
    public void testGetOption_withLeadingHyphens()
    {
        options.addOption("m", "mmm", false, "desc m");
        assertSame(options.getOption("m"), options.getOption("-m"));
        assertSame(options.getOption("mmm"), options.getOption("--mmm"));
    }

    // ---------------------------------------------------------------
    // getMatchingOptions : พบ match แบบ partial
    // ---------------------------------------------------------------
    @Test
    public void testGetMatchingOptions_withMatches()
    {
        options.addOption("n", "name", false, "desc name");
        options.addOption("o", "namespace", false, "desc namespace");
        options.addOption("p", "other", false, "desc other");

        List<String> matches = options.getMatchingOptions("nam");
        assertEquals(2, matches.size());
        assertTrue(matches.contains("name"));
        assertTrue(matches.contains("namespace"));
    }

    // ---------------------------------------------------------------
    // getMatchingOptions : ไม่พบ match เลย (loop เข้าแต่ if false ทุกครั้ง)
    // ---------------------------------------------------------------
    @Test
    public void testGetMatchingOptions_noMatches()
    {
        options.addOption("q", "quiet", false, "desc quiet");
        List<String> matches = options.getMatchingOptions("xyz");
        assertTrue(matches.isEmpty());
    }

    // ---------------------------------------------------------------
    // getMatchingOptions : longOpts ว่าง -> loop ไม่ execute เลย
    // ---------------------------------------------------------------
    @Test
    public void testGetMatchingOptions_emptyLongOpts()
    {
        // ไม่มี option ใดถูกเพิ่มเลย
        List<String> matches = options.getMatchingOptions("any");
        assertTrue(matches.isEmpty());
    }

    // ---------------------------------------------------------------
    // hasOption : true จาก shortOpts, true จาก longOpts, false ไม่พบ
    // ---------------------------------------------------------------
    @Test
    public void testHasOption_shortTrue()
    {
        options.addOption("r", "desc r");
        assertTrue(options.hasOption("r"));
    }

    @Test
    public void testHasOption_longTrue()
    {
        options.addOption("s", "sss", false, "desc s");
        assertTrue(options.hasOption("sss"));
    }

    @Test
    public void testHasOption_false()
    {
        assertFalse(options.hasOption("notexist"));
    }

    // ---------------------------------------------------------------
    // hasLongOption : true / false
    // ---------------------------------------------------------------
    @Test
    public void testHasLongOption_true()
    {
        options.addOption("t", "ttt", false, "desc t");
        assertTrue(options.hasLongOption("ttt"));
    }

    @Test
    public void testHasLongOption_false()
    {
        options.addOption("u", "desc u"); // ไม่มี long opt
        assertFalse(options.hasLongOption("u"));
    }

    // ---------------------------------------------------------------
    // hasShortOption : true / false
    // ---------------------------------------------------------------
    @Test
    public void testHasShortOption_true()
    {
        options.addOption("v", "desc v");
        assertTrue(options.hasShortOption("v"));
    }

    @Test
    public void testHasShortOption_false()
    {
        assertFalse(options.hasShortOption("nope"));
    }

    // ---------------------------------------------------------------
    // getOptionGroup : พบ / ไม่พบ (null)
    // ---------------------------------------------------------------
    @Test
    public void testGetOptionGroup_found()
    {
        OptionGroup group = new OptionGroup();
        Option opt = new Option("w", "desc w");
        group.addOption(opt);
        options.addOptionGroup(group);

        assertSame(group, options.getOptionGroup(opt));
    }

    @Test
    public void testGetOptionGroup_notFound()
    {
        Option standaloneOpt = new Option("x", "desc x");
        options.addOption(standaloneOpt);
        assertNull(options.getOptionGroup(standaloneOpt));
    }

    // ---------------------------------------------------------------
    // getRequiredOptions : ค่าว่างเมื่อไม่มี required option
    // ---------------------------------------------------------------
    @Test
    public void testGetRequiredOptions_empty()
    {
        assertTrue(options.getRequiredOptions().isEmpty());
    }

    // ---------------------------------------------------------------
    // getRequiredOptions ต้อง unmodifiable
    // ---------------------------------------------------------------
    @Test(expected = UnsupportedOperationException.class)
    public void testGetRequiredOptions_unmodifiable()
    {
        Option opt = new Option("y", "desc y");
        opt.setRequired(true);
        options.addOption(opt);
        options.getRequiredOptions().add("hack");
    }

    // ---------------------------------------------------------------
    // getOptions : unmodifiable collection + ค่าถูกต้อง
    // ---------------------------------------------------------------
    @Test
    public void testGetOptions_content()
    {
        options.addOption("z", "desc z");
        Collection<Option> opts = options.getOptions();
        assertEquals(1, opts.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptions_unmodifiable()
    {
        options.addOption("aa", "desc aa");
        options.getOptions().clear();
    }

    // ---------------------------------------------------------------
    // helpOptions() : package-private, ตรวจว่า return list ตรงกับ shortOpts
    // ---------------------------------------------------------------
    @Test
    public void testHelpOptions()
    {
        options.addOption("bb", "desc bb");
        List<Option> helpOpts = options.helpOptions();
        assertEquals(1, helpOpts.size());
        assertEquals("bb", helpOpts.get(0).getKey());
    }

    // ---------------------------------------------------------------
    // getOptionGroups() : package-private, ตรวจ collection ของกลุ่มที่ distinct
    // ---------------------------------------------------------------
    @Test
    public void testGetOptionGroups()
    {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("cc", "desc cc");
        Option opt2 = new Option("dd", "desc dd");
        group.addOption(opt1);
        group.addOption(opt2);

        options.addOptionGroup(group);

        Collection<OptionGroup> groups = options.getOptionGroups();
        assertEquals(1, groups.size());
        assertTrue(groups.contains(group));
    }

    @Test
    public void testGetOptionGroups_empty()
    {
        // ไม่มี option group ใดถูกเพิ่ม
        Collection<OptionGroup> groups = options.getOptionGroups();
        assertTrue(groups.isEmpty());
    }

    // ---------------------------------------------------------------
    // toString : ตรวจว่ามีข้อมูลสำคัญปรากฏอยู่
    // ---------------------------------------------------------------
    @Test
    public void testToString()
    {
        options.addOption("ee", "eee", false, "desc ee");
        String result = options.toString();
        assertNotNull(result);
        assertTrue(result.contains("[ Options:"));
        assertTrue(result.contains("short"));
        assertTrue(result.contains("long"));
    }

    @Test
    public void testToString_emptyOptions()
    {
        String result = options.toString();
        assertNotNull(result);
        assertTrue(result.startsWith("[ Options:"));
    }
}

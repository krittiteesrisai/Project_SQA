package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link CommandLine} (Defects4J Cli-1b).
 *
 * สมมติฐานเกี่ยวกับ Option (ไม่มี source ให้มาโดยตรง แต่จำเป็นต้องใช้เป็น collaborator):
 *  - Option(String opt, String longOpt, boolean hasArg, String description)
 *  - Option(String opt, boolean hasArg, String description)
 *  - void addValueForProcessing(String value)  // package-private, ปกติใช้โดย Parser
 *  - String[] getValues()
 *  - Object getType()
 *  - String getKey()  (คาดว่า return opt เว้นแต่ opt เป็น null จะ return longOpt แทน)
 *
 * สมมติฐานเกี่ยวกับ Util.stripLeadingHyphens: ตัด "-" หรือ "--" นำหน้าออกจาก string
 * (พฤติกรรมมาตรฐานของ commons-cli Util class)
 */
public class CommandLineTest
{
    private CommandLine cmd;

    @Before
    public void setUp()
    {
        cmd = new CommandLine();
    }

    // ---------- helper methods ----------

    /** สร้าง Option ที่ไม่มี argument (flag option) */
    private Option createFlagOption(String opt, String longOpt)
    {
        return new Option(opt, longOpt, false, "desc-" + opt);
    }

    /** สร้าง Option ที่มี argument และตั้งค่า value ให้แล้ว */
    private Option createValuedOption(String opt, String longOpt, String value)
    {
        Option option = new Option(opt, longOpt, true, "desc-" + opt);
        option.addValueForProcessing(value); // สมมติฐาน package-private API
        return option;
    }

    // ---------- hasOption(String) / hasOption(char) ----------

    @Test
    public void testHasOptionString_NotSet()
    {
        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testHasOptionString_Set()
    {
        cmd.addOption(createFlagOption("a", null));
        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testHasOptionChar_Delegates()
    {
        cmd.addOption(createFlagOption("a", null));
        assertTrue(cmd.hasOption('a'));
        assertFalse(cmd.hasOption('b'));
    }

    @Test
    public void testHasOption_LongOptNotRecognizedDirectly()
    {
        // hasOption ตรวจสอบเฉพาะ options map (key = short opt) ไม่ผ่าน names map
        cmd.addOption(createFlagOption("a", "alpha"));
        assertFalse(cmd.hasOption("alpha"));
    }

    // ---------- getOptionObject(String) / getOptionObject(char) ----------

    @Test
    public void testGetOptionObject_NotPresent()
    {
        assertNull(cmd.getOptionObject("x"));
    }

    @Test
    public void testGetOptionObject_PresentNoValue()
    {
        cmd.addOption(createFlagOption("c", null));
        assertNull(cmd.getOptionObject("c"));
    }

    @Test
    public void testGetOptionObject_PresentWithValue()
    {
        cmd.addOption(createValuedOption("a", null, "val1"));
        Object result = cmd.getOptionObject("a");
        // สมมติฐาน: TypeHandler.createValue กับ type เริ่มต้น (ไม่ได้ set) จะไม่ throw และไม่ null
        assertNotNull(result);
    }

    @Test
    public void testGetOptionObject_HyphenPrefixInconsistency()
    {
        // getOptionObject ใช้ opt แบบดิบตรวจสอบ options.containsKey (ไม่ strip hyphen)
        // ในขณะที่ getOptionValue/getOptionValues strip hyphen ภายใน -> เกิดพฤติกรรมไม่ตรงกัน
        cmd.addOption(createValuedOption("a", null, "val1"));
        assertNull(cmd.getOptionObject("-a"));
    }

    @Test
    public void testGetOptionObjectChar_Delegates()
    {
        cmd.addOption(createValuedOption("a", null, "val1"));
        assertNotNull(cmd.getOptionObject('a'));
        assertNull(cmd.getOptionObject('z'));
    }

    // ---------- getOptionValue(String) / getOptionValue(char) ----------

    @Test
    public void testGetOptionValueString_NotPresent()
    {
        assertNull(cmd.getOptionValue("a"));
    }

    @Test
    public void testGetOptionValueString_Present()
    {
        cmd.addOption(createValuedOption("a", null, "val1"));
        assertEquals("val1", cmd.getOptionValue("a"));
    }

    @Test
    public void testGetOptionValueChar_Delegates()
    {
        cmd.addOption(createValuedOption("a", null, "val1"));
        assertEquals("val1", cmd.getOptionValue('a'));
    }

    // ---------- getOptionValues(String) / getOptionValues(char) ----------

    @Test
    public void testGetOptionValues_NotPresent()
    {
        assertNull(cmd.getOptionValues("a"));
    }

    @Test
    public void testGetOptionValues_ShortOptDirect()
    {
        cmd.addOption(createValuedOption("a", null, "val1"));
        assertArrayEquals(new String[] { "val1" }, cmd.getOptionValues("a"));
    }

    @Test
    public void testGetOptionValues_SingleHyphenStripped()
    {
        cmd.addOption(createValuedOption("a", null, "val1"));
        assertArrayEquals(new String[] { "val1" }, cmd.getOptionValues("-a"));
    }

    @Test
    public void testGetOptionValues_DoubleHyphenStripped()
    {
        cmd.addOption(createValuedOption("a", null, "val1"));
        assertArrayEquals(new String[] { "val1" }, cmd.getOptionValues("--a"));
    }

    @Test
    public void testGetOptionValues_ByLongOpt_UsesNamesMap()
    {
        cmd.addOption(createValuedOption("a", "alpha", "val1"));
        assertArrayEquals(new String[] { "val1" }, cmd.getOptionValues("alpha"));
    }

    @Test
    public void testGetOptionValuesChar_Delegates()
    {
        cmd.addOption(createValuedOption("a", null, "val1"));
        assertArrayEquals(new String[] { "val1" }, cmd.getOptionValues('a'));
        assertNull(cmd.getOptionValues('z'));
    }

    // ---------- getOptionValue(String, default) / getOptionValue(char, default) ----------

    @Test
    public void testGetOptionValueDefault_AnswerNull_ReturnsDefault()
    {
        assertEquals("dflt", cmd.getOptionValue("a", "dflt"));
    }

    @Test
    public void testGetOptionValueDefault_AnswerNotNull_ReturnsAnswer()
    {
        cmd.addOption(createValuedOption("a", null, "val1"));
        assertEquals("val1", cmd.getOptionValue("a", "dflt"));
    }

    @Test
    public void testGetOptionValueDefaultChar_Delegates()
    {
        assertEquals("dflt", cmd.getOptionValue('a', "dflt"));
        cmd.addOption(createValuedOption("a", null, "val1"));
        assertEquals("val1", cmd.getOptionValue('a', "dflt"));
    }

    // ---------- getArgs() / getArgList() / addArg() ----------

    @Test
    public void testGetArgs_Empty()
    {
        String[] args = cmd.getArgs();
        assertNotNull(args);
        assertEquals(0, args.length);
    }

    @Test
    public void testAddArg_And_GetArgs()
    {
        cmd.addArg("foo");
        cmd.addArg("bar");
        String[] args = cmd.getArgs();
        assertEquals(2, args.length);
        assertEquals("foo", args[0]);
        assertEquals("bar", args[1]);
    }

    @Test
    public void testGetArgList()
    {
        cmd.addArg("foo");
        List argList = cmd.getArgList();
        assertEquals(1, argList.size());
        assertEquals("foo", argList.get(0));
    }

    // ---------- addOption() / iterator() / getOptions() ----------

    @Test
    public void testAddOption_ShortOnly_NoLongOpt()
    {
        Option option = createFlagOption("a", null);
        cmd.addOption(option);
        assertTrue(cmd.hasOption("a"));

        Option[] options = cmd.getOptions();
        assertEquals(1, options.length);
        assertSame(option, options[0]);
    }

    @Test
    public void testAddOption_WithLongOpt_PopulatesNamesMap()
    {
        Option option = createValuedOption("a", "alpha", "val1");
        cmd.addOption(option);

        assertTrue(cmd.hasOption("a"));
        assertEquals("val1", cmd.getOptionValue("alpha"));
    }

    @Test
    public void testIterator_Empty()
    {
        Iterator it = cmd.iterator();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_ContainsAddedOptions()
    {
        Option optA = createFlagOption("a", null);
        Option optB = createFlagOption("b", null);
        cmd.addOption(optA);
        cmd.addOption(optB);

        int count = 0;
        Iterator it = cmd.iterator();
        while (it.hasNext())
        {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetOptions_Empty()
    {
        Option[] options = cmd.getOptions();
        assertNotNull(options);
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions_MultipleOptions()
    {
        Option optA = createFlagOption("a", null);
        Option optB = createFlagOption("b", null);
        cmd.addOption(optA);
        cmd.addOption(optB);

        Option[] options = cmd.getOptions();
        assertEquals(2, options.length);
    }
}

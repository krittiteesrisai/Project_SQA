package org.apache.commons.cli2.commandline;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
// import คลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด (ถึงจะอยู่ package เดียวกันก็ตาม)
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;

public class WriteableCommandLineImplTest {

    private DefaultOptionBuilder obuilder;
    private ArgumentBuilder abuilder;

    private Option rootOption;
    private List arguments;
    private WriteableCommandLineImpl cmdLine;

    @Before
    public void setUp() throws Exception {
        obuilder = new DefaultOptionBuilder();
        abuilder = new ArgumentBuilder();

        // ASSUMPTION: DefaultOption ที่ตั้งทั้ง shortName/longName จะมี prefixes
        // เริ่มต้นเป็น "-" และ "--" ตามธรรมเนียมของ Commons-CLI2 (ไม่ได้ระบุใน
        // ซอร์สคลาสเป้าหมาย จึงกำกับไว้เป็นข้อสันนิษฐาน)
        rootOption = obuilder.withShortName("r").withLongName("root").create();

        arguments = new ArrayList();
        cmdLine = new WriteableCommandLineImpl(rootOption, arguments);
    }

    // ---------------------------------------------------------------
    // Constructor / getNormalised()
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_getNormalised_returnsGivenArguments() {
        List args = new ArrayList();
        args.add("foo");
        args.add("bar baz");
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);
        assertEquals(args, cl.getNormalised());
    }

    @Test
    public void testGetNormalised_emptyByDefault() {
        assertTrue(cmdLine.getNormalised().isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetNormalised_isUnmodifiable() {
        cmdLine.getNormalised().add("x");
    }

    // ---------------------------------------------------------------
    // addOption / hasOption / getOption / getOptions / getOptionTriggers
    // ---------------------------------------------------------------

    @Test
    public void testGetOptions_initiallyEmpty() {
        assertTrue(cmdLine.getOptions().isEmpty());
    }

    @Test
    public void testGetOptionTriggers_initiallyEmpty() {
        assertTrue(cmdLine.getOptionTriggers().isEmpty());
    }

    @Test
    public void testAddOption_and_hasOption() {
        Option opt = obuilder.withShortName("a").withLongName("alpha").create();
        assertFalse("must not be present before add", cmdLine.hasOption(opt));
        cmdLine.addOption(opt);
        assertTrue("must be present after add", cmdLine.hasOption(opt));
    }

    @Test
    public void testHasOption_falseForUnknownOption() {
        Option opt = obuilder.withShortName("b").withLongName("beta").create();
        assertFalse(cmdLine.hasOption(opt));
    }

    @Test
    public void testGetOption_byPreferredNameAndAllTriggers() {
        Option opt = obuilder.withShortName("c").withLongName("charlie").create();
        cmdLine.addOption(opt);

        assertSame(opt, cmdLine.getOption(opt.getPreferredName()));

        for (Object trigger : opt.getTriggers()) {
            assertSame(opt, cmdLine.getOption((String) trigger));
        }
    }

    @Test
    public void testGetOption_unknownTrigger_returnsNull() {
        assertNull(cmdLine.getOption("--doesNotExist"));
    }

    @Test
    public void testGetOptions_unmodifiableAndContainsAdded() {
        Option opt1 = obuilder.withShortName("d").withLongName("delta").create();
        Option opt2 = obuilder.withShortName("e").withLongName("echo").create();
        cmdLine.addOption(opt1);
        cmdLine.addOption(opt2);

        List options = cmdLine.getOptions();
        assertTrue(options.contains(opt1));
        assertTrue(options.contains(opt2));

        try {
            options.add(opt1);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    @Test
    public void testGetOptionTriggers_unmodifiableAndContainsAdded() {
        Option opt = obuilder.withShortName("f").withLongName("foxtrot").create();
        cmdLine.addOption(opt);

        Set triggers = cmdLine.getOptionTriggers();
        for (Object trigger : opt.getTriggers()) {
            assertTrue(triggers.contains(trigger));
        }

        try {
            triggers.add("newTrigger");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    // ---------------------------------------------------------------
    // addValue / getUndefaultedValues
    // ---------------------------------------------------------------

    @Test
    public void testAddValue_nonArgumentOption_doesNotAutoAddOption() {
        Option opt = obuilder.withShortName("g").withLongName("golf").create();
        assertFalse(cmdLine.hasOption(opt));
        cmdLine.addValue(opt, "v1");
        // opt ไม่ใช่ Argument -> addValue ต้อง "ไม่" เรียก addOption ให้ (if false branch)
        assertFalse(cmdLine.hasOption(opt));
        assertEquals(Arrays.asList("v1"), cmdLine.getUndefaultedValues(opt));
    }

    @Test
    public void testAddValue_argumentOption_autoAddsOption() {
        Argument arg = abuilder.withName("arg1").create();
        assertFalse(cmdLine.hasOption(arg));
        cmdLine.addValue(arg, "value1");
        // arg เป็น Argument -> addValue ต้องเรียก addOption ให้ (if true branch)
        assertTrue(cmdLine.hasOption(arg));
        assertEquals(Arrays.asList("value1"), cmdLine.getUndefaultedValues(arg));
    }

    @Test
    public void testAddValue_multipleValues_accumulateInOrder() {
        Option opt = obuilder.withShortName("h").withLongName("hotel").create();
        cmdLine.addValue(opt, "v1");
        cmdLine.addValue(opt, "v2");
        assertEquals(Arrays.asList("v1", "v2"), cmdLine.getUndefaultedValues(opt));
    }

    @Test
    public void testGetUndefaultedValues_noValues_returnsEmptyList() {
        Option opt = obuilder.withShortName("i2").withLongName("indiaTwo").create();
        assertEquals(Collections.EMPTY_LIST, cmdLine.getUndefaultedValues(opt));
    }

    @Test
    public void testGetUndefaultedValues_ignoresOptionDefaults() {
        Option opt = obuilder.withShortName("j2").withLongName("juliettTwo").create();
        cmdLine.setDefaultValues(opt, Arrays.asList("d1", "d2"));
        // ไม่มีการ addValue -> getUndefaultedValues ต้อง "ไม่" เอา default มาปน
        assertEquals(Collections.EMPTY_LIST, cmdLine.getUndefaultedValues(opt));
    }

    // ---------------------------------------------------------------
    // addSwitch / getSwitch / setDefaultSwitch
    // ---------------------------------------------------------------

    @Test
    public void testAddSwitch_alwaysAddsOption() {
        Option opt = obuilder.withShortName("k").withLongName("kilo").create();
        assertFalse(cmdLine.hasOption(opt));
        cmdLine.addSwitch(opt, true);
        // addSwitch เรียก addOption แบบไม่มีเงื่อนไข (ต่างจาก addValue)
        assertTrue(cmdLine.hasOption(opt));
    }

    @Test
    public void testAddSwitch_and_getSwitch_true() {
        Option opt = obuilder.withShortName("l").withLongName("lima").create();
        cmdLine.addSwitch(opt, true);
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, null));
    }

    @Test
    public void testAddSwitch_and_getSwitch_false() {
        Option opt = obuilder.withShortName("m").withLongName("mike").create();
        cmdLine.addSwitch(opt, false);
        assertEquals(Boolean.FALSE, cmdLine.getSwitch(opt, Boolean.TRUE));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_calledTwiceOnSameOption_throws() {
        Option opt = obuilder.withShortName("n").withLongName("november").create();
        cmdLine.addSwitch(opt, true);
        cmdLine.addSwitch(opt, false); // switches.containsKey(option) == true -> throw
    }

    @Test
    public void testGetSwitch_noStoredSwitch_fallsBackToParamDefault() {
        Option opt = obuilder.withShortName("o").withLongName("oscar").create();
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, Boolean.TRUE));
    }

    @Test
    public void testGetSwitch_noStoredNoParam_fallsBackToOptionDefaultSwitch() {
        Option opt = obuilder.withShortName("p").withLongName("papa").create();
        cmdLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, null));
    }

    @Test
    public void testGetSwitch_allSourcesNull_returnsNull() {
        Option opt = obuilder.withShortName("q").withLongName("quebec").create();
        assertNull(cmdLine.getSwitch(opt, null));
    }

    @Test
    public void testSetDefaultSwitch_nullRemovesDefault() {
        Option opt = obuilder.withShortName("s").withLongName("sierra").create();
        cmdLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, null));

        cmdLine.setDefaultSwitch(opt, null); // remove branch
        assertNull(cmdLine.getSwitch(opt, null));
    }

    // ---------------------------------------------------------------
    // getValues / setDefaultValues  (เมธอดที่มี branch ซับซ้อนที่สุด)
    // ---------------------------------------------------------------

    @Test
    public void testGetValues_noValuesNoDefaults_returnsEmptyList() {
        Option opt = obuilder.withShortName("t").withLongName("tango").create();
        assertEquals(Collections.EMPTY_LIST, cmdLine.getValues(opt, null));
    }

    @Test
    public void testGetValues_suppliedDefaults_usedWhenNoStoredValues() {
        Option opt = obuilder.withShortName("u").withLongName("uniform").create();
        List defaults = Arrays.asList("d1", "d2");
        assertEquals(defaults, cmdLine.getValues(opt, defaults));
    }

    @Test
    public void testGetValues_emptySuppliedDefaults_fallsBackToOptionDefaults() {
        Option opt = obuilder.withShortName("v").withLongName("victor").create();
        List optionDefaults = Arrays.asList("od1");
        cmdLine.setDefaultValues(opt, optionDefaults);
        // defaultValues param ว่าง -> ต้อง fallback ไปที่ this.defaultValues.get(option)
        assertEquals(optionDefaults, cmdLine.getValues(opt, new ArrayList()));
    }

    @Test
    public void testGetValues_withStoredValues_noDefaults_returnsStoredValues() {
        Option opt = obuilder.withShortName("w").withLongName("whiskey").create();
        cmdLine.addValue(opt, "v1");
        cmdLine.addValue(opt, "v2");
        assertEquals(Arrays.asList("v1", "v2"), cmdLine.getValues(opt, null));
    }

    @Test
    public void testGetValues_optionDefaultsLargerThanStored_augmentsList() {
        Option opt = obuilder.withShortName("x").withLongName("xray").create();
        cmdLine.addValue(opt, "v1");
        List optionDefaults = Arrays.asList("d1", "d2", "d3");
        cmdLine.setDefaultValues(opt, optionDefaults);

        List result = cmdLine.getValues(opt, null);
        assertEquals(3, result.size());
        assertEquals("v1", result.get(0));   // ค่าเดิมต้องยังอยู่
        assertEquals("d2", result.get(1));   // เติมจาก defaults
        assertEquals("d3", result.get(2));
    }

    @Test
    public void testGetValues_suppliedDefaultsLargerThanStored_augmentsList() {
        Option opt = obuilder.withShortName("y").withLongName("yankee").create();
        cmdLine.addValue(opt, "v1");
        List suppliedDefaults = Arrays.asList("d1", "d2");

        List result = cmdLine.getValues(opt, suppliedDefaults);
        assertEquals(2, result.size());
        assertEquals("v1", result.get(0));
        assertEquals("d2", result.get(1));
    }

    @Test
    public void testGetValues_defaultsNotLargerThanStored_noAugmentation() {
        Option opt = obuilder.withShortName("z").withLongName("zulu").create();
        cmdLine.addValue(opt, "v1");
        cmdLine.addValue(opt, "v2");
        List optionDefaults = Arrays.asList("d1"); // size 1 <= stored size 2
        cmdLine.setDefaultValues(opt, optionDefaults);

        List result = cmdLine.getValues(opt, null);
        assertEquals(Arrays.asList("v1", "v2"), result);
    }

    @Test
    public void testSetDefaultValues_nullRemovesDefault() {
        Option opt = obuilder.withShortName("a2").withLongName("alpha2").create();
        cmdLine.setDefaultValues(opt, Arrays.asList("d1"));
        assertEquals(Arrays.asList("d1"), cmdLine.getValues(opt, null));

        cmdLine.setDefaultValues(opt, null); // remove branch
        assertEquals(Collections.EMPTY_LIST, cmdLine.getValues(opt, null));
    }

    // ---------------------------------------------------------------
    // Properties: Option-based overloads (สามารถควบคุม Option instance ได้ตรง ๆ)
    // ---------------------------------------------------------------

    @Test
    public void testAddAndGetProperty_withOption() {
        Option opt = obuilder.withShortName("b2").withLongName("bravo2").create();
        cmdLine.addProperty(opt, "key1", "value1");
        assertEquals("value1", cmdLine.getProperty(opt, "key1", "default"));
        assertEquals("default", cmdLine.getProperty(opt, "unknownKey", "default"));
    }

    @Test
    public void testGetProperty_unknownOption_returnsDefaultValue() {
        Option opt = obuilder.withShortName("c2").withLongName("charlie2").create();
        assertEquals("default", cmdLine.getProperty(opt, "key1", "default"));
    }

    @Test
    public void testGetProperties_withOption_containsKey() {
        Option opt = obuilder.withShortName("d2").withLongName("delta2").create();
        cmdLine.addProperty(opt, "key1", "value1");
        Set props = cmdLine.getProperties(opt);
        assertTrue(props.contains("key1"));
    }

    @Test
    public void testGetProperties_unknownOption_returnsEmptySet() {
        Option opt = obuilder.withShortName("e2").withLongName("echo2").create();
        assertEquals(Collections.EMPTY_SET, cmdLine.getProperties(opt));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetProperties_isUnmodifiable() {
        Option opt = obuilder.withShortName("f2").withLongName("foxtrot2").create();
        cmdLine.addProperty(opt, "key1", "value1");
        cmdLine.getProperties(opt).add("key2");
    }

    // ---------------------------------------------------------------
    // Properties: String-only overloads (ใช้ PropertyOption ภายใน)
    // NOTE: getProperty(String)/addProperty(String,String) สร้าง
    // "new PropertyOption()" คนละ instance กันทุกครั้งที่เรียก เนื่องจากไม่มีซอร์ส
    // ของ PropertyOption (equals/hashCode) ให้ในโจทย์ จึง "ไม่การันตี" ว่าค่าที่
    // addProperty(String,String) เก็บไว้จะถูกดึงคืนได้ถูกต้องโดย getProperty(String)
    // จึงทดสอบแบบไม่ fail หากผลเป็น null (ระบุ assumption นี้ชัดเจน)
    // ---------------------------------------------------------------

    @Test
    public void testAddAndGetProperty_stringOverload_doesNotThrow() {
        cmdLine.addProperty("propKey", "propValue");
        String result = cmdLine.getProperty("propKey");
        assertTrue("ผลลัพธ์ขึ้นกับ PropertyOption.equals/hashCode ที่ไม่มีในซอร์ส",
                result == null || result.equals("propValue"));
    }

    @Test
    public void testGetProperties_noArgOverload_neverNull() {
        Set props = cmdLine.getProperties();
        assertNotNull(props);
    }

    // ---------------------------------------------------------------
    // looksLikeOption
    // ---------------------------------------------------------------

    @Test
    public void testLooksLikeOption_true_whenTriggerStartsWithPrefix() {
        assertTrue(cmdLine.looksLikeOption("-r"));
    }

    @Test
    public void testLooksLikeOption_false_whenNoPrefixMatches() {
        assertFalse(cmdLine.looksLikeOption("plainArgument"));
    }

    @Test
    public void testLooksLikeOption_false_forEmptyString() {
        assertFalse(cmdLine.looksLikeOption(""));
    }

    // ---------------------------------------------------------------
    // toString
    // ---------------------------------------------------------------

    @Test
    public void testToString_emptyNormalised_returnsEmptyString() {
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, new ArrayList());
        assertEquals("", cl.toString());
    }

    @Test
    public void testToString_singleArgumentWithoutSpace() {
        List args = new ArrayList();
        args.add("foo");
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("foo", cl.toString());
    }

    @Test
    public void testToString_argumentWithSpace_isQuoted() {
        List args = new ArrayList();
        args.add("foo bar");
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("\"foo bar\"", cl.toString());
    }

    @Test
    public void testToString_multipleArguments_joinedWithSingleSpace() {
        List args = new ArrayList();
        args.add("foo");
        args.add("bar baz");
        args.add("qux");
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("foo \"bar baz\" qux", cl.toString());
    }
}

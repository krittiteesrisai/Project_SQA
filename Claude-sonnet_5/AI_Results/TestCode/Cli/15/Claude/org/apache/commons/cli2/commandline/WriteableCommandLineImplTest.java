package org.apache.commons.cli2.commandline;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl; // target class (same package, import เพื่อความชัดเจนตามข้อกำหนด)

public class WriteableCommandLineImplTest {

    private Option rootOption;
    private WriteableCommandLineImpl cli;

    @Before
    public void setUp() {
        // root option ใช้เป็นตัวให้ prefixes แก่ looksLikeOption()
        rootOption = new DefaultOptionBuilder()
                        .withShortName("r")
                        .withLongName("root")
                        .create();
        cli = new WriteableCommandLineImpl(rootOption, new ArrayList());
    }

    private Option newSimpleOption(String shortName, String longName) {
        return new DefaultOptionBuilder()
                    .withShortName(shortName)
                    .withLongName(longName)
                    .create();
    }

    private Argument newArgument(String name) {
        return new ArgumentBuilder().withName(name).create();
    }

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testConstructor_NullRootOption_ThrowsNPE() {
        // constructor เรียก rootOption.getPrefixes() ทันที -> ต้อง NPE ถ้า root เป็น null
        new WriteableCommandLineImpl(null, new ArrayList());
    }

    @Test
    public void testGetNormalised_ReturnsGivenList_AndIsUnmodifiable() {
        List args = Arrays.asList("a", "b");
        WriteableCommandLineImpl impl = new WriteableCommandLineImpl(rootOption, args);

        assertEquals(args, impl.getNormalised());

        try {
            impl.getNormalised().add("x");
            fail("ควร throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetNormalised_ReflectsExternalMutationOfSameListReference() {
        // source เก็บ reference ตรง ๆ (this.normalised = arguments;) ไม่ copy
        List args = new ArrayList();
        args.add("first");
        WriteableCommandLineImpl impl = new WriteableCommandLineImpl(rootOption, args);

        args.add("second"); // mutate list ต้นทางหลังสร้าง object แล้ว

        assertEquals(2, impl.getNormalised().size());
        assertTrue(impl.getNormalised().contains("second"));
    }

    // ---------------------------------------------------------------
    // addOption / hasOption / getOption / getOptions / getOptionTriggers
    // ---------------------------------------------------------------

    @Test
    public void testAddOption_RegistersPreferredNameAndTriggers_AndHasOptionTrue() {
        Option opt = newSimpleOption("v", "verbose");
        cli.addOption(opt);

        assertTrue(cli.hasOption(opt));

        // preferredName ต้อง map กลับมาที่ option เดิม
        assertSame(opt, cli.getOption(opt.getPreferredName()));

        // ทุก trigger ที่ option ประกาศไว้ ต้อง map กลับมาที่ option เดิมด้วย
        for (Iterator i = opt.getTriggers().iterator(); i.hasNext();) {
            Object trigger = i.next();
            assertSame(opt, cli.getOption((String) trigger));
        }

        assertTrue(cli.getOptions().contains(opt));
    }

    @Test
    public void testHasOption_FalseForNotAdded() {
        Option opt = newSimpleOption("z", "zzz");
        assertFalse(cli.hasOption(opt));
    }

    @Test
    public void testGetOption_ReturnsNullForUnknownTrigger() {
        assertNull(cli.getOption("does-not-exist"));
    }

    @Test
    public void testGetOptions_ReturnsUnmodifiableList_WithAddedOptions() {
        Option opt1 = newSimpleOption("a", "aaa");
        Option opt2 = newSimpleOption("b", "bbb");
        cli.addOption(opt1);
        cli.addOption(opt2);

        List result = cli.getOptions();
        assertEquals(2, result.size());
        assertTrue(result.contains(opt1));
        assertTrue(result.contains(opt2));

        try {
            result.add(opt1);
            fail("ควร throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetOptionTriggers_ReturnsUnmodifiableSet_WithAllTriggers() {
        Option opt = newSimpleOption("c", "ccc");
        cli.addOption(opt);

        Set triggers = cli.getOptionTriggers();
        assertTrue(triggers.contains(opt.getPreferredName()));

        try {
            triggers.add("newTrigger");
            fail("ควร throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // addValue / getValues / getUndefaultedValues
    // ---------------------------------------------------------------

    @Test
    public void testAddValue_NonArgumentOption_DoesNotAutoAddOption() {
        Option opt = newSimpleOption("n", "nonarg"); // ไม่ใช่ Argument
        cli.addValue(opt, "value1");

        // เนื่องจาก opt ไม่ใช่ instanceof Argument จึงไม่ถูกเรียก addOption อัตโนมัติ
        assertFalse(cli.hasOption(opt));

        List values = cli.getUndefaultedValues(opt);
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
    }

    @Test
    public void testAddValue_ArgumentOption_AutoAddsOption() {
        Argument arg = newArgument("arg1");
        cli.addValue(arg, "hello");

        // opt เป็น instanceof Argument -> ต้องถูก addOption อัตโนมัติ
        assertTrue(cli.hasOption(arg));
        assertTrue(cli.getOptions().contains(arg));
    }

    @Test
    public void testAddValue_MultipleValues_AccumulateInSameList() {
        Option opt = newSimpleOption("m", "multi");
        cli.addValue(opt, "v1");
        cli.addValue(opt, "v2");

        List values = cli.getUndefaultedValues(opt);
        assertEquals(2, values.size());
        assertEquals("v1", values.get(0));
        assertEquals("v2", values.get(1));
    }

    @Test
    public void testGetValues_ReturnsActualValues_IgnoringDefaultsParam() {
        Option opt = newSimpleOption("g", "getval");
        cli.addValue(opt, "real");

        List param = Arrays.asList("shouldNotBeUsed");
        List result = cli.getValues(opt, param);

        assertEquals(1, result.size());
        assertEquals("real", result.get(0));
    }

    @Test
    public void testGetValues_FallsBackToParamDefaults_WhenNoValues() {
        Option opt = newSimpleOption("d", "defval");
        List param = Arrays.asList("paramDefault");

        List result = cli.getValues(opt, param);
        assertEquals(param, result);
    }

    @Test
    public void testGetValues_FallsBackToOptionDefaultValues_WhenParamNullOrEmpty() {
        Option opt = newSimpleOption("e", "endef");
        List optionDefaults = Arrays.asList("optDefault");
        cli.setDefaultValues(opt, optionDefaults);

        // param = null
        List result1 = cli.getValues(opt, null);
        assertEquals(optionDefaults, result1);
    }

    @Test
    public void testGetValues_ParamEmptyList_FallsThroughToOptionDefaults() {
        // ทดสอบ branch สอง if ต่อกัน: param เป็น empty list (ไม่ null)
        // ต้องตกไปที่ defaultValues map ต่อ เพราะ empty ก็ถือว่า "isEmpty()"
        Option opt = newSimpleOption("f", "fdef");
        List optionDefaults = Arrays.asList("fromMap");
        cli.setDefaultValues(opt, optionDefaults);

        List result = cli.getValues(opt, Collections.EMPTY_LIST);
        assertEquals(optionDefaults, result);
    }

    @Test
    public void testGetValues_AllNull_ReturnsEmptyList() {
        Option opt = newSimpleOption("h", "hdef");
        List result = cli.getValues(opt, null);
        assertEquals(Collections.EMPTY_LIST, result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetUndefaultedValues_ReturnsRawValues_IgnoringDefaults() {
        Option opt = newSimpleOption("u", "undef");
        cli.setDefaultValues(opt, Arrays.asList("shouldNotAppear"));
        cli.addValue(opt, "actual");

        List result = cli.getUndefaultedValues(opt);
        assertEquals(1, result.size());
        assertEquals("actual", result.get(0));
    }

    @Test
    public void testGetUndefaultedValues_NoValues_ReturnsEmptyList() {
        Option opt = newSimpleOption("q", "qdef");
        cli.setDefaultValues(opt, Arrays.asList("mapDefaultIgnored"));

        // getUndefaultedValues ไม่สนใจ defaultValues map เลย ต้องได้ EMPTY_LIST
        List result = cli.getUndefaultedValues(opt);
        assertTrue(result.isEmpty());
    }

    // ---------------------------------------------------------------
    // addSwitch / getSwitch
    // ---------------------------------------------------------------

    @Test
    public void testAddSwitch_SetsValue_AndGetSwitchReturnsIt() {
        Option opt = newSimpleOption("s", "sw");
        cli.addSwitch(opt, true);

        assertTrue(cli.hasOption(opt)); // addSwitch เรียก addOption เสมอ
        assertEquals(Boolean.TRUE, cli.getSwitch(opt, Boolean.FALSE));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_DuplicateCall_ThrowsIllegalStateException() {
        Option opt = newSimpleOption("t", "dupsw");
        cli.addSwitch(opt, true);
        cli.addSwitch(opt, false); // ครั้งที่สอง -> ต้อง throw
    }

    @Test
    public void testGetSwitch_FallsBackToParamDefault() {
        Option opt = newSimpleOption("p", "pdef");
        Boolean result = cli.getSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetSwitch_FallsBackToOptionDefaultSwitch() {
        Option opt = newSimpleOption("o", "odef");
        cli.setDefaultSwitch(opt, Boolean.FALSE);

        Boolean result = cli.getSwitch(opt, null);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testGetSwitch_AllNull_ReturnsNull() {
        Option opt = newSimpleOption("x2", "x2def");
        Boolean result = cli.getSwitch(opt, null);
        assertNull(result);
    }

    // ---------------------------------------------------------------
    // addProperty / getProperty(Option,...) / getProperties(Option)
    // ---------------------------------------------------------------

    @Test
    public void testAddPropertyAndGetProperty_WithOption_KeyExists() {
        Option opt = newSimpleOption("k", "keyopt");
        cli.addProperty(opt, "key1", "value1");

        String result = cli.getProperty(opt, "key1", "default");
        assertEquals("value1", result);
    }

    @Test
    public void testGetProperty_WithOption_KeyMissing_ReturnsDefault() {
        Option opt = newSimpleOption("k2", "keyopt2");
        cli.addProperty(opt, "existingKey", "value");

        String result = cli.getProperty(opt, "missingKey", "defaultVal");
        assertEquals("defaultVal", result);
    }

    @Test
    public void testGetProperty_OptionNeverAdded_ReturnsDefaultDirectly() {
        Option opt = newSimpleOption("k3", "keyopt3");
        // ไม่เคย addProperty สำหรับ opt นี้เลย -> properties == null -> return defaultValue
        String result = cli.getProperty(opt, "anyKey", "fallback");
        assertEquals("fallback", result);
    }

    @Test
    public void testAddProperty_MultipleKeysSameOption_ReuseSamePropertiesObject() {
        Option opt = newSimpleOption("k4", "keyopt4");
        cli.addProperty(opt, "keyA", "valA");
        cli.addProperty(opt, "keyB", "valB"); // properties != null แล้ว -> ใช้ object เดิม

        assertEquals("valA", cli.getProperty(opt, "keyA", "d"));
        assertEquals("valB", cli.getProperty(opt, "keyB", "d"));
    }

    @Test
    public void testGetProperties_OptionWithNoProperties_ReturnsEmptySet() {
        Option opt = newSimpleOption("k5", "keyopt5");
        Set result = cli.getProperties(opt);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetProperties_OptionWithProperties_ReturnsUnmodifiableKeySet() {
        Option opt = newSimpleOption("k6", "keyopt6");
        cli.addProperty(opt, "onlyKey", "onlyVal");

        Set result = cli.getProperties(opt);
        assertTrue(result.contains("onlyKey"));

        try {
            result.add("newKey");
            fail("ควร throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAddPropertyAndGetProperty_NoOptionOverload() {
        // หมายเหตุ: ทั้ง addProperty(String,String) และ getProperty(String) สร้าง
        // "new PropertyOption()" คนละอินสแตนซ์กัน การที่ getProperty(String) จะหาค่าที่
        // addProperty(String,String) เก็บไว้เจอได้ ขึ้นกับว่า PropertyOption.equals()/hashCode()
        // ถูก override ให้ทุกอินสแตนซ์เท่ากันหรือไม่ (ไม่มีซอร์สของ PropertyOption ให้ตรวจสอบ)
        // จึงทดสอบตาม public behavior ที่คาดหวังจาก design เท่านั้น
        cli.addProperty("globalKey", "globalValue");
        String result = cli.getProperty("globalKey");
        assertEquals("globalValue", result);
    }

    // ---------------------------------------------------------------
    // looksLikeOption
    // ---------------------------------------------------------------

    @Test
    public void testLooksLikeOption_TrueWhenPrefixMatches() {
        Set prefixes = rootOption.getPrefixes();
        assertFalse("ต้องมี prefix อย่างน้อย 1 ตัวสำหรับทดสอบ", prefixes.isEmpty());

        String anyPrefix = (String) prefixes.iterator().next();
        String trigger = anyPrefix + "something";

        assertTrue(cli.looksLikeOption(trigger));
    }

    @Test
    public void testLooksLikeOption_FalseWhenNoPrefixMatches() {
        // ใช้ prefix สมมติที่ไม่ควรตรงกับค่า default ของ DefaultOptionBuilder ("-", "--")
        assertFalse(cli.looksLikeOption("###not_an_option"));
    }

    // ---------------------------------------------------------------
    // toString
    // ---------------------------------------------------------------

    @Test
    public void testToString_EmptyList_ReturnsEmptyString() {
        WriteableCommandLineImpl impl = new WriteableCommandLineImpl(rootOption, new ArrayList());
        assertEquals("", impl.toString());
    }

    @Test
    public void testToString_SingleElementNoSpace() {
        List args = Arrays.asList("value");
        WriteableCommandLineImpl impl = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("value", impl.toString());
    }

    @Test
    public void testToString_ElementsWithAndWithoutSpaces_JoinedCorrectly() {
        List args = Arrays.asList("noSpace", "has space", "last");
        WriteableCommandLineImpl impl = new WriteableCommandLineImpl(rootOption, args);

        String expected = "noSpace \"has space\" last";
        assertEquals(expected, impl.toString());
    }

    // ---------------------------------------------------------------
    // setDefaultValues / setDefaultSwitch
    // ---------------------------------------------------------------

    @Test
    public void testSetDefaultValues_AddAndRemove() {
        Option opt = newSimpleOption("dv", "defvalset");
        List defaults = Arrays.asList("d1", "d2");

        cli.setDefaultValues(opt, defaults);
        assertEquals(defaults, cli.getValues(opt, null));

        cli.setDefaultValues(opt, null); // remove branch
        assertTrue(cli.getValues(opt, null).isEmpty());
    }

    @Test
    public void testSetDefaultSwitch_AddAndRemove() {
        Option opt = newSimpleOption("ds", "defswset");

        cli.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cli.getSwitch(opt, null));

        cli.setDefaultSwitch(opt, null); // remove branch
        assertNull(cli.getSwitch(opt, null));
    }
}

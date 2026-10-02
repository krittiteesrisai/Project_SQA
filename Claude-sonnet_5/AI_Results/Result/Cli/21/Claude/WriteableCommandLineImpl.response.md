# WriteableCommandLineImplTest.java

> **หมายเหตุสำคัญเกี่ยวกับสมมติฐาน (ตามข้อกำหนดที่ 4):**
> - คลาสเป้าหมายรับพารามิเตอร์เป็น `Option`/`Argument` ซึ่งเป็น interface ในไลบรารี `commons-cli2` (ไลบรารีเจ้าของคลาสเป้าหมายเอง ซึ่งต้องอยู่ใน classpath อยู่แล้วเพื่อให้คลาสเป้าหมาย compile ได้) จึงใช้ `Builder` มาตรฐานของ commons-cli2 (`DefaultOptionBuilder`, `ArgumentBuilder`, `GroupBuilder`) เพื่อสร้าง instance ทดสอบ
> - สมมติฐานเรื่อง parent/child ของ `Group`/`Option` (เช่น `GroupBuilder.create()` จะ set parent ให้ child option โดยอัตโนมัติ) เป็นพฤติกรรมมาตรฐานของ commons-cli2 แต่ไม่ได้อยู่ใน source ที่ให้มาโดยตรง — จึงมีการ `assert` ตรวจสอบ (sanity check) ก่อนใช้งานจริงในแต่ละเทส
> - เมธอด `getProperty(String)` เรียก `getProperty(new PropertyOption(), property)` ซึ่งเป็น overload 2 อาร์กิวเมนต์ที่ไม่ปรากฏใน source ของคลาสนี้ (คาดว่า inherited จาก superclass `CommandLineImpl` ที่ไม่ได้แสดงมา) — เทสในส่วนนี้จึงเป็นเพียง smoke test ไม่ assert ค่าอย่างเคร่งครัด
> - `looksLikeOption(null)` และค่า prefix เฉพาะ ดึงมาจาก `rootOption.getPrefixes()` จริง ๆ (ไม่ hardcode ค่า `"-"`/`"--"`) เพื่อไม่เดา behavior ของ default prefix

```java
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
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.GroupBuilder;

import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private Option rootOption;
    private WriteableCommandLineImpl cmdLine;

    @Before
    public void setUp() {
        // rootOption ใช้เพื่อดึง prefixes เท่านั้น (ตาม constructor ของ class เป้าหมาย)
        rootOption = new DefaultOptionBuilder().withShortName("r").create();
        cmdLine = new WriteableCommandLineImpl(rootOption, new ArrayList());
    }

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testConstructor_NullRootOption_ThrowsNPE() {
        new WriteableCommandLineImpl(null, new ArrayList());
    }

    @Test
    public void testGetNormalised_ReturnsProvidedArgumentsAndIsUnmodifiable() {
        List args = new ArrayList();
        args.add("foo");
        args.add("bar baz");
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);

        List normalised = cl.getNormalised();
        assertEquals(args, normalised);

        try {
            normalised.add("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    @Test(expected = NullPointerException.class)
    public void testGetNormalised_WhenConstructedWithNullArguments_ThrowsNPE() {
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, null);
        cl.getNormalised();
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_EmptyList() {
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, new ArrayList());
        assertEquals("", cl.toString());
    }

    @Test
    public void testToString_SingleArgumentWithoutSpace() {
        List args = new ArrayList();
        args.add("foo");
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("foo", cl.toString());
    }

    @Test
    public void testToString_SingleArgumentWithSpace() {
        List args = new ArrayList();
        args.add("foo bar");
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("\"foo bar\"", cl.toString());
    }

    @Test
    public void testToString_MultipleArgumentsMixed() {
        List args = new ArrayList();
        args.add("foo");
        args.add("bar baz");
        args.add("qux");
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);
        assertEquals("foo \"bar baz\" qux", cl.toString());
    }

    // ---------------------------------------------------------------
    // looksLikeOption()
    // ---------------------------------------------------------------

    @Test
    public void testLooksLikeOption_TrueWhenStartsWithPrefix() {
        String prefix = (String) rootOption.getPrefixes().iterator().next();
        assertTrue(cmdLine.looksLikeOption(prefix + "something"));
    }

    @Test
    public void testLooksLikeOption_FalseWhenNoPrefixMatches() {
        // สมมติฐาน: default prefix ของ commons-cli2 ไม่ใช่ "" และไม่ match กับ string นี้
        assertFalse(cmdLine.looksLikeOption("zzz_definitely_not_prefixed"));
    }

    @Test
    public void testLooksLikeOption_EmptyStringTrigger_ReturnsFalse() {
        assertFalse(cmdLine.looksLikeOption(""));
    }

    @Test(expected = NullPointerException.class)
    public void testLooksLikeOption_NullTrigger_ThrowsNPE() {
        // ต้องมี prefix อย่างน้อย 1 ตัว (rootOption default) เพื่อให้ loop เข้าถึง trigger.startsWith()
        cmdLine.looksLikeOption(null);
    }

    // ---------------------------------------------------------------
    // addOption() / hasOption() / getOption() / getOptions() / getOptionTriggers()
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testAddOption_NullOption_ThrowsNPE() {
        cmdLine.addOption(null);
    }

    @Test
    public void testAddOption_AddsOptionAndAllTriggers() {
        Option opt = new DefaultOptionBuilder().withShortName("a").withLongName("aaa").create();
        cmdLine.addOption(opt);

        assertTrue(cmdLine.hasOption(opt));

        Iterator it = opt.getTriggers().iterator();
        int count = 0;
        while (it.hasNext()) {
            String trigger = (String) it.next();
            assertSame(opt, cmdLine.getOption(trigger));
            count++;
        }
        assertTrue(count >= 2); // loop ต้องวิ่งมากกว่า 1 รอบ (short+long name)
    }

    @Test
    public void testAddOption_NoParent_ParentLoopSkipped() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addOption(opt);
        // opt ไม่มี parent (ไม่ถูกใส่ใน Group ใด ๆ) -> while loop ไม่ execute
        assertEquals(1, cmdLine.getOptions().size());
    }

    @Test
    public void testAddOption_AddsParentChainRecursively() {
        Option leaf = new DefaultOptionBuilder().withShortName("a").create();
        Group childGroup = new GroupBuilder().withName("child").withOption(leaf).create();
        Option child2 = new DefaultOptionBuilder().withShortName("b").create();
        Group rootGroup = new GroupBuilder().withName("root")
                .withOption(childGroup).withOption(child2).create();

        // sanity check สมมติฐาน parent-child ของ commons-cli2
        assertSame(childGroup, leaf.getParent());
        assertSame(rootGroup, childGroup.getParent());
        assertNull(rootGroup.getParent());

        cmdLine.addOption(leaf);

        assertTrue(cmdLine.hasOption(leaf));
        assertTrue(cmdLine.hasOption(childGroup));
        assertTrue(cmdLine.hasOption(rootGroup));
    }

    @Test
    public void testAddOption_StopsWhenParentAlreadyPresent() {
        Option leaf = new DefaultOptionBuilder().withShortName("a").create();
        Group childGroup = new GroupBuilder().withName("child").withOption(leaf).create();
        Group rootGroup = new GroupBuilder().withName("root").withOption(childGroup).create();

        cmdLine.addOption(rootGroup);
        assertTrue(cmdLine.hasOption(rootGroup));
        assertFalse(cmdLine.hasOption(childGroup));

        // เพิ่ม leaf: loop ควรเพิ่ม childGroup แล้วหยุดเพราะ rootGroup มีอยู่แล้ว
        cmdLine.addOption(leaf);

        assertTrue(cmdLine.hasOption(leaf));
        assertTrue(cmdLine.hasOption(childGroup));
        assertTrue(cmdLine.hasOption(rootGroup));
    }

    @Test
    public void testAddOption_CalledTwiceForSameOption_AddsDuplicateTopLevelEntry() {
        // options.add(option) ไม่มีการเช็ค contains() สำหรับตัว option เอง (ต่างจาก parent loop)
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addOption(opt);
        cmdLine.addOption(opt);

        int count = 0;
        Iterator it = cmdLine.getOptions().iterator();
        while (it.hasNext()) {
            if (it.next() == opt) {
                count++;
            }
        }
        assertEquals(2, count);
    }

    @Test
    public void testHasOption_FalseForUnknownOption() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        assertFalse(cmdLine.hasOption(opt));
    }

    @Test
    public void testHasOption_NullOption_ReturnsFalse() {
        assertFalse(cmdLine.hasOption(null));
    }

    @Test
    public void testGetOption_ReturnsNullForUnknownTrigger() {
        assertNull(cmdLine.getOption("unknown-trigger-xyz"));
    }

    @Test
    public void testGetOption_NullTrigger_ReturnsNull() {
        assertNull(cmdLine.getOption(null));
    }

    @Test
    public void testGetOptions_ReturnsAddedOptionsAndIsUnmodifiable() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addOption(opt);
        List opts = cmdLine.getOptions();
        assertTrue(opts.contains(opt));
        try {
            opts.add(rootOption);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    @Test
    public void testGetOptionTriggers_ReturnsTriggersAndIsUnmodifiable() {
        Option opt = new DefaultOptionBuilder().withShortName("c").withLongName("cccc").create();
        cmdLine.addOption(opt);
        Set triggers = cmdLine.getOptionTriggers();
        assertTrue(triggers.contains("c"));
        assertTrue(triggers.contains("cccc"));
        try {
            triggers.add("zz");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    // ---------------------------------------------------------------
    // addValue() / getUndefaultedValues() / getValues()
    // ---------------------------------------------------------------

    @Test
    public void testAddValue_ArgumentInstance_AutoAddsOption() {
        Argument arg = new ArgumentBuilder().withName("arg1").create();
        assertFalse(cmdLine.hasOption(arg));
        cmdLine.addValue(arg, "value1");
        assertTrue(cmdLine.hasOption(arg)); // instanceof Argument -> addOption ถูกเรียกภายใน
        assertEquals(Arrays.asList(new Object[] { "value1" }), cmdLine.getUndefaultedValues(arg));
    }

    @Test
    public void testAddValue_NonArgumentOption_DoesNotAutoAddOption() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addValue(opt, "value1");
        assertFalse(cmdLine.hasOption(opt)); // instanceof Argument == false
        assertEquals(Arrays.asList(new Object[] { "value1" }), cmdLine.getUndefaultedValues(opt));
    }

    @Test
    public void testAddValue_MultipleValues_AppendsToExistingList() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addValue(opt, "v1");
        cmdLine.addValue(opt, "v2");
        List expected = new ArrayList();
        expected.add("v1");
        expected.add("v2");
        assertEquals(expected, cmdLine.getUndefaultedValues(opt));
    }

    @Test
    public void testAddValue_NullOption_DoesNotThrow_StoresUnderNullKey() {
        cmdLine.addValue(null, "x");
        assertEquals(Arrays.asList(new Object[] { "x" }), cmdLine.getUndefaultedValues(null));
    }

    @Test
    public void testGetUndefaultedValues_NoValues_ReturnsEmptyList() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        List result = cmdLine.getUndefaultedValues(opt);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetUndefaultedValues_IgnoresDefaultValues() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addValue(opt, "v1");
        cmdLine.setDefaultValues(opt, Arrays.asList(new Object[] { "d1", "d2" }));

        assertEquals(Arrays.asList(new Object[] { "v1" }), cmdLine.getUndefaultedValues(opt));
    }

    @Test
    public void testGetValues_NoStoredValues_NoDefaults_ReturnsEmptyList() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        List result = cmdLine.getValues(opt, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetValues_NullDefaultParam_FallsBackToOptionDefaults() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        List optionDefaults = new ArrayList();
        optionDefaults.add("d1");
        cmdLine.setDefaultValues(opt, optionDefaults);

        assertEquals(optionDefaults, cmdLine.getValues(opt, null));
    }

    @Test
    public void testGetValues_EmptyDefaultParam_FallsBackToOptionDefaults() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        List optionDefaults = new ArrayList();
        optionDefaults.add("d1");
        cmdLine.setDefaultValues(opt, optionDefaults);

        assertEquals(optionDefaults, cmdLine.getValues(opt, new ArrayList()));
    }

    @Test
    public void testGetValues_NoStoredValue_UsesProvidedDefaultsDirectly() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        List providedDefaults = new ArrayList();
        providedDefaults.add("pd1");
        providedDefaults.add("pd2");

        assertEquals(providedDefaults, cmdLine.getValues(opt, providedDefaults));
    }

    @Test
    public void testGetValues_StoredValueSmallerThanDefaults_CopiesAndExtends() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addValue(opt, "v1"); // size = 1

        List providedDefaults = new ArrayList();
        providedDefaults.add("d1");
        providedDefaults.add("d2");
        providedDefaults.add("d3"); // size 3 > 1

        List expected = new ArrayList();
        expected.add("v1");
        expected.add("d2");
        expected.add("d3");

        assertEquals(expected, cmdLine.getValues(opt, providedDefaults));
    }

    @Test
    public void testGetValues_StoredValueSizeEqualsDefaultsSize_ReturnsStoredValuesUnchanged() {
        // boundary: defaultValues.size() > valueList.size() ต้องเป็น false ตอน size เท่ากัน
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addValue(opt, "v1");

        List providedDefaults = new ArrayList();
        providedDefaults.add("d1"); // size 1 == 1

        assertEquals(Arrays.asList(new Object[] { "v1" }), cmdLine.getValues(opt, providedDefaults));
    }

    @Test
    public void testGetValues_StoredValueSizeGreaterThanDefaults_ReturnsStoredValuesUnchanged() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addValue(opt, "v1");
        cmdLine.addValue(opt, "v2");

        List providedDefaults = new ArrayList();
        providedDefaults.add("d1"); // size 1 <= 2

        List expected = new ArrayList();
        expected.add("v1");
        expected.add("v2");

        assertEquals(expected, cmdLine.getValues(opt, providedDefaults));
    }

    // ---------------------------------------------------------------
    // addSwitch() / getSwitch() / setDefaultSwitch()
    // ---------------------------------------------------------------

    @Test
    public void testAddSwitch_SetsSwitchValue() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addSwitch(opt, true);
        assertTrue(cmdLine.hasOption(opt));
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_CalledTwice_ThrowsIllegalStateException() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addSwitch(opt, true);
        cmdLine.addSwitch(opt, false);
    }

    @Test(expected = NullPointerException.class)
    public void testAddSwitch_NullOption_ThrowsNPE() {
        cmdLine.addSwitch(null, true);
    }

    @Test
    public void testGetSwitch_FromCommandLineValue() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addSwitch(opt, true);
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, Boolean.FALSE));
    }

    @Test
    public void testGetSwitch_FromMethodDefaultWhenNoCommandLineValue() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, Boolean.TRUE));
    }

    @Test
    public void testGetSwitch_FromOptionDefaultWhenNoCommandLineOrMethodDefault() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, null));
    }

    @Test
    public void testGetSwitch_AllSourcesAbsent_ReturnsNull() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        assertNull(cmdLine.getSwitch(opt, null));
    }

    @Test
    public void testSetDefaultSwitch_NullRemovesExistingDefault() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, cmdLine.getSwitch(opt, null));

        cmdLine.setDefaultSwitch(opt, null);
        assertNull(cmdLine.getSwitch(opt, null));
    }

    // ---------------------------------------------------------------
    // setDefaultValues()
    // ---------------------------------------------------------------

    @Test
    public void testSetDefaultValues_NullRemovesExistingDefault() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        List defaults = new ArrayList();
        defaults.add("d1");
        cmdLine.setDefaultValues(opt, defaults);
        assertEquals(defaults, cmdLine.getValues(opt, null));

        cmdLine.setDefaultValues(opt, null);
        assertTrue(cmdLine.getValues(opt, null).isEmpty());
    }

    // ---------------------------------------------------------------
    // addProperty()/getProperty()/getProperties() (Option-based overloads)
    // ---------------------------------------------------------------

    @Test
    public void testAddAndGetProperty_WithOption() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addProperty(opt, "key1", "value1");
        assertEquals("value1", cmdLine.getProperty(opt, "key1", "default"));
    }

    @Test
    public void testGetProperty_UnknownOption_ReturnsDefault() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        assertEquals("default", cmdLine.getProperty(opt, "key1", "default"));
    }

    @Test
    public void testGetProperty_KnownOptionUnknownKey_ReturnsDefault() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addProperty(opt, "key1", "value1");
        assertEquals("default", cmdLine.getProperty(opt, "unknownKey", "default"));
    }

    @Test
    public void testAddProperty_SameKeyTwice_OverwritesValue() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addProperty(opt, "key1", "value1");
        cmdLine.addProperty(opt, "key1", "value2");
        assertEquals("value2", cmdLine.getProperty(opt, "key1", "default"));
    }

    @Test(expected = NullPointerException.class)
    public void testAddProperty_NullPropertyKey_ThrowsNPE() {
        // java.util.Properties (Hashtable) ไม่รับ null key
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addProperty(opt, null, "value1");
    }

    @Test(expected = NullPointerException.class)
    public void testGetProperty_NullPropertyKey_WhenPropertiesExist_ThrowsNPE() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addProperty(opt, "key1", "value1");
        cmdLine.getProperty(opt, null, "default");
    }

    @Test
    public void testGetProperties_UnknownOption_ReturnsEmptySet() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        assertTrue(cmdLine.getProperties(opt).isEmpty());
    }

    @Test
    public void testGetProperties_KnownOption_ReturnsKeySetAndIsUnmodifiable() {
        Option opt = new DefaultOptionBuilder().withShortName("a").create();
        cmdLine.addProperty(opt, "key1", "value1");
        cmdLine.addProperty(opt, "key2", "value2");

        Set props = cmdLine.getProperties(opt);
        assertTrue(props.contains("key1"));
        assertTrue(props.contains("key2"));
        assertEquals(2, props.size());
        try {
            props.add("key3");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    // ---------------------------------------------------------------
    // getProperty(String)/addProperty(String,String)/getProperties() (1-arg overloads)
    // หมายเหตุ: การ routing ภายในพึ่งพา method/พฤติกรรมที่ไม่ปรากฏใน source ที่ให้มา
    // (ดูคอมเมนต์ด้านบนของไฟล์) จึงเป็น smoke test เท่านั้น
    // ---------------------------------------------------------------

    @Test
    public void testAddAndGetProperty_SingleArgOverloads_SmokeTest() {
        cmdLine.addProperty("gkey", "gvalue");
        String result = cmdLine.getProperty("gkey");
        // ไม่ assert ค่าที่แน่นอน เนื่องจากไม่แน่ใจกลไก equals/matching ของ PropertyOption
        assertTrue(result == null || result.equals("gvalue"));
    }

    @Test
    public void testGetProperties_NoArgOverload_SmokeTest() {
        Set props = cmdLine.getProperties();
        assertNotNull(props);
    }
}
```

## ตารางสรุป Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor_NullRootOption_ThrowsNPE | Constructor: NPE จาก rootOption null |
| testGetNormalised_ReturnsProvidedArgumentsAndIsUnmodifiable | getNormalised() ปกติ + immutability |
| testGetNormalised_WhenConstructedWithNullArguments_ThrowsNPE | Constructor: arguments null → NPE ตอนใช้งาน |
| testToString_EmptyList | toString(): loop ไม่ execute (list ว่าง) |
| testToString_SingleArgumentWithoutSpace | toString(): if (indexOf(' ')>=0) = false, hasNext() = false |
| testToString_SingleArgumentWithSpace | toString(): if (indexOf(' ')>=0) = true |
| testToString_MultipleArgumentsMixed | toString(): ทั้ง 2 branch ของ if + hasNext() true/false |
| testLooksLikeOption_TrueWhenStartsWithPrefix | looksLikeOption(): return true ใน loop |
| testLooksLikeOption_FalseWhenNoPrefixMatches | looksLikeOption(): loop จบโดยไม่ match → false |
| testLooksLikeOption_EmptyStringTrigger_ReturnsFalse | looksLikeOption(): boundary ค่าว่าง |
| testLooksLikeOption_NullTrigger_ThrowsNPE | looksLikeOption(): null input |
| testAddOption_NullOption_ThrowsNPE | addOption(): null input |
| testAddOption_AddsOptionAndAllTriggers | addOption(): trigger loop หลายรอบ |
| testAddOption_NoParent_ParentLoopSkipped | addOption(): while (parent==null) → skip |
| testAddOption_AddsParentChainRecursively | addOption(): while loop วิ่งหลายรอบจน parent==null |
| testAddOption_StopsWhenParentAlreadyPresent | addOption(): while loop หยุดเพราะ contains(parent)==true |
| testAddOption_CalledTwiceForSameOption_AddsDuplicateTopLevelEntry | addOption(): ไม่มี dedup ระดับ top-level |
| testHasOption_FalseForUnknownOption / NullOption | hasOption(): true/false branch |
| testGetOption_ReturnsNullForUnknownTrigger / NullTrigger | getOption(): not found / null |
| testGetOptions_ReturnsAddedOptionsAndIsUnmodifiable | getOptions() + immutability |
| testGetOptionTriggers_ReturnsTriggersAndIsUnmodifiable | getOptionTriggers() + immutability |
| testAddValue_ArgumentInstance_AutoAddsOption | addValue(): instanceof Argument == true |
| testAddValue_NonArgumentOption_DoesNotAutoAddOption | addValue(): instanceof Argument == false |
| testAddValue_MultipleValues_AppendsToExistingList | addValue(): valueList != null branch |
| testAddValue_NullOption_DoesNotThrow_StoresUnderNullKey | addValue(): null-safety edge case |
| testGetUndefaultedValues_* | getUndefaultedValues(): null/non-null branch |
| testGetValues_NoStoredValues_NoDefaults_ReturnsEmptyList | getValues(): ทุกเงื่อนไข false → EMPTY_LIST |
| testGetValues_NullDefaultParam_FallsBackToOptionDefaults | getValues(): defaultValues==null branch |
| testGetValues_EmptyDefaultParam_FallsBackToOptionDefaults | getValues(): defaultValues.isEmpty() branch |
| testGetValues_NoStoredValue_UsesProvidedDefaultsDirectly | getValues(): valueList==null → ใช้ defaults ตรง |
| testGetValues_StoredValueSmallerThanDefaults_CopiesAndExtends | getValues(): defaultValues.size()>valueList.size() true |
| testGetValues_StoredValueSizeEqualsDefaultsSize_* | getValues(): boundary size เท่ากัน (false) |
| testGetValues_StoredValueSizeGreaterThanDefaults_* | getValues(): defaultValues.size()>valueList.size() false |
| testAddSwitch_SetsSwitchValue | addSwitch(): ปกติ, containsKey==false |
| testAddSwitch_CalledTwice_ThrowsIllegalStateException | addSwitch(): containsKey==true → exception |
| testAddSwitch_NullOption_ThrowsNPE | addSwitch(): null input |
| testGetSwitch_FromCommandLineValue | getSwitch(): bool!=null (จาก switches) |
| testGetSwitch_FromMethodDefaultWhenNoCommandLineValue | getSwitch(): bool==null, defaultValue!=null |
| testGetSwitch_FromOptionDefaultWhenNoCommandLineOrMethodDefault | getSwitch(): ตกไปถึง defaultSwitches |
| testGetSwitch_AllSourcesAbsent_ReturnsNull | getSwitch(): ทุกแหล่งเป็น null |
| testSetDefaultSwitch_NullRemovesExistingDefault | setDefaultSwitch(): null branch (remove) |
| testSetDefaultValues_NullRemovesExistingDefault | setDefaultValues(): null branch (remove) |
| testAddAndGetProperty_WithOption / UnknownOption / UnknownKey / SameKeyTwice | addProperty/getProperty(Option,...): properties==null/!=null, key found/not found |
| testAddProperty_NullPropertyKey_ThrowsNPE / testGetProperty_NullPropertyKey_* | edge case null key (Properties/Hashtable) |
| testGetProperties_UnknownOption_ReturnsEmptySet / KnownOption_* | getProperties(Option): properties==null/!=null + immutability |
| testAddAndGetProperty_SingleArgOverloads_SmokeTest / testGetProperties_NoArgOverload_SmokeTest | 1-arg overload (smoke test เนื่องจากพึ่ง superclass ที่ไม่มีใน source) |
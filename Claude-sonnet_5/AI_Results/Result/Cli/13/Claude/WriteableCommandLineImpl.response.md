# หมายเหตุสำคัญก่อนเริ่ม (ตามข้อกำหนดที่ 4)

Source code ที่ให้มามีเฉพาะ `WriteableCommandLineImpl` แต่คลาสนี้ต้องพึ่งพา `Option`, `Argument`, `Group` และ builder classes (`DefaultOptionBuilder`, `ArgumentBuilder`, `GroupBuilder`) ซึ่งเป็นส่วนหนึ่งของ source tree เดียวกัน (Defects4J Cli-13b) แต่ **ไม่ได้ถูกแนบ interface/implementation มาให้ในโจทย์**

ผมเลือกใช้ concrete builder classes จริงของโปรเจกต์ (ซึ่งถูก compile รวมอยู่ใน classpath เดียวกันกับคลาสเป้าหมายอยู่แล้ว) เพื่อสร้าง `Option`/`Argument`/`Group` object จริง แทนการเดา method ของ interface เอง — **แต่ API การใช้งาน builder (เช่น `withShortName`, `withLongName`, `withOption`) เป็นการอ้างอิงจาก public API ที่เผยแพร่ของ Apache Commons CLI2 ซึ่งไม่ได้อยู่ใน source ที่ให้มา จึงกำกับคอมเมนต์ `// ASSUMPTION` ไว้ทุกจุดที่ใช้**

จุดที่ **ไม่สามารถ cover ได้จริงผ่าน public API** (เช่น branch `valueList.isEmpty()` ตัวแรกใน `getValues` ที่มาจาก `values` map — เพราะ `addValue` จะ insert ค่าเข้า list ทันทีหลังสร้าง list ใหม่เสมอ ทำให้ list ไม่มีทางเป็น empty ได้ผ่าน public API) จะกำกับคอมเมนต์ `// UNREACHABLE via public API` ไว้ ไม่ได้เขียนเทสเดาพฤติกรรม

```java
package org.apache.commons.cli2.commandline;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
// ASSUMPTION: builder classes ต่อไปนี้เป็น public API มาตรฐานของ Apache Commons CLI2
// ที่อยู่ใน source tree เดียวกันกับ WriteableCommandLineImpl (ไม่ได้แนบมาในโจทย์)
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
import org.apache.commons.cli2.builder.GroupBuilder;

public class WriteableCommandLineImplTest {

    private Option helpOption;      // DefaultOption ไม่ใช่ Argument
    private Option verboseOption;   // DefaultOption ไม่ใช่ Argument
    private Argument nameArgument;  // Argument (extends Option)
    private Group rootGroup;
    private List normalisedArgs;
    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        // ASSUMPTION: DefaultOptionBuilder ค่า default prefix คือ "-", "--"
        helpOption = new DefaultOptionBuilder()
                .withShortName("h")
                .withLongName("help")
                .withDescription("help option")
                .create();

        verboseOption = new DefaultOptionBuilder()
                .withShortName("v")
                .withLongName("verbose")
                .withDescription("verbose option")
                .create();

        nameArgument = new ArgumentBuilder()
                .withName("name")
                .create();

        rootGroup = new GroupBuilder()
                .withOption(helpOption)
                .withOption(verboseOption)
                .withOption(nameArgument)
                .create();

        normalisedArgs = new ArrayList();
        normalisedArgs.add("--help");

        commandLine = new WriteableCommandLineImpl(rootGroup, normalisedArgs);
    }

    /** สร้าง Option เดี่ยว ๆ ที่ไม่ได้อยู่ใน rootGroup สำหรับเทสกรณี "ไม่มีข้อมูลใด ๆ" */
    private Option freshOption(String s, String l) {
        return new DefaultOptionBuilder().withShortName(s).withLongName(l).create();
    }

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullRootOption_throwsNPE() {
        // rootOption.getPrefixes() ถูกเรียกทันทีใน constructor -> NPE ตามซอร์สจริง
        new WriteableCommandLineImpl(null, new ArrayList());
    }

    @Test
    public void testGetNormalised_returnsSameContentAndIsUnmodifiable() {
        List result = commandLine.getNormalised();
        assertEquals(normalisedArgs, result);
        try {
            result.add("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // addOption / hasOption / getOption / getOptions / getOptionTriggers
    // ---------------------------------------------------------------

    @Test
    public void testAddOption_addsToOptionsAndNameMap() {
        commandLine.addOption(helpOption);
        assertTrue(commandLine.hasOption(helpOption));
        assertTrue(commandLine.getOptions().contains(helpOption));
        assertSame(helpOption, commandLine.getOption(helpOption.getPreferredName()));
    }

    @Test
    public void testAddOption_allTriggersMapToOption() {
        commandLine.addOption(helpOption);
        Set triggers = helpOption.getTriggers();
        for (Object t : triggers) {
            assertSame(helpOption, commandLine.getOption((String) t));
        }
    }

    @Test
    public void testAddOption_withNoTriggers_loopExecutesZeroTimes() {
        // nameArgument (Argument) มักไม่มี trigger -> for-loop วนศูนย์รอบ
        commandLine.addOption(nameArgument);
        assertTrue(commandLine.hasOption(nameArgument));
    }

    @Test
    public void testHasOption_falseWhenNeverAdded() {
        assertFalse(commandLine.hasOption(verboseOption));
    }

    @Test
    public void testGetOption_unknownTrigger_returnsNull() {
        assertNull(commandLine.getOption("--not-registered"));
    }

    @Test
    public void testGetOptions_isUnmodifiable() {
        commandLine.addOption(helpOption);
        List opts = commandLine.getOptions();
        try {
            opts.add(verboseOption);
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetOptionTriggers_isUnmodifiable() {
        commandLine.addOption(helpOption);
        Set triggers = commandLine.getOptionTriggers();
        try {
            triggers.add("x");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // addValue -> branch: option instanceof Argument (true/false)
    //                     valueList == null (create new / reuse)
    // ---------------------------------------------------------------

    @Test
    public void testAddValue_nonArgumentOption_doesNotAutoAddOption() {
        // false-branch ของ (option instanceof Argument)
        commandLine.addValue(verboseOption, "v1");
        assertFalse(commandLine.hasOption(verboseOption));
        assertEquals(1, commandLine.getValues(verboseOption, null).size());
    }

    @Test
    public void testAddValue_argumentOption_autoAddsOption() {
        // true-branch ของ (option instanceof Argument)
        commandLine.addValue(nameArgument, "foo");
        assertTrue(commandLine.hasOption(nameArgument));
    }

    @Test
    public void testAddValue_secondCallReusesExistingList() {
        commandLine.addValue(verboseOption, "v1"); // valueList == null -> create
        commandLine.addValue(verboseOption, "v2"); // valueList != null -> reuse
        List values = commandLine.getValues(verboseOption, null);
        assertEquals(2, values.size());
        assertEquals("v1", values.get(0));
        assertEquals("v2", values.get(1));
    }

    // ---------------------------------------------------------------
    // addSwitch -> branch: switches.containsKey (true throw / false ok)
    //              ternary value ? TRUE : FALSE
    // ---------------------------------------------------------------

    @Test
    public void testAddSwitch_trueValue_setsBooleanTrueAndAddsOption() {
        commandLine.addSwitch(helpOption, true);
        assertTrue(commandLine.hasOption(helpOption));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(helpOption, null));
    }

    @Test
    public void testAddSwitch_falseValue_setsBooleanFalse() {
        commandLine.addSwitch(verboseOption, false);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(verboseOption, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_duplicateOption_throwsIllegalStateException() {
        commandLine.addSwitch(helpOption, true);
        commandLine.addSwitch(helpOption, false); // switches.containsKey == true -> throw
    }

    // ---------------------------------------------------------------
    // getValues : 4 ระดับของ fallback
    // ---------------------------------------------------------------

    @Test
    public void testGetValues_branch1_usesCommandLineValues_ignoringOthers() {
        commandLine.addValue(verboseOption, "cliValue");
        List methodDefault = new ArrayList();
        methodDefault.add("methodDefault");
        List result = commandLine.getValues(verboseOption, methodDefault);
        assertEquals(1, result.size());
        assertEquals("cliValue", result.get(0));
    }

    @Test
    public void testGetValues_branch2_usesMethodDefault_whenNoCommandLineValue() {
        Option opt = freshOption("f1", "fresh1");
        List methodDefault = new ArrayList();
        methodDefault.add("methodDefault");
        List result = commandLine.getValues(opt, methodDefault);
        assertSame(methodDefault, result);
    }

    @Test
    public void testGetValues_branch2_methodDefaultParamEmpty_fallsThroughToOptionDefault() {
        // ทำให้ (valueList == null || valueList.isEmpty()) ของเงื่อนไขที่สอง เป็น true
        // ผ่านทาง isEmpty() (methodDefault ไม่ null แต่ว่าง)
        Option opt = freshOption("f2", "fresh2");
        List optionDefault = new ArrayList();
        optionDefault.add("optionDefault");
        commandLine.setDefaultValues(opt, optionDefault);

        List emptyMethodDefault = new ArrayList(); // ไม่ null แต่ isEmpty() == true
        List result = commandLine.getValues(opt, emptyMethodDefault);
        assertSame(optionDefault, result);
    }

    @Test
    public void testGetValues_branch3_usesOptionDefault_whenNoCommandLineAndNoMethodDefault() {
        Option opt = freshOption("f3", "fresh3");
        List optionDefault = new ArrayList();
        optionDefault.add("optionDefault");
        commandLine.setDefaultValues(opt, optionDefault);

        List result = commandLine.getValues(opt, null);
        assertSame(optionDefault, result);
    }

    @Test
    public void testGetValues_branch3_optionDefaultEmptyList_falseBranchOfFinalNullCheck() {
        // this.defaultValues.get(option) คืน list ที่ไม่ null (แต่ว่าง)
        // -> final "if (valueList == null)" เป็น false -> ไม่ถูกแทนที่ด้วย EMPTY_LIST
        Option opt = freshOption("f4", "fresh4");
        List emptyOptionDefault = new ArrayList();
        commandLine.setDefaultValues(opt, emptyOptionDefault);

        List result = commandLine.getValues(opt, null);
        assertSame(emptyOptionDefault, result);
    }

    @Test
    public void testGetValues_branch4_emptyListWhenNothingSet() {
        Option opt = freshOption("f5", "fresh5");
        List result = commandLine.getValues(opt, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // NOTE: branch แรกของเงื่อนไขแรก "valueList.isEmpty()" (จาก values map)
    // ไม่สามารถเขียนเทสให้ true ได้ผ่าน public API เพราะ addValue()
    // จะ insert element เข้า list ทันทีหลังสร้าง list ใหม่เสมอ
    // -> UNREACHABLE via public API, จึงไม่เขียนเทสเดา behavior

    // ---------------------------------------------------------------
    // getSwitch : 4 ระดับของ fallback
    // ---------------------------------------------------------------

    @Test
    public void testGetSwitch_branch1_usesSwitchesMap() {
        commandLine.addSwitch(helpOption, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(helpOption, Boolean.FALSE));
    }

    @Test
    public void testGetSwitch_branch2_usesMethodDefault() {
        Option opt = freshOption("g1", "gresh1");
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.TRUE));
    }

    @Test
    public void testGetSwitch_branch3_usesOptionDefaultSwitch() {
        Option opt = freshOption("g2", "gresh2");
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, null));
    }

    @Test
    public void testGetSwitch_branch4_nullWhenNothingSet() {
        Option opt = freshOption("g3", "gresh3");
        assertNull(commandLine.getSwitch(opt, null));
    }

    // ---------------------------------------------------------------
    // setDefaultValues / setDefaultSwitch : null -> remove, non-null -> put
    // ---------------------------------------------------------------

    @Test
    public void testSetDefaultValues_null_removesEntry() {
        Option opt = freshOption("h1", "hresh1");
        List defaults = new ArrayList();
        defaults.add("x");
        commandLine.setDefaultValues(opt, defaults);
        commandLine.setDefaultValues(opt, null); // remove branch
        assertTrue(commandLine.getValues(opt, null).isEmpty());
    }

    @Test
    public void testSetDefaultSwitch_null_removesEntry() {
        Option opt = freshOption("h2", "hresh2");
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        commandLine.setDefaultSwitch(opt, null); // remove branch
        assertNull(commandLine.getSwitch(opt, null));
    }

    // ---------------------------------------------------------------
    // addProperty / getProperty / getProperties
    // ---------------------------------------------------------------

    @Test
    public void testAddPropertyAndGetProperty_found() {
        commandLine.addProperty("key1", "value1");
        assertEquals("value1", commandLine.getProperty("key1", "default"));
    }

    @Test
    public void testGetProperty_notFound_returnsDefault() {
        assertEquals("default", commandLine.getProperty("missing", "default"));
    }

    @Test
    public void testGetProperties_containsAddedKeysAndIsUnmodifiable() {
        commandLine.addProperty("k1", "v1");
        Set props = commandLine.getProperties();
        assertTrue(props.contains("k1"));
        try {
            props.add("k2");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // looksLikeOption : loop + if(startsWith) true/false + empty trigger
    // ---------------------------------------------------------------

    @Test
    public void testLooksLikeOption_trueWhenPrefixMatches() {
        Set prefixes = rootGroup.getPrefixes();
        assertFalse(prefixes.isEmpty());
        String prefix = (String) prefixes.iterator().next();
        assertTrue(commandLine.looksLikeOption(prefix + "x"));
    }

    @Test
    public void testLooksLikeOption_falseWhenNoPrefixMatches() {
        // สมมติว่า prefixes เป็น "-", "--" (ค่า default ของ DefaultOptionBuilder)
        assertFalse(commandLine.looksLikeOption("plainArgumentNoPrefix"));
    }

    @Test
    public void testLooksLikeOption_falseForEmptyString_loopCompletesWithoutMatch() {
        assertFalse(commandLine.looksLikeOption(""));
    }

    // ---------------------------------------------------------------
    // toString : if(space) quoting + if(hasNext) trailing space + empty loop
    // ---------------------------------------------------------------

    @Test
    public void testToString_emptyNormalisedList_returnsEmptyString() {
        WriteableCommandLineImpl wcl = new WriteableCommandLineImpl(rootGroup, new ArrayList());
        assertEquals("", wcl.toString());
    }

    @Test
    public void testToString_singleArgNoSpace_noQuotesNoTrailingSpace() {
        List args = new ArrayList();
        args.add("--help");
        WriteableCommandLineImpl wcl = new WriteableCommandLineImpl(rootGroup, args);
        assertEquals("--help", wcl.toString());
    }

    @Test
    public void testToString_argWithSpace_isQuoted() {
        List args = new ArrayList();
        args.add("hello world");
        WriteableCommandLineImpl wcl = new WriteableCommandLineImpl(rootGroup, args);
        assertEquals("\"hello world\"", wcl.toString());
    }

    @Test
    public void testToString_multipleArgs_separatedBySingleSpace_noTrailingSpace() {
        List args = new ArrayList();
        args.add("--name");
        args.add("hello world");
        args.add("end");
        WriteableCommandLineImpl wcl = new WriteableCommandLineImpl(rootGroup, args);
        assertEquals("--name \"hello world\" end", wcl.toString());
    }
}
```

## ตารางสรุป Test Case กับ Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_nullRootOption_throwsNPE` | constructor: `rootOption.getPrefixes()` เมื่อ null → NPE (boundary/null) |
| `testGetNormalised_returnsSameContentAndIsUnmodifiable` | `getNormalised()` unmodifiable wrapping |
| `testAddOption_addsToOptionsAndNameMap` | `addOption`: เพิ่มเข้า list/map พื้นฐาน |
| `testAddOption_allTriggersMapToOption` | `addOption`: for-loop วนหลายรอบ (`i.hasNext()` true→false) |
| `testAddOption_withNoTriggers_loopExecutesZeroTimes` | `addOption`: for-loop วนศูนย์รอบ |
| `testHasOption_falseWhenNeverAdded` | `hasOption` false branch |
| `testGetOption_unknownTrigger_returnsNull` | `getOption` miss → null |
| `testGetOptions_isUnmodifiable` / `testGetOptionTriggers_isUnmodifiable` | unmodifiable wrappers |
| `testAddValue_nonArgumentOption_doesNotAutoAddOption` | `addValue`: `instanceof Argument` = false |
| `testAddValue_argumentOption_autoAddsOption` | `addValue`: `instanceof Argument` = true |
| `testAddValue_secondCallReusesExistingList` | `addValue`: `valueList==null` true/false ทั้งสองครั้ง |
| `testAddSwitch_trueValue_setsBooleanTrueAndAddsOption` | `addSwitch`: ternary `value?TRUE` |
| `testAddSwitch_falseValue_setsBooleanFalse` | `addSwitch`: ternary `:FALSE` |
| `testAddSwitch_duplicateOption_throwsIllegalStateException` | `addSwitch`: `containsKey` = true → throw |
| `testGetValues_branch1_...` | `getValues` เงื่อนไข 1 = false (มีค่าจาก values map) |
| `testGetValues_branch2_usesMethodDefault_...` | เงื่อนไข 1 = true(null), เงื่อนไข 2 = false |
| `testGetValues_branch2_methodDefaultParamEmpty_...` | เงื่อนไข 2 = true ผ่าน `isEmpty()` |
| `testGetValues_branch3_usesOptionDefault_...` | เงื่อนไข 1,2 = true(null), ไปดึง option default |
| `testGetValues_branch3_optionDefaultEmptyList_...` | final `if(valueList==null)` = false |
| `testGetValues_branch4_emptyListWhenNothingSet` | final `if(valueList==null)` = true → EMPTY_LIST |
| `testGetSwitch_branch1..4` | `getSwitch`: ครบ 4 combination ของ 2 null-check |
| `testSetDefaultValues_null_removesEntry` | `setDefaultValues`: null→remove branch |
| `testSetDefaultSwitch_null_removesEntry` | `setDefaultSwitch`: null→remove branch |
| `testAddPropertyAndGetProperty_found` / `testGetProperty_notFound_returnsDefault` | `getProperty` found/default (Properties internal) |
| `testGetProperties_containsAddedKeysAndIsUnmodifiable` | `getProperties` + unmodifiable |
| `testLooksLikeOption_trueWhenPrefixMatches` | `looksLikeOption`: `startsWith` true → return true กลาง loop |
| `testLooksLikeOption_falseWhenNoPrefixMatches` | `looksLikeOption`: loop จบไม่เจอ → false |
| `testLooksLikeOption_falseForEmptyString_...` | boundary/empty string input |
| `testToString_emptyNormalisedList_returnsEmptyString` | `toString`: loop วนศูนย์รอบ |
| `testToString_singleArgNoSpace_...` | `if(indexOf(' ')>=0)` false, `if(hasNext)` false |
| `testToString_argWithSpace_isQuoted` | `if(indexOf(' ')>=0)` true |
| `testToString_multipleArgs_...` | `if(hasNext)` true (append space) + ทั้งสอง quoting branch ผสมกัน |

**หมายเหตุ:** branch `valueList.isEmpty()` ตัวแรกใน `getValues` (จาก `values` map) ไม่สามารถ trigger ให้ true ได้ผ่าน public API เนื่องจาก `addValue` เติมค่าเข้า list ทันทีหลังสร้าง — จึงไม่ได้เขียนเทสสำหรับ branch นี้ตามข้อกำหนดห้ามเดา behavior
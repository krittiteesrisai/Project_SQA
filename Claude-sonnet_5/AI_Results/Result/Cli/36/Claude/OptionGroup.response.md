```java
package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * JUnit4 test suite for {@link OptionGroup} (Defects4J: Cli-36b).
 *
 * หมายเหตุ (assumption): คลาส Option ในซอร์สนี้ไม่ได้ให้มา
 * จึงอ้างอิง constructor มาตรฐานของ Apache Commons-CLI ที่ใช้กันทั่วไป:
 *   Option(String opt, String longOpt, boolean hasArg, String description)
 * และอิงพฤติกรรมที่ทราบกันว่า OptionValidator.validateOption(opt)
 * จะไม่ throw หาก opt เป็น null (อนุญาตให้สร้าง Option ที่มีเฉพาะ longOpt ได้)
 * หากพฤติกรรมจริงต่างจากนี้ ผลของเทสบางเคส (เช่น toString ที่ opt==null)
 * อาจต้องปรับปรุง
 */
public class OptionGroupTest
{
    private OptionGroup group;

    @Before
    public void setUp()
    {
        group = new OptionGroup();
    }

    // ---------- addOption / getNames / getOptions ----------

    @Test
    public void testGetNamesAndOptionsEmptyInitially()
    {
        Collection<String> names = group.getNames();
        Collection<Option> options = group.getOptions();

        assertNotNull(names);
        assertNotNull(options);
        assertTrue("ควรว่างตอนเริ่มต้น", names.isEmpty());
        assertTrue("ควรว่างตอนเริ่มต้น", options.isEmpty());
    }

    @Test
    public void testAddOptionAddsToMap() throws Exception
    {
        Option opt = new Option("a", null, false, "desc-a");
        group.addOption(opt);

        assertEquals(1, group.getNames().size());
        assertTrue(group.getNames().contains("a"));
        assertEquals(1, group.getOptions().size());
        assertTrue(group.getOptions().contains(opt));
    }

    @Test
    public void testAddOptionDuplicateKeyOverwritesPrevious() throws Exception
    {
        Option first  = new Option("a", null, false, "first");
        Option second = new Option("a", null, false, "second");

        group.addOption(first);
        group.addOption(second);

        // key ซ้ำกัน -> ค่าใน map ต้องถูกแทนที่ (ขนาด map ยังคงเป็น 1)
        assertEquals(1, group.getOptions().size());
        assertTrue(group.getOptions().contains(second));
        assertFalse(group.getOptions().contains(first));
    }

    // ---------- setSelected / getSelected ----------

    @Test
    public void testGetSelectedDefaultIsNull()
    {
        assertNull(group.getSelected());
    }

    @Test
    public void testSetSelectedWithNullResetsSelection() throws Exception
    {
        // branch: option == null -> selected = null; return;
        group.setSelected(null);
        assertNull(group.getSelected());
    }

    @Test
    public void testSetSelectedFirstTimeSetsSelected() throws Exception
    {
        Option opt = new Option("a", null, false, "desc-a");
        group.setSelected(opt);
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelectedSameOptionAgainDoesNotThrow() throws Exception
    {
        Option opt = new Option("a", null, false, "desc-a");
        group.setSelected(opt);
        // branch: selected.equals(option.getKey()) == true -> ไม่ throw
        group.setSelected(opt);
        assertEquals("a", group.getSelected());
    }

    @Test(expected = AlreadySelectedException.class)
    public void testSetSelectedDifferentOptionThrowsException() throws Exception
    {
        Option optA = new Option("a", null, false, "desc-a");
        Option optB = new Option("b", null, false, "desc-b");

        group.setSelected(optA);
        // branch: selected != null && !selected.equals(option.getKey()) -> throw
        group.setSelected(optB);
    }

    @Test
    public void testSetSelectedResetThenSelectDifferentOption() throws Exception
    {
        Option optA = new Option("a", null, false, "desc-a");
        Option optB = new Option("b", null, false, "desc-b");

        group.setSelected(optA);
        group.setSelected(null);      // reset -> selected == null
        group.setSelected(optB);      // ควรตั้งค่าใหม่ได้โดยไม่ throw

        assertEquals("b", group.getSelected());
    }

    // ---------- required flag ----------

    @Test
    public void testIsRequiredDefaultFalse()
    {
        assertFalse(group.isRequired());
    }

    @Test
    public void testSetRequiredTrue()
    {
        group.setRequired(true);
        assertTrue(group.isRequired());
    }

    @Test
    public void testSetRequiredFalseExplicitly()
    {
        group.setRequired(true);
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    // ---------- toString ----------

    @Test
    public void testToStringEmptyGroup()
    {
        // loop ไม่วนเลย (iter.hasNext() == false ตั้งแต่แรก)
        assertEquals("[]", group.toString());
    }

    @Test
    public void testToStringSingleOptionWithOptAndDescription() throws Exception
    {
        Option opt = new Option("a", null, false, "desc-a");
        group.addOption(opt);

        // branch: option.getOpt() != null -> "-a"
        // branch: option.getDescription() != null -> " desc-a"
        // branch: iter.hasNext() == false -> ไม่มี ", "
        assertEquals("[-a desc-a]", group.toString());
    }

    @Test
    public void testToStringOptionWithoutDescription() throws Exception
    {
        Option opt = new Option("c", null, false, null);
        group.addOption(opt);

        // branch: option.getDescription() == null -> ไม่ append description
        assertEquals("[-c]", group.toString());
    }

    @Test
    public void testToStringOptionWithLongOptOnlyNoShortOpt() throws Exception
    {
        // opt == null, longOpt != null
        // (สมมติฐาน: validateOption ยอมให้ opt เป็น null ได้)
        Option opt = new Option(null, "verbose", false, "desc-verbose");
        group.addOption(opt);

        // branch: option.getOpt() == null -> "--verbose"
        assertEquals("[--verbose desc-verbose]", group.toString());
    }

    @Test
    public void testToStringMultipleOptionsContainsSeparator() throws Exception
    {
        Option optA = new Option("a", null, false, "desc-a");
        Option optB = new Option("b", null, false, "desc-b");

        group.addOption(optA);
        group.addOption(optB);

        String result = group.toString();

        // ลำดับใน HashMap ไม่แน่นอน จึงตรวจสอบแบบไม่ยึดลำดับตายตัว
        // branch: iter.hasNext() == true -> ต้องมี ", " คั่นระหว่าง option
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertTrue(result.contains(", "));
        assertTrue(result.contains("-a desc-a"));
        assertTrue(result.contains("-b desc-b"));
    }
}
```

### สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetNamesAndOptionsEmptyInitially` | `getNames()`/`getOptions()` กรณี map ว่าง (baseline) |
| `testAddOptionAddsToMap` | `addOption` เพิ่มค่าปกติ, `getNames`/`getOptions` มีข้อมูล |
| `testAddOptionDuplicateKeyOverwritesPrevious` | `addOption` กรณี key ซ้ำ -> ทับค่าใน `HashMap` |
| `testGetSelectedDefaultIsNull` | ค่าเริ่มต้นของ `selected == null` |
| `testSetSelectedWithNullResetsSelection` | `setSelected`: branch `option == null` -> reset |
| `testSetSelectedFirstTimeSetsSelected` | `setSelected`: branch `selected == null` -> ตั้งค่าใหม่ |
| `testSetSelectedSameOptionAgainDoesNotThrow` | `setSelected`: branch `selected.equals(option.getKey())` == true |
| `testSetSelectedDifferentOptionThrowsException` | `setSelected`: branch else -> throw `AlreadySelectedException` |
| `testSetSelectedResetThenSelectDifferentOption` | ผสาน branch reset (`null`) แล้วตามด้วย branch `selected==null` อีกครั้ง |
| `testIsRequiredDefaultFalse` | ค่าเริ่มต้น `required == false` |
| `testSetRequiredTrue` | `setRequired(true)` / `isRequired()` == true |
| `testSetRequiredFalseExplicitly` | `setRequired(false)` หลังตั้ง true |
| `testToStringEmptyGroup` | `toString()`: loop ไม่วน (`iter.hasNext()==false` แต่แรก) |
| `testToStringSingleOptionWithOptAndDescription` | `toString()`: `getOpt()!=null`, `getDescription()!=null`, ไม่มี `hasNext()` หลัง option สุดท้าย |
| `testToStringOptionWithoutDescription` | `toString()`: branch `getDescription()==null` |
| `testToStringOptionWithLongOptOnlyNoShortOpt` | `toString()`: branch else `getOpt()==null` -> ใช้ `--longOpt` |
| `testToStringMultipleOptionsContainsSeparator` | `toString()`: branch `iter.hasNext()==true` -> ใส่ `", "` คั่น |

**ข้อควรระวัง/สมมติฐานที่ระบุในคอมเมนต์:**
- ใช้ constructor `Option(String opt, String longOpt, boolean hasArg, String description)` ซึ่งไม่ได้อยู่ในซอร์สที่ให้มา (เป็น dependency) — อ้างอิงพฤติกรรมมาตรฐานของ Commons-CLI
- สมมติว่า `OptionValidator.validateOption(opt)` อนุญาตให้ `opt` เป็น `null` ได้ (ไม่ throw) เพื่อทดสอบ branch `option.getOpt() == null` ใน `toString()`
- การทดสอบกรณี multiple options ใน `toString()` หลีกเลี่ยงการตรวจสอบลำดับที่ตายตัว เนื่องจาก `HashMap` ไม่รักษาลำดับการแทรก
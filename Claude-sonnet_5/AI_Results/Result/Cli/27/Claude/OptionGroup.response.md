# JUnit 4 Test Suite: OptionGroupTest

## หมายเหตุสำคัญก่อนเริ่ม

- ซอร์สโค้ดของ `Option` class ไม่ได้ถูกให้มาในโจทย์ ผมจึงใช้เฉพาะ public API มาตรฐานของ Commons CLI ที่เป็นที่รู้จักทั่วไป (`Option(String opt, String description)` และ `Option(String opt, String longOpt, boolean hasArg, String description)`) เพื่อสร้าง object สำหรับทดสอบ `OptionGroup`
- กรณี `getOpt() == null` (ทดสอบ branch `else` ใน `toString()`) ผมอ้างอิงจาก standard behavior ของ commons-cli ที่ยอมให้ `opt` เป็น `null` ได้เมื่อระบุ `longOpt` — มีคอมเมนต์กำกับไว้ในโค้ดชัดเจน
- ลำดับของ `Map.keySet()`/`values()` จาก `HashMap` ไม่รับประกันลำดับ ดังนั้น assertion ที่เกี่ยวกับหลาย option จะใช้ `contains()` แทนการเทียบ string แบบตรงตัวลำดับ

```java
package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link OptionGroup} (Defects4J Cli-27b).
 */
public class OptionGroupTest
{
    private OptionGroup group;

    @Before
    public void setUp()
    {
        group = new OptionGroup();
    }

    // ------------------------------------------------------------------
    // addOption / getNames / getOptions
    // ------------------------------------------------------------------

    @Test
    public void testGetNamesEmptyInitially()
    {
        Collection names = group.getNames();
        assertNotNull(names);
        assertTrue(names.isEmpty());
    }

    @Test
    public void testGetOptionsEmptyInitially()
    {
        Collection options = group.getOptions();
        assertNotNull(options);
        assertTrue(options.isEmpty());
    }

    @Test
    public void testAddOptionAndGetOptions() throws Exception
    {
        Option opt = new Option("a", "alpha description");
        group.addOption(opt);

        Collection options = group.getOptions();
        assertEquals(1, options.size());
        assertTrue(options.contains(opt));

        Collection names = group.getNames();
        assertEquals(1, names.size());
        assertTrue(names.contains(opt.getKey()));
    }

    @Test
    public void testAddOptionOverwritesSameKey() throws Exception
    {
        Option opt1 = new Option("a", "first description");
        Option opt2 = new Option("a", "second description");

        group.addOption(opt1);
        group.addOption(opt2);

        // key ซ้ำใน HashMap -> ตัวหลังทับตัวก่อน ขนาดยังเป็น 1
        Collection options = group.getOptions();
        assertEquals(1, options.size());
        assertTrue(options.contains(opt2));
        assertFalse(options.contains(opt1));
    }

    @Test
    public void testAddMultipleOptionsDifferentKeys() throws Exception
    {
        Option opt1 = new Option("a", "alpha description");
        Option opt2 = new Option("b", "beta description");

        group.addOption(opt1);
        group.addOption(opt2);

        assertEquals(2, group.getOptions().size());
        assertEquals(2, group.getNames().size());
    }

    // ------------------------------------------------------------------
    // setSelected / getSelected
    // ------------------------------------------------------------------

    @Test
    public void testGetSelectedInitiallyNull()
    {
        assertNull(group.getSelected());
    }

    @Test
    public void testSetSelectedWithNullOptionResetsSelected() throws Exception
    {
        // branch: option == null -> reset selected เป็น null และ return ทันที
        group.setSelected(null);
        assertNull(group.getSelected());
    }

    @Test
    public void testSetSelectedFirstTime() throws Exception
    {
        Option opt = new Option("a", "alpha description");
        // branch: selected == null -> set selected = option.getOpt()
        group.setSelected(opt);
        assertEquals("a", group.getSelected());
    }

    @Test
    public void testSetSelectedSameOptionTwice() throws Exception
    {
        Option opt = new Option("a", "alpha description");
        group.setSelected(opt);
        // branch: selected != null && selected.equals(option.getOpt()) -> true, ไม่ throw
        group.setSelected(opt);
        assertEquals("a", group.getSelected());
    }

    @Test(expected = AlreadySelectedException.class)
    public void testSetSelectedDifferentOptionThrows() throws Exception
    {
        Option opt1 = new Option("a", "alpha description");
        Option opt2 = new Option("b", "beta description");

        group.setSelected(opt1);
        // branch: selected != null && !selected.equals(option.getOpt()) -> throw
        group.setSelected(opt2);
    }

    @Test
    public void testSetSelectedResetThenSelectAgain() throws Exception
    {
        Option opt1 = new Option("a", "alpha description");
        Option opt2 = new Option("b", "beta description");

        group.setSelected(opt1);
        group.setSelected(null); // reset -> selected = null
        assertNull(group.getSelected());

        // หลัง reset, selected == null อีกครั้ง -> เลือก option อื่นได้โดยไม่ throw
        group.setSelected(opt2);
        assertEquals("b", group.getSelected());
    }

    // ------------------------------------------------------------------
    // setRequired / isRequired
    // ------------------------------------------------------------------

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
    public void testSetRequiredFalseExplicit()
    {
        group.setRequired(true);
        group.setRequired(false);
        assertFalse(group.isRequired());
    }

    // ------------------------------------------------------------------
    // toString
    // ------------------------------------------------------------------

    @Test
    public void testToStringEmptyGroup()
    {
        // loop: getOptions().iterator().hasNext() == false ตั้งแต่ต้น
        assertEquals("[]", group.toString());
    }

    @Test
    public void testToStringSingleOptionWithShortOpt() throws Exception
    {
        Option opt = new Option("a", "alpha description");
        group.addOption(opt);

        String result = group.toString();
        // option เดียว: getOpt()!=null -> ใช้ "-" ; iter.hasNext()==false รอบสุดท้าย -> ไม่มี ", "
        assertEquals("[-a alpha description]", result);
    }

    @Test
    public void testToStringMultipleOptionsHaveComma() throws Exception
    {
        Option opt1 = new Option("a", "alpha description");
        Option opt2 = new Option("b", "beta description");
        group.addOption(opt1);
        group.addOption(opt2);

        String result = group.toString();
        // มี 2 options -> ต้องมี ", " คั่น (iter.hasNext()==true ในรอบแรก)
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertTrue(result.contains(", "));
        assertTrue(result.contains("-a alpha description"));
        assertTrue(result.contains("-b beta description"));
    }

    @Test
    public void testToStringOptionWithLongOptOnly() throws Exception
    {
        // หมายเหตุ: อ้างอิงจาก public API มาตรฐานของ commons-cli
        // Option(String opt, String longOpt, boolean hasArg, String description)
        // โดย opt เป็น null เมื่อ option ระบุเฉพาะ longOpt
        // (ไม่มีซอร์ส Option class ให้มาในโจทย์ แต่ toString() ของ OptionGroup
        // ถูกออกแบบมาให้รองรับ getOpt()==null โดยตรง จึงทดสอบ branch นี้)
        Option opt = new Option(null, "alpha", false, "alpha description");
        group.addOption(opt);

        String result = group.toString();
        // branch: getOpt() == null -> ใช้ "--" + longOpt แทน
        assertEquals("[--alpha alpha description]", result);
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetNamesEmptyInitially` | `getNames()` เมื่อ map ว่าง |
| `testGetOptionsEmptyInitially` | `getOptions()` เมื่อ map ว่าง |
| `testAddOptionAndGetOptions` | `addOption()` เพิ่ม option ปกติ, ตรวจสอบ key/value ถูกเก็บ |
| `testAddOptionOverwritesSameKey` | `addOption()` กรณี key ซ้ำ (overwrite ใน HashMap) |
| `testAddMultipleOptionsDifferentKeys` | `addOption()` เพิ่มหลาย option ต่าง key |
| `testGetSelectedInitiallyNull` | `getSelected()` ค่าเริ่มต้น (null) |
| `testSetSelectedWithNullOptionResetsSelected` | `setSelected()`: branch `option == null` (reset) |
| `testSetSelectedFirstTime` | `setSelected()`: branch `selected == null` → set |
| `testSetSelectedSameOptionTwice` | `setSelected()`: branch `selected.equals(option.getOpt())` == true → set |
| `testSetSelectedDifferentOptionThrows` | `setSelected()`: branch `!selected.equals(option.getOpt())` → throw `AlreadySelectedException` |
| `testSetSelectedResetThenSelectAgain` | `setSelected()`: ทดสอบ reset แล้ว select ใหม่ (ครอบคลุม `selected==null` ซ้ำหลัง reset) |
| `testIsRequiredDefaultFalse` | `isRequired()` ค่า default (false) |
| `testSetRequiredTrue` | `setRequired(true)` / `isRequired()` == true |
| `testSetRequiredFalseExplicit` | `setRequired(false)` หลัง true / `isRequired()` == false |
| `testToStringEmptyGroup` | `toString()`: loop 0 รอบ (`iter.hasNext()` false ตั้งแต่ต้น) |
| `testToStringSingleOptionWithShortOpt` | `toString()`: loop 1 รอบ, `option.getOpt() != null` (ใช้ `-`), ไม่มี `,` (`iter.hasNext()` false รอบสุดท้าย) |
| `testToStringMultipleOptionsHaveComma` | `toString()`: loop 2+ รอบ, branch `iter.hasNext()` true → เติม `", "` |
| `testToStringOptionWithLongOptOnly` | `toString()`: branch `option.getOpt() == null` → ใช้ `--` + `longOpt` |

**Branch ที่ยังไม่สามารถทดสอบเพิ่มเติมได้จากซอร์สที่ให้มา:** ไม่มี — โค้ดของ `OptionGroup` ทุก if/else และ loop condition (`iter.hasNext()`, `option == null`, `selected == null`, `selected.equals(...)`, `option.getOpt() != null`) ถูกครอบคลุมครบทั้งสองด้าน (true/false) แล้วในชุดทดสอบข้างต้น
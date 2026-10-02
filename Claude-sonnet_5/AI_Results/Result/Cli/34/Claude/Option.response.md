# JUnit4 Test Suite: `OptionTest`

## หมายเหตุก่อนเริ่ม (ตามข้อกำหนดที่ 4 - ห้ามเดา)

- `OptionValidator.validateOption(opt)` ไม่มีซอร์สโค้ดให้มาในชุดนี้ จึงไม่เขียนเทสที่คาดเดาว่า opt แบบใดจะ throw `IllegalArgumentException` — จะทดสอบเฉพาะกรณีที่ opt เป็นค่าที่ทราบแน่ชัดว่า valid (เช่น `"a"`, `"b"`)
- branch `opt == null` ใน `getKey()` ไม่สามารถ trigger ได้ผ่าน public constructor ที่ให้มา (constructor ทุกตัวรับ `opt` เป็นพารามิเตอร์บังคับ) จึงไม่ทดสอบ branch นี้ตรง ๆ
- branch `catch (CloneNotSupportedException)` ใน `clone()` ไม่สามารถ trigger ได้จริงเพราะ `Option implements Cloneable` เสมอ จึงไม่ทดสอบ branch นี้
- คลาสทดสอบอยู่ package เดียวกัน (`org.apache.commons.cli`) จึงเรียก package-private methods (`getKey`, `addValueForProcessing`, `clearValues`, `acceptsArg`, `requiresArg`) ได้โดยตรงโดยไม่ต้องใช้ reflection

```java
package org.apache.commons.cli;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OptionTest
{
    // ---------- Constructors ----------

    @Test
    public void testConstructor_TwoArg_NoArgOption() {
        Option opt = new Option("a", "description");
        assertEquals("a", opt.getOpt());
        assertNull(opt.getLongOpt());
        assertEquals("description", opt.getDescription());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
        assertFalse(opt.hasArg());
    }

    @Test
    public void testConstructor_ThreeArg_HasArgTrue() {
        Option opt = new Option("a", true, "description");
        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasArg());
    }

    @Test
    public void testConstructor_ThreeArg_HasArgFalse() {
        Option opt = new Option("a", false, "description");
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
        assertFalse(opt.hasArg());
    }

    @Test
    public void testConstructor_FourArg_WithLongOpt() {
        Option opt = new Option("a", "alpha", true, "description");
        assertEquals("a", opt.getOpt());
        assertEquals("alpha", opt.getLongOpt());
        assertTrue(opt.hasLongOpt());
        assertEquals(1, opt.getArgs());
    }

    // ---------- getKey / getId ----------

    @Test
    public void testGetId_FromShortOpt() {
        Option opt = new Option("a", "alpha", false, "desc");
        assertEquals('a', opt.getId());
    }

    // ---------- hasLongOpt ----------

    @Test
    public void testHasLongOpt_True() {
        Option opt = new Option("a", "alpha", false, "desc");
        assertTrue(opt.hasLongOpt());
    }

    @Test
    public void testHasLongOpt_False() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasLongOpt());
    }

    // ---------- hasArg / hasArgs boundary ----------

    @Test
    public void testHasArg_NumberOfArgsUninitialized() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasArg());
    }

    @Test
    public void testHasArg_NumberOfArgsOne() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        assertTrue(opt.hasArg());
    }

    @Test
    public void testHasArg_NumberOfArgsUnlimited() {
        Option opt = new Option("a", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.hasArg());
    }

    @Test
    public void testHasArg_NumberOfArgsZero() {
        Option opt = new Option("a", "desc");
        opt.setArgs(0);
        assertFalse(opt.hasArg());
    }

    @Test
    public void testHasArgs_True_GreaterThanOne() {
        Option opt = new Option("a", "desc");
        opt.setArgs(2);
        assertTrue(opt.hasArgs());
    }

    @Test
    public void testHasArgs_True_Unlimited() {
        Option opt = new Option("a", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.hasArgs());
    }

    @Test
    public void testHasArgs_False_ExactlyOne() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        assertFalse(opt.hasArgs());
    }

    @Test
    public void testHasArgs_False_Zero() {
        Option opt = new Option("a", "desc");
        opt.setArgs(0);
        assertFalse(opt.hasArgs());
    }

    // ---------- hasArgName ----------

    @Test
    public void testHasArgName_Null() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasArgName());
    }

    @Test
    public void testHasArgName_Empty() {
        Option opt = new Option("a", "desc");
        opt.setArgName("");
        assertFalse(opt.hasArgName());
    }

    @Test
    public void testHasArgName_NonEmpty() {
        Option opt = new Option("a", "desc");
        opt.setArgName("FILE");
        assertTrue(opt.hasArgName());
        assertEquals("FILE", opt.getArgName());
    }

    // ---------- hasValueSeparator ----------

    @Test
    public void testHasValueSeparator_DefaultFalse() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasValueSeparator());
        assertEquals('\u0000', opt.getValueSeparator());
    }

    @Test
    public void testHasValueSeparator_SetTrue() {
        Option opt = new Option("a", "desc");
        opt.setValueSeparator('=');
        assertTrue(opt.hasValueSeparator());
        assertEquals('=', opt.getValueSeparator());
    }

    // ---------- hasOptionalArg ----------

    @Test
    public void testHasOptionalArg_DefaultFalse() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasOptionalArg());
    }

    @Test
    public void testHasOptionalArg_SetTrue() {
        Option opt = new Option("a", "desc");
        opt.setOptionalArg(true);
        assertTrue(opt.hasOptionalArg());
    }

    // ---------- required ----------

    @Test
    public void testRequired_DefaultFalse() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.isRequired());
    }

    @Test
    public void testRequired_SetTrue() {
        Option opt = new Option("a", "desc");
        opt.setRequired(true);
        assertTrue(opt.isRequired());
    }

    // ---------- type ----------

    @Test
    public void testType_DefaultNull() {
        Option opt = new Option("a", "desc");
        assertNull(opt.getType());
    }

    @Test
    public void testType_Set() {
        Option opt = new Option("a", "desc");
        opt.setType(String.class);
        assertEquals(String.class, opt.getType());
    }

    // ---------- description / longOpt setters ----------

    @Test
    public void testSetDescription() {
        Option opt = new Option("a", "desc");
        opt.setDescription("new description");
        assertEquals("new description", opt.getDescription());
    }

    @Test
    public void testSetLongOpt() {
        Option opt = new Option("a", "desc");
        opt.setLongOpt("alpha");
        assertEquals("alpha", opt.getLongOpt());
        assertTrue(opt.hasLongOpt());
    }

    // ---------- addValueForProcessing / processValue / add / acceptsArg ----------

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_Uninitialized_Throws() {
        Option opt = new Option("a", "desc"); // numberOfArgs = UNINITIALIZED
        opt.addValueForProcessing("value");
    }

    @Test
    public void testAddValueForProcessing_NoSeparator() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("value1");
        assertEquals("value1", opt.getValue());
    }

    @Test
    public void testAddValueForProcessing_WithSeparator_NaturalExit() {
        Option opt = new Option("a", "desc");
        opt.setArgs(2);
        opt.setValueSeparator('=');
        opt.addValueForProcessing("a=b");
        assertEquals(2, opt.getValuesList().size());
        assertEquals("a", opt.getValue(0));
        assertEquals("b", opt.getValue(1));
    }

    @Test
    public void testAddValueForProcessing_WithSeparator_MultipleIterations() {
        Option opt = new Option("a", "desc");
        opt.setArgs(3);
        opt.setValueSeparator(',');
        opt.addValueForProcessing("a,b,c");
        assertEquals(3, opt.getValuesList().size());
        assertEquals("a", opt.getValue(0));
        assertEquals("b", opt.getValue(1));
        assertEquals("c", opt.getValue(2));
    }

    @Test
    public void testAddValueForProcessing_WithSeparator_BreakOnCapacity() {
        Option opt = new Option("a", "desc");
        opt.setArgs(2);
        opt.setValueSeparator(',');
        opt.addValueForProcessing("a,b,c");
        // n-1 = 1: หลัง add token แรก size==1==(n-1) -> break,
        // ส่วนที่เหลือ "b,c" ถูกเก็บเป็นค่าสุดท้ายค่าเดียว
        assertEquals(2, opt.getValuesList().size());
        assertEquals("a", opt.getValue(0));
        assertEquals("b,c", opt.getValue(1));
    }

    @Test
    public void testAddValueForProcessing_WithSeparator_BreakImmediately() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        opt.setValueSeparator('=');
        opt.addValueForProcessing("a=b=c");
        // n-1 = 0, size==0==(n-1) ทันที -> break ก่อน split ใดๆ
        // ค่าเดิมทั้งหมดถูกเก็บเป็น value เดียว
        assertEquals(1, opt.getValuesList().size());
        assertEquals("a=b=c", opt.getValue(0));
    }

    @Test(expected = RuntimeException.class)
    public void testAdd_ThrowsWhenListFull() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("first");
        opt.addValueForProcessing("second"); // list เต็มแล้ว -> ต้อง throw
    }

    @Test
    public void testAcceptsArg_OptionalArgAllowsAddsWhenArgsLteZero() {
        Option opt = new Option("a", "desc");
        opt.setOptionalArg(true);
        opt.setArgs(0); // numberOfArgs<=0 -> true
        assertTrue(opt.acceptsArg());
        opt.addValueForProcessing("v1");
        opt.addValueForProcessing("v2");
        assertEquals(2, opt.getValuesList().size());
    }

    // ---------- getValue / getValues / getValuesList ----------

    @Test
    public void testGetValue_NoValues_ReturnsNull() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        assertNull(opt.getValue());
    }

    @Test
    public void testGetValue_WithValue() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("value1");
        assertEquals("value1", opt.getValue());
    }

    @Test
    public void testGetValueIndex_NoValues_ReturnsNullEvenForInvalidIndex() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        // hasNoValues() true -> คืน null ไม่ว่า index จะเป็นเท่าใด
        assertNull(opt.getValue(5));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueIndex_InvalidIndex_Throws() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("value1");
        opt.getValue(5); // มี values แล้ว แต่ index เกินขอบ
    }

    @Test
    public void testGetValueDefault_ReturnsActualValue() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("value1");
        assertEquals("value1", opt.getValue("default"));
    }

    @Test
    public void testGetValueDefault_ReturnsDefaultWhenNoValue() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        assertEquals("default", opt.getValue("default"));
    }

    @Test
    public void testGetValues_NoValues_ReturnsNull() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        assertNull(opt.getValues());
    }

    @Test
    public void testGetValues_WithValues() {
        Option opt = new Option("a", "desc");
        opt.setArgs(2);
        opt.addValueForProcessing("v1");
        opt.addValueForProcessing("v2");
        String[] values = opt.getValues();
        assertNotNull(values);
        assertArrayEquals(new String[] {"v1", "v2"}, values);
    }

    @Test
    public void testGetValuesList() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("v1");
        List list = opt.getValuesList();
        assertEquals(1, list.size());
        assertEquals("v1", list.get(0));
    }

    // ---------- clearValues ----------

    @Test
    public void testClearValues() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("v1");
        assertFalse(opt.getValuesList().isEmpty());
        opt.clearValues();
        assertTrue(opt.getValuesList().isEmpty());
    }

    // ---------- addValue (deprecated) ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testAddValue_ThrowsUnsupported() {
        Option opt = new Option("a", "desc");
        opt.addValue("value");
    }

    // ---------- requiresArg ----------

    @Test
    public void testRequiresArg_OptionalArgTrue_AlwaysFalse() {
        Option opt = new Option("a", "desc");
        opt.setOptionalArg(true);
        opt.setArgs(1);
        assertFalse(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_UnlimitedValues_NoValuesYet() {
        Option opt = new Option("a", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_UnlimitedValues_HasOneValue() {
        Option opt = new Option("a", "desc");
        opt.setArgs(Option.UNLIMITED_VALUES);
        opt.addValueForProcessing("v1");
        assertFalse(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_FixedArgs_NotFull() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        assertTrue(opt.requiresArg());
    }

    @Test
    public void testRequiresArg_FixedArgs_Full() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        opt.addValueForProcessing("v1");
        assertFalse(opt.requiresArg());
    }

    // ---------- toString ----------

    @Test
    public void testToString_NoLongOpt_NoArg() {
        Option opt = new Option("a", "desc");
        String s = opt.toString();
        assertTrue(s.contains("[ option: a"));
        assertFalse(s.contains("[ARG...]"));
        assertFalse(s.contains(" [ARG]"));
        assertTrue(s.contains(":: desc"));
    }

    @Test
    public void testToString_WithLongOpt() {
        Option opt = new Option("a", "alpha", false, "desc");
        String s = opt.toString();
        assertTrue(s.contains("alpha"));
    }

    @Test
    public void testToString_HasArgs() {
        Option opt = new Option("a", "desc");
        opt.setArgs(2);
        String s = opt.toString();
        assertTrue(s.contains("[ARG...]"));
    }

    @Test
    public void testToString_HasArgOnly() {
        Option opt = new Option("a", "desc");
        opt.setArgs(1);
        String s = opt.toString();
        assertTrue(s.contains(" [ARG]"));
    }

    @Test
    public void testToString_WithType() {
        Option opt = new Option("a", "desc");
        opt.setType(String.class);
        String s = opt.toString();
        assertTrue(s.contains(String.class.toString()));
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_SameInstance() {
        Option opt = new Option("a", "desc");
        assertTrue(opt.equals(opt));
    }

    @Test
    public void testEquals_Null() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.equals(null));
    }

    @Test
    public void testEquals_DifferentClass() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.equals("not an option"));
    }

    @Test
    public void testEquals_DifferentOpt() {
        Option opt1 = new Option("a", "desc1");
        Option opt2 = new Option("b", "desc2");
        assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testEquals_SameOpt_DifferentLongOpt() {
        Option opt1 = new Option("a", "alpha1", false, "desc");
        Option opt2 = new Option("a", "alpha2", false, "desc");
        assertFalse(opt1.equals(opt2));
    }

    @Test
    public void testEquals_SameOptAndLongOpt() {
        Option opt1 = new Option("a", "alpha", false, "desc1");
        Option opt2 = new Option("a", "alpha", true, "desc2");
        // equals ตรวจสอบเฉพาะ opt & longOpt ไม่รวม description/hasArg
        assertTrue(opt1.equals(opt2));
        assertEquals(opt1.hashCode(), opt2.hashCode());
    }

    @Test
    public void testEquals_BothLongOptNull() {
        Option opt1 = new Option("a", "desc1");
        Option opt2 = new Option("a", "desc2");
        assertTrue(opt1.equals(opt2));
    }

    // ---------- clone ----------

    @Test
    public void testClone_IndependentValuesList() {
        Option opt = new Option("a", "desc");
        opt.setArgs(2);
        opt.addValueForProcessing("v1");

        Option clone = (Option) opt.clone();
        assertEquals(opt.getOpt(), clone.getOpt());
        assertEquals(opt.getValuesList().size(), clone.getValuesList().size());

        clone.addValueForProcessing("v2");
        assertEquals(1, opt.getValuesList().size());
        assertEquals(2, clone.getValuesList().size());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_*` | `if (hasArg)` true/false, การส่งผ่าน longOpt null/ไม่ null |
| `testGetId_FromShortOpt` | `getKey()` เมื่อ `opt != null` (ทางอ้อมผ่าน getId) |
| `testHasLongOpt_*` | `longOpt != null` true/false |
| `testHasArg_*` (4 เคส) | `numberOfArgs > 0`, `== UNLIMITED_VALUES`, ค่าอื่นทำให้ false |
| `testHasArgs_*` (4 เคส) | `numberOfArgs > 1`, `== UNLIMITED_VALUES`, กรณี false (1, 0) |
| `testHasArgName_*` | `argName != null`, `argName.length() > 0` ทั้ง true/false/null |
| `testHasValueSeparator_*` | `valuesep > 0` true/false |
| `testHasOptionalArg_*`, `testRequired_*`, `testType_*` | getter/setter ตรงไปตรงมา (ไม่มี branch ซับซ้อน) |
| `testAddValueForProcessing_Uninitialized_Throws` | `switch` case `UNINITIALIZED` → throw |
| `testAddValueForProcessing_NoSeparator` | `processValue`: `hasValueSeparator()==false` |
| `testAddValueForProcessing_WithSeparator_NaturalExit` | while-loop ออกจาก loop ตามธรรมชาติ (`index==-1`) |
| `testAddValueForProcessing_WithSeparator_MultipleIterations` | while-loop วนหลายรอบไม่ break |
| `testAddValueForProcessing_WithSeparator_BreakOnCapacity` | `if (values.size()==(numberOfArgs-1)) break` หลัง iterate 1 รอบ |
| `testAddValueForProcessing_WithSeparator_BreakImmediately` | break เกิดขึ้นทันทีตั้งแต่รอบแรก (boundary n-1=0) |
| `testAdd_ThrowsWhenListFull` | `add()`: `acceptsArg()==false` → throw |
| `testAcceptsArg_OptionalArgAllowsAddsWhenArgsLteZero` | `acceptsArg()`: เงื่อนไข `hasOptionalArg()` true, `numberOfArgs<=0` true |
| `testGetValue_*`, `testGetValueIndex_*`, `testGetValueDefault_*` | `hasNoValues()` true/false, `value != null` ใน `getValue(String)`, IndexOutOfBounds เมื่อมี values แต่ index ผิด |
| `testGetValues_*` | `hasNoValues()` true/false ใน `getValues()` |
| `testGetValuesList` | คืนค่า list ตรง ๆ |
| `testClearValues` | ล้างค่า list |
| `testAddValue_ThrowsUnsupported` | `addValue()` throw เสมอ |
| `testRequiresArg_*` (5 เคส) | `optionalArg==true`→false, `numberOfArgs==UNLIMITED_VALUES` (`values.size()<1` true/false), else-branch (`acceptsArg()` true/false) |
| `testToString_*` (5 เคส) | `longOpt != null`, `hasArgs()` true, `hasArg()` true (else-if), ไม่มี ARG เลย, `type != null` |
| `testEquals_*` (7 เคส) | `this==o`, `o==null`, `getClass()!=o.getClass()`, `opt` ต่าง/เหมือน (รวมทั้ง null), `longOpt` ต่าง/เหมือน (รวมทั้ง null) |
| `testClone_IndependentValuesList` | `clone()` เส้นทาง success + ยืนยันว่า `values` list เป็น deep-copy (ไม่ share reference) |

**หมายเหตุจุดที่ไม่ครอบคลุมโดยเจตนา:** branch `catch(CloneNotSupportedException)` ใน `clone()`, branch `opt==null` ใน `getKey()`, และ path การ throw `IllegalArgumentException` จาก `OptionValidator.validateOption()` — เนื่องจากไม่มีซอร์สโค้ดของ `OptionValidator` และไม่สามารถ trigger ผ่าน public API ที่ให้มาได้ตามข้อกำหนดห้ามเดา behavior
# JUnit 4 Test Suite: OptionBuilderTest

## การวิเคราะห์โครงสร้างโค้ด

จากการวิเคราะห์ซอร์สโค้ด `OptionBuilder` พบว่า:
- **ไม่มี loop** ในคลาสนี้เลย (ไม่ต้องพิจารณา loop coverage)
- มี **if/else branch** เพียงจุดเดียวใน `create()`: `if (longopt == null)`
- มี **ternary branch** เพียงจุดเดียวใน `hasArg(boolean)`: `hasArg ? 1 : Option.UNINITIALIZED`
- มี **try/finally** ใน `create(String)` ที่ต้อง `reset()` เสมอไม่ว่าจะสำเร็จหรือ error
- Method อื่น ๆ เป็นการ assign ค่าตรง ๆ ไม่มี branch

⚠️ **หมายเหตุสำคัญ**: คลาส `OptionBuilder` ใช้ static field ร่วมกันทุก instance (ไม่ thread-safe ตาม javadoc) จึงต้อง reset state ก่อนทุก test ด้วย `@Before` เพื่อป้องกัน test pollution

⚠️ **ข้อสมมติที่ไม่แน่ใจ**: การ validate รูปแบบ `opt` (เช่น ตัวเลขหรืออักขระพิเศษ) เกิดขึ้นภายใน `Option` constructor ซึ่ง **ไม่มีซอร์สโค้ดให้** ผมจึงไม่เขียน test ที่เดาว่า opt ใด valid/invalid แต่จะทดสอบเฉพาะ behavior ที่ระบุไว้ชัดใน `OptionBuilder` เอง (เช่น การ throw เมื่อ `longopt == null`)

```java
package org.apache.commons.cli;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OptionBuilderTest
{
    /**
     * OptionBuilder เก็บ state เป็น static field ร่วมกันทุกครั้งที่เรียก
     * (ไม่ thread-safe ตาม javadoc ของคลาส) จึงต้อง reset ก่อนทุก test
     * โดยใช้ path ปกติของโค้ด (create(String) จะ reset ใน finally เสมอ)
     */
    @Before
    public void resetBuilderState()
    {
        OptionBuilder.withLongOpt("__reset__").create();
    }

    // ---------- withLongOpt ----------

    @Test
    public void testWithLongOpt_setsValue()
    {
        Option opt = OptionBuilder.withLongOpt("verbose").create();
        assertEquals("verbose", opt.getLongOpt());
        assertNull(opt.getOpt()); // create() -> create(null)
    }

    @Test
    public void testWithLongOpt_null()
    {
        Option opt = OptionBuilder.withLongOpt(null).create("a");
        assertNull(opt.getLongOpt());
        assertEquals("a", opt.getOpt());
    }

    // ---------- create() : if/else branch ----------

    @Test
    public void testCreateNoArg_longOptNull_throwsException()
    {
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException when longopt is null");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("must specify longopt", e.getMessage());
        }
    }

    @Test
    public void testCreateNoArg_resetsStateAfterException()
    {
        OptionBuilder.withDescription("leaked").isRequired().hasArgs(5);
        try
        {
            OptionBuilder.create(); // longopt is null -> should reset() then throw
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        // ตรวจว่า state ถูก reset จริง ไม่มี "leaked" ค่าเดิมหลุดมา
        Option opt = OptionBuilder.create("z");
        assertNull(opt.getDescription());
        assertFalse(opt.isRequired());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
    }

    @Test
    public void testCreateNoArg_longOptSet_success()
    {
        Option opt = OptionBuilder.withLongOpt("output").create();
        assertEquals("output", opt.getLongOpt());
        assertNull(opt.getOpt());
    }

    // ---------- hasArg() ----------

    @Test
    public void testHasArg_setsOne()
    {
        Option opt = OptionBuilder.hasArg().create("a");
        assertEquals(1, opt.getArgs());
    }

    // ---------- hasArg(boolean) : ternary branch ----------

    @Test
    public void testHasArgBoolean_true()
    {
        Option opt = OptionBuilder.hasArg(true).create("a");
        assertEquals(1, opt.getArgs());
    }

    @Test
    public void testHasArgBoolean_false()
    {
        Option opt = OptionBuilder.hasArg(false).create("a");
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
    }

    // ---------- hasArgs() ----------

    @Test
    public void testHasArgs_setsUnlimited()
    {
        Option opt = OptionBuilder.hasArgs().create("a");
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
    }

    // ---------- hasArgs(int) ----------

    @Test
    public void testHasArgsInt_normalValue()
    {
        Option opt = OptionBuilder.hasArgs(3).create("a");
        assertEquals(3, opt.getArgs());
    }

    @Test
    public void testHasArgsInt_boundaryZero()
    {
        Option opt = OptionBuilder.hasArgs(0).create("a");
        assertEquals(0, opt.getArgs());
    }

    // ---------- hasOptionalArg() ----------

    @Test
    public void testHasOptionalArg()
    {
        Option opt = OptionBuilder.hasOptionalArg().create("a");
        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    // ---------- hasOptionalArgs() ----------

    @Test
    public void testHasOptionalArgs()
    {
        Option opt = OptionBuilder.hasOptionalArgs().create("a");
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    // ---------- hasOptionalArgs(int) ----------

    @Test
    public void testHasOptionalArgsInt()
    {
        Option opt = OptionBuilder.hasOptionalArgs(4).create("a");
        assertEquals(4, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    // ---------- isRequired() ----------

    @Test
    public void testIsRequired()
    {
        Option opt = OptionBuilder.isRequired().create("a");
        assertTrue(opt.isRequired());
    }

    // ---------- isRequired(boolean) ----------

    @Test
    public void testIsRequiredBoolean_true()
    {
        Option opt = OptionBuilder.isRequired(true).create("a");
        assertTrue(opt.isRequired());
    }

    @Test
    public void testIsRequiredBoolean_false()
    {
        Option opt = OptionBuilder.isRequired(false).create("a");
        assertFalse(opt.isRequired());
    }

    @Test
    public void testIsRequired_defaultIsFalse()
    {
        Option opt = OptionBuilder.create("a");
        assertFalse(opt.isRequired());
    }

    // ---------- withArgName ----------

    @Test
    public void testWithArgName_setsValue()
    {
        Option opt = OptionBuilder.withArgName("file").create("a");
        assertEquals("file", opt.getArgName());
    }

    @Test
    public void testWithArgName_null()
    {
        Option opt = OptionBuilder.withArgName(null).create("a");
        assertNull(opt.getArgName());
    }

    // ---------- withValueSeparator(char) ----------

    @Test
    public void testWithValueSeparatorChar()
    {
        Option opt = OptionBuilder.withValueSeparator(':').create("a");
        assertEquals(':', opt.getValueSeparator());
    }

    // ---------- withValueSeparator() ----------

    @Test
    public void testWithValueSeparatorNoArg_setsEquals()
    {
        Option opt = OptionBuilder.withValueSeparator().create("a");
        assertEquals('=', opt.getValueSeparator());
    }

    @Test
    public void testValueSeparator_defaultIsZeroChar()
    {
        Option opt = OptionBuilder.create("a");
        assertEquals((char) 0, opt.getValueSeparator());
    }

    // ---------- withType ----------

    @Test
    public void testWithType_setsValue()
    {
        Option opt = OptionBuilder.withType(String.class).create("a");
        assertEquals(String.class, opt.getType());
    }

    @Test
    public void testWithType_defaultIsNull()
    {
        Option opt = OptionBuilder.create("a");
        assertNull(opt.getType());
    }

    // ---------- withDescription ----------

    @Test
    public void testWithDescription_setsValue()
    {
        Option opt = OptionBuilder.withDescription("my description").create("a");
        assertEquals("my description", opt.getDescription());
    }

    @Test
    public void testWithDescription_null()
    {
        Option opt = OptionBuilder.withDescription(null).create("a");
        assertNull(opt.getDescription());
    }

    // ---------- create(char) delegation ----------

    @Test
    public void testCreateChar_delegatesToCreateString()
    {
        Option opt = OptionBuilder.create('x');
        assertEquals("x", opt.getOpt());
    }

    @Test
    public void testCreateChar_withOtherProperties()
    {
        Option opt = OptionBuilder.withLongOpt("extra").hasArg().create('e');
        assertEquals("e", opt.getOpt());
        assertEquals("extra", opt.getLongOpt());
        assertEquals(1, opt.getArgs());
    }

    // ---------- create(String) : multi-char opt ----------

    @Test
    public void testCreateString_multiCharOpt()
    {
        Option opt = OptionBuilder.create("version");
        assertEquals("version", opt.getOpt());
    }

    // ---------- try/finally reset behaviour (critical regression test) ----------

    @Test
    public void testCreateString_resetsStateAfterSuccessfulCreate()
    {
        // ตั้งค่าครบทุก property
        Option first = OptionBuilder
                .withDescription("first-desc")
                .isRequired()
                .hasArgs(2)
                .withArgName("num")
                .withType(Integer.class)
                .withValueSeparator(':')
                .withLongOpt("longOne")
                .create("a");

        // sanity check ของ option แรก
        assertEquals("first-desc", first.getDescription());
        assertTrue(first.isRequired());
        assertEquals(2, first.getArgs());
        assertEquals("longOne", first.getLongOpt());

        // สร้าง option ที่ 2 โดยไม่เรียก builder method ใด ๆ เลย
        // ถ้า reset() ทำงานถูกต้อง ค่าทุกอย่างต้องเป็นค่า default ไม่หลุดมาจาก option แรก
        Option second = OptionBuilder.create("b");

        assertNull(second.getDescription());
        assertFalse(second.isRequired());
        assertEquals(Option.UNINITIALIZED, second.getArgs());
        assertNull(second.getArgName());
        assertNull(second.getType());
        assertEquals((char) 0, second.getValueSeparator());
        assertNull(second.getLongOpt());
        assertFalse(second.hasOptionalArg());
    }

    // ---------- fluent API returns singleton instance ----------

    @Test
    public void testFluentApi_returnsSameInstance()
    {
        OptionBuilder b1 = OptionBuilder.withLongOpt("a");
        OptionBuilder b2 = OptionBuilder.hasArg();
        OptionBuilder b3 = OptionBuilder.isRequired();
        assertSame(b1, b2);
        assertSame(b2, b3);
    }

    // ---------- combined complex build (integration-style) ----------

    @Test
    public void testCreateString_allPropertiesCombined()
    {
        Option opt = OptionBuilder
                .withLongOpt("compress")
                .withDescription("compress files")
                .hasOptionalArgs(3)
                .withArgName("level")
                .withType(Number.class)
                .withValueSeparator(',')
                .isRequired(true)
                .create("c");

        assertEquals("c", opt.getOpt());
        assertEquals("compress", opt.getLongOpt());
        assertEquals("compress files", opt.getDescription());
        assertEquals(3, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
        assertEquals("level", opt.getArgName());
        assertEquals(Number.class, opt.getType());
        assertEquals(',', opt.getValueSeparator());
        assertTrue(opt.isRequired());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testWithLongOpt_setsValue`, `testWithLongOpt_null` | `withLongOpt()` – ค่าปกติ/null |
| `testCreateNoArg_longOptNull_throwsException` | `create()`: `if (longopt == null)` → **true branch** (throw) |
| `testCreateNoArg_resetsStateAfterException` | ตรวจว่า `reset()` ถูกเรียกก่อน throw จริง (regression) |
| `testCreateNoArg_longOptSet_success` | `create()`: `if (longopt == null)` → **false branch** → `create(null)` |
| `testHasArg_setsOne` | `hasArg()` assign ตรง |
| `testHasArgBoolean_true` | `hasArg(boolean)` ternary → **true branch** |
| `testHasArgBoolean_false` | `hasArg(boolean)` ternary → **false branch** |
| `testHasArgs_setsUnlimited` | `hasArgs()` |
| `testHasArgsInt_normalValue`, `testHasArgsInt_boundaryZero` | `hasArgs(int)` ค่าปกติ/ขอบ (0) |
| `testHasOptionalArg` | `hasOptionalArg()` |
| `testHasOptionalArgs` | `hasOptionalArgs()` |
| `testHasOptionalArgsInt` | `hasOptionalArgs(int)` |
| `testIsRequired`, `testIsRequired_defaultIsFalse` | `isRequired()` และค่า default |
| `testIsRequiredBoolean_true/false` | `isRequired(boolean)` ทั้งสองค่า |
| `testWithArgName_setsValue`, `testWithArgName_null` | `withArgName()` ปกติ/null |
| `testWithValueSeparatorChar` | `withValueSeparator(char)` |
| `testWithValueSeparatorNoArg_setsEquals` | `withValueSeparator()` (no-arg, ตั้ง `=`) |
| `testValueSeparator_defaultIsZeroChar` | ค่า default ของ `valuesep` |
| `testWithType_setsValue`, `testWithType_defaultIsNull` | `withType()` ปกติ/default |
| `testWithDescription_setsValue`, `testWithDescription_null` | `withDescription()` ปกติ/null |
| `testCreateChar_delegatesToCreateString`, `testCreateChar_withOtherProperties` | `create(char)` การ delegate ไปยัง `create(String)` |
| `testCreateString_multiCharOpt` | `create(String)` opt หลายตัวอักษร |
| `testCreateString_resetsStateAfterSuccessfulCreate` | try/finally ของ `create(String)` – **reset ถูกเรียกแม้ create สำเร็จ** (critical regression test สำหรับจับ fault ด้าน state leakage) |
| `testFluentApi_returnsSameInstance` | ตรวจ singleton pattern ของ instance คงที่ |
| `testCreateString_allPropertiesCombined` | integration test รวมทุก property พร้อมกัน |

**หมายเหตุปิดท้าย**: เนื่องจากไม่มีซอร์สโค้ดของคลาส `Option` ให้ตรวจสอบ logic การ validate `opt` string จึงไม่มี test case ที่ระบุว่า opt แบบใด "invalid" (เช่น ตัวเลขหรืออักขระพิเศษ) เพื่อไม่ให้เดา behavior ที่ไม่มีหลักฐานยืนยันในซอร์สที่ให้มา
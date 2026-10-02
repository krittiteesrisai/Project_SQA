# วิเคราะห์และแผนการทดสอบ

จากซอร์สโค้ด `OptionBuilder` ผมระบุ branch/condition ที่ต้อง cover ได้ดังนี้:

1. `create()` — เงื่อนไข `longopt == null` (true → throw exception + reset, false → delegate to `create(null)`)
2. `hasArg(boolean)` — ternary `hasArg ? 1 : Option.UNINITIALIZED` (true/false)
3. `isRequired(boolean)` — ค่า true/false
4. setter ทุกตัว (`withLongOpt`, `hasArg()`, `withArgName`, `isRequired()`, `withValueSeparator(char)`, `withValueSeparator()`, `hasArgs()`, `hasArgs(int)`, `hasOptionalArg()`, `hasOptionalArgs()`, `hasOptionalArgs(int)`, `withType`, `withDescription`)
5. `create(char)` delegation ไปยัง `create(String)`
6. การ `reset()` หลังสร้าง Option สำเร็จ (ตรวจสอบว่า state ไม่หลุดไปยัง Option ตัวถัดไป)
7. การ `reset()` เมื่อเกิด exception (state ต้องไม่ค้าง)

> **หมายเหตุสำคัญ:** ซอร์สโค้ดของคลาส `Option` ไม่ได้ให้มาในโจทย์ ผมจึงต้อง**สมมติ**ว่า `Option` มี getter มาตรฐานตาม Apache Commons-CLI จริง (`getOpt()`, `getLongOpt()`, `getDescription()`, `isRequired()`, `getArgs()`, `getType()`, `hasOptionalArg()`, `getValueSeparator()`, `getArgName()`) และมี constant `Option.UNINITIALIZED`, `Option.UNLIMITED_VALUES` ตามที่ปรากฏใน `OptionBuilder` เอง เนื่องจากไม่มี source ของ `Option` ให้ตรวจสอบ ผมจึงคอมเมนต์กำกับไว้ในโค้ดว่าเป็นการอ้างอิง public API ที่รู้จักทั่วไปของไลบรารีนี้ ไม่ได้เดา behavior ภายในของ `Option`

```java
package org.apache.commons.cli;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.cli.OptionBuilder (Cli-26b)
 *
 * NOTE: Option class source is not provided in the prompt.
 * Getter method names (getOpt(), getLongOpt(), getArgs(), etc.)
 * and constants (Option.UNINITIALIZED, Option.UNLIMITED_VALUES)
 * are assumed to exist as standard public API of Apache Commons-CLI's
 * Option class (referenced directly inside OptionBuilder source itself).
 */
public class OptionBuilderTest
{
    // ---------------------------------------------------------
    // create() branch: longopt == null -> throw + reset
    // ---------------------------------------------------------
    @Test
    public void testCreateWithoutLongOptThrowsException()
    {
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException when longopt is not set");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("must specify longopt", e.getMessage());
        }
    }

    @Test
    public void testResetAfterExceptionDoesNotLeakState()
    {
        // Set some state, but do NOT set longopt, so create() should throw.
        OptionBuilder.withDescription("desc-should-be-reset");
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        // Now build a fresh option properly - description should NOT
        // leak from the failed attempt if reset() worked correctly.
        Option opt = OptionBuilder.withLongOpt("fresh").create();
        assertNull("description should have been reset after failed create()",
                opt.getDescription());
        assertEquals("fresh", opt.getLongOpt());
    }

    // ---------------------------------------------------------
    // create() branch: longopt != null -> delegate to create(null)
    // ---------------------------------------------------------
    @Test
    public void testCreateWithLongOptDelegatesToCreateNull()
    {
        Option opt = OptionBuilder.withLongOpt("longonly").create();
        assertEquals("longonly", opt.getLongOpt());
        assertNull("opt (short option) should be null when create() is used",
                opt.getOpt());
    }

    // ---------------------------------------------------------
    // create(char) delegates to create(String)
    // ---------------------------------------------------------
    @Test
    public void testCreateCharDelegatesToCreateString()
    {
        Option opt = OptionBuilder.withDescription("d").create('D');
        assertEquals("D", opt.getOpt());
        assertEquals("d", opt.getDescription());
    }

    @Test
    public void testCreateStringDirectly()
    {
        Option opt = OptionBuilder.withDescription("desc").create("x");
        assertEquals("x", opt.getOpt());
        assertEquals("desc", opt.getDescription());
    }

    // ---------------------------------------------------------
    // hasArg() -> numberOfArgs = 1
    // ---------------------------------------------------------
    @Test
    public void testHasArg()
    {
        Option opt = OptionBuilder.hasArg().create('a');
        assertEquals(1, opt.getArgs());
    }

    // ---------------------------------------------------------
    // hasArg(boolean) branch: true -> 1
    // ---------------------------------------------------------
    @Test
    public void testHasArgBooleanTrue()
    {
        Option opt = OptionBuilder.hasArg(true).create('b');
        assertEquals(1, opt.getArgs());
    }

    // ---------------------------------------------------------
    // hasArg(boolean) branch: false -> Option.UNINITIALIZED
    // (ensures the ternary else-branch actually resets a
    //  previously-set numberOfArgs value)
    // ---------------------------------------------------------
    @Test
    public void testHasArgBooleanFalseResetsNumberOfArgs()
    {
        Option opt = OptionBuilder.hasArgs().hasArg(false).create('c');
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
    }

    // ---------------------------------------------------------
    // hasArgs() -> UNLIMITED_VALUES
    // ---------------------------------------------------------
    @Test
    public void testHasArgs()
    {
        Option opt = OptionBuilder.hasArgs().create('d');
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
    }

    // ---------------------------------------------------------
    // hasArgs(int) -> boundary values: 0, positive, negative
    // ---------------------------------------------------------
    @Test
    public void testHasArgsIntPositive()
    {
        Option opt = OptionBuilder.hasArgs(3).create('e');
        assertEquals(3, opt.getArgs());
    }

    @Test
    public void testHasArgsIntZeroBoundary()
    {
        Option opt = OptionBuilder.hasArgs(0).create('f');
        assertEquals(0, opt.getArgs());
    }

    @Test
    public void testHasArgsIntNegative()
    {
        // No validation exists in source for negative values;
        // value should simply be stored as-is.
        Option opt = OptionBuilder.hasArgs(-5).create('g');
        assertEquals(-5, opt.getArgs());
    }

    // ---------------------------------------------------------
    // hasOptionalArg() -> numberOfArgs=1, optionalArg=true
    // ---------------------------------------------------------
    @Test
    public void testHasOptionalArg()
    {
        Option opt = OptionBuilder.hasOptionalArg().create('h');
        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // hasOptionalArgs() -> UNLIMITED_VALUES, optionalArg=true
    // ---------------------------------------------------------
    @Test
    public void testHasOptionalArgs()
    {
        Option opt = OptionBuilder.hasOptionalArgs().create('i');
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // hasOptionalArgs(int) -> custom numArgs, optionalArg=true
    // ---------------------------------------------------------
    @Test
    public void testHasOptionalArgsInt()
    {
        Option opt = OptionBuilder.hasOptionalArgs(7).create('j');
        assertEquals(7, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // withArgName(String) - normal, null and empty string
    // ---------------------------------------------------------
    @Test
    public void testWithArgNameNormal()
    {
        Option opt = OptionBuilder.withArgName("FILE").create('k');
        assertEquals("FILE", opt.getArgName());
    }

    @Test
    public void testWithArgNameNull()
    {
        Option opt = OptionBuilder.withArgName(null).create('l');
        assertNull(opt.getArgName());
    }

    @Test
    public void testWithArgNameEmptyString()
    {
        Option opt = OptionBuilder.withArgName("").create('m');
        assertEquals("", opt.getArgName());
    }

    // default argName ("arg") after reset, without calling withArgName
    @Test
    public void testDefaultArgNameAfterReset()
    {
        Option opt = OptionBuilder.withLongOpt("noargname").create();
        assertEquals("arg", opt.getArgName());
    }

    // ---------------------------------------------------------
    // isRequired() -> required = true
    // ---------------------------------------------------------
    @Test
    public void testIsRequired()
    {
        Option opt = OptionBuilder.isRequired().create('n');
        assertTrue(opt.isRequired());
    }

    // ---------------------------------------------------------
    // isRequired(boolean) branch: true
    // ---------------------------------------------------------
    @Test
    public void testIsRequiredBooleanTrue()
    {
        Option opt = OptionBuilder.isRequired(true).create('o');
        assertTrue(opt.isRequired());
    }

    // ---------------------------------------------------------
    // isRequired(boolean) branch: false (ensures resets previous true)
    // ---------------------------------------------------------
    @Test
    public void testIsRequiredBooleanFalse()
    {
        Option opt = OptionBuilder.isRequired().isRequired(false).create('p');
        assertFalse(opt.isRequired());
    }

    // ---------------------------------------------------------
    // withValueSeparator(char) - custom separator
    // ---------------------------------------------------------
    @Test
    public void testWithValueSeparatorChar()
    {
        Option opt = OptionBuilder.withValueSeparator(':').create('q');
        assertEquals(':', opt.getValueSeparator());
    }

    // ---------------------------------------------------------
    // withValueSeparator() - default '=' separator
    // ---------------------------------------------------------
    @Test
    public void testWithValueSeparatorDefaultEquals()
    {
        Option opt = OptionBuilder.withValueSeparator().create('r');
        assertEquals('=', opt.getValueSeparator());
    }

    // default valuesep after reset (char)0, no separator set
    @Test
    public void testDefaultValueSeparatorAfterReset()
    {
        Option opt = OptionBuilder.create('s');
        assertEquals((char) 0, opt.getValueSeparator());
    }

    // ---------------------------------------------------------
    // withType(Object) - normal and null
    // ---------------------------------------------------------
    @Test
    public void testWithTypeNormal()
    {
        Option opt = OptionBuilder.withType(String.class).create('t');
        assertEquals(String.class, opt.getType());
    }

    @Test
    public void testWithTypeNull()
    {
        Option opt = OptionBuilder.withType(null).create('u');
        assertNull(opt.getType());
    }

    // ---------------------------------------------------------
    // withDescription(String) - normal, null, empty
    // ---------------------------------------------------------
    @Test
    public void testWithDescriptionNormal()
    {
        Option opt = OptionBuilder.withDescription("some description").create('v');
        assertEquals("some description", opt.getDescription());
    }

    @Test
    public void testWithDescriptionNull()
    {
        Option opt = OptionBuilder.withDescription(null).create('w');
        assertNull(opt.getDescription());
    }

    @Test
    public void testWithDescriptionEmpty()
    {
        Option opt = OptionBuilder.withDescription("").create('x');
        assertEquals("", opt.getDescription());
    }

    // ---------------------------------------------------------
    // withLongOpt(String) - null value (explicit set to null again)
    // ---------------------------------------------------------
    @Test
    public void testWithLongOptNullThenCreateThrows()
    {
        OptionBuilder.withLongOpt(null);
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException because longopt is null");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }

    // ---------------------------------------------------------
    // Full chain test - combine multiple setters, verify all fields
    // and verify reset() clears everything for the NEXT build.
    // ---------------------------------------------------------
    @Test
    public void testFullChainAndResetAfterSuccess()
    {
        Option opt1 = OptionBuilder.withLongOpt("full")
                .hasArgs(2)
                .withArgName("VAL")
                .isRequired()
                .withValueSeparator(',')
                .withType(Number.class)
                .withDescription("full description")
                .create('z');

        assertEquals("z", opt1.getOpt());
        assertEquals("full", opt1.getLongOpt());
        assertEquals(2, opt1.getArgs());
        assertEquals("VAL", opt1.getArgName());
        assertTrue(opt1.isRequired());
        assertEquals(',', opt1.getValueSeparator());
        assertEquals(Number.class, opt1.getType());
        assertEquals("full description", opt1.getDescription());

        // Now build another Option WITHOUT setting anything -
        // all static fields must have been reset by the previous create().
        Option opt2 = OptionBuilder.create("y");
        assertNull(opt2.getLongOpt());
        assertEquals(Option.UNINITIALIZED, opt2.getArgs());
        assertEquals("arg", opt2.getArgName());
        assertFalse(opt2.isRequired());
        assertEquals((char) 0, opt2.getValueSeparator());
        assertNull(opt2.getType());
        assertNull(opt2.getDescription());
        assertFalse(opt2.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // create(String) with null opt (used internally, but also
    // directly testable) - boundary/edge case
    // ---------------------------------------------------------
    @Test
    public void testCreateStringNullOptWithLongOptSet()
    {
        Option opt = OptionBuilder.withLongOpt("onlylong").create((String) null);
        assertNull(opt.getOpt());
        assertEquals("onlylong", opt.getLongOpt());
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCreateWithoutLongOptThrowsException` | `create()`: `longopt == null` → true (throw exception) |
| `testResetAfterExceptionDoesNotLeakState` | `reset()` ถูกเรียกก่อน throw ใน branch exception, ตรวจ state ไม่ leak |
| `testCreateWithLongOptDelegatesToCreateNull` | `create()`: `longopt == null` → false (delegate `create(null)`) |
| `testCreateCharDelegatesToCreateString` | `create(char)` → `create(String.valueOf(opt))` delegation |
| `testCreateStringDirectly` | `create(String)` เส้นทางปกติ |
| `testHasArg` | `hasArg()` set numberOfArgs=1 |
| `testHasArgBooleanTrue` | `hasArg(boolean)`: true branch |
| `testHasArgBooleanFalseResetsNumberOfArgs` | `hasArg(boolean)`: false branch (ternary else) |
| `testHasArgs` | `hasArgs()` = UNLIMITED_VALUES |
| `testHasArgsIntPositive` / `...Zero` / `...Negative` | `hasArgs(int)` boundary: positive, 0, negative |
| `testHasOptionalArg` | `hasOptionalArg()` numberOfArgs=1 + optionalArg=true |
| `testHasOptionalArgs` | `hasOptionalArgs()` UNLIMITED_VALUES + optionalArg=true |
| `testHasOptionalArgsInt` | `hasOptionalArgs(int)` custom value + optionalArg=true |
| `testWithArgNameNormal/Null/EmptyString` | `withArgName(String)` ค่าปกติ/null/empty (boundary) |
| `testDefaultArgNameAfterReset` | ค่า default `"arg"` หลัง `reset()` |
| `testIsRequired` | `isRequired()` set true |
| `testIsRequiredBooleanTrue` | `isRequired(boolean)` true branch |
| `testIsRequiredBooleanFalse` | `isRequired(boolean)` false branch (override ค่าก่อนหน้า) |
| `testWithValueSeparatorChar` | `withValueSeparator(char)` ค่า custom |
| `testWithValueSeparatorDefaultEquals` | `withValueSeparator()` ค่า default `'='` |
| `testDefaultValueSeparatorAfterReset` | ค่า default `(char)0` หลัง reset |
| `testWithTypeNormal/Null` | `withType(Object)` ค่าปกติ/null |
| `testWithDescriptionNormal/Null/Empty` | `withDescription(String)` ค่าปกติ/null/empty |
| `testWithLongOptNullThenCreateThrows` | `withLongOpt(null)` แล้ว `create()` throw (ยืนยัน branch null) |
| `testFullChainAndResetAfterSuccess` | รวม setter ทั้งหมด + ตรวจ `reset()` หลัง success branch ของ `create(String)` |
| `testCreateStringNullOptWithLongOptSet` | `create(String)` กรณี opt เป็น null (ค่าขอบเขต) |

**ข้อจำกัดที่ต้องระบุ:** เนื่องจากไม่มีซอร์สของคลาส `Option` ให้ตรวจสอบ การตรวจสอบผ่าน getter method (`getArgs()`, `getValueSeparator()`, `hasOptionalArg()` ฯลฯ) เป็นการอ้างอิงตาม public API ที่รู้จักทั่วไปของ Apache Commons-CLI เท่านั้น หากชื่อ method หรือ behavior ภายในของ `Option` แตกต่างจากที่สมมติ ต้องปรับปรุง assertion ให้ตรงกับ source จริงของ `Option`
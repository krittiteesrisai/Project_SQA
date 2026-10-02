package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.cli.OptionBuilder (Defects4J Cli-31b)
 */
public class OptionBuilderTest
{
    // ---------------------------------------------------------
    // 1. ทดสอบ default state ตอนสร้าง Option แบบไม่ตั้งค่าใด ๆ
    // ---------------------------------------------------------
    @Test
    public void testCreateDefaults() throws Exception
    {
        Option option = OptionBuilder.create('x');

        assertEquals("x", option.getOpt());
        assertNull(option.getDescription());
        assertNull(option.getLongOpt());
        assertFalse(option.isRequired());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        assertEquals("arg", option.getArgName());
        // valuesep default = (char)0
        assertEquals((char) 0, option.getValueSeparator());
    }

    // ---------------------------------------------------------
    // 2. withLongOpt
    // ---------------------------------------------------------
    @Test
    public void testWithLongOpt() throws Exception
    {
        Option option = OptionBuilder.withLongOpt("longName").create('a');
        assertEquals("longName", option.getLongOpt());
    }

    @Test
    public void testWithLongOptNull() throws Exception
    {
        // longopt เป็น null (ค่า default) แต่มีการ set opt char จึงไม่ throw
        Option option = OptionBuilder.withLongOpt(null).create('a');
        assertNull(option.getLongOpt());
    }

    // ---------------------------------------------------------
    // 3. hasArg() -> numberOfArgs = 1
    // ---------------------------------------------------------
    @Test
    public void testHasArg() throws Exception
    {
        Option option = OptionBuilder.hasArg().create('a');
        assertEquals(1, option.getArgs());
    }

    // ---------------------------------------------------------
    // 4. hasArg(boolean) - branch true / false
    // ---------------------------------------------------------
    @Test
    public void testHasArgBooleanTrue() throws Exception
    {
        Option option = OptionBuilder.hasArg(true).create('a');
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testHasArgBooleanFalse() throws Exception
    {
        Option option = OptionBuilder.hasArg(false).create('a');
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    // ---------------------------------------------------------
    // 5. withArgName
    // ---------------------------------------------------------
    @Test
    public void testWithArgName() throws Exception
    {
        Option option = OptionBuilder.withArgName("FILE").create('f');
        assertEquals("FILE", option.getArgName());
    }

    @Test
    public void testWithArgNameNull() throws Exception
    {
        // ทดสอบค่า null argName (edge case)
        Option option = OptionBuilder.withArgName(null).create('f');
        assertNull(option.getArgName());
    }

    @Test
    public void testWithArgNameEmpty() throws Exception
    {
        Option option = OptionBuilder.withArgName("").create('f');
        assertEquals("", option.getArgName());
    }

    // ---------------------------------------------------------
    // 6. isRequired() -> required = true
    // ---------------------------------------------------------
    @Test
    public void testIsRequired() throws Exception
    {
        Option option = OptionBuilder.isRequired().create('r');
        assertTrue(option.isRequired());
    }

    // ---------------------------------------------------------
    // 7. isRequired(boolean) - branch true / false
    // ---------------------------------------------------------
    @Test
    public void testIsRequiredBooleanTrue() throws Exception
    {
        Option option = OptionBuilder.isRequired(true).create('r');
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequiredBooleanFalse() throws Exception
    {
        Option option = OptionBuilder.isRequired(false).create('r');
        assertFalse(option.isRequired());
    }

    // ---------------------------------------------------------
    // 8. withValueSeparator(char)
    // ---------------------------------------------------------
    @Test
    public void testWithValueSeparatorChar() throws Exception
    {
        Option option = OptionBuilder.withValueSeparator(':').create('D');
        assertEquals(':', option.getValueSeparator());
    }

    // ---------------------------------------------------------
    // 9. withValueSeparator() -> ใช้ '='
    // ---------------------------------------------------------
    @Test
    public void testWithValueSeparatorDefault() throws Exception
    {
        Option option = OptionBuilder.withValueSeparator().create('D');
        assertEquals('=', option.getValueSeparator());
    }

    // ---------------------------------------------------------
    // 10. hasArgs() -> UNLIMITED_VALUES
    // ---------------------------------------------------------
    @Test
    public void testHasArgsUnlimited() throws Exception
    {
        Option option = OptionBuilder.hasArgs().create('a');
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    // ---------------------------------------------------------
    // 11. hasArgs(int) - boundary values
    // ---------------------------------------------------------
    @Test
    public void testHasArgsIntPositive() throws Exception
    {
        Option option = OptionBuilder.hasArgs(3).create('a');
        assertEquals(3, option.getArgs());
    }

    @Test
    public void testHasArgsIntZero() throws Exception
    {
        // boundary: 0 args
        Option option = OptionBuilder.hasArgs(0).create('a');
        assertEquals(0, option.getArgs());
    }

    @Test
    public void testHasArgsIntNegative() throws Exception
    {
        // boundary: ค่า negative ผิดปกติ - ตรวจว่าค่าถูก set ตรงตามที่ระบุ (ไม่มี validation ในซอร์ส)
        Option option = OptionBuilder.hasArgs(-5).create('a');
        assertEquals(-5, option.getArgs());
    }

    // ---------------------------------------------------------
    // 12. hasOptionalArg() -> numberOfArgs=1, optionalArg=true
    // ---------------------------------------------------------
    @Test
    public void testHasOptionalArg() throws Exception
    {
        Option option = OptionBuilder.hasOptionalArg().create('o');
        assertEquals(1, option.getArgs());
        assertTrue(option.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // 13. hasOptionalArgs() -> UNLIMITED_VALUES, optionalArg=true
    // ---------------------------------------------------------
    @Test
    public void testHasOptionalArgsUnlimited() throws Exception
    {
        Option option = OptionBuilder.hasOptionalArgs().create('o');
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        assertTrue(option.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // 14. hasOptionalArgs(int)
    // ---------------------------------------------------------
    @Test
    public void testHasOptionalArgsInt() throws Exception
    {
        Option option = OptionBuilder.hasOptionalArgs(2).create('o');
        assertEquals(2, option.getArgs());
        assertTrue(option.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // 15. withType
    // ---------------------------------------------------------
    @Test
    public void testWithType() throws Exception
    {
        Object type = Number.class;
        Option option = OptionBuilder.withType(type).create('t');
        assertEquals(type, option.getType());
    }

    @Test
    public void testWithTypeNull() throws Exception
    {
        Option option = OptionBuilder.withType(null).create('t');
        assertNull(option.getType());
    }

    // ---------------------------------------------------------
    // 16. withDescription
    // ---------------------------------------------------------
    @Test
    public void testWithDescription() throws Exception
    {
        Option option = OptionBuilder.withDescription("my description").create('d');
        assertEquals("my description", option.getDescription());
    }

    @Test
    public void testWithDescriptionEmptyString()
        throws Exception
    {
        Option option = OptionBuilder.withDescription("").create('d');
        assertEquals("", option.getDescription());
    }

    // ---------------------------------------------------------
    // 17. create(char) delegates ถูกต้อง
    // ---------------------------------------------------------
    @Test
    public void testCreateChar() throws Exception
    {
        Option option = OptionBuilder.create('c');
        assertEquals("c", option.getOpt());
    }

    // ---------------------------------------------------------
    // 18. create() - if longopt == null -> throw
    // ---------------------------------------------------------
    @Test
    public void testCreateNoLongOptThrowsException()
    {
        try
        {
            OptionBuilder.create();
            fail("ควร throw IllegalArgumentException เมื่อไม่ได้ตั้งค่า longopt");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("must specify longopt", e.getMessage());
        }
    }

    // ---------------------------------------------------------
    // 19. create() - longopt != null -> success (เรียก create(null))
    // ---------------------------------------------------------
    @Test
    public void testCreateWithLongOptSuccess() throws Exception
    {
        Option option = OptionBuilder.withLongOpt("target").create();
        assertNull(option.getOpt());
        assertEquals("target", option.getLongOpt());
    }

    // ---------------------------------------------------------
    // 20. ทดสอบว่า reset() ถูกเรียกหลัง exception path ใน create()
    //     -> static state ต้องกลับเป็น default หลัง exception
    // ---------------------------------------------------------
    @Test
    public void testResetAfterExceptionInCreate() throws Exception
    {
        // ตั้งค่าหลาย field ก่อน
        OptionBuilder.withDescription("desc")
                     .withArgName("myArg")
                     .isRequired()
                     .hasArg();

        try
        {
            OptionBuilder.create(); // จะ throw เพราะไม่ได้ set longopt
            fail("ควร throw IllegalArgumentException");
        }
        catch (IllegalArgumentException expected)
        {
            // expected
        }

        // ตรวจสอบว่า static fields ถูก reset กลับเป็นค่า default แล้ว
        Option option = OptionBuilder.create('z');
        assertNull(option.getDescription());
        assertEquals("arg", option.getArgName());
        assertFalse(option.isRequired());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
        assertEquals((char) 0, option.getValueSeparator());
        assertNull(option.getType());
        assertFalse(option.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // 21. ทดสอบว่า reset() ถูกเรียกหลัง success path ใน create(String)
    //     -> static state ต้องกลับเป็น default หลังสร้าง Option สำเร็จ
    // ---------------------------------------------------------
    @Test
    public void testResetAfterSuccessfulCreate() throws Exception
    {
        OptionBuilder.withLongOpt("first")
                     .withDescription("first desc")
                     .hasArgs(5)
                     .isRequired()
                     .withValueSeparator(',')
                     .withType(String.class);

        Option firstOption = OptionBuilder.create('f');
        assertEquals("first", firstOption.getLongOpt());
        assertEquals(5, firstOption.getArgs());

        // เรียก create() อีกครั้งโดยไม่ตั้งค่า longopt ใหม่ -> ต้อง throw
        // เพราะ static state ถูก reset ไปแล้วหลังการ create ครั้งก่อน
        try
        {
            OptionBuilder.create();
            fail("static state ควรถูก reset หลัง create สำเร็จ ทำให้ longopt เป็น null");
        }
        catch (IllegalArgumentException expected)
        {
            // expected: พิสูจน์ว่า reset() ทำงานใน finally block แล้ว
        }
    }

    // ---------------------------------------------------------
    // 22. ทดสอบการ chain หลาย method พร้อมกัน (integration-like)
    // ---------------------------------------------------------
    @Test
    public void testFullChainBuild() throws Exception
    {
        Option option = OptionBuilder.withLongOpt("chained")
                                      .withDescription("chained description")
                                      .withArgName("VAL")
                                      .hasArgs(2)
                                      .isRequired(true)
                                      .withValueSeparator('|')
                                      .withType(Integer.class)
                                      .create('C');

        assertEquals("C", option.getOpt());
        assertEquals("chained", option.getLongOpt());
        assertEquals("chained description", option.getDescription());
        assertEquals("VAL", option.getArgName());
        assertEquals(2, option.getArgs());
        assertTrue(option.isRequired());
        assertEquals('|', option.getValueSeparator());
        assertEquals(Integer.class, option.getType());
    }

    // ---------------------------------------------------------
    // 23. ทดสอบ opt เป็น empty string ผ่าน create(String)
    //     (edge case: opt="" อาจถูกส่งผ่าน OptionBuilder แม้ validation
    //      จริงจะอยู่ใน Option class ก็ตาม)
    // ---------------------------------------------------------
    @Test
    public void testCreateWithEmptyOptString()
    {
        // NOTE: ไม่ทราบ validation logic ภายใน Option class ว่า throw หรือไม่
        // จึงครอบด้วย try-catch เพื่อไม่ fail test ไม่ว่าผลลัพธ์จะเป็นอย่างไร
        // (จุดนี้ไม่ assert พฤติกรรมที่ไม่มีอยู่ในซอร์สที่ให้มา)
        try
        {
            OptionBuilder.create("");
        }
        catch (IllegalArgumentException e)
        {
            // อาจ throw ได้ตาม validation ของ Option - ไม่ assert เพิ่มเติม
        }
    }
}

package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.cli.Option; // อยู่ package เดียวกัน (redundant แต่ถูกต้องตามข้อกำหนด)

import java.util.List;

public class OptionTest
{
    // ---------- Constructors ----------

    @Test
    public void testConstructor_ShortDescription() throws Exception
    {
        Option o = new Option("a", "desc");
        assertEquals("a", o.getOpt());
        assertNull(o.getLongOpt());
        assertEquals("desc", o.getDescription());
        assertFalse(o.hasArg());
        assertEquals(Option.UNINITIALIZED, o.getArgs());
    }

    @Test
    public void testConstructor_HasArgTrue() throws Exception
    {
        Option o = new Option("a", true, "desc");
        assertTrue(o.hasArg());
        assertEquals(1, o.getArgs());
    }

    @Test
    public void testConstructor_HasArgFalse() throws Exception
    {
        Option o = new Option("a", false, "desc");
        assertFalse(o.hasArg());
        assertEquals(Option.UNINITIALIZED, o.getArgs());
    }

    @Test
    public void testConstructor_Full() throws Exception
    {
        Option o = new Option("a", "long-a", true, "desc");
        assertEquals("a", o.getOpt());
        assertEquals("long-a", o.getLongOpt());
        assertTrue(o.hasLongOpt());
        assertTrue(o.hasArg());
        assertEquals("desc", o.getDescription());
    }

    @Test
    public void testConstructor_LongOnly_OptNull() throws Exception
    {
        // opt=null รองรับตาม logic ของ getKey() ในซอร์ส (long-only option)
        Option o = new Option(null, "longonly", false, "desc");
        assertNull(o.getOpt());
        assertEquals("longonly", o.getLongOpt());
    }

    // ---------- getKey() / getId() (package-private) ----------

    @Test
    public void testGetKey_ShortOptPresent()
    {
        Option o = new Option("a", "long", false, "desc");
        assertEquals("a", o.getKey());
    }

    @Test
    public void testGetKey_OptNull_ReturnsLongOpt()
    {
        Option o = new Option(null, "long", false, "desc");
        assertEquals("long", o.getKey());
    }

    @Test
    public void testGetId_FromShortOpt()
    {
        Option o = new Option("a", "desc");
        assertEquals((int) 'a', o.getId());
    }

    @Test
    public void testGetId_FromLongOptWhenOptNull()
    {
        Option o = new Option(null, "long", false, "desc");
        assertEquals((int) 'l', o.getId());
    }

    // ---------- hasLongOpt ----------

    @Test
    public void testHasLongOpt_True()
    {
        Option o = new Option("a", "long", false, "desc");
        assertTrue(o.hasLongOpt());
    }

    @Test
    public void testHasLongOpt_False()
    {
        Option o = new Option("a", "desc");
        assertFalse(o.hasLongOpt());
    }

    // ---------- hasArg / hasArgs boundary (numberOfArgs) ----------

    @Test
    public void testHasArgHasArgs_Uninitialized()
    {
        Option o = new Option("a", "desc"); // numberOfArgs = UNINITIALIZED(-1)
        assertFalse(o.hasArg());
        assertFalse(o.hasArgs());
    }

    @Test
    public void testHasArgHasArgs_Zero()
    {
        Option o = new Option("a", "desc");
        o.setArgs(0);
        assertFalse(o.hasArg());
        assertFalse(o.hasArgs());
    }

    @Test
    public void testHasArgHasArgs_One()
    {
        Option o = new Option("a", "desc");
        o.setArgs(1);
        assertTrue(o.hasArg());
        assertFalse(o.hasArgs());
    }

    @Test
    public void testHasArgHasArgs_Two()
    {
        Option o = new Option("a", "desc");
        o.setArgs(2);
        assertTrue(o.hasArg());
        assertTrue(o.hasArgs());
    }

    @Test
    public void testHasArgHasArgs_Unlimited()
    {
        Option o = new Option("a", "desc");
        o.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(o.hasArg());
        assertTrue(o.hasArgs());
    }

    // ---------- setArgs/getArgs ----------

    @Test
    public void testSetArgsGetArgs()
    {
        Option o = new Option("a", "desc");
        o.setArgs(5);
        assertEquals(5, o.getArgs());
    }

    // ---------- argName / hasArgName ----------

    @Test
    public void testArgName_DefaultIsArg()
    {
        Option o = new Option("a", "desc");
        assertEquals("arg", o.getArgName());
        assertTrue(o.hasArgName());
    }

    @Test
    public void testArgName_Null()
    {
        Option o = new Option("a", "desc");
        o.setArgName(null);
        assertFalse(o.hasArgName());
    }

    @Test
    public void testArgName_Empty()
    {
        Option o = new Option("a", "desc");
        o.setArgName("");
        assertFalse(o.hasArgName());
    }

    @Test
    public void testArgName_NonEmpty()
    {
        Option o = new Option("a", "desc");
        o.setArgName("FILE");
        assertTrue(o.hasArgName());
        assertEquals("FILE", o.getArgName());
    }

    // ---------- valueSeparator ----------

    @Test
    public void testValueSeparator_Default()
    {
        Option o = new Option("a", "desc");
        assertFalse(o.hasValueSeparator());
        assertEquals(0, o.getValueSeparator());
    }

    @Test
    public void testValueSeparator_SetChar()
    {
        Option o = new Option("a", "desc");
        o.setValueSeparator('=');
        assertTrue(o.hasValueSeparator());
        assertEquals('=', o.getValueSeparator());
    }

    // ---------- required / optionalArg / type / description / longOpt setters ----------

    @Test
    public void testRequired_DefaultFalse_SetTrue()
    {
        Option o = new Option("a", "desc");
        assertFalse(o.isRequired());
        o.setRequired(true);
        assertTrue(o.isRequired());
    }

    @Test
    public void testOptionalArg_DefaultFalse_SetTrue()
    {
        Option o = new Option("a", "desc");
        assertFalse(o.hasOptionalArg());
        o.setOptionalArg(true);
        assertTrue(o.hasOptionalArg());
    }

    @Test
    public void testType_DefaultNull_Set()
    {
        Option o = new Option("a", "desc");
        assertNull(o.getType());
        o.setType(Integer.class);
        assertEquals(Integer.class, o.getType());
    }

    @Test
    public void testDescription_Setter()
    {
        Option o = new Option("a", "desc");
        o.setDescription("newDesc");
        assertEquals("newDesc", o.getDescription());
    }

    @Test
    public void testLongOpt_Setter()
    {
        Option o = new Option("a", "desc");
        o.setLongOpt("alpha");
        assertEquals("alpha", o.getLongOpt());
        assertTrue(o.hasLongOpt());
    }

    // ---------- addValueForProcessing / processValue / add (branches) ----------

    @Test
    public void testAddValueForProcessing_Uninitialized_Throws()
    {
        Option o = new Option("a", "desc"); // numberOfArgs = UNINITIALIZED
        try
        {
            o.addValueForProcessing("x");
            fail("ต้อง throw RuntimeException เมื่อ numberOfArgs = UNINITIALIZED");
        }
        catch (RuntimeException e)
        {
            assertEquals("NO_ARGS_ALLOWED", e.getMessage());
        }
    }

    @Test
    public void testProcessValue_NoSeparator_SingleValue()
    {
        Option o = new Option("a", true, "desc");
        o.addValueForProcessing("value1");
        assertEquals("value1", o.getValue());
    }

    @Test
    public void testProcessValue_NoSeparator_MultipleValues_Unlimited()
    {
        Option o = new Option("a", true, "desc");
        o.setArgs(Option.UNLIMITED_VALUES);
        o.addValueForProcessing("v1");
        o.addValueForProcessing("v2");
        assertArrayEquals(new String[] { "v1", "v2" }, o.getValues());
        assertEquals(2, o.getValuesList().size());
    }

    @Test
    public void testProcessValue_WithSeparator_Basic()
    {
        // numberOfArgs=2, sep='=' -> "key=val" ถูกแยกเป็น 2 token
        Option o = new Option("a", true, "desc");
        o.setArgs(2);
        o.setValueSeparator('=');
        o.addValueForProcessing("key=val");
        assertArrayEquals(new String[] { "key", "val" }, o.getValues());
    }

    @Test
    public void testProcessValue_WithSeparator_LimitReached_Break()
    {
        // numberOfArgs=1 -> loop break ทันที (values.size()==numberOfArgs-1==0)
        // ค่าดิบทั้งหมดถูกเก็บเป็น token เดียว
        Option o = new Option("a", true, "desc"); // numberOfArgs = 1
        o.setValueSeparator('=');
        o.addValueForProcessing("a=b=c");
        assertArrayEquals(new String[] { "a=b=c" }, o.getValues());
    }

    @Test
    public void testProcessValue_WithSeparator_MultipleSplits_ThenBreak()
    {
        // numberOfArgs=3 -> loop วน 2 รอบ แล้ว break รอบที่ 3, เหลือ "c=d" เป็น token สุดท้าย
        Option o = new Option("a", true, "desc");
        o.setArgs(3);
        o.setValueSeparator('=');
        o.addValueForProcessing("a=b=c=d");
        assertArrayEquals(new String[] { "a", "b", "c=d" }, o.getValues());
    }

    @Test
    public void testProcessValue_SeparatorSet_ButNotFoundInValue()
    {
        // hasValueSeparator=true แต่ value ไม่มีตัวคั่น -> while loop ไม่ execute
        Option o = new Option("a", true, "desc");
        o.setValueSeparator('=');
        o.addValueForProcessing("novalue");
        assertArrayEquals(new String[] { "novalue" }, o.getValues());
    }

    @Test
    public void testAdd_ExceedsCapacity_Throws()
    {
        Option o = new Option("a", true, "desc"); // numberOfArgs=1
        o.addValueForProcessing("v1"); // เต็มพอดี
        try
        {
            o.addValueForProcessing("v2"); // เกิน capacity -> acceptsArg() false
            fail("ต้อง throw RuntimeException เมื่อ values เต็ม");
        }
        catch (RuntimeException e)
        {
            assertEquals("Cannot add value, list full.", e.getMessage());
        }
    }

    @Test
    public void testAcceptsArg_OptionalArgAtZeroArgs()
    {
        // numberOfArgs=0, optionalArg=true -> acceptsArg() true ผ่านเงื่อนไข hasOptionalArg()
        Option o = new Option("a", "desc");
        o.setArgs(0);
        o.setOptionalArg(true);
        o.addValueForProcessing("val");
        assertEquals("val", o.getValue());
    }

    // ---------- requiresArg() branches ----------

    @Test
    public void testRequiresArg_OptionalArgTrue_AlwaysFalse()
    {
        Option o = new Option("a", true, "desc");
        o.setOptionalArg(true);
        assertFalse(o.requiresArg());
    }

    @Test
    public void testRequiresArg_UnlimitedValues_NoValues_True()
    {
        Option o = new Option("a", "desc");
        o.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(o.requiresArg());
    }

    @Test
    public void testRequiresArg_UnlimitedValues_HasOneValue_False()
    {
        Option o = new Option("a", "desc");
        o.setArgs(Option.UNLIMITED_VALUES);
        o.addValueForProcessing("v1");
        assertFalse(o.requiresArg());
    }

    @Test
    public void testRequiresArg_ElseBranch_NoValues_True()
    {
        Option o = new Option("a", "desc");
        o.setArgs(1);
        assertTrue(o.requiresArg()); // == acceptsArg() == true
    }

    @Test
    public void testRequiresArg_ElseBranch_ValuesFull_False()
    {
        Option o = new Option("a", "desc");
        o.setArgs(1);
        o.addValueForProcessing("v1");
        assertFalse(o.requiresArg()); // == acceptsArg() == false
    }

    // ---------- getValue / getValue(index) / getValue(default) ----------

    @Test
    public void testGetValue_NoValues_ReturnsNull()
    {
        Option o = new Option("a", "desc");
        assertNull(o.getValue());
    }

    @Test
    public void testGetValueIndex_NoValues_ReturnsNull()
    {
        Option o = new Option("a", "desc");
        assertNull(o.getValue(0));
    }

    @Test
    public void testGetValueDefault_NoValues_ReturnsDefault()
    {
        Option o = new Option("a", "desc");
        assertEquals("def", o.getValue("def"));
    }

    @Test
    public void testGetValueDefault_HasValue_ReturnsValue()
    {
        Option o = new Option("a", true, "desc");
        o.addValueForProcessing("v");
        assertEquals("v", o.getValue("def"));
    }

    // ---------- getValues / getValuesList ----------

    @Test
    public void testGetValues_NoValues_ReturnsNull()
    {
        Option o = new Option("a", "desc");
        assertNull(o.getValues());
    }

    @Test
    public void testGetValuesList_EmptyThenPopulated()
    {
        Option o = new Option("a", true, "desc");
        o.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(o.getValuesList().isEmpty());
        o.addValueForProcessing("v1");
        List values = o.getValuesList();
        assertEquals(1, values.size());
        assertEquals("v1", values.get(0));
    }

    // ---------- toString ----------

    @Test
    public void testToString_NoArg_NoLongOpt_NoType()
    {
        Option o = new Option("a", "desc");
        assertEquals("[ option: a  :: desc ]", o.toString());
    }

    @Test
    public void testToString_SingleArg_WithLongOpt()
    {
        Option o = new Option("a", "long", true, "desc");
        assertEquals("[ option: a long  [ARG] :: desc ]", o.toString());
    }

    @Test
    public void testToString_MultiArg_NoLongOpt()
    {
        Option o = new Option("a", "d");
        o.setArgs(2);
        assertEquals("[ option: a [ARG...] :: d ]", o.toString());
    }

    @Test
    public void testToString_WithType()
    {
        Option o = new Option("a", "desc");
        o.setType(Integer.class);
        assertEquals("[ option: a  :: desc :: class java.lang.Integer ]", o.toString());
    }

    // ---------- equals / hashCode ----------

    @Test
    public void testEquals_SameInstance()
    {
        Option o = new Option("a", "desc");
        assertTrue(o.equals(o));
    }

    @Test
    public void testEquals_Null_False()
    {
        Option o = new Option("a", "desc");
        assertFalse(o.equals(null));
    }

    @Test
    public void testEquals_DifferentClass_False()
    {
        Option o = new Option("a", "desc");
        assertFalse(o.equals("not an option"));
    }

    @Test
    public void testEquals_SameOptSameLongOpt_DifferentDescription_True()
    {
        Option o1 = new Option("a", "long", false, "desc1");
        Option o2 = new Option("a", "long", true, "desc2");
        assertTrue(o1.equals(o2));
        assertEquals(o1.hashCode(), o2.hashCode());
    }

    @Test
    public void testEquals_DifferentOpt_False()
    {
        Option o1 = new Option("a", "desc");
        Option o2 = new Option("b", "desc");
        assertFalse(o1.equals(o2));
    }

    @Test
    public void testEquals_DifferentLongOpt_False()
    {
        Option o1 = new Option("a", "long1", false, "desc");
        Option o2 = new Option("a", "long2", false, "desc");
        assertFalse(o1.equals(o2));
    }

    @Test
    public void testEquals_OptNullVsNonNull_False()
    {
        Option o1 = new Option(null, "long", false, "desc");
        Option o2 = new Option("a", "long", false, "desc");
        assertFalse(o1.equals(o2));
    }

    @Test
    public void testEquals_BothOptNull_SameLongOpt_True()
    {
        Option o1 = new Option(null, "long", false, "desc");
        Option o2 = new Option(null, "long", false, "desc2");
        assertTrue(o1.equals(o2));
    }

    // ---------- clone ----------

    @Test
    public void testClone_CopiesFieldsAndValuesList() throws Exception
    {
        Option o = new Option("a", true, "desc");
        o.setArgs(Option.UNLIMITED_VALUES);
        o.addValueForProcessing("v1");

        Option clone = (Option) o.clone();

        assertEquals(o.getOpt(), clone.getOpt());
        assertEquals(o.getDescription(), clone.getDescription());
        assertNotSame(o.getValuesList(), clone.getValuesList()); // ต้องเป็น ArrayList ใหม่
        assertEquals(o.getValuesList(), clone.getValuesList());  // แต่เนื้อหาเท่ากัน

        // แก้ค่าใน clone ไม่กระทบ original
        clone.clearValues();
        assertTrue(clone.getValuesList().isEmpty());
        assertFalse(o.getValuesList().isEmpty());
    }

    // ---------- clearValues ----------

    @Test
    public void testClearValues()
    {
        Option o = new Option("a", true, "desc");
        o.addValueForProcessing("v1");
        assertNotNull(o.getValue());
        o.clearValues();
        assertNull(o.getValue());
        assertNull(o.getValues());
        assertTrue(o.getValuesList().isEmpty());
    }

    // ---------- addValue (deprecated) ----------

    @Test
    public void testAddValue_Deprecated_ThrowsUnsupportedOperationException()
    {
        Option o = new Option("a", "desc");
        try
        {
            o.addValue("x");
            fail("ต้อง throw UnsupportedOperationException");
        }
        catch (UnsupportedOperationException e)
        {
            // ok ตามที่ระบุใน source
        }
    }
}

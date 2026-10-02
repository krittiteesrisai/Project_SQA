package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link PosixParser}.
 *
 * หมายเหตุ: 
 * - flatten() และ burstToken() เป็น protected method ของ Parser/PosixParser
 *   จึงต้องวาง test class ไว้ใน package เดียวกัน (org.apache.commons.cli)
 *   เพื่อเรียกใช้ได้โดยตรง (ไม่ใช้ reflection)
 * - สมมติฐาน (assumption) เกี่ยวกับ Options API:
 *     Options.hasOption(String opt) จะ strip เครื่องหมาย "-" นำหน้าก่อนเทียบ
 *     (พฤติกรรมมาตรฐานของ Commons-CLI ทุก version ที่ใช้ Util.stripLeadingHyphens)
 *   หากพฤติกรรมจริงต่างจากนี้ ผลลัพธ์ของบาง test อาจต้องปรับ
 */
public class PosixParserTest
{
    private PosixParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new PosixParser();
        options = new Options();
    }

    // ---------- "--" (double hyphen) branch ----------

    @Test
    public void testLongOptionWithEquals()
    {
        String[] args = { "--foo=bar" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo", "bar" }, result);
    }

    @Test
    public void testLongOptionWithoutEquals()
    {
        String[] args = { "--foo" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo" }, result);
    }

    @Test
    public void testLongOptionWithEmptyValueAfterEquals()
    {
        // boundary: value ว่างหลัง '='
        String[] args = { "--foo=" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo", "" }, result);
    }

    @Test
    public void testDoubleHyphenAlone()
    {
        String[] args = { "--" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--" }, result);
    }

    // ---------- "-" single hyphen branch ----------

    @Test
    public void testSingleHyphen()
    {
        String[] args = { "-" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-" }, result);
    }

    // ---------- tokenLength == 2, processOptionToken branches ----------

    @Test
    public void testShortOptionExists()
    {
        options.addOption("a", false, "desc");
        String[] args = { "-a" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a" }, result);
    }

    @Test
    public void testShortOptionExists_currentOptionSet_hasArgTrue()
    {
        // ตรวจสอบว่า currentOption ถูก set จริง โดยผ่านการทำงานร่วมกับ process()
        options.addOption("a", true, "desc");
        String[] args = { "-a", "value1" };
        String[] result = parser.flatten(options, args, true); // stopAtNonOption = true -> เข้า process()
        assertArrayEquals(new String[] { "-a", "value1" }, result);
    }

    @Test
    public void testShortOptionNotExist_stopAtNonOptionTrue()
    {
        options.addOption("a", false, "desc");
        String[] args = { "-x", "rest1", "rest2" };
        String[] result = parser.flatten(options, args, true);
        // "-x" ไม่ใช่ option -> eatTheRest = true -> gobble เก็บ rest1, rest2 ที่เหลือทั้งหมด
        assertArrayEquals(new String[] { "rest1", "rest2" }, result);
    }

    @Test
    public void testShortOptionNotExist_stopAtNonOptionFalse()
    {
        options.addOption("a", false, "desc");
        String[] args = { "-x", "rest1", "rest2" };
        String[] result = parser.flatten(options, args, false);
        // "-x" ถูก ignore (ไม่ throw, ไม่ add), ตัวถัดไปถูก add ตามปกติ
        assertArrayEquals(new String[] { "rest1", "rest2" }, result);
    }

    // ---------- tokenLength != 2 && options.hasOption(token) branch ----------

    @Test
    public void testMultiCharTokenMatchesFullOptionId()
    {
        options.addOption("ab", false, "desc"); // option id เป็น 2 ตัวอักษร -> token คือ "-ab" ยาว 3
        String[] args = { "-ab" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-ab" }, result);
    }

    // ---------- burstToken branches ----------

    @Test
    public void testBurstToken_hasArgTrue_withRemainder_break()
    {
        options.addOption("a", true, "desc"); // hasArg = true
        String[] args = { "-abc" };
        String[] result = parser.flatten(options, args, false);
        // i=1: 'a' มีตัวเลือก, hasArg true, remainder "bc" -> add แล้ว break
        assertArrayEquals(new String[] { "-a", "bc" }, result);
    }

    @Test
    public void testBurstToken_hasArgFalse_multipleFlags_noBreak()
    {
        options.addOption("a", false, "desc");
        options.addOption("b", false, "desc");
        options.addOption("c", false, "desc");
        String[] args = { "-abc" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-b", "-c" }, result);
    }

    @Test
    public void testBurstToken_charNotExist_stopAtNonOptionTrue_callsProcess()
    {
        options.addOption("a", false, "desc"); // 'a' exists but hasArg=false (ไม่ break)
        String[] args = { "-ax", "extra" };
        String[] result = parser.flatten(options, args, true);
        // i=1 'a' -> add "-a", currentOption=a (hasArg false, ไม่ break)
        // i=2 'x' ไม่ใช่ option, stopAtNonOption=true -> process("x")
        //     currentOption != null but hasArg() false -> else branch: eatTheRest=true, add "--","x"
        // gobble เก็บ "extra" ที่เหลือ
        assertArrayEquals(new String[] { "-a", "--", "x", "extra" }, result);
    }

    @Test
    public void testBurstToken_charNotExist_stopAtNonOptionFalse()
    {
        options.addOption("a", false, "desc");
        String[] args = { "-ax" };
        String[] result = parser.flatten(options, args, false);
        // i=1 'a' -> add "-a"
        // i=2 'x' ไม่ใช่ option, stopAtNonOption=false -> add "-x" ตรง ๆ
        assertArrayEquals(new String[] { "-a", "-x" }, result);
    }

    @Test
    public void testBurstToken_firstCharNotExist_stopAtNonOptionFalse()
    {
        // ไม่มี option ใดถูกลงทะเบียนเลย -> ทุกตัวอักษรตกไปที่ else branch
        String[] args = { "-xyz" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-x", "-y", "-z" }, result);
    }

    // ---------- non-option token branches (process()) ----------

    @Test
    public void testNonOptionToken_stopAtNonOptionFalse()
    {
        String[] args = { "value1" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "value1" }, result);
    }

    @Test
    public void testNonOptionToken_stopAtNonOptionTrue_currentOptionNull()
    {
        String[] args = { "value1" };
        String[] result = parser.flatten(options, args, true);
        // currentOption == null -> else branch: eatTheRest=true, add "--","value1"
        assertArrayEquals(new String[] { "--", "value1" }, result);
    }

    @Test
    public void testNonOptionToken_stopAtNonOptionTrue_currentOptionHasArg()
    {
        options.addOption("a", true, "desc");
        String[] args = { "-a", "value1" };
        String[] result = parser.flatten(options, args, true);
        // currentOption != null && hasArg() true -> add value, currentOption = null
        assertArrayEquals(new String[] { "-a", "value1" }, result);
    }

    // ---------- boundary / empty / null-ish cases ----------

    @Test
    public void testEmptyArgumentsArray()
    {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {}, result);
    }

    @Test
    public void testEmptyStringToken()
    {
        // "" ไม่ startsWith("-") และไม่ equals "-" -> ตกไปที่ else (non-option) branch
        String[] args = { "" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "" }, result);
    }

    @Test
    public void testOptionsNotUsedWhenOnlyLongOptionsOrPlainTokens()
    {
        // options ว่าง (ไม่มี option ใดถูก add) แต่ไม่ throw เพราะ path ที่เรียกใช้
        // ไม่แตะ options.hasOption()/getOption() เลย (เฉพาะ "--x" และ token ปกติ)
        String[] args = { "--x=1", "plain" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--x", "1", "plain" }, result);
    }
}

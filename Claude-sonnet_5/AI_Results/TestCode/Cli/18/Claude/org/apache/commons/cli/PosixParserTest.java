package org.apache.commons.cli;

// หมายเหตุ: ไฟล์นี้อยู่ใน package เดียวกับ PosixParser (org.apache.commons.cli)
// จึงไม่ต้องมี import statement แยก เนื่องจาก PosixParser และ Options
// อยู่ใน package เดียวกันตามกฎภาษา Java (จำเป็นเพราะ flatten() เป็น protected method)

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class PosixParserTest
{
    private PosixParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new PosixParser();
        options = new Options();
        options.addOption("a", false, "boolean option a"); // no-arg option
        options.addOption("b", true, "option with arg b"); // has-arg option
        options.addOption("c", false, "boolean option c"); // no-arg option
    }

    // ---------- Double-dash "--" branch ----------

    @Test
    public void testDoubleDashNoEquals()
    {
        String[] args = { "--foo" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo" }, result);
    }

    @Test
    public void testDoubleDashWithEquals()
    {
        String[] args = { "--foo=bar" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--foo", "bar" }, result);
    }

    @Test
    public void testDoubleDashOnly()
    {
        // token คือ "--" พอดี -> เข้า startsWith("--") true, indexOf('=') == -1
        String[] args = { "--" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--" }, result);
    }

    // ---------- Single hyphen "-" branch ----------

    @Test
    public void testSingleHyphen()
    {
        String[] args = { "-" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-" }, result);
    }

    // ---------- length()==2 branch -> processOptionToken ----------

    @Test
    public void testShortOptionValid_NoArg()
    {
        String[] args = { "-a" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a" }, result);
    }

    @Test
    public void testShortOptionInvalid_stopAtNonOptionFalse()
    {
        // "-z" ไม่มีใน options, length==2, stopAtNonOption=false -> ไม่ทำอะไร (ignore)
        String[] args = { "-z" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {}, result);
    }

    @Test
    public void testShortOptionInvalid_stopAtNonOptionTrue()
    {
        // "-z" ไม่มีใน options, stopAtNonOption=true -> eatTheRest=true, gobble ที่เหลือทั้งหมด
        String[] args = { "-z", "rest1", "rest2" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "rest1", "rest2" }, result);
    }

    // ---------- length()!=2 && hasOption(token) true -> add ตรง (ไม่ burst) ----------

    @Test
    public void testExistingLongIdOptionNotBursted()
    {
        options.addOption("xyz", false, "long id option");
        String[] args = { "-xyz" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-xyz" }, result);
    }

    // ---------- burstToken(): loop / hasOption(ch) / hasArg() branches ----------

    @Test
    public void testBurstToken_AllCharsValidNoArg()
    {
        String[] args = { "-ac" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-c" }, result);
    }

    @Test
    public void testBurstToken_OptionHasArgWithRemaining()
    {
        // 'b' hasArg=true และมีอักขระเหลือ -> substring ที่เหลือถูกเติมเป็น arg แล้ว break
        String[] args = { "-bvalue" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-b", "value" }, result);
    }

    @Test
    public void testBurstToken_OptionHasArgNoRemaining()
    {
        // 'c' no-arg (ไม่ break), จบด้วย 'b' hasArg=true แต่ length==(i+1) พอดี -> ไม่ substring, ไม่ break
        String[] args = { "-cb" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-c", "-b" }, result);
    }

    @Test
    public void testBurstToken_InvalidChar_stopAtNonOptionTrue()
    {
        // 'a' valid(no-arg) -> ไม่ break, 'd' invalid + stopAtNonOption=true -> process(substring) แล้ว break
        String[] args = { "-ad", "extra" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "-a", "--", "d", "extra" }, result);
    }

    @Test
    public void testBurstToken_InvalidChar_stopAtNonOptionFalse()
    {
        // 'a' valid, 'd' invalid + stopAtNonOption=false -> add ทั้ง token เดิม แล้ว break
        String[] args = { "-ad" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-ad" }, result);
    }

    // ---------- process(): currentOption!=null && hasArg() branches ----------

    @Test
    public void testProcess_CurrentOptionHasArg_TopLevel()
    {
        // -b ตั้ง currentOption (hasArg=true) แล้วค่าถัดไปที่ไม่ใช่ dash ถูกดูดเป็น arg ของ -b
        // ตามด้วย token ถัดไปที่ currentOption กลายเป็น null -> เข้า else branch (eatTheRest)
        String[] args = { "-b", "value1", "nonOption" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "-b", "value1", "--", "nonOption" }, result);
    }

    @Test
    public void testProcess_CurrentOptionNoArg_TopLevel()
    {
        // -a ตั้ง currentOption (hasArg=false) -> condition (currentOption!=null && hasArg()) เป็น false
        // เพราะ operand ที่สอง false (ต่างจาก case currentOption==null)
        String[] args = { "-a", "value" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "-a", "--", "value" }, result);
    }

    @Test
    public void testProcess_NoCurrentOption_TopLevel()
    {
        // ไม่มี currentOption ก่อน (null) และ stopAtNonOption=true -> process() เข้า else branch
        String[] args = { "nonOption" };
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] { "--", "nonOption" }, result);
    }

    // หมายเหตุ: branch currentOption.hasArgs() ใน process() เป็น dead code
    // เพราะ condition ภายนอก (currentOption != null && currentOption.hasArg())
    // ต้องเป็น true ก่อนเข้า if-block ภายใน ซึ่งเช็ค currentOption.hasArg() ซ้ำอีกครั้ง
    // ทำให้ else-if (currentOption.hasArgs()) ไม่สามารถถูกเรียกได้จริงในทุกกรณี
    // -> ไม่สามารถเขียนเทสเพื่อ cover branch นี้ได้โดยไม่แก้ไขซอร์สโค้ด (ระบุไว้ตามข้อกำหนดที่ 4)

    // ---------- stopAtNonOption=false, plain token ----------

    @Test
    public void testPlainTokenAdded_stopAtNonOptionFalse()
    {
        String[] args = { "plainArg" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "plainArg" }, result);
    }

    // ---------- boundary / empty / null ----------

    @Test
    public void testEmptyArguments()
    {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {}, result);
    }

    @Test
    public void testEmptyStringToken()
    {
        // token ว่าง -> ไม่ตรงเงื่อนไข "--", "-", startsWith("-") -> ตกไปที่ else สุดท้าย
        String[] args = { "" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "" }, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullArguments()
    {
        // Arrays.asList(null) จะ throw NullPointerException ทันที
        parser.flatten(options, null, false);
    }

    @Test
    public void testNullOptions_NoOptionUsageBranch()
    {
        // options เป็น null แต่ path ที่เรียกใช้ไม่แตะ options.hasOption(...)
        // ("--foo" และ "plain" ไม่ผ่านเงื่อนไขที่ต้องใช้ options)
        String[] args = { "--foo", "plain" };
        String[] result = parser.flatten(null, args, false);
        assertArrayEquals(new String[] { "--foo", "plain" }, result);
    }
}

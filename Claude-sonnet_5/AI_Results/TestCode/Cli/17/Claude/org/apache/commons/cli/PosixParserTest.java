package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link PosixParser} (Defects4J: Cli-17b)
 *
 * หมายเหตุ: คลาสทดสอบถูกวางไว้ใน package เดียวกับ PosixParser
 * เพื่อให้สามารถเรียก flatten(...) ซึ่งเป็น protected method ได้ตรง ๆ
 */
public class PosixParserTest
{

    // ---------------------------------------------------------------
    // 1. token.startsWith("--")
    // ---------------------------------------------------------------

    @Test
    public void testFlatten_DoubleDash_WithEquals()
    {
        PosixParser parser = new PosixParser();
        Options options = new Options();

        String[] result = parser.flatten(options, new String[] { "--foo=bar" }, true);

        assertArrayEquals(new String[] { "--foo", "bar" }, result);
    }

    @Test
    public void testFlatten_DoubleDash_WithoutEquals()
    {
        PosixParser parser = new PosixParser();
        Options options = new Options();

        String[] result = parser.flatten(options, new String[] { "--foo" }, true);

        assertArrayEquals(new String[] { "--foo" }, result);
    }

    // ---------------------------------------------------------------
    // 2. "-".equals(token)  -> processSingleHyphen
    // ---------------------------------------------------------------

    @Test
    public void testFlatten_SingleHyphen()
    {
        PosixParser parser = new PosixParser();
        Options options = new Options();

        String[] result = parser.flatten(options, new String[] { "-" }, false);

        assertArrayEquals(new String[] { "-" }, result);
    }

    // ---------------------------------------------------------------
    // 3. token.startsWith("-") && tokenLength == 2  -> processOptionToken
    // ---------------------------------------------------------------

    @Test
    public void testFlatten_ShortOption_Valid()
    {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "option a");

        String[] result = parser.flatten(options, new String[] { "-a" }, false);

        assertArrayEquals(new String[] { "-a" }, result);
    }

    @Test
    public void testFlatten_ShortOption_Invalid_StopAtNonOptionTrue()
    {
        // options.hasOption(token) == false, stopAtNonOption == true
        // -> eatTheRest = true, token ปัจจุบันไม่ถูกเพิ่ม แต่ argument ที่เหลือถูก gobble แบบ raw
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "option a"); // ไม่ได้ลงทะเบียน "z"

        String[] result = parser.flatten(options,
                new String[] { "-z", "foo", "bar" }, true);

        assertArrayEquals(new String[] { "foo", "bar" }, result);
    }

    @Test
    public void testFlatten_ShortOption_Invalid_StopAtNonOptionFalse()
    {
        // options.hasOption(token) == false, stopAtNonOption == false
        // -> token ถูก ignore ทั้งหมด ไม่มีการเพิ่ม token ใด ๆ
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "option a");

        String[] result = parser.flatten(options, new String[] { "-z" }, false);

        assertArrayEquals(new String[] {}, result);
    }

    // ---------------------------------------------------------------
    // 4. token.startsWith("-") && tokenLength != 2 && options.hasOption(token)
    // ---------------------------------------------------------------

    @Test
    public void testFlatten_MultiCharToken_DirectOptionMatch()
    {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("de", false, "multi-char option");

        String[] result = parser.flatten(options, new String[] { "-de" }, false);

        assertArrayEquals(new String[] { "-de" }, result);
    }

    // ---------------------------------------------------------------
    // 5. burstToken(...) branches
    // ---------------------------------------------------------------

    @Test
    public void testBurstToken_NoArgOption_ContinuesLoop()
    {
        // "a" ไม่มี arg, "b" มี arg และไม่มี remaining chars เหลือ (token.length()==i+1)
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "opt a");
        options.addOption("b", true, "opt b");

        String[] result = parser.flatten(options, new String[] { "-ab" }, false);

        assertArrayEquals(new String[] { "-a", "-b" }, result);
    }

    @Test
    public void testBurstToken_HasArg_WithRemainingChars_Break()
    {
        // "b" มี arg และมี remaining chars -> เพิ่ม substring แล้ว break loop
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("b", true, "opt b");

        String[] result = parser.flatten(options, new String[] { "-bXY" }, false);

        assertArrayEquals(new String[] { "-b", "XY" }, result);
    }

    @Test
    public void testBurstToken_InvalidChar_StopAtNonOptionTrue()
    {
        // "a" valid ไม่มี arg -> continue, "x" invalid + stopAtNonOption=true -> process(substring)
        // เนื่องจาก currentOption(a) ไม่มี arg -> process() เข้า else branch: eatTheRest=true, add "--","x"
        // แล้ว gobble ที่เหลือของ argument list แบบ raw
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "opt a"); // ไม่ลงทะเบียน "x"

        String[] result = parser.flatten(options,
                new String[] { "-ax", "foo", "bar" }, true);

        assertArrayEquals(new String[] { "-a", "--", "x", "foo", "bar" }, result);
    }

    @Test
    public void testBurstToken_InvalidChar_StopAtNonOptionFalse()
    {
        // "a" valid ไม่มี arg -> continue, "x" invalid + stopAtNonOption=false
        // -> tokens.add(token ทั้งอัน) แล้ว break
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", false, "opt a");

        String[] result = parser.flatten(options, new String[] { "-ax" }, false);

        assertArrayEquals(new String[] { "-a", "-ax" }, result);
    }

    // ---------------------------------------------------------------
    // 6. non-option token branch: stopAtNonOption true/false -> process() / add directly
    // ---------------------------------------------------------------

    @Test
    public void testProcess_CurrentOptionHasArg_StopAtNonOptionTrue()
    {
        // currentOption != null && currentOption.hasArg() == true
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("b", true, "opt b");

        String[] result = parser.flatten(options, new String[] { "-b", "value" }, true);

        assertArrayEquals(new String[] { "-b", "value" }, result);
    }

    @Test
    public void testProcess_CurrentOptionNull_StopAtNonOptionTrue()
    {
        // currentOption == null -> else branch ของ process(): eatTheRest=true, add "--", value
        // แล้ว gobble ที่เหลือแบบ raw
        PosixParser parser = new PosixParser();
        Options options = new Options();

        String[] result = parser.flatten(options,
                new String[] { "value1", "value2" }, true);

        assertArrayEquals(new String[] { "--", "value1", "value2" }, result);
    }

    @Test
    public void testFlatten_NonOptionToken_StopAtNonOptionFalse()
    {
        // stopAtNonOption == false -> เพิ่ม token ตรง ๆ ไม่ผ่าน process()
        PosixParser parser = new PosixParser();
        Options options = new Options();

        String[] result = parser.flatten(options,
                new String[] { "value1", "value2" }, false);

        assertArrayEquals(new String[] { "value1", "value2" }, result);
    }

    // ---------------------------------------------------------------
    // 7. boundary / empty / null cases
    // ---------------------------------------------------------------

    @Test
    public void testFlatten_EmptyArguments()
    {
        // while (iter.hasNext()) ไม่ถูกเข้าเลยแม้แต่ครั้งเดียว
        PosixParser parser = new PosixParser();
        Options options = new Options();

        String[] result = parser.flatten(options, new String[] {}, true);

        assertArrayEquals(new String[] {}, result);
    }

    @Test
    public void testFlatten_EmptyStringToken()
    {
        // token == "" -> ไม่ผ่านทั้ง "--", "-" หรือ startsWith("-") -> เข้า else (non-option)
        PosixParser parser = new PosixParser();
        Options options = new Options();

        String[] result = parser.flatten(options, new String[] { "" }, false);

        assertArrayEquals(new String[] { "" }, result);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_NullArguments_ThrowsNPE()
    {
        // หมายเหตุ: อ้างอิงจาก Arrays.asList(null) ซึ่งจะโยน NullPointerException
        // เมื่อมีการเรียก size()/iterator() (พฤติกรรมมาตรฐานของ JDK)
        // ไม่ใช่การเดา behavior ของ PosixParser เอง แต่เป็นผลข้างเคียงจาก JDK API ที่ใช้ภายใน
        PosixParser parser = new PosixParser();
        Options options = new Options();

        parser.flatten(options, null, false);
    }
}

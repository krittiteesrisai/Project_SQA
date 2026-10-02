package org.apache.commons.cli; // ต้องอยู่ package เดียวกันเพื่อเข้าถึง protected method flatten/burstToken

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Before;
import org.junit.Test;

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

    // ---------- helper: อ่าน private field eatTheRest ด้วย reflection ----------
    private boolean getEatTheRest() throws Exception
    {
        Field f = PosixParser.class.getDeclaredField("eatTheRest");
        f.setAccessible(true);
        return f.getBoolean(parser);
    }

    // =====================================================================
    // 1) LONG OPTION ("--foo" / "--foo=bar")
    // =====================================================================

    @Test
    public void testLongOption_NoEquals_Exists() throws Exception
    {
        options.addOption("f", "foo", false, "desc");
        String[] result = parser.flatten(options, new String[]{"--foo"}, false);
        assertArrayEquals(new String[]{"--foo"}, result);
    }

    @Test
    public void testLongOption_WithEquals_Exists() throws Exception
    {
        options.addOption("f", "foo", true, "desc");
        String[] result = parser.flatten(options, new String[]{"--foo=bar"}, false);
        assertArrayEquals(new String[]{"--foo", "bar"}, result);
    }

    @Test
    public void testLongOption_NoEquals_NotExists()
    {
        // options ว่าง -> hasOption เป็น false เสมอ
        String[] result = parser.flatten(options, new String[]{"--baz"}, false);
        assertArrayEquals(new String[]{"--", "--baz"}, result);
    }

    @Test
    public void testLongOption_WithEquals_NotExists()
    {
        String[] result = parser.flatten(options, new String[]{"--baz=qux"}, false);
        // ทั้ง token (รวม =qux) ถูก add เป็น value เดียวเพราะ processNonOptionToken รับ token เต็ม
        assertArrayEquals(new String[]{"--", "--baz=qux"}, result);
    }

    /**
     * Boundary: token คือ "--" เดี่ยว ๆ
     * ตาม Javadoc ควร "add the entry" ครั้งเดียว แต่โค้ดจริงเข้า branch startsWith("--")
     * แล้ว opt="--" ไม่มี option -> processNonOptionToken("--") ซึ่ง add "--" (literal) และ value "--" อีกที
     * -> ผลลัพธ์ {"--","--"} ซึ่งอาจไม่ตรงกับ Javadoc (เป็นจุดที่ควรระวัง fault)
     */
    @Test
    public void testDoubleHyphenAlone_MismatchWithJavadoc()
    {
        String[] result = parser.flatten(options, new String[]{"--"}, false);
        assertArrayEquals(new String[]{"--", "--"}, result);
    }

    // =====================================================================
    // 2) SINGLE HYPHEN "-"
    // =====================================================================

    @Test
    public void testSingleHyphen()
    {
        String[] result = parser.flatten(options, new String[]{"-"}, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    // =====================================================================
    // 3) SHORT OPTION length==2 (มี/ไม่มี option, stopAtNonOption true/false)
    // =====================================================================

    @Test
    public void testShortOption_Length2_Exists() throws Exception
    {
        options.addOption("a", false, "desc a");
        String[] result = parser.flatten(options, new String[]{"-a"}, true);
        assertArrayEquals(new String[]{"-a"}, result);
        assertFalse("hasOption=true -> eatTheRest ต้องยังเป็น false", getEatTheRest());
    }

    @Test
    public void testShortOption_Length2_NotExists_StopTrue() throws Exception
    {
        // ไม่ addOption ใด ๆ
        String[] result = parser.flatten(options, new String[]{"-z", "extra"}, true);
        // eatTheRest=true -> "extra" ถูก gobble แบบ raw
        assertArrayEquals(new String[]{"-z", "extra"}, result);
        assertTrue(getEatTheRest());
    }

    @Test
    public void testShortOption_Length2_NotExists_StopFalse() throws Exception
    {
        String[] result = parser.flatten(options, new String[]{"-z"}, false);
        assertArrayEquals(new String[]{"-z"}, result);
        assertFalse(getEatTheRest());
    }

    // =====================================================================
    // 4) SHORT OPTION length!=2 แต่ hasOption(token)==true (OR ฝั่งขวา)
    // =====================================================================

    @Test
    public void testShortOption_NotLength2_ButHasOption() throws Exception
    {
        options.addOption("bc", false, "multi-char short opt"); // opt string "bc"
        String[] result = parser.flatten(options, new String[]{"-bc"}, true);
        assertArrayEquals(new String[]{"-bc"}, result);
        // hasOption(token)=true -> !hasOption=false -> eatTheRest ไม่ถูกตั้ง แม้ stopAtNonOption=true
        assertFalse(getEatTheRest());
    }

    // =====================================================================
    // 5) BURST TOKEN: หลาย branch ภายใน for-loop
    // =====================================================================

    @Test
    public void testBurst_AllCharsAreOptions_NoArg()
    {
        options.addOption("a", false, "desc a");
        options.addOption("b", false, "desc b");
        String[] result = parser.flatten(options, new String[]{"-ab"}, false);
        assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    @Test
    public void testBurst_OptionHasArg_WithRemainingChars()
    {
        options.addOption("a", true, "desc a with arg");
        String[] result = parser.flatten(options, new String[]{"-abc"}, false);
        // 'a' hasArg=true และเหลือ "bc" -> add "-a","bc" แล้ว break
        assertArrayEquals(new String[]{"-a", "bc"}, result);
    }

    @Test
    public void testBurst_OptionHasArg_NoRemainingChars()
    {
        options.addOption("b", false, "desc b no arg");
        options.addOption("a", true, "desc a has arg");
        // 'b' ไม่มี arg -> ไม่ break, ไปต่อที่ 'a' ซึ่งเป็นตัวสุดท้ายพอดี (ไม่มี char เหลือ)
        String[] result = parser.flatten(options, new String[]{"-ba"}, false);
        assertArrayEquals(new String[]{"-b", "-a"}, result);
    }

    @Test
    public void testBurst_UnknownChar_StopAtNonOptionTrue()
    {
        options.addOption("a", false, "desc a");
        // 'a' รู้จัก(ไม่มี arg,ไม่ break) -> 'x' ไม่รู้จัก + stopAtNonOption=true
        String[] result = parser.flatten(options, new String[]{"-ax"}, true);
        assertArrayEquals(new String[]{"-a", "--", "x"}, result);
    }

    @Test
    public void testBurst_UnknownChar_StopAtNonOptionFalse()
    {
        options.addOption("a", false, "desc a");
        String[] result = parser.flatten(options, new String[]{"-ax"}, false);
        // ไม่ stop -> else: add token เต็มทั้งก้อน แล้ว break
        assertArrayEquals(new String[]{"-a", "-ax"}, result);
    }

    @Test
    public void testBurst_FirstCharUnknown_StopAtNonOptionFalse()
    {
        // ไม่มี option ใดถูก register เลย -> เข้า else ตั้งแต่ i=1
        String[] result = parser.flatten(options, new String[]{"-xy"}, false);
        assertArrayEquals(new String[]{"-xy"}, result);
    }

    @Test
    public void testBurst_FirstCharUnknown_StopAtNonOptionTrue()
    {
        String[] result = parser.flatten(options, new String[]{"-xy"}, true);
        assertArrayEquals(new String[]{"--", "xy"}, result);
    }

    // =====================================================================
    // 6) NON-OPTION TOKEN (ไม่ขึ้นต้นด้วย '-' เลย)
    // =====================================================================

    @Test
    public void testNonOptionToken_StopAtNonOptionTrue()
    {
        String[] result = parser.flatten(options, new String[]{"value"}, true);
        assertArrayEquals(new String[]{"--", "value"}, result);
    }

    @Test
    public void testNonOptionToken_StopAtNonOptionFalse()
    {
        String[] result = parser.flatten(options, new String[]{"value"}, false);
        assertArrayEquals(new String[]{"value"}, result);
    }

    // =====================================================================
    // 7) BOUNDARY: EMPTY STRING TOKEN ("" ไม่ตรงเงื่อนไข startsWith ใดเลย)
    // =====================================================================

    @Test
    public void testEmptyStringToken_StopAtNonOptionFalse()
    {
        String[] result = parser.flatten(options, new String[]{""}, false);
        assertArrayEquals(new String[]{""}, result);
    }

    @Test
    public void testEmptyStringToken_StopAtNonOptionTrue()
    {
        String[] result = parser.flatten(options, new String[]{""}, true);
        assertArrayEquals(new String[]{"--", ""}, result);
    }

    // =====================================================================
    // 8) EMPTY ARGUMENTS ARRAY (boundary: loop ไม่รันเลย)
    // =====================================================================

    @Test
    public void testEmptyArgumentsArray()
    {
        String[] result = parser.flatten(options, new String[0], false);
        assertArrayEquals(new String[0], result);
    }

    // =====================================================================
    // 9) GOBBLE(): loop วนหลายรอบหลัง eatTheRest=true
    // =====================================================================

    @Test
    public void testGobble_MultipleRemainingTokens()
    {
        String[] result = parser.flatten(
            options, new String[]{"-z", "extra1", "extra2", "extra3"}, true);
        assertArrayEquals(new String[]{"-z", "extra1", "extra2", "extra3"}, result);
    }

    // =====================================================================
    // 10) NULL / มัลฟอร์มอินพุต (ไม่เดา behavior เกินซอร์ส - อิงจาก Arrays.asList(null))
    // =====================================================================

    @Test(expected = NullPointerException.class)
    public void testFlatten_NullArgumentsArray_ThrowsNPE()
    {
        // Arrays.asList(null) จะ throw NPE ตาม behavior จริงของ java.util.Arrays
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testFlatten_ArrayContainsNullElement_ThrowsNPE()
    {
        // token.startsWith(...) บน null element จะ throw NPE
        parser.flatten(options, new String[]{null}, false);
    }
}

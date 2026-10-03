package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();

        // Options ทั่วไปสำหรับทดสอบ
        options.addOption("a", false, "Option a (no arg)");
        options.addOption("b", true, "Option b (has arg)");
        options.addOption("c", false, "Option c (no arg)");
        options.addOption("d", true, "Option d (has arg)");

        // Long options
        options.addOption("verbose", false, "Verbose mode");
        options.addOption("file", true, "Target file");
    }

    @Test
    public void testFlattenEmptyArguments() {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[0], result);
    }

    @Test
    public void testFlattenDoubleHyphenOptionWithoutValue() {
        String[] args = new String[]{"--verbose"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--verbose"}, result);
    }

    @Test
    public void testFlattenDoubleHyphenOptionWithValue() {
        String[] args = new String[]{"--file=output.txt"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--file", "output.txt"}, result);
    }

    @Test
    public void testFlattenDoubleHyphenEdgeCases() {
        // Boundary case: -- และเครื่องหมาย = อยู่ตำแหน่งต่างๆ
        String[] args = new String[]{"--", "--file=", "--=value", "--multi=a=b=c"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"--", "--file", "", "--", "value", "--multi", "a=b=c"}, result);
    }

    @Test
    public void testFlattenSingleHyphen() {
        String[] args = new String[]{"-", "-a", "-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-", "-a", "-"}, result);
    }

    @Test
    public void testFlattenShortOptionValid() {
        String[] args = new String[]{"-a", "-b", "val"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "val"}, result);
    }

    @Test
    public void testFlattenShortOptionUnknownStopAtNonOptionTrue() {
        // -x ไม่รู้จัก และ stopAtNonOption เป็น true -> eatTheRest ทำงาน และ gobble ส่วนที่เหลือ
        String[] args = new String[]{"-x", "rest1", "rest2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-x", "rest1", "rest2"}, result);
    }

    @Test
    public void testFlattenShortOptionUnknownStopAtNonOptionFalse() {
        // -x ไม่รู้จัก และ stopAtNonOption เป็น false -> Token -x จะถูกเพิกเฉย
        String[] args = new String[]{"-x", "nonOption"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"nonOption"}, result);
    }

    @Test
    public void testFlattenOptionLengthGreaterThanTwoMatchingExistingOption() {
        // Option ที่ขึ้นด้วยขีดเดียว แต่ Options มีตัวนี้ (เช่น -verbose)
        String[] args = new String[]{"-verbose"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-verbose"}, result);
    }

    @Test
    public void testBurstTokenMultipleFlagsNoArgs() {
        // -ac ประกอบด้วย -a และ -c (ไม่มี Arg ทั้งคู่)
        String[] args = new String[]{"-ac"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-c"}, result);
    }

    @Test
    public void testBurstTokenWithArgAttached() {
        // -b รับ Arg ดังนั้น -abValue จะแยกเป็น -a, -b, Value
        String[] args = new String[]{"-abValue"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b", "Value"}, result);
    }

    @Test
    public void testBurstTokenWithArgAtEndOfToken() {
        // -ab โดยที่ -b รับ Arg แต่อยู่ตัวสุดท้ายของ Token
        String[] args = new String[]{"-ab"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-b"}, result);
    }

    @Test
    public void testBurstTokenUnknownOptionStopAtNonOptionTrueWithoutCurrentArg() {
        // -az โดยที่ 'a' ไม่มี Arg และ 'z' ไม่เป็น Option -> เรียก process("z")
        // ทำให้เกิด "--", "z" และ gobble ข้อมูลที่เหลือ
        String[] args = new String[]{"-az", "extra"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "z", "extra"}, result);
    }

    @Test
    public void testBurstTokenUnknownOptionStopAtNonOptionFalse() {
        // -az โดยที่ 'z' ไม่รู้จัก และ stopAtNonOption = false
        // Loop รอบแรกเจอ 'a' -> ใส่ "-a", รอบสองเจอ 'z' -> ใส่ "-az" ทั้งก้อน แล้ว break
        String[] args = new String[]{"-az"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"-a", "-az"}, result);
    }

    @Test
    public void testNonOptionTokensWithStopAtNonOptionFalse() {
        // Non-option tokens ถูกเพิ่มตรงๆ เมื่อ stopAtNonOption เป็น false
        String[] args = new String[]{"arg1", "arg2"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{"arg1", "arg2"}, result);
    }

    @Test
    public void testNonOptionTokensWithStopAtNonOptionTrueWithoutPreviousOption() {
        // Non-option token แรกถูกแปลงเป็น "--", "arg1" และ eatTheRest ทำงาน
        String[] args = new String[]{"arg1", "arg2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", "arg1", "arg2"}, result);
    }

    @Test
    public void testNonOptionTokensConsumingArgumentThenStopAtNextNonOption() {
        // -b ต้องการ Argument -> รับ "bValue" จากนั้น token ถัดไป "extra" เป็น Non-Option
        // currentOption จะเป็น null แล้ว จึงเข้าเงื่อนไข eatTheRest และเพิ่ม "--", "extra"
        String[] args = new String[]{"-b", "bValue", "extra", "final"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-b", "bValue", "--", "extra", "final"}, result);
    }

    @Test
    public void testNonOptionFollowingOptionWithoutArgStopAtNonOptionTrue() {
        // -a ไม่รับ Argument แล้วตามด้วย non-option -> กลายเป็น "--", "nonOpt"
        String[] args = new String[]{"-a", "nonOpt", "tail"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"-a", "--", "nonOpt", "tail"}, result);
    }

    @Test
    public void testEmptyStringTokenBoundary() {
        // Token ที่เป็น Empty String ""
        String[] args = new String[]{""};
        String[] resultFalse = parser.flatten(options, args, false);
        assertArrayEquals(new String[]{""}, resultFalse);

        String[] resultTrue = parser.flatten(options, args, true);
        assertArrayEquals(new String[]{"--", ""}, resultTrue);
    }

    @Test
    public void testMultipleFlattenCallsStateReset() {
        // ตรวจสอบว่า init() ทำงานถูกต้องในการเรียกซ้ำ ไม่จำสถานะ eatTheRest หรือ currentOption ข้ามรอบ
        String[] args1 = new String[]{"-x", "rest"};
        parser.flatten(options, args1, true);

        String[] args2 = new String[]{"-a"};
        String[] result2 = parser.flatten(options, args2, false);
        assertArrayEquals(new String[]{"-a"}, result2);
    }

    @Test
    public void testIntegrationWithParseMethod() throws Exception {
        // ทดสอบการ Parse ร่วมกับคลาส CommandLine ตาม Defect/Integration Flow
        String[] args = new String[]{"-a", "-b", "val", "nonOpt1"};
        CommandLine cl = parser.parse(options, args, false);
        assertEquals(true, cl.hasOption("a"));
        assertEquals("val", cl.getOptionValue("b"));
        assertEquals(1, cl.getArgs().length);
        assertEquals("nonOpt1", cl.getArgs()[0]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseUnrecognizedOptionThrowsException() throws Exception {
        // ตรวจสอบ Fault handling เมื่อส่ง Option ที่ไม่มีอยู่เข้า parse()
        String[] args = new String[]{"-z"};
        parser.parse(options, args);
    }

    @Test(expected = MissingArgumentException.class)
    public void testParseMissingArgumentThrowsException() throws Exception {
        // ตรวจสอบกรณี Option ต้องการ Argument แต่ไม่ได้รับ
        String[] args = new String[]{"-b"};
        parser.parse(options, args);
    }
}
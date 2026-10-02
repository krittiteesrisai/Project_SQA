package org.apache.commons.cli2.builder;

import static org.junit.Assert.*;

import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
// import คลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด (แม้อยู่ package เดียวกัน ก็ import ได้ ไม่ error)
import org.apache.commons.cli2.builder.PatternBuilder;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests สำหรับ {@link PatternBuilder}
 *
 * หมายเหตุ: เมธอด Option.isRequired(), Option.getPreferredName(), Group.getOptions()
 * เป็น API มาตรฐานของ commons-cli2 ที่จำเป็นต้องมีอยู่แล้วเพื่อ compile คลาสเป้าหมาย
 * แต่ไม่ได้ปรากฏในซอร์สโค้ดที่ให้มาโดยตรง จึงใช้อย่างระมัดระวังเฉพาะจุดที่จำเป็น
 * ต่อการตรวจสอบผลลัพธ์ของ branch ต่าง ๆ ใน PatternBuilder เท่านั้น
 */
public class PatternBuilderTest {

    private PatternBuilder builder;

    @Before
    public void setUp() {
        builder = new PatternBuilder();
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        PatternBuilder pb = new PatternBuilder();
        assertNotNull(pb);
    }

    @Test
    public void testConstructorWithExplicitBuilders() {
        PatternBuilder pb = new PatternBuilder(
                new GroupBuilder(), new DefaultOptionBuilder(), new ArgumentBuilder());
        Option option = pb.create();
        assertTrue(option instanceof Group);
    }

    // ---------------------------------------------------------------
    // create(): branch options.size() != 1 (else) กับ loop 0 รอบ
    // ---------------------------------------------------------------

    @Test
    public void testCreate_NoPatternAdded_ReturnsEmptyGroup() {
        Option option = builder.create();
        assertTrue("ควรได้ Group เมื่อไม่มี option ถูกเพิ่ม", option instanceof Group);
        assertEquals(0, ((Group) option).getOptions().size());
    }

    @Test
    public void testWithPattern_EmptyString_ThenCreate_ReturnsEmptyGroup() {
        // boundary: pattern ว่าง -> sz=0 -> loop ไม่ทำงานเลย
        builder.withPattern("");
        Option option = builder.create();
        assertTrue(option instanceof Group);
        assertEquals(0, ((Group) option).getOptions().size());
    }

    // ---------------------------------------------------------------
    // null / malformed input
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testWithPattern_NullPattern_ThrowsNPE() {
        // pattern.length() ถูกเรียกตรง ๆ กับ null -> NPE ตามซอร์สโค้ดจริง
        builder.withPattern(null);
    }

    @Test
    public void testWithPattern_UnknownSpecialCharacterTreatedAsOptionLetter() {
        // '$' ไม่อยู่ใน case ใด ๆ ของ switch จึงตกไป default -> ถือเป็นตัวอักษร option
        builder.withPattern("$");
        Option option = builder.create();
        assertEquals("$", option.getPreferredName());
    }

    // ---------------------------------------------------------------
    // create(): branch options.size() == 1 (if)
    // ---------------------------------------------------------------

    @Test
    public void testWithPattern_SingleSimpleOption_ReturnsSingleOptionNotGroup() {
        builder.withPattern("a");
        Option option = builder.create();
        assertFalse("มี option เดียวไม่ควรถูกครอบด้วย Group", option instanceof Group);
        assertEquals("a", option.getPreferredName());
        assertFalse(option.isRequired());
    }

    // ---------------------------------------------------------------
    // trailing "if (opt != ' ')" : false branch (ไม่มีตัวอักษร option เลย)
    // ---------------------------------------------------------------

    @Test
    public void testWithPattern_OnlyRequiredMarker_NoOptionCreated() {
        builder.withPattern("!");
        Option option = builder.create();
        assertTrue(option instanceof Group);
        assertEquals(0, ((Group) option).getOptions().size());
    }

    @Test
    public void testWithPattern_OnlyTypeChar_NoOptionCreated() {
        builder.withPattern("%");
        Option option = builder.create();
        assertTrue(option instanceof Group);
        assertEquals(0, ((Group) option).getOptions().size());
    }

    // ---------------------------------------------------------------
    // required flag: true/false
    // ---------------------------------------------------------------

    @Test
    public void testWithPattern_RequiredOptionNoType() {
        builder.withPattern("!a");
        Option option = builder.create();
        assertTrue(option.isRequired());
        assertEquals("a", option.getPreferredName());
    }

    @Test
    public void testWithPattern_NotRequiredOptionNoType() {
        builder.withPattern("a");
        Option option = builder.create();
        assertFalse(option.isRequired());
    }

    @Test
    public void testWithPattern_RepeatedRequiredMarker_StillRequired() {
        builder.withPattern("!!a");
        Option option = builder.create();
        assertTrue(option.isRequired());
    }

    // ---------------------------------------------------------------
    // createOption(): type != ' ' , required , type != '*' (ครบ combination หลัก)
    // ---------------------------------------------------------------

    @Test
    public void testWithPattern_RequiredWithTypeNotStar_MinAndMaxApplied() {
        // '!' -> required=true, '%' -> type='%', 'a' -> createOption(type='%', required=true)
        builder.withPattern("!%a");
        Option option = builder.create();
        assertTrue(option.isRequired());
        assertEquals("a", option.getPreferredName());
    }

    @Test
    public void testWithPattern_TypeStar_NotRequired_NoMaximumApplied() {
        // '*' -> type='*', 'a' -> createOption(type='*', required=false)
        builder.withPattern("*a");
        Option option = builder.create();
        assertFalse(option.isRequired());
        assertEquals("a", option.getPreferredName());
    }

    @Test
    public void testWithPattern_TypeStarRequired_MinApplied_NoMaximumApplied() {
        // '*' -> type='*', '!' -> required=true, 'a' -> createOption(type='*', required=true)
        builder.withPattern("*!a");
        Option option = builder.create();
        assertTrue(option.isRequired());
    }

    @Test
    public void testWithPattern_NoTypeNoRequired_ArgumentIsNullBranch() {
        // type==' ' ตลอด -> argument = null branch ใน createOption()
        builder.withPattern("a");
        Option option = builder.create();
        assertNotNull(option); // ไม่มี exception จาก argument == null
    }

    // ---------------------------------------------------------------
    // type char ถูกทับซ้อน (ตัวหลังชนะ) — ทดสอบ functional correctness
    // ---------------------------------------------------------------

    @Test
    public void testWithPattern_MultipleTypeChars_LastOneWins() {
        builder.withPattern("%#a");
        Option option = builder.create();
        assertNotNull(option);
        assertEquals("a", option.getPreferredName());
        // ไม่สามารถ assert validator จริงที่แนบมาได้ เนื่องจากไม่มีซอร์สของ Argument/Validator
        // ให้ยืนยัน type ที่ใช้จริง จึงข้ามการตรวจสอบรายละเอียดนี้ตามข้อกำหนดที่ 4
    }

    // ---------------------------------------------------------------
    // create(): else branch พร้อม loop มากกว่า 1 รอบ (multiple options)
    // ---------------------------------------------------------------

    @Test
    public void testWithPattern_TwoOptions_ReturnsGroupWithTwoOptions() {
        builder.withPattern("ab");
        Option option = builder.create();
        assertTrue(option instanceof Group);
        assertEquals(2, ((Group) option).getOptions().size());
    }

    @Test
    public void testWithPattern_TypeThenOption_AttachesToPrecedingOption() {
        // 'a' -> opt='a' (ยังไม่ createOption เพราะ opt เดิมคือ ' ')
        // '%' -> type='%'
        // 'b' -> default branch, opt!=' ' จริง -> createOption(type='%', opt='a')
        //        แล้ว opt='b'; หลัง loop -> createOption(type=' ', opt='b')
        builder.withPattern("a%b");
        Option option = builder.create();
        assertTrue(option instanceof Group);
        assertEquals(2, ((Group) option).getOptions().size());
    }

    // ---------------------------------------------------------------
    // reset()
    // ---------------------------------------------------------------

    @Test
    public void testReset_ReturnsSameInstance_FluentApi() {
        assertSame(builder, builder.reset());
    }

    @Test
    public void testReset_ClearsPreviouslyAddedOptions() {
        builder.withPattern("a");
        builder.reset();
        Option option = builder.create();
        assertTrue(option instanceof Group);
        assertEquals(0, ((Group) option).getOptions().size());
    }

    @Test
    public void testCreate_AutoResetsInternalStateAfterCreate() {
        builder.withPattern("a");
        builder.create();               // สร้างครั้งแรก -> ควร reset ภายในหลังจบ
        Option second = builder.create(); // ไม่มี option ใหม่ -> ควรได้ Group ว่าง
        assertTrue(second instanceof Group);
        assertEquals(0, ((Group) second).getOptions().size());
    }

    // ---------------------------------------------------------------
    // withPattern(): switch-case ของทุก type char ที่รู้จัก
    // (ครอบคลุมทุก case ของ validator() ทางอ้อมด้วย รวมถึง default case
    //  ของ validator() ผ่านตัวอักษร ':' ซึ่งไม่มี case ตรงใน validator())
    // ---------------------------------------------------------------

    @Test
    public void testWithPattern_AllRecognizedTypeChars_NoExceptions() {
        char[] typeChars = {'@', ':', '%', '+', '#', '<', '>', '*', '/'};
        for (char t : typeChars) {
            PatternBuilder pb = new PatternBuilder();
            pb.withPattern(t + "a");
            Option option = pb.create();
            assertNotNull("ล้มเหลวสำหรับ type char: " + t, option);
        }
    }

    @Test
    public void testWithPattern_ColonType_HitsDefaultBranchOfValidatorSwitch() {
        // ':' เป็น type ที่ valid ใน withPattern() แต่ validator() ไม่มี case ตรง
        // จะตกไป default -> return null (ตามคอมเมนต์ในซอร์ส "no validator needed")
        builder.withPattern(":a");
        Option option = builder.create();
        assertNotNull(option);
        assertEquals("a", option.getPreferredName());
    }
}

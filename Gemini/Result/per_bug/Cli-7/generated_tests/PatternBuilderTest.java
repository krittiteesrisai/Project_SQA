package org.apache.commons.cli2.builder;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.validation.ClassValidator;
import org.apache.commons.cli2.validation.DateValidator;
import org.apache.commons.cli2.validation.FileValidator;
import org.apache.commons.cli2.validation.NumberValidator;
import org.apache.commons.cli2.validation.UrlValidator;
import org.apache.commons.cli2.validation.Validator;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class PatternBuilderTest {

    private PatternBuilder builder;

    @Before
    public void setUp() {
        builder = new PatternBuilder();
    }

    /**
     * ทดสอบกรณี Boundary: Pattern เป็น null ต้องโยน NullPointerException
     */
    @Test(expected = NullPointerException.class)
    public void testWithPatternNull() {
        builder.withPattern(null);
    }

    /**
     * ทดสอบกรณี Empty String: ไม่มีการสร้าง Option ขนาด options เป็น 0
     * เมธอด create() ต้องเข้า else branch และคืน Group ว่าง
     */
    @Test
    public void testEmptyPatternReturnsEmptyGroup() {
        builder.withPattern("");
        Option option = builder.create();

        assertTrue("Expected Group instance when options size is 0", option instanceof Group);
        Group group = (Group) option;
        assertTrue("Group options should be empty", group.getOptions().isEmpty());
    }

    /**
     * ทดสอบกรณี Option เดี่ยวไม่มี Argument (type = ' ')
     * ครอบคลุม create() branch (options.size() == 1)
     */
    @Test
    public void testSingleSimpleOption() {
        builder.withPattern("a");
        Option option = builder.create();

        assertTrue(option instanceof DefaultOption);
        DefaultOption dOption = (DefaultOption) option;
        assertEquals("a", dOption.getPreferredName());
        assertFalse(dOption.isRequired());
        assertNull(dOption.getArgument());
    }

    /**
     * ทดสอบ Flag Required '!' สำหรับ Option เดี่ยวที่ไม่มี Argument
     */
    @Test
    public void testSingleRequiredOptionNoArgument() {
        builder.withPattern("!a");
        Option option = builder.create();

        assertTrue(option instanceof DefaultOption);
        DefaultOption dOption = (DefaultOption) option;
        assertEquals("a", dOption.getPreferredName());
        assertTrue(dOption.isRequired());
        assertNull(dOption.getArgument());
    }

    /**
     * ทดสอบ Type ':' (String argument) ซึ่งไม่มี Validator
     */
    @Test
    public void testOptionWithStringArgument() {
        builder.withPattern("a:");
        Option option = builder.create();

        assertTrue(option instanceof DefaultOption);
        DefaultOption dOption = (DefaultOption) option;
        assertEquals("a", dOption.getPreferredName());

        Argument arg = dOption.getArgument();
        assertNotNull(arg);
        assertNull("Validator should be null for ':'", arg.getValidator());
        assertEquals(0, arg.getMinimum());
        assertEquals(1, arg.getMaximum());
    }

    /**
     * ทดสอบ Option ที่มี Argument และเป็น Required Option
     * ต้องทดสอบทั้ง withMinimum(1) และ withRequired(true)
     */
    @Test
    public void testRequiredOptionWithArgument() {
        builder.withPattern("a!:");
        Option option = builder.create();

        assertTrue(option instanceof DefaultOption);
        DefaultOption dOption = (DefaultOption) option;
        assertTrue(dOption.isRequired());

        Argument arg = dOption.getArgument();
        assertNotNull(arg);
        assertEquals(1, arg.getMinimum());
        assertEquals(1, arg.getMaximum());
    }

    /**
     * ทดสอบ Validator Type '@' (ClassValidator ที่ instance = true)
     */
    @Test
    public void testValidatorClassInstance() {
        builder.withPattern("c@");
        DefaultOption dOption = (DefaultOption) builder.create();
        Argument arg = dOption.getArgument();
        assertNotNull(arg);

        Validator validator = arg.getValidator();
        assertTrue(validator instanceof ClassValidator);
        assertTrue(((ClassValidator) validator).isInstance());
    }

    /**
     * ทดสอบ Validator Type '+' (ClassValidator ที่ instance = false)
     */
    @Test
    public void testValidatorClassType() {
        builder.withPattern("c+");
        DefaultOption dOption = (DefaultOption) builder.create();
        Argument arg = dOption.getArgument();
        assertNotNull(arg);

        Validator validator = arg.getValidator();
        assertTrue(validator instanceof ClassValidator);
        assertFalse(((ClassValidator) validator).isInstance());
    }

    /**
     * ทดสอบ Validator Type '%' (NumberValidator)
     */
    @Test
    public void testValidatorNumber() {
        builder.withPattern("n%");
        DefaultOption dOption = (DefaultOption) builder.create();
        Argument arg = dOption.getArgument();
        assertNotNull(arg);

        assertTrue(arg.getValidator() instanceof NumberValidator);
    }

    /**
     * ทดสอบ Validator Type '#' (DateValidator)
     */
    @Test
    public void testValidatorDate() {
        builder.withPattern("d#");
        DefaultOption dOption = (DefaultOption) builder.create();
        Argument arg = dOption.getArgument();
        assertNotNull(arg);

        assertTrue(arg.getValidator() instanceof DateValidator);
    }

    /**
     * ทดสอบ Validator Type '<' (Existing FileValidator)
     */
    @Test
    public void testValidatorExistingFile() {
        builder.withPattern("f<");
        DefaultOption dOption = (DefaultOption) builder.create();
        Argument arg = dOption.getArgument();
        assertNotNull(arg);

        Validator validator = arg.getValidator();
        assertTrue(validator instanceof FileValidator);
        FileValidator fv = (FileValidator) validator;
        assertTrue(fv.isExisting());
        assertTrue(fv.isFile());
    }

    /**
     * ทดสอบ Validator Type '>' (FileValidator ทั่วไป)
     */
    @Test
    public void testValidatorAnyFile() {
        builder.withPattern("f>");
        DefaultOption dOption = (DefaultOption) builder.create();
        Argument arg = dOption.getArgument();
        assertNotNull(arg);

        Validator validator = arg.getValidator();
        assertTrue(validator instanceof FileValidator);
        FileValidator fv = (FileValidator) validator;
        assertFalse(fv.isExisting());
    }

    /**
     * ทดสอบ Validator Type '*' (FileValidator หลายค่า: Maximum ไม่ถูกจำกัดที่ 1)
     */
    @Test
    public void testValidatorMultipleFiles() {
        builder.withPattern("m*");
        DefaultOption dOption = (DefaultOption) builder.create();
        Argument arg = dOption.getArgument();
        assertNotNull(arg);

        assertTrue(arg.getValidator() instanceof FileValidator);
        assertTrue("Maximum should not be limited to 1 for '*'", arg.getMaximum() > 1 || arg.getMaximum() == Integer.MAX_VALUE);
    }

    /**
     * ทดสอบ Validator Type '/' (UrlValidator)
     */
    @Test
    public void testValidatorUrl() {
        builder.withPattern("u/");
        DefaultOption dOption = (DefaultOption) builder.create();
        Argument arg = dOption.getArgument();
        assertNotNull(arg);

        assertTrue(arg.getValidator() instanceof UrlValidator);
    }

    /**
     * ทดสอบกรณีมีหลาย Options: options.size() > 1
     * ทดสอบการสร้าง Group และตรวจสอบว่าสถานะ required ถูกรีเซ็ตระหว่างตัวเลือก
     */
    @Test
    public void testMultipleOptionsCreatesGroup() {
        builder.withPattern("!a%b");
        Option option = builder.create();

        assertTrue(option instanceof Group);
        Group group = (Group) option;
        assertEquals(2, group.getOptions().size());

        // ตรวจสอบ option แรก 'a' ต้อง required=true และมี NumberValidator
        // Option สอง 'b' ต้อง required=false และไม่มี Argument
        boolean foundA = false;
        boolean foundB = false;

        for (Object obj : group.getOptions()) {
            DefaultOption d = (DefaultOption) obj;
            if ("a".equals(d.getPreferredName())) {
                foundA = true;
                assertTrue(d.isRequired());
                assertNotNull(d.getArgument());
                assertTrue(d.getArgument().getValidator() instanceof NumberValidator);
            } else if ("b".equals(d.getPreferredName())) {
                foundB = true;
                assertFalse(d.isRequired());
                assertNull(d.getArgument());
            }
        }
        assertTrue("Option 'a' must be present in group", foundA);
        assertTrue("Option 'b' must be present in group", foundB);
    }

    /**
     * ทดสอบการ Reset: เมธอด reset() แบบเรียกตรง และการ Auto-reset หลังเรียก create()
     */
    @Test
    public void testResetFunctionality() {
        builder.withPattern("a");
        PatternBuilder returnedBuilder = builder.reset();
        assertEquals("reset() should return this instance", builder, returnedBuilder);

        // เมื่อ reset แล้ว create() ต้องคืน Empty Group
        Option optAfterReset = builder.create();
        assertTrue(optAfterReset instanceof Group);
        assertTrue(((Group) optAfterReset).getOptions().isEmpty());

        // ตรวจสอบ Auto-reset หลัง create()
        builder.withPattern("x");
        Option firstCreate = builder.create();
        assertTrue(firstCreate instanceof DefaultOption);

        Option secondCreate = builder.create();
        assertTrue(secondCreate instanceof Group);
        assertTrue(((Group) secondCreate).getOptions().isEmpty());
    }

    /**
     * ทดสอบ Constructor แบบ Dependency Injection (Custom Builders)
     */
    @Test
    public void testCustomConstructor() {
        GroupBuilder gb = new GroupBuilder();
        DefaultOptionBuilder ob = new DefaultOptionBuilder();
        ArgumentBuilder ab = new ArgumentBuilder();

        PatternBuilder customBuilder = new PatternBuilder(gb, ob, ab);
        customBuilder.withPattern("z:");
        Option opt = customBuilder.create();

        assertTrue(opt instanceof DefaultOption);
        assertEquals("z", opt.getPreferredName());
    }

    /**
     * Edge case: Pattern ที่มี Modifier ซ้อนกัน (เช่น Type หลายตัวติดกัน)
     * ตัวหลังสุดต้อง override ตัวหน้าสุด
     */
    @Test
    public void testOverriddenTypeModifier() {
        builder.withPattern("x%#"); // % แล้วตามด้วย # -> Type ต้องเป็น '#'
        DefaultOption dOption = (DefaultOption) builder.create();
        Argument arg = dOption.getArgument();
        assertNotNull(arg);
        assertTrue(arg.getValidator() instanceof DateValidator);
    }

    /**
     * Edge case: ตัวอักษรติดกันโดยไม่มี Modifier ("abc")
     * ต้องสร้าง 3 Option แยกกันและไม่มี Argument
     */
    @Test
    public void testConsecutiveOptionsWithoutModifiers() {
        builder.withPattern("abc");
        Option opt = builder.create();

        assertTrue(opt instanceof Group);
        Group group = (Group) opt;
        assertEquals(3, group.getOptions().size());
    }
}
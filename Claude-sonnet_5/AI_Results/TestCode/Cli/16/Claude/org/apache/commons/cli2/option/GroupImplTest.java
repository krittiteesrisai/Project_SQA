package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.builder.ArgumentBuilder;
import org.apache.commons.cli2.builder.DefaultOptionBuilder;
// WriteableCommandLineImpl: ASSUMPTION - constructor (Option rootOption, List args)
// ไม่ได้ยืนยันจากซอร์สที่ให้มา (rootOption ใช้เพื่อให้ looksLikeOption() ทำงานถูกต้อง)
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;

/**
 * Unit tests สำหรับ {@link GroupImpl}
 *
 * หมายเหตุ: ใช้ concrete helper class จริงของโปรเจกต์ (DefaultOptionBuilder,
 * ArgumentBuilder, WriteableCommandLineImpl) แทนการ mock เนื่องจากไม่มี
 * mocking framework ใน classpath ที่กำหนด พฤติกรรมของ collaborator เหล่านี้
 * ที่ไม่ได้อยู่ใน source ของ GroupImpl ถูกกำกับด้วยคอมเมนต์ "ASSUMPTION"
 */
public class GroupImplTest {

    private DefaultOptionBuilder obuilder;
    private ArgumentBuilder abuilder;

    @Before
    public void setUp() {
        obuilder = new DefaultOptionBuilder();
        abuilder = new ArgumentBuilder();
    }

    /** helper สร้าง WriteableCommandLine โดยใช้ group เป็น root option (เพื่อ prefixes) */
    private WriteableCommandLine commandLine(final Option root, final List args) {
        return new WriteableCommandLineImpl(root, args);
    }

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_SeparatesArgumentsAndOptions() {
        Option opt = obuilder.withLongName("alpha").create();
        Argument arg = abuilder.withName("arg1").create();

        List options = new ArrayList();
        options.add(opt);
        options.add(arg);

        GroupImpl group = new GroupImpl(options, "grp", "desc", 0, 2);

        assertEquals(1, group.getOptions().size());
        assertTrue(group.getOptions().contains(opt));
        assertFalse(group.getOptions().contains(arg));

        assertEquals(1, group.getAnonymous().size());
        assertTrue(group.getAnonymous().contains(arg));
    }

    @Test
    public void testConstructor_EmptyOptions() {
        GroupImpl group = new GroupImpl(new ArrayList(), null, null, 0, 0);
        assertTrue(group.getOptions().isEmpty());
        assertTrue(group.getAnonymous().isEmpty());
        assertTrue(group.getPrefixes().isEmpty());
        assertTrue(group.getTriggers().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_NullOptionsThrowsNPE() {
        // Collections.unmodifiableList(null) -> NPE : boundary/null-input case
        new GroupImpl(null, "n", "d", 0, 1);
    }

    // ---------------------------------------------------------------
    // Simple getters
    // ---------------------------------------------------------------

    @Test
    public void testGetPreferredNameAndDescription() {
        GroupImpl group = new GroupImpl(new ArrayList(), "myGroup", "myDesc", 0, 1);
        assertEquals("myGroup", group.getPreferredName());
        assertEquals("myDesc", group.getDescription());
    }

    @Test
    public void testGetPreferredName_NullName() {
        GroupImpl group = new GroupImpl(new ArrayList(), null, "d", 0, 1);
        assertNull(group.getPreferredName());
    }

    @Test
    public void testMinimumMaximumIsRequired_NotRequired() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 5);
        assertEquals(0, group.getMinimum());
        assertEquals(5, group.getMaximum());
        assertFalse(group.isRequired());
    }

    @Test
    public void testMinimumMaximumIsRequired_Required() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 1, 5);
        assertTrue(group.isRequired());
    }

    // ---------------------------------------------------------------
    // canProcess
    // ---------------------------------------------------------------

    @Test
    public void testCanProcess_NullArgReturnsFalse() {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        WriteableCommandLine cl = commandLine(group, new ArrayList());

        assertFalse(group.canProcess(cl, null));
    }

    @Test
    public void testCanProcess_ExactTriggerMatch() {
        // ASSUMPTION: DefaultOptionBuilder default long prefix = "--"
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        WriteableCommandLine cl = commandLine(group, new ArrayList());

        assertTrue(group.canProcess(cl, "--alpha"));
    }

    @Test
    public void testCanProcess_UnknownArg_NotOptionLike_NoAnonymous_ReturnsFalse() {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        WriteableCommandLine cl = commandLine(group, new ArrayList());

        assertFalse(group.canProcess(cl, "plainValue"));
    }

    @Test
    public void testCanProcess_UnknownArg_NotOptionLike_WithAnonymous_ReturnsTrue() {
        Option opt = obuilder.withLongName("alpha").create();
        Argument arg = abuilder.withName("arg1").create();
        List options = new ArrayList();
        options.add(opt);
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        WriteableCommandLine cl = commandLine(group, new ArrayList());

        assertTrue(group.canProcess(cl, "plainValue"));
    }

    @Test
    public void testCanProcess_LooksLikeOptionButNoMatch_ReturnsFalse() {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        WriteableCommandLine cl = commandLine(group, new ArrayList());

        // "--beta" ดูเหมือน option (มี prefix "--") แต่ไม่ตรงกับ trigger ใด ๆ
        assertFalse(group.canProcess(cl, "--beta"));
    }

    // ---------------------------------------------------------------
    // getPrefixes / getTriggers
    // ---------------------------------------------------------------

    @Test
    public void testGetPrefixesAndTriggers() {
        Option opt = obuilder.withLongName("alpha").withShortName("a").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        assertTrue(group.getPrefixes().contains("--"));
        assertTrue(group.getPrefixes().contains("-"));
        assertTrue(group.getTriggers().contains("--alpha"));
        assertTrue(group.getTriggers().contains("-a"));
    }

    // ---------------------------------------------------------------
    // validate
    // ---------------------------------------------------------------

    @Test(expected = OptionException.class)
    public void testValidate_RequiredChildOptionAlwaysValidated() throws OptionException {
        Option opt = obuilder.withLongName("alpha").withRequired(true).create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        WriteableCommandLine cl = commandLine(group, new ArrayList());

        // opt required=true แต่ไม่ถูก process -> validate flag ถูกตั้งจาก isRequired()
        // -> option.validate() ควร throw (พฤติกรรมของ DefaultOption เอง)
        group.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_ChildGroupAlwaysValidated() throws OptionException {
        // ครอบคลุมสาขา "option instanceof Group" ใน validate()
        GroupImpl childGroup = new GroupImpl(new ArrayList(), "child", "d", 1, 1);
        List options = new ArrayList();
        options.add(childGroup);
        GroupImpl parent = new GroupImpl(options, "parent", "d", 0, 1);
        WriteableCommandLine cl = commandLine(parent, new ArrayList());

        parent.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_TooManyOptions() throws OptionException {
        Option opt1 = obuilder.withLongName("alpha").create();
        Option opt2 = obuilder.withLongName("beta").create();
        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1); // maximum = 1

        List args = new ArrayList();
        args.add("--alpha");
        args.add("--beta");
        WriteableCommandLine cl = commandLine(group, args);
        group.process(cl, args.listIterator());

        group.validate(cl); // present(2) > maximum(1) -> UNEXPECTED_TOKEN
    }

    @Test(expected = OptionException.class)
    public void testValidate_TooFewOptions() throws OptionException {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 1, 1); // minimum = 1
        WriteableCommandLine cl = commandLine(group, new ArrayList());

        group.validate(cl); // present(0) < minimum(1) -> MISSING_OPTION
    }

    @Test
    public void testValidate_Success() throws OptionException {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        List args = new ArrayList();
        args.add("--alpha");
        WriteableCommandLine cl = commandLine(group, args);
        group.process(cl, args.listIterator());

        group.validate(cl); // ไม่ควร throw
    }

    @Test(expected = OptionException.class)
    public void testValidate_AnonymousArgumentValidation() throws OptionException {
        // ครอบคลุม loop validate anonymous arguments ท้ายเมธอด
        Argument arg = abuilder.withName("arg1").withMinimum(1).create();
        List options = new ArrayList();
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        WriteableCommandLine cl = commandLine(group, new ArrayList());

        group.validate(cl); // arg ต้องการ minimum=1 แต่ไม่มีค่าเลย
    }

    // ---------------------------------------------------------------
    // process
    // ---------------------------------------------------------------

    @Test
    public void testProcess_ExactMatchProcessesOption() throws OptionException {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        List args = new ArrayList();
        args.add("--alpha");
        WriteableCommandLine cl = commandLine(group, args);

        group.process(cl, args.listIterator());
        assertTrue(cl.hasOption(opt));
    }

    @Test
    public void testProcess_MultipleTokensProcessedInLoop() throws OptionException {
        Option opt1 = obuilder.withLongName("alpha").create();
        Option opt2 = obuilder.withLongName("beta").create();
        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 2);

        List args = new ArrayList();
        args.add("--alpha");
        args.add("--beta");
        WriteableCommandLine cl = commandLine(group, args);

        group.process(cl, args.listIterator());
        assertTrue(cl.hasOption(opt1));
        assertTrue(cl.hasOption(opt2));
    }

    @Test
    public void testProcess_NonOptionArg_NoAnonymous_Breaks() throws OptionException {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        List args = new ArrayList();
        args.add("plainValue");
        ListIterator it = args.listIterator();
        WriteableCommandLine cl = commandLine(group, args);

        group.process(cl, it);
        // loop ควร break โดยไม่กิน token -> cursor rollback ไปตำแหน่งเดิม
        assertEquals(0, it.nextIndex());
        assertFalse(cl.hasOption(opt));
    }

    @Test
    public void testProcess_LooksLikeOptionNoMemberFound_Rollback() throws OptionException {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        List args = new ArrayList();
        args.add("--unknown");
        ListIterator it = args.listIterator();
        WriteableCommandLine cl = commandLine(group, args);

        group.process(cl, it);
        assertEquals(0, it.nextIndex());
        assertFalse(cl.hasOption(opt));
    }

    @Test
    public void testProcess_AnonymousArgumentConsumesValue() throws OptionException {
        Argument arg = abuilder.withName("arg1").create();
        List options = new ArrayList();
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        List args = new ArrayList();
        args.add("value1");
        WriteableCommandLine cl = commandLine(group, args);

        group.process(cl, args.listIterator());
        assertTrue(cl.hasOption(arg));
    }

    @Test(timeout = 5000)
    public void testProcess_InfiniteLoopGuard_SameTokenRollback() throws OptionException {
        // ASSUMPTION: Argument ที่สร้างด้วย maximum(0) จะ canProcess()=false เสมอ
        // (ไม่สามารถรับค่าเพิ่มได้) ใช้เพื่อกระตุ้นสาขา "arg == previous" rollback/break
        // ป้องกัน infinite loop ใน process(); ถ้า behavior จริงต่างจากนี้ ผลลัพธ์คือ
        // testcase นี้ยังยืนยันได้อย่างน้อยว่าไม่เกิด infinite loop (timeout guard)
        Argument arg = abuilder.withName("arg1").withMinimum(0).withMaximum(0).create();
        List options = new ArrayList();
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        List args = new ArrayList();
        args.add("value1");
        ListIterator it = args.listIterator();
        WriteableCommandLine cl = commandLine(group, args);

        group.process(cl, it);
        assertEquals(0, it.nextIndex());
    }

    // ---------------------------------------------------------------
    // appendUsage
    // ---------------------------------------------------------------

    @Test
    public void testAppendUsage_OptionalBracket() {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1); // minimum=0 -> optional

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        group.appendUsage(buffer, settings, null);
        String usage = buffer.toString();
        assertTrue(usage.startsWith("["));
        assertTrue(usage.endsWith("]"));
    }

    @Test
    public void testAppendUsage_NotOptionalWhenMinimumPositive() {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 1, 1); // minimum=1 -> ไม่ optional

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        group.appendUsage(buffer, settings, null);
        assertFalse(buffer.toString().startsWith("["));
    }

    @Test
    public void testAppendUsage_NamedNotExpanded() {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "grpName", "d", 0, 1);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet(); // ไม่มี DISPLAY_GROUP_EXPANDED, name != null -> expanded=false

        group.appendUsage(buffer, settings, null);
        assertEquals("grpName", buffer.toString());
    }

    @Test
    public void testAppendUsage_DefaultSeparatorPipe_NameNullAlwaysExpanded() {
        Option opt1 = obuilder.withLongName("alpha").create();
        Option opt2 = obuilder.withLongName("beta").create();
        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        GroupImpl group = new GroupImpl(options, null, "d", 0, 1); // name null -> expanded เสมอ

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet(); // childSettings = NONE branch

        group.appendUsage(buffer, settings, null);
        assertTrue(buffer.toString().indexOf("|") >= 0);
    }

    @Test
    public void testAppendUsage_CustomSeparator() {
        Option opt1 = obuilder.withLongName("alpha").create();
        Option opt2 = obuilder.withLongName("beta").create();
        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        GroupImpl group = new GroupImpl(options, null, "d", 0, 1);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();

        group.appendUsage(buffer, settings, null, ",");
        assertTrue(buffer.toString().indexOf(",") >= 0);
    }

    @Test
    public void testAppendUsage_WithComparatorSortsOptions() {
        Option opt1 = obuilder.withLongName("alpha").create();
        Option opt2 = obuilder.withLongName("beta").create();
        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        GroupImpl group = new GroupImpl(options, null, "d", 0, 1);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        Comparator reverseNameComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option a = (Option) o1;
                Option b = (Option) o2;
                return b.getPreferredName().compareTo(a.getPreferredName());
            }
        };

        group.appendUsage(buffer, settings, reverseNameComparator);
        String usage = buffer.toString();
        assertTrue(usage.indexOf("beta") < usage.indexOf("alpha"));
    }

    @Test
    public void testAppendUsage_ArgumentsAppended() {
        Argument arg = abuilder.withName("arg1").create();
        List options = new ArrayList();
        options.add(arg);
        GroupImpl group = new GroupImpl(options, null, "d", 0, 1);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        group.appendUsage(buffer, settings, null);
        assertTrue(buffer.toString().length() > 0);
    }

    @Test
    public void testAppendUsage_NestedGroupOptionalStrippedForChildren() {
        // จุดที่มักเป็นบั๊ก: childSettings ต้องเอา DISPLAY_OPTIONAL ออกก่อนส่งต่อ
        GroupImpl childGroup = new GroupImpl(new ArrayList(), "child", "d", 0, 1);
        List options = new ArrayList();
        options.add(childGroup);
        GroupImpl parent = new GroupImpl(options, null, "d", 0, 1);

        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);

        parent.appendUsage(buffer, settings, null);
        String usage = buffer.toString();
        int firstOpen = usage.indexOf('[');
        int secondOpen = usage.indexOf('[', firstOpen + 1);
        assertEquals(-1, secondOpen); // ไม่ควรมี bracket ซ้อนจาก child
    }

    // ---------------------------------------------------------------
    // helpLines
    // ---------------------------------------------------------------

    @Test
    public void testHelpLines_NameOnly() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 1);
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);

        List lines = group.helpLines(0, settings, null);
        assertEquals(1, lines.size());
    }

    @Test
    public void testHelpLines_ExpandedIncludesChildren() {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        List lines = group.helpLines(0, settings, null);
        assertFalse(lines.isEmpty());
    }

    @Test
    public void testHelpLines_ArgumentIncludesAnonymous() {
        Argument arg = abuilder.withName("arg1").create();
        List options = new ArrayList();
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        List lines = group.helpLines(0, settings, null);
        assertFalse(lines.isEmpty());
    }

    @Test
    public void testHelpLines_NoSettingsReturnsEmpty() {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        List lines = group.helpLines(0, new HashSet(), null);
        assertTrue(lines.isEmpty());
    }

    @Test
    public void testHelpLines_WithComparatorDoesNotThrow() {
        Option opt1 = obuilder.withLongName("alpha").create();
        Option opt2 = obuilder.withLongName("beta").create();
        List options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);
        Comparator reverseNameComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option a = (Option) o1;
                Option b = (Option) o2;
                return b.getPreferredName().compareTo(a.getPreferredName());
            }
        };

        List lines = group.helpLines(0, settings, reverseNameComparator);
        assertFalse(lines.isEmpty());
    }

    // ---------------------------------------------------------------
    // findOption
    // ---------------------------------------------------------------

    @Test
    public void testFindOption_Found() {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        assertSame(opt, group.findOption("--alpha"));
    }

    @Test
    public void testFindOption_NotFound() {
        Option opt = obuilder.withLongName("alpha").create();
        List options = new ArrayList();
        options.add(opt);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);

        assertNull(group.findOption("--nope"));
    }

    // ---------------------------------------------------------------
    // defaults
    // ---------------------------------------------------------------

    @Test
    public void testDefaults_NoExceptionThrown() {
        Option opt = obuilder.withLongName("alpha").create();
        Argument arg = abuilder.withName("arg1").create();
        List options = new ArrayList();
        options.add(opt);
        options.add(arg);
        GroupImpl group = new GroupImpl(options, "g", "d", 0, 1);
        WriteableCommandLine cl = commandLine(group, new ArrayList());

        group.defaults(cl); // ควรวน options และ anonymous ครบโดยไม่ throw
    }
}

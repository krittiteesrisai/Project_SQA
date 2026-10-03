package org.apache.commons.cli2.commandline;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.PropertyOption;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 Test Suite for WriteableCommandLineImpl.
 */
public class WriteableCommandLineImplTest {

    private Option rootOption;
    private Set rootPrefixes;
    private List arguments;
    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        rootPrefixes = new HashSet();
        rootPrefixes.add("--");
        rootPrefixes.add("-");
        rootOption = createMockOption("root", Collections.EMPTY_SET, rootPrefixes);
        arguments = new ArrayList();
        commandLine = new WriteableCommandLineImpl(rootOption, arguments);
    }

    // Helper: สร้าง Mock Option ผ่าน Dynamic Proxy ตามมาตรฐาน Java SE โดยไม่ต้องพึ่งภายนอก
    private Option createMockOption(final String preferredName, final Set triggers, final Set prefixes) {
        return (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class[] { Option.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    String name = method.getName();
                    if ("getPreferredName".equals(name)) {
                        return preferredName;
                    } else if ("getTriggers".equals(name)) {
                        return triggers != null ? triggers : Collections.EMPTY_SET;
                    } else if ("getPrefixes".equals(name)) {
                        return prefixes != null ? prefixes : Collections.EMPTY_SET;
                    } else if ("equals".equals(name)) {
                        return Boolean.valueOf(proxy == args[0]);
                    } else if ("hashCode".equals(name)) {
                        return Integer.valueOf(System.identityHashCode(proxy));
                    } else if ("toString".equals(name)) {
                        return "Option[" + preferredName + "]";
                    }
                    return null;
                }
            }
        );
    }

    // Helper: สร้าง Mock Argument (ซึ่งเป็น Subtype ของ Option)
    private Argument createMockArgument(final String preferredName, final Set triggers) {
        return (Argument) Proxy.newProxyInstance(
            Argument.class.getClassLoader(),
            new Class[] { Argument.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    String name = method.getName();
                    if ("getPreferredName".equals(name)) {
                        return preferredName;
                    } else if ("getTriggers".equals(name)) {
                        return triggers != null ? triggers : Collections.EMPTY_SET;
                    } else if ("getPrefixes".equals(name)) {
                        return Collections.EMPTY_SET;
                    } else if ("equals".equals(name)) {
                        return Boolean.valueOf(proxy == args[0]);
                    } else if ("hashCode".equals(name)) {
                        return Integer.valueOf(System.identityHashCode(proxy));
                    } else if ("toString".equals(name)) {
                        return "Argument[" + preferredName + "]";
                    }
                    return null;
                }
            }
        );
    }

    @Test
    public void testAddOptionAndTriggersMapping() {
        Set triggers = new HashSet();
        triggers.add("-h");
        triggers.add("--help");
        Option helpOpt = createMockOption("--help", triggers, Collections.EMPTY_SET);

        assertFalse(commandLine.hasOption(helpOpt));
        assertNull(commandLine.getOption("-h"));

        commandLine.addOption(helpOpt);

        assertTrue(commandLine.hasOption(helpOpt));
        assertSame(helpOpt, commandLine.getOption("--help"));
        assertSame(helpOpt, commandLine.getOption("-h"));
        assertNull(commandLine.getOption("-unknown"));

        List optionsList = commandLine.getOptions();
        assertEquals(1, optionsList.size());
        assertTrue(optionsList.contains(helpOpt));

        Set registeredTriggers = commandLine.getOptionTriggers();
        assertTrue(registeredTriggers.contains("-h"));
        assertTrue(registeredTriggers.contains("--help"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptionsUnmodifiable() {
        Option opt = createMockOption("--test", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addOption(opt);
        commandLine.getOptions().add(opt);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptionTriggersUnmodifiable() {
        Option opt = createMockOption("--test", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addOption(opt);
        commandLine.getOptionTriggers().add("--dummy");
    }

    @Test
    public void testAddValueWithArgumentOptionAutomaticallyAddsOption() {
        Argument arg = createMockArgument("file", Collections.EMPTY_SET);
        assertFalse(commandLine.hasOption(arg));

        // เมื่อ option เป็น Argument เมธอด addValue ต้องเรียก addOption โดยอัตโนมัติ
        commandLine.addValue(arg, "data.txt");

        assertTrue("Argument option must be added to options list", commandLine.hasOption(arg));
        List vals = commandLine.getValues(arg, null);
        assertEquals(1, vals.size());
        assertEquals("data.txt", vals.get(0));
    }

    @Test
    public void testAddValueWithNonArgumentOptionDoesNotAddOption() {
        Option opt = createMockOption("--opt", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addValue(opt, "val1");

        // Non-Argument จะไม่ถูก addOption
        assertFalse(commandLine.hasOption(opt));
        List vals = commandLine.getValues(opt, null);
        assertEquals(1, vals.size());
        assertEquals("val1", vals.get(0));

        // เพิ่มค่าที่สองเพื่อทดสอบ Branch: valueList != null
        commandLine.addValue(opt, "val2");
        vals = commandLine.getValues(opt, null);
        assertEquals(2, vals.size());
        assertEquals("val1", vals.get(0));
        assertEquals("val2", vals.get(1));
    }

    @Test
    public void testAddSwitchSuccessAndDuplicateThrowsException() {
        Option optTrue = createMockOption("--verbose", Collections.EMPTY_SET, Collections.EMPTY_SET);
        Option optFalse = createMockOption("--quiet", Collections.EMPTY_SET, Collections.EMPTY_SET);

        commandLine.addSwitch(optTrue, true);
        commandLine.addSwitch(optFalse, false);

        assertTrue(commandLine.hasOption(optTrue));
        assertTrue(commandLine.hasOption(optFalse));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(optTrue, null));
        assertEquals(Boolean.FALSE, commandLine.getSwitch(optFalse, null));

        // ใส่ Switch ซ้ำบน Option เดิม -> ต้องเกิด IllegalStateException
        try {
            commandLine.addSwitch(optTrue, false);
            fail("Expected IllegalStateException when setting switch twice");
        } catch (IllegalStateException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testGetSwitchPrecedenceHierarchy() {
        Option opt = createMockOption("--debug", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // 1. ไม่มีทั้ง switch, method default, และ option default -> คืนค่า null
        assertNull(commandLine.getSwitch(opt, null));

        // 2. ใช้ option default switch
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));

        // 3. Method default มีความสำคัญเหนือ option default
        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, Boolean.FALSE));

        // 4. Command line switch สำคัญสูงสุด
        commandLine.addSwitch(opt, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.FALSE));

        // 5. ลบ setDefaultSwitch ด้วย null
        Option opt2 = createMockOption("--flag", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(opt2, Boolean.TRUE);
        commandLine.setDefaultSwitch(opt2, null);
        assertNull(commandLine.getSwitch(opt2, null));
    }

    @Test
    public void testGetValuesReturnsEmptyWhenNoneSet() {
        Option opt = createMockOption("--item", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List vals = commandLine.getValues(opt, null);
        assertNotNull(vals);
        assertTrue(vals.isEmpty());
        assertSame(Collections.EMPTY_LIST, vals);

        List emptyDefault = new ArrayList();
        vals = commandLine.getValues(opt, emptyDefault);
        assertSame(Collections.EMPTY_LIST, vals);
    }

    @Test
    public void testGetValuesDefaultValuesPaddingAndRetaining() {
        Option opt = createMockOption("--ports", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // กรณีที่ 1: valueList เป็น null แต่มี defaultValues ส่งเข้ามา
        List defaults3 = Arrays.asList(new Object[]{"80", "443", "8080"});
        List result = commandLine.getValues(opt, defaults3);
        assertEquals(3, result.size());
        assertEquals("80", result.get(0));

        // กำหนดค่าจริง 1 ตัวลง commandLine
        commandLine.addValue(opt, "8000");

        // กรณีที่ 2: defaultValues.size() > valueList.size() -> ต้องคงค่าเดิมไว้ และ pad เพิ่มจาก defaults
        result = commandLine.getValues(opt, defaults3);
        assertEquals(3, result.size());
        assertEquals("8000", result.get(0)); // ค่าจริง
        assertEquals("443", result.get(1));  // ค่าจาก default ตำแหน่ง 1
        assertEquals("8080", result.get(2)); // ค่าจาก default ตำแหน่ง 2

        // กรณีที่ 3: defaultValues.size() <= valueList.size() -> คงค่าเดิมทั้งหมด ไม่ pad เพิ่ม
        commandLine.addValue(opt, "8001");
        commandLine.addValue(opt, "8002");
        List defaults1 = Arrays.asList(new Object[]{"80"});
        result = commandLine.getValues(opt, defaults1);
        assertEquals(3, result.size());
        assertEquals("8000", result.get(0));
        assertEquals("8001", result.get(1));
        assertEquals("8002", result.get(2));
    }

    @Test
    public void testGetValuesOptionLevelDefaults() {
        Option opt = createMockOption("--target", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // กำหนด default ผ่าน setDefaultValues ของ instance
        List optDefaults = Arrays.asList(new Object[]{"defaultTarget"});
        commandLine.setDefaultValues(opt, optDefaults);

        // ดึงค่าโดยส่ง method default เป็น null หรือ empty list
        List res1 = commandLine.getValues(opt, null);
        assertEquals(1, res1.size());
        assertEquals("defaultTarget", res1.get(0));

        List res2 = commandLine.getValues(opt, Collections.EMPTY_LIST);
        assertEquals(1, res2.size());
        assertEquals("defaultTarget", res2.get(0));

        // ทดสอบ setDefaultValues เป็น null เพื่อล้างค่า
        commandLine.setDefaultValues(opt, null);
        assertSame(Collections.EMPTY_LIST, commandLine.getValues(opt, null));
    }

    @Test
    public void testGetUndefaultedValues() {
        Option opt = createMockOption("--arg", Collections.EMPTY_SET, Collections.EMPTY_SET);
        assertSame(Collections.EMPTY_LIST, commandLine.getUndefaultedValues(opt));

        commandLine.setDefaultValues(opt, Arrays.asList(new Object[]{"def"}));
        // getUndefaultedValues ต้องไม่นำ default values มารวม
        assertSame(Collections.EMPTY_LIST, commandLine.getUndefaultedValues(opt));

        commandLine.addValue(opt, "actual");
        List actual = commandLine.getUndefaultedValues(opt);
        assertEquals(1, actual.size());
        assertEquals("actual", actual.get(0));
    }

    @Test
    public void testPropertyHandlingWithExplicitOption() {
        Option opt = createMockOption("-D", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // ยังไม่มี property
        assertEquals("defaultVal", commandLine.getProperty(opt, "env", "defaultVal"));
        assertSame(Collections.EMPTY_SET, commandLine.getProperties(opt));

        // เพิ่ม property ครั้งแรก
        commandLine.addProperty(opt, "env", "production");
        // เพิ่ม property ซ้ำเพื่อทดสอบ properties != null branch
        commandLine.addProperty(opt, "threads", "8");

        assertEquals("production", commandLine.getProperty(opt, "env", "defaultVal"));
        assertEquals("8", commandLine.getProperty(opt, "threads", "1"));
        assertEquals("defaultVal", commandLine.getProperty(opt, "missing", "defaultVal"));

        Set keys = commandLine.getProperties(opt);
        assertEquals(2, keys.size());
        assertTrue(keys.contains("env"));
        assertTrue(keys.contains("threads"));

        // ตรวจสอบว่าเป็น Unmodifiable Set
        try {
            keys.add("another");
            fail("Properties key set must be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testPropertyHandlingWithDefaultPropertyOption() {
        assertNull(commandLine.getProperty("myProp"));
        assertTrue(commandLine.getProperties().isEmpty());

        commandLine.addProperty("myProp", "myValue");

        assertEquals("myValue", commandLine.getProperty("myProp"));
        Set props = commandLine.getProperties();
        assertEquals(1, props.size());
        assertTrue(props.contains("myProp"));
    }

    @Test
    public void testLooksLikeOption() {
        assertTrue(commandLine.looksLikeOption("--help"));
        assertTrue(commandLine.looksLikeOption("-h"));
        assertFalse(commandLine.looksLikeOption("help"));
        assertFalse(commandLine.looksLikeOption(""));

        // กรณี rootOption ไม่มี Prefixes เลย
        Option emptyPrefixRoot = createMockOption("empty", Collections.EMPTY_SET, Collections.EMPTY_SET);
        WriteableCommandLineImpl emptyPrefixCmd = new WriteableCommandLineImpl(emptyPrefixRoot, Collections.EMPTY_LIST);
        assertFalse(emptyPrefixCmd.looksLikeOption("--help"));
    }

    @Test
    public void testToStringFormatting() {
        // กรณี arguments ว่าง
        assertEquals("", commandLine.toString());

        // กรณี argument เดี่ยวไม่มีช่องว่าง
        arguments.add("compile");
        assertEquals("compile", commandLine.toString());

        // กรณีมีช่องว่าง (ต้องใส่เครื่องหมายคำพูด) และมีตัวถัดไป
        arguments.add("file with spaces.txt");
        arguments.add("--verbose");
        assertEquals("compile \"file with spaces.txt\" --verbose", commandLine.toString());

        // ตรวจสอบ getNormalised()
        List normalised = commandLine.getNormalised();
        assertEquals(3, normalised.size());
        try {
            normalised.add("illegal");
            fail("Normalised list must be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testHasOptionBoundaryValues() {
        assertFalse(commandLine.hasOption((Option) null));
        Option nonExistent = createMockOption("--non-existent", Collections.EMPTY_SET, Collections.EMPTY_SET);
        assertFalse(commandLine.hasOption(nonExistent));
    }
}
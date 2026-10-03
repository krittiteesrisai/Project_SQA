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
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WriteableCommandLineImplTest {

    private Option rootOption;
    private List argumentList;
    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        rootOption = createMockOption("root", Collections.EMPTY_SET, prefixes);
        argumentList = new ArrayList();
        commandLine = new WriteableCommandLineImpl(rootOption, argumentList);
    }

    // Helper: สร้าง Option Mock ด้วย Java Dynamic Proxy
    private Option createMockOption(final String preferredName, final Set triggers, final Set prefixes) {
        return (Option) Proxy.newProxyInstance(
            Option.class.getClassLoader(),
            new Class[] { Option.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) {
                    String name = method.getName();
                    if ("getPreferredName".equals(name)) return preferredName;
                    if ("getTriggers".equals(name)) return triggers != null ? triggers : Collections.EMPTY_SET;
                    if ("getPrefixes".equals(name)) return prefixes != null ? prefixes : Collections.EMPTY_SET;
                    if ("toString".equals(name)) return "Option[" + preferredName + "]";
                    return null;
                }
            }
        );
    }

    // Helper: สร้าง Argument Mock ซึ่งสืบทอดจาก Option
    private Argument createMockArgument(final String preferredName, final Set triggers) {
        return (Argument) Proxy.newProxyInstance(
            Argument.class.getClassLoader(),
            new Class[] { Argument.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) {
                    String name = method.getName();
                    if ("getPreferredName".equals(name)) return preferredName;
                    if ("getTriggers".equals(name)) return triggers != null ? triggers : Collections.EMPTY_SET;
                    if ("getPrefixes".equals(name)) return Collections.EMPTY_SET;
                    if ("toString".equals(name)) return "Argument[" + preferredName + "]";
                    return null;
                }
            }
        );
    }

    @Test
    public void testAddOptionAndTriggersLookup() {
        Set triggers = new HashSet();
        triggers.add("-f");
        triggers.add("--file");
        Option fileOpt = createMockOption("--file", triggers, Collections.EMPTY_SET);

        assertFalse(commandLine.hasOption(fileOpt));
        assertNull(commandLine.getOption("-f"));

        commandLine.addOption(fileOpt);

        assertTrue(commandLine.hasOption(fileOpt));
        assertSame(fileOpt, commandLine.getOption("-f"));
        assertSame(fileOpt, commandLine.getOption("--file"));
        assertNull(commandLine.getOption("--unknown"));
        assertTrue(commandLine.getOptionTriggers().contains("-f"));
        assertTrue(commandLine.getOptionTriggers().contains("--file"));
    }

    @Test
    public void testAddValueWithArgumentBranch() {
        Argument arg = createMockArgument("arg", Collections.EMPTY_SET);

        // Branch: option instanceof Argument is TRUE -> calls addOption internally
        commandLine.addValue(arg, "value1");
        assertTrue(commandLine.hasOption(arg));
        
        // Branch: valueList != null (adding a second value)
        commandLine.addValue(arg, "value2");

        List values = commandLine.getValues(arg, null);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    @Test
    public void testAddValueWithNonArgumentBranch() {
        Option regularOpt = createMockOption("reg", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Branch: option instanceof Argument is FALSE -> does NOT call addOption
        commandLine.addValue(regularOpt, "val");
        assertFalse(commandLine.hasOption(regularOpt));

        List values = commandLine.getValues(regularOpt, null);
        assertEquals(1, values.size());
        assertEquals("val", values.get(0));
    }

    @Test
    public void testAddSwitchSuccessAndDuplicateException() {
        Option switchOpt = createMockOption("-s", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Branch: switches.containsKey is FALSE
        commandLine.addSwitch(switchOpt, true);
        assertTrue(commandLine.hasOption(switchOpt));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(switchOpt, null));

        // Branch: switches.containsKey is TRUE -> IllegalStateException
        try {
            commandLine.addSwitch(switchOpt, false);
            fail("Expected IllegalStateException when adding an already set switch");
        } catch (IllegalStateException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testAddSwitchFalseValue() {
        Option switchOpt = createMockOption("-off", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addSwitch(switchOpt, false);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(switchOpt, null));
    }

    @Test
    public void testGetValuesHierarchy() {
        Option opt = createMockOption("-v", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List methodDefaults = Arrays.asList(new Object[] { "d1" });
        List optionDefaults = Arrays.asList(new Object[] { "opt_d1", "opt_d2" });

        // Stage 1: All values null -> Returns empty list
        List res1 = commandLine.getValues(opt, null);
        assertNotNull(res1);
        assertTrue(res1.isEmpty());

        // Stage 2: Empty methodDefaults & no commandLine value -> Falls back to option defaults
        commandLine.setDefaultValues(opt, optionDefaults);
        List res2 = commandLine.getValues(opt, Collections.EMPTY_LIST);
        assertEquals(optionDefaults, res2);

        // Stage 3: Null commandLine values -> Falls back to methodDefaults
        List res3 = commandLine.getValues(opt, methodDefaults);
        assertEquals(methodDefaults, res3);

        // Stage 4: CommandLine value is present -> Overrides all defaults
        commandLine.addValue(opt, "actual");
        List res4 = commandLine.getValues(opt, methodDefaults);
        assertEquals(1, res4.size());
        assertEquals("actual", res4.get(0));
    }

    @Test
    public void testSetDefaultValuesNullBranch() {
        Option opt = createMockOption("-v", Collections.EMPTY_SET, Collections.EMPTY_SET);
        List optionDefaults = Collections.singletonList("defaultVal");
        
        commandLine.setDefaultValues(opt, optionDefaults);
        assertEquals(optionDefaults, commandLine.getValues(opt, null));

        // Branch: defaults == null -> removes option defaults
        commandLine.setDefaultValues(opt, null);
        assertTrue(commandLine.getValues(opt, null).isEmpty());
    }

    @Test
    public void testGetSwitchHierarchy() {
        Option opt = createMockOption("-toggle", Collections.EMPTY_SET, Collections.EMPTY_SET);

        // Stage 1: All null
        assertNull(commandLine.getSwitch(opt, null));

        // Stage 2: Falls back to defaultSwitches
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));

        // Stage 3: Falls back to method defaultValue
        assertEquals(Boolean.FALSE, commandLine.getSwitch(createMockOption("-other", null, null), Boolean.FALSE));

        // Stage 4: Command line switch overrides all
        commandLine.addSwitch(opt, false);
        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, Boolean.TRUE));
    }

    @Test
    public void testSetDefaultSwitchNullBranch() {
        Option opt = createMockOption("-toggle", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));

        // Branch: defaultSwitch == null -> removes default switch
        commandLine.setDefaultSwitch(opt, null);
        assertNull(commandLine.getSwitch(opt, null));
    }

    @Test
    public void testPropertiesHandling() {
        commandLine.addProperty("key1", "value1");

        assertEquals("value1", commandLine.getProperty("key1", "default"));
        assertEquals("default", commandLine.getProperty("nonExistent", "default"));

        Set props = commandLine.getProperties();
        assertEquals(1, props.size());
        assertTrue(props.contains("key1"));

        // Immutability test
        try {
            props.add("newKey");
            fail("getProperties() should be unmodifiable");
        } catch (UnsupportedOperationException expected) {}
    }

    @Test
    public void testLooksLikeOption() {
        // Prefixes are "-" and "--"
        assertTrue(commandLine.looksLikeOption("-a"));
        assertTrue(commandLine.looksLikeOption("--verbose"));
        assertFalse(commandLine.looksLikeOption("verbose"));
        assertFalse(commandLine.looksLikeOption("/help"));
        assertFalse(commandLine.looksLikeOption(""));
    }

    @Test
    public void testToStringWithVariousArguments() {
        // Empty arguments
        assertEquals("", commandLine.toString());

        // Single argument without space
        argumentList.add("--opt");
        assertEquals("--opt", commandLine.toString());

        // Argument with space: triggers quoted branch: arg.indexOf(' ') >= 0
        argumentList.add("value with spaces");
        // Also triggers i.hasNext() appending space delimiter
        assertEquals("--opt \"value with spaces\"", commandLine.toString());

        // Additional argument without space
        argumentList.add("finalArg");
        assertEquals("--opt \"value with spaces\" finalArg", commandLine.toString());
    }

    @Test
    public void testUnmodifiableCollections() {
        Option opt = createMockOption("-o", Collections.EMPTY_SET, Collections.EMPTY_SET);
        commandLine.addOption(opt);

        // getOptions() unmodifiable
        List options = commandLine.getOptions();
        try {
            options.add(opt);
            fail("getOptions() should be unmodifiable");
        } catch (UnsupportedOperationException expected) {}

        // getOptionTriggers() unmodifiable
        Set triggers = commandLine.getOptionTriggers();
        try {
            triggers.add("dummy");
            fail("getOptionTriggers() should be unmodifiable");
        } catch (UnsupportedOperationException expected) {}

        // getNormalised() unmodifiable
        List normalised = commandLine.getNormalised();
        try {
            normalised.add("dummy");
            fail("getNormalised() should be unmodifiable");
        } catch (UnsupportedOperationException expected) {}
    }
}
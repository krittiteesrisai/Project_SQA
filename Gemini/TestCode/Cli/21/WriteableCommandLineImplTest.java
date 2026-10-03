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
    private Set rootPrefixes;
    private List argumentsList;
    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        rootPrefixes = new HashSet(Arrays.asList(new String[]{"--", "-"}));
        rootOption = createMockOption("root", Collections.EMPTY_SET, rootPrefixes, null);
        argumentsList = new ArrayList();
        commandLine = new WriteableCommandLineImpl(rootOption, argumentsList);
    }

    // =========================================================================
    // Helper Methods: สร้าง Dynamic Proxy เพื่อจำลอง Option และ Argument
    // โดยไม่ต้องพึ่งพา Mocking Framework ภายนอก
    // =========================================================================

    private Option createMockOption(final String preferredName,
                                    final Set triggers,
                                    final Set prefixes,
                                    final Option parent) {
        return (Option) Proxy.newProxyInstance(
                Option.class.getClassLoader(),
                new Class[]{Option.class},
                new OptionInvocationHandler(preferredName, triggers, prefixes, parent)
        );
    }

    private Argument createMockArgument(final String preferredName,
                                        final Set triggers,
                                        final Set prefixes,
                                        final Option parent) {
        return (Argument) Proxy.newProxyInstance(
                Argument.class.getClassLoader(),
                new Class[]{Argument.class},
                new OptionInvocationHandler(preferredName, triggers, prefixes, parent)
        );
    }

    private static class OptionInvocationHandler implements InvocationHandler {
        private final String preferredName;
        private final Set triggers;
        private final Set prefixes;
        private final Option parent;

        public OptionInvocationHandler(String preferredName,
                                       Set triggers,
                                       Set prefixes,
                                       Option parent) {
            this.preferredName = preferredName;
            this.triggers = triggers != null ? triggers : Collections.EMPTY_SET;
            this.prefixes = prefixes != null ? prefixes : Collections.EMPTY_SET;
            this.parent = parent;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String methodName = method.getName();
            if ("getPreferredName".equals(methodName)) {
                return preferredName;
            } else if ("getTriggers".equals(methodName)) {
                return triggers;
            } else if ("getPrefixes".equals(methodName)) {
                return prefixes;
            } else if ("getParent".equals(methodName)) {
                return parent;
            } else if ("equals".equals(methodName)) {
                return Boolean.valueOf(proxy == args[0]);
            } else if ("hashCode".equals(methodName)) {
                return Integer.valueOf(System.identityHashCode(proxy));
            } else if ("toString".equals(methodName)) {
                return "MockOption[" + preferredName + "]";
            }
            Class returnType = method.getReturnType();
            if (returnType == boolean.class) {
                return Boolean.FALSE;
            } else if (returnType == int.class) {
                return Integer.valueOf(0);
            }
            return null;
        }
    }

    // =========================================================================
    // Test Cases
    // =========================================================================

    @Test
    public void testConstructorAndUnmodifiableCollections() {
        argumentsList.add("arg1");
        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, argumentsList);

        assertEquals(1, cl.getNormalised().size());
        assertEquals("arg1", cl.getNormalised().get(0));

        try {
            cl.getOptions().add(rootOption);
            fail("getOptions() should return an unmodifiable list");
        } catch (UnsupportedOperationException expected) {
        }

        try {
            cl.getOptionTriggers().add("trigger");
            fail("getOptionTriggers() should return an unmodifiable set");
        } catch (UnsupportedOperationException expected) {
        }

        try {
            cl.getNormalised().add("newArg");
            fail("getNormalised() should return an unmodifiable list");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testAddOption_SingleOptionWithTriggers() {
        Set triggers = new HashSet(Arrays.asList(new String[]{"-h", "--help"}));
        Option helpOption = createMockOption("--help", triggers, rootPrefixes, null);

        commandLine.addOption(helpOption);

        assertTrue("Should have help option", commandLine.hasOption(helpOption));
        assertEquals(helpOption, commandLine.getOption("--help"));
        assertEquals(helpOption, commandLine.getOption("-h"));
        assertNull(commandLine.getOption("-unknown"));
        assertEquals(1, commandLine.getOptions().size());
        assertTrue(commandLine.getOptionTriggers().contains("-h"));
        assertTrue(commandLine.getOptionTriggers().contains("--help"));
    }

    @Test
    public void testAddOption_WithParentHierarchyAndPreventLoop() {
        Option grandParent = createMockOption("grandParent", Collections.EMPTY_SET, rootPrefixes, null);
        Option parent = createMockOption("parent", Collections.EMPTY_SET, rootPrefixes, grandParent);
        Option child1 = createMockOption("child1", Collections.EMPTY_SET, rootPrefixes, parent);
        Option child2 = createMockOption("child2", Collections.EMPTY_SET, rootPrefixes, parent);

        commandLine.addOption(child1);
        // options list should contain child1, parent, grandParent
        assertEquals(3, commandLine.getOptions().size());
        assertTrue(commandLine.hasOption(child1));
        assertTrue(commandLine.hasOption(parent));
        assertTrue(commandLine.hasOption(grandParent));

        // Adding child2 whose parent is already added: should break parent-loop early
        commandLine.addOption(child2);
        assertEquals(4, commandLine.getOptions().size());
        assertTrue(commandLine.hasOption(child2));
    }

    @Test
    public void testAddValue_RegularOptionVsArgument() {
        Option regularOpt = createMockOption("-f", Collections.EMPTY_SET, rootPrefixes, null);
        Argument argOpt = createMockArgument("file", Collections.EMPTY_SET, rootPrefixes, null);

        // Regular option does not trigger addOption inside addValue
        commandLine.addValue(regularOpt, "val1");
        assertFalse("addValue on regular option should not auto-add to options", commandLine.hasOption(regularOpt));

        // Argument option triggers addOption inside addValue
        commandLine.addValue(argOpt, "argVal1");
        assertTrue("addValue on Argument should auto-add to options", commandLine.hasOption(argOpt));

        // Append second value to existing list
        commandLine.addValue(argOpt, "argVal2");
        List vals = commandLine.getUndefaultedValues(argOpt);
        assertEquals(2, vals.size());
        assertEquals("argVal1", vals.get(0));
        assertEquals("argVal2", vals.get(1));
    }

    @Test
    public void testAddSwitch_TrueAndFalse() {
        Option switchOpt1 = createMockOption("-v", Collections.EMPTY_SET, rootPrefixes, null);
        Option switchOpt2 = createMockOption("-q", Collections.EMPTY_SET, rootPrefixes, null);

        commandLine.addSwitch(switchOpt1, true);
        commandLine.addSwitch(switchOpt2, false);

        assertTrue(commandLine.hasOption(switchOpt1));
        assertTrue(commandLine.hasOption(switchOpt2));
        assertEquals(Boolean.TRUE, commandLine.getSwitch(switchOpt1, null));
        assertEquals(Boolean.FALSE, commandLine.getSwitch(switchOpt2, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_DuplicateThrowsException() {
        Option switchOpt = createMockOption("-v", Collections.EMPTY_SET, rootPrefixes, null);
        commandLine.addSwitch(switchOpt, true);
        // Adding the same switch again should throw IllegalStateException
        commandLine.addSwitch(switchOpt, false);
    }

    @Test
    public void testGetValues_NoValuesAndNoDefaultsReturnsEmptyList() {
        Option opt = createMockOption("-x", Collections.EMPTY_SET, rootPrefixes, null);

        List result = commandLine.getValues(opt, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());

        List undefaulted = commandLine.getUndefaultedValues(opt);
        assertNotNull(undefaulted);
        assertTrue(undefaulted.isEmpty());
    }

    @Test
    public void testGetValues_EmptyValuesWithDefaultsSupplied() {
        Option opt = createMockOption("-x", Collections.EMPTY_SET, rootPrefixes, null);
        List defaults = Arrays.asList(new Object[]{"def1", "def2"});

        List result = commandLine.getValues(opt, defaults);
        assertEquals(defaults, result);
    }

    @Test
    public void testGetValues_FallbackToCommandLineDefaults() {
        Option opt = createMockOption("-x", Collections.EMPTY_SET, rootPrefixes, null);
        List defaults = Arrays.asList(new Object[]{"fallback1"});
        commandLine.setDefaultValues(opt, defaults);

        // Case 1: param is null
        List result = commandLine.getValues(opt, null);
        assertEquals(defaults, result);

        // Case 2: param is empty list
        result = commandLine.getValues(opt, Collections.EMPTY_LIST);
        assertEquals(defaults, result);

        // Case 3: clear default values with null
        commandLine.setDefaultValues(opt, null);
        result = commandLine.getValues(opt, null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetValues_AugmentationWhenDefaultsLargerThanValues() {
        Option opt = createMockOption("-x", Collections.EMPTY_SET, rootPrefixes, null);
        commandLine.addValue(opt, "v1");

        List defaults = Arrays.asList(new Object[]{"d1", "d2", "d3"});
        List result = commandLine.getValues(opt, defaults);

        // Should keep "v1" and augment with "d2" and "d3"
        assertEquals(3, result.size());
        assertEquals("v1", result.get(0));
        assertEquals("d2", result.get(1));
        assertEquals("d3", result.get(2));
    }

    @Test
    public void testGetValues_NoAugmentationWhenValuesEqualOrLargerThanDefaults() {
        Option opt = createMockOption("-x", Collections.EMPTY_SET, rootPrefixes, null);
        commandLine.addValue(opt, "v1");
        commandLine.addValue(opt, "v2");
        commandLine.addValue(opt, "v3");

        // Defaults size smaller
        List defaultsSmaller = Arrays.asList(new Object[]{"d1"});
        List result1 = commandLine.getValues(opt, defaultsSmaller);
        assertEquals(3, result1.size());
        assertEquals("v1", result1.get(0));

        // Defaults size equal
        List defaultsEqual = Arrays.asList(new Object[]{"d1", "d2", "d3"});
        List result2 = commandLine.getValues(opt, defaultsEqual);
        assertEquals(3, result2.size());
        assertEquals("v1", result2.get(0));
    }

    @Test
    public void testGetSwitch_FallbackChain() {
        Option opt = createMockOption("-s", Collections.EMPTY_SET, rootPrefixes, null);

        // 1. All null -> null
        assertNull(commandLine.getSwitch(opt, null));

        // 2. Default switch configured on commandline -> returns defaultSwitches
        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, null));

        // 3. Method parameter defaultValue overrides commandline defaultSwitches
        assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, Boolean.FALSE));

        // 4. Actual switch added overrides both
        commandLine.addSwitch(opt, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.FALSE));

        // 5. Test removing default switch with null
        Option opt2 = createMockOption("-s2", Collections.EMPTY_SET, rootPrefixes, null);
        commandLine.setDefaultSwitch(opt2, Boolean.TRUE);
        commandLine.setDefaultSwitch(opt2, null);
        assertNull(commandLine.getSwitch(opt2, null));
    }

    @Test
    public void testProperties_OptionSpecific() {
        Option opt = createMockOption("-D", Collections.EMPTY_SET, rootPrefixes, null);

        // Initially empty
        assertNull(commandLine.getProperty(opt, "key1", null));
        assertEquals("defaultVal", commandLine.getProperty(opt, "key1", "defaultVal"));
        assertTrue(commandLine.getProperties(opt).isEmpty());

        // Add property
        commandLine.addProperty(opt, "env", "production");
        commandLine.addProperty(opt, "port", "8080");

        assertEquals("production", commandLine.getProperty(opt, "env", null));
        assertEquals("8080", commandLine.getProperty(opt, "port", "default"));
        assertEquals("default", commandLine.getProperty(opt, "nonExisting", "default"));

        Set keys = commandLine.getProperties(opt);
        assertEquals(2, keys.size());
        assertTrue(keys.contains("env"));
        assertTrue(keys.contains("port"));

        try {
            keys.add("another");
            fail("Properties set should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void testProperties_ShortcutMethodsUsingPropertyOption() {
        // Initially empty
        assertNull(commandLine.getProperty("myProp"));
        assertTrue(commandLine.getProperties().isEmpty());

        // Add property via shortcuts
        commandLine.addProperty("myProp", "myVal");
        assertEquals("myVal", commandLine.getProperty("myProp"));
        assertTrue(commandLine.getProperties().contains("myProp"));
    }

    @Test
    public void testLooksLikeOption() {
        assertTrue("Starts with -", commandLine.looksLikeOption("-file"));
        assertTrue("Starts with --", commandLine.looksLikeOption("--help"));
        assertTrue("Matches exact prefix", commandLine.looksLikeOption("-"));
        assertFalse("Does not match prefix", commandLine.looksLikeOption("regularArg"));
        assertFalse("Empty string", commandLine.looksLikeOption(""));

        // Test with empty prefixes
        Option rootNoPrefixes = createMockOption("rootEmpty", Collections.EMPTY_SET, Collections.EMPTY_SET, null);
        WriteableCommandLineImpl clNoPrefix = new WriteableCommandLineImpl(rootNoPrefixes, Collections.EMPTY_LIST);
        assertFalse(clNoPrefix.looksLikeOption("--help"));
    }

    @Test
    public void testToString_FormattingAndQuotes() {
        // Case 1: Empty arguments
        WriteableCommandLineImpl clEmpty = new WriteableCommandLineImpl(rootOption, Collections.EMPTY_LIST);
        assertEquals("", clEmpty.toString());

        // Case 2: Without spaces and with spaces
        List args = new ArrayList();
        args.add("--verbose");
        args.add("path with space/file.txt");
        args.add("target");

        WriteableCommandLineImpl cl = new WriteableCommandLineImpl(rootOption, args);
        String expected = "--verbose \"path with space/file.txt\" target";
        assertEquals(expected, cl.toString());
    }
}
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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriteableCommandLineImplTest {

    private Option rootOption;
    private List arguments;
    private WriteableCommandLineImpl commandLine;

    @Before
    public void setUp() {
        Set prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        rootOption = createOptionProxy("root", Collections.EMPTY_SET, prefixes, Option.class);
        arguments = new ArrayList();
        commandLine = new WriteableCommandLineImpl(rootOption, arguments);
    }

    private Option createOptionProxy(final String preferredName, final Set triggers, final Set prefixes, final Class interfaceClass) {
        return (Option) Proxy.newProxyInstance(
            interfaceClass.getClassLoader(),
            new Class[] { interfaceClass },
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
                        return "OptionProxy[" + preferredName + "]";
                    }
                    Class returnType = method.getReturnType();
                    if (returnType == boolean.class) return Boolean.FALSE;
                    if (returnType == int.class) return Integer.valueOf(0);
                    return null;
                }
            }
        );
    }

    @Test
    public void testAddOptionAndGetOption() {
        Set triggers = new HashSet();
        triggers.add("-t");
        triggers.add("--test");
        Option opt = createOptionProxy("--test", triggers, Collections.EMPTY_SET, Option.class);

        Assert.assertFalse(commandLine.hasOption(opt));
        Assert.assertNull(commandLine.getOption("-t"));
        Assert.assertNull(commandLine.getOption("--test"));

        commandLine.addOption(opt);

        Assert.assertTrue(commandLine.hasOption(opt));
        Assert.assertSame(opt, commandLine.getOption("-t"));
        Assert.assertSame(opt, commandLine.getOption("--test"));
        Assert.assertEquals(1, commandLine.getOptions().size());
        Assert.assertTrue(commandLine.getOptionTriggers().contains("-t"));
        Assert.assertTrue(commandLine.getOptionTriggers().contains("--test"));
    }

    @Test
    public void testAddValueWithArgumentOption() {
        Option argOpt = createOptionProxy("arg", Collections.singleton("-a"), Collections.EMPTY_SET, Argument.class);

        commandLine.addValue(argOpt, "val1");
        commandLine.addValue(argOpt, "val2");

        Assert.assertTrue(commandLine.hasOption(argOpt));
        List values = commandLine.getValues(argOpt, null);
        Assert.assertEquals(Arrays.asList(new Object[] {"val1", "val2"}), values);
    }

    @Test
    public void testAddValueWithNonArgumentOption() {
        Option opt = createOptionProxy("opt", Collections.singleton("-o"), Collections.EMPTY_SET, Option.class);

        commandLine.addValue(opt, "val1");

        // Non-Argument options should not be automatically added to 'options' list
        Assert.assertFalse(commandLine.hasOption(opt));
        List values = commandLine.getValues(opt, null);
        Assert.assertEquals(Collections.singletonList("val1"), values);
    }

    @Test
    public void testAddSwitchSuccess() {
        Option optTrue = createOptionProxy("optTrue", Collections.singleton("-t"), Collections.EMPTY_SET, Option.class);
        Option optFalse = createOptionProxy("optFalse", Collections.singleton("-f"), Collections.EMPTY_SET, Option.class);

        commandLine.addSwitch(optTrue, true);
        commandLine.addSwitch(optFalse, false);

        Assert.assertTrue(commandLine.hasOption(optTrue));
        Assert.assertTrue(commandLine.hasOption(optFalse));
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(optTrue, null));
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(optFalse, null));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchDuplicateThrowsException() {
        Option opt = createOptionProxy("opt", Collections.singleton("-s"), Collections.EMPTY_SET, Option.class);
        commandLine.addSwitch(opt, true);
        commandLine.addSwitch(opt, false); // Expected to throw IllegalStateException
    }

    @Test
    public void testGetValuesFallbackChain() {
        Option opt = createOptionProxy("opt", Collections.singleton("-o"), Collections.EMPTY_SET, Option.class);

        // 1. Completely unset: should return EMPTY_LIST
        List res1 = commandLine.getValues(opt, null);
        Assert.assertEquals(Collections.EMPTY_LIST, res1);

        // 2. Default values passed as empty list: should still fallback to EMPTY_LIST
        List resEmpty = commandLine.getValues(opt, Collections.EMPTY_LIST);
        Assert.assertEquals(Collections.EMPTY_LIST, resEmpty);

        // 3. Fallback to method-supplied default values
        List methodDefaults = Arrays.asList(new Object[] {"m1", "m2"});
        List res2 = commandLine.getValues(opt, methodDefaults);
        Assert.assertEquals(methodDefaults, res2);

        // 4. Set configured defaults, but pass null defaultValues -> fallback to configured defaults
        List configuredDefaults = Arrays.asList(new Object[] {"c1"});
        commandLine.setDefaultValues(opt, configuredDefaults);
        List res3 = commandLine.getValues(opt, null);
        Assert.assertEquals(configuredDefaults, res3);

        // 5. Explicit command line value added -> must return explicit value, not defaults
        commandLine.addValue(opt, "actual");
        List res4 = commandLine.getValues(opt, methodDefaults);
        Assert.assertEquals(Collections.singletonList("actual"), res4);
    }

    @Test
    public void testGetUndefaultedValues() {
        Option opt = createOptionProxy("opt", Collections.singleton("-o"), Collections.EMPTY_SET, Option.class);

        Assert.assertEquals(Collections.EMPTY_LIST, commandLine.getUndefaultedValues(opt));

        commandLine.setDefaultValues(opt, Arrays.asList(new Object[] {"def"}));
        // Should ignore configured defaults
        Assert.assertEquals(Collections.EMPTY_LIST, commandLine.getUndefaultedValues(opt));

        commandLine.addValue(opt, "real");
        Assert.assertEquals(Collections.singletonList("real"), commandLine.getUndefaultedValues(opt));
    }

    @Test
    public void testGetSwitchFallbackChain() {
        Option opt = createOptionProxy("opt", Collections.singleton("-s"), Collections.EMPTY_SET, Option.class);

        // 1. Nothing set -> returns null
        Assert.assertNull(commandLine.getSwitch(opt, null));

        // 2. Use defaultValue argument
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.TRUE));

        // 3. Use defaultSwitches map
        commandLine.setDefaultSwitch(opt, Boolean.FALSE);
        Assert.assertEquals(Boolean.FALSE, commandLine.getSwitch(opt, null));

        // 4. Actual switch added -> overrides defaults
        commandLine.addSwitch(opt, true);
        Assert.assertEquals(Boolean.TRUE, commandLine.getSwitch(opt, Boolean.FALSE));
    }

    @Test
    public void testSetDefaultValuesAndSwitchNullRemoves() {
        Option opt = createOptionProxy("opt", Collections.singleton("-o"), Collections.EMPTY_SET, Option.class);

        commandLine.setDefaultValues(opt, Arrays.asList(new Object[] {"v"}));
        commandLine.setDefaultValues(opt, null); // remove
        Assert.assertEquals(Collections.EMPTY_LIST, commandLine.getValues(opt, null));

        commandLine.setDefaultSwitch(opt, Boolean.TRUE);
        commandLine.setDefaultSwitch(opt, null); // remove
        Assert.assertNull(commandLine.getSwitch(opt, null));
    }

    @Test
    public void testPropertiesHandlingWithOptions() {
        Option opt = createOptionProxy("opt", Collections.singleton("-D"), Collections.EMPTY_SET, Option.class);

        // Uninitialized state
        Assert.assertNull(commandLine.getProperty(opt, "missing", null));
        Assert.assertEquals("defaultVal", commandLine.getProperty(opt, "missing", "defaultVal"));
        Assert.assertEquals(Collections.EMPTY_SET, commandLine.getProperties(opt));

        // Add property
        commandLine.addProperty(opt, "key1", "val1");
        commandLine.addProperty(opt, "key2", "val2");

        Assert.assertEquals("val1", commandLine.getProperty(opt, "key1", "defaultVal"));
        Assert.assertEquals("val2", commandLine.getProperty(opt, "key2", "defaultVal"));
        Assert.assertEquals("defaultVal", commandLine.getProperty(opt, "nonExistent", "defaultVal"));

        Set keys = commandLine.getProperties(opt);
        Assert.assertEquals(2, keys.size());
        Assert.assertTrue(keys.contains("key1"));
        Assert.assertTrue(keys.contains("key2"));
    }

    @Test
    public void testPropertiesHandlingWithDefaultPropertyOption() {
        // Test convenience methods delegating to new PropertyOption()
        Assert.assertNull(commandLine.getProperty("someProp"));
        Assert.assertEquals(Collections.EMPTY_SET, commandLine.getProperties());

        commandLine.addProperty("foo", "bar");
        Assert.assertEquals("bar", commandLine.getProperty("foo"));
        Set props = commandLine.getProperties();
        Assert.assertEquals(1, props.size());
        Assert.assertTrue(props.contains("foo"));
    }

    @Test
    public void testLooksLikeOption() {
        // prefixes are "-" and "--"
        Assert.assertTrue(commandLine.looksLikeOption("-a"));
        Assert.assertTrue(commandLine.looksLikeOption("--help"));
        Assert.assertFalse(commandLine.looksLikeOption("value"));
        Assert.assertFalse(commandLine.looksLikeOption(""));

        // Test with empty prefix set
        Option emptyPrefixRoot = createOptionProxy("root", Collections.EMPTY_SET, Collections.EMPTY_SET, Option.class);
        WriteableCommandLineImpl emptyPrefixCmd = new WriteableCommandLineImpl(emptyPrefixRoot, Collections.EMPTY_LIST);
        Assert.assertFalse(emptyPrefixCmd.looksLikeOption("-a"));
    }

    @Test
    public void testToStringNormalisedFormatting() {
        // Empty arguments
        Assert.assertEquals("", commandLine.toString());

        // Single argument without space
        List args1 = new ArrayList();
        args1.add("arg1");
        WriteableCommandLineImpl cmd1 = new WriteableCommandLineImpl(rootOption, args1);
        Assert.assertEquals("arg1", cmd1.toString());

        // Argument with space requires double quotes
        List args2 = new ArrayList();
        args2.add("arg with space");
        WriteableCommandLineImpl cmd2 = new WriteableCommandLineImpl(rootOption, args2);
        Assert.assertEquals("\"arg with space\"", cmd2.toString());

        // Multiple arguments: mixed spaces and no spaces
        List args3 = new ArrayList();
        args3.add("-f");
        args3.add("hello world");
        args3.add("--option");
        WriteableCommandLineImpl cmd3 = new WriteableCommandLineImpl(rootOption, args3);
        Assert.assertEquals("-f \"hello world\" --option", cmd3.toString());
        Assert.assertEquals(args3, cmd3.getNormalised());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptionsIsUnmodifiable() {
        Option opt = createOptionProxy("opt", Collections.singleton("-o"), Collections.EMPTY_SET, Option.class);
        commandLine.addOption(opt);
        commandLine.getOptions().add(opt);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptionTriggersIsUnmodifiable() {
        Option opt = createOptionProxy("opt", Collections.singleton("-o"), Collections.EMPTY_SET, Option.class);
        commandLine.addOption(opt);
        commandLine.getOptionTriggers().add("-x");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetNormalisedIsUnmodifiable() {
        commandLine.getNormalised().add("illegal");
    }
}
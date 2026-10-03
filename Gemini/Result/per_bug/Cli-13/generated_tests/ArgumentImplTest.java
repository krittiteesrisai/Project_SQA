package org.apache.commons.cli2.option;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.validation.InvalidArgumentException;
import org.apache.commons.cli2.validation.Validator;
import org.junit.Assert;
import org.junit.Test;

public class ArgumentImplTest {

    /**
     * Helper สำหรับสร้าง Dynamic Proxy ของ WriteableCommandLine โดยไม่ต้องพึ่ง Mockito
     */
    private WriteableCommandLine createMockCommandLine(final Set optionsLike,
                                                       final Map valuesMap,
                                                       final List addedValues) {
        return (WriteableCommandLine) Proxy.newProxyInstance(
            WriteableCommandLine.class.getClassLoader(),
            new Class[] { WriteableCommandLine.class },
            new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    String name = method.getName();
                    if ("looksLikeOption".equals(name)) {
                        return Boolean.valueOf(optionsLike != null && optionsLike.contains(args[0]));
                    }
                    if ("addValue".equals(name)) {
                        if (addedValues != null) {
                            addedValues.add(args[1]);
                        }
                        if (valuesMap != null) {
                            Option opt = (Option) args[0];
                            List list = (List) valuesMap.get(opt);
                            if (list == null) {
                                list = new ArrayList();
                                valuesMap.put(opt, list);
                            }
                            list.add(args[1]);
                        }
                        return null;
                    }
                    if ("getValues".equals(name)) {
                        if (valuesMap != null) {
                            List list = (List) valuesMap.get(args[0]);
                            return list == null ? Collections.EMPTY_LIST : list;
                        }
                        return Collections.EMPTY_LIST;
                    }
                    if ("setDefaultValues".equals(name)) {
                        return null;
                    }
                    return null;
                }
            }
        );
    }

    // =========================================================================
    // 1. Constructor Branches & Boundary Tests
    // =========================================================================

    @Test
    public void testConstructorNullNameDefaultsToArg() {
        ArgumentImpl arg = new ArgumentImpl(null, "desc", 0, 1, '\0', '\0', null, null, null, 1);
        Assert.assertEquals("arg", arg.getPreferredName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMinExceedsMaxThrowsException() {
        new ArgumentImpl("test", "desc", 3, 2, '\0', '\0', null, null, null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTooFewDefaultsThrowsException() {
        List defaults = Collections.singletonList("val1");
        new ArgumentImpl("test", "desc", 2, 5, '\0', '\0', null, null, defaults, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTooManyDefaultsThrowsException() {
        List defaults = Arrays.asList(new Object[]{"v1", "v2", "v3"});
        new ArgumentImpl("test", "desc", 0, 2, '\0', '\0', null, null, defaults, 1);
    }

    @Test
    public void testConstructorValidWithEmptyDefaults() {
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 1, 3, '=', ',', null, "--", Collections.EMPTY_LIST, 1);
        Assert.assertEquals("test", arg.getPreferredName());
        Assert.assertEquals("desc", arg.getDescription());
        Assert.assertEquals(1, arg.getMinimum());
        Assert.assertEquals(3, arg.getMaximum());
        Assert.assertEquals('=', arg.getInitialSeparator());
        Assert.assertEquals(',', arg.getSubsequentSeparator());
        Assert.assertEquals("--", arg.getConsumeRemaining());
        Assert.assertTrue(arg.isRequired());
    }

    // =========================================================================
    // 2. stripBoundaryQuotes Tests
    // =========================================================================

    @Test
    public void testStripBoundaryQuotes() {
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 0, 1, '\0', '\0', null, null, null, 1);

        Assert.assertEquals("quoted", arg.stripBoundaryQuotes("\"quoted\""));
        Assert.assertEquals("", arg.stripBoundaryQuotes("\"\""));
        Assert.assertEquals("\"startOnly", arg.stripBoundaryQuotes("\"startOnly"));
        Assert.assertEquals("endOnly\"", arg.stripBoundaryQuotes("endOnly\""));
        Assert.assertEquals("noQuote", arg.stripBoundaryQuotes("noQuote"));
    }

    // =========================================================================
    // 3. processValues Branches
    // =========================================================================

    @Test
    public void testProcessValuesStandard() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 1, 2, '\0', '\0', null, "--", null, 1);
        List rawArgs = new ArrayList(Arrays.asList(new Object[]{"val1", "val2", "val3"}));
        ListIterator it = rawArgs.listIterator();

        List consumed = new ArrayList();
        WriteableCommandLine cmd = createMockCommandLine(null, null, consumed);

        arg.processValues(cmd, it, arg);

        Assert.assertEquals(2, consumed.size());
        Assert.assertEquals("val1", consumed.get(0));
        Assert.assertEquals("val2", consumed.get(1));
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("val3", it.next());
    }

    @Test
    public void testProcessValuesConsumeRemaining() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 0, 5, '\0', '\0', null, "--", null, 1);
        List rawArgs = new ArrayList(Arrays.asList(new Object[]{"--", "-opt1", "val2"}));
        ListIterator it = rawArgs.listIterator();

        List consumed = new ArrayList();
        Set looksLike = new HashSet(Collections.singletonList("-opt1"));
        WriteableCommandLine cmd = createMockCommandLine(looksLike, null, consumed);

        arg.processValues(cmd, it, arg);

        // เครื่องหมาย consumeRemaining จะ trigger ให้กลืนทุกค่ารวมถึงที่คล้าย option
        Assert.assertEquals(2, consumed.size());
        Assert.assertEquals("-opt1", consumed.get(0));
        Assert.assertEquals("val2", consumed.get(1));
    }

    @Test
    public void testProcessValuesLooksLikeOptionStopsProcessing() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 0, 3, '\0', '\0', null, "--", null, 1);
        List rawArgs = new ArrayList(Arrays.asList(new Object[]{"val1", "-stopHere", "val2"}));
        ListIterator it = rawArgs.listIterator();

        List consumed = new ArrayList();
        Set looksLike = new HashSet(Collections.singletonList("-stopHere"));
        WriteableCommandLine cmd = createMockCommandLine(looksLike, null, consumed);

        arg.processValues(cmd, it, arg);

        Assert.assertEquals(1, consumed.size());
        Assert.assertEquals("val1", consumed.get(0));
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("-stopHere", it.next());
    }

    @Test
    public void testProcessValuesSubsequentSplitSuccess() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 0, 5, '\0', ',', null, "--", null, 1);
        List rawArgs = new ArrayList(Arrays.asList(new Object[]{"val1,val2,val3"}));
        ListIterator it = rawArgs.listIterator();

        List consumed = new ArrayList();
        WriteableCommandLine cmd = createMockCommandLine(null, null, consumed);

        arg.processValues(cmd, it, arg);

        Assert.assertEquals(3, consumed.size());
        Assert.assertEquals("val1", consumed.get(0));
        Assert.assertEquals("val2", consumed.get(1));
        Assert.assertEquals("val3", consumed.get(2));
    }

    @Test(expected = OptionException.class)
    public void testProcessValuesSubsequentSplitExceedsMaxThrowsException() throws OptionException {
        // max คือ 2 แต่มี 3 tokens ในค่าที่ถูก split
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 0, 2, '\0', ',', null, "--", null, 1);
        List rawArgs = new ArrayList(Arrays.asList(new Object[]{"v1,v2,v3"}));
        ListIterator it = rawArgs.listIterator();

        WriteableCommandLine cmd = createMockCommandLine(null, null, null);
        arg.processValues(cmd, it, arg);
    }

    // =========================================================================
    // 4. validate Branches
    // =========================================================================

    @Test(expected = OptionException.class)
    public void testValidateMissingValuesThrowsException() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 2, 4, '\0', '\0', null, null, null, 1);
        Map valuesMap = new HashMap();
        valuesMap.put(arg, Collections.singletonList("onlyOne"));

        WriteableCommandLine cmd = createMockCommandLine(null, valuesMap, null);
        arg.validate(cmd);
    }

    @Test(expected = OptionException.class)
    public void testValidateUnexpectedValuesThrowsException() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 1, 2, '\0', '\0', null, null, null, 1);
        Map valuesMap = new HashMap();
        valuesMap.put(arg, Arrays.asList(new Object[]{"v1", "v2", "v3"}));

        WriteableCommandLine cmd = createMockCommandLine(null, valuesMap, null);
        arg.validate(cmd);
    }

    @Test
    public void testValidateWithCustomValidatorSuccess() throws OptionException {
        Validator validator = new Validator() {
            public void validate(List values) throws InvalidArgumentException {
                // Success
            }
        };
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 1, 2, '\0', '\0', validator, null, null, 1);
        Map valuesMap = new HashMap();
        valuesMap.put(arg, Collections.singletonList("validVal"));

        WriteableCommandLine cmd = createMockCommandLine(null, valuesMap, null);
        arg.validate(cmd);
    }

    @Test(expected = OptionException.class)
    public void testValidateWithCustomValidatorFailureThrowsOptionException() throws OptionException {
        Validator validator = new Validator() {
            public void validate(List values) throws InvalidArgumentException {
                throw new InvalidArgumentException("Validation failed");
            }
        };
        ArgumentImpl arg = new ArgumentImpl("test", "desc", 1, 2, '\0', '\0', validator, null, null, 1);
        Map valuesMap = new HashMap();
        valuesMap.put(arg, Collections.singletonList("invalidVal"));

        WriteableCommandLine cmd = createMockCommandLine(null, valuesMap, null);
        arg.validate(cmd);
    }

    // =========================================================================
    // 5. appendUsage Branches
    // =========================================================================

    @Test
    public void testAppendUsageSimpleRequired() {
        ArgumentImpl arg = new ArgumentImpl("myArg", "desc", 1, 1, '\0', '\0', null, null, null, 1);
        StringBuffer buffer = new StringBuffer();
        arg.appendUsage(buffer, Collections.EMPTY_SET, null);
        Assert.assertEquals("myArg", buffer.toString());
    }

    @Test
    public void testAppendUsageOptionalAndBracketed() {
        ArgumentImpl arg = new ArgumentImpl("optArg", "desc", 0, 1, '\0', '\0', null, null, null, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet(Arrays.asList(new Object[]{
            DisplaySetting.DISPLAY_OPTIONAL,
            DisplaySetting.DISPLAY_ARGUMENT_BRACKETED
        }));
        arg.appendUsage(buffer, settings, null);
        Assert.assertEquals("[<optArg>]", buffer.toString());
    }

    @Test
    public void testAppendUsageNumberedMultiple() {
        ArgumentImpl arg = new ArgumentImpl("file", "desc", 1, 3, '\0', '\0', null, null, null, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet(Arrays.asList(new Object[]{
            DisplaySetting.DISPLAY_ARGUMENT_NUMBERED
        }));
        arg.appendUsage(buffer, settings, null);
        // file 1 is required, 2 and 3 are optional
        Assert.assertEquals("file1 [file2] [file3]", buffer.toString());
    }

    @Test
    public void testAppendUsageInfiniteMaximum() {
        ArgumentImpl arg = new ArgumentImpl("param", "desc", 0, Integer.MAX_VALUE, '\0', '\0', null, null, null, 1);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet(Collections.singletonList(DisplaySetting.DISPLAY_OPTIONAL));
        arg.appendUsage(buffer, settings, null);
        Assert.assertEquals("[param] [param] ...", buffer.toString());
    }

    // =========================================================================
    // 6. Miscellaneous Coverage (Getters, Triggers, Defaults, HelpLines)
    // =========================================================================

    @Test
    public void testDefaultsAndDefaultValues() {
        List defaults = Collections.singletonList("defaultVal");
        ArgumentImpl arg = new ArgumentImpl("def", "desc", 0, 1, '\0', '\0', null, null, defaults, 1);

        WriteableCommandLine cmd = createMockCommandLine(null, null, null);
        arg.defaults(cmd);
        arg.defaultValues(cmd, arg);
        Assert.assertEquals(defaults, arg.getDefaultValues());
    }

    @Test
    public void testMiscellaneousMethods() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("misc", "desc", 0, 1, '\0', '\0', null, null, null, 1);
        WriteableCommandLine cmd = createMockCommandLine(null, null, null);

        Assert.assertTrue(arg.canProcess(cmd, "any"));
        Assert.assertEquals(Collections.EMPTY_SET, arg.getPrefixes());
        Assert.assertEquals(Collections.EMPTY_SET, arg.getTriggers());
        Assert.assertFalse(arg.isRequired());
        Assert.assertNull(arg.getValidator());

        List helpLines = arg.helpLines(0, Collections.EMPTY_SET, null);
        Assert.assertNotNull(helpLines);
        Assert.assertEquals(1, helpLines.size());

        List rawArgs = new ArrayList(Collections.singletonList("v"));
        arg.process(cmd, rawArgs.listIterator());
    }
}
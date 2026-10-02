package org.apache.commons.cli;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_cli_OptionGroupTest {
    ///region Test suites for executable org.apache.commons.cli.OptionGroup.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#toString()}
 * @utbot.invokes {@link org.apache.commons.cli.OptionGroup#getOptions()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return buff.toString();}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        String actual = optionGroup.toString();
        
        String expected = "[]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#toString()}
 * @utbot.invokes {@link org.apache.commons.cli.OptionGroup#getOptions()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: option.getOpt() != null
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        optionMap.put(null, null);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.toString] produces [java.lang.NullPointerException]
            org.apache.commons.cli.OptionGroup.toString(OptionGroup.java:152) */
        optionGroup.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        optionMap.put(string, option);
        optionMap.put(opt, option);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        String actual = optionGroup.toString();
        
        String expected = "[-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000, -\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String description = "";
        option.setDescription(description);
        optionMap.put(string, option);
        optionMap.put(null, option);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        String actual = optionGroup.toString();
        
        String expected = "[-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 , -\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        option.setLongOpt(longOpt);
        String description = "";
        option.setDescription(description);
        optionMap.put(null, option);
        Option option1 = ((Option) createInstance("org.apache.commons.cli.Option"));
        optionMap.put(longOpt, option1);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        String actual = optionGroup.toString();
        
        String expected = "[--\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 , --null]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString4() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        optionMap.put(string, option);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        optionMap.put(string1, null);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.toString] produces [java.lang.NullPointerException]
            org.apache.commons.cli.OptionGroup.toString(OptionGroup.java:152) */
        optionGroup.toString();
    }
    
    @Test
    public void testToString5() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        String string = "";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "\u0000";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        option.setDescription(opt);
        optionMap.put(string, option);
        optionMap.put(null, null);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.toString] produces [java.lang.NullPointerException]
            org.apache.commons.cli.OptionGroup.toString(OptionGroup.java:152) */
        optionGroup.toString();
    }
    
    @Test
    public void testToString6() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        String string = "\u0000";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        optionMap.put(string, option);
        optionMap.put(null, null);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.toString] produces [java.lang.NullPointerException]
            org.apache.commons.cli.OptionGroup.toString(OptionGroup.java:152) */
        optionGroup.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionGroup.getOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptions()
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#getOptions()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.returnsFrom {@code return optionMap.values();}
 *  */
    @Test
    public void testGetOptions_MapValues() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        Object actual = optionGroup.getOptions();
        
        Object expected = createInstance("java.util.LinkedHashMap$LinkedValues");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOptions()
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#getOptions()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optionMap.values();
 *  */
    @Test
    public void testGetOptions_ThrowNullPointerException() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.getOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.OptionGroup.getOptions(OptionGroup.java:76) */
        optionGroup.getOptions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionGroup.setRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRequired(boolean)
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#setRequired(boolean)}
 *  */
    @Test
    public void testSetRequired() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        
        optionGroup.setRequired(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionGroup.getNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNames()
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#getNames()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.returnsFrom {@code return optionMap.keySet();}
 *  */
    @Test
    public void testGetNames_MapKeySet() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        String string = "";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        optionMap.put(string, option);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        Set actual = ((Set) optionGroup.getNames());
        
        Set expected = new LinkedHashSet();
        expected.add(string);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNames()
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#getNames()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optionMap.keySet();
 *  */
    @Test
    public void testGetNames_ThrowNullPointerException() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.getNames] produces [java.lang.NullPointerException]
            org.apache.commons.cli.OptionGroup.getNames(OptionGroup.java:67) */
        optionGroup.getNames();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionGroup.isRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRequired()
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#isRequired()}
 * @utbot.returnsFrom {@code return required;}
 *  */
    @Test
    public void testIsRequired_ReturnRequired() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        
        boolean actual = optionGroup.isRequired();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionGroup.addOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addOption(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#addOption(org.apache.commons.cli.Option)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getKey()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_MapPut() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        OptionGroup actual = optionGroup.addOption(option);
        
        Map optionGroupOptionMap = ((Map) getFieldValue(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap"));
        Map actualOptionMap = ((Map) getFieldValue(actual, "org.apache.commons.cli.OptionGroup", "optionMap"));
        assertTrue(deepEquals(optionGroupOptionMap, actualOptionMap));
        
        String actualSelected = actual.getSelected();
        assertNull(actualSelected);
        
        boolean actualRequired = ((Boolean) getFieldValue(actual, "org.apache.commons.cli.OptionGroup", "required"));
        assertFalse(actualRequired);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addOption(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#addOption(org.apache.commons.cli.Option)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getKey()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optionMap.put(option.getKey(), option);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.OptionGroup.addOption(OptionGroup.java:55) */
        optionGroup.addOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optionMap.put(option.getKey(), option);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_2() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.OptionGroup.addOption(OptionGroup.java:55) */
        optionGroup.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: optionMap.put(option.getKey(), option);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_1() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.OptionGroup.addOption(OptionGroup.java:55) */
        optionGroup.addOption(option);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addOption(org.apache.commons.cli.Option)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionGroup}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#addOption(org.apache.commons.cli.Option)}
     */
    @Test
    public void testAddOption() throws Exception  {
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("", "XZ");
        option.setArgName("#$\\\"'");
        option.setLongOpt("X");
        option.setDescription("10");
        
        OptionGroup actual = optionGroup.addOption(option);
        
        OptionGroup expected = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        HashMap optionMap = new HashMap();
        String string = "";
        Option option1 = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option1, "org.apache.commons.cli.Option", "opt", string);
        String longOpt = "X";
        option1.setLongOpt(longOpt);
        String argName = "#$\\\"'";
        option1.setArgName(argName);
        String description = "10";
        option1.setDescription(description);
        setField(option1, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        Class type = String.class;
        option1.setType(type);
        ArrayList values = new ArrayList();
        setField(option1, "org.apache.commons.cli.Option", "values", values);
        setField(option1, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        optionMap.put(string, option1);
        setField(expected, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        Map expectedOptionMap = ((Map) getFieldValue(expected, "org.apache.commons.cli.OptionGroup", "optionMap"));
        Map actualOptionMap = ((Map) getFieldValue(actual, "org.apache.commons.cli.OptionGroup", "optionMap"));
        assertTrue(deepEquals(expectedOptionMap, actualOptionMap));
        
        String actualSelected = actual.getSelected();
        assertNull(actualSelected);
        
        boolean actualRequired = ((Boolean) getFieldValue(actual, "org.apache.commons.cli.OptionGroup", "required"));
        assertFalse(actualRequired);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionGroup.setSelected
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSelected(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#setSelected(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (option == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testSetSelected_OptionEqualsNull() throws AlreadySelectedException  {
        OptionGroup optionGroup = new OptionGroup();
        
        optionGroup.setSelected(null);
    }
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#setSelected(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (option == null): False}
 * @utbot.executesCondition {@code (selected == null): True}
 *  */
    @Test
    public void testSetSelected_SelectedEqualsNull() throws Exception  {
        OptionGroup optionGroup = new OptionGroup();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        optionGroup.setSelected(option);
    }
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#setSelected(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (option == null): False}
 * @utbot.executesCondition {@code (selected == null): True}
 *  */
    @Test
    public void testSetSelected_SelectedEqualsNull_1() throws Exception  {
        OptionGroup optionGroup = new OptionGroup();
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        optionGroup.setSelected(option);
    }
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#setSelected(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (option == null): False}
 * @utbot.executesCondition {@code (selected == null): False}
 * @utbot.executesCondition {@code (selected.equals(option.getKey())): True}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getKey()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testSetSelected_SelectedEquals() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        String selected = "";
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "selected", selected);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setLongOpt(selected);
        
        optionGroup.setSelected(option);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method setSelected(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#setSelected(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (option == null): False}
 * @utbot.executesCondition {@code (selected == null): False}
 * @utbot.executesCondition {@code (selected.equals(option.getKey())): False}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getKey()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.cli.AlreadySelectedException} when: selected == null || selected.equals(option.getKey())
 *  */
    @Test(expected = AlreadySelectedException.class)
    public void testSetSelected_ThrowAlreadySelectedException() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        String selected = "";
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "selected", selected);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        optionGroup.setSelected(option);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionGroup.getSelected
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSelected()
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#getSelected()}
 * @utbot.returnsFrom {@code return selected;}
 *  */
    @Test
    public void testGetSelected_ReturnSelected() {
        OptionGroup optionGroup = new OptionGroup();
        
        String actual = optionGroup.getSelected();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields842834805203800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields842834805203800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass842834805210100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields842834805203800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass842834805210100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields842834808531200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields842834808531200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass842834808539800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields842834808531200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass842834808539800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


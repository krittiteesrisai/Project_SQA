package org.apache.commons.cli;

import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_cli_CommandLineTest {
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArgs()
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getArgs()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.returnsFrom {@code return answer;}
 *  */
    @Test
    public void testGetArgs_ListToArray() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "args", args);
        
        java.lang.String[] actual = commandLine.getArgs();
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getArgs()
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getArgs()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String[] answer = new String[args.size()];
 *  */
    @Test
    public void testGetArgs_ThrowNullPointerException() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.getArgs] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.getArgs(CommandLine.java:220) */
        commandLine.getArgs();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#iterator()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return hashcodeMap.values().iterator();}
 *  */
    @Test
    public void testIterator_CollectionIterator() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap hashcodeMap = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        hashcodeMap.put(integer, object);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "hashcodeMap", hashcodeMap);
        
        Object actual = commandLine.iterator();
        
        Object expected = createInstance("java.util.LinkedHashMap$LinkedValueIterator");
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method iterator()
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#iterator()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return hashcodeMap.values().iterator();
 *  */
    @Test
    public void testIterator_ThrowNullPointerException() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.iterator] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.iterator(CommandLine.java:298) */
        commandLine.iterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.hasOption
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasOption(char)
    
    @Test
    public void testHasOption1() {
        CommandLine commandLine = new CommandLine();
        
        boolean actual = commandLine.hasOption('\u0000');
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.hasOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#hasOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return options.containsKey(opt);}
 *  */
    @Test
    public void testHasOption_MapContainsKey() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap options = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "options", options);
        
        boolean actual = commandLine.hasOption(((String) null));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#hasOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return options.containsKey(opt);
 *  */
    @Test
    public void testHasOption_ThrowNullPointerException() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.hasOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.hasOption(CommandLine.java:69) */
        commandLine.hasOption(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptions()
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptions()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.invokes {@link java.util.Collection#toArray(java.lang.Object[])}
 * @utbot.returnsFrom {@code return (Option[]) processed.toArray(optionsArray);}
 *  */
    @Test
    public void testGetOptions_CollectionToArray() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap options = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "options", options);
        
        org.apache.commons.cli.Option[] actual = commandLine.getOptions();
        
        org.apache.commons.cli.Option[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOptions()
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptions()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.invokes {@link java.util.Collection#toArray(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: return (Option[]) processed.toArray(optionsArray);
 *  */
    @Test
    public void testGetOptions_ThrowArrayStoreException() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap options = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        options.put(null, object);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "options", options);
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.getOptions] produces [java.lang.ArrayStoreException: java.lang.Object]
            java.base/java.util.LinkedHashMap.valuesToArray(LinkedHashMap.java:555)
            java.base/java.util.LinkedHashMap$LinkedValues.toArray(LinkedHashMap.java:639)
            org.apache.commons.cli.CommandLine.getOptions(CommandLine.java:314) */
        commandLine.getOptions();
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptions()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Collection processed = options.values();
 *  */
    @Test
    public void testGetOptions_ThrowNullPointerException() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.getOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.getOptions(CommandLine.java:308) */
        commandLine.getOptions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getArgList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArgList()
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getArgList()}
 * @utbot.returnsFrom {@code return args;}
 *  */
    @Test
    public void testGetArgList_ReturnArgs() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "args", args);
        
        ArrayList actual = ((ArrayList) commandLine.getArgList());
        
        assertTrue(deepEquals(args, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getOptionObject
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getOptionObject(char)
    
    @Test
    public void testGetOptionObject1() {
        CommandLine commandLine = new CommandLine();
        
        Object actual = commandLine.getOptionObject('\u0000');
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getOptionObject
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getOptionObject(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.CommandLine}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptionObject(java.lang.String)}
     */
    @Test
    public void testGetOptionObjectWithNonEmptyString() {
        CommandLine commandLine = new CommandLine();
        
        Object actual = commandLine.getOptionObject("ZX");
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.addOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addOption(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addOption(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.invokes {@link org.apache.commons.cli.Option#hashCode()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getKey()}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getLongOpt()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testAddOption_KeyEqualsNull() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap options = new LinkedHashMap();
        options.put(null, null);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "options", options);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "hashcodeMap", options);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        commandLine.addOption(option);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addOption(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hashcodeMap.put(new Integer(opt.hashCode()), opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.addOption(CommandLine.java:277) */
        commandLine.addOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hashcodeMap.put(new Integer(opt.hashCode()), opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_1() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "";
        option.setLongOpt(longOpt);
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.addOption(CommandLine.java:277) */
        commandLine.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hashcodeMap.put(new Integer(opt.hashCode()), opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_2() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.addOption(CommandLine.java:277) */
        commandLine.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hashcodeMap.put(new Integer(opt.hashCode()), opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_3() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.addOption(CommandLine.java:277) */
        commandLine.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addOption(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: names.put(opt.getLongOpt(), key);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_4() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap hashcodeMap = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "hashcodeMap", hashcodeMap);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "";
        option.setLongOpt(longOpt);
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.addOption(CommandLine.java:285) */
        commandLine.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addOption(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: names.put(opt.getLongOpt(), key);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_5() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap hashcodeMap = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "hashcodeMap", hashcodeMap);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.addOption(CommandLine.java:285) */
        commandLine.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addOption(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (key == null): True}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getLongOpt()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: options.put(key, opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_6() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap hashcodeMap = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "hashcodeMap", hashcodeMap);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.addOption(CommandLine.java:287) */
        commandLine.addOption(option);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addOption(org.apache.commons.cli.Option)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.CommandLine}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addOption(org.apache.commons.cli.Option)}
     */
    @Test
    public void testAddOption() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("", false, "\n\t\r");
        option.setDescription("10");
        Object object = new Object();
        option.setType(object);
        option.setArgName("10");
        option.setLongOpt("");
        
        commandLine.addOption(option);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.addArg
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addArg(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addArg(java.lang.String)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testAddArg_ListAdd() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        ArrayList args = new ArrayList();
        args.add(null);
        args.add(null);
        args.add(null);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "args", args);
        
        commandLine.addArg(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addArg(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#addArg(java.lang.String)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: args.add(arg);
 *  */
    @Test
    public void testAddArg_ThrowNullPointerException() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.addArg] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.addArg(CommandLine.java:266) */
        commandLine.addArg(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getOptionValues
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getOptionValues(char)
    
    @Test
    public void testGetOptionValues1() {
        CommandLine commandLine = new CommandLine();
        
        java.lang.String[] actual = commandLine.getOptionValues('\u0000');
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getOptionValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptionValues(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptionValues(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Util#stripLeadingHyphens(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetOptionValues_MapContainsKey() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap options = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "options", options);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "names", options);
        String string = "";
        
        java.lang.String[] actual = commandLine.getOptionValues(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOptionValues(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptionValues(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: names.containsKey(opt)
 *  */
    @Test
    public void testGetOptionValues_ThrowNullPointerException() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.getOptionValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.getOptionValues(CommandLine.java:152) */
        commandLine.getOptionValues(string);
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptionValues(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: names.containsKey(opt)
 *  */
    @Test
    public void testGetOptionValues_ThrowNullPointerException_2() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        String string = "--                                      ";
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.getOptionValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.getOptionValues(CommandLine.java:152) */
        commandLine.getOptionValues(string);
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptionValues(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: names.containsKey(opt)
 *  */
    @Test
    public void testGetOptionValues_ThrowNullPointerException_3() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        String string = "-";
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.getOptionValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.getOptionValues(CommandLine.java:152) */
        commandLine.getOptionValues(string);
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptionValues(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.containsKey(key)
 *  */
    @Test
    public void testGetOptionValues_ThrowNullPointerException_1() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap names = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "names", names);
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.getOptionValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.getOptionValues(CommandLine.java:156) */
        commandLine.getOptionValues(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getOptionValue
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getOptionValue(char)
    
    @Test
    public void testGetOptionValue1() {
        CommandLine commandLine = new CommandLine();
        
        String actual = commandLine.getOptionValue('\u0000');
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getOptionValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptionValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptionValue(java.lang.String)}
 * @utbot.returnsFrom {@code return (values == null) ? null : values[0];}
 *  */
    @Test
    public void testGetOptionValue_ReturnValuesNotEqualsNull() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap options = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "options", options);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "names", options);
        String string = "";
        
        String actual = commandLine.getOptionValue(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptionValue(java.lang.String)}
 * @utbot.returnsFrom {@code return (values == null) ? null : values[0];}
 *  */
    @Test
    public void testGetOptionValue_ReturnValuesNotEqualsNull_1() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap options = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "options", options);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "names", options);
        String string = "--";
        
        String actual = commandLine.getOptionValue(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getOptionValue(java.lang.String)
    
    @Test
    public void testGetOptionValue2() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap names = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        names.put(integer, object);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "names", names);
        String string = "--\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.getOptionValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.getOptionValues(CommandLine.java:156)
            org.apache.commons.cli.CommandLine.getOptionValue(CommandLine.java:123) */
        commandLine.getOptionValue(string);
    }
    
    @Test
    public void testGetOptionValue3() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap names = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        names.put(character, object);
        names.put(null, object);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "names", names);
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.getOptionValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.getOptionValues(CommandLine.java:156)
            org.apache.commons.cli.CommandLine.getOptionValue(CommandLine.java:123) */
        commandLine.getOptionValue(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getOptionValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptionValue(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CommandLine}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.CommandLine#getOptionValue(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.CommandLine#getOptionValue(java.lang.String)}
 * @utbot.returnsFrom {@code return (answer != null) ? answer : defaultValue;}
 *  */
    @Test
    public void testGetOptionValue_CommandLineGetOptionValue() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap options = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "options", options);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "names", options);
        String string = "";
        
        String actual = commandLine.getOptionValue(string, ((String) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getOptionValue(java.lang.String, java.lang.String)
    
    @Test
    public void testGetOptionValue4() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap options = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "options", options);
        LinkedHashMap names = new LinkedHashMap();
        setField(commandLine, "org.apache.commons.cli.CommandLine", "names", names);
        String string = "--";
        
        String actual = commandLine.getOptionValue(string, ((String) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getOptionValue(java.lang.String, java.lang.String)
    
    @Test
    public void testGetOptionValue5() throws Exception  {
        CommandLine commandLine = ((CommandLine) createInstance("org.apache.commons.cli.CommandLine"));
        LinkedHashMap names = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        names.put(character, object);
        setField(commandLine, "org.apache.commons.cli.CommandLine", "names", names);
        String string = "--";
        
        /* This test fails because method [org.apache.commons.cli.CommandLine.getOptionValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.CommandLine.getOptionValues(CommandLine.java:156)
            org.apache.commons.cli.CommandLine.getOptionValue(CommandLine.java:123)
            org.apache.commons.cli.CommandLine.getOptionValue(CommandLine.java:194) */
        commandLine.getOptionValue(string, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.CommandLine.getOptionValue
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getOptionValue(char, java.lang.String)
    
    @Test
    public void testGetOptionValue6() {
        CommandLine commandLine = new CommandLine();
        
        String actual = commandLine.getOptionValue('\u0100', ((String) null));
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields836122197627600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields836122197627600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass836122197634200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields836122197627600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass836122197634200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


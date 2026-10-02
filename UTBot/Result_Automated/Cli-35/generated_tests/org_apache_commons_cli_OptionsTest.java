package org.apache.commons.cli;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_cli_OptionsTest {
    ///region Test suites for executable org.apache.commons.cli.Options.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        
        String actual = options.toString();
        
        String expected = "[ Options: [ short {} ] [ long {} ]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf.append(shortOpts.toString());
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        
        /* This test fails because method [org.apache.commons.cli.Options.toString] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.toString(Options.java:316) */
        options.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.hasOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return shortOpts.containsKey(opt) || longOpts.containsKey(opt);}
 *  */
    @Test
    public void testHasOption_MapContainsKey() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        
        boolean actual = options.hasOption(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
 * @utbot.returnsFrom {@code return shortOpts.containsKey(opt) || longOpts.containsKey(opt);}
 *  */
    @Test
    public void testHasOption_ReturnShortOptsContainsKeyOrLongOptsContainsKey() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        shortOpts.put(null, null);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        boolean actual = options.hasOption(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return shortOpts.containsKey(opt) || longOpts.containsKey(opt);
 *  */
    @Test
    public void testHasOption_ThrowNullPointerException() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        
        /* This test fails because method [org.apache.commons.cli.Options.hasOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasOption(Options.java:262) */
        options.hasOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return shortOpts.containsKey(opt) || longOpts.containsKey(opt);
 *  */
    @Test
    public void testHasOption_ThrowNullPointerException_2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.Options.hasOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasOption(Options.java:262) */
        options.hasOption(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return shortOpts.containsKey(opt) || longOpts.containsKey(opt);
 *  */
    @Test
    public void testHasOption_ThrowNullPointerException_3() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "--                                      ";
        
        /* This test fails because method [org.apache.commons.cli.Options.hasOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasOption(Options.java:262) */
        options.hasOption(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return shortOpts.containsKey(opt) || longOpts.containsKey(opt);
 *  */
    @Test
    public void testHasOption_ThrowNullPointerException_4() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "-";
        
        /* This test fails because method [org.apache.commons.cli.Options.hasOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasOption(Options.java:262) */
        options.hasOption(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return shortOpts.containsKey(opt) || longOpts.containsKey(opt);
 *  */
    @Test
    public void testHasOption_ThrowNullPointerException_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.Options.hasOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasOption(Options.java:262) */
        options.hasOption(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hasOption(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
     */
    @Test
    public void testHasOptionReturnsFalseWithNonEmptyString() {
        Options options = new Options();
        
        boolean actual = options.hasOption("ZX");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasOption(java.lang.String)}
     */
    @Test
    public void testHasOptionReturnsFalseWithNonEmptyString1() {
        Options options = new Options();
        
        boolean actual = options.hasOption("-3");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.getOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return longOpts.get(opt);}
 *  */
    @Test
    public void testGetOption_MapGet() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        setField(options, "org.apache.commons.cli.Options", "longOpts", shortOpts);
        
        Option actual = options.getOption(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return shortOpts.get(opt);}
 *  */
    @Test
    public void testGetOption_MapGet_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        shortOpts.put(null, null);
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        Option actual = options.getOption(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: shortOpts.containsKey(opt)
 *  */
    @Test
    public void testGetOption_ThrowNullPointerException() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        
        /* This test fails because method [org.apache.commons.cli.Options.getOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getOption(Options.java:218) */
        options.getOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: shortOpts.containsKey(opt)
 *  */
    @Test
    public void testGetOption_ThrowNullPointerException_2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.Options.getOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getOption(Options.java:218) */
        options.getOption(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: shortOpts.containsKey(opt)
 *  */
    @Test
    public void testGetOption_ThrowNullPointerException_3() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "--";
        
        /* This test fails because method [org.apache.commons.cli.Options.getOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getOption(Options.java:218) */
        options.getOption(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: shortOpts.containsKey(opt)
 *  */
    @Test
    public void testGetOption_ThrowNullPointerException_4() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "-";
        
        /* This test fails because method [org.apache.commons.cli.Options.getOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getOption(Options.java:218) */
        options.getOption(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return longOpts.get(opt);
 *  */
    @Test
    public void testGetOption_ThrowNullPointerException_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        /* This test fails because method [org.apache.commons.cli.Options.getOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getOption(Options.java:223) */
        options.getOption(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getOption(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
     */
    @Test
    public void testGetOptionWithNonEmptyString() {
        Options options = new Options();
        
        Option actual = options.getOption("ZX");
        
        assertNull(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOption(java.lang.String)}
     */
    @Test
    public void testGetOptionWithNonEmptyString1() {
        Options options = new Options();
        
        Option actual = options.getOption("-3");
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.getOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptions()
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOptions()}
 * @utbot.invokes {@link org.apache.commons.cli.Options#helpOptions()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableCollection(java.util.Collection)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableCollection(helpOptions());}
 *  */
    @Test
    public void testGetOptions_CollectionsUnmodifiableCollection() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        Object actual = options.getOptions();
        
        Object expected = createInstance("java.util.Collections$UnmodifiableCollection");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.addOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addOption(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getKey()}
 * @utbot.invokes {@link org.apache.commons.cli.Option#hasLongOpt()}
 * @utbot.invokes {@link org.apache.commons.cli.Option#isRequired()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_MapPut() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        Options actual = options.addOption(option);
        
        Map optionsShortOpts = ((Map) getFieldValue(options, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(optionsShortOpts, actualShortOpts));
        
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertNull(actualLongOpts);
        
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertNull(actualRequiredOpts);
        
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertNull(actualOptionGroups);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addOption(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String key = opt.getKey();
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException() {
        Options options = new Options();
        
        /* This test fails because method [org.apache.commons.cli.Options.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOption(Options.java:154) */
        options.addOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: requiredOpts.contains(key)
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Options.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOption(Options.java:165) */
        options.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: shortOpts.put(key, opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Options.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOption(Options.java:172) */
        options.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: requiredOpts.contains(key)
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_5() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Options.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOption(Options.java:165) */
        options.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: longOpts.put(opt.getLongOpt(), opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_8() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "";
        option.setLongOpt(longOpt);
        
        /* This test fails because method [org.apache.commons.cli.Options.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOption(Options.java:159) */
        options.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: shortOpts.put(key, opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_3() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        ArrayList requiredOpts = new ArrayList();
        setField(options, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Options.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOption(Options.java:172) */
        options.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: shortOpts.put(key, opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_9() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "";
        option.setLongOpt(longOpt);
        
        /* This test fails because method [org.apache.commons.cli.Options.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOption(Options.java:172) */
        options.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: shortOpts.put(key, opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_6() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        ArrayList requiredOpts = new ArrayList();
        requiredOpts.add(null);
        setField(options, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Options.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOption(Options.java:172) */
        options.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: shortOpts.put(key, opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_4() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        ArrayList requiredOpts = new ArrayList();
        requiredOpts.add(null);
        requiredOpts.add(null);
        requiredOpts.add(null);
        setField(options, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Options.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOption(Options.java:172) */
        options.addOption(option);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: shortOpts.put(key, opt);
 *  */
    @Test
    public void testAddOption_ThrowNullPointerException_7() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        ArrayList requiredOpts = new ArrayList();
        String string = "";
        requiredOpts.add(string);
        requiredOpts.add(null);
        requiredOpts.add(null);
        setField(options, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        option.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Options.addOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOption(Options.java:172) */
        options.addOption(option);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addOption(org.apache.commons.cli.Option)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
     */
    @Test
    public void testAddOption() throws Exception  {
        Options options = new Options();
        Option option = new Option("", "XZ");
        
        Options actual = options.addOption(option);
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "";
        Option option1 = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option1, "org.apache.commons.cli.Option", "opt", string);
        String description = "XZ";
        option1.setDescription(description);
        setField(option1, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        Class type = String.class;
        option1.setType(type);
        ArrayList values = new ArrayList();
        setField(option1, "org.apache.commons.cli.Option", "values", values);
        setField(option1, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option1);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(org.apache.commons.cli.Option)}
     */
    @Test
    public void testAddOption1() throws Exception  {
        Options options = new Options();
        Option option = new Option("XZ", true, "\n\t\r");
        option.setLongOpt("XZ");
        option.setDescription("-3");
        
        Options actual = options.addOption(option);
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "XZ";
        Option option1 = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option1, "org.apache.commons.cli.Option", "opt", string);
        option1.setLongOpt(string);
        String description = "-3";
        option1.setDescription(description);
        setField(option1, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        Class type = String.class;
        option1.setType(type);
        ArrayList values = new ArrayList();
        setField(option1, "org.apache.commons.cli.Option", "values", values);
        setField(option1, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option1);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        longOpts.put(string, option1);
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.addOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addOption(java.lang.String, java.lang.String, boolean, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,java.lang.String,boolean,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_Return_2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        String string = "";
        
        Options actual = options.addOption(string, null, false, null);
        
        Map optionsShortOpts = ((Map) getFieldValue(options, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(optionsShortOpts, actualShortOpts));
        
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertNull(actualLongOpts);
        
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertNull(actualRequiredOpts);
        
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertNull(actualOptionGroups);
        
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,java.lang.String,boolean,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_Return() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        Options actual = options.addOption(null, null, false, null);
        
        Map optionsShortOpts = ((Map) getFieldValue(options, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(optionsShortOpts, actualShortOpts));
        
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertNull(actualLongOpts);
        
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertNull(actualRequiredOpts);
        
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertNull(actualOptionGroups);
        
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,java.lang.String,boolean,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_Return_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        Options actual = options.addOption(null, null, true, null);
        
        Map optionsShortOpts = ((Map) getFieldValue(options, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(optionsShortOpts, actualShortOpts));
        
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertNull(actualLongOpts);
        
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertNull(actualRequiredOpts);
        
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertNull(actualOptionGroups);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addOption(java.lang.String, java.lang.String, boolean, java.lang.String)
    
    @Test
    public void testAddOptionByFuzzer() throws Exception  {
        Options options = new Options();
        
        Options actual = options.addOption("abc", "\t\n\r", true, "abc");
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "abc";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String longOpt = "\t\n\r";
        option.setLongOpt(longOpt);
        option.setDescription(string);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        Class type = String.class;
        option.setType(type);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        longOpts.put(longOpt, option);
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    
    @Test
    public void testAddOptionByFuzzer1() throws Exception  {
        Options options = new Options();
        
        Options actual = options.addOption("XZ", "01", false, "");
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "XZ";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String longOpt = "01";
        option.setLongOpt(longOpt);
        String description = "";
        option.setDescription(description);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        Class type = String.class;
        option.setType(type);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        longOpts.put(longOpt, option);
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    
    @Test
    public void testAddOptionByFuzzer2() throws Exception  {
        Options options = new Options();
        
        Options actual = options.addOption("b", "\t\r\n", true, "abc");
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "b";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String longOpt = "\t\r\n";
        option.setLongOpt(longOpt);
        String description = "abc";
        option.setDescription(description);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        Class type = String.class;
        option.setType(type);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        longOpts.put(longOpt, option);
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    
    @Test
    public void testAddOptionByFuzzer3() throws Exception  {
        Options options = new Options();
        
        Options actual = options.addOption("b", "\t\r\n", false, "abc");
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "b";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String longOpt = "\t\r\n";
        option.setLongOpt(longOpt);
        String description = "abc";
        option.setDescription(description);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        Class type = String.class;
        option.setType(type);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        longOpts.put(longOpt, option);
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.addOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addOption(java.lang.String, boolean, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,boolean,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_Return_21() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        String string = "";
        
        Options actual = options.addOption(string, true, null);
        
        Map optionsShortOpts = ((Map) getFieldValue(options, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(optionsShortOpts, actualShortOpts));
        
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertNull(actualLongOpts);
        
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertNull(actualRequiredOpts);
        
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertNull(actualOptionGroups);
        
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,boolean,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_Return1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        Options actual = options.addOption(null, true, null);
        
        Map optionsShortOpts = ((Map) getFieldValue(options, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(optionsShortOpts, actualShortOpts));
        
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertNull(actualLongOpts);
        
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertNull(actualRequiredOpts);
        
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertNull(actualOptionGroups);
        
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,boolean,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_Return_11() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        Options actual = options.addOption(null, false, null);
        
        Map optionsShortOpts = ((Map) getFieldValue(options, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(optionsShortOpts, actualShortOpts));
        
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertNull(actualLongOpts);
        
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertNull(actualRequiredOpts);
        
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertNull(actualOptionGroups);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addOption(java.lang.String, boolean, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,boolean,java.lang.String)}
     */
    @Test
    public void testAddOptionWithNonEmptyStrings() throws Exception  {
        Options options = new Options();
        
        Options actual = options.addOption("XZ\u008A", false, "10");
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "XZ\u008A";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String description = "10";
        option.setDescription(description);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        Class type = String.class;
        option.setType(type);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,boolean,java.lang.String)}
     */
    @Test
    public void testAddOptionWithNonEmptyStrings1() throws Exception  {
        Options options = new Options();
        
        Options actual = options.addOption("XZ\u008A", true, "10");
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "XZ\u008A";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String description = "10";
        option.setDescription(description);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        Class type = String.class;
        option.setType(type);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,boolean,java.lang.String)}
     */
    @Test
    public void testAddOptionWithNonEmptyStrings2() throws Exception  {
        Options options = new Options();
        
        Options actual = options.addOption("Z\u008A", true, "10");
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "Z\u008A";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String description = "10";
        option.setDescription(description);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        Class type = String.class;
        option.setType(type);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,boolean,java.lang.String)}
     */
    @Test
    public void testAddOptionWithNonEmptyStrings3() throws Exception  {
        Options options = new Options();
        
        Options actual = options.addOption("Z\u008A", false, "10");
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "Z\u008A";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String description = "10";
        option.setDescription(description);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        Class type = String.class;
        option.setType(type);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOption(java.lang.String, boolean, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,boolean,java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddOptionThrowsIAEWithNonEmptyStringAndBlankString() {
        Options options = new Options();
        
        options.addOption("-3", true, "\n\t");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.addOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addOption(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_Return2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        String string = "";
        
        Options actual = options.addOption(string, null);
        
        Map optionsShortOpts = ((Map) getFieldValue(options, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(optionsShortOpts, actualShortOpts));
        
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertNull(actualLongOpts);
        
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertNull(actualRequiredOpts);
        
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertNull(actualOptionGroups);
        
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_Return_12() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        Options actual = options.addOption(null, null);
        
        Map optionsShortOpts = ((Map) getFieldValue(options, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(optionsShortOpts, actualShortOpts));
        
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertNull(actualLongOpts);
        
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertNull(actualRequiredOpts);
        
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertNull(actualOptionGroups);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addOption(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,java.lang.String)}
     */
    @Test
    public void testAddOptionWithNonEmptyStrings4() throws Exception  {
        Options options = new Options();
        
        Options actual = options.addOption("X", "10");
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "X";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String description = "10";
        option.setDescription(description);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        Class type = String.class;
        option.setType(type);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,java.lang.String)}
     */
    @Test
    public void testAddOptionWithNonEmptyStrings5() throws Exception  {
        Options options = new Options();
        
        Options actual = options.addOption("\u008EX", "10");
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        String string = "\u008EX";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        String description = "10";
        option.setDescription(description);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        Class type = String.class;
        option.setType(type);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        shortOpts.put(string, option);
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addOption(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOption(java.lang.String,java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddOptionThrowsIAEWithNonEmptyString() {
        Options options = new Options();
        
        options.addOption("-3", null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.helpOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method helpOptions()
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#helpOptions()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.returnsFrom {@code return new ArrayList<Option>(shortOpts.values());}
 *  */
    @Test
    public void testHelpOptions_MapValues() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        ArrayList actual = ((ArrayList) options.helpOptions());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method helpOptions()
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#helpOptions()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ArrayList<Option>(shortOpts.values());
 *  */
    @Test
    public void testHelpOptions_ThrowNullPointerException() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        
        /* This test fails because method [org.apache.commons.cli.Options.helpOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.helpOptions(Options.java:194) */
        options.helpOptions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.hasShortOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasShortOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasShortOption(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Util#stripLeadingHyphens(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return shortOpts.containsKey(opt);}
 *  */
    @Test
    public void testHasShortOption_MapContainsKey() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        
        boolean actual = options.hasShortOption(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasShortOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasShortOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return shortOpts.containsKey(opt);
 *  */
    @Test
    public void testHasShortOption_ThrowNullPointerException() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        
        /* This test fails because method [org.apache.commons.cli.Options.hasShortOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasShortOption(Options.java:290) */
        options.hasShortOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasShortOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return shortOpts.containsKey(opt);
 *  */
    @Test
    public void testHasShortOption_ThrowNullPointerException_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.Options.hasShortOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasShortOption(Options.java:290) */
        options.hasShortOption(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasShortOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return shortOpts.containsKey(opt);
 *  */
    @Test
    public void testHasShortOption_ThrowNullPointerException_2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "--                                      ";
        
        /* This test fails because method [org.apache.commons.cli.Options.hasShortOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasShortOption(Options.java:290) */
        options.hasShortOption(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasShortOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return shortOpts.containsKey(opt);
 *  */
    @Test
    public void testHasShortOption_ThrowNullPointerException_3() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "-";
        
        /* This test fails because method [org.apache.commons.cli.Options.hasShortOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasShortOption(Options.java:290) */
        options.hasShortOption(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hasShortOption(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasShortOption(java.lang.String)}
     */
    @Test
    public void testHasShortOptionReturnsFalseWithNonEmptyString() {
        Options options = new Options();
        
        boolean actual = options.hasShortOption("ZX");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasShortOption(java.lang.String)}
     */
    @Test
    public void testHasShortOptionReturnsFalseWithNonEmptyString1() {
        Options options = new Options();
        
        boolean actual = options.hasShortOption("-3");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.getRequiredOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRequiredOptions()
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getRequiredOptions()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(requiredOpts);}
 *  */
    @Test
    public void testGetRequiredOptions_CollectionsUnmodifiableList() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        ArrayList requiredOpts = new ArrayList();
        setField(options, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        
        List actual = options.getRequiredOptions();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.hasLongOption
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasLongOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasLongOption(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Util#stripLeadingHyphens(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return longOpts.containsKey(opt);}
 *  */
    @Test
    public void testHasLongOption_MapContainsKey() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        
        boolean actual = options.hasLongOption(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasLongOption(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasLongOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return longOpts.containsKey(opt);
 *  */
    @Test
    public void testHasLongOption_ThrowNullPointerException() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        
        /* This test fails because method [org.apache.commons.cli.Options.hasLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasLongOption(Options.java:276) */
        options.hasLongOption(null);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasLongOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return longOpts.containsKey(opt);
 *  */
    @Test
    public void testHasLongOption_ThrowNullPointerException_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.Options.hasLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasLongOption(Options.java:276) */
        options.hasLongOption(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasLongOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return longOpts.containsKey(opt);
 *  */
    @Test
    public void testHasLongOption_ThrowNullPointerException_2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "--                                      ";
        
        /* This test fails because method [org.apache.commons.cli.Options.hasLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasLongOption(Options.java:276) */
        options.hasLongOption(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasLongOption(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return longOpts.containsKey(opt);
 *  */
    @Test
    public void testHasLongOption_ThrowNullPointerException_3() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "-";
        
        /* This test fails because method [org.apache.commons.cli.Options.hasLongOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.hasLongOption(Options.java:276) */
        options.hasLongOption(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hasLongOption(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasLongOption(java.lang.String)}
     */
    @Test
    public void testHasLongOptionReturnsFalseWithNonEmptyString() {
        Options options = new Options();
        
        boolean actual = options.hasLongOption("ZX");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Options}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#hasLongOption(java.lang.String)}
     */
    @Test
    public void testHasLongOptionReturnsFalseWithNonEmptyString1() {
        Options options = new Options();
        
        boolean actual = options.hasLongOption("-3");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.getOptionGroups
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptionGroups()
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOptionGroups()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.returnsFrom {@code return new HashSet<OptionGroup>(optionGroups.values());}
 *  */
    @Test
    public void testGetOptionGroups_MapValues() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap optionGroups = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        HashSet actual = ((HashSet) options.getOptionGroups());
        
        HashSet expected = new HashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOptionGroups()
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOptionGroups()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new HashSet<OptionGroup>(optionGroups.values());
 *  */
    @Test
    public void testGetOptionGroups_ThrowNullPointerException() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        
        /* This test fails because method [org.apache.commons.cli.Options.getOptionGroups] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getOptionGroups(Options.java:97) */
        options.getOptionGroups();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.getMatchingOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMatchingOptions(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getMatchingOptions(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Util#stripLeadingHyphens(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return matchingOpts;}
 *  */
    @Test
    public void testGetMatchingOptions_SetIterator() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        
        ArrayList actual = ((ArrayList) options.getMatchingOptions(null));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMatchingOptions(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getMatchingOptions(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String longOpt: longOpts.keySet())
 *  */
    @Test
    public void testGetMatchingOptions_ThrowNullPointerException() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        
        /* This test fails because method [org.apache.commons.cli.Options.getMatchingOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getMatchingOptions(Options.java:241) */
        options.getMatchingOptions(null);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getMatchingOptions(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String longOpt: longOpts.keySet())
 *  */
    @Test
    public void testGetMatchingOptions_ThrowNullPointerException_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.Options.getMatchingOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getMatchingOptions(Options.java:241) */
        options.getMatchingOptions(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getMatchingOptions(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String longOpt: longOpts.keySet())
 *  */
    @Test
    public void testGetMatchingOptions_ThrowNullPointerException_2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "--";
        
        /* This test fails because method [org.apache.commons.cli.Options.getMatchingOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getMatchingOptions(Options.java:241) */
        options.getMatchingOptions(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getMatchingOptions(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String longOpt: longOpts.keySet())
 *  */
    @Test
    public void testGetMatchingOptions_ThrowNullPointerException_4() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        String string = "-";
        
        /* This test fails because method [org.apache.commons.cli.Options.getMatchingOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getMatchingOptions(Options.java:241) */
        options.getMatchingOptions(string);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getMatchingOptions(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: longOpt.startsWith(opt)
 *  */
    @Test
    public void testGetMatchingOptions_ThrowNullPointerException_3() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        longOpts.put(null, null);
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        
        /* This test fails because method [org.apache.commons.cli.Options.getMatchingOptions] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getMatchingOptions(Options.java:243) */
        options.getMatchingOptions(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMatchingOptions(java.lang.String)
    
    @Test
    public void testGetMatchingOptions1() {
        Options options = new Options();
        String string = "-\u0000";
        
        ArrayList actual = ((ArrayList) options.getMatchingOptions(string));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetMatchingOptions2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        String string = "";
        
        ArrayList actual = ((ArrayList) options.getMatchingOptions(string));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getMatchingOptions(java.lang.String)
    
    @Test
    public void testGetMatchingOptions3() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap longOpts = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000";
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        longOpts.put(string, option);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        longOpts.put(string1, option);
        setField(options, "org.apache.commons.cli.Options", "longOpts", longOpts);
        
        /* This test fails because method [org.apache.commons.cli.Options.getMatchingOptions] produces [java.lang.NullPointerException]
            java.base/java.lang.String.startsWith(String.java:2261)
            java.base/java.lang.String.startsWith(String.java:2304)
            org.apache.commons.cli.Options.getMatchingOptions(Options.java:243) */
        options.getMatchingOptions(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.getOptionGroup
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptionGroup(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOptionGroup(org.apache.commons.cli.Option)}
 * @utbot.returnsFrom {@code return optionGroups.get(opt.getKey());}
 *  */
    @Test
    public void testGetOptionGroup_ReturnOptionGroupsGet_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap optionGroups = new LinkedHashMap();
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        OptionGroup actual = options.getOptionGroup(option);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOptionGroup(org.apache.commons.cli.Option)}
 * @utbot.returnsFrom {@code return optionGroups.get(opt.getKey());}
 *  */
    @Test
    public void testGetOptionGroup_ReturnOptionGroupsGet() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap optionGroups = new LinkedHashMap();
        String string = "";
        optionGroups.put(string, null);
        setField(options, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", string);
        
        OptionGroup actual = options.getOptionGroup(option);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOptionGroup(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOptionGroup(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optionGroups.get(opt.getKey());
 *  */
    @Test
    public void testGetOptionGroup_ThrowNullPointerException() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        
        /* This test fails because method [org.apache.commons.cli.Options.getOptionGroup] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getOptionGroup(Options.java:302) */
        options.getOptionGroup(null);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOptionGroup(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optionGroups.get(opt.getKey());
 *  */
    @Test
    public void testGetOptionGroup_ThrowNullPointerException_2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        /* This test fails because method [org.apache.commons.cli.Options.getOptionGroup] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getOptionGroup(Options.java:302) */
        options.getOptionGroup(option);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#getOptionGroup(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return optionGroups.get(opt.getKey());
 *  */
    @Test
    public void testGetOptionGroup_ThrowNullPointerException_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Options.getOptionGroup] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.getOptionGroup(Options.java:302) */
        options.getOptionGroup(option);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Options.addOptionGroup
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addOptionGroup(org.apache.commons.cli.OptionGroup)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOptionGroup(org.apache.commons.cli.OptionGroup)}
 * @utbot.executesCondition {@code (group.isRequired()): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOptionGroup_NotGroupIsRequired() throws Exception  {
        Options options = new Options();
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        Options actual = options.addOptionGroup(optionGroup);
        
        Options expected = ((Options) createInstance("org.apache.commons.cli.Options"));
        LinkedHashMap shortOpts = new LinkedHashMap();
        setField(expected, "org.apache.commons.cli.Options", "shortOpts", shortOpts);
        LinkedHashMap longOpts = new LinkedHashMap();
        setField(expected, "org.apache.commons.cli.Options", "longOpts", longOpts);
        ArrayList requiredOpts = new ArrayList();
        setField(expected, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        HashMap optionGroups = new HashMap();
        setField(expected, "org.apache.commons.cli.Options", "optionGroups", optionGroups);
        
        Map expectedShortOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "shortOpts"));
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertTrue(deepEquals(expectedShortOpts, actualShortOpts));
        
        Map expectedLongOpts = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "longOpts"));
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertTrue(deepEquals(expectedLongOpts, actualLongOpts));
        
        List expectedRequiredOpts = ((List) getFieldValue(expected, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(expectedRequiredOpts, actualRequiredOpts));
        
        Map expectedOptionGroups = ((Map) getFieldValue(expected, "org.apache.commons.cli.Options", "optionGroups"));
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertTrue(deepEquals(expectedOptionGroups, actualOptionGroups));
        
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOptionGroup(org.apache.commons.cli.OptionGroup)}
 * @utbot.executesCondition {@code (group.isRequired()): True}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOptionGroup_GroupIsRequired() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        ArrayList requiredOpts = new ArrayList();
        requiredOpts.add(null);
        requiredOpts.add(null);
        requiredOpts.add(null);
        setField(options, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        optionGroup.setRequired(true);
        
        Options actual = options.addOptionGroup(optionGroup);
        
        Map actualShortOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "shortOpts"));
        assertNull(actualShortOpts);
        
        Map actualLongOpts = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "longOpts"));
        assertNull(actualLongOpts);
        
        List optionsRequiredOpts = ((List) getFieldValue(options, "org.apache.commons.cli.Options", "requiredOpts"));
        List actualRequiredOpts = ((List) getFieldValue(actual, "org.apache.commons.cli.Options", "requiredOpts"));
        assertTrue(deepEquals(optionsRequiredOpts, actualRequiredOpts));
        
        Map actualOptionGroups = ((Map) getFieldValue(actual, "org.apache.commons.cli.Options", "optionGroups"));
        assertNull(actualOptionGroups);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addOptionGroup(org.apache.commons.cli.OptionGroup)
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOptionGroup(org.apache.commons.cli.OptionGroup)}
 * @utbot.invokes {@link org.apache.commons.cli.OptionGroup#isRequired()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: group.isRequired()
 *  */
    @Test
    public void testAddOptionGroup_ThrowNullPointerException() {
        Options options = new Options();
        
        /* This test fails because method [org.apache.commons.cli.Options.addOptionGroup] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOptionGroup(Options.java:71) */
        options.addOptionGroup(null);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOptionGroup(org.apache.commons.cli.OptionGroup)}
 * @utbot.executesCondition {@code (group.isRequired()): True}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: requiredOpts.add(group);
 *  */
    @Test
    public void testAddOptionGroup_ThrowNullPointerException_1() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Options.addOptionGroup] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOptionGroup(Options.java:73) */
        options.addOptionGroup(optionGroup);
    }
    
    /**
    @utbot.classUnderTest {@link Options}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Options#addOptionGroup(org.apache.commons.cli.OptionGroup)}
 * @utbot.executesCondition {@code (group.isRequired()): True}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.cli.OptionGroup#getOptions()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(Option option: group.getOptions())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: option.setRequired(false);
 *  */
    @Test
    public void testAddOptionGroup_ThrowNullPointerException_2() throws Exception  {
        Options options = ((Options) createInstance("org.apache.commons.cli.Options"));
        ArrayList requiredOpts = new ArrayList();
        setField(options, "org.apache.commons.cli.Options", "requiredOpts", requiredOpts);
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        String string = "";
        optionMap.put(string, null);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        optionGroup.setRequired(true);
        
        /* This test fails because method [org.apache.commons.cli.Options.addOptionGroup] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Options.addOptionGroup(Options.java:81) */
        options.addOptionGroup(optionGroup);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields842747271410000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields842747271410000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass842747271422700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields842747271410000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass842747271422700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields842747273977600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields842747273977600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass842747273981700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields842747273977600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass842747273981700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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


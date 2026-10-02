package org.apache.commons.cli;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_cli_OptionBuilderTest {
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.reset
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reset()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#reset()}
     */
    @Test
    public void testReset() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        Method resetMethod = optionBuilderClazz.getDeclaredMethod("reset");
        resetMethod.setAccessible(true);
        java.lang.Object[] resetMethodArguments = new java.lang.Object[0];
        resetMethod.invoke(null, resetMethodArguments);
    }
    ///endregion
    
    ///region Errors report for reset
    
    public void testReset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.create
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method create()
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create()}
 * @utbot.executesCondition {@code (longopt == null): False}
 * @utbot.invokes {@link org.apache.commons.cli.OptionBuilder#create(java.lang.String)}
 * @utbot.returnsFrom {@code return create(null);}
 *  */
    @Test
    public void testCreate_LongoptNotEqualsNull() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        try {
            String longopt = "";
            setStaticField(optionBuilderClazz, "longopt", longopt);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", -1);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            setStaticField(optionBuilderClazz, "argName", null);
            
            Option actual = OptionBuilder.create();
            
            Option expected = ((Option) createInstance("org.apache.commons.cli.Option"));
            expected.setLongOpt(longopt);
            setField(expected, "org.apache.commons.cli.Option", "numberOfArgs", -1);
            ArrayList values = new ArrayList();
            setField(expected, "org.apache.commons.cli.Option", "values", values);
            setField(expected, "org.apache.commons.cli.Option", "valuesep", '\u0000');
            
            // org.apache.commons.cli.Option has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method create()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create()}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateThrowsIAE() {
        OptionBuilder.create();
    }
    ///endregion
    
    ///region Errors report for create
    
    public void testCreate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.create
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method create(char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create(char)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateThrowsIAE1() {
        OptionBuilder.create('>');
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method create(char)
    
    @Test
    public void testCreate1() throws Exception  {
        Option actual = OptionBuilder.create('\u0100');
        
        Option expected = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "\u0100";
        setField(expected, "org.apache.commons.cli.Option", "opt", opt);
        String argName = "arg";
        expected.setArgName(argName);
        expected.setRequired(true);
        expected.setOptionalArg(true);
        setField(expected, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        setField(expected, "org.apache.commons.cli.Option", "values", values);
        setField(expected, "org.apache.commons.cli.Option", "valuesep", '=');
        
        // org.apache.commons.cli.Option has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.create
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method create(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create(java.lang.String)}
 * @utbot.returnsFrom {@code return option;}
 *  */
    @Test
    public void testCreate_ReturnOption() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        try {
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", -1);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            setStaticField(optionBuilderClazz, "argName", null);
            String string = "";
            
            Option actual = OptionBuilder.create(string);
            
            Option expected = ((Option) createInstance("org.apache.commons.cli.Option"));
            setField(expected, "org.apache.commons.cli.Option", "opt", string);
            setField(expected, "org.apache.commons.cli.Option", "numberOfArgs", -1);
            ArrayList values = new ArrayList();
            setField(expected, "org.apache.commons.cli.Option", "values", values);
            setField(expected, "org.apache.commons.cli.Option", "valuesep", '\u0000');
            
            // org.apache.commons.cli.Option has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
        }
    }
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create(java.lang.String)}
 * @utbot.returnsFrom {@code return option;}
 *  */
    @Test
    public void testCreate_ReturnOption_1() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        try {
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", -1);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            setStaticField(optionBuilderClazz, "argName", null);
            
            Option actual = OptionBuilder.create(((String) null));
            
            Option expected = ((Option) createInstance("org.apache.commons.cli.Option"));
            setField(expected, "org.apache.commons.cli.Option", "numberOfArgs", -1);
            ArrayList values = new ArrayList();
            setField(expected, "org.apache.commons.cli.Option", "values", values);
            setField(expected, "org.apache.commons.cli.Option", "valuesep", '\u0000');
            
            // org.apache.commons.cli.Option has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method create(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create(java.lang.String)}
     */
    @Test
    public void testCreateWithNonEmptyString() throws Exception  {
        Option actual = OptionBuilder.create("ZX");
        
        Option expected = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "ZX";
        setField(expected, "org.apache.commons.cli.Option", "opt", opt);
        String argName = "arg";
        expected.setArgName(argName);
        setField(expected, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        ArrayList values = new ArrayList();
        setField(expected, "org.apache.commons.cli.Option", "values", values);
        setField(expected, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        // org.apache.commons.cli.Option has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method create(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateThrowsIAEWithNonEmptyString() {
        OptionBuilder.create("\u0014\n\t\r");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateThrowsIAEWithNonEmptyString1() {
        OptionBuilder.create("\n\r\t\u0014");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateThrowsIAEWithNonEmptyString2() {
        OptionBuilder.create("\u0014\uFFD4\n\t\r");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateThrowsIAEWithNonEmptyString3() {
        OptionBuilder.create("\u0014\u0014\uFFD4\n\t\r");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.withLongOpt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withLongOpt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#withLongOpt(java.lang.String)}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testWithLongOpt_ReturnInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "longopt", null);
            
            OptionBuilder actual = OptionBuilder.withLongOpt(null);
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.hasOptionalArg
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hasOptionalArg()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasOptionalArg()}
     */
    @Test
    public void testHasOptionalArg() throws Exception  {
        OptionBuilder actual = OptionBuilder.hasOptionalArg();
        
        OptionBuilder expected = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
        String longopt = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "longopt", longopt);
        String argName = "arg";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "argName", argName);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "numberOfArgs", 1);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "optionalArg", true);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "valuesep", '\u0000');
        setField(expected, "org.apache.commons.cli.OptionBuilder", "instance", expected);
        
    }
    ///endregion
    
    ///region Errors report for hasOptionalArg
    
    public void testHasOptionalArg_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.withValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueSeparator(char)
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#withValueSeparator(char)}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testWithValueSeparator_ReturnInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "valuesep", ' ');
            
            OptionBuilder actual = OptionBuilder.withValueSeparator(' ');
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.withValueSeparator
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withValueSeparator()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#withValueSeparator()}
     */
    @Test
    public void testWithValueSeparator() throws Exception  {
        OptionBuilder actual = OptionBuilder.withValueSeparator();
        
        OptionBuilder expected = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
        String longopt = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "longopt", longopt);
        String argName = "arg";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "argName", argName);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "numberOfArgs", 1);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "optionalArg", true);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "valuesep", '=');
        setField(expected, "org.apache.commons.cli.OptionBuilder", "instance", expected);
        
    }
    ///endregion
    
    ///region Errors report for withValueSeparator
    
    public void testWithValueSeparator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.withArgName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withArgName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#withArgName(java.lang.String)}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testWithArgName_ReturnInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "argName", null);
            
            OptionBuilder actual = OptionBuilder.withArgName(null);
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.hasArg
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasArg()
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasArg()}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testHasArg_ReturnInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "numberOfArgs", 1);
            
            OptionBuilder actual = OptionBuilder.hasArg();
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.hasArg
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasArg(boolean)
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasArg(boolean)}
 * @utbot.executesCondition {@code (hasArg): True}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testHasArg_HasArg() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "numberOfArgs", 1);
            
            OptionBuilder actual = OptionBuilder.hasArg(true);
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
        }
    }
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasArg(boolean)}
 * @utbot.executesCondition {@code (hasArg): False}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testHasArg_NotHasArg() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "numberOfArgs", -1);
            
            OptionBuilder actual = OptionBuilder.hasArg(false);
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.withType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withType(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#withType(java.lang.Object)}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testWithType_ReturnInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "type", null);
            
            OptionBuilder actual = OptionBuilder.withType(null);
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "type", prevType);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.withDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#withDescription(java.lang.String)}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testWithDescription_ReturnInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "description", null);
            
            OptionBuilder actual = OptionBuilder.withDescription(null);
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "description", prevDescription);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.hasArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasArgs()
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasArgs()}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testHasArgs_ReturnInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "numberOfArgs", -2);
            
            OptionBuilder actual = OptionBuilder.hasArgs();
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.hasArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasArgs(int)
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasArgs(int)}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testHasArgs_ReturnInstance1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "numberOfArgs", -255);
            
            OptionBuilder actual = OptionBuilder.hasArgs(-255);
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.hasOptionalArgs
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hasOptionalArgs(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasOptionalArgs(int)}
     */
    @Test
    public void testHasOptionalArgs() throws Exception  {
        OptionBuilder actual = OptionBuilder.hasOptionalArgs(3);
        
        OptionBuilder expected = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
        String longopt = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "longopt", longopt);
        String description = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "description", description);
        String argName = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "argName", argName);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "numberOfArgs", 3);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "optionalArg", true);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "valuesep", '=');
        setField(expected, "org.apache.commons.cli.OptionBuilder", "instance", expected);
        
    }
    ///endregion
    
    ///region Errors report for hasOptionalArgs
    
    public void testHasOptionalArgs_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.hasOptionalArgs
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hasOptionalArgs()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasOptionalArgs()}
     */
    @Test
    public void testHasOptionalArgs1() throws Exception  {
        OptionBuilder actual = OptionBuilder.hasOptionalArgs();
        
        OptionBuilder expected = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
        String longopt = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "longopt", longopt);
        String description = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "description", description);
        String argName = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "argName", argName);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "numberOfArgs", -2);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "optionalArg", true);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "valuesep", '=');
        setField(expected, "org.apache.commons.cli.OptionBuilder", "instance", expected);
        
    }
    ///endregion
    
    ///region Errors report for hasOptionalArgs
    
    public void testHasOptionalArgs_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.isRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRequired(boolean)
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#isRequired(boolean)}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testIsRequired_ReturnInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        try {
            setStaticField(optionBuilderClazz, "instance", null);
            setStaticField(optionBuilderClazz, "required", false);
            
            OptionBuilder actual = OptionBuilder.isRequired(false);
            
            assertNull(actual);
        } finally {
            setStaticField(OptionBuilder.class, "instance", prevInstance);
            setStaticField(OptionBuilder.class, "required", prevRequired);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.isRequired
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isRequired()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#isRequired()}
     */
    @Test
    public void testIsRequired() throws Exception  {
        OptionBuilder actual = OptionBuilder.isRequired();
        
        OptionBuilder expected = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
        String longopt = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "longopt", longopt);
        String description = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "description", description);
        String argName = "\u0014\n\t\r";
        setField(expected, "org.apache.commons.cli.OptionBuilder", "argName", argName);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "required", true);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "numberOfArgs", -2);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "optionalArg", true);
        setField(expected, "org.apache.commons.cli.OptionBuilder", "valuesep", '=');
        setField(expected, "org.apache.commons.cli.OptionBuilder", "instance", expected);
        
    }
    ///endregion
    
    ///region Errors report for isRequired
    
    public void testIsRequired_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields840565696903200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields840565696903200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass840565696910300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields840565696903200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass840565696910300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields840565699998200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields840565699998200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass840565700001200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields840565699998200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass840565700001200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields840565700708600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields840565700708600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass840565700710200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields840565700708600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass840565700710200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


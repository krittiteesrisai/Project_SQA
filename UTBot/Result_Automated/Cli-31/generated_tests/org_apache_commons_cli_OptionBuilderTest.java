package org.apache.commons.cli;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_cli_OptionBuilderTest {
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset()
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#reset()}
 *  */
    @Test
    public void testReset() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            
            Method resetMethod = optionBuilderClazz.getDeclaredMethod("reset");
            resetMethod.setAccessible(true);
            java.lang.Object[] resetMethodArguments = new java.lang.Object[0];
            resetMethod.invoke(null, resetMethodArguments);
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object1;
            
            assertEquals(-1, finalOptionBuilderNumberOfArgs);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reset()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.OptionBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#reset()}
     */
    @Test
    public void testReset1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        Method resetMethod = optionBuilderClazz.getDeclaredMethod("reset");
        resetMethod.setAccessible(true);
        java.lang.Object[] resetMethodArguments = new java.lang.Object[0];
        resetMethod.invoke(null, resetMethodArguments);
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
    public void testCreateThrowsIAE() {
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
        String longOpt = "\u0014\n\t\r";
        expected.setLongOpt(longOpt);
        String argName = "\u0014\n\t\r";
        expected.setArgName(argName);
        String description = "\u0014\n\t\r";
        expected.setDescription(description);
        expected.setRequired(true);
        expected.setOptionalArg(true);
        setField(expected, "org.apache.commons.cli.Option", "numberOfArgs", 2147483645);
        ArrayList values = new ArrayList();
        setField(expected, "org.apache.commons.cli.Option", "values", values);
        setField(expected, "org.apache.commons.cli.Option", "valuesep", '>');
        
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
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            
            Option actual = OptionBuilder.create(((String) null));
            
            Option expected = ((Option) createInstance("org.apache.commons.cli.Option"));
            ArrayList values = new ArrayList();
            setField(expected, "org.apache.commons.cli.Option", "values", values);
            setField(expected, "org.apache.commons.cli.Option", "valuesep", '\u0000');
            
            // org.apache.commons.cli.Option has overridden equals method
            assertEquals(expected, actual);
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object1;
            
            assertEquals(-1, finalOptionBuilderNumberOfArgs);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
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
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            String string = "";
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            
            Option actual = OptionBuilder.create(string);
            
            Option expected = ((Option) createInstance("org.apache.commons.cli.Option"));
            setField(expected, "org.apache.commons.cli.Option", "opt", string);
            ArrayList values = new ArrayList();
            setField(expected, "org.apache.commons.cli.Option", "values", values);
            setField(expected, "org.apache.commons.cli.Option", "valuesep", '\u0000');
            
            // org.apache.commons.cli.Option has overridden equals method
            assertEquals(expected, actual);
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object1;
            
            assertEquals(-1, finalOptionBuilderNumberOfArgs);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
        }
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
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        try {
            String longopt = "";
            setStaticField(optionBuilderClazz, "longopt", longopt);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            
            Option actual = OptionBuilder.create();
            
            Option expected = ((Option) createInstance("org.apache.commons.cli.Option"));
            expected.setLongOpt(longopt);
            ArrayList values = new ArrayList();
            setField(expected, "org.apache.commons.cli.Option", "values", values);
            setField(expected, "org.apache.commons.cli.Option", "valuesep", '\u0000');
            
            // org.apache.commons.cli.Option has overridden equals method
            assertEquals(expected, actual);
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object1;
            
            assertEquals(-1, finalOptionBuilderNumberOfArgs);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method create()
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#create()}
 * @utbot.executesCondition {@code (longopt == null): True}
 * @utbot.invokes org.apache.commons.cli.OptionBuilder#reset()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: longopt == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreate_ThrowIllegalArgumentException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            
            OptionBuilder.create();
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
        }
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
    public void testWithArgName_ReturnInstance() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            OptionBuilder actual = OptionBuilder.withArgName(null);
            
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.withValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueSeparator()
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#withValueSeparator()}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testWithValueSeparator_ReturnInstance() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "valuesep");
            Object initialOptionBuilderValuesep = object;
            
            OptionBuilder actual = OptionBuilder.withValueSeparator();
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "valuesep");
            Object finalOptionBuilderValuesep = object1;
            
            assertEquals('=', finalOptionBuilderValuesep);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
        }
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
    public void testWithValueSeparator_ReturnInstance1() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "valuesep");
            Object initialOptionBuilderValuesep = object;
            
            OptionBuilder actual = OptionBuilder.withValueSeparator(' ');
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "valuesep");
            Object finalOptionBuilderValuesep = object1;
            
            assertEquals(' ', finalOptionBuilderValuesep);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
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
    public void testHasArg_HasArg() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            
            OptionBuilder actual = OptionBuilder.hasArg(true);
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object1;
            
            assertEquals(1, finalOptionBuilderNumberOfArgs);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasArg(boolean)}
 * @utbot.executesCondition {@code (hasArg): False}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testHasArg_NotHasArg() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            
            OptionBuilder actual = OptionBuilder.hasArg(false);
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object1;
            
            assertEquals(-1, finalOptionBuilderNumberOfArgs);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
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
    public void testHasArg_ReturnInstance() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            
            OptionBuilder actual = OptionBuilder.hasArg();
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object1;
            
            assertEquals(1, finalOptionBuilderNumberOfArgs);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
        }
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
    public void testWithLongOpt_ReturnInstance() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            OptionBuilder actual = OptionBuilder.withLongOpt(null);
            
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.isRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRequired()
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#isRequired()}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testIsRequired_ReturnInstance() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "required");
            Object initialOptionBuilderRequired = object;
            
            OptionBuilder actual = OptionBuilder.isRequired();
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "required");
            Object finalOptionBuilderRequired = object1;
            
            Class assertClazz = Class.forName("org.junit.Assert");
            Class finalOptionBuilderRequiredType = boolean.class;
            Method assertTrueMethod = assertClazz.getDeclaredMethod("assertTrue", finalOptionBuilderRequiredType);
            assertTrueMethod.setAccessible(true);
            java.lang.Object[] assertTrueMethodArguments = new java.lang.Object[1];
            assertTrueMethodArguments[0] = finalOptionBuilderRequired;
            assertTrueMethod.invoke(null, assertTrueMethodArguments);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
        }
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
    public void testIsRequired_ReturnInstance1() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            OptionBuilder actual = OptionBuilder.isRequired(false);
            
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.hasOptionalArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOptionalArgs(int)
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasOptionalArgs(int)}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testHasOptionalArgs_ReturnInstance() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            Object object1 = getStaticFieldValue(OptionBuilder.class, "optionalArg");
            Object initialOptionBuilderOptionalArg = object1;
            
            OptionBuilder actual = OptionBuilder.hasOptionalArgs(1);
            
            Object object2 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object2;
            Object object3 = getStaticFieldValue(OptionBuilder.class, "optionalArg");
            Object finalOptionBuilderOptionalArg = object3;
            
            assertEquals(1, finalOptionBuilderNumberOfArgs);
            
            Class assertClazz = Class.forName("org.junit.Assert");
            Class finalOptionBuilderOptionalArgType = boolean.class;
            Method assertTrueMethod = assertClazz.getDeclaredMethod("assertTrue", finalOptionBuilderOptionalArgType);
            assertTrueMethod.setAccessible(true);
            java.lang.Object[] assertTrueMethodArguments = new java.lang.Object[1];
            assertTrueMethodArguments[0] = finalOptionBuilderOptionalArg;
            assertTrueMethod.invoke(null, assertTrueMethodArguments);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.hasOptionalArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOptionalArgs()
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasOptionalArgs()}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testHasOptionalArgs_ReturnInstance1() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            Object object1 = getStaticFieldValue(OptionBuilder.class, "optionalArg");
            Object initialOptionBuilderOptionalArg = object1;
            
            OptionBuilder actual = OptionBuilder.hasOptionalArgs();
            
            Object object2 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object2;
            Object object3 = getStaticFieldValue(OptionBuilder.class, "optionalArg");
            Object finalOptionBuilderOptionalArg = object3;
            
            assertEquals(-2, finalOptionBuilderNumberOfArgs);
            
            Class assertClazz = Class.forName("org.junit.Assert");
            Class finalOptionBuilderOptionalArgType = boolean.class;
            Method assertTrueMethod = assertClazz.getDeclaredMethod("assertTrue", finalOptionBuilderOptionalArgType);
            assertTrueMethod.setAccessible(true);
            java.lang.Object[] assertTrueMethodArguments = new java.lang.Object[1];
            assertTrueMethodArguments[0] = finalOptionBuilderOptionalArg;
            assertTrueMethod.invoke(null, assertTrueMethodArguments);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.OptionBuilder.hasOptionalArg
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOptionalArg()
    
    /**
    @utbot.classUnderTest {@link OptionBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionBuilder#hasOptionalArg()}
 * @utbot.returnsFrom {@code return instance;}
 *  */
    @Test
    public void testHasOptionalArg_ReturnInstance() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            Object object1 = getStaticFieldValue(OptionBuilder.class, "optionalArg");
            Object initialOptionBuilderOptionalArg = object1;
            
            OptionBuilder actual = OptionBuilder.hasOptionalArg();
            
            Object object2 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object2;
            Object object3 = getStaticFieldValue(OptionBuilder.class, "optionalArg");
            Object finalOptionBuilderOptionalArg = object3;
            
            assertEquals(1, finalOptionBuilderNumberOfArgs);
            
            Class assertClazz = Class.forName("org.junit.Assert");
            Class finalOptionBuilderOptionalArgType = boolean.class;
            Method assertTrueMethod = assertClazz.getDeclaredMethod("assertTrue", finalOptionBuilderOptionalArgType);
            assertTrueMethod.setAccessible(true);
            java.lang.Object[] assertTrueMethodArguments = new java.lang.Object[1];
            assertTrueMethodArguments[0] = finalOptionBuilderOptionalArg;
            assertTrueMethod.invoke(null, assertTrueMethodArguments);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
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
    public void testHasArgs_ReturnInstance() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            
            OptionBuilder actual = OptionBuilder.hasArgs();
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object1;
            
            assertEquals(-2, finalOptionBuilderNumberOfArgs);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
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
    public void testHasArgs_ReturnInstance1() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            Object object = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object initialOptionBuilderNumberOfArgs = object;
            
            OptionBuilder actual = OptionBuilder.hasArgs(1);
            
            Object object1 = getStaticFieldValue(OptionBuilder.class, "numberOfArgs");
            Object finalOptionBuilderNumberOfArgs = object1;
            
            assertEquals(1, finalOptionBuilderNumberOfArgs);
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
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
    public void testWithType_ReturnInstance() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            OptionBuilder actual = OptionBuilder.withType(null);
            
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
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
    public void testWithDescription_ReturnInstance() throws Exception  {
        Class optionBuilderClazz = Class.forName("org.apache.commons.cli.OptionBuilder");
        String prevLongopt = ((String) getStaticFieldValue(optionBuilderClazz, "longopt"));
        String prevDescription = ((String) getStaticFieldValue(optionBuilderClazz, "description"));
        String prevArgName = ((String) getStaticFieldValue(optionBuilderClazz, "argName"));
        boolean prevRequired = ((Boolean) getStaticFieldValue(optionBuilderClazz, "required"));
        int prevNumberOfArgs = ((Integer) getStaticFieldValue(optionBuilderClazz, "numberOfArgs"));
        Object prevType = getStaticFieldValue(optionBuilderClazz, "type");
        boolean prevOptionalArg = ((Boolean) getStaticFieldValue(optionBuilderClazz, "optionalArg"));
        char prevValuesep = ((Character) getStaticFieldValue(optionBuilderClazz, "valuesep"));
        OptionBuilder prevInstance = ((OptionBuilder) getStaticFieldValue(optionBuilderClazz, "instance"));
        try {
            setStaticField(optionBuilderClazz, "longopt", null);
            setStaticField(optionBuilderClazz, "description", null);
            setStaticField(optionBuilderClazz, "argName", null);
            setStaticField(optionBuilderClazz, "required", false);
            setStaticField(optionBuilderClazz, "numberOfArgs", 0);
            setStaticField(optionBuilderClazz, "type", null);
            setStaticField(optionBuilderClazz, "optionalArg", false);
            setStaticField(optionBuilderClazz, "valuesep", '\u0000');
            OptionBuilder instance = ((OptionBuilder) createInstance("org.apache.commons.cli.OptionBuilder"));
            setStaticField(optionBuilderClazz, "instance", instance);
            
            OptionBuilder actual = OptionBuilder.withDescription(null);
            
        } finally {
            setStaticField(OptionBuilder.class, "longopt", prevLongopt);
            setStaticField(OptionBuilder.class, "description", prevDescription);
            setStaticField(OptionBuilder.class, "argName", prevArgName);
            setStaticField(OptionBuilder.class, "required", prevRequired);
            setStaticField(OptionBuilder.class, "numberOfArgs", prevNumberOfArgs);
            setStaticField(OptionBuilder.class, "type", prevType);
            setStaticField(OptionBuilder.class, "optionalArg", prevOptionalArg);
            setStaticField(OptionBuilder.class, "valuesep", prevValuesep);
            setStaticField(OptionBuilder.class, "instance", prevInstance);
        }
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
                
            java.lang.reflect.Method methodForGetDeclaredFields841719339778300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields841719339778300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass841719339799300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields841719339778300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass841719339799300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields841719342169800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields841719342169800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass841719342176000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields841719342169800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass841719342176000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields841719350859300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields841719350859300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass841719350865300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields841719350859300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass841719350865300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


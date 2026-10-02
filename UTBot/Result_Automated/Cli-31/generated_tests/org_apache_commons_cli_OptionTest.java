package org.apache.commons.cli;

import org.junit.Test;
import java.util.ArrayList;
import java.lang.reflect.Method;
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

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_cli_OptionTest {
    ///region Test suites for executable org.apache.commons.cli.Option.getDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDescription()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getDescription()}
 * @utbot.returnsFrom {@code return description;}
 *  */
    @Test
    public void testGetDescription_ReturnDescription() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        String actual = option.getDescription();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.setType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setType(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#setType(java.lang.Object)}
 *  */
    @Test
    public void testSetType() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        option.setType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.addValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("The addValue method is not intended for client use. " + "Subclasses should use the addValueForProcessing method instead. ");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddValue_ThrowUnsupportedOperationException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        option.addValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArgs()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getArgs()}
 * @utbot.returnsFrom {@code return numberOfArgs;}
 *  */
    @Test
    public void testGetArgs_ReturnNumberOfArgs() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -255);
        
        int actual = option.getArgs();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#add(java.lang.String)}
 *  */
    @Test
    public void testAdd_1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = optionClazz.getDeclaredMethod("add", stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = ((Object) null);
        addMethod.invoke(option, addMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#add(java.lang.String)}
 *  */
    @Test
    public void testAdd() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = optionClazz.getDeclaredMethod("add", stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = ((Object) null);
        addMethod.invoke(option, addMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#add(java.lang.String)}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: !acceptsArg()
 *  */
    @Test(expected = RuntimeException.class)
    public void testAdd_ThrowRuntimeException() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = optionClazz.getDeclaredMethod("add", stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = ((Object) null);
        try {
            addMethod.invoke(option, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#add(java.lang.String)}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: !acceptsArg()
 *  */
    @Test(expected = RuntimeException.class)
    public void testAdd_ThrowRuntimeException_1() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = optionClazz.getDeclaredMethod("add", stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = ((Object) null);
        try {
            addMethod.invoke(option, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#add(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: values.add(value);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        
        /* This test fails because method [org.apache.commons.cli.Option.add] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.add(Option.java:473) */
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = optionClazz.getDeclaredMethod("add", stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = ((Object) null);
        try {
            addMethod.invoke(option, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#add(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: values.add(value);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setOptionalArg(true);
        
        /* This test fails because method [org.apache.commons.cli.Option.add] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.add(Option.java:473) */
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = optionClazz.getDeclaredMethod("add", stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = ((Object) null);
        try {
            addMethod.invoke(option, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (getClass() != o.getClass()): True}
 *  */
    @Test
    public void testEquals_GetClassNotEqualsOGetClass() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        short[] shortArray = {};
        
        boolean actual = option.equals(shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 *  */
    @Test
    public void testEquals_O() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        boolean actual = option.equals(option);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        boolean actual = option.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        String longOpt = "";
        option.setLongOpt(longOpt);
        
        String actual = option.toString();
        
        String expected = "[ option:    :: null ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        option.setLongOpt(longOpt);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        
        String actual = option.toString();
        
        String expected = "[ option: null \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000  [ARG] :: null ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 2);
        
        String actual = option.toString();
        
        String expected = "[ option:  [ARG...] :: null ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        option.setLongOpt(longOpt);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        
        String actual = option.toString();
        
        String expected = "[ option: null \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 [ARG...] :: null ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        
        String actual = option.toString();
        
        String expected = "[ option: \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000  [ARG] :: null ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString6() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        option.setLongOpt(longOpt);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 2);
        
        String actual = option.toString();
        
        String expected = "[ option: null \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 [ARG...] :: null ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString7() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        
        String actual = option.toString();
        
        String expected = "[ option:  [ARG...] :: null ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString8() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2147483646);
        Object type = createInstance("java.lang.Object");
        option.setType(type);
        
        String actual = option.toString();
        
        String expected = "[ option: \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000  :: null :: java.lang.Object@6db87a56 ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString9() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        Object type = createInstance("java.lang.Object");
        option.setType(type);
        
        String actual = option.toString();
        
        String expected = "[ option: null [ARG...] :: null :: java.lang.Object@979959f ]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hashCode()}
 * @utbot.executesCondition {@code (opt != null): False}
 * @utbot.executesCondition {@code (longOpt != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_LongOptEqualsNull() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        int actual = option.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hashCode()}
 * @utbot.executesCondition {@code (opt != null): False}
 * @utbot.executesCondition {@code (longOpt != null): True}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_LongOptNotEqualsNull() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "";
        option.setLongOpt(longOpt);
        
        int actual = option.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hashCode()}
 * @utbot.executesCondition {@code (opt != null): True}
 * @utbot.executesCondition {@code (longOpt != null): False}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_OptNotEqualsNull() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        int actual = option.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Option}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hashCode()}
     */
    @Test
    public void testHashCode() {
        Option option = new Option("abc", "#$\\\"'");
        option.setArgName("#$\\\"'");
        option.setLongOpt("XZ");
        Object object = new Object();
        option.setType(object);
        option.setDescription("");
        
        int actual = option.hashCode();
        
        assertEquals(2989792, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.clone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Option option = (Option) super.clone();
 *  */
    @Test
    public void testClone_ThrowNullPointerException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Option.clone] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.apache.commons.cli.Option.clone(Option.java:641) */
        option.clone();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli.Option}
     * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#clone()}
     */
    @Test
    public void testClone() throws Exception  {
        Option option = new Option("abc", "\n\t\r");
        option.setArgName("");
        option.setLongOpt("abc");
        Object object = new Object();
        option.setType(object);
        option.setDescription("A CloneNotSupportedException was thrown: ");
        
        Option actual = ((Option) option.clone());
        
        Option expected = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "abc";
        setField(expected, "org.apache.commons.cli.Option", "opt", opt);
        expected.setLongOpt(opt);
        String argName = "";
        expected.setArgName(argName);
        String description = "A CloneNotSupportedException was thrown: ";
        expected.setDescription(description);
        setField(expected, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        Object type = createInstance("java.lang.Object");
        expected.setType(type);
        ArrayList values = new ArrayList();
        setField(expected, "org.apache.commons.cli.Option", "values", values);
        setField(expected, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        // org.apache.commons.cli.Option has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue()}
 * @utbot.executesCondition {@code (hasNoValues()): True}
 * @utbot.returnsFrom {@code return hasNoValues() ? null : (String) values.get(0);}
 *  */
    @Test
    public void testGetValue_HasNoValues() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        String actual = option.getValue();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue()}
 * @utbot.executesCondition {@code (hasNoValues()): False}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return hasNoValues() ? null : (String) values.get(0);}
 *  */
    @Test
    public void testGetValue_NotHasNoValues() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        String actual = option.getValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue()}
 * @utbot.executesCondition {@code (hasNoValues()): False}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (String) values.get(0)
 *  */
    @Test
    public void testGetValue_ThrowClassCastException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        Object object = createInstance("java.lang.Object");
        values.add(object);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        /* This test fails because method [org.apache.commons.cli.Option.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli.Option.getValue(Option.java:485) */
        option.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hasNoValues()
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Option.getValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.hasNoValues(Option.java:589)
            org.apache.commons.cli.Option.getValue(Option.java:485) */
        option.getValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue(java.lang.String)}
 * @utbot.returnsFrom {@code return (value != null) ? value : defaultValue;}
 *  */
    @Test
    public void testGetValue_ReturnValueEqualsNull() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        String actual = option.getValue(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue(java.lang.String)}
 * @utbot.returnsFrom {@code return (value != null) ? value : defaultValue;}
 *  */
    @Test
    public void testGetValue_ReturnValueEqualsNull_1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        String actual = option.getValue(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue(java.lang.String)}
 * @utbot.returnsFrom {@code return (value != null) ? value : defaultValue;}
 *  */
    @Test
    public void testGetValue_ReturnValueEqualsNull_2() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        String string = "";
        values.add(string);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        String actual = option.getValue(((String) null));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String value = getValue();
 *  */
    @Test
    public void testGetValue_ThrowClassCastException1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        Object object = createInstance("java.lang.Object");
        values.add(object);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        /* This test fails because method [org.apache.commons.cli.Option.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli.Option.getValue(Option.java:485)
            org.apache.commons.cli.Option.getValue(Option.java:517) */
        option.getValue(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String value = getValue();
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Option.getValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.hasNoValues(Option.java:589)
            org.apache.commons.cli.Option.getValue(Option.java:485)
            org.apache.commons.cli.Option.getValue(Option.java:517) */
        option.getValue(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue(int)}
 * @utbot.executesCondition {@code (hasNoValues()): True}
 * @utbot.returnsFrom {@code return hasNoValues() ? null : (String) values.get(index);}
 *  */
    @Test
    public void testGetValue_HasNoValues1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        String actual = option.getValue(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue(int)}
 * @utbot.executesCondition {@code (hasNoValues()): False}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return hasNoValues() ? null : (String) values.get(index);}
 *  */
    @Test
    public void testGetValue_NotHasNoValues1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        String actual = option.getValue(2);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue(int)}
 * @utbot.executesCondition {@code (hasNoValues()): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (String) values.get(index)
 *  */
    @Test
    public void testGetValue_ThrowClassCastException2() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        Object object = createInstance("java.lang.Object");
        values.add(object);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        /* This test fails because method [org.apache.commons.cli.Option.getValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.cli.Option.getValue(Option.java:502) */
        option.getValue(0);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue(int)}
 * @utbot.executesCondition {@code (hasNoValues()): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: (String) values.get(index)
 *  */
    @Test
    public void testGetValue_ThrowIndexOutOfBoundsException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        /* This test fails because method [org.apache.commons.cli.Option.getValue] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 10]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.cli.Option.getValue(Option.java:502) */
        option.getValue(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hasNoValues()
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException2() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Option.getValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.hasNoValues(Option.java:589)
            org.apache.commons.cli.Option.getValue(Option.java:502) */
        option.getValue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKey()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getKey()}
 * @utbot.executesCondition {@code (opt == null): False}
 * @utbot.returnsFrom {@code return opt;}
 *  */
    @Test
    public void testGetKey_OptNotEqualsNull() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        String actual = option.getKey();
        
        assertEquals(opt, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getKey()}
 * @utbot.executesCondition {@code (opt == null): True}
 * @utbot.returnsFrom {@code return longOpt;}
 *  */
    @Test
    public void testGetKey_OptEqualsNull() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        String actual = option.getKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getId()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getId()}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getKey()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return getKey().charAt(0);}
 *  */
    @Test
    public void testGetId_StringCharAt() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "\u0000";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        int actual = option.getId();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getId()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getId()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return getKey().charAt(0);
 *  */
    @Test
    public void testGetId_ThrowStringIndexOutOfBoundsException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        /* This test fails because method [org.apache.commons.cli.Option.getId] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.apache.commons.cli.Option.getId(Option.java:147) */
        option.getId();
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getKey().charAt(0);
 *  */
    @Test
    public void testGetId_ThrowNullPointerException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Option.getId] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.getId(Option.java:147) */
        option.getId();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getType()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getType()}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testGetType_ReturnType() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        Object actual = option.getType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.setRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRequired(boolean)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#setRequired(boolean)}
 *  */
    @Test
    public void testSetRequired() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        option.setRequired(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValues()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValues()}
 * @utbot.executesCondition {@code (hasNoValues()): True}
 * @utbot.returnsFrom {@code return hasNoValues() ? null : (String[]) values.toArray(new String[values.size()]);}
 *  */
    @Test
    public void testGetValues_HasNoValues() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        java.lang.String[] actual = option.getValues();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValues()}
 * @utbot.executesCondition {@code (hasNoValues()): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.returnsFrom {@code return hasNoValues() ? null : (String[]) values.toArray(new String[values.size()]);}
 *  */
    @Test
    public void testGetValues_NotHasNoValues() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        java.lang.String[] actual = option.getValues();
        
        java.lang.String[] expected = {null, null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValues()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValues()}
 * @utbot.invokes org.apache.commons.cli.Option#hasNoValues()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: hasNoValues()
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Option.getValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.hasNoValues(Option.java:589)
            org.apache.commons.cli.Option.getValues(Option.java:531) */
        option.getValues();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getLongOpt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLongOpt()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getLongOpt()}
 * @utbot.returnsFrom {@code return longOpt;}
 *  */
    @Test
    public void testGetLongOpt_ReturnLongOpt() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        String actual = option.getLongOpt();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.hasArg
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasArg()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasArg()}
 * @utbot.returnsFrom {@code return numberOfArgs > 0 || numberOfArgs == UNLIMITED_VALUES;}
 *  */
    @Test
    public void testHasArg_NumberOfArgsLessOrEqualZeroOrNumberOfArgsNotEqualsUNLIMITED_VALUES() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        boolean actual = option.hasArg();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasArg()}
 * @utbot.returnsFrom {@code return numberOfArgs > 0 || numberOfArgs == UNLIMITED_VALUES;}
 *  */
    @Test
    public void testHasArg_NumberOfArgsGreaterThanZeroOrNumberOfArgsNotEqualsUNLIMITED_VALUES() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        
        boolean actual = option.hasArg();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasArg()}
 * @utbot.returnsFrom {@code return numberOfArgs > 0 || numberOfArgs == UNLIMITED_VALUES;}
 *  */
    @Test
    public void testHasArg_NumberOfArgsGreaterThanZeroOrNumberOfArgsEqualsUNLIMITED_VALUES() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        
        boolean actual = option.hasArg();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.processValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 *  */
    @Test
    public void testProcessValue_1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = ((Object) null);
        processValueMethod.invoke(option, processValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 *  */
    @Test
    public void testProcessValue_2() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", ' ');
        String string = " ";
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = string;
        processValueMethod.invoke(option, processValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 *  */
    @Test
    public void testProcessValue_3() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", ' ');
        String string = " ";
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = string;
        processValueMethod.invoke(option, processValueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 *  */
    @Test
    public void testProcessValue() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = ((Object) null);
        processValueMethod.invoke(option, processValueMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: add(value);
 *  */
    @Test(expected = RuntimeException.class)
    public void testProcessValue_ThrowRuntimeException() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = ((Object) null);
        try {
            processValueMethod.invoke(option, processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: add(value);
 *  */
    @Test(expected = RuntimeException.class)
    public void testProcessValue_ThrowRuntimeException_1() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = ((Object) null);
        try {
            processValueMethod.invoke(option, processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getValueSeparator()}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: add(value.substring(0, index));
 *  */
    @Test(expected = RuntimeException.class)
    public void testProcessValue_ThrowRuntimeException_2() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", ' ');
        String string = "_ ";
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = string;
        try {
            processValueMethod.invoke(option, processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int index = value.indexOf(sep);
 *  */
    @Test
    public void testProcessValue_ThrowNullPointerException() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0001');
        
        /* This test fails because method [org.apache.commons.cli.Option.processValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.processValue(Option.java:430) */
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = ((Object) null);
        try {
            processValueMethod.invoke(option, processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(value);
 *  */
    @Test
    public void testProcessValue_ThrowNullPointerException_1() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        /* This test fails because method [org.apache.commons.cli.Option.processValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.add(Option.java:473)
            org.apache.commons.cli.Option.processValue(Option.java:453) */
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = ((Object) null);
        try {
            processValueMethod.invoke(option, processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(value);
 *  */
    @Test
    public void testProcessValue_ThrowNullPointerException_2() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setOptionalArg(true);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        /* This test fails because method [org.apache.commons.cli.Option.processValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.add(Option.java:473)
            org.apache.commons.cli.Option.processValue(Option.java:453) */
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = ((Object) null);
        try {
            processValueMethod.invoke(option, processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: values.size() == (numberOfArgs - 1)
 *  */
    @Test
    public void testProcessValue_ThrowNullPointerException_3() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "valuesep", ' ');
        String string = " ";
        
        /* This test fails because method [org.apache.commons.cli.Option.processValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.processValue(Option.java:436) */
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = string;
        try {
            processValueMethod.invoke(option, processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#processValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(value);
 *  */
    @Test
    public void testProcessValue_ThrowNullPointerException_4() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0001');
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.Option.processValue] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.add(Option.java:473)
            org.apache.commons.cli.Option.processValue(Option.java:453) */
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = string;
        try {
            processValueMethod.invoke(option, processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method processValue(java.lang.String)
    
    @Test
    public void testProcessValue1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setOptionalArg(true);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", Integer.MIN_VALUE);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0001');
        String string = "\u0001\u3FFE\u0001\u0000\u0000\u0000\u0000\u0000";
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = string;
        processValueMethod.invoke(option, processValueMethodArguments);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processValue(java.lang.String)
    
    @Test(expected = RuntimeException.class)
    public void testProcessValue2() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", Integer.MIN_VALUE);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u01C0');
        String string = "\uFE3F\u01C0\u01C0\u01C0\u01C0\u01C0\u01C0\u01C0\u01C0\u01C0";
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Class stringType = Class.forName("java.lang.String");
        Method processValueMethod = optionClazz.getDeclaredMethod("processValue", stringType);
        processValueMethod.setAccessible(true);
        java.lang.Object[] processValueMethodArguments = new java.lang.Object[1];
        processValueMethodArguments[0] = string;
        try {
            processValueMethod.invoke(option, processValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.setDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDescription(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#setDescription(java.lang.String)}
 *  */
    @Test
    public void testSetDescription() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        option.setDescription(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getValuesList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValuesList()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValuesList()}
 * @utbot.returnsFrom {@code return values;}
 *  */
    @Test
    public void testGetValuesList_ReturnValues() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        ArrayList actual = ((ArrayList) option.getValuesList());
        
        assertTrue(deepEquals(values, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.hasValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasValueSeparator()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasValueSeparator()}
 * @utbot.returnsFrom {@code return valuesep > 0;}
 *  */
    @Test
    public void testHasValueSeparator_ValuesepLessOrEqualZero() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        boolean actual = option.hasValueSeparator();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasValueSeparator()}
 * @utbot.returnsFrom {@code return valuesep > 0;}
 *  */
    @Test
    public void testHasValueSeparator_ValuesepGreaterThanZero() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0001');
        
        boolean actual = option.hasValueSeparator();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.acceptsArg
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptsArg()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#acceptsArg()}
 * @utbot.returnsFrom {@code return (hasArg() || hasArgs() || hasOptionalArg()) && (numberOfArgs <= 0 || values.size() < numberOfArgs);}
 *  */
    @Test
    public void testAcceptsArg_HasArgOrHasArgsOrHasOptionalArgAndNumberOfArgsGreaterThanZeroOrValuesSizeGreaterOrEqualNumberOfArgs() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        boolean actual = option.acceptsArg();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#acceptsArg()}
 * @utbot.returnsFrom {@code return (hasArg() || hasArgs() || hasOptionalArg()) && (numberOfArgs <= 0 || values.size() < numberOfArgs);}
 *  */
    @Test
    public void testAcceptsArg_HasArgOrHasArgsOrHasOptionalArgAndNumberOfArgsLessOrEqualZeroOrValuesSizeGreaterOrEqualNumberOfArgs() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        
        boolean actual = option.acceptsArg();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#acceptsArg()}
 * @utbot.returnsFrom {@code return (hasArg() || hasArgs() || hasOptionalArg()) && (numberOfArgs <= 0 || values.size() < numberOfArgs);}
 *  */
    @Test
    public void testAcceptsArg_HasArgOrHasArgsOrHasOptionalArgAndNumberOfArgsLessOrEqualZeroOrValuesSizeLessThanNumberOfArgs() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setOptionalArg(true);
        
        boolean actual = option.acceptsArg();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#acceptsArg()}
 * @utbot.returnsFrom {@code return (hasArg() || hasArgs() || hasOptionalArg()) && (numberOfArgs <= 0 || values.size() < numberOfArgs);}
 *  */
    @Test
    public void testAcceptsArg_HasArgOrHasArgsOrHasOptionalArgAndNumberOfArgsLessOrEqualZeroOrValuesSizeLessThanNumberOfArgs_1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        boolean actual = option.acceptsArg();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#acceptsArg()}
 * @utbot.returnsFrom {@code return (hasArg() || hasArgs() || hasOptionalArg()) && (numberOfArgs <= 0 || values.size() < numberOfArgs);}
 *  */
    @Test
    public void testAcceptsArg_HasArgOrHasArgsOrHasOptionalArgAndNumberOfArgsGreaterThanZeroOrValuesSizeGreaterOrEqualNumberOfArgs_1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        boolean actual = option.acceptsArg();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptsArg()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#acceptsArg()}
 * @utbot.invokes {@link org.apache.commons.cli.Option#hasArg()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (hasArg() || hasArgs() || hasOptionalArg()) && (numberOfArgs <= 0 || values.size() < numberOfArgs);
 *  */
    @Test
    public void testAcceptsArg_ThrowNullPointerException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        
        /* This test fails because method [org.apache.commons.cli.Option.acceptsArg] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.acceptsArg(Option.java:681) */
        option.acceptsArg();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.hasLongOpt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasLongOpt()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasLongOpt()}
 * @utbot.returnsFrom {@code return longOpt != null;}
 *  */
    @Test
    public void testHasLongOpt_LongOptNotEqualsNull() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "";
        option.setLongOpt(longOpt);
        
        boolean actual = option.hasLongOpt();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasLongOpt()}
 * @utbot.returnsFrom {@code return longOpt != null;}
 *  */
    @Test
    public void testHasLongOpt_LongOptEqualsNull() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        boolean actual = option.hasLongOpt();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.setValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValueSeparator(char)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#setValueSeparator(char)}
 *  */
    @Test
    public void testSetValueSeparator() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "valuesep", ' ');
        
        option.setValueSeparator(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.setLongOpt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLongOpt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#setLongOpt(java.lang.String)}
 *  */
    @Test
    public void testSetLongOpt() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        option.setLongOpt(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getValueSeparator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueSeparator()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getValueSeparator()}
 * @utbot.returnsFrom {@code return valuesep;}
 *  */
    @Test
    public void testGetValueSeparator_ReturnValuesep() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "valuesep", ' ');
        
        char actual = option.getValueSeparator();
        
        assertEquals(' ', actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.setArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setArgs(int)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#setArgs(int)}
 *  */
    @Test
    public void testSetArgs() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -255);
        
        option.setArgs(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.clearValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearValues()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#clearValues()}
 * @utbot.invokes {@link java.util.List#clear()}
 *  */
    @Test
    public void testClearValues_ListClear() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        option.clearValues();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearValues()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#clearValues()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: values.clear();
 *  */
    @Test
    public void testClearValues_ThrowNullPointerException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Option.clearValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.clearValues(Option.java:658) */
        option.clearValues();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.hasOptionalArg
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOptionalArg()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasOptionalArg()}
 * @utbot.returnsFrom {@code return optionalArg;}
 *  */
    @Test
    public void testHasOptionalArg_ReturnOptionalArg() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        boolean actual = option.hasOptionalArg();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.hasArgName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasArgName()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasArgName()}
 * @utbot.returnsFrom {@code return argName != null && argName.length() > 0;}
 *  */
    @Test
    public void testHasArgName_ArgNameNotEqualsNullAndArgNameLengthGreaterThanZero() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String argName = "\u0000";
        option.setArgName(argName);
        
        boolean actual = option.hasArgName();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasArgName()}
 * @utbot.returnsFrom {@code return argName != null && argName.length() > 0;}
 *  */
    @Test
    public void testHasArgName_ArgNameEqualsNullAndArgNameLengthLessOrEqualZero() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        boolean actual = option.hasArgName();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasArgName()}
 * @utbot.returnsFrom {@code return argName != null && argName.length() > 0;}
 *  */
    @Test
    public void testHasArgName_ArgNameEqualsNullAndArgNameLengthLessOrEqualZero_1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String argName = "";
        option.setArgName(argName);
        
        boolean actual = option.hasArgName();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.setOptionalArg
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOptionalArg(boolean)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#setOptionalArg(boolean)}
 *  */
    @Test
    public void testSetOptionalArg() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        option.setOptionalArg(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getArgName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArgName()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getArgName()}
 * @utbot.returnsFrom {@code return argName;}
 *  */
    @Test
    public void testGetArgName_ReturnArgName() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        String actual = option.getArgName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.isRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRequired()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#isRequired()}
 * @utbot.returnsFrom {@code return required;}
 *  */
    @Test
    public void testIsRequired_ReturnRequired() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        boolean actual = option.isRequired();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.requiresArg
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method requiresArg()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#requiresArg()}
 * @utbot.executesCondition {@code (optionalArg): False}
 * @utbot.executesCondition {@code (numberOfArgs == UNLIMITED_VALUES): False}
 * @utbot.returnsFrom {@code return acceptsArg();}
 *  */
    @Test
    public void testRequiresArg_NumberOfArgsNotEqualsUNLIMITED_VALUES() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        boolean actual = option.requiresArg();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#requiresArg()}
 * @utbot.executesCondition {@code (optionalArg): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRequiresArg_OptionalArg() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setOptionalArg(true);
        
        boolean actual = option.requiresArg();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#requiresArg()}
 * @utbot.executesCondition {@code (optionalArg): False}
 * @utbot.executesCondition {@code (numberOfArgs == UNLIMITED_VALUES): True}
 * @utbot.returnsFrom {@code return values.size() < 1;}
 *  */
    @Test
    public void testRequiresArg_ValuesSizeLessThan1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        boolean actual = option.requiresArg();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#requiresArg()}
 * @utbot.executesCondition {@code (optionalArg): False}
 * @utbot.executesCondition {@code (numberOfArgs == UNLIMITED_VALUES): False}
 * @utbot.returnsFrom {@code return acceptsArg();}
 *  */
    @Test
    public void testRequiresArg_NumberOfArgsNotEqualsUNLIMITED_VALUES_2() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        boolean actual = option.requiresArg();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#requiresArg()}
 * @utbot.executesCondition {@code (optionalArg): False}
 * @utbot.executesCondition {@code (numberOfArgs == UNLIMITED_VALUES): True}
 * @utbot.returnsFrom {@code return values.size() < 1;}
 *  */
    @Test
    public void testRequiresArg_ValuesSizeGreaterOrEqual1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        boolean actual = option.requiresArg();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#requiresArg()}
 * @utbot.executesCondition {@code (optionalArg): False}
 * @utbot.executesCondition {@code (numberOfArgs == UNLIMITED_VALUES): False}
 * @utbot.returnsFrom {@code return acceptsArg();}
 *  */
    @Test
    public void testRequiresArg_NumberOfArgsNotEqualsUNLIMITED_VALUES_1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        boolean actual = option.requiresArg();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method requiresArg()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#requiresArg()}
 * @utbot.executesCondition {@code (optionalArg): False}
 * @utbot.executesCondition {@code (numberOfArgs == UNLIMITED_VALUES): True}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return values.size() < 1;
 *  */
    @Test
    public void testRequiresArg_ThrowNullPointerException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        
        /* This test fails because method [org.apache.commons.cli.Option.requiresArg] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.requiresArg(Option.java:698) */
        option.requiresArg();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.setArgName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setArgName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#setArgName(java.lang.String)}
 *  */
    @Test
    public void testSetArgName() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        option.setArgName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.hasNoValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasNoValues()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasNoValues()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.returnsFrom {@code return values.isEmpty();}
 *  */
    @Test
    public void testHasNoValues_ListIsEmpty() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Method hasNoValuesMethod = optionClazz.getDeclaredMethod("hasNoValues");
        hasNoValuesMethod.setAccessible(true);
        java.lang.Object[] hasNoValuesMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) hasNoValuesMethod.invoke(option, hasNoValuesMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasNoValues()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasNoValues()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return values.isEmpty();
 *  */
    @Test
    public void testHasNoValues_ThrowNullPointerException() throws Throwable  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        /* This test fails because method [org.apache.commons.cli.Option.hasNoValues] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.hasNoValues(Option.java:589) */
        Class optionClazz = Class.forName("org.apache.commons.cli.Option");
        Method hasNoValuesMethod = optionClazz.getDeclaredMethod("hasNoValues");
        hasNoValuesMethod.setAccessible(true);
        java.lang.Object[] hasNoValuesMethodArguments = new java.lang.Object[0];
        try {
            hasNoValuesMethod.invoke(option, hasNoValuesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.hasArgs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasArgs()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasArgs()}
 * @utbot.returnsFrom {@code return numberOfArgs > 1 || numberOfArgs == UNLIMITED_VALUES;}
 *  */
    @Test
    public void testHasArgs_NumberOfArgsLessOrEqual1OrNumberOfArgsNotEqualsUNLIMITED_VALUES() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        
        boolean actual = option.hasArgs();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasArgs()}
 * @utbot.returnsFrom {@code return numberOfArgs > 1 || numberOfArgs == UNLIMITED_VALUES;}
 *  */
    @Test
    public void testHasArgs_NumberOfArgsGreaterThan1OrNumberOfArgsNotEqualsUNLIMITED_VALUES() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 2);
        
        boolean actual = option.hasArgs();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#hasArgs()}
 * @utbot.returnsFrom {@code return numberOfArgs > 1 || numberOfArgs == UNLIMITED_VALUES;}
 *  */
    @Test
    public void testHasArgs_NumberOfArgsGreaterThan1OrNumberOfArgsEqualsUNLIMITED_VALUES() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        
        boolean actual = option.hasArgs();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.addValueForProcessing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addValueForProcessing(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 *  */
    @Test
    public void testAddValueForProcessing_1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        option.addValueForProcessing(null);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 *  */
    @Test
    public void testAddValueForProcessing_2() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", ' ');
        String string = " ";
        
        option.addValueForProcessing(string);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 *  */
    @Test
    public void testAddValueForProcessing_3() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", ',');
        String string = "S,";
        
        option.addValueForProcessing(string);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 *  */
    @Test
    public void testAddValueForProcessing() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        option.addValueForProcessing(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValueForProcessing(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 * @utbot.activatesSwitch {@code switch(numberOfArgs) case: default}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: switch(numberOfArgs) case: UNINITIALIZED
 *  */
    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_ThrowRuntimeException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -1);
        
        option.addValueForProcessing(null);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: processValue(value);
 *  */
    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_ThrowRuntimeException_1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        option.addValueForProcessing(null);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: processValue(value);
 *  */
    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_ThrowRuntimeException_2() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        option.addValueForProcessing(null);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: processValue(value);
 *  */
    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing_ThrowRuntimeException_3() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", 1);
        ArrayList values = new ArrayList();
        values.add(null);
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", ' ');
        String string = " ";
        
        option.addValueForProcessing(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addValueForProcessing(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: processValue(value);
 *  */
    @Test
    public void testAddValueForProcessing_ThrowNullPointerException() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -255);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0001');
        
        /* This test fails because method [org.apache.commons.cli.Option.addValueForProcessing] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.processValue(Option.java:430)
            org.apache.commons.cli.Option.addValueForProcessing(Option.java:406) */
        option.addValueForProcessing(null);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: processValue(value);
 *  */
    @Test
    public void testAddValueForProcessing_ThrowNullPointerException_1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -255);
        setField(option, "org.apache.commons.cli.Option", "valuesep", ' ');
        String string = " ";
        
        /* This test fails because method [org.apache.commons.cli.Option.addValueForProcessing] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.processValue(Option.java:436)
            org.apache.commons.cli.Option.addValueForProcessing(Option.java:406) */
        option.addValueForProcessing(string);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: processValue(value);
 *  */
    @Test
    public void testAddValueForProcessing_ThrowNullPointerException_2() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setOptionalArg(true);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        /* This test fails because method [org.apache.commons.cli.Option.addValueForProcessing] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.add(Option.java:473)
            org.apache.commons.cli.Option.processValue(Option.java:453)
            org.apache.commons.cli.Option.addValueForProcessing(Option.java:406) */
        option.addValueForProcessing(null);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: processValue(value);
 *  */
    @Test
    public void testAddValueForProcessing_ThrowNullPointerException_3() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0000');
        
        /* This test fails because method [org.apache.commons.cli.Option.addValueForProcessing] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.add(Option.java:473)
            org.apache.commons.cli.Option.processValue(Option.java:453)
            org.apache.commons.cli.Option.addValueForProcessing(Option.java:406) */
        option.addValueForProcessing(null);
    }
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#addValueForProcessing(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: processValue(value);
 *  */
    @Test
    public void testAddValueForProcessing_ThrowNullPointerException_4() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0001');
        String string = "";
        
        /* This test fails because method [org.apache.commons.cli.Option.addValueForProcessing] produces [java.lang.NullPointerException]
            org.apache.commons.cli.Option.add(Option.java:473)
            org.apache.commons.cli.Option.processValue(Option.java:453)
            org.apache.commons.cli.Option.addValueForProcessing(Option.java:406) */
        option.addValueForProcessing(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addValueForProcessing(java.lang.String)
    
    @Test
    public void testAddValueForProcessing1() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        option.setOptionalArg(true);
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", -2147483647);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0001');
        String string = "\u0001>\u0001\u0000\u0000\u0000\u0000\u0000";
        
        option.addValueForProcessing(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addValueForProcessing(java.lang.String)
    
    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessing2() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "numberOfArgs", Integer.MIN_VALUE);
        ArrayList values = new ArrayList();
        setField(option, "org.apache.commons.cli.Option", "values", values);
        setField(option, "org.apache.commons.cli.Option", "valuesep", '\u0001');
        String string = "\u0000\u0000\u0001";
        
        option.addValueForProcessing(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli.Option.getOpt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOpt()
    
    /**
    @utbot.classUnderTest {@link Option}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.Option#getOpt()}
 * @utbot.returnsFrom {@code return opt;}
 *  */
    @Test
    public void testGetOpt_ReturnOpt() throws Exception  {
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        String actual = option.getOpt();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields841697245303600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields841697245303600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass841697245317500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields841697245303600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass841697245317500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.apache.commons.cli2.builder;

import org.junit.Test;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.cli2.Option;
import java.util.Comparator;
import org.apache.commons.cli2.option.GroupImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.cli2.validation.Validator;
import org.apache.commons.cli2.validation.UrlValidator;
import org.apache.commons.cli2.validation.FileValidator;
import org.junit.Ignore;
import org.apache.commons.cli2.validation.NumberValidator;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_cli2_builder_PatternBuilderTest {
    ///region Test suites for executable org.apache.commons.cli2.builder.PatternBuilder.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset()
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#reset()}
 * @utbot.invokes {@link java.util.Set#clear()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReset_SetClear() throws Exception  {
        PatternBuilder patternBuilder = ((PatternBuilder) createInstance("org.apache.commons.cli2.builder.PatternBuilder"));
        LinkedHashSet options = new LinkedHashSet();
        setField(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "options", options);
        
        PatternBuilder actual = patternBuilder.reset();
        
        GroupBuilder actualGbuilder = ((GroupBuilder) getFieldValue(actual, "org.apache.commons.cli2.builder.PatternBuilder", "gbuilder"));
        assertNull(actualGbuilder);
        
        DefaultOptionBuilder actualObuilder = ((DefaultOptionBuilder) getFieldValue(actual, "org.apache.commons.cli2.builder.PatternBuilder", "obuilder"));
        assertNull(actualObuilder);
        
        ArgumentBuilder actualAbuilder = ((ArgumentBuilder) getFieldValue(actual, "org.apache.commons.cli2.builder.PatternBuilder", "abuilder"));
        assertNull(actualAbuilder);
        
        Set patternBuilderOptions = ((Set) getFieldValue(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "options"));
        Set actualOptions = ((Set) getFieldValue(actual, "org.apache.commons.cli2.builder.PatternBuilder", "options"));
        assertTrue(deepEquals(patternBuilderOptions, actualOptions));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reset()
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#reset()}
 * @utbot.invokes {@link java.util.Set#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: options.clear();
 *  */
    @Test
    public void testReset_ThrowNullPointerException() throws Exception  {
        PatternBuilder patternBuilder = ((PatternBuilder) createInstance("org.apache.commons.cli2.builder.PatternBuilder"));
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.reset] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.reset(PatternBuilder.java:96) */
        patternBuilder.reset();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.builder.PatternBuilder.create
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method create()
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#create()}
 * @utbot.executesCondition {@code (options.size() == 1): True}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.invokes {@link java.util.Iterator#next()}
 * @utbot.returnsFrom {@code return option;}
 *  */
    @Test
    public void testCreate_OptionsSizeEquals1() throws Exception  {
        PatternBuilder patternBuilder = ((PatternBuilder) createInstance("org.apache.commons.cli2.builder.PatternBuilder"));
        LinkedHashSet options = new LinkedHashSet();
        options.add(null);
        setField(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "options", options);
        
        Option actual = patternBuilder.create();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#create()}
 * @utbot.executesCondition {@code (options.size() == 1): False}
 * @utbot.invokes {@link org.apache.commons.cli2.builder.GroupBuilder#reset()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.invokes {@link org.apache.commons.cli2.builder.GroupBuilder#create()}
 * @utbot.returnsFrom {@code return option;}
 *  */
    @Test
    public void testCreate_OptionsSizeNotEquals1() throws Exception  {
        Class reverseStringComparatorClazz = Class.forName("org.apache.commons.cli2.option.ReverseStringComparator");
        Comparator prevInstance = ((Comparator) getStaticFieldValue(reverseStringComparatorClazz, "instance"));
        try {
            Object instance = createInstance("org.apache.commons.cli2.option.ReverseStringComparator");
            setStaticField(reverseStringComparatorClazz, "instance", instance);
            PatternBuilder patternBuilder = ((PatternBuilder) createInstance("org.apache.commons.cli2.builder.PatternBuilder"));
            GroupBuilder gbuilder = ((GroupBuilder) createInstance("org.apache.commons.cli2.builder.GroupBuilder"));
            String name = "";
            setField(gbuilder, "org.apache.commons.cli2.builder.GroupBuilder", "name", name);
            setField(gbuilder, "org.apache.commons.cli2.builder.GroupBuilder", "description", name);
            setField(gbuilder, "org.apache.commons.cli2.builder.GroupBuilder", "minimum", -255);
            setField(gbuilder, "org.apache.commons.cli2.builder.GroupBuilder", "maximum", -255);
            setField(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "gbuilder", gbuilder);
            LinkedHashSet options = new LinkedHashSet();
            setField(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "options", options);
            
            GroupImpl actual = ((GroupImpl) patternBuilder.create());
            
            GroupImpl expected = ((GroupImpl) createInstance("org.apache.commons.cli2.option.GroupImpl"));
            List options1 = new ArrayList();
            setField(expected, "org.apache.commons.cli2.option.GroupImpl", "options", options1);
            setField(expected, "org.apache.commons.cli2.option.GroupImpl", "maximum", Integer.MAX_VALUE);
            List anonymous = new ArrayList();
            setField(expected, "org.apache.commons.cli2.option.GroupImpl", "anonymous", anonymous);
            Object optionMap = createInstance("java.util.Collections$UnmodifiableSortedMap");
            setField(expected, "org.apache.commons.cli2.option.GroupImpl", "optionMap", optionMap);
            Set prefixes = new LinkedHashSet();
            setField(expected, "org.apache.commons.cli2.option.GroupImpl", "prefixes", prefixes);
            
            String actualName = ((String) getFieldValue(actual, "org.apache.commons.cli2.option.GroupImpl", "name"));
            assertNull(actualName);
            
            String actualDescription = actual.getDescription();
            assertNull(actualDescription);
            
            List expectedOptions = expected.getOptions();
            List actualOptions = actual.getOptions();
            assertTrue(deepEquals(expectedOptions, actualOptions));
            
            int expectedMinimum = expected.getMinimum();
            int actualMinimum = actual.getMinimum();
            assertEquals(expectedMinimum, actualMinimum);
            
            int expectedMaximum = expected.getMaximum();
            int actualMaximum = actual.getMaximum();
            assertEquals(expectedMaximum, actualMaximum);
            
            List expectedAnonymous = expected.getAnonymous();
            List actualAnonymous = actual.getAnonymous();
            assertTrue(deepEquals(expectedAnonymous, actualAnonymous));
            
            SortedMap expectedOptionMap = ((SortedMap) getFieldValue(expected, "org.apache.commons.cli2.option.GroupImpl", "optionMap"));
            SortedMap actualOptionMap = ((SortedMap) getFieldValue(actual, "org.apache.commons.cli2.option.GroupImpl", "optionMap"));
            // java.util.SortedMap is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(expectedOptionMap, actualOptionMap));
            
            Set expectedPrefixes = expected.getPrefixes();
            Set actualPrefixes = actual.getPrefixes();
            assertTrue(deepEquals(expectedPrefixes, actualPrefixes));
            
            int expectedId = expected.getId();
            int actualId = actual.getId();
            assertEquals(expectedId, actualId);
            
            boolean actualRequired = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.option.OptionImpl", "required"));
            assertFalse(actualRequired);
            
            GroupBuilder patternBuilderGbuilder = ((GroupBuilder) getFieldValue(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "gbuilder"));
            int finalPatternBuilderGbuilderMinimum = ((Integer) getFieldValue(patternBuilderGbuilder, "org.apache.commons.cli2.builder.GroupBuilder", "minimum"));
            GroupBuilder patternBuilderGbuilder1 = ((GroupBuilder) getFieldValue(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "gbuilder"));
            int finalPatternBuilderGbuilderMaximum = ((Integer) getFieldValue(patternBuilderGbuilder1, "org.apache.commons.cli2.builder.GroupBuilder", "maximum"));
            
            assertEquals(0, finalPatternBuilderGbuilderMinimum);
            
            assertEquals(Integer.MAX_VALUE, finalPatternBuilderGbuilderMaximum);
        } finally {
            setStaticField(reverseStringComparatorClazz, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method create()
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#create()}
 * @utbot.executesCondition {@code (options.size() == 1): True}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.invokes {@link java.util.Iterator#next()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: option = (Option) options.iterator().next();
 *  */
    @Test
    public void testCreate_ThrowClassCastException() throws Exception  {
        PatternBuilder patternBuilder = ((PatternBuilder) createInstance("org.apache.commons.cli2.builder.PatternBuilder"));
        LinkedHashSet options = new LinkedHashSet();
        Integer integer = 0;
        options.add(integer);
        setField(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.create] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.apache.commons.cli2.Option (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.cli2.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7fa7457f)]
            org.apache.commons.cli2.builder.PatternBuilder.create(PatternBuilder.java:77) */
        patternBuilder.create();
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#create()}
 * @utbot.executesCondition {@code (options.size() == 1): False}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = options.iterator(); i.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: gbuilder.withOption((Option) i.next());
 *  */
    @Test
    public void testCreate_ThrowClassCastException_1() throws Exception  {
        PatternBuilder patternBuilder = ((PatternBuilder) createInstance("org.apache.commons.cli2.builder.PatternBuilder"));
        GroupBuilder gbuilder = ((GroupBuilder) createInstance("org.apache.commons.cli2.builder.GroupBuilder"));
        String name = "";
        setField(gbuilder, "org.apache.commons.cli2.builder.GroupBuilder", "name", name);
        setField(gbuilder, "org.apache.commons.cli2.builder.GroupBuilder", "description", name);
        setField(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "gbuilder", gbuilder);
        LinkedHashSet options = new LinkedHashSet();
        Integer integer = 1;
        options.add(integer);
        Integer integer1 = 0;
        options.add(integer1);
        setField(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.create] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.apache.commons.cli2.Option (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.cli2.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7fa7457f)]
            org.apache.commons.cli2.builder.PatternBuilder.create(PatternBuilder.java:82) */
        patternBuilder.create();
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#create()}
 * @utbot.executesCondition {@code (options.size() == 1): False}
 * @utbot.iterates iterate the loop {@code for(final Iterator i = options.iterator(); i.hasNext(); )} twice
 * @utbot.throwsException {@link java.lang.ClassCastException} in: gbuilder.withOption((Option) i.next());
 *  */
    @Test
    public void testCreate_ThrowClassCastException_2() throws Exception  {
        PatternBuilder patternBuilder = ((PatternBuilder) createInstance("org.apache.commons.cli2.builder.PatternBuilder"));
        GroupBuilder gbuilder = ((GroupBuilder) createInstance("org.apache.commons.cli2.builder.GroupBuilder"));
        String name = "";
        setField(gbuilder, "org.apache.commons.cli2.builder.GroupBuilder", "name", name);
        setField(gbuilder, "org.apache.commons.cli2.builder.GroupBuilder", "description", name);
        setField(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "gbuilder", gbuilder);
        LinkedHashSet options = new LinkedHashSet();
        options.add(null);
        Integer integer = 0;
        options.add(integer);
        setField(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.create] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class org.apache.commons.cli2.Option (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.cli2.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7fa7457f)]
            org.apache.commons.cli2.builder.PatternBuilder.create(PatternBuilder.java:82) */
        patternBuilder.create();
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#create()}
 * @utbot.invokes {@link java.util.Set#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.size() == 1
 *  */
    @Test
    public void testCreate_ThrowNullPointerException() throws Exception  {
        PatternBuilder patternBuilder = ((PatternBuilder) createInstance("org.apache.commons.cli2.builder.PatternBuilder"));
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.create] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.create(PatternBuilder.java:76) */
        patternBuilder.create();
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#create()}
 * @utbot.executesCondition {@code (options.size() == 1): False}
 * @utbot.invokes {@link org.apache.commons.cli2.builder.GroupBuilder#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gbuilder.reset();
 *  */
    @Test
    public void testCreate_ThrowNullPointerException_1() throws Exception  {
        PatternBuilder patternBuilder = ((PatternBuilder) createInstance("org.apache.commons.cli2.builder.PatternBuilder"));
        LinkedHashSet options = new LinkedHashSet();
        setField(patternBuilder, "org.apache.commons.cli2.builder.PatternBuilder", "options", options);
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.create] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.create(PatternBuilder.java:80) */
        patternBuilder.create();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.builder.PatternBuilder.withPattern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withPattern(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#withPattern(java.lang.String)}
 *  */
    @Test
    public void testWithPattern() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "";
        
        patternBuilder.withPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#withPattern(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 *  */
    @Test
    public void testWithPattern_SwitchChCase() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "#";
        
        patternBuilder.withPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#withPattern(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 *  */
    @Test
    public void testWithPattern_OptEqualsChar() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = " ";
        
        patternBuilder.withPattern(string);
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#withPattern(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 *  */
    @Test
    public void testWithPattern_SwitchChCase_1() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "!";
        
        patternBuilder.withPattern(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withPattern(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#withPattern(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int sz = pattern.length();
 *  */
    @Test
    public void testWithPattern_ThrowNullPointerException() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.withPattern] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.withPattern(PatternBuilder.java:133) */
        patternBuilder.withPattern(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withPattern(java.lang.String)
    
    @Test
    public void testWithPattern1() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "<< ";
        
        patternBuilder.withPattern(string);
    }
    
    @Test
    public void testWithPattern2() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "%! ";
        
        patternBuilder.withPattern(string);
    }
    
    @Test
    public void testWithPattern3() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "!#";
        
        patternBuilder.withPattern(string);
    }
    
    @Test
    public void testWithPattern4() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "!!";
        
        patternBuilder.withPattern(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withPattern(java.lang.String)
    
    @Test
    public void testWithPattern5() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "$*\u0000";
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.withPattern] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.createOption(PatternBuilder.java:106)
            org.apache.commons.cli2.builder.PatternBuilder.withPattern(PatternBuilder.java:160) */
        patternBuilder.withPattern(string);
    }
    
    @Test
    public void testWithPattern6() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "$!\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.withPattern] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.createOption(PatternBuilder.java:120)
            org.apache.commons.cli2.builder.PatternBuilder.withPattern(PatternBuilder.java:160) */
        patternBuilder.withPattern(string);
    }
    
    @Test
    public void testWithPattern7() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "@\u0000";
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.withPattern] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.createOption(PatternBuilder.java:106)
            org.apache.commons.cli2.builder.PatternBuilder.withPattern(PatternBuilder.java:170) */
        patternBuilder.withPattern(string);
    }
    
    @Test
    public void testWithPattern8() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "#!\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.withPattern] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.createOption(PatternBuilder.java:106)
            org.apache.commons.cli2.builder.PatternBuilder.withPattern(PatternBuilder.java:160) */
        patternBuilder.withPattern(string);
    }
    
    @Test
    public void testWithPattern9() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "!\"";
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.withPattern] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.createOption(PatternBuilder.java:120)
            org.apache.commons.cli2.builder.PatternBuilder.withPattern(PatternBuilder.java:170) */
        patternBuilder.withPattern(string);
    }
    
    @Test
    public void testWithPattern10() {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.withPattern] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.createOption(PatternBuilder.java:120)
            org.apache.commons.cli2.builder.PatternBuilder.withPattern(PatternBuilder.java:160) */
        patternBuilder.withPattern(string);
    }
    
    @Test
    public void testWithPattern11() throws Exception  {
        DefaultOptionBuilder defaultOptionBuilder = ((DefaultOptionBuilder) createInstance("org.apache.commons.cli2.builder.DefaultOptionBuilder"));
        String preferredName = "";
        setField(defaultOptionBuilder, "org.apache.commons.cli2.builder.DefaultOptionBuilder", "preferredName", preferredName);
        setField(defaultOptionBuilder, "org.apache.commons.cli2.builder.DefaultOptionBuilder", "description", preferredName);
        PatternBuilder patternBuilder = new PatternBuilder(null, defaultOptionBuilder, null);
        String string = "5";
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.withPattern] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.DefaultOption.<init>(DefaultOption.java:96)
            org.apache.commons.cli2.builder.DefaultOptionBuilder.create(DefaultOptionBuilder.java:92)
            org.apache.commons.cli2.builder.PatternBuilder.createOption(PatternBuilder.java:125)
            org.apache.commons.cli2.builder.PatternBuilder.withPattern(PatternBuilder.java:170) */
        patternBuilder.withPattern(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.builder.PatternBuilder.validator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method validator(char)
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#validator(char)}
 * @utbot.activatesSwitch {@code switch(c) case: default}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testValidator_ReturnNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Method validatorMethod = patternBuilderClazz.getDeclaredMethod("validator", charType);
        validatorMethod.setAccessible(true);
        java.lang.Object[] validatorMethodArguments = new java.lang.Object[1];
        validatorMethodArguments[0] = '9';
        Validator actual = ((Validator) validatorMethod.invoke(null, validatorMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#validator(char)}
 * @utbot.activatesSwitch {@code switch(c) case: '/'}
 * @utbot.returnsFrom {@code return new UrlValidator();}
 *  */
    @Test
    public void testValidator_Return_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Method validatorMethod = patternBuilderClazz.getDeclaredMethod("validator", charType);
        validatorMethod.setAccessible(true);
        java.lang.Object[] validatorMethodArguments = new java.lang.Object[1];
        validatorMethodArguments[0] = '/';
        UrlValidator actual = ((UrlValidator) validatorMethod.invoke(null, validatorMethodArguments));
        
        UrlValidator expected = new UrlValidator();
        expected.setProtocol(null);
        
        String actualProtocol = actual.getProtocol();
        assertNull(actualProtocol);
        
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#validator(char)}
 * @utbot.invokes {@link org.apache.commons.cli2.validation.FileValidator#setExisting(boolean)}
 * @utbot.invokes {@link org.apache.commons.cli2.validation.FileValidator#setFile(boolean)}
 * @utbot.activatesSwitch {@code switch(c) case: '<'}
 * @utbot.returnsFrom {@code return existingv;}
 *  */
    @Test
    public void testValidator_FileValidatorSetFile() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException  {
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Method validatorMethod = patternBuilderClazz.getDeclaredMethod("validator", charType);
        validatorMethod.setAccessible(true);
        java.lang.Object[] validatorMethodArguments = new java.lang.Object[1];
        validatorMethodArguments[0] = '<';
        FileValidator actual = ((FileValidator) validatorMethod.invoke(null, validatorMethodArguments));
        
        FileValidator expected = new FileValidator();
        expected.setReadable(false);
        expected.setWritable(false);
        expected.setExisting(true);
        expected.setDirectory(false);
        expected.setFile(true);
        expected.setHidden(false);
        
        boolean actualReadable = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "readable"));
        assertFalse(actualReadable);
        
        boolean actualWritable = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "writable"));
        assertFalse(actualWritable);
        
        boolean actualExisting = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "existing"));
        assertTrue(actualExisting);
        
        boolean actualDirectory = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "directory"));
        assertFalse(actualDirectory);
        
        boolean actualFile = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "file"));
        assertTrue(actualFile);
        
        boolean actualHidden = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "hidden"));
        assertFalse(actualHidden);
        
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#validator(char)}
 * @utbot.activatesSwitch {@code switch(c) case: '*'}
 * @utbot.returnsFrom {@code return new FileValidator();}
 *  */
    @Test
    public void testValidator_Return() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException  {
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Method validatorMethod = patternBuilderClazz.getDeclaredMethod("validator", charType);
        validatorMethod.setAccessible(true);
        java.lang.Object[] validatorMethodArguments = new java.lang.Object[1];
        validatorMethodArguments[0] = '>';
        FileValidator actual = ((FileValidator) validatorMethod.invoke(null, validatorMethodArguments));
        
        FileValidator expected = new FileValidator();
        expected.setReadable(false);
        expected.setWritable(false);
        expected.setExisting(false);
        expected.setDirectory(false);
        expected.setFile(false);
        expected.setHidden(false);
        
        boolean actualReadable = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "readable"));
        assertFalse(actualReadable);
        
        boolean actualWritable = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "writable"));
        assertFalse(actualWritable);
        
        boolean actualExisting = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "existing"));
        assertFalse(actualExisting);
        
        boolean actualDirectory = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "directory"));
        assertFalse(actualDirectory);
        
        boolean actualFile = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "file"));
        assertFalse(actualFile);
        
        boolean actualHidden = ((Boolean) getFieldValue(actual, "org.apache.commons.cli2.validation.FileValidator", "hidden"));
        assertFalse(actualHidden);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validator(char)
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#validator(char)}
 * @utbot.invokes {@link org.apache.commons.cli2.validation.ClassValidator#setInstance(boolean)}
 * @utbot.activatesSwitch {@code switch(c) case: '@'}
 * @utbot.returnsFrom {@code return classv;}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return classv;
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testValidator_ThrowNoClassDefFoundError() throws Throwable  {
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Method validatorMethod = patternBuilderClazz.getDeclaredMethod("validator", charType);
        validatorMethod.setAccessible(true);
        java.lang.Object[] validatorMethodArguments = new java.lang.Object[1];
        validatorMethodArguments[0] = '@';
        try {
            validatorMethod.invoke(null, validatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#validator(char)}
 * @utbot.activatesSwitch {@code switch(c) case: '+'}
 * @utbot.returnsFrom {@code return instancev;}
 * @utbot.throwsException {@link java.lang.NoClassDefFoundError} in: return instancev;
 *  */
    @Test(expected = NoClassDefFoundError.class)
    public void testValidator_ThrowNoClassDefFoundError_1() throws Throwable  {
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Method validatorMethod = patternBuilderClazz.getDeclaredMethod("validator", charType);
        validatorMethod.setAccessible(true);
        java.lang.Object[] validatorMethodArguments = new java.lang.Object[1];
        validatorMethodArguments[0] = '+';
        try {
            validatorMethod.invoke(null, validatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SECURITY for method validator(char)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder}
     * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#validator(char)}
     */
    @Test(expected = ExceptionInInitializerError.class)
    @Ignore(value = "Disabled due to sandbox")
    public void testValidator() throws Throwable  {
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Method validatorMethod = patternBuilderClazz.getDeclaredMethod("validator", charType);
        validatorMethod.setAccessible(true);
        java.lang.Object[] validatorMethodArguments = new java.lang.Object[1];
        validatorMethodArguments[0] = '@';
        try {
            validatorMethod.invoke(null, validatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method validator(char)
    
    @Test
    public void testValidator1() throws Exception  {
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Method validatorMethod = patternBuilderClazz.getDeclaredMethod("validator", charType);
        validatorMethod.setAccessible(true);
        java.lang.Object[] validatorMethodArguments = new java.lang.Object[1];
        validatorMethodArguments[0] = '%';
        NumberValidator actual = ((NumberValidator) validatorMethod.invoke(null, validatorMethodArguments));
        
        NumberValidator expected = ((NumberValidator) createInstance("org.apache.commons.cli2.validation.NumberValidator"));
        DecimalFormat format = ((DecimalFormat) createInstance("java.text.DecimalFormat"));
        setField(expected, "org.apache.commons.cli2.validation.NumberValidator", "format", format);
        
        NumberFormat expectedFormat = expected.getFormat();
        NumberFormat actualFormat = actual.getFormat();
        // java.text.NumberFormat has overridden equals method
        assertEquals(expectedFormat, actualFormat);
        
        Number actualMinimum = actual.getMinimum();
        assertNull(actualMinimum);
        
        Number actualMaximum = actual.getMaximum();
        assertNull(actualMaximum);
        
    }
    ///endregion
    
    ///region OTHER: SECURITY for method validator(char)
    
    @Test(expected = ExceptionInInitializerError.class)
    @Ignore(value = "Disabled due to sandbox")
    public void testValidator2() throws Throwable  {
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Method validatorMethod = patternBuilderClazz.getDeclaredMethod("validator", charType);
        validatorMethod.setAccessible(true);
        java.lang.Object[] validatorMethodArguments = new java.lang.Object[1];
        validatorMethodArguments[0] = '#';
        try {
            validatorMethod.invoke(null, validatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method validator(char)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testValidator3() throws Throwable  {
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Method validatorMethod = patternBuilderClazz.getDeclaredMethod("validator", charType);
        validatorMethod.setAccessible(true);
        java.lang.Object[] validatorMethodArguments = new java.lang.Object[1];
        validatorMethodArguments[0] = '#';
        try {
            validatorMethod.invoke(null, validatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for validator
    
    public void testValidator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.cli2.builder.PatternBuilder.createOption
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createOption(char, boolean, char)
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.executesCondition {@code (type != ' '): True}
 * @utbot.invokes {@link org.apache.commons.cli2.builder.ArgumentBuilder#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: abuilder.reset();
 *  */
    @Test
    public void testCreateOption_ThrowNullPointerException() throws Throwable  {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.createOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.createOption(PatternBuilder.java:106) */
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = '!';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.executesCondition {@code (type != ' '): False}
 * @utbot.invokes {@link org.apache.commons.cli2.builder.DefaultOptionBuilder#reset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: obuilder.reset();
 *  */
    @Test
    public void testCreateOption_ThrowNullPointerException_1() throws Throwable  {
        PatternBuilder patternBuilder = new PatternBuilder(null, null, null);
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.createOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.builder.PatternBuilder.createOption(PatternBuilder.java:120) */
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = ' ';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createOption(char, boolean, char)
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: abuilder.withValidator(validator(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOption_ThrowIllegalArgumentException() throws Throwable  {
        ArgumentBuilder argumentBuilder = ((ArgumentBuilder) createInstance("org.apache.commons.cli2.builder.ArgumentBuilder"));
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "minimum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "maximum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "initialSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "subsequentSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "id", -255);
        PatternBuilder patternBuilder = new PatternBuilder(null, null, argumentBuilder);
        
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = '1';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: abuilder.withValidator(validator(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOption_ThrowIllegalArgumentException_1() throws Throwable  {
        ArgumentBuilder argumentBuilder = ((ArgumentBuilder) createInstance("org.apache.commons.cli2.builder.ArgumentBuilder"));
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "minimum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "maximum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "initialSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "subsequentSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "id", -255);
        PatternBuilder patternBuilder = new PatternBuilder(null, null, argumentBuilder);
        
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = ',';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: abuilder.withValidator(validator(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOption_ThrowIllegalArgumentException_2() throws Throwable  {
        ArgumentBuilder argumentBuilder = ((ArgumentBuilder) createInstance("org.apache.commons.cli2.builder.ArgumentBuilder"));
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "minimum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "maximum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "initialSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "subsequentSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "id", -255);
        PatternBuilder patternBuilder = new PatternBuilder(null, null, argumentBuilder);
        
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = '$';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: abuilder.withValidator(validator(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOption_ThrowIllegalArgumentException_3() throws Throwable  {
        ArgumentBuilder argumentBuilder = ((ArgumentBuilder) createInstance("org.apache.commons.cli2.builder.ArgumentBuilder"));
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "minimum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "maximum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "initialSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "subsequentSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "id", -255);
        PatternBuilder patternBuilder = new PatternBuilder(null, null, argumentBuilder);
        
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = '6';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: abuilder.withValidator(validator(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOption_ThrowIllegalArgumentException_4() throws Throwable  {
        ArgumentBuilder argumentBuilder = ((ArgumentBuilder) createInstance("org.apache.commons.cli2.builder.ArgumentBuilder"));
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "minimum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "maximum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "initialSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "subsequentSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "id", -255);
        PatternBuilder patternBuilder = new PatternBuilder(null, null, argumentBuilder);
        
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = '&';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: abuilder.withValidator(validator(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOption_ThrowIllegalArgumentException_5() throws Throwable  {
        ArgumentBuilder argumentBuilder = ((ArgumentBuilder) createInstance("org.apache.commons.cli2.builder.ArgumentBuilder"));
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "minimum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "maximum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "initialSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "subsequentSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "id", -255);
        PatternBuilder patternBuilder = new PatternBuilder(null, null, argumentBuilder);
        
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = '\'';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: abuilder.withValidator(validator(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOption_ThrowIllegalArgumentException_6() throws Throwable  {
        ArgumentBuilder argumentBuilder = ((ArgumentBuilder) createInstance("org.apache.commons.cli2.builder.ArgumentBuilder"));
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "minimum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "maximum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "initialSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "subsequentSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "id", -255);
        PatternBuilder patternBuilder = new PatternBuilder(null, null, argumentBuilder);
        
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = '8';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: abuilder.withValidator(validator(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOption_ThrowIllegalArgumentException_7() throws Throwable  {
        ArgumentBuilder argumentBuilder = ((ArgumentBuilder) createInstance("org.apache.commons.cli2.builder.ArgumentBuilder"));
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "minimum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "maximum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "initialSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "subsequentSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "id", -255);
        PatternBuilder patternBuilder = new PatternBuilder(null, null, argumentBuilder);
        
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = ')';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: abuilder.withValidator(validator(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOption_ThrowIllegalArgumentException_8() throws Throwable  {
        ArgumentBuilder argumentBuilder = ((ArgumentBuilder) createInstance("org.apache.commons.cli2.builder.ArgumentBuilder"));
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "minimum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "maximum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "initialSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "subsequentSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "id", -255);
        PatternBuilder patternBuilder = new PatternBuilder(null, null, argumentBuilder);
        
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = '3';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PatternBuilder}
 * @utbot.methodUnderTest {@link org.apache.commons.cli2.builder.PatternBuilder#createOption(char,boolean,char)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: abuilder.withValidator(validator(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateOption_ThrowIllegalArgumentException_9() throws Throwable  {
        ArgumentBuilder argumentBuilder = ((ArgumentBuilder) createInstance("org.apache.commons.cli2.builder.ArgumentBuilder"));
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "minimum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "maximum", -255);
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "initialSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "subsequentSeparator", ' ');
        setField(argumentBuilder, "org.apache.commons.cli2.builder.ArgumentBuilder", "id", -255);
        PatternBuilder patternBuilder = new PatternBuilder(null, null, argumentBuilder);
        
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = '=';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = ' ';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createOption(char, boolean, char)
    
    @Test
    public void testCreateOption1() throws Throwable  {
        DefaultOptionBuilder defaultOptionBuilder = ((DefaultOptionBuilder) createInstance("org.apache.commons.cli2.builder.DefaultOptionBuilder"));
        PatternBuilder patternBuilder = new PatternBuilder(null, defaultOptionBuilder, null);
        
        /* This test fails because method [org.apache.commons.cli2.builder.PatternBuilder.createOption] produces [java.lang.NullPointerException]
            org.apache.commons.cli2.option.DefaultOption.<init>(DefaultOption.java:96)
            org.apache.commons.cli2.builder.DefaultOptionBuilder.create(DefaultOptionBuilder.java:92)
            org.apache.commons.cli2.builder.PatternBuilder.createOption(PatternBuilder.java:125) */
        Class patternBuilderClazz = Class.forName("org.apache.commons.cli2.builder.PatternBuilder");
        Class charType = char.class;
        Class booleanType = boolean.class;
        Method createOptionMethod = patternBuilderClazz.getDeclaredMethod("createOption", charType, booleanType, charType);
        createOptionMethod.setAccessible(true);
        java.lang.Object[] createOptionMethodArguments = new java.lang.Object[3];
        createOptionMethodArguments[0] = ' ';
        createOptionMethodArguments[1] = false;
        createOptionMethodArguments[2] = '\u0000';
        try {
            createOptionMethod.invoke(patternBuilder, createOptionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for createOption
    
    public void testCreateOption_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields848968020376200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields848968020376200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass848968020384400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields848968020376200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass848968020384400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields848968021073400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields848968021073400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass848968021075100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields848968021073400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass848968021075100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields848968025445900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields848968025445900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass848968025447900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields848968025445900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass848968025447900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields848968026498100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields848968026498100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass848968026499700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields848968026498100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass848968026499700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}


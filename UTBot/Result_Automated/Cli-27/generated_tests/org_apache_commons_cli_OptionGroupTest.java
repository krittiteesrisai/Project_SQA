package org.apache.commons.cli;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Map;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
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
    
    ///region Test suites for executable org.apache.commons.cli.OptionGroup.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#toString()}
 * @utbot.invokes {@link org.apache.commons.cli.OptionGroup#getOptions()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.returnsFrom {@code return buff.toString();}
 *  */
    @Test
    public void testToString_IterHasNext() throws Exception  {
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
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Option option = (Option) iter.next();
 *  */
    @Test
    public void testToString_ThrowClassCastException() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        Integer integer = 0;
        short[][][][] shortArray = {};
        optionMap.put(integer, shortArray);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.toString] produces [java.lang.ClassCastException: class [[[[S cannot be cast to class org.apache.commons.cli.Option ([[[[S is in module java.base of loader 'bootstrap'; org.apache.commons.cli.Option is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.apache.commons.cli.OptionGroup.toString(OptionGroup.java:149) */
        optionGroup.toString();
    }
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#toString()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: option.getOpt() != null
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        Integer integer = 0;
        optionMap.put(integer, null);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        /* This test fails because method [org.apache.commons.cli.OptionGroup.toString] produces [java.lang.NullPointerException]
            org.apache.commons.cli.OptionGroup.toString(OptionGroup.java:151) */
        optionGroup.toString();
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
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        
        Set actual = ((Set) optionGroup.getNames());
        
        Set expected = new LinkedHashSet();
        
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
        
        optionGroup.setSelected(option);
    }
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#setSelected(org.apache.commons.cli.Option)}
 * @utbot.executesCondition {@code (option == null): False}
 * @utbot.executesCondition {@code (selected == null): False}
 * @utbot.executesCondition {@code (selected.equals(option.getOpt())): True}
 * @utbot.invokes {@link org.apache.commons.cli.Option#getOpt()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testSetSelected_SelectedEquals() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        String selected = "";
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "selected", selected);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        setField(option, "org.apache.commons.cli.Option", "opt", selected);
        
        optionGroup.setSelected(option);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method setSelected(org.apache.commons.cli.Option)
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#setSelected(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link org.apache.commons.cli.AlreadySelectedException} when: selected == null || selected.equals(option.getOpt())
 *  */
    @Test(expected = AlreadySelectedException.class)
    public void testSetSelected_ThrowAlreadySelectedException() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        String selected = "";
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "selected", selected);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        
        optionGroup.setSelected(option);
    }
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#setSelected(org.apache.commons.cli.Option)}
 * @utbot.throwsException {@link org.apache.commons.cli.AlreadySelectedException} when: selected == null || selected.equals(option.getOpt())
 *  */
    @Test(expected = AlreadySelectedException.class)
    public void testSetSelected_ThrowAlreadySelectedException_1() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        String selected = "\u0000\u0000";
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "selected", selected);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = " ";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
        optionGroup.setSelected(option);
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
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_Return_1() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String longOpt = "";
        option.setLongOpt(longOpt);
        
        OptionGroup actual = optionGroup.addOption(option);
        
        Map optionGroupOptionMap = ((Map) getFieldValue(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap"));
        Map actualOptionMap = ((Map) getFieldValue(actual, "org.apache.commons.cli.OptionGroup", "optionMap"));
        assertTrue(deepEquals(optionGroupOptionMap, actualOptionMap));
        
        String actualSelected = actual.getSelected();
        assertNull(actualSelected);
        
        boolean actualRequired = ((Boolean) getFieldValue(actual, "org.apache.commons.cli.OptionGroup", "required"));
        assertFalse(actualRequired);
        
    }
    
    /**
    @utbot.classUnderTest {@link OptionGroup}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.OptionGroup#addOption(org.apache.commons.cli.Option)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddOption_Return() throws Exception  {
        OptionGroup optionGroup = ((OptionGroup) createInstance("org.apache.commons.cli.OptionGroup"));
        LinkedHashMap optionMap = new LinkedHashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        optionMap.put(character, object);
        setField(optionGroup, "org.apache.commons.cli.OptionGroup", "optionMap", optionMap);
        Option option = ((Option) createInstance("org.apache.commons.cli.Option"));
        String opt = "";
        setField(option, "org.apache.commons.cli.Option", "opt", opt);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields840707284663200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields840707284663200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass840707284669500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields840707284663200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass840707284669500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields840707288369500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields840707288369500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass840707288373300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields840707288369500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass840707288373300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


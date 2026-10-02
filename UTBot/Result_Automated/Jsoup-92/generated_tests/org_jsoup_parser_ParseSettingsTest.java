package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Attributes;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_jsoup_parser_ParseSettingsTest {
    ///region Test suites for executable org.jsoup.parser.ParseSettings.normalizeAttributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeAttributes(org.jsoup.nodes.Attributes)
    
    /**
    @utbot.classUnderTest {@link ParseSettings}
 * @utbot.methodUnderTest {@link org.jsoup.parser.ParseSettings#normalizeAttributes(org.jsoup.nodes.Attributes)}
 * @utbot.executesCondition {@code (!preserveAttributeCase): False}
 * @utbot.returnsFrom {@code return attributes;}
 *  */
    @Test
    public void testNormalizeAttributes_PreserveAttributeCase() {
        ParseSettings parseSettings = new ParseSettings(false, true);
        
        Attributes actual = parseSettings.normalizeAttributes(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ParseSettings}
 * @utbot.methodUnderTest {@link org.jsoup.parser.ParseSettings#normalizeAttributes(org.jsoup.nodes.Attributes)}
 * @utbot.executesCondition {@code (!preserveAttributeCase): True}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#normalize()}
 * @utbot.returnsFrom {@code return attributes;}
 *  */
    @Test
    public void testNormalizeAttributes_NotPreserveAttributeCase() throws Exception  {
        ParseSettings parseSettings = new ParseSettings(false, false);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        Attributes actual = parseSettings.normalizeAttributes(attributes);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalizeAttributes(org.jsoup.nodes.Attributes)
    
    /**
    @utbot.classUnderTest {@link ParseSettings}
 * @utbot.methodUnderTest {@link org.jsoup.parser.ParseSettings#normalizeAttributes(org.jsoup.nodes.Attributes)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#normalize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: attributes.normalize();
 *  */
    @Test
    public void testNormalizeAttributes_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ParseSettings parseSettings = new ParseSettings(false, false);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        setField(attributes, "org.jsoup.nodes.Attributes", "keys", keys);
        
        /* This test fails because method [org.jsoup.parser.ParseSettings.normalizeAttributes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.normalize(Attributes.java:388)
            org.jsoup.parser.ParseSettings.normalizeAttributes(ParseSettings.java:71) */
        parseSettings.normalizeAttributes(attributes);
    }
    
    /**
    @utbot.classUnderTest {@link ParseSettings}
 * @utbot.methodUnderTest {@link org.jsoup.parser.ParseSettings#normalizeAttributes(org.jsoup.nodes.Attributes)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#normalize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: attributes.normalize();
 *  */
    @Test
    public void testNormalizeAttributes_ThrowNullPointerException() {
        ParseSettings parseSettings = new ParseSettings(false, false);
        
        /* This test fails because method [org.jsoup.parser.ParseSettings.normalizeAttributes] produces [java.lang.NullPointerException]
            org.jsoup.parser.ParseSettings.normalizeAttributes(ParseSettings.java:71) */
        parseSettings.normalizeAttributes(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method normalizeAttributes(org.jsoup.nodes.Attributes)
    
    @Test
    public void testNormalizeAttributes1() throws Exception  {
        ParseSettings parseSettings = new ParseSettings(false, false);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "";
        keys[0] = string;
        setField(attributes, "org.jsoup.nodes.Attributes", "keys", keys);
        
        Attributes actual = parseSettings.normalizeAttributes(attributes);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        java.lang.String[] attributesKeys = ((java.lang.String[]) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalAttributesKeys1 = ((String) get(attributesKeys, 1));
        java.lang.String[] attributesKeys1 = ((java.lang.String[]) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalAttributesKeys2 = ((String) get(attributesKeys1, 2));
        java.lang.String[] attributesKeys2 = ((java.lang.String[]) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalAttributesKeys3 = ((String) get(attributesKeys2, 3));
        java.lang.String[] attributesKeys3 = ((java.lang.String[]) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalAttributesKeys4 = ((String) get(attributesKeys3, 4));
        java.lang.String[] attributesKeys4 = ((java.lang.String[]) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalAttributesKeys5 = ((String) get(attributesKeys4, 5));
        java.lang.String[] attributesKeys5 = ((java.lang.String[]) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalAttributesKeys6 = ((String) get(attributesKeys5, 6));
        java.lang.String[] attributesKeys6 = ((java.lang.String[]) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalAttributesKeys7 = ((String) get(attributesKeys6, 7));
        java.lang.String[] attributesKeys7 = ((java.lang.String[]) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalAttributesKeys8 = ((String) get(attributesKeys7, 8));
        
        assertNull(finalAttributesKeys1);
        
        assertNull(finalAttributesKeys2);
        
        assertNull(finalAttributesKeys3);
        
        assertNull(finalAttributesKeys4);
        
        assertNull(finalAttributesKeys5);
        
        assertNull(finalAttributesKeys6);
        
        assertNull(finalAttributesKeys7);
        
        assertNull(finalAttributesKeys8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.ParseSettings.normalizeAttribute
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeAttribute(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParseSettings}
 * @utbot.methodUnderTest {@link org.jsoup.parser.ParseSettings#normalizeAttribute(java.lang.String)}
 * @utbot.executesCondition {@code (!preserveAttributeCase): False}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testNormalizeAttribute_PreserveAttributeCase() {
        ParseSettings parseSettings = new ParseSettings(false, true);
        String string = "!";
        
        String actual = parseSettings.normalizeAttribute(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalizeAttribute(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParseSettings}
 * @utbot.methodUnderTest {@link org.jsoup.parser.ParseSettings#normalizeAttribute(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name = name.trim();
 *  */
    @Test
    public void testNormalizeAttribute_ThrowNullPointerException() {
        ParseSettings parseSettings = new ParseSettings(false, false);
        
        /* This test fails because method [org.jsoup.parser.ParseSettings.normalizeAttribute] produces [java.lang.NullPointerException]
            org.jsoup.parser.ParseSettings.normalizeAttribute(ParseSettings.java:63) */
        parseSettings.normalizeAttribute(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method normalizeAttribute(java.lang.String)
    
    @Test
    public void testNormalizeAttribute1() {
        ParseSettings parseSettings = new ParseSettings(false, false);
        String string = "\u0001";
        
        String actual = parseSettings.normalizeAttribute(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.ParseSettings.preserveTagCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method preserveTagCase()
    
    /**
    @utbot.classUnderTest {@link ParseSettings}
 * @utbot.methodUnderTest {@link org.jsoup.parser.ParseSettings#preserveTagCase()}
 * @utbot.returnsFrom {@code return preserveTagCase;}
 *  */
    @Test
    public void testPreserveTagCase_ReturnPreserveTagCase() {
        ParseSettings parseSettings = new ParseSettings(false, false);
        
        boolean actual = parseSettings.preserveTagCase();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.ParseSettings.normalizeTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParseSettings}
 * @utbot.methodUnderTest {@link org.jsoup.parser.ParseSettings#normalizeTag(java.lang.String)}
 * @utbot.executesCondition {@code (!preserveTagCase): False}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testNormalizeTag_PreserveTagCase() {
        ParseSettings parseSettings = new ParseSettings(true, false);
        String string = "!";
        
        String actual = parseSettings.normalizeTag(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalizeTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ParseSettings}
 * @utbot.methodUnderTest {@link org.jsoup.parser.ParseSettings#normalizeTag(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name = name.trim();
 *  */
    @Test
    public void testNormalizeTag_ThrowNullPointerException() {
        ParseSettings parseSettings = new ParseSettings(false, false);
        
        /* This test fails because method [org.jsoup.parser.ParseSettings.normalizeTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.ParseSettings.normalizeTag(ParseSettings.java:53) */
        parseSettings.normalizeTag(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method normalizeTag(java.lang.String)
    
    @Test
    public void testNormalizeTag1() {
        ParseSettings parseSettings = new ParseSettings(false, false);
        String string = "\u0001";
        
        String actual = parseSettings.normalizeTag(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1009834151645000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1009834151645000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1009834151652800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009834151645000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009834151652800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1009834152110100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009834152110100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009834152113800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009834152110100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009834152113800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.type.MapLikeType;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_jsontype_impl_SubTypeValidatorTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator.instance
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method instance()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator#instance()}
     */
    @Test
    public void testInstance() {
        SubTypeValidator actual = SubTypeValidator.instance();
        
        SubTypeValidator expected = new SubTypeValidator();
        Set _cfgIllegalClassNames = new LinkedHashSet();
        String string = "org.codehaus.groovy.runtime.MethodClosure";
        _cfgIllegalClassNames.add(string);
        String string1 = "org.springframework.beans.factory.config.PropertyPathFactoryBean";
        _cfgIllegalClassNames.add(string1);
        String string2 = "com.sun.org.apache.bcel.internal.util.ClassLoader";
        _cfgIllegalClassNames.add(string2);
        String string3 = "org.apache.tomcat.dbcp.dbcp2.BasicDataSource";
        _cfgIllegalClassNames.add(string3);
        String string4 = "org.apache.commons.collections4.functors.InvokerTransformer";
        _cfgIllegalClassNames.add(string4);
        String string5 = "org.apache.commons.collections.functors.InvokerTransformer";
        _cfgIllegalClassNames.add(string5);
        String string6 = "org.apache.xalan.xsltc.trax.TemplatesImpl";
        _cfgIllegalClassNames.add(string6);
        String string7 = "org.codehaus.groovy.runtime.ConvertedClosure";
        _cfgIllegalClassNames.add(string7);
        String string8 = "org.springframework.beans.factory.ObjectFactory";
        _cfgIllegalClassNames.add(string8);
        String string9 = "com.sun.rowset.JdbcRowSetImpl";
        _cfgIllegalClassNames.add(string9);
        String string10 = "java.util.logging.FileHandler";
        _cfgIllegalClassNames.add(string10);
        String string11 = "org.apache.commons.collections.functors.InstantiateTransformer";
        _cfgIllegalClassNames.add(string11);
        String string12 = "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl";
        _cfgIllegalClassNames.add(string12);
        String string13 = "java.rmi.server.UnicastRemoteObject";
        _cfgIllegalClassNames.add(string13);
        String string14 = "org.apache.commons.collections4.functors.InstantiateTransformer";
        _cfgIllegalClassNames.add(string14);
        expected._cfgIllegalClassNames = _cfgIllegalClassNames;
        
        Set expected_cfgIllegalClassNames = expected._cfgIllegalClassNames;
        Set actual_cfgIllegalClassNames = actual._cfgIllegalClassNames;
        assertTrue(deepEquals(expected_cfgIllegalClassNames, actual_cfgIllegalClassNames));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator.validateSubType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method validateSubType(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link SubTypeValidator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator#validateSubType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Class<?> raw = type.getRawClass();
 *  */
    @Test
    public void testValidateSubType_ThrowNullPointerException() throws JsonMappingException  {
        SubTypeValidator subTypeValidator = new SubTypeValidator();
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator.validateSubType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator.validateSubType(SubTypeValidator.java:75) */
        subTypeValidator.validateSubType(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SubTypeValidator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator#validateSubType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String full = raw.getName();
 *  */
    @Test
    public void testValidateSubType_ThrowNullPointerException_1() throws Exception  {
        SubTypeValidator subTypeValidator = new SubTypeValidator();
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator.validateSubType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator.validateSubType(SubTypeValidator.java:76) */
        subTypeValidator.validateSubType(null, referenceType);
    }
    
    /**
    @utbot.classUnderTest {@link SubTypeValidator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator#validateSubType(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _cfgIllegalClassNames.contains(full)
 *  */
    @Test
    public void testValidateSubType_ThrowNullPointerException_2() throws Exception  {
        SubTypeValidator subTypeValidator = new SubTypeValidator();
        subTypeValidator._cfgIllegalClassNames = null;
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator.validateSubType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator.validateSubType(SubTypeValidator.java:80) */
        subTypeValidator.validateSubType(null, referenceType);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method validateSubType(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testValidateSubType1() throws Exception  {
        SubTypeValidator subTypeValidator = new SubTypeValidator();
        LinkedHashSet _cfgIllegalClassNames = new LinkedHashSet();
        subTypeValidator._cfgIllegalClassNames = _cfgIllegalClassNames;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        subTypeValidator.validateSubType(impl, mapLikeType);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1087510264248500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1087510264248500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1087510264255699 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1087510264248500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1087510264255699).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1087510264584500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1087510264584500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1087510264588200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1087510264584500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1087510264588200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_deser_std_AtomicReferenceDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.getNullValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNullValue(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link AtomicReferenceDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer#getNullValue(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return new AtomicReference<Object>();}
 *  */
    @Test
    public void testGetNullValue_Return() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        
        AtomicReference actual = atomicReferenceDeserializer.getNullValue(((DeserializationContext) null));
        
        AtomicReference expected = new AtomicReference();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.withResolved
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withResolved(com.fasterxml.jackson.databind.jsontype.TypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link AtomicReferenceDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer#withResolved(com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new AtomicReferenceDeserializer(_fullType, _valueInstantiator, typeDeser, valueDeser);}
 *  */
    @Test
    public void testWithResolved_Return() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        
        AtomicReferenceDeserializer actual = atomicReferenceDeserializer.withResolved(((TypeDeserializer) null), ((JsonDeserializer) null));
        
        AtomicReferenceDeserializer expected = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Class _valueClass = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        
        JavaType actual_fullType = actual._fullType;
        assertNull(actual_fullType);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        Class expected_valueClass = expected._valueClass;
        Class actual_valueClass = actual._valueClass;
        assertEquals(Class.class, actual_valueClass.getClass());
        
    }
    
    /**
    @utbot.classUnderTest {@link AtomicReferenceDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer#withResolved(com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return new AtomicReferenceDeserializer(_fullType, _valueInstantiator, typeDeser, valueDeser);}
 *  */
    @Test
    public void testWithResolved_Return_1() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        SimpleType _fullType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(atomicReferenceDeserializer, "com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer", "_fullType", _fullType);
        
        AtomicReferenceDeserializer actual = atomicReferenceDeserializer.withResolved(((TypeDeserializer) null), ((JsonDeserializer) null));
        
        AtomicReferenceDeserializer expected = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer", "_fullType", _fullType);
        
        JavaType expected_fullType = expected._fullType;
        JavaType actual_fullType = actual._fullType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_fullType, actual_fullType);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.supportsUpdate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method supportsUpdate(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link AtomicReferenceDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer#supportsUpdate(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.returnsFrom {@code return Boolean.TRUE;}
 *  */
    @Test
    public void testSupportsUpdate_ReturnBooleanTRUE() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        
        Boolean actual = atomicReferenceDeserializer.supportsUpdate(null);
        
        Boolean expected = true;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.getEmptyValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEmptyValue(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link AtomicReferenceDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer#getEmptyValue(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return new AtomicReference<Object>();}
 *  */
    @Test
    public void testGetEmptyValue_Return() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        
        AtomicReference actual = ((AtomicReference) atomicReferenceDeserializer.getEmptyValue(null));
        
        AtomicReference expected = new AtomicReference();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.updateReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateReference(java.util.concurrent.atomic.AtomicReference, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link AtomicReferenceDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer#updateReference(java.util.concurrent.atomic.AtomicReference,java.lang.Object)}
 * @utbot.invokes {@link java.util.concurrent.atomic.AtomicReference#set(java.lang.Object)}
 * @utbot.returnsFrom {@code return reference;}
 *  */
    @Test
    public void testUpdateReference_AtomicReferenceSet() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        AtomicReference atomicReference = new AtomicReference(null);
        
        AtomicReference actual = atomicReferenceDeserializer.updateReference(atomicReference, ((Object) null));
        
        Object actualValue = getFieldValue(actual, "java.util.concurrent.atomic.AtomicReference", "value");
        assertNull(actualValue);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateReference(java.util.concurrent.atomic.AtomicReference, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link AtomicReferenceDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer#updateReference(java.util.concurrent.atomic.AtomicReference,java.lang.Object)}
 * @utbot.invokes {@link java.util.concurrent.atomic.AtomicReference#set(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reference.set(contents);
 *  */
    @Test
    public void testUpdateReference_ThrowNullPointerException() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.updateReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.updateReference(AtomicReferenceDeserializer.java:63) */
        atomicReferenceDeserializer.updateReference(((AtomicReference) null), ((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.referenceValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method referenceValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link AtomicReferenceDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer#referenceValue(java.lang.Object)}
 * @utbot.returnsFrom {@code return new AtomicReference<Object>(contents);}
 *  */
    @Test
    public void testReferenceValue_Return() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        
        AtomicReference actual = atomicReferenceDeserializer.referenceValue(((Object) null));
        
        AtomicReference expected = new AtomicReference();
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.getReferenced
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferenced(java.util.concurrent.atomic.AtomicReference)
    
    /**
    @utbot.classUnderTest {@link AtomicReferenceDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer#getReferenced(java.util.concurrent.atomic.AtomicReference)}
 * @utbot.invokes {@link java.util.concurrent.atomic.AtomicReference#get()}
 * @utbot.returnsFrom {@code return reference.get();}
 *  */
    @Test
    public void testGetReferenced_AtomicReferenceGet() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        AtomicReference atomicReference = new AtomicReference(null);
        
        Object actual = atomicReferenceDeserializer.getReferenced(atomicReference);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReferenced(java.util.concurrent.atomic.AtomicReference)
    
    /**
    @utbot.classUnderTest {@link AtomicReferenceDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer#getReferenced(java.util.concurrent.atomic.AtomicReference)}
 * @utbot.invokes {@link java.util.concurrent.atomic.AtomicReference#get()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return reference.get();
 *  */
    @Test
    public void testGetReferenced_ThrowNullPointerException() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.getReferenced] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer.getReferenced(AtomicReferenceDeserializer.java:58) */
        atomicReferenceDeserializer.getReferenced(((AtomicReference) null));
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1095726133552900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1095726133552900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1095726133559000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095726133552900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095726133559000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1095726134460100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1095726134460100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1095726134464300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1095726134460100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1095726134464300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


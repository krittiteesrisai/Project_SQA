package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import com.fasterxml.jackson.databind.PropertyName;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_introspect_ObjectIdInfoTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.ObjectIdInfo.getScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getScope()
    
    /**
    @utbot.classUnderTest {@link ObjectIdInfo}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#getScope()}
 * @utbot.returnsFrom {@code return _scope;}
 *  */
    @Test
    public void testGetScope_Return_scope() throws Exception  {
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        
        Class actual = objectIdInfo.getScope();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.ObjectIdInfo.getPropertyName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyName()
    
    /**
    @utbot.classUnderTest {@link ObjectIdInfo}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#getPropertyName()}
 * @utbot.returnsFrom {@code return _propertyName;}
 *  */
    @Test
    public void testGetPropertyName_Return_propertyName() throws Exception  {
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        
        PropertyName actual = objectIdInfo.getPropertyName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.ObjectIdInfo.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        PropertyName _propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(_propertyName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _simpleName);
        setField(objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_propertyName", _propertyName);
        
        String actual = objectIdInfo.toString();
        
        String expected = "ObjectIdInfo: propName={}, scope=null, generatorType=null, alwaysAsId=false";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        PropertyName _propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "";
        setField(_propertyName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_propertyName", _propertyName);
        Class _scope = Object.class;
        setField(objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_scope", _scope);
        
        Class initialObjectIdInfo_scope = objectIdInfo._scope;
        
        String actual = objectIdInfo.toString();
        
        String expected = "ObjectIdInfo: propName={}null, scope=java.lang.Object, generatorType=null, alwaysAsId=false";
        
        assertEquals(expected, actual);
        
        Class finalObjectIdInfo_scope = objectIdInfo._scope;
        
        assertFalse(initialObjectIdInfo_scope == finalObjectIdInfo_scope);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.ObjectIdInfo.getResolverType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getResolverType()
    
    /**
    @utbot.classUnderTest {@link ObjectIdInfo}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#getResolverType()}
 * @utbot.returnsFrom {@code return _resolver;}
 *  */
    @Test
    public void testGetResolverType_Return_resolver() throws Exception  {
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        
        Class actual = objectIdInfo.getResolverType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.ObjectIdInfo.withAlwaysAsId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withAlwaysAsId(boolean)
    
    /**
    @utbot.classUnderTest {@link ObjectIdInfo}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#withAlwaysAsId(boolean)}
 * @utbot.executesCondition {@code (_alwaysAsId == state): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithAlwaysAsId__alwaysAsIdEqualsState() throws Exception  {
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        
        ObjectIdInfo actual = objectIdInfo.withAlwaysAsId(false);
        
        PropertyName actual_propertyName = actual._propertyName;
        assertNull(actual_propertyName);
        
        Class actual_generator = actual._generator;
        assertNull(actual_generator);
        
        Class actual_resolver = actual._resolver;
        assertNull(actual_resolver);
        
        Class actual_scope = actual._scope;
        assertNull(actual_scope);
        
        boolean actual_alwaysAsId = actual._alwaysAsId;
        assertFalse(actual_alwaysAsId);
        
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdInfo}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#withAlwaysAsId(boolean)}
 * @utbot.executesCondition {@code (_alwaysAsId == state): False}
 * @utbot.returnsFrom {@code return new ObjectIdInfo(_propertyName, _scope, _generator, state, _resolver);}
 *  */
    @Test
    public void testWithAlwaysAsId__alwaysAsIdNotEqualsState_1() throws Exception  {
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class _resolver = Object.class;
        setField(objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_resolver", _resolver);
        setField(objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_alwaysAsId", true);
        
        Class initialObjectIdInfo_resolver = objectIdInfo._resolver;
        
        ObjectIdInfo actual = objectIdInfo.withAlwaysAsId(false);
        
        ObjectIdInfo expected = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        setField(expected, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_resolver", _resolver);
        
        PropertyName actual_propertyName = actual._propertyName;
        assertNull(actual_propertyName);
        
        Class actual_generator = actual._generator;
        assertNull(actual_generator);
        
        Class expected_resolver = expected._resolver;
        Class actual_resolver = actual._resolver;
        assertEquals(Class.class, actual_resolver.getClass());
        
        Class actual_scope = actual._scope;
        assertNull(actual_scope);
        
        boolean actual_alwaysAsId = actual._alwaysAsId;
        assertFalse(actual_alwaysAsId);
        
        Class finalObjectIdInfo_resolver = objectIdInfo._resolver;
        
        assertFalse(initialObjectIdInfo_resolver == finalObjectIdInfo_resolver);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectIdInfo}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#withAlwaysAsId(boolean)}
 * @utbot.executesCondition {@code (_alwaysAsId == state): False}
 * @utbot.returnsFrom {@code return new ObjectIdInfo(_propertyName, _scope, _generator, state, _resolver);}
 *  */
    @Test
    public void testWithAlwaysAsId__alwaysAsIdNotEqualsState() throws Exception  {
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        setField(objectIdInfo, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_alwaysAsId", true);
        
        ObjectIdInfo actual = objectIdInfo.withAlwaysAsId(false);
        
        ObjectIdInfo expected = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class _resolver = com.fasterxml.jackson.annotation.SimpleObjectIdResolver.class;
        setField(expected, "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "_resolver", _resolver);
        
        PropertyName actual_propertyName = actual._propertyName;
        assertNull(actual_propertyName);
        
        Class actual_generator = actual._generator;
        assertNull(actual_generator);
        
        Class expected_resolver = expected._resolver;
        Class actual_resolver = actual._resolver;
        assertEquals(Class.class, actual_resolver.getClass());
        
        Class actual_scope = actual._scope;
        assertNull(actual_scope);
        
        boolean actual_alwaysAsId = actual._alwaysAsId;
        assertFalse(actual_alwaysAsId);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.ObjectIdInfo.getGeneratorType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGeneratorType()
    
    /**
    @utbot.classUnderTest {@link ObjectIdInfo}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#getGeneratorType()}
 * @utbot.returnsFrom {@code return _generator;}
 *  */
    @Test
    public void testGetGeneratorType_Return_generator() throws Exception  {
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        
        Class actual = objectIdInfo.getGeneratorType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.ObjectIdInfo.getAlwaysAsId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAlwaysAsId()
    
    /**
    @utbot.classUnderTest {@link ObjectIdInfo}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.ObjectIdInfo#getAlwaysAsId()}
 * @utbot.returnsFrom {@code return _alwaysAsId;}
 *  */
    @Test
    public void testGetAlwaysAsId_Return_alwaysAsId() throws Exception  {
        ObjectIdInfo objectIdInfo = ((ObjectIdInfo) createInstance("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        
        boolean actual = objectIdInfo.getAlwaysAsId();
        
        assertFalse(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1083752670133299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1083752670133299.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1083752670152799 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1083752670133299.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1083752670152799).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


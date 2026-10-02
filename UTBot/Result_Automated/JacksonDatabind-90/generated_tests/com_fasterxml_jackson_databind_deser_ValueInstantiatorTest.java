package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.ValueInstantiator.Base;
import java.io.IOException;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import java.util.BitSet;
import com.fasterxml.jackson.databind.InjectableValues.Std;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_deser_ValueInstantiatorTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingArrayDelegate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createUsingArrayDelegate(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingArrayDelegate(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(getValueClass(), ctxt.getParser(), "no array delegate creator specified");
 *  */
    @Test
    public void testCreateUsingArrayDelegate_ThrowNullPointerException() throws IOException  {
        Class class1 = Object.class;
        ValueInstantiator.Base base = new ValueInstantiator.Base(class1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingArrayDelegate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingArrayDelegate(ValueInstantiator.java:246) */
        base.createUsingArrayDelegate(null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createUsingArrayDelegate(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = JsonMappingException.class)
    public void testCreateUsingArrayDelegate1() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        
        jsonLocationInstantiator.createUsingArrayDelegate(impl, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.canCreateFromDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromDouble()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromDouble()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanCreateFromDouble_ReturnFalse() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        boolean actual = base.canCreateFromDouble();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.canCreateUsingDefault
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateUsingDefault()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateUsingDefault()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getDefaultCreator()}
 * @utbot.returnsFrom {@code return getDefaultCreator() != null;}
 *  */
    @Test
    public void testCanCreateUsingDefault_ValueInstantiatorGetDefaultCreator() {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        
        boolean actual = jsonLocationInstantiator.canCreateUsingDefault();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#_createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromBoolean()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_createFromStringFallbacks_DeserializationContextIsEnabled() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        String string = "";
        
        Object actual = stdValueInstantiator._createFromStringFallbacks(impl, string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#_createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String str = value.trim();
 *  */
    @Test
    public void test_createFromStringFallbacks_ThrowNullPointerException() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _fromBooleanCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:357) */
        stdValueInstantiator._createFromStringFallbacks(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#_createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: value.length() == 0
 *  */
    @Test
    public void test_createFromStringFallbacks_ThrowNullPointerException_4() throws IOException  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:366) */
        jsonLocationInstantiator._createFromStringFallbacks(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#_createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: value.length() == 0
 *  */
    @Test
    public void test_createFromStringFallbacks_ThrowNullPointerException_1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:366) */
        stdValueInstantiator._createFromStringFallbacks(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#_createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
 *  */
    @Test
    public void test_createFromStringFallbacks_ThrowNullPointerException_2() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:367) */
        stdValueInstantiator._createFromStringFallbacks(null, string);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#_createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getParser()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(getValueClass(), ctxt.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", value);
 *  */
    @Test
    public void test_createFromStringFallbacks_ThrowNullPointerException_3() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:371) */
        stdValueInstantiator._createFromStringFallbacks(null, string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_createFromStringFallbacks1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _fromBooleanCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        String string = "\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:371) */
        stdValueInstantiator._createFromStringFallbacks(null, string);
    }
    
    @Test
    public void test_createFromStringFallbacks2() throws IOException  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:371) */
        jsonLocationInstantiator._createFromStringFallbacks(null, string);
    }
    
    @Test
    public void test_createFromStringFallbacks3() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:996)
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:371) */
        base._createFromStringFallbacks(impl, string);
    }
    
    @Test
    public void test_createFromStringFallbacks4() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:996)
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:371) */
        stdValueInstantiator._createFromStringFallbacks(impl, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.canCreateFromString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromString()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromString()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanCreateFromString_ReturnFalse() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        boolean actual = base.canCreateFromString();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.canCreateUsingArrayDelegate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateUsingArrayDelegate()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateUsingArrayDelegate()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanCreateUsingArrayDelegate_ReturnFalse() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        boolean actual = base.canCreateUsingArrayDelegate();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.getFromObjectArguments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFromObjectArguments(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getFromObjectArguments(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFromObjectArguments_ReturnNull() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual = base.getFromObjectArguments(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingDelegate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createUsingDelegate(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDelegate(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(getValueClass(), ctxt.getParser(), "no delegate creator specified");
 *  */
    @Test
    public void testCreateUsingDelegate_ThrowNullPointerException() throws IOException  {
        Class class1 = Object.class;
        ValueInstantiator.Base base = new ValueInstantiator.Base(class1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingDelegate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingDelegate(ValueInstantiator.java:237) */
        base.createUsingDelegate(null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createUsingDelegate(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = JsonMappingException.class)
    public void testCreateUsingDelegate1() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        Object object = new Object();
        
        jsonLocationInstantiator.createUsingDelegate(impl, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.getArrayDelegateType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArrayDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getArrayDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetArrayDelegateType_ReturnNull() {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        
        JavaType actual = jsonLocationInstantiator.getArrayDelegateType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.getArrayDelegateCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArrayDelegateCreator()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getArrayDelegateCreator()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetArrayDelegateCreator_ReturnNull() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        AnnotatedWithParams actual = base.getArrayDelegateCreator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.getIncompleteParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIncompleteParameter()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getIncompleteParameter()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetIncompleteParameter_ReturnNull() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        AnnotatedParameter actual = base.getIncompleteParameter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:165)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:172)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -254);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:159)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowClassCastException() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[1] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Number (java.lang.Object and java.lang.Number are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator._long(JsonLocationInstantiator.java:53)
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[2];
        Integer integer = 0;
        _creatorParameters[1] = ((Object) integer);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[3];
        Integer integer = 0;
        _creatorParameters[2] = ((Object) integer);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[4];
        Integer integer = 0;
        _creatorParameters[3] = ((Object) integer);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:49)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowClassCastException_1() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[13];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[4] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Number (java.lang.Object and java.lang.Number are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator._int(JsonLocationInstantiator.java:57)
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:49)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-9223372034707308545L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:172)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.BitSet.nextClearBit(BitSet.java:755)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:164)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, null, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-1L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 2);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.util.BitSet.nextClearBit(BitSet.java:762)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:164)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, null, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, null, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowClassCastException_2() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[3] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Number (java.lang.Object and java.lang.Number are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator._int(JsonLocationInstantiator.java:57)
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:49)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, null, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[4];
        Long long1 = 0L;
        _creatorParameters[3] = ((Object) long1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:49)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, null, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, null, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowNullPointerException() throws IOException  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateFromObjectWith_ThrowIllegalArgumentException() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        short[] _injectableValueId = {};
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return createFromObjectWith(ctxt, buffer.getParameters(props));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCreateFromObjectWith_ThrowIllegalStateException() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        int[] _injectableValueId = {};
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -254);
        
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)
    
    @Test
    public void testCreateFromObjectWith1() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[9];
        Integer integer = 0;
        _creatorParameters[2] = ((Object) integer);
        Short short1 = (short) 0;
        _creatorParameters[3] = ((Object) short1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        JsonLocation actual = ((JsonLocation) jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer));
        
        JsonLocation expected = new JsonLocation(null, 0L, 0L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCreateFromObjectWith2() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[11];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[0] = object;
        Integer integer = 0;
        _creatorParameters[1] = ((Object) integer);
        Short short1 = (short) 0;
        _creatorParameters[2] = ((Object) short1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        JsonLocation actual = ((JsonLocation) jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer));
        
        Object object1 = new Object();
        JsonLocation expected = new JsonLocation(object1, 0L, 0L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
        
        SettableBeanProperty finalSettableBeanPropertyArray0 = settableBeanPropertyArray[0];
        
        assertNull(finalSettableBeanPropertyArray0);
    }
    
    @Test
    public void testCreateFromObjectWith3() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[13];
        Long long1 = 0L;
        _creatorParameters[3] = ((Object) long1);
        Short short1 = (short) 0;
        _creatorParameters[4] = ((Object) short1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        JsonLocation actual = ((JsonLocation) jsonLocationInstantiator.createFromObjectWith(null, null, propertyValueBuffer));
        
        JsonLocation expected = new JsonLocation(null, 0L, 0L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCreateFromObjectWith4() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[11];
        Short short1 = (short) 0;
        _creatorParameters[2] = ((Object) short1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        JsonLocation actual = ((JsonLocation) jsonLocationInstantiator.createFromObjectWith(null, null, propertyValueBuffer));
        
        JsonLocation expected = new JsonLocation(null, 0L, 0L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCreateFromObjectWith5() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[11];
        Integer integer = 0;
        _creatorParameters[1] = ((Object) integer);
        Short short1 = (short) 0;
        _creatorParameters[2] = ((Object) short1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        JsonLocation actual = ((JsonLocation) jsonLocationInstantiator.createFromObjectWith(null, null, propertyValueBuffer));
        
        JsonLocation expected = new JsonLocation(null, 0L, 0L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCreateFromObjectWith6() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[7];
        Short short1 = (short) 0;
        _creatorParameters[1] = ((Object) short1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {2147467263L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        JsonLocation actual = ((JsonLocation) jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer));
        
        JsonLocation expected = new JsonLocation(null, 0L, 0L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)
    
    @Test
    public void testCreateFromObjectWith7() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, null, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith8() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[2];
        Short short1 = (short) 0;
        _creatorParameters[1] = ((Object) short1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, null, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith9() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null, null, null, null, null, null, null, null};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:172)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith10() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[1];
        DeserializationFeature deserializationFeature = DeserializationFeature.EAGER_DESERIALIZER_FETCH;
        _creatorParameters[0] = ((Object) deserializationFeature);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith11() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
            PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
            DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
            java.lang.Object[] _creatorParameters = {null};
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -254);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
            jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    @Test
    public void testCreateFromObjectWith12() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -256);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:424)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:174)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith13() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _withArgsCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator", _withArgsCreator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[0] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor.getDeclaringClass(CreatorCollector.java:472)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith(StdValueInstantiator.java:277)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith14() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdReferenceProperty _delegate = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:424)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:174)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith15() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdReferenceProperty _delegate = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdReferenceProperty _forward = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-9223372034707308545L, 1L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:424)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:174)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith16() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        InnerClassProperty _forward = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) objectIdReferenceProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-129L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:424)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:174)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith17() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[30];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[14] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[15];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-9223372034707308545L, -255L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:424)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:197)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:165)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith18() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdReferenceProperty _delegate1 = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:193)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:159)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith19() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[8];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) creatorProperty);
        settableBeanPropertyArray[2] = ((SettableBeanProperty) creatorProperty);
        settableBeanPropertyArray[3] = ((SettableBeanProperty) creatorProperty);
        settableBeanPropertyArray[4] = ((SettableBeanProperty) creatorProperty);
        settableBeanPropertyArray[5] = ((SettableBeanProperty) creatorProperty);
        settableBeanPropertyArray[6] = ((SettableBeanProperty) creatorProperty);
        settableBeanPropertyArray[7] = ((SettableBeanProperty) creatorProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", 1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:192)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:159)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith20() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[33];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[32] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[33];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {9223372032559808511L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:424)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:193)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:165)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith21() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _withArgsCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator", _withArgsCreator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[6];
        DeserializationFeature deserializationFeature = DeserializationFeature.EAGER_DESERIALIZER_FETCH;
        _creatorParameters[0] = ((Object) deserializationFeature);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-129L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor.getDeclaringClass(CreatorCollector.java:472)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith(StdValueInstantiator.java:277)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith22() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdReferenceProperty _delegate2 = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        setField(_delegate1, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate2);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-129L, -255L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:174)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith23() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdReferenceProperty _delegate = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdReferenceProperty _forward = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ManagedReferenceProperty _forward1 = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -256);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[0] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:424)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty.getCreatorIndex(ObjectIdReferenceProperty.java:73)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:174)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        base.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith24() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = {null, null};
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[0] = object;
        _creatorParameters[1] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:203)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        base.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith25() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:424)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:197)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:159)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        base.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith26() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[30];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ManagedReferenceProperty _delegate = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[14] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[15];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-9223372034707308545L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:330)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getCreatorIndex(SettableBeanProperty.java:424)
            com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.getCreatorIndex(InnerClassProperty.java:97)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:197)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:165)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        base.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith27() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:203)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
        base.createFromObjectWith(null, null, propertyValueBuffer);
    }
    
    @Test
    public void testCreateFromObjectWith28() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            NumberDeserializers.ShortDeserializer _deserializer = ((NumberDeserializers.ShortDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
            PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
            DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
            java.lang.Object[] _creatorParameters = {null};
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -254);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:203)
                com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith(StdValueInstantiator.java:272)
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
            stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    @Test
    public void testCreateFromObjectWith29() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            NumberDeserializers.ByteDeserializer _valueDeserializer = ((NumberDeserializers.ByteDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
            PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
            DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
            java.lang.Object[] _creatorParameters = {null};
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -254);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:203)
                com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith(StdValueInstantiator.java:272)
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
            stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    @Test
    public void testCreateFromObjectWith30() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            Object _deserializer = createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$IntDeser");
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
            PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
            DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
            java.lang.Object[] _creatorParameters = {null};
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -254);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:203)
                com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith(StdValueInstantiator.java:272)
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
            stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    @Test
    public void testCreateFromObjectWith31() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
            AtomicReferenceDeserializer _deserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
            PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
            DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
            java.lang.Object[] _creatorParameters = {null};
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -254);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:203)
                com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith(StdValueInstantiator.java:272)
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
            stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    @Test
    public void testCreateFromObjectWith32() throws Exception  {
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = SettableBeanProperty.MISSING_VALUE_DESERIALIZER;
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
            com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
            CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
            AtomicReferenceDeserializer _valueDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
            settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
            PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
            DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
            java.lang.Object[] _creatorParameters = {null};
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
            setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -254);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:203)
                com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229) */
            base.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)
    
    @Test(expected = IllegalStateException.class)
    public void testCreateFromObjectWith33() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) objectIdValueProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[20];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 2);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", 1);
        
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCreateFromObjectWith34() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[15];
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[14] = ((SettableBeanProperty) objectIdValueProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[15];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 2);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            -9223372035244081153L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 64);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCreateFromObjectWith35() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) objectIdValueProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[0] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        base.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCreateFromObjectWith36() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[15];
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[14] = ((SettableBeanProperty) objectIdValueProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = new java.lang.Object[15];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            -9223372035694379009L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCreateFromObjectWith37() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[19];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        short[] _injectableValueId = {};
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        settableBeanPropertyArray[18] = ((SettableBeanProperty) creatorProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[19];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {262143L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCreateFromObjectWith38() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(objectIdValueProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) objectIdValueProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[2];
        DeserializationFeature deserializationFeature = DeserializationFeature.EAGER_DESERIALIZER_FETCH;
        _creatorParameters[0] = ((Object) deserializationFeature);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-129L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        base.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith39() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", -2147483644);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith40() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -256);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[2];
        _creatorParameters[0] = ((Object) _propName);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith41() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdReferenceProperty _delegate = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdReferenceProperty _forward = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        CreatorProperty _forward1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -256);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[0] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith42() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith43() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[8];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) creatorProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[24];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 16384);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 2);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith44() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -255);
        
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith45() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) creatorProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", 1);
        
        stdValueInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith46() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdReferenceProperty _delegate = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        ObjectIdReferenceProperty _forward = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        CreatorProperty _forward1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward1);
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-9223372034707308545L, 1L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith47() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        InnerClassProperty _forward = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(_forward, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        settableBeanPropertyArray[0] = ((SettableBeanProperty) objectIdReferenceProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-129L, -255L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith48() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        ObjectIdReferenceProperty _delegate = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        CreatorProperty _forward = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_forward", _forward);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -255);
        
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith49() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[33];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        InnerClassProperty _delegate = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate1 = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(_delegate, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate1);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[32] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[33];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {9223372032559808511L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith50() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[15];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[14] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[15];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-9223372034707308545L, -255L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        
        jsonLocationInstantiator.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith51() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] settableBeanPropertyArray = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        InnerClassProperty innerClassProperty = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        CreatorProperty _delegate = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.impl.InnerClassProperty", "_delegate", _delegate);
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(innerClassProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(innerClassProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        settableBeanPropertyArray[1] = ((SettableBeanProperty) innerClassProperty);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsNeeded", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeen", -255);
        
        base.createFromObjectWith(null, settableBeanPropertyArray, propertyValueBuffer);
    }
    ///endregion
    
    ///region Errors report for createFromObjectWith
    
    public void testCreateFromObjectWith_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 23 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, [Ljava.lang.Object;)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(getValueClass(), ctxt.getParser(), "no creator with arguments specified");
 *  */
    @Test
    public void testCreateFromObjectWith_ThrowNullPointerException1() throws IOException  {
        Class class1 = Object.class;
        ValueInstantiator.Base base = new ValueInstantiator.Base(class1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:203) */
        base.createFromObjectWith(null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, [Ljava.lang.Object;)
    
    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith52() throws Exception  {
        Class class1 = Object.class;
        ValueInstantiator.Base base = new ValueInstantiator.Base(class1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        base.createFromObjectWith(impl, objectArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.canCreateFromObjectWith
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromObjectWith()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromObjectWith()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanCreateFromObjectWith_ReturnFalse() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        boolean actual = base.canCreateFromObjectWith();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.canCreateUsingDelegate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateUsingDelegate()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateUsingDelegate()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanCreateUsingDelegate_ReturnFalse() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        boolean actual = base.canCreateUsingDelegate();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.canCreateFromBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromBoolean()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromBoolean()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanCreateFromBoolean_ReturnFalse() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        boolean actual = base.canCreateFromBoolean();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.getDefaultCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultCreator()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getDefaultCreator()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetDefaultCreator_ReturnNull() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        AnnotatedWithParams actual = base.getDefaultCreator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createFromString(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromString(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#_createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return _createFromStringFallbacks(ctxt, value);}
 *  */
    @Test
    public void testCreateFromString_ValueInstantiator_createFromStringFallbacks() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        String string = "";
        
        Object actual = jsonLocationInstantiator.createFromString(impl, string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createFromString(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void testCreateFromString1() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:996)
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:371)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromString(ValueInstantiator.java:258) */
        base.createFromString(impl, string);
    }
    
    @Test
    public void testCreateFromString2() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:996)
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:371)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromString(ValueInstantiator.java:258) */
        base.createFromString(impl, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.getWithArgsCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWithArgsCreator()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getWithArgsCreator()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetWithArgsCreator_ReturnNull() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        AnnotatedWithParams actual = base.getWithArgsCreator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromLong
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFromLong(com.fasterxml.jackson.databind.DeserializationContext, long)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromLong(com.fasterxml.jackson.databind.DeserializationContext,long)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(getValueClass(), ctxt.getParser(), "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", value);
 *  */
    @Test
    public void testCreateFromLong_ThrowNullPointerException() throws IOException  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromLong(ValueInstantiator.java:268) */
        base.createFromLong(null, -255L);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createFromLong(com.fasterxml.jackson.databind.DeserializationContext, long)
    
    @Test
    public void testCreateFromLong1() throws Exception  {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromLong] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:996)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromLong(ValueInstantiator.java:268) */
        jsonLocationInstantiator.createFromLong(impl, 0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.canCreateFromInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromInt()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromInt()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanCreateFromInt_ReturnFalse() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        boolean actual = base.canCreateFromInt();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.getDelegateCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDelegateCreator()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getDelegateCreator()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetDelegateCreator_ReturnNull() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        AnnotatedWithParams actual = base.getDelegateCreator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFromDouble(com.fasterxml.jackson.databind.DeserializationContext, double)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromDouble(com.fasterxml.jackson.databind.DeserializationContext,double)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(getValueClass(), ctxt.getParser(), "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", value);
 *  */
    @Test
    public void testCreateFromDouble_ThrowNullPointerException() throws IOException  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromDouble(ValueInstantiator.java:274) */
        base.createFromDouble(null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createFromDouble(com.fasterxml.jackson.databind.DeserializationContext, double)
    
    @Test
    public void testCreateFromDouble1() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:996)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromDouble(ValueInstantiator.java:274) */
        base.createFromDouble(impl, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.getValueClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueClass()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.returnsFrom {@code return Object.class;}
 *  */
    @Test
    public void testGetValueClass_ReturnObjectClass() {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        
        Class actual = jsonLocationInstantiator.getValueClass();
        
        Class expected = JsonLocation.class;
        
        assertEquals(Class.class, actual.getClass());
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromBoolean
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFromBoolean(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromBoolean(com.fasterxml.jackson.databind.DeserializationContext,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(getValueClass(), ctxt.getParser(), "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", value);
 *  */
    @Test
    public void testCreateFromBoolean_ThrowNullPointerException() throws IOException  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromBoolean(ValueInstantiator.java:280) */
        base.createFromBoolean(null, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createFromBoolean(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test
    public void testCreateFromBoolean1() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:996)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromBoolean(ValueInstantiator.java:280) */
        base.createFromBoolean(impl, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.canInstantiate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canInstantiate()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_CanCreateUsingDefaultOrCanCreateUsingDelegateOrCanCreateFromObjectWithOrCanCreateFromStringOrCanCreateFromIntOrCanCreateFromLongOrCanCreateFromDoubleOrCanCreateFromBoolean() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _defaultCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator", _defaultCreator);
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromObjectWith_2() {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        
        boolean actual = jsonLocationInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateUsingDelegate() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        SimpleType _delegateType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromDouble_2() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        boolean actual = base.canInstantiate();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromObjectWith() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _withArgsCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator", _withArgsCreator);
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromObjectWith_1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _fromStringCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator", _fromStringCreator);
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromInt() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _fromIntCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromIntCreator", _fromIntCreator);
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromInt_1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _fromLongCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromLongCreator", _fromLongCreator);
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromDouble() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _fromDoubleCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromDoubleCreator", _fromDoubleCreator);
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): True}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_CanCreateFromDouble() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _fromBooleanCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromBooleanCreator", _fromBooleanCreator);
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromDouble_1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.getDelegateType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetDelegateType_ReturnNull() {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        
        JavaType actual = jsonLocationInstantiator.getDelegateType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.canCreateFromLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromLong()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateFromLong()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCanCreateFromLong_ReturnFalse() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        boolean actual = base.canCreateFromLong();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromInt
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFromInt(com.fasterxml.jackson.databind.DeserializationContext, int)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createFromInt(com.fasterxml.jackson.databind.DeserializationContext,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(getValueClass(), ctxt.getParser(), "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", value);
 *  */
    @Test
    public void testCreateFromInt_ThrowNullPointerException() throws IOException  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromInt(ValueInstantiator.java:262) */
        base.createFromInt(null, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createFromInt(com.fasterxml.jackson.databind.DeserializationContext, int)
    
    @Test
    public void testCreateFromInt1() throws Exception  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:996)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromInt(ValueInstantiator.java:262) */
        base.createFromInt(impl, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingDefault
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingInstantiator(getValueClass(), ctxt.getParser(), "no default no-arguments constructor found");
 *  */
    @Test
    public void testCreateUsingDefault_ThrowNullPointerException() throws IOException  {
        ValueInstantiator.Base base = new ValueInstantiator.Base(((Class) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingDefault] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createUsingDefault(ValueInstantiator.java:189) */
        base.createUsingDefault(null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonMappingException.class)
    public void testCreateUsingDefault1() throws Exception  {
        Class class1 = Object.class;
        ValueInstantiator.Base base = new ValueInstantiator.Base(class1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        base.createUsingDefault(impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.ValueInstantiator.getValueTypeDesc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueTypeDesc()
    
    /**
    @utbot.classUnderTest {@link ValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueTypeDesc()}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#getValueClass()}
 * @utbot.returnsFrom {@code return "UNKNOWN";}
 *  */
    @Test
    public void testGetValueTypeDesc_ClsEqualsNull() {
        JsonLocationInstantiator jsonLocationInstantiator = new JsonLocationInstantiator();
        
        Class initialJsonLocationInstantiator_valueType = jsonLocationInstantiator._valueType;
        
        String actual = jsonLocationInstantiator.getValueTypeDesc();
        
        String expected = "com.fasterxml.jackson.core.JsonLocation";
        
        assertEquals(expected, actual);
        
        Class finalJsonLocationInstantiator_valueType = jsonLocationInstantiator._valueType;
        
        assertFalse(initialJsonLocationInstantiator_valueType == finalJsonLocationInstantiator_valueType);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1086626127591900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1086626127591900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1086626127604899 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1086626127591900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1086626127604899).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1086626128810900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1086626128810900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1086626128812599 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1086626128810900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1086626128812599).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


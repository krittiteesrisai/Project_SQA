package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import java.util.LinkedList;
import java.io.Closeable;
import com.fasterxml.jackson.core.JsonLocation;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.util.concurrent.RejectedExecutionException;
import java.io.IOException;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_deser_std_StdValueInstantiatorTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.wrapException
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method wrapException(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#wrapException(java.lang.Throwable)}
 * @utbot.iterates iterate the loop {@code for(Throwable curr = t; curr != null; curr = curr.getCause())} once
 *  */
    @Test
    public void testWrapException_CurrInstanceOfJsonMappingException() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        InvalidNullException invalidNullException = ((InvalidNullException) createInstance("com.fasterxml.jackson.databind.exc.InvalidNullException"));
        
        InvalidNullException actual = ((InvalidNullException) stdValueInstantiator.wrapException(invalidNullException));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method wrapException(java.lang.Throwable)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.StringBuilder#append(java.lang.String)} 4 times,
    ///     {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getValueTypeDesc()} once,
    ///     {@link java.lang.Throwable#getMessage()} once,
    ///     {@link java.lang.StringBuilder#toString()} once
    /// return from: {@code return new JsonMappingException(null, "Instantiation of " + getValueTypeDesc() + " value failed: " + t.getMessage(), t);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#wrapException(java.lang.Throwable)}
 * @utbot.returnsFrom {@code return new JsonMappingException(null, "Instantiation of " + getValueTypeDesc() + " value failed: " + t.getMessage(), t);}
 *  */
    @Test
    public void testWrapException_Return() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        
        JsonMappingException actual = stdValueInstantiator.wrapException(null);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#wrapException(java.lang.Throwable)}
 * @utbot.iterates iterate the loop {@code for(Throwable curr = t; curr != null; curr = curr.getCause())} once
 * @utbot.returnsFrom {@code return new JsonMappingException(null, "Instantiation of " + getValueTypeDesc() + " value failed: " + t.getMessage(), t);}
 *  */
    @Test
    public void testWrapException_NotCurrNotInstanceOfJsonMappingException() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        JsonMappingException actual = stdValueInstantiator.wrapException(cloneNotSupportedException);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#wrapException(java.lang.Throwable)}
 * @utbot.iterates iterate the loop {@code for(Throwable curr = t; curr != null; curr = curr.getCause())} once
 * @utbot.returnsFrom {@code return new JsonMappingException(null, "Instantiation of " + getValueTypeDesc() + " value failed: " + t.getMessage(), t);}
 *  */
    @Test
    public void testWrapException_NotCurrNotInstanceOfJsonMappingException_1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        
        JsonMappingException actual = stdValueInstantiator.wrapException(invocationTargetException);
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.canCreateFromLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromLong()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromLong()}
 * @utbot.returnsFrom {@code return (_fromLongCreator != null);}
 *  */
    @Test
    public void testCanCreateFromLong__fromLongCreatorNotEqualsNull() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        AnnotatedMethod _fromLongCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        stdValueInstantiator._fromLongCreator = _fromLongCreator;
        
        boolean actual = stdValueInstantiator.canCreateFromLong();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromLong()}
 * @utbot.returnsFrom {@code return (_fromLongCreator != null);}
 *  */
    @Test
    public void testCanCreateFromLong__fromLongCreatorEqualsNull() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromLongCreator = null;
        
        boolean actual = stdValueInstantiator.canCreateFromLong();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createFromString(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#createFromString(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.executesCondition {@code (_fromStringCreator == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#_createFromStringFallbacks(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return _createFromStringFallbacks(ctxt, value);}
 *  */
    @Test
    public void testCreateFromString__fromStringCreatorEqualsNull() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromStringCreator = null;
        stdValueInstantiator._fromBooleanCreator = null;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        String string = "";
        
        Object actual = stdValueInstantiator.createFromString(impl, string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createFromString(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void testCreateFromString1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8DataInputJsonParser _parser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1005)
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:371)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromString(StdValueInstantiator.java:323) */
        stdValueInstantiator.createFromString(impl, string);
    }
    
    @Test
    public void testCreateFromString2() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        UTF8DataInputJsonParser _parser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1005)
            com.fasterxml.jackson.databind.deser.ValueInstantiator._createFromStringFallbacks(ValueInstantiator.java:371)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromString(StdValueInstantiator.java:323) */
        stdValueInstantiator.createFromString(impl, string);
    }
    ///endregion
    
    ///region Errors report for createFromString
    
    public void testCreateFromString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getDelegateType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.returnsFrom {@code return _delegateType;}
 *  */
    @Test
    public void testGetDelegateType_Return_delegateType() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        SimpleType _delegateType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        stdValueInstantiator._delegateType = _delegateType;
        
        SimpleType actual = ((SimpleType) stdValueInstantiator.getDelegateType(null));
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(_delegateType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.canCreateFromInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromInt()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromInt()}
 * @utbot.returnsFrom {@code return (_fromIntCreator != null);}
 *  */
    @Test
    public void testCanCreateFromInt__fromIntCreatorNotEqualsNull() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        Object _fromIntCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        stdValueInstantiator._fromIntCreator = _fromIntCreator;
        
        boolean actual = stdValueInstantiator.canCreateFromInt();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromInt()}
 * @utbot.returnsFrom {@code return (_fromIntCreator != null);}
 *  */
    @Test
    public void testCanCreateFromInt__fromIntCreatorEqualsNull() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromIntCreator = null;
        
        boolean actual = stdValueInstantiator.canCreateFromInt();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getValueClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueClass()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getValueClass()}
 * @utbot.returnsFrom {@code return _valueClass;}
 *  */
    @Test
    public void testGetValueClass_Return_valueClass() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        
        Class actual = stdValueInstantiator.getValueClass();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getValueTypeDesc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueTypeDesc()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getValueTypeDesc()}
 * @utbot.returnsFrom {@code return _valueTypeDesc;}
 *  */
    @Test
    public void testGetValueTypeDesc_Return_valueTypeDesc() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        
        String actual = stdValueInstantiator.getValueTypeDesc();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.canInstantiate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canInstantiate()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canInstantiate()}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_CanCreateUsingDefaultOrCanCreateUsingDelegateOrCanCreateUsingArrayDelegateOrCanCreateFromObjectWithOrCanCreateFromStringOrCanCreateFromIntOrCanCreateFromLongOrCanCreateFromDoubleOrCanCreateFromBoolean() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        Object _defaultCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        stdValueInstantiator._defaultCreator = _defaultCreator;
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateUsingDelegate() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        ResolvedRecursiveType _delegateType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        stdValueInstantiator._delegateType = _delegateType;
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateUsingDelegate_1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        stdValueInstantiator._delegateType = null;
        PlaceholderForType _arrayDelegateType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        stdValueInstantiator._arrayDelegateType = _arrayDelegateType;
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromObjectWith() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        AnnotatedConstructor _withArgsCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        stdValueInstantiator._withArgsCreator = _withArgsCreator;
        stdValueInstantiator._delegateType = null;
        stdValueInstantiator._arrayDelegateType = null;
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromObjectWith_1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        stdValueInstantiator._withArgsCreator = null;
        stdValueInstantiator._delegateType = null;
        stdValueInstantiator._arrayDelegateType = null;
        AnnotatedConstructor _fromStringCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        stdValueInstantiator._fromStringCreator = _fromStringCreator;
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromInt() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        stdValueInstantiator._withArgsCreator = null;
        stdValueInstantiator._delegateType = null;
        stdValueInstantiator._arrayDelegateType = null;
        stdValueInstantiator._fromStringCreator = null;
        AnnotatedConstructor _fromIntCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        stdValueInstantiator._fromIntCreator = _fromIntCreator;
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromInt_1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        stdValueInstantiator._withArgsCreator = null;
        stdValueInstantiator._delegateType = null;
        stdValueInstantiator._arrayDelegateType = null;
        stdValueInstantiator._fromStringCreator = null;
        stdValueInstantiator._fromIntCreator = null;
        AnnotatedConstructor _fromLongCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        stdValueInstantiator._fromLongCreator = _fromLongCreator;
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromDouble() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        stdValueInstantiator._withArgsCreator = null;
        stdValueInstantiator._delegateType = null;
        stdValueInstantiator._arrayDelegateType = null;
        stdValueInstantiator._fromStringCreator = null;
        stdValueInstantiator._fromIntCreator = null;
        stdValueInstantiator._fromLongCreator = null;
        AnnotatedConstructor _fromDoubleCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        stdValueInstantiator._fromDoubleCreator = _fromDoubleCreator;
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): True}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_CanCreateFromDouble() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        stdValueInstantiator._withArgsCreator = null;
        stdValueInstantiator._delegateType = null;
        stdValueInstantiator._arrayDelegateType = null;
        stdValueInstantiator._fromStringCreator = null;
        stdValueInstantiator._fromIntCreator = null;
        stdValueInstantiator._fromLongCreator = null;
        stdValueInstantiator._fromDoubleCreator = null;
        AnnotatedConstructor _fromBooleanCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        stdValueInstantiator._fromBooleanCreator = _fromBooleanCreator;
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canInstantiate()}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateUsingDelegate()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromObjectWith()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromInt()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): True}
 * @utbot.executesCondition {@code (canCreateFromDouble()): False}
 * @utbot.returnsFrom {@code return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();}
 *  */
    @Test
    public void testCanInstantiate_NotCanCreateFromDouble_1() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        stdValueInstantiator._withArgsCreator = null;
        stdValueInstantiator._delegateType = null;
        stdValueInstantiator._arrayDelegateType = null;
        stdValueInstantiator._fromStringCreator = null;
        stdValueInstantiator._fromIntCreator = null;
        stdValueInstantiator._fromLongCreator = null;
        stdValueInstantiator._fromDoubleCreator = null;
        stdValueInstantiator._fromBooleanCreator = null;
        
        boolean actual = stdValueInstantiator.canInstantiate();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createUsingDefault
    
    ///region OTHER: CHECKED EXCEPTIONS for method createUsingDefault(com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void testCreateUsingDefault1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        CollectionType _delegateType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        NonBlockingJsonParser _parser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        stdValueInstantiator.createUsingDefault(impl);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testCreateUsingDefault2() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        CollectionType _delegateType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdValueInstantiator.createUsingDefault(impl);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testCreateUsingDefault3() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        PlaceholderForType _arrayDelegateType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateType", _arrayDelegateType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        stdValueInstantiator.createUsingDefault(impl);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testCreateUsingDefault4() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        Object _withArgsCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator", _withArgsCreator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdValueInstantiator.createUsingDefault(impl);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testCreateUsingDefault5() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object _fromStringCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_fromStringCreator", _fromStringCreator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdValueInstantiator.createUsingDefault(impl);
    }
    
    @Test(expected = InvalidDefinitionException.class)
    public void testCreateUsingDefault6() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdValueInstantiator.createUsingDefault(impl);
    }
    ///endregion
    
    ///region Errors report for createUsingDefault
    
    public void testCreateUsingDefault_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        /* Wrong number of type storages is provided, expected 1 arguments,
        but only 2 found */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromDouble
    
    ///region OTHER: ERROR SUITE for method createFromDouble(com.fasterxml.jackson.databind.DeserializationContext, double)
    
    @Test
    public void testCreateFromDouble1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromDouble] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1005)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromDouble(ValueInstantiator.java:274)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromDouble(StdValueInstantiator.java:378) */
        stdValueInstantiator.createFromDouble(impl, -7.291122019556399E-304);
    }
    ///endregion
    
    ///region Errors report for createFromDouble
    
    public void testCreateFromDouble_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        /* Wrong number of type storages is provided, expected 1 arguments,
        but only 2 found */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromInt
    
    ///region Errors report for createFromInt
    
    public void testCreateFromInt_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 25 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getWithArgsCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWithArgsCreator()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getWithArgsCreator()}
 * @utbot.returnsFrom {@code return _withArgsCreator;}
 *  */
    @Test
    public void testGetWithArgsCreator_Return_withArgsCreator() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._withArgsCreator = null;
        
        AnnotatedWithParams actual = stdValueInstantiator.getWithArgsCreator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean
    
    ///region OTHER: ERROR SUITE for method createFromBoolean(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test
    public void testCreateFromBoolean1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1005)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromBoolean(ValueInstantiator.java:280)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromBoolean(StdValueInstantiator.java:393) */
        stdValueInstantiator.createFromBoolean(impl, false);
    }
    ///endregion
    
    ///region Errors report for createFromBoolean
    
    public void testCreateFromBoolean_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        /* Wrong number of type storages is provided, expected 1 arguments,
        but only 2 found */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.rewrapCtorProblem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rewrapCtorProblem(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#rewrapCtorProblem(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable)}
 * @utbot.executesCondition {@code ((t instanceof ExceptionInInitializerError) || (t instanceof InvocationTargetException)): True}
 * @utbot.executesCondition {@code (if ((t instanceof ExceptionInInitializerError) || (t instanceof InvocationTargetException)) {
 *     Throwable cause = t.getCause();
 *     if (cause != null) {
 *         t = cause;
 *     }
 * }): False}
 * @utbot.returnsFrom {@code return wrapAsJsonMappingException(ctxt, t);}
 *  */
    @Test
    public void testRewrapCtorProblem_TNotInstanceOfExceptionInInitializerErrorOrTNotInstanceOfInvocationTargetException() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        IgnoredPropertyException ignoredPropertyException = ((IgnoredPropertyException) createInstance("com.fasterxml.jackson.databind.exc.IgnoredPropertyException"));
        
        IgnoredPropertyException actual = ((IgnoredPropertyException) stdValueInstantiator.rewrapCtorProblem(null, ignoredPropertyException));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#rewrapCtorProblem(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable)}
 * @utbot.executesCondition {@code ((t instanceof ExceptionInInitializerError) || (t instanceof InvocationTargetException)): False}
 * @utbot.returnsFrom {@code return wrapAsJsonMappingException(ctxt, t);}
 *  */
    @Test
    public void testRewrapCtorProblem_TNotInstanceOfExceptionInInitializerErrorOrTNotInstanceOfInvocationTargetException_1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        ExceptionInInitializerError exceptionInInitializerError = ((ExceptionInInitializerError) createInstance("java.lang.ExceptionInInitializerError"));
        InvalidFormatException cause = ((InvalidFormatException) createInstance("com.fasterxml.jackson.databind.exc.InvalidFormatException"));
        setField(exceptionInInitializerError, "java.lang.Throwable", "cause", cause);
        
        InvalidFormatException actual = ((InvalidFormatException) stdValueInstantiator.rewrapCtorProblem(null, exceptionInInitializerError));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#rewrapCtorProblem(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable)}
 * @utbot.executesCondition {@code ((t instanceof ExceptionInInitializerError) || (t instanceof InvocationTargetException)): True}
 * @utbot.executesCondition {@code (if ((t instanceof ExceptionInInitializerError) || (t instanceof InvocationTargetException)) {
 *     Throwable cause = t.getCause();
 *     if (cause != null) {
 *         t = cause;
 *     }
 * }): True}
 * @utbot.returnsFrom {@code return wrapAsJsonMappingException(ctxt, t);}
 *  */
    @Test
    public void testRewrapCtorProblem_TInstanceOfExceptionInInitializerErrorOrTInstanceOfInvocationTargetException() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        IgnoredPropertyException target = ((IgnoredPropertyException) createInstance("com.fasterxml.jackson.databind.exc.IgnoredPropertyException"));
        setField(invocationTargetException, "java.lang.reflect.InvocationTargetException", "target", target);
        
        IgnoredPropertyException actual = ((IgnoredPropertyException) stdValueInstantiator.rewrapCtorProblem(null, invocationTargetException));
        
    }
    ///endregion
    
    ///region Errors report for rewrapCtorProblem
    
    public void testRewrapCtorProblem_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // jdk.internal.reflect.GeneratedMethodAccessor18
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getDefaultCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultCreator()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getDefaultCreator()}
 * @utbot.returnsFrom {@code return _defaultCreator;}
 *  */
    @Test
    public void testGetDefaultCreator_Return_defaultCreator() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        
        AnnotatedWithParams actual = stdValueInstantiator.getDefaultCreator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getDelegateCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDelegateCreator()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getDelegateCreator()}
 * @utbot.returnsFrom {@code return _delegateCreator;}
 *  */
    @Test
    public void testGetDelegateCreator_Return_delegateCreator() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._delegateCreator = null;
        
        AnnotatedWithParams actual = stdValueInstantiator.getDelegateCreator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromLong
    
    ///region Errors report for createFromLong
    
    public void testCreateFromLong_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        /* Wrong number of type storages is provided, expected 1 arguments,
        but only 2 found */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getIncompleteParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIncompleteParameter()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getIncompleteParameter()}
 * @utbot.returnsFrom {@code return _incompleteParameter;}
 *  */
    @Test
    public void testGetIncompleteParameter_Return_incompleteParameter() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        
        AnnotatedParameter actual = stdValueInstantiator.getIncompleteParameter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.unwrapAndWrapException
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unwrapAndWrapException(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#unwrapAndWrapException(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable)}
 * @utbot.iterates iterate the loop {@code for(Throwable curr = t; curr != null; curr = curr.getCause())} once
 *  */
    @Test
    public void testUnwrapAndWrapException_IterateForLoop() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        IgnoredPropertyException ignoredPropertyException = ((IgnoredPropertyException) createInstance("com.fasterxml.jackson.databind.exc.IgnoredPropertyException"));
        
        IgnoredPropertyException actual = ((IgnoredPropertyException) stdValueInstantiator.unwrapAndWrapException(null, ignoredPropertyException));
        
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#unwrapAndWrapException(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable)}
 * @utbot.iterates iterate the loop {@code for(Throwable curr = t; curr != null; curr = curr.getCause())} twice
 *  */
    @Test
    public void testUnwrapAndWrapException_NotCurrNotInstanceOfJsonMappingException() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        UnrecognizedPropertyException cause = ((UnrecognizedPropertyException) createInstance("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException"));
        setField(numberFormatException, "java.lang.Throwable", "cause", cause);
        
        UnrecognizedPropertyException actual = ((UnrecognizedPropertyException) stdValueInstantiator.unwrapAndWrapException(null, numberFormatException));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unwrapAndWrapException(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#unwrapAndWrapException(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getValueClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#instantiationException(java.lang.Class,java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.instantiationException(getValueClass(), t);
 *  */
    @Test
    public void testUnwrapAndWrapException_ThrowNullPointerException() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.unwrapAndWrapException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.unwrapAndWrapException(StdValueInstantiator.java:471) */
        stdValueInstantiator.unwrapAndWrapException(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unwrapAndWrapException(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Throwable)
    
    @Test
    public void testUnwrapAndWrapException1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        InvalidDefinitionException actual = ((InvalidDefinitionException) stdValueInstantiator.unwrapAndWrapException(impl, null));
        
        InvalidDefinitionException expected = ((InvalidDefinitionException) createInstance("com.fasterxml.jackson.databind.exc.InvalidDefinitionException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 5;
        shortArray[1] = (short) 30;
        shortArray[2] = (short) 23;
        shortArray[3] = (short) 4;
        shortArray[7] = (short) 2;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 8;
        shortArray[15] = (short) 2;
        shortArray[17] = (short) 1;
        shortArray[18] = (short) 3;
        shortArray[19] = (short) 4;
        shortArray[20] = (short) 5;
        shortArray[21] = (short) 6;
        shortArray[23] = (short) 1;
        shortArray[24] = (short) 2;
        shortArray[25] = (short) 2;
        shortArray[30] = (short) 1;
        shortArray[31] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7929856;
        intArray[1] = 23855104;
        intArray[2] = 13631488;
        intArray[3] = 1;
        intArray[4] = 8716289;
        intArray[5] = 393216;
        intArray[6] = 3866632;
        intArray[7] = 4456448;
        intArray[8] = 327680;
        intArray[9] = 524288;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 262144;
        intArray[14] = 851976;
        intArray[15] = 3997696;
        intArray[16] = 7536640;
        intArray[17] = 11993088;
        intArray[18] = 3538944;
        intArray[19] = 4128768;
        intArray[20] = 720896;
        intArray[21] = 28573696;
        intArray[22] = 393216;
        intArray[23] = 2097152;
        intArray[24] = 1900544;
        intArray[25] = 11927552;
        intArray[26] = 327680;
        intArray[27] = 3735552;
        intArray[28] = 1310720;
        intArray[29] = 2949120;
        intArray[30] = 65536;
        intArray[31] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = InvalidDefinitionException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = com.fasterxml.jackson.databind.DeserializationContext.class;
        objectArray[1] = ((Object) class2);
        Class class3 = StdValueInstantiator.class;
        objectArray[2] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[3] = ((Object) class4);
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[5] = ((Object) class5);
        Class class6 = Method.class;
        objectArray[6] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[7] = ((Object) class7);
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[11] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[12] = ((Object) class11);
        Class class12 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[13] = ((Object) class12);
        Class class13 = java.security.AccessController.class;
        objectArray[14] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[15] = ((Object) class14);
        objectArray[16] = ((Object) class14);
        objectArray[17] = ((Object) class14);
        objectArray[18] = ((Object) class14);
        objectArray[19] = ((Object) class14);
        objectArray[20] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[21] = ((Object) class15);
        objectArray[22] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[23] = ((Object) class16);
        Class class17 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[24] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[25] = ((Object) class18);
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[27] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[28] = ((Object) class20);
        Class class21 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[29] = ((Object) class21);
        objectArray[30] = ((Object) class21);
        Class class22 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[31] = ((Object) class22);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2177032899216L;
        longArray[1] = 2178205082992L;
        longArray[2] = 2178205082848L;
        longArray[3] = 2177033580720L;
        longArray[4] = 2177032855552L;
        longArray[5] = 2177032855552L;
        longArray[6] = 2177032855552L;
        longArray[7] = 2178237622784L;
        longArray[8] = 2177032855552L;
        longArray[9] = 2177032855552L;
        longArray[10] = 2177032855552L;
        longArray[11] = 2177032855552L;
        longArray[12] = 2177032855552L;
        longArray[13] = 2177032862920L;
        longArray[14] = 2177032903664L;
        longArray[15] = 2177018034176L;
        longArray[16] = 2177018034176L;
        longArray[17] = 2177018034176L;
        longArray[18] = 2177018034176L;
        longArray[19] = 2177018035808L;
        longArray[20] = 2177018037856L;
        longArray[21] = 2178208353616L;
        longArray[22] = 2177032855552L;
        longArray[23] = 2178189244656L;
        longArray[24] = 2178218845680L;
        longArray[25] = 2178237622784L;
        longArray[26] = 2177032855552L;
        longArray[27] = 2177032855552L;
        longArray[28] = 2177032855552L;
        longArray[29] = 2177032855552L;
        longArray[30] = 2177032855552L;
        longArray[31] = 2177032862920L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "Cannot construct instance of [null], problem: N/A";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 32);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type"));
        assertNull(actual_type);
        
        BeanDescription actual_beanDesc = ((BeanDescription) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_beanDesc"));
        assertNull(actual_beanDesc);
        
        BeanPropertyDefinition actual_property = ((BeanPropertyDefinition) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_property"));
        assertNull(actual_property);
        
        LinkedList actual_path = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_path);
        
        Closeable actual_processor = ((Closeable) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    
    @Test
    public void testUnwrapAndWrapException2() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object malformedURIException = createInstance("com.sun.org.apache.xml.internal.serializer.utils.URI$MalformedURIException");
        
        Class stdValueInstantiatorClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class malformedURIExceptionType = Class.forName("java.lang.Throwable");
        Method unwrapAndWrapExceptionMethod = stdValueInstantiatorClazz.getDeclaredMethod("unwrapAndWrapException", implType, malformedURIExceptionType);
        unwrapAndWrapExceptionMethod.setAccessible(true);
        java.lang.Object[] unwrapAndWrapExceptionMethodArguments = new java.lang.Object[2];
        unwrapAndWrapExceptionMethodArguments[0] = impl;
        unwrapAndWrapExceptionMethodArguments[1] = malformedURIException;
        InvalidDefinitionException actual = ((InvalidDefinitionException) unwrapAndWrapExceptionMethod.invoke(stdValueInstantiator, unwrapAndWrapExceptionMethodArguments));
        
        InvalidDefinitionException expected = ((InvalidDefinitionException) createInstance("com.fasterxml.jackson.databind.exc.InvalidDefinitionException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 5;
        shortArray[1] = (short) 30;
        shortArray[2] = (short) 23;
        shortArray[3] = (short) 4;
        shortArray[7] = (short) 2;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 8;
        shortArray[15] = (short) 2;
        shortArray[17] = (short) 1;
        shortArray[18] = (short) 3;
        shortArray[19] = (short) 4;
        shortArray[20] = (short) 5;
        shortArray[21] = (short) 6;
        shortArray[23] = (short) 1;
        shortArray[24] = (short) 2;
        shortArray[25] = (short) 2;
        shortArray[30] = (short) 1;
        shortArray[31] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7929856;
        intArray[1] = 23855104;
        intArray[2] = 13631488;
        intArray[3] = 1;
        intArray[4] = 8716289;
        intArray[5] = 393216;
        intArray[6] = 3866632;
        intArray[7] = 4456448;
        intArray[8] = 327680;
        intArray[9] = 524288;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 262144;
        intArray[14] = 851976;
        intArray[15] = 3997696;
        intArray[16] = 7536640;
        intArray[17] = 11993088;
        intArray[18] = 3538944;
        intArray[19] = 4128768;
        intArray[20] = 720896;
        intArray[21] = 28573696;
        intArray[22] = 393216;
        intArray[23] = 2097152;
        intArray[24] = 1900544;
        intArray[25] = 11927552;
        intArray[26] = 327680;
        intArray[27] = 3735552;
        intArray[28] = 1310720;
        intArray[29] = 2949120;
        intArray[30] = 65536;
        intArray[31] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = InvalidDefinitionException.class;
        objectArray[0] = ((Object) class1);
        objectArray[1] = ((Object) implType);
        objectArray[2] = ((Object) stdValueInstantiatorClazz);
        Class class2 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[3] = ((Object) class2);
        objectArray[4] = ((Object) class2);
        Class class3 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[5] = ((Object) class3);
        Class class4 = Method.class;
        objectArray[6] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[7] = ((Object) class5);
        objectArray[8] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[9] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[10] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[11] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[12] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[13] = ((Object) class10);
        Class class11 = java.security.AccessController.class;
        objectArray[14] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[15] = ((Object) class12);
        objectArray[16] = ((Object) class12);
        objectArray[17] = ((Object) class12);
        objectArray[18] = ((Object) class12);
        objectArray[19] = ((Object) class12);
        objectArray[20] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[21] = ((Object) class13);
        objectArray[22] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[23] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[24] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[25] = ((Object) class16);
        objectArray[26] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[27] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[28] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[29] = ((Object) class19);
        objectArray[30] = ((Object) class19);
        Class class20 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[31] = ((Object) class20);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2177032899216L;
        longArray[1] = 2178205082992L;
        longArray[2] = 2178205082848L;
        longArray[3] = 2177033580720L;
        longArray[4] = 2177032855552L;
        longArray[5] = 2177032855552L;
        longArray[6] = 2177032855552L;
        longArray[7] = 2178237622784L;
        longArray[8] = 2177032855552L;
        longArray[9] = 2177032855552L;
        longArray[10] = 2177032855552L;
        longArray[11] = 2177032855552L;
        longArray[12] = 2177032855552L;
        longArray[13] = 2177032862920L;
        longArray[14] = 2177032903664L;
        longArray[15] = 2177018034176L;
        longArray[16] = 2177018034176L;
        longArray[17] = 2177018034176L;
        longArray[18] = 2177018034176L;
        longArray[19] = 2177018035808L;
        longArray[20] = 2177018037856L;
        longArray[21] = 2178208353616L;
        longArray[22] = 2177032855552L;
        longArray[23] = 2178189244656L;
        longArray[24] = 2178218845680L;
        longArray[25] = 2178237622784L;
        longArray[26] = 2177032855552L;
        longArray[27] = 2177032855552L;
        longArray[28] = 2177032855552L;
        longArray[29] = 2177032855552L;
        longArray[30] = 2177032855552L;
        longArray[31] = 2177032862920L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "Cannot construct instance of [null], problem: `com.sun.org.apache.xml.internal.serializer.utils.URI$MalformedURIException`";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", malformedURIException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 32);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type"));
        assertNull(actual_type);
        
        BeanDescription actual_beanDesc = ((BeanDescription) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_beanDesc"));
        assertNull(actual_beanDesc);
        
        BeanPropertyDefinition actual_property = ((BeanPropertyDefinition) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_property"));
        assertNull(actual_property);
        
        LinkedList actual_path = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_path);
        
        Closeable actual_processor = ((Closeable) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertNull(actualCauseDetailMessage);
        
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    
    @Test
    public void testUnwrapAndWrapException3() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Class initialStdValueInstantiator_valueClass = stdValueInstantiator._valueClass;
        
        InvalidDefinitionException actual = ((InvalidDefinitionException) stdValueInstantiator.unwrapAndWrapException(impl, null));
        
        InvalidDefinitionException expected = ((InvalidDefinitionException) createInstance("com.fasterxml.jackson.databind.exc.InvalidDefinitionException"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _valueClass);
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type", _type);
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 5;
        shortArray[1] = (short) 30;
        shortArray[2] = (short) 23;
        shortArray[3] = (short) 4;
        shortArray[7] = (short) 2;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 8;
        shortArray[15] = (short) 2;
        shortArray[17] = (short) 1;
        shortArray[18] = (short) 3;
        shortArray[19] = (short) 4;
        shortArray[20] = (short) 5;
        shortArray[21] = (short) 6;
        shortArray[23] = (short) 1;
        shortArray[24] = (short) 2;
        shortArray[25] = (short) 2;
        shortArray[30] = (short) 1;
        shortArray[31] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7929856;
        intArray[1] = 23855104;
        intArray[2] = 13631488;
        intArray[3] = 1;
        intArray[4] = 8716289;
        intArray[5] = 393216;
        intArray[6] = 3866632;
        intArray[7] = 4456448;
        intArray[8] = 327680;
        intArray[9] = 524288;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 262144;
        intArray[14] = 851976;
        intArray[15] = 3997696;
        intArray[16] = 7536640;
        intArray[17] = 11993088;
        intArray[18] = 3538944;
        intArray[19] = 4128768;
        intArray[20] = 720896;
        intArray[21] = 28573696;
        intArray[22] = 393216;
        intArray[23] = 2097152;
        intArray[24] = 1900544;
        intArray[25] = 11927552;
        intArray[26] = 327680;
        intArray[27] = 3735552;
        intArray[28] = 1310720;
        intArray[29] = 2949120;
        intArray[30] = 65536;
        intArray[31] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = InvalidDefinitionException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = com.fasterxml.jackson.databind.DeserializationContext.class;
        objectArray[1] = ((Object) class2);
        Class class3 = StdValueInstantiator.class;
        objectArray[2] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[3] = ((Object) class4);
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[5] = ((Object) class5);
        Class class6 = Method.class;
        objectArray[6] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[7] = ((Object) class7);
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[11] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[12] = ((Object) class11);
        Class class12 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[13] = ((Object) class12);
        Class class13 = java.security.AccessController.class;
        objectArray[14] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[15] = ((Object) class14);
        objectArray[16] = ((Object) class14);
        objectArray[17] = ((Object) class14);
        objectArray[18] = ((Object) class14);
        objectArray[19] = ((Object) class14);
        objectArray[20] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[21] = ((Object) class15);
        objectArray[22] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[23] = ((Object) class16);
        Class class17 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[24] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[25] = ((Object) class18);
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[27] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[28] = ((Object) class20);
        Class class21 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[29] = ((Object) class21);
        objectArray[30] = ((Object) class21);
        Class class22 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[31] = ((Object) class22);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2177032899216L;
        longArray[1] = 2178205082992L;
        longArray[2] = 2178205082848L;
        longArray[3] = 2177033580720L;
        longArray[4] = 2177032855552L;
        longArray[5] = 2177032855552L;
        longArray[6] = 2177032855552L;
        longArray[7] = 2178237622784L;
        longArray[8] = 2177032855552L;
        longArray[9] = 2177032855552L;
        longArray[10] = 2177032855552L;
        longArray[11] = 2177032855552L;
        longArray[12] = 2177032855552L;
        longArray[13] = 2177032862920L;
        longArray[14] = 2177032903664L;
        longArray[15] = 2177018034176L;
        longArray[16] = 2177018034176L;
        longArray[17] = 2177018034176L;
        longArray[18] = 2177018034176L;
        longArray[19] = 2177018035808L;
        longArray[20] = 2177018037856L;
        longArray[21] = 2178208353616L;
        longArray[22] = 2177032855552L;
        longArray[23] = 2178189244656L;
        longArray[24] = 2178218845680L;
        longArray[25] = 2178237622784L;
        longArray[26] = 2177032855552L;
        longArray[27] = 2177032855552L;
        longArray[28] = 2177032855552L;
        longArray[29] = 2177032855552L;
        longArray[30] = 2177032855552L;
        longArray[31] = 2177032862920L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "Cannot construct instance of `java.lang.Object`, problem: N/A";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 32);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type"));
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_type, actual_type);
        
        BeanDescription actual_beanDesc = ((BeanDescription) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_beanDesc"));
        assertNull(actual_beanDesc);
        
        BeanPropertyDefinition actual_property = ((BeanPropertyDefinition) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_property"));
        assertNull(actual_property);
        
        LinkedList actual_path = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_path);
        
        Closeable actual_processor = ((Closeable) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
        Class finalStdValueInstantiator_valueClass = stdValueInstantiator._valueClass;
        
        assertFalse(initialStdValueInstantiator_valueClass == finalStdValueInstantiator_valueClass);
    }
    
    @Test
    public void testUnwrapAndWrapException4() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        RejectedExecutionException rejectedExecutionException = ((RejectedExecutionException) createInstance("java.util.concurrent.RejectedExecutionException"));
        
        Class initialStdValueInstantiator_valueClass = stdValueInstantiator._valueClass;
        
        InvalidDefinitionException actual = ((InvalidDefinitionException) stdValueInstantiator.unwrapAndWrapException(impl, rejectedExecutionException));
        
        InvalidDefinitionException expected = ((InvalidDefinitionException) createInstance("com.fasterxml.jackson.databind.exc.InvalidDefinitionException"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _valueClass);
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type", _type);
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 5;
        shortArray[1] = (short) 30;
        shortArray[2] = (short) 23;
        shortArray[3] = (short) 4;
        shortArray[7] = (short) 2;
        shortArray[13] = (short) 1;
        shortArray[14] = (short) 8;
        shortArray[15] = (short) 2;
        shortArray[17] = (short) 1;
        shortArray[18] = (short) 3;
        shortArray[19] = (short) 4;
        shortArray[20] = (short) 5;
        shortArray[21] = (short) 6;
        shortArray[23] = (short) 1;
        shortArray[24] = (short) 2;
        shortArray[25] = (short) 2;
        shortArray[30] = (short) 1;
        shortArray[31] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 7929856;
        intArray[1] = 23855104;
        intArray[2] = 13631488;
        intArray[3] = 1;
        intArray[4] = 8716289;
        intArray[5] = 393216;
        intArray[6] = 3866632;
        intArray[7] = 4456448;
        intArray[8] = 327680;
        intArray[9] = 524288;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 262144;
        intArray[13] = 262144;
        intArray[14] = 851976;
        intArray[15] = 3997696;
        intArray[16] = 7536640;
        intArray[17] = 11993088;
        intArray[18] = 3538944;
        intArray[19] = 4128768;
        intArray[20] = 720896;
        intArray[21] = 28573696;
        intArray[22] = 393216;
        intArray[23] = 2097152;
        intArray[24] = 1900544;
        intArray[25] = 11927552;
        intArray[26] = 327680;
        intArray[27] = 3735552;
        intArray[28] = 1310720;
        intArray[29] = 2949120;
        intArray[30] = 65536;
        intArray[31] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        Class class1 = InvalidDefinitionException.class;
        objectArray[0] = ((Object) class1);
        Class class2 = com.fasterxml.jackson.databind.DeserializationContext.class;
        objectArray[1] = ((Object) class2);
        Class class3 = StdValueInstantiator.class;
        objectArray[2] = ((Object) class3);
        Class class4 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[3] = ((Object) class4);
        objectArray[4] = ((Object) class4);
        Class class5 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[5] = ((Object) class5);
        Class class6 = Method.class;
        objectArray[6] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[7] = ((Object) class7);
        objectArray[8] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[9] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[10] = ((Object) class9);
        Class class10 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[11] = ((Object) class10);
        Class class11 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[12] = ((Object) class11);
        Class class12 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[13] = ((Object) class12);
        Class class13 = java.security.AccessController.class;
        objectArray[14] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[15] = ((Object) class14);
        objectArray[16] = ((Object) class14);
        objectArray[17] = ((Object) class14);
        objectArray[18] = ((Object) class14);
        objectArray[19] = ((Object) class14);
        objectArray[20] = ((Object) class14);
        Class class15 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[21] = ((Object) class15);
        objectArray[22] = ((Object) class15);
        Class class16 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[23] = ((Object) class16);
        Class class17 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[24] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[25] = ((Object) class18);
        objectArray[26] = ((Object) class18);
        Class class19 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[27] = ((Object) class19);
        Class class20 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[28] = ((Object) class20);
        Class class21 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[29] = ((Object) class21);
        objectArray[30] = ((Object) class21);
        Class class22 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[31] = ((Object) class22);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 2177032899216L;
        longArray[1] = 2178205082992L;
        longArray[2] = 2178205082848L;
        longArray[3] = 2177033580720L;
        longArray[4] = 2177032855552L;
        longArray[5] = 2177032855552L;
        longArray[6] = 2177032855552L;
        longArray[7] = 2178237622784L;
        longArray[8] = 2177032855552L;
        longArray[9] = 2177032855552L;
        longArray[10] = 2177032855552L;
        longArray[11] = 2177032855552L;
        longArray[12] = 2177032855552L;
        longArray[13] = 2177032862920L;
        longArray[14] = 2177032903664L;
        longArray[15] = 2177018034176L;
        longArray[16] = 2177018034176L;
        longArray[17] = 2177018034176L;
        longArray[18] = 2177018034176L;
        longArray[19] = 2177018035808L;
        longArray[20] = 2177018037856L;
        longArray[21] = 2178208353616L;
        longArray[22] = 2177032855552L;
        longArray[23] = 2178189244656L;
        longArray[24] = 2178218845680L;
        longArray[25] = 2178237622784L;
        longArray[26] = 2177032855552L;
        longArray[27] = 2177032855552L;
        longArray[28] = 2177032855552L;
        longArray[29] = 2177032855552L;
        longArray[30] = 2177032855552L;
        longArray[31] = 2177032862920L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        String detailMessage = "Cannot construct instance of `java.lang.Object`, problem: `java.util.concurrent.RejectedExecutionException`";
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", rejectedExecutionException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 32);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type"));
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_type"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_type, actual_type);
        
        BeanDescription actual_beanDesc = ((BeanDescription) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_beanDesc"));
        assertNull(actual_beanDesc);
        
        BeanPropertyDefinition actual_property = ((BeanPropertyDefinition) getFieldValue(actual, "com.fasterxml.jackson.databind.exc.InvalidDefinitionException", "_property"));
        assertNull(actual_property);
        
        LinkedList actual_path = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_path);
        
        Closeable actual_processor = ((Closeable) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        String actualCauseDetailMessage = ((String) getFieldValue(actualCause, "java.lang.Throwable", "detailMessage"));
        assertNull(actualCauseDetailMessage);
        
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
        Class finalStdValueInstantiator_valueClass = stdValueInstantiator._valueClass;
        
        assertFalse(initialStdValueInstantiator_valueClass == finalStdValueInstantiator_valueClass);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unwrapAndWrapException(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Throwable)
    
    @Test
    public void testUnwrapAndWrapException5() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        OutOfMemoryError outOfMemoryError = ((OutOfMemoryError) createInstance("java.lang.OutOfMemoryError"));
        setField(outOfMemoryError, "java.lang.Throwable", "cause", outOfMemoryError);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.unwrapAndWrapException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.unwrapAndWrapException(StdValueInstantiator.java:471) */
        stdValueInstantiator.unwrapAndWrapException(null, outOfMemoryError);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.wrapAsJsonMappingException
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wrapAsJsonMappingException(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#wrapAsJsonMappingException(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable)}
 * @utbot.executesCondition {@code (t instanceof JsonMappingException): True}
 * @utbot.returnsFrom {@code return (JsonMappingException) t;}
 *  */
    @Test
    public void testWrapAsJsonMappingException_TInstanceOfJsonMappingException() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        IgnoredPropertyException ignoredPropertyException = ((IgnoredPropertyException) createInstance("com.fasterxml.jackson.databind.exc.IgnoredPropertyException"));
        
        IgnoredPropertyException actual = ((IgnoredPropertyException) stdValueInstantiator.wrapAsJsonMappingException(null, ignoredPropertyException));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrapAsJsonMappingException(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#wrapAsJsonMappingException(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable)}
 * @utbot.executesCondition {@code (t instanceof JsonMappingException): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getValueClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#instantiationException(java.lang.Class,java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.instantiationException(getValueClass(), t);
 *  */
    @Test
    public void testWrapAsJsonMappingException_ThrowNullPointerException() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.wrapAsJsonMappingException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.wrapAsJsonMappingException(StdValueInstantiator.java:484) */
        stdValueInstantiator.wrapAsJsonMappingException(null, null);
    }
    ///endregion
    
    ///region Errors report for wrapAsJsonMappingException
    
    public void testWrapAsJsonMappingException_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // jdk.internal.reflect.GeneratedMethodAccessor16
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator._createUsingDelegate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _createUsingDelegate(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#_createUsingDelegate(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (delegateCreator == null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getValueTypeDesc()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: delegateCreator == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_createUsingDelegate_ThrowIllegalStateException() throws Throwable  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        
        Class stdValueInstantiatorClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class annotatedWithParamsType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
        Class settableBeanPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class objectType = Class.forName("java.lang.Object");
        Method _createUsingDelegateMethod = stdValueInstantiatorClazz.getDeclaredMethod("_createUsingDelegate", annotatedWithParamsType, settableBeanPropertyArrayType, deserializationContextType, objectType);
        _createUsingDelegateMethod.setAccessible(true);
        java.lang.Object[] _createUsingDelegateMethodArguments = new java.lang.Object[4];
        _createUsingDelegateMethodArguments[0] = ((Object) null);
        _createUsingDelegateMethodArguments[1] = ((Object) null);
        _createUsingDelegateMethodArguments[2] = ((Object) null);
        _createUsingDelegateMethodArguments[3] = ((Object) null);
        try {
            _createUsingDelegateMethod.invoke(stdValueInstantiator, _createUsingDelegateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for _createUsingDelegate
    
    public void test_createUsingDelegate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.canCreateFromDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromDouble()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromDouble()}
 * @utbot.returnsFrom {@code return (_fromDoubleCreator != null);}
 *  */
    @Test
    public void testCanCreateFromDouble__fromDoubleCreatorNotEqualsNull() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        AnnotatedMethod _fromDoubleCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        stdValueInstantiator._fromDoubleCreator = _fromDoubleCreator;
        
        boolean actual = stdValueInstantiator.canCreateFromDouble();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromDouble()}
 * @utbot.returnsFrom {@code return (_fromDoubleCreator != null);}
 *  */
    @Test
    public void testCanCreateFromDouble__fromDoubleCreatorEqualsNull() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromDoubleCreator = null;
        
        boolean actual = stdValueInstantiator.canCreateFromDouble();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.canCreateFromBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromBoolean()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromBoolean()}
 * @utbot.returnsFrom {@code return (_fromBooleanCreator != null);}
 *  */
    @Test
    public void testCanCreateFromBoolean__fromBooleanCreatorNotEqualsNull() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        AnnotatedMethod _fromBooleanCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        stdValueInstantiator._fromBooleanCreator = _fromBooleanCreator;
        
        boolean actual = stdValueInstantiator.canCreateFromBoolean();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromBoolean()}
 * @utbot.returnsFrom {@code return (_fromBooleanCreator != null);}
 *  */
    @Test
    public void testCanCreateFromBoolean__fromBooleanCreatorEqualsNull() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromBooleanCreator = null;
        
        boolean actual = stdValueInstantiator.canCreateFromBoolean();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.configureFromArraySettings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureFromArraySettings(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#configureFromArraySettings(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 *  */
    @Test
    public void testConfigureFromArraySettings() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._arrayDelegateType = null;
        stdValueInstantiator._arrayDelegateCreator = null;
        stdValueInstantiator._arrayDelegateArguments = null;
        
        stdValueInstantiator.configureFromArraySettings(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.configureFromStringCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureFromStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#configureFromStringCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testConfigureFromStringCreator() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromStringCreator = null;
        
        stdValueInstantiator.configureFromStringCreator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.configureFromDoubleCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureFromDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#configureFromDoubleCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testConfigureFromDoubleCreator() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromDoubleCreator = null;
        
        stdValueInstantiator.configureFromDoubleCreator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.configureIncompleteParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureIncompleteParameter(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#configureIncompleteParameter(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)}
 *  */
    @Test
    public void testConfigureIncompleteParameter() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        
        stdValueInstantiator.configureIncompleteParameter(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.canCreateFromString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromString()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromString()}
 * @utbot.returnsFrom {@code return (_fromStringCreator != null);}
 *  */
    @Test
    public void testCanCreateFromString__fromStringCreatorNotEqualsNull() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        AnnotatedMethod _fromStringCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        stdValueInstantiator._fromStringCreator = _fromStringCreator;
        
        boolean actual = stdValueInstantiator.canCreateFromString();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromString()}
 * @utbot.returnsFrom {@code return (_fromStringCreator != null);}
 *  */
    @Test
    public void testCanCreateFromString__fromStringCreatorEqualsNull() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromStringCreator = null;
        
        boolean actual = stdValueInstantiator.canCreateFromString();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.canCreateUsingDefault
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateUsingDefault()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateUsingDefault()}
 * @utbot.returnsFrom {@code return (_defaultCreator != null);}
 *  */
    @Test
    public void testCanCreateUsingDefault__defaultCreatorNotEqualsNull() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        AnnotatedMethod _defaultCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        stdValueInstantiator._defaultCreator = _defaultCreator;
        
        boolean actual = stdValueInstantiator.canCreateUsingDefault();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateUsingDefault()}
 * @utbot.returnsFrom {@code return (_defaultCreator != null);}
 *  */
    @Test
    public void testCanCreateUsingDefault__defaultCreatorEqualsNull() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        
        boolean actual = stdValueInstantiator.canCreateUsingDefault();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.canCreateUsingArrayDelegate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateUsingArrayDelegate()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateUsingArrayDelegate()}
 * @utbot.returnsFrom {@code return (_arrayDelegateType != null);}
 *  */
    @Test
    public void testCanCreateUsingArrayDelegate__arrayDelegateTypeNotEqualsNull() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        MapLikeType _arrayDelegateType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        stdValueInstantiator._arrayDelegateType = _arrayDelegateType;
        
        boolean actual = stdValueInstantiator.canCreateUsingArrayDelegate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateUsingArrayDelegate()}
 * @utbot.returnsFrom {@code return (_arrayDelegateType != null);}
 *  */
    @Test
    public void testCanCreateUsingArrayDelegate__arrayDelegateTypeEqualsNull() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._arrayDelegateType = null;
        
        boolean actual = stdValueInstantiator.canCreateUsingArrayDelegate();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getFromObjectArguments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFromObjectArguments(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getFromObjectArguments(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.returnsFrom {@code return _constructorArguments;}
 *  */
    @Test
    public void testGetFromObjectArguments_Return_constructorArguments() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._constructorArguments = null;
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual = stdValueInstantiator.getFromObjectArguments(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createUsingDelegate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createUsingDelegate(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#createUsingDelegate(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_delegateCreator == null): True}
 * @utbot.executesCondition {@code (_arrayDelegateCreator != null): False}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#_createUsingDelegate(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _createUsingDelegate(_delegateCreator, _delegateArguments, ctxt, delegate);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCreateUsingDelegate_ThrowIllegalStateException() throws IOException  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._delegateCreator = null;
        stdValueInstantiator._delegateArguments = null;
        stdValueInstantiator._arrayDelegateCreator = null;
        
        stdValueInstantiator.createUsingDelegate(null, null);
    }
    ///endregion
    
    ///region Errors report for createUsingDelegate
    
    public void testCreateUsingDelegate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.configureFromLongCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureFromLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#configureFromLongCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testConfigureFromLongCreator() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromLongCreator = null;
        
        stdValueInstantiator.configureFromLongCreator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.configureFromBooleanCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureFromBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#configureFromBooleanCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testConfigureFromBooleanCreator() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromBooleanCreator = null;
        
        stdValueInstantiator.configureFromBooleanCreator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.canCreateUsingDelegate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateUsingDelegate()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateUsingDelegate()}
 * @utbot.returnsFrom {@code return (_delegateType != null);}
 *  */
    @Test
    public void testCanCreateUsingDelegate__delegateTypeNotEqualsNull() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        MapType _delegateType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        stdValueInstantiator._delegateType = _delegateType;
        
        boolean actual = stdValueInstantiator.canCreateUsingDelegate();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateUsingDelegate()}
 * @utbot.returnsFrom {@code return (_delegateType != null);}
 *  */
    @Test
    public void testCanCreateUsingDelegate__delegateTypeEqualsNull() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._delegateType = null;
        
        boolean actual = stdValueInstantiator.canCreateUsingDelegate();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.canCreateFromObjectWith
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canCreateFromObjectWith()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromObjectWith()}
 * @utbot.returnsFrom {@code return (_withArgsCreator != null);}
 *  */
    @Test
    public void testCanCreateFromObjectWith__withArgsCreatorNotEqualsNull() throws Exception  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        AnnotatedMethod _withArgsCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        stdValueInstantiator._withArgsCreator = _withArgsCreator;
        
        boolean actual = stdValueInstantiator.canCreateFromObjectWith();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#canCreateFromObjectWith()}
 * @utbot.returnsFrom {@code return (_withArgsCreator != null);}
 *  */
    @Test
    public void testCanCreateFromObjectWith__withArgsCreatorEqualsNull() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._withArgsCreator = null;
        
        boolean actual = stdValueInstantiator.canCreateFromObjectWith();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.configureFromIntCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureFromIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#configureFromIntCreator(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)}
 *  */
    @Test
    public void testConfigureFromIntCreator() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._fromIntCreator = null;
        
        stdValueInstantiator.configureFromIntCreator(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getArrayDelegateType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArrayDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getArrayDelegateType(com.fasterxml.jackson.databind.DeserializationConfig)}
 * @utbot.returnsFrom {@code return _arrayDelegateType;}
 *  */
    @Test
    public void testGetArrayDelegateType_Return_arrayDelegateType() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._arrayDelegateType = null;
        
        JavaType actual = stdValueInstantiator.getArrayDelegateType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getArrayDelegateCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArrayDelegateCreator()
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#getArrayDelegateCreator()}
 * @utbot.returnsFrom {@code return _arrayDelegateCreator;}
 *  */
    @Test
    public void testGetArrayDelegateCreator_Return_arrayDelegateCreator() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._arrayDelegateCreator = null;
        
        AnnotatedWithParams actual = stdValueInstantiator.getArrayDelegateCreator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith
    
    ///region OTHER: CHECKED EXCEPTIONS for method createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, [Ljava.lang.Object;)
    
    @Test(expected = MismatchedInputException.class)
    public void testCreateFromObjectWith1() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        Object _defaultCreator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_defaultCreator", _defaultCreator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        stdValueInstantiator.createFromObjectWith(impl, objectArray);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testCreateFromObjectWith2() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        CollectionType _delegateType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        stdValueInstantiator.createFromObjectWith(impl, objectArray);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testCreateFromObjectWith3() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        PlaceholderForType _arrayDelegateType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_arrayDelegateType", _arrayDelegateType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        stdValueInstantiator.createFromObjectWith(impl, objectArray);
    }
    
    @Test(expected = InvalidDefinitionException.class)
    public void testCreateFromObjectWith4() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        stdValueInstantiator.createFromObjectWith(impl, objectArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createFromObjectWith(com.fasterxml.jackson.databind.DeserializationContext, [Ljava.lang.Object;)
    
    @Test
    public void testCreateFromObjectWith5() throws Exception  {
        StdValueInstantiator stdValueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class _valueClass = Object.class;
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_valueClass", _valueClass);
        CollectionType _delegateType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(stdValueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonParserSequence _parser = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        java.lang.Object[] objectArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.JsonMappingException.<init>(JsonMappingException.java:243)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.<init>(MismatchedInputException.java:43)
            com.fasterxml.jackson.databind.exc.MismatchedInputException.from(MismatchedInputException.java:63)
            com.fasterxml.jackson.databind.DeserializationContext.reportInputMismatch(DeserializationContext.java:1343)
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1032)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:203)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith(StdValueInstantiator.java:280) */
        stdValueInstantiator.createFromObjectWith(impl, objectArray);
    }
    ///endregion
    
    ///region Errors report for createFromObjectWith
    
    public void testCreateFromObjectWith_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        /* Wrong number of type storages is provided, expected 1 arguments,
        but only 2 found */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createUsingArrayDelegate
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createUsingArrayDelegate(com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#createUsingArrayDelegate(com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (_arrayDelegateCreator == null): True}
 * @utbot.executesCondition {@code (_delegateCreator != null): False}
 * @utbot.invokes com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#_createUsingDelegate(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _createUsingDelegate(_arrayDelegateCreator, _arrayDelegateArguments, ctxt, delegate);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCreateUsingArrayDelegate_ThrowIllegalStateException() throws IOException  {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._delegateCreator = null;
        stdValueInstantiator._arrayDelegateCreator = null;
        stdValueInstantiator._arrayDelegateArguments = null;
        
        stdValueInstantiator.createUsingArrayDelegate(null, null);
    }
    ///endregion
    
    ///region Errors report for createUsingArrayDelegate
    
    public void testCreateUsingArrayDelegate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 22 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.configureFromObjectSettings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method configureFromObjectSettings(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty;)
    
    /**
    @utbot.classUnderTest {@link StdValueInstantiator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdValueInstantiator#configureFromObjectSettings(com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[])}
 *  */
    @Test
    public void testConfigureFromObjectSettings() {
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(null);
        stdValueInstantiator._defaultCreator = null;
        stdValueInstantiator._withArgsCreator = null;
        stdValueInstantiator._constructorArguments = null;
        stdValueInstantiator._delegateType = null;
        stdValueInstantiator._delegateCreator = null;
        stdValueInstantiator._delegateArguments = null;
        
        stdValueInstantiator.configureFromObjectSettings(null, null, null, null, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1091802329978199 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1091802329978199.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1091802329987800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091802329978199.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091802329987800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1091802330617799 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091802330617799.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091802330619599 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091802330617799.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091802330619599).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static int getArrayLength(Object arr) {
        return java.lang.reflect.Array.getLength(arr);
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


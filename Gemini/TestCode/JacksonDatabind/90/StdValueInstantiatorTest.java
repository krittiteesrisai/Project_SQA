package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StdValueInstantiatorTest {

    private DeserializationConfig mockConfig;
    private DeserializationContext mockContext;
    private JavaType mockJavaType;

    @Before
    public void setUp() {
        mockConfig = mock(DeserializationConfig.class);
        mockContext = mock(DeserializationContext.class);
        mockJavaType = mock(JavaType.class);
        when(mockJavaType.toString()).thenReturn("MockedJavaType");
        when(mockJavaType.getRawClass()).thenAnswer(inv -> String.class);
    }

    @Test
    public void testConstructorsWithNullAndNonNull() {
        // 1. Class-based constructor (Deprecated)
        StdValueInstantiator inst1 = new StdValueInstantiator(mockConfig, (Class<?>) null);
        assertEquals("UNKNOWN TYPE", inst1.getValueTypeDesc());
        assertEquals(Object.class, inst1.getValueClass());

        StdValueInstantiator inst2 = new StdValueInstantiator(mockConfig, Integer.class);
        assertEquals(Integer.class.getName(), inst2.getValueTypeDesc());
        assertEquals(Integer.class, inst2.getValueClass());

        // 2. JavaType-based constructor
        StdValueInstantiator inst3 = new StdValueInstantiator(mockConfig, (JavaType) null);
        assertEquals("UNKNOWN TYPE", inst3.getValueTypeDesc());
        assertEquals(Object.class, inst3.getValueClass());

        StdValueInstantiator inst4 = new StdValueInstantiator(mockConfig, mockJavaType);
        assertEquals("MockedJavaType", inst4.getValueTypeDesc());
        assertEquals(String.class, inst4.getValueClass());

        // 3. Copy constructor
        StdValueInstantiator inst5 = new StdValueInstantiator(inst4);
        assertEquals("MockedJavaType", inst5.getValueTypeDesc());
        assertEquals(String.class, inst5.getValueClass());
    }

    @Test
    public void testCanCreateFlagsAndGetters() {
        StdValueInstantiator inst = new StdValueInstantiator(mockConfig, mockJavaType);

        assertFalse(inst.canCreateFromString());
        assertFalse(inst.canCreateFromInt());
        assertFalse(inst.canCreateFromLong());
        assertFalse(inst.canCreateFromDouble());
        assertFalse(inst.canCreateFromBoolean());
        assertFalse(inst.canCreateUsingDefault());
        assertFalse(inst.canCreateUsingDelegate());
        assertFalse(inst.canCreateUsingArrayDelegate());
        assertFalse(inst.canCreateFromObjectWith());

        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        AnnotatedParameter param = mock(AnnotatedParameter.class);

        inst.configureFromStringCreator(creator);
        inst.configureFromIntCreator(creator);
        inst.configureFromLongCreator(creator);
        inst.configureFromDoubleCreator(creator);
        inst.configureFromBooleanCreator(creator);
        inst.configureIncompleteParameter(param);

        assertTrue(inst.canCreateFromString());
        assertTrue(inst.canCreateFromInt());
        assertTrue(inst.canCreateFromLong());
        assertTrue(inst.canCreateFromDouble());
        assertTrue(inst.canCreateFromBoolean());
        assertEquals(param, inst.getIncompleteParameter());
        assertEquals(creator, inst.getDelegateCreator());
        assertEquals(creator, inst.getArrayDelegateCreator());
        assertEquals(creator, inst.getDefaultCreator());
        assertEquals(creator, inst.getWithArgsCreator());
    }

    @Test
    public void testCreateUsingDefaultNull() throws IOException {
        StdValueInstantiator inst = new StdValueInstantiator(mockConfig, mockJavaType);
        // When _defaultCreator is null, it falls back to super (which throws UnsupportedOperationException or similar)
        try {
            inst.createUsingDefault(mockContext);
            fail("Expected exception for un-configured creator");
        } catch (UnsupportedOperationException e) {
            // Expected from ValueInstantiator super implementation
        }
    }

    @Test
    public void testCreateUsingDefaultSuccessAndException() throws Throwable {
        StdValueInstantiator inst = new StdValueInstantiator(mockConfig, mockJavaType);
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        when(creator.call()).thenReturn("DefaultInstance");
        inst.configureFromObjectSettings(creator, null, null, null, null, null);

        Object res = inst.createUsingDefault(mockContext);
        assertEquals("DefaultInstance", res);

        // Test exception handling & rewrapCtorProblem (InvocationTargetException)
        when(creator.call()).thenThrow(new InvocationTargetException(new RuntimeException("Inner error")));
        when(creator.getDeclaringClass()).thenAnswer(inv -> String.class);
        when(mockContext.instantiationException(any(), any())).thenReturn(new JsonMappingException(null, "Mapped"));

        inst.createUsingDefault(mockContext);
        verify(mockContext, times(1)).handleInstantiationProblem(eq(String.class), eq(null), any());
    }

    @Test
    public void testCreateFromObjectWithBranches() throws Throwable {
        StdValueInstantiator inst = new StdValueInstantiator(mockConfig, mockJavaType);
        AnnotatedWithParams creator = mock(AnnotatedWithParams.class);
        Object[] args = new Object[] { "arg1" };
        when(creator.call(args)).thenReturn("ObjectWithInstance");
        inst.configureFromObjectSettings(null, null, null, null, creator, null);

        Object res = inst.createFromObjectWith(mockContext, args);
        assertEquals("ObjectWithInstance", res);

        // Exception path (ExceptionInInitializerError)
        when(creator.call(args)).thenThrow(new ExceptionInInitializerError(new RuntimeException("Init error")));
        when(creator.getDeclaringClass()).thenAnswer(inv -> String.class);
        when(mockContext.instantiationException(any(), any())).thenReturn(new JsonMappingException(null, "Mapped"));

        inst.createFromObjectWith(mockContext, args);
        verify(mockContext, times(1)).handleInstantiationProblem(eq(String.class), eq(args), any());
    }

    @Test
    public void testCreateUsingDelegateFallback() throws IOException {
        StdValueInstantiator inst = new StdValueInstantiator(mockConfig, mockJavaType);
        AnnotatedWithParams arrayCreator = mock(AnnotatedWithParams.class);
        when(arrayCreator.call1("delegateVal")).thenReturn("ArrayDelegateInstance");
        
        // _delegateCreator is null, but _arrayDelegateCreator is set
        inst.configureFromArraySettings(arrayCreator, mockJavaType, null);

        Object res = inst.createUsingDelegate(mockContext, "delegateVal");
        assertEquals("ArrayDelegateInstance", res);
    }

    @Test
    public void testCreateUsingArrayDelegateFallbackToClassic() throws IOException {
        StdValueInstantiator inst = new StdValueInstantiator(mockConfig, mockJavaType);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        when(delegateCreator.call1("delegateVal")).thenReturn("ClassicDelegateInstance");
        
        // _arrayDelegateCreator is null, but _delegateCreator is set
        inst.configureFromObjectSettings(null, delegateCreator, mockJavaType, null, null, null);

        Object res = inst.createUsingArrayDelegate(mockContext, "delegateVal");
        assertEquals("ClassicDelegateInstance", res);
    }

    @Test
    public void testCreateUsingDelegateWithArgumentsAndInjectables() throws Throwable {
        StdValueInstantiator inst = new StdValueInstantiator(mockConfig, mockJavaType);
        AnnotatedWithParams delegateCreator = mock(AnnotatedWithParams.class);
        SettableBeanProperty prop = mock(SettableBeanProperty.class);
        when(prop.getInjectableValueId()).thenReturn("injectId");
        when(mockContext.findInjectableValue(eq("injectId"), eq(prop), isNull())).thenReturn("InjectedVal");

        SettableBeanProperty[] argsConfig = new SettableBeanProperty[] { null, prop };
        Object[] expectedArgs = new Object[] { "rawDelegate", "InjectedVal" };
        when(delegateCreator.call(expectedArgs)).thenReturn("ComplexDelegateInstance");

        inst.configureFromObjectSettings(null, delegateCreator, mockJavaType, argsConfig, null, null);

        Object res = inst.createUsingDelegate(mockContext, "rawDelegate");
        assertEquals("ComplexDelegateInstance", res);
    }

    @Test
    public void testScalarCreators() throws Throwable {
        StdValueInstantiator inst = new StdValueInstantiator(mockConfig, mockJavaType);
        AnnotatedWithParams strCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams intCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams longCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams doubleCreator = mock(AnnotatedWithParams.class);
        AnnotatedWithParams boolCreator = mock(AnnotatedWithParams.class);

        when(strCreator.call1("str")).thenReturn("StrInst");
        when(intCreator.call1(123)).thenReturn("IntInst");
        when(longCreator.call1(456L)).thenReturn("LongInst");
        when(doubleCreator.call1(78.9)).thenReturn("DoubleInst");
        when(boolCreator.call1(true)).thenReturn("BoolInst");

        inst.configureFromStringCreator(strCreator);
        inst.configureFromIntCreator(intCreator);
        inst.configureFromLongCreator(longCreator);
        inst.configureFromDoubleCreator(doubleCreator);
        inst.configureFromBooleanCreator(boolCreator);

        assertEquals("StrInst", inst.createFromString(mockContext, "str"));
        assertEquals("IntInst", inst.createFromInt(mockContext, 123));
        assertEquals("LongInst", inst.createFromLong(mockContext, 456L));
        assertEquals("DoubleInst", inst.createFromDouble(mockContext, 78.9));
        assertEquals("BoolInst", inst.createFromBoolean(mockContext, true));

        // Test Int widended to Long creator branch (when _fromIntCreator is null)
        StdValueInstantiator instLongFallback = new StdValueInstantiator(mockConfig, mockJavaType);
        instLongFallback.configureFromLongCreator(longCreator);
        when(longCreator.call1(123L)).thenReturn("WidenedLongInst");
        assertEquals("WidenedLongInst", instLongFallback.createFromInt(mockContext, 123));
    }
}
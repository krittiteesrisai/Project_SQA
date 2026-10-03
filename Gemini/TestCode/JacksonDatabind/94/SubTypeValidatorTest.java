package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.fail;

public class SubTypeValidatorTest {

    private final SubTypeValidator validator = SubTypeValidator.instance();
    private final DeserializationContext context = Mockito.mock(DeserializationContext.class);

    @Test
    public void testInstanceSingleton() {
        org.junit.Assert.assertNotNull(SubTypeValidator.instance());
        org.junit.Assert.assertSame(SubTypeValidator.instance(), validator);
    }

    @Test(expected = JsonMappingException.class)
    public void testValidateSubType_IllegalClass_DirectMatch() throws JsonMappingException {
        // Trigger Branch 1: _cfgIllegalClassNames.contains(full) == true
        JavaType type = TypeFactory.defaultInstance().constructType(
                org.apache.commons.collections.functors.InvokerTransformer.class
        );
        validator.validateSubType(context, type);
    }

    @Test
    public void testValidateSubType_SafeClass() throws JsonMappingException {
        // Trigger Branch: Normal safe class (e.g., String) -> should pass without exception
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        validator.validateSubType(context, type);
    }

    @Test
    public void testValidateSubType_SpringInterface_ShouldPass() throws JsonMappingException {
        // Trigger Branch: raw.isInterface() == true (Even with Spring prefix, interfaces are ignored)
        JavaType type = TypeFactory.defaultInstance().constructType(org.springframework.beans.factory.ObjectFactory.class);
        // Note: ObjectFactory is in DEFAULT_NO_DESER_CLASS_NAMES, let's use a safe interface or mock it
        // Or test a generic interface starting with org.springframework.
        // Let's use a custom or standard safe Spring interface if available, or mock JavaType.
        JavaType mockType = Mockito.mock(JavaType.class);
        Class<?> mockClass = Mockito.mock(Class.class);
        Mockito.when(mockType.getRawClass()).thenReturn((Class) mockClass);
        Mockito.when(mockClass.isInterface()).thenReturn(true);
        Mockito.when(mockClass.getName()).thenReturn("org.springframework.some.CustomInterface");

        validator.validateSubType(context, mockType);
    }

    @Test(expected = JsonMappingException.class)
    public void testValidateSubType_SpringAbstractPointcutAdvisor() throws JsonMappingException {
        // Trigger Branch: Spring class matching "AbstractPointcutAdvisor" in hierarchy
        JavaType type = TypeFactory.defaultInstance().constructType(
                org.springframework.aop.support.AbstractPointcutAdvisor.class
        );
        validator.validateSubType(context, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testValidateSubType_SpringAbstractApplicationContext() throws JsonMappingException {
        // Trigger Branch: Spring class matching "AbstractApplicationContext" in hierarchy
        JavaType type = TypeFactory.defaultInstance().constructType(
                org.springframework.context.support.ClassPathXmlApplicationContext.class
        );
        validator.validateSubType(context, type);
    }

    @Test
    public void testValidateSubType_SpringSafeClass() throws JsonMappingException {
        // Trigger Branch: Spring class but NOT dangerous (reaches end of loop, no exception)
        JavaType type = TypeFactory.defaultInstance().constructType(
                org.springframework.core.io.ByteArrayResource.class
        );
        validator.validateSubType(context, type);
    }

    @Test
    public void testValidateSubType_SuperclassChainLoopTermination() throws JsonMappingException {
        // Edge Case: Class hierarchy reaching Object.class or null superclass safely
        JavaType type = TypeFactory.defaultInstance().constructType(
                org.springframework.http.HttpHeaders.class
        );
        validator.validateSubType(context, type);
    }
}
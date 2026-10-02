package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.JsonDeserializer;

import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_deser_std_NumberDeserializersTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method find(java.lang.Class, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberDeserializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NumberDeserializers#find(java.lang.Class,java.lang.String)}
 * @utbot.executesCondition {@code (rawType.isPrimitive()): True}
 * @utbot.executesCondition {@code (rawType == Integer.TYPE): False}
 * @utbot.executesCondition {@code (rawType == Boolean.TYPE): False}
 * @utbot.executesCondition {@code (rawType == Long.TYPE): False}
 * @utbot.executesCondition {@code (rawType == Double.TYPE): False}
 * @utbot.executesCondition {@code (rawType == Character.TYPE): False}
 * @utbot.executesCondition {@code (rawType == Byte.TYPE): False}
 * @utbot.executesCondition {@code (rawType == Short.TYPE): False}
 * @utbot.executesCondition {@code (rawType == Float.TYPE): False}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 *  */
    @Test
    public void testFind_RawTypeNotEqualsFloatTYPE() {
        Class class1 = Object.class;
        
        JsonDeserializer actual = NumberDeserializers.find(class1, null);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method find(java.lang.Class, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberDeserializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.NumberDeserializers#find(java.lang.Class,java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: rawType.isPrimitive()
 *  */
    @Test
    public void testFind_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers.find(NumberDeserializers.java:43) */
        NumberDeserializers.find(null, null);
    }
    ///endregion
    
    ///endregion
}


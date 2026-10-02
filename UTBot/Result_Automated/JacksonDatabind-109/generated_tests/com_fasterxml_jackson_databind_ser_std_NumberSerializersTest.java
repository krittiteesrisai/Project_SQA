package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import java.util.Map;
import java.util.LinkedHashMap;

import static java.util.Collections.emptyMap;

public final class com_fasterxml_jackson_databind_ser_std_NumberSerializersTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.NumberSerializers.addAll
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link NumberSerializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializers#addAll(java.util.Map)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: allDeserializers.put(Integer.class.getName(), new IntegerSerializer(Integer.class));
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializers.addAll] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.NumberSerializers.addAll(NumberSerializers.java:26) */
        NumberSerializers.addAll(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method addAll(java.util.Map)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializers}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.NumberSerializers#addAll(java.util.Map)}
     */
    @Test
    public void testAddAllThrowsUOE() {
        Map map = emptyMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.NumberSerializers.addAll] produces [java.lang.UnsupportedOperationException]
            java.base/java.util.AbstractMap.put(AbstractMap.java:209)
            com.fasterxml.jackson.databind.ser.std.NumberSerializers.addAll(NumberSerializers.java:26) */
        NumberSerializers.addAll(map);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAll(java.util.Map)
    
    @Test
    public void testAddAll1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        NumberSerializers.addAll(linkedHashMap);
    }
    
    @Test
    public void testAddAll2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(null, null);
        
        NumberSerializers.addAll(linkedHashMap);
    }
    ///endregion
    
    ///endregion
}


package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.JsonDeserializer;

import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_deser_std_JdkDeserializersTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.JdkDeserializers.find
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method find(java.lang.Class, java.lang.String)
    
    @Test
    public void testFind1() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonDeserializer actual = JdkDeserializers.find(null, string);
        
        assertNull(actual);
    }
    
    @Test
    public void testFind2() {
        String string = "\u0000";
        
        JsonDeserializer actual = JdkDeserializers.find(null, string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
}


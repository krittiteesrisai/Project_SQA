package com.fasterxml.jackson.core;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_core_JsonPointerTest {
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (!(o instanceof JsonPointer)): True}
 *  */
    @Test
    public void testEquals_NotOInstanceOfJsonPointer() {
        JsonPointer jsonPointer = new JsonPointer();
        byte[] byteArray = {};
        
        boolean actual = jsonPointer.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() {
        JsonPointer jsonPointer = new JsonPointer();
        
        boolean actual = jsonPointer.equals(jsonPointer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() {
        JsonPointer jsonPointer = new JsonPointer();
        
        boolean actual = jsonPointer.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (!(o instanceof JsonPointer)): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return _asString.equals(((JsonPointer) o)._asString);}
 *  */
    @Test
    public void testEquals_ONotInstanceOfJsonPointer() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = " ";
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        JsonPointer jsonPointer1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        setField(jsonPointer1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        
        boolean actual = jsonPointer.equals(jsonPointer1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (!(o instanceof JsonPointer)): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _asString.equals(((JsonPointer) o)._asString);
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer jsonPointer1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer.equals] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.JsonPointer.equals(JsonPointer.java:176) */
        jsonPointer.equals(jsonPointer1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#toString()}
 * @utbot.returnsFrom {@code return _asString;}
 *  */
    @Test
    public void testToString_Return_asString() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        
        String actual = jsonPointer.toString();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#hashCode()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return _asString.hashCode();}
 *  */
    @Test
    public void testHashCode_StringHashCode() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = " ";
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        
        int actual = jsonPointer.hashCode();
        
        assertEquals(32, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#hashCode()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public int hashCode() {
 *     return _asString.hashCode();
 * }
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer.hashCode] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.JsonPointer.hashCode(JsonPointer.java:170) */
        jsonPointer.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.valueOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method valueOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#valueOf(java.lang.String)}
 * @utbot.returnsFrom {@code return compile(input);}
 *  */
    @Test
    public void testValueOf_ReturnCompile() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "";
            
            JsonPointer actual = JsonPointer.valueOf(string);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(empty, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#valueOf(java.lang.String)}
 * @utbot.returnsFrom {@code return compile(input);}
 *  */
    @Test
    public void testValueOf_ReturnCompile_1() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            
            JsonPointer actual = JsonPointer.valueOf(null);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(empty, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#valueOf(java.lang.String)}
 * @utbot.returnsFrom {@code return compile(input);}
 *  */
    @Test
    public void testValueOf_ReturnCompile_2() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "/";
            
            JsonPointer actual = JsonPointer.valueOf(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#valueOf(java.lang.String)}
 * @utbot.returnsFrom {@code return compile(input);}
 *  */
    @Test
    public void testValueOf_ReturnCompile_3() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "/~";
            
            JsonPointer actual = JsonPointer.valueOf(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "~";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#valueOf(java.lang.String)}
 * @utbot.returnsFrom {@code return compile(input);}
 *  */
    @Test
    public void testValueOf_ReturnCompile_4() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "/0";
            
            JsonPointer actual = JsonPointer.valueOf(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "0";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#valueOf(java.lang.String)}
 * @utbot.returnsFrom {@code return compile(input);}
 *  */
    @Test
    public void testValueOf_ReturnCompile_5() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "/~1~";
            
            JsonPointer actual = JsonPointer.valueOf(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "/~";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method valueOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#valueOf(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonPointer#compile(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * Alias for {@link #compile}; added to make instances automatically
 *  * deserializable by Jackson databind.
 *  */
 * public static JsonPointer valueOf(String input) {
 *     return compile(input);
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_ThrowIllegalArgumentException() {
        String string = " ";
        
        JsonPointer.valueOf(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method valueOf(java.lang.String)
    
    @Test
    public void testValueOf1() throws Exception  {
        String string = "/~0~1/";
        
        JsonPointer actual = JsonPointer.valueOf(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        String _matchingPropertyName = "~/";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValueOf2() throws Exception  {
        String string = "//\u0000\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.valueOf(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/\u0000\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValueOf3() throws Exception  {
        String string = "//~1~";
        
        JsonPointer actual = JsonPointer.valueOf(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/~1~";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "/~";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValueOf4() throws Exception  {
        String string = "//~1~\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.valueOf(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/~1~\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "/~\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValueOf5() throws Exception  {
        String string = "/~1/~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.valueOf(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        String _matchingPropertyName1 = "/";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValueOf6() throws Exception  {
        String string = "/\u0000/\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.valueOf(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        String _matchingPropertyName1 = "\u0000";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValueOf7() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "/02";
            
            JsonPointer actual = JsonPointer.valueOf(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString1 = "";
            setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
            setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString1);
            setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "02";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", 2);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testValueOf8() throws Exception  {
        String string = "/~0//\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.valueOf(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment2 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment2);
        String _asString1 = "/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString2 = "//\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString2);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        String _matchingPropertyName1 = "~";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValueOf9() throws Exception  {
        String string = "/\u0000\u0000//\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.valueOf(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment2 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment2);
        String _asString1 = "/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString2 = "//\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString2);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        String _matchingPropertyName1 = "\u0000\u0000";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValueOf10() throws Exception  {
        String string = "//~0/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.valueOf(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment2 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment2);
        String _asString1 = "/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString2 = "/~0/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString2);
        String _matchingPropertyName1 = "~";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValueOf11() throws Exception  {
        String string = "//\u0000\u0000/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.valueOf(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment2 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment2);
        String _asString1 = "/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString2 = "/\u0000\u0000/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString2);
        String _matchingPropertyName1 = "\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValueOf12() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "//~";
            
            JsonPointer actual = JsonPointer.valueOf(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString1 = "";
            setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
            setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString1);
            setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
            String _asString2 = "/~";
            setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString2);
            String _matchingPropertyName1 = "~";
            setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.matches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matches()
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#matches()}
 * @utbot.returnsFrom {@code return _nextSegment == null;}
 *  */
    @Test
    public void testMatches_Return_nextSegmentNotEqualsNull() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        
        boolean actual = jsonPointer.matches();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#matches()}
 * @utbot.returnsFrom {@code return _nextSegment == null;}
 *  */
    @Test
    public void testMatches_Return_nextSegmentNotEqualsNull_1() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        
        boolean actual = jsonPointer.matches();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.compile
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compile(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#compile(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 *  */
    @Test
    public void testCompile_InputNotEqualsNull() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "";
            
            JsonPointer actual = JsonPointer.compile(string);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(empty, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#compile(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): True}
 *  */
    @Test
    public void testCompile_InputEqualsNull() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            
            JsonPointer actual = JsonPointer.compile(null);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(empty, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#compile(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return _parseTail(input);}
 *  */
    @Test
    public void testCompile_InputNotEqualsNull_1() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "/";
            
            JsonPointer actual = JsonPointer.compile(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#compile(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return _parseTail(input);}
 *  */
    @Test
    public void testCompile_InputNotEqualsNull_2() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "/~";
            
            JsonPointer actual = JsonPointer.compile(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "~";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#compile(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return _parseTail(input);}
 *  */
    @Test
    public void testCompile_InputNotEqualsNull_3() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "/0";
            
            JsonPointer actual = JsonPointer.compile(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "0";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#compile(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.returnsFrom {@code return _parseTail(input);}
 *  */
    @Test
    public void testCompile_InputNotEqualsNull_4() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "/~1~";
            
            JsonPointer actual = JsonPointer.compile(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "/~";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#compile(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: input.charAt(0) != '/'
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCompile_ThrowIllegalArgumentException() {
        String string = " ";
        
        JsonPointer.compile(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method compile(java.lang.String)
    
    @Test
    public void testCompile1() throws Exception  {
        String string = "/~0~1/";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        String _matchingPropertyName = "~/";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCompile2() throws Exception  {
        String string = "//\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCompile3() throws Exception  {
        String string = "//~1~\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/~1~\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "/~\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCompile4() throws Exception  {
        String string = "//\u0000\u0000~";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/\u0000\u0000~";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000\u0000~";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCompile5() throws Exception  {
        String string = "//~\u0000~";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/~\u0000~";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "~\u0000~";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCompile6() throws Exception  {
        String string = "/\u0000/\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        String _matchingPropertyName1 = "\u0000";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCompile7() throws Exception  {
        String string = "/~0/~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString1 = "/~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        String _matchingPropertyName1 = "~";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCompile8() throws Exception  {
        String string = "/ //";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment2 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment2);
        String _asString1 = "/";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString2 = "//";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString2);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        String _matchingPropertyName = " ";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCompile9() throws Exception  {
        String string = "/~0//\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment2 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment2);
        String _asString1 = "/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString2 = "//\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString2);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        String _matchingPropertyName1 = "~";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCompile10() throws Exception  {
        String string = "//  /                                   ";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment2 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment2);
        String _asString1 = "/                                   ";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "                                   ";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString2 = "/  /                                   ";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString2);
        String _matchingPropertyName1 = "  ";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCompile11() throws Exception  {
        String string = "//~0/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JsonPointer actual = JsonPointer.compile(string);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment1 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment2 = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment2, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment2);
        String _asString1 = "/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(_nextSegment1, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment1);
        String _asString2 = "/~0/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString2);
        String _matchingPropertyName1 = "~";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.tail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tail()
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#tail()}
 * @utbot.returnsFrom {@code return _nextSegment;}
 *  */
    @Test
    public void testTail_Return_nextSegment() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        
        JsonPointer actual = jsonPointer.tail();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.getMatchingProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMatchingProperty()
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#getMatchingProperty()}
 * @utbot.returnsFrom {@code return _matchingPropertyName;}
 *  */
    @Test
    public void testGetMatchingProperty_Return_matchingPropertyName() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        
        String actual = jsonPointer.getMatchingProperty();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.mayMatchProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mayMatchProperty()
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#mayMatchProperty()}
 * @utbot.returnsFrom {@code return _matchingPropertyName != null;}
 *  */
    @Test
    public void testMayMatchProperty_Return_matchingPropertyNameEqualsNull() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        
        boolean actual = jsonPointer.mayMatchProperty();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#mayMatchProperty()}
 * @utbot.returnsFrom {@code return _matchingPropertyName != null;}
 *  */
    @Test
    public void testMayMatchProperty_Return_matchingPropertyNameEqualsNull_1() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _matchingPropertyName = "";
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        
        boolean actual = jsonPointer.mayMatchProperty();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer._parseIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parseIndex(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseIndex(java.lang.String)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > 10): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 *  */
    @Test
    public void test_parseIndex_CLessThan0() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringType = Class.forName("java.lang.String");
        Method _parseIndexMethod = jsonPointerClazz.getDeclaredMethod("_parseIndex", stringType);
        _parseIndexMethod.setAccessible(true);
        java.lang.Object[] _parseIndexMethodArguments = new java.lang.Object[1];
        _parseIndexMethodArguments[0] = string;
        int actual = ((Integer) _parseIndexMethod.invoke(null, _parseIndexMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseIndex(java.lang.String)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > 10): False}
 * @utbot.executesCondition {@code (len == 10): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.returnsFrom {@code return NumberInput.parseInt(str);}
 *  */
    @Test
    public void test_parseIndex_LenNotEquals10() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "2";
        
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringType = Class.forName("java.lang.String");
        Method _parseIndexMethod = jsonPointerClazz.getDeclaredMethod("_parseIndex", stringType);
        _parseIndexMethod.setAccessible(true);
        java.lang.Object[] _parseIndexMethodArguments = new java.lang.Object[1];
        _parseIndexMethodArguments[0] = string;
        int actual = ((Integer) _parseIndexMethod.invoke(null, _parseIndexMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseIndex(java.lang.String)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > 10): False}
 * @utbot.executesCondition {@code (len == 10): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} twice
 * @utbot.returnsFrom {@code return NumberInput.parseInt(str);}
 *  */
    @Test
    public void test_parseIndex_LenNotEquals10_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "22";
        
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringType = Class.forName("java.lang.String");
        Method _parseIndexMethod = jsonPointerClazz.getDeclaredMethod("_parseIndex", stringType);
        _parseIndexMethod.setAccessible(true);
        java.lang.Object[] _parseIndexMethodArguments = new java.lang.Object[1];
        _parseIndexMethodArguments[0] = string;
        int actual = ((Integer) _parseIndexMethod.invoke(null, _parseIndexMethodArguments));
        
        assertEquals(22, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseIndex(java.lang.String)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > 10): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} twice
 *  */
    @Test
    public void test_parseIndex_CGreaterThan9() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "2:";
        
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringType = Class.forName("java.lang.String");
        Method _parseIndexMethod = jsonPointerClazz.getDeclaredMethod("_parseIndex", stringType);
        _parseIndexMethod.setAccessible(true);
        java.lang.Object[] _parseIndexMethodArguments = new java.lang.Object[1];
        _parseIndexMethodArguments[0] = string;
        int actual = ((Integer) _parseIndexMethod.invoke(null, _parseIndexMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseIndex(java.lang.String)}
 * @utbot.executesCondition {@code (len == 0): True}
 *  */
    @Test
    public void test_parseIndex_LenEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringType = Class.forName("java.lang.String");
        Method _parseIndexMethod = jsonPointerClazz.getDeclaredMethod("_parseIndex", stringType);
        _parseIndexMethod.setAccessible(true);
        java.lang.Object[] _parseIndexMethodArguments = new java.lang.Object[1];
        _parseIndexMethodArguments[0] = string;
        int actual = ((Integer) _parseIndexMethod.invoke(null, _parseIndexMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseIndex(java.lang.String)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > 10): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 *  */
    @Test
    public void test_parseIndex_CGreaterThan9_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = ": ";
        
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringType = Class.forName("java.lang.String");
        Method _parseIndexMethod = jsonPointerClazz.getDeclaredMethod("_parseIndex", stringType);
        _parseIndexMethod.setAccessible(true);
        java.lang.Object[] _parseIndexMethodArguments = new java.lang.Object[1];
        _parseIndexMethodArguments[0] = string;
        int actual = ((Integer) _parseIndexMethod.invoke(null, _parseIndexMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseIndex(java.lang.String)}
 * @utbot.executesCondition {@code (len == 0): False}
 * @utbot.executesCondition {@code (len > 10): True}
 *  */
    @Test
    public void test_parseIndex_LenGreaterThan10() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "           ";
        
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringType = Class.forName("java.lang.String");
        Method _parseIndexMethod = jsonPointerClazz.getDeclaredMethod("_parseIndex", stringType);
        _parseIndexMethod.setAccessible(true);
        java.lang.Object[] _parseIndexMethodArguments = new java.lang.Object[1];
        _parseIndexMethodArguments[0] = string;
        int actual = ((Integer) _parseIndexMethod.invoke(null, _parseIndexMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseIndex(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseIndex(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int len = str.length();
 *  */
    @Test
    public void test_parseIndex_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer._parseIndex] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.JsonPointer._parseIndex(JsonPointer.java:186) */
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringType = Class.forName("java.lang.String");
        Method _parseIndexMethod = jsonPointerClazz.getDeclaredMethod("_parseIndex", stringType);
        _parseIndexMethod.setAccessible(true);
        java.lang.Object[] _parseIndexMethodArguments = new java.lang.Object[1];
        _parseIndexMethodArguments[0] = ((Object) null);
        try {
            _parseIndexMethod.invoke(null, _parseIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _parseIndex(java.lang.String)
    
    @Test
    public void test_parseIndex1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "2222222222";
        
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringType = Class.forName("java.lang.String");
        Method _parseIndexMethod = jsonPointerClazz.getDeclaredMethod("_parseIndex", stringType);
        _parseIndexMethod.setAccessible(true);
        java.lang.Object[] _parseIndexMethodArguments = new java.lang.Object[1];
        _parseIndexMethodArguments[0] = string;
        int actual = ((Integer) _parseIndexMethod.invoke(null, _parseIndexMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer._parseTail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _parseTail(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < end; )} once
 * @utbot.returnsFrom {@code return new JsonPointer(input, input.substring(1), EMPTY);}
 *  */
    @Test
    public void test_parseTail_CNotEqualsChar() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " 0";
            
            JsonPointer actual = JsonPointer._parseTail(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "0";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.returnsFrom {@code return new JsonPointer(input, input.substring(1), EMPTY);}
 *  */
    @Test
    public void test_parseTail_Return() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " ";
            
            JsonPointer actual = JsonPointer._parseTail(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < end; )} once
 * @utbot.returnsFrom {@code return _parseQuotedTail(input, i);}
 *  */
    @Test
    public void test_parseTail_CEqualsChar() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " ~1~";
            
            JsonPointer actual = JsonPointer._parseTail(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "/~";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < end; )} once
 * @utbot.returnsFrom {@code return _parseQuotedTail(input, i);}
 *  */
    @Test
    public void test_parseTail_CEqualsChar_1() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " ~ ";
            
            JsonPointer actual = JsonPointer._parseTail(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "~ ";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < end; )} once
 * @utbot.returnsFrom {@code return _parseQuotedTail(input, i);}
 *  */
    @Test
    public void test_parseTail_CEqualsChar_2() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " ~1 ";
            
            JsonPointer actual = JsonPointer._parseTail(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "/ ";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < end; )} once
 * @utbot.returnsFrom {@code return _parseQuotedTail(input, i);}
 *  */
    @Test
    public void test_parseTail_CEqualsChar_3() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " ~0~0";
            
            JsonPointer actual = JsonPointer._parseTail(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "~~";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < end; )} twice
 * @utbot.returnsFrom {@code return _parseQuotedTail(input, i);}
 *  */
    @Test
    public void test_parseTail_CEqualsChar_4() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " \u0000~1";
            
            JsonPointer actual = JsonPointer._parseTail(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "\u0000/";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _parseTail(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#charAt(int)} twice,
    ///     {@link java.lang.String#substring(int)} twice
    /// return from: {@code return new JsonPointer(input, input.substring(1), EMPTY);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < end; )} once
 * @utbot.returnsFrom {@code return new JsonPointer(input, input.substring(1), EMPTY);}
 *  */
    @Test
    public void test_parseTail_CNotEqualsChar_1() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " :";
            
            JsonPointer actual = JsonPointer._parseTail(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = ":";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < end; )} once
 * @utbot.returnsFrom {@code return new JsonPointer(input, input.substring(1), EMPTY);}
 *  */
    @Test
    public void test_parseTail_CNotEqualsChar_2() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " \u0000";
            
            JsonPointer actual = JsonPointer._parseTail(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "\u0000";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < end; )} once
 * @utbot.returnsFrom {@code return new JsonPointer(input, input.substring(1), EMPTY);}
 *  */
    @Test
    public void test_parseTail_CEqualsChar_5() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " ~";
            
            JsonPointer actual = JsonPointer._parseTail(string);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "~";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseTail(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return new JsonPointer(input, input.substring(1), EMPTY);
 *  */
    @Test
    public void test_parseTail_ThrowStringIndexOutOfBoundsException() {
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer._parseTail] produces [java.lang.StringIndexOutOfBoundsException: begin 1, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            java.base/java.lang.String.substring(String.java:2684)
            com.fasterxml.jackson.core.JsonPointer._parseTail(JsonPointer.java:226) */
        JsonPointer._parseTail(string);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int end = input.length();
 *  */
    @Test
    public void test_parseTail_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer._parseTail] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.JsonPointer._parseTail(JsonPointer.java:209) */
        JsonPointer._parseTail(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _parseTail(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.JsonPointer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
     */
    @Test
    public void test_parseTailWithNonEmptyString() throws Exception  {
        JsonPointer actual = JsonPointer._parseTail("\u0014\n\t\r");
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        String _asString1 = "\u0014\n\t\r";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "\n\t\r";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.JsonPointer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseTail(java.lang.String)}
     */
    @Test
    public void test_parseTailWithNonEmptyString1() throws Exception  {
        JsonPointer actual = JsonPointer._parseTail("-[3");
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        String _asString1 = "-[3";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "[3";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer._parseQuotedTail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parseQuotedTail(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
 * @utbot.returnsFrom {@code return new JsonPointer(input, sb.toString(), EMPTY);}
 *  */
    @Test
    public void test_parseQuotedTail_Return() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "0";
            
            JsonPointer actual = JsonPointer._parseQuotedTail(string, 0);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "~";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
 * @utbot.returnsFrom {@code return new JsonPointer(input, sb.toString(), EMPTY);}
 *  */
    @Test
    public void test_parseQuotedTail_Return_1() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "1";
            
            JsonPointer actual = JsonPointer._parseQuotedTail(string, 0);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "/";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
 * @utbot.returnsFrom {@code return new JsonPointer(input, sb.toString(), EMPTY);}
 *  */
    @Test
    public void test_parseQuotedTail_Return_2() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = " ";
            
            JsonPointer actual = JsonPointer._parseQuotedTail(string, 0);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "~ ";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
 * @utbot.iterates iterate the loop {@code while(i < end)} once
 * @utbot.returnsFrom {@code return new JsonPointer(input, sb.toString(), EMPTY);}
 *  */
    @Test
    public void test_parseQuotedTail_CNotEqualsChar() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "0 ";
            
            JsonPointer actual = JsonPointer._parseQuotedTail(string, 0);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "~ ";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
 * @utbot.iterates iterate the loop {@code while(i < end)} once
 * @utbot.returnsFrom {@code return new JsonPointer(input, sb.toString(), EMPTY);}
 *  */
    @Test
    public void test_parseQuotedTail_IGreaterOrEqualEnd() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "1~";
            
            JsonPointer actual = JsonPointer._parseQuotedTail(string, 0);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "/~";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
 * @utbot.iterates iterate the loop {@code while(i < end)} once
 * @utbot.returnsFrom {@code return new JsonPointer(input, sb.toString(), EMPTY);}
 *  */
    @Test
    public void test_parseQuotedTail_ILessThanEnd() throws Exception  {
        JsonPointer prevEMPTY = JsonPointer.EMPTY;
        try {
            JsonPointer empty = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            String _asString = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
            String _matchingPropertyName = "";
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
            setField(empty, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
            setStaticField(jsonPointerClazz, "EMPTY", empty);
            String string = "1~1";
            
            JsonPointer actual = JsonPointer._parseQuotedTail(string, 0);
            
            JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", empty);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", string);
            String _matchingPropertyName1 = "//";
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName1);
            setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
            
            // com.fasterxml.jackson.core.JsonPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonPointer.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseQuotedTail(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
 * @utbot.executesCondition {@code (i > 2): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: sb.append(input, 1, i - 1);
 *  */
    @Test
    public void test_parseQuotedTail_ThrowIndexOutOfBoundsException() {
        String string = " ";
        
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer._parseQuotedTail] produces [java.lang.IndexOutOfBoundsException: start 1, end 2, length 1]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:218)
            com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(JsonPointer.java:240) */
        JsonPointer._parseQuotedTail(string, 3);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
 * @utbot.executesCondition {@code (i > 2): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: _appendEscape(sb, input.charAt(i++));
 *  */
    @Test
    public void test_parseQuotedTail_ThrowStringIndexOutOfBoundsException() {
        String string = " ";
        
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer._parseQuotedTail] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 2]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(JsonPointer.java:242) */
        JsonPointer._parseQuotedTail(string, 2);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
 * @utbot.executesCondition {@code (i > 2): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: _appendEscape(sb, input.charAt(i++));
 *  */
    @Test
    public void test_parseQuotedTail_ThrowStringIndexOutOfBoundsException_1() {
        String string = "  ";
        
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer._parseQuotedTail] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(JsonPointer.java:242) */
        JsonPointer._parseQuotedTail(string, 3);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int end = input.length();
 *  */
    @Test
    public void test_parseQuotedTail_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer._parseQuotedTail] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.JsonPointer._parseQuotedTail(JsonPointer.java:237) */
        JsonPointer._parseQuotedTail(null, -255);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method _parseQuotedTail(java.lang.String, int)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.core.JsonPointer}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_parseQuotedTail(java.lang.String,int)}
     */
    @Test
    public void test_parseQuotedTailWithNonEmptyStringAndCornerCase() throws Exception  {
        JsonPointer actual = JsonPointer._parseQuotedTail("-3", 0);
        
        JsonPointer expected = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        String _asString = "";
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _asString);
        setField(_nextSegment, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        String _asString1 = "-3";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_asString", _asString1);
        String _matchingPropertyName = "~-3";
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        setField(expected, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.mayMatchElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mayMatchElement()
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#mayMatchElement()}
 * @utbot.returnsFrom {@code return _matchingElementIndex >= 0;}
 *  */
    @Test
    public void testMayMatchElement_Return_matchingElementIndexLessThanZero() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        boolean actual = jsonPointer.mayMatchElement();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#mayMatchElement()}
 * @utbot.returnsFrom {@code return _matchingElementIndex >= 0;}
 *  */
    @Test
    public void testMayMatchElement_Return_matchingElementIndexLessThanZero_1() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        
        boolean actual = jsonPointer.mayMatchElement();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.matchProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#matchProperty(java.lang.String)}
 * @utbot.executesCondition {@code (_nextSegment == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testMatchProperty__nextSegmentEqualsNull() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        
        JsonPointer actual = jsonPointer.matchProperty(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#matchProperty(java.lang.String)}
 * @utbot.executesCondition {@code (_nextSegment == null): False}
 * @utbot.executesCondition {@code (!_matchingPropertyName.equals(name)): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testMatchProperty_Not_matchingPropertyNameEquals() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        String _matchingPropertyName = " ";
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        
        JsonPointer actual = jsonPointer.matchProperty(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#matchProperty(java.lang.String)}
 * @utbot.executesCondition {@code (_nextSegment == null): False}
 * @utbot.executesCondition {@code (!_matchingPropertyName.equals(name)): False}
 * @utbot.returnsFrom {@code return _nextSegment;}
 *  */
    @Test
    public void testMatchProperty__matchingPropertyNameEquals() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        String _matchingPropertyName = " ";
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_matchingPropertyName", _matchingPropertyName);
        
        JsonPointer actual = jsonPointer.matchProperty(_matchingPropertyName);
        
        // com.fasterxml.jackson.core.JsonPointer has overridden equals method
        assertEquals(_nextSegment, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#matchProperty(java.lang.String)}
 * @utbot.executesCondition {@code (_nextSegment == null): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _nextSegment == null || !_matchingPropertyName.equals(name)
 *  */
    @Test
    public void testMatchProperty_ThrowNullPointerException() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        JsonPointer _nextSegment = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_nextSegment", _nextSegment);
        
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer.matchProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.JsonPointer.matchProperty(JsonPointer.java:142) */
        jsonPointer.matchProperty(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer._appendEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _appendEscape(java.lang.StringBuilder, char)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_appendEscape(java.lang.StringBuilder,char)}
 * @utbot.executesCondition {@code (c == '1'): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 *  */
    @Test
    public void test_appendEscape_CNotEquals1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class charType = char.class;
        Method _appendEscapeMethod = jsonPointerClazz.getDeclaredMethod("_appendEscape", stringBuilderType, charType);
        _appendEscapeMethod.setAccessible(true);
        java.lang.Object[] _appendEscapeMethodArguments = new java.lang.Object[2];
        _appendEscapeMethodArguments[0] = stringBuilder;
        _appendEscapeMethodArguments[1] = ' ';
        _appendEscapeMethod.invoke(null, _appendEscapeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_appendEscape(java.lang.StringBuilder,char)}
 * @utbot.executesCondition {@code (c == '1'): True}
 *  */
    @Test
    public void test_appendEscape_CEquals1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class charType = char.class;
        Method _appendEscapeMethod = jsonPointerClazz.getDeclaredMethod("_appendEscape", stringBuilderType, charType);
        _appendEscapeMethod.setAccessible(true);
        java.lang.Object[] _appendEscapeMethodArguments = new java.lang.Object[2];
        _appendEscapeMethodArguments[0] = stringBuilder;
        _appendEscapeMethodArguments[1] = '1';
        _appendEscapeMethod.invoke(null, _appendEscapeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _appendEscape(java.lang.StringBuilder, char)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_appendEscape(java.lang.StringBuilder,char)}
 * @utbot.executesCondition {@code (c == '0'): False}
 * @utbot.executesCondition {@code (c == '1'): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append('~');
 *  */
    @Test
    public void test_appendEscape_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer._appendEscape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.JsonPointer._appendEscape(JsonPointer.java:266) */
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class charType = char.class;
        Method _appendEscapeMethod = jsonPointerClazz.getDeclaredMethod("_appendEscape", stringBuilderType, charType);
        _appendEscapeMethod.setAccessible(true);
        java.lang.Object[] _appendEscapeMethodArguments = new java.lang.Object[2];
        _appendEscapeMethodArguments[0] = ((Object) null);
        _appendEscapeMethodArguments[1] = ' ';
        try {
            _appendEscapeMethod.invoke(null, _appendEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_appendEscape(java.lang.StringBuilder,char)}
 * @utbot.executesCondition {@code (c == '0'): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(c);
 *  */
    @Test
    public void test_appendEscape_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer._appendEscape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.JsonPointer._appendEscape(JsonPointer.java:268) */
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class charType = char.class;
        Method _appendEscapeMethod = jsonPointerClazz.getDeclaredMethod("_appendEscape", stringBuilderType, charType);
        _appendEscapeMethod.setAccessible(true);
        java.lang.Object[] _appendEscapeMethodArguments = new java.lang.Object[2];
        _appendEscapeMethodArguments[0] = ((Object) null);
        _appendEscapeMethodArguments[1] = '0';
        try {
            _appendEscapeMethod.invoke(null, _appendEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#_appendEscape(java.lang.StringBuilder,char)}
 * @utbot.executesCondition {@code (c == '0'): False}
 * @utbot.executesCondition {@code (c == '1'): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(c);
 *  */
    @Test
    public void test_appendEscape_ThrowNullPointerException_2() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.core.JsonPointer._appendEscape] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.JsonPointer._appendEscape(JsonPointer.java:268) */
        Class jsonPointerClazz = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class charType = char.class;
        Method _appendEscapeMethod = jsonPointerClazz.getDeclaredMethod("_appendEscape", stringBuilderType, charType);
        _appendEscapeMethod.setAccessible(true);
        java.lang.Object[] _appendEscapeMethodArguments = new java.lang.Object[2];
        _appendEscapeMethodArguments[0] = ((Object) null);
        _appendEscapeMethodArguments[1] = '1';
        try {
            _appendEscapeMethod.invoke(null, _appendEscapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.getMatchingIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMatchingIndex()
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#getMatchingIndex()}
 * @utbot.returnsFrom {@code return _matchingElementIndex;}
 *  */
    @Test
    public void testGetMatchingIndex_Return_matchingElementIndex() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -255);
        
        int actual = jsonPointer.getMatchingIndex();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.JsonPointer.matchElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchElement(int)
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#matchElement(int)}
 * @utbot.executesCondition {@code (index != _matchingElementIndex): False}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testMatchElement_IndexLessThanZero() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -1);
        
        JsonPointer actual = jsonPointer.matchElement(-1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#matchElement(int)}
 * @utbot.executesCondition {@code (index != _matchingElementIndex): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testMatchElement_IndexNotEquals_matchingElementIndex() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        setField(jsonPointer, "com.fasterxml.jackson.core.JsonPointer", "_matchingElementIndex", -255);
        
        JsonPointer actual = jsonPointer.matchElement(-127);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonPointer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.JsonPointer#matchElement(int)}
 * @utbot.executesCondition {@code (index != _matchingElementIndex): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.returnsFrom {@code return _nextSegment;}
 *  */
    @Test
    public void testMatchElement_IndexGreaterOrEqualZero() throws Exception  {
        JsonPointer jsonPointer = ((JsonPointer) createInstance("com.fasterxml.jackson.core.JsonPointer"));
        
        JsonPointer actual = jsonPointer.matchElement(0);
        
        assertNull(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1023320269440700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1023320269440700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1023320269446000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023320269440700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023320269446000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1023320269772400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1023320269772400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1023320269774200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023320269772400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023320269774200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


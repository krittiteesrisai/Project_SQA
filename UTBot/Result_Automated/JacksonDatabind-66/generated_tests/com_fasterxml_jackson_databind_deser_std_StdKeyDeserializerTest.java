package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.StringKD;
import java.io.IOException;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import jdk.internal.loader.BuiltinClassLoader;
import java.net.URI;
import java.io.File;
import java.net.InetSocketAddress;
import java.util.Locale;
import java.util.regex.Pattern;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import java.text.SimpleDateFormat;
import java.security.SecureClassLoader;
import com.fasterxml.jackson.databind.type.TypeParser;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Ignore;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_deser_std_StdKeyDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.forType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#forType(java.lang.Class)}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testForType_NotRaw() {
        StdKeyDeserializer actual = StdKeyDeserializer.forType(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#forType(java.lang.Class)}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): False}
 * @utbot.executesCondition {@code (raw): True}
 * @utbot.returnsFrom {@code return new StdKeyDeserializer(kind, raw);}
 *  */
    @Test
    public void testForType_Raw() throws Exception  {
        Class class1 = Object.class;
        
        StdKeyDeserializer.StringKD actual = ((StdKeyDeserializer.StringKD) StdKeyDeserializer.forType(class1));
        
        StdKeyDeserializer.StringKD expected = ((StdKeyDeserializer.StringKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD"));
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", -1);
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_keyClass", class1);
        
        int expected_kind = expected._kind;
        int actual_kind = actual._kind;
        assertEquals(expected_kind, actual_kind);
        
        Class expected_keyClass = expected._keyClass;
        Class actual_keyClass = actual._keyClass;
        assertEquals(Class.class, actual_keyClass.getClass());
        
        FromStringDeserializer actual_deser = actual._deser;
        assertNull(actual_deser);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#forType(java.lang.Class)}
 * @utbot.executesCondition {@code (raw): True}
 * @utbot.returnsFrom {@code return new StdKeyDeserializer(kind, raw);}
 *  */
    @Test
    public void testForType_Raw_1() throws Exception  {
        Class class1 = Object.class;
        
        StdKeyDeserializer.StringKD actual = ((StdKeyDeserializer.StringKD) StdKeyDeserializer.forType(class1));
        
        StdKeyDeserializer.StringKD expected = ((StdKeyDeserializer.StringKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD"));
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind", -1);
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_keyClass", class1);
        
        int expected_kind = expected._kind;
        int actual_kind = actual._kind;
        assertEquals(expected_kind, actual_kind);
        
        Class expected_keyClass = expected._keyClass;
        Class actual_keyClass = actual._keyClass;
        assertEquals(Class.class, actual_keyClass.getClass());
        
        FromStringDeserializer actual_deser = actual._deser;
        assertNull(actual_deser);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parseDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return NumberInput.parseDouble(key);
 *  */
    @Test
    public void test_parseDouble_ThrowNumberFormatException() {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseDouble(StdKeyDeserializer.java:245) */
        stdKeyDeserializer._parseDouble(string);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parseDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void test_parseDouble_ThrowNumberFormatException_1() {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        String string = "+";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseDouble] produces [java.lang.NumberFormatException: For input string: "+"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseDouble(StdKeyDeserializer.java:245) */
        stdKeyDeserializer._parseDouble(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _parseDouble(java.lang.String)
    
    @Test
    public void test_parseDouble1() {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        String string = "-0\u0001";
        
        double actual = stdKeyDeserializer._parseDouble(string);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseDouble(java.lang.String)
    
    @Test
    public void test_parseDouble2() {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        String string = "-0x\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseDouble] produces [java.lang.NumberFormatException: For input string: "-0x                           !"]
            java.base/jdk.internal.math.FloatingDecimal.parseHexString(FloatingDecimal.java:2082)
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1870)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseDouble(StdKeyDeserializer.java:245) */
        stdKeyDeserializer._parseDouble(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseLong
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parseLong(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Long.parseLong(key);
 *  */
    @Test
    public void test_parseLong_ThrowNumberFormatException() {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseLong] produces [java.lang.NumberFormatException: Cannot parse null string]
            java.base/java.lang.Long.parseLong(Long.java:674)
            java.base/java.lang.Long.parseLong(Long.java:836)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseLong(StdKeyDeserializer.java:241) */
        stdKeyDeserializer._parseLong(null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parseLong(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Long.parseLong(key);
 *  */
    @Test
    public void test_parseLong_ThrowNumberFormatException_1() {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseLong] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:721)
            java.base/java.lang.Long.parseLong(Long.java:836)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseLong(StdKeyDeserializer.java:241) */
        stdKeyDeserializer._parseLong(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserializeKey(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (key == null): True}
 *  */
    @Test
    public void testDeserializeKey_KeyEqualsNull() throws IOException  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        
        Object actual = stdKeyDeserializer.deserializeKey(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (key == null): False}
 * @utbot.executesCondition {@code (result != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testDeserializeKey_ResultNotEqualsNull() throws IOException  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(4, null, null);
        String string = " ";
        
        Character actual = ((Character) stdKeyDeserializer.deserializeKey(string, null));
        
        Character expected = ' ';
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeKey(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "not a valid representation, problem: (%s) %s", re.getClass().getName(), re.getMessage());
 *  */
    @Test
    public void testDeserializeKey_ThrowNullPointerException() throws IOException  {
        Class class1 = Object.class;
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(-239, class1, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "not a valid representation, problem: (%s) %s", re.getClass().getName(), re.getMessage());
 *  */
    @Test
    public void testDeserializeKey_ThrowNullPointerException_3() throws IOException  {
        Class class1 = Object.class;
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(2, class1, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "not a valid representation, problem: (%s) %s", re.getClass().getName(), re.getMessage());
 *  */
    @Test
    public void testDeserializeKey_ThrowNullPointerException_4() throws IOException  {
        Class class1 = Object.class;
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(3, class1, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "not a valid representation, problem: (%s) %s", re.getClass().getName(), re.getMessage());
 *  */
    @Test
    public void testDeserializeKey_ThrowNullPointerException_6() throws IOException  {
        Class class1 = Object.class;
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(6, class1, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "not a valid representation, problem: (%s) %s", re.getClass().getName(), re.getMessage());
 *  */
    @Test
    public void testDeserializeKey_ThrowNullPointerException_7() throws IOException  {
        Class class1 = Object.class;
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(5, class1, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "not a valid representation, problem: (%s) %s", re.getClass().getName(), re.getMessage());
 *  */
    @Test
    public void testDeserializeKey_ThrowNullPointerException_5() throws IOException  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "not a valid representation, problem: (%s) %s", re.getClass().getName(), re.getMessage());
 *  */
    @Test
    public void testDeserializeKey_ThrowNullPointerException_1() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "not a valid representation, problem: (%s) %s", re.getClass().getName(), re.getMessage());
 *  */
    @Test
    public void testDeserializeKey_ThrowNullPointerException_2() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#deserializeKey(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (result != null): True}
 * @utbot.returnsFrom {@code return result;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return result;
 *  */
    @Test
    public void testDeserializeKey_ThrowNullPointerException_8() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(15, null, null);
        String string = ".";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        BuiltinClassLoader _classLoader = ((BuiltinClassLoader) createInstance("jdk.internal.loader.BuiltinClassLoader"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserializeKey(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserializeKey1() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(13, null, null);
        String string = "";
        
        URI actual = ((URI) stdKeyDeserializer.deserializeKey(string, null));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey2() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 1);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\b";
        
        File actual = ((File) stdKeyDeserializer.deserializeKey(string, null));
        
        File expected = ((File) createInstance("java.io.File"));
        
        // java.io.File has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey3() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 1);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = ":";
        
        File actual = ((File) stdKeyDeserializer.deserializeKey(string, null));
        
        File expected = ((File) createInstance("java.io.File"));
        
        // java.io.File has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey4() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        
        URI actual = ((URI) stdKeyDeserializer.deserializeKey(string, null));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey5() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 12);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        
        InetSocketAddress actual = ((InetSocketAddress) stdKeyDeserializer.deserializeKey(string, null));
        
        InetSocketAddress expected = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
        
        // java.net.InetSocketAddress has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey6() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 12);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "";
        
        InetSocketAddress actual = ((InetSocketAddress) stdKeyDeserializer.deserializeKey(string, null));
        
        InetSocketAddress expected = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
        
        // java.net.InetSocketAddress has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey7() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "-";
        
        Locale actual = ((Locale) stdKeyDeserializer.deserializeKey(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey8() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "_";
        
        Locale actual = ((Locale) stdKeyDeserializer.deserializeKey(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey9() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0000";
        
        Locale actual = ((Locale) stdKeyDeserializer.deserializeKey(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey10() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "";
        
        URI actual = ((URI) stdKeyDeserializer.deserializeKey(string, null));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey11() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "";
        
        Locale actual = ((Locale) stdKeyDeserializer.deserializeKey(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey12() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 7);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Pattern actual = ((Pattern) stdKeyDeserializer.deserializeKey(string, null));
        
        Pattern expected = ((Pattern) createInstance("java.util.regex.Pattern"));
        
    }
    
    @Test
    public void testDeserializeKey13() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 7);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Pattern actual = ((Pattern) stdKeyDeserializer.deserializeKey(string, null));
        
        Pattern expected = ((Pattern) createInstance("java.util.regex.Pattern"));
        
    }
    
    @Test
    public void testDeserializeKey14() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000";
        
        Locale actual = ((Locale) stdKeyDeserializer.deserializeKey(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey15() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "_";
        
        Locale actual = ((Locale) stdKeyDeserializer.deserializeKey(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserializeKey16() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        
        Locale actual = ((Locale) stdKeyDeserializer.deserializeKey(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeKey(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    /// Actual number of generated tests (54) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testDeserializeKey17() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(2, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey18() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(3, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey19() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(5, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey20() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(6, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey21() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(17, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey22() throws IOException  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(7, null, null);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey23() throws IOException  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(8, null, null);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey24() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey25() throws IOException  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey26() throws IOException  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey27() throws IOException  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(12, null, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey28() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey29() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ISO8601DateFormat _dateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey30() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ISO8601DateFormat _dateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey31() throws IOException  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(1, null, null);
        String string = "\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey32() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "\u0001\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey33() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "\u0001\u0001!";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey34() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "!\u0000!\u0001\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey35() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey36() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "\u0001!!\u0001\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey37() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey38() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey39() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 13);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey40() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey41() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey42() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0001\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey43() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey44() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0001\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey45() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 2);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey46() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 2);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey47() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(15, null, null);
        String string = "\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey48() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, uUIDDeserializer);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey49() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey50() throws IOException  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, null);
    }
    
    @Test
    public void testDeserializeKey51() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey52() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey53() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(15, null, null);
        String string = "\u0000.\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey54() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey55() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey56() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey57() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey58() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = ".\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        SecureClassLoader _classLoader = ((SecureClassLoader) createInstance("java.security.SecureClassLoader"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey59() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000.\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        SecureClassLoader _classLoader = ((SecureClassLoader) createInstance("java.security.SecureClassLoader"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey60() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey61() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey62() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey63() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey64() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey65() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    
    @Test
    public void testDeserializeKey66() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "!";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.deserializeKey(StdKeyDeserializer.java:128) */
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method deserializeKey(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = InvalidFormatException.class)
    public void testDeserializeKey67() throws Exception  {
        Class class1 = Object.class;
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(4, class1, null);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdKeyDeserializer.deserializeKey(string, impl);
    }
    ///endregion
    
    ///region Errors report for deserializeKey
    
    public void testDeserializeKey_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* An object with addr: (BVInt32 staticVariable1368481685) and java.net.InetAddressImpl doesn't have
        concrete possible types,but there is no mock info generator provided
        to construct a mock value. */
        
        // 2 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.getKeyClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKeyClass()
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#getKeyClass()}
 * @utbot.returnsFrom {@code return _keyClass;}
 *  */
    @Test
    public void testGetKeyClass_Return_keyClass() {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null, null);
        
        Class actual = stdKeyDeserializer.getKeyClass();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parse(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (key.length() == 1): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.activatesSwitch {@code switch(_kind) case: TYPE_CHAR}
 * @utbot.returnsFrom {@code return Character.valueOf(key.charAt(0));}
 *  */
    @Test
    public void test_parse_KeyLengthEquals1() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(4, null, null);
        String string = "\u0000";
        
        Character actual = ((Character) stdKeyDeserializer._parse(string, null));
        
        Character expected = '\u0000';
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parse(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parseInt(java.lang.String)}
 * @utbot.activatesSwitch {@code switch(_kind) case: TYPE_INT}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return _parseInt(key);
 *  */
    @Test
    public void test_parse_ThrowNumberFormatException() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(5, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NumberFormatException: Cannot parse null string]
            java.base/java.lang.Integer.parseInt(Integer.java:630)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt(StdKeyDeserializer.java:237)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:174) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return _parseLong(key);
 *  */
    @Test
    public void test_parse_ThrowNumberFormatException_1() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(6, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NumberFormatException: Cannot parse null string]
            java.base/java.lang.Long.parseLong(Long.java:674)
            java.base/java.lang.Long.parseLong(Long.java:836)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseLong(StdKeyDeserializer.java:241)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:177) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return _parseLong(key);
 *  */
    @Test
    public void test_parse_ThrowNumberFormatException_2() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(6, null, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:721)
            java.base/java.lang.Long.parseLong(Long.java:836)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseLong(StdKeyDeserializer.java:241)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:177) */
        stdKeyDeserializer._parse(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: int value = _parseInt(key);
 *  */
    @Test
    public void test_parse_ThrowNumberFormatException_3() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(2, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NumberFormatException: Cannot parse null string]
            java.base/java.lang.Integer.parseInt(Integer.java:630)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt(StdKeyDeserializer.java:237)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:152) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: int value = _parseInt(key);
 *  */
    @Test
    public void test_parse_ThrowNumberFormatException_4() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(2, null, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:678)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt(StdKeyDeserializer.java:237)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:152) */
        stdKeyDeserializer._parse(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parseInt(java.lang.String)}
 * @utbot.activatesSwitch {@code switch(_kind) case: TYPE_SHORT}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: int value = _parseInt(key);
 *  */
    @Test
    public void test_parse_ThrowNumberFormatException_5() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(3, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NumberFormatException: Cannot parse null string]
            java.base/java.lang.Integer.parseInt(Integer.java:630)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt(StdKeyDeserializer.java:237)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:161) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test
    public void test_parse_ThrowIllegalArgumentException() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 9);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.IllegalArgumentException: Null charset name]
            java.base/java.nio.charset.Charset.lookup(Charset.java:454)
            java.base/java.nio.charset.Charset.forName(Charset.java:525)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:251)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (key.length() == 1): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleWeirdKey(java.lang.Class,java.lang.String,java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "can only convert 1-character Strings");
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_6() throws Exception  {
        Class class1 = Object.class;
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(4, class1, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:172) */
        stdKeyDeserializer._parse(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#_deserialize(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:192) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: key.length() == 1
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_1() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(4, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:169) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#_deserialize(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_2() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#parseDate(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: java.util.Date date = ctxt.parseDate(key);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_3() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:199) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findClass(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleWeirdKey(java.lang.Class,java.lang.String,java.lang.String,java.lang.Object[])}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "unable to parse key as Class");
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_4() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(15, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:223) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#parseDate(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.parseDate(key);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_5() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_11() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:48)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:192) */
        stdKeyDeserializer._parse(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.parseDate(key);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_12() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ISO8601DateFormat _dateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ISO8601Utils.parseInt(ISO8601Utils.java:329)
            com.fasterxml.jackson.databind.util.ISO8601Utils.parse(ISO8601Utils.java:161)
            com.fasterxml.jackson.databind.util.ISO8601DateFormat.parse(ISO8601DateFormat.java:52)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_13() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:48)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link java.util.UUID#fromString(java.lang.String)}
 * @utbot.invokes {@link java.lang.Exception#getMessage()}
 * @utbot.activatesSwitch {@code switch(_kind) case: TYPE_UUID}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleWeirdKey(_keyClass, key, "problem: %s", e.getMessage());
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_16() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(12, null, null);
        String string = "                                     ";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:205) */
        stdKeyDeserializer._parse(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_17() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:192) */
        stdKeyDeserializer._parse(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_7() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 1);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:215)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_9() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 10);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            java.base/java.util.TimeZone.parseCustomTimeZone(TimeZone.java:801)
            java.base/java.util.TimeZone.getTimeZone(TimeZone.java:580)
            java.base/java.util.TimeZone.getTimeZone(TimeZone.java:518)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:253)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findClass(java.lang.String)}
 * @utbot.returnsFrom {@code return ctxt.findClass(key);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.findClass(key);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_14() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(15, null, null);
        String string = ".";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        BuiltinClassLoader _classLoader = ((BuiltinClassLoader) createInstance("jdk.internal.loader.BuiltinClassLoader"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:223) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.parseDate(key);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_8() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            java.base/java.text.DateFormat.clone(DateFormat.java:797)
            java.base/java.text.SimpleDateFormat.clone(SimpleDateFormat.java:2406)
            com.fasterxml.jackson.databind.DeserializationContext.getDateFormat(DeserializationContext.java:1531)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:721)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#parseDate(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: java.util.Date date = ctxt.parseDate(key);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_10() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            java.base/java.text.DateFormat.clone(DateFormat.java:797)
            java.base/java.text.SimpleDateFormat.clone(SimpleDateFormat.java:2406)
            com.fasterxml.jackson.databind.DeserializationContext.getDateFormat(DeserializationContext.java:1531)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:721)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:199) */
        stdKeyDeserializer._parse(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.returnsFrom {@code return _deser._deserialize(key, ctxt);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test
    public void test_parse_ThrowNullPointerException_15() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = ".";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        BuiltinClassLoader _classLoader = ((BuiltinClassLoader) createInstance("jdk.internal.loader.BuiltinClassLoader"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_classLoader", _classLoader);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1443)
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1055)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:224)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(string, impl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _parse(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.activatesSwitch {@code switch(_kind) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(_kind) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_parse_ThrowIllegalStateException() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(-238, null, null);
        
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#_deserialize(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(_kind) case: TYPE_LOCALE}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_parse_ThrowIllegalArgumentException_1() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 14);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        
        stdKeyDeserializer._parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parse(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.FromStringDeserializer#_deserialize(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(_kind) case: TYPE_CURRENCY}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _deser._deserialize(key, ctxt);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_parse_ThrowIllegalArgumentException_2() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 14);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        
        stdKeyDeserializer._parse(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _parse(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_parse1() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(13, null, null);
        String string = "?";
        
        URI actual = ((URI) stdKeyDeserializer._parse(string, null));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse2() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Locale actual = ((Locale) stdKeyDeserializer._parse(string, impl));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse3() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(7, null, null);
        String string = "2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Float actual = ((Float) stdKeyDeserializer._parse(string, null));
        
        Float expected = 2.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void test_parse4() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Locale actual = ((Locale) stdKeyDeserializer._parse(string, impl));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse5() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(8, null, null);
        String string = "2.\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Double actual = ((Double) stdKeyDeserializer._parse(string, null));
        
        Double expected = 2.0;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6);
    }
    
    @Test
    public void test_parse6() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 1);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        
        File actual = ((File) stdKeyDeserializer._parse(string, null));
        
        File expected = ((File) createInstance("java.io.File"));
        
        // java.io.File has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse7() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "-";
        
        Locale actual = ((Locale) stdKeyDeserializer._parse(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse8() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 7);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Pattern actual = ((Pattern) stdKeyDeserializer._parse(string, null));
        
        Pattern expected = ((Pattern) createInstance("java.util.regex.Pattern"));
        
    }
    
    @Test
    public void test_parse9() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        
        URI actual = ((URI) stdKeyDeserializer._parse(string, null));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse10() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "-";
        
        Locale actual = ((Locale) stdKeyDeserializer._parse(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse11() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "";
        
        Locale actual = ((Locale) stdKeyDeserializer._parse(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse12() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 12);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        
        InetSocketAddress actual = ((InetSocketAddress) stdKeyDeserializer._parse(string, null));
        
        InetSocketAddress expected = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
        
        // java.net.InetSocketAddress has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse13() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "_";
        
        Locale actual = ((Locale) stdKeyDeserializer._parse(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse14() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 12);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "";
        
        InetSocketAddress actual = ((InetSocketAddress) stdKeyDeserializer._parse(string, null));
        
        InetSocketAddress expected = ((InetSocketAddress) createInstance("java.net.InetSocketAddress"));
        
        // java.net.InetSocketAddress has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse15() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "";
        
        URI actual = ((URI) stdKeyDeserializer._parse(string, null));
        
        URI expected = ((URI) createInstance("java.net.URI"));
        
        // java.net.URI has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void test_parse16() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 8);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        
        Locale actual = ((Locale) stdKeyDeserializer._parse(string, null));
        
        Locale expected = ((Locale) createInstance("java.util.Locale"));
        
        // java.util.Locale has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parse(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_parse17() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(5, null, null);
        String string = "+";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NumberFormatException: For input string: "+"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:658)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt(StdKeyDeserializer.java:237)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:174) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse18() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(3, null, null);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NumberFormatException: For input string: " "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt(StdKeyDeserializer.java:237)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:161) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse19() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "\u0001\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:299)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse20() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "\u0001\u0001\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:299)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:199) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse21() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(8, null, null);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseDouble(StdKeyDeserializer.java:245)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:183) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse22() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(8, null, null);
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NumberFormatException: For input string: "!"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.core.io.NumberInput.parseDouble(NumberInput.java:285)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseDouble(StdKeyDeserializer.java:245)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:183) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse23() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 3);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.IllegalArgumentException: Illegal character in path at index 0:                                                                 ]
            java.base/java.net.URI.create(URI.java:906)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:219)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse24() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "\u0001\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:299)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse25() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:299)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:199) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse26() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(12, null, null);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:205) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse27() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(14, null, null);
        String string = "!";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:217) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse28() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:566)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:542)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:303)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse29() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "3\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:566)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:542)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:303)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse30() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:566)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:542)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:303)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse31() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:566)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:542)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:303)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:199) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse32() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:566)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:542)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:303)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:199) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse33() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        String string = "\u0001\u0001!";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:566)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:542)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:303)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:199) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse34() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(13, null, null);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:211) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse35() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(14, null, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:217) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse36() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(1, null, null);
        String string = "t\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:149) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse37() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000\u0000-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:48)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:192) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse38() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:48)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse39() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ISO8601DateFormat _dateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ISO8601Utils.parseInt(ISO8601Utils.java:329)
            com.fasterxml.jackson.databind.util.ISO8601Utils.parse(ISO8601Utils.java:161)
            com.fasterxml.jackson.databind.util.ISO8601DateFormat.parse(ISO8601DateFormat.java:52)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:199) */
        stdKeyDeserializer._parse(null, impl);
    }
    
    @Test
    public void test_parse40() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._fromBytes(UUIDDeserializer.java:122)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:40)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:192) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse41() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, uUIDDeserializer);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._badFormat(UUIDDeserializer.java:79)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:42)
            com.fasterxml.jackson.databind.deser.std.UUIDDeserializer._deserialize(UUIDDeserializer.java:13)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse42() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(11, null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1474)
            java.base/java.text.DateFormat.parse(DateFormat.java:397)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:199) */
        stdKeyDeserializer._parse(null, impl);
    }
    
    @Test
    public void test_parse43() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            java.base/java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1474)
            java.base/java.text.DateFormat.parse(DateFormat.java:397)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(null, impl);
    }
    
    @Test
    public void test_parse44() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0001\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:194) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse45() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0001\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:865)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:188) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse46() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:188) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse47() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(15, null, null);
        String string = "\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:223) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse48() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 2);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:194) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse49() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 2);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:188) */
        stdKeyDeserializer._parse(string, null);
    }
    
    @Test
    public void test_parse50() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:194) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse51() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:188) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse52() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000.\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1443)
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1055)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:224)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse53() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:194) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse54() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(15, null, null);
        String string = "\u0000.\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:223) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse55() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 4);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.instantiationException(DeserializationContext.java:1443)
            com.fasterxml.jackson.databind.DeserializationContext.handleInstantiationProblem(DeserializationContext.java:1055)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:224)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse56() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, uUIDDeserializer);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.weirdKeyException(DeserializationContext.java:1391)
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdKey(DeserializationContext.java:880)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:194) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse57() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "\u0001\u0080\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:566)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:542)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:303)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test
    public void test_parse58() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "!\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:566)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:542)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:303)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:722)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:197) */
        stdKeyDeserializer._parse(string, impl);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _parse(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_parse59() throws Exception  {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(10, null, null);
        String string = "";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ISO8601DateFormat _dateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_parse60() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0001\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_parse61() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0001\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_parse62() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0001\u0001!";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdKeyDeserializer._parse(string, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_parse63() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 5);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdKeyDeserializer._parse(string, impl);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _parse(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = InvalidFormatException.class)
    public void test_parse64() throws Exception  {
        Class class1 = Object.class;
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(4, class1, null);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdKeyDeserializer._parse(string, impl);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method _parse(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void test_parse65() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(9, null, std);
        String string = "\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.security.AccessControlException: access denied ("java.net.SocketPermission" "" "resolve")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkConnect(SecurityManager.java:916)
            java.base/java.net.InetAddress.getAllByName0(InetAddress.java:1480)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1384)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1305)
            java.base/java.net.InetAddress.getByName(InetAddress.java:1255)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:255)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:186) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void test_parse66() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 11);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(16, null, std);
        String string = "\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse] produces [java.security.AccessControlException: access denied ("java.net.SocketPermission" "" "resolve")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkConnect(SecurityManager.java:916)
            java.base/java.net.InetAddress.getAllByName0(InetAddress.java:1480)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1384)
            java.base/java.net.InetAddress.getAllByName(InetAddress.java:1305)
            java.base/java.net.InetAddress.getByName(InetAddress.java:1255)
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserialize(FromStringDeserializer.java:255)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parse(StdKeyDeserializer.java:192) */
    }
    ///endregion
    
    ///region Errors report for _parse
    
    public void test_parse_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* An object with addr: (BVInt32 staticVariable1368481685) and java.net.InetAddressImpl doesn't have
        concrete possible types,but there is no mock info generator provided
        to construct a mock value. */
        
        // 2 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseInt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parseInt(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.parseInt(key);
 *  */
    @Test
    public void test_parseInt_ThrowNumberFormatException() {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt] produces [java.lang.NumberFormatException: Cannot parse null string]
            java.base/java.lang.Integer.parseInt(Integer.java:630)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt(StdKeyDeserializer.java:237) */
        stdKeyDeserializer._parseInt(null);
    }
    
    /**
    @utbot.classUnderTest {@link StdKeyDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer#_parseInt(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.parseInt(key);
 *  */
    @Test
    public void test_parseInt_ThrowNumberFormatException_1() {
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:678)
            java.base/java.lang.Integer.parseInt(Integer.java:786)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer._parseInt(StdKeyDeserializer.java:237) */
        stdKeyDeserializer._parseInt(string);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1080272287491200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1080272287491200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1080272287496800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1080272287491200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1080272287496800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


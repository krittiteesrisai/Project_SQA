package org.apache.commons.codec.language;

import org.junit.Test;
import org.apache.commons.codec.EncoderException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_codec_language_DoubleMetaphoneTest {
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#encode(java.lang.String)}
 * @utbot.returnsFrom {@code return doubleMetaphone(value);}
 *  */
    @Test
    public void testEncode_ReturnDoubleMetaphone() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        String actual = doubleMetaphone.encode(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#encode(java.lang.String)}
 * @utbot.returnsFrom {@code return doubleMetaphone(value);}
 *  */
    @Test
    public void testEncode_ReturnDoubleMetaphone_1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        String actual = doubleMetaphone.encode(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    @Test
    public void testEncode1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001";
        
        String actual = doubleMetaphone.encode(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof String)): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#doubleMetaphone(java.lang.String)}
 * @utbot.returnsFrom {@code return doubleMetaphone((String) obj);}
 *  */
    @Test
    public void testEncode_ObjNotInstanceOfString() throws EncoderException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        Object actual = doubleMetaphone.encode(((Object) string));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(obj instanceof String)): True}
 * @utbot.throwsException {@link org.apache.commons.codec.EncoderException} when: !(obj instanceof String)
 *  */
    @Test(expected = EncoderException.class)
    public void testEncode_ThrowEncoderException() throws EncoderException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        doubleMetaphone.encode(((Object) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    @Test
    public void testEncode2() throws EncoderException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "!\u0001";
        
        String actual = ((String) doubleMetaphone.encode(((Object) string)));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.charAt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method charAt(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.returnsFrom {@code return Character.MIN_VALUE;}
 *  */
    @Test
    public void testCharAt_IndexLessThanZero() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        char actual = doubleMetaphone.charAt(null, -1);
        
        assertEquals('\u0000', actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= value.length()): True}
 * @utbot.returnsFrom {@code return Character.MIN_VALUE;}
 *  */
    @Test
    public void testCharAt_IndexGreaterOrEqualValueLength() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        char actual = doubleMetaphone.charAt(string, 0);
        
        assertEquals('\u0000', actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= value.length()): False}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.returnsFrom {@code return value.charAt(index);}
 *  */
    @Test
    public void testCharAt_IndexLessThanValueLength() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        
        char actual = doubleMetaphone.charAt(string, 0);
        
        assertEquals(' ', actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method charAt(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < 0 || index >= value.length()
 *  */
    @Test
    public void testCharAt_ThrowNullPointerException() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.charAt] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.charAt(DoubleMetaphone.java:937) */
        doubleMetaphone.charAt(null, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4, criteria5 });}
 *  */
    @Test
    public void testContains_ReturnContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[8];
        containsMethodArguments[0] = ((Object) null);
        containsMethodArguments[1] = -1;
        containsMethodArguments[2] = -255;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4, criteria5 });}
 *  */
    @Test
    public void testContains_ReturnContains_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[8];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 1;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4, criteria5 });}
 *  */
    @Test
    public void testContains_ReturnContains_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[8];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = string;
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4, criteria5 });}
 *  */
    @Test
    public void testContains_ReturnContains_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[8];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = string;
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4, criteria5 });
 *  */
    @Test
    public void testContains_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.StringIndexOutOfBoundsException: begin 253, end 0, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:989) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[8];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 253;
        containsMethodArguments[2] = -253;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        try {
            containsMethod.invoke(null, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
    
    @Test
    public void testContains1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[8];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 1;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = string;
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.String, int, int, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2 });}
 *  */
    @Test
    public void testContains_ReturnContains1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[5];
        containsMethodArguments[0] = ((Object) null);
        containsMethodArguments[1] = -1;
        containsMethodArguments[2] = -255;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2 });}
 *  */
    @Test
    public void testContains_ReturnContains_11() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[5];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 1;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2 });}
 *  */
    @Test
    public void testContains_ReturnContains_21() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[5];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = string;
        containsMethodArguments[4] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2 });}
 *  */
    @Test
    public void testContains_ReturnContains_31() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[5];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 1;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.String, int, int, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return contains(value, start, length, new String[] { criteria1, criteria2 });
 *  */
    @Test
    public void testContains_ThrowStringIndexOutOfBoundsException1() throws Throwable  {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.StringIndexOutOfBoundsException: begin 255, end 1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:957) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[5];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 255;
        containsMethodArguments[2] = -254;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        try {
            containsMethod.invoke(null, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4 });}
 *  */
    @Test
    public void testContains_ReturnContains2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[7];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 1;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4 });}
 *  */
    @Test
    public void testContains_ReturnContains_12() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[7];
        containsMethodArguments[0] = ((Object) null);
        containsMethodArguments[1] = -1;
        containsMethodArguments[2] = -255;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4 });}
 *  */
    @Test
    public void testContains_ReturnContains_22() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[7];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = string;
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4 });}
 *  */
    @Test
    public void testContains_ReturnContains_32() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[7];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = string;
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4 });
 *  */
    @Test
    public void testContains_ThrowStringIndexOutOfBoundsException2() throws Throwable  {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.StringIndexOutOfBoundsException: begin 114, end 1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:977) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[7];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 114;
        containsMethodArguments[2] = -113;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        try {
            containsMethod.invoke(null, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3 });}
 *  */
    @Test
    public void testContains_ReturnContains3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[6];
        containsMethodArguments[0] = ((Object) null);
        containsMethodArguments[1] = -1;
        containsMethodArguments[2] = -255;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3 });}
 *  */
    @Test
    public void testContains_ReturnContains_13() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[6];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 1;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3 });}
 *  */
    @Test
    public void testContains_ReturnContains_23() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[6];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = string;
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3 });}
 *  */
    @Test
    public void testContains_ReturnContains_33() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[6];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = string;
        containsMethodArguments[5] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return contains(value, start, length, new String[] { criteria1, criteria2, criteria3 });
 *  */
    @Test
    public void testContains_ThrowStringIndexOutOfBoundsException3() throws Throwable  {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.StringIndexOutOfBoundsException: begin 252, end 1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:967) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[6];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 252;
        containsMethodArguments[2] = -251;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        try {
            containsMethod.invoke(null, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.String, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria });}
 *  */
    @Test
    public void testContains_ReturnContains4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[4];
        containsMethodArguments[0] = ((Object) null);
        containsMethodArguments[1] = -1;
        containsMethodArguments[2] = -255;
        containsMethodArguments[3] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria });}
 *  */
    @Test
    public void testContains_ReturnContains_14() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[4];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 1;
        containsMethodArguments[3] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria });}
 *  */
    @Test
    public void testContains_ReturnContains_24() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[4];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = string;
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria });}
 *  */
    @Test
    public void testContains_ReturnContains_34() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[4];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.String, int, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return contains(value, start, length, new String[] { criteria });
 *  */
    @Test
    public void testContains_ThrowStringIndexOutOfBoundsException4() throws Throwable  {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.StringIndexOutOfBoundsException: begin 244, end 1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[4];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 244;
        containsMethodArguments[2] = -243;
        containsMethodArguments[3] = ((Object) null);
        try {
            containsMethod.invoke(null, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.String, int, int, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (start + length <= value.length()): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContains_StartPlusLengthLessOrEqualValueLength() {
        String string = "";
        java.lang.String[] stringArray = {};
        
        boolean actual = DoubleMetaphone.contains(string, 0, 0, stringArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (start + length <= value.length()): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < criteria.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContains_TargetEquals() {
        String string = "";
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = string;
        
        boolean actual = DoubleMetaphone.contains(string, 0, 0, stringArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (start + length <= value.length()): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < criteria.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContains_NotTargetEquals() {
        String string = "";
        java.lang.String[] stringArray = {null};
        
        boolean actual = DoubleMetaphone.contains(string, 0, 0, stringArray);
        
        assertFalse(actual);
        
        String finalStringArray0 = stringArray[0];
        
        assertNull(finalStringArray0);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start >= 0): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContains_StartLessThanZero() {
        boolean actual = DoubleMetaphone.contains(((String) null), -1, -255, ((java.lang.String[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (start + length <= value.length()): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContains_StartPlusLengthGreaterThanValueLength() {
        String string = "";
        
        boolean actual = DoubleMetaphone.contains(string, 0, 1, ((java.lang.String[]) null));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.String, int, int, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start + length <= value.length()): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String target = value.substring(start, start + length);
 *  */
    @Test
    public void testContains_ThrowStringIndexOutOfBoundsException5() {
        String string = "                                 ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.StringIndexOutOfBoundsException: begin 67, end 33, length 33]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014) */
        DoubleMetaphone.contains(string, 67, -34, ((java.lang.String[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: start >= 0 && start + length <= value.length()
 *  */
    @Test
    public void testContains_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1013) */
        DoubleMetaphone.contains(((String) null), 0, -255, ((java.lang.String[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start + length <= value.length()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < criteria.length; i++)
 *  */
    @Test
    public void testContains_ThrowNullPointerException_1() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1016) */
        DoubleMetaphone.contains(string, 0, 0, ((java.lang.String[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.contains
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4, criteria5, criteria6 });}
 *  */
    @Test
    public void testContains_ReturnContains5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[9];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 1;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        containsMethodArguments[8] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4, criteria5, criteria6 });}
 *  */
    @Test
    public void testContains_ReturnContains_15() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[9];
        containsMethodArguments[0] = ((Object) null);
        containsMethodArguments[1] = -1;
        containsMethodArguments[2] = -255;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        containsMethodArguments[8] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4, criteria5, criteria6 });}
 *  */
    @Test
    public void testContains_ReturnContains_25() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[9];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = string;
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        containsMethodArguments[8] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4, criteria5, criteria6 });}
 *  */
    @Test
    public void testContains_ReturnContains_35() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[9];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 0;
        containsMethodArguments[2] = 0;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = string;
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        containsMethodArguments[8] = ((Object) null);
        boolean actual = ((Boolean) containsMethod.invoke(null, containsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return contains(value, start, length, new String[] { criteria1, criteria2, criteria3, criteria4, criteria5, criteria6 });
 *  */
    @Test
    public void testContains_ThrowStringIndexOutOfBoundsException6() throws Throwable  {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.StringIndexOutOfBoundsException: begin 196, end 1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1001) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method containsMethod = doubleMetaphoneClazz.getDeclaredMethod("contains", stringType, intType, intType, stringType, stringType, stringType, stringType, stringType, stringType);
        containsMethod.setAccessible(true);
        java.lang.Object[] containsMethodArguments = new java.lang.Object[9];
        containsMethodArguments[0] = string;
        containsMethodArguments[1] = 196;
        containsMethodArguments[2] = -195;
        containsMethodArguments[3] = ((Object) null);
        containsMethodArguments[4] = ((Object) null);
        containsMethodArguments[5] = ((Object) null);
        containsMethodArguments[6] = ((Object) null);
        containsMethodArguments[7] = ((Object) null);
        containsMethodArguments[8] = ((Object) null);
        try {
            containsMethod.invoke(null, containsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isDoubleMetaphoneEqual(java.lang.String, java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isDoubleMetaphoneEqual(java.lang.String,java.lang.String,boolean)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#doubleMetaphone(java.lang.String,boolean)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#doubleMetaphone(java.lang.String,boolean)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return doubleMetaphone(value1, alternate).equals(doubleMetaphone(value2, alternate));
 *  */
    @Test
    public void testIsDoubleMetaphoneEqual_ThrowNullPointerException() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:245) */
        doubleMetaphone.isDoubleMetaphoneEqual(null, null, false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isDoubleMetaphoneEqual(java.lang.String, java.lang.String, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isDoubleMetaphoneEqual(java.lang.String,java.lang.String,boolean)}
     */
    @Test
    public void testIsDoubleMetaphoneEqualReturnsTrueWithNonEmptyStrings() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(1);
        
        boolean actual = doubleMetaphone.isDoubleMetaphoneEqual("3-", "10", true);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isDoubleMetaphoneEqual(java.lang.String, java.lang.String, boolean)
    
    @Test
    public void testIsDoubleMetaphoneEqual1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001\u0001!";
        
        boolean actual = doubleMetaphone.isDoubleMetaphoneEqual(string, null, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isDoubleMetaphoneEqual(java.lang.String, java.lang.String, boolean)
    
    @Test
    public void testIsDoubleMetaphoneEqual2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:245) */
        doubleMetaphone.isDoubleMetaphoneEqual(null, string, false);
    }
    
    @Test
    public void testIsDoubleMetaphoneEqual3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:245) */
        doubleMetaphone.isDoubleMetaphoneEqual(null, string, false);
    }
    
    @Test
    public void testIsDoubleMetaphoneEqual4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:245) */
        doubleMetaphone.isDoubleMetaphoneEqual(string, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isDoubleMetaphoneEqual(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isDoubleMetaphoneEqual(java.lang.String,java.lang.String)}
     */
    @Test
    public void testIsDoubleMetaphoneEqualReturnsTrueWithNonEmptyStrings1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(0);
        
        boolean actual = doubleMetaphone.isDoubleMetaphoneEqual("-3", "10");
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isDoubleMetaphoneEqual(java.lang.String, java.lang.String)
    
    @Test
    public void testIsDoubleMetaphoneEqual5() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        boolean actual = doubleMetaphone.isDoubleMetaphoneEqual(string, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isDoubleMetaphoneEqual(java.lang.String, java.lang.String)
    
    @Test
    public void testIsDoubleMetaphoneEqual6() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "!\u0001";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:245)
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:229) */
        doubleMetaphone.isDoubleMetaphoneEqual(null, string);
    }
    
    @Test
    public void testIsDoubleMetaphoneEqual7() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:245)
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:229) */
        doubleMetaphone.isDoubleMetaphoneEqual(null, string);
    }
    
    @Test
    public void testIsDoubleMetaphoneEqual8() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001\u0001";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:245)
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:229) */
        doubleMetaphone.isDoubleMetaphoneEqual(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.conditionL0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method conditionL0(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index == value.length() - 3): True}
 * @utbot.executesCondition {@code (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")): False}
 * @utbot.executesCondition {@code (contains(value, value.length() - 2, 2, "AS", "OS") || contains(value, value.length() - 1, 1, "A", "O")): True}
 * @utbot.executesCondition {@code (contains(value, value.length() - 1, 1, "A", "O")): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testConditionL0_NotContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = string;
        conditionL0MethodArguments[1] = -3;
        boolean actual = ((Boolean) conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index == value.length() - 3): False}
 * @utbot.executesCondition {@code (contains(value, value.length() - 2, 2, "AS", "OS") || contains(value, value.length() - 1, 1, "A", "O")): False}
 * @utbot.executesCondition {@code (contains(value, index - 1, 4, "ALLE")): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testConditionL0_NotContains_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "AS";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = string;
        conditionL0MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index == value.length() - 3): False}
 * @utbot.executesCondition {@code (contains(value, value.length() - 2, 2, "AS", "OS") || contains(value, value.length() - 1, 1, "A", "O")): False}
 * @utbot.executesCondition {@code (contains(value, index - 1, 4, "ALLE")): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testConditionL0_NotContains_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "AS";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = string;
        conditionL0MethodArguments[1] = 249;
        boolean actual = ((Boolean) conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index == value.length() - 3): True}
 * @utbot.executesCondition {@code (contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")): True}
 *  */
    @Test
    public void testConditionL0_Contains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "                               ILLO";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = string;
        conditionL0MethodArguments[1] = 32;
        boolean actual = ((Boolean) conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method conditionL0(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index == value.length() - 3 && contains(value, index - 1, 4, "ILLO", "ILLA", "ALLE")
 *  */
    @Test
    public void testConditionL0_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.conditionL0] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.conditionL0(DoubleMetaphone.java:859) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = ((Object) null);
        conditionL0MethodArguments[1] = -255;
        try {
            conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method conditionL0(java.lang.String, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)}
     */
    @Test
    public void testConditionL0ReturnsFalseWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(4);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = "1";
        conditionL0MethodArguments[1] = -1;
        boolean actual = ((Boolean) conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleG
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleG_ReturnIndex() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = string;
        handleGMethodArguments[1] = ((Object) null);
        handleGMethodArguments[2] = -1;
        handleGMethodArguments[3] = false;
        int actual = ((Integer) handleGMethod.invoke(doubleMetaphone, handleGMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleG_ReturnIndex_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = string;
        handleGMethodArguments[1] = doubleMetaphoneResult;
        handleGMethodArguments[2] = 0;
        handleGMethodArguments[3] = false;
        int actual = ((Integer) handleGMethod.invoke(doubleMetaphone, handleGMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleG_ReturnIndex_2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 129);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = string;
        handleGMethodArguments[1] = doubleMetaphoneResult;
        handleGMethodArguments[2] = 0;
        handleGMethodArguments[3] = false;
        int actual = ((Integer) handleGMethod.invoke(doubleMetaphone, handleGMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleG_ReturnIndex_3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " HI";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = string;
        handleGMethodArguments[1] = doubleMetaphoneResult;
        handleGMethodArguments[2] = 0;
        handleGMethodArguments[3] = false;
        int actual = ((Integer) handleGMethod.invoke(doubleMetaphone, handleGMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test
    public void testHandleG_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483647, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:434) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = string;
        handleGMethodArguments[1] = ((Object) null);
        handleGMethodArguments[2] = 2147483646;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} 
 *  */
    @Test
    public void testHandleG_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483645, length 32]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:957)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:450) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = string;
        handleGMethodArguments[1] = ((Object) null);
        handleGMethodArguments[2] = Integer.MIN_VALUE;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: index = handleGH(value, result, index);
 *  */
    @Test
    public void testHandleG_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:484)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:423) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = string;
        handleGMethodArguments[1] = ((Object) null);
        handleGMethodArguments[2] = 0;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: index = handleGH(value, result, index);
 *  */
    @Test
    public void testHandleG_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " HI";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:482)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:423) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = string;
        handleGMethodArguments[1] = ((Object) null);
        handleGMethodArguments[2] = 0;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleG_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:466) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = ((Object) null);
        handleGMethodArguments[1] = ((Object) null);
        handleGMethodArguments[2] = -2;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleGByFuzzer() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(78);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:466) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = "01";
        handleGMethodArguments[1] = ((Object) null);
        handleGMethodArguments[2] = 6;
        handleGMethodArguments[3] = true;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.conditionM0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method conditionM0(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionM0(java.lang.String,int)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'M'): False}
 * @utbot.returnsFrom {@code return contains(value, index - 1, 3, "UMB") && ((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"));}
 *  */
    @Test
    public void testConditionM0_ContainsAndIndexPlus1EqualsValueLengthMinus1OrContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionM0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionM0", stringType, intType);
        conditionM0Method.setAccessible(true);
        java.lang.Object[] conditionM0MethodArguments = new java.lang.Object[2];
        conditionM0MethodArguments[0] = string;
        conditionM0MethodArguments[1] = 1;
        boolean actual = ((Boolean) conditionM0Method.invoke(doubleMetaphone, conditionM0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionM0(java.lang.String,int)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'M'): False}
 * @utbot.returnsFrom {@code return contains(value, index - 1, 3, "UMB") && ((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"));}
 *  */
    @Test
    public void testConditionM0_ContainsAndIndexPlus1EqualsValueLengthMinus1OrContains_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionM0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionM0", stringType, intType);
        conditionM0Method.setAccessible(true);
        java.lang.Object[] conditionM0MethodArguments = new java.lang.Object[2];
        conditionM0MethodArguments[0] = ((Object) null);
        conditionM0MethodArguments[1] = -254;
        boolean actual = ((Boolean) conditionM0Method.invoke(doubleMetaphone, conditionM0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionM0(java.lang.String,int)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'M'): False}
 * @utbot.returnsFrom {@code return contains(value, index - 1, 3, "UMB") && ((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"));}
 *  */
    @Test
    public void testConditionM0_ContainsAndIndexPlus1EqualsValueLengthMinus1OrContains_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionM0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionM0", stringType, intType);
        conditionM0Method.setAccessible(true);
        java.lang.Object[] conditionM0MethodArguments = new java.lang.Object[2];
        conditionM0MethodArguments[0] = string;
        conditionM0MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionM0Method.invoke(doubleMetaphone, conditionM0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionM0(java.lang.String,int)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'M'): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testConditionM0_CharAtEqualsM() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "M";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionM0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionM0", stringType, intType);
        conditionM0Method.setAccessible(true);
        java.lang.Object[] conditionM0MethodArguments = new java.lang.Object[2];
        conditionM0MethodArguments[0] = string;
        conditionM0MethodArguments[1] = -1;
        boolean actual = ((Boolean) conditionM0Method.invoke(doubleMetaphone, conditionM0MethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionM0(java.lang.String,int)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'M'): False}
 * @utbot.returnsFrom {@code return contains(value, index - 1, 3, "UMB") && ((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"));}
 *  */
    @Test
    public void testConditionM0_ContainsAndIndexPlus1EqualsValueLengthMinus1OrContains_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "   ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionM0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionM0", stringType, intType);
        conditionM0Method.setAccessible(true);
        java.lang.Object[] conditionM0MethodArguments = new java.lang.Object[2];
        conditionM0MethodArguments[0] = string;
        conditionM0MethodArguments[1] = 1;
        boolean actual = ((Boolean) conditionM0Method.invoke(doubleMetaphone, conditionM0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionM0(java.lang.String,int)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'M'): False}
 * @utbot.executesCondition {@code (((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"))): False}
 * @utbot.returnsFrom {@code return contains(value, index - 1, 3, "UMB") && ((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"));}
 *  */
    @Test
    public void testConditionM0_IndexPlus1EqualsValueLengthMinus1OrContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "UMB";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionM0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionM0", stringType, intType);
        conditionM0Method.setAccessible(true);
        java.lang.Object[] conditionM0MethodArguments = new java.lang.Object[2];
        conditionM0MethodArguments[0] = string;
        conditionM0MethodArguments[1] = 1;
        boolean actual = ((Boolean) conditionM0Method.invoke(doubleMetaphone, conditionM0MethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionM0(java.lang.String,int)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'M'): False}
 * @utbot.executesCondition {@code (((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"))): True}
 * @utbot.executesCondition {@code (((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"))): False}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.returnsFrom {@code return contains(value, index - 1, 3, "UMB") && ((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"));}
 *  */
    @Test
    public void testConditionM0_IndexPlus1EqualsValueLengthMinus1OrContains_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "                            @UMB ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionM0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionM0", stringType, intType);
        conditionM0Method.setAccessible(true);
        java.lang.Object[] conditionM0MethodArguments = new java.lang.Object[2];
        conditionM0MethodArguments[0] = string;
        conditionM0MethodArguments[1] = 30;
        boolean actual = ((Boolean) conditionM0Method.invoke(doubleMetaphone, conditionM0MethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method conditionM0(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionM0(java.lang.String,int)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'M'): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return contains(value, index - 1, 3, "UMB") && ((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"));
 *  */
    @Test
    public void testConditionM0_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.conditionM0] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483646, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948)
            org.apache.commons.codec.language.DoubleMetaphone.conditionM0(DoubleMetaphone.java:878) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionM0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionM0", stringType, intType);
        conditionM0Method.setAccessible(true);
        java.lang.Object[] conditionM0MethodArguments = new java.lang.Object[2];
        conditionM0MethodArguments[0] = string;
        conditionM0MethodArguments[1] = Integer.MIN_VALUE;
        try {
            conditionM0Method.invoke(doubleMetaphone, conditionM0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.getMaxCodeLen
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxCodeLen()
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#getMaxCodeLen()}
 * @utbot.returnsFrom {@code return this.maxCodeLen;}
 *  */
    @Test
    public void testGetMaxCodeLen_ReturnThisMaxCodeLen() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.maxCodeLen = -255;
        
        int actual = doubleMetaphone.getMaxCodeLen();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleAEIOUY
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method handleAEIOUY(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleAEIOUY(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.returnsFrom {@code return index + 1;}
 *  */
    @Test
    public void testHandleAEIOUY_IndexNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleAEIOUYMethod = doubleMetaphoneClazz.getDeclaredMethod("handleAEIOUY", stringType, doubleMetaphoneResultType, intType);
        handleAEIOUYMethod.setAccessible(true);
        java.lang.Object[] handleAEIOUYMethodArguments = new java.lang.Object[3];
        handleAEIOUYMethodArguments[0] = ((Object) null);
        handleAEIOUYMethodArguments[1] = ((Object) null);
        handleAEIOUYMethodArguments[2] = -246;
        int actual = ((Integer) handleAEIOUYMethod.invoke(doubleMetaphone, handleAEIOUYMethodArguments));
        
        assertEquals(-245, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method handleAEIOUY(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (index == 0): True}
    /// invoke:
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)} twice
    /// return from: {@code return index + 1;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleAEIOUY(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index + 1;}
 *  */
    @Test
    public void testHandleAEIOUY_ReturnIndexPlus1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleAEIOUYMethod = doubleMetaphoneClazz.getDeclaredMethod("handleAEIOUY", stringType, doubleMetaphoneResultType, intType);
        handleAEIOUYMethod.setAccessible(true);
        java.lang.Object[] handleAEIOUYMethodArguments = new java.lang.Object[3];
        handleAEIOUYMethodArguments[0] = ((Object) null);
        handleAEIOUYMethodArguments[1] = doubleMetaphoneResult;
        handleAEIOUYMethodArguments[2] = 0;
        int actual = ((Integer) handleAEIOUYMethod.invoke(doubleMetaphone, handleAEIOUYMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleAEIOUY(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index + 1;}
 *  */
    @Test
    public void testHandleAEIOUY_ReturnIndexPlus1_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleAEIOUYMethod = doubleMetaphoneClazz.getDeclaredMethod("handleAEIOUY", stringType, doubleMetaphoneResultType, intType);
        handleAEIOUYMethod.setAccessible(true);
        java.lang.Object[] handleAEIOUYMethodArguments = new java.lang.Object[3];
        handleAEIOUYMethodArguments[0] = ((Object) null);
        handleAEIOUYMethodArguments[1] = doubleMetaphoneResult;
        handleAEIOUYMethodArguments[2] = 0;
        int actual = ((Integer) handleAEIOUYMethod.invoke(doubleMetaphone, handleAEIOUYMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleAEIOUY(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index + 1;}
 *  */
    @Test
    public void testHandleAEIOUY_ReturnIndexPlus1_2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 3);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleAEIOUYMethod = doubleMetaphoneClazz.getDeclaredMethod("handleAEIOUY", stringType, doubleMetaphoneResultType, intType);
        handleAEIOUYMethod.setAccessible(true);
        java.lang.Object[] handleAEIOUYMethodArguments = new java.lang.Object[3];
        handleAEIOUYMethodArguments[0] = ((Object) null);
        handleAEIOUYMethodArguments[1] = doubleMetaphoneResult;
        handleAEIOUYMethodArguments[2] = 0;
        int actual = ((Integer) handleAEIOUYMethod.invoke(doubleMetaphone, handleAEIOUYMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleAEIOUY(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleAEIOUY(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('A');
 *  */
    @Test
    public void testHandleAEIOUY_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleAEIOUY] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleAEIOUY(DoubleMetaphone.java:273) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleAEIOUYMethod = doubleMetaphoneClazz.getDeclaredMethod("handleAEIOUY", stringType, doubleMetaphoneResultType, intType);
        handleAEIOUYMethod.setAccessible(true);
        java.lang.Object[] handleAEIOUYMethodArguments = new java.lang.Object[3];
        handleAEIOUYMethodArguments[0] = ((Object) null);
        handleAEIOUYMethodArguments[1] = ((Object) null);
        handleAEIOUYMethodArguments[2] = 0;
        try {
            handleAEIOUYMethod.invoke(doubleMetaphone, handleAEIOUYMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.isSlavoGermanic
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isSlavoGermanic(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isSlavoGermanic(java.lang.String)}
 * @utbot.executesCondition {@code (value.indexOf("CZ") > -1): False}
 * @utbot.executesCondition {@code (value.indexOf("CZ") > -1): False}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return value.indexOf('W') > -1 || value.indexOf('K') > -1 || value.indexOf("CZ") > -1 || value.indexOf("WITZ") > -1;}
 *  */
    @Test
    public void testIsSlavoGermanic_ValueIndexOfLessOrEqualNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Method isSlavoGermanicMethod = doubleMetaphoneClazz.getDeclaredMethod("isSlavoGermanic", stringType);
        isSlavoGermanicMethod.setAccessible(true);
        java.lang.Object[] isSlavoGermanicMethodArguments = new java.lang.Object[1];
        isSlavoGermanicMethodArguments[0] = string;
        boolean actual = ((Boolean) isSlavoGermanicMethod.invoke(doubleMetaphone, isSlavoGermanicMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isSlavoGermanic(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#indexOf(int)} once
    /// return from: {@code return value.indexOf('W') > -1 || value.indexOf('K') > -1 || value.indexOf("CZ") > -1 || value.indexOf("WITZ") > -1;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isSlavoGermanic(java.lang.String)}
 * @utbot.returnsFrom {@code return value.indexOf('W') > -1 || value.indexOf('K') > -1 || value.indexOf("CZ") > -1 || value.indexOf("WITZ") > -1;}
 *  */
    @Test
    public void testIsSlavoGermanic_ValueIndexOfGreaterThanNegative1OrValueIndexOfGreaterThanNegative1OrValueIndexOfGreaterThanNegative1OrValueIndexOfGreaterThanNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "W";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Method isSlavoGermanicMethod = doubleMetaphoneClazz.getDeclaredMethod("isSlavoGermanic", stringType);
        isSlavoGermanicMethod.setAccessible(true);
        java.lang.Object[] isSlavoGermanicMethodArguments = new java.lang.Object[1];
        isSlavoGermanicMethodArguments[0] = string;
        boolean actual = ((Boolean) isSlavoGermanicMethod.invoke(doubleMetaphone, isSlavoGermanicMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isSlavoGermanic(java.lang.String)}
 * @utbot.returnsFrom {@code return value.indexOf('W') > -1 || value.indexOf('K') > -1 || value.indexOf("CZ") > -1 || value.indexOf("WITZ") > -1;}
 *  */
    @Test
    public void testIsSlavoGermanic_ValueIndexOfGreaterThanNegative1OrValueIndexOfGreaterThanNegative1OrValueIndexOfGreaterThanNegative1OrValueIndexOfGreaterThanNegative1_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "K";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Method isSlavoGermanicMethod = doubleMetaphoneClazz.getDeclaredMethod("isSlavoGermanic", stringType);
        isSlavoGermanicMethod.setAccessible(true);
        java.lang.Object[] isSlavoGermanicMethodArguments = new java.lang.Object[1];
        isSlavoGermanicMethodArguments[0] = string;
        boolean actual = ((Boolean) isSlavoGermanicMethod.invoke(doubleMetaphone, isSlavoGermanicMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isSlavoGermanic(java.lang.String)}
 * @utbot.executesCondition {@code (value.indexOf("CZ") > -1): True}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String)}
 * @utbot.returnsFrom {@code return value.indexOf('W') > -1 || value.indexOf('K') > -1 || value.indexOf("CZ") > -1 || value.indexOf("WITZ") > -1;}
 *  */
    @Test
    public void testIsSlavoGermanic_ValueIndexOfGreaterThanNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CZ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Method isSlavoGermanicMethod = doubleMetaphoneClazz.getDeclaredMethod("isSlavoGermanic", stringType);
        isSlavoGermanicMethod.setAccessible(true);
        java.lang.Object[] isSlavoGermanicMethodArguments = new java.lang.Object[1];
        isSlavoGermanicMethodArguments[0] = string;
        boolean actual = ((Boolean) isSlavoGermanicMethod.invoke(doubleMetaphone, isSlavoGermanicMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSlavoGermanic(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isSlavoGermanic(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return value.indexOf('W') > -1 || value.indexOf('K') > -1 || value.indexOf("CZ") > -1 || value.indexOf("WITZ") > -1;
 *  */
    @Test
    public void testIsSlavoGermanic_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isSlavoGermanic] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isSlavoGermanic(DoubleMetaphone.java:890) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Method isSlavoGermanicMethod = doubleMetaphoneClazz.getDeclaredMethod("isSlavoGermanic", stringType);
        isSlavoGermanicMethod.setAccessible(true);
        java.lang.Object[] isSlavoGermanicMethodArguments = new java.lang.Object[1];
        isSlavoGermanicMethodArguments[0] = ((Object) null);
        try {
            isSlavoGermanicMethod.invoke(doubleMetaphone, isSlavoGermanicMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleD
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleD(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleD(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleD_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = ((Object) null);
        handleDMethodArguments[1] = doubleMetaphoneResult;
        handleDMethodArguments[2] = -1;
        int actual = ((Integer) handleDMethod.invoke(doubleMetaphone, handleDMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleD(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleD(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index, 2, "DG")
 *  */
    @Test
    public void testHandleD_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483647, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948)
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:395) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = ((Object) null);
        handleDMethodArguments[2] = Integer.MAX_VALUE;
        try {
            handleDMethod.invoke(doubleMetaphone, handleDMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleD(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('T');
 *  */
    @Test
    public void testHandleD_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:409) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = ((Object) null);
        handleDMethodArguments[2] = 0;
        try {
            handleDMethod.invoke(doubleMetaphone, handleDMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleD(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('T');
 *  */
    @Test
    public void testHandleD_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:409) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = ((Object) null);
        handleDMethodArguments[1] = ((Object) null);
        handleDMethodArguments[2] = -1;
        try {
            handleDMethod.invoke(doubleMetaphone, handleDMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleD(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleD1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = doubleMetaphoneResult;
        handleDMethodArguments[2] = 2147483643;
        int actual = ((Integer) handleDMethod.invoke(doubleMetaphone, handleDMethodArguments));
        
        assertEquals(2147483644, actual);
    }
    
    @Test
    public void testHandleD2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuffer alternate = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = doubleMetaphoneResult;
        handleDMethodArguments[2] = Integer.MIN_VALUE;
        int actual = ((Integer) handleDMethod.invoke(doubleMetaphone, handleDMethodArguments));
        
        assertEquals(-2147483647, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleD(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleD3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1053)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1043)
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:409) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = doubleMetaphoneResult;
        handleDMethodArguments[2] = 23;
        try {
            handleDMethod.invoke(doubleMetaphone, handleDMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleD4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000DG\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1075)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1065)
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:402) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = doubleMetaphoneResult;
        handleDMethodArguments[2] = 1;
        try {
            handleDMethod.invoke(doubleMetaphone, handleDMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleD5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "D\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:409) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = ((Object) null);
        handleDMethodArguments[2] = 0;
        try {
            handleDMethod.invoke(doubleMetaphone, handleDMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleD6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "DG";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:402) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = ((Object) null);
        handleDMethodArguments[2] = 0;
        try {
            handleDMethod.invoke(doubleMetaphone, handleDMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleD7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:1059)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1044)
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:409) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = doubleMetaphoneResult;
        handleDMethodArguments[2] = 2147483643;
        try {
            handleDMethod.invoke(doubleMetaphone, handleDMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.isVowel
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVowel(char)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)}
 * @utbot.returnsFrom {@code return VOWELS.indexOf(ch) != -1;}
 *  */
    @Test
    public void testIsVowel_VOWELSIndexOfEqualsNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class charType = char.class;
        Method isVowelMethod = doubleMetaphoneClazz.getDeclaredMethod("isVowel", charType);
        isVowelMethod.setAccessible(true);
        java.lang.Object[] isVowelMethodArguments = new java.lang.Object[1];
        isVowelMethodArguments[0] = '\u8000';
        boolean actual = ((Boolean) isVowelMethod.invoke(doubleMetaphone, isVowelMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)}
 * @utbot.returnsFrom {@code return VOWELS.indexOf(ch) != -1;}
 *  */
    @Test
    public void testIsVowel_VOWELSIndexOfNotEqualsNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class charType = char.class;
        Method isVowelMethod = doubleMetaphoneClazz.getDeclaredMethod("isVowel", charType);
        isVowelMethod.setAccessible(true);
        java.lang.Object[] isVowelMethodArguments = new java.lang.Object[1];
        isVowelMethodArguments[0] = 'A';
        boolean actual = ((Boolean) isVowelMethod.invoke(doubleMetaphone, isVowelMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleH
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleH_IndexEqualsZero() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000A";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = string;
        handleHMethodArguments[1] = doubleMetaphoneResult;
        handleHMethodArguments[2] = 0;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('H');
 *  */
    @Test
    public void testHandleH_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000A";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleH(DoubleMetaphone.java:514) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = string;
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = 0;
        try {
            handleHMethod.invoke(doubleMetaphone, handleHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleH1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = ((Object) null);
        handleHMethodArguments[1] = doubleMetaphoneResult;
        handleHMethodArguments[2] = -1073741824;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(-1073741823, actual);
    }
    
    @Test
    public void testHandleH2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = string;
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = 1073741825;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(1073741826, actual);
    }
    
    @Test
    public void testHandleH3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = string;
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = 0;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testHandleH4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000I";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = string;
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = 31;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(32, actual);
    }
    
    @Test
    public void testHandleH5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000A\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = string;
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = 35;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(36, actual);
    }
    
    @Test
    public void testHandleH6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = string;
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = 1;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testHandleH7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = string;
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = 0;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testHandleH8() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000A";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuffer alternate = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = string;
        handleHMethodArguments[1] = doubleMetaphoneResult;
        handleHMethodArguments[2] = 0;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleJ
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleJ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index, 4, "JOSE") || contains(value, 0, 4, "SAN ")
 *  */
    @Test
    public void testHandleJ_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948)
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:528) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleJMethod = doubleMetaphoneClazz.getDeclaredMethod("handleJ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleJMethod.setAccessible(true);
        java.lang.Object[] handleJMethodArguments = new java.lang.Object[4];
        handleJMethodArguments[0] = string;
        handleJMethodArguments[1] = ((Object) null);
        handleJMethodArguments[2] = Integer.MAX_VALUE;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleJ1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483648, length 32]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:967)
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:545) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleJMethod = doubleMetaphoneClazz.getDeclaredMethod("handleJ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleJMethod.setAccessible(true);
        java.lang.Object[] handleJMethodArguments = new java.lang.Object[4];
        handleJMethodArguments[0] = string;
        handleJMethodArguments[1] = ((Object) null);
        handleJMethodArguments[2] = Integer.MIN_VALUE;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1053)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1043)
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:546) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleJMethod = doubleMetaphoneClazz.getDeclaredMethod("handleJ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleJMethod.setAccessible(true);
        java.lang.Object[] handleJMethodArguments = new java.lang.Object[4];
        handleJMethodArguments[0] = string;
        handleJMethodArguments[1] = doubleMetaphoneResult;
        handleJMethodArguments[2] = 29;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:546) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleJMethod = doubleMetaphoneClazz.getDeclaredMethod("handleJ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleJMethod.setAccessible(true);
        java.lang.Object[] handleJMethodArguments = new java.lang.Object[4];
        handleJMethodArguments[0] = string;
        handleJMethodArguments[1] = ((Object) null);
        handleJMethodArguments[2] = 1;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:539) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleJMethod = doubleMetaphoneClazz.getDeclaredMethod("handleJ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleJMethod.setAccessible(true);
        java.lang.Object[] handleJMethodArguments = new java.lang.Object[4];
        handleJMethodArguments[0] = string;
        handleJMethodArguments[1] = ((Object) null);
        handleJMethodArguments[2] = 0;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:546) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleJMethod = doubleMetaphoneClazz.getDeclaredMethod("handleJ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleJMethod.setAccessible(true);
        java.lang.Object[] handleJMethodArguments = new java.lang.Object[4];
        handleJMethodArguments[0] = string;
        handleJMethodArguments[1] = ((Object) null);
        handleJMethodArguments[2] = 2147483641;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "JO\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:539) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleJMethod = doubleMetaphoneClazz.getDeclaredMethod("handleJ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleJMethod.setAccessible(true);
        java.lang.Object[] handleJMethodArguments = new java.lang.Object[4];
        handleJMethodArguments[0] = string;
        handleJMethodArguments[1] = ((Object) null);
        handleJMethodArguments[2] = 0;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000JO\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:546) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleJMethod = doubleMetaphoneClazz.getDeclaredMethod("handleJ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleJMethod.setAccessible(true);
        java.lang.Object[] handleJMethodArguments = new java.lang.Object[4];
        handleJMethodArguments[0] = string;
        handleJMethodArguments[1] = ((Object) null);
        handleJMethodArguments[2] = 1;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ8() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:546) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleJMethod = doubleMetaphoneClazz.getDeclaredMethod("handleJ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleJMethod.setAccessible(true);
        java.lang.Object[] handleJMethodArguments = new java.lang.Object[4];
        handleJMethodArguments[0] = string;
        handleJMethodArguments[1] = ((Object) null);
        handleJMethodArguments[2] = -1073741824;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.doubleMetaphone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doubleMetaphone(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#doubleMetaphone(java.lang.String)}
 * @utbot.returnsFrom {@code return doubleMetaphone(value, false);}
 *  */
    @Test
    public void testDoubleMetaphone_ReturnDoubleMetaphone() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        String actual = doubleMetaphone.doubleMetaphone(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#doubleMetaphone(java.lang.String)}
 * @utbot.returnsFrom {@code return doubleMetaphone(value, false);}
 *  */
    @Test
    public void testDoubleMetaphone_ReturnDoubleMetaphone_1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        String actual = doubleMetaphone.doubleMetaphone(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method doubleMetaphone(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#doubleMetaphone(java.lang.String)}
     */
    @Test
    public void testDoubleMetaphoneWithNonEmptyString() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(0);
        
        String actual = doubleMetaphone.doubleMetaphone("-\uFFF43");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doubleMetaphone(java.lang.String)
    
    @Test
    public void testDoubleMetaphone1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        
        String actual = doubleMetaphone.doubleMetaphone(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.doubleMetaphone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doubleMetaphone(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#doubleMetaphone(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDoubleMetaphone_ReturnNull() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        String actual = doubleMetaphone.doubleMetaphone(null, false);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#doubleMetaphone(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDoubleMetaphone_ReturnNull_1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        String actual = doubleMetaphone.doubleMetaphone(string, false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doubleMetaphone(java.lang.String, boolean)
    
    @Test
    public void testDoubleMetaphone2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001\u0001!";
        
        String actual = doubleMetaphone.doubleMetaphone(string, false);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleL
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleL(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleL_ReturnIndex() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = ((Object) null);
        handleLMethodArguments[1] = doubleMetaphoneResult;
        handleLMethodArguments[2] = -2;
        int actual = ((Integer) handleLMethod.invoke(doubleMetaphone, handleLMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleL(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleL_ReturnIndex_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = ((Object) null);
        handleLMethodArguments[1] = doubleMetaphoneResult;
        handleLMethodArguments[2] = -2;
        int actual = ((Integer) handleLMethod.invoke(doubleMetaphone, handleLMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleL(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleL_ReturnIndex_2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 129);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = doubleMetaphoneResult;
        handleLMethodArguments[2] = -1;
        int actual = ((Integer) handleLMethod.invoke(doubleMetaphone, handleLMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleL(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('L');
 *  */
    @Test
    public void testHandleL_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:573) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = ((Object) null);
        handleLMethodArguments[2] = -1;
        try {
            handleLMethod.invoke(doubleMetaphone, handleLMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleL(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('L');
 *  */
    @Test
    public void testHandleL_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:573) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = ((Object) null);
        handleLMethodArguments[1] = ((Object) null);
        handleLMethodArguments[2] = -2;
        try {
            handleLMethod.invoke(doubleMetaphone, handleLMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleL(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('L');
 *  */
    @Test
    public void testHandleL_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:573) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = ((Object) null);
        handleLMethodArguments[2] = -1;
        try {
            handleLMethod.invoke(doubleMetaphone, handleLMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleL1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuffer alternate = new StringBuffer("\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 3);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = doubleMetaphoneResult;
        handleLMethodArguments[2] = -3;
        int actual = ((Integer) handleLMethod.invoke(doubleMetaphone, handleLMethodArguments));
        
        assertEquals(-2, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleL2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000L\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:568) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = ((Object) null);
        handleLMethodArguments[2] = 0;
        try {
            handleLMethod.invoke(doubleMetaphone, handleLMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleL3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "L";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:568) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = ((Object) null);
        handleLMethodArguments[2] = -1;
        try {
            handleLMethod.invoke(doubleMetaphone, handleLMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleC
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: conditionC0(value, index)
 *  */
    @Test
    public void testHandleC_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948)
            org.apache.commons.codec.language.DoubleMetaphone.conditionC0(DoubleMetaphone.java:812)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:284) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = Integer.MAX_VALUE;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleC1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000O";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1053)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1043)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:317) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = doubleMetaphoneResult;
        handleCMethodArguments[2] = 10;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1053)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1043)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:317) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = doubleMetaphoneResult;
        handleCMethodArguments[2] = 9;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1053)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1043)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:317) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = doubleMetaphoneResult;
        handleCMethodArguments[2] = 1073741857;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:317) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = 0;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CHIA";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:285) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = 0;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:317) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = 1;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000CHI\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:380)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:291) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = 3;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC8() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CH\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:383)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:291) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = 0;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC9() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:317) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = ((Object) null);
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = Integer.MIN_VALUE;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC10() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1013)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:297) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = ((Object) null);
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = -1;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleCC
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleCC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleCC_ReturnIndex() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = ((Object) null);
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = -3;
        int actual = ((Integer) handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleCC_ReturnIndex_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = -2;
        int actual = ((Integer) handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleCC_ReturnIndex_2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuffer alternate = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = ((Object) null);
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = -3;
        int actual = ((Integer) handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleCC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index + 2, 1, "I", "E", "H") && !contains(value, index + 2, 2, "HU")
 *  */
    @Test
    public void testHandleCC_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483648, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:967)
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:338) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = ((Object) null);
        handleCCMethodArguments[2] = 2147483645;
        try {
            handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleCC_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:351) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = ((Object) null);
        handleCCMethodArguments[1] = ((Object) null);
        handleCCMethodArguments[2] = -3;
        try {
            handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleCC_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:351) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = ((Object) null);
        handleCCMethodArguments[2] = -2;
        try {
            handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleCC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleCC1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = 2147483644;
        int actual = ((Integer) handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments));
        
        assertEquals(2147483646, actual);
    }
    
    @Test
    public void testHandleCC2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 5);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = -16777222;
        int actual = ((Integer) handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments));
        
        assertEquals(-16777220, actual);
    }
    
    @Test
    public void testHandleCC3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = -16777222;
        int actual = ((Integer) handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments));
        
        assertEquals(-16777220, actual);
    }
    
    @Test
    public void testHandleCC4() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 9);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = 2147483644;
        int actual = ((Integer) handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments));
        
        assertEquals(2147483646, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleCC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleCC5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:351) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = ((Object) null);
        handleCCMethodArguments[2] = 3;
        try {
            handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCC6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "I";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:347) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = ((Object) null);
        handleCCMethodArguments[2] = -2;
        try {
            handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleP
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)} twice,
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)} twice,
    ///     org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String) twice
    /// return from: {@code return index;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleP(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleP_ReturnIndex() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = ((Object) null);
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = -2;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleP(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleP_ReturnIndex_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = ((Object) null);
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = -2;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleP(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleP_ReturnIndex_2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 3);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = ((Object) null);
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = -2;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleP(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleP_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = -1;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleP(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('P');
 *  */
    @Test
    public void testHandleP_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleP] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleP(DoubleMetaphone.java:588) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = ((Object) null);
        handlePMethodArguments[2] = -1;
        try {
            handlePMethod.invoke(doubleMetaphone, handlePMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleP(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('P');
 *  */
    @Test
    public void testHandleP_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleP] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleP(DoubleMetaphone.java:588) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = ((Object) null);
        handlePMethodArguments[1] = ((Object) null);
        handlePMethodArguments[2] = -2;
        try {
            handlePMethod.invoke(doubleMetaphone, handlePMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleP(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('F');
 *  */
    @Test
    public void testHandleP_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleP] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleP(DoubleMetaphone.java:585) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = ((Object) null);
        handlePMethodArguments[2] = -1;
        try {
            handlePMethod.invoke(doubleMetaphone, handlePMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleP1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", Integer.MAX_VALUE);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = 1;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testHandleP2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 34);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = 0;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testHandleP3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = -1;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHandleP4() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = 131071;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(131072, actual);
    }
    
    @Test
    public void testHandleP5() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 17);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = 1073741827;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(1073741828, actual);
    }
    
    @Test
    public void testHandleP6() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = 4194303;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(4194304, actual);
    }
    
    @Test
    public void testHandleP7() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 9);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = -1;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleR
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleR(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == value.length() - 1): False}
 * @utbot.returnsFrom {@code return charAt(value, index + 1) == 'R' ? index + 2 : index + 1;}
 *  */
    @Test
    public void testHandleR_IndexNotEqualsValueLengthMinus1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleRMethod = doubleMetaphoneClazz.getDeclaredMethod("handleR", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleRMethod.setAccessible(true);
        java.lang.Object[] handleRMethodArguments = new java.lang.Object[4];
        handleRMethodArguments[0] = string;
        handleRMethodArguments[1] = doubleMetaphoneResult;
        handleRMethodArguments[2] = -2;
        handleRMethodArguments[3] = false;
        int actual = ((Integer) handleRMethod.invoke(doubleMetaphone, handleRMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.executesCondition {@code (!slavoGermanic): False}
 * @utbot.returnsFrom {@code return charAt(value, index + 1) == 'R' ? index + 2 : index + 1;}
 *  */
    @Test
    public void testHandleR_SlavoGermanic() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleRMethod = doubleMetaphoneClazz.getDeclaredMethod("handleR", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleRMethod.setAccessible(true);
        java.lang.Object[] handleRMethodArguments = new java.lang.Object[4];
        handleRMethodArguments[0] = string;
        handleRMethodArguments[1] = doubleMetaphoneResult;
        handleRMethodArguments[2] = -1;
        handleRMethodArguments[3] = true;
        int actual = ((Integer) handleRMethod.invoke(doubleMetaphone, handleRMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleR(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index == value.length() - 1 && !slavoGermanic && contains(value, index - 2, 2, "IE") && !contains(value, index - 4, 2, "ME", "MA")
 *  */
    @Test
    public void testHandleR_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleR] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:601) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleRMethod = doubleMetaphoneClazz.getDeclaredMethod("handleR", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleRMethod.setAccessible(true);
        java.lang.Object[] handleRMethodArguments = new java.lang.Object[4];
        handleRMethodArguments[0] = ((Object) null);
        handleRMethodArguments[1] = ((Object) null);
        handleRMethodArguments[2] = -255;
        handleRMethodArguments[3] = false;
        try {
            handleRMethod.invoke(doubleMetaphone, handleRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.executesCondition {@code (!slavoGermanic): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('R');
 *  */
    @Test
    public void testHandleR_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleR] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:606) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleRMethod = doubleMetaphoneClazz.getDeclaredMethod("handleR", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleRMethod.setAccessible(true);
        java.lang.Object[] handleRMethodArguments = new java.lang.Object[4];
        handleRMethodArguments[0] = string;
        handleRMethodArguments[1] = ((Object) null);
        handleRMethodArguments[2] = 1;
        handleRMethodArguments[3] = true;
        try {
            handleRMethod.invoke(doubleMetaphone, handleRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == value.length() - 1): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('R');
 *  */
    @Test
    public void testHandleR_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleR] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:606) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleRMethod = doubleMetaphoneClazz.getDeclaredMethod("handleR", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleRMethod.setAccessible(true);
        java.lang.Object[] handleRMethodArguments = new java.lang.Object[4];
        handleRMethodArguments[0] = string;
        handleRMethodArguments[1] = ((Object) null);
        handleRMethodArguments[2] = -2;
        handleRMethodArguments[3] = false;
        try {
            handleRMethod.invoke(doubleMetaphone, handleRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.executesCondition {@code (!slavoGermanic): True}
 * @utbot.executesCondition {@code (contains(value, index - 2, 2, "IE")): False}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('R');
 *  */
    @Test
    public void testHandleR_ThrowNullPointerException_3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleR] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:606) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleRMethod = doubleMetaphoneClazz.getDeclaredMethod("handleR", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleRMethod.setAccessible(true);
        java.lang.Object[] handleRMethodArguments = new java.lang.Object[4];
        handleRMethodArguments[0] = string;
        handleRMethodArguments[1] = ((Object) null);
        handleRMethodArguments[2] = 1;
        handleRMethodArguments[3] = false;
        try {
            handleRMethod.invoke(doubleMetaphone, handleRMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleS
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleS(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index - 1, 3, "ISL", "YSL")
 *  */
    @Test
    public void testHandleS_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "   ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483646, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:957)
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:618) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleSMethod = doubleMetaphoneClazz.getDeclaredMethod("handleS", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleSMethod.setAccessible(true);
        java.lang.Object[] handleSMethodArguments = new java.lang.Object[4];
        handleSMethodArguments[0] = string;
        handleSMethodArguments[1] = ((Object) null);
        handleSMethodArguments[2] = Integer.MIN_VALUE;
        handleSMethodArguments[3] = false;
        try {
            handleSMethod.invoke(doubleMetaphone, handleSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleSByFuzzer() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(5);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:657) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleSMethod = doubleMetaphoneClazz.getDeclaredMethod("handleS", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleSMethod.setAccessible(true);
        java.lang.Object[] handleSMethodArguments = new java.lang.Object[4];
        handleSMethodArguments[0] = "bac";
        handleSMethodArguments[1] = ((Object) null);
        handleSMethodArguments[2] = 83;
        handleSMethodArguments[3] = true;
        try {
            handleSMethod.invoke(doubleMetaphone, handleSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleS1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ISL\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleSMethod = doubleMetaphoneClazz.getDeclaredMethod("handleS", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleSMethod.setAccessible(true);
        java.lang.Object[] handleSMethodArguments = new java.lang.Object[4];
        handleSMethodArguments[0] = string;
        handleSMethodArguments[1] = doubleMetaphoneResult;
        handleSMethodArguments[2] = 28;
        handleSMethodArguments[3] = false;
        int actual = ((Integer) handleSMethod.invoke(doubleMetaphone, handleSMethodArguments));
        
        assertEquals(29, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleS2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483645, end -2147483648, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:957)
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:634) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleSMethod = doubleMetaphoneClazz.getDeclaredMethod("handleS", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleSMethod.setAccessible(true);
        java.lang.Object[] handleSMethodArguments = new java.lang.Object[4];
        handleSMethodArguments[0] = string;
        handleSMethodArguments[1] = doubleMetaphoneResult;
        handleSMethodArguments[2] = 2147483645;
        handleSMethodArguments[3] = false;
        try {
            handleSMethod.invoke(doubleMetaphone, handleSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleS3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000IS\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1053)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1043)
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:657) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleSMethod = doubleMetaphoneClazz.getDeclaredMethod("handleS", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleSMethod.setAccessible(true);
        java.lang.Object[] handleSMethodArguments = new java.lang.Object[4];
        handleSMethodArguments[0] = string;
        handleSMethodArguments[1] = doubleMetaphoneResult;
        handleSMethodArguments[2] = 36;
        handleSMethodArguments[3] = false;
        try {
            handleSMethod.invoke(doubleMetaphone, handleSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleS4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:657) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleSMethod = doubleMetaphoneClazz.getDeclaredMethod("handleS", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleSMethod.setAccessible(true);
        java.lang.Object[] handleSMethodArguments = new java.lang.Object[4];
        handleSMethodArguments[0] = string;
        handleSMethodArguments[1] = ((Object) null);
        handleSMethodArguments[2] = 0;
        handleSMethodArguments[3] = false;
        try {
            handleSMethod.invoke(doubleMetaphone, handleSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleS5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "I\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:657) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleSMethod = doubleMetaphoneClazz.getDeclaredMethod("handleS", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleSMethod.setAccessible(true);
        java.lang.Object[] handleSMethodArguments = new java.lang.Object[4];
        handleSMethodArguments[0] = string;
        handleSMethodArguments[1] = ((Object) null);
        handleSMethodArguments[2] = 1;
        handleSMethodArguments[3] = false;
        try {
            handleSMethod.invoke(doubleMetaphone, handleSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleCH
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleCH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: index > 0 && contains(value, index, 4, "CHAE")
 *  */
    @Test
    public void testHandleCH_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "                  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483645, length 18]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948)
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:364) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = ((Object) null);
        handleCHMethodArguments[2] = Integer.MAX_VALUE;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleCH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleCH1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483643, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:967)
            org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(DoubleMetaphone.java:849)
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:371) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = ((Object) null);
        handleCHMethodArguments[2] = -2147483647;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "V\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483643, length 32]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:967)
            org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(DoubleMetaphone.java:849)
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:371) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = ((Object) null);
        handleCHMethodArguments[2] = -2147483647;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:380) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = ((Object) null);
        handleCHMethodArguments[2] = 2147483641;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:383) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = ((Object) null);
        handleCHMethodArguments[2] = 0;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:380) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = ((Object) null);
        handleCHMethodArguments[2] = 25;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000HA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:383) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = ((Object) null);
        handleCHMethodArguments[2] = 0;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleGH
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index > 1): False}
 * @utbot.executesCondition {@code (index > 2): False}
 * @utbot.executesCondition {@code (contains(value, index - 3, 1, "B", "H", "D")): False}
 * @utbot.executesCondition {@code (index > 2): False}
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleGH_IndexLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = ((Object) null);
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = -256;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(-254, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleGH_IndexEqualsZero() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = doubleMetaphoneResult;
        handleGHMethodArguments[2] = 0;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleGH_IndexEqualsZero_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = doubleMetaphoneResult;
        handleGHMethodArguments[2] = 0;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleGH_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000I";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = doubleMetaphoneResult;
        handleGHMethodArguments[2] = 0;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleGH_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:484) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 0;
        try {
            handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('J');
 *  */
    @Test
    public void testHandleGH_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000I";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:482) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 0;
        try {
            handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
     */
    @Test
    public void testHandleGHThrowsNPEWithNonEmptyString() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(3);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:478) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = "10";
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 73;
        try {
            handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleGH1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000I";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 33;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(35, actual);
    }
    
    @Test
    public void testHandleGH2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "I";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 1;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(3, actual);
    }
    
    @Test
    public void testHandleGH3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000I";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 3);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = doubleMetaphoneResult;
        handleGHMethodArguments[2] = 0;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleGH4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000E\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:498) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 33;
        try {
            handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleGH5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "O";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:498) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 1;
        try {
            handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleT
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleT(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleT(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleT_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "TION";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = doubleMetaphoneResult;
        handleTMethodArguments[2] = 0;
        int actual = ((Integer) handleTMethod.invoke(doubleMetaphone, handleTMethodArguments));
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleT(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleT(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index, 4, "TION")
 *  */
    @Test
    public void testHandleT_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948)
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:702) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = ((Object) null);
        handleTMethodArguments[2] = Integer.MAX_VALUE;
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleT(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('X');
 *  */
    @Test
    public void testHandleT_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "TION";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:703) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = ((Object) null);
        handleTMethodArguments[2] = 0;
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleT(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('T');
 *  */
    @Test
    public void testHandleT_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:720) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = ((Object) null);
        handleTMethodArguments[1] = ((Object) null);
        handleTMethodArguments[2] = -1;
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleT(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleT1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "TION";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = doubleMetaphoneResult;
        handleTMethodArguments[2] = 0;
        int actual = ((Integer) handleTMethod.invoke(doubleMetaphone, handleTMethodArguments));
        
        assertEquals(3, actual);
    }
    
    @Test
    public void testHandleT2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "TION";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuffer alternate = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = doubleMetaphoneResult;
        handleTMethodArguments[2] = 0;
        int actual = ((Integer) handleTMethod.invoke(doubleMetaphone, handleTMethodArguments));
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleT(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleT3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "TTTTTTTTTTTTTTTTTTTTTTTTT\u0000TTTTTTTTTT";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1053)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1043)
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:720) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = doubleMetaphoneResult;
        handleTMethodArguments[2] = 25;
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleT4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:720) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = ((Object) null);
        handleTMethodArguments[2] = 0;
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleT5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "T\u0000TTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:720) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = ((Object) null);
        handleTMethodArguments[2] = 0;
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleT6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:1059)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1044)
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:720) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = ((Object) null);
        handleTMethodArguments[1] = doubleMetaphoneResult;
        handleTMethodArguments[2] = Integer.MIN_VALUE;
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleX
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleX(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleX(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleX_ReturnIndex() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = ((Object) null);
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 0;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleX(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleX_ReturnIndex_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = ((Object) null);
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 0;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleX(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleX_ReturnIndex_2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 3);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = ((Object) null);
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 0;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleX(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleX(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (!((index == value.length() - 1) && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: result.append("KS");
 *  */
    @Test
    public void testHandleX_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483645);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1079)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1065)
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:779) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = -2;
        try {
            handleXMethod.invoke(doubleMetaphone, handleXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleX(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('S');
 *  */
    @Test
    public void testHandleX_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:772) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = ((Object) null);
        handleXMethodArguments[1] = ((Object) null);
        handleXMethodArguments[2] = 0;
        try {
            handleXMethod.invoke(doubleMetaphone, handleXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleX(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !((index == value.length() - 1) && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))
 *  */
    @Test
    public void testHandleX_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:775) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = ((Object) null);
        handleXMethodArguments[1] = ((Object) null);
        handleXMethodArguments[2] = 12;
        try {
            handleXMethod.invoke(doubleMetaphone, handleXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleX(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (!((index == value.length() - 1) && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append("KS");
 *  */
    @Test
    public void testHandleX_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:779) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = ((Object) null);
        handleXMethodArguments[2] = -2;
        try {
            handleXMethod.invoke(doubleMetaphone, handleXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleX(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleX1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 15);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 64;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(65, actual);
    }
    
    @Test
    public void testHandleX2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", Integer.MIN_VALUE);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 1;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testHandleX3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuffer alternate = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = ((Object) null);
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 0;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleX(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleX4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1079)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1065)
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:779) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 1;
        try {
            handleXMethod.invoke(doubleMetaphone, handleXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleX5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:779) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = ((Object) null);
        handleXMethodArguments[2] = 2;
        try {
            handleXMethod.invoke(doubleMetaphone, handleXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleX6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "I\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:779) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = ((Object) null);
        handleXMethodArguments[2] = 3;
        try {
            handleXMethod.invoke(doubleMetaphone, handleXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleX7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1073741854);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:1084)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1066)
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:779) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 1;
        try {
            handleXMethod.invoke(doubleMetaphone, handleXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.setMaxCodeLen
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxCodeLen(int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#setMaxCodeLen(int)}
 *  */
    @Test
    public void testSetMaxCodeLen() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.maxCodeLen = -255;
        
        doubleMetaphone.setMaxCodeLen(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleW
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleW(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#appendAlternate(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleW_IndexEqualsValueLengthMinus1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer alternate = new StringBuffer("A ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = doubleMetaphoneResult;
        handleWMethodArguments[2] = 1;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleW_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "WR";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("  ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = doubleMetaphoneResult;
        handleWMethodArguments[2] = 0;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleW(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index, 2, "WR")
 *  */
    @Test
    public void testHandleW_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483647, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948)
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:732) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = Integer.MAX_VALUE;
        try {
            handleWMethod.invoke(doubleMetaphone, handleWMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index == value.length() - 1): False}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")
 *  */
    @Test
    public void testHandleW_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483644, length 33]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:977)
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:748) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = Integer.MIN_VALUE;
        try {
            handleWMethod.invoke(doubleMetaphone, handleWMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (index == value.length() - 1 && isVowel(charAt(value, index - 1))) || contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") || contains(value, 0, 3, "SCH")
 *  */
    @Test
    public void testHandleW_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:747) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = ((Object) null);
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = -1;
        try {
            handleWMethod.invoke(doubleMetaphone, handleWMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('R');
 *  */
    @Test
    public void testHandleW_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "WR";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:734) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = 0;
        try {
            handleWMethod.invoke(doubleMetaphone, handleWMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#appendAlternate(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.appendAlternate('F');
 *  */
    @Test
    public void testHandleW_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:752) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = 1;
        try {
            handleWMethod.invoke(doubleMetaphone, handleWMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleW(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleW1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000W\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = doubleMetaphoneResult;
        handleWMethodArguments[2] = 31;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(32, actual);
    }
    
    @Test
    public void testHandleW2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = 1;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testHandleW3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = 2147483641;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(2147483642, actual);
    }
    
    @Test
    public void testHandleW4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = 0;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testHandleW5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = -1073741824;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(-1073741823, actual);
    }
    
    @Test
    public void testHandleW6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = -1;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHandleW7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = 0;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testHandleW8() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer alternate = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = doubleMetaphoneResult;
        handleWMethodArguments[2] = 1;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testHandleW9() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "WR";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuffer alternate = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = doubleMetaphoneResult;
        handleWMethodArguments[2] = 0;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleW(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleW10() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000WR\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1053)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1043)
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:734) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = doubleMetaphoneResult;
        handleWMethodArguments[2] = 1;
        try {
            handleWMethod.invoke(doubleMetaphone, handleWMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleW11() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "WR\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:1059)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1044)
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:734) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = doubleMetaphoneResult;
        handleWMethodArguments[2] = 0;
        try {
            handleWMethod.invoke(doubleMetaphone, handleWMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.conditionCH0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method conditionCH0(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionCH0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index != 0): True}
 *  */
    @Test
    public void testConditionCH0_IndexNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH0", stringType, intType);
        conditionCH0Method.setAccessible(true);
        java.lang.Object[] conditionCH0MethodArguments = new java.lang.Object[2];
        conditionCH0MethodArguments[0] = ((Object) null);
        conditionCH0MethodArguments[1] = -255;
        boolean actual = ((Boolean) conditionCH0Method.invoke(doubleMetaphone, conditionCH0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionCH0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index != 0): False}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testConditionCH0_IndexEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " HOR";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH0", stringType, intType);
        conditionCH0Method.setAccessible(true);
        java.lang.Object[] conditionCH0MethodArguments = new java.lang.Object[2];
        conditionCH0MethodArguments[0] = string;
        conditionCH0MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionCH0Method.invoke(doubleMetaphone, conditionCH0MethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method conditionCH0(java.lang.String, int)
    
    @Test
    public void testConditionCH01() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000H\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH0", stringType, intType);
        conditionCH0Method.setAccessible(true);
        java.lang.Object[] conditionCH0MethodArguments = new java.lang.Object[2];
        conditionCH0MethodArguments[0] = string;
        conditionCH0MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionCH0Method.invoke(doubleMetaphone, conditionCH0MethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testConditionCH02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000HA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH0", stringType, intType);
        conditionCH0Method.setAccessible(true);
        java.lang.Object[] conditionCH0MethodArguments = new java.lang.Object[2];
        conditionCH0MethodArguments[0] = string;
        conditionCH0MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionCH0Method.invoke(doubleMetaphone, conditionCH0MethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testConditionCH03() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000HARAC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH0", stringType, intType);
        conditionCH0Method.setAccessible(true);
        java.lang.Object[] conditionCH0MethodArguments = new java.lang.Object[2];
        conditionCH0MethodArguments[0] = string;
        conditionCH0MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionCH0Method.invoke(doubleMetaphone, conditionCH0MethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleZ
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (slavoGermanic): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('S');
 *  */
    @Test
    public void testHandleZ_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:799) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = ((Object) null);
        handleZMethodArguments[2] = 3;
        handleZMethodArguments[3] = false;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (slavoGermanic): True}
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('S');
 *  */
    @Test
    public void testHandleZ_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:799) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = ((Object) null);
        handleZMethodArguments[1] = ((Object) null);
        handleZMethodArguments[2] = -3;
        handleZMethodArguments[3] = true;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (slavoGermanic): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('S');
 *  */
    @Test
    public void testHandleZ_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:799) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = ((Object) null);
        handleZMethodArguments[1] = ((Object) null);
        handleZMethodArguments[2] = -2;
        handleZMethodArguments[3] = false;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (slavoGermanic): True}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append("S", "TS");
 *  */
    @Test
    public void testHandleZ_ThrowNullPointerException_3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:797) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = ((Object) null);
        handleZMethodArguments[2] = Integer.MAX_VALUE;
        handleZMethodArguments[3] = true;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('J');
 *  */
    @Test
    public void testHandleZ_ThrowNullPointerException_4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:793) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = ((Object) null);
        handleZMethodArguments[2] = -1;
        handleZMethodArguments[3] = false;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleZ1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = ((Object) null);
        handleZMethodArguments[1] = doubleMetaphoneResult;
        handleZMethodArguments[2] = -3;
        handleZMethodArguments[3] = true;
        int actual = ((Integer) handleZMethod.invoke(doubleMetaphone, handleZMethodArguments));
        
        assertEquals(-2, actual);
    }
    
    @Test
    public void testHandleZ2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = doubleMetaphoneResult;
        handleZMethodArguments[2] = 2147483640;
        handleZMethodArguments[3] = false;
        int actual = ((Integer) handleZMethod.invoke(doubleMetaphone, handleZMethodArguments));
        
        assertEquals(2147483641, actual);
    }
    
    @Test
    public void testHandleZ3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = doubleMetaphoneResult;
        handleZMethodArguments[2] = -1;
        handleZMethodArguments[3] = true;
        int actual = ((Integer) handleZMethod.invoke(doubleMetaphone, handleZMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHandleZ4() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = doubleMetaphoneResult;
        handleZMethodArguments[2] = -1;
        handleZMethodArguments[3] = false;
        int actual = ((Integer) handleZMethod.invoke(doubleMetaphone, handleZMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testHandleZ5() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuffer alternate = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 37);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = doubleMetaphoneResult;
        handleZMethodArguments[2] = -134217731;
        handleZMethodArguments[3] = false;
        int actual = ((Integer) handleZMethod.invoke(doubleMetaphone, handleZMethodArguments));
        
        assertEquals(-134217730, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleZ6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483647, length 32]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:967)
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:796) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = ((Object) null);
        handleZMethodArguments[2] = 2147483646;
        handleZMethodArguments[3] = false;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleZ7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1079)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1070)
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:797) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = doubleMetaphoneResult;
        handleZMethodArguments[2] = Integer.MAX_VALUE;
        handleZMethodArguments[3] = true;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleZ8() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:797) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = ((Object) null);
        handleZMethodArguments[2] = 2147483640;
        handleZMethodArguments[3] = true;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleZ9() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:799) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = ((Object) null);
        handleZMethodArguments[2] = -1;
        handleZMethodArguments[3] = false;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleZ10() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:1059)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1044)
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:799) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = string;
        handleZMethodArguments[1] = doubleMetaphoneResult;
        handleZMethodArguments[2] = -1;
        handleZMethodArguments[3] = true;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.conditionCH1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method conditionCH1(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionCH1(java.lang.String,int)}
 * @utbot.executesCondition {@code (((contains(value, index - 1, 1, "A", "O", "U", "E") || index == 0) && (contains(value, index + 2, 1, L_R_N_M_B_H_F_V_W_SPACE) || index + 1 == value.length() - 1))): False}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String)
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String)
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
 * @utbot.returnsFrom {@code return ((contains(value, 0, 4, "VAN ", "VON ") || contains(value, 0, 3, "SCH")) || contains(value, index - 2, 6, "ORCHES", "ARCHIT", "ORCHID") || contains(value, index + 2, 1, "T", "S") || ((contains(value, index - 1, 1, "A", "O", "U", "E") || index == 0) && (contains(value, index + 2, 1, L_R_N_M_B_H_F_V_W_SPACE) || index + 1 == value.length() - 1)));}
 *  */
    @Test
    public void testConditionCH1_ContainsOrIndexNotEqualsZeroAndContainsOrIndexPlus1NotEqualsValueLengthMinus1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH1Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH1", stringType, intType);
        conditionCH1Method.setAccessible(true);
        java.lang.Object[] conditionCH1MethodArguments = new java.lang.Object[2];
        conditionCH1MethodArguments[0] = string;
        conditionCH1MethodArguments[1] = -255;
        boolean actual = ((Boolean) conditionCH1Method.invoke(doubleMetaphone, conditionCH1MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionCH1(java.lang.String,int)}
 * @utbot.returnsFrom {@code return ((contains(value, 0, 4, "VAN ", "VON ") || contains(value, 0, 3, "SCH")) || contains(value, index - 2, 6, "ORCHES", "ARCHIT", "ORCHID") || contains(value, index + 2, 1, "T", "S") || ((contains(value, index - 1, 1, "A", "O", "U", "E") || index == 0) && (contains(value, index + 2, 1, L_R_N_M_B_H_F_V_W_SPACE) || index + 1 == value.length() - 1)));}
 *  */
    @Test
    public void testConditionCH1_ReturnContainsOrContainsOrContainsOrContainsOrContainsOrIndexNotEqualsZeroAndContainsOrIndexPlus1NotEqualsValueLengthMinus1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "VAN ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH1Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH1", stringType, intType);
        conditionCH1Method.setAccessible(true);
        java.lang.Object[] conditionCH1MethodArguments = new java.lang.Object[2];
        conditionCH1MethodArguments[0] = string;
        conditionCH1MethodArguments[1] = -255;
        boolean actual = ((Boolean) conditionCH1Method.invoke(doubleMetaphone, conditionCH1MethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method conditionCH1(java.lang.String, int)
    
    @Test
    public void testConditionCH11() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH1Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH1", stringType, intType);
        conditionCH1Method.setAccessible(true);
        java.lang.Object[] conditionCH1MethodArguments = new java.lang.Object[2];
        conditionCH1MethodArguments[0] = string;
        conditionCH1MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionCH1Method.invoke(doubleMetaphone, conditionCH1MethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testConditionCH12() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "VA\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH1Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH1", stringType, intType);
        conditionCH1Method.setAccessible(true);
        java.lang.Object[] conditionCH1MethodArguments = new java.lang.Object[2];
        conditionCH1MethodArguments[0] = string;
        conditionCH1MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionCH1Method.invoke(doubleMetaphone, conditionCH1MethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testConditionCH13() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "VAN\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH1Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH1", stringType, intType);
        conditionCH1Method.setAccessible(true);
        java.lang.Object[] conditionCH1MethodArguments = new java.lang.Object[2];
        conditionCH1MethodArguments[0] = string;
        conditionCH1MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionCH1Method.invoke(doubleMetaphone, conditionCH1MethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method conditionCH1(java.lang.String, int)
    
    @Test
    public void testConditionCH14() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.conditionCH1] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483645, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:967)
            org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(DoubleMetaphone.java:849) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH1Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH1", stringType, intType);
        conditionCH1Method.setAccessible(true);
        java.lang.Object[] conditionCH1MethodArguments = new java.lang.Object[2];
        conditionCH1MethodArguments[0] = string;
        conditionCH1MethodArguments[1] = Integer.MAX_VALUE;
        try {
            conditionCH1Method.invoke(doubleMetaphone, conditionCH1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.conditionC0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method conditionC0(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index <= 1): False}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 *  */
    @Test
    public void testConditionC0_DoubleMetaphoneContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "         ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 2147483640;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index <= 1): True}
 *  */
    @Test
    public void testConditionC0_IndexLessOrEqual1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "    ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 1;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index <= 1): False}
 *  */
    @Test
    public void testConditionC0_ReturnFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 2;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index <= 1): True}
 *  */
    @Test
    public void testConditionC0_IndexLessOrEqual1_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = ((Object) null);
        conditionC0MethodArguments[1] = -1;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index <= 1): True}
 *  */
    @Test
    public void testConditionC0_IndexLessOrEqual1_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "                                 ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testConditionC0_ReturnTrue() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CHIA                             ";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 0;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method conditionC0(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String)
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index, 4, "CHIA")
 *  */
    @Test
    public void testConditionC0_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "         ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.conditionC0] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483646, end -2147483646, length 9]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:948)
            org.apache.commons.codec.language.DoubleMetaphone.conditionC0(DoubleMetaphone.java:812) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 2147483646;
        try {
            conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method conditionC0(java.lang.String, int)
    
    @Test
    public void testConditionC01() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 9;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testConditionC02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000I\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 3;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testConditionC03() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000CH\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 32;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleSC
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleSC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index + 2, 1, "I", "E", "Y")
 *  */
    @Test
    public void testHandleSC_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483648, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:1014)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:967)
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:688) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = ((Object) null);
        handleSCMethodArguments[2] = 2147483645;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleSC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: result.append("SK");
 *  */
    @Test
    public void testHandleSC_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -253);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -253, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1079)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1065)
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:691) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = ((Object) null);
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = -3;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleSC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append("SK");
 *  */
    @Test
    public void testHandleSC_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:691) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = ((Object) null);
        handleSCMethodArguments[2] = -2;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleSC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append("SK");
 *  */
    @Test
    public void testHandleSC_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:691) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = ((Object) null);
        handleSCMethodArguments[1] = ((Object) null);
        handleSCMethodArguments[2] = -3;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleSC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('X');
 *  */
    @Test
    public void testHandleSC_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:685) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = ((Object) null);
        handleSCMethodArguments[2] = -2;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleSC1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000H\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = 24;
        int actual = ((Integer) handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments));
        
        assertEquals(27, actual);
    }
    
    @Test
    public void testHandleSC2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000H\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 39);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = 24;
        int actual = ((Integer) handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments));
        
        assertEquals(27, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleSC3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:1079)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1065)
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:691) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = 2147483644;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleSC4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:683) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = ((Object) null);
        handleSCMethodArguments[2] = 0;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleSC5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000H\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:683) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = ((Object) null);
        handleSCMethodArguments[2] = 0;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleSC6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:691) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = ((Object) null);
        handleSCMethodArguments[2] = -2;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleSC7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuffer primary = new StringBuffer("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 15);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:1084)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:1066)
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:691) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = -844825606;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.cleanInput
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cleanInput(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#cleanInput(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): True}
 *  */
    @Test
    public void testCleanInput_InputEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Method cleanInputMethod = doubleMetaphoneClazz.getDeclaredMethod("cleanInput", stringType);
        cleanInputMethod.setAccessible(true);
        java.lang.Object[] cleanInputMethodArguments = new java.lang.Object[1];
        cleanInputMethodArguments[0] = ((Object) null);
        String actual = ((String) cleanInputMethod.invoke(doubleMetaphone, cleanInputMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#cleanInput(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (input.length() == 0): True}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testCleanInput_InputLengthEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Method cleanInputMethod = doubleMetaphoneClazz.getDeclaredMethod("cleanInput", stringType);
        cleanInputMethod.setAccessible(true);
        java.lang.Object[] cleanInputMethodArguments = new java.lang.Object[1];
        cleanInputMethodArguments[0] = string;
        String actual = ((String) cleanInputMethod.invoke(doubleMetaphone, cleanInputMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method cleanInput(java.lang.String)
    
    @Test
    public void testCleanInput1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "!";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Method cleanInputMethod = doubleMetaphoneClazz.getDeclaredMethod("cleanInput", stringType);
        cleanInputMethod.setAccessible(true);
        java.lang.Object[] cleanInputMethodArguments = new java.lang.Object[1];
        cleanInputMethodArguments[0] = string;
        String actual = ((String) cleanInputMethod.invoke(doubleMetaphone, cleanInputMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.isSilentStart
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSilentStart(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isSilentStart(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < SILENT_START.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: value.startsWith(SILENT_START[i])
 *  */
    @Test
    public void testIsSilentStart_ThrowNullPointerException() throws Throwable  {
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        java.lang.String[] prevSILENT_START = ((java.lang.String[]) getStaticFieldValue(doubleMetaphoneClazz, "SILENT_START"));
        try {
            java.lang.String[] silentStart = new java.lang.String[5];
            String string = "GN";
            silentStart[0] = string;
            String string1 = "KN";
            silentStart[1] = string1;
            String string2 = "PN";
            silentStart[2] = string2;
            String string3 = "WR";
            silentStart[3] = string3;
            String string4 = "PS";
            silentStart[4] = string4;
            setStaticField(doubleMetaphoneClazz, "SILENT_START", silentStart);
            DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
            
            /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isSilentStart] produces [java.lang.NullPointerException]
                org.apache.commons.codec.language.DoubleMetaphone.isSilentStart(DoubleMetaphone.java:909) */
            Class stringType = Class.forName("java.lang.String");
            Method isSilentStartMethod = doubleMetaphoneClazz.getDeclaredMethod("isSilentStart", stringType);
            isSilentStartMethod.setAccessible(true);
            java.lang.Object[] isSilentStartMethodArguments = new java.lang.Object[1];
            isSilentStartMethodArguments[0] = ((Object) null);
            try {
                isSilentStartMethod.invoke(doubleMetaphone, isSilentStartMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(DoubleMetaphone.class, "SILENT_START", prevSILENT_START);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isSilentStart(java.lang.String)
    
    @Test
    public void testIsSilentStart1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        java.lang.String[] prevSILENT_START = ((java.lang.String[]) getStaticFieldValue(doubleMetaphoneClazz, "SILENT_START"));
        try {
            java.lang.String[] silentStart = new java.lang.String[5];
            String string = "GN";
            silentStart[0] = string;
            String string1 = "KN";
            silentStart[1] = string1;
            String string2 = "PN";
            silentStart[2] = string2;
            String string3 = "WR";
            silentStart[3] = string3;
            String string4 = "PS";
            silentStart[4] = string4;
            setStaticField(doubleMetaphoneClazz, "SILENT_START", silentStart);
            DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
            String string5 = "";
            
            Class string5Type = Class.forName("java.lang.String");
            Method isSilentStartMethod = doubleMetaphoneClazz.getDeclaredMethod("isSilentStart", string5Type);
            isSilentStartMethod.setAccessible(true);
            java.lang.Object[] isSilentStartMethodArguments = new java.lang.Object[1];
            isSilentStartMethodArguments[0] = string5;
            boolean actual = ((Boolean) isSilentStartMethod.invoke(doubleMetaphone, isSilentStartMethodArguments));
            
            assertFalse(actual);
        } finally {
            setStaticField(DoubleMetaphone.class, "SILENT_START", prevSILENT_START);
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields875203951605600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields875203951605600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass875203951611900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875203951605600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875203951611900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields875203951969200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields875203951969200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass875203951971500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875203951969200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875203951971500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields875203952832000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields875203952832000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass875203952833600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields875203952832000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass875203952833600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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


package org.apache.commons.codec.language;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult;
import org.apache.commons.codec.EncoderException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_codec_language_DoubleMetaphoneTest {
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
    public void testDoubleMetaphone1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001\u0001!";
        
        String actual = doubleMetaphone.doubleMetaphone(string, false);
        
        String expected = "";
        
        assertEquals(expected, actual);
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
    public void testDoubleMetaphone2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        
        String actual = doubleMetaphone.doubleMetaphone(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDoubleMetaphone3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001\u0001B\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        
        String actual = doubleMetaphone.doubleMetaphone(string);
        
        String expected = "P";
        
        assertEquals(expected, actual);
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
        doubleMetaphone.setMaxCodeLen(-255);
        
        int actual = doubleMetaphone.getMaxCodeLen();
        
        assertEquals(-255, actual);
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
            org.apache.commons.codec.language.DoubleMetaphone.isSlavoGermanic(DoubleMetaphone.java:857) */
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
        StringBuilder primary = new StringBuilder(" ");
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
        StringBuilder primary = new StringBuilder(" ");
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
        StringBuilder primary = new StringBuilder("                                     ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 39);
        
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
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483645);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:982)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:968)
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:747) */
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
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (!((index == value.length() - 1) && (contains(value, index - 3, 3, "IAU", "EAU") || contains(value, index - 2, 2, "AU", "OU")))): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append("KS");
 *  */
    @Test
    public void testHandleX_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:747) */
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
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:743) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = ((Object) null);
        handleXMethodArguments[1] = ((Object) null);
        handleXMethodArguments[2] = -255;
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
    public void testHandleX_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:740) */
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleX(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleX1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000IAU\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 32;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(33, actual);
    }
    
    @Test
    public void testHandleX2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "AU\u0000";
        
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
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(3, actual);
    }
    
    @Test
    public void testHandleX3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 31);
        
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
    public void testHandleX4() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1073741860);
        
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
    public void testHandleX5() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
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
        handleXMethodArguments[2] = 131072;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(131073, actual);
    }
    
    @Test
    public void testHandleX6() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 31);
        
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
    public void testHandleX7() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 18);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 134217728;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(134217729, actual);
    }
    
    @Test
    public void testHandleX8() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 4);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 4;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(5, actual);
    }
    
    @Test
    public void testHandleX9() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1073741896);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 32;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(33, actual);
    }
    
    @Test
    public void testHandleX10() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
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
        handleXMethodArguments[2] = 2048;
        int actual = ((Integer) handleXMethod.invoke(doubleMetaphone, handleXMethodArguments));
        
        assertEquals(2049, actual);
    }
    
    @Test
    public void testHandleX11() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 31);
        
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
    public void testHandleX12() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("");
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
    public void testHandleX13() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "I\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:978)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:968)
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:747) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = doubleMetaphoneResult;
        handleXMethodArguments[2] = 3;
        try {
            handleXMethod.invoke(doubleMetaphone, handleXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleX14() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:747) */
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
    public void testHandleX15() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleX] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleX(DoubleMetaphone.java:747) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleXMethod = doubleMetaphoneClazz.getDeclaredMethod("handleX", stringType, doubleMetaphoneResultType, intType);
        handleXMethod.setAccessible(true);
        java.lang.Object[] handleXMethodArguments = new java.lang.Object[3];
        handleXMethodArguments[0] = string;
        handleXMethodArguments[1] = ((Object) null);
        handleXMethodArguments[2] = 34;
        try {
            handleXMethod.invoke(doubleMetaphone, handleXMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.conditionC0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method conditionC0(java.lang.String, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (contains(value, index, 4, "CHIA")): False},
    ///     {@code (index <= 1): False}
    /// invoke:
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)} once,
    ///     org.apache.commons.codec.language.DoubleMetaphone#isVowel(char) once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.executesCondition {@code (isVowel(charAt(value, index - 2))): False}
 * @utbot.executesCondition {@code (!contains(value, index - 1, 3, "ACH")): True}
 *  */
    @Test
    public void testConditionC0_NotContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
 * @utbot.executesCondition {@code (isVowel(charAt(value, index - 2))): True}
 *  */
    @Test
    public void testConditionC0_IsVowel() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
 * @utbot.executesCondition {@code (isVowel(charAt(value, index - 2))): False}
 * @utbot.executesCondition {@code (!contains(value, index - 1, 3, "ACH")): False}
 * @utbot.returnsFrom {@code return (c != 'I' && c != 'E') || contains(value, index - 2, 6, "BACHER", "MACHER");}
 *  */
    @Test
    public void testConditionC0_CNotEqualsIAndCNotEqualsEOrContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u8000\u8000\u8000ACH";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 4;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.executesCondition {@code (isVowel(charAt(value, index - 2))): False}
 * @utbot.executesCondition {@code (!contains(value, index - 1, 3, "ACH")): False}
 * @utbot.executesCondition {@code (contains(value, index - 2, 6, "BACHER", "MACHER")): False}
 * @utbot.returnsFrom {@code return (c != 'I' && c != 'E') || contains(value, index - 2, 6, "BACHER", "MACHER");}
 *  */
    @Test
    public void testConditionC0_CEqualsIAndCEqualsEOrContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u8000\u8000\u8000ACHE";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 4;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.executesCondition {@code (isVowel(charAt(value, index - 2))): False}
 * @utbot.executesCondition {@code (!contains(value, index - 1, 3, "ACH")): False}
 * @utbot.executesCondition {@code (contains(value, index - 2, 6, "BACHER", "MACHER")): False}
 * @utbot.returnsFrom {@code return (c != 'I' && c != 'E') || contains(value, index - 2, 6, "BACHER", "MACHER");}
 *  */
    @Test
    public void testConditionC0_CEqualsIAndCEqualsEOrContains_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u8000\u8000\u8000ACHI";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 4;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method conditionC0(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)}
 * @utbot.executesCondition {@code (contains(value, index, 4, "CHIA")): False}
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
 * @utbot.executesCondition {@code (contains(value, index, 4, "CHIA")): False}
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
 * @utbot.executesCondition {@code (contains(value, index, 4, "CHIA")): False}
 * @utbot.executesCondition {@code (index <= 1): True}
 *  */
    @Test
    public void testConditionC0_IndexLessOrEqual1_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "    ";
        
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
 * @utbot.executesCondition {@code (contains(value, index, 4, "CHIA")): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testConditionC0_Contains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CHIA";
        
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
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index, 4, "CHIA")
 *  */
    @Test
    public void testConditionC0_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.conditionC0] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483645, end -2147483647, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.conditionC0(DoubleMetaphone.java:781) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 2147483645;
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
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
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
    
    @Test
    public void testConditionC02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ACH\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 34;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testConditionC03() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000CH\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionC0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionC0", stringType, intType);
        conditionC0Method.setAccessible(true);
        java.lang.Object[] conditionC0MethodArguments = new java.lang.Object[2];
        conditionC0MethodArguments[0] = string;
        conditionC0MethodArguments[1] = 34;
        boolean actual = ((Boolean) conditionC0Method.invoke(doubleMetaphone, conditionC0MethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testConditionC04() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000A\u0000CHI\u0000\u0000\u0000\u0000\u0000";
        
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
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleG
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleG_DoubleMetaphoneHandleGH() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleG_IndexNotEqualsZero() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleGMethod.setAccessible(true);
        java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
        handleGMethodArguments[0] = ((Object) null);
        handleGMethodArguments[1] = doubleMetaphoneResult;
        handleGMethodArguments[2] = -2;
        handleGMethodArguments[3] = false;
        int actual = ((Integer) handleGMethod.invoke(doubleMetaphone, handleGMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index + 1, 2, "LI") && !slavoGermanic
 *  */
    @Test
    public void testHandleG_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483647, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:421) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: index = handleGH(value, result, index);
 *  */
    @Test
    public void testHandleG_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:473)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:410) */
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
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:471)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:410) */
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
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleG_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:457) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleG(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == 1): True}
 * @utbot.executesCondition {@code (!slavoGermanic): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append("KN", "N");
 *  */
    @Test
    public void testHandleG_ThrowNullPointerException_3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "E N";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:413) */
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
        handleGMethodArguments[2] = 1;
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
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:457) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleG1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000I\u0000H";
        
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
        handleGMethodArguments[2] = 16;
        handleGMethodArguments[3] = false;
        int actual = ((Integer) handleGMethod.invoke(doubleMetaphone, handleGMethodArguments));
        
        assertEquals(18, actual);
    }
    
    @Test
    public void testHandleG2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000HI";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
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
    
    @Test
    public void testHandleG3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1073741825);
        
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
    
    @Test
    public void testHandleG4() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
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
        handleGMethodArguments[2] = -1610612736;
        handleGMethodArguments[3] = false;
        int actual = ((Integer) handleGMethod.invoke(doubleMetaphone, handleGMethodArguments));
        
        assertEquals(-1610612735, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleG5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A\u0000N";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:982)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:973)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:413) */
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
        handleGMethodArguments[2] = 1;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleG6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:946)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:457) */
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
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleG7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000N\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:978)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:973)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:416) */
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
        handleGMethodArguments[2] = 21;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleG8() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "Y\u0000H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:487)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:410) */
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
        handleGMethodArguments[2] = 1;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleG9() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000O\u0000H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:487)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:410) */
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
        handleGMethodArguments[2] = 16;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleG10() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000U\u0000H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:487)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:410) */
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
        handleGMethodArguments[2] = 16;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleG11() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000H\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:467)
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:410) */
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
        handleGMethodArguments[2] = 1;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleG12() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000N";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:416) */
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
        handleGMethodArguments[2] = 1;
        handleGMethodArguments[3] = false;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleG13() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:457) */
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
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleG14() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A\u0000N";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:418) */
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
        handleGMethodArguments[2] = 1;
        handleGMethodArguments[3] = true;
        try {
            handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleG15() throws Throwable  {
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        java.lang.String[] prevES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = ((java.lang.String[]) getStaticFieldValue(doubleMetaphoneClazz, "ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER"));
        try {
            java.lang.String[] esEpEbElEyIbIlInIeEiEr = new java.lang.String[11];
            String string = "ES";
            esEpEbElEyIbIlInIeEiEr[0] = string;
            String string1 = "EP";
            esEpEbElEyIbIlInIeEiEr[1] = string1;
            String string2 = "EB";
            esEpEbElEyIbIlInIeEiEr[2] = string2;
            String string3 = "EL";
            esEpEbElEyIbIlInIeEiEr[3] = string3;
            String string4 = "EY";
            esEpEbElEyIbIlInIeEiEr[4] = string4;
            String string5 = "IB";
            esEpEbElEyIbIlInIeEiEr[5] = string5;
            String string6 = "IL";
            esEpEbElEyIbIlInIeEiEr[6] = string6;
            String string7 = "IN";
            esEpEbElEyIbIlInIeEiEr[7] = string7;
            String string8 = "IE";
            esEpEbElEyIbIlInIeEiEr[8] = string8;
            String string9 = "EI";
            esEpEbElEyIbIlInIeEiEr[9] = string9;
            String string10 = "ER";
            esEpEbElEyIbIlInIeEiEr[10] = string10;
            setStaticField(doubleMetaphoneClazz, "ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER", esEpEbElEyIbIlInIeEiEr);
            DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
            String string11 = "";
            
            /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleG] produces [java.lang.NullPointerException]
                org.apache.commons.codec.language.DoubleMetaphone.handleG(DoubleMetaphone.java:457) */
            Class string11Type = Class.forName("java.lang.String");
            Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
            Class intType = int.class;
            Class booleanType = boolean.class;
            Method handleGMethod = doubleMetaphoneClazz.getDeclaredMethod("handleG", string11Type, doubleMetaphoneResultType, intType, booleanType);
            handleGMethod.setAccessible(true);
            java.lang.Object[] handleGMethodArguments = new java.lang.Object[4];
            handleGMethodArguments[0] = string11;
            handleGMethodArguments[1] = ((Object) null);
            handleGMethodArguments[2] = 0;
            handleGMethodArguments[3] = false;
            try {
                handleGMethod.invoke(doubleMetaphone, handleGMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(DoubleMetaphone.class, "ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER", prevES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleL
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (charAt(value, index + 1) == 'L'): False}
    /// invoke:
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)} twice,
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#appendPrimary(char)} twice,
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#appendAlternate(char)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleL(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleL_ReturnIndex() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
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
        StringBuilder primary = new StringBuilder(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 3);
        
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
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.String#length()} twice,
    ///     {@link java.lang.String#charAt(int)} twice
    /// execute conditions:
    ///     {@code (charAt(value, index + 1) == 'L'): True}
    /// invoke:
    ///     org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int) once,
    ///     {@link java.lang.String#length()} twice
    /// invoke:
    ///     org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int) once,
    ///     {@link java.lang.String#length()} 3 times
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleL(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleL_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "L@ AS";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
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
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleL(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#appendPrimary(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleL_DoubleMetaphoneAppendPrimary() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "                               ILLO";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = doubleMetaphoneResult;
        handleLMethodArguments[2] = 32;
        int actual = ((Integer) handleLMethod.invoke(doubleMetaphone, handleLMethodArguments));
        
        assertEquals(34, actual);
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
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:559) */
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
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:559) */
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
    public void testHandleL_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:559) */
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
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#appendPrimary(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.appendPrimary('L');
 *  */
    @Test
    public void testHandleL_ThrowNullPointerException_3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "                               ILLO";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:552) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = ((Object) null);
        handleLMethodArguments[2] = 32;
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
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ILLO";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = doubleMetaphoneResult;
        handleLMethodArguments[2] = 32;
        int actual = ((Integer) handleLMethod.invoke(doubleMetaphone, handleLMethodArguments));
        
        assertEquals(34, actual);
    }
    
    @Test
    public void testHandleL2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = doubleMetaphoneResult;
        handleLMethodArguments[2] = 1073741823;
        int actual = ((Integer) handleLMethod.invoke(doubleMetaphone, handleLMethodArguments));
        
        assertEquals(1073741824, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleL3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000L\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000O\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:554) */
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
    public void testHandleL4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "L\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:554) */
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
    
    @Test
    public void testHandleL5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000L\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000AS";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleL] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:962)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:947)
            org.apache.commons.codec.language.DoubleMetaphone.handleL(DoubleMetaphone.java:554) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleLMethod = doubleMetaphoneClazz.getDeclaredMethod("handleL", stringType, doubleMetaphoneResultType, intType);
        handleLMethod.setAccessible(true);
        java.lang.Object[] handleLMethodArguments = new java.lang.Object[3];
        handleLMethodArguments[0] = string;
        handleLMethodArguments[1] = doubleMetaphoneResult;
        handleLMethodArguments[2] = 0;
        try {
            handleLMethod.invoke(doubleMetaphone, handleLMethodArguments);
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
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleD_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
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
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:384) */
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
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: result.append("TK");
 *  */
    @Test
    public void testHandleD_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " DG";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483645);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:982)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:968)
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:391) */
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
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:398) */
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
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:398) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleD(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append("TK");
 *  */
    @Test
    public void testHandleD_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "DG";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:391) */
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleD(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleD1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 35);
        
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
    
    @Test
    public void testHandleD2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "DG";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 32);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = doubleMetaphoneResult;
        handleDMethodArguments[2] = 0;
        int actual = ((Integer) handleDMethod.invoke(doubleMetaphone, handleDMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testHandleD3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "DG";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1073741851);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = doubleMetaphoneResult;
        handleDMethodArguments[2] = 0;
        int actual = ((Integer) handleDMethod.invoke(doubleMetaphone, handleDMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleD(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleD4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:946)
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:398) */
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
    
    @Test
    public void testHandleD5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:946)
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:398) */
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
    public void testHandleD6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:398) */
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
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000DG";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 15);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleD] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:987)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:969)
            org.apache.commons.codec.language.DoubleMetaphone.handleD(DoubleMetaphone.java:391) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleDMethod = doubleMetaphoneClazz.getDeclaredMethod("handleD", stringType, doubleMetaphoneResultType, intType);
        handleDMethod.setAccessible(true);
        java.lang.Object[] handleDMethodArguments = new java.lang.Object[3];
        handleDMethodArguments[0] = string;
        handleDMethodArguments[1] = doubleMetaphoneResult;
        handleDMethodArguments[2] = 30;
        try {
            handleDMethod.invoke(doubleMetaphone, handleDMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.isSilentStart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSilentStart(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isSilentStart(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(final String element: SILENT_START)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testIsSilentStart_StringStartsWith() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
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
            String string5 = "GN";
            
            Class string5Type = Class.forName("java.lang.String");
            Method isSilentStartMethod = doubleMetaphoneClazz.getDeclaredMethod("isSilentStart", string5Type);
            isSilentStartMethod.setAccessible(true);
            java.lang.Object[] isSilentStartMethodArguments = new java.lang.Object[1];
            isSilentStartMethodArguments[0] = string5;
            boolean actual = ((Boolean) isSilentStartMethod.invoke(doubleMetaphone, isSilentStartMethodArguments));
            
            assertTrue(actual);
        } finally {
            setStaticField(DoubleMetaphone.class, "SILENT_START", prevSILENT_START);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSilentStart(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isSilentStart(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(final String element: SILENT_START)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: value.startsWith(element)
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
                org.apache.commons.codec.language.DoubleMetaphone.isSilentStart(DoubleMetaphone.java:876) */
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
            String string5 = "GF";
            
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
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.conditionL0
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method conditionL0(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index == value.length() - 3): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testConditionL0_DoubleMetaphoneContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = string;
        conditionL0MethodArguments[1] = -2;
        boolean actual = ((Boolean) conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index == value.length() - 3): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testConditionL0_IndexEqualsValueLengthMinus3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "OS";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = string;
        conditionL0MethodArguments[1] = -1;
        boolean actual = ((Boolean) conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index == value.length() - 3): True}
 *  */
    @Test
    public void testConditionL0_ReturnTrue() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionL0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index == value.length() - 3): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testConditionL0_IndexNotEqualsValueLengthMinus3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testConditionL0_IndexNotEqualsValueLengthMinus3_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
            org.apache.commons.codec.language.DoubleMetaphone.conditionL0(DoubleMetaphone.java:827) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method conditionL0(java.lang.String, int)
    
    @Test
    public void testConditionL01() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        
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
    
    @Test
    public void testConditionL02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = string;
        conditionL0MethodArguments[1] = -2;
        boolean actual = ((Boolean) conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testConditionL03() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "ILL\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = string;
        conditionL0MethodArguments[1] = 1;
        boolean actual = ((Boolean) conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testConditionL04() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "O\u0000";
        
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method conditionL0(java.lang.String, int)
    
    @Test
    public void testConditionL05() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.conditionL0] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483645, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.conditionL0(DoubleMetaphone.java:832) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = string;
        conditionL0MethodArguments[1] = Integer.MIN_VALUE;
        try {
            conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testConditionL06() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "AS";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.conditionL0] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.conditionL0(DoubleMetaphone.java:832) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionL0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionL0", stringType, intType);
        conditionL0Method.setAccessible(true);
        java.lang.Object[] conditionL0MethodArguments = new java.lang.Object[2];
        conditionL0MethodArguments[0] = string;
        conditionL0MethodArguments[1] = Integer.MIN_VALUE;
        try {
            conditionL0Method.invoke(doubleMetaphone, conditionL0MethodArguments);
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
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
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
    public void testHandleCC_ReturnIndex_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
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
 * @utbot.executesCondition {@code (index == 1): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleCC_IndexNotEquals1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  I";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = 0;
        int actual = ((Integer) handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments));
        
        assertEquals(3, actual);
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
        StringBuilder primary = new StringBuilder(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("");
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
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483648, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:331) */
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
 * @utbot.executesCondition {@code (index == 1): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: result.append("KS");
 *  */
    @Test
    public void testHandleCC_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A  I";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483645);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:982)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:968)
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:337) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = 1;
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
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:344) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleCC_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:344) */
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
 * @utbot.executesCondition {@code (index == 1): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append("KS");
 *  */
    @Test
    public void testHandleCC_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A  I";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:337) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = ((Object) null);
        handleCCMethodArguments[2] = 1;
        try {
            handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 1): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('X');
 *  */
    @Test
    public void testHandleCC_ThrowNullPointerException_3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "   I";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:340) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = ((Object) null);
        handleCCMethodArguments[2] = 1;
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
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 3);
        
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
        String string = "\u0000\u0000I";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
        handleCCMethodArguments[2] = 0;
        int actual = ((Integer) handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments));
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleCC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleCC3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:946)
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:344) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = 3;
        try {
            handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCC4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000E";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:946)
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:340) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = 0;
        try {
            handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCC5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:344) */
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
    
    @Test
    public void testHandleCC6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A\u0000\u0000I";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1073741825);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:987)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:969)
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:337) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = 1;
        try {
            handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCC7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A\u0000\u0000I";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:987)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:969)
            org.apache.commons.codec.language.DoubleMetaphone.handleCC(DoubleMetaphone.java:337) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCC", stringType, doubleMetaphoneResultType, intType);
        handleCCMethod.setAccessible(true);
        java.lang.Object[] handleCCMethodArguments = new java.lang.Object[3];
        handleCCMethodArguments[0] = string;
        handleCCMethodArguments[1] = doubleMetaphoneResult;
        handleCCMethodArguments[2] = 1;
        try {
            handleCCMethod.invoke(doubleMetaphone, handleCCMethodArguments);
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
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleSC
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleSC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.returnsFrom {@code return index + 3;}
 *  */
    @Test
    public void testHandleSC_IndexNotEqualsZero() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = -2;
        int actual = ((Integer) handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleSC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.returnsFrom {@code return index + 3;}
 *  */
    @Test
    public void testHandleSC_IndexNotEqualsZero_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1073741825);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = -2;
        int actual = ((Integer) handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleSC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index + 3;}
 *  */
    @Test
    public void testHandleSC_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "I ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = -2;
        int actual = ((Integer) handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleSC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index + 2, 1, "I", "E", "Y")
 *  */
    @Test
    public void testHandleSC_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "                ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483648, length 16]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:664) */
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
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: result.append("SK");
 *  */
    @Test
    public void testHandleSC_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -253);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -253, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:982)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:968)
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:667) */
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
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: result.append("SK");
 *  */
    @Test
    public void testHandleSC_ThrowStringIndexOutOfBoundsException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("                              ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 33);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:991)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:969)
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:667) */
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
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:667) */
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
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:667) */
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
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('X');
 *  */
    @Test
    public void testHandleSC_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  HE";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:661) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleSC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('S');
 *  */
    @Test
    public void testHandleSC_ThrowNullPointerException_3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "I ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:665) */
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
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = -4;
        int actual = ((Integer) handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    @Test
    public void testHandleSC2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1073741854);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = ((Object) null);
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = -1830215686;
        int actual = ((Integer) handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments));
        
        assertEquals(-1830215683, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleSC3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 15);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -25, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:991)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:969)
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:667) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = ((Object) null);
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = -1451778630;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleSC4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:978)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:968)
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:667) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = doubleMetaphoneResult;
        handleSCMethodArguments[2] = 3;
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
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:659) */
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
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000H\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:661) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleSCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleSC", stringType, doubleMetaphoneResultType, intType);
        handleSCMethod.setAccessible(true);
        java.lang.Object[] handleSCMethodArguments = new java.lang.Object[3];
        handleSCMethodArguments[0] = string;
        handleSCMethodArguments[1] = ((Object) null);
        handleSCMethodArguments[2] = 20;
        try {
            handleSCMethod.invoke(doubleMetaphone, handleSCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleSC7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:659) */
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
    public void testHandleSC8() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:667) */
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
    public void testHandleSC9() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleSC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:987)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:969)
            org.apache.commons.codec.language.DoubleMetaphone.handleSC(DoubleMetaphone.java:667) */
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleW
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleW(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleW_DoubleMetaphoneContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleW_IndexEqualsValueLengthMinus1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder alternate = new StringBuilder("A ");
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
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleW_IndexEqualsValueLengthMinus1_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "E ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder alternate = new StringBuilder("");
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleW_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "WR                               ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleW(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleW(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index == value.length() - 1): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY")
 *  */
    @Test
    public void testHandleW_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483644, length 33]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:719) */
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
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index, 2, "WR")
 *  */
    @Test
    public void testHandleW_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483647, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:703) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (index == value.length() - 1 && isVowel(charAt(value, index - 1))) || contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") || contains(value, 0, 3, "SCH")
 *  */
    @Test
    public void testHandleW_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:718) */
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
        String string = "WR                              ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:705) */
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
        String string = "E ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:722) */
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
        String string = "\u0000\u0000";
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
        handleWMethodArguments[2] = 1;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testHandleW2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
        String string = "\u0000\u0000\u0000";
        
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
    public void testHandleW5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleWMethod = doubleMetaphoneClazz.getDeclaredMethod("handleW", stringType, doubleMetaphoneResultType, intType);
        handleWMethod.setAccessible(true);
        java.lang.Object[] handleWMethodArguments = new java.lang.Object[3];
        handleWMethodArguments[0] = string;
        handleWMethodArguments[1] = ((Object) null);
        handleWMethodArguments[2] = 32;
        int actual = ((Integer) handleWMethod.invoke(doubleMetaphone, handleWMethodArguments));
        
        assertEquals(33, actual);
    }
    
    @Test
    public void testHandleW6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    public void testHandleW7() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "WR";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 11);
        
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
    public void testHandleW8() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "SCH";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:722) */
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
        try {
            handleWMethod.invoke(doubleMetaphone, handleWMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleW9() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "WA";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleW] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleW(DoubleMetaphone.java:712) */
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleAEIOUY
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.returnsFrom {@code return index + 1;}
 *  */
    @Test
    public void testHandleAEIOUY_IndexNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleAEIOUYMethod = doubleMetaphoneClazz.getDeclaredMethod("handleAEIOUY", doubleMetaphoneResultType, intType);
        handleAEIOUYMethod.setAccessible(true);
        java.lang.Object[] handleAEIOUYMethodArguments = new java.lang.Object[2];
        handleAEIOUYMethodArguments[0] = ((Object) null);
        handleAEIOUYMethodArguments[1] = -255;
        int actual = ((Integer) handleAEIOUYMethod.invoke(doubleMetaphone, handleAEIOUYMethodArguments));
        
        assertEquals(-254, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
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
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index + 1;}
 *  */
    @Test
    public void testHandleAEIOUY_ReturnIndexPlus1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleAEIOUYMethod = doubleMetaphoneClazz.getDeclaredMethod("handleAEIOUY", doubleMetaphoneResultType, intType);
        handleAEIOUYMethod.setAccessible(true);
        java.lang.Object[] handleAEIOUYMethodArguments = new java.lang.Object[2];
        handleAEIOUYMethodArguments[0] = doubleMetaphoneResult;
        handleAEIOUYMethodArguments[1] = 0;
        int actual = ((Integer) handleAEIOUYMethod.invoke(doubleMetaphone, handleAEIOUYMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index + 1;}
 *  */
    @Test
    public void testHandleAEIOUY_ReturnIndexPlus1_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleAEIOUYMethod = doubleMetaphoneClazz.getDeclaredMethod("handleAEIOUY", doubleMetaphoneResultType, intType);
        handleAEIOUYMethod.setAccessible(true);
        java.lang.Object[] handleAEIOUYMethodArguments = new java.lang.Object[2];
        handleAEIOUYMethodArguments[0] = doubleMetaphoneResult;
        handleAEIOUYMethodArguments[1] = 0;
        int actual = ((Integer) handleAEIOUYMethod.invoke(doubleMetaphone, handleAEIOUYMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.returnsFrom {@code return index + 1;}
 *  */
    @Test
    public void testHandleAEIOUY_ReturnIndexPlus1_2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 3);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleAEIOUYMethod = doubleMetaphoneClazz.getDeclaredMethod("handleAEIOUY", doubleMetaphoneResultType, intType);
        handleAEIOUYMethod.setAccessible(true);
        java.lang.Object[] handleAEIOUYMethodArguments = new java.lang.Object[2];
        handleAEIOUYMethodArguments[0] = doubleMetaphoneResult;
        handleAEIOUYMethodArguments[1] = 0;
        int actual = ((Integer) handleAEIOUYMethod.invoke(doubleMetaphone, handleAEIOUYMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('A');
 *  */
    @Test
    public void testHandleAEIOUY_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleAEIOUY] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleAEIOUY(DoubleMetaphone.java:270) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleAEIOUYMethod = doubleMetaphoneClazz.getDeclaredMethod("handleAEIOUY", doubleMetaphoneResultType, intType);
        handleAEIOUYMethod.setAccessible(true);
        java.lang.Object[] handleAEIOUYMethodArguments = new java.lang.Object[2];
        handleAEIOUYMethodArguments[0] = ((Object) null);
        handleAEIOUYMethodArguments[1] = 0;
        try {
            handleAEIOUYMethod.invoke(doubleMetaphone, handleAEIOUYMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleCH
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleCH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index + 2;}
 *  */
    @Test
    public void testHandleCH_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "VAN ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = doubleMetaphoneResult;
        handleCHMethodArguments[2] = -256;
        int actual = ((Integer) handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments));
        
        assertEquals(-254, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index + 2;}
 *  */
    @Test
    public void testHandleCH_IndexLessOrEqualZero() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = doubleMetaphoneResult;
        handleCHMethodArguments[2] = -3;
        int actual = ((Integer) handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments));
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleCH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: index > 0 && contains(value, index, 4, "CHAE")
 *  */
    @Test
    public void testHandleCH_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483645, end -2147483647, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:355) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = ((Object) null);
        handleCHMethodArguments[2] = 2147483645;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#conditionCH0(java.lang.String,int)
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#conditionCH1(java.lang.String,int)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleCH_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "VAN ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
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
        handleCHMethodArguments[2] = -256;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleCH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char,char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K', 'X');
 *  */
    @Test
    public void testHandleCH_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " CHAE";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:356) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = ((Object) null);
        handleCHMethodArguments[2] = 1;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleCH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleCH1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "VAN ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 33);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = doubleMetaphoneResult;
        handleCHMethodArguments[2] = -2147483647;
        int actual = ((Integer) handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments));
        
        assertEquals(-2147483645, actual);
    }
    
    @Test
    public void testHandleCH2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = doubleMetaphoneResult;
        handleCHMethodArguments[2] = -1073741824;
        int actual = ((Integer) handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments));
        
        assertEquals(-1073741822, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleCH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleCH3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "VAN\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483643, length 4]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(DoubleMetaphone.java:817)
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:362) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = doubleMetaphoneResult;
        handleCHMethodArguments[2] = -2147483647;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000CHA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:951)
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:371) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = doubleMetaphoneResult;
        handleCHMethodArguments[2] = 3;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "VA\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
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
        handleCHMethodArguments[2] = 2147483641;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
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
        handleCHMethodArguments[2] = 1;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:374) */
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
    public void testHandleCH8() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000HOR\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:360) */
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
    public void testHandleCH9() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:374) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = ((Object) null);
        handleCHMethodArguments[2] = -2;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH10() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
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
        handleCHMethodArguments[2] = 13;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleCH11() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000HARAC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:360) */
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
    public void testHandleCH12() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000HARA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:374) */
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
    public void testHandleCH13() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000CHAE\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleCH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:962)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:952)
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:356) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleCH", stringType, doubleMetaphoneResultType, intType);
        handleCHMethod.setAccessible(true);
        java.lang.Object[] handleCHMethodArguments = new java.lang.Object[3];
        handleCHMethodArguments[0] = string;
        handleCHMethodArguments[1] = doubleMetaphoneResult;
        handleCHMethodArguments[2] = 3;
        try {
            handleCHMethod.invoke(doubleMetaphone, handleCHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleJ
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleJ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index, 4, "JOSE") || contains(value, 0, 4, "SAN ")
 *  */
    @Test
    public void testHandleJ_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:515) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleJ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char,char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('J', 'A');
 *  */
    @Test
    public void testHandleJ_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:526) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleJ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char,char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('J', ' ');
 *  */
    @Test
    public void testHandleJ_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:531) */
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
        handleJMethodArguments[2] = -1;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleJ1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
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
        handleJMethodArguments[2] = -1;
        handleJMethodArguments[3] = false;
        int actual = ((Integer) handleJMethod.invoke(doubleMetaphone, handleJMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHandleJ2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
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
        handleJMethodArguments[2] = -1;
        handleJMethodArguments[3] = false;
        int actual = ((Integer) handleJMethod.invoke(doubleMetaphone, handleJMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHandleJ3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 9);
        
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
        handleJMethodArguments[2] = 0;
        handleJMethodArguments[3] = false;
        int actual = ((Integer) handleJMethod.invoke(doubleMetaphone, handleJMethodArguments));
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testHandleJ4() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
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
        handleJMethodArguments[2] = 0;
        handleJMethodArguments[3] = false;
        int actual = ((Integer) handleJMethod.invoke(doubleMetaphone, handleJMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleJ5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "S\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483648, length 40]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:533) */
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
    public void testHandleJ6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "J\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:951)
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:526) */
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
        String string = "JOSE\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:951)
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:521) */
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
        handleJMethodArguments[2] = 0;
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
        String string = "SA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:534) */
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
        handleJMethodArguments[2] = 2147483637;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ9() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:534) */
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
        handleJMethodArguments[3] = true;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ10() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "O";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:534) */
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
    public void testHandleJ11() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "SAN \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:519) */
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
    public void testHandleJ12() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "SAN ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:519) */
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
    public void testHandleJ13() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000JOSE\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:521) */
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
        handleJMethodArguments[2] = 3;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ14() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "JO\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:526) */
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
    public void testHandleJ15() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:534) */
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
        handleJMethodArguments[2] = 13;
        handleJMethodArguments[3] = false;
        try {
            handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleJ16() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "JOSE";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:519) */
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
    public void testHandleJ17() throws Throwable  {
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        java.lang.String[] prevL_T_K_S_N_M_B_Z = ((java.lang.String[]) getStaticFieldValue(doubleMetaphoneClazz, "L_T_K_S_N_M_B_Z"));
        try {
            java.lang.String[] lTKSNMBZ = new java.lang.String[8];
            String string = "L";
            lTKSNMBZ[0] = string;
            String string1 = "T";
            lTKSNMBZ[1] = string1;
            String string2 = "K";
            lTKSNMBZ[2] = string2;
            String string3 = "S";
            lTKSNMBZ[3] = string3;
            String string4 = "N";
            lTKSNMBZ[4] = string4;
            String string5 = "M";
            lTKSNMBZ[5] = string5;
            String string6 = "B";
            lTKSNMBZ[6] = string6;
            String string7 = "Z";
            lTKSNMBZ[7] = string7;
            setStaticField(doubleMetaphoneClazz, "L_T_K_S_N_M_B_Z", lTKSNMBZ);
            DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
            String string8 = "\u0000";
            
            /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleJ] produces [java.lang.NullPointerException]
                org.apache.commons.codec.language.DoubleMetaphone.handleJ(DoubleMetaphone.java:534) */
            Class string8Type = Class.forName("java.lang.String");
            Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
            Class intType = int.class;
            Class booleanType = boolean.class;
            Method handleJMethod = doubleMetaphoneClazz.getDeclaredMethod("handleJ", string8Type, doubleMetaphoneResultType, intType, booleanType);
            handleJMethod.setAccessible(true);
            java.lang.Object[] handleJMethodArguments = new java.lang.Object[4];
            handleJMethodArguments[0] = string8;
            handleJMethodArguments[1] = ((Object) null);
            handleJMethodArguments[2] = -1073741824;
            handleJMethodArguments[3] = false;
            try {
                handleJMethod.invoke(doubleMetaphone, handleJMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(DoubleMetaphone.class, "L_T_K_S_N_M_B_Z", prevL_T_K_S_N_M_B_Z);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleP
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (charAt(value, index + 1) == 'H'): False}
    /// invoke:
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)} twice,
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])} once
    /// execute conditions:
    ///     {@code (null): False}
    /// invoke:
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])} once
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
        StringBuilder primary = new StringBuilder(" ");
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
        StringBuilder primary = new StringBuilder(" ");
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
        StringBuilder primary = new StringBuilder("         ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 11);
        
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
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.String#length()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleP(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleP_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000");
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
        handlePMethodArguments[2] = -1;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleP(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleP_DoubleMetaphoneContains() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = -1;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleP(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: contains(value, index + 1, 1, "P", "B")
 *  */
    @Test
    public void testHandleP_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleP] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483648, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleP(DoubleMetaphone.java:573) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = 2147483646;
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
    public void testHandleP_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleP] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleP(DoubleMetaphone.java:572) */
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
            org.apache.commons.codec.language.DoubleMetaphone.handleP(DoubleMetaphone.java:572) */
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
            org.apache.commons.codec.language.DoubleMetaphone.handleP(DoubleMetaphone.java:569) */
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
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000");
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
        handlePMethodArguments[2] = 30;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(31, actual);
    }
    
    @Test
    public void testHandleP2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 5);
        
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
    public void testHandleP3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
        handlePMethodArguments[2] = 30;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(31, actual);
    }
    
    @Test
    public void testHandleP4() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 31);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = 1073741841;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(1073741842, actual);
    }
    
    @Test
    public void testHandleP5() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
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
    public void testHandleP6() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = 16777217;
        int actual = ((Integer) handlePMethod.invoke(doubleMetaphone, handlePMethodArguments));
        
        assertEquals(16777218, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleP7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483645);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleP] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483648, length 40]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleP(DoubleMetaphone.java:573) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handlePMethod = doubleMetaphoneClazz.getDeclaredMethod("handleP", stringType, doubleMetaphoneResultType, intType);
        handlePMethod.setAccessible(true);
        java.lang.Object[] handlePMethodArguments = new java.lang.Object[3];
        handlePMethodArguments[0] = string;
        handlePMethodArguments[1] = doubleMetaphoneResult;
        handlePMethodArguments[2] = 2147483646;
        try {
            handlePMethod.invoke(doubleMetaphone, handlePMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleR
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method handleR(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#length()} once
    /// execute conditions:
    ///     {@code (index == value.length() - 1): False}
    /// invoke:
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)} once,
    ///     {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)} once
    /// return from: {@code return charAt(value, index + 1) == 'R' ? index + 2 : index + 1;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'R'): False}
 * @utbot.returnsFrom {@code return charAt(value, index + 1) == 'R' ? index + 2 : index + 1;}
 *  */
    @Test
    public void testHandleR_CharAtNotEqualsR() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'R'): False}
 * @utbot.returnsFrom {@code return charAt(value, index + 1) == 'R' ? index + 2 : index + 1;}
 *  */
    @Test
    public void testHandleR_CharAtNotEqualsR_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "                                        ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
        handleRMethodArguments[2] = 256;
        handleRMethodArguments[3] = false;
        int actual = ((Integer) handleRMethod.invoke(doubleMetaphone, handleRMethodArguments));
        
        assertEquals(257, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'R'): True}
 * @utbot.returnsFrom {@code return charAt(value, index + 1) == 'R' ? index + 2 : index + 1;}
 *  */
    @Test
    public void testHandleR_CharAtEqualsR() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "R";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000");
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
        handleRMethodArguments[3] = false;
        int actual = ((Integer) handleRMethod.invoke(doubleMetaphone, handleRMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'R'): False}
 * @utbot.returnsFrom {@code return charAt(value, index + 1) == 'R' ? index + 2 : index + 1;}
 *  */
    @Test
    public void testHandleR_CharAtNotEqualsR_2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
        handleRMethodArguments[2] = -2;
        handleRMethodArguments[3] = false;
        int actual = ((Integer) handleRMethod.invoke(doubleMetaphone, handleRMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'R'): False}
 * @utbot.returnsFrom {@code return charAt(value, index + 1) == 'R' ? index + 2 : index + 1;}
 *  */
    @Test
    public void testHandleR_CharAtNotEqualsR_3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1073741825);
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method handleR(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.executesCondition {@code (!slavoGermanic): True}
 * @utbot.executesCondition {@code (contains(value, index - 2, 2, "IE")): True}
 * @utbot.executesCondition {@code (!contains(value, index - 4, 2, "ME", "MA")): True}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'R'): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#appendAlternate(char)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.returnsFrom {@code return charAt(value, index + 1) == 'R' ? index + 2 : index + 1;}
 *  */
    @Test
    public void testHandleR_CharAtNotEqualsR_4() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " IE ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder alternate = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        
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
        handleRMethodArguments[2] = 3;
        handleRMethodArguments[3] = false;
        int actual = ((Integer) handleRMethod.invoke(doubleMetaphone, handleRMethodArguments));
        
        assertEquals(4, actual);
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
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:583) */
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
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:588) */
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
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:588) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('R');
 *  */
    @Test
    public void testHandleR_ThrowNullPointerException_3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleR] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:588) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleR(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == value.length() - 1): True}
 * @utbot.executesCondition {@code (!slavoGermanic): True}
 * @utbot.executesCondition {@code (contains(value, index - 2, 2, "IE")): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('R');
 *  */
    @Test
    public void testHandleR_ThrowNullPointerException_4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "      ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleR] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:588) */
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
        handleRMethodArguments[2] = 5;
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
 * @utbot.executesCondition {@code (contains(value, index - 2, 2, "IE")): True}
 * @utbot.executesCondition {@code (!contains(value, index - 4, 2, "ME", "MA")): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#appendAlternate(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.appendAlternate('R');
 *  */
    @Test
    public void testHandleR_ThrowNullPointerException_5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " IE ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleR] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:586) */
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
        handleRMethodArguments[2] = 3;
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
 * @utbot.executesCondition {@code (contains(value, index - 2, 2, "IE")): True}
 * @utbot.executesCondition {@code (!contains(value, index - 4, 2, "ME", "MA")): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('R');
 *  */
    @Test
    public void testHandleR_ThrowNullPointerException_6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "MEIE ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleR] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleR(DoubleMetaphone.java:588) */
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
        handleRMethodArguments[2] = 4;
        handleRMethodArguments[3] = false;
        try {
            handleRMethod.invoke(doubleMetaphone, handleRMethodArguments);
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
        doubleMetaphone.setMaxCodeLen(-255);
        
        doubleMetaphone.setMaxCodeLen(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleC
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#conditionC0(java.lang.String,int)
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleC_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CHIA                             ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = doubleMetaphoneResult;
        handleCMethodArguments[2] = 0;
        int actual = ((Integer) handleCMethod.invoke(doubleMetaphone, handleCMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: conditionC0(value, index)
 *  */
    @Test
    public void testHandleC_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483645, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.conditionC0(DoubleMetaphone.java:781)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:279) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleC(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleC_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CHIA                            ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:280) */
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleC1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CHIA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 9);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = doubleMetaphoneResult;
        handleCMethodArguments[2] = 0;
        int actual = ((Integer) handleCMethod.invoke(doubleMetaphone, handleCMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleC2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:946)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:312) */
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
    public void testHandleC3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CH\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:946)
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:374)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:286) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = doubleMetaphoneResult;
        handleCMethodArguments[2] = 0;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:946)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:312) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = doubleMetaphoneResult;
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
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000CH\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:951)
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:371)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:286) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = doubleMetaphoneResult;
        handleCMethodArguments[2] = 33;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:312) */
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
    public void testHandleC7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000O\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:312) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = 31;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC8() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000CH\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:371)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:286) */
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
    public void testHandleC9() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000CHI\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:371)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:286) */
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
    public void testHandleC10() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CHI\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleCH(DoubleMetaphone.java:374)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:286) */
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
    public void testHandleC11() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:312) */
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
    public void testHandleC12() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "C\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:312) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = -1;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC13() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CIA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:294) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = -1;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC14() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:312) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = ((Object) null);
        handleCMethodArguments[2] = -1;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleC15() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "CHIA";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleC] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:962)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:947)
            org.apache.commons.codec.language.DoubleMetaphone.handleC(DoubleMetaphone.java:280) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleCMethod = doubleMetaphoneClazz.getDeclaredMethod("handleC", stringType, doubleMetaphoneResultType, intType);
        handleCMethod.setAccessible(true);
        java.lang.Object[] handleCMethodArguments = new java.lang.Object[3];
        handleCMethodArguments[0] = string;
        handleCMethodArguments[1] = doubleMetaphoneResult;
        handleCMethodArguments[2] = 0;
        try {
            handleCMethod.invoke(doubleMetaphone, handleCMethodArguments);
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
 * @utbot.executesCondition {@code (index > 0): False}
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
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleGH_IndexEqualsZero() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
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
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleGH_IndexEqualsZero_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleGH_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000I";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
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
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index > 1): False}
 * @utbot.executesCondition {@code (index > 2): False}
 * @utbot.executesCondition {@code (contains(value, index - 3, 1, "B", "H", "D")): False}
 * @utbot.executesCondition {@code (index > 2): False}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleGH_IndexGreaterThanZero() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = doubleMetaphoneResult;
        handleGHMethodArguments[2] = 1;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(3, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleGH_DoubleMetaphoneAppend_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u8000 ";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = doubleMetaphoneResult;
        handleGHMethodArguments[2] = 2;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(4, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleGH_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:467) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleGH_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:473) */
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
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('J');
 *  */
    @Test
    public void testHandleGH_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000I";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:471) */
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
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index > 1): False}
 * @utbot.executesCondition {@code (index > 2): False}
 * @utbot.executesCondition {@code (contains(value, index - 3, 1, "B", "H", "D")): False}
 * @utbot.executesCondition {@code (index > 2): False}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('K');
 *  */
    @Test
    public void testHandleGH_ThrowNullPointerException_3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:487) */
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
    
    ///region FUZZER: ERROR SUITE for method handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleGH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
     */
    @Test
    public void testHandleGHThrowsNPEWithNonEmptyString() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(-2147483647);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:467) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = "G";
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 1;
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
        String string = "\u0000BA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 3;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(5, actual);
    }
    
    @Test
    public void testHandleGH2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000I\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 3;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(5, actual);
    }
    
    @Test
    public void testHandleGH3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 129);
        
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
    
    @Test
    public void testHandleGH4() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
        handleGHMethodArguments[2] = 1;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(3, actual);
    }
    
    @Test
    public void testHandleGH5() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
        handleGHMethodArguments[2] = 1;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(3, actual);
    }
    
    @Test
    public void testHandleGH6() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = doubleMetaphoneResult;
        handleGHMethodArguments[2] = 1073741825;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(1073741827, actual);
    }
    
    @Test
    public void testHandleGH7() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
        handleGHMethodArguments[2] = 1073741825;
        int actual = ((Integer) handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments));
        
        assertEquals(1073741827, actual);
    }
    
    @Test
    public void testHandleGH8() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000I";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleGH9() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:473) */
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
    
    @Test
    public void testHandleGH10() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000Y\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:487) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 3;
        try {
            handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleGH11() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000U\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleGH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleGH(DoubleMetaphone.java:487) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleGHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleGH", stringType, doubleMetaphoneResultType, intType);
        handleGHMethod.setAccessible(true);
        java.lang.Object[] handleGHMethodArguments = new java.lang.Object[3];
        handleGHMethodArguments[0] = string;
        handleGHMethodArguments[1] = ((Object) null);
        handleGHMethodArguments[2] = 3;
        try {
            handleGHMethod.invoke(doubleMetaphone, handleGHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleH
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (isVowel(charAt(value, index - 1))): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleH_NotIsVowel() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = ((Object) null);
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = -254;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(-253, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (isVowel(charAt(value, index + 1))): False}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleH_NotIsVowel_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
        handleHMethodArguments[2] = 0;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (isVowel(charAt(value, index + 1))): True}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleH_IsVowel() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000A";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.executesCondition {@code (isVowel(charAt(value, index + 1))): True}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleH_IsVowel_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000A";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('H');
 *  */
    @Test
    public void testHandleH_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000A";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleH(DoubleMetaphone.java:501) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (isVowel(charAt(value, index - 1))): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes org.apache.commons.codec.language.DoubleMetaphone#isVowel(char)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('H');
 *  */
    @Test
    public void testHandleH_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " A A        ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleH] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleH(DoubleMetaphone.java:501) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = string;
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = 2;
        try {
            handleHMethod.invoke(doubleMetaphone, handleHMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method handleH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
     */
    @Test
    public void testHandleHReturns73WithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(1);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = "-3";
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = 72;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(73, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleH(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
     */
    @Test
    public void testHandleHReturns2WithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(-2147483647);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleHMethod = doubleMetaphoneClazz.getDeclaredMethod("handleH", stringType, doubleMetaphoneResultType, intType);
        handleHMethod.setAccessible(true);
        java.lang.Object[] handleHMethodArguments = new java.lang.Object[3];
        handleHMethodArguments[0] = "abc";
        handleHMethodArguments[1] = ((Object) null);
        handleHMethodArguments[2] = 1;
        int actual = ((Integer) handleHMethod.invoke(doubleMetaphone, handleHMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleS
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleS(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleS_ReturnIndex() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "SUGAR";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
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
        handleSMethodArguments[2] = 0;
        handleSMethodArguments[3] = false;
        int actual = ((Integer) handleSMethod.invoke(doubleMetaphone, handleSMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleS(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleS_ReturnIndex_1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "SUGAR";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
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
        handleSMethodArguments[2] = 0;
        handleSMethodArguments[3] = false;
        int actual = ((Integer) handleSMethod.invoke(doubleMetaphone, handleSMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleS(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index - 1, 3, "ISL", "YSL")
 *  */
    @Test
    public void testHandleS_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483646, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:598) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleS(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index, 3, "SIO", "SIA") || contains(value, index, 4, "SIAN")
 *  */
    @Test
    public void testHandleS_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483645, end -2147483648, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:613) */
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
        handleSMethodArguments[2] = 2147483645;
        handleSMethodArguments[3] = false;
        try {
            handleSMethod.invoke(doubleMetaphone, handleSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleS(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.executesCondition {@code (index == 0): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index == value.length() - 1 && contains(value, index - 2, 2, "AI", "OI")
 *  */
    @Test
    public void testHandleS_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:632) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleSMethod = doubleMetaphoneClazz.getDeclaredMethod("handleS", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleSMethod.setAccessible(true);
        java.lang.Object[] handleSMethodArguments = new java.lang.Object[4];
        handleSMethodArguments[0] = ((Object) null);
        handleSMethodArguments[1] = ((Object) null);
        handleSMethodArguments[2] = -4;
        handleSMethodArguments[3] = false;
        try {
            handleSMethod.invoke(doubleMetaphone, handleSMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleS(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (index == 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char,char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('X', 'S');
 *  */
    @Test
    public void testHandleS_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "SUGAR";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:603) */
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleS1() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "ISL\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
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
        handleSMethodArguments[2] = 1;
        handleSMethodArguments[3] = false;
        int actual = ((Integer) handleSMethod.invoke(doubleMetaphone, handleSMethodArguments));
        
        assertEquals(2, actual);
    }
    
    @Test
    public void testHandleS2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 5);
        
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
        handleSMethodArguments[2] = -16384;
        handleSMethodArguments[3] = false;
        int actual = ((Integer) handleSMethod.invoke(doubleMetaphone, handleSMethodArguments));
        
        assertEquals(-16383, actual);
    }
    
    @Test
    public void testHandleS3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", -2147483647);
        
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
        handleSMethodArguments[2] = -4;
        handleSMethodArguments[3] = false;
        int actual = ((Integer) handleSMethod.invoke(doubleMetaphone, handleSMethodArguments));
        
        assertEquals(-3, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleS4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:636) */
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
        handleSMethodArguments[2] = -1;
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
        String string = "SUGA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:636) */
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
    public void testHandleS6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000I\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleS] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleS(DoubleMetaphone.java:636) */
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
        handleSMethodArguments[2] = 28;
        handleSMethodArguments[3] = false;
        try {
            handleSMethod.invoke(doubleMetaphone, handleSMethodArguments);
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
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleT_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  TION";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = doubleMetaphoneResult;
        handleTMethodArguments[2] = 2;
        int actual = ((Integer) handleTMethod.invoke(doubleMetaphone, handleTMethodArguments));
        
        assertEquals(5, actual);
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
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:676) */
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
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('T');
 *  */
    @Test
    public void testHandleT_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:693) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleT(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('X');
 *  */
    @Test
    public void testHandleT_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  TION";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:677) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = ((Object) null);
        handleTMethodArguments[2] = 2;
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
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = doubleMetaphoneResult;
        handleTMethodArguments[2] = -1;
        int actual = ((Integer) handleTMethod.invoke(doubleMetaphone, handleTMethodArguments));
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHandleT2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "TTTTIONTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
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
        handleTMethodArguments[2] = 3;
        int actual = ((Integer) handleTMethod.invoke(doubleMetaphone, handleTMethodArguments));
        
        assertEquals(6, actual);
    }
    
    @Test
    public void testHandleT3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("");
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
        handleTMethodArguments[2] = -1;
        int actual = ((Integer) handleTMethod.invoke(doubleMetaphone, handleTMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleT(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int)
    
    @Test
    public void testHandleT4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "TTTTTTTTTTTTTTTTTTTTTTTTTTTTT\u0000TT";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:946)
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:693) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = doubleMetaphoneResult;
        handleTMethodArguments[2] = 29;
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleT5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:956)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:946)
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:693) */
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
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleT6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:693) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = ((Object) null);
        handleTMethodArguments[2] = 2147483643;
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleT7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTIA";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:680) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Method handleTMethod = doubleMetaphoneClazz.getDeclaredMethod("handleT", stringType, doubleMetaphoneResultType, intType);
        handleTMethod.setAccessible(true);
        java.lang.Object[] handleTMethodArguments = new java.lang.Object[3];
        handleTMethodArguments[0] = string;
        handleTMethodArguments[1] = ((Object) null);
        handleTMethodArguments[2] = 32;
        try {
            handleTMethod.invoke(doubleMetaphone, handleTMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleT8() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleT] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleT(DoubleMetaphone.java:693) */
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.handleZ
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (slavoGermanic): False}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleZ_NotSlavoGermanic() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
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
        handleZMethodArguments[2] = -2;
        handleZMethodArguments[3] = false;
        int actual = ((Integer) handleZMethod.invoke(doubleMetaphone, handleZMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(char)}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleZ_DoubleMetaphoneAppend() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (slavoGermanic): True}
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testHandleZ_IndexLessOrEqualZero() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder(" ");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 2);
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: contains(value, index + 1, 2, "ZO", "ZI", "ZA") || (slavoGermanic && (index > 0 && charAt(value, index - 1) != 'T'))
 *  */
    @Test
    public void testHandleZ_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483647, length 0]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:764) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (slavoGermanic): True}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult#append(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: result.append("S", "TS");
 *  */
    @Test
    public void testHandleZ_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendPrimary(DoubleMetaphone.java:982)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:973)
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:766) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (slavoGermanic): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('S');
 *  */
    @Test
    public void testHandleZ_ThrowNullPointerException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:768) */
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
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('S');
 *  */
    @Test
    public void testHandleZ_ThrowNullPointerException_1() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:768) */
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
 * @utbot.executesCondition {@code (slavoGermanic): True}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append("S", "TS");
 *  */
    @Test
    public void testHandleZ_ThrowNullPointerException_2() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:766) */
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
    public void testHandleZ_ThrowNullPointerException_3() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "H";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:761) */
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#handleZ(java.lang.String,org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult,int,boolean)}
 * @utbot.executesCondition {@code (slavoGermanic): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.append('S');
 *  */
    @Test
    public void testHandleZ_ThrowNullPointerException_4() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:768) */
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
        handleZMethodArguments[2] = 1;
        handleZMethodArguments[3] = false;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleZByFuzzer() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(3);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:768) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class doubleMetaphoneResultType = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method handleZMethod = doubleMetaphoneClazz.getDeclaredMethod("handleZ", stringType, doubleMetaphoneResultType, intType, booleanType);
        handleZMethod.setAccessible(true);
        java.lang.Object[] handleZMethodArguments = new java.lang.Object[4];
        handleZMethodArguments[0] = "bac";
        handleZMethodArguments[1] = ((Object) null);
        handleZMethodArguments[2] = -1;
        handleZMethodArguments[3] = true;
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
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 61);
        
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
        handleZMethodArguments[2] = -4099;
        handleZMethodArguments[3] = false;
        int actual = ((Integer) handleZMethod.invoke(doubleMetaphone, handleZMethodArguments));
        
        assertEquals(-4098, actual);
    }
    
    @Test
    public void testHandleZ2() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1073741884);
        
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
        int actual = ((Integer) handleZMethod.invoke(doubleMetaphone, handleZMethodArguments));
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    
    @Test
    public void testHandleZ3() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000H";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 5);
        
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
        handleZMethodArguments[2] = 7;
        handleZMethodArguments[3] = false;
        int actual = ((Integer) handleZMethod.invoke(doubleMetaphone, handleZMethodArguments));
        
        assertEquals(9, actual);
    }
    
    @Test
    public void testHandleZ4() throws Exception  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        StringBuilder alternate = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "alternate", alternate);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 35);
        
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean)
    
    @Test
    public void testHandleZ5() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:768) */
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
        handleZMethodArguments[2] = 0;
        handleZMethodArguments[3] = false;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleZ6() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:766) */
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
        handleZMethodArguments[2] = 16;
        handleZMethodArguments[3] = true;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleZ7() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:766) */
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
    public void testHandleZ8() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:987)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:974)
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:766) */
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
    public void testHandleZ9() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "maxLength", 1);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:962)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:947)
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:768) */
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
        handleZMethodArguments[2] = 0;
        handleZMethodArguments[3] = true;
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHandleZ10() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = ((DoubleMetaphone.DoubleMetaphoneResult) createInstance("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        StringBuilder primary = new StringBuilder("");
        setField(doubleMetaphoneResult, "org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult", "primary", primary);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.handleZ] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.appendAlternate(DoubleMetaphone.java:962)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.append(DoubleMetaphone.java:947)
            org.apache.commons.codec.language.DoubleMetaphone.handleZ(DoubleMetaphone.java:768) */
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
        try {
            handleZMethod.invoke(doubleMetaphone, handleZMethodArguments);
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
 * @utbot.executesCondition {@code (!contains(value, index + 1, 5, "HARAC", "HARIS")): True}
 * @utbot.executesCondition {@code (!contains(value, index + 1, 3, "HOR", "HYM", "HIA", "HEM")): True}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 *  */
    @Test
    public void testConditionCH0_NotContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionCH0(java.lang.String,int)}
 * @utbot.executesCondition {@code (index != 0): False}
 * @utbot.executesCondition {@code (!contains(value, index + 1, 5, "HARAC", "HARIS")): False}
 * @utbot.executesCondition {@code (contains(value, 0, 5, "CHORE")): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testConditionCH0_NotContains_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = " HARAC";
        
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
        String string = "\u0000HOR\u0000";
        
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
    
    @Test
    public void testConditionCH02() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000HARIS\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
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
    
    @Test
    public void testConditionCH03() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000H\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.DoubleMetaphone.conditionCH1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method conditionCH1(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionCH1(java.lang.String,int)}
 * @utbot.executesCondition {@code (contains(value, index - 2, 6, "ORCHES", "ARCHIT", "ORCHID")): True}
 * @utbot.executesCondition {@code (contains(value, index + 2, 1, "T", "S")): True}
 * @utbot.executesCondition {@code (((contains(value, index - 1, 1, "A", "O", "U", "E") || index == 0) && (contains(value, index + 2, 1, L_R_N_M_B_H_F_V_W_SPACE) || index + 1 == value.length() - 1))): True}
 * @utbot.executesCondition {@code (((contains(value, index - 1, 1, "A", "O", "U", "E") || index == 0) && (contains(value, index + 2, 1, L_R_N_M_B_H_F_V_W_SPACE) || index + 1 == value.length() - 1))): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
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
        conditionCH1MethodArguments[1] = -254;
        boolean actual = ((Boolean) conditionCH1Method.invoke(doubleMetaphone, conditionCH1MethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionCH1(java.lang.String,int)}
 * @utbot.returnsFrom {@code return ((contains(value, 0, 4, "VAN ", "VON ") || contains(value, 0, 3, "SCH")) || contains(value, index - 2, 6, "ORCHES", "ARCHIT", "ORCHID") || contains(value, index + 2, 1, "T", "S") || ((contains(value, index - 1, 1, "A", "O", "U", "E") || index == 0) && (contains(value, index + 2, 1, L_R_N_M_B_H_F_V_W_SPACE) || index + 1 == value.length() - 1)));}
 *  */
    @Test
    public void testConditionCH1_ContainsOrContainsOrContainsOrContainsOrContainsOrIndexNotEqualsZeroAndContainsOrIndexPlus1NotEqualsValueLengthMinus1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "SCH";
        
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionCH1(java.lang.String,int)}
 * @utbot.returnsFrom {@code return ((contains(value, 0, 4, "VAN ", "VON ") || contains(value, 0, 3, "SCH")) || contains(value, index - 2, 6, "ORCHES", "ARCHIT", "ORCHID") || contains(value, index + 2, 1, "T", "S") || ((contains(value, index - 1, 1, "A", "O", "U", "E") || index == 0) && (contains(value, index + 2, 1, L_R_N_M_B_H_F_V_W_SPACE) || index + 1 == value.length() - 1)));}
 *  */
    @Test
    public void testConditionCH1_ContainsOrContainsOrContainsOrContainsOrContainsOrIndexNotEqualsZeroAndContainsOrIndexPlus1NotEqualsValueLengthMinus1_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method conditionCH1(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionCH1(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: contains(value, index - 2, 6, "ORCHES", "ARCHIT", "ORCHID")
 *  */
    @Test
    public void testConditionCH1_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "  ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.conditionCH1] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483643, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(DoubleMetaphone.java:817) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH1Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH1", stringType, intType);
        conditionCH1Method.setAccessible(true);
        java.lang.Object[] conditionCH1MethodArguments = new java.lang.Object[2];
        conditionCH1MethodArguments[0] = string;
        conditionCH1MethodArguments[1] = -2147483647;
        try {
            conditionCH1Method.invoke(doubleMetaphone, conditionCH1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method conditionCH1(java.lang.String, int)
    
    @Test
    public void testConditionCH11() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "SC\u0000";
        
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
        String string = "VO\u0000\u0000";
        
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
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.conditionCH1] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483646, end -2147483644, length 3]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(DoubleMetaphone.java:817) */
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionCH1Method = doubleMetaphoneClazz.getDeclaredMethod("conditionCH1", stringType, intType);
        conditionCH1Method.setAccessible(true);
        java.lang.Object[] conditionCH1MethodArguments = new java.lang.Object[2];
        conditionCH1MethodArguments[0] = string;
        conditionCH1MethodArguments[1] = Integer.MIN_VALUE;
        try {
            conditionCH1Method.invoke(doubleMetaphone, conditionCH1MethodArguments);
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
        conditionM0MethodArguments[1] = -255;
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
 * @utbot.returnsFrom {@code return contains(value, index - 1, 3, "UMB") && ((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"));}
 *  */
    @Test
    public void testConditionM0_IndexPlus1EqualsValueLengthMinus1OrContains_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "                             UMB ";
        
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
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionM0(java.lang.String,int)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'M'): False}
 * @utbot.executesCondition {@code (((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"))): True}
 * @utbot.executesCondition {@code (((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"))): True}
 * @utbot.returnsFrom {@code return contains(value, index - 1, 3, "UMB") && ((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"));}
 *  */
    @Test
    public void testConditionM0_IndexPlus1NotEqualsValueLengthMinus1OrContains() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "                            UMBER";
        
        Class doubleMetaphoneClazz = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class stringType = Class.forName("java.lang.String");
        Class intType = int.class;
        Method conditionM0Method = doubleMetaphoneClazz.getDeclaredMethod("conditionM0", stringType, intType);
        conditionM0Method.setAccessible(true);
        java.lang.Object[] conditionM0MethodArguments = new java.lang.Object[2];
        conditionM0MethodArguments[0] = string;
        conditionM0MethodArguments[1] = 29;
        boolean actual = ((Boolean) conditionM0Method.invoke(doubleMetaphone, conditionM0MethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method conditionM0(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#conditionM0(java.lang.String,int)}
 * @utbot.executesCondition {@code (charAt(value, index + 1) == 'M'): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#charAt(java.lang.String,int)}
 * @utbot.invokes {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return contains(value, index - 1, 3, "UMB") && ((index + 1) == value.length() - 1 || contains(value, index + 2, 2, "ER"));
 *  */
    @Test
    public void testConditionM0_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.conditionM0] produces [java.lang.StringIndexOutOfBoundsException: begin 2147483647, end -2147483646, length 2]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918)
            org.apache.commons.codec.language.DoubleMetaphone.conditionM0(DoubleMetaphone.java:846) */
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
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:244) */
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
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:244) */
        doubleMetaphone.isDoubleMetaphoneEqual(null, string, false);
    }
    
    @Test
    public void testIsDoubleMetaphoneEqual3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:244) */
        doubleMetaphone.isDoubleMetaphoneEqual(null, string, false);
    }
    
    @Test
    public void testIsDoubleMetaphoneEqual4() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:244) */
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
    
    ///region FUZZER: ERROR SUITE for method isDoubleMetaphoneEqual(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#isDoubleMetaphoneEqual(java.lang.String,java.lang.String)}
     */
    @Test
    public void testIsDoubleMetaphoneEqualThrowsNASEWithNonEmptyStrings() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(-2147483647);
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NegativeArraySizeException: -2147483647]
            java.base/java.lang.AbstractStringBuilder.<init>(AbstractStringBuilder.java:88)
            java.base/java.lang.StringBuilder.<init>(StringBuilder.java:119)
            org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult.<init>(DoubleMetaphone.java:937)
            org.apache.commons.codec.language.DoubleMetaphone.doubleMetaphone(DoubleMetaphone.java:94)
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:244)
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:230) */
        doubleMetaphone.isDoubleMetaphoneEqual("abc", "XZ");
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
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:244)
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:230) */
        doubleMetaphone.isDoubleMetaphoneEqual(null, string);
    }
    
    @Test
    public void testIsDoubleMetaphoneEqual7() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:244)
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:230) */
        doubleMetaphone.isDoubleMetaphoneEqual(null, string);
    }
    
    @Test
    public void testIsDoubleMetaphoneEqual8() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001\u0001";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:244)
            org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(DoubleMetaphone.java:230) */
        doubleMetaphone.isDoubleMetaphoneEqual(string, null);
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
    public void testEncode1() throws EncoderException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "!\u0001";
        
        String actual = ((String) doubleMetaphone.encode(((Object) string)));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
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
    public void testEncode2() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001";
        
        String actual = doubleMetaphone.encode(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEncode3() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001\u0001B\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        
        String actual = doubleMetaphone.encode(string);
        
        String expected = "P";
        
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
            org.apache.commons.codec.language.DoubleMetaphone.charAt(DoubleMetaphone.java:904) */
        doubleMetaphone.charAt(null, 0);
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
 * @utbot.iterates iterate the loop {@code for(final String element: criteria)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContains_TargetEquals() {
        String string = "  ";
        java.lang.String[] stringArray = new java.lang.String[1];
        String string1 = "";
        stringArray[0] = string1;
        
        boolean actual = DoubleMetaphone.contains(string, 2, 0, stringArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start >= 0): True}
 * @utbot.executesCondition {@code (start + length <= value.length()): True}
 * @utbot.iterates iterate the loop {@code for(final String element: criteria)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContains_NotTargetEquals() {
        String string = "  ";
        java.lang.String[] stringArray = {null};
        
        boolean actual = DoubleMetaphone.contains(string, 2, 0, stringArray);
        
        assertFalse(actual);
        
        String finalStringArray0 = stringArray[0];
        
        assertNull(finalStringArray0);
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
        
        boolean actual = DoubleMetaphone.contains(string, 0, 1, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start >= 0): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testContains_StartLessThanZero() {
        boolean actual = DoubleMetaphone.contains(null, -1, -255, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method contains(java.lang.String, int, int, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start + length <= value.length()): True}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: final String target = value.substring(start, start + length);
 *  */
    @Test
    public void testContains_ThrowStringIndexOutOfBoundsException() {
        String string = "                                 ";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.StringIndexOutOfBoundsException: begin 67, end 33, length 33]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:918) */
        DoubleMetaphone.contains(string, 67, -34, null);
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
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:917) */
        DoubleMetaphone.contains(null, 0, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link DoubleMetaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.DoubleMetaphone#contains(java.lang.String,int,int,java.lang.String[])}
 * @utbot.executesCondition {@code (start + length <= value.length()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(final String element: criteria)
 *  */
    @Test
    public void testContains_ThrowNullPointerException_1() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.codec.language.DoubleMetaphone.contains] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.DoubleMetaphone.contains(DoubleMetaphone.java:920) */
        DoubleMetaphone.contains(string, 0, 0, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields876368046069800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields876368046069800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass876368046074600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876368046069800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876368046074600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields876368046480100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields876368046480100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass876368046482200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876368046480100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876368046482200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields876368046864600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields876368046864600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass876368046865900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields876368046864600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass876368046865900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

